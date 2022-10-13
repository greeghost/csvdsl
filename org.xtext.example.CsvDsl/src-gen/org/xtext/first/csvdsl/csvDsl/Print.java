/**
 * generated by Xtext 2.28.0
 */
package org.xtext.first.csvdsl.csvDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Print</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.first.csvdsl.csvDsl.Print#getVal <em>Val</em>}</li>
 * </ul>
 *
 * @see org.xtext.first.csvdsl.csvDsl.CsvDslPackage#getPrint()
 * @model
 * @generated
 */
public interface Print extends Statement
{
  /**
   * Returns the value of the '<em><b>Val</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Val</em>' containment reference.
   * @see #setVal(EObject)
   * @see org.xtext.first.csvdsl.csvDsl.CsvDslPackage#getPrint_Val()
   * @model containment="true"
   * @generated
   */
  EObject getVal();

  /**
   * Sets the value of the '{@link org.xtext.first.csvdsl.csvDsl.Print#getVal <em>Val</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Val</em>' containment reference.
   * @see #getVal()
   * @generated
   */
  void setVal(EObject value);

} // Print
