/**
 */
package org.yazgel.titan.xtext.titan;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>takes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.yazgel.titan.xtext.titan.takes#getTakes <em>Takes</em>}</li>
 *   <li>{@link org.yazgel.titan.xtext.titan.takes#getAdds <em>Adds</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.yazgel.titan.xtext.titan.TitanPackage#gettakes()
 * @model
 * @generated
 */
public interface takes extends EObject
{
  /**
   * Returns the value of the '<em><b>Takes</b></em>' containment reference list.
   * The list contents are of type {@link org.yazgel.titan.xtext.titan.ParameterFeature}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Takes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Takes</em>' containment reference list.
   * @see org.yazgel.titan.xtext.titan.TitanPackage#gettakes_Takes()
   * @model containment="true"
   * @generated
   */
  EList<ParameterFeature> getTakes();

  /**
   * Returns the value of the '<em><b>Adds</b></em>' containment reference list.
   * The list contents are of type {@link org.yazgel.titan.xtext.titan.adds}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Adds</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Adds</em>' containment reference list.
   * @see org.yazgel.titan.xtext.titan.TitanPackage#gettakes_Adds()
   * @model containment="true"
   * @generated
   */
  EList<adds> getAdds();

} // takes
