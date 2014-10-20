/**
 */
package org.yazgel.oop;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OClass Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.yazgel.oop.OClassImport#getImportsFromDomain <em>Imports From Domain</em>}</li>
 *   <li>{@link org.yazgel.oop.OClassImport#getImports <em>Imports</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.yazgel.oop.OopPackage#getOClassImport()
 * @model
 * @generated
 */
public interface OClassImport extends EObject {
	/**
	 * Returns the value of the '<em><b>Imports From Domain</b></em>' reference list.
	 * The list contents are of type {@link org.yazgel.oop.OClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports From Domain</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports From Domain</em>' reference list.
	 * @see org.yazgel.oop.OopPackage#getOClassImport_ImportsFromDomain()
	 * @model
	 * @generated
	 */
	EList<OClass> getImportsFromDomain();

	/**
	 * Returns the value of the '<em><b>Imports</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' attribute list.
	 * @see org.yazgel.oop.OopPackage#getOClassImport_Imports()
	 * @model
	 * @generated
	 */
	EList<String> getImports();

} // OClassImport
