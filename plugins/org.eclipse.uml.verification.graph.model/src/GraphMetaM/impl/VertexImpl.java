/**
 */
package GraphMetaM.impl;

import GraphMetaM.Edge;
import GraphMetaM.GraphMetaMPackage;
import GraphMetaM.Type;
import GraphMetaM.Vertex;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vertex</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link GraphMetaM.impl.VertexImpl#getCycles <em>Cycles</em>}</li>
 *   <li>{@link GraphMetaM.impl.VertexImpl#getGlobalPriority <em>Global Priority</em>}</li>
 *   <li>{@link GraphMetaM.impl.VertexImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link GraphMetaM.impl.VertexImpl#getRName <em>RName</em>}</li>
 *   <li>{@link GraphMetaM.impl.VertexImpl#getType <em>Type</em>}</li>
 *   <li>{@link GraphMetaM.impl.VertexImpl#getName <em>Name</em>}</li>
 *   <li>{@link GraphMetaM.impl.VertexImpl#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link GraphMetaM.impl.VertexImpl#getOutgoing <em>Outgoing</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VertexImpl extends MinimalEObjectImpl.Container implements Vertex {
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
	 * The default value of the '{@link #getGlobalPriority() <em>Global Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalPriority()
	 * @generated
	 * @ordered
	 */
	protected static final int GLOBAL_PRIORITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGlobalPriority() <em>Global Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalPriority()
	 * @generated
	 * @ordered
	 */
	protected int globalPriority = GLOBAL_PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getActivity() <em>Activity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivity()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTIVITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActivity() <em>Activity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivity()
	 * @generated
	 * @ordered
	 */
	protected String activity = ACTIVITY_EDEFAULT;

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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final Type TYPE_EDEFAULT = Type.AND;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type = TYPE_EDEFAULT;

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
	 * The cached value of the '{@link #getIncoming() <em>Incoming</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncoming()
	 * @generated
	 * @ordered
	 */
	protected EList<Edge> incoming;

	/**
	 * The cached value of the '{@link #getOutgoing() <em>Outgoing</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoing()
	 * @generated
	 * @ordered
	 */
	protected EList<Edge> outgoing;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VertexImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphMetaMPackage.Literals.VERTEX;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GraphMetaMPackage.VERTEX__CYCLES, oldCycles, cycles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getGlobalPriority() {
		return globalPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlobalPriority(int newGlobalPriority) {
		int oldGlobalPriority = globalPriority;
		globalPriority = newGlobalPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphMetaMPackage.VERTEX__GLOBAL_PRIORITY, oldGlobalPriority, globalPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActivity() {
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivity(String newActivity) {
		String oldActivity = activity;
		activity = newActivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphMetaMPackage.VERTEX__ACTIVITY, oldActivity, activity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GraphMetaMPackage.VERTEX__RNAME, oldRName, rName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType) {
		Type oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphMetaMPackage.VERTEX__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GraphMetaMPackage.VERTEX__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Edge> getIncoming() {
		if (incoming == null) {
			incoming = new EObjectWithInverseResolvingEList<Edge>(Edge.class, this, GraphMetaMPackage.VERTEX__INCOMING, GraphMetaMPackage.EDGE__TARGET);
		}
		return incoming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Edge> getOutgoing() {
		if (outgoing == null) {
			outgoing = new EObjectWithInverseResolvingEList<Edge>(Edge.class, this, GraphMetaMPackage.VERTEX__OUTGOING, GraphMetaMPackage.EDGE__SOURCE);
		}
		return outgoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GraphMetaMPackage.VERTEX__INCOMING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncoming()).basicAdd(otherEnd, msgs);
			case GraphMetaMPackage.VERTEX__OUTGOING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoing()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GraphMetaMPackage.VERTEX__INCOMING:
				return ((InternalEList<?>)getIncoming()).basicRemove(otherEnd, msgs);
			case GraphMetaMPackage.VERTEX__OUTGOING:
				return ((InternalEList<?>)getOutgoing()).basicRemove(otherEnd, msgs);
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
			case GraphMetaMPackage.VERTEX__CYCLES:
				return getCycles();
			case GraphMetaMPackage.VERTEX__GLOBAL_PRIORITY:
				return getGlobalPriority();
			case GraphMetaMPackage.VERTEX__ACTIVITY:
				return getActivity();
			case GraphMetaMPackage.VERTEX__RNAME:
				return getRName();
			case GraphMetaMPackage.VERTEX__TYPE:
				return getType();
			case GraphMetaMPackage.VERTEX__NAME:
				return getName();
			case GraphMetaMPackage.VERTEX__INCOMING:
				return getIncoming();
			case GraphMetaMPackage.VERTEX__OUTGOING:
				return getOutgoing();
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
			case GraphMetaMPackage.VERTEX__CYCLES:
				setCycles((Integer)newValue);
				return;
			case GraphMetaMPackage.VERTEX__GLOBAL_PRIORITY:
				setGlobalPriority((Integer)newValue);
				return;
			case GraphMetaMPackage.VERTEX__ACTIVITY:
				setActivity((String)newValue);
				return;
			case GraphMetaMPackage.VERTEX__RNAME:
				setRName((String)newValue);
				return;
			case GraphMetaMPackage.VERTEX__TYPE:
				setType((Type)newValue);
				return;
			case GraphMetaMPackage.VERTEX__NAME:
				setName((String)newValue);
				return;
			case GraphMetaMPackage.VERTEX__INCOMING:
				getIncoming().clear();
				getIncoming().addAll((Collection<? extends Edge>)newValue);
				return;
			case GraphMetaMPackage.VERTEX__OUTGOING:
				getOutgoing().clear();
				getOutgoing().addAll((Collection<? extends Edge>)newValue);
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
			case GraphMetaMPackage.VERTEX__CYCLES:
				setCycles(CYCLES_EDEFAULT);
				return;
			case GraphMetaMPackage.VERTEX__GLOBAL_PRIORITY:
				setGlobalPriority(GLOBAL_PRIORITY_EDEFAULT);
				return;
			case GraphMetaMPackage.VERTEX__ACTIVITY:
				setActivity(ACTIVITY_EDEFAULT);
				return;
			case GraphMetaMPackage.VERTEX__RNAME:
				setRName(RNAME_EDEFAULT);
				return;
			case GraphMetaMPackage.VERTEX__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case GraphMetaMPackage.VERTEX__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GraphMetaMPackage.VERTEX__INCOMING:
				getIncoming().clear();
				return;
			case GraphMetaMPackage.VERTEX__OUTGOING:
				getOutgoing().clear();
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
			case GraphMetaMPackage.VERTEX__CYCLES:
				return cycles != CYCLES_EDEFAULT;
			case GraphMetaMPackage.VERTEX__GLOBAL_PRIORITY:
				return globalPriority != GLOBAL_PRIORITY_EDEFAULT;
			case GraphMetaMPackage.VERTEX__ACTIVITY:
				return ACTIVITY_EDEFAULT == null ? activity != null : !ACTIVITY_EDEFAULT.equals(activity);
			case GraphMetaMPackage.VERTEX__RNAME:
				return RNAME_EDEFAULT == null ? rName != null : !RNAME_EDEFAULT.equals(rName);
			case GraphMetaMPackage.VERTEX__TYPE:
				return type != TYPE_EDEFAULT;
			case GraphMetaMPackage.VERTEX__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GraphMetaMPackage.VERTEX__INCOMING:
				return incoming != null && !incoming.isEmpty();
			case GraphMetaMPackage.VERTEX__OUTGOING:
				return outgoing != null && !outgoing.isEmpty();
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
		result.append(", globalPriority: ");
		result.append(globalPriority);
		result.append(", activity: ");
		result.append(activity);
		result.append(", rName: ");
		result.append(rName);
		result.append(", type: ");
		result.append(type);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //VertexImpl
