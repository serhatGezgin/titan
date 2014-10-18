/**
 */
package org.yazgel.oop.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.yazgel.oop.OMethod;
import org.yazgel.oop.OMethodCallStatement;
import org.yazgel.oop.OVarriableCreateStatement;
import org.yazgel.oop.OopPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OMethod Call Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.yazgel.oop.impl.OMethodCallStatementImpl#getVarriable <em>Varriable</em>}</li>
 *   <li>{@link org.yazgel.oop.impl.OMethodCallStatementImpl#getCalledMethod <em>Called Method</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OMethodCallStatementImpl extends OStatementImpl implements OMethodCallStatement {
	/**
	 * The cached value of the '{@link #getVarriable() <em>Varriable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarriable()
	 * @generated
	 * @ordered
	 */
	protected OVarriableCreateStatement varriable;

	/**
	 * The cached value of the '{@link #getCalledMethod() <em>Called Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalledMethod()
	 * @generated
	 * @ordered
	 */
	protected OMethod calledMethod;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OMethodCallStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OopPackage.Literals.OMETHOD_CALL_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OVarriableCreateStatement getVarriable() {
		if (varriable != null && varriable.eIsProxy()) {
			InternalEObject oldVarriable = (InternalEObject)varriable;
			varriable = (OVarriableCreateStatement)eResolveProxy(oldVarriable);
			if (varriable != oldVarriable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OopPackage.OMETHOD_CALL_STATEMENT__VARRIABLE, oldVarriable, varriable));
			}
		}
		return varriable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OVarriableCreateStatement basicGetVarriable() {
		return varriable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVarriable(OVarriableCreateStatement newVarriable) {
		OVarriableCreateStatement oldVarriable = varriable;
		varriable = newVarriable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OopPackage.OMETHOD_CALL_STATEMENT__VARRIABLE, oldVarriable, varriable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OMethod getCalledMethod() {
		if (calledMethod != null && calledMethod.eIsProxy()) {
			InternalEObject oldCalledMethod = (InternalEObject)calledMethod;
			calledMethod = (OMethod)eResolveProxy(oldCalledMethod);
			if (calledMethod != oldCalledMethod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OopPackage.OMETHOD_CALL_STATEMENT__CALLED_METHOD, oldCalledMethod, calledMethod));
			}
		}
		return calledMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OMethod basicGetCalledMethod() {
		return calledMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalledMethod(OMethod newCalledMethod) {
		OMethod oldCalledMethod = calledMethod;
		calledMethod = newCalledMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OopPackage.OMETHOD_CALL_STATEMENT__CALLED_METHOD, oldCalledMethod, calledMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OopPackage.OMETHOD_CALL_STATEMENT__VARRIABLE:
				if (resolve) return getVarriable();
				return basicGetVarriable();
			case OopPackage.OMETHOD_CALL_STATEMENT__CALLED_METHOD:
				if (resolve) return getCalledMethod();
				return basicGetCalledMethod();
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
			case OopPackage.OMETHOD_CALL_STATEMENT__VARRIABLE:
				setVarriable((OVarriableCreateStatement)newValue);
				return;
			case OopPackage.OMETHOD_CALL_STATEMENT__CALLED_METHOD:
				setCalledMethod((OMethod)newValue);
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
			case OopPackage.OMETHOD_CALL_STATEMENT__VARRIABLE:
				setVarriable((OVarriableCreateStatement)null);
				return;
			case OopPackage.OMETHOD_CALL_STATEMENT__CALLED_METHOD:
				setCalledMethod((OMethod)null);
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
			case OopPackage.OMETHOD_CALL_STATEMENT__VARRIABLE:
				return varriable != null;
			case OopPackage.OMETHOD_CALL_STATEMENT__CALLED_METHOD:
				return calledMethod != null;
		}
		return super.eIsSet(featureID);
	}

} //OMethodCallStatementImpl
