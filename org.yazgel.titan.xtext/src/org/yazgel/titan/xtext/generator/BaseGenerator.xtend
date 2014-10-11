package org.yazgel.titan.xtext.generator

import java.util.List
import java.util.Stack
import org.eclipse.emf.ecore.EObject
import org.yazgel.titan.xtext.titan.DataType
import org.yazgel.titan.xtext.titan.Entity
import org.yazgel.titan.xtext.titan.Feature
import org.yazgel.titan.xtext.titan.Module
import org.yazgel.titan.xtext.titan.Package
import org.yazgel.titan.xtext.titan.Reference
import java.util.ArrayList

class BaseGenerator {

	/* Base Package hatirlanmasi gerek. */
	protected static Package basePackage;

	protected def entityFileName(Entity e) {
		val p = e.packageNameList
		p.add('model')
		p.join('/') + '/' + e.name + '.java'
	}

	protected def entityBuilderFileName(Entity e) {
		val p = e.packageNameList
		p.add('model')
		p.add('builder')
		p.join('/') + '/' + 'Nested' + e.name + 'Builder' + '.java'
	}

	protected def entityPackageName(Entity e) {
		val p = e.packageNameList
		p.add('model')
		p.join('.')
	}
	
	protected def entityBuilderPackageName(Entity e) {
		val p = e.packageNameList
		p.add('model')
		p.add('builder')
		p.join('.')
	}

	protected def packageNameList(Entity e) {
		val list = newArrayList
		var pack = e.eContainer as Package

		list.addAll(pack.name.split('\\.'))

		list
	}

	protected def isLastFeature(List<Feature> features, Feature f) {
		features.last.equals(f)
	}
	
	protected def entityBuilderConstructorBannedFeatures(Entity e) {
		var list = newArrayList
		
		var module = e.moduleFromEntity
		for(Package p : module.packages){
			for(Entity entity : p.allEntities){
				for(Feature f : entity.features){
					if(f instanceof Reference && (f as Reference).opposite != null){
						list.add((f as Reference).opposite)						
					}
				}
			}
		}
		
		list
	}
	
	protected def entityBuilderConstructorLegalFeatures(Entity e){
		var bannedReferences = e.entityBuilderConstructorBannedFeatures
		var legalFeatureList = new ArrayList
		
		for(f : e.features){
			if(!bannedReferences.contains(f)){
				legalFeatureList.add(f)
			}
		}
		
		legalFeatureList
	}

	protected def entityImportStatements(Entity e) {
		for (Feature f : e.features) {
			if (f instanceof Reference && f.many) {
				return '''
					import java.util.ArrayList;
					import java.util.List;
				'''
			}
		}
	}
	
	protected def entityBuilderImportStatements(Entity e) {
		var importString = ""
		val list = newArrayList
		
		importString += "import " + e.entityPackageName + "." + e.name + ";"
		importString += "\n"
		list.add(e)
		
		for (Feature f : e.features) {
			if (f instanceof Reference && !list.contains((f as Reference).reference)) {
				importString += "import " + (f as Reference).reference.entityPackageName + "." + (f as Reference).reference.name + ";"
				importString += "\n"
				list.add((f as Reference).reference)
			}
		}
		
		for (Feature f : e.features) {
			if (f instanceof Reference && f.many) {
				importString += "import java.util.Arrays;"
				importString += "import java.util.List;"
				
				return importString
			}
		}	
		
		importString
	}

	protected def List<Entity> allEntities(Package p) {
		val list = newArrayList
		var Stack<EObject> stack = new Stack
		stack.push(p)

		while (!stack.isEmpty) {
			var item = stack.pop

			if (item instanceof Package) {
				stack.addAll(item.entities)
			} else if (item instanceof Entity) {
				list.add(item)
			}
		}

		list
	}
	
	protected def List<Entity> allEntities(Module m) {
		val list = newArrayList
		var Stack<EObject> stack = new Stack
		
		for(Package p : m.packages){
			stack.push(p)	
		}

		while (!stack.isEmpty) {
			var item = stack.pop

			if (item instanceof Package) {
				stack.addAll(item.entities)
			} else if (item instanceof Entity) {
				list.add(item)
			}
		}

		list
	}

	protected def gettername(Feature f) {
		'get' + f.name.toFirstUpper
	}

	protected def settername(Feature f) {
		'set' + f.name.toFirstUpper
	}
	
	protected dispatch def addername(Feature f) {
	}
	
	protected dispatch def addername(DataType f) {
		'add' + f.type.toString.toFirstUpper
	}
	
	protected dispatch def addername(Reference f) {
		'add' + f.reference.name.toFirstUpper
	}
	
	protected dispatch def adderParemetername(Feature f) {
	}
	
	protected dispatch def adderParemetername(DataType f) {
		f.type.toString.toFirstLower
	}
	
	protected dispatch def adderParemetername(Reference f) {
		f.reference.name.toFirstLower
	}

	protected def getFeatureParentAsEntity(Feature f) {
		f.eContainer as Entity
	}
	
	protected def getDataTypeParent(DataType r) {
		r.eContainer as Entity
	}
	
	protected def getModuleFromEntity(Entity e) {
		(e.eContainer).eContainer as Module
	}
}
