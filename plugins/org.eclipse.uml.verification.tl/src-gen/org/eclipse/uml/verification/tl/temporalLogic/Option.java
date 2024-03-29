/**
 * generated by Xtext 2.10.0
 */
package org.eclipse.uml.verification.tl.temporalLogic;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml.verification.tl.temporalLogic.Option#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.eclipse.uml.verification.tl.temporalLogic.Option#getModelElement1 <em>Model Element1</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml.verification.tl.temporalLogic.TemporalLogicPackage#getOption()
 * @model
 * @generated
 */
public interface Option extends EObject
{
  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute.
   * @see #setOperator(String)
   * @see org.eclipse.uml.verification.tl.temporalLogic.TemporalLogicPackage#getOption_Operator()
   * @model
   * @generated
   */
  String getOperator();

  /**
   * Sets the value of the '{@link org.eclipse.uml.verification.tl.temporalLogic.Option#getOperator <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' attribute.
   * @see #getOperator()
   * @generated
   */
  void setOperator(String value);

  /**
   * Returns the value of the '<em><b>Model Element1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Model Element1</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Model Element1</em>' attribute.
   * @see #setModelElement1(String)
   * @see org.eclipse.uml.verification.tl.temporalLogic.TemporalLogicPackage#getOption_ModelElement1()
   * @model
   * @generated
   */
  String getModelElement1();

  /**
   * Sets the value of the '{@link org.eclipse.uml.verification.tl.temporalLogic.Option#getModelElement1 <em>Model Element1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Model Element1</em>' attribute.
   * @see #getModelElement1()
   * @generated
   */
  void setModelElement1(String value);

} // Option
