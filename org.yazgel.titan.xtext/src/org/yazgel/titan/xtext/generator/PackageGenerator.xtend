package org.yazgel.titan.xtext.generator

import org.eclipse.xtext.generator.IFileSystemAccess
import org.yazgel.oop.OPackage

class PackageGenerator extends BaseGenerator {
	var entityGenerator = new EntityGenerator2

	def generateFile(OPackage p, IFileSystemAccess fsa) {

		/* Base package kaydet. */
		basePackage = p

		p.allOClasses.forEach [ 
			entityGenerator.generateFile(it, fsa)
		]
	}
}
