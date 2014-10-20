/**
 */
package org.yazgel.oop;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OMethod</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.yazgel.oop.OMethod#getName <em>Name</em>}</li>
 *   <li>{@link org.yazgel.oop.OMethod#isIsConst <em>Is Const</em>}</li>
 *   <li>{@link org.yazgel.oop.OMethod#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link org.yazgel.oop.OMethod#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.yazgel.oop.OMethod#getStatements <em>Statements</em>}</li>
 *   <li>{@link org.yazgel.oop.OMethod#isIsOverride <em>Is Override</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.yazgel.oop.OopPackage#getOMethod()
 * @model
 * @generated
 */
public interface OMethod extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.yazgel.oop.OopPackage#getOMethod_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.yazgel.oop.OMethod#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Is Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Const</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Const</em>' attribute.
	 * @see #setIsConst(boolean)
	 * @see org.yazgel.oop.OopPackage#getOMethod_IsConst()
	 * @model
	 * @generated
	 */
	boolean isIsConst();

	/**
	 * Sets the value of the '{@link org.yazgel.oop.OMethod#isIsConst <em>Is Const</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Const</em>' attribute.
	 * @see #isIsConst()
	 * @generated
	 */
	void setIsConst(boolean value);

	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' attribute.
	 * @see #setReturnType(String)
	 * @see org.yazgel.oop.OopPackage#getOMethod_ReturnType()
	 * @model
	 * @generated
	 */
	String getReturnType();

	/**
	 * Sets the value of the '{@link org.yazgel.oop.OMethod#getReturnType <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' attribute.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(String value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.yazgel.oop.OParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.yazgel.oop.OopPackage#getOMethod_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<OParameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
	 * The list contents are of type {@link org.yazgel.oop.OStatement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statements</em>' containment reference list.
	 * @see org.yazgel.oop.OopPackage#getOMethod_Statements()
	 * @model containment="true"
	 * @generated
	 */
	EList<OStatement> getStatements();

	/**
	 * Returns the value of the '<em><b>Is Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Override</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Override</em>' attribute.
	 * @see #setIsOverride(boolean)
	 * @see org.yazgel.oop.OopPackage#getOMethod_IsOverride()
	 * @model
	 * @generated
	 */
	boolean isIsOverride();

	/**
	 * Sets the value of the '{@link org.yazgel.oop.OMethod#isIsOverride <em>Is Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Override</em>' attribute.
	 * @see #isIsOverride()
	 * @generated
	 */
	void setIsOverride(boolean value);

} // OMethod