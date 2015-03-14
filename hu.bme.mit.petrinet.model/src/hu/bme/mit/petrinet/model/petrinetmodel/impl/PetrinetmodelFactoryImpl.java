/**
 */
package hu.bme.mit.petrinet.model.petrinetmodel.impl;

import hu.bme.mit.petrinet.model.petrinetmodel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PetrinetmodelFactoryImpl extends EFactoryImpl implements PetrinetmodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PetrinetmodelFactory init() {
		try {
			PetrinetmodelFactory thePetrinetmodelFactory = (PetrinetmodelFactory)EPackage.Registry.INSTANCE.getEFactory(PetrinetmodelPackage.eNS_URI);
			if (thePetrinetmodelFactory != null) {
				return thePetrinetmodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PetrinetmodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetrinetmodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PetrinetmodelPackage.PETRINET: return createPetrinet();
			case PetrinetmodelPackage.TRANSITION: return createTransition();
			case PetrinetmodelPackage.PLACE: return createPlace();
			case PetrinetmodelPackage.EDGE_TO_PLACE: return createEdgeToPlace();
			case PetrinetmodelPackage.EDGE_TO_TRANSACTION: return createEdgeToTransaction();
			case PetrinetmodelPackage.EDGE: return createEdge();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Petrinet createPetrinet() {
		PetrinetImpl petrinet = new PetrinetImpl();
		return petrinet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place createPlace() {
		PlaceImpl place = new PlaceImpl();
		return place;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeToPlace createEdgeToPlace() {
		EdgeToPlaceImpl edgeToPlace = new EdgeToPlaceImpl();
		return edgeToPlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeToTransaction createEdgeToTransaction() {
		EdgeToTransactionImpl edgeToTransaction = new EdgeToTransactionImpl();
		return edgeToTransaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Edge createEdge() {
		EdgeImpl edge = new EdgeImpl();
		return edge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetrinetmodelPackage getPetrinetmodelPackage() {
		return (PetrinetmodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PetrinetmodelPackage getPackage() {
		return PetrinetmodelPackage.eINSTANCE;
	}

} //PetrinetmodelFactoryImpl
