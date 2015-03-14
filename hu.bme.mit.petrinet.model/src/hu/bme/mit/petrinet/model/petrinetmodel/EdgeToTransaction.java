/**
 */
package hu.bme.mit.petrinet.model.petrinetmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge To Transaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.petrinet.model.petrinetmodel.EdgeToTransaction#getIn <em>In</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.petrinet.model.petrinetmodel.PetrinetmodelPackage#getEdgeToTransaction()
 * @model
 * @generated
 */
public interface EdgeToTransaction extends Edge {
	/**
	 * Returns the value of the '<em><b>In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' reference.
	 * @see #setIn(Transition)
	 * @see hu.bme.mit.petrinet.model.petrinetmodel.PetrinetmodelPackage#getEdgeToTransaction_In()
	 * @model required="true"
	 * @generated
	 */
	Transition getIn();

	/**
	 * Sets the value of the '{@link hu.bme.mit.petrinet.model.petrinetmodel.EdgeToTransaction#getIn <em>In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In</em>' reference.
	 * @see #getIn()
	 * @generated
	 */
	void setIn(Transition value);

} // EdgeToTransaction
