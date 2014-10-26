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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.yazgel.oop.OClass;
import org.yazgel.oop.OFeature;
import org.yazgel.oop.OMethod;
import org.yazgel.oop.OopPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OClass</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.yazgel.oop.impl.OClassImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.yazgel.oop.impl.OClassImpl#getMethods <em>Methods</em>}</li>
 *   <li>{@link org.yazgel.oop.impl.OClassImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.yazgel.oop.impl.OClassImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link org.yazgel.oop.impl.OClassImpl#getImplements <em>Implements</em>}</li>
 *   <li>{@link org.yazgel.oop.impl.OClassImpl#getSuper <em>Super</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OClassImpl extends MinimalEObjectImpl.Container implements OClass {
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
	 * The cached value of the '{@link #getMethods() <em>Methods</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<OMethod> methods;

	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<OFeature> features;

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
	 * The cached value of the '{@link #getImplements() <em>Implements</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplements()
	 * @generated
	 * @ordered
	 */
	protected EList<String> implements_;

	/**
	 * The cached value of the '{@link #getSuper() <em>Super</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuper()
	 * @generated
	 * @ordered
	 */
	protected OClass super_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OopPackage.Literals.OCLASS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OopPackage.OCLASS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OMethod> getMethods() {
		if (methods == null) {
			methods = new EObjectContainmentEList<OMethod>(OMethod.class, this, OopPackage.OCLASS__METHODS);
		}
		return methods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OFeature> getFeatures() {
		if (features == null) {
			features = new EObjectContainmentEList<OFeature>(OFeature.class, this, OopPackage.OCLASS__FEATURES);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getImports() {
		if (imports == null) {
			imports = new EDataTypeUniqueEList<String>(String.class, this, OopPackage.OCLASS__IMPORTS);
		}
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getImplements() {
		if (implements_ == null) {
			implements_ = new EDataTypeUniqueEList<String>(String.class, this, OopPackage.OCLASS__IMPLEMENTS);
		}
		return implements_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OClass getSuper() {
		if (super_ != null && super_.eIsProxy()) {
			InternalEObject oldSuper = (InternalEObject)super_;
			super_ = (OClass)eResolveProxy(oldSuper);
			if (super_ != oldSuper) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OopPackage.OCLASS__SUPER, oldSuper, super_));
			}
		}
		return super_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OClass basicGetSuper() {
		return super_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuper(OClass newSuper) {
		OClass oldSuper = super_;
		super_ = newSuper;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OopPackage.OCLASS__SUPER, oldSuper, super_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OopPackage.OCLASS__METHODS:
				return ((InternalEList<?>)getMethods()).basicRemove(otherEnd, msgs);
			case OopPackage.OCLASS__FEATURES:
				return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
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
			case OopPackage.OCLASS__NAME:
				return getName();
			case OopPackage.OCLASS__METHODS:
				return getMethods();
			case OopPackage.OCLASS__FEATURES:
				return getFeatures();
			case OopPackage.OCLASS__IMPORTS:
				return getImports();
			case OopPackage.OCLASS__IMPLEMENTS:
				return getImplements();
			case OopPackage.OCLASS__SUPER:
				if (resolve) return getSuper();
				return basicGetSuper();
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
			case OopPackage.OCLASS__NAME:
				setName((String)newValue);
				return;
			case OopPackage.OCLASS__METHODS:
				getMethods().clear();
				getMethods().addAll((Collection<? extends OMethod>)newValue);
				return;
			case OopPackage.OCLASS__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends OFeature>)newValue);
				return;
			case OopPackage.OCLASS__IMPORTS:
				getImports().clear();
				getImports().addAll((Collection<? extends String>)newValue);
				return;
			case OopPackage.OCLASS__IMPLEMENTS:
				getImplements().clear();
				getImplements().addAll((Collection<? extends String>)newValue);
				return;
			case OopPackage.OCLASS__SUPER:
				setSuper((OClass)newValue);
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
			case OopPackage.OCLASS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OopPackage.OCLASS__METHODS:
				getMethods().clear();
				return;
			case OopPackage.OCLASS__FEATURES:
				getFeatures().clear();
				return;
			case OopPackage.OCLASS__IMPORTS:
				getImports().clear();
				return;
			case OopPackage.OCLASS__IMPLEMENTS:
				getImplements().clear();
				return;
			case OopPackage.OCLASS__SUPER:
				setSuper((OClass)null);
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
			case OopPackage.OCLASS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OopPackage.OCLASS__METHODS:
				return methods != null && !methods.isEmpty();
			case OopPackage.OCLASS__FEATURES:
				return features != null && !features.isEmpty();
			case OopPackage.OCLASS__IMPORTS:
				return imports != null && !imports.isEmpty();
			case OopPackage.OCLASS__IMPLEMENTS:
				return implements_ != null && !implements_.isEmpty();
			case OopPackage.OCLASS__SUPER:
				return super_ != null;
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
		result.append(", imports: ");
		result.append(imports);
		result.append(", implements: ");
		result.append(implements_);
		result.append(')');
		return result.toString();
	}

} //OClassImpl
