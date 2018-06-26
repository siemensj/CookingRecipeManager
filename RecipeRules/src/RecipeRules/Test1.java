package RecipeRules;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.eclipse.emf.common.util.URI;
import org.junit.Test;

public class Test1 extends Testing {

	@Override
	protected void loadModels() {
		//loadModel(URI.createPlatformResourceURI(INSTANCES + "/Manager_multi_recipes.xmi",true));
		loadModel(URI.createPlatformResourceURI(INSTANCES + "/Testing.xmi",true));
	}

	@Test
	public void recipeWithCooDevIng() {
		assertTrue("A recipe should have a Cooking,Device and Ingredient(Everything should also have a name)",api.correctRecipe().hasMatches());	
	}
	@Test
	public void atLeastOneIngredient() {
		assertTrue("There should be at least one Ingredient",api.oneIngredient().hasMatches());
		
	}

	@Test
	public void atLeastOneCooking() {
		assertTrue("There must be at least one Description",api.oneCooking().hasMatches());
	}
	
	@Test
	public void atLeastOneDevice() {
		assertTrue("There should be at least one Device and it should have a Name",api.oneDevice().hasMatches());	
	}
	
	public void noRecipeWithoutName() {
		assertFalse("There should be a Name for the Recipe",api.recWithoutName().hasMatches());	
	}
	
	@Test
	public void noDoubleIng() {
		assertFalse("There should not be duplicate Ingredients",api.doubleIngredient().hasMatches());	
	}
	
	@Test
	public void testRule() {
		api.delRecipe().forEachMatch(m -> api.delRecipe().apply(m));
		//assertTrue(!api.recWithoutName().hasMatches());
	}
	
	
	
}
