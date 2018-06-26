/*
 * generated by Xtext 2.12.0
 */
grammar InternalRecipeDSL;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.RecipeDSLGrammarAccess;

}
@parser::members {
	private RecipeDSLGrammarAccess grammarAccess;

	public void setGrammarAccess(RecipeDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleModel
entryRuleModel
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getModelAccess().getRecipesAssignment()); }
		(rule__Model__RecipesAssignment)*
		{ after(grammarAccess.getModelAccess().getRecipesAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRecipe
entryRuleRecipe
:
{ before(grammarAccess.getRecipeRule()); }
	 ruleRecipe
{ after(grammarAccess.getRecipeRule()); } 
	 EOF 
;

// Rule Recipe
ruleRecipe 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRecipeAccess().getGroup()); }
		(rule__Recipe__Group__0)
		{ after(grammarAccess.getRecipeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleIngredient
entryRuleIngredient
:
{ before(grammarAccess.getIngredientRule()); }
	 ruleIngredient
{ after(grammarAccess.getIngredientRule()); } 
	 EOF 
;

// Rule Ingredient
ruleIngredient 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getIngredientAccess().getGroup()); }
		(rule__Ingredient__Group__0)
		{ after(grammarAccess.getIngredientAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMeasure
entryRuleMeasure
:
{ before(grammarAccess.getMeasureRule()); }
	 ruleMeasure
{ after(grammarAccess.getMeasureRule()); } 
	 EOF 
;

// Rule Measure
ruleMeasure 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMeasureAccess().getAlternatives()); }
		(rule__Measure__Alternatives)
		{ after(grammarAccess.getMeasureAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleWeight
entryRuleWeight
:
{ before(grammarAccess.getWeightRule()); }
	 ruleWeight
{ after(grammarAccess.getWeightRule()); } 
	 EOF 
;

// Rule Weight
ruleWeight 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getWeightAccess().getGroup()); }
		(rule__Weight__Group__0)
		{ after(grammarAccess.getWeightAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCount
entryRuleCount
:
{ before(grammarAccess.getCountRule()); }
	 ruleCount
{ after(grammarAccess.getCountRule()); } 
	 EOF 
;

// Rule Count
ruleCount 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCountAccess().getGroup()); }
		(rule__Count__Group__0)
		{ after(grammarAccess.getCountAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDevice
entryRuleDevice
:
{ before(grammarAccess.getDeviceRule()); }
	 ruleDevice
{ after(grammarAccess.getDeviceRule()); } 
	 EOF 
;

// Rule Device
ruleDevice 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDeviceAccess().getGroup()); }
		(rule__Device__Group__0)
		{ after(grammarAccess.getDeviceAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCooking
entryRuleCooking
:
{ before(grammarAccess.getCookingRule()); }
	 ruleCooking
{ after(grammarAccess.getCookingRule()); } 
	 EOF 
;

// Rule Cooking
ruleCooking 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCookingAccess().getGroup()); }
		(rule__Cooking__Group__0)
		{ after(grammarAccess.getCookingAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTime
entryRuleTime
:
{ before(grammarAccess.getTimeRule()); }
	 ruleTime
{ after(grammarAccess.getTimeRule()); } 
	 EOF 
;

// Rule Time
ruleTime 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTimeAccess().getGroup()); }
		(rule__Time__Group__0)
		{ after(grammarAccess.getTimeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleStep
entryRuleStep
:
{ before(grammarAccess.getStepRule()); }
	 ruleStep
{ after(grammarAccess.getStepRule()); } 
	 EOF 
;

// Rule Step
ruleStep 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStepAccess().getGroup()); }
		(rule__Step__Group__0)
		{ after(grammarAccess.getStepAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Measure__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMeasureAccess().getWeightParserRuleCall_0()); }
		ruleWeight
		{ after(grammarAccess.getMeasureAccess().getWeightParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getMeasureAccess().getCountParserRuleCall_1()); }
		ruleCount
		{ after(grammarAccess.getMeasureAccess().getCountParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Recipe__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Recipe__Group__0__Impl
	rule__Recipe__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Recipe__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRecipeAccess().getRecipeKeyword_0()); }
	'Recipe'
	{ after(grammarAccess.getRecipeAccess().getRecipeKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Recipe__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Recipe__Group__1__Impl
	rule__Recipe__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Recipe__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRecipeAccess().getNameAssignment_1()); }
	(rule__Recipe__NameAssignment_1)
	{ after(grammarAccess.getRecipeAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Recipe__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Recipe__Group__2__Impl
	rule__Recipe__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Recipe__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getRecipeAccess().getIngredientAssignment_2()); }
		(rule__Recipe__IngredientAssignment_2)
		{ after(grammarAccess.getRecipeAccess().getIngredientAssignment_2()); }
	)
	(
		{ before(grammarAccess.getRecipeAccess().getIngredientAssignment_2()); }
		(rule__Recipe__IngredientAssignment_2)*
		{ after(grammarAccess.getRecipeAccess().getIngredientAssignment_2()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Recipe__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Recipe__Group__3__Impl
	rule__Recipe__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Recipe__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getRecipeAccess().getDeviceAssignment_3()); }
		(rule__Recipe__DeviceAssignment_3)
		{ after(grammarAccess.getRecipeAccess().getDeviceAssignment_3()); }
	)
	(
		{ before(grammarAccess.getRecipeAccess().getDeviceAssignment_3()); }
		(rule__Recipe__DeviceAssignment_3)*
		{ after(grammarAccess.getRecipeAccess().getDeviceAssignment_3()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Recipe__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Recipe__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Recipe__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getRecipeAccess().getCookingAssignment_4()); }
		(rule__Recipe__CookingAssignment_4)
		{ after(grammarAccess.getRecipeAccess().getCookingAssignment_4()); }
	)
	(
		{ before(grammarAccess.getRecipeAccess().getCookingAssignment_4()); }
		(rule__Recipe__CookingAssignment_4)*
		{ after(grammarAccess.getRecipeAccess().getCookingAssignment_4()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Ingredient__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Ingredient__Group__0__Impl
	rule__Ingredient__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Ingredient__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIngredientAccess().getIngredientKeyword_0()); }
	'Ingredient'
	{ after(grammarAccess.getIngredientAccess().getIngredientKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Ingredient__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Ingredient__Group__1__Impl
	rule__Ingredient__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Ingredient__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIngredientAccess().getNameAssignment_1()); }
	(rule__Ingredient__NameAssignment_1)
	{ after(grammarAccess.getIngredientAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Ingredient__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Ingredient__Group__2__Impl
	rule__Ingredient__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Ingredient__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIngredientAccess().getAmountKeyword_2()); }
	'amount'
	{ after(grammarAccess.getIngredientAccess().getAmountKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Ingredient__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Ingredient__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Ingredient__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIngredientAccess().getMeasureAssignment_3()); }
	(rule__Ingredient__MeasureAssignment_3)
	{ after(grammarAccess.getIngredientAccess().getMeasureAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Weight__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Weight__Group__0__Impl
	rule__Weight__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Weight__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWeightAccess().getWeightKeyword_0()); }
	'Weight'
	{ after(grammarAccess.getWeightAccess().getWeightKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Weight__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Weight__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Weight__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWeightAccess().getGrammsAssignment_1()); }
	(rule__Weight__GrammsAssignment_1)
	{ after(grammarAccess.getWeightAccess().getGrammsAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Count__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Count__Group__0__Impl
	rule__Count__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Count__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCountAccess().getCountKeyword_0()); }
	'Count'
	{ after(grammarAccess.getCountAccess().getCountKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Count__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Count__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Count__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCountAccess().getCountAssignment_1()); }
	(rule__Count__CountAssignment_1)
	{ after(grammarAccess.getCountAccess().getCountAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Device__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Device__Group__0__Impl
	rule__Device__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Device__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDeviceAccess().getDeviceKeyword_0()); }
	'Device'
	{ after(grammarAccess.getDeviceAccess().getDeviceKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Device__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Device__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Device__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDeviceAccess().getNameAssignment_1()); }
	(rule__Device__NameAssignment_1)
	{ after(grammarAccess.getDeviceAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Cooking__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cooking__Group__0__Impl
	rule__Cooking__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Cooking__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCookingAccess().getCookingKeyword_0()); }
	'Cooking'
	{ after(grammarAccess.getCookingAccess().getCookingKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cooking__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cooking__Group__1__Impl
	rule__Cooking__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Cooking__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCookingAccess().getOrderAssignment_1()); }
	(rule__Cooking__OrderAssignment_1)
	{ after(grammarAccess.getCookingAccess().getOrderAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cooking__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cooking__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Cooking__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCookingAccess().getGroup_2()); }
	(rule__Cooking__Group_2__0)*
	{ after(grammarAccess.getCookingAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Cooking__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cooking__Group_2__0__Impl
	rule__Cooking__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Cooking__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCookingAccess().getTimeAssignment_2_0()); }
	(rule__Cooking__TimeAssignment_2_0)
	{ after(grammarAccess.getCookingAccess().getTimeAssignment_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cooking__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cooking__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Cooking__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCookingAccess().getStepAssignment_2_1()); }
	(rule__Cooking__StepAssignment_2_1)
	{ after(grammarAccess.getCookingAccess().getStepAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Time__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Time__Group__0__Impl
	rule__Time__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Time__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeAccess().getForKeyword_0()); }
	'For'
	{ after(grammarAccess.getTimeAccess().getForKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Time__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Time__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Time__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTimeAccess().getTimeAssignment_1()); }
	(rule__Time__TimeAssignment_1)
	{ after(grammarAccess.getTimeAccess().getTimeAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Step__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Step__Group__0__Impl
	rule__Step__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Step__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStepAccess().getUseKeyword_0()); }
	'Use'
	{ after(grammarAccess.getStepAccess().getUseKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Step__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Step__Group__1__Impl
	rule__Step__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Step__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStepAccess().getDAssignment_1()); }
	(rule__Step__DAssignment_1)
	{ after(grammarAccess.getStepAccess().getDAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Step__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Step__Group__2__Impl
	rule__Step__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Step__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStepAccess().getWithKeyword_2()); }
	'with'
	{ after(grammarAccess.getStepAccess().getWithKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Step__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Step__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Step__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStepAccess().getIAssignment_3()); }
	(rule__Step__IAssignment_3)
	{ after(grammarAccess.getStepAccess().getIAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Model__RecipesAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getRecipesRecipeParserRuleCall_0()); }
		ruleRecipe
		{ after(grammarAccess.getModelAccess().getRecipesRecipeParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Recipe__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRecipeAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getRecipeAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Recipe__IngredientAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRecipeAccess().getIngredientIngredientParserRuleCall_2_0()); }
		ruleIngredient
		{ after(grammarAccess.getRecipeAccess().getIngredientIngredientParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Recipe__DeviceAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRecipeAccess().getDeviceDeviceParserRuleCall_3_0()); }
		ruleDevice
		{ after(grammarAccess.getRecipeAccess().getDeviceDeviceParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Recipe__CookingAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRecipeAccess().getCookingCookingParserRuleCall_4_0()); }
		ruleCooking
		{ after(grammarAccess.getRecipeAccess().getCookingCookingParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Ingredient__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIngredientAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getIngredientAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Ingredient__MeasureAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIngredientAccess().getMeasureMeasureParserRuleCall_3_0()); }
		ruleMeasure
		{ after(grammarAccess.getIngredientAccess().getMeasureMeasureParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Weight__GrammsAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getWeightAccess().getGrammsSTRINGTerminalRuleCall_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getWeightAccess().getGrammsSTRINGTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Count__CountAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCountAccess().getCountINTTerminalRuleCall_1_0()); }
		RULE_INT
		{ after(grammarAccess.getCountAccess().getCountINTTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Device__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDeviceAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getDeviceAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cooking__OrderAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCookingAccess().getOrderIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getCookingAccess().getOrderIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cooking__TimeAssignment_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCookingAccess().getTimeTimeParserRuleCall_2_0_0()); }
		ruleTime
		{ after(grammarAccess.getCookingAccess().getTimeTimeParserRuleCall_2_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cooking__StepAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCookingAccess().getStepStepParserRuleCall_2_1_0()); }
		ruleStep
		{ after(grammarAccess.getCookingAccess().getStepStepParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Time__TimeAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTimeAccess().getTimeSTRINGTerminalRuleCall_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getTimeAccess().getTimeSTRINGTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Step__DAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStepAccess().getDDeviceParserRuleCall_1_0()); }
		ruleDevice
		{ after(grammarAccess.getStepAccess().getDDeviceParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Step__IAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStepAccess().getIIngredientParserRuleCall_3_0()); }
		ruleIngredient
		{ after(grammarAccess.getStepAccess().getIIngredientParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
