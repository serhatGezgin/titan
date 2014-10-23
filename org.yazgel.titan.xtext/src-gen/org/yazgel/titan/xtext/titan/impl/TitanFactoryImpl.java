/**
 */
package org.yazgel.titan.xtext.titan.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.yazgel.titan.xtext.titan.DataType;
import org.yazgel.titan.xtext.titan.DataTypes;
import org.yazgel.titan.xtext.titan.Entity;
import org.yazgel.titan.xtext.titan.Feature;
import org.yazgel.titan.xtext.titan.InternalDSLType;
import org.yazgel.titan.xtext.titan.Module;
import org.yazgel.titan.xtext.titan.MultiDataType;
import org.yazgel.titan.xtext.titan.MultiReference;
import org.yazgel.titan.xtext.titan.Reference;
import org.yazgel.titan.xtext.titan.SingleDataType;
import org.yazgel.titan.xtext.titan.SingleReference;
import org.yazgel.titan.xtext.titan.TitanFactory;
import org.yazgel.titan.xtext.titan.TitanPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TitanFactoryImpl extends EFactoryImpl implements TitanFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TitanFactory init()
  {
    try
    {
      TitanFactory theTitanFactory = (TitanFactory)EPackage.Registry.INSTANCE.getEFactory(TitanPackage.eNS_URI);
      if (theTitanFactory != null)
      {
        return theTitanFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new TitanFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TitanFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case TitanPackage.MODULE: return createModule();
      case TitanPackage.PACKAGE: return createPackage();
      case TitanPackage.ENTITY: return createEntity();
      case TitanPackage.FEATURE: return createFeature();
      case TitanPackage.REFERENCE: return createReference();
      case TitanPackage.SINGLE_REFERENCE: return createSingleReference();
      case TitanPackage.MULTI_REFERENCE: return createMultiReference();
      case TitanPackage.DATA_TYPE: return createDataType();
      case TitanPackage.SINGLE_DATA_TYPE: return createSingleDataType();
      case TitanPackage.MULTI_DATA_TYPE: return createMultiDataType();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case TitanPackage.INTERNAL_DSL_TYPE:
        return createInternalDSLTypeFromString(eDataType, initialValue);
      case TitanPackage.DATA_TYPES:
        return createDataTypesFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case TitanPackage.INTERNAL_DSL_TYPE:
        return convertInternalDSLTypeToString(eDataType, instanceValue);
      case TitanPackage.DATA_TYPES:
        return convertDataTypesToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Module createModule()
  {
    ModuleImpl module = new ModuleImpl();
    return module;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.yazgel.titan.xtext.titan.Package createPackage()
  {
    PackageImpl package_ = new PackageImpl();
    return package_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity createEntity()
  {
    EntityImpl entity = new EntityImpl();
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Feature createFeature()
  {
    FeatureImpl feature = new FeatureImpl();
    return feature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Reference createReference()
  {
    ReferenceImpl reference = new ReferenceImpl();
    return reference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SingleReference createSingleReference()
  {
    SingleReferenceImpl singleReference = new SingleReferenceImpl();
    return singleReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MultiReference createMultiReference()
  {
    MultiReferenceImpl multiReference = new MultiReferenceImpl();
    return multiReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataType createDataType()
  {
    DataTypeImpl dataType = new DataTypeImpl();
    return dataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SingleDataType createSingleDataType()
  {
    SingleDataTypeImpl singleDataType = new SingleDataTypeImpl();
    return singleDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MultiDataType createMultiDataType()
  {
    MultiDataTypeImpl multiDataType = new MultiDataTypeImpl();
    return multiDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InternalDSLType createInternalDSLTypeFromString(EDataType eDataType, String initialValue)
  {
    InternalDSLType result = InternalDSLType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertInternalDSLTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataTypes createDataTypesFromString(EDataType eDataType, String initialValue)
  {
    DataTypes result = DataTypes.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertDataTypesToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TitanPackage getTitanPackage()
  {
    return (TitanPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static TitanPackage getPackage()
  {
    return TitanPackage.eINSTANCE;
  }

} //TitanFactoryImpl
