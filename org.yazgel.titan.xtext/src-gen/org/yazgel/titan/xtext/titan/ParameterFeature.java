/**
 */
package org.yazgel.titan.xtext.titan;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.yazgel.titan.xtext.titan.ParameterFeature#isMany <em>Many</em>}</li>
 *   <li>{@link org.yazgel.titan.xtext.titan.ParameterFeature#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.yazgel.titan.xtext.titan.TitanPackage#getParameterFeature()
 * @model
 * @generated
 */
public interface ParameterFeature extends EObject
{
  /**
   * Returns the value of the '<em><b>Many</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Many</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Many</em>' attribute.
   * @see #setMany(boolean)
   * @see org.yazgel.titan.xtext.titan.TitanPackage#getParameterFeature_Many()
   * @model
   * @generated
   */
  boolean isMany();

  /**
   * Sets the value of the '{@link org.yazgel.titan.xtext.titan.ParameterFeature#isMany <em>Many</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Many</em>' attribute.
   * @see #isMany()
   * @generated
   */
  void setMany(boolean value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.yazgel.titan.xtext.titan.TitanPackage#getParameterFeature_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.yazgel.titan.xtext.titan.ParameterFeature#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // ParameterFeature
