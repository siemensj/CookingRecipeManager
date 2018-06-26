/**
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.recipeDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Weight</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.recipeDSL.Weight#getGramms <em>Gramms</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.recipeDSL.RecipeDSLPackage#getWeight()
 * @model
 * @generated
 */
public interface Weight extends Measure
{
  /**
   * Returns the value of the '<em><b>Gramms</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Gramms</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Gramms</em>' attribute.
   * @see #setGramms(String)
   * @see org.xtext.example.mydsl.recipeDSL.RecipeDSLPackage#getWeight_Gramms()
   * @model
   * @generated
   */
  String getGramms();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.recipeDSL.Weight#getGramms <em>Gramms</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Gramms</em>' attribute.
   * @see #getGramms()
   * @generated
   */
  void setGramms(String value);

} // Weight
