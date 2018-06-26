/**
 */
package RecipeLanguage.impl;

import RecipeLanguage.Cooking;
import RecipeLanguage.Device;
import RecipeLanguage.Ingredient;
import RecipeLanguage.RecipeLanguagePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cooking</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link RecipeLanguage.impl.CookingImpl#getTime <em>Time</em>}</li>
 *   <li>{@link RecipeLanguage.impl.CookingImpl#getUses <em>Uses</em>}</li>
 *   <li>{@link RecipeLanguage.impl.CookingImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link RecipeLanguage.impl.CookingImpl#getCooks_with <em>Cooks with</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CookingImpl extends EObjectImpl implements Cooking {
	/**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final float TIME_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected float time = TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUses() <em>Uses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUses()
	 * @generated
	 * @ordered
	 */
	protected EList<Ingredient> uses;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCooks_with() <em>Cooks with</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCooks_with()
	 * @generated
	 * @ordered
	 */
	protected EList<Device> cooks_with;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CookingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RecipeLanguagePackage.Literals.COOKING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(float newTime) {
		float oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecipeLanguagePackage.COOKING__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Ingredient> getUses() {
		if (uses == null) {
			uses = new EObjectResolvingEList<Ingredient>(Ingredient.class, this, RecipeLanguagePackage.COOKING__USES);
		}
		return uses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecipeLanguagePackage.COOKING__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Device> getCooks_with() {
		if (cooks_with == null) {
			cooks_with = new EObjectResolvingEList<Device>(Device.class, this,
					RecipeLanguagePackage.COOKING__COOKS_WITH);
		}
		return cooks_with;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RecipeLanguagePackage.COOKING__TIME:
			return getTime();
		case RecipeLanguagePackage.COOKING__USES:
			return getUses();
		case RecipeLanguagePackage.COOKING__DESCRIPTION:
			return getDescription();
		case RecipeLanguagePackage.COOKING__COOKS_WITH:
			return getCooks_with();
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
		case RecipeLanguagePackage.COOKING__TIME:
			setTime((Float) newValue);
			return;
		case RecipeLanguagePackage.COOKING__USES:
			getUses().clear();
			getUses().addAll((Collection<? extends Ingredient>) newValue);
			return;
		case RecipeLanguagePackage.COOKING__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case RecipeLanguagePackage.COOKING__COOKS_WITH:
			getCooks_with().clear();
			getCooks_with().addAll((Collection<? extends Device>) newValue);
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
		case RecipeLanguagePackage.COOKING__TIME:
			setTime(TIME_EDEFAULT);
			return;
		case RecipeLanguagePackage.COOKING__USES:
			getUses().clear();
			return;
		case RecipeLanguagePackage.COOKING__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case RecipeLanguagePackage.COOKING__COOKS_WITH:
			getCooks_with().clear();
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
		case RecipeLanguagePackage.COOKING__TIME:
			return time != TIME_EDEFAULT;
		case RecipeLanguagePackage.COOKING__USES:
			return uses != null && !uses.isEmpty();
		case RecipeLanguagePackage.COOKING__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case RecipeLanguagePackage.COOKING__COOKS_WITH:
			return cooks_with != null && !cooks_with.isEmpty();
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
		result.append(" (Time: ");
		result.append(time);
		result.append(", Description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //CookingImpl
