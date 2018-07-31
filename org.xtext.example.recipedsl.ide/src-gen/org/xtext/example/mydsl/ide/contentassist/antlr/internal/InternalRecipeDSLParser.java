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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_RATING", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'mg'", "'g'", "'kg'", "'t'", "'sec'", "'min'", "'h'", "'d'", "'E'", "'e'", "'Recipebook'", "'from'", "','", "'Recipe'", "'Level'", "'Ingredient'", "'amount'", "'pieces'", "'Device'", "'Step'", "'For'", "'Use'", "'with'", "'-'", "'.'"
    };
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int RULE_RATING=6;
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
    // InternalRecipeDSL.g:62:1: ruleModel : ( ( rule__Model__MgrAssignment ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:66:2: ( ( ( rule__Model__MgrAssignment ) ) )
            // InternalRecipeDSL.g:67:2: ( ( rule__Model__MgrAssignment ) )
            {
            // InternalRecipeDSL.g:67:2: ( ( rule__Model__MgrAssignment ) )
            // InternalRecipeDSL.g:68:3: ( rule__Model__MgrAssignment )
            {
             before(grammarAccess.getModelAccess().getMgrAssignment()); 
            // InternalRecipeDSL.g:69:3: ( rule__Model__MgrAssignment )
            // InternalRecipeDSL.g:69:4: rule__Model__MgrAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Model__MgrAssignment();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getMgrAssignment()); 

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


    // $ANTLR start "entryRuleManager"
    // InternalRecipeDSL.g:78:1: entryRuleManager : ruleManager EOF ;
    public final void entryRuleManager() throws RecognitionException {
        try {
            // InternalRecipeDSL.g:79:1: ( ruleManager EOF )
            // InternalRecipeDSL.g:80:1: ruleManager EOF
            {
             before(grammarAccess.getManagerRule()); 
            pushFollow(FOLLOW_1);
            ruleManager();

            state._fsp--;

             after(grammarAccess.getManagerRule()); 
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
    // $ANTLR end "entryRuleManager"


    // $ANTLR start "ruleManager"
    // InternalRecipeDSL.g:87:1: ruleManager : ( ( rule__Manager__Group__0 ) ) ;
    public final void ruleManager() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:91:2: ( ( ( rule__Manager__Group__0 ) ) )
            // InternalRecipeDSL.g:92:2: ( ( rule__Manager__Group__0 ) )
            {
            // InternalRecipeDSL.g:92:2: ( ( rule__Manager__Group__0 ) )
            // InternalRecipeDSL.g:93:3: ( rule__Manager__Group__0 )
            {
             before(grammarAccess.getManagerAccess().getGroup()); 
            // InternalRecipeDSL.g:94:3: ( rule__Manager__Group__0 )
            // InternalRecipeDSL.g:94:4: rule__Manager__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Manager__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getManagerAccess().getGroup()); 

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
    // $ANTLR end "ruleManager"


    // $ANTLR start "entryRuleUser"
    // InternalRecipeDSL.g:103:1: entryRuleUser : ruleUser EOF ;
    public final void entryRuleUser() throws RecognitionException {
        try {
            // InternalRecipeDSL.g:104:1: ( ruleUser EOF )
            // InternalRecipeDSL.g:105:1: ruleUser EOF
            {
             before(grammarAccess.getUserRule()); 
            pushFollow(FOLLOW_1);
            ruleUser();

            state._fsp--;

             after(grammarAccess.getUserRule()); 
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
    // $ANTLR end "entryRuleUser"


    // $ANTLR start "ruleUser"
    // InternalRecipeDSL.g:112:1: ruleUser : ( ( rule__User__NameAssignment ) ) ;
    public final void ruleUser() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:116:2: ( ( ( rule__User__NameAssignment ) ) )
            // InternalRecipeDSL.g:117:2: ( ( rule__User__NameAssignment ) )
            {
            // InternalRecipeDSL.g:117:2: ( ( rule__User__NameAssignment ) )
            // InternalRecipeDSL.g:118:3: ( rule__User__NameAssignment )
            {
             before(grammarAccess.getUserAccess().getNameAssignment()); 
            // InternalRecipeDSL.g:119:3: ( rule__User__NameAssignment )
            // InternalRecipeDSL.g:119:4: rule__User__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__User__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getUserAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleUser"


    // $ANTLR start "entryRuleRecipe"
    // InternalRecipeDSL.g:128:1: entryRuleRecipe : ruleRecipe EOF ;
    public final void entryRuleRecipe() throws RecognitionException {
        try {
            // InternalRecipeDSL.g:129:1: ( ruleRecipe EOF )
            // InternalRecipeDSL.g:130:1: ruleRecipe EOF
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
    // InternalRecipeDSL.g:137:1: ruleRecipe : ( ( rule__Recipe__Group__0 ) ) ;
    public final void ruleRecipe() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:141:2: ( ( ( rule__Recipe__Group__0 ) ) )
            // InternalRecipeDSL.g:142:2: ( ( rule__Recipe__Group__0 ) )
            {
            // InternalRecipeDSL.g:142:2: ( ( rule__Recipe__Group__0 ) )
            // InternalRecipeDSL.g:143:3: ( rule__Recipe__Group__0 )
            {
             before(grammarAccess.getRecipeAccess().getGroup()); 
            // InternalRecipeDSL.g:144:3: ( rule__Recipe__Group__0 )
            // InternalRecipeDSL.g:144:4: rule__Recipe__Group__0
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


    // $ANTLR start "entryRuleLevel"
    // InternalRecipeDSL.g:153:1: entryRuleLevel : ruleLevel EOF ;
    public final void entryRuleLevel() throws RecognitionException {
        try {
            // InternalRecipeDSL.g:154:1: ( ruleLevel EOF )
            // InternalRecipeDSL.g:155:1: ruleLevel EOF
            {
             before(grammarAccess.getLevelRule()); 
            pushFollow(FOLLOW_1);
            ruleLevel();

            state._fsp--;

             after(grammarAccess.getLevelRule()); 
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
    // $ANTLR end "entryRuleLevel"


    // $ANTLR start "ruleLevel"
    // InternalRecipeDSL.g:162:1: ruleLevel : ( ( rule__Level__Group__0 ) ) ;
    public final void ruleLevel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:166:2: ( ( ( rule__Level__Group__0 ) ) )
            // InternalRecipeDSL.g:167:2: ( ( rule__Level__Group__0 ) )
            {
            // InternalRecipeDSL.g:167:2: ( ( rule__Level__Group__0 ) )
            // InternalRecipeDSL.g:168:3: ( rule__Level__Group__0 )
            {
             before(grammarAccess.getLevelAccess().getGroup()); 
            // InternalRecipeDSL.g:169:3: ( rule__Level__Group__0 )
            // InternalRecipeDSL.g:169:4: rule__Level__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Level__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLevelAccess().getGroup()); 

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
    // $ANTLR end "ruleLevel"


    // $ANTLR start "entryRuleIngredient"
    // InternalRecipeDSL.g:178:1: entryRuleIngredient : ruleIngredient EOF ;
    public final void entryRuleIngredient() throws RecognitionException {
        try {
            // InternalRecipeDSL.g:179:1: ( ruleIngredient EOF )
            // InternalRecipeDSL.g:180:1: ruleIngredient EOF
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
    // InternalRecipeDSL.g:187:1: ruleIngredient : ( ( rule__Ingredient__Alternatives ) ) ;
    public final void ruleIngredient() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:191:2: ( ( ( rule__Ingredient__Alternatives ) ) )
            // InternalRecipeDSL.g:192:2: ( ( rule__Ingredient__Alternatives ) )
            {
            // InternalRecipeDSL.g:192:2: ( ( rule__Ingredient__Alternatives ) )
            // InternalRecipeDSL.g:193:3: ( rule__Ingredient__Alternatives )
            {
             before(grammarAccess.getIngredientAccess().getAlternatives()); 
            // InternalRecipeDSL.g:194:3: ( rule__Ingredient__Alternatives )
            // InternalRecipeDSL.g:194:4: rule__Ingredient__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Ingredient__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getIngredientAccess().getAlternatives()); 

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


    // $ANTLR start "entryRuleWeight"
    // InternalRecipeDSL.g:203:1: entryRuleWeight : ruleWeight EOF ;
    public final void entryRuleWeight() throws RecognitionException {
        try {
            // InternalRecipeDSL.g:204:1: ( ruleWeight EOF )
            // InternalRecipeDSL.g:205:1: ruleWeight EOF
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
    // InternalRecipeDSL.g:212:1: ruleWeight : ( ( rule__Weight__Group__0 ) ) ;
    public final void ruleWeight() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:216:2: ( ( ( rule__Weight__Group__0 ) ) )
            // InternalRecipeDSL.g:217:2: ( ( rule__Weight__Group__0 ) )
            {
            // InternalRecipeDSL.g:217:2: ( ( rule__Weight__Group__0 ) )
            // InternalRecipeDSL.g:218:3: ( rule__Weight__Group__0 )
            {
             before(grammarAccess.getWeightAccess().getGroup()); 
            // InternalRecipeDSL.g:219:3: ( rule__Weight__Group__0 )
            // InternalRecipeDSL.g:219:4: rule__Weight__Group__0
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
    // InternalRecipeDSL.g:228:1: entryRuleCount : ruleCount EOF ;
    public final void entryRuleCount() throws RecognitionException {
        try {
            // InternalRecipeDSL.g:229:1: ( ruleCount EOF )
            // InternalRecipeDSL.g:230:1: ruleCount EOF
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
    // InternalRecipeDSL.g:237:1: ruleCount : ( ( rule__Count__Group__0 ) ) ;
    public final void ruleCount() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:241:2: ( ( ( rule__Count__Group__0 ) ) )
            // InternalRecipeDSL.g:242:2: ( ( rule__Count__Group__0 ) )
            {
            // InternalRecipeDSL.g:242:2: ( ( rule__Count__Group__0 ) )
            // InternalRecipeDSL.g:243:3: ( rule__Count__Group__0 )
            {
             before(grammarAccess.getCountAccess().getGroup()); 
            // InternalRecipeDSL.g:244:3: ( rule__Count__Group__0 )
            // InternalRecipeDSL.g:244:4: rule__Count__Group__0
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
    // InternalRecipeDSL.g:253:1: entryRuleDevice : ruleDevice EOF ;
    public final void entryRuleDevice() throws RecognitionException {
        try {
            // InternalRecipeDSL.g:254:1: ( ruleDevice EOF )
            // InternalRecipeDSL.g:255:1: ruleDevice EOF
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
    // InternalRecipeDSL.g:262:1: ruleDevice : ( ( rule__Device__Group__0 ) ) ;
    public final void ruleDevice() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:266:2: ( ( ( rule__Device__Group__0 ) ) )
            // InternalRecipeDSL.g:267:2: ( ( rule__Device__Group__0 ) )
            {
            // InternalRecipeDSL.g:267:2: ( ( rule__Device__Group__0 ) )
            // InternalRecipeDSL.g:268:3: ( rule__Device__Group__0 )
            {
             before(grammarAccess.getDeviceAccess().getGroup()); 
            // InternalRecipeDSL.g:269:3: ( rule__Device__Group__0 )
            // InternalRecipeDSL.g:269:4: rule__Device__Group__0
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
    // InternalRecipeDSL.g:278:1: entryRuleCooking : ruleCooking EOF ;
    public final void entryRuleCooking() throws RecognitionException {
        try {
            // InternalRecipeDSL.g:279:1: ( ruleCooking EOF )
            // InternalRecipeDSL.g:280:1: ruleCooking EOF
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
    // InternalRecipeDSL.g:287:1: ruleCooking : ( ( rule__Cooking__Group__0 ) ) ;
    public final void ruleCooking() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:291:2: ( ( ( rule__Cooking__Group__0 ) ) )
            // InternalRecipeDSL.g:292:2: ( ( rule__Cooking__Group__0 ) )
            {
            // InternalRecipeDSL.g:292:2: ( ( rule__Cooking__Group__0 ) )
            // InternalRecipeDSL.g:293:3: ( rule__Cooking__Group__0 )
            {
             before(grammarAccess.getCookingAccess().getGroup()); 
            // InternalRecipeDSL.g:294:3: ( rule__Cooking__Group__0 )
            // InternalRecipeDSL.g:294:4: rule__Cooking__Group__0
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
    // InternalRecipeDSL.g:303:1: entryRuleTime : ruleTime EOF ;
    public final void entryRuleTime() throws RecognitionException {
        try {
            // InternalRecipeDSL.g:304:1: ( ruleTime EOF )
            // InternalRecipeDSL.g:305:1: ruleTime EOF
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
    // InternalRecipeDSL.g:312:1: ruleTime : ( ( rule__Time__Group__0 ) ) ;
    public final void ruleTime() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:316:2: ( ( ( rule__Time__Group__0 ) ) )
            // InternalRecipeDSL.g:317:2: ( ( rule__Time__Group__0 ) )
            {
            // InternalRecipeDSL.g:317:2: ( ( rule__Time__Group__0 ) )
            // InternalRecipeDSL.g:318:3: ( rule__Time__Group__0 )
            {
             before(grammarAccess.getTimeAccess().getGroup()); 
            // InternalRecipeDSL.g:319:3: ( rule__Time__Group__0 )
            // InternalRecipeDSL.g:319:4: rule__Time__Group__0
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
    // InternalRecipeDSL.g:328:1: entryRuleStep : ruleStep EOF ;
    public final void entryRuleStep() throws RecognitionException {
        try {
            // InternalRecipeDSL.g:329:1: ( ruleStep EOF )
            // InternalRecipeDSL.g:330:1: ruleStep EOF
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
    // InternalRecipeDSL.g:337:1: ruleStep : ( ( rule__Step__Group__0 ) ) ;
    public final void ruleStep() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:341:2: ( ( ( rule__Step__Group__0 ) ) )
            // InternalRecipeDSL.g:342:2: ( ( rule__Step__Group__0 ) )
            {
            // InternalRecipeDSL.g:342:2: ( ( rule__Step__Group__0 ) )
            // InternalRecipeDSL.g:343:3: ( rule__Step__Group__0 )
            {
             before(grammarAccess.getStepAccess().getGroup()); 
            // InternalRecipeDSL.g:344:3: ( rule__Step__Group__0 )
            // InternalRecipeDSL.g:344:4: rule__Step__Group__0
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


    // $ANTLR start "entryRuleEFloat"
    // InternalRecipeDSL.g:353:1: entryRuleEFloat : ruleEFloat EOF ;
    public final void entryRuleEFloat() throws RecognitionException {
        try {
            // InternalRecipeDSL.g:354:1: ( ruleEFloat EOF )
            // InternalRecipeDSL.g:355:1: ruleEFloat EOF
            {
             before(grammarAccess.getEFloatRule()); 
            pushFollow(FOLLOW_1);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getEFloatRule()); 
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
    // $ANTLR end "entryRuleEFloat"


    // $ANTLR start "ruleEFloat"
    // InternalRecipeDSL.g:362:1: ruleEFloat : ( ( rule__EFloat__Group__0 ) ) ;
    public final void ruleEFloat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:366:2: ( ( ( rule__EFloat__Group__0 ) ) )
            // InternalRecipeDSL.g:367:2: ( ( rule__EFloat__Group__0 ) )
            {
            // InternalRecipeDSL.g:367:2: ( ( rule__EFloat__Group__0 ) )
            // InternalRecipeDSL.g:368:3: ( rule__EFloat__Group__0 )
            {
             before(grammarAccess.getEFloatAccess().getGroup()); 
            // InternalRecipeDSL.g:369:3: ( rule__EFloat__Group__0 )
            // InternalRecipeDSL.g:369:4: rule__EFloat__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEFloatAccess().getGroup()); 

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
    // $ANTLR end "ruleEFloat"


    // $ANTLR start "rule__Ingredient__Alternatives"
    // InternalRecipeDSL.g:377:1: rule__Ingredient__Alternatives : ( ( ( rule__Ingredient__Group_0__0 ) ) | ( ruleCount ) );
    public final void rule__Ingredient__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:381:1: ( ( ( rule__Ingredient__Group_0__0 ) ) | ( ruleCount ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==27) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_INT) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalRecipeDSL.g:382:2: ( ( rule__Ingredient__Group_0__0 ) )
                    {
                    // InternalRecipeDSL.g:382:2: ( ( rule__Ingredient__Group_0__0 ) )
                    // InternalRecipeDSL.g:383:3: ( rule__Ingredient__Group_0__0 )
                    {
                     before(grammarAccess.getIngredientAccess().getGroup_0()); 
                    // InternalRecipeDSL.g:384:3: ( rule__Ingredient__Group_0__0 )
                    // InternalRecipeDSL.g:384:4: rule__Ingredient__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Ingredient__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getIngredientAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRecipeDSL.g:388:2: ( ruleCount )
                    {
                    // InternalRecipeDSL.g:388:2: ( ruleCount )
                    // InternalRecipeDSL.g:389:3: ruleCount
                    {
                     before(grammarAccess.getIngredientAccess().getCountParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCount();

                    state._fsp--;

                     after(grammarAccess.getIngredientAccess().getCountParserRuleCall_1()); 

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
    // $ANTLR end "rule__Ingredient__Alternatives"


    // $ANTLR start "rule__Weight__Alternatives_1"
    // InternalRecipeDSL.g:398:1: rule__Weight__Alternatives_1 : ( ( 'mg' ) | ( 'g' ) | ( 'kg' ) | ( 't' ) );
    public final void rule__Weight__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:402:1: ( ( 'mg' ) | ( 'g' ) | ( 'kg' ) | ( 't' ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt2=1;
                }
                break;
            case 13:
                {
                alt2=2;
                }
                break;
            case 14:
                {
                alt2=3;
                }
                break;
            case 15:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalRecipeDSL.g:403:2: ( 'mg' )
                    {
                    // InternalRecipeDSL.g:403:2: ( 'mg' )
                    // InternalRecipeDSL.g:404:3: 'mg'
                    {
                     before(grammarAccess.getWeightAccess().getMgKeyword_1_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getWeightAccess().getMgKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRecipeDSL.g:409:2: ( 'g' )
                    {
                    // InternalRecipeDSL.g:409:2: ( 'g' )
                    // InternalRecipeDSL.g:410:3: 'g'
                    {
                     before(grammarAccess.getWeightAccess().getGKeyword_1_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getWeightAccess().getGKeyword_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRecipeDSL.g:415:2: ( 'kg' )
                    {
                    // InternalRecipeDSL.g:415:2: ( 'kg' )
                    // InternalRecipeDSL.g:416:3: 'kg'
                    {
                     before(grammarAccess.getWeightAccess().getKgKeyword_1_2()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getWeightAccess().getKgKeyword_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRecipeDSL.g:421:2: ( 't' )
                    {
                    // InternalRecipeDSL.g:421:2: ( 't' )
                    // InternalRecipeDSL.g:422:3: 't'
                    {
                     before(grammarAccess.getWeightAccess().getTKeyword_1_3()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getWeightAccess().getTKeyword_1_3()); 

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
    // $ANTLR end "rule__Weight__Alternatives_1"


    // $ANTLR start "rule__Time__Alternatives_2"
    // InternalRecipeDSL.g:431:1: rule__Time__Alternatives_2 : ( ( 'sec' ) | ( 'min' ) | ( 'h' ) | ( 'd' ) );
    public final void rule__Time__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:435:1: ( ( 'sec' ) | ( 'min' ) | ( 'h' ) | ( 'd' ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt3=1;
                }
                break;
            case 17:
                {
                alt3=2;
                }
                break;
            case 18:
                {
                alt3=3;
                }
                break;
            case 19:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalRecipeDSL.g:436:2: ( 'sec' )
                    {
                    // InternalRecipeDSL.g:436:2: ( 'sec' )
                    // InternalRecipeDSL.g:437:3: 'sec'
                    {
                     before(grammarAccess.getTimeAccess().getSecKeyword_2_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getTimeAccess().getSecKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRecipeDSL.g:442:2: ( 'min' )
                    {
                    // InternalRecipeDSL.g:442:2: ( 'min' )
                    // InternalRecipeDSL.g:443:3: 'min'
                    {
                     before(grammarAccess.getTimeAccess().getMinKeyword_2_1()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getTimeAccess().getMinKeyword_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRecipeDSL.g:448:2: ( 'h' )
                    {
                    // InternalRecipeDSL.g:448:2: ( 'h' )
                    // InternalRecipeDSL.g:449:3: 'h'
                    {
                     before(grammarAccess.getTimeAccess().getHKeyword_2_2()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getTimeAccess().getHKeyword_2_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRecipeDSL.g:454:2: ( 'd' )
                    {
                    // InternalRecipeDSL.g:454:2: ( 'd' )
                    // InternalRecipeDSL.g:455:3: 'd'
                    {
                     before(grammarAccess.getTimeAccess().getDKeyword_2_3()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getTimeAccess().getDKeyword_2_3()); 

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
    // $ANTLR end "rule__Time__Alternatives_2"


    // $ANTLR start "rule__EFloat__Alternatives_4_0"
    // InternalRecipeDSL.g:464:1: rule__EFloat__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EFloat__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:468:1: ( ( 'E' ) | ( 'e' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            else if ( (LA4_0==21) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalRecipeDSL.g:469:2: ( 'E' )
                    {
                    // InternalRecipeDSL.g:469:2: ( 'E' )
                    // InternalRecipeDSL.g:470:3: 'E'
                    {
                     before(grammarAccess.getEFloatAccess().getEKeyword_4_0_0()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getEFloatAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRecipeDSL.g:475:2: ( 'e' )
                    {
                    // InternalRecipeDSL.g:475:2: ( 'e' )
                    // InternalRecipeDSL.g:476:3: 'e'
                    {
                     before(grammarAccess.getEFloatAccess().getEKeyword_4_0_1()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getEFloatAccess().getEKeyword_4_0_1()); 

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
    // $ANTLR end "rule__EFloat__Alternatives_4_0"


    // $ANTLR start "rule__Manager__Group__0"
    // InternalRecipeDSL.g:485:1: rule__Manager__Group__0 : rule__Manager__Group__0__Impl rule__Manager__Group__1 ;
    public final void rule__Manager__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:489:1: ( rule__Manager__Group__0__Impl rule__Manager__Group__1 )
            // InternalRecipeDSL.g:490:2: rule__Manager__Group__0__Impl rule__Manager__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Manager__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Manager__Group__1();

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
    // $ANTLR end "rule__Manager__Group__0"


    // $ANTLR start "rule__Manager__Group__0__Impl"
    // InternalRecipeDSL.g:497:1: rule__Manager__Group__0__Impl : ( 'Recipebook' ) ;
    public final void rule__Manager__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:501:1: ( ( 'Recipebook' ) )
            // InternalRecipeDSL.g:502:1: ( 'Recipebook' )
            {
            // InternalRecipeDSL.g:502:1: ( 'Recipebook' )
            // InternalRecipeDSL.g:503:2: 'Recipebook'
            {
             before(grammarAccess.getManagerAccess().getRecipebookKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getManagerAccess().getRecipebookKeyword_0()); 

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
    // $ANTLR end "rule__Manager__Group__0__Impl"


    // $ANTLR start "rule__Manager__Group__1"
    // InternalRecipeDSL.g:512:1: rule__Manager__Group__1 : rule__Manager__Group__1__Impl rule__Manager__Group__2 ;
    public final void rule__Manager__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:516:1: ( rule__Manager__Group__1__Impl rule__Manager__Group__2 )
            // InternalRecipeDSL.g:517:2: rule__Manager__Group__1__Impl rule__Manager__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Manager__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Manager__Group__2();

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
    // $ANTLR end "rule__Manager__Group__1"


    // $ANTLR start "rule__Manager__Group__1__Impl"
    // InternalRecipeDSL.g:524:1: rule__Manager__Group__1__Impl : ( ( rule__Manager__NameAssignment_1 ) ) ;
    public final void rule__Manager__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:528:1: ( ( ( rule__Manager__NameAssignment_1 ) ) )
            // InternalRecipeDSL.g:529:1: ( ( rule__Manager__NameAssignment_1 ) )
            {
            // InternalRecipeDSL.g:529:1: ( ( rule__Manager__NameAssignment_1 ) )
            // InternalRecipeDSL.g:530:2: ( rule__Manager__NameAssignment_1 )
            {
             before(grammarAccess.getManagerAccess().getNameAssignment_1()); 
            // InternalRecipeDSL.g:531:2: ( rule__Manager__NameAssignment_1 )
            // InternalRecipeDSL.g:531:3: rule__Manager__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Manager__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getManagerAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Manager__Group__1__Impl"


    // $ANTLR start "rule__Manager__Group__2"
    // InternalRecipeDSL.g:539:1: rule__Manager__Group__2 : rule__Manager__Group__2__Impl rule__Manager__Group__3 ;
    public final void rule__Manager__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:543:1: ( rule__Manager__Group__2__Impl rule__Manager__Group__3 )
            // InternalRecipeDSL.g:544:2: rule__Manager__Group__2__Impl rule__Manager__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Manager__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Manager__Group__3();

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
    // $ANTLR end "rule__Manager__Group__2"


    // $ANTLR start "rule__Manager__Group__2__Impl"
    // InternalRecipeDSL.g:551:1: rule__Manager__Group__2__Impl : ( 'from' ) ;
    public final void rule__Manager__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:555:1: ( ( 'from' ) )
            // InternalRecipeDSL.g:556:1: ( 'from' )
            {
            // InternalRecipeDSL.g:556:1: ( 'from' )
            // InternalRecipeDSL.g:557:2: 'from'
            {
             before(grammarAccess.getManagerAccess().getFromKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getManagerAccess().getFromKeyword_2()); 

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
    // $ANTLR end "rule__Manager__Group__2__Impl"


    // $ANTLR start "rule__Manager__Group__3"
    // InternalRecipeDSL.g:566:1: rule__Manager__Group__3 : rule__Manager__Group__3__Impl rule__Manager__Group__4 ;
    public final void rule__Manager__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:570:1: ( rule__Manager__Group__3__Impl rule__Manager__Group__4 )
            // InternalRecipeDSL.g:571:2: rule__Manager__Group__3__Impl rule__Manager__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Manager__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Manager__Group__4();

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
    // $ANTLR end "rule__Manager__Group__3"


    // $ANTLR start "rule__Manager__Group__3__Impl"
    // InternalRecipeDSL.g:578:1: rule__Manager__Group__3__Impl : ( ( rule__Manager__UserAssignment_3 ) ) ;
    public final void rule__Manager__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:582:1: ( ( ( rule__Manager__UserAssignment_3 ) ) )
            // InternalRecipeDSL.g:583:1: ( ( rule__Manager__UserAssignment_3 ) )
            {
            // InternalRecipeDSL.g:583:1: ( ( rule__Manager__UserAssignment_3 ) )
            // InternalRecipeDSL.g:584:2: ( rule__Manager__UserAssignment_3 )
            {
             before(grammarAccess.getManagerAccess().getUserAssignment_3()); 
            // InternalRecipeDSL.g:585:2: ( rule__Manager__UserAssignment_3 )
            // InternalRecipeDSL.g:585:3: rule__Manager__UserAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Manager__UserAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getManagerAccess().getUserAssignment_3()); 

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
    // $ANTLR end "rule__Manager__Group__3__Impl"


    // $ANTLR start "rule__Manager__Group__4"
    // InternalRecipeDSL.g:593:1: rule__Manager__Group__4 : rule__Manager__Group__4__Impl rule__Manager__Group__5 ;
    public final void rule__Manager__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:597:1: ( rule__Manager__Group__4__Impl rule__Manager__Group__5 )
            // InternalRecipeDSL.g:598:2: rule__Manager__Group__4__Impl rule__Manager__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__Manager__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Manager__Group__5();

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
    // $ANTLR end "rule__Manager__Group__4"


    // $ANTLR start "rule__Manager__Group__4__Impl"
    // InternalRecipeDSL.g:605:1: rule__Manager__Group__4__Impl : ( ( rule__Manager__Group_4__0 )* ) ;
    public final void rule__Manager__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:609:1: ( ( ( rule__Manager__Group_4__0 )* ) )
            // InternalRecipeDSL.g:610:1: ( ( rule__Manager__Group_4__0 )* )
            {
            // InternalRecipeDSL.g:610:1: ( ( rule__Manager__Group_4__0 )* )
            // InternalRecipeDSL.g:611:2: ( rule__Manager__Group_4__0 )*
            {
             before(grammarAccess.getManagerAccess().getGroup_4()); 
            // InternalRecipeDSL.g:612:2: ( rule__Manager__Group_4__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==24) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalRecipeDSL.g:612:3: rule__Manager__Group_4__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Manager__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getManagerAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Manager__Group__4__Impl"


    // $ANTLR start "rule__Manager__Group__5"
    // InternalRecipeDSL.g:620:1: rule__Manager__Group__5 : rule__Manager__Group__5__Impl ;
    public final void rule__Manager__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:624:1: ( rule__Manager__Group__5__Impl )
            // InternalRecipeDSL.g:625:2: rule__Manager__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Manager__Group__5__Impl();

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
    // $ANTLR end "rule__Manager__Group__5"


    // $ANTLR start "rule__Manager__Group__5__Impl"
    // InternalRecipeDSL.g:631:1: rule__Manager__Group__5__Impl : ( ( rule__Manager__RecipesAssignment_5 )* ) ;
    public final void rule__Manager__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:635:1: ( ( ( rule__Manager__RecipesAssignment_5 )* ) )
            // InternalRecipeDSL.g:636:1: ( ( rule__Manager__RecipesAssignment_5 )* )
            {
            // InternalRecipeDSL.g:636:1: ( ( rule__Manager__RecipesAssignment_5 )* )
            // InternalRecipeDSL.g:637:2: ( rule__Manager__RecipesAssignment_5 )*
            {
             before(grammarAccess.getManagerAccess().getRecipesAssignment_5()); 
            // InternalRecipeDSL.g:638:2: ( rule__Manager__RecipesAssignment_5 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==25) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalRecipeDSL.g:638:3: rule__Manager__RecipesAssignment_5
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Manager__RecipesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getManagerAccess().getRecipesAssignment_5()); 

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
    // $ANTLR end "rule__Manager__Group__5__Impl"


    // $ANTLR start "rule__Manager__Group_4__0"
    // InternalRecipeDSL.g:647:1: rule__Manager__Group_4__0 : rule__Manager__Group_4__0__Impl rule__Manager__Group_4__1 ;
    public final void rule__Manager__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:651:1: ( rule__Manager__Group_4__0__Impl rule__Manager__Group_4__1 )
            // InternalRecipeDSL.g:652:2: rule__Manager__Group_4__0__Impl rule__Manager__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__Manager__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Manager__Group_4__1();

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
    // $ANTLR end "rule__Manager__Group_4__0"


    // $ANTLR start "rule__Manager__Group_4__0__Impl"
    // InternalRecipeDSL.g:659:1: rule__Manager__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Manager__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:663:1: ( ( ',' ) )
            // InternalRecipeDSL.g:664:1: ( ',' )
            {
            // InternalRecipeDSL.g:664:1: ( ',' )
            // InternalRecipeDSL.g:665:2: ','
            {
             before(grammarAccess.getManagerAccess().getCommaKeyword_4_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getManagerAccess().getCommaKeyword_4_0()); 

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
    // $ANTLR end "rule__Manager__Group_4__0__Impl"


    // $ANTLR start "rule__Manager__Group_4__1"
    // InternalRecipeDSL.g:674:1: rule__Manager__Group_4__1 : rule__Manager__Group_4__1__Impl ;
    public final void rule__Manager__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:678:1: ( rule__Manager__Group_4__1__Impl )
            // InternalRecipeDSL.g:679:2: rule__Manager__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Manager__Group_4__1__Impl();

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
    // $ANTLR end "rule__Manager__Group_4__1"


    // $ANTLR start "rule__Manager__Group_4__1__Impl"
    // InternalRecipeDSL.g:685:1: rule__Manager__Group_4__1__Impl : ( ( rule__Manager__UserAssignment_4_1 ) ) ;
    public final void rule__Manager__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:689:1: ( ( ( rule__Manager__UserAssignment_4_1 ) ) )
            // InternalRecipeDSL.g:690:1: ( ( rule__Manager__UserAssignment_4_1 ) )
            {
            // InternalRecipeDSL.g:690:1: ( ( rule__Manager__UserAssignment_4_1 ) )
            // InternalRecipeDSL.g:691:2: ( rule__Manager__UserAssignment_4_1 )
            {
             before(grammarAccess.getManagerAccess().getUserAssignment_4_1()); 
            // InternalRecipeDSL.g:692:2: ( rule__Manager__UserAssignment_4_1 )
            // InternalRecipeDSL.g:692:3: rule__Manager__UserAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Manager__UserAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getManagerAccess().getUserAssignment_4_1()); 

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
    // $ANTLR end "rule__Manager__Group_4__1__Impl"


    // $ANTLR start "rule__Recipe__Group__0"
    // InternalRecipeDSL.g:701:1: rule__Recipe__Group__0 : rule__Recipe__Group__0__Impl rule__Recipe__Group__1 ;
    public final void rule__Recipe__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:705:1: ( rule__Recipe__Group__0__Impl rule__Recipe__Group__1 )
            // InternalRecipeDSL.g:706:2: rule__Recipe__Group__0__Impl rule__Recipe__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalRecipeDSL.g:713:1: rule__Recipe__Group__0__Impl : ( 'Recipe' ) ;
    public final void rule__Recipe__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:717:1: ( ( 'Recipe' ) )
            // InternalRecipeDSL.g:718:1: ( 'Recipe' )
            {
            // InternalRecipeDSL.g:718:1: ( 'Recipe' )
            // InternalRecipeDSL.g:719:2: 'Recipe'
            {
             before(grammarAccess.getRecipeAccess().getRecipeKeyword_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalRecipeDSL.g:728:1: rule__Recipe__Group__1 : rule__Recipe__Group__1__Impl rule__Recipe__Group__2 ;
    public final void rule__Recipe__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:732:1: ( rule__Recipe__Group__1__Impl rule__Recipe__Group__2 )
            // InternalRecipeDSL.g:733:2: rule__Recipe__Group__1__Impl rule__Recipe__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalRecipeDSL.g:740:1: rule__Recipe__Group__1__Impl : ( ( rule__Recipe__NameAssignment_1 ) ) ;
    public final void rule__Recipe__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:744:1: ( ( ( rule__Recipe__NameAssignment_1 ) ) )
            // InternalRecipeDSL.g:745:1: ( ( rule__Recipe__NameAssignment_1 ) )
            {
            // InternalRecipeDSL.g:745:1: ( ( rule__Recipe__NameAssignment_1 ) )
            // InternalRecipeDSL.g:746:2: ( rule__Recipe__NameAssignment_1 )
            {
             before(grammarAccess.getRecipeAccess().getNameAssignment_1()); 
            // InternalRecipeDSL.g:747:2: ( rule__Recipe__NameAssignment_1 )
            // InternalRecipeDSL.g:747:3: rule__Recipe__NameAssignment_1
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
    // InternalRecipeDSL.g:755:1: rule__Recipe__Group__2 : rule__Recipe__Group__2__Impl rule__Recipe__Group__3 ;
    public final void rule__Recipe__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:759:1: ( rule__Recipe__Group__2__Impl rule__Recipe__Group__3 )
            // InternalRecipeDSL.g:760:2: rule__Recipe__Group__2__Impl rule__Recipe__Group__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalRecipeDSL.g:767:1: rule__Recipe__Group__2__Impl : ( ( rule__Recipe__LevelAssignment_2 ) ) ;
    public final void rule__Recipe__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:771:1: ( ( ( rule__Recipe__LevelAssignment_2 ) ) )
            // InternalRecipeDSL.g:772:1: ( ( rule__Recipe__LevelAssignment_2 ) )
            {
            // InternalRecipeDSL.g:772:1: ( ( rule__Recipe__LevelAssignment_2 ) )
            // InternalRecipeDSL.g:773:2: ( rule__Recipe__LevelAssignment_2 )
            {
             before(grammarAccess.getRecipeAccess().getLevelAssignment_2()); 
            // InternalRecipeDSL.g:774:2: ( rule__Recipe__LevelAssignment_2 )
            // InternalRecipeDSL.g:774:3: rule__Recipe__LevelAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Recipe__LevelAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getLevelAssignment_2()); 

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
    // InternalRecipeDSL.g:782:1: rule__Recipe__Group__3 : rule__Recipe__Group__3__Impl rule__Recipe__Group__4 ;
    public final void rule__Recipe__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:786:1: ( rule__Recipe__Group__3__Impl rule__Recipe__Group__4 )
            // InternalRecipeDSL.g:787:2: rule__Recipe__Group__3__Impl rule__Recipe__Group__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalRecipeDSL.g:794:1: rule__Recipe__Group__3__Impl : ( ( ( rule__Recipe__IngredientAssignment_3 ) ) ( ( rule__Recipe__IngredientAssignment_3 )* ) ) ;
    public final void rule__Recipe__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:798:1: ( ( ( ( rule__Recipe__IngredientAssignment_3 ) ) ( ( rule__Recipe__IngredientAssignment_3 )* ) ) )
            // InternalRecipeDSL.g:799:1: ( ( ( rule__Recipe__IngredientAssignment_3 ) ) ( ( rule__Recipe__IngredientAssignment_3 )* ) )
            {
            // InternalRecipeDSL.g:799:1: ( ( ( rule__Recipe__IngredientAssignment_3 ) ) ( ( rule__Recipe__IngredientAssignment_3 )* ) )
            // InternalRecipeDSL.g:800:2: ( ( rule__Recipe__IngredientAssignment_3 ) ) ( ( rule__Recipe__IngredientAssignment_3 )* )
            {
            // InternalRecipeDSL.g:800:2: ( ( rule__Recipe__IngredientAssignment_3 ) )
            // InternalRecipeDSL.g:801:3: ( rule__Recipe__IngredientAssignment_3 )
            {
             before(grammarAccess.getRecipeAccess().getIngredientAssignment_3()); 
            // InternalRecipeDSL.g:802:3: ( rule__Recipe__IngredientAssignment_3 )
            // InternalRecipeDSL.g:802:4: rule__Recipe__IngredientAssignment_3
            {
            pushFollow(FOLLOW_11);
            rule__Recipe__IngredientAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getIngredientAssignment_3()); 

            }

            // InternalRecipeDSL.g:805:2: ( ( rule__Recipe__IngredientAssignment_3 )* )
            // InternalRecipeDSL.g:806:3: ( rule__Recipe__IngredientAssignment_3 )*
            {
             before(grammarAccess.getRecipeAccess().getIngredientAssignment_3()); 
            // InternalRecipeDSL.g:807:3: ( rule__Recipe__IngredientAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_INT||LA7_0==27) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalRecipeDSL.g:807:4: rule__Recipe__IngredientAssignment_3
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Recipe__IngredientAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getRecipeAccess().getIngredientAssignment_3()); 

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
    // InternalRecipeDSL.g:816:1: rule__Recipe__Group__4 : rule__Recipe__Group__4__Impl rule__Recipe__Group__5 ;
    public final void rule__Recipe__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:820:1: ( rule__Recipe__Group__4__Impl rule__Recipe__Group__5 )
            // InternalRecipeDSL.g:821:2: rule__Recipe__Group__4__Impl rule__Recipe__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Recipe__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group__5();

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
    // InternalRecipeDSL.g:828:1: rule__Recipe__Group__4__Impl : ( ( ( rule__Recipe__DeviceAssignment_4 ) ) ( ( rule__Recipe__DeviceAssignment_4 )* ) ) ;
    public final void rule__Recipe__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:832:1: ( ( ( ( rule__Recipe__DeviceAssignment_4 ) ) ( ( rule__Recipe__DeviceAssignment_4 )* ) ) )
            // InternalRecipeDSL.g:833:1: ( ( ( rule__Recipe__DeviceAssignment_4 ) ) ( ( rule__Recipe__DeviceAssignment_4 )* ) )
            {
            // InternalRecipeDSL.g:833:1: ( ( ( rule__Recipe__DeviceAssignment_4 ) ) ( ( rule__Recipe__DeviceAssignment_4 )* ) )
            // InternalRecipeDSL.g:834:2: ( ( rule__Recipe__DeviceAssignment_4 ) ) ( ( rule__Recipe__DeviceAssignment_4 )* )
            {
            // InternalRecipeDSL.g:834:2: ( ( rule__Recipe__DeviceAssignment_4 ) )
            // InternalRecipeDSL.g:835:3: ( rule__Recipe__DeviceAssignment_4 )
            {
             before(grammarAccess.getRecipeAccess().getDeviceAssignment_4()); 
            // InternalRecipeDSL.g:836:3: ( rule__Recipe__DeviceAssignment_4 )
            // InternalRecipeDSL.g:836:4: rule__Recipe__DeviceAssignment_4
            {
            pushFollow(FOLLOW_13);
            rule__Recipe__DeviceAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getDeviceAssignment_4()); 

            }

            // InternalRecipeDSL.g:839:2: ( ( rule__Recipe__DeviceAssignment_4 )* )
            // InternalRecipeDSL.g:840:3: ( rule__Recipe__DeviceAssignment_4 )*
            {
             before(grammarAccess.getRecipeAccess().getDeviceAssignment_4()); 
            // InternalRecipeDSL.g:841:3: ( rule__Recipe__DeviceAssignment_4 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==30) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalRecipeDSL.g:841:4: rule__Recipe__DeviceAssignment_4
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Recipe__DeviceAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getRecipeAccess().getDeviceAssignment_4()); 

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


    // $ANTLR start "rule__Recipe__Group__5"
    // InternalRecipeDSL.g:850:1: rule__Recipe__Group__5 : rule__Recipe__Group__5__Impl ;
    public final void rule__Recipe__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:854:1: ( rule__Recipe__Group__5__Impl )
            // InternalRecipeDSL.g:855:2: rule__Recipe__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Recipe__Group__5__Impl();

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
    // $ANTLR end "rule__Recipe__Group__5"


    // $ANTLR start "rule__Recipe__Group__5__Impl"
    // InternalRecipeDSL.g:861:1: rule__Recipe__Group__5__Impl : ( ( ( rule__Recipe__CookingAssignment_5 ) ) ( ( rule__Recipe__CookingAssignment_5 )* ) ) ;
    public final void rule__Recipe__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:865:1: ( ( ( ( rule__Recipe__CookingAssignment_5 ) ) ( ( rule__Recipe__CookingAssignment_5 )* ) ) )
            // InternalRecipeDSL.g:866:1: ( ( ( rule__Recipe__CookingAssignment_5 ) ) ( ( rule__Recipe__CookingAssignment_5 )* ) )
            {
            // InternalRecipeDSL.g:866:1: ( ( ( rule__Recipe__CookingAssignment_5 ) ) ( ( rule__Recipe__CookingAssignment_5 )* ) )
            // InternalRecipeDSL.g:867:2: ( ( rule__Recipe__CookingAssignment_5 ) ) ( ( rule__Recipe__CookingAssignment_5 )* )
            {
            // InternalRecipeDSL.g:867:2: ( ( rule__Recipe__CookingAssignment_5 ) )
            // InternalRecipeDSL.g:868:3: ( rule__Recipe__CookingAssignment_5 )
            {
             before(grammarAccess.getRecipeAccess().getCookingAssignment_5()); 
            // InternalRecipeDSL.g:869:3: ( rule__Recipe__CookingAssignment_5 )
            // InternalRecipeDSL.g:869:4: rule__Recipe__CookingAssignment_5
            {
            pushFollow(FOLLOW_14);
            rule__Recipe__CookingAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getCookingAssignment_5()); 

            }

            // InternalRecipeDSL.g:872:2: ( ( rule__Recipe__CookingAssignment_5 )* )
            // InternalRecipeDSL.g:873:3: ( rule__Recipe__CookingAssignment_5 )*
            {
             before(grammarAccess.getRecipeAccess().getCookingAssignment_5()); 
            // InternalRecipeDSL.g:874:3: ( rule__Recipe__CookingAssignment_5 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==31) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalRecipeDSL.g:874:4: rule__Recipe__CookingAssignment_5
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Recipe__CookingAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getRecipeAccess().getCookingAssignment_5()); 

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
    // $ANTLR end "rule__Recipe__Group__5__Impl"


    // $ANTLR start "rule__Level__Group__0"
    // InternalRecipeDSL.g:884:1: rule__Level__Group__0 : rule__Level__Group__0__Impl rule__Level__Group__1 ;
    public final void rule__Level__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:888:1: ( rule__Level__Group__0__Impl rule__Level__Group__1 )
            // InternalRecipeDSL.g:889:2: rule__Level__Group__0__Impl rule__Level__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Level__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Level__Group__1();

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
    // $ANTLR end "rule__Level__Group__0"


    // $ANTLR start "rule__Level__Group__0__Impl"
    // InternalRecipeDSL.g:896:1: rule__Level__Group__0__Impl : ( 'Level' ) ;
    public final void rule__Level__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:900:1: ( ( 'Level' ) )
            // InternalRecipeDSL.g:901:1: ( 'Level' )
            {
            // InternalRecipeDSL.g:901:1: ( 'Level' )
            // InternalRecipeDSL.g:902:2: 'Level'
            {
             before(grammarAccess.getLevelAccess().getLevelKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getLevelAccess().getLevelKeyword_0()); 

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
    // $ANTLR end "rule__Level__Group__0__Impl"


    // $ANTLR start "rule__Level__Group__1"
    // InternalRecipeDSL.g:911:1: rule__Level__Group__1 : rule__Level__Group__1__Impl ;
    public final void rule__Level__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:915:1: ( rule__Level__Group__1__Impl )
            // InternalRecipeDSL.g:916:2: rule__Level__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Level__Group__1__Impl();

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
    // $ANTLR end "rule__Level__Group__1"


    // $ANTLR start "rule__Level__Group__1__Impl"
    // InternalRecipeDSL.g:922:1: rule__Level__Group__1__Impl : ( ( rule__Level__RatingAssignment_1 ) ) ;
    public final void rule__Level__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:926:1: ( ( ( rule__Level__RatingAssignment_1 ) ) )
            // InternalRecipeDSL.g:927:1: ( ( rule__Level__RatingAssignment_1 ) )
            {
            // InternalRecipeDSL.g:927:1: ( ( rule__Level__RatingAssignment_1 ) )
            // InternalRecipeDSL.g:928:2: ( rule__Level__RatingAssignment_1 )
            {
             before(grammarAccess.getLevelAccess().getRatingAssignment_1()); 
            // InternalRecipeDSL.g:929:2: ( rule__Level__RatingAssignment_1 )
            // InternalRecipeDSL.g:929:3: rule__Level__RatingAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Level__RatingAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLevelAccess().getRatingAssignment_1()); 

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
    // $ANTLR end "rule__Level__Group__1__Impl"


    // $ANTLR start "rule__Ingredient__Group_0__0"
    // InternalRecipeDSL.g:938:1: rule__Ingredient__Group_0__0 : rule__Ingredient__Group_0__0__Impl rule__Ingredient__Group_0__1 ;
    public final void rule__Ingredient__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:942:1: ( rule__Ingredient__Group_0__0__Impl rule__Ingredient__Group_0__1 )
            // InternalRecipeDSL.g:943:2: rule__Ingredient__Group_0__0__Impl rule__Ingredient__Group_0__1
            {
            pushFollow(FOLLOW_3);
            rule__Ingredient__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ingredient__Group_0__1();

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
    // $ANTLR end "rule__Ingredient__Group_0__0"


    // $ANTLR start "rule__Ingredient__Group_0__0__Impl"
    // InternalRecipeDSL.g:950:1: rule__Ingredient__Group_0__0__Impl : ( 'Ingredient' ) ;
    public final void rule__Ingredient__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:954:1: ( ( 'Ingredient' ) )
            // InternalRecipeDSL.g:955:1: ( 'Ingredient' )
            {
            // InternalRecipeDSL.g:955:1: ( 'Ingredient' )
            // InternalRecipeDSL.g:956:2: 'Ingredient'
            {
             before(grammarAccess.getIngredientAccess().getIngredientKeyword_0_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getIngredientAccess().getIngredientKeyword_0_0()); 

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
    // $ANTLR end "rule__Ingredient__Group_0__0__Impl"


    // $ANTLR start "rule__Ingredient__Group_0__1"
    // InternalRecipeDSL.g:965:1: rule__Ingredient__Group_0__1 : rule__Ingredient__Group_0__1__Impl rule__Ingredient__Group_0__2 ;
    public final void rule__Ingredient__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:969:1: ( rule__Ingredient__Group_0__1__Impl rule__Ingredient__Group_0__2 )
            // InternalRecipeDSL.g:970:2: rule__Ingredient__Group_0__1__Impl rule__Ingredient__Group_0__2
            {
            pushFollow(FOLLOW_16);
            rule__Ingredient__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ingredient__Group_0__2();

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
    // $ANTLR end "rule__Ingredient__Group_0__1"


    // $ANTLR start "rule__Ingredient__Group_0__1__Impl"
    // InternalRecipeDSL.g:977:1: rule__Ingredient__Group_0__1__Impl : ( ( rule__Ingredient__NameAssignment_0_1 ) ) ;
    public final void rule__Ingredient__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:981:1: ( ( ( rule__Ingredient__NameAssignment_0_1 ) ) )
            // InternalRecipeDSL.g:982:1: ( ( rule__Ingredient__NameAssignment_0_1 ) )
            {
            // InternalRecipeDSL.g:982:1: ( ( rule__Ingredient__NameAssignment_0_1 ) )
            // InternalRecipeDSL.g:983:2: ( rule__Ingredient__NameAssignment_0_1 )
            {
             before(grammarAccess.getIngredientAccess().getNameAssignment_0_1()); 
            // InternalRecipeDSL.g:984:2: ( rule__Ingredient__NameAssignment_0_1 )
            // InternalRecipeDSL.g:984:3: rule__Ingredient__NameAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Ingredient__NameAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getIngredientAccess().getNameAssignment_0_1()); 

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
    // $ANTLR end "rule__Ingredient__Group_0__1__Impl"


    // $ANTLR start "rule__Ingredient__Group_0__2"
    // InternalRecipeDSL.g:992:1: rule__Ingredient__Group_0__2 : rule__Ingredient__Group_0__2__Impl rule__Ingredient__Group_0__3 ;
    public final void rule__Ingredient__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:996:1: ( rule__Ingredient__Group_0__2__Impl rule__Ingredient__Group_0__3 )
            // InternalRecipeDSL.g:997:2: rule__Ingredient__Group_0__2__Impl rule__Ingredient__Group_0__3
            {
            pushFollow(FOLLOW_17);
            rule__Ingredient__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ingredient__Group_0__3();

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
    // $ANTLR end "rule__Ingredient__Group_0__2"


    // $ANTLR start "rule__Ingredient__Group_0__2__Impl"
    // InternalRecipeDSL.g:1004:1: rule__Ingredient__Group_0__2__Impl : ( 'amount' ) ;
    public final void rule__Ingredient__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1008:1: ( ( 'amount' ) )
            // InternalRecipeDSL.g:1009:1: ( 'amount' )
            {
            // InternalRecipeDSL.g:1009:1: ( 'amount' )
            // InternalRecipeDSL.g:1010:2: 'amount'
            {
             before(grammarAccess.getIngredientAccess().getAmountKeyword_0_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getIngredientAccess().getAmountKeyword_0_2()); 

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
    // $ANTLR end "rule__Ingredient__Group_0__2__Impl"


    // $ANTLR start "rule__Ingredient__Group_0__3"
    // InternalRecipeDSL.g:1019:1: rule__Ingredient__Group_0__3 : rule__Ingredient__Group_0__3__Impl ;
    public final void rule__Ingredient__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1023:1: ( rule__Ingredient__Group_0__3__Impl )
            // InternalRecipeDSL.g:1024:2: rule__Ingredient__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ingredient__Group_0__3__Impl();

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
    // $ANTLR end "rule__Ingredient__Group_0__3"


    // $ANTLR start "rule__Ingredient__Group_0__3__Impl"
    // InternalRecipeDSL.g:1030:1: rule__Ingredient__Group_0__3__Impl : ( ( rule__Ingredient__MeasureAssignment_0_3 ) ) ;
    public final void rule__Ingredient__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1034:1: ( ( ( rule__Ingredient__MeasureAssignment_0_3 ) ) )
            // InternalRecipeDSL.g:1035:1: ( ( rule__Ingredient__MeasureAssignment_0_3 ) )
            {
            // InternalRecipeDSL.g:1035:1: ( ( rule__Ingredient__MeasureAssignment_0_3 ) )
            // InternalRecipeDSL.g:1036:2: ( rule__Ingredient__MeasureAssignment_0_3 )
            {
             before(grammarAccess.getIngredientAccess().getMeasureAssignment_0_3()); 
            // InternalRecipeDSL.g:1037:2: ( rule__Ingredient__MeasureAssignment_0_3 )
            // InternalRecipeDSL.g:1037:3: rule__Ingredient__MeasureAssignment_0_3
            {
            pushFollow(FOLLOW_2);
            rule__Ingredient__MeasureAssignment_0_3();

            state._fsp--;


            }

             after(grammarAccess.getIngredientAccess().getMeasureAssignment_0_3()); 

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
    // $ANTLR end "rule__Ingredient__Group_0__3__Impl"


    // $ANTLR start "rule__Weight__Group__0"
    // InternalRecipeDSL.g:1046:1: rule__Weight__Group__0 : rule__Weight__Group__0__Impl rule__Weight__Group__1 ;
    public final void rule__Weight__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1050:1: ( rule__Weight__Group__0__Impl rule__Weight__Group__1 )
            // InternalRecipeDSL.g:1051:2: rule__Weight__Group__0__Impl rule__Weight__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalRecipeDSL.g:1058:1: rule__Weight__Group__0__Impl : ( ( rule__Weight__WeightAssignment_0 ) ) ;
    public final void rule__Weight__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1062:1: ( ( ( rule__Weight__WeightAssignment_0 ) ) )
            // InternalRecipeDSL.g:1063:1: ( ( rule__Weight__WeightAssignment_0 ) )
            {
            // InternalRecipeDSL.g:1063:1: ( ( rule__Weight__WeightAssignment_0 ) )
            // InternalRecipeDSL.g:1064:2: ( rule__Weight__WeightAssignment_0 )
            {
             before(grammarAccess.getWeightAccess().getWeightAssignment_0()); 
            // InternalRecipeDSL.g:1065:2: ( rule__Weight__WeightAssignment_0 )
            // InternalRecipeDSL.g:1065:3: rule__Weight__WeightAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Weight__WeightAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getWeightAccess().getWeightAssignment_0()); 

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
    // InternalRecipeDSL.g:1073:1: rule__Weight__Group__1 : rule__Weight__Group__1__Impl ;
    public final void rule__Weight__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1077:1: ( rule__Weight__Group__1__Impl )
            // InternalRecipeDSL.g:1078:2: rule__Weight__Group__1__Impl
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
    // InternalRecipeDSL.g:1084:1: rule__Weight__Group__1__Impl : ( ( rule__Weight__Alternatives_1 ) ) ;
    public final void rule__Weight__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1088:1: ( ( ( rule__Weight__Alternatives_1 ) ) )
            // InternalRecipeDSL.g:1089:1: ( ( rule__Weight__Alternatives_1 ) )
            {
            // InternalRecipeDSL.g:1089:1: ( ( rule__Weight__Alternatives_1 ) )
            // InternalRecipeDSL.g:1090:2: ( rule__Weight__Alternatives_1 )
            {
             before(grammarAccess.getWeightAccess().getAlternatives_1()); 
            // InternalRecipeDSL.g:1091:2: ( rule__Weight__Alternatives_1 )
            // InternalRecipeDSL.g:1091:3: rule__Weight__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Weight__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getWeightAccess().getAlternatives_1()); 

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
    // InternalRecipeDSL.g:1100:1: rule__Count__Group__0 : rule__Count__Group__0__Impl rule__Count__Group__1 ;
    public final void rule__Count__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1104:1: ( rule__Count__Group__0__Impl rule__Count__Group__1 )
            // InternalRecipeDSL.g:1105:2: rule__Count__Group__0__Impl rule__Count__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalRecipeDSL.g:1112:1: rule__Count__Group__0__Impl : ( ( rule__Count__CAssignment_0 ) ) ;
    public final void rule__Count__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1116:1: ( ( ( rule__Count__CAssignment_0 ) ) )
            // InternalRecipeDSL.g:1117:1: ( ( rule__Count__CAssignment_0 ) )
            {
            // InternalRecipeDSL.g:1117:1: ( ( rule__Count__CAssignment_0 ) )
            // InternalRecipeDSL.g:1118:2: ( rule__Count__CAssignment_0 )
            {
             before(grammarAccess.getCountAccess().getCAssignment_0()); 
            // InternalRecipeDSL.g:1119:2: ( rule__Count__CAssignment_0 )
            // InternalRecipeDSL.g:1119:3: rule__Count__CAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Count__CAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCountAccess().getCAssignment_0()); 

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
    // InternalRecipeDSL.g:1127:1: rule__Count__Group__1 : rule__Count__Group__1__Impl ;
    public final void rule__Count__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1131:1: ( rule__Count__Group__1__Impl )
            // InternalRecipeDSL.g:1132:2: rule__Count__Group__1__Impl
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
    // InternalRecipeDSL.g:1138:1: rule__Count__Group__1__Impl : ( 'pieces' ) ;
    public final void rule__Count__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1142:1: ( ( 'pieces' ) )
            // InternalRecipeDSL.g:1143:1: ( 'pieces' )
            {
            // InternalRecipeDSL.g:1143:1: ( 'pieces' )
            // InternalRecipeDSL.g:1144:2: 'pieces'
            {
             before(grammarAccess.getCountAccess().getPiecesKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getCountAccess().getPiecesKeyword_1()); 

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
    // InternalRecipeDSL.g:1154:1: rule__Device__Group__0 : rule__Device__Group__0__Impl rule__Device__Group__1 ;
    public final void rule__Device__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1158:1: ( rule__Device__Group__0__Impl rule__Device__Group__1 )
            // InternalRecipeDSL.g:1159:2: rule__Device__Group__0__Impl rule__Device__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalRecipeDSL.g:1166:1: rule__Device__Group__0__Impl : ( 'Device' ) ;
    public final void rule__Device__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1170:1: ( ( 'Device' ) )
            // InternalRecipeDSL.g:1171:1: ( 'Device' )
            {
            // InternalRecipeDSL.g:1171:1: ( 'Device' )
            // InternalRecipeDSL.g:1172:2: 'Device'
            {
             before(grammarAccess.getDeviceAccess().getDeviceKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalRecipeDSL.g:1181:1: rule__Device__Group__1 : rule__Device__Group__1__Impl ;
    public final void rule__Device__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1185:1: ( rule__Device__Group__1__Impl )
            // InternalRecipeDSL.g:1186:2: rule__Device__Group__1__Impl
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
    // InternalRecipeDSL.g:1192:1: rule__Device__Group__1__Impl : ( ( rule__Device__NameAssignment_1 ) ) ;
    public final void rule__Device__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1196:1: ( ( ( rule__Device__NameAssignment_1 ) ) )
            // InternalRecipeDSL.g:1197:1: ( ( rule__Device__NameAssignment_1 ) )
            {
            // InternalRecipeDSL.g:1197:1: ( ( rule__Device__NameAssignment_1 ) )
            // InternalRecipeDSL.g:1198:2: ( rule__Device__NameAssignment_1 )
            {
             before(grammarAccess.getDeviceAccess().getNameAssignment_1()); 
            // InternalRecipeDSL.g:1199:2: ( rule__Device__NameAssignment_1 )
            // InternalRecipeDSL.g:1199:3: rule__Device__NameAssignment_1
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
    // InternalRecipeDSL.g:1208:1: rule__Cooking__Group__0 : rule__Cooking__Group__0__Impl rule__Cooking__Group__1 ;
    public final void rule__Cooking__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1212:1: ( rule__Cooking__Group__0__Impl rule__Cooking__Group__1 )
            // InternalRecipeDSL.g:1213:2: rule__Cooking__Group__0__Impl rule__Cooking__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalRecipeDSL.g:1220:1: rule__Cooking__Group__0__Impl : ( 'Step' ) ;
    public final void rule__Cooking__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1224:1: ( ( 'Step' ) )
            // InternalRecipeDSL.g:1225:1: ( 'Step' )
            {
            // InternalRecipeDSL.g:1225:1: ( 'Step' )
            // InternalRecipeDSL.g:1226:2: 'Step'
            {
             before(grammarAccess.getCookingAccess().getStepKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getCookingAccess().getStepKeyword_0()); 

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
    // InternalRecipeDSL.g:1235:1: rule__Cooking__Group__1 : rule__Cooking__Group__1__Impl rule__Cooking__Group__2 ;
    public final void rule__Cooking__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1239:1: ( rule__Cooking__Group__1__Impl rule__Cooking__Group__2 )
            // InternalRecipeDSL.g:1240:2: rule__Cooking__Group__1__Impl rule__Cooking__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalRecipeDSL.g:1247:1: rule__Cooking__Group__1__Impl : ( ( rule__Cooking__SAssignment_1 ) ) ;
    public final void rule__Cooking__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1251:1: ( ( ( rule__Cooking__SAssignment_1 ) ) )
            // InternalRecipeDSL.g:1252:1: ( ( rule__Cooking__SAssignment_1 ) )
            {
            // InternalRecipeDSL.g:1252:1: ( ( rule__Cooking__SAssignment_1 ) )
            // InternalRecipeDSL.g:1253:2: ( rule__Cooking__SAssignment_1 )
            {
             before(grammarAccess.getCookingAccess().getSAssignment_1()); 
            // InternalRecipeDSL.g:1254:2: ( rule__Cooking__SAssignment_1 )
            // InternalRecipeDSL.g:1254:3: rule__Cooking__SAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Cooking__SAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCookingAccess().getSAssignment_1()); 

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
    // InternalRecipeDSL.g:1262:1: rule__Cooking__Group__2 : rule__Cooking__Group__2__Impl ;
    public final void rule__Cooking__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1266:1: ( rule__Cooking__Group__2__Impl )
            // InternalRecipeDSL.g:1267:2: rule__Cooking__Group__2__Impl
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
    // InternalRecipeDSL.g:1273:1: rule__Cooking__Group__2__Impl : ( ( rule__Cooking__Group_2__0 ) ) ;
    public final void rule__Cooking__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1277:1: ( ( ( rule__Cooking__Group_2__0 ) ) )
            // InternalRecipeDSL.g:1278:1: ( ( rule__Cooking__Group_2__0 ) )
            {
            // InternalRecipeDSL.g:1278:1: ( ( rule__Cooking__Group_2__0 ) )
            // InternalRecipeDSL.g:1279:2: ( rule__Cooking__Group_2__0 )
            {
             before(grammarAccess.getCookingAccess().getGroup_2()); 
            // InternalRecipeDSL.g:1280:2: ( rule__Cooking__Group_2__0 )
            // InternalRecipeDSL.g:1280:3: rule__Cooking__Group_2__0
            {
            pushFollow(FOLLOW_2);
            rule__Cooking__Group_2__0();

            state._fsp--;


            }

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
    // InternalRecipeDSL.g:1289:1: rule__Cooking__Group_2__0 : rule__Cooking__Group_2__0__Impl rule__Cooking__Group_2__1 ;
    public final void rule__Cooking__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1293:1: ( rule__Cooking__Group_2__0__Impl rule__Cooking__Group_2__1 )
            // InternalRecipeDSL.g:1294:2: rule__Cooking__Group_2__0__Impl rule__Cooking__Group_2__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalRecipeDSL.g:1301:1: rule__Cooking__Group_2__0__Impl : ( ( rule__Cooking__TimeAssignment_2_0 ) ) ;
    public final void rule__Cooking__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1305:1: ( ( ( rule__Cooking__TimeAssignment_2_0 ) ) )
            // InternalRecipeDSL.g:1306:1: ( ( rule__Cooking__TimeAssignment_2_0 ) )
            {
            // InternalRecipeDSL.g:1306:1: ( ( rule__Cooking__TimeAssignment_2_0 ) )
            // InternalRecipeDSL.g:1307:2: ( rule__Cooking__TimeAssignment_2_0 )
            {
             before(grammarAccess.getCookingAccess().getTimeAssignment_2_0()); 
            // InternalRecipeDSL.g:1308:2: ( rule__Cooking__TimeAssignment_2_0 )
            // InternalRecipeDSL.g:1308:3: rule__Cooking__TimeAssignment_2_0
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
    // InternalRecipeDSL.g:1316:1: rule__Cooking__Group_2__1 : rule__Cooking__Group_2__1__Impl rule__Cooking__Group_2__2 ;
    public final void rule__Cooking__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1320:1: ( rule__Cooking__Group_2__1__Impl rule__Cooking__Group_2__2 )
            // InternalRecipeDSL.g:1321:2: rule__Cooking__Group_2__1__Impl rule__Cooking__Group_2__2
            {
            pushFollow(FOLLOW_23);
            rule__Cooking__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cooking__Group_2__2();

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
    // InternalRecipeDSL.g:1328:1: rule__Cooking__Group_2__1__Impl : ( ',' ) ;
    public final void rule__Cooking__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1332:1: ( ( ',' ) )
            // InternalRecipeDSL.g:1333:1: ( ',' )
            {
            // InternalRecipeDSL.g:1333:1: ( ',' )
            // InternalRecipeDSL.g:1334:2: ','
            {
             before(grammarAccess.getCookingAccess().getCommaKeyword_2_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getCookingAccess().getCommaKeyword_2_1()); 

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


    // $ANTLR start "rule__Cooking__Group_2__2"
    // InternalRecipeDSL.g:1343:1: rule__Cooking__Group_2__2 : rule__Cooking__Group_2__2__Impl ;
    public final void rule__Cooking__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1347:1: ( rule__Cooking__Group_2__2__Impl )
            // InternalRecipeDSL.g:1348:2: rule__Cooking__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cooking__Group_2__2__Impl();

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
    // $ANTLR end "rule__Cooking__Group_2__2"


    // $ANTLR start "rule__Cooking__Group_2__2__Impl"
    // InternalRecipeDSL.g:1354:1: rule__Cooking__Group_2__2__Impl : ( ( rule__Cooking__StepAssignment_2_2 ) ) ;
    public final void rule__Cooking__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1358:1: ( ( ( rule__Cooking__StepAssignment_2_2 ) ) )
            // InternalRecipeDSL.g:1359:1: ( ( rule__Cooking__StepAssignment_2_2 ) )
            {
            // InternalRecipeDSL.g:1359:1: ( ( rule__Cooking__StepAssignment_2_2 ) )
            // InternalRecipeDSL.g:1360:2: ( rule__Cooking__StepAssignment_2_2 )
            {
             before(grammarAccess.getCookingAccess().getStepAssignment_2_2()); 
            // InternalRecipeDSL.g:1361:2: ( rule__Cooking__StepAssignment_2_2 )
            // InternalRecipeDSL.g:1361:3: rule__Cooking__StepAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Cooking__StepAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getCookingAccess().getStepAssignment_2_2()); 

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
    // $ANTLR end "rule__Cooking__Group_2__2__Impl"


    // $ANTLR start "rule__Time__Group__0"
    // InternalRecipeDSL.g:1370:1: rule__Time__Group__0 : rule__Time__Group__0__Impl rule__Time__Group__1 ;
    public final void rule__Time__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1374:1: ( rule__Time__Group__0__Impl rule__Time__Group__1 )
            // InternalRecipeDSL.g:1375:2: rule__Time__Group__0__Impl rule__Time__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalRecipeDSL.g:1382:1: rule__Time__Group__0__Impl : ( 'For' ) ;
    public final void rule__Time__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1386:1: ( ( 'For' ) )
            // InternalRecipeDSL.g:1387:1: ( 'For' )
            {
            // InternalRecipeDSL.g:1387:1: ( 'For' )
            // InternalRecipeDSL.g:1388:2: 'For'
            {
             before(grammarAccess.getTimeAccess().getForKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalRecipeDSL.g:1397:1: rule__Time__Group__1 : rule__Time__Group__1__Impl rule__Time__Group__2 ;
    public final void rule__Time__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1401:1: ( rule__Time__Group__1__Impl rule__Time__Group__2 )
            // InternalRecipeDSL.g:1402:2: rule__Time__Group__1__Impl rule__Time__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__Time__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Time__Group__2();

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
    // InternalRecipeDSL.g:1409:1: rule__Time__Group__1__Impl : ( ( rule__Time__TimeAssignment_1 ) ) ;
    public final void rule__Time__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1413:1: ( ( ( rule__Time__TimeAssignment_1 ) ) )
            // InternalRecipeDSL.g:1414:1: ( ( rule__Time__TimeAssignment_1 ) )
            {
            // InternalRecipeDSL.g:1414:1: ( ( rule__Time__TimeAssignment_1 ) )
            // InternalRecipeDSL.g:1415:2: ( rule__Time__TimeAssignment_1 )
            {
             before(grammarAccess.getTimeAccess().getTimeAssignment_1()); 
            // InternalRecipeDSL.g:1416:2: ( rule__Time__TimeAssignment_1 )
            // InternalRecipeDSL.g:1416:3: rule__Time__TimeAssignment_1
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


    // $ANTLR start "rule__Time__Group__2"
    // InternalRecipeDSL.g:1424:1: rule__Time__Group__2 : rule__Time__Group__2__Impl ;
    public final void rule__Time__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1428:1: ( rule__Time__Group__2__Impl )
            // InternalRecipeDSL.g:1429:2: rule__Time__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Time__Group__2__Impl();

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
    // $ANTLR end "rule__Time__Group__2"


    // $ANTLR start "rule__Time__Group__2__Impl"
    // InternalRecipeDSL.g:1435:1: rule__Time__Group__2__Impl : ( ( rule__Time__Alternatives_2 ) ) ;
    public final void rule__Time__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1439:1: ( ( ( rule__Time__Alternatives_2 ) ) )
            // InternalRecipeDSL.g:1440:1: ( ( rule__Time__Alternatives_2 ) )
            {
            // InternalRecipeDSL.g:1440:1: ( ( rule__Time__Alternatives_2 ) )
            // InternalRecipeDSL.g:1441:2: ( rule__Time__Alternatives_2 )
            {
             before(grammarAccess.getTimeAccess().getAlternatives_2()); 
            // InternalRecipeDSL.g:1442:2: ( rule__Time__Alternatives_2 )
            // InternalRecipeDSL.g:1442:3: rule__Time__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__Time__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getTimeAccess().getAlternatives_2()); 

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
    // $ANTLR end "rule__Time__Group__2__Impl"


    // $ANTLR start "rule__Step__Group__0"
    // InternalRecipeDSL.g:1451:1: rule__Step__Group__0 : rule__Step__Group__0__Impl rule__Step__Group__1 ;
    public final void rule__Step__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1455:1: ( rule__Step__Group__0__Impl rule__Step__Group__1 )
            // InternalRecipeDSL.g:1456:2: rule__Step__Group__0__Impl rule__Step__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalRecipeDSL.g:1463:1: rule__Step__Group__0__Impl : ( 'Use' ) ;
    public final void rule__Step__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1467:1: ( ( 'Use' ) )
            // InternalRecipeDSL.g:1468:1: ( 'Use' )
            {
            // InternalRecipeDSL.g:1468:1: ( 'Use' )
            // InternalRecipeDSL.g:1469:2: 'Use'
            {
             before(grammarAccess.getStepAccess().getUseKeyword_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalRecipeDSL.g:1478:1: rule__Step__Group__1 : rule__Step__Group__1__Impl rule__Step__Group__2 ;
    public final void rule__Step__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1482:1: ( rule__Step__Group__1__Impl rule__Step__Group__2 )
            // InternalRecipeDSL.g:1483:2: rule__Step__Group__1__Impl rule__Step__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalRecipeDSL.g:1490:1: rule__Step__Group__1__Impl : ( ( rule__Step__DevAssignment_1 ) ) ;
    public final void rule__Step__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1494:1: ( ( ( rule__Step__DevAssignment_1 ) ) )
            // InternalRecipeDSL.g:1495:1: ( ( rule__Step__DevAssignment_1 ) )
            {
            // InternalRecipeDSL.g:1495:1: ( ( rule__Step__DevAssignment_1 ) )
            // InternalRecipeDSL.g:1496:2: ( rule__Step__DevAssignment_1 )
            {
             before(grammarAccess.getStepAccess().getDevAssignment_1()); 
            // InternalRecipeDSL.g:1497:2: ( rule__Step__DevAssignment_1 )
            // InternalRecipeDSL.g:1497:3: rule__Step__DevAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Step__DevAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStepAccess().getDevAssignment_1()); 

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
    // InternalRecipeDSL.g:1505:1: rule__Step__Group__2 : rule__Step__Group__2__Impl rule__Step__Group__3 ;
    public final void rule__Step__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1509:1: ( rule__Step__Group__2__Impl rule__Step__Group__3 )
            // InternalRecipeDSL.g:1510:2: rule__Step__Group__2__Impl rule__Step__Group__3
            {
            pushFollow(FOLLOW_25);
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
    // InternalRecipeDSL.g:1517:1: rule__Step__Group__2__Impl : ( ( rule__Step__Group_2__0 )* ) ;
    public final void rule__Step__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1521:1: ( ( ( rule__Step__Group_2__0 )* ) )
            // InternalRecipeDSL.g:1522:1: ( ( rule__Step__Group_2__0 )* )
            {
            // InternalRecipeDSL.g:1522:1: ( ( rule__Step__Group_2__0 )* )
            // InternalRecipeDSL.g:1523:2: ( rule__Step__Group_2__0 )*
            {
             before(grammarAccess.getStepAccess().getGroup_2()); 
            // InternalRecipeDSL.g:1524:2: ( rule__Step__Group_2__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==24) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalRecipeDSL.g:1524:3: rule__Step__Group_2__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Step__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getStepAccess().getGroup_2()); 

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
    // InternalRecipeDSL.g:1532:1: rule__Step__Group__3 : rule__Step__Group__3__Impl rule__Step__Group__4 ;
    public final void rule__Step__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1536:1: ( rule__Step__Group__3__Impl rule__Step__Group__4 )
            // InternalRecipeDSL.g:1537:2: rule__Step__Group__3__Impl rule__Step__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Step__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Step__Group__4();

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
    // InternalRecipeDSL.g:1544:1: rule__Step__Group__3__Impl : ( 'with' ) ;
    public final void rule__Step__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1548:1: ( ( 'with' ) )
            // InternalRecipeDSL.g:1549:1: ( 'with' )
            {
            // InternalRecipeDSL.g:1549:1: ( 'with' )
            // InternalRecipeDSL.g:1550:2: 'with'
            {
             before(grammarAccess.getStepAccess().getWithKeyword_3()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getStepAccess().getWithKeyword_3()); 

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


    // $ANTLR start "rule__Step__Group__4"
    // InternalRecipeDSL.g:1559:1: rule__Step__Group__4 : rule__Step__Group__4__Impl rule__Step__Group__5 ;
    public final void rule__Step__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1563:1: ( rule__Step__Group__4__Impl rule__Step__Group__5 )
            // InternalRecipeDSL.g:1564:2: rule__Step__Group__4__Impl rule__Step__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__Step__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Step__Group__5();

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
    // $ANTLR end "rule__Step__Group__4"


    // $ANTLR start "rule__Step__Group__4__Impl"
    // InternalRecipeDSL.g:1571:1: rule__Step__Group__4__Impl : ( ( rule__Step__IngAssignment_4 ) ) ;
    public final void rule__Step__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1575:1: ( ( ( rule__Step__IngAssignment_4 ) ) )
            // InternalRecipeDSL.g:1576:1: ( ( rule__Step__IngAssignment_4 ) )
            {
            // InternalRecipeDSL.g:1576:1: ( ( rule__Step__IngAssignment_4 ) )
            // InternalRecipeDSL.g:1577:2: ( rule__Step__IngAssignment_4 )
            {
             before(grammarAccess.getStepAccess().getIngAssignment_4()); 
            // InternalRecipeDSL.g:1578:2: ( rule__Step__IngAssignment_4 )
            // InternalRecipeDSL.g:1578:3: rule__Step__IngAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Step__IngAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getStepAccess().getIngAssignment_4()); 

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
    // $ANTLR end "rule__Step__Group__4__Impl"


    // $ANTLR start "rule__Step__Group__5"
    // InternalRecipeDSL.g:1586:1: rule__Step__Group__5 : rule__Step__Group__5__Impl ;
    public final void rule__Step__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1590:1: ( rule__Step__Group__5__Impl )
            // InternalRecipeDSL.g:1591:2: rule__Step__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Step__Group__5__Impl();

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
    // $ANTLR end "rule__Step__Group__5"


    // $ANTLR start "rule__Step__Group__5__Impl"
    // InternalRecipeDSL.g:1597:1: rule__Step__Group__5__Impl : ( ( rule__Step__Group_5__0 )* ) ;
    public final void rule__Step__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1601:1: ( ( ( rule__Step__Group_5__0 )* ) )
            // InternalRecipeDSL.g:1602:1: ( ( rule__Step__Group_5__0 )* )
            {
            // InternalRecipeDSL.g:1602:1: ( ( rule__Step__Group_5__0 )* )
            // InternalRecipeDSL.g:1603:2: ( rule__Step__Group_5__0 )*
            {
             before(grammarAccess.getStepAccess().getGroup_5()); 
            // InternalRecipeDSL.g:1604:2: ( rule__Step__Group_5__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==24) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalRecipeDSL.g:1604:3: rule__Step__Group_5__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Step__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getStepAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Step__Group__5__Impl"


    // $ANTLR start "rule__Step__Group_2__0"
    // InternalRecipeDSL.g:1613:1: rule__Step__Group_2__0 : rule__Step__Group_2__0__Impl rule__Step__Group_2__1 ;
    public final void rule__Step__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1617:1: ( rule__Step__Group_2__0__Impl rule__Step__Group_2__1 )
            // InternalRecipeDSL.g:1618:2: rule__Step__Group_2__0__Impl rule__Step__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Step__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Step__Group_2__1();

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
    // $ANTLR end "rule__Step__Group_2__0"


    // $ANTLR start "rule__Step__Group_2__0__Impl"
    // InternalRecipeDSL.g:1625:1: rule__Step__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Step__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1629:1: ( ( ',' ) )
            // InternalRecipeDSL.g:1630:1: ( ',' )
            {
            // InternalRecipeDSL.g:1630:1: ( ',' )
            // InternalRecipeDSL.g:1631:2: ','
            {
             before(grammarAccess.getStepAccess().getCommaKeyword_2_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getStepAccess().getCommaKeyword_2_0()); 

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
    // $ANTLR end "rule__Step__Group_2__0__Impl"


    // $ANTLR start "rule__Step__Group_2__1"
    // InternalRecipeDSL.g:1640:1: rule__Step__Group_2__1 : rule__Step__Group_2__1__Impl ;
    public final void rule__Step__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1644:1: ( rule__Step__Group_2__1__Impl )
            // InternalRecipeDSL.g:1645:2: rule__Step__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Step__Group_2__1__Impl();

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
    // $ANTLR end "rule__Step__Group_2__1"


    // $ANTLR start "rule__Step__Group_2__1__Impl"
    // InternalRecipeDSL.g:1651:1: rule__Step__Group_2__1__Impl : ( ( rule__Step__Dev2Assignment_2_1 ) ) ;
    public final void rule__Step__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1655:1: ( ( ( rule__Step__Dev2Assignment_2_1 ) ) )
            // InternalRecipeDSL.g:1656:1: ( ( rule__Step__Dev2Assignment_2_1 ) )
            {
            // InternalRecipeDSL.g:1656:1: ( ( rule__Step__Dev2Assignment_2_1 ) )
            // InternalRecipeDSL.g:1657:2: ( rule__Step__Dev2Assignment_2_1 )
            {
             before(grammarAccess.getStepAccess().getDev2Assignment_2_1()); 
            // InternalRecipeDSL.g:1658:2: ( rule__Step__Dev2Assignment_2_1 )
            // InternalRecipeDSL.g:1658:3: rule__Step__Dev2Assignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Step__Dev2Assignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getStepAccess().getDev2Assignment_2_1()); 

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
    // $ANTLR end "rule__Step__Group_2__1__Impl"


    // $ANTLR start "rule__Step__Group_5__0"
    // InternalRecipeDSL.g:1667:1: rule__Step__Group_5__0 : rule__Step__Group_5__0__Impl rule__Step__Group_5__1 ;
    public final void rule__Step__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1671:1: ( rule__Step__Group_5__0__Impl rule__Step__Group_5__1 )
            // InternalRecipeDSL.g:1672:2: rule__Step__Group_5__0__Impl rule__Step__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__Step__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Step__Group_5__1();

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
    // $ANTLR end "rule__Step__Group_5__0"


    // $ANTLR start "rule__Step__Group_5__0__Impl"
    // InternalRecipeDSL.g:1679:1: rule__Step__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Step__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1683:1: ( ( ',' ) )
            // InternalRecipeDSL.g:1684:1: ( ',' )
            {
            // InternalRecipeDSL.g:1684:1: ( ',' )
            // InternalRecipeDSL.g:1685:2: ','
            {
             before(grammarAccess.getStepAccess().getCommaKeyword_5_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getStepAccess().getCommaKeyword_5_0()); 

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
    // $ANTLR end "rule__Step__Group_5__0__Impl"


    // $ANTLR start "rule__Step__Group_5__1"
    // InternalRecipeDSL.g:1694:1: rule__Step__Group_5__1 : rule__Step__Group_5__1__Impl ;
    public final void rule__Step__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1698:1: ( rule__Step__Group_5__1__Impl )
            // InternalRecipeDSL.g:1699:2: rule__Step__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Step__Group_5__1__Impl();

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
    // $ANTLR end "rule__Step__Group_5__1"


    // $ANTLR start "rule__Step__Group_5__1__Impl"
    // InternalRecipeDSL.g:1705:1: rule__Step__Group_5__1__Impl : ( ( rule__Step__Ing2Assignment_5_1 ) ) ;
    public final void rule__Step__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1709:1: ( ( ( rule__Step__Ing2Assignment_5_1 ) ) )
            // InternalRecipeDSL.g:1710:1: ( ( rule__Step__Ing2Assignment_5_1 ) )
            {
            // InternalRecipeDSL.g:1710:1: ( ( rule__Step__Ing2Assignment_5_1 ) )
            // InternalRecipeDSL.g:1711:2: ( rule__Step__Ing2Assignment_5_1 )
            {
             before(grammarAccess.getStepAccess().getIng2Assignment_5_1()); 
            // InternalRecipeDSL.g:1712:2: ( rule__Step__Ing2Assignment_5_1 )
            // InternalRecipeDSL.g:1712:3: rule__Step__Ing2Assignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Step__Ing2Assignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getStepAccess().getIng2Assignment_5_1()); 

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
    // $ANTLR end "rule__Step__Group_5__1__Impl"


    // $ANTLR start "rule__EFloat__Group__0"
    // InternalRecipeDSL.g:1721:1: rule__EFloat__Group__0 : rule__EFloat__Group__0__Impl rule__EFloat__Group__1 ;
    public final void rule__EFloat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1725:1: ( rule__EFloat__Group__0__Impl rule__EFloat__Group__1 )
            // InternalRecipeDSL.g:1726:2: rule__EFloat__Group__0__Impl rule__EFloat__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__EFloat__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group__1();

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
    // $ANTLR end "rule__EFloat__Group__0"


    // $ANTLR start "rule__EFloat__Group__0__Impl"
    // InternalRecipeDSL.g:1733:1: rule__EFloat__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1737:1: ( ( ( '-' )? ) )
            // InternalRecipeDSL.g:1738:1: ( ( '-' )? )
            {
            // InternalRecipeDSL.g:1738:1: ( ( '-' )? )
            // InternalRecipeDSL.g:1739:2: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0()); 
            // InternalRecipeDSL.g:1740:2: ( '-' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==35) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalRecipeDSL.g:1740:3: '-'
                    {
                    match(input,35,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__EFloat__Group__0__Impl"


    // $ANTLR start "rule__EFloat__Group__1"
    // InternalRecipeDSL.g:1748:1: rule__EFloat__Group__1 : rule__EFloat__Group__1__Impl rule__EFloat__Group__2 ;
    public final void rule__EFloat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1752:1: ( rule__EFloat__Group__1__Impl rule__EFloat__Group__2 )
            // InternalRecipeDSL.g:1753:2: rule__EFloat__Group__1__Impl rule__EFloat__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__EFloat__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group__2();

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
    // $ANTLR end "rule__EFloat__Group__1"


    // $ANTLR start "rule__EFloat__Group__1__Impl"
    // InternalRecipeDSL.g:1760:1: rule__EFloat__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EFloat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1764:1: ( ( ( RULE_INT )? ) )
            // InternalRecipeDSL.g:1765:1: ( ( RULE_INT )? )
            {
            // InternalRecipeDSL.g:1765:1: ( ( RULE_INT )? )
            // InternalRecipeDSL.g:1766:2: ( RULE_INT )?
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1()); 
            // InternalRecipeDSL.g:1767:2: ( RULE_INT )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_INT) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalRecipeDSL.g:1767:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EFloat__Group__1__Impl"


    // $ANTLR start "rule__EFloat__Group__2"
    // InternalRecipeDSL.g:1775:1: rule__EFloat__Group__2 : rule__EFloat__Group__2__Impl rule__EFloat__Group__3 ;
    public final void rule__EFloat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1779:1: ( rule__EFloat__Group__2__Impl rule__EFloat__Group__3 )
            // InternalRecipeDSL.g:1780:2: rule__EFloat__Group__2__Impl rule__EFloat__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__EFloat__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group__3();

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
    // $ANTLR end "rule__EFloat__Group__2"


    // $ANTLR start "rule__EFloat__Group__2__Impl"
    // InternalRecipeDSL.g:1787:1: rule__EFloat__Group__2__Impl : ( '.' ) ;
    public final void rule__EFloat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1791:1: ( ( '.' ) )
            // InternalRecipeDSL.g:1792:1: ( '.' )
            {
            // InternalRecipeDSL.g:1792:1: ( '.' )
            // InternalRecipeDSL.g:1793:2: '.'
            {
             before(grammarAccess.getEFloatAccess().getFullStopKeyword_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getEFloatAccess().getFullStopKeyword_2()); 

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
    // $ANTLR end "rule__EFloat__Group__2__Impl"


    // $ANTLR start "rule__EFloat__Group__3"
    // InternalRecipeDSL.g:1802:1: rule__EFloat__Group__3 : rule__EFloat__Group__3__Impl rule__EFloat__Group__4 ;
    public final void rule__EFloat__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1806:1: ( rule__EFloat__Group__3__Impl rule__EFloat__Group__4 )
            // InternalRecipeDSL.g:1807:2: rule__EFloat__Group__3__Impl rule__EFloat__Group__4
            {
            pushFollow(FOLLOW_26);
            rule__EFloat__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group__4();

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
    // $ANTLR end "rule__EFloat__Group__3"


    // $ANTLR start "rule__EFloat__Group__3__Impl"
    // InternalRecipeDSL.g:1814:1: rule__EFloat__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1818:1: ( ( RULE_INT ) )
            // InternalRecipeDSL.g:1819:1: ( RULE_INT )
            {
            // InternalRecipeDSL.g:1819:1: ( RULE_INT )
            // InternalRecipeDSL.g:1820:2: RULE_INT
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3()); 

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
    // $ANTLR end "rule__EFloat__Group__3__Impl"


    // $ANTLR start "rule__EFloat__Group__4"
    // InternalRecipeDSL.g:1829:1: rule__EFloat__Group__4 : rule__EFloat__Group__4__Impl ;
    public final void rule__EFloat__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1833:1: ( rule__EFloat__Group__4__Impl )
            // InternalRecipeDSL.g:1834:2: rule__EFloat__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Group__4__Impl();

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
    // $ANTLR end "rule__EFloat__Group__4"


    // $ANTLR start "rule__EFloat__Group__4__Impl"
    // InternalRecipeDSL.g:1840:1: rule__EFloat__Group__4__Impl : ( ( rule__EFloat__Group_4__0 )? ) ;
    public final void rule__EFloat__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1844:1: ( ( ( rule__EFloat__Group_4__0 )? ) )
            // InternalRecipeDSL.g:1845:1: ( ( rule__EFloat__Group_4__0 )? )
            {
            // InternalRecipeDSL.g:1845:1: ( ( rule__EFloat__Group_4__0 )? )
            // InternalRecipeDSL.g:1846:2: ( rule__EFloat__Group_4__0 )?
            {
             before(grammarAccess.getEFloatAccess().getGroup_4()); 
            // InternalRecipeDSL.g:1847:2: ( rule__EFloat__Group_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=20 && LA14_0<=21)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalRecipeDSL.g:1847:3: rule__EFloat__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EFloat__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getGroup_4()); 

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
    // $ANTLR end "rule__EFloat__Group__4__Impl"


    // $ANTLR start "rule__EFloat__Group_4__0"
    // InternalRecipeDSL.g:1856:1: rule__EFloat__Group_4__0 : rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1 ;
    public final void rule__EFloat__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1860:1: ( rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1 )
            // InternalRecipeDSL.g:1861:2: rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1
            {
            pushFollow(FOLLOW_27);
            rule__EFloat__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group_4__1();

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
    // $ANTLR end "rule__EFloat__Group_4__0"


    // $ANTLR start "rule__EFloat__Group_4__0__Impl"
    // InternalRecipeDSL.g:1868:1: rule__EFloat__Group_4__0__Impl : ( ( rule__EFloat__Alternatives_4_0 ) ) ;
    public final void rule__EFloat__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1872:1: ( ( ( rule__EFloat__Alternatives_4_0 ) ) )
            // InternalRecipeDSL.g:1873:1: ( ( rule__EFloat__Alternatives_4_0 ) )
            {
            // InternalRecipeDSL.g:1873:1: ( ( rule__EFloat__Alternatives_4_0 ) )
            // InternalRecipeDSL.g:1874:2: ( rule__EFloat__Alternatives_4_0 )
            {
             before(grammarAccess.getEFloatAccess().getAlternatives_4_0()); 
            // InternalRecipeDSL.g:1875:2: ( rule__EFloat__Alternatives_4_0 )
            // InternalRecipeDSL.g:1875:3: rule__EFloat__Alternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Alternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getEFloatAccess().getAlternatives_4_0()); 

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
    // $ANTLR end "rule__EFloat__Group_4__0__Impl"


    // $ANTLR start "rule__EFloat__Group_4__1"
    // InternalRecipeDSL.g:1883:1: rule__EFloat__Group_4__1 : rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2 ;
    public final void rule__EFloat__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1887:1: ( rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2 )
            // InternalRecipeDSL.g:1888:2: rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2
            {
            pushFollow(FOLLOW_27);
            rule__EFloat__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group_4__2();

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
    // $ANTLR end "rule__EFloat__Group_4__1"


    // $ANTLR start "rule__EFloat__Group_4__1__Impl"
    // InternalRecipeDSL.g:1895:1: rule__EFloat__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1899:1: ( ( ( '-' )? ) )
            // InternalRecipeDSL.g:1900:1: ( ( '-' )? )
            {
            // InternalRecipeDSL.g:1900:1: ( ( '-' )? )
            // InternalRecipeDSL.g:1901:2: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1()); 
            // InternalRecipeDSL.g:1902:2: ( '-' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==35) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalRecipeDSL.g:1902:3: '-'
                    {
                    match(input,35,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1()); 

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
    // $ANTLR end "rule__EFloat__Group_4__1__Impl"


    // $ANTLR start "rule__EFloat__Group_4__2"
    // InternalRecipeDSL.g:1910:1: rule__EFloat__Group_4__2 : rule__EFloat__Group_4__2__Impl ;
    public final void rule__EFloat__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1914:1: ( rule__EFloat__Group_4__2__Impl )
            // InternalRecipeDSL.g:1915:2: rule__EFloat__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Group_4__2__Impl();

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
    // $ANTLR end "rule__EFloat__Group_4__2"


    // $ANTLR start "rule__EFloat__Group_4__2__Impl"
    // InternalRecipeDSL.g:1921:1: rule__EFloat__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1925:1: ( ( RULE_INT ) )
            // InternalRecipeDSL.g:1926:1: ( RULE_INT )
            {
            // InternalRecipeDSL.g:1926:1: ( RULE_INT )
            // InternalRecipeDSL.g:1927:2: RULE_INT
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2()); 

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
    // $ANTLR end "rule__EFloat__Group_4__2__Impl"


    // $ANTLR start "rule__Model__MgrAssignment"
    // InternalRecipeDSL.g:1937:1: rule__Model__MgrAssignment : ( ruleManager ) ;
    public final void rule__Model__MgrAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1941:1: ( ( ruleManager ) )
            // InternalRecipeDSL.g:1942:2: ( ruleManager )
            {
            // InternalRecipeDSL.g:1942:2: ( ruleManager )
            // InternalRecipeDSL.g:1943:3: ruleManager
            {
             before(grammarAccess.getModelAccess().getMgrManagerParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleManager();

            state._fsp--;

             after(grammarAccess.getModelAccess().getMgrManagerParserRuleCall_0()); 

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
    // $ANTLR end "rule__Model__MgrAssignment"


    // $ANTLR start "rule__Manager__NameAssignment_1"
    // InternalRecipeDSL.g:1952:1: rule__Manager__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Manager__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1956:1: ( ( RULE_ID ) )
            // InternalRecipeDSL.g:1957:2: ( RULE_ID )
            {
            // InternalRecipeDSL.g:1957:2: ( RULE_ID )
            // InternalRecipeDSL.g:1958:3: RULE_ID
            {
             before(grammarAccess.getManagerAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getManagerAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Manager__NameAssignment_1"


    // $ANTLR start "rule__Manager__UserAssignment_3"
    // InternalRecipeDSL.g:1967:1: rule__Manager__UserAssignment_3 : ( ruleUser ) ;
    public final void rule__Manager__UserAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1971:1: ( ( ruleUser ) )
            // InternalRecipeDSL.g:1972:2: ( ruleUser )
            {
            // InternalRecipeDSL.g:1972:2: ( ruleUser )
            // InternalRecipeDSL.g:1973:3: ruleUser
            {
             before(grammarAccess.getManagerAccess().getUserUserParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleUser();

            state._fsp--;

             after(grammarAccess.getManagerAccess().getUserUserParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Manager__UserAssignment_3"


    // $ANTLR start "rule__Manager__UserAssignment_4_1"
    // InternalRecipeDSL.g:1982:1: rule__Manager__UserAssignment_4_1 : ( ruleUser ) ;
    public final void rule__Manager__UserAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1986:1: ( ( ruleUser ) )
            // InternalRecipeDSL.g:1987:2: ( ruleUser )
            {
            // InternalRecipeDSL.g:1987:2: ( ruleUser )
            // InternalRecipeDSL.g:1988:3: ruleUser
            {
             before(grammarAccess.getManagerAccess().getUserUserParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUser();

            state._fsp--;

             after(grammarAccess.getManagerAccess().getUserUserParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Manager__UserAssignment_4_1"


    // $ANTLR start "rule__Manager__RecipesAssignment_5"
    // InternalRecipeDSL.g:1997:1: rule__Manager__RecipesAssignment_5 : ( ruleRecipe ) ;
    public final void rule__Manager__RecipesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2001:1: ( ( ruleRecipe ) )
            // InternalRecipeDSL.g:2002:2: ( ruleRecipe )
            {
            // InternalRecipeDSL.g:2002:2: ( ruleRecipe )
            // InternalRecipeDSL.g:2003:3: ruleRecipe
            {
             before(grammarAccess.getManagerAccess().getRecipesRecipeParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleRecipe();

            state._fsp--;

             after(grammarAccess.getManagerAccess().getRecipesRecipeParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Manager__RecipesAssignment_5"


    // $ANTLR start "rule__User__NameAssignment"
    // InternalRecipeDSL.g:2012:1: rule__User__NameAssignment : ( RULE_ID ) ;
    public final void rule__User__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2016:1: ( ( RULE_ID ) )
            // InternalRecipeDSL.g:2017:2: ( RULE_ID )
            {
            // InternalRecipeDSL.g:2017:2: ( RULE_ID )
            // InternalRecipeDSL.g:2018:3: RULE_ID
            {
             before(grammarAccess.getUserAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getNameIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__User__NameAssignment"


    // $ANTLR start "rule__Recipe__NameAssignment_1"
    // InternalRecipeDSL.g:2027:1: rule__Recipe__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Recipe__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2031:1: ( ( RULE_ID ) )
            // InternalRecipeDSL.g:2032:2: ( RULE_ID )
            {
            // InternalRecipeDSL.g:2032:2: ( RULE_ID )
            // InternalRecipeDSL.g:2033:3: RULE_ID
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


    // $ANTLR start "rule__Recipe__LevelAssignment_2"
    // InternalRecipeDSL.g:2042:1: rule__Recipe__LevelAssignment_2 : ( ruleLevel ) ;
    public final void rule__Recipe__LevelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2046:1: ( ( ruleLevel ) )
            // InternalRecipeDSL.g:2047:2: ( ruleLevel )
            {
            // InternalRecipeDSL.g:2047:2: ( ruleLevel )
            // InternalRecipeDSL.g:2048:3: ruleLevel
            {
             before(grammarAccess.getRecipeAccess().getLevelLevelParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLevel();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getLevelLevelParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Recipe__LevelAssignment_2"


    // $ANTLR start "rule__Recipe__IngredientAssignment_3"
    // InternalRecipeDSL.g:2057:1: rule__Recipe__IngredientAssignment_3 : ( ruleIngredient ) ;
    public final void rule__Recipe__IngredientAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2061:1: ( ( ruleIngredient ) )
            // InternalRecipeDSL.g:2062:2: ( ruleIngredient )
            {
            // InternalRecipeDSL.g:2062:2: ( ruleIngredient )
            // InternalRecipeDSL.g:2063:3: ruleIngredient
            {
             before(grammarAccess.getRecipeAccess().getIngredientIngredientParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleIngredient();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getIngredientIngredientParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Recipe__IngredientAssignment_3"


    // $ANTLR start "rule__Recipe__DeviceAssignment_4"
    // InternalRecipeDSL.g:2072:1: rule__Recipe__DeviceAssignment_4 : ( ruleDevice ) ;
    public final void rule__Recipe__DeviceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2076:1: ( ( ruleDevice ) )
            // InternalRecipeDSL.g:2077:2: ( ruleDevice )
            {
            // InternalRecipeDSL.g:2077:2: ( ruleDevice )
            // InternalRecipeDSL.g:2078:3: ruleDevice
            {
             before(grammarAccess.getRecipeAccess().getDeviceDeviceParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleDevice();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getDeviceDeviceParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Recipe__DeviceAssignment_4"


    // $ANTLR start "rule__Recipe__CookingAssignment_5"
    // InternalRecipeDSL.g:2087:1: rule__Recipe__CookingAssignment_5 : ( ruleCooking ) ;
    public final void rule__Recipe__CookingAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2091:1: ( ( ruleCooking ) )
            // InternalRecipeDSL.g:2092:2: ( ruleCooking )
            {
            // InternalRecipeDSL.g:2092:2: ( ruleCooking )
            // InternalRecipeDSL.g:2093:3: ruleCooking
            {
             before(grammarAccess.getRecipeAccess().getCookingCookingParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleCooking();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getCookingCookingParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Recipe__CookingAssignment_5"


    // $ANTLR start "rule__Level__RatingAssignment_1"
    // InternalRecipeDSL.g:2102:1: rule__Level__RatingAssignment_1 : ( RULE_RATING ) ;
    public final void rule__Level__RatingAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2106:1: ( ( RULE_RATING ) )
            // InternalRecipeDSL.g:2107:2: ( RULE_RATING )
            {
            // InternalRecipeDSL.g:2107:2: ( RULE_RATING )
            // InternalRecipeDSL.g:2108:3: RULE_RATING
            {
             before(grammarAccess.getLevelAccess().getRatingRATINGTerminalRuleCall_1_0()); 
            match(input,RULE_RATING,FOLLOW_2); 
             after(grammarAccess.getLevelAccess().getRatingRATINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Level__RatingAssignment_1"


    // $ANTLR start "rule__Ingredient__NameAssignment_0_1"
    // InternalRecipeDSL.g:2117:1: rule__Ingredient__NameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__Ingredient__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2121:1: ( ( RULE_ID ) )
            // InternalRecipeDSL.g:2122:2: ( RULE_ID )
            {
            // InternalRecipeDSL.g:2122:2: ( RULE_ID )
            // InternalRecipeDSL.g:2123:3: RULE_ID
            {
             before(grammarAccess.getIngredientAccess().getNameIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIngredientAccess().getNameIDTerminalRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__Ingredient__NameAssignment_0_1"


    // $ANTLR start "rule__Ingredient__MeasureAssignment_0_3"
    // InternalRecipeDSL.g:2132:1: rule__Ingredient__MeasureAssignment_0_3 : ( ruleWeight ) ;
    public final void rule__Ingredient__MeasureAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2136:1: ( ( ruleWeight ) )
            // InternalRecipeDSL.g:2137:2: ( ruleWeight )
            {
            // InternalRecipeDSL.g:2137:2: ( ruleWeight )
            // InternalRecipeDSL.g:2138:3: ruleWeight
            {
             before(grammarAccess.getIngredientAccess().getMeasureWeightParserRuleCall_0_3_0()); 
            pushFollow(FOLLOW_2);
            ruleWeight();

            state._fsp--;

             after(grammarAccess.getIngredientAccess().getMeasureWeightParserRuleCall_0_3_0()); 

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
    // $ANTLR end "rule__Ingredient__MeasureAssignment_0_3"


    // $ANTLR start "rule__Weight__WeightAssignment_0"
    // InternalRecipeDSL.g:2147:1: rule__Weight__WeightAssignment_0 : ( ruleEFloat ) ;
    public final void rule__Weight__WeightAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2151:1: ( ( ruleEFloat ) )
            // InternalRecipeDSL.g:2152:2: ( ruleEFloat )
            {
            // InternalRecipeDSL.g:2152:2: ( ruleEFloat )
            // InternalRecipeDSL.g:2153:3: ruleEFloat
            {
             before(grammarAccess.getWeightAccess().getWeightEFloatParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getWeightAccess().getWeightEFloatParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Weight__WeightAssignment_0"


    // $ANTLR start "rule__Count__CAssignment_0"
    // InternalRecipeDSL.g:2162:1: rule__Count__CAssignment_0 : ( RULE_INT ) ;
    public final void rule__Count__CAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2166:1: ( ( RULE_INT ) )
            // InternalRecipeDSL.g:2167:2: ( RULE_INT )
            {
            // InternalRecipeDSL.g:2167:2: ( RULE_INT )
            // InternalRecipeDSL.g:2168:3: RULE_INT
            {
             before(grammarAccess.getCountAccess().getCINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCountAccess().getCINTTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Count__CAssignment_0"


    // $ANTLR start "rule__Device__NameAssignment_1"
    // InternalRecipeDSL.g:2177:1: rule__Device__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Device__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2181:1: ( ( RULE_ID ) )
            // InternalRecipeDSL.g:2182:2: ( RULE_ID )
            {
            // InternalRecipeDSL.g:2182:2: ( RULE_ID )
            // InternalRecipeDSL.g:2183:3: RULE_ID
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


    // $ANTLR start "rule__Cooking__SAssignment_1"
    // InternalRecipeDSL.g:2192:1: rule__Cooking__SAssignment_1 : ( RULE_INT ) ;
    public final void rule__Cooking__SAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2196:1: ( ( RULE_INT ) )
            // InternalRecipeDSL.g:2197:2: ( RULE_INT )
            {
            // InternalRecipeDSL.g:2197:2: ( RULE_INT )
            // InternalRecipeDSL.g:2198:3: RULE_INT
            {
             before(grammarAccess.getCookingAccess().getSINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCookingAccess().getSINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Cooking__SAssignment_1"


    // $ANTLR start "rule__Cooking__TimeAssignment_2_0"
    // InternalRecipeDSL.g:2207:1: rule__Cooking__TimeAssignment_2_0 : ( ruleTime ) ;
    public final void rule__Cooking__TimeAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2211:1: ( ( ruleTime ) )
            // InternalRecipeDSL.g:2212:2: ( ruleTime )
            {
            // InternalRecipeDSL.g:2212:2: ( ruleTime )
            // InternalRecipeDSL.g:2213:3: ruleTime
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


    // $ANTLR start "rule__Cooking__StepAssignment_2_2"
    // InternalRecipeDSL.g:2222:1: rule__Cooking__StepAssignment_2_2 : ( ruleStep ) ;
    public final void rule__Cooking__StepAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2226:1: ( ( ruleStep ) )
            // InternalRecipeDSL.g:2227:2: ( ruleStep )
            {
            // InternalRecipeDSL.g:2227:2: ( ruleStep )
            // InternalRecipeDSL.g:2228:3: ruleStep
            {
             before(grammarAccess.getCookingAccess().getStepStepParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleStep();

            state._fsp--;

             after(grammarAccess.getCookingAccess().getStepStepParserRuleCall_2_2_0()); 

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
    // $ANTLR end "rule__Cooking__StepAssignment_2_2"


    // $ANTLR start "rule__Time__TimeAssignment_1"
    // InternalRecipeDSL.g:2237:1: rule__Time__TimeAssignment_1 : ( RULE_INT ) ;
    public final void rule__Time__TimeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2241:1: ( ( RULE_INT ) )
            // InternalRecipeDSL.g:2242:2: ( RULE_INT )
            {
            // InternalRecipeDSL.g:2242:2: ( RULE_INT )
            // InternalRecipeDSL.g:2243:3: RULE_INT
            {
             before(grammarAccess.getTimeAccess().getTimeINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTimeAccess().getTimeINTTerminalRuleCall_1_0()); 

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


    // $ANTLR start "rule__Step__DevAssignment_1"
    // InternalRecipeDSL.g:2252:1: rule__Step__DevAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Step__DevAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2256:1: ( ( ( RULE_ID ) ) )
            // InternalRecipeDSL.g:2257:2: ( ( RULE_ID ) )
            {
            // InternalRecipeDSL.g:2257:2: ( ( RULE_ID ) )
            // InternalRecipeDSL.g:2258:3: ( RULE_ID )
            {
             before(grammarAccess.getStepAccess().getDevDeviceCrossReference_1_0()); 
            // InternalRecipeDSL.g:2259:3: ( RULE_ID )
            // InternalRecipeDSL.g:2260:4: RULE_ID
            {
             before(grammarAccess.getStepAccess().getDevDeviceIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStepAccess().getDevDeviceIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getStepAccess().getDevDeviceCrossReference_1_0()); 

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
    // $ANTLR end "rule__Step__DevAssignment_1"


    // $ANTLR start "rule__Step__Dev2Assignment_2_1"
    // InternalRecipeDSL.g:2271:1: rule__Step__Dev2Assignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Step__Dev2Assignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2275:1: ( ( ( RULE_ID ) ) )
            // InternalRecipeDSL.g:2276:2: ( ( RULE_ID ) )
            {
            // InternalRecipeDSL.g:2276:2: ( ( RULE_ID ) )
            // InternalRecipeDSL.g:2277:3: ( RULE_ID )
            {
             before(grammarAccess.getStepAccess().getDev2DeviceCrossReference_2_1_0()); 
            // InternalRecipeDSL.g:2278:3: ( RULE_ID )
            // InternalRecipeDSL.g:2279:4: RULE_ID
            {
             before(grammarAccess.getStepAccess().getDev2DeviceIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStepAccess().getDev2DeviceIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getStepAccess().getDev2DeviceCrossReference_2_1_0()); 

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
    // $ANTLR end "rule__Step__Dev2Assignment_2_1"


    // $ANTLR start "rule__Step__IngAssignment_4"
    // InternalRecipeDSL.g:2290:1: rule__Step__IngAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Step__IngAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2294:1: ( ( ( RULE_ID ) ) )
            // InternalRecipeDSL.g:2295:2: ( ( RULE_ID ) )
            {
            // InternalRecipeDSL.g:2295:2: ( ( RULE_ID ) )
            // InternalRecipeDSL.g:2296:3: ( RULE_ID )
            {
             before(grammarAccess.getStepAccess().getIngIngredientCrossReference_4_0()); 
            // InternalRecipeDSL.g:2297:3: ( RULE_ID )
            // InternalRecipeDSL.g:2298:4: RULE_ID
            {
             before(grammarAccess.getStepAccess().getIngIngredientIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStepAccess().getIngIngredientIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getStepAccess().getIngIngredientCrossReference_4_0()); 

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
    // $ANTLR end "rule__Step__IngAssignment_4"


    // $ANTLR start "rule__Step__Ing2Assignment_5_1"
    // InternalRecipeDSL.g:2309:1: rule__Step__Ing2Assignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__Step__Ing2Assignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2313:1: ( ( ( RULE_ID ) ) )
            // InternalRecipeDSL.g:2314:2: ( ( RULE_ID ) )
            {
            // InternalRecipeDSL.g:2314:2: ( ( RULE_ID ) )
            // InternalRecipeDSL.g:2315:3: ( RULE_ID )
            {
             before(grammarAccess.getStepAccess().getIng2IngredientCrossReference_5_1_0()); 
            // InternalRecipeDSL.g:2316:3: ( RULE_ID )
            // InternalRecipeDSL.g:2317:4: RULE_ID
            {
             before(grammarAccess.getStepAccess().getIng2IngredientIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStepAccess().getIng2IngredientIDTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getStepAccess().getIng2IngredientCrossReference_5_1_0()); 

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
    // $ANTLR end "rule__Step__Ing2Assignment_5_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000008000012L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000001800000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000000F000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000000000F0000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000401000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000010L});

}