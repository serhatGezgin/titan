/**
 */
package org.yazgel.oop.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.yazgel.oop.MultiODataType;
import org.yazgel.oop.ODataType;
import org.yazgel.oop.OopPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multi OData Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.yazgel.oop.impl.MultiODataTypeImpl#isUniqueInstance <em>Unique Instance</em>}</li>
 *   <li>{@link org.yazgel.oop.impl.MultiODataTypeImpl#getOpposites <em>Opposites</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MultiODataTypeImpl extends ODataTypeImpl implements MultiODataType {
	/**
	 * The default value of the '{@link #isUniqueInstance() <em>Unique Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUniqueInstance()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNIQUE_INSTANCE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUniqueInstance() <em>Unique Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUniqueInstance()
	 * @generated
	 * @ordered
	 */
	protected boolean uniqueInstance = UNIQUE_INSTANCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOpposites() <em>Opposites</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpposites()
	 * @generated
	 * @ordered
	 */
	protected EList<ODataType> opposites;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiODataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OopPackage.Literals.MULTI_ODATA_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUniqueInstance() {
		return uniqueInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUniqueInstance(boolean newUniqueInstance) {
		boolean oldUniqueInstance = uniqueInstance;
		uniqueInstance = newUniqueInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OopPackage.MULTI_ODATA_TYPE__UNIQUE_INSTANCE, oldUniqueInstance, uniqueInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ODataType> getOpposites() {
		if (opposites == null) {
			opposites = new EObjectWithInverseResolvingEList<ODataType>(ODataType.class, this, OopPackage.MULTI_ODATA_TYPE__OPPOSITES, OopPackage.ODATA_TYPE__OPPOSITE);
		}
		return opposites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OopPackage.MULTI_ODATA_TYPE__OPPOSITES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOpposites()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OopPackage.MULTI_ODATA_TYPE__OPPOSITES:
				return ((InternalEList<?>)getOpposites()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OopPackage.MULTI_ODATA_TYPE__UNIQUE_INSTANCE:
				return isUniqueInstance();
			case OopPackage.MULTI_ODATA_TYPE__OPPOSITES:
				return getOpposites();
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
			case OopPackage.MULTI_ODATA_TYPE__UNIQUE_INSTANCE:
				setUniqueInstance((Boolean)newValue);
				return;
			case OopPackage.MULTI_ODATA_TYPE__OPPOSITES:
				getOpposites().clear();
				getOpposites().addAll((Collection<? extends ODataType>)newValue);
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
			case OopPackage.MULTI_ODATA_TYPE__UNIQUE_INSTANCE:
				setUniqueInstance(UNIQUE_INSTANCE_EDEFAULT);
				return;
			case OopPackage.MULTI_ODATA_TYPE__OPPOSITES:
				getOpposites().clear();
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
			case OopPackage.MULTI_ODATA_TYPE__UNIQUE_INSTANCE:
				return uniqueInstance != UNIQUE_INSTANCE_EDEFAULT;
			case OopPackage.MULTI_ODATA_TYPE__OPPOSITES:
				return opposites != null && !opposites.isEmpty();
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
		result.append(" (uniqueInstance: ");
		result.append(uniqueInstance);
		result.append(')');
		return result.toString();
	}

} //MultiODataTypeImpl
