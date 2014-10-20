/**
 */
package org.yazgel.oop.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.yazgel.oop.OClassImplement;
import org.yazgel.oop.OopPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OClass Implement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.yazgel.oop.impl.OClassImplementImpl#getImplementsString <em>Implements String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OClassImplementImpl extends MinimalEObjectImpl.Container implements OClassImplement {
	/**
	 * The cached value of the '{@link #getImplementsString() <em>Implements String</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementsString()
	 * @generated
	 * @ordered
	 */
	protected EList<String> implementsString;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OClassImplementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OopPackage.Literals.OCLASS_IMPLEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getImplementsString() {
		if (implementsString == null) {
			implementsString = new EDataTypeUniqueEList<String>(String.class, this, OopPackage.OCLASS_IMPLEMENT__IMPLEMENTS_STRING);
		}
		return implementsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OopPackage.OCLASS_IMPLEMENT__IMPLEMENTS_STRING:
				return getImplementsString();
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
			case OopPackage.OCLASS_IMPLEMENT__IMPLEMENTS_STRING:
				getImplementsString().clear();
				getImplementsString().addAll((Collection<? extends String>)newValue);
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
			case OopPackage.OCLASS_IMPLEMENT__IMPLEMENTS_STRING:
				getImplementsString().clear();
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
			case OopPackage.OCLASS_IMPLEMENT__IMPLEMENTS_STRING:
				return implementsString != null && !implementsString.isEmpty();
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
		result.append(" (implementsString: ");
		result.append(implementsString);
		result.append(')');
		return result.toString();
	}

} //OClassImplementImpl
