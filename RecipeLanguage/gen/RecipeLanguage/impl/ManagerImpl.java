/**
 */
package RecipeLanguage.impl;

import RecipeLanguage.Manager;
import RecipeLanguage.Recipe;
import RecipeLanguage.RecipeLanguagePackage;
import RecipeLanguage.User;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link RecipeLanguage.impl.ManagerImpl#getManages <em>Manages</em>}</li>
 *   <li>{@link RecipeLanguage.impl.ManagerImpl#getVerwaltet <em>Verwaltet</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ManagerImpl extends EObjectImpl implements Manager {
	/**
	 * The cached value of the '{@link #getManages() <em>Manages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManages()
	 * @generated
	 * @ordered
	 */
	protected EList<Recipe> manages;

	/**
	 * The cached value of the '{@link #getVerwaltet() <em>Verwaltet</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerwaltet()
	 * @generated
	 * @ordered
	 */
	protected EList<User> verwaltet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RecipeLanguagePackage.Literals.MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Recipe> getManages() {
		if (manages == null) {
			manages = new EObjectContainmentEList<Recipe>(Recipe.class, this, RecipeLanguagePackage.MANAGER__MANAGES);
		}
		return manages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<User> getVerwaltet() {
		if (verwaltet == null) {
			verwaltet = new EObjectContainmentEList<User>(User.class, this, RecipeLanguagePackage.MANAGER__VERWALTET);
		}
		return verwaltet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RecipeLanguagePackage.MANAGER__MANAGES:
			return ((InternalEList<?>) getManages()).basicRemove(otherEnd, msgs);
		case RecipeLanguagePackage.MANAGER__VERWALTET:
			return ((InternalEList<?>) getVerwaltet()).basicRemove(otherEnd, msgs);
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
		case RecipeLanguagePackage.MANAGER__MANAGES:
			return getManages();
		case RecipeLanguagePackage.MANAGER__VERWALTET:
			return getVerwaltet();
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
		case RecipeLanguagePackage.MANAGER__MANAGES:
			getManages().clear();
			getManages().addAll((Collection<? extends Recipe>) newValue);
			return;
		case RecipeLanguagePackage.MANAGER__VERWALTET:
			getVerwaltet().clear();
			getVerwaltet().addAll((Collection<? extends User>) newValue);
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
		case RecipeLanguagePackage.MANAGER__MANAGES:
			getManages().clear();
			return;
		case RecipeLanguagePackage.MANAGER__VERWALTET:
			getVerwaltet().clear();
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
		case RecipeLanguagePackage.MANAGER__MANAGES:
			return manages != null && !manages.isEmpty();
		case RecipeLanguagePackage.MANAGER__VERWALTET:
			return verwaltet != null && !verwaltet.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ManagerImpl
