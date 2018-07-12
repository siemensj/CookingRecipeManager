/**
 */
package RecipeLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link RecipeLanguage.Manager#getRecipes <em>Recipes</em>}</li>
 *   <li>{@link RecipeLanguage.Manager#getUsers <em>Users</em>}</li>
 * </ul>
 * </p>
 *
 * @see RecipeLanguage.RecipeLanguagePackage#getManager()
 * @model
 * @generated
 */
public interface Manager extends EObject {
	/**
	 * Returns the value of the '<em><b>Recipes</b></em>' containment reference list.
	 * The list contents are of type {@link RecipeLanguage.Recipe}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recipes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recipes</em>' containment reference list.
	 * @see RecipeLanguage.RecipeLanguagePackage#getManager_Recipes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Recipe> getRecipes();

	/**
	 * Returns the value of the '<em><b>Users</b></em>' containment reference list.
	 * The list contents are of type {@link RecipeLanguage.User}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Users</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Users</em>' containment reference list.
	 * @see RecipeLanguage.RecipeLanguagePackage#getManager_Users()
	 * @model containment="true"
	 * @generated
	 */
	EList<User> getUsers();
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Manager
