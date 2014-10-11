/**
 */
package org.yazgel.titan.xtext.titan.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.yazgel.titan.xtext.titan.DataType;
import org.yazgel.titan.xtext.titan.Entity;
import org.yazgel.titan.xtext.titan.EntityBuilder;
import org.yazgel.titan.xtext.titan.Feature;
import org.yazgel.titan.xtext.titan.Module;
import org.yazgel.titan.xtext.titan.ParameterDataType;
import org.yazgel.titan.xtext.titan.ParameterFeature;
import org.yazgel.titan.xtext.titan.ParameterReference;
import org.yazgel.titan.xtext.titan.Reference;
import org.yazgel.titan.xtext.titan.TitanPackage;
import org.yazgel.titan.xtext.titan.adds;
import org.yazgel.titan.xtext.titan.method;
import org.yazgel.titan.xtext.titan.takes;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.yazgel.titan.xtext.titan.TitanPackage
 * @generated
 */
public class TitanAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static TitanPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TitanAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = TitanPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TitanSwitch<Adapter> modelSwitch =
    new TitanSwitch<Adapter>()
    {
      @Override
      public Adapter caseModule(Module object)
      {
        return createModuleAdapter();
      }
      @Override
      public Adapter casePackage(org.yazgel.titan.xtext.titan.Package object)
      {
        return createPackageAdapter();
      }
      @Override
      public Adapter caseEntity(Entity object)
      {
        return createEntityAdapter();
      }
      @Override
      public Adapter caseEntityBuilder(EntityBuilder object)
      {
        return createEntityBuilderAdapter();
      }
      @Override
      public Adapter casemethod(method object)
      {
        return createmethodAdapter();
      }
      @Override
      public Adapter casetakes(takes object)
      {
        return createtakesAdapter();
      }
      @Override
      public Adapter caseadds(adds object)
      {
        return createaddsAdapter();
      }
      @Override
      public Adapter caseFeature(Feature object)
      {
        return createFeatureAdapter();
      }
      @Override
      public Adapter caseReference(Reference object)
      {
        return createReferenceAdapter();
      }
      @Override
      public Adapter caseDataType(DataType object)
      {
        return createDataTypeAdapter();
      }
      @Override
      public Adapter caseParameterFeature(ParameterFeature object)
      {
        return createParameterFeatureAdapter();
      }
      @Override
      public Adapter caseParameterReference(ParameterReference object)
      {
        return createParameterReferenceAdapter();
      }
      @Override
      public Adapter caseParameterDataType(ParameterDataType object)
      {
        return createParameterDataTypeAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.yazgel.titan.xtext.titan.Module <em>Module</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yazgel.titan.xtext.titan.Module
   * @generated
   */
  public Adapter createModuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yazgel.titan.xtext.titan.Package <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yazgel.titan.xtext.titan.Package
   * @generated
   */
  public Adapter createPackageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yazgel.titan.xtext.titan.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yazgel.titan.xtext.titan.Entity
   * @generated
   */
  public Adapter createEntityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yazgel.titan.xtext.titan.EntityBuilder <em>Entity Builder</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yazgel.titan.xtext.titan.EntityBuilder
   * @generated
   */
  public Adapter createEntityBuilderAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yazgel.titan.xtext.titan.method <em>method</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yazgel.titan.xtext.titan.method
   * @generated
   */
  public Adapter createmethodAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yazgel.titan.xtext.titan.takes <em>takes</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yazgel.titan.xtext.titan.takes
   * @generated
   */
  public Adapter createtakesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yazgel.titan.xtext.titan.adds <em>adds</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yazgel.titan.xtext.titan.adds
   * @generated
   */
  public Adapter createaddsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yazgel.titan.xtext.titan.Feature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yazgel.titan.xtext.titan.Feature
   * @generated
   */
  public Adapter createFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yazgel.titan.xtext.titan.Reference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yazgel.titan.xtext.titan.Reference
   * @generated
   */
  public Adapter createReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yazgel.titan.xtext.titan.DataType <em>Data Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yazgel.titan.xtext.titan.DataType
   * @generated
   */
  public Adapter createDataTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yazgel.titan.xtext.titan.ParameterFeature <em>Parameter Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yazgel.titan.xtext.titan.ParameterFeature
   * @generated
   */
  public Adapter createParameterFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yazgel.titan.xtext.titan.ParameterReference <em>Parameter Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yazgel.titan.xtext.titan.ParameterReference
   * @generated
   */
  public Adapter createParameterReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.yazgel.titan.xtext.titan.ParameterDataType <em>Parameter Data Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.yazgel.titan.xtext.titan.ParameterDataType
   * @generated
   */
  public Adapter createParameterDataTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //TitanAdapterFactory