/**
 */
package RecipeLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recipe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link RecipeLanguage.Recipe#getDevices <em>Devices</em>}</li>
 *   <li>{@link RecipeLanguage.Recipe#getIngredients <em>Ingredients</em>}</li>
 *   <li>{@link RecipeLanguage.Recipe#getCookings <em>Cookings</em>}</li>
 *   <li>{@link RecipeLanguage.Recipe#getHas <em>Has</em>}</li>
 *   <li>{@link RecipeLanguage.Recipe#getName <em>Name</em>}</li>
 *   <li>{@link RecipeLanguage.Recipe#getLevel <em>Level</em>}</li>
 * </ul>
 * </p>
 *
 * @see RecipeLanguage.RecipeLanguagePackage#getRecipe()
 * @model
 * @generated
 */
public interface Recipe extends EObject {
	/**
	 * Returns the value of the '<em><b>Devices</b></em>' containment reference list.
	 * The list contents are of type {@link RecipeLanguage.Device}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Devices</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Devices</em>' containment reference list.
	 * @see RecipeLanguage.RecipeLanguagePackage#getRecipe_Devices()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Device> getDevices();

	/**
	 * Returns the value of the '<em><b>Ingredients</b></em>' containment reference list.
	 * The list contents are of type {@link RecipeLanguage.Ingredient}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ingredients</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ingredients</em>' containment reference list.
	 * @see RecipeLanguage.RecipeLanguagePackage#getRecipe_Ingredients()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Ingredient> getIngredients();

	/**
	 * Returns the value of the '<em><b>Cookings</b></em>' containment reference list.
	 * The list contents are of type {@link RecipeLanguage.Cooking}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cookings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cookings</em>' containment reference list.
	 * @see RecipeLanguage.RecipeLanguagePackage#getRecipe_Cookings()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Cooking> getCookings();

	/**
	 * Returns the value of the '<em><b>Has</b></em>' containment reference list.
	 * The list contents are of type {@link RecipeLanguage.Comment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has</em>' containment reference list.
	 * @see RecipeLanguage.RecipeLanguagePackage#getRecipe_Has()
	 * @model containment="true"
	 * @generated
	 */
	EList<Comment> getHas();

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
	 * @see RecipeLanguage.RecipeLanguagePackage#getRecipe_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link RecipeLanguage.Recipe#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute list.
	 * @see RecipeLanguage.RecipeLanguagePackage#getRecipe_Level()
	 * @model required="true" upper="5"
	 * @generated
	 */
	EList<Integer> getLevel();
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Recipe
