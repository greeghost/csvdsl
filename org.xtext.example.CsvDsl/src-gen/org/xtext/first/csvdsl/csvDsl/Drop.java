/**
 * generated by Xtext 2.28.0
 */
package org.xtext.first.csvdsl.csvDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Drop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.first.csvdsl.csvDsl.Drop#getNewCsv <em>New Csv</em>}</li>
 *   <li>{@link org.xtext.first.csvdsl.csvDsl.Drop#getCsv_var <em>Csv var</em>}</li>
 *   <li>{@link org.xtext.first.csvdsl.csvDsl.Drop#getRange <em>Range</em>}</li>
 * </ul>
 *
 * @see org.xtext.first.csvdsl.csvDsl.CsvDslPackage#getDrop()
 * @model
 * @generated
 */
public interface Drop extends CsvOperation
{
  /**
   * Returns the value of the '<em><b>New Csv</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>New Csv</em>' containment reference.
   * @see #setNewCsv(Csv_variable)
   * @see org.xtext.first.csvdsl.csvDsl.CsvDslPackage#getDrop_NewCsv()
   * @model containment="true"
   * @generated
   */
  Csv_variable getNewCsv();

  /**
   * Sets the value of the '{@link org.xtext.first.csvdsl.csvDsl.Drop#getNewCsv <em>New Csv</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>New Csv</em>' containment reference.
   * @see #getNewCsv()
   * @generated
   */
  void setNewCsv(Csv_variable value);

  /**
   * Returns the value of the '<em><b>Csv var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Csv var</em>' containment reference.
   * @see #setCsv_var(Csv_variable)
   * @see org.xtext.first.csvdsl.csvDsl.CsvDslPackage#getDrop_Csv_var()
   * @model containment="true"
   * @generated
   */
  Csv_variable getCsv_var();

  /**
   * Sets the value of the '{@link org.xtext.first.csvdsl.csvDsl.Drop#getCsv_var <em>Csv var</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Csv var</em>' containment reference.
   * @see #getCsv_var()
   * @generated
   */
  void setCsv_var(Csv_variable value);

  /**
   * Returns the value of the '<em><b>Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Range</em>' containment reference.
   * @see #setRange(Range)
   * @see org.xtext.first.csvdsl.csvDsl.CsvDslPackage#getDrop_Range()
   * @model containment="true"
   * @generated
   */
  Range getRange();

  /**
   * Sets the value of the '{@link org.xtext.first.csvdsl.csvDsl.Drop#getRange <em>Range</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Range</em>' containment reference.
   * @see #getRange()
   * @generated
   */
  void setRange(Range value);

} // Drop