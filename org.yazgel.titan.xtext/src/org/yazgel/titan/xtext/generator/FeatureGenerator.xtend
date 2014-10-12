package org.yazgel.titan.xtext.generator

import org.yazgel.titan.xtext.titan.DataType
import org.yazgel.titan.xtext.titan.Feature
import org.yazgel.titan.xtext.titan.Reference

class FeatureGenerator extends BaseGenerator {

	def generateFeature(Feature d) {
		d.featureContent
	}

	def dispatch featureContent(Feature f) {
	} 

	def dispatch featureContent(DataType d) '''
		private «d.type» «d.name»;
	'''

	def dispatch featureContent(Reference r) '''
		«IF r.many»
			«IF r.featureParentAsEntity.allBannedFeatures.contains(r)»
				private Set<«r.reference.name»> «r.name»;
			«ELSE»
				private List<«r.reference.name»> «r.name»;
			«ENDIF»
		«ELSE»
			private «r.reference.name» «r.name»;
		«ENDIF»
	'''
	
	def dispatch generateAdderForCollection(Feature f){}
	
	def dispatch generateAdderForCollection(DataType dt)'''
		public void «dt.addername»(«dt.type» «dt.adderParemetername») {
			«dt.gettername»().add(«dt.adderParemetername»);
		}
	'''
	
	def dispatch generateAdderForCollection(Reference r)'''
		public void «r.addername»(«r.reference.name» «r.adderParemetername») {
			«r.gettername»().add(«r.adderParemetername»);
		}
	'''
	
	def dispatch generateGetterSetter(Feature f) {
	}

	def dispatch generateGetterSetter(DataType dt) '''
		public «dt.type» «dt.gettername»(){
			return this.«dt.name»;
		}
		
		public void «dt.settername»(«dt.type» «dt.name»){
			this.«dt.name» = «dt.name»;
		}
	'''

	def dispatch generateGetterSetter(Reference ref) '''
		«IF ref.many»
			«IF ref.featureParentAsEntity.allBannedFeatures.contains(ref)»
				public Set<«ref.reference.name»> «ref.gettername»() {
				return «ref.name»;
				}

				public void «ref.settername»(TreeSet<«ref.reference.name»> «ref.name») {
					this.«ref.name» = «ref.name»;
				}
			«ELSE»
				public List<«ref.reference.name»> «ref.gettername»() {
				return «ref.name»;
				}

				public void «ref.settername»(List<«ref.reference.name»> «ref.name») {
					this.«ref.name» = «ref.name»;
				}
			«ENDIF»
		«ELSE» 
			public «ref.reference.name» «ref.gettername»() {
				return this.«ref.name»;
			}
			
			public void «ref.settername»(«ref.reference.name» «ref.name») {
				this.«ref.name» = «ref.name»;
			}
		«ENDIF»
		'''
}
