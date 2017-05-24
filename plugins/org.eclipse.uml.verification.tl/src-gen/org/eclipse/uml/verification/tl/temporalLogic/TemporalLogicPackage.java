/**
 * generated by Xtext 2.10.0
 */
package org.eclipse.uml.verification.tl.temporalLogic;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.uml.verification.tl.temporalLogic.TemporalLogicFactory
 * @model kind="package"
 * @generated
 */
public interface TemporalLogicPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "temporalLogic";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.eclipse.org/uml/verification/tl/TemporalLogic";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "temporalLogic";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TemporalLogicPackage eINSTANCE = org.eclipse.uml.verification.tl.temporalLogic.impl.TemporalLogicPackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipse.uml.verification.tl.temporalLogic.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.uml.verification.tl.temporalLogic.impl.ModelImpl
   * @see org.eclipse.uml.verification.tl.temporalLogic.impl.TemporalLogicPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Location</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__LOCATION = 0;

  /**
   * The feature id for the '<em><b>Property1</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__PROPERTY1 = 1;

  /**
   * The feature id for the '<em><b>Property2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__PROPERTY2 = 2;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipse.uml.verification.tl.temporalLogic.impl.OptionImpl <em>Option</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.uml.verification.tl.temporalLogic.impl.OptionImpl
   * @see org.eclipse.uml.verification.tl.temporalLogic.impl.TemporalLogicPackageImpl#getOption()
   * @generated
   */
  int OPTION = 1;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTION__OPERATOR = 0;

  /**
   * The feature id for the '<em><b>Model Element1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTION__MODEL_ELEMENT1 = 1;

  /**
   * The number of structural features of the '<em>Option</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.uml.verification.tl.temporalLogic.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.uml.verification.tl.temporalLogic.impl.ImportImpl
   * @see org.eclipse.uml.verification.tl.temporalLogic.impl.TemporalLogicPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 2;

  /**
   * The feature id for the '<em><b>Model</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__MODEL = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.uml.verification.tl.temporalLogic.impl.Property1Impl <em>Property1</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.uml.verification.tl.temporalLogic.impl.Property1Impl
   * @see org.eclipse.uml.verification.tl.temporalLogic.impl.TemporalLogicPackageImpl#getProperty1()
   * @generated
   */
  int PROPERTY1 = 3;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY1__OPERATOR = OPTION__OPERATOR;

  /**
   * The feature id for the '<em><b>Model Element1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY1__MODEL_ELEMENT1 = OPTION__MODEL_ELEMENT1;

  /**
   * The feature id for the '<em><b>Next</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY1__NEXT = OPTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Property1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY1_FEATURE_COUNT = OPTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.uml.verification.tl.temporalLogic.impl.Property2Impl <em>Property2</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.uml.verification.tl.temporalLogic.impl.Property2Impl
   * @see org.eclipse.uml.verification.tl.temporalLogic.impl.TemporalLogicPackageImpl#getProperty2()
   * @generated
   */
  int PROPERTY2 = 4;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY2__OPERATOR = OPTION__OPERATOR;

  /**
   * The feature id for the '<em><b>Model Element1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY2__MODEL_ELEMENT1 = OPTION__MODEL_ELEMENT1;

  /**
   * The feature id for the '<em><b>Model Element2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY2__MODEL_ELEMENT2 = OPTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Next</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY2__NEXT = OPTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Property2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY2_FEATURE_COUNT = OPTION_FEATURE_COUNT + 2;


  /**
   * Returns the meta object for class '{@link org.eclipse.uml.verification.tl.temporalLogic.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.eclipse.uml.verification.tl.temporalLogic.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.uml.verification.tl.temporalLogic.Model#getLocation <em>Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Location</em>'.
   * @see org.eclipse.uml.verification.tl.temporalLogic.Model#getLocation()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Location();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.uml.verification.tl.temporalLogic.Model#getProperty1 <em>Property1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Property1</em>'.
   * @see org.eclipse.uml.verification.tl.temporalLogic.Model#getProperty1()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Property1();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.uml.verification.tl.temporalLogic.Model#getProperty2 <em>Property2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Property2</em>'.
   * @see org.eclipse.uml.verification.tl.temporalLogic.Model#getProperty2()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Property2();

  /**
   * Returns the meta object for class '{@link org.eclipse.uml.verification.tl.temporalLogic.Option <em>Option</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Option</em>'.
   * @see org.eclipse.uml.verification.tl.temporalLogic.Option
   * @generated
   */
  EClass getOption();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.uml.verification.tl.temporalLogic.Option#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see org.eclipse.uml.verification.tl.temporalLogic.Option#getOperator()
   * @see #getOption()
   * @generated
   */
  EAttribute getOption_Operator();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.uml.verification.tl.temporalLogic.Option#getModelElement1 <em>Model Element1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Model Element1</em>'.
   * @see org.eclipse.uml.verification.tl.temporalLogic.Option#getModelElement1()
   * @see #getOption()
   * @generated
   */
  EAttribute getOption_ModelElement1();

  /**
   * Returns the meta object for class '{@link org.eclipse.uml.verification.tl.temporalLogic.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see org.eclipse.uml.verification.tl.temporalLogic.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.uml.verification.tl.temporalLogic.Import#getModel <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Model</em>'.
   * @see org.eclipse.uml.verification.tl.temporalLogic.Import#getModel()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_Model();

  /**
   * Returns the meta object for class '{@link org.eclipse.uml.verification.tl.temporalLogic.Property1 <em>Property1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property1</em>'.
   * @see org.eclipse.uml.verification.tl.temporalLogic.Property1
   * @generated
   */
  EClass getProperty1();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.uml.verification.tl.temporalLogic.Property1#getNext <em>Next</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Next</em>'.
   * @see org.eclipse.uml.verification.tl.temporalLogic.Property1#getNext()
   * @see #getProperty1()
   * @generated
   */
  EReference getProperty1_Next();

  /**
   * Returns the meta object for class '{@link org.eclipse.uml.verification.tl.temporalLogic.Property2 <em>Property2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property2</em>'.
   * @see org.eclipse.uml.verification.tl.temporalLogic.Property2
   * @generated
   */
  EClass getProperty2();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.uml.verification.tl.temporalLogic.Property2#getModelElement2 <em>Model Element2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Model Element2</em>'.
   * @see org.eclipse.uml.verification.tl.temporalLogic.Property2#getModelElement2()
   * @see #getProperty2()
   * @generated
   */
  EAttribute getProperty2_ModelElement2();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.uml.verification.tl.temporalLogic.Property2#getNext <em>Next</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Next</em>'.
   * @see org.eclipse.uml.verification.tl.temporalLogic.Property2#getNext()
   * @see #getProperty2()
   * @generated
   */
  EReference getProperty2_Next();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  TemporalLogicFactory getTemporalLogicFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.eclipse.uml.verification.tl.temporalLogic.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.uml.verification.tl.temporalLogic.impl.ModelImpl
     * @see org.eclipse.uml.verification.tl.temporalLogic.impl.TemporalLogicPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__LOCATION = eINSTANCE.getModel_Location();

    /**
     * The meta object literal for the '<em><b>Property1</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__PROPERTY1 = eINSTANCE.getModel_Property1();

    /**
     * The meta object literal for the '<em><b>Property2</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__PROPERTY2 = eINSTANCE.getModel_Property2();

    /**
     * The meta object literal for the '{@link org.eclipse.uml.verification.tl.temporalLogic.impl.OptionImpl <em>Option</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.uml.verification.tl.temporalLogic.impl.OptionImpl
     * @see org.eclipse.uml.verification.tl.temporalLogic.impl.TemporalLogicPackageImpl#getOption()
     * @generated
     */
    EClass OPTION = eINSTANCE.getOption();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPTION__OPERATOR = eINSTANCE.getOption_Operator();

    /**
     * The meta object literal for the '<em><b>Model Element1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPTION__MODEL_ELEMENT1 = eINSTANCE.getOption_ModelElement1();

    /**
     * The meta object literal for the '{@link org.eclipse.uml.verification.tl.temporalLogic.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.uml.verification.tl.temporalLogic.impl.ImportImpl
     * @see org.eclipse.uml.verification.tl.temporalLogic.impl.TemporalLogicPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Model</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__MODEL = eINSTANCE.getImport_Model();

    /**
     * The meta object literal for the '{@link org.eclipse.uml.verification.tl.temporalLogic.impl.Property1Impl <em>Property1</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.uml.verification.tl.temporalLogic.impl.Property1Impl
     * @see org.eclipse.uml.verification.tl.temporalLogic.impl.TemporalLogicPackageImpl#getProperty1()
     * @generated
     */
    EClass PROPERTY1 = eINSTANCE.getProperty1();

    /**
     * The meta object literal for the '<em><b>Next</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY1__NEXT = eINSTANCE.getProperty1_Next();

    /**
     * The meta object literal for the '{@link org.eclipse.uml.verification.tl.temporalLogic.impl.Property2Impl <em>Property2</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.uml.verification.tl.temporalLogic.impl.Property2Impl
     * @see org.eclipse.uml.verification.tl.temporalLogic.impl.TemporalLogicPackageImpl#getProperty2()
     * @generated
     */
    EClass PROPERTY2 = eINSTANCE.getProperty2();

    /**
     * The meta object literal for the '<em><b>Model Element2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY2__MODEL_ELEMENT2 = eINSTANCE.getProperty2_ModelElement2();

    /**
     * The meta object literal for the '<em><b>Next</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY2__NEXT = eINSTANCE.getProperty2_Next();

  }

} //TemporalLogicPackage
