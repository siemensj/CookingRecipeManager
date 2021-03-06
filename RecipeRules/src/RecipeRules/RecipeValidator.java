package RecipeRules;


import java.io.File;
import org.eclipse.emf.common.util.URI;
import RecipeLanguage.Manager;
import RecipeRules.api.RecipeRulesDemoclesApp;

public class RecipeValidator extends RecipeRulesDemoclesApp {
  public RecipeValidator(Manager manager) {
    // Determine the path to the workspace root for loading models
    File root = new File(RecipeValidator.class.getResource(".").getFile());
    workspacePath = root.getParentFile().getParentFile()
                        .getParent() + File.separatorChar;
    
    // Add the Recipe as a model to be monitored by the pattern matcher            
    createModel(URI.createURI("Manager2.xmi"));//TODO
    resourceSet.getResources().get(0).getContents().add(manager);
  }
}