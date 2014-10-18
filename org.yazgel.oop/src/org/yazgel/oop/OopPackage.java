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
	 * The feature id for the '<em><b>Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCLASS__IMPORTS = 1;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCLASS__METHODS = 2;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCLASS__FEATURES = 3;

	/**
	 * The number of structural features of the '<em>OClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCLASS_FEATURE_COUNT = 4;

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
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFEATURE__MANY = 1;

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
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OREFERENCE__MANY = OFEATURE__MANY;

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
	 * The meta object id for the '{@link org.yazgel.oop.impl.ODataTypeImpl <em>OData Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yazgel.oop.impl.ODataTypeImpl
	 * @see org.yazgel.oop.impl.OopPackageImpl#getODataType()
	 * @generated
	 */
	int ODATA_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODATA_TYPE__NAME = OFEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODATA_TYPE__MANY = OFEATURE__MANY;

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
	 * The meta object id for the '{@link org.yazgel.oop.impl.OMethodImpl <em>OMethod</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yazgel.oop.impl.OMethodImpl
	 * @see org.yazgel.oop.impl.OopPackageImpl#getOMethod()
	 * @generated
	 */
	int OMETHOD = 6;

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
	 * The feature id for the '<em><b>Loops</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OMETHOD__LOOPS = 5;

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
	int OCONSTRUCTOR = 7;

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
	 * The feature id for the '<em><b>Loops</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCONSTRUCTOR__LOOPS = OMETHOD__LOOPS;

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
	int OPARAMETER = 8;

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
	 * The meta object id for the '{@link org.yazgel.oop.impl.OLoopImpl <em>OLoop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yazgel.oop.impl.OLoopImpl
	 * @see org.yazgel.oop.impl.OopPackageImpl#getOLoop()
	 * @generated
	 */
	int OLOOP = 9;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OLOOP__STATEMENTS = 0;

	/**
	 * The number of structural features of the '<em>OLoop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OLOOP_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>OLoop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OLOOP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.yazgel.oop.impl.OForImpl <em>OFor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yazgel.oop.impl.OForImpl
	 * @see org.yazgel.oop.impl.OopPackageImpl#getOFor()
	 * @generated
	 */
	int OFOR = 10;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFOR__STATEMENTS = OLOOP__STATEMENTS;

	/**
	 * The feature id for the '<em><b>Object Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFOR__OBJECT_NAME = OLOOP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>List Varriable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFOR__LIST_VARRIABLE = OLOOP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>OFor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFOR_FEATURE_COUNT = OLOOP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>OFor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFOR_OPERATION_COUNT = OLOOP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.yazgel.oop.impl.OStatementImpl <em>OStatement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yazgel.oop.impl.OStatementImpl
	 * @see org.yazgel.oop.impl.OopPackageImpl#getOStatement()
	 * @generated
	 */
	int OSTATEMENT = 11;

	/**
	 * The number of structural features of the '<em>OStatement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSTATEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>OStatement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSTATEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.yazgel.oop.impl.OReturnStatementImpl <em>OReturn Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yazgel.oop.impl.OReturnStatementImpl
	 * @see org.yazgel.oop.impl.OopPackageImpl#getOReturnStatement()
	 * @generated
	 */
	int ORETURN_STATEMENT = 12;

	/**
	 * The feature id for the '<em><b>Return Varriable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORETURN_STATEMENT__RETURN_VARRIABLE = OSTATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OReturn Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORETURN_STATEMENT_FEATURE_COUNT = OSTATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>OReturn Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORETURN_STATEMENT_OPERATION_COUNT = OSTATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.yazgel.oop.impl.OVarriableCreateStatementImpl <em>OVarriable Create Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yazgel.oop.impl.OVarriableCreateStatementImpl
	 * @see org.yazgel.oop.impl.OopPackageImpl#getOVarriableCreateStatement()
	 * @generated
	 */
	int OVARRIABLE_CREATE_STATEMENT = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVARRIABLE_CREATE_STATEMENT__NAME = OSTATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Called Constructor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVARRIABLE_CREATE_STATEMENT__CALLED_CONSTRUCTOR = OSTATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>OVarriable Create Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVARRIABLE_CREATE_STATEMENT_FEATURE_COUNT = OSTATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>OVarriable Create Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVARRIABLE_CREATE_STATEMENT_OPERATION_COUNT = OSTATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.yazgel.oop.impl.OMethodCallStatementImpl <em>OMethod Call Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yazgel.oop.impl.OMethodCallStatementImpl
	 * @see org.yazgel.oop.impl.OopPackageImpl#getOMethodCallStatement()
	 * @generated
	 */
	int OMETHOD_CALL_STATEMENT = 14;

	/**
	 * The feature id for the '<em><b>Varriable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OMETHOD_CALL_STATEMENT__VARRIABLE = OSTATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Called Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OMETHOD_CALL_STATEMENT__CALLED_METHOD = OSTATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>OMethod Call Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OMETHOD_CALL_STATEMENT_FEATURE_COUNT = OSTATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>OMethod Call Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OMETHOD_CALL_STATEMENT_OPERATION_COUNT = OSTATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.yazgel.oop.ODataTypes <em>OData Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yazgel.oop.ODataTypes
	 * @see org.yazgel.oop.impl.OopPackageImpl#getODataTypes()
	 * @generated
	 */
	int ODATA_TYPES = 15;


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
	 * Returns the meta object for the reference list '{@link org.yazgel.oop.OClass#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Imports</em>'.
	 * @see org.yazgel.oop.OClass#getImports()
	 * @see #getOClass()
	 * @generated
	 */
	EReference getOClass_Imports();

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
	 * Returns the meta object for the attribute '{@link org.yazgel.oop.OFeature#isMany <em>Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Many</em>'.
	 * @see org.yazgel.oop.OFeature#isMany()
	 * @see #getOFeature()
	 * @generated
	 */
	EAttribute getOFeature_Many();

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
	 * Returns the meta object for the containment reference list '{@link org.yazgel.oop.OMethod#getLoops <em>Loops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Loops</em>'.
	 * @see org.yazgel.oop.OMethod#getLoops()
	 * @see #getOMethod()
	 * @generated
	 */
	EReference getOMethod_Loops();

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
	 * Returns the meta object for class '{@link org.yazgel.oop.OLoop <em>OLoop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OLoop</em>'.
	 * @see org.yazgel.oop.OLoop
	 * @generated
	 */
	EClass getOLoop();

	/**
	 * Returns the meta object for the containment reference list '{@link org.yazgel.oop.OLoop#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see org.yazgel.oop.OLoop#getStatements()
	 * @see #getOLoop()
	 * @generated
	 */
	EReference getOLoop_Statements();

	/**
	 * Returns the meta object for class '{@link org.yazgel.oop.OFor <em>OFor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OFor</em>'.
	 * @see org.yazgel.oop.OFor
	 * @generated
	 */
	EClass getOFor();

	/**
	 * Returns the meta object for the attribute '{@link org.yazgel.oop.OFor#getObjectName <em>Object Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object Name</em>'.
	 * @see org.yazgel.oop.OFor#getObjectName()
	 * @see #getOFor()
	 * @generated
	 */
	EAttribute getOFor_ObjectName();

	/**
	 * Returns the meta object for the reference '{@link org.yazgel.oop.OFor#getListVarriable <em>List Varriable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>List Varriable</em>'.
	 * @see org.yazgel.oop.OFor#getListVarriable()
	 * @see #getOFor()
	 * @generated
	 */
	EReference getOFor_ListVarriable();

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
	 * Returns the meta object for class '{@link org.yazgel.oop.OReturnStatement <em>OReturn Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OReturn Statement</em>'.
	 * @see org.yazgel.oop.OReturnStatement
	 * @generated
	 */
	EClass getOReturnStatement();

	/**
	 * Returns the meta object for the reference '{@link org.yazgel.oop.OReturnStatement#getReturnVarriable <em>Return Varriable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Varriable</em>'.
	 * @see org.yazgel.oop.OReturnStatement#getReturnVarriable()
	 * @see #getOReturnStatement()
	 * @generated
	 */
	EReference getOReturnStatement_ReturnVarriable();

	/**
	 * Returns the meta object for class '{@link org.yazgel.oop.OVarriableCreateStatement <em>OVarriable Create Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OVarriable Create Statement</em>'.
	 * @see org.yazgel.oop.OVarriableCreateStatement
	 * @generated
	 */
	EClass getOVarriableCreateStatement();

	/**
	 * Returns the meta object for the attribute '{@link org.yazgel.oop.OVarriableCreateStatement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.yazgel.oop.OVarriableCreateStatement#getName()
	 * @see #getOVarriableCreateStatement()
	 * @generated
	 */
	EAttribute getOVarriableCreateStatement_Name();

	/**
	 * Returns the meta object for the reference '{@link org.yazgel.oop.OVarriableCreateStatement#getCalledConstructor <em>Called Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Called Constructor</em>'.
	 * @see org.yazgel.oop.OVarriableCreateStatement#getCalledConstructor()
	 * @see #getOVarriableCreateStatement()
	 * @generated
	 */
	EReference getOVarriableCreateStatement_CalledConstructor();

	/**
	 * Returns the meta object for class '{@link org.yazgel.oop.OMethodCallStatement <em>OMethod Call Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OMethod Call Statement</em>'.
	 * @see org.yazgel.oop.OMethodCallStatement
	 * @generated
	 */
	EClass getOMethodCallStatement();

	/**
	 * Returns the meta object for the reference '{@link org.yazgel.oop.OMethodCallStatement#getVarriable <em>Varriable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Varriable</em>'.
	 * @see org.yazgel.oop.OMethodCallStatement#getVarriable()
	 * @see #getOMethodCallStatement()
	 * @generated
	 */
	EReference getOMethodCallStatement_Varriable();

	/**
	 * Returns the meta object for the reference '{@link org.yazgel.oop.OMethodCallStatement#getCalledMethod <em>Called Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Called Method</em>'.
	 * @see org.yazgel.oop.OMethodCallStatement#getCalledMethod()
	 * @see #getOMethodCallStatement()
	 * @generated
	 */
	EReference getOMethodCallStatement_CalledMethod();

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
		 * The meta object literal for the '<em><b>Imports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCLASS__IMPORTS = eINSTANCE.getOClass_Imports();

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
		 * The meta object literal for the '<em><b>Many</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OFEATURE__MANY = eINSTANCE.getOFeature_Many();

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
		 * The meta object literal for the '<em><b>Loops</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OMETHOD__LOOPS = eINSTANCE.getOMethod_Loops();

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
		 * The meta object literal for the '{@link org.yazgel.oop.impl.OLoopImpl <em>OLoop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yazgel.oop.impl.OLoopImpl
		 * @see org.yazgel.oop.impl.OopPackageImpl#getOLoop()
		 * @generated
		 */
		EClass OLOOP = eINSTANCE.getOLoop();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OLOOP__STATEMENTS = eINSTANCE.getOLoop_Statements();

		/**
		 * The meta object literal for the '{@link org.yazgel.oop.impl.OForImpl <em>OFor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yazgel.oop.impl.OForImpl
		 * @see org.yazgel.oop.impl.OopPackageImpl#getOFor()
		 * @generated
		 */
		EClass OFOR = eINSTANCE.getOFor();

		/**
		 * The meta object literal for the '<em><b>Object Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OFOR__OBJECT_NAME = eINSTANCE.getOFor_ObjectName();

		/**
		 * The meta object literal for the '<em><b>List Varriable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OFOR__LIST_VARRIABLE = eINSTANCE.getOFor_ListVarriable();

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
		 * The meta object literal for the '{@link org.yazgel.oop.impl.OReturnStatementImpl <em>OReturn Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yazgel.oop.impl.OReturnStatementImpl
		 * @see org.yazgel.oop.impl.OopPackageImpl#getOReturnStatement()
		 * @generated
		 */
		EClass ORETURN_STATEMENT = eINSTANCE.getOReturnStatement();

		/**
		 * The meta object literal for the '<em><b>Return Varriable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORETURN_STATEMENT__RETURN_VARRIABLE = eINSTANCE.getOReturnStatement_ReturnVarriable();

		/**
		 * The meta object literal for the '{@link org.yazgel.oop.impl.OVarriableCreateStatementImpl <em>OVarriable Create Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yazgel.oop.impl.OVarriableCreateStatementImpl
		 * @see org.yazgel.oop.impl.OopPackageImpl#getOVarriableCreateStatement()
		 * @generated
		 */
		EClass OVARRIABLE_CREATE_STATEMENT = eINSTANCE.getOVarriableCreateStatement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OVARRIABLE_CREATE_STATEMENT__NAME = eINSTANCE.getOVarriableCreateStatement_Name();

		/**
		 * The meta object literal for the '<em><b>Called Constructor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OVARRIABLE_CREATE_STATEMENT__CALLED_CONSTRUCTOR = eINSTANCE.getOVarriableCreateStatement_CalledConstructor();

		/**
		 * The meta object literal for the '{@link org.yazgel.oop.impl.OMethodCallStatementImpl <em>OMethod Call Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yazgel.oop.impl.OMethodCallStatementImpl
		 * @see org.yazgel.oop.impl.OopPackageImpl#getOMethodCallStatement()
		 * @generated
		 */
		EClass OMETHOD_CALL_STATEMENT = eINSTANCE.getOMethodCallStatement();

		/**
		 * The meta object literal for the '<em><b>Varriable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OMETHOD_CALL_STATEMENT__VARRIABLE = eINSTANCE.getOMethodCallStatement_Varriable();

		/**
		 * The meta object literal for the '<em><b>Called Method</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OMETHOD_CALL_STATEMENT__CALLED_METHOD = eINSTANCE.getOMethodCallStatement_CalledMethod();

		/**
		 * The meta object literal for the '{@link org.yazgel.oop.ODataTypes <em>OData Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yazgel.oop.ODataTypes
		 * @see org.yazgel.oop.impl.OopPackageImpl#getODataTypes()
		 * @generated
		 */
		EEnum ODATA_TYPES = eINSTANCE.getODataTypes();

	}

} //OopPackage
