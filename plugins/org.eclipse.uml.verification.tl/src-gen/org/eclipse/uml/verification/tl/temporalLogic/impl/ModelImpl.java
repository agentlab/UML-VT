/**
 * generated by Xtext 2.10.0
 */
package org.eclipse.uml.verification.tl.temporalLogic.impl;

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

import org.eclipse.uml.verification.tl.temporalLogic.Import;
import org.eclipse.uml.verification.tl.temporalLogic.Model;
import org.eclipse.uml.verification.tl.temporalLogic.Property1;
import org.eclipse.uml.verification.tl.temporalLogic.Property2;
import org.eclipse.uml.verification.tl.temporalLogic.TemporalLogicPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml.verification.tl.temporalLogic.impl.ModelImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.eclipse.uml.verification.tl.temporalLogic.impl.ModelImpl#getProperty1 <em>Property1</em>}</li>
 *   <li>{@link org.eclipse.uml.verification.tl.temporalLogic.impl.ModelImpl#getProperty2 <em>Property2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocation()
   * @generated
   * @ordered
   */
  protected Import location;

  /**
   * The cached value of the '{@link #getProperty1() <em>Property1</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperty1()
   * @generated
   * @ordered
   */
  protected EList<Property1> property1;

  /**
   * The cached value of the '{@link #getProperty2() <em>Property2</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperty2()
   * @generated
   * @ordered
   */
  protected EList<Property2> property2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return TemporalLogicPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import getLocation()
  {
    return location;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLocation(Import newLocation, NotificationChain msgs)
  {
    Import oldLocation = location;
    location = newLocation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TemporalLogicPackage.MODEL__LOCATION, oldLocation, newLocation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLocation(Import newLocation)
  {
    if (newLocation != location)
    {
      NotificationChain msgs = null;
      if (location != null)
        msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TemporalLogicPackage.MODEL__LOCATION, null, msgs);
      if (newLocation != null)
        msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TemporalLogicPackage.MODEL__LOCATION, null, msgs);
      msgs = basicSetLocation(newLocation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TemporalLogicPackage.MODEL__LOCATION, newLocation, newLocation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Property1> getProperty1()
  {
    if (property1 == null)
    {
      property1 = new EObjectContainmentEList<Property1>(Property1.class, this, TemporalLogicPackage.MODEL__PROPERTY1);
    }
    return property1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Property2> getProperty2()
  {
    if (property2 == null)
    {
      property2 = new EObjectContainmentEList<Property2>(Property2.class, this, TemporalLogicPackage.MODEL__PROPERTY2);
    }
    return property2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case TemporalLogicPackage.MODEL__LOCATION:
        return basicSetLocation(null, msgs);
      case TemporalLogicPackage.MODEL__PROPERTY1:
        return ((InternalEList<?>)getProperty1()).basicRemove(otherEnd, msgs);
      case TemporalLogicPackage.MODEL__PROPERTY2:
        return ((InternalEList<?>)getProperty2()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case TemporalLogicPackage.MODEL__LOCATION:
        return getLocation();
      case TemporalLogicPackage.MODEL__PROPERTY1:
        return getProperty1();
      case TemporalLogicPackage.MODEL__PROPERTY2:
        return getProperty2();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TemporalLogicPackage.MODEL__LOCATION:
        setLocation((Import)newValue);
        return;
      case TemporalLogicPackage.MODEL__PROPERTY1:
        getProperty1().clear();
        getProperty1().addAll((Collection<? extends Property1>)newValue);
        return;
      case TemporalLogicPackage.MODEL__PROPERTY2:
        getProperty2().clear();
        getProperty2().addAll((Collection<? extends Property2>)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case TemporalLogicPackage.MODEL__LOCATION:
        setLocation((Import)null);
        return;
      case TemporalLogicPackage.MODEL__PROPERTY1:
        getProperty1().clear();
        return;
      case TemporalLogicPackage.MODEL__PROPERTY2:
        getProperty2().clear();
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case TemporalLogicPackage.MODEL__LOCATION:
        return location != null;
      case TemporalLogicPackage.MODEL__PROPERTY1:
        return property1 != null && !property1.isEmpty();
      case TemporalLogicPackage.MODEL__PROPERTY2:
        return property2 != null && !property2.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl
