/**
 */
package GraphMetaM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GraphMetaM.Edge#isAsync <em>Async</em>}</li>
 *   <li>{@link GraphMetaM.Edge#getLocalPriority <em>Local Priority</em>}</li>
 *   <li>{@link GraphMetaM.Edge#getRName <em>RName</em>}</li>
 *   <li>{@link GraphMetaM.Edge#getName <em>Name</em>}</li>
 *   <li>{@link GraphMetaM.Edge#getTarget <em>Target</em>}</li>
 *   <li>{@link GraphMetaM.Edge#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see GraphMetaM.GraphMetaMPackage#getEdge()
 * @model
 * @generated
 */
public interface Edge extends EObject {
	/**
	 * Returns the value of the '<em><b>Async</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Async</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Async</em>' attribute.
	 * @see #setAsync(boolean)
	 * @see GraphMetaM.GraphMetaMPackage#getEdge_Async()
	 * @model
	 * @generated
	 */
	boolean isAsync();

	/**
	 * Sets the value of the '{@link GraphMetaM.Edge#isAsync <em>Async</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Async</em>' attribute.
	 * @see #isAsync()
	 * @generated
	 */
	void setAsync(boolean value);

	/**
	 * Returns the value of the '<em><b>Local Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Priority</em>' attribute.
	 * @see #setLocalPriority(int)
	 * @see GraphMetaM.GraphMetaMPackage#getEdge_LocalPriority()
	 * @model
	 * @generated
	 */
	int getLocalPriority();

	/**
	 * Sets the value of the '{@link GraphMetaM.Edge#getLocalPriority <em>Local Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Priority</em>' attribute.
	 * @see #getLocalPriority()
	 * @generated
	 */
	void setLocalPriority(int value);

	/**
	 * Returns the value of the '<em><b>RName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RName</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RName</em>' attribute.
	 * @see #setRName(String)
	 * @see GraphMetaM.GraphMetaMPackage#getEdge_RName()
	 * @model
	 * @generated
	 */
	String getRName();

	/**
	 * Sets the value of the '{@link GraphMetaM.Edge#getRName <em>RName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RName</em>' attribute.
	 * @see #getRName()
	 * @generated
	 */
	void setRName(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see GraphMetaM.GraphMetaMPackage#getEdge_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link GraphMetaM.Edge#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link GraphMetaM.Vertex#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Vertex)
	 * @see GraphMetaM.GraphMetaMPackage#getEdge_Target()
	 * @see GraphMetaM.Vertex#getIncoming
	 * @model opposite="incoming" required="true"
	 * @generated
	 */
	Vertex getTarget();

	/**
	 * Sets the value of the '{@link GraphMetaM.Edge#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Vertex value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link GraphMetaM.Vertex#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Vertex)
	 * @see GraphMetaM.GraphMetaMPackage#getEdge_Source()
	 * @see GraphMetaM.Vertex#getOutgoing
	 * @model opposite="outgoing" required="true"
	 * @generated
	 */
	Vertex getSource();

	/**
	 * Sets the value of the '{@link GraphMetaM.Edge#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Vertex value);

} // Edge
