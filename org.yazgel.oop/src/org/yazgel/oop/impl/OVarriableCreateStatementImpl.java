/**
 */
package org.yazgel.oop.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.yazgel.oop.OConstructor;
import org.yazgel.oop.OVarriableCreateStatement;
import org.yazgel.oop.OopPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OVarriable Create Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.yazgel.oop.impl.OVarriableCreateStatementImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.yazgel.oop.impl.OVarriableCreateStatementImpl#getCalledConstructor <em>Called Constructor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OVarriableCreateStatementImpl extends OStatementImpl implements OVarriableCreateStatement {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCalledConstructor() <em>Called Constructor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalledConstructor()
	 * @generated
	 * @ordered
	 */
	protected OConstructor calledConstructor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OVarriableCreateStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OopPackage.Literals.OVARRIABLE_CREATE_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OopPackage.OVARRIABLE_CREATE_STATEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OConstructor getCalledConstructor() {
		if (calledConstructor != null && calledConstructor.eIsProxy()) {
			InternalEObject oldCalledConstructor = (InternalEObject)calledConstructor;
			calledConstructor = (OConstructor)eResolveProxy(oldCalledConstructor);
			if (calledConstructor != oldCalledConstructor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OopPackage.OVARRIABLE_CREATE_STATEMENT__CALLED_CONSTRUCTOR, oldCalledConstructor, calledConstructor));
			}
		}
		return calledConstructor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OConstructor basicGetCalledConstructor() {
		return calledConstructor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalledConstructor(OConstructor newCalledConstructor) {
		OConstructor oldCalledConstructor = calledConstructor;
		calledConstructor = newCalledConstructor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OopPackage.OVARRIABLE_CREATE_STATEMENT__CALLED_CONSTRUCTOR, oldCalledConstructor, calledConstructor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OopPackage.OVARRIABLE_CREATE_STATEMENT__NAME:
				return getName();
			case OopPackage.OVARRIABLE_CREATE_STATEMENT__CALLED_CONSTRUCTOR:
				if (resolve) return getCalledConstructor();
				return basicGetCalledConstructor();
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
			case OopPackage.OVARRIABLE_CREATE_STATEMENT__NAME:
				setName((String)newValue);
				return;
			case OopPackage.OVARRIABLE_CREATE_STATEMENT__CALLED_CONSTRUCTOR:
				setCalledConstructor((OConstructor)newValue);
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
			case OopPackage.OVARRIABLE_CREATE_STATEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OopPackage.OVARRIABLE_CREATE_STATEMENT__CALLED_CONSTRUCTOR:
				setCalledConstructor((OConstructor)null);
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
			case OopPackage.OVARRIABLE_CREATE_STATEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OopPackage.OVARRIABLE_CREATE_STATEMENT__CALLED_CONSTRUCTOR:
				return calledConstructor != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //OVarriableCreateStatementImpl
