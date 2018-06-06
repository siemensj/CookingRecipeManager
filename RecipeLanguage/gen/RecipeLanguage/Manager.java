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
 *   <li>{@link RecipeLanguage.Manager#getManages <em>Manages</em>}</li>
 *   <li>{@link RecipeLanguage.Manager#getVerwaltet <em>Verwaltet</em>}</li>
 * </ul>
 * </p>
 *
 * @see RecipeLanguage.RecipeLanguagePackage#getManager()
 * @model
 * @generated
 */
public interface Manager extends EObject {
	/**
	 * Returns the value of the '<em><b>Manages</b></em>' containment reference list.
	 * The list contents are of type {@link RecipeLanguage.Recipe}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manages</em>' containment reference list.
	 * @see RecipeLanguage.RecipeLanguagePackage#getManager_Manages()
	 * @model containment="true"
	 * @generated
	 */
	EList<Recipe> getManages();

	/**
	 * Returns the value of the '<em><b>Verwaltet</b></em>' containment reference list.
	 * The list contents are of type {@link RecipeLanguage.User}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Verwaltet</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verwaltet</em>' containment reference list.
	 * @see RecipeLanguage.RecipeLanguagePackage#getManager_Verwaltet()
	 * @model containment="true"
	 * @generated
	 */
	EList<User> getVerwaltet();
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Manager
