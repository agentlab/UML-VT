/**
 * generated by Xtext 2.10.0
 */
package org.eclipse.uml.verification.tl.temporalLogic;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml.verification.tl.temporalLogic.Property1#getNext <em>Next</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml.verification.tl.temporalLogic.TemporalLogicPackage#getProperty1()
 * @model
 * @generated
 */
public interface Property1 extends Option
{
  /**
   * Returns the value of the '<em><b>Next</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.uml.verification.tl.temporalLogic.Option}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Next</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Next</em>' containment reference list.
   * @see org.eclipse.uml.verification.tl.temporalLogic.TemporalLogicPackage#getProperty1_Next()
   * @model containment="true"
   * @generated
   */
  EList<Option> getNext();

} // Property1
