/**
 */
package org.yazgel.oop.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.yazgel.oop.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.yazgel.oop.OopPackage
 * @generated
 */
public class OopAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OopPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OopAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = OopPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OopSwitch<Adapter> modelSwitch =
		new OopSwitch<Adapter>() {
			@Override
			public Adapter caseOModel(OModel object) {
				return createOModelAdapter();
			}
			@Override
			public Adapter caseOPackage(OPackage object) {
				return createOPackageAdapter();
			}
			@Override
			public Adapter caseOClass(OClass object) {
				return createOClassAdapter();
			}
			@Override
			public Adapter caseOFeature(OFeature object) {
				return createOFeatureAdapter();
			}
			@Override
			public Adapter caseOReference(OReference object) {
				return createOReferenceAdapter();
			}
			@Override
			public Adapter caseOReferenceMulti(OReferenceMulti object) {
				return createOReferenceMultiAdapter();
			}
			@Override
			public Adapter caseOReferenceSingle(OReferenceSingle object) {
				return createOReferenceSingleAdapter();
			}
			@Override
			public Adapter caseODataType(ODataType object) {
				return createODataTypeAdapter();
			}
			@Override
			public Adapter caseODataTypeSingle(ODataTypeSingle object) {
				return createODataTypeSingleAdapter();
			}
			@Override
			public Adapter caseODataTypeMulti(ODataTypeMulti object) {
				return createODataTypeMultiAdapter();
			}
			@Override
			public Adapter caseOMethod(OMethod object) {
				return createOMethodAdapter();
			}
			@Override
			public Adapter caseOParameter(OParameter object) {
				return createOParameterAdapter();
			}
			@Override
			public Adapter caseOStatement(OStatement object) {
				return createOStatementAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.yazgel.oop.OModel <em>OModel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.yazgel.oop.OModel
	 * @generated
	 */
	public Adapter createOModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.yazgel.oop.OPackage <em>OPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.yazgel.oop.OPackage
	 * @generated
	 */
	public Adapter createOPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.yazgel.oop.OClass <em>OClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.yazgel.oop.OClass
	 * @generated
	 */
	public Adapter createOClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.yazgel.oop.OFeature <em>OFeature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.yazgel.oop.OFeature
	 * @generated
	 */
	public Adapter createOFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.yazgel.oop.OReference <em>OReference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.yazgel.oop.OReference
	 * @generated
	 */
	public Adapter createOReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.yazgel.oop.OReferenceMulti <em>OReference Multi</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.yazgel.oop.OReferenceMulti
	 * @generated
	 */
	public Adapter createOReferenceMultiAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.yazgel.oop.OReferenceSingle <em>OReference Single</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.yazgel.oop.OReferenceSingle
	 * @generated
	 */
	public Adapter createOReferenceSingleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.yazgel.oop.ODataType <em>OData Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.yazgel.oop.ODataType
	 * @generated
	 */
	public Adapter createODataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.yazgel.oop.ODataTypeSingle <em>OData Type Single</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.yazgel.oop.ODataTypeSingle
	 * @generated
	 */
	public Adapter createODataTypeSingleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.yazgel.oop.ODataTypeMulti <em>OData Type Multi</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.yazgel.oop.ODataTypeMulti
	 * @generated
	 */
	public Adapter createODataTypeMultiAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.yazgel.oop.OMethod <em>OMethod</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.yazgel.oop.OMethod
	 * @generated
	 */
	public Adapter createOMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.yazgel.oop.OParameter <em>OParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.yazgel.oop.OParameter
	 * @generated
	 */
	public Adapter createOParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.yazgel.oop.OStatement <em>OStatement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.yazgel.oop.OStatement
	 * @generated
	 */
	public Adapter createOStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //OopAdapterFactory
