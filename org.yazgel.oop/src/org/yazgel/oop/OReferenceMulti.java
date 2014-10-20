/**
 */
package org.yazgel.oop;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OReference Multi</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.yazgel.oop.OReferenceMulti#getMultiType <em>Multi Type</em>}</li>
 *   <li>{@link org.yazgel.oop.OReferenceMulti#isUniqueInstance <em>Unique Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.yazgel.oop.OopPackage#getOReferenceMulti()
 * @model
 * @generated
 */
public interface OReferenceMulti extends OReference {
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
	 * @see org.yazgel.oop.OopPackage#getOReferenceMulti_MultiType()
	 * @model
	 * @generated
	 */
	MultiOFeatureTypes getMultiType();

	/**
	 * Sets the value of the '{@link org.yazgel.oop.OReferenceMulti#getMultiType <em>Multi Type</em>}' attribute.
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
	 * @see org.yazgel.oop.OopPackage#getOReferenceMulti_UniqueInstance()
	 * @model
	 * @generated
	 */
	boolean isUniqueInstance();

	/**
	 * Sets the value of the '{@link org.yazgel.oop.OReferenceMulti#isUniqueInstance <em>Unique Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique Instance</em>' attribute.
	 * @see #isUniqueInstance()
	 * @generated
	 */
	void setUniqueInstance(boolean value);

} // OReferenceMulti
