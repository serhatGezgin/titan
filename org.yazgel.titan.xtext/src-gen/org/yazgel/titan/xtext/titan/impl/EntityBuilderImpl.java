/**
 */
package org.yazgel.titan.xtext.titan.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.yazgel.titan.xtext.titan.Entity;
import org.yazgel.titan.xtext.titan.EntityBuilder;
import org.yazgel.titan.xtext.titan.TitanPackage;
import org.yazgel.titan.xtext.titan.takes;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Builder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.yazgel.titan.xtext.titan.impl.EntityBuilderImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.yazgel.titan.xtext.titan.impl.EntityBuilderImpl#getTakes <em>Takes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityBuilderImpl extends MinimalEObjectImpl.Container implements EntityBuilder
{
  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected Entity name;

  /**
   * The cached value of the '{@link #getTakes() <em>Takes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTakes()
   * @generated
   * @ordered
   */
  protected takes takes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EntityBuilderImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return TitanPackage.Literals.ENTITY_BUILDER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity getName()
  {
    if (name != null && name.eIsProxy())
    {
      InternalEObject oldName = (InternalEObject)name;
      name = (Entity)eResolveProxy(oldName);
      if (name != oldName)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TitanPackage.ENTITY_BUILDER__NAME, oldName, name));
      }
    }
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity basicGetName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(Entity newName)
  {
    Entity oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TitanPackage.ENTITY_BUILDER__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public takes getTakes()
  {
    return takes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTakes(takes newTakes, NotificationChain msgs)
  {
    takes oldTakes = takes;
    takes = newTakes;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TitanPackage.ENTITY_BUILDER__TAKES, oldTakes, newTakes);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTakes(takes newTakes)
  {
    if (newTakes != takes)
    {
      NotificationChain msgs = null;
      if (takes != null)
        msgs = ((InternalEObject)takes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TitanPackage.ENTITY_BUILDER__TAKES, null, msgs);
      if (newTakes != null)
        msgs = ((InternalEObject)newTakes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TitanPackage.ENTITY_BUILDER__TAKES, null, msgs);
      msgs = basicSetTakes(newTakes, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TitanPackage.ENTITY_BUILDER__TAKES, newTakes, newTakes));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case TitanPackage.ENTITY_BUILDER__TAKES:
        return basicSetTakes(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case TitanPackage.ENTITY_BUILDER__NAME:
        if (resolve) return getName();
        return basicGetName();
      case TitanPackage.ENTITY_BUILDER__TAKES:
        return getTakes();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TitanPackage.ENTITY_BUILDER__NAME:
        setName((Entity)newValue);
        return;
      case TitanPackage.ENTITY_BUILDER__TAKES:
        setTakes((takes)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case TitanPackage.ENTITY_BUILDER__NAME:
        setName((Entity)null);
        return;
      case TitanPackage.ENTITY_BUILDER__TAKES:
        setTakes((takes)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case TitanPackage.ENTITY_BUILDER__NAME:
        return name != null;
      case TitanPackage.ENTITY_BUILDER__TAKES:
        return takes != null;
    }
    return super.eIsSet(featureID);
  }

} //EntityBuilderImpl
