package org.yazgel.titan.xtext.generator

import org.eclipse.xtext.generator.IFileSystemAccess
import org.yazgel.titan.xtext.titan.DataType
import org.yazgel.titan.xtext.titan.Entity
import org.yazgel.titan.xtext.titan.Feature
import org.yazgel.titan.xtext.titan.Reference

class NestedEntityBuilderGenerator {
	var extension FeatureGenerator fg = new FeatureGenerator

	def generateFile(Entity e, IFileSystemAccess fsa) {
		fsa.generateFile(e.entityBuilderFileName, e.entityBuilderContent)
	}

	def entityBuilderContent(Entity e) '''
		package «e.entityBuilderPackageName»;
		
		«e.entityBuilderImportStatements»
		
		public class «e.entityBuilderClassName» {
			
			«e.entityBuilderConstructor»
		
			«FOR f : e.features»
				«f.entityBuilderConstantMethods»
			«ENDFOR»
		}  
	'''

	def entityBuilderConstructor(Entity e){
		var bannedReferences = e.allBannedFeatures
		'''
		public static «e.name» «e.name»(«e.builderConstructorParameters») {
			«e.name» o = new «e.name»();
			«FOR f : e.features»
				«IF f instanceof Reference && f.many && !bannedReferences.contains(f)»
					for («(f as Reference).reference.name» r : «f.name») {
						o.«f.addername»(r);
						«FOR f2 : (f as Reference).reference.features»
							«IF f2 instanceof Reference && (f2 as Reference).opposite != null»
								«FOR f3 : e.features»
									«IF f3 instanceof Reference && (f3 as Reference).reference.equals((f2 as Reference).featureParentAsEntity)»
										«IF (f2 as Reference).many»
											for(«(f2 as Reference).reference.name» c : r.«f2.gettername»()){
												o.«f2.addername»(c);
											}
										«ELSE»
											o.«f2.addername»(r.«f2.gettername»());
										«ENDIF»
									«ENDIF»
								«ENDFOR»
							«ENDIF»
						«ENDFOR»
					}
				«ELSEIF !bannedReferences.contains(f)»
					o.«f.settername»(«f.name»);
				«ENDIF»
			«ENDFOR»
		
			return o;
		}
	'''	
	}
	
	def builderConstructorParameters(Entity e){
		var legalFeatureList = e.entityBuilderConstructorLegalFeatures
		'''
		«FOR f : e.features»
			«IF legalFeatureList.contains(f)»
				«f.constructorParameters»
			«ENDIF»
		«ENDFOR»
		'''
	}
	
	def builderConstructorParametersForUse(Entity e){
		var legalFeatureList = e.entityBuilderConstructorLegalFeatures
		'''
		«FOR f : e.features»
			«IF legalFeatureList.contains(f)»
				«f.constructorParametersForUse»
			«ENDIF»
		«ENDFOR»
		'''
	}

	def dispatch constructorParameters(Feature f) {
	}

	def dispatch constructorParameters(DataType f){
		var legalFeatures = f.featureParentAsEntity.entityBuilderConstructorLegalFeatures
		'''
		«f.type» «f.name»«IF !isLastFeature(legalFeatures, f)», «ENDIF»
		'''
	} 

	def dispatch constructorParameters(Reference f){
		var legalFeatures = f.featureParentAsEntity.entityBuilderConstructorLegalFeatures
		'''
		«IF f.many»List<«f.reference.name»> «f.name»«IF !isLastFeature(legalFeatures, f)», «ENDIF»
		«ELSE»«f.reference.name» «f.name»«IF !isLastFeature(legalFeatures, f)», «ENDIF»
		«ENDIF»
		'''	
	}
	
	def dispatch constructorParametersForUse(Feature f) {
	}

	def dispatch constructorParametersForUse(DataType f){
		var legalFeatures = f.featureParentAsEntity.entityBuilderConstructorLegalFeatures
		'''
		«f.name»«IF !isLastFeature(legalFeatures, f)», «ENDIF»
		'''
	} 

	def dispatch constructorParametersForUse(Reference f){
		var legalFeatures = f.featureParentAsEntity.entityBuilderConstructorLegalFeatures
		'''
		«f.name»«IF !isLastFeature(legalFeatures, f)», «ENDIF»
		'''	
	}

	def dispatch entityBuilderConstantMethods(Feature f) {}

	def dispatch entityBuilderConstantMethods(Reference r) '''
		«IF !r.featureParentAsEntity.allBannedFeatures.contains(r)»
			«IF r.many»
			public static List<«r.reference.name»> «r.name»(«r.reference.name»...«r.name») {
				return Arrays.asList(«r.name»);
			}
			«ELSE» 
			public static «r.reference.name» «r.name»(«r.reference.builderConstructorParameters») {
				return «r.reference.entityBuilderClassName».«r.reference.name»(«r.reference.builderConstructorParametersForUse»);
			}
		«ENDIF»
		«ENDIF»
	'''

	def dispatch entityBuilderConstantMethods(DataType dt) '''
		public static «dt.type» «dt.name»(«dt.type» value) {
			return value;
		}
	'''
}
