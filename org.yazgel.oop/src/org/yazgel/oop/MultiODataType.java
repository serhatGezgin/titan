/**
 */
package org.yazgel.oop;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi OData Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.yazgel.oop.MultiODataType#isUniqueInstance <em>Unique Instance</em>}</li>
 *   <li>{@link org.yazgel.oop.MultiODataType#getOpposites <em>Opposites</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Opposites</b></em>' reference list.
	 * The list contents are of type {@link org.yazgel.oop.ODataType}.
	 * It is bidirectional and its opposite is '{@link org.yazgel.oop.ODataType#getOpposite <em>Opposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opposites</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opposites</em>' reference list.
	 * @see org.yazgel.oop.OopPackage#getMultiODataType_Opposites()
	 * @see org.yazgel.oop.ODataType#getOpposite
	 * @model opposite="opposite"
	 * @generated
	 */
	EList<ODataType> getOpposites();

} // MultiODataType
