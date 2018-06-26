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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRecipeDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Recipe'", "'Ingredient'", "'amount'", "'Weight'", "'Count'", "'Device'", "'Cooking'", "'For'", "'Use'", "'with'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;

    // delegates
    // delegators


        public InternalRecipeDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRecipeDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRecipeDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRecipeDSL.g"; }



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




    // $ANTLR start "entryRuleModel"
    // InternalRecipeDSL.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalRecipeDSL.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalRecipeDSL.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalRecipeDSL.g:71:1: ruleModel returns [EObject current=null] : ( (lv_recipes_0_0= ruleRecipe ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_recipes_0_0 = null;



        	enterRule();

        try {
            // InternalRecipeDSL.g:77:2: ( ( (lv_recipes_0_0= ruleRecipe ) )* )
            // InternalRecipeDSL.g:78:2: ( (lv_recipes_0_0= ruleRecipe ) )*
            {
            // InternalRecipeDSL.g:78:2: ( (lv_recipes_0_0= ruleRecipe ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRecipeDSL.g:79:3: (lv_recipes_0_0= ruleRecipe )
            	    {
            	    // InternalRecipeDSL.g:79:3: (lv_recipes_0_0= ruleRecipe )
            	    // InternalRecipeDSL.g:80:4: lv_recipes_0_0= ruleRecipe
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getRecipesRecipeParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_recipes_0_0=ruleRecipe();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"recipes",
            	    					lv_recipes_0_0,
            	    					"org.xtext.example.mydsl.RecipeDSL.Recipe");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleRecipe"
    // InternalRecipeDSL.g:100:1: entryRuleRecipe returns [EObject current=null] : iv_ruleRecipe= ruleRecipe EOF ;
    public final EObject entryRuleRecipe() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecipe = null;


        try {
            // InternalRecipeDSL.g:100:47: (iv_ruleRecipe= ruleRecipe EOF )
            // InternalRecipeDSL.g:101:2: iv_ruleRecipe= ruleRecipe EOF
            {
             newCompositeNode(grammarAccess.getRecipeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRecipe=ruleRecipe();

            state._fsp--;

             current =iv_ruleRecipe; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRecipe"


    // $ANTLR start "ruleRecipe"
    // InternalRecipeDSL.g:107:1: ruleRecipe returns [EObject current=null] : (otherlv_0= 'Recipe' ( (lv_name_1_0= RULE_ID ) ) ( (lv_ingredient_2_0= ruleIngredient ) )+ ( (lv_device_3_0= ruleDevice ) )+ ( (lv_cooking_4_0= ruleCooking ) )+ ) ;
    public final EObject ruleRecipe() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_ingredient_2_0 = null;

        EObject lv_device_3_0 = null;

        EObject lv_cooking_4_0 = null;



        	enterRule();

        try {
            // InternalRecipeDSL.g:113:2: ( (otherlv_0= 'Recipe' ( (lv_name_1_0= RULE_ID ) ) ( (lv_ingredient_2_0= ruleIngredient ) )+ ( (lv_device_3_0= ruleDevice ) )+ ( (lv_cooking_4_0= ruleCooking ) )+ ) )
            // InternalRecipeDSL.g:114:2: (otherlv_0= 'Recipe' ( (lv_name_1_0= RULE_ID ) ) ( (lv_ingredient_2_0= ruleIngredient ) )+ ( (lv_device_3_0= ruleDevice ) )+ ( (lv_cooking_4_0= ruleCooking ) )+ )
            {
            // InternalRecipeDSL.g:114:2: (otherlv_0= 'Recipe' ( (lv_name_1_0= RULE_ID ) ) ( (lv_ingredient_2_0= ruleIngredient ) )+ ( (lv_device_3_0= ruleDevice ) )+ ( (lv_cooking_4_0= ruleCooking ) )+ )
            // InternalRecipeDSL.g:115:3: otherlv_0= 'Recipe' ( (lv_name_1_0= RULE_ID ) ) ( (lv_ingredient_2_0= ruleIngredient ) )+ ( (lv_device_3_0= ruleDevice ) )+ ( (lv_cooking_4_0= ruleCooking ) )+
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRecipeAccess().getRecipeKeyword_0());
            		
            // InternalRecipeDSL.g:119:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRecipeDSL.g:120:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRecipeDSL.g:120:4: (lv_name_1_0= RULE_ID )
            // InternalRecipeDSL.g:121:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRecipeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRecipeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalRecipeDSL.g:137:3: ( (lv_ingredient_2_0= ruleIngredient ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalRecipeDSL.g:138:4: (lv_ingredient_2_0= ruleIngredient )
            	    {
            	    // InternalRecipeDSL.g:138:4: (lv_ingredient_2_0= ruleIngredient )
            	    // InternalRecipeDSL.g:139:5: lv_ingredient_2_0= ruleIngredient
            	    {

            	    					newCompositeNode(grammarAccess.getRecipeAccess().getIngredientIngredientParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_ingredient_2_0=ruleIngredient();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRecipeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ingredient",
            	    						lv_ingredient_2_0,
            	    						"org.xtext.example.mydsl.RecipeDSL.Ingredient");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            // InternalRecipeDSL.g:156:3: ( (lv_device_3_0= ruleDevice ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalRecipeDSL.g:157:4: (lv_device_3_0= ruleDevice )
            	    {
            	    // InternalRecipeDSL.g:157:4: (lv_device_3_0= ruleDevice )
            	    // InternalRecipeDSL.g:158:5: lv_device_3_0= ruleDevice
            	    {

            	    					newCompositeNode(grammarAccess.getRecipeAccess().getDeviceDeviceParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_device_3_0=ruleDevice();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRecipeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"device",
            	    						lv_device_3_0,
            	    						"org.xtext.example.mydsl.RecipeDSL.Device");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            // InternalRecipeDSL.g:175:3: ( (lv_cooking_4_0= ruleCooking ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalRecipeDSL.g:176:4: (lv_cooking_4_0= ruleCooking )
            	    {
            	    // InternalRecipeDSL.g:176:4: (lv_cooking_4_0= ruleCooking )
            	    // InternalRecipeDSL.g:177:5: lv_cooking_4_0= ruleCooking
            	    {

            	    					newCompositeNode(grammarAccess.getRecipeAccess().getCookingCookingParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_cooking_4_0=ruleCooking();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRecipeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"cooking",
            	    						lv_cooking_4_0,
            	    						"org.xtext.example.mydsl.RecipeDSL.Cooking");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRecipe"


    // $ANTLR start "entryRuleIngredient"
    // InternalRecipeDSL.g:198:1: entryRuleIngredient returns [EObject current=null] : iv_ruleIngredient= ruleIngredient EOF ;
    public final EObject entryRuleIngredient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIngredient = null;


        try {
            // InternalRecipeDSL.g:198:51: (iv_ruleIngredient= ruleIngredient EOF )
            // InternalRecipeDSL.g:199:2: iv_ruleIngredient= ruleIngredient EOF
            {
             newCompositeNode(grammarAccess.getIngredientRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIngredient=ruleIngredient();

            state._fsp--;

             current =iv_ruleIngredient; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIngredient"


    // $ANTLR start "ruleIngredient"
    // InternalRecipeDSL.g:205:1: ruleIngredient returns [EObject current=null] : (otherlv_0= 'Ingredient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'amount' ( (lv_measure_3_0= ruleMeasure ) ) ) ;
    public final EObject ruleIngredient() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_measure_3_0 = null;



        	enterRule();

        try {
            // InternalRecipeDSL.g:211:2: ( (otherlv_0= 'Ingredient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'amount' ( (lv_measure_3_0= ruleMeasure ) ) ) )
            // InternalRecipeDSL.g:212:2: (otherlv_0= 'Ingredient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'amount' ( (lv_measure_3_0= ruleMeasure ) ) )
            {
            // InternalRecipeDSL.g:212:2: (otherlv_0= 'Ingredient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'amount' ( (lv_measure_3_0= ruleMeasure ) ) )
            // InternalRecipeDSL.g:213:3: otherlv_0= 'Ingredient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'amount' ( (lv_measure_3_0= ruleMeasure ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getIngredientAccess().getIngredientKeyword_0());
            		
            // InternalRecipeDSL.g:217:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRecipeDSL.g:218:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRecipeDSL.g:218:4: (lv_name_1_0= RULE_ID )
            // InternalRecipeDSL.g:219:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getIngredientAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIngredientRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getIngredientAccess().getAmountKeyword_2());
            		
            // InternalRecipeDSL.g:239:3: ( (lv_measure_3_0= ruleMeasure ) )
            // InternalRecipeDSL.g:240:4: (lv_measure_3_0= ruleMeasure )
            {
            // InternalRecipeDSL.g:240:4: (lv_measure_3_0= ruleMeasure )
            // InternalRecipeDSL.g:241:5: lv_measure_3_0= ruleMeasure
            {

            					newCompositeNode(grammarAccess.getIngredientAccess().getMeasureMeasureParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_measure_3_0=ruleMeasure();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIngredientRule());
            					}
            					set(
            						current,
            						"measure",
            						lv_measure_3_0,
            						"org.xtext.example.mydsl.RecipeDSL.Measure");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIngredient"


    // $ANTLR start "entryRuleMeasure"
    // InternalRecipeDSL.g:262:1: entryRuleMeasure returns [EObject current=null] : iv_ruleMeasure= ruleMeasure EOF ;
    public final EObject entryRuleMeasure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasure = null;


        try {
            // InternalRecipeDSL.g:262:48: (iv_ruleMeasure= ruleMeasure EOF )
            // InternalRecipeDSL.g:263:2: iv_ruleMeasure= ruleMeasure EOF
            {
             newCompositeNode(grammarAccess.getMeasureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMeasure=ruleMeasure();

            state._fsp--;

             current =iv_ruleMeasure; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMeasure"


    // $ANTLR start "ruleMeasure"
    // InternalRecipeDSL.g:269:1: ruleMeasure returns [EObject current=null] : (this_Weight_0= ruleWeight | this_Count_1= ruleCount ) ;
    public final EObject ruleMeasure() throws RecognitionException {
        EObject current = null;

        EObject this_Weight_0 = null;

        EObject this_Count_1 = null;



        	enterRule();

        try {
            // InternalRecipeDSL.g:275:2: ( (this_Weight_0= ruleWeight | this_Count_1= ruleCount ) )
            // InternalRecipeDSL.g:276:2: (this_Weight_0= ruleWeight | this_Count_1= ruleCount )
            {
            // InternalRecipeDSL.g:276:2: (this_Weight_0= ruleWeight | this_Count_1= ruleCount )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            else if ( (LA5_0==15) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalRecipeDSL.g:277:3: this_Weight_0= ruleWeight
                    {

                    			newCompositeNode(grammarAccess.getMeasureAccess().getWeightParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Weight_0=ruleWeight();

                    state._fsp--;


                    			current = this_Weight_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRecipeDSL.g:286:3: this_Count_1= ruleCount
                    {

                    			newCompositeNode(grammarAccess.getMeasureAccess().getCountParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Count_1=ruleCount();

                    state._fsp--;


                    			current = this_Count_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMeasure"


    // $ANTLR start "entryRuleWeight"
    // InternalRecipeDSL.g:298:1: entryRuleWeight returns [EObject current=null] : iv_ruleWeight= ruleWeight EOF ;
    public final EObject entryRuleWeight() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWeight = null;


        try {
            // InternalRecipeDSL.g:298:47: (iv_ruleWeight= ruleWeight EOF )
            // InternalRecipeDSL.g:299:2: iv_ruleWeight= ruleWeight EOF
            {
             newCompositeNode(grammarAccess.getWeightRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWeight=ruleWeight();

            state._fsp--;

             current =iv_ruleWeight; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWeight"


    // $ANTLR start "ruleWeight"
    // InternalRecipeDSL.g:305:1: ruleWeight returns [EObject current=null] : (otherlv_0= 'Weight' ( (lv_gramms_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleWeight() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_gramms_1_0=null;


        	enterRule();

        try {
            // InternalRecipeDSL.g:311:2: ( (otherlv_0= 'Weight' ( (lv_gramms_1_0= RULE_STRING ) ) ) )
            // InternalRecipeDSL.g:312:2: (otherlv_0= 'Weight' ( (lv_gramms_1_0= RULE_STRING ) ) )
            {
            // InternalRecipeDSL.g:312:2: (otherlv_0= 'Weight' ( (lv_gramms_1_0= RULE_STRING ) ) )
            // InternalRecipeDSL.g:313:3: otherlv_0= 'Weight' ( (lv_gramms_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getWeightAccess().getWeightKeyword_0());
            		
            // InternalRecipeDSL.g:317:3: ( (lv_gramms_1_0= RULE_STRING ) )
            // InternalRecipeDSL.g:318:4: (lv_gramms_1_0= RULE_STRING )
            {
            // InternalRecipeDSL.g:318:4: (lv_gramms_1_0= RULE_STRING )
            // InternalRecipeDSL.g:319:5: lv_gramms_1_0= RULE_STRING
            {
            lv_gramms_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_gramms_1_0, grammarAccess.getWeightAccess().getGrammsSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWeightRule());
            					}
            					setWithLastConsumed(
            						current,
            						"gramms",
            						lv_gramms_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWeight"


    // $ANTLR start "entryRuleCount"
    // InternalRecipeDSL.g:339:1: entryRuleCount returns [EObject current=null] : iv_ruleCount= ruleCount EOF ;
    public final EObject entryRuleCount() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCount = null;


        try {
            // InternalRecipeDSL.g:339:46: (iv_ruleCount= ruleCount EOF )
            // InternalRecipeDSL.g:340:2: iv_ruleCount= ruleCount EOF
            {
             newCompositeNode(grammarAccess.getCountRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCount=ruleCount();

            state._fsp--;

             current =iv_ruleCount; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCount"


    // $ANTLR start "ruleCount"
    // InternalRecipeDSL.g:346:1: ruleCount returns [EObject current=null] : (otherlv_0= 'Count' ( (lv_count_1_0= RULE_INT ) ) ) ;
    public final EObject ruleCount() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_count_1_0=null;


        	enterRule();

        try {
            // InternalRecipeDSL.g:352:2: ( (otherlv_0= 'Count' ( (lv_count_1_0= RULE_INT ) ) ) )
            // InternalRecipeDSL.g:353:2: (otherlv_0= 'Count' ( (lv_count_1_0= RULE_INT ) ) )
            {
            // InternalRecipeDSL.g:353:2: (otherlv_0= 'Count' ( (lv_count_1_0= RULE_INT ) ) )
            // InternalRecipeDSL.g:354:3: otherlv_0= 'Count' ( (lv_count_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getCountAccess().getCountKeyword_0());
            		
            // InternalRecipeDSL.g:358:3: ( (lv_count_1_0= RULE_INT ) )
            // InternalRecipeDSL.g:359:4: (lv_count_1_0= RULE_INT )
            {
            // InternalRecipeDSL.g:359:4: (lv_count_1_0= RULE_INT )
            // InternalRecipeDSL.g:360:5: lv_count_1_0= RULE_INT
            {
            lv_count_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_count_1_0, grammarAccess.getCountAccess().getCountINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCountRule());
            					}
            					setWithLastConsumed(
            						current,
            						"count",
            						lv_count_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCount"


    // $ANTLR start "entryRuleDevice"
    // InternalRecipeDSL.g:380:1: entryRuleDevice returns [EObject current=null] : iv_ruleDevice= ruleDevice EOF ;
    public final EObject entryRuleDevice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDevice = null;


        try {
            // InternalRecipeDSL.g:380:47: (iv_ruleDevice= ruleDevice EOF )
            // InternalRecipeDSL.g:381:2: iv_ruleDevice= ruleDevice EOF
            {
             newCompositeNode(grammarAccess.getDeviceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDevice=ruleDevice();

            state._fsp--;

             current =iv_ruleDevice; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDevice"


    // $ANTLR start "ruleDevice"
    // InternalRecipeDSL.g:387:1: ruleDevice returns [EObject current=null] : (otherlv_0= 'Device' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDevice() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalRecipeDSL.g:393:2: ( (otherlv_0= 'Device' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalRecipeDSL.g:394:2: (otherlv_0= 'Device' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalRecipeDSL.g:394:2: (otherlv_0= 'Device' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalRecipeDSL.g:395:3: otherlv_0= 'Device' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDeviceAccess().getDeviceKeyword_0());
            		
            // InternalRecipeDSL.g:399:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRecipeDSL.g:400:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRecipeDSL.g:400:4: (lv_name_1_0= RULE_ID )
            // InternalRecipeDSL.g:401:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDeviceAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeviceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDevice"


    // $ANTLR start "entryRuleCooking"
    // InternalRecipeDSL.g:421:1: entryRuleCooking returns [EObject current=null] : iv_ruleCooking= ruleCooking EOF ;
    public final EObject entryRuleCooking() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCooking = null;


        try {
            // InternalRecipeDSL.g:421:48: (iv_ruleCooking= ruleCooking EOF )
            // InternalRecipeDSL.g:422:2: iv_ruleCooking= ruleCooking EOF
            {
             newCompositeNode(grammarAccess.getCookingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCooking=ruleCooking();

            state._fsp--;

             current =iv_ruleCooking; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCooking"


    // $ANTLR start "ruleCooking"
    // InternalRecipeDSL.g:428:1: ruleCooking returns [EObject current=null] : (otherlv_0= 'Cooking' ( (lv_order_1_0= RULE_ID ) ) ( ( (lv_time_2_0= ruleTime ) ) ( (lv_step_3_0= ruleStep ) ) )* ) ;
    public final EObject ruleCooking() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_order_1_0=null;
        EObject lv_time_2_0 = null;

        EObject lv_step_3_0 = null;



        	enterRule();

        try {
            // InternalRecipeDSL.g:434:2: ( (otherlv_0= 'Cooking' ( (lv_order_1_0= RULE_ID ) ) ( ( (lv_time_2_0= ruleTime ) ) ( (lv_step_3_0= ruleStep ) ) )* ) )
            // InternalRecipeDSL.g:435:2: (otherlv_0= 'Cooking' ( (lv_order_1_0= RULE_ID ) ) ( ( (lv_time_2_0= ruleTime ) ) ( (lv_step_3_0= ruleStep ) ) )* )
            {
            // InternalRecipeDSL.g:435:2: (otherlv_0= 'Cooking' ( (lv_order_1_0= RULE_ID ) ) ( ( (lv_time_2_0= ruleTime ) ) ( (lv_step_3_0= ruleStep ) ) )* )
            // InternalRecipeDSL.g:436:3: otherlv_0= 'Cooking' ( (lv_order_1_0= RULE_ID ) ) ( ( (lv_time_2_0= ruleTime ) ) ( (lv_step_3_0= ruleStep ) ) )*
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCookingAccess().getCookingKeyword_0());
            		
            // InternalRecipeDSL.g:440:3: ( (lv_order_1_0= RULE_ID ) )
            // InternalRecipeDSL.g:441:4: (lv_order_1_0= RULE_ID )
            {
            // InternalRecipeDSL.g:441:4: (lv_order_1_0= RULE_ID )
            // InternalRecipeDSL.g:442:5: lv_order_1_0= RULE_ID
            {
            lv_order_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_order_1_0, grammarAccess.getCookingAccess().getOrderIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCookingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"order",
            						lv_order_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalRecipeDSL.g:458:3: ( ( (lv_time_2_0= ruleTime ) ) ( (lv_step_3_0= ruleStep ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalRecipeDSL.g:459:4: ( (lv_time_2_0= ruleTime ) ) ( (lv_step_3_0= ruleStep ) )
            	    {
            	    // InternalRecipeDSL.g:459:4: ( (lv_time_2_0= ruleTime ) )
            	    // InternalRecipeDSL.g:460:5: (lv_time_2_0= ruleTime )
            	    {
            	    // InternalRecipeDSL.g:460:5: (lv_time_2_0= ruleTime )
            	    // InternalRecipeDSL.g:461:6: lv_time_2_0= ruleTime
            	    {

            	    						newCompositeNode(grammarAccess.getCookingAccess().getTimeTimeParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_time_2_0=ruleTime();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCookingRule());
            	    						}
            	    						set(
            	    							current,
            	    							"time",
            	    							lv_time_2_0,
            	    							"org.xtext.example.mydsl.RecipeDSL.Time");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalRecipeDSL.g:478:4: ( (lv_step_3_0= ruleStep ) )
            	    // InternalRecipeDSL.g:479:5: (lv_step_3_0= ruleStep )
            	    {
            	    // InternalRecipeDSL.g:479:5: (lv_step_3_0= ruleStep )
            	    // InternalRecipeDSL.g:480:6: lv_step_3_0= ruleStep
            	    {

            	    						newCompositeNode(grammarAccess.getCookingAccess().getStepStepParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    lv_step_3_0=ruleStep();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCookingRule());
            	    						}
            	    						add(
            	    							current,
            	    							"step",
            	    							lv_step_3_0,
            	    							"org.xtext.example.mydsl.RecipeDSL.Step");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCooking"


    // $ANTLR start "entryRuleTime"
    // InternalRecipeDSL.g:502:1: entryRuleTime returns [EObject current=null] : iv_ruleTime= ruleTime EOF ;
    public final EObject entryRuleTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTime = null;


        try {
            // InternalRecipeDSL.g:502:45: (iv_ruleTime= ruleTime EOF )
            // InternalRecipeDSL.g:503:2: iv_ruleTime= ruleTime EOF
            {
             newCompositeNode(grammarAccess.getTimeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTime=ruleTime();

            state._fsp--;

             current =iv_ruleTime; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTime"


    // $ANTLR start "ruleTime"
    // InternalRecipeDSL.g:509:1: ruleTime returns [EObject current=null] : (otherlv_0= 'For' ( (lv_time_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleTime() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_time_1_0=null;


        	enterRule();

        try {
            // InternalRecipeDSL.g:515:2: ( (otherlv_0= 'For' ( (lv_time_1_0= RULE_STRING ) ) ) )
            // InternalRecipeDSL.g:516:2: (otherlv_0= 'For' ( (lv_time_1_0= RULE_STRING ) ) )
            {
            // InternalRecipeDSL.g:516:2: (otherlv_0= 'For' ( (lv_time_1_0= RULE_STRING ) ) )
            // InternalRecipeDSL.g:517:3: otherlv_0= 'For' ( (lv_time_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getTimeAccess().getForKeyword_0());
            		
            // InternalRecipeDSL.g:521:3: ( (lv_time_1_0= RULE_STRING ) )
            // InternalRecipeDSL.g:522:4: (lv_time_1_0= RULE_STRING )
            {
            // InternalRecipeDSL.g:522:4: (lv_time_1_0= RULE_STRING )
            // InternalRecipeDSL.g:523:5: lv_time_1_0= RULE_STRING
            {
            lv_time_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_time_1_0, grammarAccess.getTimeAccess().getTimeSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTimeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"time",
            						lv_time_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTime"


    // $ANTLR start "entryRuleStep"
    // InternalRecipeDSL.g:543:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
            // InternalRecipeDSL.g:543:45: (iv_ruleStep= ruleStep EOF )
            // InternalRecipeDSL.g:544:2: iv_ruleStep= ruleStep EOF
            {
             newCompositeNode(grammarAccess.getStepRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStep=ruleStep();

            state._fsp--;

             current =iv_ruleStep; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStep"


    // $ANTLR start "ruleStep"
    // InternalRecipeDSL.g:550:1: ruleStep returns [EObject current=null] : (otherlv_0= 'Use' ( (lv_d_1_0= ruleDevice ) ) otherlv_2= 'with' ( (lv_i_3_0= ruleIngredient ) ) ) ;
    public final EObject ruleStep() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_d_1_0 = null;

        EObject lv_i_3_0 = null;



        	enterRule();

        try {
            // InternalRecipeDSL.g:556:2: ( (otherlv_0= 'Use' ( (lv_d_1_0= ruleDevice ) ) otherlv_2= 'with' ( (lv_i_3_0= ruleIngredient ) ) ) )
            // InternalRecipeDSL.g:557:2: (otherlv_0= 'Use' ( (lv_d_1_0= ruleDevice ) ) otherlv_2= 'with' ( (lv_i_3_0= ruleIngredient ) ) )
            {
            // InternalRecipeDSL.g:557:2: (otherlv_0= 'Use' ( (lv_d_1_0= ruleDevice ) ) otherlv_2= 'with' ( (lv_i_3_0= ruleIngredient ) ) )
            // InternalRecipeDSL.g:558:3: otherlv_0= 'Use' ( (lv_d_1_0= ruleDevice ) ) otherlv_2= 'with' ( (lv_i_3_0= ruleIngredient ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getStepAccess().getUseKeyword_0());
            		
            // InternalRecipeDSL.g:562:3: ( (lv_d_1_0= ruleDevice ) )
            // InternalRecipeDSL.g:563:4: (lv_d_1_0= ruleDevice )
            {
            // InternalRecipeDSL.g:563:4: (lv_d_1_0= ruleDevice )
            // InternalRecipeDSL.g:564:5: lv_d_1_0= ruleDevice
            {

            					newCompositeNode(grammarAccess.getStepAccess().getDDeviceParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_16);
            lv_d_1_0=ruleDevice();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStepRule());
            					}
            					set(
            						current,
            						"d",
            						lv_d_1_0,
            						"org.xtext.example.mydsl.RecipeDSL.Device");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getStepAccess().getWithKeyword_2());
            		
            // InternalRecipeDSL.g:585:3: ( (lv_i_3_0= ruleIngredient ) )
            // InternalRecipeDSL.g:586:4: (lv_i_3_0= ruleIngredient )
            {
            // InternalRecipeDSL.g:586:4: (lv_i_3_0= ruleIngredient )
            // InternalRecipeDSL.g:587:5: lv_i_3_0= ruleIngredient
            {

            					newCompositeNode(grammarAccess.getStepAccess().getIIngredientParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_i_3_0=ruleIngredient();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStepRule());
            					}
            					set(
            						current,
            						"i",
            						lv_i_3_0,
            						"org.xtext.example.mydsl.RecipeDSL.Ingredient");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStep"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});

}