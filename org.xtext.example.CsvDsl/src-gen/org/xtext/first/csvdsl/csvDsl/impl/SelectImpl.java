/**
 * generated by Xtext 2.28.0
 */
package org.xtext.first.csvdsl.csvDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.first.csvdsl.csvDsl.CsvDslPackage;
import org.xtext.first.csvdsl.csvDsl.Csv_variable;
import org.xtext.first.csvdsl.csvDsl.Range;
import org.xtext.first.csvdsl.csvDsl.Select;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Select</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.first.csvdsl.csvDsl.impl.SelectImpl#getNewCsv <em>New Csv</em>}</li>
 *   <li>{@link org.xtext.first.csvdsl.csvDsl.impl.SelectImpl#getCsv_var <em>Csv var</em>}</li>
 *   <li>{@link org.xtext.first.csvdsl.csvDsl.impl.SelectImpl#getRange <em>Range</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SelectImpl extends CsvOperationImpl implements Select
{
  /**
   * The cached value of the '{@link #getNewCsv() <em>New Csv</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNewCsv()
   * @generated
   * @ordered
   */
  protected Csv_variable newCsv;

  /**
   * The cached value of the '{@link #getCsv_var() <em>Csv var</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCsv_var()
   * @generated
   * @ordered
   */
  protected Csv_variable csv_var;

  /**
   * The cached value of the '{@link #getRange() <em>Range</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRange()
   * @generated
   * @ordered
   */
  protected Range range;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SelectImpl()
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
    return CsvDslPackage.Literals.SELECT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Csv_variable getNewCsv()
  {
    return newCsv;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNewCsv(Csv_variable newNewCsv, NotificationChain msgs)
  {
    Csv_variable oldNewCsv = newCsv;
    newCsv = newNewCsv;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CsvDslPackage.SELECT__NEW_CSV, oldNewCsv, newNewCsv);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNewCsv(Csv_variable newNewCsv)
  {
    if (newNewCsv != newCsv)
    {
      NotificationChain msgs = null;
      if (newCsv != null)
        msgs = ((InternalEObject)newCsv).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CsvDslPackage.SELECT__NEW_CSV, null, msgs);
      if (newNewCsv != null)
        msgs = ((InternalEObject)newNewCsv).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CsvDslPackage.SELECT__NEW_CSV, null, msgs);
      msgs = basicSetNewCsv(newNewCsv, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CsvDslPackage.SELECT__NEW_CSV, newNewCsv, newNewCsv));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Csv_variable getCsv_var()
  {
    return csv_var;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCsv_var(Csv_variable newCsv_var, NotificationChain msgs)
  {
    Csv_variable oldCsv_var = csv_var;
    csv_var = newCsv_var;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CsvDslPackage.SELECT__CSV_VAR, oldCsv_var, newCsv_var);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCsv_var(Csv_variable newCsv_var)
  {
    if (newCsv_var != csv_var)
    {
      NotificationChain msgs = null;
      if (csv_var != null)
        msgs = ((InternalEObject)csv_var).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CsvDslPackage.SELECT__CSV_VAR, null, msgs);
      if (newCsv_var != null)
        msgs = ((InternalEObject)newCsv_var).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CsvDslPackage.SELECT__CSV_VAR, null, msgs);
      msgs = basicSetCsv_var(newCsv_var, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CsvDslPackage.SELECT__CSV_VAR, newCsv_var, newCsv_var));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Range getRange()
  {
    return range;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRange(Range newRange, NotificationChain msgs)
  {
    Range oldRange = range;
    range = newRange;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CsvDslPackage.SELECT__RANGE, oldRange, newRange);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRange(Range newRange)
  {
    if (newRange != range)
    {
      NotificationChain msgs = null;
      if (range != null)
        msgs = ((InternalEObject)range).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CsvDslPackage.SELECT__RANGE, null, msgs);
      if (newRange != null)
        msgs = ((InternalEObject)newRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CsvDslPackage.SELECT__RANGE, null, msgs);
      msgs = basicSetRange(newRange, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CsvDslPackage.SELECT__RANGE, newRange, newRange));
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
      case CsvDslPackage.SELECT__NEW_CSV:
        return basicSetNewCsv(null, msgs);
      case CsvDslPackage.SELECT__CSV_VAR:
        return basicSetCsv_var(null, msgs);
      case CsvDslPackage.SELECT__RANGE:
        return basicSetRange(null, msgs);
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
      case CsvDslPackage.SELECT__NEW_CSV:
        return getNewCsv();
      case CsvDslPackage.SELECT__CSV_VAR:
        return getCsv_var();
      case CsvDslPackage.SELECT__RANGE:
        return getRange();
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
      case CsvDslPackage.SELECT__NEW_CSV:
        setNewCsv((Csv_variable)newValue);
        return;
      case CsvDslPackage.SELECT__CSV_VAR:
        setCsv_var((Csv_variable)newValue);
        return;
      case CsvDslPackage.SELECT__RANGE:
        setRange((Range)newValue);
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
      case CsvDslPackage.SELECT__NEW_CSV:
        setNewCsv((Csv_variable)null);
        return;
      case CsvDslPackage.SELECT__CSV_VAR:
        setCsv_var((Csv_variable)null);
        return;
      case CsvDslPackage.SELECT__RANGE:
        setRange((Range)null);
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
      case CsvDslPackage.SELECT__NEW_CSV:
        return newCsv != null;
      case CsvDslPackage.SELECT__CSV_VAR:
        return csv_var != null;
      case CsvDslPackage.SELECT__RANGE:
        return range != null;
    }
    return super.eIsSet(featureID);
  }

} //SelectImpl
