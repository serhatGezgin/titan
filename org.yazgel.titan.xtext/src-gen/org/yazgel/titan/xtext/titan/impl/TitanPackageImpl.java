/**
 */
package org.yazgel.titan.xtext.titan.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

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
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TitanPackageImpl extends EPackageImpl implements TitanPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass moduleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass packageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass entityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass entityBuilderEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass methodEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass takesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass addsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass featureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass referenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterFeatureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterDataTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum internalDSLTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum dataTypesEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.yazgel.titan.xtext.titan.TitanPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private TitanPackageImpl()
  {
    super(eNS_URI, TitanFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link TitanPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static TitanPackage init()
  {
    if (isInited) return (TitanPackage)EPackage.Registry.INSTANCE.getEPackage(TitanPackage.eNS_URI);

    // Obtain or create and register package
    TitanPackageImpl theTitanPackage = (TitanPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TitanPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TitanPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theTitanPackage.createPackageContents();

    // Initialize created meta-data
    theTitanPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theTitanPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(TitanPackage.eNS_URI, theTitanPackage);
    return theTitanPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModule()
  {
    return moduleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModule_Name()
  {
    return (EAttribute)moduleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModule_Type()
  {
    return (EAttribute)moduleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModule_Packages()
  {
    return (EReference)moduleEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPackage()
  {
    return packageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPackage_Name()
  {
    return (EAttribute)packageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPackage_Entities()
  {
    return (EReference)packageEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPackage_EntityBuilders()
  {
    return (EReference)packageEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEntity()
  {
    return entityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEntity_Name()
  {
    return (EAttribute)entityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEntity_SuperEntity()
  {
    return (EReference)entityEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEntity_Features()
  {
    return (EReference)entityEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEntityBuilder()
  {
    return entityBuilderEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEntityBuilder_Name()
  {
    return (EReference)entityBuilderEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEntityBuilder_Takes()
  {
    return (EReference)entityBuilderEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getmethod()
  {
    return methodEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getmethod_Type()
  {
    return (EReference)methodEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass gettakes()
  {
    return takesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference gettakes_Takes()
  {
    return (EReference)takesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference gettakes_Adds()
  {
    return (EReference)takesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getadds()
  {
    return addsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getadds_Adds()
  {
    return (EReference)addsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFeature()
  {
    return featureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFeature_Name()
  {
    return (EAttribute)featureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFeature_Many()
  {
    return (EAttribute)featureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReference()
  {
    return referenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReference_Reference()
  {
    return (EReference)referenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReference_Opposite()
  {
    return (EReference)referenceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataType()
  {
    return dataTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDataType_Type()
  {
    return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameterFeature()
  {
    return parameterFeatureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameterFeature_Many()
  {
    return (EAttribute)parameterFeatureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameterFeature_Name()
  {
    return (EAttribute)parameterFeatureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameterReference()
  {
    return parameterReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameterReference_Reference()
  {
    return (EReference)parameterReferenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameterDataType()
  {
    return parameterDataTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameterDataType_Type()
  {
    return (EAttribute)parameterDataTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getInternalDSLType()
  {
    return internalDSLTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getDataTypes()
  {
    return dataTypesEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TitanFactory getTitanFactory()
  {
    return (TitanFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    moduleEClass = createEClass(MODULE);
    createEAttribute(moduleEClass, MODULE__NAME);
    createEAttribute(moduleEClass, MODULE__TYPE);
    createEReference(moduleEClass, MODULE__PACKAGES);

    packageEClass = createEClass(PACKAGE);
    createEAttribute(packageEClass, PACKAGE__NAME);
    createEReference(packageEClass, PACKAGE__ENTITIES);
    createEReference(packageEClass, PACKAGE__ENTITY_BUILDERS);

    entityEClass = createEClass(ENTITY);
    createEAttribute(entityEClass, ENTITY__NAME);
    createEReference(entityEClass, ENTITY__SUPER_ENTITY);
    createEReference(entityEClass, ENTITY__FEATURES);

    entityBuilderEClass = createEClass(ENTITY_BUILDER);
    createEReference(entityBuilderEClass, ENTITY_BUILDER__NAME);
    createEReference(entityBuilderEClass, ENTITY_BUILDER__TAKES);

    methodEClass = createEClass(METHOD);
    createEReference(methodEClass, METHOD__TYPE);

    takesEClass = createEClass(TAKES);
    createEReference(takesEClass, TAKES__TAKES);
    createEReference(takesEClass, TAKES__ADDS);

    addsEClass = createEClass(ADDS);
    createEReference(addsEClass, ADDS__ADDS);

    featureEClass = createEClass(FEATURE);
    createEAttribute(featureEClass, FEATURE__NAME);
    createEAttribute(featureEClass, FEATURE__MANY);

    referenceEClass = createEClass(REFERENCE);
    createEReference(referenceEClass, REFERENCE__REFERENCE);
    createEReference(referenceEClass, REFERENCE__OPPOSITE);

    dataTypeEClass = createEClass(DATA_TYPE);
    createEAttribute(dataTypeEClass, DATA_TYPE__TYPE);

    parameterFeatureEClass = createEClass(PARAMETER_FEATURE);
    createEAttribute(parameterFeatureEClass, PARAMETER_FEATURE__MANY);
    createEAttribute(parameterFeatureEClass, PARAMETER_FEATURE__NAME);

    parameterReferenceEClass = createEClass(PARAMETER_REFERENCE);
    createEReference(parameterReferenceEClass, PARAMETER_REFERENCE__REFERENCE);

    parameterDataTypeEClass = createEClass(PARAMETER_DATA_TYPE);
    createEAttribute(parameterDataTypeEClass, PARAMETER_DATA_TYPE__TYPE);

    // Create enums
    internalDSLTypeEEnum = createEEnum(INTERNAL_DSL_TYPE);
    dataTypesEEnum = createEEnum(DATA_TYPES);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    referenceEClass.getESuperTypes().add(this.getFeature());
    dataTypeEClass.getESuperTypes().add(this.getFeature());
    parameterReferenceEClass.getESuperTypes().add(this.getParameterFeature());
    parameterDataTypeEClass.getESuperTypes().add(this.getParameterFeature());

    // Initialize classes and features; add operations and parameters
    initEClass(moduleEClass, Module.class, "Module", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getModule_Name(), ecorePackage.getEString(), "name", null, 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getModule_Type(), this.getInternalDSLType(), "type", null, 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModule_Packages(), this.getPackage(), null, "packages", null, 0, -1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(packageEClass, org.yazgel.titan.xtext.titan.Package.class, "Package", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPackage_Name(), ecorePackage.getEString(), "name", null, 0, 1, org.yazgel.titan.xtext.titan.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPackage_Entities(), this.getEntity(), null, "entities", null, 0, -1, org.yazgel.titan.xtext.titan.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPackage_EntityBuilders(), this.getEntityBuilder(), null, "entityBuilders", null, 0, -1, org.yazgel.titan.xtext.titan.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEntity_Name(), ecorePackage.getEString(), "name", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEntity_SuperEntity(), this.getEntity(), null, "superEntity", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEntity_Features(), this.getFeature(), null, "features", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(entityBuilderEClass, EntityBuilder.class, "EntityBuilder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEntityBuilder_Name(), this.getEntity(), null, "name", null, 0, 1, EntityBuilder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEntityBuilder_Takes(), this.gettakes(), null, "takes", null, 0, 1, EntityBuilder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(methodEClass, method.class, "method", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getmethod_Type(), this.getEntity(), null, "type", null, 0, 1, method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(takesEClass, takes.class, "takes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(gettakes_Takes(), this.getParameterFeature(), null, "takes", null, 0, -1, takes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(gettakes_Adds(), this.getadds(), null, "adds", null, 0, -1, takes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(addsEClass, adds.class, "adds", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getadds_Adds(), this.getFeature(), null, "adds", null, 0, -1, adds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(featureEClass, Feature.class, "Feature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFeature_Name(), ecorePackage.getEString(), "name", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFeature_Many(), ecorePackage.getEBoolean(), "many", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(referenceEClass, Reference.class, "Reference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getReference_Reference(), this.getEntity(), null, "reference", null, 0, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getReference_Opposite(), this.getReference(), null, "opposite", null, 0, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataTypeEClass, DataType.class, "DataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDataType_Type(), this.getDataTypes(), "type", null, 0, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterFeatureEClass, ParameterFeature.class, "ParameterFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getParameterFeature_Many(), ecorePackage.getEBoolean(), "many", null, 0, 1, ParameterFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getParameterFeature_Name(), ecorePackage.getEString(), "name", null, 0, 1, ParameterFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterReferenceEClass, ParameterReference.class, "ParameterReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParameterReference_Reference(), this.getEntity(), null, "reference", null, 0, 1, ParameterReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterDataTypeEClass, ParameterDataType.class, "ParameterDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getParameterDataType_Type(), this.getDataTypes(), "type", null, 0, 1, ParameterDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(internalDSLTypeEEnum, InternalDSLType.class, "InternalDSLType");
    addEEnumLiteral(internalDSLTypeEEnum, InternalDSLType.NESTED_FUNCTIONS);

    initEEnum(dataTypesEEnum, DataTypes.class, "DataTypes");
    addEEnumLiteral(dataTypesEEnum, DataTypes.STRING);
    addEEnumLiteral(dataTypesEEnum, DataTypes.INTEGER);
    addEEnumLiteral(dataTypesEEnum, DataTypes.BOOLEAN);
    addEEnumLiteral(dataTypesEEnum, DataTypes.LONG);
    addEEnumLiteral(dataTypesEEnum, DataTypes.DOUBLE);

    // Create resource
    createResource(eNS_URI);
  }

} //TitanPackageImpl
