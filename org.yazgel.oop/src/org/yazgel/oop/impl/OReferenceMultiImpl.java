/**
 */
package org.yazgel.oop.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.yazgel.oop.MultiOFeatureTypes;
import org.yazgel.oop.OReferenceMulti;
import org.yazgel.oop.OopPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OReference Multi</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.yazgel.oop.impl.OReferenceMultiImpl#getMultiType <em>Multi Type</em>}</li>
 *   <li>{@link org.yazgel.oop.impl.OReferenceMultiImpl#isUniqueInstance <em>Unique Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OReferenceMultiImpl extends OReferenceImpl implements OReferenceMulti {
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
	protected OReferenceMultiImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OopPackage.Literals.OREFERENCE_MULTI;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OopPackage.OREFERENCE_MULTI__MULTI_TYPE, oldMultiType, multiType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OopPackage.OREFERENCE_MULTI__UNIQUE_INSTANCE, oldUniqueInstance, uniqueInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OopPackage.OREFERENCE_MULTI__MULTI_TYPE:
				return getMultiType();
			case OopPackage.OREFERENCE_MULTI__UNIQUE_INSTANCE:
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
			case OopPackage.OREFERENCE_MULTI__MULTI_TYPE:
				setMultiType((MultiOFeatureTypes)newValue);
				return;
			case OopPackage.OREFERENCE_MULTI__UNIQUE_INSTANCE:
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
			case OopPackage.OREFERENCE_MULTI__MULTI_TYPE:
				setMultiType(MULTI_TYPE_EDEFAULT);
				return;
			case OopPackage.OREFERENCE_MULTI__UNIQUE_INSTANCE:
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
			case OopPackage.OREFERENCE_MULTI__MULTI_TYPE:
				return multiType != MULTI_TYPE_EDEFAULT;
			case OopPackage.OREFERENCE_MULTI__UNIQUE_INSTANCE:
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

} //OReferenceMultiImpl
