/**
 */
package org.yazgel.titan.xtext.titan;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>adds</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.yazgel.titan.xtext.titan.adds#getAdds <em>Adds</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.yazgel.titan.xtext.titan.TitanPackage#getadds()
 * @model
 * @generated
 */
public interface adds extends EObject
{
  /**
   * Returns the value of the '<em><b>Adds</b></em>' reference list.
   * The list contents are of type {@link org.yazgel.titan.xtext.titan.Feature}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Adds</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Adds</em>' reference list.
   * @see org.yazgel.titan.xtext.titan.TitanPackage#getadds_Adds()
   * @model
   * @generated
   */
  EList<Feature> getAdds();

} // adds
