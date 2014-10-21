/*
 * generated by Xtext
 */
package org.yazgel.titan.xtext.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.emf.ecore.EObject
import org.yazgel.titan.xtext.titan.Module

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class TitanGenerator implements IGenerator {
	var extension PackageGenerator = new PackageGenerator
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		for (EObject o : resource.contents) {
			o.compile(fsa)
		}
	}
	
	def dispatch void compile(Module m, IFileSystemAccess fsa) {
		var oModel = new Titan2OopGenerator().doGenerate(m);
		oModel.packages.forEach[it.generateFile(fsa)]
	}

	def dispatch void compile(EObject o, IFileSystemAccess fsa) {
		throw new Exception('Dispatch error. Root element is not known.')
	}
}
