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
import org.yazgel.titan.xtext.titan.Entity;
import org.yazgel.titan.xtext.titan.Module;
import org.yazgel.titan.xtext.titan.MultiDataType;
import org.yazgel.titan.xtext.titan.MultiReference;
import org.yazgel.titan.xtext.titan.SingleDataType;
import org.yazgel.titan.xtext.titan.SingleReference;
import org.yazgel.titan.xtext.titan.TitanPackage;

@SuppressWarnings("all")
public class TitanSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private TitanGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == TitanPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case TitanPackage.ENTITY:
				if(context == grammarAccess.getEntityRule()) {
					sequence_Entity(context, (Entity) semanticObject); 
					return; 
				}
				else break;
			case TitanPackage.MODULE:
				if(context == grammarAccess.getModuleRule()) {
					sequence_Module(context, (Module) semanticObject); 
					return; 
				}
				else break;
			case TitanPackage.MULTI_DATA_TYPE:
				if(context == grammarAccess.getDataTypeRule() ||
				   context == grammarAccess.getFeatureRule() ||
				   context == grammarAccess.getMultiDataTypeRule()) {
					sequence_MultiDataType(context, (MultiDataType) semanticObject); 
					return; 
				}
				else break;
			case TitanPackage.MULTI_REFERENCE:
				if(context == grammarAccess.getFeatureRule() ||
				   context == grammarAccess.getMultiReferenceRule() ||
				   context == grammarAccess.getReferenceRule()) {
					sequence_MultiReference(context, (MultiReference) semanticObject); 
					return; 
				}
				else break;
			case TitanPackage.PACKAGE:
				if(context == grammarAccess.getPackageRule()) {
					sequence_Package(context, (org.yazgel.titan.xtext.titan.Package) semanticObject); 
					return; 
				}
				else break;
			case TitanPackage.SINGLE_DATA_TYPE:
				if(context == grammarAccess.getDataTypeRule() ||
				   context == grammarAccess.getFeatureRule() ||
				   context == grammarAccess.getSingleDataTypeRule()) {
					sequence_SingleDataType(context, (SingleDataType) semanticObject); 
					return; 
				}
				else break;
			case TitanPackage.SINGLE_REFERENCE:
				if(context == grammarAccess.getFeatureRule() ||
				   context == grammarAccess.getReferenceRule() ||
				   context == grammarAccess.getSingleReferenceRule()) {
					sequence_SingleReference(context, (SingleReference) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
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
	 *     (name=ID type=DataTypes unique?='unique'?)
	 */
	protected void sequence_MultiDataType(EObject context, MultiDataType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID reference=[Entity|ID] unique?='unique'? opposite=[Reference|QUALIFIED_NAME]?)
	 */
	protected void sequence_MultiReference(EObject context, MultiReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=QUALIFIED_NAME (entities+=Entity entities+=Entity*)?)
	 */
	protected void sequence_Package(EObject context, org.yazgel.titan.xtext.titan.Package semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=DataTypes)
	 */
	protected void sequence_SingleDataType(EObject context, SingleDataType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TitanPackage.Literals.FEATURE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TitanPackage.Literals.FEATURE__NAME));
			if(transientValues.isValueTransient(semanticObject, TitanPackage.Literals.DATA_TYPE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TitanPackage.Literals.DATA_TYPE__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSingleDataTypeAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getSingleDataTypeAccess().getTypeDataTypesEnumRuleCall_3_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID reference=[Entity|ID] unique?='unique'? opposite=[Reference|QUALIFIED_NAME]?)
	 */
	protected void sequence_SingleReference(EObject context, SingleReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
