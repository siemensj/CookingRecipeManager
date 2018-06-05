/**
 */
package RecipeLanguage.impl;

import RecipeLanguage.Ingredient;
import RecipeLanguage.RecipeLanguagePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ingredient</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link RecipeLanguage.impl.IngredientImpl#getName <em>Name</em>}</li>
 *   <li>{@link RecipeLanguage.impl.IngredientImpl#getWeightInGramms <em>Weight In Gramms</em>}</li>
 *   <li>{@link RecipeLanguage.impl.IngredientImpl#getCount <em>Count</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IngredientImpl extends EObjectImpl implements Ingredient {
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
	 * The default value of the '{@link #getWeightInGramms() <em>Weight In Gramms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeightInGramms()
	 * @generated
	 * @ordered
	 */
	protected static final float WEIGHT_IN_GRAMMS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getWeightInGramms() <em>Weight In Gramms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeightInGramms()
	 * @generated
	 * @ordered
	 */
	protected float weightInGramms = WEIGHT_IN_GRAMMS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected static final float COUNT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected float count = COUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IngredientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RecipeLanguagePackage.Literals.INGREDIENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RecipeLanguagePackage.INGREDIENT__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getWeightInGramms() {
		return weightInGramms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeightInGramms(float newWeightInGramms) {
		float oldWeightInGramms = weightInGramms;
		weightInGramms = newWeightInGramms;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecipeLanguagePackage.INGREDIENT__WEIGHT_IN_GRAMMS,
					oldWeightInGramms, weightInGramms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCount() {
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCount(float newCount) {
		float oldCount = count;
		count = newCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecipeLanguagePackage.INGREDIENT__COUNT, oldCount,
					count));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RecipeLanguagePackage.INGREDIENT__NAME:
			return getName();
		case RecipeLanguagePackage.INGREDIENT__WEIGHT_IN_GRAMMS:
			return getWeightInGramms();
		case RecipeLanguagePackage.INGREDIENT__COUNT:
			return getCount();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case RecipeLanguagePackage.INGREDIENT__NAME:
			setName((String) newValue);
			return;
		case RecipeLanguagePackage.INGREDIENT__WEIGHT_IN_GRAMMS:
			setWeightInGramms((Float) newValue);
			return;
		case RecipeLanguagePackage.INGREDIENT__COUNT:
			setCount((Float) newValue);
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
		case RecipeLanguagePackage.INGREDIENT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case RecipeLanguagePackage.INGREDIENT__WEIGHT_IN_GRAMMS:
			setWeightInGramms(WEIGHT_IN_GRAMMS_EDEFAULT);
			return;
		case RecipeLanguagePackage.INGREDIENT__COUNT:
			setCount(COUNT_EDEFAULT);
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
		case RecipeLanguagePackage.INGREDIENT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case RecipeLanguagePackage.INGREDIENT__WEIGHT_IN_GRAMMS:
			return weightInGramms != WEIGHT_IN_GRAMMS_EDEFAULT;
		case RecipeLanguagePackage.INGREDIENT__COUNT:
			return count != COUNT_EDEFAULT;
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
		result.append(", WeightInGramms: ");
		result.append(weightInGramms);
		result.append(", Count: ");
		result.append(count);
		result.append(')');
		return result.toString();
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //IngredientImpl
