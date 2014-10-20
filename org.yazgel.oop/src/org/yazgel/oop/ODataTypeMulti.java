/**
 */
package org.yazgel.oop;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OData Type Multi</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.yazgel.oop.ODataTypeMulti#getMultiType <em>Multi Type</em>}</li>
 *   <li>{@link org.yazgel.oop.ODataTypeMulti#isUniqueInstance <em>Unique Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.yazgel.oop.OopPackage#getODataTypeMulti()
 * @model
 * @generated
 */
public interface ODataTypeMulti extends ODataType {
	/**
	 * Returns the value of the '<em><b>Multi Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.yazgel.oop.MultiOFeatureTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multi Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Type</em>' attribute.
	 * @see org.yazgel.oop.MultiOFeatureTypes
	 * @see #setMultiType(MultiOFeatureTypes)
	 * @see org.yazgel.oop.OopPackage#getODataTypeMulti_MultiType()
	 * @model
	 * @generated
	 */
	MultiOFeatureTypes getMultiType();

	/**
	 * Sets the value of the '{@link org.yazgel.oop.ODataTypeMulti#getMultiType <em>Multi Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Type</em>' attribute.
	 * @see org.yazgel.oop.MultiOFeatureTypes
	 * @see #getMultiType()
	 * @generated
	 */
	void setMultiType(MultiOFeatureTypes value);

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
	 * @see org.yazgel.oop.OopPackage#getODataTypeMulti_UniqueInstance()
	 * @model
	 * @generated
	 */
	boolean isUniqueInstance();

	/**
	 * Sets the value of the '{@link org.yazgel.oop.ODataTypeMulti#isUniqueInstance <em>Unique Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique Instance</em>' attribute.
	 * @see #isUniqueInstance()
	 * @generated
	 */
	void setUniqueInstance(boolean value);

} // ODataTypeMulti
