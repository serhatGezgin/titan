package org.yazgel.titan.xtext.generator

import org.eclipse.xtext.generator.IFileSystemAccess
import org.yazgel.titan.xtext.titan.DataType
import org.yazgel.titan.xtext.titan.DataTypes
import org.yazgel.titan.xtext.titan.Entity
import org.yazgel.titan.xtext.titan.Feature
import org.yazgel.titan.xtext.titan.Reference

class EntityGenerator extends BaseGenerator {
	var extension FeatureGenerator fg = new FeatureGenerator

	def generateFile(Entity e, IFileSystemAccess fsa) {
		fsa.generateFile(e.entityFileName, e.entityContent)
	}

	def entityContent(Entity e) '''
		package «e.entityPackageName»;
		
		«e.entityImportStatements»
		
		public class «e.name» «IF e.allBannedFeaturesReleationEntities.contains(e)»implements Comparable<«e.name»> «ENDIF»{
			«FOR f : e.features»
				«f.generateFeature»
			«ENDFOR»
			
			«e.entityConstructor»
			
			«e.generateAddersForEntity»
			
			«FOR f : e.features»
				«f.generateGetterSetter»
			«ENDFOR»
			
			«IF e.allBannedFeaturesReleationEntities.contains(e)»
				«e.generateCompareTo»
			«ENDIF»
		}
	'''

	def generateCompareTo(Entity e) {
		'''
		@Override
		public int compareTo(«e.name» o) {
			final int BEFORE = -1;
			final int EQUAL = 0;
			final int AFTER = 1;
			
			int comparison;
			
			if (this == o) return EQUAL;			
			«FOR f : e.features»
				«IF f instanceof DataType»
					«IF f.type.equals(DataTypes.STRING)»
					//Strings follow this form
					comparison = this.«f.gettername»().compareTo(o.«f.gettername»());
					if (comparison != EQUAL) return comparison;
    				«ELSEIF f.type.equals(DataTypes.BOOLEAN)»
					//booleans follow this form
					if (!this.«f.gettername» && o.«f.gettername») return BEFORE;
					if (this.«f.gettername» && !o.«f.gettername») return AFTER;
	    			«ELSEIF f.type.equals(DataTypes.DOUBLE)»
					//primitive numbers follow this form
					if (this.«f.gettername» < o.«f.gettername») return BEFORE;
					if (this.«f.gettername» > o.«f.gettername») return AFTER;
    				«ELSEIF f.type.equals(DataTypes.INTEGER)»
					//primitive numbers follow this form
					if (this.«f.gettername» < o.«f.gettername») return BEFORE;
					if (this.«f.gettername» > o.«f.gettername») return AFTER;
    				«ELSEIF f.type.equals(DataTypes.LONG)»
					//primitive numbers follow this form
					if (this.«f.gettername» < o.«f.gettername») return BEFORE;
					if (this.«f.gettername» > o.«f.gettername») return AFTER;
					«ENDIF»
				«ENDIF»	
			«ENDFOR»
			
			return EQUAL;
		}		
		'''
	}

	def generateAddersForEntity(Entity e) {
		var list = newArrayList
		var result = ""
		for (Feature f : e.features) {
			if (f instanceof Reference && f.many && !list.contains((f as Reference).reference)) {
				result += f.generateAdderForCollection
				list.add((f as Reference).reference)
			}
		}
		result
	}

	def entityConstructor(Entity e) '''
		public «e.name»(){
			«FOR f : e.features»
				«IF f instanceof Reference»
					«IF f.many»
						«IF e.allBannedFeatures.contains(f)»
							«f.name» = new TreeSet<>();
						«ELSE»
							«f.name» = new ArrayList<>();
						«ENDIF»
					«ELSE»
						«f.name» = new «(f as Reference).reference.name»();
					«ENDIF»
				«ENDIF»
			«ENDFOR»  
		}
		
		public «e.name»(«FOR f : e.features»«f.constructorParameters»«ENDFOR»){
			«FOR f : e.features»
				«constructorFeatures(f)»
			«ENDFOR»
		}
	'''

	def dispatch constructorParameters(Feature f) {
	}

	def dispatch constructorParameters(DataType f) '''
		«f.type» «f.name»
		«IF !isLastFeature(f.featureParentAsEntity.features, f)», 
		«ENDIF»
	'''

	def dispatch constructorParameters(Reference f) {
		'''
			«IF f.many»
				«IF f.featureParentAsEntity.allBannedFeatures.contains(f)»
					TreeSet<«f.reference.name»> «f.name»
				«ELSE»
					List<«f.reference.name»> «f.name»
				«ENDIF»
				«IF !isLastFeature(f.featureParentAsEntity.features, f)», 
				«ENDIF»
			«ELSE»
				«f.reference.name» «f.name»
				«IF !isLastFeature(f.featureParentAsEntity.features, f)», 
				«ENDIF»
			«ENDIF»
		'''
	}

	def constructorFeatures(Feature f) '''
		this.«f.name» = «f.name»;
	'''
}
