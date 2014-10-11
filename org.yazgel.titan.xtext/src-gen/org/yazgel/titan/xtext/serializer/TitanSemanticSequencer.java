package org.yazgel.titan.xtext.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.yazgel.titan.xtext.services.TitanGrammarAccess;
import org.yazgel.titan.xtext.titan.DataType;
import org.yazgel.titan.xtext.titan.Entity;
import org.yazgel.titan.xtext.titan.EntityBuilder;
import org.yazgel.titan.xtext.titan.Module;
import org.yazgel.titan.xtext.titan.ParameterDataType;
import org.yazgel.titan.xtext.titan.ParameterReference;
import org.yazgel.titan.xtext.titan.Reference;
import org.yazgel.titan.xtext.titan.TitanPackage;
import org.yazgel.titan.xtext.titan.adds;
import org.yazgel.titan.xtext.titan.method;
import org.yazgel.titan.xtext.titan.takes;

@SuppressWarnings("all")
public class TitanSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private TitanGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == TitanPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case TitanPackage.DATA_TYPE:
				if(context == grammarAccess.getDataTypeRule() ||
				   context == grammarAccess.getFeatureRule()) {
					sequence_DataType(context, (DataType) semanticObject); 
					return; 
				}
				else break;
			case TitanPackage.ENTITY:
				if(context == grammarAccess.getEntityRule()) {
					sequence_Entity(context, (Entity) semanticObject); 
					return; 
				}
				else break;
			case TitanPackage.ENTITY_BUILDER:
				if(context == grammarAccess.getEntityBuilderRule()) {
					sequence_EntityBuilder(context, (EntityBuilder) semanticObject); 
					return; 
				}
				else break;
			case TitanPackage.MODULE:
				if(context == grammarAccess.getModuleRule()) {
					sequence_Module(context, (Module) semanticObject); 
					return; 
				}
				else break;
			case TitanPackage.PACKAGE:
				if(context == grammarAccess.getPackageRule()) {
					sequence_Package(context, (org.yazgel.titan.xtext.titan.Package) semanticObject); 
					return; 
				}
				else break;
			case TitanPackage.PARAMETER_DATA_TYPE:
				if(context == grammarAccess.getParameterDataTypeRule() ||
				   context == grammarAccess.getParameterFeatureRule()) {
					sequence_ParameterDataType(context, (ParameterDataType) semanticObject); 
					return; 
				}
				else break;
			case TitanPackage.PARAMETER_REFERENCE:
				if(context == grammarAccess.getParameterFeatureRule() ||
				   context == grammarAccess.getParameterReferenceRule()) {
					sequence_ParameterReference(context, (ParameterReference) semanticObject); 
					return; 
				}
				else break;
			case TitanPackage.REFERENCE:
				if(context == grammarAccess.getFeatureRule() ||
				   context == grammarAccess.getReferenceRule()) {
					sequence_Reference(context, (Reference) semanticObject); 
					return; 
				}
				else break;
			case TitanPackage.ADDS:
				if(context == grammarAccess.getAddsRule()) {
					sequence_adds(context, (adds) semanticObject); 
					return; 
				}
				else break;
			case TitanPackage.METHOD:
				if(context == grammarAccess.getMethodRule()) {
					sequence_method(context, (method) semanticObject); 
					return; 
				}
				else break;
			case TitanPackage.TAKES:
				if(context == grammarAccess.getTakesRule()) {
					sequence_takes(context, (takes) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=ID type=DataTypes many?='[]'?)
	 */
	protected void sequence_DataType(EObject context, DataType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=[Entity|ID] takes=takes?)
	 */
	protected void sequence_EntityBuilder(EObject context, EntityBuilder semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID superEntity=[Entity|ID]? (features+=Feature features+=Feature*)?)
	 */
	protected void sequence_Entity(EObject context, Entity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=QUALIFIED_NAME type=InternalDSLType (packages+=Package packages+=Package*)?)
	 */
	protected void sequence_Module(EObject context, Module semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=QUALIFIED_NAME (entities+=Entity entities+=Entity*)? (entityBuilders+=EntityBuilder entityBuilders+=EntityBuilder*)?)
	 */
	protected void sequence_Package(EObject context, org.yazgel.titan.xtext.titan.Package semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=DataTypes many?='[]'? name=ID)
	 */
	protected void sequence_ParameterDataType(EObject context, ParameterDataType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (reference=[Entity|ID] many?='[]'? name=ID)
	 */
	protected void sequence_ParameterReference(EObject context, ParameterReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID reference=[Entity|ID] many?='[]'? opposite=[Reference|QUALIFIED_NAME]?)
	 */
	protected void sequence_Reference(EObject context, Reference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (adds+=[Feature|QUALIFIED_NAME] adds+=[Feature|QUALIFIED_NAME]*)
	 */
	protected void sequence_adds(EObject context, adds semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     type=[Entity|ID]
	 */
	protected void sequence_method(EObject context, method semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TitanPackage.Literals.METHOD__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TitanPackage.Literals.METHOD__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMethodAccess().getTypeEntityIDTerminalRuleCall_0_1(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (takes+=ParameterFeature takes+=ParameterFeature* adds+=adds?)
	 */
	protected void sequence_takes(EObject context, takes semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
