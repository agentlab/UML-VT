/**
 */
package GraphMetaM.impl;

import GraphMetaM.Edge;
import GraphMetaM.GraphMetaMPackage;
import GraphMetaM.Vertex;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link GraphMetaM.impl.EdgeImpl#isAsync <em>Async</em>}</li>
 *   <li>{@link GraphMetaM.impl.EdgeImpl#getLocalPriority <em>Local Priority</em>}</li>
 *   <li>{@link GraphMetaM.impl.EdgeImpl#getRName <em>RName</em>}</li>
 *   <li>{@link GraphMetaM.impl.EdgeImpl#getName <em>Name</em>}</li>
 *   <li>{@link GraphMetaM.impl.EdgeImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link GraphMetaM.impl.EdgeImpl#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EdgeImpl extends MinimalEObjectImpl.Container implements Edge {
	/**
	 * The default value of the '{@link #isAsync() <em>Async</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAsync()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ASYNC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAsync() <em>Async</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAsync()
	 * @generated
	 * @ordered
	 */
	protected boolean async = ASYNC_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocalPriority() <em>Local Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalPriority()
	 * @generated
	 * @ordered
	 */
	protected static final int LOCAL_PRIORITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLocalPriority() <em>Local Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalPriority()
	 * @generated
	 * @ordered
	 */
	protected int localPriority = LOCAL_PRIORITY_EDEFAULT;

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
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Vertex target;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Vertex source;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EdgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphMetaMPackage.Literals.EDGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAsync() {
		return async;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAsync(boolean newAsync) {
		boolean oldAsync = async;
		async = newAsync;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphMetaMPackage.EDGE__ASYNC, oldAsync, async));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLocalPriority() {
		return localPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalPriority(int newLocalPriority) {
		int oldLocalPriority = localPriority;
		localPriority = newLocalPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphMetaMPackage.EDGE__LOCAL_PRIORITY, oldLocalPriority, localPriority));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GraphMetaMPackage.EDGE__RNAME, oldRName, rName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GraphMetaMPackage.EDGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vertex getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Vertex)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GraphMetaMPackage.EDGE__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vertex basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(Vertex newTarget, NotificationChain msgs) {
		Vertex oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraphMetaMPackage.EDGE__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Vertex newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, GraphMetaMPackage.VERTEX__INCOMING, Vertex.class, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, GraphMetaMPackage.VERTEX__INCOMING, Vertex.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphMetaMPackage.EDGE__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vertex getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Vertex)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GraphMetaMPackage.EDGE__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vertex basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(Vertex newSource, NotificationChain msgs) {
		Vertex oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraphMetaMPackage.EDGE__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Vertex newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, GraphMetaMPackage.VERTEX__OUTGOING, Vertex.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, GraphMetaMPackage.VERTEX__OUTGOING, Vertex.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphMetaMPackage.EDGE__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GraphMetaMPackage.EDGE__TARGET:
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, GraphMetaMPackage.VERTEX__INCOMING, Vertex.class, msgs);
				return basicSetTarget((Vertex)otherEnd, msgs);
			case GraphMetaMPackage.EDGE__SOURCE:
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, GraphMetaMPackage.VERTEX__OUTGOING, Vertex.class, msgs);
				return basicSetSource((Vertex)otherEnd, msgs);
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
			case GraphMetaMPackage.EDGE__TARGET:
				return basicSetTarget(null, msgs);
			case GraphMetaMPackage.EDGE__SOURCE:
				return basicSetSource(null, msgs);
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
			case GraphMetaMPackage.EDGE__ASYNC:
				return isAsync();
			case GraphMetaMPackage.EDGE__LOCAL_PRIORITY:
				return getLocalPriority();
			case GraphMetaMPackage.EDGE__RNAME:
				return getRName();
			case GraphMetaMPackage.EDGE__NAME:
				return getName();
			case GraphMetaMPackage.EDGE__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case GraphMetaMPackage.EDGE__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GraphMetaMPackage.EDGE__ASYNC:
				setAsync((Boolean)newValue);
				return;
			case GraphMetaMPackage.EDGE__LOCAL_PRIORITY:
				setLocalPriority((Integer)newValue);
				return;
			case GraphMetaMPackage.EDGE__RNAME:
				setRName((String)newValue);
				return;
			case GraphMetaMPackage.EDGE__NAME:
				setName((String)newValue);
				return;
			case GraphMetaMPackage.EDGE__TARGET:
				setTarget((Vertex)newValue);
				return;
			case GraphMetaMPackage.EDGE__SOURCE:
				setSource((Vertex)newValue);
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
			case GraphMetaMPackage.EDGE__ASYNC:
				setAsync(ASYNC_EDEFAULT);
				return;
			case GraphMetaMPackage.EDGE__LOCAL_PRIORITY:
				setLocalPriority(LOCAL_PRIORITY_EDEFAULT);
				return;
			case GraphMetaMPackage.EDGE__RNAME:
				setRName(RNAME_EDEFAULT);
				return;
			case GraphMetaMPackage.EDGE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GraphMetaMPackage.EDGE__TARGET:
				setTarget((Vertex)null);
				return;
			case GraphMetaMPackage.EDGE__SOURCE:
				setSource((Vertex)null);
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
			case GraphMetaMPackage.EDGE__ASYNC:
				return async != ASYNC_EDEFAULT;
			case GraphMetaMPackage.EDGE__LOCAL_PRIORITY:
				return localPriority != LOCAL_PRIORITY_EDEFAULT;
			case GraphMetaMPackage.EDGE__RNAME:
				return RNAME_EDEFAULT == null ? rName != null : !RNAME_EDEFAULT.equals(rName);
			case GraphMetaMPackage.EDGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GraphMetaMPackage.EDGE__TARGET:
				return target != null;
			case GraphMetaMPackage.EDGE__SOURCE:
				return source != null;
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
		result.append(" (async: ");
		result.append(async);
		result.append(", localPriority: ");
		result.append(localPriority);
		result.append(", rName: ");
		result.append(rName);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //EdgeImpl
