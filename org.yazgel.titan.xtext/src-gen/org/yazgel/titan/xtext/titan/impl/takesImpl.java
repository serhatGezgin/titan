/**
 */
package org.yazgel.titan.xtext.titan.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.yazgel.titan.xtext.titan.ParameterFeature;
import org.yazgel.titan.xtext.titan.TitanPackage;
import org.yazgel.titan.xtext.titan.adds;
import org.yazgel.titan.xtext.titan.takes;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>takes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.yazgel.titan.xtext.titan.impl.takesImpl#getTakes <em>Takes</em>}</li>
 *   <li>{@link org.yazgel.titan.xtext.titan.impl.takesImpl#getAdds <em>Adds</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class takesImpl extends MinimalEObjectImpl.Container implements takes
{
  /**
   * The cached value of the '{@link #getTakes() <em>Takes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTakes()
   * @generated
   * @ordered
   */
  protected EList<ParameterFeature> takes;

  /**
   * The cached value of the '{@link #getAdds() <em>Adds</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAdds()
   * @generated
   * @ordered
   */
  protected EList<adds> adds;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected takesImpl()
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
    return TitanPackage.Literals.TAKES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ParameterFeature> getTakes()
  {
    if (takes == null)
    {
      takes = new EObjectContainmentEList<ParameterFeature>(ParameterFeature.class, this, TitanPackage.TAKES__TAKES);
    }
    return takes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<adds> getAdds()
  {
    if (adds == null)
    {
      adds = new EObjectContainmentEList<adds>(adds.class, this, TitanPackage.TAKES__ADDS);
    }
    return adds;
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
      case TitanPackage.TAKES__TAKES:
        return ((InternalEList<?>)getTakes()).basicRemove(otherEnd, msgs);
      case TitanPackage.TAKES__ADDS:
        return ((InternalEList<?>)getAdds()).basicRemove(otherEnd, msgs);
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
      case TitanPackage.TAKES__TAKES:
        return getTakes();
      case TitanPackage.TAKES__ADDS:
        return getAdds();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TitanPackage.TAKES__TAKES:
        getTakes().clear();
        getTakes().addAll((Collection<? extends ParameterFeature>)newValue);
        return;
      case TitanPackage.TAKES__ADDS:
        getAdds().clear();
        getAdds().addAll((Collection<? extends adds>)newValue);
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
      case TitanPackage.TAKES__TAKES:
        getTakes().clear();
        return;
      case TitanPackage.TAKES__ADDS:
        getAdds().clear();
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
      case TitanPackage.TAKES__TAKES:
        return takes != null && !takes.isEmpty();
      case TitanPackage.TAKES__ADDS:
        return adds != null && !adds.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //takesImpl
