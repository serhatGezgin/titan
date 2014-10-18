/**
 */
package org.yazgel.oop;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OVarriable Create Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.yazgel.oop.OVarriableCreateStatement#getName <em>Name</em>}</li>
 *   <li>{@link org.yazgel.oop.OVarriableCreateStatement#getCalledConstructor <em>Called Constructor</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.yazgel.oop.OopPackage#getOVarriableCreateStatement()
 * @model
 * @generated
 */
public interface OVarriableCreateStatement extends OStatement {
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
	 * @see org.yazgel.oop.OopPackage#getOVarriableCreateStatement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.yazgel.oop.OVarriableCreateStatement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Called Constructor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Called Constructor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Called Constructor</em>' reference.
	 * @see #setCalledConstructor(OConstructor)
	 * @see org.yazgel.oop.OopPackage#getOVarriableCreateStatement_CalledConstructor()
	 * @model
	 * @generated
	 */
	OConstructor getCalledConstructor();

	/**
	 * Sets the value of the '{@link org.yazgel.oop.OVarriableCreateStatement#getCalledConstructor <em>Called Constructor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Called Constructor</em>' reference.
	 * @see #getCalledConstructor()
	 * @generated
	 */
	void setCalledConstructor(OConstructor value);

} // OVarriableCreateStatement
