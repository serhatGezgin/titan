/**
 */
package org.yazgel.titan.xtext.titan;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Builder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.yazgel.titan.xtext.titan.EntityBuilder#getName <em>Name</em>}</li>
 *   <li>{@link org.yazgel.titan.xtext.titan.EntityBuilder#getTakes <em>Takes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.yazgel.titan.xtext.titan.TitanPackage#getEntityBuilder()
 * @model
 * @generated
 */
public interface EntityBuilder extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' reference.
   * @see #setName(Entity)
   * @see org.yazgel.titan.xtext.titan.TitanPackage#getEntityBuilder_Name()
   * @model
   * @generated
   */
  Entity getName();

  /**
   * Sets the value of the '{@link org.yazgel.titan.xtext.titan.EntityBuilder#getName <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' reference.
   * @see #getName()
   * @generated
   */
  void setName(Entity value);

  /**
   * Returns the value of the '<em><b>Takes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Takes</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Takes</em>' containment reference.
   * @see #setTakes(takes)
   * @see org.yazgel.titan.xtext.titan.TitanPackage#getEntityBuilder_Takes()
   * @model containment="true"
   * @generated
   */
  takes getTakes();

  /**
   * Sets the value of the '{@link org.yazgel.titan.xtext.titan.EntityBuilder#getTakes <em>Takes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Takes</em>' containment reference.
   * @see #getTakes()
   * @generated
   */
  void setTakes(takes value);

} // EntityBuilder
