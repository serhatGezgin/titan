/**
 */
package org.yazgel.oop;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi OData Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.yazgel.oop.MultiODataType#isUniqueInstance <em>Unique Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.yazgel.oop.OopPackage#getMultiODataType()
 * @model
 * @generated
 */
public interface MultiODataType extends ODataType {
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
	 * @see org.yazgel.oop.OopPackage#getMultiODataType_UniqueInstance()
	 * @model
	 * @generated
	 */
	boolean isUniqueInstance();

	/**
	 * Sets the value of the '{@link org.yazgel.oop.MultiODataType#isUniqueInstance <em>Unique Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique Instance</em>' attribute.
	 * @see #isUniqueInstance()
	 * @generated
	 */
	void setUniqueInstance(boolean value);

} // MultiODataType