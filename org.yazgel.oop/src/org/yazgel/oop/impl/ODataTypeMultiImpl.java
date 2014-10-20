/**
 */
package org.yazgel.oop.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.yazgel.oop.MultiOFeatureTypes;
import org.yazgel.oop.ODataTypeMulti;
import org.yazgel.oop.OopPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OData Type Multi</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.yazgel.oop.impl.ODataTypeMultiImpl#getMultiType <em>Multi Type</em>}</li>
 *   <li>{@link org.yazgel.oop.impl.ODataTypeMultiImpl#isUniqueInstance <em>Unique Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ODataTypeMultiImpl extends ODataTypeImpl implements ODataTypeMulti {
	/**
	 * The default value of the '{@link #getMultiType() <em>Multi Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiType()
	 * @generated
	 * @ordered
	 */
	protected static final MultiOFeatureTypes MULTI_TYPE_EDEFAULT = MultiOFeatureTypes.ARRAY_LIST;

	/**
	 * The cached value of the '{@link #getMultiType() <em>Multi Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiType()
	 * @generated
	 * @ordered
	 */
	protected MultiOFeatureTypes multiType = MULTI_TYPE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ODataTypeMultiImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OopPackage.Literals.ODATA_TYPE_MULTI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiOFeatureTypes getMultiType() {
		return multiType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiType(MultiOFeatureTypes newMultiType) {
		MultiOFeatureTypes oldMultiType = multiType;
		multiType = newMultiType == null ? MULTI_TYPE_EDEFAULT : newMultiType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OopPackage.ODATA_TYPE_MULTI__MULTI_TYPE, oldMultiType, multiType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OopPackage.ODATA_TYPE_MULTI__UNIQUE_INSTANCE, oldUniqueInstance, uniqueInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OopPackage.ODATA_TYPE_MULTI__MULTI_TYPE:
				return getMultiType();
			case OopPackage.ODATA_TYPE_MULTI__UNIQUE_INSTANCE:
				return isUniqueInstance();
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
			case OopPackage.ODATA_TYPE_MULTI__MULTI_TYPE:
				setMultiType((MultiOFeatureTypes)newValue);
				return;
			case OopPackage.ODATA_TYPE_MULTI__UNIQUE_INSTANCE:
				setUniqueInstance((Boolean)newValue);
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
			case OopPackage.ODATA_TYPE_MULTI__MULTI_TYPE:
				setMultiType(MULTI_TYPE_EDEFAULT);
				return;
			case OopPackage.ODATA_TYPE_MULTI__UNIQUE_INSTANCE:
				setUniqueInstance(UNIQUE_INSTANCE_EDEFAULT);
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
			case OopPackage.ODATA_TYPE_MULTI__MULTI_TYPE:
				return multiType != MULTI_TYPE_EDEFAULT;
			case OopPackage.ODATA_TYPE_MULTI__UNIQUE_INSTANCE:
				return uniqueInstance != UNIQUE_INSTANCE_EDEFAULT;
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
		result.append(" (multiType: ");
		result.append(multiType);
		result.append(", uniqueInstance: ");
		result.append(uniqueInstance);
		result.append(')');
		return result.toString();
	}

} //ODataTypeMultiImpl
