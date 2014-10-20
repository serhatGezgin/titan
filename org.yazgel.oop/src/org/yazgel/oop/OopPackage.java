/**
 */
package org.yazgel.oop;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.yazgel.oop.OopFactory
 * @model kind="package"
 * @generated
 */
public interface OopPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "oop";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.yazgel.org/oop/Oop";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "oop";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OopPackage eINSTANCE = org.yazgel.oop.impl.OopPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.yazgel.oop.impl.OModelImpl <em>OModel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yazgel.oop.impl.OModelImpl
	 * @see org.yazgel.oop.impl.OopPackageImpl#getOModel()
	 * @generated
	 */
	int OMODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OMODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OMODEL__PACKAGES = 1;

	/**
	 * The number of structural features of the '<em>OModel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OMODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>OModel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OMODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.yazgel.oop.impl.OPackageImpl <em>OPackage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yazgel.oop.impl.OPackageImpl
	 * @see org.yazgel.oop.impl.OopPackageImpl#getOPackage()
	 * @generated
	 */
	int OPACKAGE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPACKAGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPACKAGE__CLASSES = 1;

	/**
	 * The number of structural features of the '<em>OPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPACKAGE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>OPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPACKAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.yazgel.oop.impl.OClassImpl <em>OClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yazgel.oop.impl.OClassImpl
	 * @see org.yazgel.oop.impl.OopPackageImpl#getOClass()
	 * @generated
	 */
	int OCLASS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCLASS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCLASS__METHODS = 1;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCLASS__FEATURES = 2;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCLASS__IMPORTS = 3;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCLASS__IMPLEMENTS = 4;

	/**
	 * The number of structural features of the '<em>OClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCLASS_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>OClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.yazgel.oop.impl.OClassImportImpl <em>OClass Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yazgel.oop.impl.OClassImportImpl
	 * @see org.yazgel.oop.impl.OopPackageImpl#getOClassImport()
	 * @generated
	 */
	int OCLASS_IMPORT = 3;

	/**
	 * The feature id for the '<em><b>Imports From Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCLASS_IMPORT__IMPORTS_FROM_DOMAIN = 0;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCLASS_IMPORT__IMPORTS = 1;

	/**
	 * The number of structural features of the '<em>OClass Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCLASS_IMPORT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>OClass Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCLASS_IMPORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.yazgel.oop.impl.OClassImplementImpl <em>OClass Implement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yazgel.oop.impl.OClassImplementImpl
	 * @see org.yazgel.oop.impl.OopPackageImpl#getOClassImplement()
	 * @generated
	 */
	int OCLASS_IMPLEMENT = 4;

	/**
	 * The feature id for the '<em><b>Implements String</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCLASS_IMPLEMENT__IMPLEMENTS_STRING = 0;

	/**
	 * The number of structural features of the '<em>OClass Implement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCLASS_IMPLEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>OClass Implement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCLASS_IMPLEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.yazgel.oop.impl.OFeatureImpl <em>OFeature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yazgel.oop.impl.OFeatureImpl
	 * @see org.yazgel.oop.impl.OopPackageImpl#getOFeature()
	 * @generated
	 */
	int OFEATURE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFEATURE__NAME = 0;

	/**
	 * The number of structural features of the '<em>OFeature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFEATURE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>OFeature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFEATURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.yazgel.oop.impl.OReferenceImpl <em>OReference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yazgel.oop.impl.OReferenceImpl
	 * @see org.yazgel.oop.impl.OopPackageImpl#getOReference()
	 * @generated
	 */
	int OREFERENCE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OREFERENCE__NAME = OFEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OREFERENCE__REFERENCE = OFEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OReference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OREFERENCE_FEATURE_COUNT = OFEATURE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>OReference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OREFERENCE_OPERATION_COUNT = OFEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.yazgel.oop.impl.OReferenceMultiImpl <em>OReference Multi</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yazgel.oop.impl.OReferenceMultiImpl
	 * @see org.yazgel.oop.impl.OopPackageImpl#getOReferenceMulti()
	 * @generated
	 */
	int OREFERENCE_MULTI = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OREFERENCE_MULTI__NAME = OREFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OREFERENCE_MULTI__REFERENCE = OREFERENCE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Multi Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OREFERENCE_MULTI__MULTI_TYPE = OREFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unique Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OREFERENCE_MULTI__UNIQUE_INSTANCE = OREFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>OReference Multi</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OREFERENCE_MULTI_FEATURE_COUNT = OREFERENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>OReference Multi</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OREFERENCE_MULTI_OPERATION_COUNT = OREFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.yazgel.oop.impl.OReferenceSingleImpl <em>OReference Single</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yazgel.oop.impl.OReferenceSingleImpl
	 * @see org.yazgel.oop.impl.OopPackageImpl#getOReferenceSingle()
	 * @generated
	 */
	int OREFERENCE_SINGLE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OREFERENCE_SINGLE__NAME = OREFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OREFERENCE_SINGLE__REFERENCE = OREFERENCE__REFERENCE;

	/**
	 * The number of structural features of the '<em>OReference Single</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OREFERENCE_SINGLE_FEATURE_COUNT = OREFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>OReference Single</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OREFERENCE_SINGLE_OPERATION_COUNT = OREFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.yazgel.oop.impl.ODataTypeImpl <em>OData Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yazgel.oop.impl.ODataTypeImpl
	 * @see org.yazgel.oop.impl.OopPackageImpl#getODataType()
	 * @generated
	 */
	int ODATA_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODATA_TYPE__NAME = OFEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODATA_TYPE__TYPE = OFEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OData Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODATA_TYPE_FEATURE_COUNT = OFEATURE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>OData Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODATA_TYPE_OPERATION_COUNT = OFEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.yazgel.oop.impl.ODataTypeSingleImpl <em>OData Type Single</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yazgel.oop.impl.ODataTypeSingleImpl
	 * @see org.yazgel.oop.impl.OopPackageImpl#getODataTypeSingle()
	 * @generated
	 */
	int ODATA_TYPE_SINGLE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODATA_TYPE_SINGLE__NAME = ODATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODATA_TYPE_SINGLE__TYPE = ODATA_TYPE__TYPE;

	/**
	 * The number of structural features of the '<em>OData Type Single</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODATA_TYPE_SINGLE_FEATURE_COUNT = ODATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>OData Type Single</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODATA_TYPE_SINGLE_OPERATION_COUNT = ODATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.yazgel.oop.impl.ODataTypeMultiImpl <em>OData Type Multi</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yazgel.oop.impl.ODataTypeMultiImpl
	 * @see org.yazgel.oop.impl.OopPackageImpl#getODataTypeMulti()
	 * @generated
	 */
	int ODATA_TYPE_MULTI = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODATA_TYPE_MULTI__NAME = ODATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODATA_TYPE_MULTI__TYPE = ODATA_TYPE__TYPE;

	/**
	 * The feature id for the '<em><b>Multi Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODATA_TYPE_MULTI__MULTI_TYPE = ODATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unique Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODATA_TYPE_MULTI__UNIQUE_INSTANCE = ODATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>OData Type Multi</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODATA_TYPE_MULTI_FEATURE_COUNT = ODATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>OData Type Multi</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODATA_TYPE_MULTI_OPERATION_COUNT = ODATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.yazgel.oop.impl.OMethodImpl <em>OMethod</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yazgel.oop.impl.OMethodImpl
	 * @see org.yazgel.oop.impl.OopPackageImpl#getOMethod()
	 * @generated
	 */
	int OMETHOD = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OMETHOD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OMETHOD__IS_CONST = 1;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OMETHOD__RETURN_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OMETHOD__PARAMETERS = 3;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OMETHOD__STATEMENTS = 4;

	/**
	 * The feature id for the '<em><b>Is Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OMETHOD__IS_OVERRIDE = 5;

	/**
	 * The number of structural features of the '<em>OMethod</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OMETHOD_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>OMethod</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OMETHOD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.yazgel.oop.impl.OConstructorImpl <em>OConstructor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yazgel.oop.impl.OConstructorImpl
	 * @see org.yazgel.oop.impl.OopPackageImpl#getOConstructor()
	 * @generated
	 */
	int OCONSTRUCTOR = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCONSTRUCTOR__NAME = OMETHOD__NAME;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCONSTRUCTOR__IS_CONST = OMETHOD__IS_CONST;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCONSTRUCTOR__RETURN_TYPE = OMETHOD__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCONSTRUCTOR__PARAMETERS = OMETHOD__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCONSTRUCTOR__STATEMENTS = OMETHOD__STATEMENTS;

	/**
	 * The feature id for the '<em><b>Is Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCONSTRUCTOR__IS_OVERRIDE = OMETHOD__IS_OVERRIDE;

	/**
	 * The number of structural features of the '<em>OConstructor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCONSTRUCTOR_FEATURE_COUNT = OMETHOD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>OConstructor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCONSTRUCTOR_OPERATION_COUNT = OMETHOD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.yazgel.oop.impl.OParameterImpl <em>OParameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yazgel.oop.impl.OParameterImpl
	 * @see org.yazgel.oop.impl.OopPackageImpl#getOParameter()
	 * @generated
	 */
	int OPARAMETER = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPARAMETER__TYPE = 1;

	/**
	 * The number of structural features of the '<em>OParameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPARAMETER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>OParameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.yazgel.oop.impl.OStatementImpl <em>OStatement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yazgel.oop.impl.OStatementImpl
	 * @see org.yazgel.oop.impl.OopPackageImpl#getOStatement()
	 * @generated
	 */
	int OSTATEMENT = 15;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSTATEMENT__CONTENT = 0;

	/**
	 * The number of structural features of the '<em>OStatement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSTATEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>OStatement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSTATEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.yazgel.oop.ODataTypes <em>OData Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yazgel.oop.ODataTypes
	 * @see org.yazgel.oop.impl.OopPackageImpl#getODataTypes()
	 * @generated
	 */
	int ODATA_TYPES = 16;

	/**
	 * The meta object id for the '{@link org.yazgel.oop.MultiOFeatureTypes <em>Multi OFeature Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yazgel.oop.MultiOFeatureTypes
	 * @see org.yazgel.oop.impl.OopPackageImpl#getMultiOFeatureTypes()
	 * @generated
	 */
	int MULTI_OFEATURE_TYPES = 17;


	/**
	 * Returns the meta object for class '{@link org.yazgel.oop.OModel <em>OModel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OModel</em>'.
	 * @see org.yazgel.oop.OModel
	 * @generated
	 */
	EClass getOModel();

	/**
	 * Returns the meta object for the attribute '{@link org.yazgel.oop.OModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.yazgel.oop.OModel#getName()
	 * @see #getOModel()
	 * @generated
	 */
	EAttribute getOModel_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.yazgel.oop.OModel#getPackages <em>Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packages</em>'.
	 * @see org.yazgel.oop.OModel#getPackages()
	 * @see #getOModel()
	 * @generated
	 */
	EReference getOModel_Packages();

	/**
	 * Returns the meta object for class '{@link org.yazgel.oop.OPackage <em>OPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OPackage</em>'.
	 * @see org.yazgel.oop.OPackage
	 * @generated
	 */
	EClass getOPackage();

	/**
	 * Returns the meta object for the attribute '{@link org.yazgel.oop.OPackage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.yazgel.oop.OPackage#getName()
	 * @see #getOPackage()
	 * @generated
	 */
	EAttribute getOPackage_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.yazgel.oop.OPackage#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classes</em>'.
	 * @see org.yazgel.oop.OPackage#getClasses()
	 * @see #getOPackage()
	 * @generated
	 */
	EReference getOPackage_Classes();

	/**
	 * Returns the meta object for class '{@link org.yazgel.oop.OClass <em>OClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OClass</em>'.
	 * @see org.yazgel.oop.OClass
	 * @generated
	 */
	EClass getOClass();

	/**
	 * Returns the meta object for the attribute '{@link org.yazgel.oop.OClass#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.yazgel.oop.OClass#getName()
	 * @see #getOClass()
	 * @generated
	 */
	EAttribute getOClass_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.yazgel.oop.OClass#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Methods</em>'.
	 * @see org.yazgel.oop.OClass#getMethods()
	 * @see #getOClass()
	 * @generated
	 */
	EReference getOClass_Methods();

	/**
	 * Returns the meta object for the containment reference list '{@link org.yazgel.oop.OClass#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see org.yazgel.oop.OClass#getFeatures()
	 * @see #getOClass()
	 * @generated
	 */
	EReference getOClass_Features();

	/**
	 * Returns the meta object for the reference '{@link org.yazgel.oop.OClass#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Imports</em>'.
	 * @see org.yazgel.oop.OClass#getImports()
	 * @see #getOClass()
	 * @generated
	 */
	EReference getOClass_Imports();

	/**
	 * Returns the meta object for the reference '{@link org.yazgel.oop.OClass#getImplements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Implements</em>'.
	 * @see org.yazgel.oop.OClass#getImplements()
	 * @see #getOClass()
	 * @generated
	 */
	EReference getOClass_Implements();

	/**
	 * Returns the meta object for class '{@link org.yazgel.oop.OClassImport <em>OClass Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OClass Import</em>'.
	 * @see org.yazgel.oop.OClassImport
	 * @generated
	 */
	EClass getOClassImport();

	/**
	 * Returns the meta object for the reference list '{@link org.yazgel.oop.OClassImport#getImportsFromDomain <em>Imports From Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Imports From Domain</em>'.
	 * @see org.yazgel.oop.OClassImport#getImportsFromDomain()
	 * @see #getOClassImport()
	 * @generated
	 */
	EReference getOClassImport_ImportsFromDomain();

	/**
	 * Returns the meta object for the attribute list '{@link org.yazgel.oop.OClassImport#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Imports</em>'.
	 * @see org.yazgel.oop.OClassImport#getImports()
	 * @see #getOClassImport()
	 * @generated
	 */
	EAttribute getOClassImport_Imports();

	/**
	 * Returns the meta object for class '{@link org.yazgel.oop.OClassImplement <em>OClass Implement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OClass Implement</em>'.
	 * @see org.yazgel.oop.OClassImplement
	 * @generated
	 */
	EClass getOClassImplement();

	/**
	 * Returns the meta object for the attribute list '{@link org.yazgel.oop.OClassImplement#getImplementsString <em>Implements String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Implements String</em>'.
	 * @see org.yazgel.oop.OClassImplement#getImplementsString()
	 * @see #getOClassImplement()
	 * @generated
	 */
	EAttribute getOClassImplement_ImplementsString();

	/**
	 * Returns the meta object for class '{@link org.yazgel.oop.OFeature <em>OFeature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OFeature</em>'.
	 * @see org.yazgel.oop.OFeature
	 * @generated
	 */
	EClass getOFeature();

	/**
	 * Returns the meta object for the attribute '{@link org.yazgel.oop.OFeature#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.yazgel.oop.OFeature#getName()
	 * @see #getOFeature()
	 * @generated
	 */
	EAttribute getOFeature_Name();

	/**
	 * Returns the meta object for class '{@link org.yazgel.oop.OReference <em>OReference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OReference</em>'.
	 * @see org.yazgel.oop.OReference
	 * @generated
	 */
	EClass getOReference();

	/**
	 * Returns the meta object for the reference '{@link org.yazgel.oop.OReference#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see org.yazgel.oop.OReference#getReference()
	 * @see #getOReference()
	 * @generated
	 */
	EReference getOReference_Reference();

	/**
	 * Returns the meta object for class '{@link org.yazgel.oop.OReferenceMulti <em>OReference Multi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OReference Multi</em>'.
	 * @see org.yazgel.oop.OReferenceMulti
	 * @generated
	 */
	EClass getOReferenceMulti();

	/**
	 * Returns the meta object for the attribute '{@link org.yazgel.oop.OReferenceMulti#getMultiType <em>Multi Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multi Type</em>'.
	 * @see org.yazgel.oop.OReferenceMulti#getMultiType()
	 * @see #getOReferenceMulti()
	 * @generated
	 */
	EAttribute getOReferenceMulti_MultiType();

	/**
	 * Returns the meta object for the attribute '{@link org.yazgel.oop.OReferenceMulti#isUniqueInstance <em>Unique Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique Instance</em>'.
	 * @see org.yazgel.oop.OReferenceMulti#isUniqueInstance()
	 * @see #getOReferenceMulti()
	 * @generated
	 */
	EAttribute getOReferenceMulti_UniqueInstance();

	/**
	 * Returns the meta object for class '{@link org.yazgel.oop.OReferenceSingle <em>OReference Single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OReference Single</em>'.
	 * @see org.yazgel.oop.OReferenceSingle
	 * @generated
	 */
	EClass getOReferenceSingle();

	/**
	 * Returns the meta object for class '{@link org.yazgel.oop.ODataType <em>OData Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OData Type</em>'.
	 * @see org.yazgel.oop.ODataType
	 * @generated
	 */
	EClass getODataType();

	/**
	 * Returns the meta object for the attribute '{@link org.yazgel.oop.ODataType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.yazgel.oop.ODataType#getType()
	 * @see #getODataType()
	 * @generated
	 */
	EAttribute getODataType_Type();

	/**
	 * Returns the meta object for class '{@link org.yazgel.oop.ODataTypeSingle <em>OData Type Single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OData Type Single</em>'.
	 * @see org.yazgel.oop.ODataTypeSingle
	 * @generated
	 */
	EClass getODataTypeSingle();

	/**
	 * Returns the meta object for class '{@link org.yazgel.oop.ODataTypeMulti <em>OData Type Multi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OData Type Multi</em>'.
	 * @see org.yazgel.oop.ODataTypeMulti
	 * @generated
	 */
	EClass getODataTypeMulti();

	/**
	 * Returns the meta object for the attribute '{@link org.yazgel.oop.ODataTypeMulti#getMultiType <em>Multi Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multi Type</em>'.
	 * @see org.yazgel.oop.ODataTypeMulti#getMultiType()
	 * @see #getODataTypeMulti()
	 * @generated
	 */
	EAttribute getODataTypeMulti_MultiType();

	/**
	 * Returns the meta object for the attribute '{@link org.yazgel.oop.ODataTypeMulti#isUniqueInstance <em>Unique Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique Instance</em>'.
	 * @see org.yazgel.oop.ODataTypeMulti#isUniqueInstance()
	 * @see #getODataTypeMulti()
	 * @generated
	 */
	EAttribute getODataTypeMulti_UniqueInstance();

	/**
	 * Returns the meta object for class '{@link org.yazgel.oop.OMethod <em>OMethod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OMethod</em>'.
	 * @see org.yazgel.oop.OMethod
	 * @generated
	 */
	EClass getOMethod();

	/**
	 * Returns the meta object for the attribute '{@link org.yazgel.oop.OMethod#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.yazgel.oop.OMethod#getName()
	 * @see #getOMethod()
	 * @generated
	 */
	EAttribute getOMethod_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.yazgel.oop.OMethod#isIsConst <em>Is Const</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Const</em>'.
	 * @see org.yazgel.oop.OMethod#isIsConst()
	 * @see #getOMethod()
	 * @generated
	 */
	EAttribute getOMethod_IsConst();

	/**
	 * Returns the meta object for the attribute '{@link org.yazgel.oop.OMethod#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Type</em>'.
	 * @see org.yazgel.oop.OMethod#getReturnType()
	 * @see #getOMethod()
	 * @generated
	 */
	EAttribute getOMethod_ReturnType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.yazgel.oop.OMethod#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.yazgel.oop.OMethod#getParameters()
	 * @see #getOMethod()
	 * @generated
	 */
	EReference getOMethod_Parameters();

	/**
	 * Returns the meta object for the containment reference list '{@link org.yazgel.oop.OMethod#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see org.yazgel.oop.OMethod#getStatements()
	 * @see #getOMethod()
	 * @generated
	 */
	EReference getOMethod_Statements();

	/**
	 * Returns the meta object for the attribute '{@link org.yazgel.oop.OMethod#isIsOverride <em>Is Override</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Override</em>'.
	 * @see org.yazgel.oop.OMethod#isIsOverride()
	 * @see #getOMethod()
	 * @generated
	 */
	EAttribute getOMethod_IsOverride();

	/**
	 * Returns the meta object for class '{@link org.yazgel.oop.OConstructor <em>OConstructor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OConstructor</em>'.
	 * @see org.yazgel.oop.OConstructor
	 * @generated
	 */
	EClass getOConstructor();

	/**
	 * Returns the meta object for class '{@link org.yazgel.oop.OParameter <em>OParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OParameter</em>'.
	 * @see org.yazgel.oop.OParameter
	 * @generated
	 */
	EClass getOParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.yazgel.oop.OParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.yazgel.oop.OParameter#getName()
	 * @see #getOParameter()
	 * @generated
	 */
	EAttribute getOParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.yazgel.oop.OParameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.yazgel.oop.OParameter#getType()
	 * @see #getOParameter()
	 * @generated
	 */
	EAttribute getOParameter_Type();

	/**
	 * Returns the meta object for class '{@link org.yazgel.oop.OStatement <em>OStatement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OStatement</em>'.
	 * @see org.yazgel.oop.OStatement
	 * @generated
	 */
	EClass getOStatement();

	/**
	 * Returns the meta object for the attribute '{@link org.yazgel.oop.OStatement#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see org.yazgel.oop.OStatement#getContent()
	 * @see #getOStatement()
	 * @generated
	 */
	EAttribute getOStatement_Content();

	/**
	 * Returns the meta object for enum '{@link org.yazgel.oop.ODataTypes <em>OData Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>OData Types</em>'.
	 * @see org.yazgel.oop.ODataTypes
	 * @generated
	 */
	EEnum getODataTypes();

	/**
	 * Returns the meta object for enum '{@link org.yazgel.oop.MultiOFeatureTypes <em>Multi OFeature Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Multi OFeature Types</em>'.
	 * @see org.yazgel.oop.MultiOFeatureTypes
	 * @generated
	 */
	EEnum getMultiOFeatureTypes();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OopFactory getOopFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.yazgel.oop.impl.OModelImpl <em>OModel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yazgel.oop.impl.OModelImpl
		 * @see org.yazgel.oop.impl.OopPackageImpl#getOModel()
		 * @generated
		 */
		EClass OMODEL = eINSTANCE.getOModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OMODEL__NAME = eINSTANCE.getOModel_Name();

		/**
		 * The meta object literal for the '<em><b>Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OMODEL__PACKAGES = eINSTANCE.getOModel_Packages();

		/**
		 * The meta object literal for the '{@link org.yazgel.oop.impl.OPackageImpl <em>OPackage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yazgel.oop.impl.OPackageImpl
		 * @see org.yazgel.oop.impl.OopPackageImpl#getOPackage()
		 * @generated
		 */
		EClass OPACKAGE = eINSTANCE.getOPackage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPACKAGE__NAME = eINSTANCE.getOPackage_Name();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPACKAGE__CLASSES = eINSTANCE.getOPackage_Classes();

		/**
		 * The meta object literal for the '{@link org.yazgel.oop.impl.OClassImpl <em>OClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yazgel.oop.impl.OClassImpl
		 * @see org.yazgel.oop.impl.OopPackageImpl#getOClass()
		 * @generated
		 */
		EClass OCLASS = eINSTANCE.getOClass();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OCLASS__NAME = eINSTANCE.getOClass_Name();

		/**
		 * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCLASS__METHODS = eINSTANCE.getOClass_Methods();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCLASS__FEATURES = eINSTANCE.getOClass_Features();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCLASS__IMPORTS = eINSTANCE.getOClass_Imports();

		/**
		 * The meta object literal for the '<em><b>Implements</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCLASS__IMPLEMENTS = eINSTANCE.getOClass_Implements();

		/**
		 * The meta object literal for the '{@link org.yazgel.oop.impl.OClassImportImpl <em>OClass Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yazgel.oop.impl.OClassImportImpl
		 * @see org.yazgel.oop.impl.OopPackageImpl#getOClassImport()
		 * @generated
		 */
		EClass OCLASS_IMPORT = eINSTANCE.getOClassImport();

		/**
		 * The meta object literal for the '<em><b>Imports From Domain</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCLASS_IMPORT__IMPORTS_FROM_DOMAIN = eINSTANCE.getOClassImport_ImportsFromDomain();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OCLASS_IMPORT__IMPORTS = eINSTANCE.getOClassImport_Imports();

		/**
		 * The meta object literal for the '{@link org.yazgel.oop.impl.OClassImplementImpl <em>OClass Implement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yazgel.oop.impl.OClassImplementImpl
		 * @see org.yazgel.oop.impl.OopPackageImpl#getOClassImplement()
		 * @generated
		 */
		EClass OCLASS_IMPLEMENT = eINSTANCE.getOClassImplement();

		/**
		 * The meta object literal for the '<em><b>Implements String</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OCLASS_IMPLEMENT__IMPLEMENTS_STRING = eINSTANCE.getOClassImplement_ImplementsString();

		/**
		 * The meta object literal for the '{@link org.yazgel.oop.impl.OFeatureImpl <em>OFeature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yazgel.oop.impl.OFeatureImpl
		 * @see org.yazgel.oop.impl.OopPackageImpl#getOFeature()
		 * @generated
		 */
		EClass OFEATURE = eINSTANCE.getOFeature();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OFEATURE__NAME = eINSTANCE.getOFeature_Name();

		/**
		 * The meta object literal for the '{@link org.yazgel.oop.impl.OReferenceImpl <em>OReference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yazgel.oop.impl.OReferenceImpl
		 * @see org.yazgel.oop.impl.OopPackageImpl#getOReference()
		 * @generated
		 */
		EClass OREFERENCE = eINSTANCE.getOReference();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OREFERENCE__REFERENCE = eINSTANCE.getOReference_Reference();

		/**
		 * The meta object literal for the '{@link org.yazgel.oop.impl.OReferenceMultiImpl <em>OReference Multi</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yazgel.oop.impl.OReferenceMultiImpl
		 * @see org.yazgel.oop.impl.OopPackageImpl#getOReferenceMulti()
		 * @generated
		 */
		EClass OREFERENCE_MULTI = eINSTANCE.getOReferenceMulti();

		/**
		 * The meta object literal for the '<em><b>Multi Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OREFERENCE_MULTI__MULTI_TYPE = eINSTANCE.getOReferenceMulti_MultiType();

		/**
		 * The meta object literal for the '<em><b>Unique Instance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OREFERENCE_MULTI__UNIQUE_INSTANCE = eINSTANCE.getOReferenceMulti_UniqueInstance();

		/**
		 * The meta object literal for the '{@link org.yazgel.oop.impl.OReferenceSingleImpl <em>OReference Single</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yazgel.oop.impl.OReferenceSingleImpl
		 * @see org.yazgel.oop.impl.OopPackageImpl#getOReferenceSingle()
		 * @generated
		 */
		EClass OREFERENCE_SINGLE = eINSTANCE.getOReferenceSingle();

		/**
		 * The meta object literal for the '{@link org.yazgel.oop.impl.ODataTypeImpl <em>OData Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yazgel.oop.impl.ODataTypeImpl
		 * @see org.yazgel.oop.impl.OopPackageImpl#getODataType()
		 * @generated
		 */
		EClass ODATA_TYPE = eINSTANCE.getODataType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ODATA_TYPE__TYPE = eINSTANCE.getODataType_Type();

		/**
		 * The meta object literal for the '{@link org.yazgel.oop.impl.ODataTypeSingleImpl <em>OData Type Single</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yazgel.oop.impl.ODataTypeSingleImpl
		 * @see org.yazgel.oop.impl.OopPackageImpl#getODataTypeSingle()
		 * @generated
		 */
		EClass ODATA_TYPE_SINGLE = eINSTANCE.getODataTypeSingle();

		/**
		 * The meta object literal for the '{@link org.yazgel.oop.impl.ODataTypeMultiImpl <em>OData Type Multi</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yazgel.oop.impl.ODataTypeMultiImpl
		 * @see org.yazgel.oop.impl.OopPackageImpl#getODataTypeMulti()
		 * @generated
		 */
		EClass ODATA_TYPE_MULTI = eINSTANCE.getODataTypeMulti();

		/**
		 * The meta object literal for the '<em><b>Multi Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ODATA_TYPE_MULTI__MULTI_TYPE = eINSTANCE.getODataTypeMulti_MultiType();

		/**
		 * The meta object literal for the '<em><b>Unique Instance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ODATA_TYPE_MULTI__UNIQUE_INSTANCE = eINSTANCE.getODataTypeMulti_UniqueInstance();

		/**
		 * The meta object literal for the '{@link org.yazgel.oop.impl.OMethodImpl <em>OMethod</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yazgel.oop.impl.OMethodImpl
		 * @see org.yazgel.oop.impl.OopPackageImpl#getOMethod()
		 * @generated
		 */
		EClass OMETHOD = eINSTANCE.getOMethod();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OMETHOD__NAME = eINSTANCE.getOMethod_Name();

		/**
		 * The meta object literal for the '<em><b>Is Const</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OMETHOD__IS_CONST = eINSTANCE.getOMethod_IsConst();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OMETHOD__RETURN_TYPE = eINSTANCE.getOMethod_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OMETHOD__PARAMETERS = eINSTANCE.getOMethod_Parameters();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OMETHOD__STATEMENTS = eINSTANCE.getOMethod_Statements();

		/**
		 * The meta object literal for the '<em><b>Is Override</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OMETHOD__IS_OVERRIDE = eINSTANCE.getOMethod_IsOverride();

		/**
		 * The meta object literal for the '{@link org.yazgel.oop.impl.OConstructorImpl <em>OConstructor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yazgel.oop.impl.OConstructorImpl
		 * @see org.yazgel.oop.impl.OopPackageImpl#getOConstructor()
		 * @generated
		 */
		EClass OCONSTRUCTOR = eINSTANCE.getOConstructor();

		/**
		 * The meta object literal for the '{@link org.yazgel.oop.impl.OParameterImpl <em>OParameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yazgel.oop.impl.OParameterImpl
		 * @see org.yazgel.oop.impl.OopPackageImpl#getOParameter()
		 * @generated
		 */
		EClass OPARAMETER = eINSTANCE.getOParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPARAMETER__NAME = eINSTANCE.getOParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPARAMETER__TYPE = eINSTANCE.getOParameter_Type();

		/**
		 * The meta object literal for the '{@link org.yazgel.oop.impl.OStatementImpl <em>OStatement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yazgel.oop.impl.OStatementImpl
		 * @see org.yazgel.oop.impl.OopPackageImpl#getOStatement()
		 * @generated
		 */
		EClass OSTATEMENT = eINSTANCE.getOStatement();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSTATEMENT__CONTENT = eINSTANCE.getOStatement_Content();

		/**
		 * The meta object literal for the '{@link org.yazgel.oop.ODataTypes <em>OData Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yazgel.oop.ODataTypes
		 * @see org.yazgel.oop.impl.OopPackageImpl#getODataTypes()
		 * @generated
		 */
		EEnum ODATA_TYPES = eINSTANCE.getODataTypes();

		/**
		 * The meta object literal for the '{@link org.yazgel.oop.MultiOFeatureTypes <em>Multi OFeature Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yazgel.oop.MultiOFeatureTypes
		 * @see org.yazgel.oop.impl.OopPackageImpl#getMultiOFeatureTypes()
		 * @generated
		 */
		EEnum MULTI_OFEATURE_TYPES = eINSTANCE.getMultiOFeatureTypes();

	}

} //OopPackage
