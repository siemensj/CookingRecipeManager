/*
 * generated by Xtext 2.12.0
 */
grammar InternalRecipeDSL;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.RecipeDSLGrammarAccess;

}

@parser::members {

 	private RecipeDSLGrammarAccess grammarAccess;

    public InternalRecipeDSLParser(TokenStream input, RecipeDSLGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected RecipeDSLGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getModelAccess().getMgrManagerParserRuleCall_0());
			}
			lv_mgr_0_0=ruleManager
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getModelRule());
				}
				set(
					$current,
					"mgr",
					lv_mgr_0_0,
					"org.xtext.example.mydsl.RecipeDSL.Manager");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleManager
entryRuleManager returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getManagerRule()); }
	iv_ruleManager=ruleManager
	{ $current=$iv_ruleManager.current; }
	EOF;

// Rule Manager
ruleManager returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Recipebook'
		{
			newLeafNode(otherlv_0, grammarAccess.getManagerAccess().getRecipebookKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getManagerAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getManagerRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='from'
		{
			newLeafNode(otherlv_2, grammarAccess.getManagerAccess().getFromKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getManagerAccess().getUserUserParserRuleCall_3_0());
				}
				lv_user_3_0=ruleUser
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getManagerRule());
					}
					add(
						$current,
						"user",
						lv_user_3_0,
						"org.xtext.example.mydsl.RecipeDSL.User");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_4=','
			{
				newLeafNode(otherlv_4, grammarAccess.getManagerAccess().getCommaKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getManagerAccess().getUserUserParserRuleCall_4_1_0());
					}
					lv_user_5_0=ruleUser
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getManagerRule());
						}
						add(
							$current,
							"user",
							lv_user_5_0,
							"org.xtext.example.mydsl.RecipeDSL.User");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getManagerAccess().getRecipesRecipeParserRuleCall_5_0());
				}
				lv_recipes_6_0=ruleRecipe
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getManagerRule());
					}
					add(
						$current,
						"recipes",
						lv_recipes_6_0,
						"org.xtext.example.mydsl.RecipeDSL.Recipe");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleUser
entryRuleUser returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUserRule()); }
	iv_ruleUser=ruleUser
	{ $current=$iv_ruleUser.current; }
	EOF;

// Rule User
ruleUser returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_name_0_0=RULE_ID
			{
				newLeafNode(lv_name_0_0, grammarAccess.getUserAccess().getNameIDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getUserRule());
				}
				setWithLastConsumed(
					$current,
					"name",
					lv_name_0_0,
					"org.eclipse.xtext.common.Terminals.ID");
			}
		)
	)
;

// Entry rule entryRuleRecipe
entryRuleRecipe returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRecipeRule()); }
	iv_ruleRecipe=ruleRecipe
	{ $current=$iv_ruleRecipe.current; }
	EOF;

// Rule Recipe
ruleRecipe returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Recipe'
		{
			newLeafNode(otherlv_0, grammarAccess.getRecipeAccess().getRecipeKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getRecipeAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRecipeRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getRecipeAccess().getLevelLevelParserRuleCall_2_0());
				}
				lv_level_2_0=ruleLevel
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRecipeRule());
					}
					add(
						$current,
						"level",
						lv_level_2_0,
						"org.xtext.example.mydsl.RecipeDSL.Level");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getRecipeAccess().getIngredientIngredientParserRuleCall_3_0());
				}
				lv_ingredient_3_0=ruleIngredient
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRecipeRule());
					}
					add(
						$current,
						"ingredient",
						lv_ingredient_3_0,
						"org.xtext.example.mydsl.RecipeDSL.Ingredient");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		(
			(
				{
					newCompositeNode(grammarAccess.getRecipeAccess().getDeviceDeviceParserRuleCall_4_0());
				}
				lv_device_4_0=ruleDevice
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRecipeRule());
					}
					add(
						$current,
						"device",
						lv_device_4_0,
						"org.xtext.example.mydsl.RecipeDSL.Device");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		(
			(
				{
					newCompositeNode(grammarAccess.getRecipeAccess().getCookingCookingParserRuleCall_5_0());
				}
				lv_cooking_5_0=ruleCooking
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRecipeRule());
					}
					add(
						$current,
						"cooking",
						lv_cooking_5_0,
						"org.xtext.example.mydsl.RecipeDSL.Cooking");
					afterParserOrEnumRuleCall();
				}
			)
		)+
	)
;

// Entry rule entryRuleLevel
entryRuleLevel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLevelRule()); }
	iv_ruleLevel=ruleLevel
	{ $current=$iv_ruleLevel.current; }
	EOF;

// Rule Level
ruleLevel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Level'
		{
			newLeafNode(otherlv_0, grammarAccess.getLevelAccess().getLevelKeyword_0());
		}
		(
			(
				(
					lv_rating_1_1='*'
					{
						newLeafNode(lv_rating_1_1, grammarAccess.getLevelAccess().getRatingAsteriskKeyword_1_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getLevelRule());
						}
						addWithLastConsumed($current, "rating", lv_rating_1_1, null);
					}
					    |
					lv_rating_1_2='**'
					{
						newLeafNode(lv_rating_1_2, grammarAccess.getLevelAccess().getRatingAsteriskAsteriskKeyword_1_0_1());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getLevelRule());
						}
						addWithLastConsumed($current, "rating", lv_rating_1_2, null);
					}
					    |
					lv_rating_1_3='***'
					{
						newLeafNode(lv_rating_1_3, grammarAccess.getLevelAccess().getRatingAsteriskAsteriskAsteriskKeyword_1_0_2());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getLevelRule());
						}
						addWithLastConsumed($current, "rating", lv_rating_1_3, null);
					}
					    |
					lv_rating_1_4='****'
					{
						newLeafNode(lv_rating_1_4, grammarAccess.getLevelAccess().getRatingAsteriskAsteriskAsteriskAsteriskKeyword_1_0_3());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getLevelRule());
						}
						addWithLastConsumed($current, "rating", lv_rating_1_4, null);
					}
					    |
					lv_rating_1_5='*****'
					{
						newLeafNode(lv_rating_1_5, grammarAccess.getLevelAccess().getRatingAsteriskAsteriskAsteriskAsteriskAsteriskKeyword_1_0_4());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getLevelRule());
						}
						addWithLastConsumed($current, "rating", lv_rating_1_5, null);
					}
				)
			)
		)
	)
;

// Entry rule entryRuleIngredient
entryRuleIngredient returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIngredientRule()); }
	iv_ruleIngredient=ruleIngredient
	{ $current=$iv_ruleIngredient.current; }
	EOF;

// Rule Ingredient
ruleIngredient returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Ingredient'
		{
			newLeafNode(otherlv_0, grammarAccess.getIngredientAccess().getIngredientKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getIngredientAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getIngredientRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='amount'
		{
			newLeafNode(otherlv_2, grammarAccess.getIngredientAccess().getAmountKeyword_2());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getIngredientAccess().getMeasureWeightParserRuleCall_3_0_0());
					}
					lv_measure_3_1=ruleWeight
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getIngredientRule());
						}
						add(
							$current,
							"measure",
							lv_measure_3_1,
							"org.xtext.example.mydsl.RecipeDSL.Weight");
						afterParserOrEnumRuleCall();
					}
					    |
					{
						newCompositeNode(grammarAccess.getIngredientAccess().getMeasureCountParserRuleCall_3_0_1());
					}
					lv_measure_3_2=ruleCount
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getIngredientRule());
						}
						add(
							$current,
							"measure",
							lv_measure_3_2,
							"org.xtext.example.mydsl.RecipeDSL.Count");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
	)
;

// Entry rule entryRuleWeight
entryRuleWeight returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getWeightRule()); }
	iv_ruleWeight=ruleWeight
	{ $current=$iv_ruleWeight.current; }
	EOF;

// Rule Weight
ruleWeight returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_weight_0_0=RULE_EFLOAT
				{
					newLeafNode(lv_weight_0_0, grammarAccess.getWeightAccess().getWeightEFloatTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getWeightRule());
					}
					addWithLastConsumed(
						$current,
						"weight",
						lv_weight_0_0,
						"org.xtext.example.mydsl.RecipeDSL.EFloat");
				}
			)
		)
		(
			otherlv_1='mg'
			{
				newLeafNode(otherlv_1, grammarAccess.getWeightAccess().getMgKeyword_1_0());
			}
			    |
			otherlv_2='g'
			{
				newLeafNode(otherlv_2, grammarAccess.getWeightAccess().getGKeyword_1_1());
			}
			    |
			otherlv_3='kg'
			{
				newLeafNode(otherlv_3, grammarAccess.getWeightAccess().getKgKeyword_1_2());
			}
			    |
			otherlv_4='t'
			{
				newLeafNode(otherlv_4, grammarAccess.getWeightAccess().getTKeyword_1_3());
			}
		)
	)
;

// Entry rule entryRuleCount
entryRuleCount returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCountRule()); }
	iv_ruleCount=ruleCount
	{ $current=$iv_ruleCount.current; }
	EOF;

// Rule Count
ruleCount returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_count_0_0=RULE_INT
				{
					newLeafNode(lv_count_0_0, grammarAccess.getCountAccess().getCountINTTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCountRule());
					}
					addWithLastConsumed(
						$current,
						"count",
						lv_count_0_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_1='pieces'
		{
			newLeafNode(otherlv_1, grammarAccess.getCountAccess().getPiecesKeyword_1());
		}
	)
;

// Entry rule entryRuleDevice
entryRuleDevice returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDeviceRule()); }
	iv_ruleDevice=ruleDevice
	{ $current=$iv_ruleDevice.current; }
	EOF;

// Rule Device
ruleDevice returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Device'
		{
			newLeafNode(otherlv_0, grammarAccess.getDeviceAccess().getDeviceKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getDeviceAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDeviceRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleCooking
entryRuleCooking returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCookingRule()); }
	iv_ruleCooking=ruleCooking
	{ $current=$iv_ruleCooking.current; }
	EOF;

// Rule Cooking
ruleCooking returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Step'
		{
			newLeafNode(otherlv_0, grammarAccess.getCookingAccess().getStepKeyword_0());
		}
		(
			(
				lv_s_1_0=RULE_INT
				{
					newLeafNode(lv_s_1_0, grammarAccess.getCookingAccess().getSINTTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCookingRule());
					}
					addWithLastConsumed(
						$current,
						"s",
						lv_s_1_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getCookingAccess().getTimeTimeParserRuleCall_2_0_0());
					}
					lv_time_2_0=ruleTime
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getCookingRule());
						}
						add(
							$current,
							"time",
							lv_time_2_0,
							"org.xtext.example.mydsl.RecipeDSL.Time");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_3=':'
			{
				newLeafNode(otherlv_3, grammarAccess.getCookingAccess().getColonKeyword_2_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getCookingAccess().getStepStepParserRuleCall_2_2_0());
					}
					lv_step_4_0=ruleStep
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getCookingRule());
						}
						add(
							$current,
							"step",
							lv_step_4_0,
							"org.xtext.example.mydsl.RecipeDSL.Step");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
	)
;

// Entry rule entryRuleTime
entryRuleTime returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTimeRule()); }
	iv_ruleTime=ruleTime
	{ $current=$iv_ruleTime.current; }
	EOF;

// Rule Time
ruleTime returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='For'
		{
			newLeafNode(otherlv_0, grammarAccess.getTimeAccess().getForKeyword_0());
		}
		(
			(
				lv_time_1_0=RULE_INT
				{
					newLeafNode(lv_time_1_0, grammarAccess.getTimeAccess().getTimeINTTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTimeRule());
					}
					setWithLastConsumed(
						$current,
						"time",
						lv_time_1_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		(
			otherlv_2='sec'
			{
				newLeafNode(otherlv_2, grammarAccess.getTimeAccess().getSecKeyword_2_0());
			}
			    |
			otherlv_3='min'
			{
				newLeafNode(otherlv_3, grammarAccess.getTimeAccess().getMinKeyword_2_1());
			}
			    |
			otherlv_4='h'
			{
				newLeafNode(otherlv_4, grammarAccess.getTimeAccess().getHKeyword_2_2());
			}
			    |
			otherlv_5='d'
			{
				newLeafNode(otherlv_5, grammarAccess.getTimeAccess().getDKeyword_2_3());
			}
		)
	)
;

// Entry rule entryRuleStep
entryRuleStep returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStepRule()); }
	iv_ruleStep=ruleStep
	{ $current=$iv_ruleStep.current; }
	EOF;

// Rule Step
ruleStep returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Use'
		{
			newLeafNode(otherlv_0, grammarAccess.getStepAccess().getUseKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStepRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getStepAccess().getDevDeviceCrossReference_1_0());
				}
			)
		)
		(
			otherlv_2=','
			{
				newLeafNode(otherlv_2, grammarAccess.getStepAccess().getCommaKeyword_2_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getStepRule());
						}
					}
					otherlv_3=RULE_ID
					{
						newLeafNode(otherlv_3, grammarAccess.getStepAccess().getDev2DeviceCrossReference_2_1_0());
					}
				)
			)
		)*
		otherlv_4='with'
		{
			newLeafNode(otherlv_4, grammarAccess.getStepAccess().getWithKeyword_3());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStepRule());
					}
				}
				otherlv_5=RULE_ID
				{
					newLeafNode(otherlv_5, grammarAccess.getStepAccess().getIngIngredientCrossReference_4_0());
				}
			)
		)
		(
			otherlv_6=','
			{
				newLeafNode(otherlv_6, grammarAccess.getStepAccess().getCommaKeyword_5_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getStepRule());
						}
					}
					otherlv_7=RULE_ID
					{
						newLeafNode(otherlv_7, grammarAccess.getStepAccess().getIng2IngredientCrossReference_5_1_0());
					}
				)
			)
		)*
	)
;

RULE_EFLOAT : RULE_INT? '.' RULE_INT;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
