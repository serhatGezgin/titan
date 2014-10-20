/**
 */
package org.yazgel.oop;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OClass Implement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.yazgel.oop.OClassImplement#getImplementsString <em>Implements String</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.yazgel.oop.OopPackage#getOClassImplement()
 * @model
 * @generated
 */
public interface OClassImplement extends EObject {
	/**
	 * Returns the value of the '<em><b>Implements String</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implements String</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implements String</em>' attribute list.
	 * @see org.yazgel.oop.OopPackage#getOClassImplement_ImplementsString()
	 * @model
	 * @generated
	 */
	EList<String> getImplementsString();

} // OClassImplement
