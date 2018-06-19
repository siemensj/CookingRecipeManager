/**
 */
package RecipeLanguage.impl;

import RecipeLanguage.Cooking;
import RecipeLanguage.Device;
import RecipeLanguage.Ingredient;
import RecipeLanguage.RecipeLanguagePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
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
 *   <li>{@link RecipeLanguage.impl.CookingImpl#getOrder <em>Order</em>}</li>
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
	 * The cached value of the '{@link #getUses() <em>Uses</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUses()
	 * @generated
	 * @ordered
	 */
	protected Ingredient uses;

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
	 * The default value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected static final int ORDER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected int order = ORDER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCooks_with() <em>Cooks with</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCooks_with()
	 * @generated
	 * @ordered
	 */
	protected Device cooks_with;

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
	public Ingredient getUses() {
		if (uses != null && uses.eIsProxy()) {
			InternalEObject oldUses = (InternalEObject) uses;
			uses = (Ingredient) eResolveProxy(oldUses);
			if (uses != oldUses) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RecipeLanguagePackage.COOKING__USES,
							oldUses, uses));
			}
		}
		return uses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ingredient basicGetUses() {
		return uses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUses(Ingredient newUses) {
		Ingredient oldUses = uses;
		uses = newUses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecipeLanguagePackage.COOKING__USES, oldUses, uses));
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
	public int getOrder() {
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrder(int newOrder) {
		int oldOrder = order;
		order = newOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecipeLanguagePackage.COOKING__ORDER, oldOrder,
					order));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device getCooks_with() {
		if (cooks_with != null && cooks_with.eIsProxy()) {
			InternalEObject oldCooks_with = (InternalEObject) cooks_with;
			cooks_with = (Device) eResolveProxy(oldCooks_with);
			if (cooks_with != oldCooks_with) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RecipeLanguagePackage.COOKING__COOKS_WITH,
							oldCooks_with, cooks_with));
			}
		}
		return cooks_with;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device basicGetCooks_with() {
		return cooks_with;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCooks_with(Device newCooks_with) {
		Device oldCooks_with = cooks_with;
		cooks_with = newCooks_with;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecipeLanguagePackage.COOKING__COOKS_WITH,
					oldCooks_with, cooks_with));
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
			if (resolve)
				return getUses();
			return basicGetUses();
		case RecipeLanguagePackage.COOKING__DESCRIPTION:
			return getDescription();
		case RecipeLanguagePackage.COOKING__ORDER:
			return getOrder();
		case RecipeLanguagePackage.COOKING__COOKS_WITH:
			if (resolve)
				return getCooks_with();
			return basicGetCooks_with();
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
		case RecipeLanguagePackage.COOKING__TIME:
			setTime((Float) newValue);
			return;
		case RecipeLanguagePackage.COOKING__USES:
			setUses((Ingredient) newValue);
			return;
		case RecipeLanguagePackage.COOKING__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case RecipeLanguagePackage.COOKING__ORDER:
			setOrder((Integer) newValue);
			return;
		case RecipeLanguagePackage.COOKING__COOKS_WITH:
			setCooks_with((Device) newValue);
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
			setUses((Ingredient) null);
			return;
		case RecipeLanguagePackage.COOKING__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case RecipeLanguagePackage.COOKING__ORDER:
			setOrder(ORDER_EDEFAULT);
			return;
		case RecipeLanguagePackage.COOKING__COOKS_WITH:
			setCooks_with((Device) null);
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
			return uses != null;
		case RecipeLanguagePackage.COOKING__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case RecipeLanguagePackage.COOKING__ORDER:
			return order != ORDER_EDEFAULT;
		case RecipeLanguagePackage.COOKING__COOKS_WITH:
			return cooks_with != null;
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
		result.append(", Order: ");
		result.append(order);
		result.append(')');
		return result.toString();
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //CookingImpl
