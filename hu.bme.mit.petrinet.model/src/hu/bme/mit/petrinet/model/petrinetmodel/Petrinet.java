/**
 */
package hu.bme.mit.petrinet.model.petrinetmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Petrinet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.petrinet.model.petrinetmodel.Petrinet#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link hu.bme.mit.petrinet.model.petrinetmodel.Petrinet#getPlaces <em>Places</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.petrinet.model.petrinetmodel.PetrinetmodelPackage#getPetrinet()
 * @model
 * @generated
 */
public interface Petrinet extends EObject {
	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.petrinet.model.petrinetmodel.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see hu.bme.mit.petrinet.model.petrinetmodel.PetrinetmodelPackage#getPetrinet_Transitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * Returns the value of the '<em><b>Places</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.petrinet.model.petrinetmodel.Place}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Places</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Places</em>' containment reference list.
	 * @see hu.bme.mit.petrinet.model.petrinetmodel.PetrinetmodelPackage#getPetrinet_Places()
	 * @model containment="true"
	 * @generated
	 */
	EList<Place> getPlaces();

} // Petrinet
