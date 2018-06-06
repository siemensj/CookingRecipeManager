package RecipeRules;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.eclipse.emf.common.util.URI;
import org.junit.Test;

public class Test1 extends Testing {

	@Override
	protected void loadModels() {
		//loadModel(URI.createPlatformResourceURI(INSTANCES + "/kundeMitZweiUmsaetzen.xmi", true));
		loadModel(URI.createPlatformResourceURI(INSTANCES + "/Manager_multi_recipes.xmi",true));
	}

	@Test
	public void atLeastOneIngredient() {
		assertTrue("There should be at least one Ingredient",api.oneIngredient().hasMatches());
		
	}

	@Test
	public void atLeastOneCooking() {
		assertTrue("There must be at least one Recipe",api.oneCooking().hasMatches());
	}
}
