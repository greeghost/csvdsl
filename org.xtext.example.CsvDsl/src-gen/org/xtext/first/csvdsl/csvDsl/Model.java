/**
 * generated by Xtext 2.28.0
 */
package org.xtext.first.csvdsl.csvDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.first.csvdsl.csvDsl.Model#getStatement <em>Statement</em>}</li>
 * </ul>
 *
 * @see org.xtext.first.csvdsl.csvDsl.CsvDslPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Statement</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.first.csvdsl.csvDsl.Statement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statement</em>' containment reference list.
   * @see org.xtext.first.csvdsl.csvDsl.CsvDslPackage#getModel_Statement()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getStatement();

} // Model
