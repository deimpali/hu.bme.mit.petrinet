/**
 */
package hu.bme.mit.petrinet.model.petrinetmodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
 * @see hu.bme.mit.petrinet.model.petrinetmodel.PetrinetmodelFactory
 * @model kind="package"
 * @generated
 */
public interface PetrinetmodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "petrinetmodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://petrinetmodel/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "petrinetmodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PetrinetmodelPackage eINSTANCE = hu.bme.mit.petrinet.model.petrinetmodel.impl.PetrinetmodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.bme.mit.petrinet.model.petrinetmodel.impl.PetrinetImpl <em>Petrinet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.petrinet.model.petrinetmodel.impl.PetrinetImpl
	 * @see hu.bme.mit.petrinet.model.petrinetmodel.impl.PetrinetmodelPackageImpl#getPetrinet()
	 * @generated
	 */
	int PETRINET = 0;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET__TRANSITIONS = 0;

	/**
	 * The feature id for the '<em><b>Places</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET__PLACES = 1;

	/**
	 * The number of structural features of the '<em>Petrinet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Fire Transactions By Priority</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET___FIRE_TRANSACTIONS_BY_PRIORITY = 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET___INIT = 1;

	/**
	 * The number of operations of the '<em>Petrinet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINET_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link hu.bme.mit.petrinet.model.petrinetmodel.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.petrinet.model.petrinetmodel.impl.TransitionImpl
	 * @see hu.bme.mit.petrinet.model.petrinetmodel.impl.PetrinetmodelPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 1;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TOKEN = 0;

	/**
	 * The feature id for the '<em><b>Out</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__OUT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ID = 2;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__PRIORITY = 3;

	/**
	 * The feature id for the '<em><b>Input Places</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__INPUT_PLACES = 4;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Prepare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___PREPARE = 0;

	/**
	 * The operation id for the '<em>Fire</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___FIRE = 1;

	/**
	 * The operation id for the '<em>Add Input Place</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___ADD_INPUT_PLACE__PLACE = 2;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link hu.bme.mit.petrinet.model.petrinetmodel.impl.PlaceImpl <em>Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.petrinet.model.petrinetmodel.impl.PlaceImpl
	 * @see hu.bme.mit.petrinet.model.petrinetmodel.impl.PetrinetmodelPackageImpl#getPlace()
	 * @generated
	 */
	int PLACE = 2;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__TOKEN = 0;

	/**
	 * The feature id for the '<em><b>Out</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__OUT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__ID = 2;

	/**
	 * The number of structural features of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Add Token</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE___ADD_TOKEN = 0;

	/**
	 * The operation id for the '<em>Has Token</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE___HAS_TOKEN = 1;

	/**
	 * The operation id for the '<em>Remove Token</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE___REMOVE_TOKEN = 2;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE___INIT = 3;

	/**
	 * The number of operations of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link hu.bme.mit.petrinet.model.petrinetmodel.impl.EdgeImpl <em>Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.petrinet.model.petrinetmodel.impl.EdgeImpl
	 * @see hu.bme.mit.petrinet.model.petrinetmodel.impl.PetrinetmodelPackageImpl#getEdge()
	 * @generated
	 */
	int EDGE = 5;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__WEIGHT = 0;

	/**
	 * The number of structural features of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.petrinet.model.petrinetmodel.impl.EdgeToPlaceImpl <em>Edge To Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.petrinet.model.petrinetmodel.impl.EdgeToPlaceImpl
	 * @see hu.bme.mit.petrinet.model.petrinetmodel.impl.PetrinetmodelPackageImpl#getEdgeToPlace()
	 * @generated
	 */
	int EDGE_TO_PLACE = 3;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_TO_PLACE__WEIGHT = EDGE__WEIGHT;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_TO_PLACE__IN = EDGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Edge To Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_TO_PLACE_FEATURE_COUNT = EDGE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Edge To Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_TO_PLACE_OPERATION_COUNT = EDGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.petrinet.model.petrinetmodel.impl.EdgeToTransactionImpl <em>Edge To Transaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.petrinet.model.petrinetmodel.impl.EdgeToTransactionImpl
	 * @see hu.bme.mit.petrinet.model.petrinetmodel.impl.PetrinetmodelPackageImpl#getEdgeToTransaction()
	 * @generated
	 */
	int EDGE_TO_TRANSACTION = 4;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_TO_TRANSACTION__WEIGHT = EDGE__WEIGHT;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_TO_TRANSACTION__IN = EDGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Edge To Transaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_TO_TRANSACTION_FEATURE_COUNT = EDGE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Edge To Transaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_TO_TRANSACTION_OPERATION_COUNT = EDGE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link hu.bme.mit.petrinet.model.petrinetmodel.Petrinet <em>Petrinet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Petrinet</em>'.
	 * @see hu.bme.mit.petrinet.model.petrinetmodel.Petrinet
	 * @generated
	 */
	EClass getPetrinet();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.petrinet.model.petrinetmodel.Petrinet#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see hu.bme.mit.petrinet.model.petrinetmodel.Petrinet#getTransitions()
	 * @see #getPetrinet()
	 * @generated
	 */
	EReference getPetrinet_Transitions();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.petrinet.model.petrinetmodel.Petrinet#getPlaces <em>Places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Places</em>'.
	 * @see hu.bme.mit.petrinet.model.petrinetmodel.Petrinet#getPlaces()
	 * @see #getPetrinet()
	 * @generated
	 */
	EReference getPetrinet_Places();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.petrinet.model.petrinetmodel.Petrinet#fireTransactionsByPriority() <em>Fire Transactions By Priority</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Fire Transactions By Priority</em>' operation.
	 * @see hu.bme.mit.petrinet.model.petrinetmodel.Petrinet#fireTransactionsByPriority()
	 * @generated
	 */
	EOperation getPetrinet__FireTransactionsByPriority();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.petrinet.model.petrinetmodel.Petrinet#init() <em>Init</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Init</em>' operation.
	 * @see hu.bme.mit.petrinet.model.petrinetmodel.Petrinet#init()
	 * @generated
	 */
	EOperation getPetrinet__Init();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.petrinet.model.petrinetmodel.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see hu.bme.mit.petrinet.model.petrinetmodel.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.petrinet.model.petrinetmodel.Transition#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see hu.bme.mit.petrinet.model.petrinetmodel.Transition#getToken()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Token();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.petrinet.model.petrinetmodel.Transition#getOut <em>Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Out</em>'.
	 * @see hu.bme.mit.petrinet.model.petrinetmodel.Transition#getOut()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Out();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.petrinet.model.petrinetmodel.Transition#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see hu.bme.mit.petrinet.model.petrinetmodel.Transition#getId()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Id();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.petrinet.model.petrinetmodel.Transition#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see hu.bme.mit.petrinet.model.petrinetmodel.Transition#getPriority()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Priority();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.mit.petrinet.model.petrinetmodel.Transition#getInputPlaces <em>Input Places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input Places</em>'.
	 * @see hu.bme.mit.petrinet.model.petrinetmodel.Transition#getInputPlaces()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_InputPlaces();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.petrinet.model.petrinetmodel.Transition#prepare() <em>Prepare</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Prepare</em>' operation.
	 * @see hu.bme.mit.petrinet.model.petrinetmodel.Transition#prepare()
	 * @generated
	 */
	EOperation getTransition__Prepare();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.petrinet.model.petrinetmodel.Transition#fire() <em>Fire</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Fire</em>' operation.
	 * @see hu.bme.mit.petrinet.model.petrinetmodel.Transition#fire()
	 * @generated
	 */
	EOperation getTransition__Fire();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.petrinet.model.petrinetmodel.Transition#addInputPlace(hu.bme.mit.petrinet.model.petrinetmodel.Place) <em>Add Input Place</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Input Place</em>' operation.
	 * @see hu.bme.mit.petrinet.model.petrinetmodel.Transition#addInputPlace(hu.bme.mit.petrinet.model.petrinetmodel.Place)
	 * @generated
	 */
	EOperation getTransition__AddInputPlace__Place();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.petrinet.model.petrinetmodel.Place <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place</em>'.
	 * @see hu.bme.mit.petrinet.model.petrinetmodel.Place
	 * @generated
	 */
	EClass getPlace();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.petrinet.model.petrinetmodel.Place#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see hu.bme.mit.petrinet.model.petrinetmodel.Place#getToken()
	 * @see #getPlace()
	 * @generated
	 */
	EAttribute getPlace_Token();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.petrinet.model.petrinetmodel.Place#getOut <em>Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Out</em>'.
	 * @see hu.bme.mit.petrinet.model.petrinetmodel.Place#getOut()
	 * @see #getPlace()
	 * @generated
	 */
	EReference getPlace_Out();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.petrinet.model.petrinetmodel.Place#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see hu.bme.mit.petrinet.model.petrinetmodel.Place#getId()
	 * @see #getPlace()
	 * @generated
	 */
	EAttribute getPlace_Id();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.petrinet.model.petrinetmodel.Place#addToken() <em>Add Token</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Token</em>' operation.
	 * @see hu.bme.mit.petrinet.model.petrinetmodel.Place#addToken()
	 * @generated
	 */
	EOperation getPlace__AddToken();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.petrinet.model.petrinetmodel.Place#hasToken() <em>Has Token</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Token</em>' operation.
	 * @see hu.bme.mit.petrinet.model.petrinetmodel.Place#hasToken()
	 * @generated
	 */
	EOperation getPlace__HasToken();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.petrinet.model.petrinetmodel.Place#removeToken() <em>Remove Token</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Token</em>' operation.
	 * @see hu.bme.mit.petrinet.model.petrinetmodel.Place#removeToken()
	 * @generated
	 */
	EOperation getPlace__RemoveToken();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.petrinet.model.petrinetmodel.Place#init() <em>Init</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Init</em>' operation.
	 * @see hu.bme.mit.petrinet.model.petrinetmodel.Place#init()
	 * @generated
	 */
	EOperation getPlace__Init();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.petrinet.model.petrinetmodel.EdgeToPlace <em>Edge To Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge To Place</em>'.
	 * @see hu.bme.mit.petrinet.model.petrinetmodel.EdgeToPlace
	 * @generated
	 */
	EClass getEdgeToPlace();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.petrinet.model.petrinetmodel.EdgeToPlace#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>In</em>'.
	 * @see hu.bme.mit.petrinet.model.petrinetmodel.EdgeToPlace#getIn()
	 * @see #getEdgeToPlace()
	 * @generated
	 */
	EReference getEdgeToPlace_In();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.petrinet.model.petrinetmodel.EdgeToTransaction <em>Edge To Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge To Transaction</em>'.
	 * @see hu.bme.mit.petrinet.model.petrinetmodel.EdgeToTransaction
	 * @generated
	 */
	EClass getEdgeToTransaction();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.petrinet.model.petrinetmodel.EdgeToTransaction#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>In</em>'.
	 * @see hu.bme.mit.petrinet.model.petrinetmodel.EdgeToTransaction#getIn()
	 * @see #getEdgeToTransaction()
	 * @generated
	 */
	EReference getEdgeToTransaction_In();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.petrinet.model.petrinetmodel.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge</em>'.
	 * @see hu.bme.mit.petrinet.model.petrinetmodel.Edge
	 * @generated
	 */
	EClass getEdge();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.petrinet.model.petrinetmodel.Edge#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see hu.bme.mit.petrinet.model.petrinetmodel.Edge#getWeight()
	 * @see #getEdge()
	 * @generated
	 */
	EAttribute getEdge_Weight();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PetrinetmodelFactory getPetrinetmodelFactory();

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
		 * The meta object literal for the '{@link hu.bme.mit.petrinet.model.petrinetmodel.impl.PetrinetImpl <em>Petrinet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.petrinet.model.petrinetmodel.impl.PetrinetImpl
		 * @see hu.bme.mit.petrinet.model.petrinetmodel.impl.PetrinetmodelPackageImpl#getPetrinet()
		 * @generated
		 */
		EClass PETRINET = eINSTANCE.getPetrinet();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PETRINET__TRANSITIONS = eINSTANCE.getPetrinet_Transitions();

		/**
		 * The meta object literal for the '<em><b>Places</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PETRINET__PLACES = eINSTANCE.getPetrinet_Places();

		/**
		 * The meta object literal for the '<em><b>Fire Transactions By Priority</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PETRINET___FIRE_TRANSACTIONS_BY_PRIORITY = eINSTANCE.getPetrinet__FireTransactionsByPriority();

		/**
		 * The meta object literal for the '<em><b>Init</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PETRINET___INIT = eINSTANCE.getPetrinet__Init();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.petrinet.model.petrinetmodel.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.petrinet.model.petrinetmodel.impl.TransitionImpl
		 * @see hu.bme.mit.petrinet.model.petrinetmodel.impl.PetrinetmodelPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__TOKEN = eINSTANCE.getTransition_Token();

		/**
		 * The meta object literal for the '<em><b>Out</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__OUT = eINSTANCE.getTransition_Out();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__ID = eINSTANCE.getTransition_Id();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__PRIORITY = eINSTANCE.getTransition_Priority();

		/**
		 * The meta object literal for the '<em><b>Input Places</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__INPUT_PLACES = eINSTANCE.getTransition_InputPlaces();

		/**
		 * The meta object literal for the '<em><b>Prepare</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRANSITION___PREPARE = eINSTANCE.getTransition__Prepare();

		/**
		 * The meta object literal for the '<em><b>Fire</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRANSITION___FIRE = eINSTANCE.getTransition__Fire();

		/**
		 * The meta object literal for the '<em><b>Add Input Place</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRANSITION___ADD_INPUT_PLACE__PLACE = eINSTANCE.getTransition__AddInputPlace__Place();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.petrinet.model.petrinetmodel.impl.PlaceImpl <em>Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.petrinet.model.petrinetmodel.impl.PlaceImpl
		 * @see hu.bme.mit.petrinet.model.petrinetmodel.impl.PetrinetmodelPackageImpl#getPlace()
		 * @generated
		 */
		EClass PLACE = eINSTANCE.getPlace();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACE__TOKEN = eINSTANCE.getPlace_Token();

		/**
		 * The meta object literal for the '<em><b>Out</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACE__OUT = eINSTANCE.getPlace_Out();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACE__ID = eINSTANCE.getPlace_Id();

		/**
		 * The meta object literal for the '<em><b>Add Token</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PLACE___ADD_TOKEN = eINSTANCE.getPlace__AddToken();

		/**
		 * The meta object literal for the '<em><b>Has Token</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PLACE___HAS_TOKEN = eINSTANCE.getPlace__HasToken();

		/**
		 * The meta object literal for the '<em><b>Remove Token</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PLACE___REMOVE_TOKEN = eINSTANCE.getPlace__RemoveToken();

		/**
		 * The meta object literal for the '<em><b>Init</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PLACE___INIT = eINSTANCE.getPlace__Init();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.petrinet.model.petrinetmodel.impl.EdgeToPlaceImpl <em>Edge To Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.petrinet.model.petrinetmodel.impl.EdgeToPlaceImpl
		 * @see hu.bme.mit.petrinet.model.petrinetmodel.impl.PetrinetmodelPackageImpl#getEdgeToPlace()
		 * @generated
		 */
		EClass EDGE_TO_PLACE = eINSTANCE.getEdgeToPlace();

		/**
		 * The meta object literal for the '<em><b>In</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE_TO_PLACE__IN = eINSTANCE.getEdgeToPlace_In();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.petrinet.model.petrinetmodel.impl.EdgeToTransactionImpl <em>Edge To Transaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.petrinet.model.petrinetmodel.impl.EdgeToTransactionImpl
		 * @see hu.bme.mit.petrinet.model.petrinetmodel.impl.PetrinetmodelPackageImpl#getEdgeToTransaction()
		 * @generated
		 */
		EClass EDGE_TO_TRANSACTION = eINSTANCE.getEdgeToTransaction();

		/**
		 * The meta object literal for the '<em><b>In</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE_TO_TRANSACTION__IN = eINSTANCE.getEdgeToTransaction_In();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.petrinet.model.petrinetmodel.impl.EdgeImpl <em>Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.petrinet.model.petrinetmodel.impl.EdgeImpl
		 * @see hu.bme.mit.petrinet.model.petrinetmodel.impl.PetrinetmodelPackageImpl#getEdge()
		 * @generated
		 */
		EClass EDGE = eINSTANCE.getEdge();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE__WEIGHT = eINSTANCE.getEdge_Weight();

	}

} //PetrinetmodelPackage
