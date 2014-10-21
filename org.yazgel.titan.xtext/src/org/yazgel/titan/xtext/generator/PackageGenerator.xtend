package org.yazgel.titan.xtext.generator

import org.eclipse.xtext.generator.IFileSystemAccess
import org.yazgel.oop.OPackage
import org.yazgel.titan.xtext.generator.helper.Model2TextGeneratorHelper

class PackageGenerator extends Model2TextGeneratorHelper {
	var classGenerator = new ClassGenerator

	def generateFile(OPackage p, IFileSystemAccess fsa) {

		/* Base package kaydet. */
		basePackage = p
 
		p.allOClasses.forEach [ 
			classGenerator.generateFile(it, fsa)
		]
	}
}
