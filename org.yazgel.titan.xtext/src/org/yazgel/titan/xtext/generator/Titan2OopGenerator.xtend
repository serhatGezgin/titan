package org.yazgel.titan.xtext.generator

import org.yazgel.oop.OClass
import org.yazgel.oop.ODataType
import org.yazgel.oop.ODataTypes
import org.yazgel.oop.OModel
import org.yazgel.oop.OPackage
import org.yazgel.oop.OReference
import org.yazgel.oop.impl.OopFactoryImpl
import org.yazgel.titan.xtext.titan.DataType
import org.yazgel.titan.xtext.titan.DataTypes
import org.yazgel.titan.xtext.titan.Entity
import org.yazgel.titan.xtext.titan.Module
import org.yazgel.titan.xtext.titan.Package
import org.yazgel.titan.xtext.titan.Reference
import org.yazgel.titan.xtext.titan.Feature
import org.yazgel.oop.OFeature
import java.util.HashMap
import org.eclipse.emf.ecore.EObject
import java.util.Map
import org.yazgel.oop.OReferenceMulti
import org.yazgel.oop.MultiOFeatureTypes
import org.yazgel.oop.ODataTypeMulti
import org.yazgel.oop.OReferenceSingle
import org.yazgel.oop.ODataTypeSingle

class Titan2OopGenerator {

	//From model, To Model &&
	//To model, From Model
	public static Map<EObject, EObject> transformationReleations = new HashMap<EObject, EObject>();

	def OModel doGenerate(Module module) {

		//Model classes must be added.
		var model = OopFactoryImpl.eINSTANCE.createOModel
		model.name = module.name
		transformationReleations.put(module, model)
		transformationReleations.put(model, module)

		for (Package p : module.packages) {
			model.packages.add(generate(p));
		}

		model.postGenerator

		model
	}

	def OPackage generate(Package tPackage) {
		var oPackage = OopFactoryImpl.eINSTANCE.createOPackage

		oPackage.name = tPackage.name
		transformationReleations.put(tPackage, oPackage)
		transformationReleations.put(oPackage, tPackage)

		for (Entity e : tPackage.entities) {
			oPackage.classes.add(generate(e))
		}

		oPackage
	}

	def OClass generate(Entity entity) {
		var oClass = OopFactoryImpl.eINSTANCE.createOClass
		var oClassImport = OopFactoryImpl.eINSTANCE.createOClassImport

		oClass.name = entity.name
		oClass.imports = oClassImport
		transformationReleations.put(entity, oClass)
		transformationReleations.put(oClass, entity)

		for (Feature f : entity.features) {
			oClass.features.add(f.generateFeature)
		}

		oClass
	}

	def dispatch OFeature generateFeature(Feature f) {
	}

	def dispatch ODataType generateFeature(DataType dt) {
		var ODataType data;
		if (dt.many) {
			data = OopFactoryImpl.eINSTANCE.createODataTypeMulti;
			(data as ODataTypeMulti).multiType = MultiOFeatureTypes.ARRAY;
		} else {
			data = OopFactoryImpl.eINSTANCE.createODataTypeSingle
		}

		data.name = dt.name
		transformationReleations.put(dt, data)
		transformationReleations.put(data, dt)

		switch dt.type {
			case DataTypes.BOOLEAN: data.type = ODataTypes.BOOLEAN
			case DataTypes.DOUBLE: data.type = ODataTypes.DOUBLE
			case DataTypes.INTEGER: data.type = ODataTypes.INTEGER
			case DataTypes.LONG: data.type = ODataTypes.LONG
			case DataTypes.STRING: data.type = ODataTypes.STRING
		}

		data
	}

	def dispatch OReference generateFeature(Reference r) {
		var OReference ref;
		if (r.many) {
			ref = OopFactoryImpl.eINSTANCE.createOReferenceMulti;
			(ref as OReferenceMulti).multiType = MultiOFeatureTypes.ARRAY_LIST;
		} else {
			ref = OopFactoryImpl.eINSTANCE.createOReferenceSingle
		}

		ref.name = r.name
		transformationReleations.put(r, ref)
		transformationReleations.put(ref, r)

		ref
	}

	def postGenerator(OModel model) {

		//1-Reference Reference prop must be set after generated model classes
		var releationsOfReferences = transformationReleations.filter[p1, p2|p1 instanceof Reference]
		for (e : releationsOfReferences.entrySet) {
			var or = transformationReleations.get((e.key as Reference).reference) as OClass;
			(e.value as OReference).reference = or;
		}

		//2-Unique referances must be set (opposite releations = unique releations)
		var oppositeReferences = transformationReleations.filter[p1, p2|
			(p1 instanceof Reference) && ((p1 as Reference).opposite != null) && ((p1 as Reference).opposite.many)]
		for (e : oppositeReferences.entrySet) {
			var or = transformationReleations.get((e.key as Reference).opposite) as OReferenceMulti
			or.uniqueInstance = true;
			or.multiType = MultiOFeatureTypes.TREE_SET
		}

		//3-Import Statements must be added after generated model classes
		for (e : releationsOfReferences.entrySet) {
			var reference = e.key as Reference
			var oReference = e.value as OReference
			var oClass = e.value.eContainer as OClass

			oClass.imports.importsFromDomain.add(transformationReleations.get(reference.reference) as OClass)
			if (oReference instanceof OReferenceMulti) {
				if ((oReference as OReferenceMulti).uniqueInstance) {
					oClass.imports.imports.add("java.util.Set");
					oClass.imports.imports.add("java.util.TreeSet");
				} else {
					oClass.imports.imports.add("java.util.List");
					oClass.imports.imports.add("java.util.ArrayList");
				}
			}
		}

		//4-Implement String Statements must be added after generated model classes
		var oClasesWithUniqueInstanceOFeatures = transformationReleations.filter[p1, p2|
			p1 instanceof OClass && (p1 as OClass).features.filter[f|
				f instanceof OReferenceMulti && (f as OReferenceMulti).uniqueInstance].size > 0]
		for (e : oClasesWithUniqueInstanceOFeatures.entrySet) {
			var oClass = e.key as OClass
			oClass.implements.implementsString.add("Comparable");
		}

		//5.1- First Constructors must be added after generated model classes
		var oClasses = transformationReleations.filter[p1, p2|p1 instanceof OClass]
		for (e : oClasses.entrySet) {
			var oc = e.key as OClass
			var oConst = OopFactoryImpl.eINSTANCE.createOConstructor
			oConst.name = oc.name

			//Parameters must be set && Statements must be create.
			var oFeatures = oc.features
			for (OFeature of : oFeatures) {
				var statement = OopFactoryImpl.eINSTANCE.createOStatement
				if (of instanceof OReferenceMulti) {
					if (of.uniqueInstance) {
						statement.content = '''«of.name» = new TreeSet<>();'''
					} else {
						statement.content = '''«of.name» = new ArrayList<>();'''
					}
				} else if (of instanceof OReferenceSingle) {
					statement.content = '''«of.name» = new «(of as OReference).reference.name»();'''
				}
				oConst.statements.add(statement)
			}
			oc.methods.add(oConst)
		}

		//5.2- Second Constructors must be added after generated model classes
		for (e : oClasses.entrySet) {
			var oc = e.key as OClass
			var oConst = OopFactoryImpl.eINSTANCE.createOConstructor
			oConst.name = oc.name

			//Parameters must be set && Statements must be create.
			var oFeatures = oc.features
			for (OFeature of : oFeatures) {
				var statement = OopFactoryImpl.eINSTANCE.createOStatement
				statement.content = '''this.«of.name» = «of.name»;'''
				oConst.statements.add(statement)

				var param = OopFactoryImpl.eINSTANCE.createOParameter
				param.name = of.name
				if (of instanceof ODataTypeSingle) {
					param.type = '''«of.type»'''
				} else if (of instanceof ODataTypeMulti) {
					param.type = '''«of.type»[]'''
				} else if (of instanceof OReferenceSingle) {
					param.type = '''«of.reference.name»'''
				} else if (of instanceof OReferenceMulti) {
					if (of.uniqueInstance) {
						param.type = '''TreeSet<«of.reference.name»>'''
					} else {
						param.type = '''List<«of.reference.name»>'''
					}
				}
				oConst.parameters.add(param)
			}
			oc.methods.add(oConst)
		}

		//6- adders must be added
		for (e : oClasses.entrySet) {
			var list = newArrayList
			var oc = e.key as OClass
			for (OFeature of : oc.features.filter[of|(of instanceof OReferenceMulti)]) {
				var f = of as OReferenceMulti
				if (!list.contains(f.reference)) {
					var method = OopFactoryImpl.eINSTANCE.createOMethod
					method.name = '''add«f.reference.name.toFirstUpper»'''
					method.returnType = 'void'

					var parameter = OopFactoryImpl.eINSTANCE.createOParameter
					parameter.name = f.reference.name.toFirstLower
					parameter.type = f.reference.name
					method.parameters.add(parameter)

					var statement = OopFactoryImpl.eINSTANCE.createOStatement
					statement.content = '''get«f.name.toFirstUpper»().add(«parameter.name»);'''
					method.statements.add(statement)

					oc.methods.add(method)

					list.add(f.reference)
				}
			}
			for (OFeature odt : oc.features.filter[odt|(odt instanceof ODataTypeMulti)]) {
				var dt = odt as ODataTypeMulti
				if (!list.contains(dt.type)) {
					var method = OopFactoryImpl.eINSTANCE.createOMethod
					method.name = '''add«dt.name.toFirstUpper»'''
					method.returnType = 'void'

					var parameter = OopFactoryImpl.eINSTANCE.createOParameter
					parameter.name = dt.name.toFirstLower
					parameter.type = dt.type.literal
					method.parameters.add(parameter)

					var statement = OopFactoryImpl.eINSTANCE.createOStatement
					statement.content = '''get«dt.name.toFirstUpper»().add(«parameter.name»);'''
					method.statements.add(statement)
					oc.methods.add(method)

					list.add(dt.type)
				}

			}
		}

		//6- getter/setter s must be added
		for (e : oClasses.entrySet) {
			var oc = e.key as OClass
			for (OFeature of : oc.features.filter[of|(of instanceof ODataType)]) {
				var d = of as ODataType

				//getter
				var gmethod = OopFactoryImpl.eINSTANCE.createOMethod
				gmethod.name = '''get«d.name.toFirstUpper»'''
				gmethod.returnType = '''«d.type.literal»«IF d instanceof ODataTypeMulti»[]«ENDIF»'''

				var statement = OopFactoryImpl.eINSTANCE.createOStatement
				statement.content = '''return this.«d.name»;'''
				gmethod.statements.add(statement)
				oc.methods.add(gmethod)

				//setter
				var smethod = OopFactoryImpl.eINSTANCE.createOMethod
				smethod.name = '''set«d.name.toFirstUpper»'''
				smethod.returnType = '''void'''

				var sparameter = OopFactoryImpl.eINSTANCE.createOParameter
				sparameter.name = d.name.toFirstLower
				sparameter.type = d.type.literal
				smethod.parameters.add(sparameter)

				statement = OopFactoryImpl.eINSTANCE.createOStatement
				statement.content = '''this.«d.name» = «sparameter.name»;'''
				smethod.statements.add(statement)
				oc.methods.add(smethod)
			}

			for (OFeature of : oc.features.filter[of|(of instanceof OReference)]) {
				var f = of as OReference

				//getter
				var gmethod = OopFactoryImpl.eINSTANCE.createOMethod
				gmethod.name = '''get«f.name.toFirstUpper»'''
				if (f instanceof OReferenceMulti) {
					if (f.uniqueInstance)
						gmethod.returnType = '''Set<«f.reference.name»>'''
					else
						gmethod.returnType = '''List<«f.reference.name»>'''
				} else {
					gmethod.returnType = '''«f.reference.name»'''
				}

				var statement = OopFactoryImpl.eINSTANCE.createOStatement
				statement.content = '''return this.«f.name»;'''
				gmethod.statements.add(statement)
				oc.methods.add(gmethod)

				//setter
				var smethod = OopFactoryImpl.eINSTANCE.createOMethod
				smethod.name = '''set«f.name.toFirstUpper»'''
				smethod.returnType = '''void'''

				var sparameter = OopFactoryImpl.eINSTANCE.createOParameter
				sparameter.name = f.name.toFirstLower

				if (f instanceof OReferenceMulti) {
					if (f.uniqueInstance)
						sparameter.type = '''TreeSet<«f.reference.name»>'''
					else
						sparameter.type = '''List<«f.reference.name»>'''
				} else {
					sparameter.type = '''«f.reference.name»'''
				}

				smethod.parameters.add(sparameter)

				statement = OopFactoryImpl.eINSTANCE.createOStatement
				statement.content = '''this.«f.name» = «sparameter.name»;'''
				smethod.statements.add(statement)
				oc.methods.add(smethod)
			}
		}

		//7- COmpareTo must be added
		for (e : oClasses.entrySet) {
			var oc = e.key as OClass
			for (OFeature of : oc.features.filter[of|
				(of instanceof OReferenceMulti) && (of as OReferenceMulti).uniqueInstance]) {
				var ref = of as OReferenceMulti

				//setter
				var cmethod = OopFactoryImpl.eINSTANCE.createOMethod
				cmethod.name = '''compareTo'''
				cmethod.returnType = '''int'''
				cmethod.isOverride = true

				var sparameter = OopFactoryImpl.eINSTANCE.createOParameter
				sparameter.name = '''o'''
				sparameter.type = ref.reference.name
				cmethod.parameters.add(sparameter)

				var statement = OopFactoryImpl.eINSTANCE.createOStatement
				statement.content = '''
					final int BEFORE = -1;
					final int EQUAL = 0;
					final int AFTER = 1;
					
					int comparison;
					
					if (this == o) return EQUAL;			
					«FOR f : oc.features»
						«IF f instanceof DataType»
							«IF f.type.equals(DataTypes.STRING)»
								//Strings follow this form
								comparison = this.get«f.name.toFirstUpper»().compareTo(o.get«f.name.toFirstUpper»());
								if (comparison != EQUAL) return comparison;
							«ELSEIF f.type.equals(DataTypes.BOOLEAN)»
								//booleans follow this form
								if (!this.get«f.name.toFirstUpper» && o.get«f.name.toFirstUpper») return BEFORE;
								if (this.get«f.name.toFirstUpper» && !o.get«f.name.toFirstUpper») return AFTER;
							«ELSEIF f.type.equals(DataTypes.DOUBLE)»
								//primitive numbers follow this form
								if (this.get«f.name.toFirstUpper» < o.get«f.name.toFirstUpper») return BEFORE;
								if (this.get«f.name.toFirstUpper» > o.get«f.name.toFirstUpper») return AFTER;
							«ELSEIF f.type.equals(DataTypes.INTEGER)»
								//primitive numbers follow this form
								if (this.get«f.name.toFirstUpper» < o.get«f.name.toFirstUpper») return BEFORE;
								if (this.get«f.name.toFirstUpper» > o.get«f.name.toFirstUpper») return AFTER;
							«ELSEIF f.type.equals(DataTypes.LONG)»
								//primitive numbers follow this form
								if (this.get«f.name.toFirstUpper» < o.get«f.name.toFirstUpper») return BEFORE;
								if (this.get«f.name.toFirstUpper» > o.get«f.name.toFirstUpper») return AFTER;
							«ENDIF»
						«ENDIF»	
					«ENDFOR»
									
					return EQUAL;
				'''
				cmethod.statements.add(statement)
				ref.reference.methods.add(cmethod)
			}
		}
		//Entity Finished
	
	}
}
