package RecipeRules;

//import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Collection;

import org.eclipse.emf.common.util.URI;
import org.junit.Test;

import RecipeRules.api.matches.OneCookingMatch;
import RecipeRules.api.matches.OneRecipeMatch;

public class Test1 extends Testing {

	@Override
	protected void loadModels() {
		//loadModel(URI.createPlatformResourceURI(INSTANCES + "/Manager_multi_recipes.xmi",true));
		loadModel(URI.createPlatformResourceURI(INSTANCES + "/Testing.xmi",true));
	}
		
	// richtige Pattern (fuer unseren Fall)

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
		assertTrue("There must be at least one Ingredient for a Cooking",CookingWithIng());
	}
	
	public boolean RecipeWithIng() {
		Collection<OneRecipeMatch> m = api.oneRecipe().findMatches();
		for (OneRecipeMatch x : m) {
			if (x.getR().getIngredients().isEmpty()) {
				return false;
			}
		}
		return true;
	}
	
	@Test
	public void atLeastOneIngForRecipe() {
		assertTrue("There must be at least one Ingredient for a Recipe",RecipeWithIng());
	}
	
	public boolean RecipeWithDev() {
		Collection<OneRecipeMatch> m = api.oneRecipe().findMatches();
		for (OneRecipeMatch x : m) {
			if (x.getR().getDevices().isEmpty()) {
				return false;
			}
		}
		return true;
	}
	
	@Test
	public void atLeastOneDevForRecipe() {
		assertTrue("There must be at least one Device for a Recipe",RecipeWithDev());
	}
	
	public boolean RecipeWithCooking() {
		Collection<OneRecipeMatch> m = api.oneRecipe().findMatches();
		for (OneRecipeMatch x : m) {
			if (x.getR().getCookings().isEmpty()) {
				return false;
			}
		}
		return true;
	}
	
	@Test
	public void atLeastOneCookingForRecipe() {
		assertTrue("There must be at least one Cooking for a Device",RecipeWithCooking());
	}
	
	@Test
	public void noDeviceFromOtherRecipe(){
		assertFalse("A Device From another Recipe should not be used",api.noDevFromOtherRecipe().hasMatches());
	}
	
	@Test
	public void noIngredientFromOtherRecipe(){
		assertFalse("An Ingredient From another Recipe should not be used",api.noIngFromOtherRecipe().hasMatches());
	}
	
	// Test von Patterns
	
	
	
}
