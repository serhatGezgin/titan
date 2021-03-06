/**
 */
package org.yazgel.oop.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.yazgel.oop.MultiODataType;
import org.yazgel.oop.MultiOReference;
import org.yazgel.oop.OClass;
import org.yazgel.oop.ODataType;
import org.yazgel.oop.OFeature;
import org.yazgel.oop.OMethod;
import org.yazgel.oop.OModel;
import org.yazgel.oop.OPackage;
import org.yazgel.oop.OParameter;
import org.yazgel.oop.OReference;
import org.yazgel.oop.OStatement;
import org.yazgel.oop.OopFactory;
import org.yazgel.oop.OopPackage;
import org.yazgel.oop.SingleODataType;
import org.yazgel.oop.SingleOReference;

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
	private EClass multiOReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleOReferenceEClass = null;

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
	private EClass singleODataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiODataTypeEClass = null;

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
	private EClass oParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oStatementEClass = null;

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
	public EReference getOPackage_Packages() {
		return (EReference)oPackageEClass.getEStructuralFeatures().get(2);
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
	public EReference getOClass_Methods() {
		return (EReference)oClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOClass_Features() {
		return (EReference)oClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOClass_Imports() {
		return (EAttribute)oClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOClass_Implements() {
		return (EAttribute)oClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOClass_Super() {
		return (EReference)oClassEClass.getEStructuralFeatures().get(5);
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
	public EAttribute getOFeature_Type() {
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
	public EReference getOReference_Opposite() {
		return (EReference)oReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiOReference() {
		return multiOReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiOReference_UniqueInstance() {
		return (EAttribute)multiOReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiOReference_Opposites() {
		return (EReference)multiOReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleOReference() {
		return singleOReferenceEClass;
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
	public EReference getODataType_Opposite() {
		return (EReference)oDataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleODataType() {
		return singleODataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiODataType() {
		return multiODataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiODataType_UniqueInstance() {
		return (EAttribute)multiODataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiODataType_Opposites() {
		return (EReference)multiODataTypeEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getOMethod_Static() {
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
	public EAttribute getOMethod_Override() {
		return (EAttribute)oMethodEClass.getEStructuralFeatures().get(5);
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
	public EClass getOStatement() {
		return oStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOStatement_Content() {
		return (EAttribute)oStatementEClass.getEStructuralFeatures().get(0);
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
		createEReference(oPackageEClass, OPACKAGE__PACKAGES);

		oClassEClass = createEClass(OCLASS);
		createEAttribute(oClassEClass, OCLASS__NAME);
		createEReference(oClassEClass, OCLASS__METHODS);
		createEReference(oClassEClass, OCLASS__FEATURES);
		createEAttribute(oClassEClass, OCLASS__IMPORTS);
		createEAttribute(oClassEClass, OCLASS__IMPLEMENTS);
		createEReference(oClassEClass, OCLASS__SUPER);

		oFeatureEClass = createEClass(OFEATURE);
		createEAttribute(oFeatureEClass, OFEATURE__NAME);
		createEAttribute(oFeatureEClass, OFEATURE__TYPE);

		oReferenceEClass = createEClass(OREFERENCE);
		createEReference(oReferenceEClass, OREFERENCE__REFERENCE);
		createEReference(oReferenceEClass, OREFERENCE__OPPOSITE);

		multiOReferenceEClass = createEClass(MULTI_OREFERENCE);
		createEAttribute(multiOReferenceEClass, MULTI_OREFERENCE__UNIQUE_INSTANCE);
		createEReference(multiOReferenceEClass, MULTI_OREFERENCE__OPPOSITES);

		singleOReferenceEClass = createEClass(SINGLE_OREFERENCE);

		oDataTypeEClass = createEClass(ODATA_TYPE);
		createEReference(oDataTypeEClass, ODATA_TYPE__OPPOSITE);

		singleODataTypeEClass = createEClass(SINGLE_ODATA_TYPE);

		multiODataTypeEClass = createEClass(MULTI_ODATA_TYPE);
		createEAttribute(multiODataTypeEClass, MULTI_ODATA_TYPE__UNIQUE_INSTANCE);
		createEReference(multiODataTypeEClass, MULTI_ODATA_TYPE__OPPOSITES);

		oMethodEClass = createEClass(OMETHOD);
		createEAttribute(oMethodEClass, OMETHOD__NAME);
		createEAttribute(oMethodEClass, OMETHOD__STATIC);
		createEAttribute(oMethodEClass, OMETHOD__RETURN_TYPE);
		createEReference(oMethodEClass, OMETHOD__PARAMETERS);
		createEReference(oMethodEClass, OMETHOD__STATEMENTS);
		createEAttribute(oMethodEClass, OMETHOD__OVERRIDE);

		oParameterEClass = createEClass(OPARAMETER);
		createEAttribute(oParameterEClass, OPARAMETER__NAME);
		createEAttribute(oParameterEClass, OPARAMETER__TYPE);

		oStatementEClass = createEClass(OSTATEMENT);
		createEAttribute(oStatementEClass, OSTATEMENT__CONTENT);
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
		multiOReferenceEClass.getESuperTypes().add(this.getOReference());
		singleOReferenceEClass.getESuperTypes().add(this.getOReference());
		oDataTypeEClass.getESuperTypes().add(this.getOFeature());
		singleODataTypeEClass.getESuperTypes().add(this.getODataType());
		multiODataTypeEClass.getESuperTypes().add(this.getODataType());

		// Initialize classes, features, and operations; add parameters
		initEClass(oModelEClass, OModel.class, "OModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, OModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOModel_Packages(), this.getOPackage(), null, "packages", null, 0, -1, OModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oPackageEClass, OPackage.class, "OPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOPackage_Name(), ecorePackage.getEString(), "name", null, 0, 1, OPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOPackage_Classes(), this.getOClass(), null, "classes", null, 0, -1, OPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOPackage_Packages(), this.getOPackage(), null, "packages", null, 0, -1, OPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oClassEClass, OClass.class, "OClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOClass_Name(), ecorePackage.getEString(), "name", null, 0, 1, OClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOClass_Methods(), this.getOMethod(), null, "methods", null, 0, -1, OClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOClass_Features(), this.getOFeature(), null, "features", null, 0, -1, OClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOClass_Imports(), ecorePackage.getEString(), "imports", null, 0, -1, OClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOClass_Implements(), ecorePackage.getEString(), "implements", null, 0, -1, OClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOClass_Super(), this.getOClass(), null, "super", null, 0, 1, OClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oFeatureEClass, OFeature.class, "OFeature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOFeature_Name(), ecorePackage.getEString(), "name", null, 0, 1, OFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOFeature_Type(), ecorePackage.getEString(), "type", null, 0, 1, OFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oReferenceEClass, OReference.class, "OReference", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOReference_Reference(), this.getOClass(), null, "reference", null, 0, 1, OReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOReference_Opposite(), this.getMultiOReference(), this.getMultiOReference_Opposites(), "opposite", null, 0, 1, OReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multiOReferenceEClass, MultiOReference.class, "MultiOReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMultiOReference_UniqueInstance(), ecorePackage.getEBoolean(), "uniqueInstance", null, 0, 1, MultiOReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMultiOReference_Opposites(), this.getOReference(), this.getOReference_Opposite(), "opposites", null, 0, -1, MultiOReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(singleOReferenceEClass, SingleOReference.class, "SingleOReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(oDataTypeEClass, ODataType.class, "ODataType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getODataType_Opposite(), this.getMultiODataType(), this.getMultiODataType_Opposites(), "opposite", null, 0, 1, ODataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(singleODataTypeEClass, SingleODataType.class, "SingleODataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(multiODataTypeEClass, MultiODataType.class, "MultiODataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMultiODataType_UniqueInstance(), ecorePackage.getEBoolean(), "uniqueInstance", null, 0, 1, MultiODataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMultiODataType_Opposites(), this.getODataType(), this.getODataType_Opposite(), "opposites", null, 0, -1, MultiODataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oMethodEClass, OMethod.class, "OMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOMethod_Name(), ecorePackage.getEString(), "name", null, 0, 1, OMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOMethod_Static(), ecorePackage.getEBoolean(), "static", null, 0, 1, OMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOMethod_ReturnType(), ecorePackage.getEString(), "returnType", null, 0, 1, OMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOMethod_Parameters(), this.getOParameter(), null, "parameters", null, 0, -1, OMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOMethod_Statements(), this.getOStatement(), null, "statements", null, 0, -1, OMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOMethod_Override(), ecorePackage.getEBoolean(), "override", null, 0, 1, OMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oParameterEClass, OParameter.class, "OParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, OParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOParameter_Type(), ecorePackage.getEString(), "type", null, 0, 1, OParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oStatementEClass, OStatement.class, "OStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOStatement_Content(), ecorePackage.getEString(), "content", null, 0, 1, OStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //OopPackageImpl
