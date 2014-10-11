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
		
		public class «'Nested' + e.name + 'Builder'» {
			
			«e.entityBuilderConstructor»
		
			«FOR f : e.features»
				«f.entityBuilderConstantMethods»
			«ENDFOR»
		}  
	'''

	def entityBuilderConstructor(Entity e){
		var bannedReferences = e.entityBuilderConstructorBannedFeatures
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
										o.«f2.addername»(r.«f2.gettername»());	
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

	def dispatch entityBuilderConstantMethods(Feature f) {}

	def dispatch entityBuilderConstantMethods(Reference r) '''
		«IF !r.featureParentAsEntity.entityBuilderConstructorBannedFeatures.contains(r)»
			«IF r.many»
			public static List<«r.reference.name»> «r.name»(«r.reference.name»...«r.name») {
				return Arrays.asList(«r.name»);
			}
			«ELSE» 
			public static «r.reference.name» «r.name»(«FOR f : r.reference.features»«f.constantMethodParameters»«ENDFOR») {
				return new «r.reference.name»(«FOR f : r.reference.features»«f.constantMethodParametersForUse»«ENDFOR»);
			}
		«ENDIF»
		«ENDIF»
	'''

	def dispatch entityBuilderConstantMethods(DataType dt) '''
		public static «dt.type» «dt.name»(«dt.type» value) {
			return value;
		}
	'''

	def dispatch constantMethodParameters(Feature f) {
	}

	def dispatch constantMethodParameters(DataType f) '''
	«f.type» «f.name»«IF !isLastFeature(f.featureParentAsEntity.features, f)»,«ENDIF»'''

	def dispatch constantMethodParameters(Reference f) '''
	«IF f.many»ArrayList<«f.reference.name»> «f.name»«IF !isLastFeature(f.featureParentAsEntity.features, f)»,«ENDIF»
	«ELSE»«f.reference.name» «f.name»«IF !isLastFeature(f.featureParentAsEntity.features, f)»,«ENDIF»
	«ENDIF»'''

	def dispatch constantMethodParametersForUse(Feature f) {
	}

	def dispatch constantMethodParametersForUse(DataType f) '''
		«f.name»«IF !isLastFeature(f.featureParentAsEntity.features, f)»,«ENDIF»
	'''

	def dispatch constantMethodParametersForUse(Reference f) '''
		«f.name»«IF !isLastFeature(f.featureParentAsEntity.features, f)»,«ENDIF»
	'''
}
