/**
 */
package org.yazgel.titan.xtext.titan;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.yazgel.titan.xtext.titan.Package#getName <em>Name</em>}</li>
 *   <li>{@link org.yazgel.titan.xtext.titan.Package#getEntities <em>Entities</em>}</li>
 *   <li>{@link org.yazgel.titan.xtext.titan.Package#getEntityBuilders <em>Entity Builders</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.yazgel.titan.xtext.titan.TitanPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends EObject
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
   * @see org.yazgel.titan.xtext.titan.TitanPackage#getPackage_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.yazgel.titan.xtext.titan.Package#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
   * The list contents are of type {@link org.yazgel.titan.xtext.titan.Entity}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entities</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entities</em>' containment reference list.
   * @see org.yazgel.titan.xtext.titan.TitanPackage#getPackage_Entities()
   * @model containment="true"
   * @generated
   */
  EList<Entity> getEntities();

  /**
   * Returns the value of the '<em><b>Entity Builders</b></em>' containment reference list.
   * The list contents are of type {@link org.yazgel.titan.xtext.titan.EntityBuilder}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entity Builders</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entity Builders</em>' containment reference list.
   * @see org.yazgel.titan.xtext.titan.TitanPackage#getPackage_EntityBuilders()
   * @model containment="true"
   * @generated
   */
  EList<EntityBuilder> getEntityBuilders();

} // Package
