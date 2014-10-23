/**
 */
package org.yazgel.titan.xtext.titan;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.yazgel.titan.xtext.titan.SingleDataType#getOpposite <em>Opposite</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.yazgel.titan.xtext.titan.TitanPackage#getSingleDataType()
 * @model
 * @generated
 */
public interface SingleDataType extends DataType
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
   * @see #setOpposite(MultiDataType)
   * @see org.yazgel.titan.xtext.titan.TitanPackage#getSingleDataType_Opposite()
   * @model
   * @generated
   */
  MultiDataType getOpposite();

  /**
   * Sets the value of the '{@link org.yazgel.titan.xtext.titan.SingleDataType#getOpposite <em>Opposite</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Opposite</em>' reference.
   * @see #getOpposite()
   * @generated
   */
  void setOpposite(MultiDataType value);

} // SingleDataType
