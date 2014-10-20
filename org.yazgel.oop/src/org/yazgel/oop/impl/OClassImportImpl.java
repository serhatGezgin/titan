/**
 */
package org.yazgel.oop.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.yazgel.oop.OClass;
import org.yazgel.oop.OClassImport;
import org.yazgel.oop.OopPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OClass Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.yazgel.oop.impl.OClassImportImpl#getImportsFromDomain <em>Imports From Domain</em>}</li>
 *   <li>{@link org.yazgel.oop.impl.OClassImportImpl#getImports <em>Imports</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OClassImportImpl extends MinimalEObjectImpl.Container implements OClassImport {
	/**
	 * The cached value of the '{@link #getImportsFromDomain() <em>Imports From Domain</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportsFromDomain()
	 * @generated
	 * @ordered
	 */
	protected EList<OClass> importsFromDomain;

	/**
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected EList<String> imports;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OClassImportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OopPackage.Literals.OCLASS_IMPORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OClass> getImportsFromDomain() {
		if (importsFromDomain == null) {
			importsFromDomain = new EObjectResolvingEList<OClass>(OClass.class, this, OopPackage.OCLASS_IMPORT__IMPORTS_FROM_DOMAIN);
		}
		return importsFromDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getImports() {
		if (imports == null) {
			imports = new EDataTypeUniqueEList<String>(String.class, this, OopPackage.OCLASS_IMPORT__IMPORTS);
		}
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OopPackage.OCLASS_IMPORT__IMPORTS_FROM_DOMAIN:
				return getImportsFromDomain();
			case OopPackage.OCLASS_IMPORT__IMPORTS:
				return getImports();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OopPackage.OCLASS_IMPORT__IMPORTS_FROM_DOMAIN:
				getImportsFromDomain().clear();
				getImportsFromDomain().addAll((Collection<? extends OClass>)newValue);
				return;
			case OopPackage.OCLASS_IMPORT__IMPORTS:
				getImports().clear();
				getImports().addAll((Collection<? extends String>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OopPackage.OCLASS_IMPORT__IMPORTS_FROM_DOMAIN:
				getImportsFromDomain().clear();
				return;
			case OopPackage.OCLASS_IMPORT__IMPORTS:
				getImports().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OopPackage.OCLASS_IMPORT__IMPORTS_FROM_DOMAIN:
				return importsFromDomain != null && !importsFromDomain.isEmpty();
			case OopPackage.OCLASS_IMPORT__IMPORTS:
				return imports != null && !imports.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (imports: ");
		result.append(imports);
		result.append(')');
		return result.toString();
	}

} //OClassImportImpl
