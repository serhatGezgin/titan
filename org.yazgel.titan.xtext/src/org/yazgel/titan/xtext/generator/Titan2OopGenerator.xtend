package org.yazgel.titan.xtext.generator

import org.yazgel.oop.OClass
import org.yazgel.oop.ODataType
import org.yazgel.oop.ODataTypes
import org.yazgel.oop.OModel
import org.yazgel.oop.OPackage
import org.yazgel.oop.OReference
import org.yazgel.oop.impl.OopFactoryImpl
import org.yazgel.titan.xtext.titan.DataType
import org.yazgel.titan.xtext.titan.DataTypes
import org.yazgel.titan.xtext.titan.Entity
import org.yazgel.titan.xtext.titan.Module
import org.yazgel.titan.xtext.titan.Package
import org.yazgel.titan.xtext.titan.Reference
import org.yazgel.titan.xtext.titan.Feature
import org.yazgel.oop.OFeature
import java.util.HashMap
import org.eclipse.emf.ecore.EObject
import java.util.Map

class Titan2OopGenerator{
	
	Map<EObject, EObject> transformationReleations = new HashMap<EObject, EObject>();
	
	def OModel doGenerate(Module module) {
		var model = OopFactoryImpl.eINSTANCE.createOModel
		model.name = module.name
		transformationReleations.put(model, module)
		transformationReleations.put(module, model)
		
		
		for (Package p : module.packages) {
			model.packages.add(generate(p));
		}
		
		var oPackages = model.packages
		for(OPackage p : oPackages){
			var oClasses = p.classes
			for(OClass c : oClasses){				
				var entity = transformationReleations.get(c) as Entity
				var tFeatures = entity.features
				for(Feature f : tFeatures){
					c.features.add(generateFeature(f))
				}
			}
		}
		
		model
	}

	def OPackage generate(Package tPackage) {
		var oPackage = OopFactoryImpl.eINSTANCE.createOPackage

		oPackage.name = tPackage.name
		transformationReleations.put(oPackage, tPackage)
		transformationReleations.put(tPackage, oPackage)

		for (Entity e : tPackage.entities) {
			oPackage.classes.add(generate(e))
		}

		oPackage
	}

	def OClass generate(Entity entity) {
		var oClass = OopFactoryImpl.eINSTANCE.createOClass

		oClass.name = entity.name
		transformationReleations.put(oClass, entity)
		transformationReleations.put(entity, oClass)

		oClass
	} 

	def dispatch OFeature generateFeature(Feature f){
	}

	def dispatch ODataType generateFeature(DataType dt) {
		var oDataType = OopFactoryImpl.eINSTANCE.createODataType
		
		oDataType.name = dt.name
		transformationReleations.put(oDataType, dt)
		transformationReleations.put(dt, oDataType)
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
		transformationReleations.put(oReference, r)
		transformationReleations.put(r, oReference)
		oReference.many = r.many
		oReference.reference = transformationReleations.get(r.reference) as OClass
				
		oReference
	}
}
