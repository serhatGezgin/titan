/**
 */
package org.yazgel.titan.xtext.titan;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.yazgel.titan.xtext.titan.ParameterDataType#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.yazgel.titan.xtext.titan.TitanPackage#getParameterDataType()
 * @model
 * @generated
 */
public interface ParameterDataType extends ParameterFeature
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
   * @see org.yazgel.titan.xtext.titan.TitanPackage#getParameterDataType_Type()
   * @model
   * @generated
   */
  DataTypes getType();

  /**
   * Sets the value of the '{@link org.yazgel.titan.xtext.titan.ParameterDataType#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see org.yazgel.titan.xtext.titan.DataTypes
   * @see #getType()
   * @generated
   */
  void setType(DataTypes value);

} // ParameterDataType
