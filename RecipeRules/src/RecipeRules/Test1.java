package RecipeRules;

//import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Collection;

import org.eclipse.emf.common.util.URI;
import org.junit.Test;

import RecipeRules.api.matches.OneCookingMatch;

public class Test1 extends Testing {

	@Override
	protected void loadModels() {
		//loadModel(URI.createPlatformResourceURI(INSTANCES + "/Manager_multi_recipes.xmi",true));
		loadModel(URI.createPlatformResourceURI(INSTANCES + "/Testing.xmi",true));
	}
		
	// richtige Pattern (für unseren Fall)

	@Test
	public void noDoubleIng() {
		assertFalse("There should not be duplicate Ingredients",api.doubleIngredient().hasMatches());	
	}
	
	public boolean CookingWithDev() {
		Collection<OneCookingMatch> m = api.oneCooking().findMatches();
		for (OneCookingMatch x : m) {
			if (x.getC().getUse_device().isEmpty()){
				return false;
			}
		}
		return true;
	}
	
	@Test
	public void atLeastOneDevForCooking() {
		assertTrue("There must be at least one Device for a Cooking",CookingWithDev());
	}	
		
	public boolean CookingWithIng() {
		Collection<OneCookingMatch> m = api.oneCooking().findMatches();
		for (OneCookingMatch x : m) {
			if (x.getC().getUses().isEmpty()) {
				return false;
			}
		}
		return true;
	}
	
	@Test
	public void atLeastOneIngForCooking() {
		assertTrue("There must be at least one Device for a Cooking",CookingWithIng());
	}
	
	// Test von Patterns
	
	@Test
	public void recipeWithCooDevIng() {
		assertTrue("A recipe should have a Cooking,Device and Ingredient(Everything should also have a name)",api.correctRecipe().hasMatches());	
	}
	
	@Test
	public void atLeastOneIngredient() {
		assertTrue("There should be at least one Ingredient",api.oneIngredient().hasMatches());	
	}

	
	@Test
	public void atLeastOneDevice() {
		assertTrue("There should be at least one Device and it should have a Name",api.oneDevice().hasMatches());	
	}
	
	@Test
	public void noRecipeWithoutName() {
		assertFalse("There should be a Name for the Recipe",api.recipeWithoutName().hasMatches());	
	}
	
	@Test
	public void noCookingWithoutName() {
		assertFalse("There should be a Name for the Recipe",api.cookingWithoutName().hasMatches());	
	}
	
	@Test
	public void noDeviceWithoutName() {
		assertFalse("There should be a Name for the Recipe",api.deviceWithoutName().hasMatches());	
	}
	
	@Test
	public void noIngrdientWithoutName() {
		assertFalse("There should be a Name for the Recipe",api.ingredientWithoutName().hasMatches());	
	}
	

	
//	@Test
//	public void testRule() {
//		api.delRecipe().forEachMatch(m -> api.delRecipe().apply(m));
//		//assertTrue(!api.recWithoutName().hasMatches());
//	}
	
	
	
}
