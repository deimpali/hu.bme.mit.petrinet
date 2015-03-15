/**
 */
package hu.bme.mit.petrinet.model.petrinetmodel.impl;

import hu.bme.mit.petrinet.model.petrinetmodel.Petrinet;
import hu.bme.mit.petrinet.model.petrinetmodel.PetrinetmodelPackage;
import hu.bme.mit.petrinet.model.petrinetmodel.Place;
import hu.bme.mit.petrinet.model.petrinetmodel.Transition;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Petrinet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.petrinet.model.petrinetmodel.impl.PetrinetImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link hu.bme.mit.petrinet.model.petrinetmodel.impl.PetrinetImpl#getPlaces <em>Places</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PetrinetImpl extends MinimalEObjectImpl.Container implements Petrinet {
	/**
	 * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> transitions;

	/**
	 * The cached value of the '{@link #getPlaces() <em>Places</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Place> places;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PetrinetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetrinetmodelPackage.Literals.PETRINET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getTransitions() {
		if (transitions == null) {
			transitions = new EObjectContainmentEList<Transition>(Transition.class, this, PetrinetmodelPackage.PETRINET__TRANSITIONS);
		}
		return transitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Place> getPlaces() {
		if (places == null) {
			places = new EObjectContainmentEList<Place>(Place.class, this, PetrinetmodelPackage.PETRINET__PLACES);
		}
		return places;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void fireTransactionsByPriority() {
		List<Transition> tmp = new ArrayList<Transition>();
		for (Transition t  : transitions){
			if(t.prepare()){
				tmp.add(t);
			}
		}
		for(Transition t : tmp){
			t.fire();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void init() {
		for (Place p : getPlaces()){
			p.init();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PetrinetmodelPackage.PETRINET__TRANSITIONS:
				return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
			case PetrinetmodelPackage.PETRINET__PLACES:
				return ((InternalEList<?>)getPlaces()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PetrinetmodelPackage.PETRINET__TRANSITIONS:
				return getTransitions();
			case PetrinetmodelPackage.PETRINET__PLACES:
				return getPlaces();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PetrinetmodelPackage.PETRINET__TRANSITIONS:
				getTransitions().clear();
				getTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case PetrinetmodelPackage.PETRINET__PLACES:
				getPlaces().clear();
				getPlaces().addAll((Collection<? extends Place>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PetrinetmodelPackage.PETRINET__TRANSITIONS:
				getTransitions().clear();
				return;
			case PetrinetmodelPackage.PETRINET__PLACES:
				getPlaces().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PetrinetmodelPackage.PETRINET__TRANSITIONS:
				return transitions != null && !transitions.isEmpty();
			case PetrinetmodelPackage.PETRINET__PLACES:
				return places != null && !places.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case PetrinetmodelPackage.PETRINET___FIRE_TRANSACTIONS_BY_PRIORITY:
				fireTransactionsByPriority();
				return null;
			case PetrinetmodelPackage.PETRINET___INIT:
				init();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //PetrinetImpl
