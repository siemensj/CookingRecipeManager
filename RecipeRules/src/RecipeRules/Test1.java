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
	public void patternMatching() {
		//assertEquals("There shoud be two matches", 2, api.kundeMitMindestensZweiUmsaetzen().countMatches());
		assertTrue("There should be at least one Ingredient",api.oneIngredient().hasMatches());
	}

	@Test
	public void jedesModellMussEineRezeptBeschreibungHaben() {
		assertTrue("There must be at least one Recipe",api.oneCooking().hasMatches());
		//assertTrue("There must be at least one bank", api.jedesModellMussEineBankHaben().hasMatches());
		//api.jedesModellMussEineBankHaben().findAnyMatch().ifPresent(m -> EcoreUtil.delete(m.getBank()));
		//assertFalse("There must be at least one bank", api.jedesModellMussEineBankHaben().hasMatches());
	}
}
