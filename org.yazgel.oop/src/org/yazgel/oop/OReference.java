/**
 */
package org.yazgel.oop;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OReference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.yazgel.oop.OReference#getReference <em>Reference</em>}</li>
 *   <li>{@link org.yazgel.oop.OReference#getOpposite <em>Opposite</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.yazgel.oop.OopPackage#getOReference()
 * @model abstract="true"
 * @generated
 */
public interface OReference extends OFeature {
	/**
	 * Returns the value of the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' reference.
	 * @see #setReference(OClass)
	 * @see org.yazgel.oop.OopPackage#getOReference_Reference()
	 * @model
	 * @generated
	 */
	OClass getReference();

	/**
	 * Sets the value of the '{@link org.yazgel.oop.OReference#getReference <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(OClass value);

	/**
	 * Returns the value of the '<em><b>Opposite</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.yazgel.oop.MultiOReference#getOpposites <em>Opposites</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opposite</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opposite</em>' reference.
	 * @see #setOpposite(MultiOReference)
	 * @see org.yazgel.oop.OopPackage#getOReference_Opposite()
	 * @see org.yazgel.oop.MultiOReference#getOpposites
	 * @model opposite="opposites"
	 * @generated
	 */
	MultiOReference getOpposite();

	/**
	 * Sets the value of the '{@link org.yazgel.oop.OReference#getOpposite <em>Opposite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opposite</em>' reference.
	 * @see #getOpposite()
	 * @generated
	 */
	void setOpposite(MultiOReference value);

} // OReference
