/**
 */
package org.yazgel.oop;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
	 * The feature id for the '<em><b>Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPACKAGE__PACKAGES = 2;

	/**
	 * The number of structural features of the '<em>OPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPACKAGE_FEATURE_COUNT = 3;

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
	 * The feature id for the '<em><b>Imports</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCLASS__IMPORTS = 3;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' attribute list.
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
	 * The meta object id for the '{@link org.yazgel.oop.impl.OFeatureImpl <em>OFeature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yazgel.oop.impl.OFeatureImpl
	 * @see org.yazgel.oop.impl.OopPackageImpl#getOFeature()
	 * @generated
	 */
	int OFEATURE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFEATURE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFEATURE__TYPE = 1;

	/**
	 * The number of structural features of the '<em>OFeature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFEATURE_FEATURE_COUNT = 2;

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
	int OREFERENCE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OREFERENCE__NAME = OFEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OREFERENCE__TYPE = OFEATURE__TYPE;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OREFERENCE__REFERENCE = OFEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Opposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OREFERENCE__OPPOSITE = OFEATURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>OReference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OREFERENCE_FEATURE_COUNT = OFEATURE_FEATURE_COUNT + 2;

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
	int OREFERENCE_MULTI = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OREFERENCE_MULTI__NAME = OREFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OREFERENCE_MULTI__TYPE = OREFERENCE__TYPE;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OREFERENCE_MULTI__REFERENCE = OREFERENCE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Opposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OREFERENCE_MULTI__OPPOSITE = OREFERENCE__OPPOSITE;

	/**
	 * The feature id for the '<em><b>Unique Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OREFERENCE_MULTI__UNIQUE_INSTANCE = OREFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OReference Multi</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OREFERENCE_MULTI_FEATURE_COUNT = OREFERENCE_FEATURE_COUNT + 1;

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
	int OREFERENCE_SINGLE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OREFERENCE_SINGLE__NAME = OREFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OREFERENCE_SINGLE__TYPE = OREFERENCE__TYPE;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OREFERENCE_SINGLE__REFERENCE = OREFERENCE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Opposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OREFERENCE_SINGLE__OPPOSITE = OREFERENCE__OPPOSITE;

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
	int ODATA_TYPE = 7;

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
	int ODATA_TYPE__TYPE = OFEATURE__TYPE;

	/**
	 * The number of structural features of the '<em>OData Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODATA_TYPE_FEATURE_COUNT = OFEATURE_FEATURE_COUNT + 0;

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
	int ODATA_TYPE_SINGLE = 8;

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
	int ODATA_TYPE_MULTI = 9;

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
	 * The feature id for the '<em><b>Unique Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODATA_TYPE_MULTI__UNIQUE_INSTANCE = ODATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OData Type Multi</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODATA_TYPE_MULTI_FEATURE_COUNT = ODATA_TYPE_FEATURE_COUNT + 1;

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
	int OMETHOD = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OMETHOD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OMETHOD__STATIC = 1;

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
	 * The feature id for the '<em><b>Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OMETHOD__OVERRIDE = 5;

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
	int OCONSTRUCTOR = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCONSTRUCTOR__NAME = OMETHOD__NAME;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCONSTRUCTOR__STATIC = OMETHOD__STATIC;

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
	 * The feature id for the '<em><b>Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCONSTRUCTOR__OVERRIDE = OMETHOD__OVERRIDE;

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
	int OPARAMETER = 12;

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
	int OSTATEMENT = 13;

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
	 * Returns the meta object for the containment reference list '{@link org.yazgel.oop.OPackage#getPackages <em>Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packages</em>'.
	 * @see org.yazgel.oop.OPackage#getPackages()
	 * @see #getOPackage()
	 * @generated
	 */
	EReference getOPackage_Packages();

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
	 * Returns the meta object for the attribute list '{@link org.yazgel.oop.OClass#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Imports</em>'.
	 * @see org.yazgel.oop.OClass#getImports()
	 * @see #getOClass()
	 * @generated
	 */
	EAttribute getOClass_Imports();

	/**
	 * Returns the meta object for the attribute list '{@link org.yazgel.oop.OClass#getImplements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Implements</em>'.
	 * @see org.yazgel.oop.OClass#getImplements()
	 * @see #getOClass()
	 * @generated
	 */
	EAttribute getOClass_Implements();

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
	 * Returns the meta object for the attribute '{@link org.yazgel.oop.OFeature#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.yazgel.oop.OFeature#getType()
	 * @see #getOFeature()
	 * @generated
	 */
	EAttribute getOFeature_Type();

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
	 * Returns the meta object for the reference '{@link org.yazgel.oop.OReference#getOpposite <em>Opposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Opposite</em>'.
	 * @see org.yazgel.oop.OReference#getOpposite()
	 * @see #getOReference()
	 * @generated
	 */
	EReference getOReference_Opposite();

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
	 * Returns the meta object for the attribute '{@link org.yazgel.oop.OMethod#isStatic <em>Static</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Static</em>'.
	 * @see org.yazgel.oop.OMethod#isStatic()
	 * @see #getOMethod()
	 * @generated
	 */
	EAttribute getOMethod_Static();

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
	 * Returns the meta object for the attribute '{@link org.yazgel.oop.OMethod#isOverride <em>Override</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Override</em>'.
	 * @see org.yazgel.oop.OMethod#isOverride()
	 * @see #getOMethod()
	 * @generated
	 */
	EAttribute getOMethod_Override();

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
		 * The meta object literal for the '<em><b>Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPACKAGE__PACKAGES = eINSTANCE.getOPackage_Packages();

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
		 * The meta object literal for the '<em><b>Imports</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OCLASS__IMPORTS = eINSTANCE.getOClass_Imports();

		/**
		 * The meta object literal for the '<em><b>Implements</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OCLASS__IMPLEMENTS = eINSTANCE.getOClass_Implements();

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
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OFEATURE__TYPE = eINSTANCE.getOFeature_Type();

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
		 * The meta object literal for the '<em><b>Opposite</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OREFERENCE__OPPOSITE = eINSTANCE.getOReference_Opposite();

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
		 * The meta object literal for the '<em><b>Static</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OMETHOD__STATIC = eINSTANCE.getOMethod_Static();

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
		 * The meta object literal for the '<em><b>Override</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OMETHOD__OVERRIDE = eINSTANCE.getOMethod_Override();

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

	}

} //OopPackage
