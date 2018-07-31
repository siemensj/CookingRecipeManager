/*
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class RecipeDSLGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.RecipeDSL.Model");
		private final Assignment cMgrAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cMgrManagerParserRuleCall_0 = (RuleCall)cMgrAssignment.eContents().get(0);
		
		//Model:
		//	mgr=Manager;
		@Override public ParserRule getRule() { return rule; }
		
		//mgr=Manager
		public Assignment getMgrAssignment() { return cMgrAssignment; }
		
		//Manager
		public RuleCall getMgrManagerParserRuleCall_0() { return cMgrManagerParserRuleCall_0; }
	}
	public class ManagerElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.RecipeDSL.Manager");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRecipebookKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cFromKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cUserAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cUserUserParserRuleCall_3_0 = (RuleCall)cUserAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cCommaKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cUserAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cUserUserParserRuleCall_4_1_0 = (RuleCall)cUserAssignment_4_1.eContents().get(0);
		private final Assignment cRecipesAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cRecipesRecipeParserRuleCall_5_0 = (RuleCall)cRecipesAssignment_5.eContents().get(0);
		
		//Manager:
		//	"Recipebook" name=ID
		//	"from" user+=User ("," user+=User)*
		//	recipes+=Recipe*;
		@Override public ParserRule getRule() { return rule; }
		
		//"Recipebook" name=ID "from" user+=User ("," user+=User)* recipes+=Recipe*
		public Group getGroup() { return cGroup; }
		
		//"Recipebook"
		public Keyword getRecipebookKeyword_0() { return cRecipebookKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//"from"
		public Keyword getFromKeyword_2() { return cFromKeyword_2; }
		
		//user+=User
		public Assignment getUserAssignment_3() { return cUserAssignment_3; }
		
		//User
		public RuleCall getUserUserParserRuleCall_3_0() { return cUserUserParserRuleCall_3_0; }
		
		//("," user+=User)*
		public Group getGroup_4() { return cGroup_4; }
		
		//","
		public Keyword getCommaKeyword_4_0() { return cCommaKeyword_4_0; }
		
		//user+=User
		public Assignment getUserAssignment_4_1() { return cUserAssignment_4_1; }
		
		//User
		public RuleCall getUserUserParserRuleCall_4_1_0() { return cUserUserParserRuleCall_4_1_0; }
		
		//recipes+=Recipe*
		public Assignment getRecipesAssignment_5() { return cRecipesAssignment_5; }
		
		//Recipe
		public RuleCall getRecipesRecipeParserRuleCall_5_0() { return cRecipesRecipeParserRuleCall_5_0; }
	}
	public class UserElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.RecipeDSL.User");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//User:
		//	name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID
		public Assignment getNameAssignment() { return cNameAssignment; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0() { return cNameIDTerminalRuleCall_0; }
	}
	public class RecipeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.RecipeDSL.Recipe");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRecipeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cLevelAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cLevelLevelParserRuleCall_2_0 = (RuleCall)cLevelAssignment_2.eContents().get(0);
		private final Assignment cIngredientAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cIngredientIngredientParserRuleCall_3_0 = (RuleCall)cIngredientAssignment_3.eContents().get(0);
		private final Assignment cDeviceAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cDeviceDeviceParserRuleCall_4_0 = (RuleCall)cDeviceAssignment_4.eContents().get(0);
		private final Assignment cCookingAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cCookingCookingParserRuleCall_5_0 = (RuleCall)cCookingAssignment_5.eContents().get(0);
		
		//Recipe:
		//	"Recipe" name=ID
		//	level+=Level ingredient+=Ingredient+
		//	device+=Device+
		//	cooking+=Cooking+;
		@Override public ParserRule getRule() { return rule; }
		
		//"Recipe" name=ID level+=Level ingredient+=Ingredient+ device+=Device+ cooking+=Cooking+
		public Group getGroup() { return cGroup; }
		
		//"Recipe"
		public Keyword getRecipeKeyword_0() { return cRecipeKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//level+=Level
		public Assignment getLevelAssignment_2() { return cLevelAssignment_2; }
		
		//Level
		public RuleCall getLevelLevelParserRuleCall_2_0() { return cLevelLevelParserRuleCall_2_0; }
		
		//ingredient+=Ingredient+
		public Assignment getIngredientAssignment_3() { return cIngredientAssignment_3; }
		
		//Ingredient
		public RuleCall getIngredientIngredientParserRuleCall_3_0() { return cIngredientIngredientParserRuleCall_3_0; }
		
		//device+=Device+
		public Assignment getDeviceAssignment_4() { return cDeviceAssignment_4; }
		
		//Device
		public RuleCall getDeviceDeviceParserRuleCall_4_0() { return cDeviceDeviceParserRuleCall_4_0; }
		
		//cooking+=Cooking+
		public Assignment getCookingAssignment_5() { return cCookingAssignment_5; }
		
		//Cooking
		public RuleCall getCookingCookingParserRuleCall_5_0() { return cCookingCookingParserRuleCall_5_0; }
	}
	public class LevelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.RecipeDSL.Level");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLevelKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cRatingAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cRatingRATINGTerminalRuleCall_1_0 = (RuleCall)cRatingAssignment_1.eContents().get(0);
		
		//Level:
		//	"Level" rating=RATING;
		@Override public ParserRule getRule() { return rule; }
		
		//"Level" rating=RATING
		public Group getGroup() { return cGroup; }
		
		//"Level"
		public Keyword getLevelKeyword_0() { return cLevelKeyword_0; }
		
		//rating=RATING
		public Assignment getRatingAssignment_1() { return cRatingAssignment_1; }
		
		//RATING
		public RuleCall getRatingRATINGTerminalRuleCall_1_0() { return cRatingRATINGTerminalRuleCall_1_0; }
	}
	public class IngredientElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.RecipeDSL.Ingredient");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cIngredientKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Assignment cNameAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0_1_0 = (RuleCall)cNameAssignment_0_1.eContents().get(0);
		private final Keyword cAmountKeyword_0_2 = (Keyword)cGroup_0.eContents().get(2);
		private final Assignment cMeasureAssignment_0_3 = (Assignment)cGroup_0.eContents().get(3);
		private final RuleCall cMeasureWeightParserRuleCall_0_3_0 = (RuleCall)cMeasureAssignment_0_3.eContents().get(0);
		private final RuleCall cCountParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Ingredient:
		//	'Ingredient' name=ID "amount" measure+=Weight | Count;
		@Override public ParserRule getRule() { return rule; }
		
		//'Ingredient' name=ID "amount" measure+=Weight | Count
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'Ingredient' name=ID "amount" measure+=Weight
		public Group getGroup_0() { return cGroup_0; }
		
		//'Ingredient'
		public Keyword getIngredientKeyword_0_0() { return cIngredientKeyword_0_0; }
		
		//name=ID
		public Assignment getNameAssignment_0_1() { return cNameAssignment_0_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_1_0() { return cNameIDTerminalRuleCall_0_1_0; }
		
		//"amount"
		public Keyword getAmountKeyword_0_2() { return cAmountKeyword_0_2; }
		
		//measure+=Weight
		public Assignment getMeasureAssignment_0_3() { return cMeasureAssignment_0_3; }
		
		//Weight
		public RuleCall getMeasureWeightParserRuleCall_0_3_0() { return cMeasureWeightParserRuleCall_0_3_0; }
		
		//Count
		public RuleCall getCountParserRuleCall_1() { return cCountParserRuleCall_1; }
	}
	public class WeightElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.RecipeDSL.Weight");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cWeightAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cWeightEFloatParserRuleCall_0_0 = (RuleCall)cWeightAssignment_0.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Keyword cMgKeyword_1_0 = (Keyword)cAlternatives_1.eContents().get(0);
		private final Keyword cGKeyword_1_1 = (Keyword)cAlternatives_1.eContents().get(1);
		private final Keyword cKgKeyword_1_2 = (Keyword)cAlternatives_1.eContents().get(2);
		private final Keyword cTKeyword_1_3 = (Keyword)cAlternatives_1.eContents().get(3);
		
		//Weight:
		//	weight+=EFloat ("mg" | "g" | "kg" | "t");
		@Override public ParserRule getRule() { return rule; }
		
		//weight+=EFloat ("mg" | "g" | "kg" | "t")
		public Group getGroup() { return cGroup; }
		
		//weight+=EFloat
		public Assignment getWeightAssignment_0() { return cWeightAssignment_0; }
		
		//EFloat
		public RuleCall getWeightEFloatParserRuleCall_0_0() { return cWeightEFloatParserRuleCall_0_0; }
		
		//"mg" | "g" | "kg" | "t"
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//"mg"
		public Keyword getMgKeyword_1_0() { return cMgKeyword_1_0; }
		
		//"g"
		public Keyword getGKeyword_1_1() { return cGKeyword_1_1; }
		
		//"kg"
		public Keyword getKgKeyword_1_2() { return cKgKeyword_1_2; }
		
		//"t"
		public Keyword getTKeyword_1_3() { return cTKeyword_1_3; }
	}
	public class CountElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.RecipeDSL.Count");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cCAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cCINTTerminalRuleCall_0_0 = (RuleCall)cCAssignment_0.eContents().get(0);
		private final Keyword cPiecesKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//Count:
		//	c=INT "pieces";
		@Override public ParserRule getRule() { return rule; }
		
		//c=INT "pieces"
		public Group getGroup() { return cGroup; }
		
		//c=INT
		public Assignment getCAssignment_0() { return cCAssignment_0; }
		
		//INT
		public RuleCall getCINTTerminalRuleCall_0_0() { return cCINTTerminalRuleCall_0_0; }
		
		//"pieces"
		public Keyword getPiecesKeyword_1() { return cPiecesKeyword_1; }
	}
	public class DeviceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.RecipeDSL.Device");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDeviceKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Device:
		//	"Device" name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//"Device" name=ID
		public Group getGroup() { return cGroup; }
		
		//"Device"
		public Keyword getDeviceKeyword_0() { return cDeviceKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	public class CookingElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.RecipeDSL.Cooking");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cStepKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cSAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cSINTTerminalRuleCall_1_0 = (RuleCall)cSAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Assignment cTimeAssignment_2_0 = (Assignment)cGroup_2.eContents().get(0);
		private final RuleCall cTimeTimeParserRuleCall_2_0_0 = (RuleCall)cTimeAssignment_2_0.eContents().get(0);
		private final Keyword cCommaKeyword_2_1 = (Keyword)cGroup_2.eContents().get(1);
		private final Assignment cStepAssignment_2_2 = (Assignment)cGroup_2.eContents().get(2);
		private final RuleCall cStepStepParserRuleCall_2_2_0 = (RuleCall)cStepAssignment_2_2.eContents().get(0);
		
		//Cooking:
		//	"Step" s+=INT (time+=Time "," step+=Step);
		@Override public ParserRule getRule() { return rule; }
		
		//"Step" s+=INT (time+=Time "," step+=Step)
		public Group getGroup() { return cGroup; }
		
		//"Step"
		public Keyword getStepKeyword_0() { return cStepKeyword_0; }
		
		//s+=INT
		public Assignment getSAssignment_1() { return cSAssignment_1; }
		
		//INT
		public RuleCall getSINTTerminalRuleCall_1_0() { return cSINTTerminalRuleCall_1_0; }
		
		//time+=Time "," step+=Step
		public Group getGroup_2() { return cGroup_2; }
		
		//time+=Time
		public Assignment getTimeAssignment_2_0() { return cTimeAssignment_2_0; }
		
		//Time
		public RuleCall getTimeTimeParserRuleCall_2_0_0() { return cTimeTimeParserRuleCall_2_0_0; }
		
		//","
		public Keyword getCommaKeyword_2_1() { return cCommaKeyword_2_1; }
		
		//step+=Step
		public Assignment getStepAssignment_2_2() { return cStepAssignment_2_2; }
		
		//Step
		public RuleCall getStepStepParserRuleCall_2_2_0() { return cStepStepParserRuleCall_2_2_0; }
	}
	public class TimeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.RecipeDSL.Time");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cForKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cTimeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTimeINTTerminalRuleCall_1_0 = (RuleCall)cTimeAssignment_1.eContents().get(0);
		private final Alternatives cAlternatives_2 = (Alternatives)cGroup.eContents().get(2);
		private final Keyword cSecKeyword_2_0 = (Keyword)cAlternatives_2.eContents().get(0);
		private final Keyword cMinKeyword_2_1 = (Keyword)cAlternatives_2.eContents().get(1);
		private final Keyword cHKeyword_2_2 = (Keyword)cAlternatives_2.eContents().get(2);
		private final Keyword cDKeyword_2_3 = (Keyword)cAlternatives_2.eContents().get(3);
		
		//Time:
		//	"For" time=INT ("sec" | "min" | "h" | "d");
		@Override public ParserRule getRule() { return rule; }
		
		//"For" time=INT ("sec" | "min" | "h" | "d")
		public Group getGroup() { return cGroup; }
		
		//"For"
		public Keyword getForKeyword_0() { return cForKeyword_0; }
		
		//time=INT
		public Assignment getTimeAssignment_1() { return cTimeAssignment_1; }
		
		//INT
		public RuleCall getTimeINTTerminalRuleCall_1_0() { return cTimeINTTerminalRuleCall_1_0; }
		
		//"sec" | "min" | "h" | "d"
		public Alternatives getAlternatives_2() { return cAlternatives_2; }
		
		//"sec"
		public Keyword getSecKeyword_2_0() { return cSecKeyword_2_0; }
		
		//"min"
		public Keyword getMinKeyword_2_1() { return cMinKeyword_2_1; }
		
		//"h"
		public Keyword getHKeyword_2_2() { return cHKeyword_2_2; }
		
		//"d"
		public Keyword getDKeyword_2_3() { return cDKeyword_2_3; }
	}
	public class StepElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.RecipeDSL.Step");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cUseKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cDevAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cDevDeviceCrossReference_1_0 = (CrossReference)cDevAssignment_1.eContents().get(0);
		private final RuleCall cDevDeviceIDTerminalRuleCall_1_0_1 = (RuleCall)cDevDeviceCrossReference_1_0.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cCommaKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cDev2Assignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final CrossReference cDev2DeviceCrossReference_2_1_0 = (CrossReference)cDev2Assignment_2_1.eContents().get(0);
		private final RuleCall cDev2DeviceIDTerminalRuleCall_2_1_0_1 = (RuleCall)cDev2DeviceCrossReference_2_1_0.eContents().get(1);
		private final Keyword cWithKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cIngAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cIngIngredientCrossReference_4_0 = (CrossReference)cIngAssignment_4.eContents().get(0);
		private final RuleCall cIngIngredientIDTerminalRuleCall_4_0_1 = (RuleCall)cIngIngredientCrossReference_4_0.eContents().get(1);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cCommaKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cIng2Assignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final CrossReference cIng2IngredientCrossReference_5_1_0 = (CrossReference)cIng2Assignment_5_1.eContents().get(0);
		private final RuleCall cIng2IngredientIDTerminalRuleCall_5_1_0_1 = (RuleCall)cIng2IngredientCrossReference_5_1_0.eContents().get(1);
		
		//Step:
		//	"Use" dev+=[Device] ("," dev2+=[Device])* "with" ing+=[Ingredient] ("," ing2+=[Ingredient])*;
		@Override public ParserRule getRule() { return rule; }
		
		//"Use" dev+=[Device] ("," dev2+=[Device])* "with" ing+=[Ingredient] ("," ing2+=[Ingredient])*
		public Group getGroup() { return cGroup; }
		
		//"Use"
		public Keyword getUseKeyword_0() { return cUseKeyword_0; }
		
		//dev+=[Device]
		public Assignment getDevAssignment_1() { return cDevAssignment_1; }
		
		//[Device]
		public CrossReference getDevDeviceCrossReference_1_0() { return cDevDeviceCrossReference_1_0; }
		
		//ID
		public RuleCall getDevDeviceIDTerminalRuleCall_1_0_1() { return cDevDeviceIDTerminalRuleCall_1_0_1; }
		
		//("," dev2+=[Device])*
		public Group getGroup_2() { return cGroup_2; }
		
		//","
		public Keyword getCommaKeyword_2_0() { return cCommaKeyword_2_0; }
		
		//dev2+=[Device]
		public Assignment getDev2Assignment_2_1() { return cDev2Assignment_2_1; }
		
		//[Device]
		public CrossReference getDev2DeviceCrossReference_2_1_0() { return cDev2DeviceCrossReference_2_1_0; }
		
		//ID
		public RuleCall getDev2DeviceIDTerminalRuleCall_2_1_0_1() { return cDev2DeviceIDTerminalRuleCall_2_1_0_1; }
		
		//"with"
		public Keyword getWithKeyword_3() { return cWithKeyword_3; }
		
		//ing+=[Ingredient]
		public Assignment getIngAssignment_4() { return cIngAssignment_4; }
		
		//[Ingredient]
		public CrossReference getIngIngredientCrossReference_4_0() { return cIngIngredientCrossReference_4_0; }
		
		//ID
		public RuleCall getIngIngredientIDTerminalRuleCall_4_0_1() { return cIngIngredientIDTerminalRuleCall_4_0_1; }
		
		//("," ing2+=[Ingredient])*
		public Group getGroup_5() { return cGroup_5; }
		
		//","
		public Keyword getCommaKeyword_5_0() { return cCommaKeyword_5_0; }
		
		//ing2+=[Ingredient]
		public Assignment getIng2Assignment_5_1() { return cIng2Assignment_5_1; }
		
		//[Ingredient]
		public CrossReference getIng2IngredientCrossReference_5_1_0() { return cIng2IngredientCrossReference_5_1_0; }
		
		//ID
		public RuleCall getIng2IngredientIDTerminalRuleCall_5_1_0_1() { return cIng2IngredientIDTerminalRuleCall_5_1_0_1; }
	}
	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.RecipeDSL.EString");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//EString:
		//	STRING | ID;
		@Override public ParserRule getRule() { return rule; }
		
		//STRING | ID
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_0() { return cSTRINGTerminalRuleCall_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}
	public class EIntElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.RecipeDSL.EInt");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cHyphenMinusKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//EInt ecore::EInt:
		//	'-'? INT;
		@Override public ParserRule getRule() { return rule; }
		
		//'-'? INT
		public Group getGroup() { return cGroup; }
		
		//'-'?
		public Keyword getHyphenMinusKeyword_0() { return cHyphenMinusKeyword_0; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_1() { return cINTTerminalRuleCall_1; }
	}
	public class EFloatElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.RecipeDSL.EFloat");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cHyphenMinusKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final RuleCall cINTTerminalRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Alternatives cAlternatives_4_0 = (Alternatives)cGroup_4.eContents().get(0);
		private final Keyword cEKeyword_4_0_0 = (Keyword)cAlternatives_4_0.eContents().get(0);
		private final Keyword cEKeyword_4_0_1 = (Keyword)cAlternatives_4_0.eContents().get(1);
		private final Keyword cHyphenMinusKeyword_4_1 = (Keyword)cGroup_4.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_4_2 = (RuleCall)cGroup_4.eContents().get(2);
		
		//EFloat ecore::EFloat:
		//	'-'? INT? '.' INT (('E' | 'e') '-'? INT)?;
		@Override public ParserRule getRule() { return rule; }
		
		//'-'? INT? '.' INT (('E' | 'e') '-'? INT)?
		public Group getGroup() { return cGroup; }
		
		//'-'?
		public Keyword getHyphenMinusKeyword_0() { return cHyphenMinusKeyword_0; }
		
		//INT?
		public RuleCall getINTTerminalRuleCall_1() { return cINTTerminalRuleCall_1; }
		
		//'.'
		public Keyword getFullStopKeyword_2() { return cFullStopKeyword_2; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_3() { return cINTTerminalRuleCall_3; }
		
		//(('E' | 'e') '-'? INT)?
		public Group getGroup_4() { return cGroup_4; }
		
		//'E' | 'e'
		public Alternatives getAlternatives_4_0() { return cAlternatives_4_0; }
		
		//'E'
		public Keyword getEKeyword_4_0_0() { return cEKeyword_4_0_0; }
		
		//'e'
		public Keyword getEKeyword_4_0_1() { return cEKeyword_4_0_1; }
		
		//'-'?
		public Keyword getHyphenMinusKeyword_4_1() { return cHyphenMinusKeyword_4_1; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_4_2() { return cINTTerminalRuleCall_4_2; }
	}
	
	
	private final ModelElements pModel;
	private final ManagerElements pManager;
	private final UserElements pUser;
	private final RecipeElements pRecipe;
	private final LevelElements pLevel;
	private final TerminalRule tRATING;
	private final IngredientElements pIngredient;
	private final WeightElements pWeight;
	private final CountElements pCount;
	private final DeviceElements pDevice;
	private final CookingElements pCooking;
	private final TimeElements pTime;
	private final StepElements pStep;
	private final EStringElements pEString;
	private final EIntElements pEInt;
	private final EFloatElements pEFloat;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public RecipeDSLGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pManager = new ManagerElements();
		this.pUser = new UserElements();
		this.pRecipe = new RecipeElements();
		this.pLevel = new LevelElements();
		this.tRATING = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.RecipeDSL.RATING");
		this.pIngredient = new IngredientElements();
		this.pWeight = new WeightElements();
		this.pCount = new CountElements();
		this.pDevice = new DeviceElements();
		this.pCooking = new CookingElements();
		this.pTime = new TimeElements();
		this.pStep = new StepElements();
		this.pEString = new EStringElements();
		this.pEInt = new EIntElements();
		this.pEFloat = new EFloatElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.mydsl.RecipeDSL".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	mgr=Manager;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//Manager:
	//	"Recipebook" name=ID
	//	"from" user+=User ("," user+=User)*
	//	recipes+=Recipe*;
	public ManagerElements getManagerAccess() {
		return pManager;
	}
	
	public ParserRule getManagerRule() {
		return getManagerAccess().getRule();
	}
	
	//User:
	//	name=ID;
	public UserElements getUserAccess() {
		return pUser;
	}
	
	public ParserRule getUserRule() {
		return getUserAccess().getRule();
	}
	
	//Recipe:
	//	"Recipe" name=ID
	//	level+=Level ingredient+=Ingredient+
	//	device+=Device+
	//	cooking+=Cooking+;
	public RecipeElements getRecipeAccess() {
		return pRecipe;
	}
	
	public ParserRule getRecipeRule() {
		return getRecipeAccess().getRule();
	}
	
	//Level:
	//	"Level" rating=RATING;
	public LevelElements getLevelAccess() {
		return pLevel;
	}
	
	public ParserRule getLevelRule() {
		return getLevelAccess().getRule();
	}
	
	//terminal RATING:
	//	'1'..'5';
	public TerminalRule getRATINGRule() {
		return tRATING;
	}
	
	//Ingredient:
	//	'Ingredient' name=ID "amount" measure+=Weight | Count;
	public IngredientElements getIngredientAccess() {
		return pIngredient;
	}
	
	public ParserRule getIngredientRule() {
		return getIngredientAccess().getRule();
	}
	
	//Weight:
	//	weight+=EFloat ("mg" | "g" | "kg" | "t");
	public WeightElements getWeightAccess() {
		return pWeight;
	}
	
	public ParserRule getWeightRule() {
		return getWeightAccess().getRule();
	}
	
	//Count:
	//	c=INT "pieces";
	public CountElements getCountAccess() {
		return pCount;
	}
	
	public ParserRule getCountRule() {
		return getCountAccess().getRule();
	}
	
	//Device:
	//	"Device" name=ID;
	public DeviceElements getDeviceAccess() {
		return pDevice;
	}
	
	public ParserRule getDeviceRule() {
		return getDeviceAccess().getRule();
	}
	
	//Cooking:
	//	"Step" s+=INT (time+=Time "," step+=Step);
	public CookingElements getCookingAccess() {
		return pCooking;
	}
	
	public ParserRule getCookingRule() {
		return getCookingAccess().getRule();
	}
	
	//Time:
	//	"For" time=INT ("sec" | "min" | "h" | "d");
	public TimeElements getTimeAccess() {
		return pTime;
	}
	
	public ParserRule getTimeRule() {
		return getTimeAccess().getRule();
	}
	
	//Step:
	//	"Use" dev+=[Device] ("," dev2+=[Device])* "with" ing+=[Ingredient] ("," ing2+=[Ingredient])*;
	public StepElements getStepAccess() {
		return pStep;
	}
	
	public ParserRule getStepRule() {
		return getStepAccess().getRule();
	}
	
	//EString:
	//	STRING | ID;
	public EStringElements getEStringAccess() {
		return pEString;
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}
	
	//EInt ecore::EInt:
	//	'-'? INT;
	public EIntElements getEIntAccess() {
		return pEInt;
	}
	
	public ParserRule getEIntRule() {
		return getEIntAccess().getRule();
	}
	
	//EFloat ecore::EFloat:
	//	'-'? INT? '.' INT (('E' | 'e') '-'? INT)?;
	public EFloatElements getEFloatAccess() {
		return pEFloat;
	}
	
	public ParserRule getEFloatRule() {
		return getEFloatAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
