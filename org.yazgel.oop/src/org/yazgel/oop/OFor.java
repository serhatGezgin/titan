/**
 */
package org.yazgel.oop;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OFor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.yazgel.oop.OFor#getObjectName <em>Object Name</em>}</li>
 *   <li>{@link org.yazgel.oop.OFor#getListVarriable <em>List Varriable</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.yazgel.oop.OopPackage#getOFor()
 * @model
 * @generated
 */
public interface OFor extends OLoop {
	/**
	 * Returns the value of the '<em><b>Object Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Name</em>' attribute.
	 * @see #setObjectName(String)
	 * @see org.yazgel.oop.OopPackage#getOFor_ObjectName()
	 * @model
	 * @generated
	 */
	String getObjectName();

	/**
	 * Sets the value of the '{@link org.yazgel.oop.OFor#getObjectName <em>Object Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Name</em>' attribute.
	 * @see #getObjectName()
	 * @generated
	 */
	void setObjectName(String value);

	/**
	 * Returns the value of the '<em><b>List Varriable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Varriable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Varriable</em>' reference.
	 * @see #setListVarriable(OVarriableCreateStatement)
	 * @see org.yazgel.oop.OopPackage#getOFor_ListVarriable()
	 * @model
	 * @generated
	 */
	OVarriableCreateStatement getListVarriable();

	/**
	 * Sets the value of the '{@link org.yazgel.oop.OFor#getListVarriable <em>List Varriable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Varriable</em>' reference.
	 * @see #getListVarriable()
	 * @generated
	 */
	void setListVarriable(OVarriableCreateStatement value);

} // OFor
