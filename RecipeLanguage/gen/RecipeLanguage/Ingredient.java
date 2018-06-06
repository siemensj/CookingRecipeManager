/**
 */
package RecipeLanguage;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ingredient</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link RecipeLanguage.Ingredient#getName <em>Name</em>}</li>
 *   <li>{@link RecipeLanguage.Ingredient#getWeightInGramms <em>Weight In Gramms</em>}</li>
 *   <li>{@link RecipeLanguage.Ingredient#getCount <em>Count</em>}</li>
 * </ul>
 * </p>
 *
 * @see RecipeLanguage.RecipeLanguagePackage#getIngredient()
 * @model
 * @generated
 */
public interface Ingredient extends EObject {
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
	 * @see RecipeLanguage.RecipeLanguagePackage#getIngredient_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link RecipeLanguage.Ingredient#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Weight In Gramms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weight In Gramms</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight In Gramms</em>' attribute.
	 * @see #setWeightInGramms(float)
	 * @see RecipeLanguage.RecipeLanguagePackage#getIngredient_WeightInGramms()
	 * @model
	 * @generated
	 */
	float getWeightInGramms();

	/**
	 * Sets the value of the '{@link RecipeLanguage.Ingredient#getWeightInGramms <em>Weight In Gramms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight In Gramms</em>' attribute.
	 * @see #getWeightInGramms()
	 * @generated
	 */
	void setWeightInGramms(float value);

	/**
	 * Returns the value of the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count</em>' attribute.
	 * @see #setCount(float)
	 * @see RecipeLanguage.RecipeLanguagePackage#getIngredient_Count()
	 * @model
	 * @generated
	 */
	float getCount();

	/**
	 * Sets the value of the '{@link RecipeLanguage.Ingredient#getCount <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' attribute.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(float value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Ingredient
