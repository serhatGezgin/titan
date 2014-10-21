package org.yazgel.titan.xtext.generator

import org.eclipse.xtext.generator.IFileSystemAccess
import org.yazgel.oop.OClass
import org.yazgel.oop.OMethod

class ClassGenerator extends Model2TextGeneratorHelper {

	def generateFile(OClass oc, IFileSystemAccess fsa) {
		fsa.generateFile(oc.oClassFileName, oc.oClassContent)
	}

	def oClassContent(OClass oc) '''
		package «oc.oClassPackageName»;
		
		«FOR s : oc.imports»
			import «s»;
		«ENDFOR»
		
		public class «oc.name» «oc.oClassImplements»{
			«FOR f : oc.features»
				private «f.type» «f.name»;
			«ENDFOR» 
			
			«FOR c : oc.methods»
				«IF c.override»
				@Override
				«ENDIF»
				public «c.oMethodAccessType» «c.returnType» «c.name»(«c.oMethodParams»){
					«FOR s : c.statements»
						«s.content»
					«ENDFOR»
				}
			«ENDFOR»
		}
	'''

	def oClassImplements(OClass oc) {
		if (oc.implements.empty)
			return ""

		'''
			implements «FOR s : oc.implements»«s»«IF !s.equals(oc.implements.last)», «ENDIF»«ENDFOR»
		'''
	}

	def oMethodAccessType(OMethod om) {
		if (om.static)
			return "static"

		return ""
	}

	def oMethodParams(OMethod om) {
		if (om.parameters.empty)
			return ""

		'''
			«FOR p : om.parameters»«p.type» «p.name»«IF !p.equals(om.parameters.last)», «ENDIF»«ENDFOR»
		'''
	}

}
