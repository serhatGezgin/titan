/**
 */
package org.yazgel.oop.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.yazgel.oop.OReturnStatement;
import org.yazgel.oop.OVarriableCreateStatement;
import org.yazgel.oop.OopPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OReturn Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.yazgel.oop.impl.OReturnStatementImpl#getReturnVarriable <em>Return Varriable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OReturnStatementImpl extends OStatementImpl implements OReturnStatement {
	/**
	 * The cached value of the '{@link #getReturnVarriable() <em>Return Varriable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnVarriable()
	 * @generated
	 * @ordered
	 */
	protected OVarriableCreateStatement returnVarriable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OReturnStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OopPackage.Literals.ORETURN_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OVarriableCreateStatement getReturnVarriable() {
		if (returnVarriable != null && returnVarriable.eIsProxy()) {
			InternalEObject oldReturnVarriable = (InternalEObject)returnVarriable;
			returnVarriable = (OVarriableCreateStatement)eResolveProxy(oldReturnVarriable);
			if (returnVarriable != oldReturnVarriable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OopPackage.ORETURN_STATEMENT__RETURN_VARRIABLE, oldReturnVarriable, returnVarriable));
			}
		}
		return returnVarriable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OVarriableCreateStatement basicGetReturnVarriable() {
		return returnVarriable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnVarriable(OVarriableCreateStatement newReturnVarriable) {
		OVarriableCreateStatement oldReturnVarriable = returnVarriable;
		returnVarriable = newReturnVarriable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OopPackage.ORETURN_STATEMENT__RETURN_VARRIABLE, oldReturnVarriable, returnVarriable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OopPackage.ORETURN_STATEMENT__RETURN_VARRIABLE:
				if (resolve) return getReturnVarriable();
				return basicGetReturnVarriable();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OopPackage.ORETURN_STATEMENT__RETURN_VARRIABLE:
				setReturnVarriable((OVarriableCreateStatement)newValue);
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
			case OopPackage.ORETURN_STATEMENT__RETURN_VARRIABLE:
				setReturnVarriable((OVarriableCreateStatement)null);
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
			case OopPackage.ORETURN_STATEMENT__RETURN_VARRIABLE:
				return returnVarriable != null;
		}
		return super.eIsSet(featureID);
	}

} //OReturnStatementImpl
