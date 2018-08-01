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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_EFLOAT", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'*'", "'**'", "'***'", "'****'", "'*****'", "'mg'", "'g'", "'kg'", "'t'", "'sec'", "'min'", "'h'", "'d'", "'Recipebook'", "'from'", "','", "'Recipe'", "'Level'", "'Ingredient'", "'amount'", "'pieces'", "'Device'", "'Step'", "':'", "'For'", "'Use'", "'with'"
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
    // InternalRecipeDSL.g:187:1: ruleIngredient : ( ( rule__Ingredient__Group__0 ) ) ;
    public final void ruleIngredient() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:191:2: ( ( ( rule__Ingredient__Group__0 ) ) )
            // InternalRecipeDSL.g:192:2: ( ( rule__Ingredient__Group__0 ) )
            {
            // InternalRecipeDSL.g:192:2: ( ( rule__Ingredient__Group__0 ) )
            // InternalRecipeDSL.g:193:3: ( rule__Ingredient__Group__0 )
            {
             before(grammarAccess.getIngredientAccess().getGroup()); 
            // InternalRecipeDSL.g:194:3: ( rule__Ingredient__Group__0 )
            // InternalRecipeDSL.g:194:4: rule__Ingredient__Group__0
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


    // $ANTLR start "rule__Level__RatingAlternatives_1_0"
    // InternalRecipeDSL.g:352:1: rule__Level__RatingAlternatives_1_0 : ( ( '*' ) | ( '**' ) | ( '***' ) | ( '****' ) | ( '*****' ) );
    public final void rule__Level__RatingAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:356:1: ( ( '*' ) | ( '**' ) | ( '***' ) | ( '****' ) | ( '*****' ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt1=1;
                }
                break;
            case 13:
                {
                alt1=2;
                }
                break;
            case 14:
                {
                alt1=3;
                }
                break;
            case 15:
                {
                alt1=4;
                }
                break;
            case 16:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalRecipeDSL.g:357:2: ( '*' )
                    {
                    // InternalRecipeDSL.g:357:2: ( '*' )
                    // InternalRecipeDSL.g:358:3: '*'
                    {
                     before(grammarAccess.getLevelAccess().getRatingAsteriskKeyword_1_0_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getLevelAccess().getRatingAsteriskKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRecipeDSL.g:363:2: ( '**' )
                    {
                    // InternalRecipeDSL.g:363:2: ( '**' )
                    // InternalRecipeDSL.g:364:3: '**'
                    {
                     before(grammarAccess.getLevelAccess().getRatingAsteriskAsteriskKeyword_1_0_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getLevelAccess().getRatingAsteriskAsteriskKeyword_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRecipeDSL.g:369:2: ( '***' )
                    {
                    // InternalRecipeDSL.g:369:2: ( '***' )
                    // InternalRecipeDSL.g:370:3: '***'
                    {
                     before(grammarAccess.getLevelAccess().getRatingAsteriskAsteriskAsteriskKeyword_1_0_2()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getLevelAccess().getRatingAsteriskAsteriskAsteriskKeyword_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRecipeDSL.g:375:2: ( '****' )
                    {
                    // InternalRecipeDSL.g:375:2: ( '****' )
                    // InternalRecipeDSL.g:376:3: '****'
                    {
                     before(grammarAccess.getLevelAccess().getRatingAsteriskAsteriskAsteriskAsteriskKeyword_1_0_3()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getLevelAccess().getRatingAsteriskAsteriskAsteriskAsteriskKeyword_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalRecipeDSL.g:381:2: ( '*****' )
                    {
                    // InternalRecipeDSL.g:381:2: ( '*****' )
                    // InternalRecipeDSL.g:382:3: '*****'
                    {
                     before(grammarAccess.getLevelAccess().getRatingAsteriskAsteriskAsteriskAsteriskAsteriskKeyword_1_0_4()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getLevelAccess().getRatingAsteriskAsteriskAsteriskAsteriskAsteriskKeyword_1_0_4()); 

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
    // $ANTLR end "rule__Level__RatingAlternatives_1_0"


    // $ANTLR start "rule__Ingredient__MeasureAlternatives_3_0"
    // InternalRecipeDSL.g:391:1: rule__Ingredient__MeasureAlternatives_3_0 : ( ( ruleWeight ) | ( ruleCount ) );
    public final void rule__Ingredient__MeasureAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:395:1: ( ( ruleWeight ) | ( ruleCount ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_EFLOAT) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_INT) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalRecipeDSL.g:396:2: ( ruleWeight )
                    {
                    // InternalRecipeDSL.g:396:2: ( ruleWeight )
                    // InternalRecipeDSL.g:397:3: ruleWeight
                    {
                     before(grammarAccess.getIngredientAccess().getMeasureWeightParserRuleCall_3_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleWeight();

                    state._fsp--;

                     after(grammarAccess.getIngredientAccess().getMeasureWeightParserRuleCall_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRecipeDSL.g:402:2: ( ruleCount )
                    {
                    // InternalRecipeDSL.g:402:2: ( ruleCount )
                    // InternalRecipeDSL.g:403:3: ruleCount
                    {
                     before(grammarAccess.getIngredientAccess().getMeasureCountParserRuleCall_3_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCount();

                    state._fsp--;

                     after(grammarAccess.getIngredientAccess().getMeasureCountParserRuleCall_3_0_1()); 

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
    // $ANTLR end "rule__Ingredient__MeasureAlternatives_3_0"


    // $ANTLR start "rule__Weight__Alternatives_1"
    // InternalRecipeDSL.g:412:1: rule__Weight__Alternatives_1 : ( ( 'mg' ) | ( 'g' ) | ( 'kg' ) | ( 't' ) );
    public final void rule__Weight__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:416:1: ( ( 'mg' ) | ( 'g' ) | ( 'kg' ) | ( 't' ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt3=1;
                }
                break;
            case 18:
                {
                alt3=2;
                }
                break;
            case 19:
                {
                alt3=3;
                }
                break;
            case 20:
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
                    // InternalRecipeDSL.g:417:2: ( 'mg' )
                    {
                    // InternalRecipeDSL.g:417:2: ( 'mg' )
                    // InternalRecipeDSL.g:418:3: 'mg'
                    {
                     before(grammarAccess.getWeightAccess().getMgKeyword_1_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getWeightAccess().getMgKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRecipeDSL.g:423:2: ( 'g' )
                    {
                    // InternalRecipeDSL.g:423:2: ( 'g' )
                    // InternalRecipeDSL.g:424:3: 'g'
                    {
                     before(grammarAccess.getWeightAccess().getGKeyword_1_1()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getWeightAccess().getGKeyword_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRecipeDSL.g:429:2: ( 'kg' )
                    {
                    // InternalRecipeDSL.g:429:2: ( 'kg' )
                    // InternalRecipeDSL.g:430:3: 'kg'
                    {
                     before(grammarAccess.getWeightAccess().getKgKeyword_1_2()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getWeightAccess().getKgKeyword_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRecipeDSL.g:435:2: ( 't' )
                    {
                    // InternalRecipeDSL.g:435:2: ( 't' )
                    // InternalRecipeDSL.g:436:3: 't'
                    {
                     before(grammarAccess.getWeightAccess().getTKeyword_1_3()); 
                    match(input,20,FOLLOW_2); 
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
    // InternalRecipeDSL.g:445:1: rule__Time__Alternatives_2 : ( ( 'sec' ) | ( 'min' ) | ( 'h' ) | ( 'd' ) );
    public final void rule__Time__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:449:1: ( ( 'sec' ) | ( 'min' ) | ( 'h' ) | ( 'd' ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt4=1;
                }
                break;
            case 22:
                {
                alt4=2;
                }
                break;
            case 23:
                {
                alt4=3;
                }
                break;
            case 24:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalRecipeDSL.g:450:2: ( 'sec' )
                    {
                    // InternalRecipeDSL.g:450:2: ( 'sec' )
                    // InternalRecipeDSL.g:451:3: 'sec'
                    {
                     before(grammarAccess.getTimeAccess().getSecKeyword_2_0()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getTimeAccess().getSecKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRecipeDSL.g:456:2: ( 'min' )
                    {
                    // InternalRecipeDSL.g:456:2: ( 'min' )
                    // InternalRecipeDSL.g:457:3: 'min'
                    {
                     before(grammarAccess.getTimeAccess().getMinKeyword_2_1()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getTimeAccess().getMinKeyword_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRecipeDSL.g:462:2: ( 'h' )
                    {
                    // InternalRecipeDSL.g:462:2: ( 'h' )
                    // InternalRecipeDSL.g:463:3: 'h'
                    {
                     before(grammarAccess.getTimeAccess().getHKeyword_2_2()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getTimeAccess().getHKeyword_2_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRecipeDSL.g:468:2: ( 'd' )
                    {
                    // InternalRecipeDSL.g:468:2: ( 'd' )
                    // InternalRecipeDSL.g:469:3: 'd'
                    {
                     before(grammarAccess.getTimeAccess().getDKeyword_2_3()); 
                    match(input,24,FOLLOW_2); 
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


    // $ANTLR start "rule__Manager__Group__0"
    // InternalRecipeDSL.g:478:1: rule__Manager__Group__0 : rule__Manager__Group__0__Impl rule__Manager__Group__1 ;
    public final void rule__Manager__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:482:1: ( rule__Manager__Group__0__Impl rule__Manager__Group__1 )
            // InternalRecipeDSL.g:483:2: rule__Manager__Group__0__Impl rule__Manager__Group__1
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
    // InternalRecipeDSL.g:490:1: rule__Manager__Group__0__Impl : ( 'Recipebook' ) ;
    public final void rule__Manager__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:494:1: ( ( 'Recipebook' ) )
            // InternalRecipeDSL.g:495:1: ( 'Recipebook' )
            {
            // InternalRecipeDSL.g:495:1: ( 'Recipebook' )
            // InternalRecipeDSL.g:496:2: 'Recipebook'
            {
             before(grammarAccess.getManagerAccess().getRecipebookKeyword_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalRecipeDSL.g:505:1: rule__Manager__Group__1 : rule__Manager__Group__1__Impl rule__Manager__Group__2 ;
    public final void rule__Manager__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:509:1: ( rule__Manager__Group__1__Impl rule__Manager__Group__2 )
            // InternalRecipeDSL.g:510:2: rule__Manager__Group__1__Impl rule__Manager__Group__2
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
    // InternalRecipeDSL.g:517:1: rule__Manager__Group__1__Impl : ( ( rule__Manager__NameAssignment_1 ) ) ;
    public final void rule__Manager__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:521:1: ( ( ( rule__Manager__NameAssignment_1 ) ) )
            // InternalRecipeDSL.g:522:1: ( ( rule__Manager__NameAssignment_1 ) )
            {
            // InternalRecipeDSL.g:522:1: ( ( rule__Manager__NameAssignment_1 ) )
            // InternalRecipeDSL.g:523:2: ( rule__Manager__NameAssignment_1 )
            {
             before(grammarAccess.getManagerAccess().getNameAssignment_1()); 
            // InternalRecipeDSL.g:524:2: ( rule__Manager__NameAssignment_1 )
            // InternalRecipeDSL.g:524:3: rule__Manager__NameAssignment_1
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
    // InternalRecipeDSL.g:532:1: rule__Manager__Group__2 : rule__Manager__Group__2__Impl rule__Manager__Group__3 ;
    public final void rule__Manager__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:536:1: ( rule__Manager__Group__2__Impl rule__Manager__Group__3 )
            // InternalRecipeDSL.g:537:2: rule__Manager__Group__2__Impl rule__Manager__Group__3
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
    // InternalRecipeDSL.g:544:1: rule__Manager__Group__2__Impl : ( 'from' ) ;
    public final void rule__Manager__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:548:1: ( ( 'from' ) )
            // InternalRecipeDSL.g:549:1: ( 'from' )
            {
            // InternalRecipeDSL.g:549:1: ( 'from' )
            // InternalRecipeDSL.g:550:2: 'from'
            {
             before(grammarAccess.getManagerAccess().getFromKeyword_2()); 
            match(input,26,FOLLOW_2); 
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
    // InternalRecipeDSL.g:559:1: rule__Manager__Group__3 : rule__Manager__Group__3__Impl rule__Manager__Group__4 ;
    public final void rule__Manager__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:563:1: ( rule__Manager__Group__3__Impl rule__Manager__Group__4 )
            // InternalRecipeDSL.g:564:2: rule__Manager__Group__3__Impl rule__Manager__Group__4
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
    // InternalRecipeDSL.g:571:1: rule__Manager__Group__3__Impl : ( ( rule__Manager__UserAssignment_3 ) ) ;
    public final void rule__Manager__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:575:1: ( ( ( rule__Manager__UserAssignment_3 ) ) )
            // InternalRecipeDSL.g:576:1: ( ( rule__Manager__UserAssignment_3 ) )
            {
            // InternalRecipeDSL.g:576:1: ( ( rule__Manager__UserAssignment_3 ) )
            // InternalRecipeDSL.g:577:2: ( rule__Manager__UserAssignment_3 )
            {
             before(grammarAccess.getManagerAccess().getUserAssignment_3()); 
            // InternalRecipeDSL.g:578:2: ( rule__Manager__UserAssignment_3 )
            // InternalRecipeDSL.g:578:3: rule__Manager__UserAssignment_3
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
    // InternalRecipeDSL.g:586:1: rule__Manager__Group__4 : rule__Manager__Group__4__Impl rule__Manager__Group__5 ;
    public final void rule__Manager__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:590:1: ( rule__Manager__Group__4__Impl rule__Manager__Group__5 )
            // InternalRecipeDSL.g:591:2: rule__Manager__Group__4__Impl rule__Manager__Group__5
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
    // InternalRecipeDSL.g:598:1: rule__Manager__Group__4__Impl : ( ( rule__Manager__Group_4__0 )* ) ;
    public final void rule__Manager__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:602:1: ( ( ( rule__Manager__Group_4__0 )* ) )
            // InternalRecipeDSL.g:603:1: ( ( rule__Manager__Group_4__0 )* )
            {
            // InternalRecipeDSL.g:603:1: ( ( rule__Manager__Group_4__0 )* )
            // InternalRecipeDSL.g:604:2: ( rule__Manager__Group_4__0 )*
            {
             before(grammarAccess.getManagerAccess().getGroup_4()); 
            // InternalRecipeDSL.g:605:2: ( rule__Manager__Group_4__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==27) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalRecipeDSL.g:605:3: rule__Manager__Group_4__0
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
    // InternalRecipeDSL.g:613:1: rule__Manager__Group__5 : rule__Manager__Group__5__Impl ;
    public final void rule__Manager__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:617:1: ( rule__Manager__Group__5__Impl )
            // InternalRecipeDSL.g:618:2: rule__Manager__Group__5__Impl
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
    // InternalRecipeDSL.g:624:1: rule__Manager__Group__5__Impl : ( ( rule__Manager__RecipesAssignment_5 )* ) ;
    public final void rule__Manager__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:628:1: ( ( ( rule__Manager__RecipesAssignment_5 )* ) )
            // InternalRecipeDSL.g:629:1: ( ( rule__Manager__RecipesAssignment_5 )* )
            {
            // InternalRecipeDSL.g:629:1: ( ( rule__Manager__RecipesAssignment_5 )* )
            // InternalRecipeDSL.g:630:2: ( rule__Manager__RecipesAssignment_5 )*
            {
             before(grammarAccess.getManagerAccess().getRecipesAssignment_5()); 
            // InternalRecipeDSL.g:631:2: ( rule__Manager__RecipesAssignment_5 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==28) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalRecipeDSL.g:631:3: rule__Manager__RecipesAssignment_5
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
    // InternalRecipeDSL.g:640:1: rule__Manager__Group_4__0 : rule__Manager__Group_4__0__Impl rule__Manager__Group_4__1 ;
    public final void rule__Manager__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:644:1: ( rule__Manager__Group_4__0__Impl rule__Manager__Group_4__1 )
            // InternalRecipeDSL.g:645:2: rule__Manager__Group_4__0__Impl rule__Manager__Group_4__1
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
    // InternalRecipeDSL.g:652:1: rule__Manager__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Manager__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:656:1: ( ( ',' ) )
            // InternalRecipeDSL.g:657:1: ( ',' )
            {
            // InternalRecipeDSL.g:657:1: ( ',' )
            // InternalRecipeDSL.g:658:2: ','
            {
             before(grammarAccess.getManagerAccess().getCommaKeyword_4_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalRecipeDSL.g:667:1: rule__Manager__Group_4__1 : rule__Manager__Group_4__1__Impl ;
    public final void rule__Manager__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:671:1: ( rule__Manager__Group_4__1__Impl )
            // InternalRecipeDSL.g:672:2: rule__Manager__Group_4__1__Impl
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
    // InternalRecipeDSL.g:678:1: rule__Manager__Group_4__1__Impl : ( ( rule__Manager__UserAssignment_4_1 ) ) ;
    public final void rule__Manager__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:682:1: ( ( ( rule__Manager__UserAssignment_4_1 ) ) )
            // InternalRecipeDSL.g:683:1: ( ( rule__Manager__UserAssignment_4_1 ) )
            {
            // InternalRecipeDSL.g:683:1: ( ( rule__Manager__UserAssignment_4_1 ) )
            // InternalRecipeDSL.g:684:2: ( rule__Manager__UserAssignment_4_1 )
            {
             before(grammarAccess.getManagerAccess().getUserAssignment_4_1()); 
            // InternalRecipeDSL.g:685:2: ( rule__Manager__UserAssignment_4_1 )
            // InternalRecipeDSL.g:685:3: rule__Manager__UserAssignment_4_1
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
    // InternalRecipeDSL.g:694:1: rule__Recipe__Group__0 : rule__Recipe__Group__0__Impl rule__Recipe__Group__1 ;
    public final void rule__Recipe__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:698:1: ( rule__Recipe__Group__0__Impl rule__Recipe__Group__1 )
            // InternalRecipeDSL.g:699:2: rule__Recipe__Group__0__Impl rule__Recipe__Group__1
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
    // InternalRecipeDSL.g:706:1: rule__Recipe__Group__0__Impl : ( 'Recipe' ) ;
    public final void rule__Recipe__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:710:1: ( ( 'Recipe' ) )
            // InternalRecipeDSL.g:711:1: ( 'Recipe' )
            {
            // InternalRecipeDSL.g:711:1: ( 'Recipe' )
            // InternalRecipeDSL.g:712:2: 'Recipe'
            {
             before(grammarAccess.getRecipeAccess().getRecipeKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalRecipeDSL.g:721:1: rule__Recipe__Group__1 : rule__Recipe__Group__1__Impl rule__Recipe__Group__2 ;
    public final void rule__Recipe__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:725:1: ( rule__Recipe__Group__1__Impl rule__Recipe__Group__2 )
            // InternalRecipeDSL.g:726:2: rule__Recipe__Group__1__Impl rule__Recipe__Group__2
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
    // InternalRecipeDSL.g:733:1: rule__Recipe__Group__1__Impl : ( ( rule__Recipe__NameAssignment_1 ) ) ;
    public final void rule__Recipe__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:737:1: ( ( ( rule__Recipe__NameAssignment_1 ) ) )
            // InternalRecipeDSL.g:738:1: ( ( rule__Recipe__NameAssignment_1 ) )
            {
            // InternalRecipeDSL.g:738:1: ( ( rule__Recipe__NameAssignment_1 ) )
            // InternalRecipeDSL.g:739:2: ( rule__Recipe__NameAssignment_1 )
            {
             before(grammarAccess.getRecipeAccess().getNameAssignment_1()); 
            // InternalRecipeDSL.g:740:2: ( rule__Recipe__NameAssignment_1 )
            // InternalRecipeDSL.g:740:3: rule__Recipe__NameAssignment_1
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
    // InternalRecipeDSL.g:748:1: rule__Recipe__Group__2 : rule__Recipe__Group__2__Impl rule__Recipe__Group__3 ;
    public final void rule__Recipe__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:752:1: ( rule__Recipe__Group__2__Impl rule__Recipe__Group__3 )
            // InternalRecipeDSL.g:753:2: rule__Recipe__Group__2__Impl rule__Recipe__Group__3
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
    // InternalRecipeDSL.g:760:1: rule__Recipe__Group__2__Impl : ( ( rule__Recipe__LevelAssignment_2 ) ) ;
    public final void rule__Recipe__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:764:1: ( ( ( rule__Recipe__LevelAssignment_2 ) ) )
            // InternalRecipeDSL.g:765:1: ( ( rule__Recipe__LevelAssignment_2 ) )
            {
            // InternalRecipeDSL.g:765:1: ( ( rule__Recipe__LevelAssignment_2 ) )
            // InternalRecipeDSL.g:766:2: ( rule__Recipe__LevelAssignment_2 )
            {
             before(grammarAccess.getRecipeAccess().getLevelAssignment_2()); 
            // InternalRecipeDSL.g:767:2: ( rule__Recipe__LevelAssignment_2 )
            // InternalRecipeDSL.g:767:3: rule__Recipe__LevelAssignment_2
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
    // InternalRecipeDSL.g:775:1: rule__Recipe__Group__3 : rule__Recipe__Group__3__Impl rule__Recipe__Group__4 ;
    public final void rule__Recipe__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:779:1: ( rule__Recipe__Group__3__Impl rule__Recipe__Group__4 )
            // InternalRecipeDSL.g:780:2: rule__Recipe__Group__3__Impl rule__Recipe__Group__4
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
    // InternalRecipeDSL.g:787:1: rule__Recipe__Group__3__Impl : ( ( ( rule__Recipe__IngredientAssignment_3 ) ) ( ( rule__Recipe__IngredientAssignment_3 )* ) ) ;
    public final void rule__Recipe__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:791:1: ( ( ( ( rule__Recipe__IngredientAssignment_3 ) ) ( ( rule__Recipe__IngredientAssignment_3 )* ) ) )
            // InternalRecipeDSL.g:792:1: ( ( ( rule__Recipe__IngredientAssignment_3 ) ) ( ( rule__Recipe__IngredientAssignment_3 )* ) )
            {
            // InternalRecipeDSL.g:792:1: ( ( ( rule__Recipe__IngredientAssignment_3 ) ) ( ( rule__Recipe__IngredientAssignment_3 )* ) )
            // InternalRecipeDSL.g:793:2: ( ( rule__Recipe__IngredientAssignment_3 ) ) ( ( rule__Recipe__IngredientAssignment_3 )* )
            {
            // InternalRecipeDSL.g:793:2: ( ( rule__Recipe__IngredientAssignment_3 ) )
            // InternalRecipeDSL.g:794:3: ( rule__Recipe__IngredientAssignment_3 )
            {
             before(grammarAccess.getRecipeAccess().getIngredientAssignment_3()); 
            // InternalRecipeDSL.g:795:3: ( rule__Recipe__IngredientAssignment_3 )
            // InternalRecipeDSL.g:795:4: rule__Recipe__IngredientAssignment_3
            {
            pushFollow(FOLLOW_11);
            rule__Recipe__IngredientAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getIngredientAssignment_3()); 

            }

            // InternalRecipeDSL.g:798:2: ( ( rule__Recipe__IngredientAssignment_3 )* )
            // InternalRecipeDSL.g:799:3: ( rule__Recipe__IngredientAssignment_3 )*
            {
             before(grammarAccess.getRecipeAccess().getIngredientAssignment_3()); 
            // InternalRecipeDSL.g:800:3: ( rule__Recipe__IngredientAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==30) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalRecipeDSL.g:800:4: rule__Recipe__IngredientAssignment_3
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
    // InternalRecipeDSL.g:809:1: rule__Recipe__Group__4 : rule__Recipe__Group__4__Impl rule__Recipe__Group__5 ;
    public final void rule__Recipe__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:813:1: ( rule__Recipe__Group__4__Impl rule__Recipe__Group__5 )
            // InternalRecipeDSL.g:814:2: rule__Recipe__Group__4__Impl rule__Recipe__Group__5
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
    // InternalRecipeDSL.g:821:1: rule__Recipe__Group__4__Impl : ( ( ( rule__Recipe__DeviceAssignment_4 ) ) ( ( rule__Recipe__DeviceAssignment_4 )* ) ) ;
    public final void rule__Recipe__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:825:1: ( ( ( ( rule__Recipe__DeviceAssignment_4 ) ) ( ( rule__Recipe__DeviceAssignment_4 )* ) ) )
            // InternalRecipeDSL.g:826:1: ( ( ( rule__Recipe__DeviceAssignment_4 ) ) ( ( rule__Recipe__DeviceAssignment_4 )* ) )
            {
            // InternalRecipeDSL.g:826:1: ( ( ( rule__Recipe__DeviceAssignment_4 ) ) ( ( rule__Recipe__DeviceAssignment_4 )* ) )
            // InternalRecipeDSL.g:827:2: ( ( rule__Recipe__DeviceAssignment_4 ) ) ( ( rule__Recipe__DeviceAssignment_4 )* )
            {
            // InternalRecipeDSL.g:827:2: ( ( rule__Recipe__DeviceAssignment_4 ) )
            // InternalRecipeDSL.g:828:3: ( rule__Recipe__DeviceAssignment_4 )
            {
             before(grammarAccess.getRecipeAccess().getDeviceAssignment_4()); 
            // InternalRecipeDSL.g:829:3: ( rule__Recipe__DeviceAssignment_4 )
            // InternalRecipeDSL.g:829:4: rule__Recipe__DeviceAssignment_4
            {
            pushFollow(FOLLOW_13);
            rule__Recipe__DeviceAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getDeviceAssignment_4()); 

            }

            // InternalRecipeDSL.g:832:2: ( ( rule__Recipe__DeviceAssignment_4 )* )
            // InternalRecipeDSL.g:833:3: ( rule__Recipe__DeviceAssignment_4 )*
            {
             before(grammarAccess.getRecipeAccess().getDeviceAssignment_4()); 
            // InternalRecipeDSL.g:834:3: ( rule__Recipe__DeviceAssignment_4 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==33) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalRecipeDSL.g:834:4: rule__Recipe__DeviceAssignment_4
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
    // InternalRecipeDSL.g:843:1: rule__Recipe__Group__5 : rule__Recipe__Group__5__Impl ;
    public final void rule__Recipe__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:847:1: ( rule__Recipe__Group__5__Impl )
            // InternalRecipeDSL.g:848:2: rule__Recipe__Group__5__Impl
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
    // InternalRecipeDSL.g:854:1: rule__Recipe__Group__5__Impl : ( ( ( rule__Recipe__CookingAssignment_5 ) ) ( ( rule__Recipe__CookingAssignment_5 )* ) ) ;
    public final void rule__Recipe__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:858:1: ( ( ( ( rule__Recipe__CookingAssignment_5 ) ) ( ( rule__Recipe__CookingAssignment_5 )* ) ) )
            // InternalRecipeDSL.g:859:1: ( ( ( rule__Recipe__CookingAssignment_5 ) ) ( ( rule__Recipe__CookingAssignment_5 )* ) )
            {
            // InternalRecipeDSL.g:859:1: ( ( ( rule__Recipe__CookingAssignment_5 ) ) ( ( rule__Recipe__CookingAssignment_5 )* ) )
            // InternalRecipeDSL.g:860:2: ( ( rule__Recipe__CookingAssignment_5 ) ) ( ( rule__Recipe__CookingAssignment_5 )* )
            {
            // InternalRecipeDSL.g:860:2: ( ( rule__Recipe__CookingAssignment_5 ) )
            // InternalRecipeDSL.g:861:3: ( rule__Recipe__CookingAssignment_5 )
            {
             before(grammarAccess.getRecipeAccess().getCookingAssignment_5()); 
            // InternalRecipeDSL.g:862:3: ( rule__Recipe__CookingAssignment_5 )
            // InternalRecipeDSL.g:862:4: rule__Recipe__CookingAssignment_5
            {
            pushFollow(FOLLOW_14);
            rule__Recipe__CookingAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getCookingAssignment_5()); 

            }

            // InternalRecipeDSL.g:865:2: ( ( rule__Recipe__CookingAssignment_5 )* )
            // InternalRecipeDSL.g:866:3: ( rule__Recipe__CookingAssignment_5 )*
            {
             before(grammarAccess.getRecipeAccess().getCookingAssignment_5()); 
            // InternalRecipeDSL.g:867:3: ( rule__Recipe__CookingAssignment_5 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==34) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalRecipeDSL.g:867:4: rule__Recipe__CookingAssignment_5
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
    // InternalRecipeDSL.g:877:1: rule__Level__Group__0 : rule__Level__Group__0__Impl rule__Level__Group__1 ;
    public final void rule__Level__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:881:1: ( rule__Level__Group__0__Impl rule__Level__Group__1 )
            // InternalRecipeDSL.g:882:2: rule__Level__Group__0__Impl rule__Level__Group__1
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
    // InternalRecipeDSL.g:889:1: rule__Level__Group__0__Impl : ( 'Level' ) ;
    public final void rule__Level__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:893:1: ( ( 'Level' ) )
            // InternalRecipeDSL.g:894:1: ( 'Level' )
            {
            // InternalRecipeDSL.g:894:1: ( 'Level' )
            // InternalRecipeDSL.g:895:2: 'Level'
            {
             before(grammarAccess.getLevelAccess().getLevelKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalRecipeDSL.g:904:1: rule__Level__Group__1 : rule__Level__Group__1__Impl ;
    public final void rule__Level__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:908:1: ( rule__Level__Group__1__Impl )
            // InternalRecipeDSL.g:909:2: rule__Level__Group__1__Impl
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
    // InternalRecipeDSL.g:915:1: rule__Level__Group__1__Impl : ( ( rule__Level__RatingAssignment_1 ) ) ;
    public final void rule__Level__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:919:1: ( ( ( rule__Level__RatingAssignment_1 ) ) )
            // InternalRecipeDSL.g:920:1: ( ( rule__Level__RatingAssignment_1 ) )
            {
            // InternalRecipeDSL.g:920:1: ( ( rule__Level__RatingAssignment_1 ) )
            // InternalRecipeDSL.g:921:2: ( rule__Level__RatingAssignment_1 )
            {
             before(grammarAccess.getLevelAccess().getRatingAssignment_1()); 
            // InternalRecipeDSL.g:922:2: ( rule__Level__RatingAssignment_1 )
            // InternalRecipeDSL.g:922:3: rule__Level__RatingAssignment_1
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


    // $ANTLR start "rule__Ingredient__Group__0"
    // InternalRecipeDSL.g:931:1: rule__Ingredient__Group__0 : rule__Ingredient__Group__0__Impl rule__Ingredient__Group__1 ;
    public final void rule__Ingredient__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:935:1: ( rule__Ingredient__Group__0__Impl rule__Ingredient__Group__1 )
            // InternalRecipeDSL.g:936:2: rule__Ingredient__Group__0__Impl rule__Ingredient__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalRecipeDSL.g:943:1: rule__Ingredient__Group__0__Impl : ( 'Ingredient' ) ;
    public final void rule__Ingredient__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:947:1: ( ( 'Ingredient' ) )
            // InternalRecipeDSL.g:948:1: ( 'Ingredient' )
            {
            // InternalRecipeDSL.g:948:1: ( 'Ingredient' )
            // InternalRecipeDSL.g:949:2: 'Ingredient'
            {
             before(grammarAccess.getIngredientAccess().getIngredientKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalRecipeDSL.g:958:1: rule__Ingredient__Group__1 : rule__Ingredient__Group__1__Impl rule__Ingredient__Group__2 ;
    public final void rule__Ingredient__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:962:1: ( rule__Ingredient__Group__1__Impl rule__Ingredient__Group__2 )
            // InternalRecipeDSL.g:963:2: rule__Ingredient__Group__1__Impl rule__Ingredient__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalRecipeDSL.g:970:1: rule__Ingredient__Group__1__Impl : ( ( rule__Ingredient__NameAssignment_1 ) ) ;
    public final void rule__Ingredient__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:974:1: ( ( ( rule__Ingredient__NameAssignment_1 ) ) )
            // InternalRecipeDSL.g:975:1: ( ( rule__Ingredient__NameAssignment_1 ) )
            {
            // InternalRecipeDSL.g:975:1: ( ( rule__Ingredient__NameAssignment_1 ) )
            // InternalRecipeDSL.g:976:2: ( rule__Ingredient__NameAssignment_1 )
            {
             before(grammarAccess.getIngredientAccess().getNameAssignment_1()); 
            // InternalRecipeDSL.g:977:2: ( rule__Ingredient__NameAssignment_1 )
            // InternalRecipeDSL.g:977:3: rule__Ingredient__NameAssignment_1
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
    // InternalRecipeDSL.g:985:1: rule__Ingredient__Group__2 : rule__Ingredient__Group__2__Impl rule__Ingredient__Group__3 ;
    public final void rule__Ingredient__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:989:1: ( rule__Ingredient__Group__2__Impl rule__Ingredient__Group__3 )
            // InternalRecipeDSL.g:990:2: rule__Ingredient__Group__2__Impl rule__Ingredient__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalRecipeDSL.g:997:1: rule__Ingredient__Group__2__Impl : ( 'amount' ) ;
    public final void rule__Ingredient__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1001:1: ( ( 'amount' ) )
            // InternalRecipeDSL.g:1002:1: ( 'amount' )
            {
            // InternalRecipeDSL.g:1002:1: ( 'amount' )
            // InternalRecipeDSL.g:1003:2: 'amount'
            {
             before(grammarAccess.getIngredientAccess().getAmountKeyword_2()); 
            match(input,31,FOLLOW_2); 
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
    // InternalRecipeDSL.g:1012:1: rule__Ingredient__Group__3 : rule__Ingredient__Group__3__Impl ;
    public final void rule__Ingredient__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1016:1: ( rule__Ingredient__Group__3__Impl )
            // InternalRecipeDSL.g:1017:2: rule__Ingredient__Group__3__Impl
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
    // InternalRecipeDSL.g:1023:1: rule__Ingredient__Group__3__Impl : ( ( rule__Ingredient__MeasureAssignment_3 ) ) ;
    public final void rule__Ingredient__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1027:1: ( ( ( rule__Ingredient__MeasureAssignment_3 ) ) )
            // InternalRecipeDSL.g:1028:1: ( ( rule__Ingredient__MeasureAssignment_3 ) )
            {
            // InternalRecipeDSL.g:1028:1: ( ( rule__Ingredient__MeasureAssignment_3 ) )
            // InternalRecipeDSL.g:1029:2: ( rule__Ingredient__MeasureAssignment_3 )
            {
             before(grammarAccess.getIngredientAccess().getMeasureAssignment_3()); 
            // InternalRecipeDSL.g:1030:2: ( rule__Ingredient__MeasureAssignment_3 )
            // InternalRecipeDSL.g:1030:3: rule__Ingredient__MeasureAssignment_3
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
    // InternalRecipeDSL.g:1039:1: rule__Weight__Group__0 : rule__Weight__Group__0__Impl rule__Weight__Group__1 ;
    public final void rule__Weight__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1043:1: ( rule__Weight__Group__0__Impl rule__Weight__Group__1 )
            // InternalRecipeDSL.g:1044:2: rule__Weight__Group__0__Impl rule__Weight__Group__1
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
    // InternalRecipeDSL.g:1051:1: rule__Weight__Group__0__Impl : ( ( rule__Weight__WeightAssignment_0 ) ) ;
    public final void rule__Weight__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1055:1: ( ( ( rule__Weight__WeightAssignment_0 ) ) )
            // InternalRecipeDSL.g:1056:1: ( ( rule__Weight__WeightAssignment_0 ) )
            {
            // InternalRecipeDSL.g:1056:1: ( ( rule__Weight__WeightAssignment_0 ) )
            // InternalRecipeDSL.g:1057:2: ( rule__Weight__WeightAssignment_0 )
            {
             before(grammarAccess.getWeightAccess().getWeightAssignment_0()); 
            // InternalRecipeDSL.g:1058:2: ( rule__Weight__WeightAssignment_0 )
            // InternalRecipeDSL.g:1058:3: rule__Weight__WeightAssignment_0
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
    // InternalRecipeDSL.g:1066:1: rule__Weight__Group__1 : rule__Weight__Group__1__Impl ;
    public final void rule__Weight__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1070:1: ( rule__Weight__Group__1__Impl )
            // InternalRecipeDSL.g:1071:2: rule__Weight__Group__1__Impl
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
    // InternalRecipeDSL.g:1077:1: rule__Weight__Group__1__Impl : ( ( rule__Weight__Alternatives_1 ) ) ;
    public final void rule__Weight__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1081:1: ( ( ( rule__Weight__Alternatives_1 ) ) )
            // InternalRecipeDSL.g:1082:1: ( ( rule__Weight__Alternatives_1 ) )
            {
            // InternalRecipeDSL.g:1082:1: ( ( rule__Weight__Alternatives_1 ) )
            // InternalRecipeDSL.g:1083:2: ( rule__Weight__Alternatives_1 )
            {
             before(grammarAccess.getWeightAccess().getAlternatives_1()); 
            // InternalRecipeDSL.g:1084:2: ( rule__Weight__Alternatives_1 )
            // InternalRecipeDSL.g:1084:3: rule__Weight__Alternatives_1
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
    // InternalRecipeDSL.g:1093:1: rule__Count__Group__0 : rule__Count__Group__0__Impl rule__Count__Group__1 ;
    public final void rule__Count__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1097:1: ( rule__Count__Group__0__Impl rule__Count__Group__1 )
            // InternalRecipeDSL.g:1098:2: rule__Count__Group__0__Impl rule__Count__Group__1
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
    // InternalRecipeDSL.g:1105:1: rule__Count__Group__0__Impl : ( ( rule__Count__CountAssignment_0 ) ) ;
    public final void rule__Count__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1109:1: ( ( ( rule__Count__CountAssignment_0 ) ) )
            // InternalRecipeDSL.g:1110:1: ( ( rule__Count__CountAssignment_0 ) )
            {
            // InternalRecipeDSL.g:1110:1: ( ( rule__Count__CountAssignment_0 ) )
            // InternalRecipeDSL.g:1111:2: ( rule__Count__CountAssignment_0 )
            {
             before(grammarAccess.getCountAccess().getCountAssignment_0()); 
            // InternalRecipeDSL.g:1112:2: ( rule__Count__CountAssignment_0 )
            // InternalRecipeDSL.g:1112:3: rule__Count__CountAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Count__CountAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCountAccess().getCountAssignment_0()); 

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
    // InternalRecipeDSL.g:1120:1: rule__Count__Group__1 : rule__Count__Group__1__Impl ;
    public final void rule__Count__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1124:1: ( rule__Count__Group__1__Impl )
            // InternalRecipeDSL.g:1125:2: rule__Count__Group__1__Impl
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
    // InternalRecipeDSL.g:1131:1: rule__Count__Group__1__Impl : ( 'pieces' ) ;
    public final void rule__Count__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1135:1: ( ( 'pieces' ) )
            // InternalRecipeDSL.g:1136:1: ( 'pieces' )
            {
            // InternalRecipeDSL.g:1136:1: ( 'pieces' )
            // InternalRecipeDSL.g:1137:2: 'pieces'
            {
             before(grammarAccess.getCountAccess().getPiecesKeyword_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalRecipeDSL.g:1147:1: rule__Device__Group__0 : rule__Device__Group__0__Impl rule__Device__Group__1 ;
    public final void rule__Device__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1151:1: ( rule__Device__Group__0__Impl rule__Device__Group__1 )
            // InternalRecipeDSL.g:1152:2: rule__Device__Group__0__Impl rule__Device__Group__1
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
    // InternalRecipeDSL.g:1159:1: rule__Device__Group__0__Impl : ( 'Device' ) ;
    public final void rule__Device__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1163:1: ( ( 'Device' ) )
            // InternalRecipeDSL.g:1164:1: ( 'Device' )
            {
            // InternalRecipeDSL.g:1164:1: ( 'Device' )
            // InternalRecipeDSL.g:1165:2: 'Device'
            {
             before(grammarAccess.getDeviceAccess().getDeviceKeyword_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalRecipeDSL.g:1174:1: rule__Device__Group__1 : rule__Device__Group__1__Impl ;
    public final void rule__Device__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1178:1: ( rule__Device__Group__1__Impl )
            // InternalRecipeDSL.g:1179:2: rule__Device__Group__1__Impl
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
    // InternalRecipeDSL.g:1185:1: rule__Device__Group__1__Impl : ( ( rule__Device__NameAssignment_1 ) ) ;
    public final void rule__Device__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1189:1: ( ( ( rule__Device__NameAssignment_1 ) ) )
            // InternalRecipeDSL.g:1190:1: ( ( rule__Device__NameAssignment_1 ) )
            {
            // InternalRecipeDSL.g:1190:1: ( ( rule__Device__NameAssignment_1 ) )
            // InternalRecipeDSL.g:1191:2: ( rule__Device__NameAssignment_1 )
            {
             before(grammarAccess.getDeviceAccess().getNameAssignment_1()); 
            // InternalRecipeDSL.g:1192:2: ( rule__Device__NameAssignment_1 )
            // InternalRecipeDSL.g:1192:3: rule__Device__NameAssignment_1
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
    // InternalRecipeDSL.g:1201:1: rule__Cooking__Group__0 : rule__Cooking__Group__0__Impl rule__Cooking__Group__1 ;
    public final void rule__Cooking__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1205:1: ( rule__Cooking__Group__0__Impl rule__Cooking__Group__1 )
            // InternalRecipeDSL.g:1206:2: rule__Cooking__Group__0__Impl rule__Cooking__Group__1
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
    // InternalRecipeDSL.g:1213:1: rule__Cooking__Group__0__Impl : ( 'Step' ) ;
    public final void rule__Cooking__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1217:1: ( ( 'Step' ) )
            // InternalRecipeDSL.g:1218:1: ( 'Step' )
            {
            // InternalRecipeDSL.g:1218:1: ( 'Step' )
            // InternalRecipeDSL.g:1219:2: 'Step'
            {
             before(grammarAccess.getCookingAccess().getStepKeyword_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalRecipeDSL.g:1228:1: rule__Cooking__Group__1 : rule__Cooking__Group__1__Impl rule__Cooking__Group__2 ;
    public final void rule__Cooking__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1232:1: ( rule__Cooking__Group__1__Impl rule__Cooking__Group__2 )
            // InternalRecipeDSL.g:1233:2: rule__Cooking__Group__1__Impl rule__Cooking__Group__2
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
    // InternalRecipeDSL.g:1240:1: rule__Cooking__Group__1__Impl : ( ( rule__Cooking__SAssignment_1 ) ) ;
    public final void rule__Cooking__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1244:1: ( ( ( rule__Cooking__SAssignment_1 ) ) )
            // InternalRecipeDSL.g:1245:1: ( ( rule__Cooking__SAssignment_1 ) )
            {
            // InternalRecipeDSL.g:1245:1: ( ( rule__Cooking__SAssignment_1 ) )
            // InternalRecipeDSL.g:1246:2: ( rule__Cooking__SAssignment_1 )
            {
             before(grammarAccess.getCookingAccess().getSAssignment_1()); 
            // InternalRecipeDSL.g:1247:2: ( rule__Cooking__SAssignment_1 )
            // InternalRecipeDSL.g:1247:3: rule__Cooking__SAssignment_1
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
    // InternalRecipeDSL.g:1255:1: rule__Cooking__Group__2 : rule__Cooking__Group__2__Impl ;
    public final void rule__Cooking__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1259:1: ( rule__Cooking__Group__2__Impl )
            // InternalRecipeDSL.g:1260:2: rule__Cooking__Group__2__Impl
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
    // InternalRecipeDSL.g:1266:1: rule__Cooking__Group__2__Impl : ( ( rule__Cooking__Group_2__0 ) ) ;
    public final void rule__Cooking__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1270:1: ( ( ( rule__Cooking__Group_2__0 ) ) )
            // InternalRecipeDSL.g:1271:1: ( ( rule__Cooking__Group_2__0 ) )
            {
            // InternalRecipeDSL.g:1271:1: ( ( rule__Cooking__Group_2__0 ) )
            // InternalRecipeDSL.g:1272:2: ( rule__Cooking__Group_2__0 )
            {
             before(grammarAccess.getCookingAccess().getGroup_2()); 
            // InternalRecipeDSL.g:1273:2: ( rule__Cooking__Group_2__0 )
            // InternalRecipeDSL.g:1273:3: rule__Cooking__Group_2__0
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
    // InternalRecipeDSL.g:1282:1: rule__Cooking__Group_2__0 : rule__Cooking__Group_2__0__Impl rule__Cooking__Group_2__1 ;
    public final void rule__Cooking__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1286:1: ( rule__Cooking__Group_2__0__Impl rule__Cooking__Group_2__1 )
            // InternalRecipeDSL.g:1287:2: rule__Cooking__Group_2__0__Impl rule__Cooking__Group_2__1
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
    // InternalRecipeDSL.g:1294:1: rule__Cooking__Group_2__0__Impl : ( ( rule__Cooking__TimeAssignment_2_0 ) ) ;
    public final void rule__Cooking__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1298:1: ( ( ( rule__Cooking__TimeAssignment_2_0 ) ) )
            // InternalRecipeDSL.g:1299:1: ( ( rule__Cooking__TimeAssignment_2_0 ) )
            {
            // InternalRecipeDSL.g:1299:1: ( ( rule__Cooking__TimeAssignment_2_0 ) )
            // InternalRecipeDSL.g:1300:2: ( rule__Cooking__TimeAssignment_2_0 )
            {
             before(grammarAccess.getCookingAccess().getTimeAssignment_2_0()); 
            // InternalRecipeDSL.g:1301:2: ( rule__Cooking__TimeAssignment_2_0 )
            // InternalRecipeDSL.g:1301:3: rule__Cooking__TimeAssignment_2_0
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
    // InternalRecipeDSL.g:1309:1: rule__Cooking__Group_2__1 : rule__Cooking__Group_2__1__Impl rule__Cooking__Group_2__2 ;
    public final void rule__Cooking__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1313:1: ( rule__Cooking__Group_2__1__Impl rule__Cooking__Group_2__2 )
            // InternalRecipeDSL.g:1314:2: rule__Cooking__Group_2__1__Impl rule__Cooking__Group_2__2
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
    // InternalRecipeDSL.g:1321:1: rule__Cooking__Group_2__1__Impl : ( ':' ) ;
    public final void rule__Cooking__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1325:1: ( ( ':' ) )
            // InternalRecipeDSL.g:1326:1: ( ':' )
            {
            // InternalRecipeDSL.g:1326:1: ( ':' )
            // InternalRecipeDSL.g:1327:2: ':'
            {
             before(grammarAccess.getCookingAccess().getColonKeyword_2_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getCookingAccess().getColonKeyword_2_1()); 

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
    // InternalRecipeDSL.g:1336:1: rule__Cooking__Group_2__2 : rule__Cooking__Group_2__2__Impl ;
    public final void rule__Cooking__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1340:1: ( rule__Cooking__Group_2__2__Impl )
            // InternalRecipeDSL.g:1341:2: rule__Cooking__Group_2__2__Impl
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
    // InternalRecipeDSL.g:1347:1: rule__Cooking__Group_2__2__Impl : ( ( rule__Cooking__StepAssignment_2_2 ) ) ;
    public final void rule__Cooking__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1351:1: ( ( ( rule__Cooking__StepAssignment_2_2 ) ) )
            // InternalRecipeDSL.g:1352:1: ( ( rule__Cooking__StepAssignment_2_2 ) )
            {
            // InternalRecipeDSL.g:1352:1: ( ( rule__Cooking__StepAssignment_2_2 ) )
            // InternalRecipeDSL.g:1353:2: ( rule__Cooking__StepAssignment_2_2 )
            {
             before(grammarAccess.getCookingAccess().getStepAssignment_2_2()); 
            // InternalRecipeDSL.g:1354:2: ( rule__Cooking__StepAssignment_2_2 )
            // InternalRecipeDSL.g:1354:3: rule__Cooking__StepAssignment_2_2
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
    // InternalRecipeDSL.g:1363:1: rule__Time__Group__0 : rule__Time__Group__0__Impl rule__Time__Group__1 ;
    public final void rule__Time__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1367:1: ( rule__Time__Group__0__Impl rule__Time__Group__1 )
            // InternalRecipeDSL.g:1368:2: rule__Time__Group__0__Impl rule__Time__Group__1
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
    // InternalRecipeDSL.g:1375:1: rule__Time__Group__0__Impl : ( 'For' ) ;
    public final void rule__Time__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1379:1: ( ( 'For' ) )
            // InternalRecipeDSL.g:1380:1: ( 'For' )
            {
            // InternalRecipeDSL.g:1380:1: ( 'For' )
            // InternalRecipeDSL.g:1381:2: 'For'
            {
             before(grammarAccess.getTimeAccess().getForKeyword_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalRecipeDSL.g:1390:1: rule__Time__Group__1 : rule__Time__Group__1__Impl rule__Time__Group__2 ;
    public final void rule__Time__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1394:1: ( rule__Time__Group__1__Impl rule__Time__Group__2 )
            // InternalRecipeDSL.g:1395:2: rule__Time__Group__1__Impl rule__Time__Group__2
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
    // InternalRecipeDSL.g:1402:1: rule__Time__Group__1__Impl : ( ( rule__Time__TimeAssignment_1 ) ) ;
    public final void rule__Time__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1406:1: ( ( ( rule__Time__TimeAssignment_1 ) ) )
            // InternalRecipeDSL.g:1407:1: ( ( rule__Time__TimeAssignment_1 ) )
            {
            // InternalRecipeDSL.g:1407:1: ( ( rule__Time__TimeAssignment_1 ) )
            // InternalRecipeDSL.g:1408:2: ( rule__Time__TimeAssignment_1 )
            {
             before(grammarAccess.getTimeAccess().getTimeAssignment_1()); 
            // InternalRecipeDSL.g:1409:2: ( rule__Time__TimeAssignment_1 )
            // InternalRecipeDSL.g:1409:3: rule__Time__TimeAssignment_1
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
    // InternalRecipeDSL.g:1417:1: rule__Time__Group__2 : rule__Time__Group__2__Impl ;
    public final void rule__Time__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1421:1: ( rule__Time__Group__2__Impl )
            // InternalRecipeDSL.g:1422:2: rule__Time__Group__2__Impl
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
    // InternalRecipeDSL.g:1428:1: rule__Time__Group__2__Impl : ( ( rule__Time__Alternatives_2 ) ) ;
    public final void rule__Time__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1432:1: ( ( ( rule__Time__Alternatives_2 ) ) )
            // InternalRecipeDSL.g:1433:1: ( ( rule__Time__Alternatives_2 ) )
            {
            // InternalRecipeDSL.g:1433:1: ( ( rule__Time__Alternatives_2 ) )
            // InternalRecipeDSL.g:1434:2: ( rule__Time__Alternatives_2 )
            {
             before(grammarAccess.getTimeAccess().getAlternatives_2()); 
            // InternalRecipeDSL.g:1435:2: ( rule__Time__Alternatives_2 )
            // InternalRecipeDSL.g:1435:3: rule__Time__Alternatives_2
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
    // InternalRecipeDSL.g:1444:1: rule__Step__Group__0 : rule__Step__Group__0__Impl rule__Step__Group__1 ;
    public final void rule__Step__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1448:1: ( rule__Step__Group__0__Impl rule__Step__Group__1 )
            // InternalRecipeDSL.g:1449:2: rule__Step__Group__0__Impl rule__Step__Group__1
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
    // InternalRecipeDSL.g:1456:1: rule__Step__Group__0__Impl : ( 'Use' ) ;
    public final void rule__Step__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1460:1: ( ( 'Use' ) )
            // InternalRecipeDSL.g:1461:1: ( 'Use' )
            {
            // InternalRecipeDSL.g:1461:1: ( 'Use' )
            // InternalRecipeDSL.g:1462:2: 'Use'
            {
             before(grammarAccess.getStepAccess().getUseKeyword_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalRecipeDSL.g:1471:1: rule__Step__Group__1 : rule__Step__Group__1__Impl rule__Step__Group__2 ;
    public final void rule__Step__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1475:1: ( rule__Step__Group__1__Impl rule__Step__Group__2 )
            // InternalRecipeDSL.g:1476:2: rule__Step__Group__1__Impl rule__Step__Group__2
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
    // InternalRecipeDSL.g:1483:1: rule__Step__Group__1__Impl : ( ( rule__Step__DevAssignment_1 ) ) ;
    public final void rule__Step__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1487:1: ( ( ( rule__Step__DevAssignment_1 ) ) )
            // InternalRecipeDSL.g:1488:1: ( ( rule__Step__DevAssignment_1 ) )
            {
            // InternalRecipeDSL.g:1488:1: ( ( rule__Step__DevAssignment_1 ) )
            // InternalRecipeDSL.g:1489:2: ( rule__Step__DevAssignment_1 )
            {
             before(grammarAccess.getStepAccess().getDevAssignment_1()); 
            // InternalRecipeDSL.g:1490:2: ( rule__Step__DevAssignment_1 )
            // InternalRecipeDSL.g:1490:3: rule__Step__DevAssignment_1
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
    // InternalRecipeDSL.g:1498:1: rule__Step__Group__2 : rule__Step__Group__2__Impl rule__Step__Group__3 ;
    public final void rule__Step__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1502:1: ( rule__Step__Group__2__Impl rule__Step__Group__3 )
            // InternalRecipeDSL.g:1503:2: rule__Step__Group__2__Impl rule__Step__Group__3
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
    // InternalRecipeDSL.g:1510:1: rule__Step__Group__2__Impl : ( ( rule__Step__Group_2__0 )* ) ;
    public final void rule__Step__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1514:1: ( ( ( rule__Step__Group_2__0 )* ) )
            // InternalRecipeDSL.g:1515:1: ( ( rule__Step__Group_2__0 )* )
            {
            // InternalRecipeDSL.g:1515:1: ( ( rule__Step__Group_2__0 )* )
            // InternalRecipeDSL.g:1516:2: ( rule__Step__Group_2__0 )*
            {
             before(grammarAccess.getStepAccess().getGroup_2()); 
            // InternalRecipeDSL.g:1517:2: ( rule__Step__Group_2__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==27) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalRecipeDSL.g:1517:3: rule__Step__Group_2__0
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
    // InternalRecipeDSL.g:1525:1: rule__Step__Group__3 : rule__Step__Group__3__Impl rule__Step__Group__4 ;
    public final void rule__Step__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1529:1: ( rule__Step__Group__3__Impl rule__Step__Group__4 )
            // InternalRecipeDSL.g:1530:2: rule__Step__Group__3__Impl rule__Step__Group__4
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
    // InternalRecipeDSL.g:1537:1: rule__Step__Group__3__Impl : ( 'with' ) ;
    public final void rule__Step__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1541:1: ( ( 'with' ) )
            // InternalRecipeDSL.g:1542:1: ( 'with' )
            {
            // InternalRecipeDSL.g:1542:1: ( 'with' )
            // InternalRecipeDSL.g:1543:2: 'with'
            {
             before(grammarAccess.getStepAccess().getWithKeyword_3()); 
            match(input,38,FOLLOW_2); 
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
    // InternalRecipeDSL.g:1552:1: rule__Step__Group__4 : rule__Step__Group__4__Impl rule__Step__Group__5 ;
    public final void rule__Step__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1556:1: ( rule__Step__Group__4__Impl rule__Step__Group__5 )
            // InternalRecipeDSL.g:1557:2: rule__Step__Group__4__Impl rule__Step__Group__5
            {
            pushFollow(FOLLOW_26);
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
    // InternalRecipeDSL.g:1564:1: rule__Step__Group__4__Impl : ( ( rule__Step__IngAssignment_4 ) ) ;
    public final void rule__Step__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1568:1: ( ( ( rule__Step__IngAssignment_4 ) ) )
            // InternalRecipeDSL.g:1569:1: ( ( rule__Step__IngAssignment_4 ) )
            {
            // InternalRecipeDSL.g:1569:1: ( ( rule__Step__IngAssignment_4 ) )
            // InternalRecipeDSL.g:1570:2: ( rule__Step__IngAssignment_4 )
            {
             before(grammarAccess.getStepAccess().getIngAssignment_4()); 
            // InternalRecipeDSL.g:1571:2: ( rule__Step__IngAssignment_4 )
            // InternalRecipeDSL.g:1571:3: rule__Step__IngAssignment_4
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
    // InternalRecipeDSL.g:1579:1: rule__Step__Group__5 : rule__Step__Group__5__Impl ;
    public final void rule__Step__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1583:1: ( rule__Step__Group__5__Impl )
            // InternalRecipeDSL.g:1584:2: rule__Step__Group__5__Impl
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
    // InternalRecipeDSL.g:1590:1: rule__Step__Group__5__Impl : ( ( rule__Step__Group_5__0 )* ) ;
    public final void rule__Step__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1594:1: ( ( ( rule__Step__Group_5__0 )* ) )
            // InternalRecipeDSL.g:1595:1: ( ( rule__Step__Group_5__0 )* )
            {
            // InternalRecipeDSL.g:1595:1: ( ( rule__Step__Group_5__0 )* )
            // InternalRecipeDSL.g:1596:2: ( rule__Step__Group_5__0 )*
            {
             before(grammarAccess.getStepAccess().getGroup_5()); 
            // InternalRecipeDSL.g:1597:2: ( rule__Step__Group_5__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==27) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalRecipeDSL.g:1597:3: rule__Step__Group_5__0
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
    // InternalRecipeDSL.g:1606:1: rule__Step__Group_2__0 : rule__Step__Group_2__0__Impl rule__Step__Group_2__1 ;
    public final void rule__Step__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1610:1: ( rule__Step__Group_2__0__Impl rule__Step__Group_2__1 )
            // InternalRecipeDSL.g:1611:2: rule__Step__Group_2__0__Impl rule__Step__Group_2__1
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
    // InternalRecipeDSL.g:1618:1: rule__Step__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Step__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1622:1: ( ( ',' ) )
            // InternalRecipeDSL.g:1623:1: ( ',' )
            {
            // InternalRecipeDSL.g:1623:1: ( ',' )
            // InternalRecipeDSL.g:1624:2: ','
            {
             before(grammarAccess.getStepAccess().getCommaKeyword_2_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalRecipeDSL.g:1633:1: rule__Step__Group_2__1 : rule__Step__Group_2__1__Impl ;
    public final void rule__Step__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1637:1: ( rule__Step__Group_2__1__Impl )
            // InternalRecipeDSL.g:1638:2: rule__Step__Group_2__1__Impl
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
    // InternalRecipeDSL.g:1644:1: rule__Step__Group_2__1__Impl : ( ( rule__Step__Dev2Assignment_2_1 ) ) ;
    public final void rule__Step__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1648:1: ( ( ( rule__Step__Dev2Assignment_2_1 ) ) )
            // InternalRecipeDSL.g:1649:1: ( ( rule__Step__Dev2Assignment_2_1 ) )
            {
            // InternalRecipeDSL.g:1649:1: ( ( rule__Step__Dev2Assignment_2_1 ) )
            // InternalRecipeDSL.g:1650:2: ( rule__Step__Dev2Assignment_2_1 )
            {
             before(grammarAccess.getStepAccess().getDev2Assignment_2_1()); 
            // InternalRecipeDSL.g:1651:2: ( rule__Step__Dev2Assignment_2_1 )
            // InternalRecipeDSL.g:1651:3: rule__Step__Dev2Assignment_2_1
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
    // InternalRecipeDSL.g:1660:1: rule__Step__Group_5__0 : rule__Step__Group_5__0__Impl rule__Step__Group_5__1 ;
    public final void rule__Step__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1664:1: ( rule__Step__Group_5__0__Impl rule__Step__Group_5__1 )
            // InternalRecipeDSL.g:1665:2: rule__Step__Group_5__0__Impl rule__Step__Group_5__1
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
    // InternalRecipeDSL.g:1672:1: rule__Step__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Step__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1676:1: ( ( ',' ) )
            // InternalRecipeDSL.g:1677:1: ( ',' )
            {
            // InternalRecipeDSL.g:1677:1: ( ',' )
            // InternalRecipeDSL.g:1678:2: ','
            {
             before(grammarAccess.getStepAccess().getCommaKeyword_5_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalRecipeDSL.g:1687:1: rule__Step__Group_5__1 : rule__Step__Group_5__1__Impl ;
    public final void rule__Step__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1691:1: ( rule__Step__Group_5__1__Impl )
            // InternalRecipeDSL.g:1692:2: rule__Step__Group_5__1__Impl
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
    // InternalRecipeDSL.g:1698:1: rule__Step__Group_5__1__Impl : ( ( rule__Step__Ing2Assignment_5_1 ) ) ;
    public final void rule__Step__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1702:1: ( ( ( rule__Step__Ing2Assignment_5_1 ) ) )
            // InternalRecipeDSL.g:1703:1: ( ( rule__Step__Ing2Assignment_5_1 ) )
            {
            // InternalRecipeDSL.g:1703:1: ( ( rule__Step__Ing2Assignment_5_1 ) )
            // InternalRecipeDSL.g:1704:2: ( rule__Step__Ing2Assignment_5_1 )
            {
             before(grammarAccess.getStepAccess().getIng2Assignment_5_1()); 
            // InternalRecipeDSL.g:1705:2: ( rule__Step__Ing2Assignment_5_1 )
            // InternalRecipeDSL.g:1705:3: rule__Step__Ing2Assignment_5_1
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


    // $ANTLR start "rule__Model__MgrAssignment"
    // InternalRecipeDSL.g:1714:1: rule__Model__MgrAssignment : ( ruleManager ) ;
    public final void rule__Model__MgrAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1718:1: ( ( ruleManager ) )
            // InternalRecipeDSL.g:1719:2: ( ruleManager )
            {
            // InternalRecipeDSL.g:1719:2: ( ruleManager )
            // InternalRecipeDSL.g:1720:3: ruleManager
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
    // InternalRecipeDSL.g:1729:1: rule__Manager__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Manager__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1733:1: ( ( RULE_ID ) )
            // InternalRecipeDSL.g:1734:2: ( RULE_ID )
            {
            // InternalRecipeDSL.g:1734:2: ( RULE_ID )
            // InternalRecipeDSL.g:1735:3: RULE_ID
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
    // InternalRecipeDSL.g:1744:1: rule__Manager__UserAssignment_3 : ( ruleUser ) ;
    public final void rule__Manager__UserAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1748:1: ( ( ruleUser ) )
            // InternalRecipeDSL.g:1749:2: ( ruleUser )
            {
            // InternalRecipeDSL.g:1749:2: ( ruleUser )
            // InternalRecipeDSL.g:1750:3: ruleUser
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
    // InternalRecipeDSL.g:1759:1: rule__Manager__UserAssignment_4_1 : ( ruleUser ) ;
    public final void rule__Manager__UserAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1763:1: ( ( ruleUser ) )
            // InternalRecipeDSL.g:1764:2: ( ruleUser )
            {
            // InternalRecipeDSL.g:1764:2: ( ruleUser )
            // InternalRecipeDSL.g:1765:3: ruleUser
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
    // InternalRecipeDSL.g:1774:1: rule__Manager__RecipesAssignment_5 : ( ruleRecipe ) ;
    public final void rule__Manager__RecipesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1778:1: ( ( ruleRecipe ) )
            // InternalRecipeDSL.g:1779:2: ( ruleRecipe )
            {
            // InternalRecipeDSL.g:1779:2: ( ruleRecipe )
            // InternalRecipeDSL.g:1780:3: ruleRecipe
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
    // InternalRecipeDSL.g:1789:1: rule__User__NameAssignment : ( RULE_ID ) ;
    public final void rule__User__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1793:1: ( ( RULE_ID ) )
            // InternalRecipeDSL.g:1794:2: ( RULE_ID )
            {
            // InternalRecipeDSL.g:1794:2: ( RULE_ID )
            // InternalRecipeDSL.g:1795:3: RULE_ID
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
    // InternalRecipeDSL.g:1804:1: rule__Recipe__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Recipe__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1808:1: ( ( RULE_ID ) )
            // InternalRecipeDSL.g:1809:2: ( RULE_ID )
            {
            // InternalRecipeDSL.g:1809:2: ( RULE_ID )
            // InternalRecipeDSL.g:1810:3: RULE_ID
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
    // InternalRecipeDSL.g:1819:1: rule__Recipe__LevelAssignment_2 : ( ruleLevel ) ;
    public final void rule__Recipe__LevelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1823:1: ( ( ruleLevel ) )
            // InternalRecipeDSL.g:1824:2: ( ruleLevel )
            {
            // InternalRecipeDSL.g:1824:2: ( ruleLevel )
            // InternalRecipeDSL.g:1825:3: ruleLevel
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
    // InternalRecipeDSL.g:1834:1: rule__Recipe__IngredientAssignment_3 : ( ruleIngredient ) ;
    public final void rule__Recipe__IngredientAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1838:1: ( ( ruleIngredient ) )
            // InternalRecipeDSL.g:1839:2: ( ruleIngredient )
            {
            // InternalRecipeDSL.g:1839:2: ( ruleIngredient )
            // InternalRecipeDSL.g:1840:3: ruleIngredient
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
    // InternalRecipeDSL.g:1849:1: rule__Recipe__DeviceAssignment_4 : ( ruleDevice ) ;
    public final void rule__Recipe__DeviceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1853:1: ( ( ruleDevice ) )
            // InternalRecipeDSL.g:1854:2: ( ruleDevice )
            {
            // InternalRecipeDSL.g:1854:2: ( ruleDevice )
            // InternalRecipeDSL.g:1855:3: ruleDevice
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
    // InternalRecipeDSL.g:1864:1: rule__Recipe__CookingAssignment_5 : ( ruleCooking ) ;
    public final void rule__Recipe__CookingAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1868:1: ( ( ruleCooking ) )
            // InternalRecipeDSL.g:1869:2: ( ruleCooking )
            {
            // InternalRecipeDSL.g:1869:2: ( ruleCooking )
            // InternalRecipeDSL.g:1870:3: ruleCooking
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
    // InternalRecipeDSL.g:1879:1: rule__Level__RatingAssignment_1 : ( ( rule__Level__RatingAlternatives_1_0 ) ) ;
    public final void rule__Level__RatingAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1883:1: ( ( ( rule__Level__RatingAlternatives_1_0 ) ) )
            // InternalRecipeDSL.g:1884:2: ( ( rule__Level__RatingAlternatives_1_0 ) )
            {
            // InternalRecipeDSL.g:1884:2: ( ( rule__Level__RatingAlternatives_1_0 ) )
            // InternalRecipeDSL.g:1885:3: ( rule__Level__RatingAlternatives_1_0 )
            {
             before(grammarAccess.getLevelAccess().getRatingAlternatives_1_0()); 
            // InternalRecipeDSL.g:1886:3: ( rule__Level__RatingAlternatives_1_0 )
            // InternalRecipeDSL.g:1886:4: rule__Level__RatingAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Level__RatingAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getLevelAccess().getRatingAlternatives_1_0()); 

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


    // $ANTLR start "rule__Ingredient__NameAssignment_1"
    // InternalRecipeDSL.g:1894:1: rule__Ingredient__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Ingredient__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1898:1: ( ( RULE_ID ) )
            // InternalRecipeDSL.g:1899:2: ( RULE_ID )
            {
            // InternalRecipeDSL.g:1899:2: ( RULE_ID )
            // InternalRecipeDSL.g:1900:3: RULE_ID
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
    // InternalRecipeDSL.g:1909:1: rule__Ingredient__MeasureAssignment_3 : ( ( rule__Ingredient__MeasureAlternatives_3_0 ) ) ;
    public final void rule__Ingredient__MeasureAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1913:1: ( ( ( rule__Ingredient__MeasureAlternatives_3_0 ) ) )
            // InternalRecipeDSL.g:1914:2: ( ( rule__Ingredient__MeasureAlternatives_3_0 ) )
            {
            // InternalRecipeDSL.g:1914:2: ( ( rule__Ingredient__MeasureAlternatives_3_0 ) )
            // InternalRecipeDSL.g:1915:3: ( rule__Ingredient__MeasureAlternatives_3_0 )
            {
             before(grammarAccess.getIngredientAccess().getMeasureAlternatives_3_0()); 
            // InternalRecipeDSL.g:1916:3: ( rule__Ingredient__MeasureAlternatives_3_0 )
            // InternalRecipeDSL.g:1916:4: rule__Ingredient__MeasureAlternatives_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Ingredient__MeasureAlternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getIngredientAccess().getMeasureAlternatives_3_0()); 

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


    // $ANTLR start "rule__Weight__WeightAssignment_0"
    // InternalRecipeDSL.g:1924:1: rule__Weight__WeightAssignment_0 : ( RULE_EFLOAT ) ;
    public final void rule__Weight__WeightAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1928:1: ( ( RULE_EFLOAT ) )
            // InternalRecipeDSL.g:1929:2: ( RULE_EFLOAT )
            {
            // InternalRecipeDSL.g:1929:2: ( RULE_EFLOAT )
            // InternalRecipeDSL.g:1930:3: RULE_EFLOAT
            {
             before(grammarAccess.getWeightAccess().getWeightEFloatTerminalRuleCall_0_0()); 
            match(input,RULE_EFLOAT,FOLLOW_2); 
             after(grammarAccess.getWeightAccess().getWeightEFloatTerminalRuleCall_0_0()); 

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


    // $ANTLR start "rule__Count__CountAssignment_0"
    // InternalRecipeDSL.g:1939:1: rule__Count__CountAssignment_0 : ( RULE_INT ) ;
    public final void rule__Count__CountAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1943:1: ( ( RULE_INT ) )
            // InternalRecipeDSL.g:1944:2: ( RULE_INT )
            {
            // InternalRecipeDSL.g:1944:2: ( RULE_INT )
            // InternalRecipeDSL.g:1945:3: RULE_INT
            {
             before(grammarAccess.getCountAccess().getCountINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCountAccess().getCountINTTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Count__CountAssignment_0"


    // $ANTLR start "rule__Device__NameAssignment_1"
    // InternalRecipeDSL.g:1954:1: rule__Device__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Device__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1958:1: ( ( RULE_ID ) )
            // InternalRecipeDSL.g:1959:2: ( RULE_ID )
            {
            // InternalRecipeDSL.g:1959:2: ( RULE_ID )
            // InternalRecipeDSL.g:1960:3: RULE_ID
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
    // InternalRecipeDSL.g:1969:1: rule__Cooking__SAssignment_1 : ( RULE_INT ) ;
    public final void rule__Cooking__SAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1973:1: ( ( RULE_INT ) )
            // InternalRecipeDSL.g:1974:2: ( RULE_INT )
            {
            // InternalRecipeDSL.g:1974:2: ( RULE_INT )
            // InternalRecipeDSL.g:1975:3: RULE_INT
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
    // InternalRecipeDSL.g:1984:1: rule__Cooking__TimeAssignment_2_0 : ( ruleTime ) ;
    public final void rule__Cooking__TimeAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:1988:1: ( ( ruleTime ) )
            // InternalRecipeDSL.g:1989:2: ( ruleTime )
            {
            // InternalRecipeDSL.g:1989:2: ( ruleTime )
            // InternalRecipeDSL.g:1990:3: ruleTime
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
    // InternalRecipeDSL.g:1999:1: rule__Cooking__StepAssignment_2_2 : ( ruleStep ) ;
    public final void rule__Cooking__StepAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2003:1: ( ( ruleStep ) )
            // InternalRecipeDSL.g:2004:2: ( ruleStep )
            {
            // InternalRecipeDSL.g:2004:2: ( ruleStep )
            // InternalRecipeDSL.g:2005:3: ruleStep
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
    // InternalRecipeDSL.g:2014:1: rule__Time__TimeAssignment_1 : ( RULE_INT ) ;
    public final void rule__Time__TimeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2018:1: ( ( RULE_INT ) )
            // InternalRecipeDSL.g:2019:2: ( RULE_INT )
            {
            // InternalRecipeDSL.g:2019:2: ( RULE_INT )
            // InternalRecipeDSL.g:2020:3: RULE_INT
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
    // InternalRecipeDSL.g:2029:1: rule__Step__DevAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Step__DevAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2033:1: ( ( ( RULE_ID ) ) )
            // InternalRecipeDSL.g:2034:2: ( ( RULE_ID ) )
            {
            // InternalRecipeDSL.g:2034:2: ( ( RULE_ID ) )
            // InternalRecipeDSL.g:2035:3: ( RULE_ID )
            {
             before(grammarAccess.getStepAccess().getDevDeviceCrossReference_1_0()); 
            // InternalRecipeDSL.g:2036:3: ( RULE_ID )
            // InternalRecipeDSL.g:2037:4: RULE_ID
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
    // InternalRecipeDSL.g:2048:1: rule__Step__Dev2Assignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Step__Dev2Assignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2052:1: ( ( ( RULE_ID ) ) )
            // InternalRecipeDSL.g:2053:2: ( ( RULE_ID ) )
            {
            // InternalRecipeDSL.g:2053:2: ( ( RULE_ID ) )
            // InternalRecipeDSL.g:2054:3: ( RULE_ID )
            {
             before(grammarAccess.getStepAccess().getDev2DeviceCrossReference_2_1_0()); 
            // InternalRecipeDSL.g:2055:3: ( RULE_ID )
            // InternalRecipeDSL.g:2056:4: RULE_ID
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
    // InternalRecipeDSL.g:2067:1: rule__Step__IngAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Step__IngAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2071:1: ( ( ( RULE_ID ) ) )
            // InternalRecipeDSL.g:2072:2: ( ( RULE_ID ) )
            {
            // InternalRecipeDSL.g:2072:2: ( ( RULE_ID ) )
            // InternalRecipeDSL.g:2073:3: ( RULE_ID )
            {
             before(grammarAccess.getStepAccess().getIngIngredientCrossReference_4_0()); 
            // InternalRecipeDSL.g:2074:3: ( RULE_ID )
            // InternalRecipeDSL.g:2075:4: RULE_ID
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
    // InternalRecipeDSL.g:2086:1: rule__Step__Ing2Assignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__Step__Ing2Assignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipeDSL.g:2090:1: ( ( ( RULE_ID ) ) )
            // InternalRecipeDSL.g:2091:2: ( ( RULE_ID ) )
            {
            // InternalRecipeDSL.g:2091:2: ( ( RULE_ID ) )
            // InternalRecipeDSL.g:2092:3: ( RULE_ID )
            {
             before(grammarAccess.getStepAccess().getIng2IngredientCrossReference_5_1_0()); 
            // InternalRecipeDSL.g:2093:3: ( RULE_ID )
            // InternalRecipeDSL.g:2094:4: RULE_ID
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000000001F000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000001E0000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000001E00000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000004008000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000008000000L});

}