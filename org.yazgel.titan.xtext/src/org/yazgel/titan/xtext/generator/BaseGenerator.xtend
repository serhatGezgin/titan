package org.yazgel.titan.xtext.generator

import java.util.List
import java.util.Stack
import org.eclipse.emf.ecore.EObject
import org.yazgel.oop.OClass
import org.yazgel.oop.OPackage

class BaseGenerator {

	/* Base Package hatirlanmasi gerek. */
	protected static OPackage basePackage;

	protected def oClassFileName(OClass oc) {
		val p = oc.packageNameList
		p.join('/') + '/' + oc.name + '.java'
	}

	protected static def packageNameList(OClass oc) {
		val list = newArrayList
		var pack = oc.eContainer as OPackage

		list.addAll(pack.name.split('\\.'))

		list
	}

	protected static def oClassPackageName(OClass oc) {
		val p = oc.packageNameList
		p.join('.')
	}
	
	protected def List<OClass> allOClasses(OPackage p) {
		val list = newArrayList
		var Stack<EObject> stack = new Stack
		stack.push(p)

		while (!stack.isEmpty) {
			var item = stack.pop

			if (item instanceof OPackage) {
				stack.addAll(item.classes)
			} else if (item instanceof OClass) {
				list.add(item)
			}
		}

		list
	}
		
}
