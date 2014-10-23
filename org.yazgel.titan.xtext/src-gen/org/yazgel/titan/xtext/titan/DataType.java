/**
 */
package org.yazgel.titan.xtext.titan;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.yazgel.titan.xtext.titan.DataType#getType <em>Type</em>}</li>
 *   <li>{@link org.yazgel.titan.xtext.titan.DataType#getOpposite <em>Opposite</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.yazgel.titan.xtext.titan.TitanPackage#getDataType()
 * @model
 * @generated
 */
public interface DataType extends Feature
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link org.yazgel.titan.xtext.titan.DataTypes}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see org.yazgel.titan.xtext.titan.DataTypes
   * @see #setType(DataTypes)
   * @see org.yazgel.titan.xtext.titan.TitanPackage#getDataType_Type()
   * @model
   * @generated
   */
  DataTypes getType();

  /**
   * Sets the value of the '{@link org.yazgel.titan.xtext.titan.DataType#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see org.yazgel.titan.xtext.titan.DataTypes
   * @see #getType()
   * @generated
   */
  void setType(DataTypes value);

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
   * @see org.yazgel.titan.xtext.titan.TitanPackage#getDataType_Opposite()
   * @model
   * @generated
   */
  MultiDataType getOpposite();

  /**
   * Sets the value of the '{@link org.yazgel.titan.xtext.titan.DataType#getOpposite <em>Opposite</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Opposite</em>' reference.
   * @see #getOpposite()
   * @generated
   */
  void setOpposite(MultiDataType value);

} // DataType
