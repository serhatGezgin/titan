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
   * The number of structural features of the '<em>Package</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_FEATURE_COUNT = 2;

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
   * The meta object id for the '{@link org.yazgel.titan.xtext.titan.impl.FeatureImpl <em>Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.yazgel.titan.xtext.titan.impl.FeatureImpl
   * @see org.yazgel.titan.xtext.titan.impl.TitanPackageImpl#getFeature()
   * @generated
   */
  int FEATURE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__NAME = 0;

  /**
   * The number of structural features of the '<em>Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.yazgel.titan.xtext.titan.impl.ReferenceImpl <em>Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.yazgel.titan.xtext.titan.impl.ReferenceImpl
   * @see org.yazgel.titan.xtext.titan.impl.TitanPackageImpl#getReference()
   * @generated
   */
  int REFERENCE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__NAME = FEATURE__NAME;

  /**
   * The feature id for the '<em><b>Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__REFERENCE = FEATURE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Unique</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__UNIQUE = FEATURE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Opposite</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__OPPOSITE = FEATURE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.yazgel.titan.xtext.titan.impl.SingleReferenceImpl <em>Single Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.yazgel.titan.xtext.titan.impl.SingleReferenceImpl
   * @see org.yazgel.titan.xtext.titan.impl.TitanPackageImpl#getSingleReference()
   * @generated
   */
  int SINGLE_REFERENCE = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_REFERENCE__NAME = REFERENCE__NAME;

  /**
   * The feature id for the '<em><b>Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_REFERENCE__REFERENCE = REFERENCE__REFERENCE;

  /**
   * The feature id for the '<em><b>Unique</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_REFERENCE__UNIQUE = REFERENCE__UNIQUE;

  /**
   * The feature id for the '<em><b>Opposite</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_REFERENCE__OPPOSITE = REFERENCE__OPPOSITE;

  /**
   * The number of structural features of the '<em>Single Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_REFERENCE_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.yazgel.titan.xtext.titan.impl.MultiReferenceImpl <em>Multi Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.yazgel.titan.xtext.titan.impl.MultiReferenceImpl
   * @see org.yazgel.titan.xtext.titan.impl.TitanPackageImpl#getMultiReference()
   * @generated
   */
  int MULTI_REFERENCE = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_REFERENCE__NAME = REFERENCE__NAME;

  /**
   * The feature id for the '<em><b>Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_REFERENCE__REFERENCE = REFERENCE__REFERENCE;

  /**
   * The feature id for the '<em><b>Unique</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_REFERENCE__UNIQUE = REFERENCE__UNIQUE;

  /**
   * The feature id for the '<em><b>Opposite</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_REFERENCE__OPPOSITE = REFERENCE__OPPOSITE;

  /**
   * The number of structural features of the '<em>Multi Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_REFERENCE_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.yazgel.titan.xtext.titan.impl.DataTypeImpl <em>Data Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.yazgel.titan.xtext.titan.impl.DataTypeImpl
   * @see org.yazgel.titan.xtext.titan.impl.TitanPackageImpl#getDataType()
   * @generated
   */
  int DATA_TYPE = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE__NAME = FEATURE__NAME;

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
   * The meta object id for the '{@link org.yazgel.titan.xtext.titan.impl.SingleDataTypeImpl <em>Single Data Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.yazgel.titan.xtext.titan.impl.SingleDataTypeImpl
   * @see org.yazgel.titan.xtext.titan.impl.TitanPackageImpl#getSingleDataType()
   * @generated
   */
  int SINGLE_DATA_TYPE = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_DATA_TYPE__NAME = DATA_TYPE__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_DATA_TYPE__TYPE = DATA_TYPE__TYPE;

  /**
   * The number of structural features of the '<em>Single Data Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_DATA_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.yazgel.titan.xtext.titan.impl.MultiDataTypeImpl <em>Multi Data Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.yazgel.titan.xtext.titan.impl.MultiDataTypeImpl
   * @see org.yazgel.titan.xtext.titan.impl.TitanPackageImpl#getMultiDataType()
   * @generated
   */
  int MULTI_DATA_TYPE = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_DATA_TYPE__NAME = DATA_TYPE__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_DATA_TYPE__TYPE = DATA_TYPE__TYPE;

  /**
   * The feature id for the '<em><b>Unique</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_DATA_TYPE__UNIQUE = DATA_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Multi Data Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_DATA_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.yazgel.titan.xtext.titan.InternalDSLType <em>Internal DSL Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.yazgel.titan.xtext.titan.InternalDSLType
   * @see org.yazgel.titan.xtext.titan.impl.TitanPackageImpl#getInternalDSLType()
   * @generated
   */
  int INTERNAL_DSL_TYPE = 10;

  /**
   * The meta object id for the '{@link org.yazgel.titan.xtext.titan.DataTypes <em>Data Types</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.yazgel.titan.xtext.titan.DataTypes
   * @see org.yazgel.titan.xtext.titan.impl.TitanPackageImpl#getDataTypes()
   * @generated
   */
  int DATA_TYPES = 11;


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
   * Returns the meta object for the attribute '{@link org.yazgel.titan.xtext.titan.Reference#isUnique <em>Unique</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unique</em>'.
   * @see org.yazgel.titan.xtext.titan.Reference#isUnique()
   * @see #getReference()
   * @generated
   */
  EAttribute getReference_Unique();

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
   * Returns the meta object for class '{@link org.yazgel.titan.xtext.titan.SingleReference <em>Single Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Single Reference</em>'.
   * @see org.yazgel.titan.xtext.titan.SingleReference
   * @generated
   */
  EClass getSingleReference();

  /**
   * Returns the meta object for class '{@link org.yazgel.titan.xtext.titan.MultiReference <em>Multi Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multi Reference</em>'.
   * @see org.yazgel.titan.xtext.titan.MultiReference
   * @generated
   */
  EClass getMultiReference();

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
   * Returns the meta object for class '{@link org.yazgel.titan.xtext.titan.SingleDataType <em>Single Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Single Data Type</em>'.
   * @see org.yazgel.titan.xtext.titan.SingleDataType
   * @generated
   */
  EClass getSingleDataType();

  /**
   * Returns the meta object for class '{@link org.yazgel.titan.xtext.titan.MultiDataType <em>Multi Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multi Data Type</em>'.
   * @see org.yazgel.titan.xtext.titan.MultiDataType
   * @generated
   */
  EClass getMultiDataType();

  /**
   * Returns the meta object for the attribute '{@link org.yazgel.titan.xtext.titan.MultiDataType#isUnique <em>Unique</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unique</em>'.
   * @see org.yazgel.titan.xtext.titan.MultiDataType#isUnique()
   * @see #getMultiDataType()
   * @generated
   */
  EAttribute getMultiDataType_Unique();

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
     * The meta object literal for the '<em><b>Unique</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REFERENCE__UNIQUE = eINSTANCE.getReference_Unique();

    /**
     * The meta object literal for the '<em><b>Opposite</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCE__OPPOSITE = eINSTANCE.getReference_Opposite();

    /**
     * The meta object literal for the '{@link org.yazgel.titan.xtext.titan.impl.SingleReferenceImpl <em>Single Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.yazgel.titan.xtext.titan.impl.SingleReferenceImpl
     * @see org.yazgel.titan.xtext.titan.impl.TitanPackageImpl#getSingleReference()
     * @generated
     */
    EClass SINGLE_REFERENCE = eINSTANCE.getSingleReference();

    /**
     * The meta object literal for the '{@link org.yazgel.titan.xtext.titan.impl.MultiReferenceImpl <em>Multi Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.yazgel.titan.xtext.titan.impl.MultiReferenceImpl
     * @see org.yazgel.titan.xtext.titan.impl.TitanPackageImpl#getMultiReference()
     * @generated
     */
    EClass MULTI_REFERENCE = eINSTANCE.getMultiReference();

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
     * The meta object literal for the '{@link org.yazgel.titan.xtext.titan.impl.SingleDataTypeImpl <em>Single Data Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.yazgel.titan.xtext.titan.impl.SingleDataTypeImpl
     * @see org.yazgel.titan.xtext.titan.impl.TitanPackageImpl#getSingleDataType()
     * @generated
     */
    EClass SINGLE_DATA_TYPE = eINSTANCE.getSingleDataType();

    /**
     * The meta object literal for the '{@link org.yazgel.titan.xtext.titan.impl.MultiDataTypeImpl <em>Multi Data Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.yazgel.titan.xtext.titan.impl.MultiDataTypeImpl
     * @see org.yazgel.titan.xtext.titan.impl.TitanPackageImpl#getMultiDataType()
     * @generated
     */
    EClass MULTI_DATA_TYPE = eINSTANCE.getMultiDataType();

    /**
     * The meta object literal for the '<em><b>Unique</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MULTI_DATA_TYPE__UNIQUE = eINSTANCE.getMultiDataType_Unique();

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
