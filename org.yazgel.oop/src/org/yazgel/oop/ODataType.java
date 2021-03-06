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
 *   <li>{@link org.yazgel.oop.ODataType#getOpposite <em>Opposite</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.yazgel.oop.OopPackage#getODataType()
 * @model abstract="true"
 * @generated
 */
public interface ODataType extends OFeature {
	/**
	 * Returns the value of the '<em><b>Opposite</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.yazgel.oop.MultiODataType#getOpposites <em>Opposites</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opposite</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opposite</em>' reference.
	 * @see #setOpposite(MultiODataType)
	 * @see org.yazgel.oop.OopPackage#getODataType_Opposite()
	 * @see org.yazgel.oop.MultiODataType#getOpposites
	 * @model opposite="opposites"
	 * @generated
	 */
	MultiODataType getOpposite();

	/**
	 * Sets the value of the '{@link org.yazgel.oop.ODataType#getOpposite <em>Opposite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opposite</em>' reference.
	 * @see #getOpposite()
	 * @generated
	 */
	void setOpposite(MultiODataType value);

} // ODataType
