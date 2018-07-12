package RecipeRules;

import RecipeRules.api.RecipeRulesAPI;
import RecipeRules.api.RecipeRulesDemoclesApp;

import org.emoflon.ibex.gt.democles.runtime.DemoclesGTEngine;
import org.junit.Before;

abstract public class Testing extends RecipeRulesDemoclesApp {
	protected  RecipeRulesAPI api;
	protected static final String INSTANCES = "/RecipeLanguage/instances";

	@Before
	public void setup() throws Exception {
		DemoclesGTEngine engine = new DemoclesGTEngine();
		resourceSet = engine.createAndPrepareResourceSet(workspacePath);

		loadModels();
		api = initAPI();
	}

	abstract protected void loadModels();
}
