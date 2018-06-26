/**
 */
package RecipeLanguage;

// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link RecipeLanguage.Step#getOrder <em>Order</em>}</li>
 * </ul>
 * </p>
 *
 * @see RecipeLanguage.RecipeLanguagePackage#getStep()
 * @model
 * @generated
 */
public interface Step extends Cooking {
	/**
	 * Returns the value of the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' attribute.
	 * @see #setOrder(int)
	 * @see RecipeLanguage.RecipeLanguagePackage#getStep_Order()
	 * @model required="true"
	 * @generated
	 */
	int getOrder();

	/**
	 * Sets the value of the '{@link RecipeLanguage.Step#getOrder <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' attribute.
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(int value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Step
