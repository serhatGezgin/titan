package org.yazgel.titan.xtext.generator.helper

import org.yazgel.oop.ODataType
import org.yazgel.oop.OFeature
import org.yazgel.oop.OReference

class Model2ModelGeneratorHelper extends BaseGeneratorHelper {

	protected def gettername(OFeature f) {
		'get' + f.name.toFirstUpper
	}

	protected def settername(OFeature f) {
		'set' + f.name.toFirstUpper
	}

	protected def addername(OFeature f) {
		if (f instanceof OReference)
			'add' + f.reference.name
		else if (f instanceof ODataType)
			'add' + f.name.toFirstUpper
	}

}
