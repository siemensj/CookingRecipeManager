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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_EFLOAT", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Recipebook'", "'from'", "','", "'Recipe'", "'Level'", "'*'", "'**'", "'***'", "'****'", "'*****'", "'Ingredient'", "'amount'", "'mg'", "'g'", "'kg'", "'t'", "'pieces'", "'Device'", "'Step'", "':'", "'For'", "'sec'", "'min'", "'h'", "'d'", "'Use'", "'with'"
    };
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_EFLOAT=5;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

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
    // InternalRecipeDSL.g:71:1: ruleModel returns [EObject current=null] : ( (lv_mgr_0_0= ruleManager ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_mgr_0_0 = null;



        	enterRule();

        try {
            // InternalRecipeDSL.g:77:2: ( ( (lv_mgr_0_0= ruleManager ) ) )
            // InternalRecipeDSL.g:78:2: ( (lv_mgr_0_0= ruleManager ) )
            {
            // InternalRecipeDSL.g:78:2: ( (lv_mgr_0_0= ruleManager ) )
            // InternalRecipeDSL.g:79:3: (lv_mgr_0_0= ruleManager )
            {
            // InternalRecipeDSL.g:79:3: (lv_mgr_0_0= ruleManager )
            // InternalRecipeDSL.g:80:4: lv_mgr_0_0= ruleManager
            {

            				newCompositeNode(grammarAccess.getModelAccess().getMgrManagerParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_mgr_0_0=ruleManager();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getModelRule());
            				}
            				set(
            					current,
            					"mgr",
            					lv_mgr_0_0,
            					"org.xtext.example.mydsl.RecipeDSL.Manager");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleManager"
    // InternalRecipeDSL.g:100:1: entryRuleManager returns [EObject current=null] : iv_ruleManager= ruleManager EOF ;
    public final EObject entryRuleManager() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleManager = null;


        try {
            // InternalRecipeDSL.g:100:48: (iv_ruleManager= ruleManager EOF )
            // InternalRecipeDSL.g:101:2: iv_ruleManager= ruleManager EOF
            {
             newCompositeNode(grammarAccess.getManagerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleManager=ruleManager();

            state._fsp--;

             current =iv_ruleManager; 
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
    // $ANTLR end "entryRuleManager"


    // $ANTLR start "ruleManager"
    // InternalRecipeDSL.g:107:1: ruleManager returns [EObject current=null] : (otherlv_0= 'Recipebook' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (lv_user_3_0= ruleUser ) ) (otherlv_4= ',' ( (lv_user_5_0= ruleUser ) ) )* ( (lv_recipes_6_0= ruleRecipe ) )* ) ;
    public final EObject ruleManager() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_user_3_0 = null;

        EObject lv_user_5_0 = null;

        EObject lv_recipes_6_0 = null;



        	enterRule();

        try {
            // InternalRecipeDSL.g:113:2: ( (otherlv_0= 'Recipebook' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (lv_user_3_0= ruleUser ) ) (otherlv_4= ',' ( (lv_user_5_0= ruleUser ) ) )* ( (lv_recipes_6_0= ruleRecipe ) )* ) )
            // InternalRecipeDSL.g:114:2: (otherlv_0= 'Recipebook' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (lv_user_3_0= ruleUser ) ) (otherlv_4= ',' ( (lv_user_5_0= ruleUser ) ) )* ( (lv_recipes_6_0= ruleRecipe ) )* )
            {
            // InternalRecipeDSL.g:114:2: (otherlv_0= 'Recipebook' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (lv_user_3_0= ruleUser ) ) (otherlv_4= ',' ( (lv_user_5_0= ruleUser ) ) )* ( (lv_recipes_6_0= ruleRecipe ) )* )
            // InternalRecipeDSL.g:115:3: otherlv_0= 'Recipebook' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (lv_user_3_0= ruleUser ) ) (otherlv_4= ',' ( (lv_user_5_0= ruleUser ) ) )* ( (lv_recipes_6_0= ruleRecipe ) )*
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getManagerAccess().getRecipebookKeyword_0());
            		
            // InternalRecipeDSL.g:119:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRecipeDSL.g:120:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRecipeDSL.g:120:4: (lv_name_1_0= RULE_ID )
            // InternalRecipeDSL.g:121:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getManagerAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getManagerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getManagerAccess().getFromKeyword_2());
            		
            // InternalRecipeDSL.g:141:3: ( (lv_user_3_0= ruleUser ) )
            // InternalRecipeDSL.g:142:4: (lv_user_3_0= ruleUser )
            {
            // InternalRecipeDSL.g:142:4: (lv_user_3_0= ruleUser )
            // InternalRecipeDSL.g:143:5: lv_user_3_0= ruleUser
            {

            					newCompositeNode(grammarAccess.getManagerAccess().getUserUserParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_user_3_0=ruleUser();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getManagerRule());
            					}
            					add(
            						current,
            						"user",
            						lv_user_3_0,
            						"org.xtext.example.mydsl.RecipeDSL.User");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRecipeDSL.g:160:3: (otherlv_4= ',' ( (lv_user_5_0= ruleUser ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRecipeDSL.g:161:4: otherlv_4= ',' ( (lv_user_5_0= ruleUser ) )
            	    {
            	    otherlv_4=(Token)match(input,14,FOLLOW_3); 

            	    				newLeafNode(otherlv_4, grammarAccess.getManagerAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalRecipeDSL.g:165:4: ( (lv_user_5_0= ruleUser ) )
            	    // InternalRecipeDSL.g:166:5: (lv_user_5_0= ruleUser )
            	    {
            	    // InternalRecipeDSL.g:166:5: (lv_user_5_0= ruleUser )
            	    // InternalRecipeDSL.g:167:6: lv_user_5_0= ruleUser
            	    {

            	    						newCompositeNode(grammarAccess.getManagerAccess().getUserUserParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_user_5_0=ruleUser();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getManagerRule());
            	    						}
            	    						add(
            	    							current,
            	    							"user",
            	    							lv_user_5_0,
            	    							"org.xtext.example.mydsl.RecipeDSL.User");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalRecipeDSL.g:185:3: ( (lv_recipes_6_0= ruleRecipe ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalRecipeDSL.g:186:4: (lv_recipes_6_0= ruleRecipe )
            	    {
            	    // InternalRecipeDSL.g:186:4: (lv_recipes_6_0= ruleRecipe )
            	    // InternalRecipeDSL.g:187:5: lv_recipes_6_0= ruleRecipe
            	    {

            	    					newCompositeNode(grammarAccess.getManagerAccess().getRecipesRecipeParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_recipes_6_0=ruleRecipe();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getManagerRule());
            	    					}
            	    					add(
            	    						current,
            	    						"recipes",
            	    						lv_recipes_6_0,
            	    						"org.xtext.example.mydsl.RecipeDSL.Recipe");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "ruleManager"


    // $ANTLR start "entryRuleUser"
    // InternalRecipeDSL.g:208:1: entryRuleUser returns [EObject current=null] : iv_ruleUser= ruleUser EOF ;
    public final EObject entryRuleUser() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUser = null;


        try {
            // InternalRecipeDSL.g:208:45: (iv_ruleUser= ruleUser EOF )
            // InternalRecipeDSL.g:209:2: iv_ruleUser= ruleUser EOF
            {
             newCompositeNode(grammarAccess.getUserRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUser=ruleUser();

            state._fsp--;

             current =iv_ruleUser; 
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
    // $ANTLR end "entryRuleUser"


    // $ANTLR start "ruleUser"
    // InternalRecipeDSL.g:215:1: ruleUser returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleUser() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalRecipeDSL.g:221:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalRecipeDSL.g:222:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalRecipeDSL.g:222:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalRecipeDSL.g:223:3: (lv_name_0_0= RULE_ID )
            {
            // InternalRecipeDSL.g:223:3: (lv_name_0_0= RULE_ID )
            // InternalRecipeDSL.g:224:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getUserAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getUserRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleUser"


    // $ANTLR start "entryRuleRecipe"
    // InternalRecipeDSL.g:243:1: entryRuleRecipe returns [EObject current=null] : iv_ruleRecipe= ruleRecipe EOF ;
    public final EObject entryRuleRecipe() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecipe = null;


        try {
            // InternalRecipeDSL.g:243:47: (iv_ruleRecipe= ruleRecipe EOF )
            // InternalRecipeDSL.g:244:2: iv_ruleRecipe= ruleRecipe EOF
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
    // InternalRecipeDSL.g:250:1: ruleRecipe returns [EObject current=null] : (otherlv_0= 'Recipe' ( (lv_name_1_0= RULE_ID ) ) ( (lv_level_2_0= ruleLevel ) ) ( (lv_ingredient_3_0= ruleIngredient ) )+ ( (lv_device_4_0= ruleDevice ) )+ ( (lv_cooking_5_0= ruleCooking ) )+ ) ;
    public final EObject ruleRecipe() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_level_2_0 = null;

        EObject lv_ingredient_3_0 = null;

        EObject lv_device_4_0 = null;

        EObject lv_cooking_5_0 = null;



        	enterRule();

        try {
            // InternalRecipeDSL.g:256:2: ( (otherlv_0= 'Recipe' ( (lv_name_1_0= RULE_ID ) ) ( (lv_level_2_0= ruleLevel ) ) ( (lv_ingredient_3_0= ruleIngredient ) )+ ( (lv_device_4_0= ruleDevice ) )+ ( (lv_cooking_5_0= ruleCooking ) )+ ) )
            // InternalRecipeDSL.g:257:2: (otherlv_0= 'Recipe' ( (lv_name_1_0= RULE_ID ) ) ( (lv_level_2_0= ruleLevel ) ) ( (lv_ingredient_3_0= ruleIngredient ) )+ ( (lv_device_4_0= ruleDevice ) )+ ( (lv_cooking_5_0= ruleCooking ) )+ )
            {
            // InternalRecipeDSL.g:257:2: (otherlv_0= 'Recipe' ( (lv_name_1_0= RULE_ID ) ) ( (lv_level_2_0= ruleLevel ) ) ( (lv_ingredient_3_0= ruleIngredient ) )+ ( (lv_device_4_0= ruleDevice ) )+ ( (lv_cooking_5_0= ruleCooking ) )+ )
            // InternalRecipeDSL.g:258:3: otherlv_0= 'Recipe' ( (lv_name_1_0= RULE_ID ) ) ( (lv_level_2_0= ruleLevel ) ) ( (lv_ingredient_3_0= ruleIngredient ) )+ ( (lv_device_4_0= ruleDevice ) )+ ( (lv_cooking_5_0= ruleCooking ) )+
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRecipeAccess().getRecipeKeyword_0());
            		
            // InternalRecipeDSL.g:262:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRecipeDSL.g:263:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRecipeDSL.g:263:4: (lv_name_1_0= RULE_ID )
            // InternalRecipeDSL.g:264:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

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

            // InternalRecipeDSL.g:280:3: ( (lv_level_2_0= ruleLevel ) )
            // InternalRecipeDSL.g:281:4: (lv_level_2_0= ruleLevel )
            {
            // InternalRecipeDSL.g:281:4: (lv_level_2_0= ruleLevel )
            // InternalRecipeDSL.g:282:5: lv_level_2_0= ruleLevel
            {

            					newCompositeNode(grammarAccess.getRecipeAccess().getLevelLevelParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_level_2_0=ruleLevel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRecipeRule());
            					}
            					add(
            						current,
            						"level",
            						lv_level_2_0,
            						"org.xtext.example.mydsl.RecipeDSL.Level");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRecipeDSL.g:299:3: ( (lv_ingredient_3_0= ruleIngredient ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==22) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalRecipeDSL.g:300:4: (lv_ingredient_3_0= ruleIngredient )
            	    {
            	    // InternalRecipeDSL.g:300:4: (lv_ingredient_3_0= ruleIngredient )
            	    // InternalRecipeDSL.g:301:5: lv_ingredient_3_0= ruleIngredient
            	    {

            	    					newCompositeNode(grammarAccess.getRecipeAccess().getIngredientIngredientParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_ingredient_3_0=ruleIngredient();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRecipeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ingredient",
            	    						lv_ingredient_3_0,
            	    						"org.xtext.example.mydsl.RecipeDSL.Ingredient");
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

            // InternalRecipeDSL.g:318:3: ( (lv_device_4_0= ruleDevice ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==29) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalRecipeDSL.g:319:4: (lv_device_4_0= ruleDevice )
            	    {
            	    // InternalRecipeDSL.g:319:4: (lv_device_4_0= ruleDevice )
            	    // InternalRecipeDSL.g:320:5: lv_device_4_0= ruleDevice
            	    {

            	    					newCompositeNode(grammarAccess.getRecipeAccess().getDeviceDeviceParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_device_4_0=ruleDevice();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRecipeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"device",
            	    						lv_device_4_0,
            	    						"org.xtext.example.mydsl.RecipeDSL.Device");
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

            // InternalRecipeDSL.g:337:3: ( (lv_cooking_5_0= ruleCooking ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==30) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalRecipeDSL.g:338:4: (lv_cooking_5_0= ruleCooking )
            	    {
            	    // InternalRecipeDSL.g:338:4: (lv_cooking_5_0= ruleCooking )
            	    // InternalRecipeDSL.g:339:5: lv_cooking_5_0= ruleCooking
            	    {

            	    					newCompositeNode(grammarAccess.getRecipeAccess().getCookingCookingParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_cooking_5_0=ruleCooking();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRecipeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"cooking",
            	    						lv_cooking_5_0,
            	    						"org.xtext.example.mydsl.RecipeDSL.Cooking");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
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


    // $ANTLR start "entryRuleLevel"
    // InternalRecipeDSL.g:360:1: entryRuleLevel returns [EObject current=null] : iv_ruleLevel= ruleLevel EOF ;
    public final EObject entryRuleLevel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLevel = null;


        try {
            // InternalRecipeDSL.g:360:46: (iv_ruleLevel= ruleLevel EOF )
            // InternalRecipeDSL.g:361:2: iv_ruleLevel= ruleLevel EOF
            {
             newCompositeNode(grammarAccess.getLevelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLevel=ruleLevel();

            state._fsp--;

             current =iv_ruleLevel; 
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
    // $ANTLR end "entryRuleLevel"


    // $ANTLR start "ruleLevel"
    // InternalRecipeDSL.g:367:1: ruleLevel returns [EObject current=null] : (otherlv_0= 'Level' ( ( (lv_rating_1_1= '*' | lv_rating_1_2= '**' | lv_rating_1_3= '***' | lv_rating_1_4= '****' | lv_rating_1_5= '*****' ) ) ) ) ;
    public final EObject ruleLevel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_rating_1_1=null;
        Token lv_rating_1_2=null;
        Token lv_rating_1_3=null;
        Token lv_rating_1_4=null;
        Token lv_rating_1_5=null;


        	enterRule();

        try {
            // InternalRecipeDSL.g:373:2: ( (otherlv_0= 'Level' ( ( (lv_rating_1_1= '*' | lv_rating_1_2= '**' | lv_rating_1_3= '***' | lv_rating_1_4= '****' | lv_rating_1_5= '*****' ) ) ) ) )
            // InternalRecipeDSL.g:374:2: (otherlv_0= 'Level' ( ( (lv_rating_1_1= '*' | lv_rating_1_2= '**' | lv_rating_1_3= '***' | lv_rating_1_4= '****' | lv_rating_1_5= '*****' ) ) ) )
            {
            // InternalRecipeDSL.g:374:2: (otherlv_0= 'Level' ( ( (lv_rating_1_1= '*' | lv_rating_1_2= '**' | lv_rating_1_3= '***' | lv_rating_1_4= '****' | lv_rating_1_5= '*****' ) ) ) )
            // InternalRecipeDSL.g:375:3: otherlv_0= 'Level' ( ( (lv_rating_1_1= '*' | lv_rating_1_2= '**' | lv_rating_1_3= '***' | lv_rating_1_4= '****' | lv_rating_1_5= '*****' ) ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getLevelAccess().getLevelKeyword_0());
            		
            // InternalRecipeDSL.g:379:3: ( ( (lv_rating_1_1= '*' | lv_rating_1_2= '**' | lv_rating_1_3= '***' | lv_rating_1_4= '****' | lv_rating_1_5= '*****' ) ) )
            // InternalRecipeDSL.g:380:4: ( (lv_rating_1_1= '*' | lv_rating_1_2= '**' | lv_rating_1_3= '***' | lv_rating_1_4= '****' | lv_rating_1_5= '*****' ) )
            {
            // InternalRecipeDSL.g:380:4: ( (lv_rating_1_1= '*' | lv_rating_1_2= '**' | lv_rating_1_3= '***' | lv_rating_1_4= '****' | lv_rating_1_5= '*****' ) )
            // InternalRecipeDSL.g:381:5: (lv_rating_1_1= '*' | lv_rating_1_2= '**' | lv_rating_1_3= '***' | lv_rating_1_4= '****' | lv_rating_1_5= '*****' )
            {
            // InternalRecipeDSL.g:381:5: (lv_rating_1_1= '*' | lv_rating_1_2= '**' | lv_rating_1_3= '***' | lv_rating_1_4= '****' | lv_rating_1_5= '*****' )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt6=1;
                }
                break;
            case 18:
                {
                alt6=2;
                }
                break;
            case 19:
                {
                alt6=3;
                }
                break;
            case 20:
                {
                alt6=4;
                }
                break;
            case 21:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalRecipeDSL.g:382:6: lv_rating_1_1= '*'
                    {
                    lv_rating_1_1=(Token)match(input,17,FOLLOW_2); 

                    						newLeafNode(lv_rating_1_1, grammarAccess.getLevelAccess().getRatingAsteriskKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLevelRule());
                    						}
                    						addWithLastConsumed(current, "rating", lv_rating_1_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalRecipeDSL.g:393:6: lv_rating_1_2= '**'
                    {
                    lv_rating_1_2=(Token)match(input,18,FOLLOW_2); 

                    						newLeafNode(lv_rating_1_2, grammarAccess.getLevelAccess().getRatingAsteriskAsteriskKeyword_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLevelRule());
                    						}
                    						addWithLastConsumed(current, "rating", lv_rating_1_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalRecipeDSL.g:404:6: lv_rating_1_3= '***'
                    {
                    lv_rating_1_3=(Token)match(input,19,FOLLOW_2); 

                    						newLeafNode(lv_rating_1_3, grammarAccess.getLevelAccess().getRatingAsteriskAsteriskAsteriskKeyword_1_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLevelRule());
                    						}
                    						addWithLastConsumed(current, "rating", lv_rating_1_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalRecipeDSL.g:415:6: lv_rating_1_4= '****'
                    {
                    lv_rating_1_4=(Token)match(input,20,FOLLOW_2); 

                    						newLeafNode(lv_rating_1_4, grammarAccess.getLevelAccess().getRatingAsteriskAsteriskAsteriskAsteriskKeyword_1_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLevelRule());
                    						}
                    						addWithLastConsumed(current, "rating", lv_rating_1_4, null);
                    					

                    }
                    break;
                case 5 :
                    // InternalRecipeDSL.g:426:6: lv_rating_1_5= '*****'
                    {
                    lv_rating_1_5=(Token)match(input,21,FOLLOW_2); 

                    						newLeafNode(lv_rating_1_5, grammarAccess.getLevelAccess().getRatingAsteriskAsteriskAsteriskAsteriskAsteriskKeyword_1_0_4());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLevelRule());
                    						}
                    						addWithLastConsumed(current, "rating", lv_rating_1_5, null);
                    					

                    }
                    break;

            }


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
    // $ANTLR end "ruleLevel"


    // $ANTLR start "entryRuleIngredient"
    // InternalRecipeDSL.g:443:1: entryRuleIngredient returns [EObject current=null] : iv_ruleIngredient= ruleIngredient EOF ;
    public final EObject entryRuleIngredient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIngredient = null;


        try {
            // InternalRecipeDSL.g:443:51: (iv_ruleIngredient= ruleIngredient EOF )
            // InternalRecipeDSL.g:444:2: iv_ruleIngredient= ruleIngredient EOF
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
    // InternalRecipeDSL.g:450:1: ruleIngredient returns [EObject current=null] : (otherlv_0= 'Ingredient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'amount' ( ( (lv_measure_3_1= ruleWeight | lv_measure_3_2= ruleCount ) ) ) ) ;
    public final EObject ruleIngredient() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_measure_3_1 = null;

        EObject lv_measure_3_2 = null;



        	enterRule();

        try {
            // InternalRecipeDSL.g:456:2: ( (otherlv_0= 'Ingredient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'amount' ( ( (lv_measure_3_1= ruleWeight | lv_measure_3_2= ruleCount ) ) ) ) )
            // InternalRecipeDSL.g:457:2: (otherlv_0= 'Ingredient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'amount' ( ( (lv_measure_3_1= ruleWeight | lv_measure_3_2= ruleCount ) ) ) )
            {
            // InternalRecipeDSL.g:457:2: (otherlv_0= 'Ingredient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'amount' ( ( (lv_measure_3_1= ruleWeight | lv_measure_3_2= ruleCount ) ) ) )
            // InternalRecipeDSL.g:458:3: otherlv_0= 'Ingredient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'amount' ( ( (lv_measure_3_1= ruleWeight | lv_measure_3_2= ruleCount ) ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getIngredientAccess().getIngredientKeyword_0());
            		
            // InternalRecipeDSL.g:462:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRecipeDSL.g:463:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRecipeDSL.g:463:4: (lv_name_1_0= RULE_ID )
            // InternalRecipeDSL.g:464:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

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

            otherlv_2=(Token)match(input,23,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getIngredientAccess().getAmountKeyword_2());
            		
            // InternalRecipeDSL.g:484:3: ( ( (lv_measure_3_1= ruleWeight | lv_measure_3_2= ruleCount ) ) )
            // InternalRecipeDSL.g:485:4: ( (lv_measure_3_1= ruleWeight | lv_measure_3_2= ruleCount ) )
            {
            // InternalRecipeDSL.g:485:4: ( (lv_measure_3_1= ruleWeight | lv_measure_3_2= ruleCount ) )
            // InternalRecipeDSL.g:486:5: (lv_measure_3_1= ruleWeight | lv_measure_3_2= ruleCount )
            {
            // InternalRecipeDSL.g:486:5: (lv_measure_3_1= ruleWeight | lv_measure_3_2= ruleCount )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_EFLOAT) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_INT) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalRecipeDSL.g:487:6: lv_measure_3_1= ruleWeight
                    {

                    						newCompositeNode(grammarAccess.getIngredientAccess().getMeasureWeightParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_measure_3_1=ruleWeight();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIngredientRule());
                    						}
                    						add(
                    							current,
                    							"measure",
                    							lv_measure_3_1,
                    							"org.xtext.example.mydsl.RecipeDSL.Weight");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalRecipeDSL.g:503:6: lv_measure_3_2= ruleCount
                    {

                    						newCompositeNode(grammarAccess.getIngredientAccess().getMeasureCountParserRuleCall_3_0_1());
                    					
                    pushFollow(FOLLOW_2);
                    lv_measure_3_2=ruleCount();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIngredientRule());
                    						}
                    						add(
                    							current,
                    							"measure",
                    							lv_measure_3_2,
                    							"org.xtext.example.mydsl.RecipeDSL.Count");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


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


    // $ANTLR start "entryRuleWeight"
    // InternalRecipeDSL.g:525:1: entryRuleWeight returns [EObject current=null] : iv_ruleWeight= ruleWeight EOF ;
    public final EObject entryRuleWeight() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWeight = null;


        try {
            // InternalRecipeDSL.g:525:47: (iv_ruleWeight= ruleWeight EOF )
            // InternalRecipeDSL.g:526:2: iv_ruleWeight= ruleWeight EOF
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
    // InternalRecipeDSL.g:532:1: ruleWeight returns [EObject current=null] : ( ( (lv_weight_0_0= RULE_EFLOAT ) ) (otherlv_1= 'mg' | otherlv_2= 'g' | otherlv_3= 'kg' | otherlv_4= 't' ) ) ;
    public final EObject ruleWeight() throws RecognitionException {
        EObject current = null;

        Token lv_weight_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalRecipeDSL.g:538:2: ( ( ( (lv_weight_0_0= RULE_EFLOAT ) ) (otherlv_1= 'mg' | otherlv_2= 'g' | otherlv_3= 'kg' | otherlv_4= 't' ) ) )
            // InternalRecipeDSL.g:539:2: ( ( (lv_weight_0_0= RULE_EFLOAT ) ) (otherlv_1= 'mg' | otherlv_2= 'g' | otherlv_3= 'kg' | otherlv_4= 't' ) )
            {
            // InternalRecipeDSL.g:539:2: ( ( (lv_weight_0_0= RULE_EFLOAT ) ) (otherlv_1= 'mg' | otherlv_2= 'g' | otherlv_3= 'kg' | otherlv_4= 't' ) )
            // InternalRecipeDSL.g:540:3: ( (lv_weight_0_0= RULE_EFLOAT ) ) (otherlv_1= 'mg' | otherlv_2= 'g' | otherlv_3= 'kg' | otherlv_4= 't' )
            {
            // InternalRecipeDSL.g:540:3: ( (lv_weight_0_0= RULE_EFLOAT ) )
            // InternalRecipeDSL.g:541:4: (lv_weight_0_0= RULE_EFLOAT )
            {
            // InternalRecipeDSL.g:541:4: (lv_weight_0_0= RULE_EFLOAT )
            // InternalRecipeDSL.g:542:5: lv_weight_0_0= RULE_EFLOAT
            {
            lv_weight_0_0=(Token)match(input,RULE_EFLOAT,FOLLOW_15); 

            					newLeafNode(lv_weight_0_0, grammarAccess.getWeightAccess().getWeightEFLOATTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWeightRule());
            					}
            					addWithLastConsumed(
            						current,
            						"weight",
            						lv_weight_0_0,
            						"org.xtext.example.mydsl.RecipeDSL.EFLOAT");
            				

            }


            }

            // InternalRecipeDSL.g:558:3: (otherlv_1= 'mg' | otherlv_2= 'g' | otherlv_3= 'kg' | otherlv_4= 't' )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt8=1;
                }
                break;
            case 25:
                {
                alt8=2;
                }
                break;
            case 26:
                {
                alt8=3;
                }
                break;
            case 27:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalRecipeDSL.g:559:4: otherlv_1= 'mg'
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getWeightAccess().getMgKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalRecipeDSL.g:564:4: otherlv_2= 'g'
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getWeightAccess().getGKeyword_1_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalRecipeDSL.g:569:4: otherlv_3= 'kg'
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getWeightAccess().getKgKeyword_1_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalRecipeDSL.g:574:4: otherlv_4= 't'
                    {
                    otherlv_4=(Token)match(input,27,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getWeightAccess().getTKeyword_1_3());
                    			

                    }
                    break;

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
    // InternalRecipeDSL.g:583:1: entryRuleCount returns [EObject current=null] : iv_ruleCount= ruleCount EOF ;
    public final EObject entryRuleCount() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCount = null;


        try {
            // InternalRecipeDSL.g:583:46: (iv_ruleCount= ruleCount EOF )
            // InternalRecipeDSL.g:584:2: iv_ruleCount= ruleCount EOF
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
    // InternalRecipeDSL.g:590:1: ruleCount returns [EObject current=null] : ( ( (lv_count_0_0= RULE_INT ) ) otherlv_1= 'pieces' ) ;
    public final EObject ruleCount() throws RecognitionException {
        EObject current = null;

        Token lv_count_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRecipeDSL.g:596:2: ( ( ( (lv_count_0_0= RULE_INT ) ) otherlv_1= 'pieces' ) )
            // InternalRecipeDSL.g:597:2: ( ( (lv_count_0_0= RULE_INT ) ) otherlv_1= 'pieces' )
            {
            // InternalRecipeDSL.g:597:2: ( ( (lv_count_0_0= RULE_INT ) ) otherlv_1= 'pieces' )
            // InternalRecipeDSL.g:598:3: ( (lv_count_0_0= RULE_INT ) ) otherlv_1= 'pieces'
            {
            // InternalRecipeDSL.g:598:3: ( (lv_count_0_0= RULE_INT ) )
            // InternalRecipeDSL.g:599:4: (lv_count_0_0= RULE_INT )
            {
            // InternalRecipeDSL.g:599:4: (lv_count_0_0= RULE_INT )
            // InternalRecipeDSL.g:600:5: lv_count_0_0= RULE_INT
            {
            lv_count_0_0=(Token)match(input,RULE_INT,FOLLOW_16); 

            					newLeafNode(lv_count_0_0, grammarAccess.getCountAccess().getCountINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCountRule());
            					}
            					addWithLastConsumed(
            						current,
            						"count",
            						lv_count_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getCountAccess().getPiecesKeyword_1());
            		

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
    // InternalRecipeDSL.g:624:1: entryRuleDevice returns [EObject current=null] : iv_ruleDevice= ruleDevice EOF ;
    public final EObject entryRuleDevice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDevice = null;


        try {
            // InternalRecipeDSL.g:624:47: (iv_ruleDevice= ruleDevice EOF )
            // InternalRecipeDSL.g:625:2: iv_ruleDevice= ruleDevice EOF
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
    // InternalRecipeDSL.g:631:1: ruleDevice returns [EObject current=null] : (otherlv_0= 'Device' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDevice() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalRecipeDSL.g:637:2: ( (otherlv_0= 'Device' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalRecipeDSL.g:638:2: (otherlv_0= 'Device' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalRecipeDSL.g:638:2: (otherlv_0= 'Device' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalRecipeDSL.g:639:3: otherlv_0= 'Device' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDeviceAccess().getDeviceKeyword_0());
            		
            // InternalRecipeDSL.g:643:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRecipeDSL.g:644:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRecipeDSL.g:644:4: (lv_name_1_0= RULE_ID )
            // InternalRecipeDSL.g:645:5: lv_name_1_0= RULE_ID
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
    // InternalRecipeDSL.g:665:1: entryRuleCooking returns [EObject current=null] : iv_ruleCooking= ruleCooking EOF ;
    public final EObject entryRuleCooking() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCooking = null;


        try {
            // InternalRecipeDSL.g:665:48: (iv_ruleCooking= ruleCooking EOF )
            // InternalRecipeDSL.g:666:2: iv_ruleCooking= ruleCooking EOF
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
    // InternalRecipeDSL.g:672:1: ruleCooking returns [EObject current=null] : (otherlv_0= 'Step' ( (lv_s_1_0= RULE_INT ) ) ( ( (lv_time_2_0= ruleTime ) ) otherlv_3= ':' ( (lv_step_4_0= ruleStep ) ) ) ) ;
    public final EObject ruleCooking() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_s_1_0=null;
        Token otherlv_3=null;
        EObject lv_time_2_0 = null;

        EObject lv_step_4_0 = null;



        	enterRule();

        try {
            // InternalRecipeDSL.g:678:2: ( (otherlv_0= 'Step' ( (lv_s_1_0= RULE_INT ) ) ( ( (lv_time_2_0= ruleTime ) ) otherlv_3= ':' ( (lv_step_4_0= ruleStep ) ) ) ) )
            // InternalRecipeDSL.g:679:2: (otherlv_0= 'Step' ( (lv_s_1_0= RULE_INT ) ) ( ( (lv_time_2_0= ruleTime ) ) otherlv_3= ':' ( (lv_step_4_0= ruleStep ) ) ) )
            {
            // InternalRecipeDSL.g:679:2: (otherlv_0= 'Step' ( (lv_s_1_0= RULE_INT ) ) ( ( (lv_time_2_0= ruleTime ) ) otherlv_3= ':' ( (lv_step_4_0= ruleStep ) ) ) )
            // InternalRecipeDSL.g:680:3: otherlv_0= 'Step' ( (lv_s_1_0= RULE_INT ) ) ( ( (lv_time_2_0= ruleTime ) ) otherlv_3= ':' ( (lv_step_4_0= ruleStep ) ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getCookingAccess().getStepKeyword_0());
            		
            // InternalRecipeDSL.g:684:3: ( (lv_s_1_0= RULE_INT ) )
            // InternalRecipeDSL.g:685:4: (lv_s_1_0= RULE_INT )
            {
            // InternalRecipeDSL.g:685:4: (lv_s_1_0= RULE_INT )
            // InternalRecipeDSL.g:686:5: lv_s_1_0= RULE_INT
            {
            lv_s_1_0=(Token)match(input,RULE_INT,FOLLOW_18); 

            					newLeafNode(lv_s_1_0, grammarAccess.getCookingAccess().getSINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCookingRule());
            					}
            					addWithLastConsumed(
            						current,
            						"s",
            						lv_s_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalRecipeDSL.g:702:3: ( ( (lv_time_2_0= ruleTime ) ) otherlv_3= ':' ( (lv_step_4_0= ruleStep ) ) )
            // InternalRecipeDSL.g:703:4: ( (lv_time_2_0= ruleTime ) ) otherlv_3= ':' ( (lv_step_4_0= ruleStep ) )
            {
            // InternalRecipeDSL.g:703:4: ( (lv_time_2_0= ruleTime ) )
            // InternalRecipeDSL.g:704:5: (lv_time_2_0= ruleTime )
            {
            // InternalRecipeDSL.g:704:5: (lv_time_2_0= ruleTime )
            // InternalRecipeDSL.g:705:6: lv_time_2_0= ruleTime
            {

            						newCompositeNode(grammarAccess.getCookingAccess().getTimeTimeParserRuleCall_2_0_0());
            					
            pushFollow(FOLLOW_19);
            lv_time_2_0=ruleTime();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getCookingRule());
            						}
            						add(
            							current,
            							"time",
            							lv_time_2_0,
            							"org.xtext.example.mydsl.RecipeDSL.Time");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            otherlv_3=(Token)match(input,31,FOLLOW_20); 

            				newLeafNode(otherlv_3, grammarAccess.getCookingAccess().getColonKeyword_2_1());
            			
            // InternalRecipeDSL.g:726:4: ( (lv_step_4_0= ruleStep ) )
            // InternalRecipeDSL.g:727:5: (lv_step_4_0= ruleStep )
            {
            // InternalRecipeDSL.g:727:5: (lv_step_4_0= ruleStep )
            // InternalRecipeDSL.g:728:6: lv_step_4_0= ruleStep
            {

            						newCompositeNode(grammarAccess.getCookingAccess().getStepStepParserRuleCall_2_2_0());
            					
            pushFollow(FOLLOW_2);
            lv_step_4_0=ruleStep();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getCookingRule());
            						}
            						add(
            							current,
            							"step",
            							lv_step_4_0,
            							"org.xtext.example.mydsl.RecipeDSL.Step");
            						afterParserOrEnumRuleCall();
            					

            }


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
    // $ANTLR end "ruleCooking"


    // $ANTLR start "entryRuleTime"
    // InternalRecipeDSL.g:750:1: entryRuleTime returns [EObject current=null] : iv_ruleTime= ruleTime EOF ;
    public final EObject entryRuleTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTime = null;


        try {
            // InternalRecipeDSL.g:750:45: (iv_ruleTime= ruleTime EOF )
            // InternalRecipeDSL.g:751:2: iv_ruleTime= ruleTime EOF
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
    // InternalRecipeDSL.g:757:1: ruleTime returns [EObject current=null] : (otherlv_0= 'For' ( (lv_time_1_0= RULE_INT ) ) (otherlv_2= 'sec' | otherlv_3= 'min' | otherlv_4= 'h' | otherlv_5= 'd' ) ) ;
    public final EObject ruleTime() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_time_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalRecipeDSL.g:763:2: ( (otherlv_0= 'For' ( (lv_time_1_0= RULE_INT ) ) (otherlv_2= 'sec' | otherlv_3= 'min' | otherlv_4= 'h' | otherlv_5= 'd' ) ) )
            // InternalRecipeDSL.g:764:2: (otherlv_0= 'For' ( (lv_time_1_0= RULE_INT ) ) (otherlv_2= 'sec' | otherlv_3= 'min' | otherlv_4= 'h' | otherlv_5= 'd' ) )
            {
            // InternalRecipeDSL.g:764:2: (otherlv_0= 'For' ( (lv_time_1_0= RULE_INT ) ) (otherlv_2= 'sec' | otherlv_3= 'min' | otherlv_4= 'h' | otherlv_5= 'd' ) )
            // InternalRecipeDSL.g:765:3: otherlv_0= 'For' ( (lv_time_1_0= RULE_INT ) ) (otherlv_2= 'sec' | otherlv_3= 'min' | otherlv_4= 'h' | otherlv_5= 'd' )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getTimeAccess().getForKeyword_0());
            		
            // InternalRecipeDSL.g:769:3: ( (lv_time_1_0= RULE_INT ) )
            // InternalRecipeDSL.g:770:4: (lv_time_1_0= RULE_INT )
            {
            // InternalRecipeDSL.g:770:4: (lv_time_1_0= RULE_INT )
            // InternalRecipeDSL.g:771:5: lv_time_1_0= RULE_INT
            {
            lv_time_1_0=(Token)match(input,RULE_INT,FOLLOW_21); 

            					newLeafNode(lv_time_1_0, grammarAccess.getTimeAccess().getTimeINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTimeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"time",
            						lv_time_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalRecipeDSL.g:787:3: (otherlv_2= 'sec' | otherlv_3= 'min' | otherlv_4= 'h' | otherlv_5= 'd' )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt9=1;
                }
                break;
            case 34:
                {
                alt9=2;
                }
                break;
            case 35:
                {
                alt9=3;
                }
                break;
            case 36:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalRecipeDSL.g:788:4: otherlv_2= 'sec'
                    {
                    otherlv_2=(Token)match(input,33,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getTimeAccess().getSecKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalRecipeDSL.g:793:4: otherlv_3= 'min'
                    {
                    otherlv_3=(Token)match(input,34,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getTimeAccess().getMinKeyword_2_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalRecipeDSL.g:798:4: otherlv_4= 'h'
                    {
                    otherlv_4=(Token)match(input,35,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getTimeAccess().getHKeyword_2_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalRecipeDSL.g:803:4: otherlv_5= 'd'
                    {
                    otherlv_5=(Token)match(input,36,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getTimeAccess().getDKeyword_2_3());
                    			

                    }
                    break;

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
    // InternalRecipeDSL.g:812:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
            // InternalRecipeDSL.g:812:45: (iv_ruleStep= ruleStep EOF )
            // InternalRecipeDSL.g:813:2: iv_ruleStep= ruleStep EOF
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
    // InternalRecipeDSL.g:819:1: ruleStep returns [EObject current=null] : (otherlv_0= 'Use' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= 'with' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* ) ;
    public final EObject ruleStep() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalRecipeDSL.g:825:2: ( (otherlv_0= 'Use' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= 'with' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* ) )
            // InternalRecipeDSL.g:826:2: (otherlv_0= 'Use' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= 'with' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )
            {
            // InternalRecipeDSL.g:826:2: (otherlv_0= 'Use' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= 'with' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )
            // InternalRecipeDSL.g:827:3: otherlv_0= 'Use' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= 'with' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )*
            {
            otherlv_0=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getStepAccess().getUseKeyword_0());
            		
            // InternalRecipeDSL.g:831:3: ( (otherlv_1= RULE_ID ) )
            // InternalRecipeDSL.g:832:4: (otherlv_1= RULE_ID )
            {
            // InternalRecipeDSL.g:832:4: (otherlv_1= RULE_ID )
            // InternalRecipeDSL.g:833:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStepRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_1, grammarAccess.getStepAccess().getDevDeviceCrossReference_1_0());
            				

            }


            }

            // InternalRecipeDSL.g:844:3: (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==14) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalRecipeDSL.g:845:4: otherlv_2= ',' ( (otherlv_3= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,14,FOLLOW_3); 

            	    				newLeafNode(otherlv_2, grammarAccess.getStepAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalRecipeDSL.g:849:4: ( (otherlv_3= RULE_ID ) )
            	    // InternalRecipeDSL.g:850:5: (otherlv_3= RULE_ID )
            	    {
            	    // InternalRecipeDSL.g:850:5: (otherlv_3= RULE_ID )
            	    // InternalRecipeDSL.g:851:6: otherlv_3= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getStepRule());
            	    						}
            	    					
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_22); 

            	    						newLeafNode(otherlv_3, grammarAccess.getStepAccess().getDev2DeviceCrossReference_2_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_4=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getStepAccess().getWithKeyword_3());
            		
            // InternalRecipeDSL.g:867:3: ( (otherlv_5= RULE_ID ) )
            // InternalRecipeDSL.g:868:4: (otherlv_5= RULE_ID )
            {
            // InternalRecipeDSL.g:868:4: (otherlv_5= RULE_ID )
            // InternalRecipeDSL.g:869:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStepRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_5, grammarAccess.getStepAccess().getIngIngredientCrossReference_4_0());
            				

            }


            }

            // InternalRecipeDSL.g:880:3: (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==14) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalRecipeDSL.g:881:4: otherlv_6= ',' ( (otherlv_7= RULE_ID ) )
            	    {
            	    otherlv_6=(Token)match(input,14,FOLLOW_3); 

            	    				newLeafNode(otherlv_6, grammarAccess.getStepAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalRecipeDSL.g:885:4: ( (otherlv_7= RULE_ID ) )
            	    // InternalRecipeDSL.g:886:5: (otherlv_7= RULE_ID )
            	    {
            	    // InternalRecipeDSL.g:886:5: (otherlv_7= RULE_ID )
            	    // InternalRecipeDSL.g:887:6: otherlv_7= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getStepRule());
            	    						}
            	    					
            	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_23); 

            	    						newLeafNode(otherlv_7, grammarAccess.getStepAccess().getIng2IngredientCrossReference_5_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // $ANTLR end "ruleStep"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000020400000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000003E0000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000000F000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001E00000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000004000004000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000004002L});

}