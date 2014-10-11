/**
 */
package org.yazgel.titan.xtext.titan;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.yazgel.titan.xtext.titan.TitanFactory
 * @model kind="package"
 * @generated
 */
public interface TitanPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "titan";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.yazgel.org/titan/xtext/Titan";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "titan";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TitanPackage eINSTANCE = org.yazgel.titan.xtext.titan.impl.TitanPackageImpl.init();

  /**
   * The meta object id for the '{@link org.yazgel.titan.xtext.titan.impl.ModuleImpl <em>Module</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.yazgel.titan.xtext.titan.impl.ModuleImpl
   * @see org.yazgel.titan.xtext.titan.impl.TitanPackageImpl#getModule()
   * @generated
   */
  int MODULE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__TYPE = 1;

  /**
   * The feature id for the '<em><b>Packages</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__PACKAGES = 2;

  /**
   * The number of structural features of the '<em>Module</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.yazgel.titan.xtext.titan.impl.PackageImpl <em>Package</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.yazgel.titan.xtext.titan.impl.PackageImpl
   * @see org.yazgel.titan.xtext.titan.impl.TitanPackageImpl#getPackage()
   * @generated
   */
  int PACKAGE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__NAME = 0;

  /**
   * The feature id for the '<em><b>Entities</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__ENTITIES = 1;

  /**
   * The feature id for the '<em><b>Entity Builders</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__ENTITY_BUILDERS = 2;

  /**
   * The number of structural features of the '<em>Package</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.yazgel.titan.xtext.titan.impl.EntityImpl <em>Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.yazgel.titan.xtext.titan.impl.EntityImpl
   * @see org.yazgel.titan.xtext.titan.impl.TitanPackageImpl#getEntity()
   * @generated
   */
  int ENTITY = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__NAME = 0;

  /**
   * The feature id for the '<em><b>Super Entity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__SUPER_ENTITY = 1;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__FEATURES = 2;

  /**
   * The number of structural features of the '<em>Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.yazgel.titan.xtext.titan.impl.EntityBuilderImpl <em>Entity Builder</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.yazgel.titan.xtext.titan.impl.EntityBuilderImpl
   * @see org.yazgel.titan.xtext.titan.impl.TitanPackageImpl#getEntityBuilder()
   * @generated
   */
  int ENTITY_BUILDER = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_BUILDER__NAME = 0;

  /**
   * The feature id for the '<em><b>Takes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_BUILDER__TAKES = 1;

  /**
   * The number of structural features of the '<em>Entity Builder</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_BUILDER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.yazgel.titan.xtext.titan.impl.methodImpl <em>method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.yazgel.titan.xtext.titan.impl.methodImpl
   * @see org.yazgel.titan.xtext.titan.impl.TitanPackageImpl#getmethod()
   * @generated
   */
  int METHOD = 4;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__TYPE = 0;

  /**
   * The number of structural features of the '<em>method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.yazgel.titan.xtext.titan.impl.takesImpl <em>takes</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.yazgel.titan.xtext.titan.impl.takesImpl
   * @see org.yazgel.titan.xtext.titan.impl.TitanPackageImpl#gettakes()
   * @generated
   */
  int TAKES = 5;

  /**
   * The feature id for the '<em><b>Takes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAKES__TAKES = 0;

  /**
   * The feature id for the '<em><b>Adds</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAKES__ADDS = 1;

  /**
   * The number of structural features of the '<em>takes</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAKES_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.yazgel.titan.xtext.titan.impl.addsImpl <em>adds</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.yazgel.titan.xtext.titan.impl.addsImpl
   * @see org.yazgel.titan.xtext.titan.impl.TitanPackageImpl#getadds()
   * @generated
   */
  int ADDS = 6;

  /**
   * The feature id for the '<em><b>Adds</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDS__ADDS = 0;

  /**
   * The number of structural features of the '<em>adds</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.yazgel.titan.xtext.titan.impl.FeatureImpl <em>Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.yazgel.titan.xtext.titan.impl.FeatureImpl
   * @see org.yazgel.titan.xtext.titan.impl.TitanPackageImpl#getFeature()
   * @generated
   */
  int FEATURE = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__NAME = 0;

  /**
   * The feature id for the '<em><b>Many</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__MANY = 1;

  /**
   * The number of structural features of the '<em>Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.yazgel.titan.xtext.titan.impl.ReferenceImpl <em>Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.yazgel.titan.xtext.titan.impl.ReferenceImpl
   * @see org.yazgel.titan.xtext.titan.impl.TitanPackageImpl#getReference()
   * @generated
   */
  int REFERENCE = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__NAME = FEATURE__NAME;

  /**
   * The feature id for the '<em><b>Many</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__MANY = FEATURE__MANY;

  /**
   * The feature id for the '<em><b>Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__REFERENCE = FEATURE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Opposite</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__OPPOSITE = FEATURE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.yazgel.titan.xtext.titan.impl.DataTypeImpl <em>Data Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.yazgel.titan.xtext.titan.impl.DataTypeImpl
   * @see org.yazgel.titan.xtext.titan.impl.TitanPackageImpl#getDataType()
   * @generated
   */
  int DATA_TYPE = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE__NAME = FEATURE__NAME;

  /**
   * The feature id for the '<em><b>Many</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE__MANY = FEATURE__MANY;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE__TYPE = FEATURE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Data Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.yazgel.titan.xtext.titan.impl.ParameterFeatureImpl <em>Parameter Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.yazgel.titan.xtext.titan.impl.ParameterFeatureImpl
   * @see org.yazgel.titan.xtext.titan.impl.TitanPackageImpl#getParameterFeature()
   * @generated
   */
  int PARAMETER_FEATURE = 10;

  /**
   * The feature id for the '<em><b>Many</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE__MANY = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE__NAME = 1;

  /**
   * The number of structural features of the '<em>Parameter Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.yazgel.titan.xtext.titan.impl.ParameterReferenceImpl <em>Parameter Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.yazgel.titan.xtext.titan.impl.ParameterReferenceImpl
   * @see org.yazgel.titan.xtext.titan.impl.TitanPackageImpl#getParameterReference()
   * @generated
   */
  int PARAMETER_REFERENCE = 11;

  /**
   * The feature id for the '<em><b>Many</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_REFERENCE__MANY = PARAMETER_FEATURE__MANY;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_REFERENCE__NAME = PARAMETER_FEATURE__NAME;

  /**
   * The feature id for the '<em><b>Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_REFERENCE__REFERENCE = PARAMETER_FEATURE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Parameter Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_REFERENCE_FEATURE_COUNT = PARAMETER_FEATURE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.yazgel.titan.xtext.titan.impl.ParameterDataTypeImpl <em>Parameter Data Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.yazgel.titan.xtext.titan.impl.ParameterDataTypeImpl
   * @see org.yazgel.titan.xtext.titan.impl.TitanPackageImpl#getParameterDataType()
   * @generated
   */
  int PARAMETER_DATA_TYPE = 12;

  /**
   * The feature id for the '<em><b>Many</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_DATA_TYPE__MANY = PARAMETER_FEATURE__MANY;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_DATA_TYPE__NAME = PARAMETER_FEATURE__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_DATA_TYPE__TYPE = PARAMETER_FEATURE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Parameter Data Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_DATA_TYPE_FEATURE_COUNT = PARAMETER_FEATURE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.yazgel.titan.xtext.titan.InternalDSLType <em>Internal DSL Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.yazgel.titan.xtext.titan.InternalDSLType
   * @see org.yazgel.titan.xtext.titan.impl.TitanPackageImpl#getInternalDSLType()
   * @generated
   */
  int INTERNAL_DSL_TYPE = 13;

  /**
   * The meta object id for the '{@link org.yazgel.titan.xtext.titan.DataTypes <em>Data Types</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.yazgel.titan.xtext.titan.DataTypes
   * @see org.yazgel.titan.xtext.titan.impl.TitanPackageImpl#getDataTypes()
   * @generated
   */
  int DATA_TYPES = 14;


  /**
   * Returns the meta object for class '{@link org.yazgel.titan.xtext.titan.Module <em>Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Module</em>'.
   * @see org.yazgel.titan.xtext.titan.Module
   * @generated
   */
  EClass getModule();

  /**
   * Returns the meta object for the attribute '{@link org.yazgel.titan.xtext.titan.Module#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.yazgel.titan.xtext.titan.Module#getName()
   * @see #getModule()
   * @generated
   */
  EAttribute getModule_Name();

  /**
   * Returns the meta object for the attribute '{@link org.yazgel.titan.xtext.titan.Module#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.yazgel.titan.xtext.titan.Module#getType()
   * @see #getModule()
   * @generated
   */
  EAttribute getModule_Type();

  /**
   * Returns the meta object for the containment reference list '{@link org.yazgel.titan.xtext.titan.Module#getPackages <em>Packages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Packages</em>'.
   * @see org.yazgel.titan.xtext.titan.Module#getPackages()
   * @see #getModule()
   * @generated
   */
  EReference getModule_Packages();

  /**
   * Returns the meta object for class '{@link org.yazgel.titan.xtext.titan.Package <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package</em>'.
   * @see org.yazgel.titan.xtext.titan.Package
   * @generated
   */
  EClass getPackage();

  /**
   * Returns the meta object for the attribute '{@link org.yazgel.titan.xtext.titan.Package#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.yazgel.titan.xtext.titan.Package#getName()
   * @see #getPackage()
   * @generated
   */
  EAttribute getPackage_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.yazgel.titan.xtext.titan.Package#getEntities <em>Entities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entities</em>'.
   * @see org.yazgel.titan.xtext.titan.Package#getEntities()
   * @see #getPackage()
   * @generated
   */
  EReference getPackage_Entities();

  /**
   * Returns the meta object for the containment reference list '{@link org.yazgel.titan.xtext.titan.Package#getEntityBuilders <em>Entity Builders</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entity Builders</em>'.
   * @see org.yazgel.titan.xtext.titan.Package#getEntityBuilders()
   * @see #getPackage()
   * @generated
   */
  EReference getPackage_EntityBuilders();

  /**
   * Returns the meta object for class '{@link org.yazgel.titan.xtext.titan.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity</em>'.
   * @see org.yazgel.titan.xtext.titan.Entity
   * @generated
   */
  EClass getEntity();

  /**
   * Returns the meta object for the attribute '{@link org.yazgel.titan.xtext.titan.Entity#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.yazgel.titan.xtext.titan.Entity#getName()
   * @see #getEntity()
   * @generated
   */
  EAttribute getEntity_Name();

  /**
   * Returns the meta object for the reference '{@link org.yazgel.titan.xtext.titan.Entity#getSuperEntity <em>Super Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Super Entity</em>'.
   * @see org.yazgel.titan.xtext.titan.Entity#getSuperEntity()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_SuperEntity();

  /**
   * Returns the meta object for the containment reference list '{@link org.yazgel.titan.xtext.titan.Entity#getFeatures <em>Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Features</em>'.
   * @see org.yazgel.titan.xtext.titan.Entity#getFeatures()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_Features();

  /**
   * Returns the meta object for class '{@link org.yazgel.titan.xtext.titan.EntityBuilder <em>Entity Builder</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity Builder</em>'.
   * @see org.yazgel.titan.xtext.titan.EntityBuilder
   * @generated
   */
  EClass getEntityBuilder();

  /**
   * Returns the meta object for the reference '{@link org.yazgel.titan.xtext.titan.EntityBuilder#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Name</em>'.
   * @see org.yazgel.titan.xtext.titan.EntityBuilder#getName()
   * @see #getEntityBuilder()
   * @generated
   */
  EReference getEntityBuilder_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.yazgel.titan.xtext.titan.EntityBuilder#getTakes <em>Takes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Takes</em>'.
   * @see org.yazgel.titan.xtext.titan.EntityBuilder#getTakes()
   * @see #getEntityBuilder()
   * @generated
   */
  EReference getEntityBuilder_Takes();

  /**
   * Returns the meta object for class '{@link org.yazgel.titan.xtext.titan.method <em>method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>method</em>'.
   * @see org.yazgel.titan.xtext.titan.method
   * @generated
   */
  EClass getmethod();

  /**
   * Returns the meta object for the reference '{@link org.yazgel.titan.xtext.titan.method#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.yazgel.titan.xtext.titan.method#getType()
   * @see #getmethod()
   * @generated
   */
  EReference getmethod_Type();

  /**
   * Returns the meta object for class '{@link org.yazgel.titan.xtext.titan.takes <em>takes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>takes</em>'.
   * @see org.yazgel.titan.xtext.titan.takes
   * @generated
   */
  EClass gettakes();

  /**
   * Returns the meta object for the containment reference list '{@link org.yazgel.titan.xtext.titan.takes#getTakes <em>Takes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Takes</em>'.
   * @see org.yazgel.titan.xtext.titan.takes#getTakes()
   * @see #gettakes()
   * @generated
   */
  EReference gettakes_Takes();

  /**
   * Returns the meta object for the containment reference list '{@link org.yazgel.titan.xtext.titan.takes#getAdds <em>Adds</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Adds</em>'.
   * @see org.yazgel.titan.xtext.titan.takes#getAdds()
   * @see #gettakes()
   * @generated
   */
  EReference gettakes_Adds();

  /**
   * Returns the meta object for class '{@link org.yazgel.titan.xtext.titan.adds <em>adds</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>adds</em>'.
   * @see org.yazgel.titan.xtext.titan.adds
   * @generated
   */
  EClass getadds();

  /**
   * Returns the meta object for the reference list '{@link org.yazgel.titan.xtext.titan.adds#getAdds <em>Adds</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Adds</em>'.
   * @see org.yazgel.titan.xtext.titan.adds#getAdds()
   * @see #getadds()
   * @generated
   */
  EReference getadds_Adds();

  /**
   * Returns the meta object for class '{@link org.yazgel.titan.xtext.titan.Feature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature</em>'.
   * @see org.yazgel.titan.xtext.titan.Feature
   * @generated
   */
  EClass getFeature();

  /**
   * Returns the meta object for the attribute '{@link org.yazgel.titan.xtext.titan.Feature#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.yazgel.titan.xtext.titan.Feature#getName()
   * @see #getFeature()
   * @generated
   */
  EAttribute getFeature_Name();

  /**
   * Returns the meta object for the attribute '{@link org.yazgel.titan.xtext.titan.Feature#isMany <em>Many</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Many</em>'.
   * @see org.yazgel.titan.xtext.titan.Feature#isMany()
   * @see #getFeature()
   * @generated
   */
  EAttribute getFeature_Many();

  /**
   * Returns the meta object for class '{@link org.yazgel.titan.xtext.titan.Reference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reference</em>'.
   * @see org.yazgel.titan.xtext.titan.Reference
   * @generated
   */
  EClass getReference();

  /**
   * Returns the meta object for the reference '{@link org.yazgel.titan.xtext.titan.Reference#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Reference</em>'.
   * @see org.yazgel.titan.xtext.titan.Reference#getReference()
   * @see #getReference()
   * @generated
   */
  EReference getReference_Reference();

  /**
   * Returns the meta object for the reference '{@link org.yazgel.titan.xtext.titan.Reference#getOpposite <em>Opposite</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Opposite</em>'.
   * @see org.yazgel.titan.xtext.titan.Reference#getOpposite()
   * @see #getReference()
   * @generated
   */
  EReference getReference_Opposite();

  /**
   * Returns the meta object for class '{@link org.yazgel.titan.xtext.titan.DataType <em>Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Type</em>'.
   * @see org.yazgel.titan.xtext.titan.DataType
   * @generated
   */
  EClass getDataType();

  /**
   * Returns the meta object for the attribute '{@link org.yazgel.titan.xtext.titan.DataType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.yazgel.titan.xtext.titan.DataType#getType()
   * @see #getDataType()
   * @generated
   */
  EAttribute getDataType_Type();

  /**
   * Returns the meta object for class '{@link org.yazgel.titan.xtext.titan.ParameterFeature <em>Parameter Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter Feature</em>'.
   * @see org.yazgel.titan.xtext.titan.ParameterFeature
   * @generated
   */
  EClass getParameterFeature();

  /**
   * Returns the meta object for the attribute '{@link org.yazgel.titan.xtext.titan.ParameterFeature#isMany <em>Many</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Many</em>'.
   * @see org.yazgel.titan.xtext.titan.ParameterFeature#isMany()
   * @see #getParameterFeature()
   * @generated
   */
  EAttribute getParameterFeature_Many();

  /**
   * Returns the meta object for the attribute '{@link org.yazgel.titan.xtext.titan.ParameterFeature#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.yazgel.titan.xtext.titan.ParameterFeature#getName()
   * @see #getParameterFeature()
   * @generated
   */
  EAttribute getParameterFeature_Name();

  /**
   * Returns the meta object for class '{@link org.yazgel.titan.xtext.titan.ParameterReference <em>Parameter Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter Reference</em>'.
   * @see org.yazgel.titan.xtext.titan.ParameterReference
   * @generated
   */
  EClass getParameterReference();

  /**
   * Returns the meta object for the reference '{@link org.yazgel.titan.xtext.titan.ParameterReference#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Reference</em>'.
   * @see org.yazgel.titan.xtext.titan.ParameterReference#getReference()
   * @see #getParameterReference()
   * @generated
   */
  EReference getParameterReference_Reference();

  /**
   * Returns the meta object for class '{@link org.yazgel.titan.xtext.titan.ParameterDataType <em>Parameter Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter Data Type</em>'.
   * @see org.yazgel.titan.xtext.titan.ParameterDataType
   * @generated
   */
  EClass getParameterDataType();

  /**
   * Returns the meta object for the attribute '{@link org.yazgel.titan.xtext.titan.ParameterDataType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.yazgel.titan.xtext.titan.ParameterDataType#getType()
   * @see #getParameterDataType()
   * @generated
   */
  EAttribute getParameterDataType_Type();

  /**
   * Returns the meta object for enum '{@link org.yazgel.titan.xtext.titan.InternalDSLType <em>Internal DSL Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Internal DSL Type</em>'.
   * @see org.yazgel.titan.xtext.titan.InternalDSLType
   * @generated
   */
  EEnum getInternalDSLType();

  /**
   * Returns the meta object for enum '{@link org.yazgel.titan.xtext.titan.DataTypes <em>Data Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Data Types</em>'.
   * @see org.yazgel.titan.xtext.titan.DataTypes
   * @generated
   */
  EEnum getDataTypes();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  TitanFactory getTitanFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.yazgel.titan.xtext.titan.impl.ModuleImpl <em>Module</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.yazgel.titan.xtext.titan.impl.ModuleImpl
     * @see org.yazgel.titan.xtext.titan.impl.TitanPackageImpl#getModule()
     * @generated
     */
    EClass MODULE = eINSTANCE.getModule();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODULE__NAME = eINSTANCE.getModule_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODULE__TYPE = eINSTANCE.getModule_Type();

    /**
     * The meta object literal for the '<em><b>Packages</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE__PACKAGES = eINSTANCE.getModule_Packages();

    /**
     * The meta object literal for the '{@link org.yazgel.titan.xtext.titan.impl.PackageImpl <em>Package</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.yazgel.titan.xtext.titan.impl.PackageImpl
     * @see org.yazgel.titan.xtext.titan.impl.TitanPackageImpl#getPackage()
     * @generated
     */
    EClass PACKAGE = eINSTANCE.getPackage();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PACKAGE__NAME = eINSTANCE.getPackage_Name();

    /**
     * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE__ENTITIES = eINSTANCE.getPackage_Entities();

    /**
     * The meta object literal for the '<em><b>Entity Builders</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE__ENTITY_BUILDERS = eINSTANCE.getPackage_EntityBuilders();

    /**
     * The meta object literal for the '{@link org.yazgel.titan.xtext.titan.impl.EntityImpl <em>Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.yazgel.titan.xtext.titan.impl.EntityImpl
     * @see org.yazgel.titan.xtext.titan.impl.TitanPackageImpl#getEntity()
     * @generated
     */
    EClass ENTITY = eINSTANCE.getEntity();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTITY__NAME = eINSTANCE.getEntity_Name();

    /**
     * The meta object literal for the '<em><b>Super Entity</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__SUPER_ENTITY = eINSTANCE.getEntity_SuperEntity();

    /**
     * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__FEATURES = eINSTANCE.getEntity_Features();

    /**
     * The meta object literal for the '{@link org.yazgel.titan.xtext.titan.impl.EntityBuilderImpl <em>Entity Builder</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.yazgel.titan.xtext.titan.impl.EntityBuilderImpl
     * @see org.yazgel.titan.xtext.titan.impl.TitanPackageImpl#getEntityBuilder()
     * @generated
     */
    EClass ENTITY_BUILDER = eINSTANCE.getEntityBuilder();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY_BUILDER__NAME = eINSTANCE.getEntityBuilder_Name();

    /**
     * The meta object literal for the '<em><b>Takes</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY_BUILDER__TAKES = eINSTANCE.getEntityBuilder_Takes();

    /**
     * The meta object literal for the '{@link org.yazgel.titan.xtext.titan.impl.methodImpl <em>method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.yazgel.titan.xtext.titan.impl.methodImpl
     * @see org.yazgel.titan.xtext.titan.impl.TitanPackageImpl#getmethod()
     * @generated
     */
    EClass METHOD = eINSTANCE.getmethod();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD__TYPE = eINSTANCE.getmethod_Type();

    /**
     * The meta object literal for the '{@link org.yazgel.titan.xtext.titan.impl.takesImpl <em>takes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.yazgel.titan.xtext.titan.impl.takesImpl
     * @see org.yazgel.titan.xtext.titan.impl.TitanPackageImpl#gettakes()
     * @generated
     */
    EClass TAKES = eINSTANCE.gettakes();

    /**
     * The meta object literal for the '<em><b>Takes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TAKES__TAKES = eINSTANCE.gettakes_Takes();

    /**
     * The meta object literal for the '<em><b>Adds</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TAKES__ADDS = eINSTANCE.gettakes_Adds();

    /**
     * The meta object literal for the '{@link org.yazgel.titan.xtext.titan.impl.addsImpl <em>adds</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.yazgel.titan.xtext.titan.impl.addsImpl
     * @see org.yazgel.titan.xtext.titan.impl.TitanPackageImpl#getadds()
     * @generated
     */
    EClass ADDS = eINSTANCE.getadds();

    /**
     * The meta object literal for the '<em><b>Adds</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADDS__ADDS = eINSTANCE.getadds_Adds();

    /**
     * The meta object literal for the '{@link org.yazgel.titan.xtext.titan.impl.FeatureImpl <em>Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.yazgel.titan.xtext.titan.impl.FeatureImpl
     * @see org.yazgel.titan.xtext.titan.impl.TitanPackageImpl#getFeature()
     * @generated
     */
    EClass FEATURE = eINSTANCE.getFeature();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE__NAME = eINSTANCE.getFeature_Name();

    /**
     * The meta object literal for the '<em><b>Many</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE__MANY = eINSTANCE.getFeature_Many();

    /**
     * The meta object literal for the '{@link org.yazgel.titan.xtext.titan.impl.ReferenceImpl <em>Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.yazgel.titan.xtext.titan.impl.ReferenceImpl
     * @see org.yazgel.titan.xtext.titan.impl.TitanPackageImpl#getReference()
     * @generated
     */
    EClass REFERENCE = eINSTANCE.getReference();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCE__REFERENCE = eINSTANCE.getReference_Reference();

    /**
     * The meta object literal for the '<em><b>Opposite</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCE__OPPOSITE = eINSTANCE.getReference_Opposite();

    /**
     * The meta object literal for the '{@link org.yazgel.titan.xtext.titan.impl.DataTypeImpl <em>Data Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.yazgel.titan.xtext.titan.impl.DataTypeImpl
     * @see org.yazgel.titan.xtext.titan.impl.TitanPackageImpl#getDataType()
     * @generated
     */
    EClass DATA_TYPE = eINSTANCE.getDataType();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_TYPE__TYPE = eINSTANCE.getDataType_Type();

    /**
     * The meta object literal for the '{@link org.yazgel.titan.xtext.titan.impl.ParameterFeatureImpl <em>Parameter Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.yazgel.titan.xtext.titan.impl.ParameterFeatureImpl
     * @see org.yazgel.titan.xtext.titan.impl.TitanPackageImpl#getParameterFeature()
     * @generated
     */
    EClass PARAMETER_FEATURE = eINSTANCE.getParameterFeature();

    /**
     * The meta object literal for the '<em><b>Many</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER_FEATURE__MANY = eINSTANCE.getParameterFeature_Many();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER_FEATURE__NAME = eINSTANCE.getParameterFeature_Name();

    /**
     * The meta object literal for the '{@link org.yazgel.titan.xtext.titan.impl.ParameterReferenceImpl <em>Parameter Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.yazgel.titan.xtext.titan.impl.ParameterReferenceImpl
     * @see org.yazgel.titan.xtext.titan.impl.TitanPackageImpl#getParameterReference()
     * @generated
     */
    EClass PARAMETER_REFERENCE = eINSTANCE.getParameterReference();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_REFERENCE__REFERENCE = eINSTANCE.getParameterReference_Reference();

    /**
     * The meta object literal for the '{@link org.yazgel.titan.xtext.titan.impl.ParameterDataTypeImpl <em>Parameter Data Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.yazgel.titan.xtext.titan.impl.ParameterDataTypeImpl
     * @see org.yazgel.titan.xtext.titan.impl.TitanPackageImpl#getParameterDataType()
     * @generated
     */
    EClass PARAMETER_DATA_TYPE = eINSTANCE.getParameterDataType();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER_DATA_TYPE__TYPE = eINSTANCE.getParameterDataType_Type();

    /**
     * The meta object literal for the '{@link org.yazgel.titan.xtext.titan.InternalDSLType <em>Internal DSL Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.yazgel.titan.xtext.titan.InternalDSLType
     * @see org.yazgel.titan.xtext.titan.impl.TitanPackageImpl#getInternalDSLType()
     * @generated
     */
    EEnum INTERNAL_DSL_TYPE = eINSTANCE.getInternalDSLType();

    /**
     * The meta object literal for the '{@link org.yazgel.titan.xtext.titan.DataTypes <em>Data Types</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.yazgel.titan.xtext.titan.DataTypes
     * @see org.yazgel.titan.xtext.titan.impl.TitanPackageImpl#getDataTypes()
     * @generated
     */
    EEnum DATA_TYPES = eINSTANCE.getDataTypes();

  }

} //TitanPackage
