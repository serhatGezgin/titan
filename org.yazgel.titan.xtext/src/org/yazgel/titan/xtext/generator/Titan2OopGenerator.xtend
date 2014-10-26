package org.yazgel.titan.xtext.generator

import java.util.HashMap
import java.util.Map
import org.eclipse.emf.ecore.EObject
import org.yazgel.oop.MultiODataType
import org.yazgel.oop.MultiOReference
import org.yazgel.oop.OClass
import org.yazgel.oop.ODataType
import org.yazgel.oop.OFeature
import org.yazgel.oop.OModel
import org.yazgel.oop.OPackage
import org.yazgel.oop.OReference
import org.yazgel.oop.SingleODataType
import org.yazgel.oop.SingleOReference
import org.yazgel.oop.impl.OopFactoryImpl
import org.yazgel.titan.xtext.generator.helper.Model2ModelGeneratorHelper
import org.yazgel.titan.xtext.titan.DataType
import org.yazgel.titan.xtext.titan.DataTypes
import org.yazgel.titan.xtext.titan.Entity
import org.yazgel.titan.xtext.titan.Feature
import org.yazgel.titan.xtext.titan.Module
import org.yazgel.titan.xtext.titan.MultiDataType
import org.yazgel.titan.xtext.titan.MultiReference
import org.yazgel.titan.xtext.titan.Package
import org.yazgel.titan.xtext.titan.Reference
import org.yazgel.titan.xtext.titan.SingleDataType
import org.yazgel.titan.xtext.titan.SingleReference

class Titan2OopGenerator extends Model2ModelGeneratorHelper {

	//From model, To Model &&
	//To model, From Model
	public static Map<EObject, EObject> transformationReleations = new HashMap<EObject, EObject>();
	public static Map<EObject, EObject> modelBuilderReleations = new HashMap<EObject, EObject>();

	//public static List<OFeature> oppositedOMultiReferences = newArrayList
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

		oClass.name = entity.name
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
	}

	def dispatch ODataType generateFeature(SingleDataType dt) {
		var ODataType data;

		data = OopFactoryImpl.eINSTANCE.createSingleODataType
		data.type = '''«dt.type»'''

		data.name = dt.name
		transformationReleations.put(dt, data)
		transformationReleations.put(data, dt)

		data
	}

	def dispatch ODataType generateFeature(MultiDataType dt) {
		var data = OopFactoryImpl.eINSTANCE.createMultiODataType;
		data.type = '''«dt.type»'''

		data.name = dt.name
		if (dt.unique) {
			(data as MultiODataType).uniqueInstance = true;
		}
		transformationReleations.put(dt, data)
		transformationReleations.put(data, dt)

		data
	}

	def dispatch OReference generateFeature(Reference r) {
	}

	def dispatch OReference generateFeature(SingleReference r) {
		var OReference ref;
		ref = OopFactoryImpl.eINSTANCE.createSingleOReference
		ref.type = r.reference.name

		ref.name = r.name
		transformationReleations.put(r, ref)
		transformationReleations.put(ref, r)

		ref
	}

	def dispatch OReference generateFeature(MultiReference r) {
		var OReference ref;
		ref = OopFactoryImpl.eINSTANCE.createMultiOReference;

		ref.type = '''«r.reference.name»''';
		if (r.unique) {
			(ref as MultiOReference).uniqueInstance = true;
		}

		ref.name = r.name
		transformationReleations.put(r, ref)
		transformationReleations.put(ref, r)

		ref
	}

	def postGenerator(OModel model) {

		//0- super Classes must be set
		var entities = transformationReleations.filter[p1, p2|p1 instanceof Entity]
		for (e : entities.entrySet) {
			var entity = e.key as Entity
			if(entity.superEntity != null){
				var oc = transformationReleations.get(entity) as OClass
				oc.^super = transformationReleations.get(entity.superEntity) as OClass
			}
		} 
		
		//1-Reference Reference props must be set after generated model classes
		var releationsOfReferences = transformationReleations.filter[p1, p2|p1 instanceof Feature]
		for (e : releationsOfReferences.entrySet) {
			if (e.key instanceof Feature) {
				if (e.key instanceof Reference) {
					var or = transformationReleations.get((e.key as Reference).reference) as OClass;
					(e.value as OReference).reference = or;

					var oo = transformationReleations.get((e.key as Reference).opposite) as MultiOReference;
					(e.value as OReference).opposite = oo;

				} else if (e.key instanceof DataType) {
					var oo = transformationReleations.get((e.key as DataType).opposite) as MultiODataType;
					(e.value as ODataType).opposite = oo;
				}
			}
		}

		//2-Import Statements must be added after generated model classes
		for (e : releationsOfReferences.entrySet) {
			var oClass = e.value.eContainer as OClass
			if (e.value instanceof OReference) {
				var oReference = e.value as OReference

				if (oReference instanceof MultiOReference) {
					if ((oReference as MultiOReference).uniqueInstance) {
						oClass.imports.add("java.util.Set");
						oClass.imports.add("java.util.TreeSet");
					} else {
						oClass.imports.add("java.util.List");
						oClass.imports.add("java.util.ArrayList");
					}
				}
			} else if (e.value instanceof ODataType) {
				var oData = e.value as ODataType
				if (oData instanceof MultiODataType) {
					if ((oData as MultiODataType).uniqueInstance) {
						oClass.imports.add("java.util.Set");
						oClass.imports.add("java.util.TreeSet");
					} else {
						oClass.imports.add("java.util.List");
						oClass.imports.add("java.util.ArrayList");
					}
				}
			}
		}

		//3-Implement String Statements must be added after generated model classes  
		var oClasesWithUniqueInstanceOFeatures = transformationReleations.filter [ p1, p2 |
			p1 instanceof OClass && (p1 as OClass).features.filter[f|
				f instanceof MultiOReference && (f as MultiOReference).uniqueInstance].size > 0
		]
		for (e : oClasesWithUniqueInstanceOFeatures.entrySet) {
			var oClass = e.key as OClass
			for (f : oClass.features) {
				if (f instanceof MultiOReference && (f as MultiOReference).uniqueInstance)
					(f as MultiOReference).reference.implements.add(
						'''Comparable<«(f as MultiOReference).reference.name»>''');
			}
		}

		//4 Constructors must be added after generated model classes
		var oClasses = transformationReleations.filter[p1, p2|p1 instanceof OClass]
		for (e : oClasses.entrySet) {
			var oc = e.key as OClass 
			var oConst = OopFactoryImpl.eINSTANCE.createOMethod
			oConst.name = oc.name

			//Parameters must be set && Statements must be create.
			var oFeatures = oc.features
			for (OFeature of : oFeatures) {
				var statement = OopFactoryImpl.eINSTANCE.createOStatement
				if (of instanceof MultiOReference) {
					if (of.uniqueInstance) {
						statement.content = '''«of.name» = new TreeSet<>();'''
					} else {
						statement.content = '''«of.name» = new ArrayList<>();'''
					}
				} else if (of instanceof MultiODataType) {
					if (of.uniqueInstance) {
						statement.content = '''«of.name» = new TreeSet<>();'''
					} else {
						statement.content = '''«of.name» = new ArrayList<>();'''
					}
				}
				oConst.statements.add(statement)
			}
			oc.methods.add(oConst)
		}

		//5- adders must be added
		for (e : oClasses.entrySet) {
			var list = newArrayList
			var oc = e.key as OClass
			for (OFeature of : oc.features.filter[of|(of instanceof MultiOReference)]) {
				var f = of as MultiOReference
				if (!list.contains(f.reference)) {
					var method = OopFactoryImpl.eINSTANCE.createOMethod
					method.name = '''«f.addername»'''
					method.returnType = 'void'

					var parameter = OopFactoryImpl.eINSTANCE.createOParameter
					parameter.name = f.reference.name.toFirstLower
					parameter.type = f.type
					method.parameters.add(parameter)

					var statement = OopFactoryImpl.eINSTANCE.createOStatement
					statement.content = '''«f.gettername»().add(«parameter.name»);'''
					method.statements.add(statement)

					oc.methods.add(method)

					list.add(f.reference)
				}
			}
			for (OFeature odt : oc.features.filter[odt|(odt instanceof MultiODataType)]) {
				var dt = odt as MultiODataType
				if (!list.contains(dt.type)) {
					var method = OopFactoryImpl.eINSTANCE.createOMethod
					method.name = '''«dt.addername»'''
					method.returnType = 'void'

					var parameter = OopFactoryImpl.eINSTANCE.createOParameter
					parameter.name = dt.name.toFirstLower
					parameter.type = dt.type
					method.parameters.add(parameter)

					var statement = OopFactoryImpl.eINSTANCE.createOStatement
					statement.content = '''«dt.gettername»().add(«parameter.name»);'''
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
				gmethod.name = '''«d.gettername»'''
				gmethod.returnType = d.oFeatureType(true)

				var statement = OopFactoryImpl.eINSTANCE.createOStatement
				statement.content = '''return this.«d.name»;'''
				gmethod.statements.add(statement)
				oc.methods.add(gmethod)

				//setter
				var smethod = OopFactoryImpl.eINSTANCE.createOMethod
				smethod.name = '''«d.settername»'''
				smethod.returnType = '''void'''

				var sparameter = OopFactoryImpl.eINSTANCE.createOParameter
				sparameter.name = d.name.toFirstLower
				sparameter.type = d.oFeatureType(true)
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
				gmethod.name = '''«f.gettername»'''
				if (f instanceof MultiOReference) {
					if (f.uniqueInstance)
						gmethod.returnType = f.oFeatureType(true)
					else
						gmethod.returnType = f.oFeatureType(true)
				} else {
					gmethod.returnType = f.oFeatureType(true)
				}

				var statement = OopFactoryImpl.eINSTANCE.createOStatement
				statement.content = '''return this.«f.name»;'''
				gmethod.statements.add(statement)
				oc.methods.add(gmethod)

				//setter
				var smethod = OopFactoryImpl.eINSTANCE.createOMethod
				smethod.name = '''«f.settername»'''
				smethod.returnType = '''void'''

				var sparameter = OopFactoryImpl.eINSTANCE.createOParameter
				sparameter.name = f.name.toFirstLower

				if (f instanceof MultiOReference) {
					if (f.uniqueInstance)
						sparameter.type = f.oFeatureType(false)
					else
						sparameter.type = f.oFeatureType(false)
				} else {
					sparameter.type = f.oFeatureType(false)
				}

				smethod.parameters.add(sparameter)

				statement = OopFactoryImpl.eINSTANCE.createOStatement
				statement.content = '''this.«f.name» = «sparameter.name»;'''
				smethod.statements.add(statement)
				oc.methods.add(smethod)
			}
		}

		//7- CompareTo must be added
		for (e : oClasses.entrySet) {
			var oc = e.key as OClass
			for (OFeature of : oc.features.filter[of|
				(of instanceof MultiOReference) && (of as MultiOReference).uniqueInstance]) {
				var ref = of as MultiOReference

				//setter 
				var cmethod = OopFactoryImpl.eINSTANCE.createOMethod
				cmethod.name = '''compareTo'''
				cmethod.returnType = '''int'''
				cmethod.override = true

				var sparameter = OopFactoryImpl.eINSTANCE.createOParameter
				sparameter.name = '''o'''
				sparameter.type = ref.type
				cmethod.parameters.add(sparameter)

				var statement = OopFactoryImpl.eINSTANCE.createOStatement
				statement.content = '''
					final int BEFORE = -1;
					final int EQUAL = 0;
					final int AFTER = 1;
					
					int comparison;
					
					if (this == o) return EQUAL;			
					«FOR f : ref.reference.features»
						«IF f instanceof ODataType»
							«IF f.type.equals(DataTypes.STRING.literal)»
								//Strings follow this form
								comparison = this.get«f.name.toFirstUpper»().compareTo(o.get«f.name.toFirstUpper»());
								if (comparison != EQUAL) return comparison;
							«ELSEIF f.type.equals(DataTypes.BOOLEAN.literal)»
								//booleans follow this form
								if (!this.get«f.name.toFirstUpper»() && o.get«f.name.toFirstUpper»()) return BEFORE;
								if (this.get«f.name.toFirstUpper»() && !o.get«f.name.toFirstUpper»()) return AFTER;
							«ELSEIF f.type.equals(DataTypes.DOUBLE.literal)»
								//primitive numbers follow this form
								if (this.get«f.name.toFirstUpper»() < o.get«f.name.toFirstUpper»()) return BEFORE;
								if (this.get«f.name.toFirstUpper»() > o.get«f.name.toFirstUpper»()) return AFTER;
							«ELSEIF f.type.equals(DataTypes.INTEGER.literal)»
								//primitive numbers follow this form
								if (this.get«f.name.toFirstUpper»() < o.get«f.name.toFirstUpper»()) return BEFORE;
								if (this.get«f.name.toFirstUpper»() > o.get«f.name.toFirstUpper»()) return AFTER;
							«ELSEIF f.type.equals(DataTypes.LONG.literal)»
								//primitive numbers follow this form
								if (this.get«f.name.toFirstUpper»() < o.get«f.name.toFirstUpper»()) return BEFORE;
								if (this.get«f.name.toFirstUpper»() > o.get«f.name.toFirstUpper»()) return AFTER;
							«ENDIF»
						«ENDIF»	
					«ENDFOR»
									
					return EQUAL;
				'''
				cmethod.statements.add(statement)
				ref.reference.methods.add(cmethod)
			}
		}

		//Model Finished
		//Model Builder starts
		//1- Builder Class must be added.
		var builderPackage = OopFactoryImpl.eINSTANCE.createOPackage
		builderPackage.name = model.packages.get(0).name + "." + 'builder'
		model.packages.add(builderPackage)

		for (e : oClasses.entrySet) {
			var oc = e.key as OClass

			var bc = OopFactoryImpl.eINSTANCE.createOClass
			bc.name = '''«oc.oClassBuilderName»'''

			modelBuilderReleations.put(bc, oc)

			builderPackage.classes.add(bc)
		}

		//2-Import Statements must be added for builder Class
		//Burada Builder sınıfları dolaşılır bunlar ayrıca bir mapte tutulmalı.
		for (e : modelBuilderReleations.entrySet) {
			var builderOc = e.key as OClass
			var modelOc = e.value as OClass

			var importSet = newHashSet()

			importSet.add('''«modelOc.oClassPackageName».«modelOc.name»''')
			for (OFeature f : modelOc.features) {
				if (f instanceof OReference) {
					importSet.add('''«f.reference.oClassPackageName».«f.reference.name»''')
					if (f instanceof SingleOReference) {
						var builderOfReferenceOclass = modelBuilderReleations.filter[p1, p2|p2.equals(f.reference)].
							entrySet.get(0).key as OClass
						importSet.add(
							'''«builderOfReferenceOclass.oClassPackageName».«builderOfReferenceOclass.name»''')
					} else if (f instanceof MultiOReference) {
						importSet.add('''java.util.Arrays''')
						importSet.add('''java.util.List''')
						if (f.uniqueInstance) {
							importSet.add('''java.util.HashSet''')
							importSet.add('''java.util.Set''')
						}
					}
				}
			}
			builderOc.imports.addAll(importSet)
		}

		//3.Constructors must be added for builder Class
		for (e : modelBuilderReleations.entrySet) {
			var builderOc = e.key as OClass
			var modelOc = e.value as OClass

			var constructor = OopFactoryImpl.eINSTANCE.createOMethod

			constructor.name = modelOc.name
			constructor.static = true
			constructor.returnType = '''«modelOc.name»'''

			var statement = OopFactoryImpl.eINSTANCE.createOStatement
			var statementContent = '''«modelOc.name» o = new «modelOc.name»();'''

			//Parameters must be set && Statements must be create.
			var oFeatures = modelOc.features
			for (OFeature of : oFeatures) {
				if (of instanceof MultiOReference && !of.featureOpposited) {
					statementContent += '''
						for («(of as OReference).reference.name» r : «of.name») {
							o.add«(of as OReference).reference.name.toFirstUpper»(r);
							«FOR f : (of as OReference).reference.features»
								«IF f instanceof OReference && (f as OReference).opposite != null &&
							(f as OReference).opposite.eContainer.equals(of.eContainer)»
									«IF (f instanceof MultiOReference)»
										for(«(f as OReference).reference.name» c : r.get«f.name.toFirstUpper»()){
											o.«f.addername»(c);
										}
									«ELSE»
										o.«f.addername»(r.«f.gettername»());
									«ENDIF»
								«ELSEIF f instanceof ODataType && (f as ODataType).opposite != null &&
							(f as ODataType).opposite.eContainer.equals(of.eContainer)»
									«IF (f instanceof MultiODataType)»
										for(«(f as ODataType).type» c : r.«f.gettername»()){
											o.«f.opposite.addername»(c);
										}
									«ELSE»
										o.«(f as ODataType).opposite.addername»(r.«f.gettername»());
									«ENDIF»
								«ENDIF»
							«ENDFOR»
						}
					'''
				} else if (!(of instanceof MultiOReference) && !of.featureOpposited) {
					statementContent += '''o.«of.settername»(«of.name»);'''
				}

				if (of.featureMulti && !of.featureOpposited) {
					var param = OopFactoryImpl.eINSTANCE.createOParameter
					param.name = of.name
					param.type = of.oFeatureType(true)
					constructor.parameters.add(param)
				} else if (!of.featureMulti) {
					var param = OopFactoryImpl.eINSTANCE.createOParameter
					param.name = of.name
					param.type = of.oFeatureType(true)
					constructor.parameters.add(param)
				}

			}
			statementContent += '''return o;'''
			statement.content = statementContent
			constructor.statements.add(statement)
			builderOc.methods.add(constructor)
		}

		//4.Builder Static Methods must be added for builder Class
		for (e : modelBuilderReleations.entrySet) {
			var builderOc = e.key as OClass
			var modelOc = e.value as OClass

			//Parameters must be set && Statements must be create.
			var oFeatures = modelOc.features
			for (OFeature of : oFeatures) {
				if (!(of.featureMulti && of.featureOpposited)) {
					var staticOM = OopFactoryImpl.eINSTANCE.createOMethod
					builderOc.methods.add(staticOM)

					staticOM.static = true
					staticOM.name = of.name

					if (of instanceof SingleODataType) {
						var param = OopFactoryImpl.eINSTANCE.createOParameter
						param.name = of.name
						param.type = of.oFeatureType(true)
						staticOM.parameters.add(param)

						var statement = OopFactoryImpl.eINSTANCE.createOStatement
						statement.content = '''return «of.name»;'''

						staticOM.returnType = of.oFeatureType(true)
						staticOM.statements.add(statement)
					} else if (of instanceof SingleOReference) {

						//Burada Diğer builder Constructor cagıralacagından bırden fazla parametre olusturulup eklenır.
						var ref = of.reference
						for (refFeatures : ref.features) {
							if (!refFeatures.isFeatureOpposited) {
								var param = OopFactoryImpl.eINSTANCE.createOParameter
								param.name = refFeatures.name
								if (refFeatures instanceof SingleODataType) {
									param.type = refFeatures.oFeatureType(true)
								} else if (refFeatures instanceof MultiODataType) {
									param.type = refFeatures.oFeatureType(true)
								} else if (refFeatures instanceof SingleOReference) {
									param.type = refFeatures.oFeatureType(true)
								} else if (refFeatures instanceof MultiOReference) {
									param.type = refFeatures.oFeatureType(true)
								}
								staticOM.parameters.add(param)
							}
						}
						var statement = OopFactoryImpl.eINSTANCE.createOStatement
						var statementParamString = ""
						for (p : staticOM.parameters) {
							statementParamString += '''
								«p.name»«IF !staticOM.parameters.last.equals(p)», «ENDIF»
							'''
						}

						var builderOfReferenceOclass = modelBuilderReleations.filter[p1, p2|p2.equals(of.reference)].
							entrySet.get(0).key as OClass
						statement.content = '''return «builderOfReferenceOclass.name».«of.reference.name»(«statementParamString»);'''

						staticOM.returnType = '''«of.reference.name»'''
						staticOM.statements.add(statement)

					} else if (of instanceof MultiOReference || of instanceof MultiODataType) {
						var param = OopFactoryImpl.eINSTANCE.createOParameter
						param.name = of.name

						if (of instanceof MultiOReference) {
							param.type = '''«of.reference.name»...'''
						} else if (of instanceof MultiODataType) {
							param.type = '''«of.type»...'''
						}

						staticOM.parameters.add(param)

						var statement = OopFactoryImpl.eINSTANCE.createOStatement

						if (of.isFeatureUnique) {
							statement.content = '''return new HashSet<«of.type»>(Arrays.asList(«of.name»));'''
						} else {
							statement.content = '''return Arrays.asList(«of.name»);'''
						}

						staticOM.returnType = of.oFeatureType(true)
						staticOM.statements.add(statement)
					}
					
				}
			}
		}

		//Burada static alanlar bosaltılır.
		modelBuilderReleations.clear
		transformationReleations.clear
	}
}
