package org.yazgel.titan.xtext.generator

import org.yazgel.titan.xtext.titan.Module
import org.yazgel.oop.OModel
import org.yazgel.oop.impl.OopFactoryImpl
import org.yazgel.oop.OPackage
import org.yazgel.titan.xtext.titan.Entity
import org.yazgel.oop.OClass
import org.yazgel.oop.ODataType
import org.yazgel.oop.OReference
import org.yazgel.titan.xtext.titan.DataType
import org.yazgel.titan.xtext.titan.Reference
import org.yazgel.titan.xtext.titan.Feature
import org.yazgel.titan.xtext.titan.DataTypes
import org.yazgel.oop.ODataTypes

class Titan2OopGenerator {
	def OModel doGenerate(Module module) {
		var model = OopFactoryImpl.eINSTANCE.createOModel
		model.name = module.name

		for (org.yazgel.titan.xtext.titan.Package p : module.packages) {
			model.packages.add(generate(p));
		}

		model
	}

	def OPackage generate(org.yazgel.titan.xtext.titan.Package tPackage) {
		var oPackage = OopFactoryImpl.eINSTANCE.createOPackage

		oPackage.name = tPackage.name

		for (Entity e : tPackage.entities) {
			oPackage.classes.add(generate(e))
		}

		oPackage
	}

	def OClass generate(Entity entity) {
		var oClass = OopFactoryImpl.eINSTANCE.createOClass

		oClass.name = entity.name

		var features = entity.features
		for (Feature f : features) {
			oClass.features.add(generateFeature(f))
		}

		oClass
	} 

	def dispatch ODataType generateFeature(DataType dt) {
		var oDataType = OopFactoryImpl.eINSTANCE.createODataType
		
		oDataType.name = dt.name
		oDataType.many = dt.many
		
		switch dt.type{
			case DataTypes.BOOLEAN : oDataType.type = ODataTypes.BOOLEAN
			case DataTypes.DOUBLE : oDataType.type = ODataTypes.DOUBLE
			case DataTypes.INTEGER : oDataType.type = ODataTypes.INTEGER
			case DataTypes.LONG : oDataType.type = ODataTypes.LONG
			case DataTypes.STRING : oDataType.type = ODataTypes.STRING
		}
		
		oDataType
	}

	def dispatch OReference generateFeature(Reference r) {
		var oReference = OopFactoryImpl.eINSTANCE.createOReference
		
		oReference.name = r.name
		oReference.many = r.many
				
		oReference
	}
}
