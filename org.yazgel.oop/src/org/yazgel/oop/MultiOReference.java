/**
 */
package org.yazgel.oop;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi OReference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.yazgel.oop.MultiOReference#isUniqueInstance <em>Unique Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.yazgel.oop.OopPackage#getMultiOReference()
 * @model
 * @generated
 */
public interface MultiOReference extends OReference {
	/**
	 * Returns the value of the '<em><b>Unique Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unique Instance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique Instance</em>' attribute.
	 * @see #setUniqueInstance(boolean)
	 * @see org.yazgel.oop.OopPackage#getMultiOReference_UniqueInstance()
	 * @model
	 * @generated
	 */
	boolean isUniqueInstance();

	/**
	 * Sets the value of the '{@link org.yazgel.oop.MultiOReference#isUniqueInstance <em>Unique Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique Instance</em>' attribute.
	 * @see #isUniqueInstance()
	 * @generated
	 */
	void setUniqueInstance(boolean value);

} // MultiOReference
