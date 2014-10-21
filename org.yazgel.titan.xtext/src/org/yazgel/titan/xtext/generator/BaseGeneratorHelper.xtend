package org.yazgel.titan.xtext.generator

import org.yazgel.oop.OClass
import org.yazgel.oop.OPackage

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
}