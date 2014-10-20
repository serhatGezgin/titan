/**
 */
package org.yazgel.oop;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OData Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.yazgel.oop.ODataType#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.yazgel.oop.OopPackage#getODataType()
 * @model abstract="true"
 * @generated
 */
public interface ODataType extends OFeature {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.yazgel.oop.ODataTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.yazgel.oop.ODataTypes
	 * @see #setType(ODataTypes)
	 * @see org.yazgel.oop.OopPackage#getODataType_Type()
	 * @model
	 * @generated
	 */
	ODataTypes getType();

	/**
	 * Sets the value of the '{@link org.yazgel.oop.ODataType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.yazgel.oop.ODataTypes
	 * @see #getType()
	 * @generated
	 */
	void setType(ODataTypes value);

} // ODataType
