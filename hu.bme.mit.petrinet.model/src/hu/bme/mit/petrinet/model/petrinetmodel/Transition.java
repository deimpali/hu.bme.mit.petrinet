/**
 */
package hu.bme.mit.petrinet.model.petrinetmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.petrinet.model.petrinetmodel.Transition#getToken <em>Token</em>}</li>
 *   <li>{@link hu.bme.mit.petrinet.model.petrinetmodel.Transition#getOut <em>Out</em>}</li>
 *   <li>{@link hu.bme.mit.petrinet.model.petrinetmodel.Transition#getId <em>Id</em>}</li>
 *   <li>{@link hu.bme.mit.petrinet.model.petrinetmodel.Transition#getPriority <em>Priority</em>}</li>
 *   <li>{@link hu.bme.mit.petrinet.model.petrinetmodel.Transition#getInputPlaces <em>Input Places</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.petrinet.model.petrinetmodel.PetrinetmodelPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject {
	/**
	 * Returns the value of the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Token</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token</em>' attribute.
	 * @see #setToken(int)
	 * @see hu.bme.mit.petrinet.model.petrinetmodel.PetrinetmodelPackage#getTransition_Token()
	 * @model
	 * @generated
	 */
	int getToken();

	/**
	 * Sets the value of the '{@link hu.bme.mit.petrinet.model.petrinetmodel.Transition#getToken <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token</em>' attribute.
	 * @see #getToken()
	 * @generated
	 */
	void setToken(int value);

	/**
	 * Returns the value of the '<em><b>Out</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.petrinet.model.petrinetmodel.EdgeToPlace}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out</em>' containment reference list.
	 * @see hu.bme.mit.petrinet.model.petrinetmodel.PetrinetmodelPackage#getTransition_Out()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<EdgeToPlace> getOut();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see hu.bme.mit.petrinet.model.petrinetmodel.PetrinetmodelPackage#getTransition_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link hu.bme.mit.petrinet.model.petrinetmodel.Transition#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(int)
	 * @see hu.bme.mit.petrinet.model.petrinetmodel.PetrinetmodelPackage#getTransition_Priority()
	 * @model required="true"
	 * @generated
	 */
	int getPriority();

	/**
	 * Sets the value of the '{@link hu.bme.mit.petrinet.model.petrinetmodel.Transition#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(int value);

	/**
	 * Returns the value of the '<em><b>Input Places</b></em>' reference list.
	 * The list contents are of type {@link hu.bme.mit.petrinet.model.petrinetmodel.Place}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Places</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Places</em>' reference list.
	 * @see hu.bme.mit.petrinet.model.petrinetmodel.PetrinetmodelPackage#getTransition_InputPlaces()
	 * @model
	 * @generated
	 */
	EList<Place> getInputPlaces();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean prepare();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void fire();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addInputPlace(Place p);

} // Transition
