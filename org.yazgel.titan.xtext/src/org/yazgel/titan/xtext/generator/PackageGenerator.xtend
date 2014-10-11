package org.yazgel.titan.xtext.generator

import org.eclipse.xtext.generator.IFileSystemAccess
import org.yazgel.titan.xtext.titan.Package

class PackageGenerator extends BaseGenerator {
	var entityGenerator = new EntityGenerator
	var nestedEntityBuilderGenerator = new NestedEntityBuilderGenerator

	def generateFile(Package p, IFileSystemAccess fsa) {

		/* Base package kaydet. */
		basePackage = p

		p.allEntities.forEach [
			entityGenerator.generateFile(it, fsa)
			nestedEntityBuilderGenerator.generateFile(it, fsa)
		]
	}
}
