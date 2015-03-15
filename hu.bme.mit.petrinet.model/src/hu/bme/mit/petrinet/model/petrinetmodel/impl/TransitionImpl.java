/**
 */
package hu.bme.mit.petrinet.model.petrinetmodel.impl;

import hu.bme.mit.petrinet.model.petrinetmodel.EdgeToPlace;
import hu.bme.mit.petrinet.model.petrinetmodel.PetrinetmodelPackage;
import hu.bme.mit.petrinet.model.petrinetmodel.Place;
import hu.bme.mit.petrinet.model.petrinetmodel.Transition;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.petrinet.model.petrinetmodel.impl.TransitionImpl#getToken <em>Token</em>}</li>
 *   <li>{@link hu.bme.mit.petrinet.model.petrinetmodel.impl.TransitionImpl#getOut <em>Out</em>}</li>
 *   <li>{@link hu.bme.mit.petrinet.model.petrinetmodel.impl.TransitionImpl#getId <em>Id</em>}</li>
 *   <li>{@link hu.bme.mit.petrinet.model.petrinetmodel.impl.TransitionImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link hu.bme.mit.petrinet.model.petrinetmodel.impl.TransitionImpl#getInputPlaces <em>Input Places</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransitionImpl extends MinimalEObjectImpl.Container implements Transition {
	/**
	 * The default value of the '{@link #getToken() <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected static final int TOKEN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getToken() <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected int token = TOKEN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOut() <em>Out</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOut()
	 * @generated
	 * @ordered
	 */
	protected EList<EdgeToPlace> out;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final int PRIORITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected int priority = PRIORITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInputPlaces() <em>Input Places</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputPlaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Place> inputPlaces;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetrinetmodelPackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getToken() {
		return token;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToken(int newToken) {
		int oldToken = token;
		token = newToken;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetmodelPackage.TRANSITION__TOKEN, oldToken, token));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EdgeToPlace> getOut() {
		if (out == null) {
			out = new EObjectContainmentEList<EdgeToPlace>(EdgeToPlace.class, this, PetrinetmodelPackage.TRANSITION__OUT);
		}
		return out;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetmodelPackage.TRANSITION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(int newPriority) {
		int oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetmodelPackage.TRANSITION__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Place> getInputPlaces() {
		if (inputPlaces == null) {
			inputPlaces = new EObjectResolvingEList<Place>(Place.class, this, PetrinetmodelPackage.TRANSITION__INPUT_PLACES);
		}
		return inputPlaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean prepare() {
		List<Place> places = getInputPlaces();
		if (places!=null){
			for(Place p : places){
				if(!p.hasToken()){
					return false;		
				}
			}
			for(Place p : places){
				p.removeToken();
			}
			token++;
			return true;
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void fire() {
		token--;
		for(EdgeToPlace etp : out){
			etp.getIn().addToken();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void addInputPlace(Place p) {
		getInputPlaces().add(p);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PetrinetmodelPackage.TRANSITION__OUT:
				return ((InternalEList<?>)getOut()).basicRemove(otherEnd, msgs);
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
			case PetrinetmodelPackage.TRANSITION__TOKEN:
				return getToken();
			case PetrinetmodelPackage.TRANSITION__OUT:
				return getOut();
			case PetrinetmodelPackage.TRANSITION__ID:
				return getId();
			case PetrinetmodelPackage.TRANSITION__PRIORITY:
				return getPriority();
			case PetrinetmodelPackage.TRANSITION__INPUT_PLACES:
				return getInputPlaces();
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
			case PetrinetmodelPackage.TRANSITION__TOKEN:
				setToken((Integer)newValue);
				return;
			case PetrinetmodelPackage.TRANSITION__OUT:
				getOut().clear();
				getOut().addAll((Collection<? extends EdgeToPlace>)newValue);
				return;
			case PetrinetmodelPackage.TRANSITION__ID:
				setId((Integer)newValue);
				return;
			case PetrinetmodelPackage.TRANSITION__PRIORITY:
				setPriority((Integer)newValue);
				return;
			case PetrinetmodelPackage.TRANSITION__INPUT_PLACES:
				getInputPlaces().clear();
				getInputPlaces().addAll((Collection<? extends Place>)newValue);
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
			case PetrinetmodelPackage.TRANSITION__TOKEN:
				setToken(TOKEN_EDEFAULT);
				return;
			case PetrinetmodelPackage.TRANSITION__OUT:
				getOut().clear();
				return;
			case PetrinetmodelPackage.TRANSITION__ID:
				setId(ID_EDEFAULT);
				return;
			case PetrinetmodelPackage.TRANSITION__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case PetrinetmodelPackage.TRANSITION__INPUT_PLACES:
				getInputPlaces().clear();
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
			case PetrinetmodelPackage.TRANSITION__TOKEN:
				return token != TOKEN_EDEFAULT;
			case PetrinetmodelPackage.TRANSITION__OUT:
				return out != null && !out.isEmpty();
			case PetrinetmodelPackage.TRANSITION__ID:
				return id != ID_EDEFAULT;
			case PetrinetmodelPackage.TRANSITION__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
			case PetrinetmodelPackage.TRANSITION__INPUT_PLACES:
				return inputPlaces != null && !inputPlaces.isEmpty();
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
			case PetrinetmodelPackage.TRANSITION___PREPARE:
				return prepare();
			case PetrinetmodelPackage.TRANSITION___FIRE:
				fire();
				return null;
			case PetrinetmodelPackage.TRANSITION___ADD_INPUT_PLACE__PLACE:
				addInputPlace((Place)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (token: ");
		result.append(token);
		result.append(", id: ");
		result.append(id);
		result.append(", priority: ");
		result.append(priority);
		result.append(')');
		return result.toString();
	}

} //TransitionImpl
