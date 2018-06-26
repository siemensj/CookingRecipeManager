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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRecipeDSLParser extends AbstractInternalContentAssistParser {
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



    // $ANTLR start "entryRuleModel"
    // InternalRecipeDSL.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalRecipeDSL.g:54:1: ( ruleModel EOF )
            // InternalRecipeDSL.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalRecipeDSL.g:62:1: ruleModel : ( ( rule__Model__RecipesAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:66:2: ( ( ( rule__Model__RecipesAssignment )* ) )
            // InternalRecipeDSL.g:67:2: ( ( rule__Model__RecipesAssignment )* )
            {
            // InternalRecipeDSL.g:67:2: ( ( rule__Model__RecipesAssignment )* )
            // InternalRecipeDSL.g:68:3: ( rule__Model__RecipesAssignment )*
            {
             before(grammarAccess.getModelAccess().getRecipesAssignment()); 
            // InternalRecipeDSL.g:69:3: ( rule__Model__RecipesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRecipeDSL.g:69:4: rule__Model__RecipesAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__RecipesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getRecipesAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleRecipe"
    // InternalRecipeDSL.g:78:1: entryRuleRecipe : ruleRecipe EOF ;
    public final void entryRuleRecipe() throws RecognitionException {
        try {
            // InternalRecipeDSL.g:79:1: ( ruleRecipe EOF )
            // InternalRecipeDSL.g:80:1: ruleRecipe EOF
            {
             before(grammarAccess.getRecipeRule()); 
            pushFollow(FOLLOW_1);
            ruleRecipe();

            state._fsp--;

             after(grammarAccess.getRecipeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRecipe"


    // $ANTLR start "ruleRecipe"
    // InternalRecipeDSL.g:87:1: ruleRecipe : ( ( rule__Recipe__Group__0 ) ) ;
    public final void ruleRecipe() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:91:2: ( ( ( rule__Recipe__Group__0 ) ) )
            // InternalRecipeDSL.g:92:2: ( ( rule__Recipe__Group__0 ) )
            {
            // InternalRecipeDSL.g:92:2: ( ( rule__Recipe__Group__0 ) )
            // InternalRecipeDSL.g:93:3: ( rule__Recipe__Group__0 )
            {
             before(grammarAccess.getRecipeAccess().getGroup()); 
            // InternalRecipeDSL.g:94:3: ( rule__Recipe__Group__0 )
            // InternalRecipeDSL.g:94:4: rule__Recipe__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Recipe__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRecipe"


    // $ANTLR start "entryRuleIngredient"
    // InternalRecipeDSL.g:103:1: entryRuleIngredient : ruleIngredient EOF ;
    public final void entryRuleIngredient() throws RecognitionException {
        try {
            // InternalRecipeDSL.g:104:1: ( ruleIngredient EOF )
            // InternalRecipeDSL.g:105:1: ruleIngredient EOF
            {
             before(grammarAccess.getIngredientRule()); 
            pushFollow(FOLLOW_1);
            ruleIngredient();

            state._fsp--;

             after(grammarAccess.getIngredientRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIngredient"


    // $ANTLR start "ruleIngredient"
    // InternalRecipeDSL.g:112:1: ruleIngredient : ( ( rule__Ingredient__Group__0 ) ) ;
    public final void ruleIngredient() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:116:2: ( ( ( rule__Ingredient__Group__0 ) ) )
            // InternalRecipeDSL.g:117:2: ( ( rule__Ingredient__Group__0 ) )
            {
            // InternalRecipeDSL.g:117:2: ( ( rule__Ingredient__Group__0 ) )
            // InternalRecipeDSL.g:118:3: ( rule__Ingredient__Group__0 )
            {
             before(grammarAccess.getIngredientAccess().getGroup()); 
            // InternalRecipeDSL.g:119:3: ( rule__Ingredient__Group__0 )
            // InternalRecipeDSL.g:119:4: rule__Ingredient__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Ingredient__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIngredientAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIngredient"


    // $ANTLR start "entryRuleMeasure"
    // InternalRecipeDSL.g:128:1: entryRuleMeasure : ruleMeasure EOF ;
    public final void entryRuleMeasure() throws RecognitionException {
        try {
            // InternalRecipeDSL.g:129:1: ( ruleMeasure EOF )
            // InternalRecipeDSL.g:130:1: ruleMeasure EOF
            {
             before(grammarAccess.getMeasureRule()); 
            pushFollow(FOLLOW_1);
            ruleMeasure();

            state._fsp--;

             after(grammarAccess.getMeasureRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMeasure"


    // $ANTLR start "ruleMeasure"
    // InternalRecipeDSL.g:137:1: ruleMeasure : ( ( rule__Measure__Alternatives ) ) ;
    public final void ruleMeasure() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:141:2: ( ( ( rule__Measure__Alternatives ) ) )
            // InternalRecipeDSL.g:142:2: ( ( rule__Measure__Alternatives ) )
            {
            // InternalRecipeDSL.g:142:2: ( ( rule__Measure__Alternatives ) )
            // InternalRecipeDSL.g:143:3: ( rule__Measure__Alternatives )
            {
             before(grammarAccess.getMeasureAccess().getAlternatives()); 
            // InternalRecipeDSL.g:144:3: ( rule__Measure__Alternatives )
            // InternalRecipeDSL.g:144:4: rule__Measure__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Measure__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMeasureAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMeasure"


    // $ANTLR start "entryRuleWeight"
    // InternalRecipeDSL.g:153:1: entryRuleWeight : ruleWeight EOF ;
    public final void entryRuleWeight() throws RecognitionException {
        try {
            // InternalRecipeDSL.g:154:1: ( ruleWeight EOF )
            // InternalRecipeDSL.g:155:1: ruleWeight EOF
            {
             before(grammarAccess.getWeightRule()); 
            pushFollow(FOLLOW_1);
            ruleWeight();

            state._fsp--;

             after(grammarAccess.getWeightRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWeight"


    // $ANTLR start "ruleWeight"
    // InternalRecipeDSL.g:162:1: ruleWeight : ( ( rule__Weight__Group__0 ) ) ;
    public final void ruleWeight() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:166:2: ( ( ( rule__Weight__Group__0 ) ) )
            // InternalRecipeDSL.g:167:2: ( ( rule__Weight__Group__0 ) )
            {
            // InternalRecipeDSL.g:167:2: ( ( rule__Weight__Group__0 ) )
            // InternalRecipeDSL.g:168:3: ( rule__Weight__Group__0 )
            {
             before(grammarAccess.getWeightAccess().getGroup()); 
            // InternalRecipeDSL.g:169:3: ( rule__Weight__Group__0 )
            // InternalRecipeDSL.g:169:4: rule__Weight__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Weight__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWeightAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWeight"


    // $ANTLR start "entryRuleCount"
    // InternalRecipeDSL.g:178:1: entryRuleCount : ruleCount EOF ;
    public final void entryRuleCount() throws RecognitionException {
        try {
            // InternalRecipeDSL.g:179:1: ( ruleCount EOF )
            // InternalRecipeDSL.g:180:1: ruleCount EOF
            {
             before(grammarAccess.getCountRule()); 
            pushFollow(FOLLOW_1);
            ruleCount();

            state._fsp--;

             after(grammarAccess.getCountRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCount"


    // $ANTLR start "ruleCount"
    // InternalRecipeDSL.g:187:1: ruleCount : ( ( rule__Count__Group__0 ) ) ;
    public final void ruleCount() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:191:2: ( ( ( rule__Count__Group__0 ) ) )
            // InternalRecipeDSL.g:192:2: ( ( rule__Count__Group__0 ) )
            {
            // InternalRecipeDSL.g:192:2: ( ( rule__Count__Group__0 ) )
            // InternalRecipeDSL.g:193:3: ( rule__Count__Group__0 )
            {
             before(grammarAccess.getCountAccess().getGroup()); 
            // InternalRecipeDSL.g:194:3: ( rule__Count__Group__0 )
            // InternalRecipeDSL.g:194:4: rule__Count__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Count__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCountAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCount"


    // $ANTLR start "entryRuleDevice"
    // InternalRecipeDSL.g:203:1: entryRuleDevice : ruleDevice EOF ;
    public final void entryRuleDevice() throws RecognitionException {
        try {
            // InternalRecipeDSL.g:204:1: ( ruleDevice EOF )
            // InternalRecipeDSL.g:205:1: ruleDevice EOF
            {
             before(grammarAccess.getDeviceRule()); 
            pushFollow(FOLLOW_1);
            ruleDevice();

            state._fsp--;

             after(grammarAccess.getDeviceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDevice"


    // $ANTLR start "ruleDevice"
    // InternalRecipeDSL.g:212:1: ruleDevice : ( ( rule__Device__Group__0 ) ) ;
    public final void ruleDevice() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:216:2: ( ( ( rule__Device__Group__0 ) ) )
            // InternalRecipeDSL.g:217:2: ( ( rule__Device__Group__0 ) )
            {
            // InternalRecipeDSL.g:217:2: ( ( rule__Device__Group__0 ) )
            // InternalRecipeDSL.g:218:3: ( rule__Device__Group__0 )
            {
             before(grammarAccess.getDeviceAccess().getGroup()); 
            // InternalRecipeDSL.g:219:3: ( rule__Device__Group__0 )
            // InternalRecipeDSL.g:219:4: rule__Device__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Device__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeviceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDevice"


    // $ANTLR start "entryRuleCooking"
    // InternalRecipeDSL.g:228:1: entryRuleCooking : ruleCooking EOF ;
    public final void entryRuleCooking() throws RecognitionException {
        try {
            // InternalRecipeDSL.g:229:1: ( ruleCooking EOF )
            // InternalRecipeDSL.g:230:1: ruleCooking EOF
            {
             before(grammarAccess.getCookingRule()); 
            pushFollow(FOLLOW_1);
            ruleCooking();

            state._fsp--;

             after(grammarAccess.getCookingRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCooking"


    // $ANTLR start "ruleCooking"
    // InternalRecipeDSL.g:237:1: ruleCooking : ( ( rule__Cooking__Group__0 ) ) ;
    public final void ruleCooking() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:241:2: ( ( ( rule__Cooking__Group__0 ) ) )
            // InternalRecipeDSL.g:242:2: ( ( rule__Cooking__Group__0 ) )
            {
            // InternalRecipeDSL.g:242:2: ( ( rule__Cooking__Group__0 ) )
            // InternalRecipeDSL.g:243:3: ( rule__Cooking__Group__0 )
            {
             before(grammarAccess.getCookingAccess().getGroup()); 
            // InternalRecipeDSL.g:244:3: ( rule__Cooking__Group__0 )
            // InternalRecipeDSL.g:244:4: rule__Cooking__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Cooking__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCookingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCooking"


    // $ANTLR start "entryRuleTime"
    // InternalRecipeDSL.g:253:1: entryRuleTime : ruleTime EOF ;
    public final void entryRuleTime() throws RecognitionException {
        try {
            // InternalRecipeDSL.g:254:1: ( ruleTime EOF )
            // InternalRecipeDSL.g:255:1: ruleTime EOF
            {
             before(grammarAccess.getTimeRule()); 
            pushFollow(FOLLOW_1);
            ruleTime();

            state._fsp--;

             after(grammarAccess.getTimeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTime"


    // $ANTLR start "ruleTime"
    // InternalRecipeDSL.g:262:1: ruleTime : ( ( rule__Time__Group__0 ) ) ;
    public final void ruleTime() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:266:2: ( ( ( rule__Time__Group__0 ) ) )
            // InternalRecipeDSL.g:267:2: ( ( rule__Time__Group__0 ) )
            {
            // InternalRecipeDSL.g:267:2: ( ( rule__Time__Group__0 ) )
            // InternalRecipeDSL.g:268:3: ( rule__Time__Group__0 )
            {
             before(grammarAccess.getTimeAccess().getGroup()); 
            // InternalRecipeDSL.g:269:3: ( rule__Time__Group__0 )
            // InternalRecipeDSL.g:269:4: rule__Time__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Time__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTimeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTime"


    // $ANTLR start "entryRuleStep"
    // InternalRecipeDSL.g:278:1: entryRuleStep : ruleStep EOF ;
    public final void entryRuleStep() throws RecognitionException {
        try {
            // InternalRecipeDSL.g:279:1: ( ruleStep EOF )
            // InternalRecipeDSL.g:280:1: ruleStep EOF
            {
             before(grammarAccess.getStepRule()); 
            pushFollow(FOLLOW_1);
            ruleStep();

            state._fsp--;

             after(grammarAccess.getStepRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStep"


    // $ANTLR start "ruleStep"
    // InternalRecipeDSL.g:287:1: ruleStep : ( ( rule__Step__Group__0 ) ) ;
    public final void ruleStep() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:291:2: ( ( ( rule__Step__Group__0 ) ) )
            // InternalRecipeDSL.g:292:2: ( ( rule__Step__Group__0 ) )
            {
            // InternalRecipeDSL.g:292:2: ( ( rule__Step__Group__0 ) )
            // InternalRecipeDSL.g:293:3: ( rule__Step__Group__0 )
            {
             before(grammarAccess.getStepAccess().getGroup()); 
            // InternalRecipeDSL.g:294:3: ( rule__Step__Group__0 )
            // InternalRecipeDSL.g:294:4: rule__Step__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Step__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStepAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStep"


    // $ANTLR start "rule__Measure__Alternatives"
    // InternalRecipeDSL.g:302:1: rule__Measure__Alternatives : ( ( ruleWeight ) | ( ruleCount ) );
    public final void rule__Measure__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:306:1: ( ( ruleWeight ) | ( ruleCount ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            else if ( (LA2_0==15) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalRecipeDSL.g:307:2: ( ruleWeight )
                    {
                    // InternalRecipeDSL.g:307:2: ( ruleWeight )
                    // InternalRecipeDSL.g:308:3: ruleWeight
                    {
                     before(grammarAccess.getMeasureAccess().getWeightParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleWeight();

                    state._fsp--;

                     after(grammarAccess.getMeasureAccess().getWeightParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRecipeDSL.g:313:2: ( ruleCount )
                    {
                    // InternalRecipeDSL.g:313:2: ( ruleCount )
                    // InternalRecipeDSL.g:314:3: ruleCount
                    {
                     before(grammarAccess.getMeasureAccess().getCountParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCount();

                    state._fsp--;

                     after(grammarAccess.getMeasureAccess().getCountParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measure__Alternatives"


    // $ANTLR start "rule__Recipe__Group__0"
    // InternalRecipeDSL.g:323:1: rule__Recipe__Group__0 : rule__Recipe__Group__0__Impl rule__Recipe__Group__1 ;
    public final void rule__Recipe__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:327:1: ( rule__Recipe__Group__0__Impl rule__Recipe__Group__1 )
            // InternalRecipeDSL.g:328:2: rule__Recipe__Group__0__Impl rule__Recipe__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Recipe__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__0"


    // $ANTLR start "rule__Recipe__Group__0__Impl"
    // InternalRecipeDSL.g:335:1: rule__Recipe__Group__0__Impl : ( 'Recipe' ) ;
    public final void rule__Recipe__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:339:1: ( ( 'Recipe' ) )
            // InternalRecipeDSL.g:340:1: ( 'Recipe' )
            {
            // InternalRecipeDSL.g:340:1: ( 'Recipe' )
            // InternalRecipeDSL.g:341:2: 'Recipe'
            {
             before(grammarAccess.getRecipeAccess().getRecipeKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getRecipeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__0__Impl"


    // $ANTLR start "rule__Recipe__Group__1"
    // InternalRecipeDSL.g:350:1: rule__Recipe__Group__1 : rule__Recipe__Group__1__Impl rule__Recipe__Group__2 ;
    public final void rule__Recipe__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:354:1: ( rule__Recipe__Group__1__Impl rule__Recipe__Group__2 )
            // InternalRecipeDSL.g:355:2: rule__Recipe__Group__1__Impl rule__Recipe__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Recipe__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__1"


    // $ANTLR start "rule__Recipe__Group__1__Impl"
    // InternalRecipeDSL.g:362:1: rule__Recipe__Group__1__Impl : ( ( rule__Recipe__NameAssignment_1 ) ) ;
    public final void rule__Recipe__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:366:1: ( ( ( rule__Recipe__NameAssignment_1 ) ) )
            // InternalRecipeDSL.g:367:1: ( ( rule__Recipe__NameAssignment_1 ) )
            {
            // InternalRecipeDSL.g:367:1: ( ( rule__Recipe__NameAssignment_1 ) )
            // InternalRecipeDSL.g:368:2: ( rule__Recipe__NameAssignment_1 )
            {
             before(grammarAccess.getRecipeAccess().getNameAssignment_1()); 
            // InternalRecipeDSL.g:369:2: ( rule__Recipe__NameAssignment_1 )
            // InternalRecipeDSL.g:369:3: rule__Recipe__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Recipe__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__1__Impl"


    // $ANTLR start "rule__Recipe__Group__2"
    // InternalRecipeDSL.g:377:1: rule__Recipe__Group__2 : rule__Recipe__Group__2__Impl rule__Recipe__Group__3 ;
    public final void rule__Recipe__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:381:1: ( rule__Recipe__Group__2__Impl rule__Recipe__Group__3 )
            // InternalRecipeDSL.g:382:2: rule__Recipe__Group__2__Impl rule__Recipe__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Recipe__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__2"


    // $ANTLR start "rule__Recipe__Group__2__Impl"
    // InternalRecipeDSL.g:389:1: rule__Recipe__Group__2__Impl : ( ( ( rule__Recipe__IngredientAssignment_2 ) ) ( ( rule__Recipe__IngredientAssignment_2 )* ) ) ;
    public final void rule__Recipe__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:393:1: ( ( ( ( rule__Recipe__IngredientAssignment_2 ) ) ( ( rule__Recipe__IngredientAssignment_2 )* ) ) )
            // InternalRecipeDSL.g:394:1: ( ( ( rule__Recipe__IngredientAssignment_2 ) ) ( ( rule__Recipe__IngredientAssignment_2 )* ) )
            {
            // InternalRecipeDSL.g:394:1: ( ( ( rule__Recipe__IngredientAssignment_2 ) ) ( ( rule__Recipe__IngredientAssignment_2 )* ) )
            // InternalRecipeDSL.g:395:2: ( ( rule__Recipe__IngredientAssignment_2 ) ) ( ( rule__Recipe__IngredientAssignment_2 )* )
            {
            // InternalRecipeDSL.g:395:2: ( ( rule__Recipe__IngredientAssignment_2 ) )
            // InternalRecipeDSL.g:396:3: ( rule__Recipe__IngredientAssignment_2 )
            {
             before(grammarAccess.getRecipeAccess().getIngredientAssignment_2()); 
            // InternalRecipeDSL.g:397:3: ( rule__Recipe__IngredientAssignment_2 )
            // InternalRecipeDSL.g:397:4: rule__Recipe__IngredientAssignment_2
            {
            pushFollow(FOLLOW_7);
            rule__Recipe__IngredientAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getIngredientAssignment_2()); 

            }

            // InternalRecipeDSL.g:400:2: ( ( rule__Recipe__IngredientAssignment_2 )* )
            // InternalRecipeDSL.g:401:3: ( rule__Recipe__IngredientAssignment_2 )*
            {
             before(grammarAccess.getRecipeAccess().getIngredientAssignment_2()); 
            // InternalRecipeDSL.g:402:3: ( rule__Recipe__IngredientAssignment_2 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==12) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalRecipeDSL.g:402:4: rule__Recipe__IngredientAssignment_2
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Recipe__IngredientAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getRecipeAccess().getIngredientAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__2__Impl"


    // $ANTLR start "rule__Recipe__Group__3"
    // InternalRecipeDSL.g:411:1: rule__Recipe__Group__3 : rule__Recipe__Group__3__Impl rule__Recipe__Group__4 ;
    public final void rule__Recipe__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:415:1: ( rule__Recipe__Group__3__Impl rule__Recipe__Group__4 )
            // InternalRecipeDSL.g:416:2: rule__Recipe__Group__3__Impl rule__Recipe__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Recipe__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__3"


    // $ANTLR start "rule__Recipe__Group__3__Impl"
    // InternalRecipeDSL.g:423:1: rule__Recipe__Group__3__Impl : ( ( ( rule__Recipe__DeviceAssignment_3 ) ) ( ( rule__Recipe__DeviceAssignment_3 )* ) ) ;
    public final void rule__Recipe__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:427:1: ( ( ( ( rule__Recipe__DeviceAssignment_3 ) ) ( ( rule__Recipe__DeviceAssignment_3 )* ) ) )
            // InternalRecipeDSL.g:428:1: ( ( ( rule__Recipe__DeviceAssignment_3 ) ) ( ( rule__Recipe__DeviceAssignment_3 )* ) )
            {
            // InternalRecipeDSL.g:428:1: ( ( ( rule__Recipe__DeviceAssignment_3 ) ) ( ( rule__Recipe__DeviceAssignment_3 )* ) )
            // InternalRecipeDSL.g:429:2: ( ( rule__Recipe__DeviceAssignment_3 ) ) ( ( rule__Recipe__DeviceAssignment_3 )* )
            {
            // InternalRecipeDSL.g:429:2: ( ( rule__Recipe__DeviceAssignment_3 ) )
            // InternalRecipeDSL.g:430:3: ( rule__Recipe__DeviceAssignment_3 )
            {
             before(grammarAccess.getRecipeAccess().getDeviceAssignment_3()); 
            // InternalRecipeDSL.g:431:3: ( rule__Recipe__DeviceAssignment_3 )
            // InternalRecipeDSL.g:431:4: rule__Recipe__DeviceAssignment_3
            {
            pushFollow(FOLLOW_9);
            rule__Recipe__DeviceAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getDeviceAssignment_3()); 

            }

            // InternalRecipeDSL.g:434:2: ( ( rule__Recipe__DeviceAssignment_3 )* )
            // InternalRecipeDSL.g:435:3: ( rule__Recipe__DeviceAssignment_3 )*
            {
             before(grammarAccess.getRecipeAccess().getDeviceAssignment_3()); 
            // InternalRecipeDSL.g:436:3: ( rule__Recipe__DeviceAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalRecipeDSL.g:436:4: rule__Recipe__DeviceAssignment_3
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Recipe__DeviceAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getRecipeAccess().getDeviceAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__3__Impl"


    // $ANTLR start "rule__Recipe__Group__4"
    // InternalRecipeDSL.g:445:1: rule__Recipe__Group__4 : rule__Recipe__Group__4__Impl ;
    public final void rule__Recipe__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:449:1: ( rule__Recipe__Group__4__Impl )
            // InternalRecipeDSL.g:450:2: rule__Recipe__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Recipe__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__4"


    // $ANTLR start "rule__Recipe__Group__4__Impl"
    // InternalRecipeDSL.g:456:1: rule__Recipe__Group__4__Impl : ( ( ( rule__Recipe__CookingAssignment_4 ) ) ( ( rule__Recipe__CookingAssignment_4 )* ) ) ;
    public final void rule__Recipe__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:460:1: ( ( ( ( rule__Recipe__CookingAssignment_4 ) ) ( ( rule__Recipe__CookingAssignment_4 )* ) ) )
            // InternalRecipeDSL.g:461:1: ( ( ( rule__Recipe__CookingAssignment_4 ) ) ( ( rule__Recipe__CookingAssignment_4 )* ) )
            {
            // InternalRecipeDSL.g:461:1: ( ( ( rule__Recipe__CookingAssignment_4 ) ) ( ( rule__Recipe__CookingAssignment_4 )* ) )
            // InternalRecipeDSL.g:462:2: ( ( rule__Recipe__CookingAssignment_4 ) ) ( ( rule__Recipe__CookingAssignment_4 )* )
            {
            // InternalRecipeDSL.g:462:2: ( ( rule__Recipe__CookingAssignment_4 ) )
            // InternalRecipeDSL.g:463:3: ( rule__Recipe__CookingAssignment_4 )
            {
             before(grammarAccess.getRecipeAccess().getCookingAssignment_4()); 
            // InternalRecipeDSL.g:464:3: ( rule__Recipe__CookingAssignment_4 )
            // InternalRecipeDSL.g:464:4: rule__Recipe__CookingAssignment_4
            {
            pushFollow(FOLLOW_10);
            rule__Recipe__CookingAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getCookingAssignment_4()); 

            }

            // InternalRecipeDSL.g:467:2: ( ( rule__Recipe__CookingAssignment_4 )* )
            // InternalRecipeDSL.g:468:3: ( rule__Recipe__CookingAssignment_4 )*
            {
             before(grammarAccess.getRecipeAccess().getCookingAssignment_4()); 
            // InternalRecipeDSL.g:469:3: ( rule__Recipe__CookingAssignment_4 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalRecipeDSL.g:469:4: rule__Recipe__CookingAssignment_4
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Recipe__CookingAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getRecipeAccess().getCookingAssignment_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__4__Impl"


    // $ANTLR start "rule__Ingredient__Group__0"
    // InternalRecipeDSL.g:479:1: rule__Ingredient__Group__0 : rule__Ingredient__Group__0__Impl rule__Ingredient__Group__1 ;
    public final void rule__Ingredient__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:483:1: ( rule__Ingredient__Group__0__Impl rule__Ingredient__Group__1 )
            // InternalRecipeDSL.g:484:2: rule__Ingredient__Group__0__Impl rule__Ingredient__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Ingredient__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ingredient__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group__0"


    // $ANTLR start "rule__Ingredient__Group__0__Impl"
    // InternalRecipeDSL.g:491:1: rule__Ingredient__Group__0__Impl : ( 'Ingredient' ) ;
    public final void rule__Ingredient__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:495:1: ( ( 'Ingredient' ) )
            // InternalRecipeDSL.g:496:1: ( 'Ingredient' )
            {
            // InternalRecipeDSL.g:496:1: ( 'Ingredient' )
            // InternalRecipeDSL.g:497:2: 'Ingredient'
            {
             before(grammarAccess.getIngredientAccess().getIngredientKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getIngredientAccess().getIngredientKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group__0__Impl"


    // $ANTLR start "rule__Ingredient__Group__1"
    // InternalRecipeDSL.g:506:1: rule__Ingredient__Group__1 : rule__Ingredient__Group__1__Impl rule__Ingredient__Group__2 ;
    public final void rule__Ingredient__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:510:1: ( rule__Ingredient__Group__1__Impl rule__Ingredient__Group__2 )
            // InternalRecipeDSL.g:511:2: rule__Ingredient__Group__1__Impl rule__Ingredient__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Ingredient__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ingredient__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group__1"


    // $ANTLR start "rule__Ingredient__Group__1__Impl"
    // InternalRecipeDSL.g:518:1: rule__Ingredient__Group__1__Impl : ( ( rule__Ingredient__NameAssignment_1 ) ) ;
    public final void rule__Ingredient__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:522:1: ( ( ( rule__Ingredient__NameAssignment_1 ) ) )
            // InternalRecipeDSL.g:523:1: ( ( rule__Ingredient__NameAssignment_1 ) )
            {
            // InternalRecipeDSL.g:523:1: ( ( rule__Ingredient__NameAssignment_1 ) )
            // InternalRecipeDSL.g:524:2: ( rule__Ingredient__NameAssignment_1 )
            {
             before(grammarAccess.getIngredientAccess().getNameAssignment_1()); 
            // InternalRecipeDSL.g:525:2: ( rule__Ingredient__NameAssignment_1 )
            // InternalRecipeDSL.g:525:3: rule__Ingredient__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Ingredient__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIngredientAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group__1__Impl"


    // $ANTLR start "rule__Ingredient__Group__2"
    // InternalRecipeDSL.g:533:1: rule__Ingredient__Group__2 : rule__Ingredient__Group__2__Impl rule__Ingredient__Group__3 ;
    public final void rule__Ingredient__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:537:1: ( rule__Ingredient__Group__2__Impl rule__Ingredient__Group__3 )
            // InternalRecipeDSL.g:538:2: rule__Ingredient__Group__2__Impl rule__Ingredient__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Ingredient__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ingredient__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group__2"


    // $ANTLR start "rule__Ingredient__Group__2__Impl"
    // InternalRecipeDSL.g:545:1: rule__Ingredient__Group__2__Impl : ( 'amount' ) ;
    public final void rule__Ingredient__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:549:1: ( ( 'amount' ) )
            // InternalRecipeDSL.g:550:1: ( 'amount' )
            {
            // InternalRecipeDSL.g:550:1: ( 'amount' )
            // InternalRecipeDSL.g:551:2: 'amount'
            {
             before(grammarAccess.getIngredientAccess().getAmountKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getIngredientAccess().getAmountKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group__2__Impl"


    // $ANTLR start "rule__Ingredient__Group__3"
    // InternalRecipeDSL.g:560:1: rule__Ingredient__Group__3 : rule__Ingredient__Group__3__Impl ;
    public final void rule__Ingredient__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:564:1: ( rule__Ingredient__Group__3__Impl )
            // InternalRecipeDSL.g:565:2: rule__Ingredient__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ingredient__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group__3"


    // $ANTLR start "rule__Ingredient__Group__3__Impl"
    // InternalRecipeDSL.g:571:1: rule__Ingredient__Group__3__Impl : ( ( rule__Ingredient__MeasureAssignment_3 ) ) ;
    public final void rule__Ingredient__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:575:1: ( ( ( rule__Ingredient__MeasureAssignment_3 ) ) )
            // InternalRecipeDSL.g:576:1: ( ( rule__Ingredient__MeasureAssignment_3 ) )
            {
            // InternalRecipeDSL.g:576:1: ( ( rule__Ingredient__MeasureAssignment_3 ) )
            // InternalRecipeDSL.g:577:2: ( rule__Ingredient__MeasureAssignment_3 )
            {
             before(grammarAccess.getIngredientAccess().getMeasureAssignment_3()); 
            // InternalRecipeDSL.g:578:2: ( rule__Ingredient__MeasureAssignment_3 )
            // InternalRecipeDSL.g:578:3: rule__Ingredient__MeasureAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Ingredient__MeasureAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getIngredientAccess().getMeasureAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group__3__Impl"


    // $ANTLR start "rule__Weight__Group__0"
    // InternalRecipeDSL.g:587:1: rule__Weight__Group__0 : rule__Weight__Group__0__Impl rule__Weight__Group__1 ;
    public final void rule__Weight__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:591:1: ( rule__Weight__Group__0__Impl rule__Weight__Group__1 )
            // InternalRecipeDSL.g:592:2: rule__Weight__Group__0__Impl rule__Weight__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Weight__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Weight__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Weight__Group__0"


    // $ANTLR start "rule__Weight__Group__0__Impl"
    // InternalRecipeDSL.g:599:1: rule__Weight__Group__0__Impl : ( 'Weight' ) ;
    public final void rule__Weight__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:603:1: ( ( 'Weight' ) )
            // InternalRecipeDSL.g:604:1: ( 'Weight' )
            {
            // InternalRecipeDSL.g:604:1: ( 'Weight' )
            // InternalRecipeDSL.g:605:2: 'Weight'
            {
             before(grammarAccess.getWeightAccess().getWeightKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getWeightAccess().getWeightKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Weight__Group__0__Impl"


    // $ANTLR start "rule__Weight__Group__1"
    // InternalRecipeDSL.g:614:1: rule__Weight__Group__1 : rule__Weight__Group__1__Impl ;
    public final void rule__Weight__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:618:1: ( rule__Weight__Group__1__Impl )
            // InternalRecipeDSL.g:619:2: rule__Weight__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Weight__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Weight__Group__1"


    // $ANTLR start "rule__Weight__Group__1__Impl"
    // InternalRecipeDSL.g:625:1: rule__Weight__Group__1__Impl : ( ( rule__Weight__GrammsAssignment_1 ) ) ;
    public final void rule__Weight__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:629:1: ( ( ( rule__Weight__GrammsAssignment_1 ) ) )
            // InternalRecipeDSL.g:630:1: ( ( rule__Weight__GrammsAssignment_1 ) )
            {
            // InternalRecipeDSL.g:630:1: ( ( rule__Weight__GrammsAssignment_1 ) )
            // InternalRecipeDSL.g:631:2: ( rule__Weight__GrammsAssignment_1 )
            {
             before(grammarAccess.getWeightAccess().getGrammsAssignment_1()); 
            // InternalRecipeDSL.g:632:2: ( rule__Weight__GrammsAssignment_1 )
            // InternalRecipeDSL.g:632:3: rule__Weight__GrammsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Weight__GrammsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWeightAccess().getGrammsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Weight__Group__1__Impl"


    // $ANTLR start "rule__Count__Group__0"
    // InternalRecipeDSL.g:641:1: rule__Count__Group__0 : rule__Count__Group__0__Impl rule__Count__Group__1 ;
    public final void rule__Count__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:645:1: ( rule__Count__Group__0__Impl rule__Count__Group__1 )
            // InternalRecipeDSL.g:646:2: rule__Count__Group__0__Impl rule__Count__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Count__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Count__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Count__Group__0"


    // $ANTLR start "rule__Count__Group__0__Impl"
    // InternalRecipeDSL.g:653:1: rule__Count__Group__0__Impl : ( 'Count' ) ;
    public final void rule__Count__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:657:1: ( ( 'Count' ) )
            // InternalRecipeDSL.g:658:1: ( 'Count' )
            {
            // InternalRecipeDSL.g:658:1: ( 'Count' )
            // InternalRecipeDSL.g:659:2: 'Count'
            {
             before(grammarAccess.getCountAccess().getCountKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getCountAccess().getCountKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Count__Group__0__Impl"


    // $ANTLR start "rule__Count__Group__1"
    // InternalRecipeDSL.g:668:1: rule__Count__Group__1 : rule__Count__Group__1__Impl ;
    public final void rule__Count__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:672:1: ( rule__Count__Group__1__Impl )
            // InternalRecipeDSL.g:673:2: rule__Count__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Count__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Count__Group__1"


    // $ANTLR start "rule__Count__Group__1__Impl"
    // InternalRecipeDSL.g:679:1: rule__Count__Group__1__Impl : ( ( rule__Count__CountAssignment_1 ) ) ;
    public final void rule__Count__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:683:1: ( ( ( rule__Count__CountAssignment_1 ) ) )
            // InternalRecipeDSL.g:684:1: ( ( rule__Count__CountAssignment_1 ) )
            {
            // InternalRecipeDSL.g:684:1: ( ( rule__Count__CountAssignment_1 ) )
            // InternalRecipeDSL.g:685:2: ( rule__Count__CountAssignment_1 )
            {
             before(grammarAccess.getCountAccess().getCountAssignment_1()); 
            // InternalRecipeDSL.g:686:2: ( rule__Count__CountAssignment_1 )
            // InternalRecipeDSL.g:686:3: rule__Count__CountAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Count__CountAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCountAccess().getCountAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Count__Group__1__Impl"


    // $ANTLR start "rule__Device__Group__0"
    // InternalRecipeDSL.g:695:1: rule__Device__Group__0 : rule__Device__Group__0__Impl rule__Device__Group__1 ;
    public final void rule__Device__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:699:1: ( rule__Device__Group__0__Impl rule__Device__Group__1 )
            // InternalRecipeDSL.g:700:2: rule__Device__Group__0__Impl rule__Device__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Device__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Device__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__0"


    // $ANTLR start "rule__Device__Group__0__Impl"
    // InternalRecipeDSL.g:707:1: rule__Device__Group__0__Impl : ( 'Device' ) ;
    public final void rule__Device__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:711:1: ( ( 'Device' ) )
            // InternalRecipeDSL.g:712:1: ( 'Device' )
            {
            // InternalRecipeDSL.g:712:1: ( 'Device' )
            // InternalRecipeDSL.g:713:2: 'Device'
            {
             before(grammarAccess.getDeviceAccess().getDeviceKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getDeviceAccess().getDeviceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__0__Impl"


    // $ANTLR start "rule__Device__Group__1"
    // InternalRecipeDSL.g:722:1: rule__Device__Group__1 : rule__Device__Group__1__Impl ;
    public final void rule__Device__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:726:1: ( rule__Device__Group__1__Impl )
            // InternalRecipeDSL.g:727:2: rule__Device__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Device__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__1"


    // $ANTLR start "rule__Device__Group__1__Impl"
    // InternalRecipeDSL.g:733:1: rule__Device__Group__1__Impl : ( ( rule__Device__NameAssignment_1 ) ) ;
    public final void rule__Device__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:737:1: ( ( ( rule__Device__NameAssignment_1 ) ) )
            // InternalRecipeDSL.g:738:1: ( ( rule__Device__NameAssignment_1 ) )
            {
            // InternalRecipeDSL.g:738:1: ( ( rule__Device__NameAssignment_1 ) )
            // InternalRecipeDSL.g:739:2: ( rule__Device__NameAssignment_1 )
            {
             before(grammarAccess.getDeviceAccess().getNameAssignment_1()); 
            // InternalRecipeDSL.g:740:2: ( rule__Device__NameAssignment_1 )
            // InternalRecipeDSL.g:740:3: rule__Device__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Device__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDeviceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__1__Impl"


    // $ANTLR start "rule__Cooking__Group__0"
    // InternalRecipeDSL.g:749:1: rule__Cooking__Group__0 : rule__Cooking__Group__0__Impl rule__Cooking__Group__1 ;
    public final void rule__Cooking__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:753:1: ( rule__Cooking__Group__0__Impl rule__Cooking__Group__1 )
            // InternalRecipeDSL.g:754:2: rule__Cooking__Group__0__Impl rule__Cooking__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Cooking__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cooking__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cooking__Group__0"


    // $ANTLR start "rule__Cooking__Group__0__Impl"
    // InternalRecipeDSL.g:761:1: rule__Cooking__Group__0__Impl : ( 'Cooking' ) ;
    public final void rule__Cooking__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:765:1: ( ( 'Cooking' ) )
            // InternalRecipeDSL.g:766:1: ( 'Cooking' )
            {
            // InternalRecipeDSL.g:766:1: ( 'Cooking' )
            // InternalRecipeDSL.g:767:2: 'Cooking'
            {
             before(grammarAccess.getCookingAccess().getCookingKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCookingAccess().getCookingKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cooking__Group__0__Impl"


    // $ANTLR start "rule__Cooking__Group__1"
    // InternalRecipeDSL.g:776:1: rule__Cooking__Group__1 : rule__Cooking__Group__1__Impl rule__Cooking__Group__2 ;
    public final void rule__Cooking__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:780:1: ( rule__Cooking__Group__1__Impl rule__Cooking__Group__2 )
            // InternalRecipeDSL.g:781:2: rule__Cooking__Group__1__Impl rule__Cooking__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Cooking__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cooking__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cooking__Group__1"


    // $ANTLR start "rule__Cooking__Group__1__Impl"
    // InternalRecipeDSL.g:788:1: rule__Cooking__Group__1__Impl : ( ( rule__Cooking__OrderAssignment_1 ) ) ;
    public final void rule__Cooking__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:792:1: ( ( ( rule__Cooking__OrderAssignment_1 ) ) )
            // InternalRecipeDSL.g:793:1: ( ( rule__Cooking__OrderAssignment_1 ) )
            {
            // InternalRecipeDSL.g:793:1: ( ( rule__Cooking__OrderAssignment_1 ) )
            // InternalRecipeDSL.g:794:2: ( rule__Cooking__OrderAssignment_1 )
            {
             before(grammarAccess.getCookingAccess().getOrderAssignment_1()); 
            // InternalRecipeDSL.g:795:2: ( rule__Cooking__OrderAssignment_1 )
            // InternalRecipeDSL.g:795:3: rule__Cooking__OrderAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Cooking__OrderAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCookingAccess().getOrderAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cooking__Group__1__Impl"


    // $ANTLR start "rule__Cooking__Group__2"
    // InternalRecipeDSL.g:803:1: rule__Cooking__Group__2 : rule__Cooking__Group__2__Impl ;
    public final void rule__Cooking__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:807:1: ( rule__Cooking__Group__2__Impl )
            // InternalRecipeDSL.g:808:2: rule__Cooking__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cooking__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cooking__Group__2"


    // $ANTLR start "rule__Cooking__Group__2__Impl"
    // InternalRecipeDSL.g:814:1: rule__Cooking__Group__2__Impl : ( ( rule__Cooking__Group_2__0 )* ) ;
    public final void rule__Cooking__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:818:1: ( ( ( rule__Cooking__Group_2__0 )* ) )
            // InternalRecipeDSL.g:819:1: ( ( rule__Cooking__Group_2__0 )* )
            {
            // InternalRecipeDSL.g:819:1: ( ( rule__Cooking__Group_2__0 )* )
            // InternalRecipeDSL.g:820:2: ( rule__Cooking__Group_2__0 )*
            {
             before(grammarAccess.getCookingAccess().getGroup_2()); 
            // InternalRecipeDSL.g:821:2: ( rule__Cooking__Group_2__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalRecipeDSL.g:821:3: rule__Cooking__Group_2__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Cooking__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getCookingAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cooking__Group__2__Impl"


    // $ANTLR start "rule__Cooking__Group_2__0"
    // InternalRecipeDSL.g:830:1: rule__Cooking__Group_2__0 : rule__Cooking__Group_2__0__Impl rule__Cooking__Group_2__1 ;
    public final void rule__Cooking__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:834:1: ( rule__Cooking__Group_2__0__Impl rule__Cooking__Group_2__1 )
            // InternalRecipeDSL.g:835:2: rule__Cooking__Group_2__0__Impl rule__Cooking__Group_2__1
            {
            pushFollow(FOLLOW_17);
            rule__Cooking__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cooking__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cooking__Group_2__0"


    // $ANTLR start "rule__Cooking__Group_2__0__Impl"
    // InternalRecipeDSL.g:842:1: rule__Cooking__Group_2__0__Impl : ( ( rule__Cooking__TimeAssignment_2_0 ) ) ;
    public final void rule__Cooking__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:846:1: ( ( ( rule__Cooking__TimeAssignment_2_0 ) ) )
            // InternalRecipeDSL.g:847:1: ( ( rule__Cooking__TimeAssignment_2_0 ) )
            {
            // InternalRecipeDSL.g:847:1: ( ( rule__Cooking__TimeAssignment_2_0 ) )
            // InternalRecipeDSL.g:848:2: ( rule__Cooking__TimeAssignment_2_0 )
            {
             before(grammarAccess.getCookingAccess().getTimeAssignment_2_0()); 
            // InternalRecipeDSL.g:849:2: ( rule__Cooking__TimeAssignment_2_0 )
            // InternalRecipeDSL.g:849:3: rule__Cooking__TimeAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Cooking__TimeAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getCookingAccess().getTimeAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cooking__Group_2__0__Impl"


    // $ANTLR start "rule__Cooking__Group_2__1"
    // InternalRecipeDSL.g:857:1: rule__Cooking__Group_2__1 : rule__Cooking__Group_2__1__Impl ;
    public final void rule__Cooking__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:861:1: ( rule__Cooking__Group_2__1__Impl )
            // InternalRecipeDSL.g:862:2: rule__Cooking__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cooking__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cooking__Group_2__1"


    // $ANTLR start "rule__Cooking__Group_2__1__Impl"
    // InternalRecipeDSL.g:868:1: rule__Cooking__Group_2__1__Impl : ( ( rule__Cooking__StepAssignment_2_1 ) ) ;
    public final void rule__Cooking__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:872:1: ( ( ( rule__Cooking__StepAssignment_2_1 ) ) )
            // InternalRecipeDSL.g:873:1: ( ( rule__Cooking__StepAssignment_2_1 ) )
            {
            // InternalRecipeDSL.g:873:1: ( ( rule__Cooking__StepAssignment_2_1 ) )
            // InternalRecipeDSL.g:874:2: ( rule__Cooking__StepAssignment_2_1 )
            {
             before(grammarAccess.getCookingAccess().getStepAssignment_2_1()); 
            // InternalRecipeDSL.g:875:2: ( rule__Cooking__StepAssignment_2_1 )
            // InternalRecipeDSL.g:875:3: rule__Cooking__StepAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Cooking__StepAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getCookingAccess().getStepAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cooking__Group_2__1__Impl"


    // $ANTLR start "rule__Time__Group__0"
    // InternalRecipeDSL.g:884:1: rule__Time__Group__0 : rule__Time__Group__0__Impl rule__Time__Group__1 ;
    public final void rule__Time__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:888:1: ( rule__Time__Group__0__Impl rule__Time__Group__1 )
            // InternalRecipeDSL.g:889:2: rule__Time__Group__0__Impl rule__Time__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Time__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Time__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Time__Group__0"


    // $ANTLR start "rule__Time__Group__0__Impl"
    // InternalRecipeDSL.g:896:1: rule__Time__Group__0__Impl : ( 'For' ) ;
    public final void rule__Time__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:900:1: ( ( 'For' ) )
            // InternalRecipeDSL.g:901:1: ( 'For' )
            {
            // InternalRecipeDSL.g:901:1: ( 'For' )
            // InternalRecipeDSL.g:902:2: 'For'
            {
             before(grammarAccess.getTimeAccess().getForKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTimeAccess().getForKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Time__Group__0__Impl"


    // $ANTLR start "rule__Time__Group__1"
    // InternalRecipeDSL.g:911:1: rule__Time__Group__1 : rule__Time__Group__1__Impl ;
    public final void rule__Time__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:915:1: ( rule__Time__Group__1__Impl )
            // InternalRecipeDSL.g:916:2: rule__Time__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Time__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Time__Group__1"


    // $ANTLR start "rule__Time__Group__1__Impl"
    // InternalRecipeDSL.g:922:1: rule__Time__Group__1__Impl : ( ( rule__Time__TimeAssignment_1 ) ) ;
    public final void rule__Time__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:926:1: ( ( ( rule__Time__TimeAssignment_1 ) ) )
            // InternalRecipeDSL.g:927:1: ( ( rule__Time__TimeAssignment_1 ) )
            {
            // InternalRecipeDSL.g:927:1: ( ( rule__Time__TimeAssignment_1 ) )
            // InternalRecipeDSL.g:928:2: ( rule__Time__TimeAssignment_1 )
            {
             before(grammarAccess.getTimeAccess().getTimeAssignment_1()); 
            // InternalRecipeDSL.g:929:2: ( rule__Time__TimeAssignment_1 )
            // InternalRecipeDSL.g:929:3: rule__Time__TimeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Time__TimeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTimeAccess().getTimeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Time__Group__1__Impl"


    // $ANTLR start "rule__Step__Group__0"
    // InternalRecipeDSL.g:938:1: rule__Step__Group__0 : rule__Step__Group__0__Impl rule__Step__Group__1 ;
    public final void rule__Step__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:942:1: ( rule__Step__Group__0__Impl rule__Step__Group__1 )
            // InternalRecipeDSL.g:943:2: rule__Step__Group__0__Impl rule__Step__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Step__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Step__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__0"


    // $ANTLR start "rule__Step__Group__0__Impl"
    // InternalRecipeDSL.g:950:1: rule__Step__Group__0__Impl : ( 'Use' ) ;
    public final void rule__Step__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:954:1: ( ( 'Use' ) )
            // InternalRecipeDSL.g:955:1: ( 'Use' )
            {
            // InternalRecipeDSL.g:955:1: ( 'Use' )
            // InternalRecipeDSL.g:956:2: 'Use'
            {
             before(grammarAccess.getStepAccess().getUseKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getStepAccess().getUseKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__0__Impl"


    // $ANTLR start "rule__Step__Group__1"
    // InternalRecipeDSL.g:965:1: rule__Step__Group__1 : rule__Step__Group__1__Impl rule__Step__Group__2 ;
    public final void rule__Step__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:969:1: ( rule__Step__Group__1__Impl rule__Step__Group__2 )
            // InternalRecipeDSL.g:970:2: rule__Step__Group__1__Impl rule__Step__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__Step__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Step__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__1"


    // $ANTLR start "rule__Step__Group__1__Impl"
    // InternalRecipeDSL.g:977:1: rule__Step__Group__1__Impl : ( ( rule__Step__DAssignment_1 ) ) ;
    public final void rule__Step__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:981:1: ( ( ( rule__Step__DAssignment_1 ) ) )
            // InternalRecipeDSL.g:982:1: ( ( rule__Step__DAssignment_1 ) )
            {
            // InternalRecipeDSL.g:982:1: ( ( rule__Step__DAssignment_1 ) )
            // InternalRecipeDSL.g:983:2: ( rule__Step__DAssignment_1 )
            {
             before(grammarAccess.getStepAccess().getDAssignment_1()); 
            // InternalRecipeDSL.g:984:2: ( rule__Step__DAssignment_1 )
            // InternalRecipeDSL.g:984:3: rule__Step__DAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Step__DAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStepAccess().getDAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__1__Impl"


    // $ANTLR start "rule__Step__Group__2"
    // InternalRecipeDSL.g:992:1: rule__Step__Group__2 : rule__Step__Group__2__Impl rule__Step__Group__3 ;
    public final void rule__Step__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:996:1: ( rule__Step__Group__2__Impl rule__Step__Group__3 )
            // InternalRecipeDSL.g:997:2: rule__Step__Group__2__Impl rule__Step__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Step__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Step__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__2"


    // $ANTLR start "rule__Step__Group__2__Impl"
    // InternalRecipeDSL.g:1004:1: rule__Step__Group__2__Impl : ( 'with' ) ;
    public final void rule__Step__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1008:1: ( ( 'with' ) )
            // InternalRecipeDSL.g:1009:1: ( 'with' )
            {
            // InternalRecipeDSL.g:1009:1: ( 'with' )
            // InternalRecipeDSL.g:1010:2: 'with'
            {
             before(grammarAccess.getStepAccess().getWithKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getStepAccess().getWithKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__2__Impl"


    // $ANTLR start "rule__Step__Group__3"
    // InternalRecipeDSL.g:1019:1: rule__Step__Group__3 : rule__Step__Group__3__Impl ;
    public final void rule__Step__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1023:1: ( rule__Step__Group__3__Impl )
            // InternalRecipeDSL.g:1024:2: rule__Step__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Step__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__3"


    // $ANTLR start "rule__Step__Group__3__Impl"
    // InternalRecipeDSL.g:1030:1: rule__Step__Group__3__Impl : ( ( rule__Step__IAssignment_3 ) ) ;
    public final void rule__Step__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1034:1: ( ( ( rule__Step__IAssignment_3 ) ) )
            // InternalRecipeDSL.g:1035:1: ( ( rule__Step__IAssignment_3 ) )
            {
            // InternalRecipeDSL.g:1035:1: ( ( rule__Step__IAssignment_3 ) )
            // InternalRecipeDSL.g:1036:2: ( rule__Step__IAssignment_3 )
            {
             before(grammarAccess.getStepAccess().getIAssignment_3()); 
            // InternalRecipeDSL.g:1037:2: ( rule__Step__IAssignment_3 )
            // InternalRecipeDSL.g:1037:3: rule__Step__IAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Step__IAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getStepAccess().getIAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__3__Impl"


    // $ANTLR start "rule__Model__RecipesAssignment"
    // InternalRecipeDSL.g:1046:1: rule__Model__RecipesAssignment : ( ruleRecipe ) ;
    public final void rule__Model__RecipesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1050:1: ( ( ruleRecipe ) )
            // InternalRecipeDSL.g:1051:2: ( ruleRecipe )
            {
            // InternalRecipeDSL.g:1051:2: ( ruleRecipe )
            // InternalRecipeDSL.g:1052:3: ruleRecipe
            {
             before(grammarAccess.getModelAccess().getRecipesRecipeParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleRecipe();

            state._fsp--;

             after(grammarAccess.getModelAccess().getRecipesRecipeParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__RecipesAssignment"


    // $ANTLR start "rule__Recipe__NameAssignment_1"
    // InternalRecipeDSL.g:1061:1: rule__Recipe__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Recipe__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1065:1: ( ( RULE_ID ) )
            // InternalRecipeDSL.g:1066:2: ( RULE_ID )
            {
            // InternalRecipeDSL.g:1066:2: ( RULE_ID )
            // InternalRecipeDSL.g:1067:3: RULE_ID
            {
             before(grammarAccess.getRecipeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__NameAssignment_1"


    // $ANTLR start "rule__Recipe__IngredientAssignment_2"
    // InternalRecipeDSL.g:1076:1: rule__Recipe__IngredientAssignment_2 : ( ruleIngredient ) ;
    public final void rule__Recipe__IngredientAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1080:1: ( ( ruleIngredient ) )
            // InternalRecipeDSL.g:1081:2: ( ruleIngredient )
            {
            // InternalRecipeDSL.g:1081:2: ( ruleIngredient )
            // InternalRecipeDSL.g:1082:3: ruleIngredient
            {
             before(grammarAccess.getRecipeAccess().getIngredientIngredientParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleIngredient();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getIngredientIngredientParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__IngredientAssignment_2"


    // $ANTLR start "rule__Recipe__DeviceAssignment_3"
    // InternalRecipeDSL.g:1091:1: rule__Recipe__DeviceAssignment_3 : ( ruleDevice ) ;
    public final void rule__Recipe__DeviceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1095:1: ( ( ruleDevice ) )
            // InternalRecipeDSL.g:1096:2: ( ruleDevice )
            {
            // InternalRecipeDSL.g:1096:2: ( ruleDevice )
            // InternalRecipeDSL.g:1097:3: ruleDevice
            {
             before(grammarAccess.getRecipeAccess().getDeviceDeviceParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDevice();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getDeviceDeviceParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__DeviceAssignment_3"


    // $ANTLR start "rule__Recipe__CookingAssignment_4"
    // InternalRecipeDSL.g:1106:1: rule__Recipe__CookingAssignment_4 : ( ruleCooking ) ;
    public final void rule__Recipe__CookingAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1110:1: ( ( ruleCooking ) )
            // InternalRecipeDSL.g:1111:2: ( ruleCooking )
            {
            // InternalRecipeDSL.g:1111:2: ( ruleCooking )
            // InternalRecipeDSL.g:1112:3: ruleCooking
            {
             before(grammarAccess.getRecipeAccess().getCookingCookingParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCooking();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getCookingCookingParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__CookingAssignment_4"


    // $ANTLR start "rule__Ingredient__NameAssignment_1"
    // InternalRecipeDSL.g:1121:1: rule__Ingredient__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Ingredient__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1125:1: ( ( RULE_ID ) )
            // InternalRecipeDSL.g:1126:2: ( RULE_ID )
            {
            // InternalRecipeDSL.g:1126:2: ( RULE_ID )
            // InternalRecipeDSL.g:1127:3: RULE_ID
            {
             before(grammarAccess.getIngredientAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIngredientAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__NameAssignment_1"


    // $ANTLR start "rule__Ingredient__MeasureAssignment_3"
    // InternalRecipeDSL.g:1136:1: rule__Ingredient__MeasureAssignment_3 : ( ruleMeasure ) ;
    public final void rule__Ingredient__MeasureAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1140:1: ( ( ruleMeasure ) )
            // InternalRecipeDSL.g:1141:2: ( ruleMeasure )
            {
            // InternalRecipeDSL.g:1141:2: ( ruleMeasure )
            // InternalRecipeDSL.g:1142:3: ruleMeasure
            {
             before(grammarAccess.getIngredientAccess().getMeasureMeasureParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleMeasure();

            state._fsp--;

             after(grammarAccess.getIngredientAccess().getMeasureMeasureParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__MeasureAssignment_3"


    // $ANTLR start "rule__Weight__GrammsAssignment_1"
    // InternalRecipeDSL.g:1151:1: rule__Weight__GrammsAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Weight__GrammsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1155:1: ( ( RULE_STRING ) )
            // InternalRecipeDSL.g:1156:2: ( RULE_STRING )
            {
            // InternalRecipeDSL.g:1156:2: ( RULE_STRING )
            // InternalRecipeDSL.g:1157:3: RULE_STRING
            {
             before(grammarAccess.getWeightAccess().getGrammsSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getWeightAccess().getGrammsSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Weight__GrammsAssignment_1"


    // $ANTLR start "rule__Count__CountAssignment_1"
    // InternalRecipeDSL.g:1166:1: rule__Count__CountAssignment_1 : ( RULE_INT ) ;
    public final void rule__Count__CountAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1170:1: ( ( RULE_INT ) )
            // InternalRecipeDSL.g:1171:2: ( RULE_INT )
            {
            // InternalRecipeDSL.g:1171:2: ( RULE_INT )
            // InternalRecipeDSL.g:1172:3: RULE_INT
            {
             before(grammarAccess.getCountAccess().getCountINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCountAccess().getCountINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Count__CountAssignment_1"


    // $ANTLR start "rule__Device__NameAssignment_1"
    // InternalRecipeDSL.g:1181:1: rule__Device__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Device__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1185:1: ( ( RULE_ID ) )
            // InternalRecipeDSL.g:1186:2: ( RULE_ID )
            {
            // InternalRecipeDSL.g:1186:2: ( RULE_ID )
            // InternalRecipeDSL.g:1187:3: RULE_ID
            {
             before(grammarAccess.getDeviceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDeviceAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__NameAssignment_1"


    // $ANTLR start "rule__Cooking__OrderAssignment_1"
    // InternalRecipeDSL.g:1196:1: rule__Cooking__OrderAssignment_1 : ( RULE_ID ) ;
    public final void rule__Cooking__OrderAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1200:1: ( ( RULE_ID ) )
            // InternalRecipeDSL.g:1201:2: ( RULE_ID )
            {
            // InternalRecipeDSL.g:1201:2: ( RULE_ID )
            // InternalRecipeDSL.g:1202:3: RULE_ID
            {
             before(grammarAccess.getCookingAccess().getOrderIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCookingAccess().getOrderIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cooking__OrderAssignment_1"


    // $ANTLR start "rule__Cooking__TimeAssignment_2_0"
    // InternalRecipeDSL.g:1211:1: rule__Cooking__TimeAssignment_2_0 : ( ruleTime ) ;
    public final void rule__Cooking__TimeAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1215:1: ( ( ruleTime ) )
            // InternalRecipeDSL.g:1216:2: ( ruleTime )
            {
            // InternalRecipeDSL.g:1216:2: ( ruleTime )
            // InternalRecipeDSL.g:1217:3: ruleTime
            {
             before(grammarAccess.getCookingAccess().getTimeTimeParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTime();

            state._fsp--;

             after(grammarAccess.getCookingAccess().getTimeTimeParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cooking__TimeAssignment_2_0"


    // $ANTLR start "rule__Cooking__StepAssignment_2_1"
    // InternalRecipeDSL.g:1226:1: rule__Cooking__StepAssignment_2_1 : ( ruleStep ) ;
    public final void rule__Cooking__StepAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1230:1: ( ( ruleStep ) )
            // InternalRecipeDSL.g:1231:2: ( ruleStep )
            {
            // InternalRecipeDSL.g:1231:2: ( ruleStep )
            // InternalRecipeDSL.g:1232:3: ruleStep
            {
             before(grammarAccess.getCookingAccess().getStepStepParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStep();

            state._fsp--;

             after(grammarAccess.getCookingAccess().getStepStepParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cooking__StepAssignment_2_1"


    // $ANTLR start "rule__Time__TimeAssignment_1"
    // InternalRecipeDSL.g:1241:1: rule__Time__TimeAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Time__TimeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1245:1: ( ( RULE_STRING ) )
            // InternalRecipeDSL.g:1246:2: ( RULE_STRING )
            {
            // InternalRecipeDSL.g:1246:2: ( RULE_STRING )
            // InternalRecipeDSL.g:1247:3: RULE_STRING
            {
             before(grammarAccess.getTimeAccess().getTimeSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTimeAccess().getTimeSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Time__TimeAssignment_1"


    // $ANTLR start "rule__Step__DAssignment_1"
    // InternalRecipeDSL.g:1256:1: rule__Step__DAssignment_1 : ( ruleDevice ) ;
    public final void rule__Step__DAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1260:1: ( ( ruleDevice ) )
            // InternalRecipeDSL.g:1261:2: ( ruleDevice )
            {
            // InternalRecipeDSL.g:1261:2: ( ruleDevice )
            // InternalRecipeDSL.g:1262:3: ruleDevice
            {
             before(grammarAccess.getStepAccess().getDDeviceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDevice();

            state._fsp--;

             after(grammarAccess.getStepAccess().getDDeviceParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__DAssignment_1"


    // $ANTLR start "rule__Step__IAssignment_3"
    // InternalRecipeDSL.g:1271:1: rule__Step__IAssignment_3 : ( ruleIngredient ) ;
    public final void rule__Step__IAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1275:1: ( ( ruleIngredient ) )
            // InternalRecipeDSL.g:1276:2: ( ruleIngredient )
            {
            // InternalRecipeDSL.g:1276:2: ( ruleIngredient )
            // InternalRecipeDSL.g:1277:3: ruleIngredient
            {
             before(grammarAccess.getStepAccess().getIIngredientParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleIngredient();

            state._fsp--;

             after(grammarAccess.getStepAccess().getIIngredientParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__IAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000100000L});

}