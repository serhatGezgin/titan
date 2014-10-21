/**
 */
package org.yazgel.oop;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.yazgel.oop.OopPackage
 * @generated
 */
public interface OopFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OopFactory eINSTANCE = org.yazgel.oop.impl.OopFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>OModel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OModel</em>'.
	 * @generated
	 */
	OModel createOModel();

	/**
	 * Returns a new object of class '<em>OPackage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OPackage</em>'.
	 * @generated
	 */
	OPackage createOPackage();

	/**
	 * Returns a new object of class '<em>OClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OClass</em>'.
	 * @generated
	 */
	OClass createOClass();

	/**
	 * Returns a new object of class '<em>OReference Multi</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OReference Multi</em>'.
	 * @generated
	 */
	OReferenceMulti createOReferenceMulti();

	/**
	 * Returns a new object of class '<em>OReference Single</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OReference Single</em>'.
	 * @generated
	 */
	OReferenceSingle createOReferenceSingle();

	/**
	 * Returns a new object of class '<em>OData Type Single</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OData Type Single</em>'.
	 * @generated
	 */
	ODataTypeSingle createODataTypeSingle();

	/**
	 * Returns a new object of class '<em>OData Type Multi</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OData Type Multi</em>'.
	 * @generated
	 */
	ODataTypeMulti createODataTypeMulti();

	/**
	 * Returns a new object of class '<em>OMethod</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OMethod</em>'.
	 * @generated
	 */
	OMethod createOMethod();

	/**
	 * Returns a new object of class '<em>OParameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OParameter</em>'.
	 * @generated
	 */
	OParameter createOParameter();

	/**
	 * Returns a new object of class '<em>OStatement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OStatement</em>'.
	 * @generated
	 */
	OStatement createOStatement();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OopPackage getOopPackage();

} //OopFactory
