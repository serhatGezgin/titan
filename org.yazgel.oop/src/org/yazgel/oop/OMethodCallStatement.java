/**
 */
package org.yazgel.oop;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OMethod Call Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.yazgel.oop.OMethodCallStatement#getVarriable <em>Varriable</em>}</li>
 *   <li>{@link org.yazgel.oop.OMethodCallStatement#getCalledMethod <em>Called Method</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.yazgel.oop.OopPackage#getOMethodCallStatement()
 * @model
 * @generated
 */
public interface OMethodCallStatement extends OStatement {
	/**
	 * Returns the value of the '<em><b>Varriable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Varriable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Varriable</em>' reference.
	 * @see #setVarriable(OVarriableCreateStatement)
	 * @see org.yazgel.oop.OopPackage#getOMethodCallStatement_Varriable()
	 * @model
	 * @generated
	 */
	OVarriableCreateStatement getVarriable();

	/**
	 * Sets the value of the '{@link org.yazgel.oop.OMethodCallStatement#getVarriable <em>Varriable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Varriable</em>' reference.
	 * @see #getVarriable()
	 * @generated
	 */
	void setVarriable(OVarriableCreateStatement value);

	/**
	 * Returns the value of the '<em><b>Called Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Called Method</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Called Method</em>' reference.
	 * @see #setCalledMethod(OMethod)
	 * @see org.yazgel.oop.OopPackage#getOMethodCallStatement_CalledMethod()
	 * @model
	 * @generated
	 */
	OMethod getCalledMethod();

	/**
	 * Sets the value of the '{@link org.yazgel.oop.OMethodCallStatement#getCalledMethod <em>Called Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Called Method</em>' reference.
	 * @see #getCalledMethod()
	 * @generated
	 */
	void setCalledMethod(OMethod value);

} // OMethodCallStatement
