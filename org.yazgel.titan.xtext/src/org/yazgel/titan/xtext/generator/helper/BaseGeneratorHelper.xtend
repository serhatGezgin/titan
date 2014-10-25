package org.yazgel.titan.xtext.generator.helper

import org.yazgel.oop.OClass
import org.yazgel.oop.OPackage
import org.yazgel.oop.OFeature
import org.yazgel.oop.SingleOReference
import org.yazgel.oop.MultiOReference
import org.yazgel.oop.SingleODataType
import org.yazgel.oop.MultiODataType

class BaseGeneratorHelper {
	protected def oClassPackageName(OClass oc) {
		val p = oc.packageNameList
		p.join('.')
	}

	protected def packageNameList(OClass oc) {
		val list = newArrayList
		var pack = oc.eContainer as OPackage

		list.addAll(pack.name.split('\\.'))

		list
	}
	
	def oFeatureType(OFeature of, boolean isGenericType) {
		if (of instanceof SingleOReference) {
			return '''«of.reference.name»'''
		} else if (of instanceof MultiOReference) {
			if (isGenericType) {
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
			if (isGenericType) {
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