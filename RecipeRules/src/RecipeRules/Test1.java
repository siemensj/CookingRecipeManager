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
		
	// richtige Pattern (f�r unseren Fall)

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
	public void noDeviceFromOtherRecipe(){
		assertFalse("A Device From another Recipe should not be used",api.noDevFromOtherRecipe().hasMatches());
	}
	
	@Test
	public void noIngredientFromOtherRecipe(){
		assertFalse("An Ingredient From another Recipe should not be used",api.noIngFromOtherRecipe().hasMatches());
	}
}
