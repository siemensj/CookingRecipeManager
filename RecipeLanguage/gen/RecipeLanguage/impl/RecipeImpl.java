/**
 */
package RecipeLanguage.impl;

import RecipeLanguage.Comment;
import RecipeLanguage.Cooking;
import RecipeLanguage.Device;
import RecipeLanguage.Ingredient;
import RecipeLanguage.Recipe;
import RecipeLanguage.RecipeLanguagePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Recipe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link RecipeLanguage.impl.RecipeImpl#getDevices <em>Devices</em>}</li>
 *   <li>{@link RecipeLanguage.impl.RecipeImpl#getIngredients <em>Ingredients</em>}</li>
 *   <li>{@link RecipeLanguage.impl.RecipeImpl#getCookings <em>Cookings</em>}</li>
 *   <li>{@link RecipeLanguage.impl.RecipeImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link RecipeLanguage.impl.RecipeImpl#getName <em>Name</em>}</li>
 *   <li>{@link RecipeLanguage.impl.RecipeImpl#getLevel <em>Level</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RecipeImpl extends EObjectImpl implements Recipe {
	/**
	 * The cached value of the '{@link #getDevices() <em>Devices</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevices()
	 * @generated
	 * @ordered
	 */
	protected EList<Device> devices;

	/**
	 * The cached value of the '{@link #getIngredients() <em>Ingredients</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIngredients()
	 * @generated
	 * @ordered
	 */
	protected EList<Ingredient> ingredients;

	/**
	 * The cached value of the '{@link #getCookings() <em>Cookings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCookings()
	 * @generated
	 * @ordered
	 */
	protected EList<Cooking> cookings;

	/**
	 * The cached value of the '{@link #getComments() <em>Comments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected EList<Comment> comments;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> level;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecipeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RecipeLanguagePackage.Literals.RECIPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Device> getDevices() {
		if (devices == null) {
			devices = new EObjectContainmentEList<Device>(Device.class, this, RecipeLanguagePackage.RECIPE__DEVICES);
		}
		return devices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Ingredient> getIngredients() {
		if (ingredients == null) {
			ingredients = new EObjectContainmentEList<Ingredient>(Ingredient.class, this,
					RecipeLanguagePackage.RECIPE__INGREDIENTS);
		}
		return ingredients;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Cooking> getCookings() {
		if (cookings == null) {
			cookings = new EObjectContainmentEList<Cooking>(Cooking.class, this,
					RecipeLanguagePackage.RECIPE__COOKINGS);
		}
		return cookings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Comment> getComments() {
		if (comments == null) {
			comments = new EObjectContainmentEList<Comment>(Comment.class, this,
					RecipeLanguagePackage.RECIPE__COMMENTS);
		}
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecipeLanguagePackage.RECIPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getLevel() {
		if (level == null) {
			level = new EDataTypeUniqueEList<Integer>(Integer.class, this, RecipeLanguagePackage.RECIPE__LEVEL);
		}
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RecipeLanguagePackage.RECIPE__DEVICES:
			return ((InternalEList<?>) getDevices()).basicRemove(otherEnd, msgs);
		case RecipeLanguagePackage.RECIPE__INGREDIENTS:
			return ((InternalEList<?>) getIngredients()).basicRemove(otherEnd, msgs);
		case RecipeLanguagePackage.RECIPE__COOKINGS:
			return ((InternalEList<?>) getCookings()).basicRemove(otherEnd, msgs);
		case RecipeLanguagePackage.RECIPE__COMMENTS:
			return ((InternalEList<?>) getComments()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RecipeLanguagePackage.RECIPE__DEVICES:
			return getDevices();
		case RecipeLanguagePackage.RECIPE__INGREDIENTS:
			return getIngredients();
		case RecipeLanguagePackage.RECIPE__COOKINGS:
			return getCookings();
		case RecipeLanguagePackage.RECIPE__COMMENTS:
			return getComments();
		case RecipeLanguagePackage.RECIPE__NAME:
			return getName();
		case RecipeLanguagePackage.RECIPE__LEVEL:
			return getLevel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case RecipeLanguagePackage.RECIPE__DEVICES:
			getDevices().clear();
			getDevices().addAll((Collection<? extends Device>) newValue);
			return;
		case RecipeLanguagePackage.RECIPE__INGREDIENTS:
			getIngredients().clear();
			getIngredients().addAll((Collection<? extends Ingredient>) newValue);
			return;
		case RecipeLanguagePackage.RECIPE__COOKINGS:
			getCookings().clear();
			getCookings().addAll((Collection<? extends Cooking>) newValue);
			return;
		case RecipeLanguagePackage.RECIPE__COMMENTS:
			getComments().clear();
			getComments().addAll((Collection<? extends Comment>) newValue);
			return;
		case RecipeLanguagePackage.RECIPE__NAME:
			setName((String) newValue);
			return;
		case RecipeLanguagePackage.RECIPE__LEVEL:
			getLevel().clear();
			getLevel().addAll((Collection<? extends Integer>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case RecipeLanguagePackage.RECIPE__DEVICES:
			getDevices().clear();
			return;
		case RecipeLanguagePackage.RECIPE__INGREDIENTS:
			getIngredients().clear();
			return;
		case RecipeLanguagePackage.RECIPE__COOKINGS:
			getCookings().clear();
			return;
		case RecipeLanguagePackage.RECIPE__COMMENTS:
			getComments().clear();
			return;
		case RecipeLanguagePackage.RECIPE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case RecipeLanguagePackage.RECIPE__LEVEL:
			getLevel().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case RecipeLanguagePackage.RECIPE__DEVICES:
			return devices != null && !devices.isEmpty();
		case RecipeLanguagePackage.RECIPE__INGREDIENTS:
			return ingredients != null && !ingredients.isEmpty();
		case RecipeLanguagePackage.RECIPE__COOKINGS:
			return cookings != null && !cookings.isEmpty();
		case RecipeLanguagePackage.RECIPE__COMMENTS:
			return comments != null && !comments.isEmpty();
		case RecipeLanguagePackage.RECIPE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case RecipeLanguagePackage.RECIPE__LEVEL:
			return level != null && !level.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Name: ");
		result.append(name);
		result.append(", Level: ");
		result.append(level);
		result.append(')');
		return result.toString();
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //RecipeImpl
