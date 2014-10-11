package org.yazgel.titan.xtext.generator

import org.eclipse.xtext.generator.IFileSystemAccess
import org.yazgel.titan.xtext.titan.Entity
import org.yazgel.titan.xtext.titan.Feature
import org.yazgel.titan.xtext.titan.DataType
import org.yazgel.titan.xtext.titan.Reference
import org.yazgel.titan.xtext.titan.DataTypes

class EntityGenerator extends BaseGenerator {
	var extension FeatureGenerator fg = new FeatureGenerator

	def generateFile(Entity e, IFileSystemAccess fsa) {
		fsa.generateFile(e.entityFileName, e.entityContent)
	}

	def entityContent(Entity e) '''
		package «e.entityPackageName»;
		
		«e.entityImportStatements»
		
		public class «e.name» {
			«FOR f : e.features»
				«f.generateFeature»
			«ENDFOR»
			
			«e.entityConstructor»
			
			«e.generateAddersForEntity»
			
			«FOR f : e.features»
				«f.generateGetterSetter»
			«ENDFOR»
		}
	''' 
	
	def generateAddersForEntity(Entity e){
		var list = newArrayList
		var result = ""
		for(Feature f : e.features){
			if(f instanceof Reference && f.many && !list.contains((f as Reference).reference)){
				result += f.generateAdderForCollection
				list.add((f as Reference).reference)
			}
		}
		result
	}

	def entityConstructor(Entity e) '''
		public «e.name»() {
			«FOR f : e.features»
				«IF f instanceof Reference»
					«IF f.many»
						«f.name» = new ArrayList<>();
					«ELSE»
						«f.name» = new «(f as Reference).reference.name»();
					«ENDIF»
				«ENDIF»
			«ENDFOR»  
		}
		
		public «e.name»(«FOR f : e.features»«f.constructorParameters»«ENDFOR») {
			«FOR f : e.features»
				«constructorFeatures(f)»
			«ENDFOR»
		}
	'''

	def dispatch constructorParameters(Feature f) {
	}

	def dispatch constructorParameters(DataType f) '''
		«f.type» «f.name»«IF !isLastFeature(f.featureParentAsEntity.features, f)», «ENDIF»'''

	def dispatch constructorParameters(Reference f) '''
		«IF f.many»List<«f.reference.name»> «f.name»«IF !isLastFeature(f.featureParentAsEntity.features, f)», «ENDIF»
		«ELSE»«f.reference.name» «f.name»«IF !isLastFeature(f.featureParentAsEntity.features, f)», «ENDIF»
		«ENDIF»'''

	def constructorFeatures(Feature f) '''
		this.«f.name» = «f.name»;
	'''
}
