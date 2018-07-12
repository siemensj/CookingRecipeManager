/**
 */
package RecipeLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cooking</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link RecipeLanguage.Cooking#getTime <em>Time</em>}</li>
 *   <li>{@link RecipeLanguage.Cooking#getUses <em>Uses</em>}</li>
 *   <li>{@link RecipeLanguage.Cooking#getDescription <em>Description</em>}</li>
 *   <li>{@link RecipeLanguage.Cooking#getUse_device <em>Use device</em>}</li>
 *   <li>{@link RecipeLanguage.Cooking#getStep <em>Step</em>}</li>
 * </ul>
 * </p>
 *
 * @see RecipeLanguage.RecipeLanguagePackage#getCooking()
 * @model
 * @generated
 */
public interface Cooking extends EObject {
	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(float)
	 * @see RecipeLanguage.RecipeLanguagePackage#getCooking_Time()
	 * @model
	 * @generated
	 */
	float getTime();

	/**
	 * Sets the value of the '{@link RecipeLanguage.Cooking#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(float value);

	/**
	 * Returns the value of the '<em><b>Uses</b></em>' reference list.
	 * The list contents are of type {@link RecipeLanguage.Ingredient}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uses</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses</em>' reference list.
	 * @see RecipeLanguage.RecipeLanguagePackage#getCooking_Uses()
	 * @model required="true"
	 * @generated
	 */
	EList<Ingredient> getUses();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see RecipeLanguage.RecipeLanguagePackage#getCooking_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link RecipeLanguage.Cooking#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Use device</b></em>' reference list.
	 * The list contents are of type {@link RecipeLanguage.Device}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use device</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use device</em>' reference list.
	 * @see RecipeLanguage.RecipeLanguagePackage#getCooking_Use_device()
	 * @model required="true"
	 * @generated
	 */
	EList<Device> getUse_device();

	/**
	 * Returns the value of the '<em><b>Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step</em>' attribute.
	 * @see #setStep(int)
	 * @see RecipeLanguage.RecipeLanguagePackage#getCooking_Step()
	 * @model
	 * @generated
	 */
	int getStep();

	/**
	 * Sets the value of the '{@link RecipeLanguage.Cooking#getStep <em>Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step</em>' attribute.
	 * @see #getStep()
	 * @generated
	 */
	void setStep(int value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Cooking
