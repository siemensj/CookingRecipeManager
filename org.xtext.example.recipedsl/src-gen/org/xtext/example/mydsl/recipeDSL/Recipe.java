/**
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.recipeDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recipe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.recipeDSL.Recipe#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.recipeDSL.Recipe#getIngredient <em>Ingredient</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.recipeDSL.Recipe#getDevice <em>Device</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.recipeDSL.Recipe#getCooking <em>Cooking</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.recipeDSL.RecipeDSLPackage#getRecipe()
 * @model
 * @generated
 */
public interface Recipe extends EObject
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
   * @see org.xtext.example.mydsl.recipeDSL.RecipeDSLPackage#getRecipe_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.recipeDSL.Recipe#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Ingredient</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.recipeDSL.Ingredient}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ingredient</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ingredient</em>' containment reference list.
   * @see org.xtext.example.mydsl.recipeDSL.RecipeDSLPackage#getRecipe_Ingredient()
   * @model containment="true"
   * @generated
   */
  EList<Ingredient> getIngredient();

  /**
   * Returns the value of the '<em><b>Device</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.recipeDSL.Device}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Device</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Device</em>' containment reference list.
   * @see org.xtext.example.mydsl.recipeDSL.RecipeDSLPackage#getRecipe_Device()
   * @model containment="true"
   * @generated
   */
  EList<Device> getDevice();

  /**
   * Returns the value of the '<em><b>Cooking</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.recipeDSL.Cooking}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cooking</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cooking</em>' containment reference list.
   * @see org.xtext.example.mydsl.recipeDSL.RecipeDSLPackage#getRecipe_Cooking()
   * @model containment="true"
   * @generated
   */
  EList<Cooking> getCooking();

} // Recipe