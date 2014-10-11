/**
 */
package org.yazgel.titan.xtext.titan;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.yazgel.titan.xtext.titan.Reference#getReference <em>Reference</em>}</li>
 *   <li>{@link org.yazgel.titan.xtext.titan.Reference#getOpposite <em>Opposite</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.yazgel.titan.xtext.titan.TitanPackage#getReference()
 * @model
 * @generated
 */
public interface Reference extends Feature
{
  /**
   * Returns the value of the '<em><b>Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reference</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reference</em>' reference.
   * @see #setReference(Entity)
   * @see org.yazgel.titan.xtext.titan.TitanPackage#getReference_Reference()
   * @model
   * @generated
   */
  Entity getReference();

  /**
   * Sets the value of the '{@link org.yazgel.titan.xtext.titan.Reference#getReference <em>Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reference</em>' reference.
   * @see #getReference()
   * @generated
   */
  void setReference(Entity value);

  /**
   * Returns the value of the '<em><b>Opposite</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Opposite</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Opposite</em>' reference.
   * @see #setOpposite(Reference)
   * @see org.yazgel.titan.xtext.titan.TitanPackage#getReference_Opposite()
   * @model
   * @generated
   */
  Reference getOpposite();

  /**
   * Sets the value of the '{@link org.yazgel.titan.xtext.titan.Reference#getOpposite <em>Opposite</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Opposite</em>' reference.
   * @see #getOpposite()
   * @generated
   */
  void setOpposite(Reference value);

} // Reference
