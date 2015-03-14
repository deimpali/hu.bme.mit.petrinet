/**
 */
package hu.bme.mit.petrinet.model.petrinetmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.petrinet.model.petrinetmodel.Place#getToken <em>Token</em>}</li>
 *   <li>{@link hu.bme.mit.petrinet.model.petrinetmodel.Place#getOut <em>Out</em>}</li>
 *   <li>{@link hu.bme.mit.petrinet.model.petrinetmodel.Place#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.petrinet.model.petrinetmodel.PetrinetmodelPackage#getPlace()
 * @model
 * @generated
 */
public interface Place extends EObject {
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
	 * @see hu.bme.mit.petrinet.model.petrinetmodel.PetrinetmodelPackage#getPlace_Token()
	 * @model
	 * @generated
	 */
	int getToken();

	/**
	 * Sets the value of the '{@link hu.bme.mit.petrinet.model.petrinetmodel.Place#getToken <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token</em>' attribute.
	 * @see #getToken()
	 * @generated
	 */
	void setToken(int value);

	/**
	 * Returns the value of the '<em><b>Out</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.petrinet.model.petrinetmodel.EdgeToTransaction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out</em>' containment reference list.
	 * @see hu.bme.mit.petrinet.model.petrinetmodel.PetrinetmodelPackage#getPlace_Out()
	 * @model containment="true"
	 * @generated
	 */
	EList<EdgeToTransaction> getOut();

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
	 * @see hu.bme.mit.petrinet.model.petrinetmodel.PetrinetmodelPackage#getPlace_Id()
	 * @model required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link hu.bme.mit.petrinet.model.petrinetmodel.Place#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

} // Place
