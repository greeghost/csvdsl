/**
 * generated by Xtext 2.28.0
 */
package org.xtext.first.csvdsl.csvDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.first.csvdsl.csvDsl.Product#getVar <em>Var</em>}</li>
 *   <li>{@link org.xtext.first.csvdsl.csvDsl.Product#getSelection <em>Selection</em>}</li>
 * </ul>
 *
 * @see org.xtext.first.csvdsl.csvDsl.CsvDslPackage#getProduct()
 * @model
 * @generated
 */
public interface Product extends IntOperation
{
  /**
   * Returns the value of the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var</em>' containment reference.
   * @see #setVar(Int_variable)
   * @see org.xtext.first.csvdsl.csvDsl.CsvDslPackage#getProduct_Var()
   * @model containment="true"
   * @generated
   */
  Int_variable getVar();

  /**
   * Sets the value of the '{@link org.xtext.first.csvdsl.csvDsl.Product#getVar <em>Var</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var</em>' containment reference.
   * @see #getVar()
   * @generated
   */
  void setVar(Int_variable value);

  /**
   * Returns the value of the '<em><b>Selection</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Selection</em>' containment reference.
   * @see #setSelection(Csv_variable)
   * @see org.xtext.first.csvdsl.csvDsl.CsvDslPackage#getProduct_Selection()
   * @model containment="true"
   * @generated
   */
  Csv_variable getSelection();

  /**
   * Sets the value of the '{@link org.xtext.first.csvdsl.csvDsl.Product#getSelection <em>Selection</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Selection</em>' containment reference.
   * @see #getSelection()
   * @generated
   */
  void setSelection(Csv_variable value);

} // Product
