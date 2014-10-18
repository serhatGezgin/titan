/**
 */
package org.yazgel.oop.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.yazgel.oop.OClass;
import org.yazgel.oop.OConstructor;
import org.yazgel.oop.ODataType;
import org.yazgel.oop.ODataTypes;
import org.yazgel.oop.OFeature;
import org.yazgel.oop.OFor;
import org.yazgel.oop.OLoop;
import org.yazgel.oop.OMethod;
import org.yazgel.oop.OMethodCallStatement;
import org.yazgel.oop.OModel;
import org.yazgel.oop.OPackage;
import org.yazgel.oop.OParameter;
import org.yazgel.oop.OReference;
import org.yazgel.oop.OReturnStatement;
import org.yazgel.oop.OStatement;
import org.yazgel.oop.OVarriableCreateStatement;
import org.yazgel.oop.OopFactory;
import org.yazgel.oop.OopPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OopPackageImpl extends EPackageImpl implements OopPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oConstructorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oLoopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oForEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oReturnStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oVarriableCreateStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oMethodCallStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum oDataTypesEEnum = null;

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
	 * @see org.yazgel.oop.OopPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OopPackageImpl() {
		super(eNS_URI, OopFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link OopPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OopPackage init() {
		if (isInited) return (OopPackage)EPackage.Registry.INSTANCE.getEPackage(OopPackage.eNS_URI);

		// Obtain or create and register package
		OopPackageImpl theOopPackage = (OopPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OopPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OopPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theOopPackage.createPackageContents();

		// Initialize created meta-data
		theOopPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOopPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OopPackage.eNS_URI, theOopPackage);
		return theOopPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOModel() {
		return oModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOModel_Name() {
		return (EAttribute)oModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOModel_Packages() {
		return (EReference)oModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOPackage() {
		return oPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOPackage_Name() {
		return (EAttribute)oPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOPackage_Classes() {
		return (EReference)oPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOClass() {
		return oClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOClass_Name() {
		return (EAttribute)oClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOClass_Imports() {
		return (EReference)oClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOClass_Methods() {
		return (EReference)oClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOClass_Features() {
		return (EReference)oClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOFeature() {
		return oFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOFeature_Name() {
		return (EAttribute)oFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOFeature_Many() {
		return (EAttribute)oFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOReference() {
		return oReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOReference_Reference() {
		return (EReference)oReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getODataType() {
		return oDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getODataType_Type() {
		return (EAttribute)oDataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOMethod() {
		return oMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOMethod_Name() {
		return (EAttribute)oMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOMethod_IsConst() {
		return (EAttribute)oMethodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOMethod_ReturnType() {
		return (EAttribute)oMethodEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOMethod_Parameters() {
		return (EReference)oMethodEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOMethod_Statements() {
		return (EReference)oMethodEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOMethod_Loops() {
		return (EReference)oMethodEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOConstructor() {
		return oConstructorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOParameter() {
		return oParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOParameter_Name() {
		return (EAttribute)oParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOParameter_Type() {
		return (EAttribute)oParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOLoop() {
		return oLoopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOLoop_Statements() {
		return (EReference)oLoopEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOFor() {
		return oForEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOFor_ObjectName() {
		return (EAttribute)oForEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOFor_ListVarriable() {
		return (EReference)oForEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOStatement() {
		return oStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOReturnStatement() {
		return oReturnStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOReturnStatement_ReturnVarriable() {
		return (EReference)oReturnStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOVarriableCreateStatement() {
		return oVarriableCreateStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOVarriableCreateStatement_Name() {
		return (EAttribute)oVarriableCreateStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOVarriableCreateStatement_CalledConstructor() {
		return (EReference)oVarriableCreateStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOMethodCallStatement() {
		return oMethodCallStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOMethodCallStatement_Varriable() {
		return (EReference)oMethodCallStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOMethodCallStatement_CalledMethod() {
		return (EReference)oMethodCallStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getODataTypes() {
		return oDataTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OopFactory getOopFactory() {
		return (OopFactory)getEFactoryInstance();
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
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		oModelEClass = createEClass(OMODEL);
		createEAttribute(oModelEClass, OMODEL__NAME);
		createEReference(oModelEClass, OMODEL__PACKAGES);

		oPackageEClass = createEClass(OPACKAGE);
		createEAttribute(oPackageEClass, OPACKAGE__NAME);
		createEReference(oPackageEClass, OPACKAGE__CLASSES);

		oClassEClass = createEClass(OCLASS);
		createEAttribute(oClassEClass, OCLASS__NAME);
		createEReference(oClassEClass, OCLASS__IMPORTS);
		createEReference(oClassEClass, OCLASS__METHODS);
		createEReference(oClassEClass, OCLASS__FEATURES);

		oFeatureEClass = createEClass(OFEATURE);
		createEAttribute(oFeatureEClass, OFEATURE__NAME);
		createEAttribute(oFeatureEClass, OFEATURE__MANY);

		oReferenceEClass = createEClass(OREFERENCE);
		createEReference(oReferenceEClass, OREFERENCE__REFERENCE);

		oDataTypeEClass = createEClass(ODATA_TYPE);
		createEAttribute(oDataTypeEClass, ODATA_TYPE__TYPE);

		oMethodEClass = createEClass(OMETHOD);
		createEAttribute(oMethodEClass, OMETHOD__NAME);
		createEAttribute(oMethodEClass, OMETHOD__IS_CONST);
		createEAttribute(oMethodEClass, OMETHOD__RETURN_TYPE);
		createEReference(oMethodEClass, OMETHOD__PARAMETERS);
		createEReference(oMethodEClass, OMETHOD__STATEMENTS);
		createEReference(oMethodEClass, OMETHOD__LOOPS);

		oConstructorEClass = createEClass(OCONSTRUCTOR);

		oParameterEClass = createEClass(OPARAMETER);
		createEAttribute(oParameterEClass, OPARAMETER__NAME);
		createEAttribute(oParameterEClass, OPARAMETER__TYPE);

		oLoopEClass = createEClass(OLOOP);
		createEReference(oLoopEClass, OLOOP__STATEMENTS);

		oForEClass = createEClass(OFOR);
		createEAttribute(oForEClass, OFOR__OBJECT_NAME);
		createEReference(oForEClass, OFOR__LIST_VARRIABLE);

		oStatementEClass = createEClass(OSTATEMENT);

		oReturnStatementEClass = createEClass(ORETURN_STATEMENT);
		createEReference(oReturnStatementEClass, ORETURN_STATEMENT__RETURN_VARRIABLE);

		oVarriableCreateStatementEClass = createEClass(OVARRIABLE_CREATE_STATEMENT);
		createEAttribute(oVarriableCreateStatementEClass, OVARRIABLE_CREATE_STATEMENT__NAME);
		createEReference(oVarriableCreateStatementEClass, OVARRIABLE_CREATE_STATEMENT__CALLED_CONSTRUCTOR);

		oMethodCallStatementEClass = createEClass(OMETHOD_CALL_STATEMENT);
		createEReference(oMethodCallStatementEClass, OMETHOD_CALL_STATEMENT__VARRIABLE);
		createEReference(oMethodCallStatementEClass, OMETHOD_CALL_STATEMENT__CALLED_METHOD);

		// Create enums
		oDataTypesEEnum = createEEnum(ODATA_TYPES);
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
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		oReferenceEClass.getESuperTypes().add(this.getOFeature());
		oDataTypeEClass.getESuperTypes().add(this.getOFeature());
		oConstructorEClass.getESuperTypes().add(this.getOMethod());
		oForEClass.getESuperTypes().add(this.getOLoop());
		oReturnStatementEClass.getESuperTypes().add(this.getOStatement());
		oVarriableCreateStatementEClass.getESuperTypes().add(this.getOStatement());
		oMethodCallStatementEClass.getESuperTypes().add(this.getOStatement());

		// Initialize classes, features, and operations; add parameters
		initEClass(oModelEClass, OModel.class, "OModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, OModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOModel_Packages(), this.getOPackage(), null, "packages", null, 0, -1, OModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oPackageEClass, OPackage.class, "OPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOPackage_Name(), ecorePackage.getEString(), "name", null, 0, 1, OPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOPackage_Classes(), this.getOClass(), null, "classes", null, 0, -1, OPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oClassEClass, OClass.class, "OClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOClass_Name(), ecorePackage.getEString(), "name", null, 0, 1, OClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOClass_Imports(), this.getOClass(), null, "imports", null, 0, -1, OClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOClass_Methods(), this.getOMethod(), null, "methods", null, 0, -1, OClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOClass_Features(), this.getOFeature(), null, "features", null, 0, -1, OClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oFeatureEClass, OFeature.class, "OFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOFeature_Name(), ecorePackage.getEString(), "name", null, 0, 1, OFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOFeature_Many(), ecorePackage.getEBoolean(), "many", null, 0, 1, OFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oReferenceEClass, OReference.class, "OReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOReference_Reference(), this.getOClass(), null, "reference", null, 0, 1, OReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oDataTypeEClass, ODataType.class, "ODataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getODataType_Type(), this.getODataTypes(), "type", null, 0, 1, ODataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oMethodEClass, OMethod.class, "OMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOMethod_Name(), ecorePackage.getEString(), "name", null, 0, 1, OMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOMethod_IsConst(), ecorePackage.getEBoolean(), "isConst", null, 0, 1, OMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOMethod_ReturnType(), ecorePackage.getEString(), "returnType", null, 0, 1, OMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOMethod_Parameters(), this.getOParameter(), null, "parameters", null, 0, -1, OMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOMethod_Statements(), this.getOStatement(), null, "statements", null, 0, -1, OMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOMethod_Loops(), this.getOLoop(), null, "loops", null, 0, -1, OMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oConstructorEClass, OConstructor.class, "OConstructor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(oParameterEClass, OParameter.class, "OParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, OParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOParameter_Type(), ecorePackage.getEString(), "type", null, 0, 1, OParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oLoopEClass, OLoop.class, "OLoop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOLoop_Statements(), this.getOStatement(), null, "statements", null, 0, -1, OLoop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oForEClass, OFor.class, "OFor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOFor_ObjectName(), ecorePackage.getEString(), "objectName", null, 0, 1, OFor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOFor_ListVarriable(), this.getOVarriableCreateStatement(), null, "ListVarriable", null, 0, 1, OFor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oStatementEClass, OStatement.class, "OStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(oReturnStatementEClass, OReturnStatement.class, "OReturnStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOReturnStatement_ReturnVarriable(), this.getOVarriableCreateStatement(), null, "returnVarriable", null, 0, 1, OReturnStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oVarriableCreateStatementEClass, OVarriableCreateStatement.class, "OVarriableCreateStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOVarriableCreateStatement_Name(), ecorePackage.getEString(), "name", null, 0, 1, OVarriableCreateStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOVarriableCreateStatement_CalledConstructor(), this.getOConstructor(), null, "calledConstructor", null, 0, 1, OVarriableCreateStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oMethodCallStatementEClass, OMethodCallStatement.class, "OMethodCallStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOMethodCallStatement_Varriable(), this.getOVarriableCreateStatement(), null, "varriable", null, 0, 1, OMethodCallStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOMethodCallStatement_CalledMethod(), this.getOMethod(), null, "calledMethod", null, 0, 1, OMethodCallStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(oDataTypesEEnum, ODataTypes.class, "ODataTypes");
		addEEnumLiteral(oDataTypesEEnum, ODataTypes.STRING);
		addEEnumLiteral(oDataTypesEEnum, ODataTypes.INTEGER);
		addEEnumLiteral(oDataTypesEEnum, ODataTypes.BOOLEAN);
		addEEnumLiteral(oDataTypesEEnum, ODataTypes.LONG);
		addEEnumLiteral(oDataTypesEEnum, ODataTypes.DOUBLE);

		// Create resource
		createResource(eNS_URI);
	}

} //OopPackageImpl
