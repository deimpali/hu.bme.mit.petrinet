/**
 */
package hu.bme.mit.petrinet.model.petrinetmodel.impl;

import hu.bme.mit.petrinet.model.petrinetmodel.Edge;
import hu.bme.mit.petrinet.model.petrinetmodel.EdgeToPlace;
import hu.bme.mit.petrinet.model.petrinetmodel.EdgeToTransaction;
import hu.bme.mit.petrinet.model.petrinetmodel.Petrinet;
import hu.bme.mit.petrinet.model.petrinetmodel.PetrinetmodelFactory;
import hu.bme.mit.petrinet.model.petrinetmodel.PetrinetmodelPackage;
import hu.bme.mit.petrinet.model.petrinetmodel.Place;
import hu.bme.mit.petrinet.model.petrinetmodel.Transition;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PetrinetmodelPackageImpl extends EPackageImpl implements PetrinetmodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass petrinetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edgeToPlaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edgeToTransactionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edgeEClass = null;

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
	 * @see hu.bme.mit.petrinet.model.petrinetmodel.PetrinetmodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PetrinetmodelPackageImpl() {
		super(eNS_URI, PetrinetmodelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PetrinetmodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PetrinetmodelPackage init() {
		if (isInited) return (PetrinetmodelPackage)EPackage.Registry.INSTANCE.getEPackage(PetrinetmodelPackage.eNS_URI);

		// Obtain or create and register package
		PetrinetmodelPackageImpl thePetrinetmodelPackage = (PetrinetmodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PetrinetmodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PetrinetmodelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		thePetrinetmodelPackage.createPackageContents();

		// Initialize created meta-data
		thePetrinetmodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePetrinetmodelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PetrinetmodelPackage.eNS_URI, thePetrinetmodelPackage);
		return thePetrinetmodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPetrinet() {
		return petrinetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPetrinet_Transitions() {
		return (EReference)petrinetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPetrinet_Places() {
		return (EReference)petrinetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPetrinet__FireTransactionsByPriority() {
		return petrinetEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPetrinet__Init() {
		return petrinetEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_Token() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Out() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_Id() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_Priority() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_InputPlaces() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTransition__Prepare() {
		return transitionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTransition__Fire() {
		return transitionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTransition__AddInputPlace__Place() {
		return transitionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlace() {
		return placeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlace_Token() {
		return (EAttribute)placeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlace_Out() {
		return (EReference)placeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlace_Id() {
		return (EAttribute)placeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPlace__AddToken() {
		return placeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPlace__HasToken() {
		return placeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPlace__RemoveToken() {
		return placeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPlace__Init() {
		return placeEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEdgeToPlace() {
		return edgeToPlaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdgeToPlace_In() {
		return (EReference)edgeToPlaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEdgeToTransaction() {
		return edgeToTransactionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdgeToTransaction_In() {
		return (EReference)edgeToTransactionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEdge() {
		return edgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEdge_Weight() {
		return (EAttribute)edgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetrinetmodelFactory getPetrinetmodelFactory() {
		return (PetrinetmodelFactory)getEFactoryInstance();
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
		petrinetEClass = createEClass(PETRINET);
		createEReference(petrinetEClass, PETRINET__TRANSITIONS);
		createEReference(petrinetEClass, PETRINET__PLACES);
		createEOperation(petrinetEClass, PETRINET___FIRE_TRANSACTIONS_BY_PRIORITY);
		createEOperation(petrinetEClass, PETRINET___INIT);

		transitionEClass = createEClass(TRANSITION);
		createEAttribute(transitionEClass, TRANSITION__TOKEN);
		createEReference(transitionEClass, TRANSITION__OUT);
		createEAttribute(transitionEClass, TRANSITION__ID);
		createEAttribute(transitionEClass, TRANSITION__PRIORITY);
		createEReference(transitionEClass, TRANSITION__INPUT_PLACES);
		createEOperation(transitionEClass, TRANSITION___PREPARE);
		createEOperation(transitionEClass, TRANSITION___FIRE);
		createEOperation(transitionEClass, TRANSITION___ADD_INPUT_PLACE__PLACE);

		placeEClass = createEClass(PLACE);
		createEAttribute(placeEClass, PLACE__TOKEN);
		createEReference(placeEClass, PLACE__OUT);
		createEAttribute(placeEClass, PLACE__ID);
		createEOperation(placeEClass, PLACE___ADD_TOKEN);
		createEOperation(placeEClass, PLACE___HAS_TOKEN);
		createEOperation(placeEClass, PLACE___REMOVE_TOKEN);
		createEOperation(placeEClass, PLACE___INIT);

		edgeToPlaceEClass = createEClass(EDGE_TO_PLACE);
		createEReference(edgeToPlaceEClass, EDGE_TO_PLACE__IN);

		edgeToTransactionEClass = createEClass(EDGE_TO_TRANSACTION);
		createEReference(edgeToTransactionEClass, EDGE_TO_TRANSACTION__IN);

		edgeEClass = createEClass(EDGE);
		createEAttribute(edgeEClass, EDGE__WEIGHT);
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
		edgeToPlaceEClass.getESuperTypes().add(this.getEdge());
		edgeToTransactionEClass.getESuperTypes().add(this.getEdge());

		// Initialize classes, features, and operations; add parameters
		initEClass(petrinetEClass, Petrinet.class, "Petrinet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPetrinet_Transitions(), this.getTransition(), null, "transitions", null, 0, -1, Petrinet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPetrinet_Places(), this.getPlace(), null, "places", null, 0, -1, Petrinet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getPetrinet__FireTransactionsByPriority(), null, "fireTransactionsByPriority", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPetrinet__Init(), null, "init", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransition_Token(), ecorePackage.getEInt(), "token", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Out(), this.getEdgeToPlace(), null, "out", null, 1, -1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_Id(), ecorePackage.getEInt(), "id", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_Priority(), ecorePackage.getEInt(), "priority", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_InputPlaces(), this.getPlace(), null, "inputPlaces", null, 0, -1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTransition__Prepare(), ecorePackage.getEBoolean(), "prepare", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTransition__Fire(), null, "fire", 1, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getTransition__AddInputPlace__Place(), null, "addInputPlace", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPlace(), "p", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(placeEClass, Place.class, "Place", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlace_Token(), ecorePackage.getEInt(), "token", null, 0, 1, Place.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlace_Out(), this.getEdgeToTransaction(), null, "out", null, 0, -1, Place.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlace_Id(), ecorePackage.getEInt(), "id", null, 1, 1, Place.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getPlace__AddToken(), null, "addToken", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPlace__HasToken(), ecorePackage.getEBoolean(), "hasToken", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPlace__RemoveToken(), null, "removeToken", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPlace__Init(), null, "init", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(edgeToPlaceEClass, EdgeToPlace.class, "EdgeToPlace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEdgeToPlace_In(), this.getPlace(), null, "in", null, 1, 1, EdgeToPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(edgeToTransactionEClass, EdgeToTransaction.class, "EdgeToTransaction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEdgeToTransaction_In(), this.getTransition(), null, "in", null, 1, 1, EdgeToTransaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(edgeEClass, Edge.class, "Edge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEdge_Weight(), ecorePackage.getEInt(), "weight", null, 0, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //PetrinetmodelPackageImpl
