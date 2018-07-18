/**
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.recipeDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Weight</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.recipeDSL.Weight#getWeight <em>Weight</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.recipeDSL.RecipeDSLPackage#getWeight()
 * @model
 * @generated
 */
public interface Weight extends EObject
{
  /**
   * Returns the value of the '<em><b>Weight</b></em>' attribute list.
   * The list contents are of type {@link java.lang.Float}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Weight</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Weight</em>' attribute list.
   * @see org.xtext.example.mydsl.recipeDSL.RecipeDSLPackage#getWeight_Weight()
   * @model unique="false"
   * @generated
   */
  EList<Float> getWeight();

} // Weight
