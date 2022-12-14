/**
 * generated by Xtext 2.28.0
 */
package org.xtext.first.csvdsl.csvDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.first.csvdsl.csvDsl.CsvDslPackage;
import org.xtext.first.csvdsl.csvDsl.RowRange;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Row Range</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.first.csvdsl.csvDsl.impl.RowRangeImpl#getRow <em>Row</em>}</li>
 *   <li>{@link org.xtext.first.csvdsl.csvDsl.impl.RowRangeImpl#getRowStart <em>Row Start</em>}</li>
 *   <li>{@link org.xtext.first.csvdsl.csvDsl.impl.RowRangeImpl#getRowEnd <em>Row End</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RowRangeImpl extends RangeImpl implements RowRange
{
  /**
   * The default value of the '{@link #getRow() <em>Row</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRow()
   * @generated
   * @ordered
   */
  protected static final int ROW_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getRow() <em>Row</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRow()
   * @generated
   * @ordered
   */
  protected int row = ROW_EDEFAULT;

  /**
   * The default value of the '{@link #getRowStart() <em>Row Start</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRowStart()
   * @generated
   * @ordered
   */
  protected static final int ROW_START_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getRowStart() <em>Row Start</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRowStart()
   * @generated
   * @ordered
   */
  protected int rowStart = ROW_START_EDEFAULT;

  /**
   * The default value of the '{@link #getRowEnd() <em>Row End</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRowEnd()
   * @generated
   * @ordered
   */
  protected static final int ROW_END_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getRowEnd() <em>Row End</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRowEnd()
   * @generated
   * @ordered
   */
  protected int rowEnd = ROW_END_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RowRangeImpl()
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
    return CsvDslPackage.Literals.ROW_RANGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getRow()
  {
    return row;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRow(int newRow)
  {
    int oldRow = row;
    row = newRow;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CsvDslPackage.ROW_RANGE__ROW, oldRow, row));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getRowStart()
  {
    return rowStart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRowStart(int newRowStart)
  {
    int oldRowStart = rowStart;
    rowStart = newRowStart;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CsvDslPackage.ROW_RANGE__ROW_START, oldRowStart, rowStart));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getRowEnd()
  {
    return rowEnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRowEnd(int newRowEnd)
  {
    int oldRowEnd = rowEnd;
    rowEnd = newRowEnd;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CsvDslPackage.ROW_RANGE__ROW_END, oldRowEnd, rowEnd));
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
      case CsvDslPackage.ROW_RANGE__ROW:
        return getRow();
      case CsvDslPackage.ROW_RANGE__ROW_START:
        return getRowStart();
      case CsvDslPackage.ROW_RANGE__ROW_END:
        return getRowEnd();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CsvDslPackage.ROW_RANGE__ROW:
        setRow((Integer)newValue);
        return;
      case CsvDslPackage.ROW_RANGE__ROW_START:
        setRowStart((Integer)newValue);
        return;
      case CsvDslPackage.ROW_RANGE__ROW_END:
        setRowEnd((Integer)newValue);
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
      case CsvDslPackage.ROW_RANGE__ROW:
        setRow(ROW_EDEFAULT);
        return;
      case CsvDslPackage.ROW_RANGE__ROW_START:
        setRowStart(ROW_START_EDEFAULT);
        return;
      case CsvDslPackage.ROW_RANGE__ROW_END:
        setRowEnd(ROW_END_EDEFAULT);
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
      case CsvDslPackage.ROW_RANGE__ROW:
        return row != ROW_EDEFAULT;
      case CsvDslPackage.ROW_RANGE__ROW_START:
        return rowStart != ROW_START_EDEFAULT;
      case CsvDslPackage.ROW_RANGE__ROW_END:
        return rowEnd != ROW_END_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (row: ");
    result.append(row);
    result.append(", rowStart: ");
    result.append(rowStart);
    result.append(", rowEnd: ");
    result.append(rowEnd);
    result.append(')');
    return result.toString();
  }

} //RowRangeImpl
