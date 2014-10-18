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
	 * Returns a new object of class '<em>OFeature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OFeature</em>'.
	 * @generated
	 */
	OFeature createOFeature();

	/**
	 * Returns a new object of class '<em>OReference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OReference</em>'.
	 * @generated
	 */
	OReference createOReference();

	/**
	 * Returns a new object of class '<em>OData Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OData Type</em>'.
	 * @generated
	 */
	ODataType createODataType();

	/**
	 * Returns a new object of class '<em>OMethod</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OMethod</em>'.
	 * @generated
	 */
	OMethod createOMethod();

	/**
	 * Returns a new object of class '<em>OConstructor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OConstructor</em>'.
	 * @generated
	 */
	OConstructor createOConstructor();

	/**
	 * Returns a new object of class '<em>OParameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OParameter</em>'.
	 * @generated
	 */
	OParameter createOParameter();

	/**
	 * Returns a new object of class '<em>OLoop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OLoop</em>'.
	 * @generated
	 */
	OLoop createOLoop();

	/**
	 * Returns a new object of class '<em>OFor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OFor</em>'.
	 * @generated
	 */
	OFor createOFor();

	/**
	 * Returns a new object of class '<em>OStatement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OStatement</em>'.
	 * @generated
	 */
	OStatement createOStatement();

	/**
	 * Returns a new object of class '<em>OReturn Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OReturn Statement</em>'.
	 * @generated
	 */
	OReturnStatement createOReturnStatement();

	/**
	 * Returns a new object of class '<em>OVarriable Create Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OVarriable Create Statement</em>'.
	 * @generated
	 */
	OVarriableCreateStatement createOVarriableCreateStatement();

	/**
	 * Returns a new object of class '<em>OMethod Call Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OMethod Call Statement</em>'.
	 * @generated
	 */
	OMethodCallStatement createOMethodCallStatement();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OopPackage getOopPackage();

} //OopFactory
