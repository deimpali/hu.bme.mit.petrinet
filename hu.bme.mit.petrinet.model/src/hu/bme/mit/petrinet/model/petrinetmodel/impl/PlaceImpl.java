/**
 */
package hu.bme.mit.petrinet.model.petrinetmodel.impl;

import hu.bme.mit.petrinet.model.petrinetmodel.EdgeToTransaction;
import hu.bme.mit.petrinet.model.petrinetmodel.PetrinetmodelPackage;
import hu.bme.mit.petrinet.model.petrinetmodel.Place;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.petrinet.model.petrinetmodel.impl.PlaceImpl#getToken <em>Token</em>}</li>
 *   <li>{@link hu.bme.mit.petrinet.model.petrinetmodel.impl.PlaceImpl#getOut <em>Out</em>}</li>
 *   <li>{@link hu.bme.mit.petrinet.model.petrinetmodel.impl.PlaceImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlaceImpl extends MinimalEObjectImpl.Container implements Place {
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
	protected EList<EdgeToTransaction> out;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetrinetmodelPackage.Literals.PLACE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetmodelPackage.PLACE__TOKEN, oldToken, token));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EdgeToTransaction> getOut() {
		if (out == null) {
			out = new EObjectContainmentEList<EdgeToTransaction>(EdgeToTransaction.class, this, PetrinetmodelPackage.PLACE__OUT);
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
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetmodelPackage.PLACE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void addToken() {
		++token;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean hasToken() {
		if (token<1) return false;
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void removeToken() {
		if (hasToken()) token--; 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void init() {
		for (EdgeToTransaction etp : getOut()){
			etp.getIn().addInputPlace(this);
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
			case PetrinetmodelPackage.PLACE__OUT:
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
			case PetrinetmodelPackage.PLACE__TOKEN:
				return getToken();
			case PetrinetmodelPackage.PLACE__OUT:
				return getOut();
			case PetrinetmodelPackage.PLACE__ID:
				return getId();
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
			case PetrinetmodelPackage.PLACE__TOKEN:
				setToken((Integer)newValue);
				return;
			case PetrinetmodelPackage.PLACE__OUT:
				getOut().clear();
				getOut().addAll((Collection<? extends EdgeToTransaction>)newValue);
				return;
			case PetrinetmodelPackage.PLACE__ID:
				setId((Integer)newValue);
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
			case PetrinetmodelPackage.PLACE__TOKEN:
				setToken(TOKEN_EDEFAULT);
				return;
			case PetrinetmodelPackage.PLACE__OUT:
				getOut().clear();
				return;
			case PetrinetmodelPackage.PLACE__ID:
				setId(ID_EDEFAULT);
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
			case PetrinetmodelPackage.PLACE__TOKEN:
				return token != TOKEN_EDEFAULT;
			case PetrinetmodelPackage.PLACE__OUT:
				return out != null && !out.isEmpty();
			case PetrinetmodelPackage.PLACE__ID:
				return id != ID_EDEFAULT;
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
			case PetrinetmodelPackage.PLACE___ADD_TOKEN:
				addToken();
				return null;
			case PetrinetmodelPackage.PLACE___HAS_TOKEN:
				return hasToken();
			case PetrinetmodelPackage.PLACE___REMOVE_TOKEN:
				removeToken();
				return null;
			case PetrinetmodelPackage.PLACE___INIT:
				init();
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
		result.append(')');
		return result.toString();
	}

} //PlaceImpl
