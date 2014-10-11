/**
 */
package org.yazgel.titan.xtext.titan;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.yazgel.titan.xtext.titan.Module#getName <em>Name</em>}</li>
 *   <li>{@link org.yazgel.titan.xtext.titan.Module#getType <em>Type</em>}</li>
 *   <li>{@link org.yazgel.titan.xtext.titan.Module#getPackages <em>Packages</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.yazgel.titan.xtext.titan.TitanPackage#getModule()
 * @model
 * @generated
 */
public interface Module extends EObject
{
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
   * @see org.yazgel.titan.xtext.titan.TitanPackage#getModule_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.yazgel.titan.xtext.titan.Module#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link org.yazgel.titan.xtext.titan.InternalDSLType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see org.yazgel.titan.xtext.titan.InternalDSLType
   * @see #setType(InternalDSLType)
   * @see org.yazgel.titan.xtext.titan.TitanPackage#getModule_Type()
   * @model
   * @generated
   */
  InternalDSLType getType();

  /**
   * Sets the value of the '{@link org.yazgel.titan.xtext.titan.Module#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see org.yazgel.titan.xtext.titan.InternalDSLType
   * @see #getType()
   * @generated
   */
  void setType(InternalDSLType value);

  /**
   * Returns the value of the '<em><b>Packages</b></em>' containment reference list.
   * The list contents are of type {@link org.yazgel.titan.xtext.titan.Package}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Packages</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Packages</em>' containment reference list.
   * @see org.yazgel.titan.xtext.titan.TitanPackage#getModule_Packages()
   * @model containment="true"
   * @generated
   */
  EList<org.yazgel.titan.xtext.titan.Package> getPackages();

} // Module
