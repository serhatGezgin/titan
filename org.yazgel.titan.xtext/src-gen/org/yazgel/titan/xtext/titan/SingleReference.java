/**
 */
package org.yazgel.titan.xtext.titan;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.yazgel.titan.xtext.titan.SingleReference#getOpposite <em>Opposite</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.yazgel.titan.xtext.titan.TitanPackage#getSingleReference()
 * @model
 * @generated
 */
public interface SingleReference extends Reference
{
  /**
   * Returns the value of the '<em><b>Opposite</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Opposite</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Opposite</em>' reference.
   * @see #setOpposite(MultiReference)
   * @see org.yazgel.titan.xtext.titan.TitanPackage#getSingleReference_Opposite()
   * @model
   * @generated
   */
  MultiReference getOpposite();

  /**
   * Sets the value of the '{@link org.yazgel.titan.xtext.titan.SingleReference#getOpposite <em>Opposite</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Opposite</em>' reference.
   * @see #getOpposite()
   * @generated
   */
  void setOpposite(MultiReference value);

} // SingleReference
