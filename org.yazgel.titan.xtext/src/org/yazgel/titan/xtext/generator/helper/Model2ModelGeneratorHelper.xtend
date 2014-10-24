package org.yazgel.titan.xtext.generator.helper

import org.yazgel.oop.OFeature
import org.yazgel.oop.SingleOReference
import org.yazgel.oop.MultiOReference
import org.yazgel.oop.SingleODataType
import org.yazgel.oop.MultiODataType

class Model2ModelGeneratorHelper extends BaseGeneratorHelper {

	def oFeatureType(OFeature of, boolean parameterType) {
		if (of instanceof SingleOReference) {
			return '''«of.reference.name»'''
		} else if (of instanceof MultiOReference) {
			if (parameterType) {
				if (of.uniqueInstance) {
					return '''Set<«of.reference.name»>'''
				}
				return '''List<«of.reference.name»>'''
			} else {
				if (of.uniqueInstance)
					return '''TreeSet<«of.reference.name»>'''

				return '''ArrayList<«of.reference.name»>'''
			}

		} else if (of instanceof SingleODataType) {
			return '''«of.type»'''
		} else if (of instanceof MultiODataType) {
			if (parameterType) {
				if (of.uniqueInstance) {
					return '''Set<«of.type»>'''
				}
				return '''List<«of.type»>'''
			} else {
				if (of.uniqueInstance)
					return '''TreeSet<«of.type»>'''

				return '''ArrayList<«of.type»>'''
			}
		}
	}
}
