/**
 */
package GraphMetaM.impl;

import GraphMetaM.Edge;
import GraphMetaM.Graph;
import GraphMetaM.GraphMetaMPackage;
import GraphMetaM.Vertex;

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
 * An implementation of the model object '<em><b>Graph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link GraphMetaM.impl.GraphImpl#getCycles <em>Cycles</em>}</li>
 *   <li>{@link GraphMetaM.impl.GraphImpl#getRName <em>RName</em>}</li>
 *   <li>{@link GraphMetaM.impl.GraphImpl#getName <em>Name</em>}</li>
 *   <li>{@link GraphMetaM.impl.GraphImpl#getVertex <em>Vertex</em>}</li>
 *   <li>{@link GraphMetaM.impl.GraphImpl#getEdge <em>Edge</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GraphImpl extends MinimalEObjectImpl.Container implements Graph {
	/**
	 * The default value of the '{@link #getCycles() <em>Cycles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCycles()
	 * @generated
	 * @ordered
	 */
	protected static final int CYCLES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCycles() <em>Cycles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCycles()
	 * @generated
	 * @ordered
	 */
	protected int cycles = CYCLES_EDEFAULT;

	/**
	 * The default value of the '{@link #getRName() <em>RName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRName()
	 * @generated
	 * @ordered
	 */
	protected static final String RNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRName() <em>RName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRName()
	 * @generated
	 * @ordered
	 */
	protected String rName = RNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVertex() <em>Vertex</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVertex()
	 * @generated
	 * @ordered
	 */
	protected EList<Vertex> vertex;

	/**
	 * The cached value of the '{@link #getEdge() <em>Edge</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdge()
	 * @generated
	 * @ordered
	 */
	protected EList<Edge> edge;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphMetaMPackage.Literals.GRAPH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCycles() {
		return cycles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCycles(int newCycles) {
		int oldCycles = cycles;
		cycles = newCycles;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphMetaMPackage.GRAPH__CYCLES, oldCycles, cycles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRName() {
		return rName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRName(String newRName) {
		String oldRName = rName;
		rName = newRName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphMetaMPackage.GRAPH__RNAME, oldRName, rName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphMetaMPackage.GRAPH__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Vertex> getVertex() {
		if (vertex == null) {
			vertex = new EObjectContainmentEList<Vertex>(Vertex.class, this, GraphMetaMPackage.GRAPH__VERTEX);
		}
		return vertex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Edge> getEdge() {
		if (edge == null) {
			edge = new EObjectContainmentEList<Edge>(Edge.class, this, GraphMetaMPackage.GRAPH__EDGE);
		}
		return edge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GraphMetaMPackage.GRAPH__VERTEX:
				return ((InternalEList<?>)getVertex()).basicRemove(otherEnd, msgs);
			case GraphMetaMPackage.GRAPH__EDGE:
				return ((InternalEList<?>)getEdge()).basicRemove(otherEnd, msgs);
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
			case GraphMetaMPackage.GRAPH__CYCLES:
				return getCycles();
			case GraphMetaMPackage.GRAPH__RNAME:
				return getRName();
			case GraphMetaMPackage.GRAPH__NAME:
				return getName();
			case GraphMetaMPackage.GRAPH__VERTEX:
				return getVertex();
			case GraphMetaMPackage.GRAPH__EDGE:
				return getEdge();
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
			case GraphMetaMPackage.GRAPH__CYCLES:
				setCycles((Integer)newValue);
				return;
			case GraphMetaMPackage.GRAPH__RNAME:
				setRName((String)newValue);
				return;
			case GraphMetaMPackage.GRAPH__NAME:
				setName((String)newValue);
				return;
			case GraphMetaMPackage.GRAPH__VERTEX:
				getVertex().clear();
				getVertex().addAll((Collection<? extends Vertex>)newValue);
				return;
			case GraphMetaMPackage.GRAPH__EDGE:
				getEdge().clear();
				getEdge().addAll((Collection<? extends Edge>)newValue);
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
			case GraphMetaMPackage.GRAPH__CYCLES:
				setCycles(CYCLES_EDEFAULT);
				return;
			case GraphMetaMPackage.GRAPH__RNAME:
				setRName(RNAME_EDEFAULT);
				return;
			case GraphMetaMPackage.GRAPH__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GraphMetaMPackage.GRAPH__VERTEX:
				getVertex().clear();
				return;
			case GraphMetaMPackage.GRAPH__EDGE:
				getEdge().clear();
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
			case GraphMetaMPackage.GRAPH__CYCLES:
				return cycles != CYCLES_EDEFAULT;
			case GraphMetaMPackage.GRAPH__RNAME:
				return RNAME_EDEFAULT == null ? rName != null : !RNAME_EDEFAULT.equals(rName);
			case GraphMetaMPackage.GRAPH__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GraphMetaMPackage.GRAPH__VERTEX:
				return vertex != null && !vertex.isEmpty();
			case GraphMetaMPackage.GRAPH__EDGE:
				return edge != null && !edge.isEmpty();
		}
		return super.eIsSet(featureID);
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
		result.append(" (cycles: ");
		result.append(cycles);
		result.append(", rName: ");
		result.append(rName);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //GraphImpl
