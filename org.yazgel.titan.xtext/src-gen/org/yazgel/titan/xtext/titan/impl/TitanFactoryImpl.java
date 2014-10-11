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
import org.yazgel.titan.xtext.titan.EntityBuilder;
import org.yazgel.titan.xtext.titan.Feature;
import org.yazgel.titan.xtext.titan.InternalDSLType;
import org.yazgel.titan.xtext.titan.Module;
import org.yazgel.titan.xtext.titan.ParameterDataType;
import org.yazgel.titan.xtext.titan.ParameterFeature;
import org.yazgel.titan.xtext.titan.ParameterReference;
import org.yazgel.titan.xtext.titan.Reference;
import org.yazgel.titan.xtext.titan.TitanFactory;
import org.yazgel.titan.xtext.titan.TitanPackage;
import org.yazgel.titan.xtext.titan.adds;
import org.yazgel.titan.xtext.titan.method;
import org.yazgel.titan.xtext.titan.takes;

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
      case TitanPackage.ENTITY_BUILDER: return createEntityBuilder();
      case TitanPackage.METHOD: return createmethod();
      case TitanPackage.TAKES: return createtakes();
      case TitanPackage.ADDS: return createadds();
      case TitanPackage.FEATURE: return createFeature();
      case TitanPackage.REFERENCE: return createReference();
      case TitanPackage.DATA_TYPE: return createDataType();
      case TitanPackage.PARAMETER_FEATURE: return createParameterFeature();
      case TitanPackage.PARAMETER_REFERENCE: return createParameterReference();
      case TitanPackage.PARAMETER_DATA_TYPE: return createParameterDataType();
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
  public EntityBuilder createEntityBuilder()
  {
    EntityBuilderImpl entityBuilder = new EntityBuilderImpl();
    return entityBuilder;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public method createmethod()
  {
    methodImpl method = new methodImpl();
    return method;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public takes createtakes()
  {
    takesImpl takes = new takesImpl();
    return takes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public adds createadds()
  {
    addsImpl adds = new addsImpl();
    return adds;
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
  public ParameterFeature createParameterFeature()
  {
    ParameterFeatureImpl parameterFeature = new ParameterFeatureImpl();
    return parameterFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterReference createParameterReference()
  {
    ParameterReferenceImpl parameterReference = new ParameterReferenceImpl();
    return parameterReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterDataType createParameterDataType()
  {
    ParameterDataTypeImpl parameterDataType = new ParameterDataTypeImpl();
    return parameterDataType;
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
