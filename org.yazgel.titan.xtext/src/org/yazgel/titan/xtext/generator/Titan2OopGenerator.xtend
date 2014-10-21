package org.yazgel.titan.xtext.generator

import java.util.HashMap
import java.util.Map
import org.eclipse.emf.ecore.EObject
import org.yazgel.oop.OClass
import org.yazgel.oop.ODataType
import org.yazgel.oop.ODataTypeMulti
import org.yazgel.oop.ODataTypeSingle
import org.yazgel.oop.OFeature
import org.yazgel.oop.OModel
import org.yazgel.oop.OPackage
import org.yazgel.oop.OReference
import org.yazgel.oop.OReferenceMulti
import org.yazgel.oop.OReferenceSingle
import org.yazgel.oop.impl.OopFactoryImpl
import org.yazgel.titan.xtext.titan.DataType
import org.yazgel.titan.xtext.titan.DataTypes
import org.yazgel.titan.xtext.titan.Entity
import org.yazgel.titan.xtext.titan.Feature
import org.yazgel.titan.xtext.titan.Module
import org.yazgel.titan.xtext.titan.Package
import org.yazgel.titan.xtext.titan.Reference
import org.yazgel.titan.xtext.generator.helper.Model2ModelGeneratorHelper

class Titan2OopGenerator extends Model2ModelGeneratorHelper{

	//From model, To Model &&
	//To model, From Model
	public static Map<EObject, EObject> transformationReleations = new HashMap<EObject, EObject>();
	public static Map<EObject, EObject> modelBuilderReleations = new HashMap<EObject, EObject>();

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
		var ODataType data;
		if (dt.many) {
			data = OopFactoryImpl.eINSTANCE.createODataTypeMulti;
			data.type = '''List<«dt.type»>'''
		} else {
			data = OopFactoryImpl.eINSTANCE.createODataTypeSingle
			data.type = '''«dt.type»'''
		}

		data.name = dt.name
		transformationReleations.put(dt, data)
		transformationReleations.put(data, dt)

		data
	}

	def dispatch OReference generateFeature(Reference r) {
		var OReference ref;
		if (r.many) {
			ref = OopFactoryImpl.eINSTANCE.createOReferenceMulti;
			ref.type = '''List<«r.reference.name»>'''
		} else {
			ref = OopFactoryImpl.eINSTANCE.createOReferenceSingle
			ref.type = r.reference.name
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
			var oo = transformationReleations.get((e.key as Reference).opposite) as OReference;
			(e.value as OReference).reference = or;
			(e.value as OReference).opposite = oo;
		}

		//2-Unique referances must be set (opposite releations = unique releations)
		var oppositeReferences = transformationReleations.filter[p1, p2|
			(p1 instanceof Reference) && ((p1 as Reference).opposite != null) && ((p1 as Reference).opposite.many)]
		for (e : oppositeReferences.entrySet) {
			var or = transformationReleations.get((e.key as Reference).opposite) as OReferenceMulti
			or.uniqueInstance = true;
			or.type = '''Set<«or.reference.name»>'''
		}

		//3-Import Statements must be added after generated model classes
		for (e : releationsOfReferences.entrySet) {

			var oReference = e.value as OReference
			var oClass = e.value.eContainer as OClass

			if (oReference instanceof OReferenceMulti) {
				if ((oReference as OReferenceMulti).uniqueInstance) {
					oClass.imports.add("java.util.Set");
					oClass.imports.add("java.util.TreeSet");
				} else {
					oClass.imports.add("java.util.List");
					oClass.imports.add("java.util.ArrayList");
				}
			}
		}

		//4-Implement String Statements must be added after generated model classes  
		var oClasesWithUniqueInstanceOFeatures = transformationReleations.filter [ p1, p2 |
			p1 instanceof OClass && (p1 as OClass).features.filter[f|
				f instanceof OReferenceMulti && (f as OReferenceMulti).uniqueInstance].size > 0
		]
		for (e : oClasesWithUniqueInstanceOFeatures.entrySet) {
			var oClass = e.key as OClass
			for (f : oClass.features) {
				if (f instanceof OReferenceMulti && (f as OReferenceMulti).uniqueInstance)
					(f as OReferenceMulti).reference.implements.add(
						'''Comparable<«(f as OReferenceMulti).reference.name»>''');
			}
		}

		//5.1- First Constructors must be added after generated model classes
		var oClasses = transformationReleations.filter[p1, p2|p1 instanceof OClass]
		for (e : oClasses.entrySet) {
			var oc = e.key as OClass
			var oConst = OopFactoryImpl.eINSTANCE.createOMethod
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
			var oConst = OopFactoryImpl.eINSTANCE.createOMethod
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
					param.type = '''ArrayList<«of.type»>'''
				} else if (of instanceof OReferenceSingle) {
					param.type = '''«of.reference.name»'''
				} else if (of instanceof OReferenceMulti) {
					if (of.uniqueInstance) {
						param.type = '''TreeSet<«of.reference.name»>'''
					} else {
						param.type = '''ArrayList<«of.reference.name»>'''
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
					parameter.type = dt.type
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
				gmethod.returnType = '''«d.type»«IF d instanceof ODataTypeMulti»[]«ENDIF»'''

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
				sparameter.type = d.type
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
						sparameter.type = '''ArrayList<«f.reference.name»>'''
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

		//7- CompareTo must be added
		for (e : oClasses.entrySet) {
			var oc = e.key as OClass
			for (OFeature of : oc.features.filter[of|
				(of instanceof OReferenceMulti) && (of as OReferenceMulti).uniqueInstance]) {
				var ref = of as OReferenceMulti

				//setter
				var cmethod = OopFactoryImpl.eINSTANCE.createOMethod
				cmethod.name = '''compareTo'''
				cmethod.returnType = '''int'''
				cmethod.override = true

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
					«FOR f : ref.reference.features»
						«IF f instanceof ODataType»
							«IF f.type.equals(DataTypes.STRING.literal)»
								//Strings follow this form
								comparison = this.get«f.name.toFirstUpper»().compareTo(o.get«f.name.toFirstUpper»());
								if (comparison != EQUAL) return comparison;
							«ELSEIF f.type.equals(DataTypes.BOOLEAN.literal)»
								//booleans follow this form
								if (!this.get«f.name.toFirstUpper» && o.get«f.name.toFirstUpper») return BEFORE;
								if (this.get«f.name.toFirstUpper» && !o.get«f.name.toFirstUpper») return AFTER;
							«ELSEIF f.type.equals(DataTypes.DOUBLE.literal)»
								//primitive numbers follow this form
								if (this.get«f.name.toFirstUpper» < o.get«f.name.toFirstUpper») return BEFORE;
								if (this.get«f.name.toFirstUpper» > o.get«f.name.toFirstUpper») return AFTER;
							«ELSEIF f.type.equals(DataTypes.INTEGER.literal)»
								//primitive numbers follow this form
								if (this.get«f.name.toFirstUpper» < o.get«f.name.toFirstUpper») return BEFORE;
								if (this.get«f.name.toFirstUpper» > o.get«f.name.toFirstUpper») return AFTER;
							«ELSEIF f.type.equals(DataTypes.LONG.literal)»
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

		//Model Finished
		//Model Builder starts
		//1- Builder Class must be added.
		var builderPackage = OopFactoryImpl.eINSTANCE.createOPackage
		builderPackage.name = model.packages.get(0).name + "." + 'builder'
		model.packages.add(builderPackage)

		for (e : oClasses.entrySet) {
			var oc = e.key as OClass

			var bc = OopFactoryImpl.eINSTANCE.createOClass
			bc.name = '''Nested«oc.name»Builder'''

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
					if (f instanceof OReferenceSingle) {
						var builderOfReferenceOclass = modelBuilderReleations.filter[p1, p2|p2.equals(f.reference)].
							entrySet.get(0).key as OClass
						importSet.add(
							'''«builderOfReferenceOclass.oClassPackageName».«builderOfReferenceOclass.
								name»''')
					} else if (f instanceof OReferenceMulti) {
						importSet.add('''java.util.Arrays''')
						importSet.add('''java.util.List''')
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
				if (of instanceof OReferenceMulti && !(of as OReferenceMulti).uniqueInstance) {
					statementContent += '''
						for («(of as OReference).reference.name» r : «of.name») {
							o.add«(of as OReference).reference.name.toFirstUpper»(r);
							«FOR f2 : (of as OReference).reference.features»
								«IF f2 instanceof OReference && (f2 as OReference).opposite != null»
									«FOR f3 : modelOc.features»
										«IF f3 instanceof OReference && (f3 as OReference).reference.equals((f2 as OReference).eContainer as OClass)»
											«IF (f2 instanceof OReferenceMulti)»
												for(«(f2 as OReference).reference.name» c : r.get«f2.name.toFirstUpper»()){
													o.add«f2.reference.name»(c);
												}
											«ELSE»
												o.add«(f2 as OReferenceSingle).reference.name»(r.get«f2.name.toFirstUpper»());
											«ENDIF»
										«ENDIF»
									«ENDFOR»
								«ENDIF»
							«ENDFOR»
						}
					'''
				} else if (!(of instanceof OReferenceMulti)) {
					statementContent += '''o.set«of.name.toFirstUpper»(«of.name»);'''
				}

				if (of instanceof ODataTypeSingle) {
					var param = OopFactoryImpl.eINSTANCE.createOParameter
					param.name = of.name
					param.type = '''«of.type»'''
					constructor.parameters.add(param)
				} else if (of instanceof ODataTypeMulti) {
					var param = OopFactoryImpl.eINSTANCE.createOParameter
					param.name = of.name
					param.type = '''List<«of.type»>'''
					constructor.parameters.add(param)
				} else if (of instanceof OReferenceSingle) {
					var param = OopFactoryImpl.eINSTANCE.createOParameter
					param.name = of.name
					param.type = '''«of.reference.name»'''
					constructor.parameters.add(param)
				} else if (of instanceof OReferenceMulti) {
					if (!of.uniqueInstance) {
						var param = OopFactoryImpl.eINSTANCE.createOParameter
						param.name = of.name
						param.type = '''List<«of.reference.name»>'''
						constructor.parameters.add(param)
					}
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
				if (!(of instanceof OReferenceMulti && (of as OReferenceMulti).uniqueInstance)) {
					var staticOM = OopFactoryImpl.eINSTANCE.createOMethod
					builderOc.methods.add(staticOM)

					staticOM.static = true
					staticOM.name = of.name

					if (of instanceof ODataTypeSingle) {
						var param = OopFactoryImpl.eINSTANCE.createOParameter
						param.name = of.name
						param.type = '''«of.type»'''
						staticOM.parameters.add(param)

						var statement = OopFactoryImpl.eINSTANCE.createOStatement
						statement.content = '''return «of.name»;'''

						staticOM.returnType = '''«of.type»'''
						staticOM.statements.add(statement)
					} else if (of instanceof ODataTypeMulti) {
						var param = OopFactoryImpl.eINSTANCE.createOParameter
						param.name = of.name
						param.type = '''List<«of.type»>'''
						staticOM.parameters.add(param)

						var statement = OopFactoryImpl.eINSTANCE.createOStatement
						statement.content = '''return «of.name»;'''

						staticOM.returnType = '''List<«of.type»>'''
						staticOM.statements.add(statement)
					} else if (of instanceof OReferenceSingle) {

						//Burada Diğer builder Constructor cagıralacagından bırden fazla parametre olusturulup eklenır.
						var ref = of.reference
						for (refFeatures : ref.features) {
							var param = OopFactoryImpl.eINSTANCE.createOParameter
							param.name = refFeatures.name
							if (refFeatures instanceof ODataTypeSingle) {
								param.type = '''«refFeatures.type»'''
							} else if (refFeatures instanceof ODataTypeMulti) {
								param.type = '''List<«refFeatures.type»>'''
							} else if (refFeatures instanceof OReferenceSingle) {
								param.type = '''«refFeatures.reference.name»'''
							} else if (refFeatures instanceof OReferenceMulti) {
								if (!refFeatures.uniqueInstance) {
									param.type = '''List<«of.reference.name»>'''
								}
							}
							staticOM.parameters.add(param)
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

					} else if (of instanceof OReferenceMulti) {
						if (!of.uniqueInstance) {
							var param = OopFactoryImpl.eINSTANCE.createOParameter
							param.name = of.name
							param.type = '''«of.reference.name»...'''
							staticOM.parameters.add(param)

							var statement = OopFactoryImpl.eINSTANCE.createOStatement
							statement.content = '''return Arrays.asList(«of.name»);'''

							staticOM.returnType = '''List<«of.reference.name»>'''
							staticOM.statements.add(statement)
						}
					}
				}
			}
		}
		//Burada static alanlar bosaltılır.
		modelBuilderReleations.clear
		transformationReleations.clear
	}
}
