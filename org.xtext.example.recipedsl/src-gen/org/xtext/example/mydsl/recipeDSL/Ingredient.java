/**
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.recipeDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ingredient</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.recipeDSL.Ingredient#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.recipeDSL.Ingredient#getMeasure <em>Measure</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.recipeDSL.RecipeDSLPackage#getIngredient()
 * @model
 * @generated
 */
public interface Ingredient extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.mydsl.recipeDSL.RecipeDSLPackage#getIngredient_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.recipeDSL.Ingredient#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Measure</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Measure</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Measure</em>' containment reference.
   * @see #setMeasure(Measure)
   * @see org.xtext.example.mydsl.recipeDSL.RecipeDSLPackage#getIngredient_Measure()
   * @model containment="true"
   * @generated
   */
  Measure getMeasure();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.recipeDSL.Ingredient#getMeasure <em>Measure</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Measure</em>' containment reference.
   * @see #getMeasure()
   * @generated
   */
  void setMeasure(Measure value);

} // Ingredient