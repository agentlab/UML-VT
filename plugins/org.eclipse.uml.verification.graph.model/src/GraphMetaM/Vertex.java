/**
 */
package GraphMetaM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vertex</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GraphMetaM.Vertex#getCycles <em>Cycles</em>}</li>
 *   <li>{@link GraphMetaM.Vertex#getGlobalPriority <em>Global Priority</em>}</li>
 *   <li>{@link GraphMetaM.Vertex#getActivity <em>Activity</em>}</li>
 *   <li>{@link GraphMetaM.Vertex#getRName <em>RName</em>}</li>
 *   <li>{@link GraphMetaM.Vertex#getType <em>Type</em>}</li>
 *   <li>{@link GraphMetaM.Vertex#getName <em>Name</em>}</li>
 *   <li>{@link GraphMetaM.Vertex#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link GraphMetaM.Vertex#getOutgoing <em>Outgoing</em>}</li>
 * </ul>
 *
 * @see GraphMetaM.GraphMetaMPackage#getVertex()
 * @model
 * @generated
 */
public interface Vertex extends EObject {
	/**
	 * Returns the value of the '<em><b>Cycles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cycles</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cycles</em>' attribute.
	 * @see #setCycles(int)
	 * @see GraphMetaM.GraphMetaMPackage#getVertex_Cycles()
	 * @model
	 * @generated
	 */
	int getCycles();

	/**
	 * Sets the value of the '{@link GraphMetaM.Vertex#getCycles <em>Cycles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cycles</em>' attribute.
	 * @see #getCycles()
	 * @generated
	 */
	void setCycles(int value);

	/**
	 * Returns the value of the '<em><b>Global Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Priority</em>' attribute.
	 * @see #setGlobalPriority(int)
	 * @see GraphMetaM.GraphMetaMPackage#getVertex_GlobalPriority()
	 * @model
	 * @generated
	 */
	int getGlobalPriority();

	/**
	 * Sets the value of the '{@link GraphMetaM.Vertex#getGlobalPriority <em>Global Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global Priority</em>' attribute.
	 * @see #getGlobalPriority()
	 * @generated
	 */
	void setGlobalPriority(int value);

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' attribute.
	 * @see #setActivity(String)
	 * @see GraphMetaM.GraphMetaMPackage#getVertex_Activity()
	 * @model
	 * @generated
	 */
	String getActivity();

	/**
	 * Sets the value of the '{@link GraphMetaM.Vertex#getActivity <em>Activity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity</em>' attribute.
	 * @see #getActivity()
	 * @generated
	 */
	void setActivity(String value);

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
	 * @see GraphMetaM.GraphMetaMPackage#getVertex_RName()
	 * @model
	 * @generated
	 */
	String getRName();

	/**
	 * Sets the value of the '{@link GraphMetaM.Vertex#getRName <em>RName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RName</em>' attribute.
	 * @see #getRName()
	 * @generated
	 */
	void setRName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link GraphMetaM.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see GraphMetaM.Type
	 * @see #setType(Type)
	 * @see GraphMetaM.GraphMetaMPackage#getVertex_Type()
	 * @model
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link GraphMetaM.Vertex#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see GraphMetaM.Type
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

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
	 * @see GraphMetaM.GraphMetaMPackage#getVertex_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link GraphMetaM.Vertex#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link GraphMetaM.Edge}.
	 * It is bidirectional and its opposite is '{@link GraphMetaM.Edge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see GraphMetaM.GraphMetaMPackage#getVertex_Incoming()
	 * @see GraphMetaM.Edge#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Edge> getIncoming();

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link GraphMetaM.Edge}.
	 * It is bidirectional and its opposite is '{@link GraphMetaM.Edge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see GraphMetaM.GraphMetaMPackage#getVertex_Outgoing()
	 * @see GraphMetaM.Edge#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Edge> getOutgoing();

} // Vertex
