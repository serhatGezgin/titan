/**
 */
package org.yazgel.oop;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OReturn Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.yazgel.oop.OReturnStatement#getReturnVarriable <em>Return Varriable</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.yazgel.oop.OopPackage#getOReturnStatement()
 * @model
 * @generated
 */
public interface OReturnStatement extends OStatement {
	/**
	 * Returns the value of the '<em><b>Return Varriable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Varriable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Varriable</em>' reference.
	 * @see #setReturnVarriable(OVarriableCreateStatement)
	 * @see org.yazgel.oop.OopPackage#getOReturnStatement_ReturnVarriable()
	 * @model
	 * @generated
	 */
	OVarriableCreateStatement getReturnVarriable();

	/**
	 * Sets the value of the '{@link org.yazgel.oop.OReturnStatement#getReturnVarriable <em>Return Varriable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Varriable</em>' reference.
	 * @see #getReturnVarriable()
	 * @generated
	 */
	void setReturnVarriable(OVarriableCreateStatement value);

} // OReturnStatement
