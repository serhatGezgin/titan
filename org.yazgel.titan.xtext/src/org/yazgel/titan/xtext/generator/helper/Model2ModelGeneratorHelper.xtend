package org.yazgel.titan.xtext.generator.helper

import org.yazgel.oop.ODataType
import org.yazgel.oop.OFeature
import org.yazgel.oop.OReference
import org.yazgel.oop.MultiOReference
import org.yazgel.oop.MultiODataType
import org.yazgel.oop.OClass

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
	
	protected def oClassBuilderName(OClass oc) {
		'''Nested«oc.name»Builder'''
	}

	protected def isFeatureOpposited(OFeature f) {
		if(f instanceof MultiOReference && !(f as MultiOReference).opposites.empty){
			return true
		}else if(f instanceof MultiODataType && !(f as MultiODataType).opposites.empty){
			return true
		}
		
		return false
	}
	
	protected def isFeatureMulti(OFeature f) {
		if(f instanceof MultiOReference){
			return true
		}else if(f instanceof MultiODataType){
			return true
		}
		
		return false
	}
}
