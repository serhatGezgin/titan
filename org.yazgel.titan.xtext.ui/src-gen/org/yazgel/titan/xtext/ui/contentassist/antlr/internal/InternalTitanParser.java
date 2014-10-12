package org.yazgel.titan.xtext.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.yazgel.titan.xtext.services.TitanGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTitanParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Nested Functions'", "'String'", "'integer'", "'boolean'", "'long'", "'double'", "'module'", "'package'", "'{'", "'}'", "'entity'", "':'", "'entityBuilder'", "'takes'", "','", "'adds'", "'('", "')'", "'var'", "'opposite'", "'.'", "'[]'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=6;
    public static final int T__32=32;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalTitanParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTitanParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTitanParser.tokenNames; }
    public String getGrammarFileName() { return "../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g"; }


     
     	private TitanGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(TitanGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleModule"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:60:1: entryRuleModule : ruleModule EOF ;
    public final void entryRuleModule() throws RecognitionException {
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:61:1: ( ruleModule EOF )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:62:1: ruleModule EOF
            {
             before(grammarAccess.getModuleRule()); 
            pushFollow(FOLLOW_ruleModule_in_entryRuleModule61);
            ruleModule();

            state._fsp--;

             after(grammarAccess.getModuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModule68); 

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
    // $ANTLR end "entryRuleModule"


    // $ANTLR start "ruleModule"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:69:1: ruleModule : ( ( rule__Module__Group__0 ) ) ;
    public final void ruleModule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:73:2: ( ( ( rule__Module__Group__0 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:74:1: ( ( rule__Module__Group__0 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:74:1: ( ( rule__Module__Group__0 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:75:1: ( rule__Module__Group__0 )
            {
             before(grammarAccess.getModuleAccess().getGroup()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:76:1: ( rule__Module__Group__0 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:76:2: rule__Module__Group__0
            {
            pushFollow(FOLLOW_rule__Module__Group__0_in_ruleModule94);
            rule__Module__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModuleAccess().getGroup()); 

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
    // $ANTLR end "ruleModule"


    // $ANTLR start "entryRulePackage"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:88:1: entryRulePackage : rulePackage EOF ;
    public final void entryRulePackage() throws RecognitionException {
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:89:1: ( rulePackage EOF )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:90:1: rulePackage EOF
            {
             before(grammarAccess.getPackageRule()); 
            pushFollow(FOLLOW_rulePackage_in_entryRulePackage121);
            rulePackage();

            state._fsp--;

             after(grammarAccess.getPackageRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage128); 

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
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:97:1: rulePackage : ( ( rule__Package__Group__0 ) ) ;
    public final void rulePackage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:101:2: ( ( ( rule__Package__Group__0 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:102:1: ( ( rule__Package__Group__0 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:102:1: ( ( rule__Package__Group__0 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:103:1: ( rule__Package__Group__0 )
            {
             before(grammarAccess.getPackageAccess().getGroup()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:104:1: ( rule__Package__Group__0 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:104:2: rule__Package__Group__0
            {
            pushFollow(FOLLOW_rule__Package__Group__0_in_rulePackage154);
            rule__Package__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getGroup()); 

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
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRuleEntity"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:116:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:117:1: ( ruleEntity EOF )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:118:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity181);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity188); 

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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:125:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:129:2: ( ( ( rule__Entity__Group__0 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:130:1: ( ( rule__Entity__Group__0 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:130:1: ( ( rule__Entity__Group__0 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:131:1: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:132:1: ( rule__Entity__Group__0 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:132:2: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_rule__Entity__Group__0_in_ruleEntity214);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleEntityBuilder"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:144:1: entryRuleEntityBuilder : ruleEntityBuilder EOF ;
    public final void entryRuleEntityBuilder() throws RecognitionException {
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:145:1: ( ruleEntityBuilder EOF )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:146:1: ruleEntityBuilder EOF
            {
             before(grammarAccess.getEntityBuilderRule()); 
            pushFollow(FOLLOW_ruleEntityBuilder_in_entryRuleEntityBuilder241);
            ruleEntityBuilder();

            state._fsp--;

             after(grammarAccess.getEntityBuilderRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntityBuilder248); 

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
    // $ANTLR end "entryRuleEntityBuilder"


    // $ANTLR start "ruleEntityBuilder"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:153:1: ruleEntityBuilder : ( ( rule__EntityBuilder__Group__0 ) ) ;
    public final void ruleEntityBuilder() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:157:2: ( ( ( rule__EntityBuilder__Group__0 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:158:1: ( ( rule__EntityBuilder__Group__0 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:158:1: ( ( rule__EntityBuilder__Group__0 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:159:1: ( rule__EntityBuilder__Group__0 )
            {
             before(grammarAccess.getEntityBuilderAccess().getGroup()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:160:1: ( rule__EntityBuilder__Group__0 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:160:2: rule__EntityBuilder__Group__0
            {
            pushFollow(FOLLOW_rule__EntityBuilder__Group__0_in_ruleEntityBuilder274);
            rule__EntityBuilder__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityBuilderAccess().getGroup()); 

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
    // $ANTLR end "ruleEntityBuilder"


    // $ANTLR start "entryRuletakes"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:174:1: entryRuletakes : ruletakes EOF ;
    public final void entryRuletakes() throws RecognitionException {
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:175:1: ( ruletakes EOF )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:176:1: ruletakes EOF
            {
             before(grammarAccess.getTakesRule()); 
            pushFollow(FOLLOW_ruletakes_in_entryRuletakes303);
            ruletakes();

            state._fsp--;

             after(grammarAccess.getTakesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuletakes310); 

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
    // $ANTLR end "entryRuletakes"


    // $ANTLR start "ruletakes"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:183:1: ruletakes : ( ( rule__Takes__Group__0 ) ) ;
    public final void ruletakes() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:187:2: ( ( ( rule__Takes__Group__0 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:188:1: ( ( rule__Takes__Group__0 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:188:1: ( ( rule__Takes__Group__0 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:189:1: ( rule__Takes__Group__0 )
            {
             before(grammarAccess.getTakesAccess().getGroup()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:190:1: ( rule__Takes__Group__0 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:190:2: rule__Takes__Group__0
            {
            pushFollow(FOLLOW_rule__Takes__Group__0_in_ruletakes336);
            rule__Takes__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTakesAccess().getGroup()); 

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
    // $ANTLR end "ruletakes"


    // $ANTLR start "entryRuleadds"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:202:1: entryRuleadds : ruleadds EOF ;
    public final void entryRuleadds() throws RecognitionException {
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:203:1: ( ruleadds EOF )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:204:1: ruleadds EOF
            {
             before(grammarAccess.getAddsRule()); 
            pushFollow(FOLLOW_ruleadds_in_entryRuleadds363);
            ruleadds();

            state._fsp--;

             after(grammarAccess.getAddsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleadds370); 

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
    // $ANTLR end "entryRuleadds"


    // $ANTLR start "ruleadds"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:211:1: ruleadds : ( ( rule__Adds__Group__0 ) ) ;
    public final void ruleadds() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:215:2: ( ( ( rule__Adds__Group__0 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:216:1: ( ( rule__Adds__Group__0 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:216:1: ( ( rule__Adds__Group__0 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:217:1: ( rule__Adds__Group__0 )
            {
             before(grammarAccess.getAddsAccess().getGroup()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:218:1: ( rule__Adds__Group__0 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:218:2: rule__Adds__Group__0
            {
            pushFollow(FOLLOW_rule__Adds__Group__0_in_ruleadds396);
            rule__Adds__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAddsAccess().getGroup()); 

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
    // $ANTLR end "ruleadds"


    // $ANTLR start "entryRuleFeature"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:230:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:231:1: ( ruleFeature EOF )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:232:1: ruleFeature EOF
            {
             before(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature423);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getFeatureRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature430); 

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
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:239:1: ruleFeature : ( ( rule__Feature__Alternatives ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:243:2: ( ( ( rule__Feature__Alternatives ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:244:1: ( ( rule__Feature__Alternatives ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:244:1: ( ( rule__Feature__Alternatives ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:245:1: ( rule__Feature__Alternatives )
            {
             before(grammarAccess.getFeatureAccess().getAlternatives()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:246:1: ( rule__Feature__Alternatives )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:246:2: rule__Feature__Alternatives
            {
            pushFollow(FOLLOW_rule__Feature__Alternatives_in_ruleFeature456);
            rule__Feature__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getAlternatives()); 

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
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleReference"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:258:1: entryRuleReference : ruleReference EOF ;
    public final void entryRuleReference() throws RecognitionException {
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:259:1: ( ruleReference EOF )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:260:1: ruleReference EOF
            {
             before(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_ruleReference_in_entryRuleReference483);
            ruleReference();

            state._fsp--;

             after(grammarAccess.getReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReference490); 

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
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:267:1: ruleReference : ( ( rule__Reference__Group__0 ) ) ;
    public final void ruleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:271:2: ( ( ( rule__Reference__Group__0 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:272:1: ( ( rule__Reference__Group__0 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:272:1: ( ( rule__Reference__Group__0 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:273:1: ( rule__Reference__Group__0 )
            {
             before(grammarAccess.getReferenceAccess().getGroup()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:274:1: ( rule__Reference__Group__0 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:274:2: rule__Reference__Group__0
            {
            pushFollow(FOLLOW_rule__Reference__Group__0_in_ruleReference516);
            rule__Reference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getGroup()); 

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
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleDataType"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:286:1: entryRuleDataType : ruleDataType EOF ;
    public final void entryRuleDataType() throws RecognitionException {
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:287:1: ( ruleDataType EOF )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:288:1: ruleDataType EOF
            {
             before(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_ruleDataType_in_entryRuleDataType543);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getDataTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataType550); 

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
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:295:1: ruleDataType : ( ( rule__DataType__Group__0 ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:299:2: ( ( ( rule__DataType__Group__0 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:300:1: ( ( rule__DataType__Group__0 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:300:1: ( ( rule__DataType__Group__0 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:301:1: ( rule__DataType__Group__0 )
            {
             before(grammarAccess.getDataTypeAccess().getGroup()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:302:1: ( rule__DataType__Group__0 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:302:2: rule__DataType__Group__0
            {
            pushFollow(FOLLOW_rule__DataType__Group__0_in_ruleDataType576);
            rule__DataType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleParameterFeature"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:314:1: entryRuleParameterFeature : ruleParameterFeature EOF ;
    public final void entryRuleParameterFeature() throws RecognitionException {
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:315:1: ( ruleParameterFeature EOF )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:316:1: ruleParameterFeature EOF
            {
             before(grammarAccess.getParameterFeatureRule()); 
            pushFollow(FOLLOW_ruleParameterFeature_in_entryRuleParameterFeature603);
            ruleParameterFeature();

            state._fsp--;

             after(grammarAccess.getParameterFeatureRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterFeature610); 

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
    // $ANTLR end "entryRuleParameterFeature"


    // $ANTLR start "ruleParameterFeature"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:323:1: ruleParameterFeature : ( ( rule__ParameterFeature__Alternatives ) ) ;
    public final void ruleParameterFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:327:2: ( ( ( rule__ParameterFeature__Alternatives ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:328:1: ( ( rule__ParameterFeature__Alternatives ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:328:1: ( ( rule__ParameterFeature__Alternatives ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:329:1: ( rule__ParameterFeature__Alternatives )
            {
             before(grammarAccess.getParameterFeatureAccess().getAlternatives()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:330:1: ( rule__ParameterFeature__Alternatives )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:330:2: rule__ParameterFeature__Alternatives
            {
            pushFollow(FOLLOW_rule__ParameterFeature__Alternatives_in_ruleParameterFeature636);
            rule__ParameterFeature__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getParameterFeatureAccess().getAlternatives()); 

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
    // $ANTLR end "ruleParameterFeature"


    // $ANTLR start "entryRuleParameterReference"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:342:1: entryRuleParameterReference : ruleParameterReference EOF ;
    public final void entryRuleParameterReference() throws RecognitionException {
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:343:1: ( ruleParameterReference EOF )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:344:1: ruleParameterReference EOF
            {
             before(grammarAccess.getParameterReferenceRule()); 
            pushFollow(FOLLOW_ruleParameterReference_in_entryRuleParameterReference663);
            ruleParameterReference();

            state._fsp--;

             after(grammarAccess.getParameterReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterReference670); 

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
    // $ANTLR end "entryRuleParameterReference"


    // $ANTLR start "ruleParameterReference"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:351:1: ruleParameterReference : ( ( rule__ParameterReference__Group__0 ) ) ;
    public final void ruleParameterReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:355:2: ( ( ( rule__ParameterReference__Group__0 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:356:1: ( ( rule__ParameterReference__Group__0 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:356:1: ( ( rule__ParameterReference__Group__0 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:357:1: ( rule__ParameterReference__Group__0 )
            {
             before(grammarAccess.getParameterReferenceAccess().getGroup()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:358:1: ( rule__ParameterReference__Group__0 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:358:2: rule__ParameterReference__Group__0
            {
            pushFollow(FOLLOW_rule__ParameterReference__Group__0_in_ruleParameterReference696);
            rule__ParameterReference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterReferenceAccess().getGroup()); 

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
    // $ANTLR end "ruleParameterReference"


    // $ANTLR start "entryRuleParameterDataType"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:370:1: entryRuleParameterDataType : ruleParameterDataType EOF ;
    public final void entryRuleParameterDataType() throws RecognitionException {
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:371:1: ( ruleParameterDataType EOF )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:372:1: ruleParameterDataType EOF
            {
             before(grammarAccess.getParameterDataTypeRule()); 
            pushFollow(FOLLOW_ruleParameterDataType_in_entryRuleParameterDataType723);
            ruleParameterDataType();

            state._fsp--;

             after(grammarAccess.getParameterDataTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterDataType730); 

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
    // $ANTLR end "entryRuleParameterDataType"


    // $ANTLR start "ruleParameterDataType"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:379:1: ruleParameterDataType : ( ( rule__ParameterDataType__Group__0 ) ) ;
    public final void ruleParameterDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:383:2: ( ( ( rule__ParameterDataType__Group__0 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:384:1: ( ( rule__ParameterDataType__Group__0 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:384:1: ( ( rule__ParameterDataType__Group__0 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:385:1: ( rule__ParameterDataType__Group__0 )
            {
             before(grammarAccess.getParameterDataTypeAccess().getGroup()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:386:1: ( rule__ParameterDataType__Group__0 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:386:2: rule__ParameterDataType__Group__0
            {
            pushFollow(FOLLOW_rule__ParameterDataType__Group__0_in_ruleParameterDataType756);
            rule__ParameterDataType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterDataTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleParameterDataType"


    // $ANTLR start "entryRuleQUALIFIED_NAME"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:398:1: entryRuleQUALIFIED_NAME : ruleQUALIFIED_NAME EOF ;
    public final void entryRuleQUALIFIED_NAME() throws RecognitionException {
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:399:1: ( ruleQUALIFIED_NAME EOF )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:400:1: ruleQUALIFIED_NAME EOF
            {
             before(grammarAccess.getQUALIFIED_NAMERule()); 
            pushFollow(FOLLOW_ruleQUALIFIED_NAME_in_entryRuleQUALIFIED_NAME783);
            ruleQUALIFIED_NAME();

            state._fsp--;

             after(grammarAccess.getQUALIFIED_NAMERule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQUALIFIED_NAME790); 

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
    // $ANTLR end "entryRuleQUALIFIED_NAME"


    // $ANTLR start "ruleQUALIFIED_NAME"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:407:1: ruleQUALIFIED_NAME : ( ( rule__QUALIFIED_NAME__Group__0 ) ) ;
    public final void ruleQUALIFIED_NAME() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:411:2: ( ( ( rule__QUALIFIED_NAME__Group__0 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:412:1: ( ( rule__QUALIFIED_NAME__Group__0 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:412:1: ( ( rule__QUALIFIED_NAME__Group__0 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:413:1: ( rule__QUALIFIED_NAME__Group__0 )
            {
             before(grammarAccess.getQUALIFIED_NAMEAccess().getGroup()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:414:1: ( rule__QUALIFIED_NAME__Group__0 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:414:2: rule__QUALIFIED_NAME__Group__0
            {
            pushFollow(FOLLOW_rule__QUALIFIED_NAME__Group__0_in_ruleQUALIFIED_NAME816);
            rule__QUALIFIED_NAME__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQUALIFIED_NAMEAccess().getGroup()); 

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
    // $ANTLR end "ruleQUALIFIED_NAME"


    // $ANTLR start "ruleInternalDSLType"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:427:1: ruleInternalDSLType : ( ( 'Nested Functions' ) ) ;
    public final void ruleInternalDSLType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:431:1: ( ( ( 'Nested Functions' ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:432:1: ( ( 'Nested Functions' ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:432:1: ( ( 'Nested Functions' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:433:1: ( 'Nested Functions' )
            {
             before(grammarAccess.getInternalDSLTypeAccess().getNestedFunctionsEnumLiteralDeclaration()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:434:1: ( 'Nested Functions' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:434:3: 'Nested Functions'
            {
            match(input,11,FOLLOW_11_in_ruleInternalDSLType854); 

            }

             after(grammarAccess.getInternalDSLTypeAccess().getNestedFunctionsEnumLiteralDeclaration()); 

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
    // $ANTLR end "ruleInternalDSLType"


    // $ANTLR start "ruleDataTypes"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:447:1: ruleDataTypes : ( ( rule__DataTypes__Alternatives ) ) ;
    public final void ruleDataTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:451:1: ( ( ( rule__DataTypes__Alternatives ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:452:1: ( ( rule__DataTypes__Alternatives ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:452:1: ( ( rule__DataTypes__Alternatives ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:453:1: ( rule__DataTypes__Alternatives )
            {
             before(grammarAccess.getDataTypesAccess().getAlternatives()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:454:1: ( rule__DataTypes__Alternatives )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:454:2: rule__DataTypes__Alternatives
            {
            pushFollow(FOLLOW_rule__DataTypes__Alternatives_in_ruleDataTypes892);
            rule__DataTypes__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDataTypesAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDataTypes"


    // $ANTLR start "rule__Feature__Alternatives"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:465:1: rule__Feature__Alternatives : ( ( ruleReference ) | ( ruleDataType ) );
    public final void rule__Feature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:469:1: ( ( ruleReference ) | ( ruleDataType ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==29) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==RULE_ID) ) {
                    int LA1_2 = input.LA(3);

                    if ( (LA1_2==RULE_ID) ) {
                        alt1=1;
                    }
                    else if ( ((LA1_2>=12 && LA1_2<=16)) ) {
                        alt1=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:470:1: ( ruleReference )
                    {
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:470:1: ( ruleReference )
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:471:1: ruleReference
                    {
                     before(grammarAccess.getFeatureAccess().getReferenceParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleReference_in_rule__Feature__Alternatives927);
                    ruleReference();

                    state._fsp--;

                     after(grammarAccess.getFeatureAccess().getReferenceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:476:6: ( ruleDataType )
                    {
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:476:6: ( ruleDataType )
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:477:1: ruleDataType
                    {
                     before(grammarAccess.getFeatureAccess().getDataTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleDataType_in_rule__Feature__Alternatives944);
                    ruleDataType();

                    state._fsp--;

                     after(grammarAccess.getFeatureAccess().getDataTypeParserRuleCall_1()); 

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
    // $ANTLR end "rule__Feature__Alternatives"


    // $ANTLR start "rule__ParameterFeature__Alternatives"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:487:1: rule__ParameterFeature__Alternatives : ( ( ruleParameterReference ) | ( ruleParameterDataType ) );
    public final void rule__ParameterFeature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:491:1: ( ( ruleParameterReference ) | ( ruleParameterDataType ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=12 && LA2_0<=16)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:492:1: ( ruleParameterReference )
                    {
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:492:1: ( ruleParameterReference )
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:493:1: ruleParameterReference
                    {
                     before(grammarAccess.getParameterFeatureAccess().getParameterReferenceParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleParameterReference_in_rule__ParameterFeature__Alternatives976);
                    ruleParameterReference();

                    state._fsp--;

                     after(grammarAccess.getParameterFeatureAccess().getParameterReferenceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:498:6: ( ruleParameterDataType )
                    {
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:498:6: ( ruleParameterDataType )
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:499:1: ruleParameterDataType
                    {
                     before(grammarAccess.getParameterFeatureAccess().getParameterDataTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleParameterDataType_in_rule__ParameterFeature__Alternatives993);
                    ruleParameterDataType();

                    state._fsp--;

                     after(grammarAccess.getParameterFeatureAccess().getParameterDataTypeParserRuleCall_1()); 

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
    // $ANTLR end "rule__ParameterFeature__Alternatives"


    // $ANTLR start "rule__DataTypes__Alternatives"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:509:1: rule__DataTypes__Alternatives : ( ( ( 'String' ) ) | ( ( 'integer' ) ) | ( ( 'boolean' ) ) | ( ( 'long' ) ) | ( ( 'double' ) ) );
    public final void rule__DataTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:513:1: ( ( ( 'String' ) ) | ( ( 'integer' ) ) | ( ( 'boolean' ) ) | ( ( 'long' ) ) | ( ( 'double' ) ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt3=1;
                }
                break;
            case 13:
                {
                alt3=2;
                }
                break;
            case 14:
                {
                alt3=3;
                }
                break;
            case 15:
                {
                alt3=4;
                }
                break;
            case 16:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:514:1: ( ( 'String' ) )
                    {
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:514:1: ( ( 'String' ) )
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:515:1: ( 'String' )
                    {
                     before(grammarAccess.getDataTypesAccess().getStringEnumLiteralDeclaration_0()); 
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:516:1: ( 'String' )
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:516:3: 'String'
                    {
                    match(input,12,FOLLOW_12_in_rule__DataTypes__Alternatives1026); 

                    }

                     after(grammarAccess.getDataTypesAccess().getStringEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:521:6: ( ( 'integer' ) )
                    {
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:521:6: ( ( 'integer' ) )
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:522:1: ( 'integer' )
                    {
                     before(grammarAccess.getDataTypesAccess().getIntegerEnumLiteralDeclaration_1()); 
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:523:1: ( 'integer' )
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:523:3: 'integer'
                    {
                    match(input,13,FOLLOW_13_in_rule__DataTypes__Alternatives1047); 

                    }

                     after(grammarAccess.getDataTypesAccess().getIntegerEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:528:6: ( ( 'boolean' ) )
                    {
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:528:6: ( ( 'boolean' ) )
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:529:1: ( 'boolean' )
                    {
                     before(grammarAccess.getDataTypesAccess().getBooleanEnumLiteralDeclaration_2()); 
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:530:1: ( 'boolean' )
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:530:3: 'boolean'
                    {
                    match(input,14,FOLLOW_14_in_rule__DataTypes__Alternatives1068); 

                    }

                     after(grammarAccess.getDataTypesAccess().getBooleanEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:535:6: ( ( 'long' ) )
                    {
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:535:6: ( ( 'long' ) )
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:536:1: ( 'long' )
                    {
                     before(grammarAccess.getDataTypesAccess().getLongEnumLiteralDeclaration_3()); 
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:537:1: ( 'long' )
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:537:3: 'long'
                    {
                    match(input,15,FOLLOW_15_in_rule__DataTypes__Alternatives1089); 

                    }

                     after(grammarAccess.getDataTypesAccess().getLongEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:542:6: ( ( 'double' ) )
                    {
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:542:6: ( ( 'double' ) )
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:543:1: ( 'double' )
                    {
                     before(grammarAccess.getDataTypesAccess().getDoubleEnumLiteralDeclaration_4()); 
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:544:1: ( 'double' )
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:544:3: 'double'
                    {
                    match(input,16,FOLLOW_16_in_rule__DataTypes__Alternatives1110); 

                    }

                     after(grammarAccess.getDataTypesAccess().getDoubleEnumLiteralDeclaration_4()); 

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
    // $ANTLR end "rule__DataTypes__Alternatives"


    // $ANTLR start "rule__Module__Group__0"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:556:1: rule__Module__Group__0 : rule__Module__Group__0__Impl rule__Module__Group__1 ;
    public final void rule__Module__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:560:1: ( rule__Module__Group__0__Impl rule__Module__Group__1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:561:2: rule__Module__Group__0__Impl rule__Module__Group__1
            {
            pushFollow(FOLLOW_rule__Module__Group__0__Impl_in_rule__Module__Group__01143);
            rule__Module__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__1_in_rule__Module__Group__01146);
            rule__Module__Group__1();

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
    // $ANTLR end "rule__Module__Group__0"


    // $ANTLR start "rule__Module__Group__0__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:568:1: rule__Module__Group__0__Impl : ( () ) ;
    public final void rule__Module__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:572:1: ( ( () ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:573:1: ( () )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:573:1: ( () )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:574:1: ()
            {
             before(grammarAccess.getModuleAccess().getModuleAction_0()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:575:1: ()
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:577:1: 
            {
            }

             after(grammarAccess.getModuleAccess().getModuleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__0__Impl"


    // $ANTLR start "rule__Module__Group__1"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:587:1: rule__Module__Group__1 : rule__Module__Group__1__Impl rule__Module__Group__2 ;
    public final void rule__Module__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:591:1: ( rule__Module__Group__1__Impl rule__Module__Group__2 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:592:2: rule__Module__Group__1__Impl rule__Module__Group__2
            {
            pushFollow(FOLLOW_rule__Module__Group__1__Impl_in_rule__Module__Group__11204);
            rule__Module__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__2_in_rule__Module__Group__11207);
            rule__Module__Group__2();

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
    // $ANTLR end "rule__Module__Group__1"


    // $ANTLR start "rule__Module__Group__1__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:599:1: rule__Module__Group__1__Impl : ( 'module' ) ;
    public final void rule__Module__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:603:1: ( ( 'module' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:604:1: ( 'module' )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:604:1: ( 'module' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:605:1: 'module'
            {
             before(grammarAccess.getModuleAccess().getModuleKeyword_1()); 
            match(input,17,FOLLOW_17_in_rule__Module__Group__1__Impl1235); 
             after(grammarAccess.getModuleAccess().getModuleKeyword_1()); 

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
    // $ANTLR end "rule__Module__Group__1__Impl"


    // $ANTLR start "rule__Module__Group__2"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:618:1: rule__Module__Group__2 : rule__Module__Group__2__Impl rule__Module__Group__3 ;
    public final void rule__Module__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:622:1: ( rule__Module__Group__2__Impl rule__Module__Group__3 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:623:2: rule__Module__Group__2__Impl rule__Module__Group__3
            {
            pushFollow(FOLLOW_rule__Module__Group__2__Impl_in_rule__Module__Group__21266);
            rule__Module__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__3_in_rule__Module__Group__21269);
            rule__Module__Group__3();

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
    // $ANTLR end "rule__Module__Group__2"


    // $ANTLR start "rule__Module__Group__2__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:630:1: rule__Module__Group__2__Impl : ( ( rule__Module__NameAssignment_2 ) ) ;
    public final void rule__Module__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:634:1: ( ( ( rule__Module__NameAssignment_2 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:635:1: ( ( rule__Module__NameAssignment_2 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:635:1: ( ( rule__Module__NameAssignment_2 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:636:1: ( rule__Module__NameAssignment_2 )
            {
             before(grammarAccess.getModuleAccess().getNameAssignment_2()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:637:1: ( rule__Module__NameAssignment_2 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:637:2: rule__Module__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Module__NameAssignment_2_in_rule__Module__Group__2__Impl1296);
            rule__Module__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModuleAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Module__Group__2__Impl"


    // $ANTLR start "rule__Module__Group__3"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:647:1: rule__Module__Group__3 : rule__Module__Group__3__Impl rule__Module__Group__4 ;
    public final void rule__Module__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:651:1: ( rule__Module__Group__3__Impl rule__Module__Group__4 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:652:2: rule__Module__Group__3__Impl rule__Module__Group__4
            {
            pushFollow(FOLLOW_rule__Module__Group__3__Impl_in_rule__Module__Group__31326);
            rule__Module__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__4_in_rule__Module__Group__31329);
            rule__Module__Group__4();

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
    // $ANTLR end "rule__Module__Group__3"


    // $ANTLR start "rule__Module__Group__3__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:659:1: rule__Module__Group__3__Impl : ( ( rule__Module__TypeAssignment_3 ) ) ;
    public final void rule__Module__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:663:1: ( ( ( rule__Module__TypeAssignment_3 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:664:1: ( ( rule__Module__TypeAssignment_3 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:664:1: ( ( rule__Module__TypeAssignment_3 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:665:1: ( rule__Module__TypeAssignment_3 )
            {
             before(grammarAccess.getModuleAccess().getTypeAssignment_3()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:666:1: ( rule__Module__TypeAssignment_3 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:666:2: rule__Module__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Module__TypeAssignment_3_in_rule__Module__Group__3__Impl1356);
            rule__Module__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getModuleAccess().getTypeAssignment_3()); 

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
    // $ANTLR end "rule__Module__Group__3__Impl"


    // $ANTLR start "rule__Module__Group__4"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:676:1: rule__Module__Group__4 : rule__Module__Group__4__Impl ;
    public final void rule__Module__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:680:1: ( rule__Module__Group__4__Impl )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:681:2: rule__Module__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Module__Group__4__Impl_in_rule__Module__Group__41386);
            rule__Module__Group__4__Impl();

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
    // $ANTLR end "rule__Module__Group__4"


    // $ANTLR start "rule__Module__Group__4__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:687:1: rule__Module__Group__4__Impl : ( ( rule__Module__Group_4__0 )? ) ;
    public final void rule__Module__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:691:1: ( ( ( rule__Module__Group_4__0 )? ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:692:1: ( ( rule__Module__Group_4__0 )? )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:692:1: ( ( rule__Module__Group_4__0 )? )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:693:1: ( rule__Module__Group_4__0 )?
            {
             before(grammarAccess.getModuleAccess().getGroup_4()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:694:1: ( rule__Module__Group_4__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:694:2: rule__Module__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Module__Group_4__0_in_rule__Module__Group__4__Impl1413);
                    rule__Module__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModuleAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Module__Group__4__Impl"


    // $ANTLR start "rule__Module__Group_4__0"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:714:1: rule__Module__Group_4__0 : rule__Module__Group_4__0__Impl rule__Module__Group_4__1 ;
    public final void rule__Module__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:718:1: ( rule__Module__Group_4__0__Impl rule__Module__Group_4__1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:719:2: rule__Module__Group_4__0__Impl rule__Module__Group_4__1
            {
            pushFollow(FOLLOW_rule__Module__Group_4__0__Impl_in_rule__Module__Group_4__01454);
            rule__Module__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group_4__1_in_rule__Module__Group_4__01457);
            rule__Module__Group_4__1();

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
    // $ANTLR end "rule__Module__Group_4__0"


    // $ANTLR start "rule__Module__Group_4__0__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:726:1: rule__Module__Group_4__0__Impl : ( ( rule__Module__PackagesAssignment_4_0 ) ) ;
    public final void rule__Module__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:730:1: ( ( ( rule__Module__PackagesAssignment_4_0 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:731:1: ( ( rule__Module__PackagesAssignment_4_0 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:731:1: ( ( rule__Module__PackagesAssignment_4_0 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:732:1: ( rule__Module__PackagesAssignment_4_0 )
            {
             before(grammarAccess.getModuleAccess().getPackagesAssignment_4_0()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:733:1: ( rule__Module__PackagesAssignment_4_0 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:733:2: rule__Module__PackagesAssignment_4_0
            {
            pushFollow(FOLLOW_rule__Module__PackagesAssignment_4_0_in_rule__Module__Group_4__0__Impl1484);
            rule__Module__PackagesAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getModuleAccess().getPackagesAssignment_4_0()); 

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
    // $ANTLR end "rule__Module__Group_4__0__Impl"


    // $ANTLR start "rule__Module__Group_4__1"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:743:1: rule__Module__Group_4__1 : rule__Module__Group_4__1__Impl ;
    public final void rule__Module__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:747:1: ( rule__Module__Group_4__1__Impl )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:748:2: rule__Module__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Module__Group_4__1__Impl_in_rule__Module__Group_4__11514);
            rule__Module__Group_4__1__Impl();

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
    // $ANTLR end "rule__Module__Group_4__1"


    // $ANTLR start "rule__Module__Group_4__1__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:754:1: rule__Module__Group_4__1__Impl : ( ( rule__Module__PackagesAssignment_4_1 )* ) ;
    public final void rule__Module__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:758:1: ( ( ( rule__Module__PackagesAssignment_4_1 )* ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:759:1: ( ( rule__Module__PackagesAssignment_4_1 )* )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:759:1: ( ( rule__Module__PackagesAssignment_4_1 )* )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:760:1: ( rule__Module__PackagesAssignment_4_1 )*
            {
             before(grammarAccess.getModuleAccess().getPackagesAssignment_4_1()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:761:1: ( rule__Module__PackagesAssignment_4_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:761:2: rule__Module__PackagesAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_rule__Module__PackagesAssignment_4_1_in_rule__Module__Group_4__1__Impl1541);
            	    rule__Module__PackagesAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getModuleAccess().getPackagesAssignment_4_1()); 

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
    // $ANTLR end "rule__Module__Group_4__1__Impl"


    // $ANTLR start "rule__Package__Group__0"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:775:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:779:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:780:2: rule__Package__Group__0__Impl rule__Package__Group__1
            {
            pushFollow(FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__01576);
            rule__Package__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__1_in_rule__Package__Group__01579);
            rule__Package__Group__1();

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
    // $ANTLR end "rule__Package__Group__0"


    // $ANTLR start "rule__Package__Group__0__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:787:1: rule__Package__Group__0__Impl : ( () ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:791:1: ( ( () ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:792:1: ( () )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:792:1: ( () )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:793:1: ()
            {
             before(grammarAccess.getPackageAccess().getPackageAction_0()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:794:1: ()
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:796:1: 
            {
            }

             after(grammarAccess.getPackageAccess().getPackageAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__0__Impl"


    // $ANTLR start "rule__Package__Group__1"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:806:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:810:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:811:2: rule__Package__Group__1__Impl rule__Package__Group__2
            {
            pushFollow(FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__11637);
            rule__Package__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__2_in_rule__Package__Group__11640);
            rule__Package__Group__2();

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
    // $ANTLR end "rule__Package__Group__1"


    // $ANTLR start "rule__Package__Group__1__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:818:1: rule__Package__Group__1__Impl : ( 'package' ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:822:1: ( ( 'package' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:823:1: ( 'package' )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:823:1: ( 'package' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:824:1: 'package'
            {
             before(grammarAccess.getPackageAccess().getPackageKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__Package__Group__1__Impl1668); 
             after(grammarAccess.getPackageAccess().getPackageKeyword_1()); 

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
    // $ANTLR end "rule__Package__Group__1__Impl"


    // $ANTLR start "rule__Package__Group__2"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:837:1: rule__Package__Group__2 : rule__Package__Group__2__Impl rule__Package__Group__3 ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:841:1: ( rule__Package__Group__2__Impl rule__Package__Group__3 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:842:2: rule__Package__Group__2__Impl rule__Package__Group__3
            {
            pushFollow(FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__21699);
            rule__Package__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__3_in_rule__Package__Group__21702);
            rule__Package__Group__3();

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
    // $ANTLR end "rule__Package__Group__2"


    // $ANTLR start "rule__Package__Group__2__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:849:1: rule__Package__Group__2__Impl : ( ( rule__Package__NameAssignment_2 ) ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:853:1: ( ( ( rule__Package__NameAssignment_2 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:854:1: ( ( rule__Package__NameAssignment_2 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:854:1: ( ( rule__Package__NameAssignment_2 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:855:1: ( rule__Package__NameAssignment_2 )
            {
             before(grammarAccess.getPackageAccess().getNameAssignment_2()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:856:1: ( rule__Package__NameAssignment_2 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:856:2: rule__Package__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Package__NameAssignment_2_in_rule__Package__Group__2__Impl1729);
            rule__Package__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Package__Group__2__Impl"


    // $ANTLR start "rule__Package__Group__3"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:866:1: rule__Package__Group__3 : rule__Package__Group__3__Impl rule__Package__Group__4 ;
    public final void rule__Package__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:870:1: ( rule__Package__Group__3__Impl rule__Package__Group__4 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:871:2: rule__Package__Group__3__Impl rule__Package__Group__4
            {
            pushFollow(FOLLOW_rule__Package__Group__3__Impl_in_rule__Package__Group__31759);
            rule__Package__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__4_in_rule__Package__Group__31762);
            rule__Package__Group__4();

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
    // $ANTLR end "rule__Package__Group__3"


    // $ANTLR start "rule__Package__Group__3__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:878:1: rule__Package__Group__3__Impl : ( '{' ) ;
    public final void rule__Package__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:882:1: ( ( '{' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:883:1: ( '{' )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:883:1: ( '{' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:884:1: '{'
            {
             before(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,19,FOLLOW_19_in_rule__Package__Group__3__Impl1790); 
             after(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Package__Group__3__Impl"


    // $ANTLR start "rule__Package__Group__4"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:897:1: rule__Package__Group__4 : rule__Package__Group__4__Impl rule__Package__Group__5 ;
    public final void rule__Package__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:901:1: ( rule__Package__Group__4__Impl rule__Package__Group__5 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:902:2: rule__Package__Group__4__Impl rule__Package__Group__5
            {
            pushFollow(FOLLOW_rule__Package__Group__4__Impl_in_rule__Package__Group__41821);
            rule__Package__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__5_in_rule__Package__Group__41824);
            rule__Package__Group__5();

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
    // $ANTLR end "rule__Package__Group__4"


    // $ANTLR start "rule__Package__Group__4__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:909:1: rule__Package__Group__4__Impl : ( ( rule__Package__Group_4__0 )? ) ;
    public final void rule__Package__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:913:1: ( ( ( rule__Package__Group_4__0 )? ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:914:1: ( ( rule__Package__Group_4__0 )? )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:914:1: ( ( rule__Package__Group_4__0 )? )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:915:1: ( rule__Package__Group_4__0 )?
            {
             before(grammarAccess.getPackageAccess().getGroup_4()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:916:1: ( rule__Package__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:916:2: rule__Package__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Package__Group_4__0_in_rule__Package__Group__4__Impl1851);
                    rule__Package__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPackageAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Package__Group__4__Impl"


    // $ANTLR start "rule__Package__Group__5"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:926:1: rule__Package__Group__5 : rule__Package__Group__5__Impl rule__Package__Group__6 ;
    public final void rule__Package__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:930:1: ( rule__Package__Group__5__Impl rule__Package__Group__6 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:931:2: rule__Package__Group__5__Impl rule__Package__Group__6
            {
            pushFollow(FOLLOW_rule__Package__Group__5__Impl_in_rule__Package__Group__51882);
            rule__Package__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__6_in_rule__Package__Group__51885);
            rule__Package__Group__6();

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
    // $ANTLR end "rule__Package__Group__5"


    // $ANTLR start "rule__Package__Group__5__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:938:1: rule__Package__Group__5__Impl : ( ( rule__Package__Group_5__0 )? ) ;
    public final void rule__Package__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:942:1: ( ( ( rule__Package__Group_5__0 )? ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:943:1: ( ( rule__Package__Group_5__0 )? )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:943:1: ( ( rule__Package__Group_5__0 )? )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:944:1: ( rule__Package__Group_5__0 )?
            {
             before(grammarAccess.getPackageAccess().getGroup_5()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:945:1: ( rule__Package__Group_5__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:945:2: rule__Package__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Package__Group_5__0_in_rule__Package__Group__5__Impl1912);
                    rule__Package__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPackageAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Package__Group__5__Impl"


    // $ANTLR start "rule__Package__Group__6"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:955:1: rule__Package__Group__6 : rule__Package__Group__6__Impl ;
    public final void rule__Package__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:959:1: ( rule__Package__Group__6__Impl )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:960:2: rule__Package__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Package__Group__6__Impl_in_rule__Package__Group__61943);
            rule__Package__Group__6__Impl();

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
    // $ANTLR end "rule__Package__Group__6"


    // $ANTLR start "rule__Package__Group__6__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:966:1: rule__Package__Group__6__Impl : ( '}' ) ;
    public final void rule__Package__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:970:1: ( ( '}' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:971:1: ( '}' )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:971:1: ( '}' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:972:1: '}'
            {
             before(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_6()); 
            match(input,20,FOLLOW_20_in_rule__Package__Group__6__Impl1971); 
             after(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Package__Group__6__Impl"


    // $ANTLR start "rule__Package__Group_4__0"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:999:1: rule__Package__Group_4__0 : rule__Package__Group_4__0__Impl rule__Package__Group_4__1 ;
    public final void rule__Package__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1003:1: ( rule__Package__Group_4__0__Impl rule__Package__Group_4__1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1004:2: rule__Package__Group_4__0__Impl rule__Package__Group_4__1
            {
            pushFollow(FOLLOW_rule__Package__Group_4__0__Impl_in_rule__Package__Group_4__02016);
            rule__Package__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group_4__1_in_rule__Package__Group_4__02019);
            rule__Package__Group_4__1();

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
    // $ANTLR end "rule__Package__Group_4__0"


    // $ANTLR start "rule__Package__Group_4__0__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1011:1: rule__Package__Group_4__0__Impl : ( ( rule__Package__EntitiesAssignment_4_0 ) ) ;
    public final void rule__Package__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1015:1: ( ( ( rule__Package__EntitiesAssignment_4_0 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1016:1: ( ( rule__Package__EntitiesAssignment_4_0 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1016:1: ( ( rule__Package__EntitiesAssignment_4_0 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1017:1: ( rule__Package__EntitiesAssignment_4_0 )
            {
             before(grammarAccess.getPackageAccess().getEntitiesAssignment_4_0()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1018:1: ( rule__Package__EntitiesAssignment_4_0 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1018:2: rule__Package__EntitiesAssignment_4_0
            {
            pushFollow(FOLLOW_rule__Package__EntitiesAssignment_4_0_in_rule__Package__Group_4__0__Impl2046);
            rule__Package__EntitiesAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getEntitiesAssignment_4_0()); 

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
    // $ANTLR end "rule__Package__Group_4__0__Impl"


    // $ANTLR start "rule__Package__Group_4__1"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1028:1: rule__Package__Group_4__1 : rule__Package__Group_4__1__Impl ;
    public final void rule__Package__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1032:1: ( rule__Package__Group_4__1__Impl )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1033:2: rule__Package__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Package__Group_4__1__Impl_in_rule__Package__Group_4__12076);
            rule__Package__Group_4__1__Impl();

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
    // $ANTLR end "rule__Package__Group_4__1"


    // $ANTLR start "rule__Package__Group_4__1__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1039:1: rule__Package__Group_4__1__Impl : ( ( rule__Package__EntitiesAssignment_4_1 )* ) ;
    public final void rule__Package__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1043:1: ( ( ( rule__Package__EntitiesAssignment_4_1 )* ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1044:1: ( ( rule__Package__EntitiesAssignment_4_1 )* )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1044:1: ( ( rule__Package__EntitiesAssignment_4_1 )* )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1045:1: ( rule__Package__EntitiesAssignment_4_1 )*
            {
             before(grammarAccess.getPackageAccess().getEntitiesAssignment_4_1()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1046:1: ( rule__Package__EntitiesAssignment_4_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==21) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1046:2: rule__Package__EntitiesAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_rule__Package__EntitiesAssignment_4_1_in_rule__Package__Group_4__1__Impl2103);
            	    rule__Package__EntitiesAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getPackageAccess().getEntitiesAssignment_4_1()); 

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
    // $ANTLR end "rule__Package__Group_4__1__Impl"


    // $ANTLR start "rule__Package__Group_5__0"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1060:1: rule__Package__Group_5__0 : rule__Package__Group_5__0__Impl rule__Package__Group_5__1 ;
    public final void rule__Package__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1064:1: ( rule__Package__Group_5__0__Impl rule__Package__Group_5__1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1065:2: rule__Package__Group_5__0__Impl rule__Package__Group_5__1
            {
            pushFollow(FOLLOW_rule__Package__Group_5__0__Impl_in_rule__Package__Group_5__02138);
            rule__Package__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group_5__1_in_rule__Package__Group_5__02141);
            rule__Package__Group_5__1();

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
    // $ANTLR end "rule__Package__Group_5__0"


    // $ANTLR start "rule__Package__Group_5__0__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1072:1: rule__Package__Group_5__0__Impl : ( ( rule__Package__EntityBuildersAssignment_5_0 ) ) ;
    public final void rule__Package__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1076:1: ( ( ( rule__Package__EntityBuildersAssignment_5_0 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1077:1: ( ( rule__Package__EntityBuildersAssignment_5_0 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1077:1: ( ( rule__Package__EntityBuildersAssignment_5_0 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1078:1: ( rule__Package__EntityBuildersAssignment_5_0 )
            {
             before(grammarAccess.getPackageAccess().getEntityBuildersAssignment_5_0()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1079:1: ( rule__Package__EntityBuildersAssignment_5_0 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1079:2: rule__Package__EntityBuildersAssignment_5_0
            {
            pushFollow(FOLLOW_rule__Package__EntityBuildersAssignment_5_0_in_rule__Package__Group_5__0__Impl2168);
            rule__Package__EntityBuildersAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getEntityBuildersAssignment_5_0()); 

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
    // $ANTLR end "rule__Package__Group_5__0__Impl"


    // $ANTLR start "rule__Package__Group_5__1"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1089:1: rule__Package__Group_5__1 : rule__Package__Group_5__1__Impl ;
    public final void rule__Package__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1093:1: ( rule__Package__Group_5__1__Impl )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1094:2: rule__Package__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Package__Group_5__1__Impl_in_rule__Package__Group_5__12198);
            rule__Package__Group_5__1__Impl();

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
    // $ANTLR end "rule__Package__Group_5__1"


    // $ANTLR start "rule__Package__Group_5__1__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1100:1: rule__Package__Group_5__1__Impl : ( ( rule__Package__EntityBuildersAssignment_5_1 )* ) ;
    public final void rule__Package__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1104:1: ( ( ( rule__Package__EntityBuildersAssignment_5_1 )* ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1105:1: ( ( rule__Package__EntityBuildersAssignment_5_1 )* )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1105:1: ( ( rule__Package__EntityBuildersAssignment_5_1 )* )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1106:1: ( rule__Package__EntityBuildersAssignment_5_1 )*
            {
             before(grammarAccess.getPackageAccess().getEntityBuildersAssignment_5_1()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1107:1: ( rule__Package__EntityBuildersAssignment_5_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==23) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1107:2: rule__Package__EntityBuildersAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_rule__Package__EntityBuildersAssignment_5_1_in_rule__Package__Group_5__1__Impl2225);
            	    rule__Package__EntityBuildersAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getPackageAccess().getEntityBuildersAssignment_5_1()); 

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
    // $ANTLR end "rule__Package__Group_5__1__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1121:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1125:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1126:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__02260);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__02263);
            rule__Entity__Group__1();

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
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1133:1: rule__Entity__Group__0__Impl : ( () ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1137:1: ( ( () ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1138:1: ( () )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1138:1: ( () )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1139:1: ()
            {
             before(grammarAccess.getEntityAccess().getEntityAction_0()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1140:1: ()
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1142:1: 
            {
            }

             after(grammarAccess.getEntityAccess().getEntityAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1152:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1156:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1157:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__12321);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__12324);
            rule__Entity__Group__2();

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
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1164:1: rule__Entity__Group__1__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1168:1: ( ( 'entity' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1169:1: ( 'entity' )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1169:1: ( 'entity' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1170:1: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_1()); 
            match(input,21,FOLLOW_21_in_rule__Entity__Group__1__Impl2352); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_1()); 

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
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1183:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1187:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1188:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__22383);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__22386);
            rule__Entity__Group__3();

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
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1195:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__NameAssignment_2 ) ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1199:1: ( ( ( rule__Entity__NameAssignment_2 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1200:1: ( ( rule__Entity__NameAssignment_2 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1200:1: ( ( rule__Entity__NameAssignment_2 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1201:1: ( rule__Entity__NameAssignment_2 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_2()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1202:1: ( rule__Entity__NameAssignment_2 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1202:2: rule__Entity__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Entity__NameAssignment_2_in_rule__Entity__Group__2__Impl2413);
            rule__Entity__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1212:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1216:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1217:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__32443);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__32446);
            rule__Entity__Group__4();

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
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1224:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__Group_3__0 )? ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1228:1: ( ( ( rule__Entity__Group_3__0 )? ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1229:1: ( ( rule__Entity__Group_3__0 )? )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1229:1: ( ( rule__Entity__Group_3__0 )? )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1230:1: ( rule__Entity__Group_3__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_3()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1231:1: ( rule__Entity__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1231:2: rule__Entity__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Entity__Group_3__0_in_rule__Entity__Group__3__Impl2473);
                    rule__Entity__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__4"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1241:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1245:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1246:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__42504);
            rule__Entity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__42507);
            rule__Entity__Group__5();

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
    // $ANTLR end "rule__Entity__Group__4"


    // $ANTLR start "rule__Entity__Group__4__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1253:1: rule__Entity__Group__4__Impl : ( '{' ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1257:1: ( ( '{' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1258:1: ( '{' )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1258:1: ( '{' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1259:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,19,FOLLOW_19_in_rule__Entity__Group__4__Impl2535); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Entity__Group__4__Impl"


    // $ANTLR start "rule__Entity__Group__5"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1272:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl rule__Entity__Group__6 ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1276:1: ( rule__Entity__Group__5__Impl rule__Entity__Group__6 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1277:2: rule__Entity__Group__5__Impl rule__Entity__Group__6
            {
            pushFollow(FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__52566);
            rule__Entity__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__6_in_rule__Entity__Group__52569);
            rule__Entity__Group__6();

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
    // $ANTLR end "rule__Entity__Group__5"


    // $ANTLR start "rule__Entity__Group__5__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1284:1: rule__Entity__Group__5__Impl : ( ( rule__Entity__Group_5__0 )? ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1288:1: ( ( ( rule__Entity__Group_5__0 )? ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1289:1: ( ( rule__Entity__Group_5__0 )? )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1289:1: ( ( rule__Entity__Group_5__0 )? )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1290:1: ( rule__Entity__Group_5__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_5()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1291:1: ( rule__Entity__Group_5__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==29) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1291:2: rule__Entity__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Entity__Group_5__0_in_rule__Entity__Group__5__Impl2596);
                    rule__Entity__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Entity__Group__5__Impl"


    // $ANTLR start "rule__Entity__Group__6"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1301:1: rule__Entity__Group__6 : rule__Entity__Group__6__Impl ;
    public final void rule__Entity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1305:1: ( rule__Entity__Group__6__Impl )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1306:2: rule__Entity__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group__6__Impl_in_rule__Entity__Group__62627);
            rule__Entity__Group__6__Impl();

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
    // $ANTLR end "rule__Entity__Group__6"


    // $ANTLR start "rule__Entity__Group__6__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1312:1: rule__Entity__Group__6__Impl : ( '}' ) ;
    public final void rule__Entity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1316:1: ( ( '}' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1317:1: ( '}' )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1317:1: ( '}' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1318:1: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_6()); 
            match(input,20,FOLLOW_20_in_rule__Entity__Group__6__Impl2655); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Entity__Group__6__Impl"


    // $ANTLR start "rule__Entity__Group_3__0"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1345:1: rule__Entity__Group_3__0 : rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1 ;
    public final void rule__Entity__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1349:1: ( rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1350:2: rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1
            {
            pushFollow(FOLLOW_rule__Entity__Group_3__0__Impl_in_rule__Entity__Group_3__02700);
            rule__Entity__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group_3__1_in_rule__Entity__Group_3__02703);
            rule__Entity__Group_3__1();

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
    // $ANTLR end "rule__Entity__Group_3__0"


    // $ANTLR start "rule__Entity__Group_3__0__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1357:1: rule__Entity__Group_3__0__Impl : ( ':' ) ;
    public final void rule__Entity__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1361:1: ( ( ':' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1362:1: ( ':' )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1362:1: ( ':' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1363:1: ':'
            {
             before(grammarAccess.getEntityAccess().getColonKeyword_3_0()); 
            match(input,22,FOLLOW_22_in_rule__Entity__Group_3__0__Impl2731); 
             after(grammarAccess.getEntityAccess().getColonKeyword_3_0()); 

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
    // $ANTLR end "rule__Entity__Group_3__0__Impl"


    // $ANTLR start "rule__Entity__Group_3__1"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1376:1: rule__Entity__Group_3__1 : rule__Entity__Group_3__1__Impl ;
    public final void rule__Entity__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1380:1: ( rule__Entity__Group_3__1__Impl )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1381:2: rule__Entity__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group_3__1__Impl_in_rule__Entity__Group_3__12762);
            rule__Entity__Group_3__1__Impl();

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
    // $ANTLR end "rule__Entity__Group_3__1"


    // $ANTLR start "rule__Entity__Group_3__1__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1387:1: rule__Entity__Group_3__1__Impl : ( ( rule__Entity__SuperEntityAssignment_3_1 ) ) ;
    public final void rule__Entity__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1391:1: ( ( ( rule__Entity__SuperEntityAssignment_3_1 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1392:1: ( ( rule__Entity__SuperEntityAssignment_3_1 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1392:1: ( ( rule__Entity__SuperEntityAssignment_3_1 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1393:1: ( rule__Entity__SuperEntityAssignment_3_1 )
            {
             before(grammarAccess.getEntityAccess().getSuperEntityAssignment_3_1()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1394:1: ( rule__Entity__SuperEntityAssignment_3_1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1394:2: rule__Entity__SuperEntityAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Entity__SuperEntityAssignment_3_1_in_rule__Entity__Group_3__1__Impl2789);
            rule__Entity__SuperEntityAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getSuperEntityAssignment_3_1()); 

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
    // $ANTLR end "rule__Entity__Group_3__1__Impl"


    // $ANTLR start "rule__Entity__Group_5__0"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1408:1: rule__Entity__Group_5__0 : rule__Entity__Group_5__0__Impl rule__Entity__Group_5__1 ;
    public final void rule__Entity__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1412:1: ( rule__Entity__Group_5__0__Impl rule__Entity__Group_5__1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1413:2: rule__Entity__Group_5__0__Impl rule__Entity__Group_5__1
            {
            pushFollow(FOLLOW_rule__Entity__Group_5__0__Impl_in_rule__Entity__Group_5__02823);
            rule__Entity__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group_5__1_in_rule__Entity__Group_5__02826);
            rule__Entity__Group_5__1();

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
    // $ANTLR end "rule__Entity__Group_5__0"


    // $ANTLR start "rule__Entity__Group_5__0__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1420:1: rule__Entity__Group_5__0__Impl : ( ( rule__Entity__FeaturesAssignment_5_0 ) ) ;
    public final void rule__Entity__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1424:1: ( ( ( rule__Entity__FeaturesAssignment_5_0 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1425:1: ( ( rule__Entity__FeaturesAssignment_5_0 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1425:1: ( ( rule__Entity__FeaturesAssignment_5_0 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1426:1: ( rule__Entity__FeaturesAssignment_5_0 )
            {
             before(grammarAccess.getEntityAccess().getFeaturesAssignment_5_0()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1427:1: ( rule__Entity__FeaturesAssignment_5_0 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1427:2: rule__Entity__FeaturesAssignment_5_0
            {
            pushFollow(FOLLOW_rule__Entity__FeaturesAssignment_5_0_in_rule__Entity__Group_5__0__Impl2853);
            rule__Entity__FeaturesAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getFeaturesAssignment_5_0()); 

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
    // $ANTLR end "rule__Entity__Group_5__0__Impl"


    // $ANTLR start "rule__Entity__Group_5__1"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1437:1: rule__Entity__Group_5__1 : rule__Entity__Group_5__1__Impl ;
    public final void rule__Entity__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1441:1: ( rule__Entity__Group_5__1__Impl )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1442:2: rule__Entity__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group_5__1__Impl_in_rule__Entity__Group_5__12883);
            rule__Entity__Group_5__1__Impl();

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
    // $ANTLR end "rule__Entity__Group_5__1"


    // $ANTLR start "rule__Entity__Group_5__1__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1448:1: rule__Entity__Group_5__1__Impl : ( ( rule__Entity__FeaturesAssignment_5_1 )* ) ;
    public final void rule__Entity__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1452:1: ( ( ( rule__Entity__FeaturesAssignment_5_1 )* ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1453:1: ( ( rule__Entity__FeaturesAssignment_5_1 )* )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1453:1: ( ( rule__Entity__FeaturesAssignment_5_1 )* )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1454:1: ( rule__Entity__FeaturesAssignment_5_1 )*
            {
             before(grammarAccess.getEntityAccess().getFeaturesAssignment_5_1()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1455:1: ( rule__Entity__FeaturesAssignment_5_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==29) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1455:2: rule__Entity__FeaturesAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_rule__Entity__FeaturesAssignment_5_1_in_rule__Entity__Group_5__1__Impl2910);
            	    rule__Entity__FeaturesAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getFeaturesAssignment_5_1()); 

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
    // $ANTLR end "rule__Entity__Group_5__1__Impl"


    // $ANTLR start "rule__EntityBuilder__Group__0"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1469:1: rule__EntityBuilder__Group__0 : rule__EntityBuilder__Group__0__Impl rule__EntityBuilder__Group__1 ;
    public final void rule__EntityBuilder__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1473:1: ( rule__EntityBuilder__Group__0__Impl rule__EntityBuilder__Group__1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1474:2: rule__EntityBuilder__Group__0__Impl rule__EntityBuilder__Group__1
            {
            pushFollow(FOLLOW_rule__EntityBuilder__Group__0__Impl_in_rule__EntityBuilder__Group__02945);
            rule__EntityBuilder__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityBuilder__Group__1_in_rule__EntityBuilder__Group__02948);
            rule__EntityBuilder__Group__1();

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
    // $ANTLR end "rule__EntityBuilder__Group__0"


    // $ANTLR start "rule__EntityBuilder__Group__0__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1481:1: rule__EntityBuilder__Group__0__Impl : ( () ) ;
    public final void rule__EntityBuilder__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1485:1: ( ( () ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1486:1: ( () )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1486:1: ( () )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1487:1: ()
            {
             before(grammarAccess.getEntityBuilderAccess().getEntityBuilderAction_0()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1488:1: ()
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1490:1: 
            {
            }

             after(grammarAccess.getEntityBuilderAccess().getEntityBuilderAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityBuilder__Group__0__Impl"


    // $ANTLR start "rule__EntityBuilder__Group__1"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1500:1: rule__EntityBuilder__Group__1 : rule__EntityBuilder__Group__1__Impl rule__EntityBuilder__Group__2 ;
    public final void rule__EntityBuilder__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1504:1: ( rule__EntityBuilder__Group__1__Impl rule__EntityBuilder__Group__2 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1505:2: rule__EntityBuilder__Group__1__Impl rule__EntityBuilder__Group__2
            {
            pushFollow(FOLLOW_rule__EntityBuilder__Group__1__Impl_in_rule__EntityBuilder__Group__13006);
            rule__EntityBuilder__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityBuilder__Group__2_in_rule__EntityBuilder__Group__13009);
            rule__EntityBuilder__Group__2();

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
    // $ANTLR end "rule__EntityBuilder__Group__1"


    // $ANTLR start "rule__EntityBuilder__Group__1__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1512:1: rule__EntityBuilder__Group__1__Impl : ( 'entityBuilder' ) ;
    public final void rule__EntityBuilder__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1516:1: ( ( 'entityBuilder' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1517:1: ( 'entityBuilder' )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1517:1: ( 'entityBuilder' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1518:1: 'entityBuilder'
            {
             before(grammarAccess.getEntityBuilderAccess().getEntityBuilderKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__EntityBuilder__Group__1__Impl3037); 
             after(grammarAccess.getEntityBuilderAccess().getEntityBuilderKeyword_1()); 

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
    // $ANTLR end "rule__EntityBuilder__Group__1__Impl"


    // $ANTLR start "rule__EntityBuilder__Group__2"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1531:1: rule__EntityBuilder__Group__2 : rule__EntityBuilder__Group__2__Impl rule__EntityBuilder__Group__3 ;
    public final void rule__EntityBuilder__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1535:1: ( rule__EntityBuilder__Group__2__Impl rule__EntityBuilder__Group__3 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1536:2: rule__EntityBuilder__Group__2__Impl rule__EntityBuilder__Group__3
            {
            pushFollow(FOLLOW_rule__EntityBuilder__Group__2__Impl_in_rule__EntityBuilder__Group__23068);
            rule__EntityBuilder__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityBuilder__Group__3_in_rule__EntityBuilder__Group__23071);
            rule__EntityBuilder__Group__3();

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
    // $ANTLR end "rule__EntityBuilder__Group__2"


    // $ANTLR start "rule__EntityBuilder__Group__2__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1543:1: rule__EntityBuilder__Group__2__Impl : ( ( rule__EntityBuilder__NameAssignment_2 ) ) ;
    public final void rule__EntityBuilder__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1547:1: ( ( ( rule__EntityBuilder__NameAssignment_2 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1548:1: ( ( rule__EntityBuilder__NameAssignment_2 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1548:1: ( ( rule__EntityBuilder__NameAssignment_2 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1549:1: ( rule__EntityBuilder__NameAssignment_2 )
            {
             before(grammarAccess.getEntityBuilderAccess().getNameAssignment_2()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1550:1: ( rule__EntityBuilder__NameAssignment_2 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1550:2: rule__EntityBuilder__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__EntityBuilder__NameAssignment_2_in_rule__EntityBuilder__Group__2__Impl3098);
            rule__EntityBuilder__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEntityBuilderAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__EntityBuilder__Group__2__Impl"


    // $ANTLR start "rule__EntityBuilder__Group__3"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1560:1: rule__EntityBuilder__Group__3 : rule__EntityBuilder__Group__3__Impl rule__EntityBuilder__Group__4 ;
    public final void rule__EntityBuilder__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1564:1: ( rule__EntityBuilder__Group__3__Impl rule__EntityBuilder__Group__4 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1565:2: rule__EntityBuilder__Group__3__Impl rule__EntityBuilder__Group__4
            {
            pushFollow(FOLLOW_rule__EntityBuilder__Group__3__Impl_in_rule__EntityBuilder__Group__33128);
            rule__EntityBuilder__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityBuilder__Group__4_in_rule__EntityBuilder__Group__33131);
            rule__EntityBuilder__Group__4();

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
    // $ANTLR end "rule__EntityBuilder__Group__3"


    // $ANTLR start "rule__EntityBuilder__Group__3__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1572:1: rule__EntityBuilder__Group__3__Impl : ( '{' ) ;
    public final void rule__EntityBuilder__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1576:1: ( ( '{' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1577:1: ( '{' )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1577:1: ( '{' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1578:1: '{'
            {
             before(grammarAccess.getEntityBuilderAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,19,FOLLOW_19_in_rule__EntityBuilder__Group__3__Impl3159); 
             after(grammarAccess.getEntityBuilderAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__EntityBuilder__Group__3__Impl"


    // $ANTLR start "rule__EntityBuilder__Group__4"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1591:1: rule__EntityBuilder__Group__4 : rule__EntityBuilder__Group__4__Impl rule__EntityBuilder__Group__5 ;
    public final void rule__EntityBuilder__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1595:1: ( rule__EntityBuilder__Group__4__Impl rule__EntityBuilder__Group__5 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1596:2: rule__EntityBuilder__Group__4__Impl rule__EntityBuilder__Group__5
            {
            pushFollow(FOLLOW_rule__EntityBuilder__Group__4__Impl_in_rule__EntityBuilder__Group__43190);
            rule__EntityBuilder__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityBuilder__Group__5_in_rule__EntityBuilder__Group__43193);
            rule__EntityBuilder__Group__5();

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
    // $ANTLR end "rule__EntityBuilder__Group__4"


    // $ANTLR start "rule__EntityBuilder__Group__4__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1603:1: rule__EntityBuilder__Group__4__Impl : ( ( rule__EntityBuilder__TakesAssignment_4 )? ) ;
    public final void rule__EntityBuilder__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1607:1: ( ( ( rule__EntityBuilder__TakesAssignment_4 )? ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1608:1: ( ( rule__EntityBuilder__TakesAssignment_4 )? )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1608:1: ( ( rule__EntityBuilder__TakesAssignment_4 )? )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1609:1: ( rule__EntityBuilder__TakesAssignment_4 )?
            {
             before(grammarAccess.getEntityBuilderAccess().getTakesAssignment_4()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1610:1: ( rule__EntityBuilder__TakesAssignment_4 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1610:2: rule__EntityBuilder__TakesAssignment_4
                    {
                    pushFollow(FOLLOW_rule__EntityBuilder__TakesAssignment_4_in_rule__EntityBuilder__Group__4__Impl3220);
                    rule__EntityBuilder__TakesAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityBuilderAccess().getTakesAssignment_4()); 

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
    // $ANTLR end "rule__EntityBuilder__Group__4__Impl"


    // $ANTLR start "rule__EntityBuilder__Group__5"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1620:1: rule__EntityBuilder__Group__5 : rule__EntityBuilder__Group__5__Impl ;
    public final void rule__EntityBuilder__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1624:1: ( rule__EntityBuilder__Group__5__Impl )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1625:2: rule__EntityBuilder__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__EntityBuilder__Group__5__Impl_in_rule__EntityBuilder__Group__53251);
            rule__EntityBuilder__Group__5__Impl();

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
    // $ANTLR end "rule__EntityBuilder__Group__5"


    // $ANTLR start "rule__EntityBuilder__Group__5__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1631:1: rule__EntityBuilder__Group__5__Impl : ( '}' ) ;
    public final void rule__EntityBuilder__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1635:1: ( ( '}' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1636:1: ( '}' )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1636:1: ( '}' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1637:1: '}'
            {
             before(grammarAccess.getEntityBuilderAccess().getRightCurlyBracketKeyword_5()); 
            match(input,20,FOLLOW_20_in_rule__EntityBuilder__Group__5__Impl3279); 
             after(grammarAccess.getEntityBuilderAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__EntityBuilder__Group__5__Impl"


    // $ANTLR start "rule__Takes__Group__0"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1662:1: rule__Takes__Group__0 : rule__Takes__Group__0__Impl rule__Takes__Group__1 ;
    public final void rule__Takes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1666:1: ( rule__Takes__Group__0__Impl rule__Takes__Group__1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1667:2: rule__Takes__Group__0__Impl rule__Takes__Group__1
            {
            pushFollow(FOLLOW_rule__Takes__Group__0__Impl_in_rule__Takes__Group__03322);
            rule__Takes__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Takes__Group__1_in_rule__Takes__Group__03325);
            rule__Takes__Group__1();

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
    // $ANTLR end "rule__Takes__Group__0"


    // $ANTLR start "rule__Takes__Group__0__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1674:1: rule__Takes__Group__0__Impl : ( 'takes' ) ;
    public final void rule__Takes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1678:1: ( ( 'takes' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1679:1: ( 'takes' )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1679:1: ( 'takes' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1680:1: 'takes'
            {
             before(grammarAccess.getTakesAccess().getTakesKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__Takes__Group__0__Impl3353); 
             after(grammarAccess.getTakesAccess().getTakesKeyword_0()); 

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
    // $ANTLR end "rule__Takes__Group__0__Impl"


    // $ANTLR start "rule__Takes__Group__1"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1693:1: rule__Takes__Group__1 : rule__Takes__Group__1__Impl rule__Takes__Group__2 ;
    public final void rule__Takes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1697:1: ( rule__Takes__Group__1__Impl rule__Takes__Group__2 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1698:2: rule__Takes__Group__1__Impl rule__Takes__Group__2
            {
            pushFollow(FOLLOW_rule__Takes__Group__1__Impl_in_rule__Takes__Group__13384);
            rule__Takes__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Takes__Group__2_in_rule__Takes__Group__13387);
            rule__Takes__Group__2();

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
    // $ANTLR end "rule__Takes__Group__1"


    // $ANTLR start "rule__Takes__Group__1__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1705:1: rule__Takes__Group__1__Impl : ( ( rule__Takes__TakesAssignment_1 ) ) ;
    public final void rule__Takes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1709:1: ( ( ( rule__Takes__TakesAssignment_1 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1710:1: ( ( rule__Takes__TakesAssignment_1 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1710:1: ( ( rule__Takes__TakesAssignment_1 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1711:1: ( rule__Takes__TakesAssignment_1 )
            {
             before(grammarAccess.getTakesAccess().getTakesAssignment_1()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1712:1: ( rule__Takes__TakesAssignment_1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1712:2: rule__Takes__TakesAssignment_1
            {
            pushFollow(FOLLOW_rule__Takes__TakesAssignment_1_in_rule__Takes__Group__1__Impl3414);
            rule__Takes__TakesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTakesAccess().getTakesAssignment_1()); 

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
    // $ANTLR end "rule__Takes__Group__1__Impl"


    // $ANTLR start "rule__Takes__Group__2"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1722:1: rule__Takes__Group__2 : rule__Takes__Group__2__Impl rule__Takes__Group__3 ;
    public final void rule__Takes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1726:1: ( rule__Takes__Group__2__Impl rule__Takes__Group__3 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1727:2: rule__Takes__Group__2__Impl rule__Takes__Group__3
            {
            pushFollow(FOLLOW_rule__Takes__Group__2__Impl_in_rule__Takes__Group__23444);
            rule__Takes__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Takes__Group__3_in_rule__Takes__Group__23447);
            rule__Takes__Group__3();

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
    // $ANTLR end "rule__Takes__Group__2"


    // $ANTLR start "rule__Takes__Group__2__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1734:1: rule__Takes__Group__2__Impl : ( ( rule__Takes__Group_2__0 )* ) ;
    public final void rule__Takes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1738:1: ( ( ( rule__Takes__Group_2__0 )* ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1739:1: ( ( rule__Takes__Group_2__0 )* )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1739:1: ( ( rule__Takes__Group_2__0 )* )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1740:1: ( rule__Takes__Group_2__0 )*
            {
             before(grammarAccess.getTakesAccess().getGroup_2()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1741:1: ( rule__Takes__Group_2__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==25) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1741:2: rule__Takes__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Takes__Group_2__0_in_rule__Takes__Group__2__Impl3474);
            	    rule__Takes__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getTakesAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Takes__Group__2__Impl"


    // $ANTLR start "rule__Takes__Group__3"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1751:1: rule__Takes__Group__3 : rule__Takes__Group__3__Impl ;
    public final void rule__Takes__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1755:1: ( rule__Takes__Group__3__Impl )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1756:2: rule__Takes__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Takes__Group__3__Impl_in_rule__Takes__Group__33505);
            rule__Takes__Group__3__Impl();

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
    // $ANTLR end "rule__Takes__Group__3"


    // $ANTLR start "rule__Takes__Group__3__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1762:1: rule__Takes__Group__3__Impl : ( ( rule__Takes__AddsAssignment_3 )? ) ;
    public final void rule__Takes__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1766:1: ( ( ( rule__Takes__AddsAssignment_3 )? ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1767:1: ( ( rule__Takes__AddsAssignment_3 )? )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1767:1: ( ( rule__Takes__AddsAssignment_3 )? )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1768:1: ( rule__Takes__AddsAssignment_3 )?
            {
             before(grammarAccess.getTakesAccess().getAddsAssignment_3()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1769:1: ( rule__Takes__AddsAssignment_3 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1769:2: rule__Takes__AddsAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Takes__AddsAssignment_3_in_rule__Takes__Group__3__Impl3532);
                    rule__Takes__AddsAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTakesAccess().getAddsAssignment_3()); 

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
    // $ANTLR end "rule__Takes__Group__3__Impl"


    // $ANTLR start "rule__Takes__Group_2__0"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1787:1: rule__Takes__Group_2__0 : rule__Takes__Group_2__0__Impl rule__Takes__Group_2__1 ;
    public final void rule__Takes__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1791:1: ( rule__Takes__Group_2__0__Impl rule__Takes__Group_2__1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1792:2: rule__Takes__Group_2__0__Impl rule__Takes__Group_2__1
            {
            pushFollow(FOLLOW_rule__Takes__Group_2__0__Impl_in_rule__Takes__Group_2__03571);
            rule__Takes__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Takes__Group_2__1_in_rule__Takes__Group_2__03574);
            rule__Takes__Group_2__1();

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
    // $ANTLR end "rule__Takes__Group_2__0"


    // $ANTLR start "rule__Takes__Group_2__0__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1799:1: rule__Takes__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Takes__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1803:1: ( ( ',' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1804:1: ( ',' )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1804:1: ( ',' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1805:1: ','
            {
             before(grammarAccess.getTakesAccess().getCommaKeyword_2_0()); 
            match(input,25,FOLLOW_25_in_rule__Takes__Group_2__0__Impl3602); 
             after(grammarAccess.getTakesAccess().getCommaKeyword_2_0()); 

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
    // $ANTLR end "rule__Takes__Group_2__0__Impl"


    // $ANTLR start "rule__Takes__Group_2__1"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1818:1: rule__Takes__Group_2__1 : rule__Takes__Group_2__1__Impl ;
    public final void rule__Takes__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1822:1: ( rule__Takes__Group_2__1__Impl )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1823:2: rule__Takes__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Takes__Group_2__1__Impl_in_rule__Takes__Group_2__13633);
            rule__Takes__Group_2__1__Impl();

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
    // $ANTLR end "rule__Takes__Group_2__1"


    // $ANTLR start "rule__Takes__Group_2__1__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1829:1: rule__Takes__Group_2__1__Impl : ( ( rule__Takes__TakesAssignment_2_1 ) ) ;
    public final void rule__Takes__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1833:1: ( ( ( rule__Takes__TakesAssignment_2_1 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1834:1: ( ( rule__Takes__TakesAssignment_2_1 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1834:1: ( ( rule__Takes__TakesAssignment_2_1 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1835:1: ( rule__Takes__TakesAssignment_2_1 )
            {
             before(grammarAccess.getTakesAccess().getTakesAssignment_2_1()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1836:1: ( rule__Takes__TakesAssignment_2_1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1836:2: rule__Takes__TakesAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Takes__TakesAssignment_2_1_in_rule__Takes__Group_2__1__Impl3660);
            rule__Takes__TakesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTakesAccess().getTakesAssignment_2_1()); 

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
    // $ANTLR end "rule__Takes__Group_2__1__Impl"


    // $ANTLR start "rule__Adds__Group__0"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1850:1: rule__Adds__Group__0 : rule__Adds__Group__0__Impl rule__Adds__Group__1 ;
    public final void rule__Adds__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1854:1: ( rule__Adds__Group__0__Impl rule__Adds__Group__1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1855:2: rule__Adds__Group__0__Impl rule__Adds__Group__1
            {
            pushFollow(FOLLOW_rule__Adds__Group__0__Impl_in_rule__Adds__Group__03694);
            rule__Adds__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Adds__Group__1_in_rule__Adds__Group__03697);
            rule__Adds__Group__1();

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
    // $ANTLR end "rule__Adds__Group__0"


    // $ANTLR start "rule__Adds__Group__0__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1862:1: rule__Adds__Group__0__Impl : ( 'adds' ) ;
    public final void rule__Adds__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1866:1: ( ( 'adds' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1867:1: ( 'adds' )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1867:1: ( 'adds' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1868:1: 'adds'
            {
             before(grammarAccess.getAddsAccess().getAddsKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__Adds__Group__0__Impl3725); 
             after(grammarAccess.getAddsAccess().getAddsKeyword_0()); 

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
    // $ANTLR end "rule__Adds__Group__0__Impl"


    // $ANTLR start "rule__Adds__Group__1"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1881:1: rule__Adds__Group__1 : rule__Adds__Group__1__Impl rule__Adds__Group__2 ;
    public final void rule__Adds__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1885:1: ( rule__Adds__Group__1__Impl rule__Adds__Group__2 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1886:2: rule__Adds__Group__1__Impl rule__Adds__Group__2
            {
            pushFollow(FOLLOW_rule__Adds__Group__1__Impl_in_rule__Adds__Group__13756);
            rule__Adds__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Adds__Group__2_in_rule__Adds__Group__13759);
            rule__Adds__Group__2();

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
    // $ANTLR end "rule__Adds__Group__1"


    // $ANTLR start "rule__Adds__Group__1__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1893:1: rule__Adds__Group__1__Impl : ( '(' ) ;
    public final void rule__Adds__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1897:1: ( ( '(' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1898:1: ( '(' )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1898:1: ( '(' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1899:1: '('
            {
             before(grammarAccess.getAddsAccess().getLeftParenthesisKeyword_1()); 
            match(input,27,FOLLOW_27_in_rule__Adds__Group__1__Impl3787); 
             after(grammarAccess.getAddsAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__Adds__Group__1__Impl"


    // $ANTLR start "rule__Adds__Group__2"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1912:1: rule__Adds__Group__2 : rule__Adds__Group__2__Impl rule__Adds__Group__3 ;
    public final void rule__Adds__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1916:1: ( rule__Adds__Group__2__Impl rule__Adds__Group__3 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1917:2: rule__Adds__Group__2__Impl rule__Adds__Group__3
            {
            pushFollow(FOLLOW_rule__Adds__Group__2__Impl_in_rule__Adds__Group__23818);
            rule__Adds__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Adds__Group__3_in_rule__Adds__Group__23821);
            rule__Adds__Group__3();

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
    // $ANTLR end "rule__Adds__Group__2"


    // $ANTLR start "rule__Adds__Group__2__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1924:1: rule__Adds__Group__2__Impl : ( ( rule__Adds__Group_2__0 ) ) ;
    public final void rule__Adds__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1928:1: ( ( ( rule__Adds__Group_2__0 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1929:1: ( ( rule__Adds__Group_2__0 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1929:1: ( ( rule__Adds__Group_2__0 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1930:1: ( rule__Adds__Group_2__0 )
            {
             before(grammarAccess.getAddsAccess().getGroup_2()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1931:1: ( rule__Adds__Group_2__0 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1931:2: rule__Adds__Group_2__0
            {
            pushFollow(FOLLOW_rule__Adds__Group_2__0_in_rule__Adds__Group__2__Impl3848);
            rule__Adds__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getAddsAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Adds__Group__2__Impl"


    // $ANTLR start "rule__Adds__Group__3"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1941:1: rule__Adds__Group__3 : rule__Adds__Group__3__Impl ;
    public final void rule__Adds__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1945:1: ( rule__Adds__Group__3__Impl )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1946:2: rule__Adds__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Adds__Group__3__Impl_in_rule__Adds__Group__33878);
            rule__Adds__Group__3__Impl();

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
    // $ANTLR end "rule__Adds__Group__3"


    // $ANTLR start "rule__Adds__Group__3__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1952:1: rule__Adds__Group__3__Impl : ( ')' ) ;
    public final void rule__Adds__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1956:1: ( ( ')' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1957:1: ( ')' )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1957:1: ( ')' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1958:1: ')'
            {
             before(grammarAccess.getAddsAccess().getRightParenthesisKeyword_3()); 
            match(input,28,FOLLOW_28_in_rule__Adds__Group__3__Impl3906); 
             after(grammarAccess.getAddsAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__Adds__Group__3__Impl"


    // $ANTLR start "rule__Adds__Group_2__0"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1979:1: rule__Adds__Group_2__0 : rule__Adds__Group_2__0__Impl rule__Adds__Group_2__1 ;
    public final void rule__Adds__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1983:1: ( rule__Adds__Group_2__0__Impl rule__Adds__Group_2__1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1984:2: rule__Adds__Group_2__0__Impl rule__Adds__Group_2__1
            {
            pushFollow(FOLLOW_rule__Adds__Group_2__0__Impl_in_rule__Adds__Group_2__03945);
            rule__Adds__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Adds__Group_2__1_in_rule__Adds__Group_2__03948);
            rule__Adds__Group_2__1();

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
    // $ANTLR end "rule__Adds__Group_2__0"


    // $ANTLR start "rule__Adds__Group_2__0__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1991:1: rule__Adds__Group_2__0__Impl : ( ( rule__Adds__AddsAssignment_2_0 ) ) ;
    public final void rule__Adds__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1995:1: ( ( ( rule__Adds__AddsAssignment_2_0 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1996:1: ( ( rule__Adds__AddsAssignment_2_0 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1996:1: ( ( rule__Adds__AddsAssignment_2_0 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1997:1: ( rule__Adds__AddsAssignment_2_0 )
            {
             before(grammarAccess.getAddsAccess().getAddsAssignment_2_0()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1998:1: ( rule__Adds__AddsAssignment_2_0 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1998:2: rule__Adds__AddsAssignment_2_0
            {
            pushFollow(FOLLOW_rule__Adds__AddsAssignment_2_0_in_rule__Adds__Group_2__0__Impl3975);
            rule__Adds__AddsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getAddsAccess().getAddsAssignment_2_0()); 

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
    // $ANTLR end "rule__Adds__Group_2__0__Impl"


    // $ANTLR start "rule__Adds__Group_2__1"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2008:1: rule__Adds__Group_2__1 : rule__Adds__Group_2__1__Impl ;
    public final void rule__Adds__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2012:1: ( rule__Adds__Group_2__1__Impl )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2013:2: rule__Adds__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Adds__Group_2__1__Impl_in_rule__Adds__Group_2__14005);
            rule__Adds__Group_2__1__Impl();

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
    // $ANTLR end "rule__Adds__Group_2__1"


    // $ANTLR start "rule__Adds__Group_2__1__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2019:1: rule__Adds__Group_2__1__Impl : ( ( rule__Adds__Group_2_1__0 )* ) ;
    public final void rule__Adds__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2023:1: ( ( ( rule__Adds__Group_2_1__0 )* ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2024:1: ( ( rule__Adds__Group_2_1__0 )* )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2024:1: ( ( rule__Adds__Group_2_1__0 )* )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2025:1: ( rule__Adds__Group_2_1__0 )*
            {
             before(grammarAccess.getAddsAccess().getGroup_2_1()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2026:1: ( rule__Adds__Group_2_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==25) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2026:2: rule__Adds__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Adds__Group_2_1__0_in_rule__Adds__Group_2__1__Impl4032);
            	    rule__Adds__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getAddsAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__Adds__Group_2__1__Impl"


    // $ANTLR start "rule__Adds__Group_2_1__0"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2040:1: rule__Adds__Group_2_1__0 : rule__Adds__Group_2_1__0__Impl rule__Adds__Group_2_1__1 ;
    public final void rule__Adds__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2044:1: ( rule__Adds__Group_2_1__0__Impl rule__Adds__Group_2_1__1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2045:2: rule__Adds__Group_2_1__0__Impl rule__Adds__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__Adds__Group_2_1__0__Impl_in_rule__Adds__Group_2_1__04067);
            rule__Adds__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Adds__Group_2_1__1_in_rule__Adds__Group_2_1__04070);
            rule__Adds__Group_2_1__1();

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
    // $ANTLR end "rule__Adds__Group_2_1__0"


    // $ANTLR start "rule__Adds__Group_2_1__0__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2052:1: rule__Adds__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__Adds__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2056:1: ( ( ',' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2057:1: ( ',' )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2057:1: ( ',' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2058:1: ','
            {
             before(grammarAccess.getAddsAccess().getCommaKeyword_2_1_0()); 
            match(input,25,FOLLOW_25_in_rule__Adds__Group_2_1__0__Impl4098); 
             after(grammarAccess.getAddsAccess().getCommaKeyword_2_1_0()); 

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
    // $ANTLR end "rule__Adds__Group_2_1__0__Impl"


    // $ANTLR start "rule__Adds__Group_2_1__1"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2071:1: rule__Adds__Group_2_1__1 : rule__Adds__Group_2_1__1__Impl ;
    public final void rule__Adds__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2075:1: ( rule__Adds__Group_2_1__1__Impl )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2076:2: rule__Adds__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Adds__Group_2_1__1__Impl_in_rule__Adds__Group_2_1__14129);
            rule__Adds__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__Adds__Group_2_1__1"


    // $ANTLR start "rule__Adds__Group_2_1__1__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2082:1: rule__Adds__Group_2_1__1__Impl : ( ( rule__Adds__AddsAssignment_2_1_1 ) ) ;
    public final void rule__Adds__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2086:1: ( ( ( rule__Adds__AddsAssignment_2_1_1 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2087:1: ( ( rule__Adds__AddsAssignment_2_1_1 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2087:1: ( ( rule__Adds__AddsAssignment_2_1_1 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2088:1: ( rule__Adds__AddsAssignment_2_1_1 )
            {
             before(grammarAccess.getAddsAccess().getAddsAssignment_2_1_1()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2089:1: ( rule__Adds__AddsAssignment_2_1_1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2089:2: rule__Adds__AddsAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__Adds__AddsAssignment_2_1_1_in_rule__Adds__Group_2_1__1__Impl4156);
            rule__Adds__AddsAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAddsAccess().getAddsAssignment_2_1_1()); 

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
    // $ANTLR end "rule__Adds__Group_2_1__1__Impl"


    // $ANTLR start "rule__Reference__Group__0"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2103:1: rule__Reference__Group__0 : rule__Reference__Group__0__Impl rule__Reference__Group__1 ;
    public final void rule__Reference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2107:1: ( rule__Reference__Group__0__Impl rule__Reference__Group__1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2108:2: rule__Reference__Group__0__Impl rule__Reference__Group__1
            {
            pushFollow(FOLLOW_rule__Reference__Group__0__Impl_in_rule__Reference__Group__04190);
            rule__Reference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Reference__Group__1_in_rule__Reference__Group__04193);
            rule__Reference__Group__1();

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
    // $ANTLR end "rule__Reference__Group__0"


    // $ANTLR start "rule__Reference__Group__0__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2115:1: rule__Reference__Group__0__Impl : ( () ) ;
    public final void rule__Reference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2119:1: ( ( () ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2120:1: ( () )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2120:1: ( () )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2121:1: ()
            {
             before(grammarAccess.getReferenceAccess().getReferenceAction_0()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2122:1: ()
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2124:1: 
            {
            }

             after(grammarAccess.getReferenceAccess().getReferenceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__0__Impl"


    // $ANTLR start "rule__Reference__Group__1"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2134:1: rule__Reference__Group__1 : rule__Reference__Group__1__Impl rule__Reference__Group__2 ;
    public final void rule__Reference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2138:1: ( rule__Reference__Group__1__Impl rule__Reference__Group__2 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2139:2: rule__Reference__Group__1__Impl rule__Reference__Group__2
            {
            pushFollow(FOLLOW_rule__Reference__Group__1__Impl_in_rule__Reference__Group__14251);
            rule__Reference__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Reference__Group__2_in_rule__Reference__Group__14254);
            rule__Reference__Group__2();

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
    // $ANTLR end "rule__Reference__Group__1"


    // $ANTLR start "rule__Reference__Group__1__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2146:1: rule__Reference__Group__1__Impl : ( 'var' ) ;
    public final void rule__Reference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2150:1: ( ( 'var' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2151:1: ( 'var' )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2151:1: ( 'var' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2152:1: 'var'
            {
             before(grammarAccess.getReferenceAccess().getVarKeyword_1()); 
            match(input,29,FOLLOW_29_in_rule__Reference__Group__1__Impl4282); 
             after(grammarAccess.getReferenceAccess().getVarKeyword_1()); 

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
    // $ANTLR end "rule__Reference__Group__1__Impl"


    // $ANTLR start "rule__Reference__Group__2"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2165:1: rule__Reference__Group__2 : rule__Reference__Group__2__Impl rule__Reference__Group__3 ;
    public final void rule__Reference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2169:1: ( rule__Reference__Group__2__Impl rule__Reference__Group__3 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2170:2: rule__Reference__Group__2__Impl rule__Reference__Group__3
            {
            pushFollow(FOLLOW_rule__Reference__Group__2__Impl_in_rule__Reference__Group__24313);
            rule__Reference__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Reference__Group__3_in_rule__Reference__Group__24316);
            rule__Reference__Group__3();

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
    // $ANTLR end "rule__Reference__Group__2"


    // $ANTLR start "rule__Reference__Group__2__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2177:1: rule__Reference__Group__2__Impl : ( ( rule__Reference__NameAssignment_2 ) ) ;
    public final void rule__Reference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2181:1: ( ( ( rule__Reference__NameAssignment_2 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2182:1: ( ( rule__Reference__NameAssignment_2 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2182:1: ( ( rule__Reference__NameAssignment_2 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2183:1: ( rule__Reference__NameAssignment_2 )
            {
             before(grammarAccess.getReferenceAccess().getNameAssignment_2()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2184:1: ( rule__Reference__NameAssignment_2 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2184:2: rule__Reference__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Reference__NameAssignment_2_in_rule__Reference__Group__2__Impl4343);
            rule__Reference__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Reference__Group__2__Impl"


    // $ANTLR start "rule__Reference__Group__3"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2194:1: rule__Reference__Group__3 : rule__Reference__Group__3__Impl rule__Reference__Group__4 ;
    public final void rule__Reference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2198:1: ( rule__Reference__Group__3__Impl rule__Reference__Group__4 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2199:2: rule__Reference__Group__3__Impl rule__Reference__Group__4
            {
            pushFollow(FOLLOW_rule__Reference__Group__3__Impl_in_rule__Reference__Group__34373);
            rule__Reference__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Reference__Group__4_in_rule__Reference__Group__34376);
            rule__Reference__Group__4();

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
    // $ANTLR end "rule__Reference__Group__3"


    // $ANTLR start "rule__Reference__Group__3__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2206:1: rule__Reference__Group__3__Impl : ( ( rule__Reference__ReferenceAssignment_3 ) ) ;
    public final void rule__Reference__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2210:1: ( ( ( rule__Reference__ReferenceAssignment_3 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2211:1: ( ( rule__Reference__ReferenceAssignment_3 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2211:1: ( ( rule__Reference__ReferenceAssignment_3 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2212:1: ( rule__Reference__ReferenceAssignment_3 )
            {
             before(grammarAccess.getReferenceAccess().getReferenceAssignment_3()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2213:1: ( rule__Reference__ReferenceAssignment_3 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2213:2: rule__Reference__ReferenceAssignment_3
            {
            pushFollow(FOLLOW_rule__Reference__ReferenceAssignment_3_in_rule__Reference__Group__3__Impl4403);
            rule__Reference__ReferenceAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getReferenceAssignment_3()); 

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
    // $ANTLR end "rule__Reference__Group__3__Impl"


    // $ANTLR start "rule__Reference__Group__4"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2223:1: rule__Reference__Group__4 : rule__Reference__Group__4__Impl rule__Reference__Group__5 ;
    public final void rule__Reference__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2227:1: ( rule__Reference__Group__4__Impl rule__Reference__Group__5 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2228:2: rule__Reference__Group__4__Impl rule__Reference__Group__5
            {
            pushFollow(FOLLOW_rule__Reference__Group__4__Impl_in_rule__Reference__Group__44433);
            rule__Reference__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Reference__Group__5_in_rule__Reference__Group__44436);
            rule__Reference__Group__5();

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
    // $ANTLR end "rule__Reference__Group__4"


    // $ANTLR start "rule__Reference__Group__4__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2235:1: rule__Reference__Group__4__Impl : ( ( rule__Reference__ManyAssignment_4 )? ) ;
    public final void rule__Reference__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2239:1: ( ( ( rule__Reference__ManyAssignment_4 )? ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2240:1: ( ( rule__Reference__ManyAssignment_4 )? )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2240:1: ( ( rule__Reference__ManyAssignment_4 )? )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2241:1: ( rule__Reference__ManyAssignment_4 )?
            {
             before(grammarAccess.getReferenceAccess().getManyAssignment_4()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2242:1: ( rule__Reference__ManyAssignment_4 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==32) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2242:2: rule__Reference__ManyAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Reference__ManyAssignment_4_in_rule__Reference__Group__4__Impl4463);
                    rule__Reference__ManyAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReferenceAccess().getManyAssignment_4()); 

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
    // $ANTLR end "rule__Reference__Group__4__Impl"


    // $ANTLR start "rule__Reference__Group__5"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2252:1: rule__Reference__Group__5 : rule__Reference__Group__5__Impl ;
    public final void rule__Reference__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2256:1: ( rule__Reference__Group__5__Impl )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2257:2: rule__Reference__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Reference__Group__5__Impl_in_rule__Reference__Group__54494);
            rule__Reference__Group__5__Impl();

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
    // $ANTLR end "rule__Reference__Group__5"


    // $ANTLR start "rule__Reference__Group__5__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2263:1: rule__Reference__Group__5__Impl : ( ( rule__Reference__Group_5__0 )? ) ;
    public final void rule__Reference__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2267:1: ( ( ( rule__Reference__Group_5__0 )? ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2268:1: ( ( rule__Reference__Group_5__0 )? )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2268:1: ( ( rule__Reference__Group_5__0 )? )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2269:1: ( rule__Reference__Group_5__0 )?
            {
             before(grammarAccess.getReferenceAccess().getGroup_5()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2270:1: ( rule__Reference__Group_5__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==30) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2270:2: rule__Reference__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Reference__Group_5__0_in_rule__Reference__Group__5__Impl4521);
                    rule__Reference__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReferenceAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Reference__Group__5__Impl"


    // $ANTLR start "rule__Reference__Group_5__0"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2292:1: rule__Reference__Group_5__0 : rule__Reference__Group_5__0__Impl rule__Reference__Group_5__1 ;
    public final void rule__Reference__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2296:1: ( rule__Reference__Group_5__0__Impl rule__Reference__Group_5__1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2297:2: rule__Reference__Group_5__0__Impl rule__Reference__Group_5__1
            {
            pushFollow(FOLLOW_rule__Reference__Group_5__0__Impl_in_rule__Reference__Group_5__04564);
            rule__Reference__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Reference__Group_5__1_in_rule__Reference__Group_5__04567);
            rule__Reference__Group_5__1();

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
    // $ANTLR end "rule__Reference__Group_5__0"


    // $ANTLR start "rule__Reference__Group_5__0__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2304:1: rule__Reference__Group_5__0__Impl : ( 'opposite' ) ;
    public final void rule__Reference__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2308:1: ( ( 'opposite' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2309:1: ( 'opposite' )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2309:1: ( 'opposite' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2310:1: 'opposite'
            {
             before(grammarAccess.getReferenceAccess().getOppositeKeyword_5_0()); 
            match(input,30,FOLLOW_30_in_rule__Reference__Group_5__0__Impl4595); 
             after(grammarAccess.getReferenceAccess().getOppositeKeyword_5_0()); 

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
    // $ANTLR end "rule__Reference__Group_5__0__Impl"


    // $ANTLR start "rule__Reference__Group_5__1"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2323:1: rule__Reference__Group_5__1 : rule__Reference__Group_5__1__Impl ;
    public final void rule__Reference__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2327:1: ( rule__Reference__Group_5__1__Impl )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2328:2: rule__Reference__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Reference__Group_5__1__Impl_in_rule__Reference__Group_5__14626);
            rule__Reference__Group_5__1__Impl();

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
    // $ANTLR end "rule__Reference__Group_5__1"


    // $ANTLR start "rule__Reference__Group_5__1__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2334:1: rule__Reference__Group_5__1__Impl : ( ( rule__Reference__OppositeAssignment_5_1 ) ) ;
    public final void rule__Reference__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2338:1: ( ( ( rule__Reference__OppositeAssignment_5_1 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2339:1: ( ( rule__Reference__OppositeAssignment_5_1 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2339:1: ( ( rule__Reference__OppositeAssignment_5_1 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2340:1: ( rule__Reference__OppositeAssignment_5_1 )
            {
             before(grammarAccess.getReferenceAccess().getOppositeAssignment_5_1()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2341:1: ( rule__Reference__OppositeAssignment_5_1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2341:2: rule__Reference__OppositeAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Reference__OppositeAssignment_5_1_in_rule__Reference__Group_5__1__Impl4653);
            rule__Reference__OppositeAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getOppositeAssignment_5_1()); 

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
    // $ANTLR end "rule__Reference__Group_5__1__Impl"


    // $ANTLR start "rule__DataType__Group__0"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2355:1: rule__DataType__Group__0 : rule__DataType__Group__0__Impl rule__DataType__Group__1 ;
    public final void rule__DataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2359:1: ( rule__DataType__Group__0__Impl rule__DataType__Group__1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2360:2: rule__DataType__Group__0__Impl rule__DataType__Group__1
            {
            pushFollow(FOLLOW_rule__DataType__Group__0__Impl_in_rule__DataType__Group__04687);
            rule__DataType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataType__Group__1_in_rule__DataType__Group__04690);
            rule__DataType__Group__1();

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
    // $ANTLR end "rule__DataType__Group__0"


    // $ANTLR start "rule__DataType__Group__0__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2367:1: rule__DataType__Group__0__Impl : ( () ) ;
    public final void rule__DataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2371:1: ( ( () ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2372:1: ( () )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2372:1: ( () )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2373:1: ()
            {
             before(grammarAccess.getDataTypeAccess().getDataTypeAction_0()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2374:1: ()
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2376:1: 
            {
            }

             after(grammarAccess.getDataTypeAccess().getDataTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__0__Impl"


    // $ANTLR start "rule__DataType__Group__1"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2386:1: rule__DataType__Group__1 : rule__DataType__Group__1__Impl rule__DataType__Group__2 ;
    public final void rule__DataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2390:1: ( rule__DataType__Group__1__Impl rule__DataType__Group__2 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2391:2: rule__DataType__Group__1__Impl rule__DataType__Group__2
            {
            pushFollow(FOLLOW_rule__DataType__Group__1__Impl_in_rule__DataType__Group__14748);
            rule__DataType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataType__Group__2_in_rule__DataType__Group__14751);
            rule__DataType__Group__2();

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
    // $ANTLR end "rule__DataType__Group__1"


    // $ANTLR start "rule__DataType__Group__1__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2398:1: rule__DataType__Group__1__Impl : ( 'var' ) ;
    public final void rule__DataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2402:1: ( ( 'var' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2403:1: ( 'var' )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2403:1: ( 'var' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2404:1: 'var'
            {
             before(grammarAccess.getDataTypeAccess().getVarKeyword_1()); 
            match(input,29,FOLLOW_29_in_rule__DataType__Group__1__Impl4779); 
             after(grammarAccess.getDataTypeAccess().getVarKeyword_1()); 

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
    // $ANTLR end "rule__DataType__Group__1__Impl"


    // $ANTLR start "rule__DataType__Group__2"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2417:1: rule__DataType__Group__2 : rule__DataType__Group__2__Impl rule__DataType__Group__3 ;
    public final void rule__DataType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2421:1: ( rule__DataType__Group__2__Impl rule__DataType__Group__3 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2422:2: rule__DataType__Group__2__Impl rule__DataType__Group__3
            {
            pushFollow(FOLLOW_rule__DataType__Group__2__Impl_in_rule__DataType__Group__24810);
            rule__DataType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataType__Group__3_in_rule__DataType__Group__24813);
            rule__DataType__Group__3();

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
    // $ANTLR end "rule__DataType__Group__2"


    // $ANTLR start "rule__DataType__Group__2__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2429:1: rule__DataType__Group__2__Impl : ( ( rule__DataType__NameAssignment_2 ) ) ;
    public final void rule__DataType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2433:1: ( ( ( rule__DataType__NameAssignment_2 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2434:1: ( ( rule__DataType__NameAssignment_2 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2434:1: ( ( rule__DataType__NameAssignment_2 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2435:1: ( rule__DataType__NameAssignment_2 )
            {
             before(grammarAccess.getDataTypeAccess().getNameAssignment_2()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2436:1: ( rule__DataType__NameAssignment_2 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2436:2: rule__DataType__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__DataType__NameAssignment_2_in_rule__DataType__Group__2__Impl4840);
            rule__DataType__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__DataType__Group__2__Impl"


    // $ANTLR start "rule__DataType__Group__3"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2446:1: rule__DataType__Group__3 : rule__DataType__Group__3__Impl rule__DataType__Group__4 ;
    public final void rule__DataType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2450:1: ( rule__DataType__Group__3__Impl rule__DataType__Group__4 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2451:2: rule__DataType__Group__3__Impl rule__DataType__Group__4
            {
            pushFollow(FOLLOW_rule__DataType__Group__3__Impl_in_rule__DataType__Group__34870);
            rule__DataType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataType__Group__4_in_rule__DataType__Group__34873);
            rule__DataType__Group__4();

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
    // $ANTLR end "rule__DataType__Group__3"


    // $ANTLR start "rule__DataType__Group__3__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2458:1: rule__DataType__Group__3__Impl : ( ( rule__DataType__TypeAssignment_3 ) ) ;
    public final void rule__DataType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2462:1: ( ( ( rule__DataType__TypeAssignment_3 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2463:1: ( ( rule__DataType__TypeAssignment_3 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2463:1: ( ( rule__DataType__TypeAssignment_3 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2464:1: ( rule__DataType__TypeAssignment_3 )
            {
             before(grammarAccess.getDataTypeAccess().getTypeAssignment_3()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2465:1: ( rule__DataType__TypeAssignment_3 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2465:2: rule__DataType__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__DataType__TypeAssignment_3_in_rule__DataType__Group__3__Impl4900);
            rule__DataType__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getTypeAssignment_3()); 

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
    // $ANTLR end "rule__DataType__Group__3__Impl"


    // $ANTLR start "rule__DataType__Group__4"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2475:1: rule__DataType__Group__4 : rule__DataType__Group__4__Impl ;
    public final void rule__DataType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2479:1: ( rule__DataType__Group__4__Impl )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2480:2: rule__DataType__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__DataType__Group__4__Impl_in_rule__DataType__Group__44930);
            rule__DataType__Group__4__Impl();

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
    // $ANTLR end "rule__DataType__Group__4"


    // $ANTLR start "rule__DataType__Group__4__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2486:1: rule__DataType__Group__4__Impl : ( ( rule__DataType__ManyAssignment_4 )? ) ;
    public final void rule__DataType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2490:1: ( ( ( rule__DataType__ManyAssignment_4 )? ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2491:1: ( ( rule__DataType__ManyAssignment_4 )? )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2491:1: ( ( rule__DataType__ManyAssignment_4 )? )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2492:1: ( rule__DataType__ManyAssignment_4 )?
            {
             before(grammarAccess.getDataTypeAccess().getManyAssignment_4()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2493:1: ( rule__DataType__ManyAssignment_4 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==32) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2493:2: rule__DataType__ManyAssignment_4
                    {
                    pushFollow(FOLLOW_rule__DataType__ManyAssignment_4_in_rule__DataType__Group__4__Impl4957);
                    rule__DataType__ManyAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataTypeAccess().getManyAssignment_4()); 

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
    // $ANTLR end "rule__DataType__Group__4__Impl"


    // $ANTLR start "rule__ParameterReference__Group__0"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2513:1: rule__ParameterReference__Group__0 : rule__ParameterReference__Group__0__Impl rule__ParameterReference__Group__1 ;
    public final void rule__ParameterReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2517:1: ( rule__ParameterReference__Group__0__Impl rule__ParameterReference__Group__1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2518:2: rule__ParameterReference__Group__0__Impl rule__ParameterReference__Group__1
            {
            pushFollow(FOLLOW_rule__ParameterReference__Group__0__Impl_in_rule__ParameterReference__Group__04998);
            rule__ParameterReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParameterReference__Group__1_in_rule__ParameterReference__Group__05001);
            rule__ParameterReference__Group__1();

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
    // $ANTLR end "rule__ParameterReference__Group__0"


    // $ANTLR start "rule__ParameterReference__Group__0__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2525:1: rule__ParameterReference__Group__0__Impl : ( () ) ;
    public final void rule__ParameterReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2529:1: ( ( () ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2530:1: ( () )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2530:1: ( () )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2531:1: ()
            {
             before(grammarAccess.getParameterReferenceAccess().getParameterReferenceAction_0()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2532:1: ()
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2534:1: 
            {
            }

             after(grammarAccess.getParameterReferenceAccess().getParameterReferenceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterReference__Group__0__Impl"


    // $ANTLR start "rule__ParameterReference__Group__1"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2544:1: rule__ParameterReference__Group__1 : rule__ParameterReference__Group__1__Impl rule__ParameterReference__Group__2 ;
    public final void rule__ParameterReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2548:1: ( rule__ParameterReference__Group__1__Impl rule__ParameterReference__Group__2 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2549:2: rule__ParameterReference__Group__1__Impl rule__ParameterReference__Group__2
            {
            pushFollow(FOLLOW_rule__ParameterReference__Group__1__Impl_in_rule__ParameterReference__Group__15059);
            rule__ParameterReference__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParameterReference__Group__2_in_rule__ParameterReference__Group__15062);
            rule__ParameterReference__Group__2();

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
    // $ANTLR end "rule__ParameterReference__Group__1"


    // $ANTLR start "rule__ParameterReference__Group__1__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2556:1: rule__ParameterReference__Group__1__Impl : ( ( rule__ParameterReference__ReferenceAssignment_1 ) ) ;
    public final void rule__ParameterReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2560:1: ( ( ( rule__ParameterReference__ReferenceAssignment_1 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2561:1: ( ( rule__ParameterReference__ReferenceAssignment_1 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2561:1: ( ( rule__ParameterReference__ReferenceAssignment_1 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2562:1: ( rule__ParameterReference__ReferenceAssignment_1 )
            {
             before(grammarAccess.getParameterReferenceAccess().getReferenceAssignment_1()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2563:1: ( rule__ParameterReference__ReferenceAssignment_1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2563:2: rule__ParameterReference__ReferenceAssignment_1
            {
            pushFollow(FOLLOW_rule__ParameterReference__ReferenceAssignment_1_in_rule__ParameterReference__Group__1__Impl5089);
            rule__ParameterReference__ReferenceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterReferenceAccess().getReferenceAssignment_1()); 

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
    // $ANTLR end "rule__ParameterReference__Group__1__Impl"


    // $ANTLR start "rule__ParameterReference__Group__2"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2573:1: rule__ParameterReference__Group__2 : rule__ParameterReference__Group__2__Impl rule__ParameterReference__Group__3 ;
    public final void rule__ParameterReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2577:1: ( rule__ParameterReference__Group__2__Impl rule__ParameterReference__Group__3 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2578:2: rule__ParameterReference__Group__2__Impl rule__ParameterReference__Group__3
            {
            pushFollow(FOLLOW_rule__ParameterReference__Group__2__Impl_in_rule__ParameterReference__Group__25119);
            rule__ParameterReference__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParameterReference__Group__3_in_rule__ParameterReference__Group__25122);
            rule__ParameterReference__Group__3();

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
    // $ANTLR end "rule__ParameterReference__Group__2"


    // $ANTLR start "rule__ParameterReference__Group__2__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2585:1: rule__ParameterReference__Group__2__Impl : ( ( rule__ParameterReference__ManyAssignment_2 )? ) ;
    public final void rule__ParameterReference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2589:1: ( ( ( rule__ParameterReference__ManyAssignment_2 )? ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2590:1: ( ( rule__ParameterReference__ManyAssignment_2 )? )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2590:1: ( ( rule__ParameterReference__ManyAssignment_2 )? )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2591:1: ( rule__ParameterReference__ManyAssignment_2 )?
            {
             before(grammarAccess.getParameterReferenceAccess().getManyAssignment_2()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2592:1: ( rule__ParameterReference__ManyAssignment_2 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==32) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2592:2: rule__ParameterReference__ManyAssignment_2
                    {
                    pushFollow(FOLLOW_rule__ParameterReference__ManyAssignment_2_in_rule__ParameterReference__Group__2__Impl5149);
                    rule__ParameterReference__ManyAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterReferenceAccess().getManyAssignment_2()); 

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
    // $ANTLR end "rule__ParameterReference__Group__2__Impl"


    // $ANTLR start "rule__ParameterReference__Group__3"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2602:1: rule__ParameterReference__Group__3 : rule__ParameterReference__Group__3__Impl ;
    public final void rule__ParameterReference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2606:1: ( rule__ParameterReference__Group__3__Impl )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2607:2: rule__ParameterReference__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ParameterReference__Group__3__Impl_in_rule__ParameterReference__Group__35180);
            rule__ParameterReference__Group__3__Impl();

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
    // $ANTLR end "rule__ParameterReference__Group__3"


    // $ANTLR start "rule__ParameterReference__Group__3__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2613:1: rule__ParameterReference__Group__3__Impl : ( ( rule__ParameterReference__NameAssignment_3 ) ) ;
    public final void rule__ParameterReference__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2617:1: ( ( ( rule__ParameterReference__NameAssignment_3 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2618:1: ( ( rule__ParameterReference__NameAssignment_3 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2618:1: ( ( rule__ParameterReference__NameAssignment_3 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2619:1: ( rule__ParameterReference__NameAssignment_3 )
            {
             before(grammarAccess.getParameterReferenceAccess().getNameAssignment_3()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2620:1: ( rule__ParameterReference__NameAssignment_3 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2620:2: rule__ParameterReference__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__ParameterReference__NameAssignment_3_in_rule__ParameterReference__Group__3__Impl5207);
            rule__ParameterReference__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getParameterReferenceAccess().getNameAssignment_3()); 

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
    // $ANTLR end "rule__ParameterReference__Group__3__Impl"


    // $ANTLR start "rule__ParameterDataType__Group__0"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2638:1: rule__ParameterDataType__Group__0 : rule__ParameterDataType__Group__0__Impl rule__ParameterDataType__Group__1 ;
    public final void rule__ParameterDataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2642:1: ( rule__ParameterDataType__Group__0__Impl rule__ParameterDataType__Group__1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2643:2: rule__ParameterDataType__Group__0__Impl rule__ParameterDataType__Group__1
            {
            pushFollow(FOLLOW_rule__ParameterDataType__Group__0__Impl_in_rule__ParameterDataType__Group__05245);
            rule__ParameterDataType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParameterDataType__Group__1_in_rule__ParameterDataType__Group__05248);
            rule__ParameterDataType__Group__1();

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
    // $ANTLR end "rule__ParameterDataType__Group__0"


    // $ANTLR start "rule__ParameterDataType__Group__0__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2650:1: rule__ParameterDataType__Group__0__Impl : ( () ) ;
    public final void rule__ParameterDataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2654:1: ( ( () ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2655:1: ( () )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2655:1: ( () )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2656:1: ()
            {
             before(grammarAccess.getParameterDataTypeAccess().getParameterDataTypeAction_0()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2657:1: ()
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2659:1: 
            {
            }

             after(grammarAccess.getParameterDataTypeAccess().getParameterDataTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDataType__Group__0__Impl"


    // $ANTLR start "rule__ParameterDataType__Group__1"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2669:1: rule__ParameterDataType__Group__1 : rule__ParameterDataType__Group__1__Impl rule__ParameterDataType__Group__2 ;
    public final void rule__ParameterDataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2673:1: ( rule__ParameterDataType__Group__1__Impl rule__ParameterDataType__Group__2 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2674:2: rule__ParameterDataType__Group__1__Impl rule__ParameterDataType__Group__2
            {
            pushFollow(FOLLOW_rule__ParameterDataType__Group__1__Impl_in_rule__ParameterDataType__Group__15306);
            rule__ParameterDataType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParameterDataType__Group__2_in_rule__ParameterDataType__Group__15309);
            rule__ParameterDataType__Group__2();

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
    // $ANTLR end "rule__ParameterDataType__Group__1"


    // $ANTLR start "rule__ParameterDataType__Group__1__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2681:1: rule__ParameterDataType__Group__1__Impl : ( ( rule__ParameterDataType__TypeAssignment_1 ) ) ;
    public final void rule__ParameterDataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2685:1: ( ( ( rule__ParameterDataType__TypeAssignment_1 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2686:1: ( ( rule__ParameterDataType__TypeAssignment_1 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2686:1: ( ( rule__ParameterDataType__TypeAssignment_1 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2687:1: ( rule__ParameterDataType__TypeAssignment_1 )
            {
             before(grammarAccess.getParameterDataTypeAccess().getTypeAssignment_1()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2688:1: ( rule__ParameterDataType__TypeAssignment_1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2688:2: rule__ParameterDataType__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__ParameterDataType__TypeAssignment_1_in_rule__ParameterDataType__Group__1__Impl5336);
            rule__ParameterDataType__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterDataTypeAccess().getTypeAssignment_1()); 

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
    // $ANTLR end "rule__ParameterDataType__Group__1__Impl"


    // $ANTLR start "rule__ParameterDataType__Group__2"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2698:1: rule__ParameterDataType__Group__2 : rule__ParameterDataType__Group__2__Impl rule__ParameterDataType__Group__3 ;
    public final void rule__ParameterDataType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2702:1: ( rule__ParameterDataType__Group__2__Impl rule__ParameterDataType__Group__3 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2703:2: rule__ParameterDataType__Group__2__Impl rule__ParameterDataType__Group__3
            {
            pushFollow(FOLLOW_rule__ParameterDataType__Group__2__Impl_in_rule__ParameterDataType__Group__25366);
            rule__ParameterDataType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParameterDataType__Group__3_in_rule__ParameterDataType__Group__25369);
            rule__ParameterDataType__Group__3();

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
    // $ANTLR end "rule__ParameterDataType__Group__2"


    // $ANTLR start "rule__ParameterDataType__Group__2__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2710:1: rule__ParameterDataType__Group__2__Impl : ( ( rule__ParameterDataType__ManyAssignment_2 )? ) ;
    public final void rule__ParameterDataType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2714:1: ( ( ( rule__ParameterDataType__ManyAssignment_2 )? ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2715:1: ( ( rule__ParameterDataType__ManyAssignment_2 )? )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2715:1: ( ( rule__ParameterDataType__ManyAssignment_2 )? )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2716:1: ( rule__ParameterDataType__ManyAssignment_2 )?
            {
             before(grammarAccess.getParameterDataTypeAccess().getManyAssignment_2()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2717:1: ( rule__ParameterDataType__ManyAssignment_2 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==32) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2717:2: rule__ParameterDataType__ManyAssignment_2
                    {
                    pushFollow(FOLLOW_rule__ParameterDataType__ManyAssignment_2_in_rule__ParameterDataType__Group__2__Impl5396);
                    rule__ParameterDataType__ManyAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterDataTypeAccess().getManyAssignment_2()); 

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
    // $ANTLR end "rule__ParameterDataType__Group__2__Impl"


    // $ANTLR start "rule__ParameterDataType__Group__3"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2727:1: rule__ParameterDataType__Group__3 : rule__ParameterDataType__Group__3__Impl ;
    public final void rule__ParameterDataType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2731:1: ( rule__ParameterDataType__Group__3__Impl )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2732:2: rule__ParameterDataType__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ParameterDataType__Group__3__Impl_in_rule__ParameterDataType__Group__35427);
            rule__ParameterDataType__Group__3__Impl();

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
    // $ANTLR end "rule__ParameterDataType__Group__3"


    // $ANTLR start "rule__ParameterDataType__Group__3__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2738:1: rule__ParameterDataType__Group__3__Impl : ( ( rule__ParameterDataType__NameAssignment_3 ) ) ;
    public final void rule__ParameterDataType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2742:1: ( ( ( rule__ParameterDataType__NameAssignment_3 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2743:1: ( ( rule__ParameterDataType__NameAssignment_3 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2743:1: ( ( rule__ParameterDataType__NameAssignment_3 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2744:1: ( rule__ParameterDataType__NameAssignment_3 )
            {
             before(grammarAccess.getParameterDataTypeAccess().getNameAssignment_3()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2745:1: ( rule__ParameterDataType__NameAssignment_3 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2745:2: rule__ParameterDataType__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__ParameterDataType__NameAssignment_3_in_rule__ParameterDataType__Group__3__Impl5454);
            rule__ParameterDataType__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getParameterDataTypeAccess().getNameAssignment_3()); 

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
    // $ANTLR end "rule__ParameterDataType__Group__3__Impl"


    // $ANTLR start "rule__QUALIFIED_NAME__Group__0"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2763:1: rule__QUALIFIED_NAME__Group__0 : rule__QUALIFIED_NAME__Group__0__Impl rule__QUALIFIED_NAME__Group__1 ;
    public final void rule__QUALIFIED_NAME__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2767:1: ( rule__QUALIFIED_NAME__Group__0__Impl rule__QUALIFIED_NAME__Group__1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2768:2: rule__QUALIFIED_NAME__Group__0__Impl rule__QUALIFIED_NAME__Group__1
            {
            pushFollow(FOLLOW_rule__QUALIFIED_NAME__Group__0__Impl_in_rule__QUALIFIED_NAME__Group__05492);
            rule__QUALIFIED_NAME__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QUALIFIED_NAME__Group__1_in_rule__QUALIFIED_NAME__Group__05495);
            rule__QUALIFIED_NAME__Group__1();

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
    // $ANTLR end "rule__QUALIFIED_NAME__Group__0"


    // $ANTLR start "rule__QUALIFIED_NAME__Group__0__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2775:1: rule__QUALIFIED_NAME__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QUALIFIED_NAME__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2779:1: ( ( RULE_ID ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2780:1: ( RULE_ID )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2780:1: ( RULE_ID )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2781:1: RULE_ID
            {
             before(grammarAccess.getQUALIFIED_NAMEAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QUALIFIED_NAME__Group__0__Impl5522); 
             after(grammarAccess.getQUALIFIED_NAMEAccess().getIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__QUALIFIED_NAME__Group__0__Impl"


    // $ANTLR start "rule__QUALIFIED_NAME__Group__1"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2792:1: rule__QUALIFIED_NAME__Group__1 : rule__QUALIFIED_NAME__Group__1__Impl ;
    public final void rule__QUALIFIED_NAME__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2796:1: ( rule__QUALIFIED_NAME__Group__1__Impl )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2797:2: rule__QUALIFIED_NAME__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QUALIFIED_NAME__Group__1__Impl_in_rule__QUALIFIED_NAME__Group__15551);
            rule__QUALIFIED_NAME__Group__1__Impl();

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
    // $ANTLR end "rule__QUALIFIED_NAME__Group__1"


    // $ANTLR start "rule__QUALIFIED_NAME__Group__1__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2803:1: rule__QUALIFIED_NAME__Group__1__Impl : ( ( rule__QUALIFIED_NAME__Group_1__0 )* ) ;
    public final void rule__QUALIFIED_NAME__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2807:1: ( ( ( rule__QUALIFIED_NAME__Group_1__0 )* ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2808:1: ( ( rule__QUALIFIED_NAME__Group_1__0 )* )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2808:1: ( ( rule__QUALIFIED_NAME__Group_1__0 )* )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2809:1: ( rule__QUALIFIED_NAME__Group_1__0 )*
            {
             before(grammarAccess.getQUALIFIED_NAMEAccess().getGroup_1()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2810:1: ( rule__QUALIFIED_NAME__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==31) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2810:2: rule__QUALIFIED_NAME__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QUALIFIED_NAME__Group_1__0_in_rule__QUALIFIED_NAME__Group__1__Impl5578);
            	    rule__QUALIFIED_NAME__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getQUALIFIED_NAMEAccess().getGroup_1()); 

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
    // $ANTLR end "rule__QUALIFIED_NAME__Group__1__Impl"


    // $ANTLR start "rule__QUALIFIED_NAME__Group_1__0"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2824:1: rule__QUALIFIED_NAME__Group_1__0 : rule__QUALIFIED_NAME__Group_1__0__Impl rule__QUALIFIED_NAME__Group_1__1 ;
    public final void rule__QUALIFIED_NAME__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2828:1: ( rule__QUALIFIED_NAME__Group_1__0__Impl rule__QUALIFIED_NAME__Group_1__1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2829:2: rule__QUALIFIED_NAME__Group_1__0__Impl rule__QUALIFIED_NAME__Group_1__1
            {
            pushFollow(FOLLOW_rule__QUALIFIED_NAME__Group_1__0__Impl_in_rule__QUALIFIED_NAME__Group_1__05613);
            rule__QUALIFIED_NAME__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QUALIFIED_NAME__Group_1__1_in_rule__QUALIFIED_NAME__Group_1__05616);
            rule__QUALIFIED_NAME__Group_1__1();

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
    // $ANTLR end "rule__QUALIFIED_NAME__Group_1__0"


    // $ANTLR start "rule__QUALIFIED_NAME__Group_1__0__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2836:1: rule__QUALIFIED_NAME__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QUALIFIED_NAME__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2840:1: ( ( '.' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2841:1: ( '.' )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2841:1: ( '.' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2842:1: '.'
            {
             before(grammarAccess.getQUALIFIED_NAMEAccess().getFullStopKeyword_1_0()); 
            match(input,31,FOLLOW_31_in_rule__QUALIFIED_NAME__Group_1__0__Impl5644); 
             after(grammarAccess.getQUALIFIED_NAMEAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__QUALIFIED_NAME__Group_1__0__Impl"


    // $ANTLR start "rule__QUALIFIED_NAME__Group_1__1"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2855:1: rule__QUALIFIED_NAME__Group_1__1 : rule__QUALIFIED_NAME__Group_1__1__Impl ;
    public final void rule__QUALIFIED_NAME__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2859:1: ( rule__QUALIFIED_NAME__Group_1__1__Impl )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2860:2: rule__QUALIFIED_NAME__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QUALIFIED_NAME__Group_1__1__Impl_in_rule__QUALIFIED_NAME__Group_1__15675);
            rule__QUALIFIED_NAME__Group_1__1__Impl();

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
    // $ANTLR end "rule__QUALIFIED_NAME__Group_1__1"


    // $ANTLR start "rule__QUALIFIED_NAME__Group_1__1__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2866:1: rule__QUALIFIED_NAME__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QUALIFIED_NAME__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2870:1: ( ( RULE_ID ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2871:1: ( RULE_ID )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2871:1: ( RULE_ID )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2872:1: RULE_ID
            {
             before(grammarAccess.getQUALIFIED_NAMEAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QUALIFIED_NAME__Group_1__1__Impl5702); 
             after(grammarAccess.getQUALIFIED_NAMEAccess().getIDTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__QUALIFIED_NAME__Group_1__1__Impl"


    // $ANTLR start "rule__Module__NameAssignment_2"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2888:1: rule__Module__NameAssignment_2 : ( ruleQUALIFIED_NAME ) ;
    public final void rule__Module__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2892:1: ( ( ruleQUALIFIED_NAME ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2893:1: ( ruleQUALIFIED_NAME )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2893:1: ( ruleQUALIFIED_NAME )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2894:1: ruleQUALIFIED_NAME
            {
             before(grammarAccess.getModuleAccess().getNameQUALIFIED_NAMEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleQUALIFIED_NAME_in_rule__Module__NameAssignment_25740);
            ruleQUALIFIED_NAME();

            state._fsp--;

             after(grammarAccess.getModuleAccess().getNameQUALIFIED_NAMEParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Module__NameAssignment_2"


    // $ANTLR start "rule__Module__TypeAssignment_3"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2903:1: rule__Module__TypeAssignment_3 : ( ruleInternalDSLType ) ;
    public final void rule__Module__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2907:1: ( ( ruleInternalDSLType ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2908:1: ( ruleInternalDSLType )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2908:1: ( ruleInternalDSLType )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2909:1: ruleInternalDSLType
            {
             before(grammarAccess.getModuleAccess().getTypeInternalDSLTypeEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleInternalDSLType_in_rule__Module__TypeAssignment_35771);
            ruleInternalDSLType();

            state._fsp--;

             after(grammarAccess.getModuleAccess().getTypeInternalDSLTypeEnumRuleCall_3_0()); 

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
    // $ANTLR end "rule__Module__TypeAssignment_3"


    // $ANTLR start "rule__Module__PackagesAssignment_4_0"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2918:1: rule__Module__PackagesAssignment_4_0 : ( rulePackage ) ;
    public final void rule__Module__PackagesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2922:1: ( ( rulePackage ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2923:1: ( rulePackage )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2923:1: ( rulePackage )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2924:1: rulePackage
            {
             before(grammarAccess.getModuleAccess().getPackagesPackageParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_rulePackage_in_rule__Module__PackagesAssignment_4_05802);
            rulePackage();

            state._fsp--;

             after(grammarAccess.getModuleAccess().getPackagesPackageParserRuleCall_4_0_0()); 

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
    // $ANTLR end "rule__Module__PackagesAssignment_4_0"


    // $ANTLR start "rule__Module__PackagesAssignment_4_1"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2933:1: rule__Module__PackagesAssignment_4_1 : ( rulePackage ) ;
    public final void rule__Module__PackagesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2937:1: ( ( rulePackage ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2938:1: ( rulePackage )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2938:1: ( rulePackage )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2939:1: rulePackage
            {
             before(grammarAccess.getModuleAccess().getPackagesPackageParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_rulePackage_in_rule__Module__PackagesAssignment_4_15833);
            rulePackage();

            state._fsp--;

             after(grammarAccess.getModuleAccess().getPackagesPackageParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Module__PackagesAssignment_4_1"


    // $ANTLR start "rule__Package__NameAssignment_2"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2948:1: rule__Package__NameAssignment_2 : ( ruleQUALIFIED_NAME ) ;
    public final void rule__Package__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2952:1: ( ( ruleQUALIFIED_NAME ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2953:1: ( ruleQUALIFIED_NAME )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2953:1: ( ruleQUALIFIED_NAME )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2954:1: ruleQUALIFIED_NAME
            {
             before(grammarAccess.getPackageAccess().getNameQUALIFIED_NAMEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleQUALIFIED_NAME_in_rule__Package__NameAssignment_25864);
            ruleQUALIFIED_NAME();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getNameQUALIFIED_NAMEParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Package__NameAssignment_2"


    // $ANTLR start "rule__Package__EntitiesAssignment_4_0"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2963:1: rule__Package__EntitiesAssignment_4_0 : ( ruleEntity ) ;
    public final void rule__Package__EntitiesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2967:1: ( ( ruleEntity ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2968:1: ( ruleEntity )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2968:1: ( ruleEntity )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2969:1: ruleEntity
            {
             before(grammarAccess.getPackageAccess().getEntitiesEntityParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_ruleEntity_in_rule__Package__EntitiesAssignment_4_05895);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getEntitiesEntityParserRuleCall_4_0_0()); 

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
    // $ANTLR end "rule__Package__EntitiesAssignment_4_0"


    // $ANTLR start "rule__Package__EntitiesAssignment_4_1"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2978:1: rule__Package__EntitiesAssignment_4_1 : ( ruleEntity ) ;
    public final void rule__Package__EntitiesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2982:1: ( ( ruleEntity ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2983:1: ( ruleEntity )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2983:1: ( ruleEntity )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2984:1: ruleEntity
            {
             before(grammarAccess.getPackageAccess().getEntitiesEntityParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleEntity_in_rule__Package__EntitiesAssignment_4_15926);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getEntitiesEntityParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Package__EntitiesAssignment_4_1"


    // $ANTLR start "rule__Package__EntityBuildersAssignment_5_0"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2993:1: rule__Package__EntityBuildersAssignment_5_0 : ( ruleEntityBuilder ) ;
    public final void rule__Package__EntityBuildersAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2997:1: ( ( ruleEntityBuilder ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2998:1: ( ruleEntityBuilder )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2998:1: ( ruleEntityBuilder )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2999:1: ruleEntityBuilder
            {
             before(grammarAccess.getPackageAccess().getEntityBuildersEntityBuilderParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_ruleEntityBuilder_in_rule__Package__EntityBuildersAssignment_5_05957);
            ruleEntityBuilder();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getEntityBuildersEntityBuilderParserRuleCall_5_0_0()); 

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
    // $ANTLR end "rule__Package__EntityBuildersAssignment_5_0"


    // $ANTLR start "rule__Package__EntityBuildersAssignment_5_1"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3008:1: rule__Package__EntityBuildersAssignment_5_1 : ( ruleEntityBuilder ) ;
    public final void rule__Package__EntityBuildersAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3012:1: ( ( ruleEntityBuilder ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3013:1: ( ruleEntityBuilder )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3013:1: ( ruleEntityBuilder )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3014:1: ruleEntityBuilder
            {
             before(grammarAccess.getPackageAccess().getEntityBuildersEntityBuilderParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleEntityBuilder_in_rule__Package__EntityBuildersAssignment_5_15988);
            ruleEntityBuilder();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getEntityBuildersEntityBuilderParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__Package__EntityBuildersAssignment_5_1"


    // $ANTLR start "rule__Entity__NameAssignment_2"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3023:1: rule__Entity__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3027:1: ( ( RULE_ID ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3028:1: ( RULE_ID )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3028:1: ( RULE_ID )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3029:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_26019); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Entity__NameAssignment_2"


    // $ANTLR start "rule__Entity__SuperEntityAssignment_3_1"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3038:1: rule__Entity__SuperEntityAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__SuperEntityAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3042:1: ( ( ( RULE_ID ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3043:1: ( ( RULE_ID ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3043:1: ( ( RULE_ID ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3044:1: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getSuperEntityEntityCrossReference_3_1_0()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3045:1: ( RULE_ID )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3046:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getSuperEntityEntityIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__SuperEntityAssignment_3_16054); 
             after(grammarAccess.getEntityAccess().getSuperEntityEntityIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getEntityAccess().getSuperEntityEntityCrossReference_3_1_0()); 

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
    // $ANTLR end "rule__Entity__SuperEntityAssignment_3_1"


    // $ANTLR start "rule__Entity__FeaturesAssignment_5_0"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3057:1: rule__Entity__FeaturesAssignment_5_0 : ( ruleFeature ) ;
    public final void rule__Entity__FeaturesAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3061:1: ( ( ruleFeature ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3062:1: ( ruleFeature )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3062:1: ( ruleFeature )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3063:1: ruleFeature
            {
             before(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_ruleFeature_in_rule__Entity__FeaturesAssignment_5_06089);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_5_0_0()); 

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
    // $ANTLR end "rule__Entity__FeaturesAssignment_5_0"


    // $ANTLR start "rule__Entity__FeaturesAssignment_5_1"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3072:1: rule__Entity__FeaturesAssignment_5_1 : ( ruleFeature ) ;
    public final void rule__Entity__FeaturesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3076:1: ( ( ruleFeature ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3077:1: ( ruleFeature )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3077:1: ( ruleFeature )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3078:1: ruleFeature
            {
             before(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleFeature_in_rule__Entity__FeaturesAssignment_5_16120);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__Entity__FeaturesAssignment_5_1"


    // $ANTLR start "rule__EntityBuilder__NameAssignment_2"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3087:1: rule__EntityBuilder__NameAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__EntityBuilder__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3091:1: ( ( ( RULE_ID ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3092:1: ( ( RULE_ID ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3092:1: ( ( RULE_ID ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3093:1: ( RULE_ID )
            {
             before(grammarAccess.getEntityBuilderAccess().getNameEntityCrossReference_2_0()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3094:1: ( RULE_ID )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3095:1: RULE_ID
            {
             before(grammarAccess.getEntityBuilderAccess().getNameEntityIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EntityBuilder__NameAssignment_26155); 
             after(grammarAccess.getEntityBuilderAccess().getNameEntityIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getEntityBuilderAccess().getNameEntityCrossReference_2_0()); 

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
    // $ANTLR end "rule__EntityBuilder__NameAssignment_2"


    // $ANTLR start "rule__EntityBuilder__TakesAssignment_4"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3106:1: rule__EntityBuilder__TakesAssignment_4 : ( ruletakes ) ;
    public final void rule__EntityBuilder__TakesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3110:1: ( ( ruletakes ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3111:1: ( ruletakes )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3111:1: ( ruletakes )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3112:1: ruletakes
            {
             before(grammarAccess.getEntityBuilderAccess().getTakesTakesParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruletakes_in_rule__EntityBuilder__TakesAssignment_46190);
            ruletakes();

            state._fsp--;

             after(grammarAccess.getEntityBuilderAccess().getTakesTakesParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__EntityBuilder__TakesAssignment_4"


    // $ANTLR start "rule__Takes__TakesAssignment_1"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3122:1: rule__Takes__TakesAssignment_1 : ( ruleParameterFeature ) ;
    public final void rule__Takes__TakesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3126:1: ( ( ruleParameterFeature ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3127:1: ( ruleParameterFeature )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3127:1: ( ruleParameterFeature )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3128:1: ruleParameterFeature
            {
             before(grammarAccess.getTakesAccess().getTakesParameterFeatureParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleParameterFeature_in_rule__Takes__TakesAssignment_16222);
            ruleParameterFeature();

            state._fsp--;

             after(grammarAccess.getTakesAccess().getTakesParameterFeatureParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Takes__TakesAssignment_1"


    // $ANTLR start "rule__Takes__TakesAssignment_2_1"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3137:1: rule__Takes__TakesAssignment_2_1 : ( ruleParameterFeature ) ;
    public final void rule__Takes__TakesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3141:1: ( ( ruleParameterFeature ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3142:1: ( ruleParameterFeature )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3142:1: ( ruleParameterFeature )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3143:1: ruleParameterFeature
            {
             before(grammarAccess.getTakesAccess().getTakesParameterFeatureParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleParameterFeature_in_rule__Takes__TakesAssignment_2_16253);
            ruleParameterFeature();

            state._fsp--;

             after(grammarAccess.getTakesAccess().getTakesParameterFeatureParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Takes__TakesAssignment_2_1"


    // $ANTLR start "rule__Takes__AddsAssignment_3"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3152:1: rule__Takes__AddsAssignment_3 : ( ruleadds ) ;
    public final void rule__Takes__AddsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3156:1: ( ( ruleadds ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3157:1: ( ruleadds )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3157:1: ( ruleadds )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3158:1: ruleadds
            {
             before(grammarAccess.getTakesAccess().getAddsAddsParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleadds_in_rule__Takes__AddsAssignment_36284);
            ruleadds();

            state._fsp--;

             after(grammarAccess.getTakesAccess().getAddsAddsParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Takes__AddsAssignment_3"


    // $ANTLR start "rule__Adds__AddsAssignment_2_0"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3167:1: rule__Adds__AddsAssignment_2_0 : ( ( ruleQUALIFIED_NAME ) ) ;
    public final void rule__Adds__AddsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3171:1: ( ( ( ruleQUALIFIED_NAME ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3172:1: ( ( ruleQUALIFIED_NAME ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3172:1: ( ( ruleQUALIFIED_NAME ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3173:1: ( ruleQUALIFIED_NAME )
            {
             before(grammarAccess.getAddsAccess().getAddsFeatureCrossReference_2_0_0()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3174:1: ( ruleQUALIFIED_NAME )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3175:1: ruleQUALIFIED_NAME
            {
             before(grammarAccess.getAddsAccess().getAddsFeatureQUALIFIED_NAMEParserRuleCall_2_0_0_1()); 
            pushFollow(FOLLOW_ruleQUALIFIED_NAME_in_rule__Adds__AddsAssignment_2_06319);
            ruleQUALIFIED_NAME();

            state._fsp--;

             after(grammarAccess.getAddsAccess().getAddsFeatureQUALIFIED_NAMEParserRuleCall_2_0_0_1()); 

            }

             after(grammarAccess.getAddsAccess().getAddsFeatureCrossReference_2_0_0()); 

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
    // $ANTLR end "rule__Adds__AddsAssignment_2_0"


    // $ANTLR start "rule__Adds__AddsAssignment_2_1_1"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3186:1: rule__Adds__AddsAssignment_2_1_1 : ( ( ruleQUALIFIED_NAME ) ) ;
    public final void rule__Adds__AddsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3190:1: ( ( ( ruleQUALIFIED_NAME ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3191:1: ( ( ruleQUALIFIED_NAME ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3191:1: ( ( ruleQUALIFIED_NAME ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3192:1: ( ruleQUALIFIED_NAME )
            {
             before(grammarAccess.getAddsAccess().getAddsFeatureCrossReference_2_1_1_0()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3193:1: ( ruleQUALIFIED_NAME )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3194:1: ruleQUALIFIED_NAME
            {
             before(grammarAccess.getAddsAccess().getAddsFeatureQUALIFIED_NAMEParserRuleCall_2_1_1_0_1()); 
            pushFollow(FOLLOW_ruleQUALIFIED_NAME_in_rule__Adds__AddsAssignment_2_1_16358);
            ruleQUALIFIED_NAME();

            state._fsp--;

             after(grammarAccess.getAddsAccess().getAddsFeatureQUALIFIED_NAMEParserRuleCall_2_1_1_0_1()); 

            }

             after(grammarAccess.getAddsAccess().getAddsFeatureCrossReference_2_1_1_0()); 

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
    // $ANTLR end "rule__Adds__AddsAssignment_2_1_1"


    // $ANTLR start "rule__Reference__NameAssignment_2"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3205:1: rule__Reference__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Reference__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3209:1: ( ( RULE_ID ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3210:1: ( RULE_ID )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3210:1: ( RULE_ID )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3211:1: RULE_ID
            {
             before(grammarAccess.getReferenceAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Reference__NameAssignment_26393); 
             after(grammarAccess.getReferenceAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Reference__NameAssignment_2"


    // $ANTLR start "rule__Reference__ReferenceAssignment_3"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3220:1: rule__Reference__ReferenceAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Reference__ReferenceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3224:1: ( ( ( RULE_ID ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3225:1: ( ( RULE_ID ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3225:1: ( ( RULE_ID ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3226:1: ( RULE_ID )
            {
             before(grammarAccess.getReferenceAccess().getReferenceEntityCrossReference_3_0()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3227:1: ( RULE_ID )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3228:1: RULE_ID
            {
             before(grammarAccess.getReferenceAccess().getReferenceEntityIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Reference__ReferenceAssignment_36428); 
             after(grammarAccess.getReferenceAccess().getReferenceEntityIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getReferenceAccess().getReferenceEntityCrossReference_3_0()); 

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
    // $ANTLR end "rule__Reference__ReferenceAssignment_3"


    // $ANTLR start "rule__Reference__ManyAssignment_4"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3239:1: rule__Reference__ManyAssignment_4 : ( ( '[]' ) ) ;
    public final void rule__Reference__ManyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3243:1: ( ( ( '[]' ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3244:1: ( ( '[]' ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3244:1: ( ( '[]' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3245:1: ( '[]' )
            {
             before(grammarAccess.getReferenceAccess().getManyLeftSquareBracketRightSquareBracketKeyword_4_0()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3246:1: ( '[]' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3247:1: '[]'
            {
             before(grammarAccess.getReferenceAccess().getManyLeftSquareBracketRightSquareBracketKeyword_4_0()); 
            match(input,32,FOLLOW_32_in_rule__Reference__ManyAssignment_46468); 
             after(grammarAccess.getReferenceAccess().getManyLeftSquareBracketRightSquareBracketKeyword_4_0()); 

            }

             after(grammarAccess.getReferenceAccess().getManyLeftSquareBracketRightSquareBracketKeyword_4_0()); 

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
    // $ANTLR end "rule__Reference__ManyAssignment_4"


    // $ANTLR start "rule__Reference__OppositeAssignment_5_1"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3262:1: rule__Reference__OppositeAssignment_5_1 : ( ( ruleQUALIFIED_NAME ) ) ;
    public final void rule__Reference__OppositeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3266:1: ( ( ( ruleQUALIFIED_NAME ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3267:1: ( ( ruleQUALIFIED_NAME ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3267:1: ( ( ruleQUALIFIED_NAME ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3268:1: ( ruleQUALIFIED_NAME )
            {
             before(grammarAccess.getReferenceAccess().getOppositeReferenceCrossReference_5_1_0()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3269:1: ( ruleQUALIFIED_NAME )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3270:1: ruleQUALIFIED_NAME
            {
             before(grammarAccess.getReferenceAccess().getOppositeReferenceQUALIFIED_NAMEParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_ruleQUALIFIED_NAME_in_rule__Reference__OppositeAssignment_5_16511);
            ruleQUALIFIED_NAME();

            state._fsp--;

             after(grammarAccess.getReferenceAccess().getOppositeReferenceQUALIFIED_NAMEParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getReferenceAccess().getOppositeReferenceCrossReference_5_1_0()); 

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
    // $ANTLR end "rule__Reference__OppositeAssignment_5_1"


    // $ANTLR start "rule__DataType__NameAssignment_2"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3281:1: rule__DataType__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DataType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3285:1: ( ( RULE_ID ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3286:1: ( RULE_ID )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3286:1: ( RULE_ID )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3287:1: RULE_ID
            {
             before(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DataType__NameAssignment_26546); 
             after(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__DataType__NameAssignment_2"


    // $ANTLR start "rule__DataType__TypeAssignment_3"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3296:1: rule__DataType__TypeAssignment_3 : ( ruleDataTypes ) ;
    public final void rule__DataType__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3300:1: ( ( ruleDataTypes ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3301:1: ( ruleDataTypes )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3301:1: ( ruleDataTypes )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3302:1: ruleDataTypes
            {
             before(grammarAccess.getDataTypeAccess().getTypeDataTypesEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleDataTypes_in_rule__DataType__TypeAssignment_36577);
            ruleDataTypes();

            state._fsp--;

             after(grammarAccess.getDataTypeAccess().getTypeDataTypesEnumRuleCall_3_0()); 

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
    // $ANTLR end "rule__DataType__TypeAssignment_3"


    // $ANTLR start "rule__DataType__ManyAssignment_4"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3311:1: rule__DataType__ManyAssignment_4 : ( ( '[]' ) ) ;
    public final void rule__DataType__ManyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3315:1: ( ( ( '[]' ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3316:1: ( ( '[]' ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3316:1: ( ( '[]' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3317:1: ( '[]' )
            {
             before(grammarAccess.getDataTypeAccess().getManyLeftSquareBracketRightSquareBracketKeyword_4_0()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3318:1: ( '[]' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3319:1: '[]'
            {
             before(grammarAccess.getDataTypeAccess().getManyLeftSquareBracketRightSquareBracketKeyword_4_0()); 
            match(input,32,FOLLOW_32_in_rule__DataType__ManyAssignment_46613); 
             after(grammarAccess.getDataTypeAccess().getManyLeftSquareBracketRightSquareBracketKeyword_4_0()); 

            }

             after(grammarAccess.getDataTypeAccess().getManyLeftSquareBracketRightSquareBracketKeyword_4_0()); 

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
    // $ANTLR end "rule__DataType__ManyAssignment_4"


    // $ANTLR start "rule__ParameterReference__ReferenceAssignment_1"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3334:1: rule__ParameterReference__ReferenceAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ParameterReference__ReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3338:1: ( ( ( RULE_ID ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3339:1: ( ( RULE_ID ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3339:1: ( ( RULE_ID ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3340:1: ( RULE_ID )
            {
             before(grammarAccess.getParameterReferenceAccess().getReferenceEntityCrossReference_1_0()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3341:1: ( RULE_ID )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3342:1: RULE_ID
            {
             before(grammarAccess.getParameterReferenceAccess().getReferenceEntityIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ParameterReference__ReferenceAssignment_16656); 
             after(grammarAccess.getParameterReferenceAccess().getReferenceEntityIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getParameterReferenceAccess().getReferenceEntityCrossReference_1_0()); 

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
    // $ANTLR end "rule__ParameterReference__ReferenceAssignment_1"


    // $ANTLR start "rule__ParameterReference__ManyAssignment_2"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3353:1: rule__ParameterReference__ManyAssignment_2 : ( ( '[]' ) ) ;
    public final void rule__ParameterReference__ManyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3357:1: ( ( ( '[]' ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3358:1: ( ( '[]' ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3358:1: ( ( '[]' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3359:1: ( '[]' )
            {
             before(grammarAccess.getParameterReferenceAccess().getManyLeftSquareBracketRightSquareBracketKeyword_2_0()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3360:1: ( '[]' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3361:1: '[]'
            {
             before(grammarAccess.getParameterReferenceAccess().getManyLeftSquareBracketRightSquareBracketKeyword_2_0()); 
            match(input,32,FOLLOW_32_in_rule__ParameterReference__ManyAssignment_26696); 
             after(grammarAccess.getParameterReferenceAccess().getManyLeftSquareBracketRightSquareBracketKeyword_2_0()); 

            }

             after(grammarAccess.getParameterReferenceAccess().getManyLeftSquareBracketRightSquareBracketKeyword_2_0()); 

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
    // $ANTLR end "rule__ParameterReference__ManyAssignment_2"


    // $ANTLR start "rule__ParameterReference__NameAssignment_3"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3376:1: rule__ParameterReference__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__ParameterReference__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3380:1: ( ( RULE_ID ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3381:1: ( RULE_ID )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3381:1: ( RULE_ID )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3382:1: RULE_ID
            {
             before(grammarAccess.getParameterReferenceAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ParameterReference__NameAssignment_36735); 
             after(grammarAccess.getParameterReferenceAccess().getNameIDTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__ParameterReference__NameAssignment_3"


    // $ANTLR start "rule__ParameterDataType__TypeAssignment_1"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3391:1: rule__ParameterDataType__TypeAssignment_1 : ( ruleDataTypes ) ;
    public final void rule__ParameterDataType__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3395:1: ( ( ruleDataTypes ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3396:1: ( ruleDataTypes )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3396:1: ( ruleDataTypes )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3397:1: ruleDataTypes
            {
             before(grammarAccess.getParameterDataTypeAccess().getTypeDataTypesEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleDataTypes_in_rule__ParameterDataType__TypeAssignment_16766);
            ruleDataTypes();

            state._fsp--;

             after(grammarAccess.getParameterDataTypeAccess().getTypeDataTypesEnumRuleCall_1_0()); 

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
    // $ANTLR end "rule__ParameterDataType__TypeAssignment_1"


    // $ANTLR start "rule__ParameterDataType__ManyAssignment_2"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3406:1: rule__ParameterDataType__ManyAssignment_2 : ( ( '[]' ) ) ;
    public final void rule__ParameterDataType__ManyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3410:1: ( ( ( '[]' ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3411:1: ( ( '[]' ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3411:1: ( ( '[]' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3412:1: ( '[]' )
            {
             before(grammarAccess.getParameterDataTypeAccess().getManyLeftSquareBracketRightSquareBracketKeyword_2_0()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3413:1: ( '[]' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3414:1: '[]'
            {
             before(grammarAccess.getParameterDataTypeAccess().getManyLeftSquareBracketRightSquareBracketKeyword_2_0()); 
            match(input,32,FOLLOW_32_in_rule__ParameterDataType__ManyAssignment_26802); 
             after(grammarAccess.getParameterDataTypeAccess().getManyLeftSquareBracketRightSquareBracketKeyword_2_0()); 

            }

             after(grammarAccess.getParameterDataTypeAccess().getManyLeftSquareBracketRightSquareBracketKeyword_2_0()); 

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
    // $ANTLR end "rule__ParameterDataType__ManyAssignment_2"


    // $ANTLR start "rule__ParameterDataType__NameAssignment_3"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3429:1: rule__ParameterDataType__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__ParameterDataType__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3433:1: ( ( RULE_ID ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3434:1: ( RULE_ID )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3434:1: ( RULE_ID )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3435:1: RULE_ID
            {
             before(grammarAccess.getParameterDataTypeAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ParameterDataType__NameAssignment_36841); 
             after(grammarAccess.getParameterDataTypeAccess().getNameIDTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__ParameterDataType__NameAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModule_in_entryRuleModule61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModule68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__0_in_ruleModule94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_entryRulePackage121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__0_in_rulePackage154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0_in_ruleEntity214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityBuilder_in_entryRuleEntityBuilder241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntityBuilder248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityBuilder__Group__0_in_ruleEntityBuilder274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletakes_in_entryRuletakes303 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletakes310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Takes__Group__0_in_ruletakes336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleadds_in_entryRuleadds363 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleadds370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Adds__Group__0_in_ruleadds396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature423 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Alternatives_in_ruleFeature456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_entryRuleReference483 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReference490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__0_in_ruleReference516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_entryRuleDataType543 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataType550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group__0_in_ruleDataType576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterFeature_in_entryRuleParameterFeature603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterFeature610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterFeature__Alternatives_in_ruleParameterFeature636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterReference_in_entryRuleParameterReference663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterReference670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterReference__Group__0_in_ruleParameterReference696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDataType_in_entryRuleParameterDataType723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterDataType730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDataType__Group__0_in_ruleParameterDataType756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQUALIFIED_NAME_in_entryRuleQUALIFIED_NAME783 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQUALIFIED_NAME790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QUALIFIED_NAME__Group__0_in_ruleQUALIFIED_NAME816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleInternalDSLType854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataTypes__Alternatives_in_ruleDataTypes892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_rule__Feature__Alternatives927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_rule__Feature__Alternatives944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterReference_in_rule__ParameterFeature__Alternatives976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDataType_in_rule__ParameterFeature__Alternatives993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__DataTypes__Alternatives1026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__DataTypes__Alternatives1047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__DataTypes__Alternatives1068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__DataTypes__Alternatives1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__DataTypes__Alternatives1110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__0__Impl_in_rule__Module__Group__01143 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Module__Group__1_in_rule__Module__Group__01146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__1__Impl_in_rule__Module__Group__11204 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Module__Group__2_in_rule__Module__Group__11207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Module__Group__1__Impl1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__2__Impl_in_rule__Module__Group__21266 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Module__Group__3_in_rule__Module__Group__21269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__NameAssignment_2_in_rule__Module__Group__2__Impl1296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__3__Impl_in_rule__Module__Group__31326 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Module__Group__4_in_rule__Module__Group__31329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__TypeAssignment_3_in_rule__Module__Group__3__Impl1356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__4__Impl_in_rule__Module__Group__41386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_4__0_in_rule__Module__Group__4__Impl1413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_4__0__Impl_in_rule__Module__Group_4__01454 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Module__Group_4__1_in_rule__Module__Group_4__01457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__PackagesAssignment_4_0_in_rule__Module__Group_4__0__Impl1484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_4__1__Impl_in_rule__Module__Group_4__11514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__PackagesAssignment_4_1_in_rule__Module__Group_4__1__Impl1541 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__01576 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Package__Group__1_in_rule__Package__Group__01579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__11637 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Package__Group__2_in_rule__Package__Group__11640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Package__Group__1__Impl1668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__21699 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Package__Group__3_in_rule__Package__Group__21702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__NameAssignment_2_in_rule__Package__Group__2__Impl1729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__3__Impl_in_rule__Package__Group__31759 = new BitSet(new long[]{0x0000000000B00000L});
    public static final BitSet FOLLOW_rule__Package__Group__4_in_rule__Package__Group__31762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Package__Group__3__Impl1790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__4__Impl_in_rule__Package__Group__41821 = new BitSet(new long[]{0x0000000000B00000L});
    public static final BitSet FOLLOW_rule__Package__Group__5_in_rule__Package__Group__41824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group_4__0_in_rule__Package__Group__4__Impl1851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__5__Impl_in_rule__Package__Group__51882 = new BitSet(new long[]{0x0000000000B00000L});
    public static final BitSet FOLLOW_rule__Package__Group__6_in_rule__Package__Group__51885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group_5__0_in_rule__Package__Group__5__Impl1912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__6__Impl_in_rule__Package__Group__61943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Package__Group__6__Impl1971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group_4__0__Impl_in_rule__Package__Group_4__02016 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Package__Group_4__1_in_rule__Package__Group_4__02019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__EntitiesAssignment_4_0_in_rule__Package__Group_4__0__Impl2046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group_4__1__Impl_in_rule__Package__Group_4__12076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__EntitiesAssignment_4_1_in_rule__Package__Group_4__1__Impl2103 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Package__Group_5__0__Impl_in_rule__Package__Group_5__02138 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Package__Group_5__1_in_rule__Package__Group_5__02141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__EntityBuildersAssignment_5_0_in_rule__Package__Group_5__0__Impl2168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group_5__1__Impl_in_rule__Package__Group_5__12198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__EntityBuildersAssignment_5_1_in_rule__Package__Group_5__1__Impl2225 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__02260 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__02263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__12321 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__12324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Entity__Group__1__Impl2352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__22383 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__22386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__NameAssignment_2_in_rule__Entity__Group__2__Impl2413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__32443 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__32446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__0_in_rule__Entity__Group__3__Impl2473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__42504 = new BitSet(new long[]{0x0000000020100000L});
    public static final BitSet FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__42507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Entity__Group__4__Impl2535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__52566 = new BitSet(new long[]{0x0000000020100000L});
    public static final BitSet FOLLOW_rule__Entity__Group__6_in_rule__Entity__Group__52569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_5__0_in_rule__Entity__Group__5__Impl2596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__6__Impl_in_rule__Entity__Group__62627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Entity__Group__6__Impl2655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__0__Impl_in_rule__Entity__Group_3__02700 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__1_in_rule__Entity__Group_3__02703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Entity__Group_3__0__Impl2731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__1__Impl_in_rule__Entity__Group_3__12762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__SuperEntityAssignment_3_1_in_rule__Entity__Group_3__1__Impl2789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_5__0__Impl_in_rule__Entity__Group_5__02823 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Entity__Group_5__1_in_rule__Entity__Group_5__02826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__FeaturesAssignment_5_0_in_rule__Entity__Group_5__0__Impl2853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_5__1__Impl_in_rule__Entity__Group_5__12883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__FeaturesAssignment_5_1_in_rule__Entity__Group_5__1__Impl2910 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__EntityBuilder__Group__0__Impl_in_rule__EntityBuilder__Group__02945 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__EntityBuilder__Group__1_in_rule__EntityBuilder__Group__02948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityBuilder__Group__1__Impl_in_rule__EntityBuilder__Group__13006 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EntityBuilder__Group__2_in_rule__EntityBuilder__Group__13009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__EntityBuilder__Group__1__Impl3037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityBuilder__Group__2__Impl_in_rule__EntityBuilder__Group__23068 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__EntityBuilder__Group__3_in_rule__EntityBuilder__Group__23071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityBuilder__NameAssignment_2_in_rule__EntityBuilder__Group__2__Impl3098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityBuilder__Group__3__Impl_in_rule__EntityBuilder__Group__33128 = new BitSet(new long[]{0x0000000001100000L});
    public static final BitSet FOLLOW_rule__EntityBuilder__Group__4_in_rule__EntityBuilder__Group__33131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__EntityBuilder__Group__3__Impl3159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityBuilder__Group__4__Impl_in_rule__EntityBuilder__Group__43190 = new BitSet(new long[]{0x0000000001100000L});
    public static final BitSet FOLLOW_rule__EntityBuilder__Group__5_in_rule__EntityBuilder__Group__43193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityBuilder__TakesAssignment_4_in_rule__EntityBuilder__Group__4__Impl3220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityBuilder__Group__5__Impl_in_rule__EntityBuilder__Group__53251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__EntityBuilder__Group__5__Impl3279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Takes__Group__0__Impl_in_rule__Takes__Group__03322 = new BitSet(new long[]{0x000000000001F010L});
    public static final BitSet FOLLOW_rule__Takes__Group__1_in_rule__Takes__Group__03325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Takes__Group__0__Impl3353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Takes__Group__1__Impl_in_rule__Takes__Group__13384 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_rule__Takes__Group__2_in_rule__Takes__Group__13387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Takes__TakesAssignment_1_in_rule__Takes__Group__1__Impl3414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Takes__Group__2__Impl_in_rule__Takes__Group__23444 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_rule__Takes__Group__3_in_rule__Takes__Group__23447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Takes__Group_2__0_in_rule__Takes__Group__2__Impl3474 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Takes__Group__3__Impl_in_rule__Takes__Group__33505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Takes__AddsAssignment_3_in_rule__Takes__Group__3__Impl3532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Takes__Group_2__0__Impl_in_rule__Takes__Group_2__03571 = new BitSet(new long[]{0x000000000001F010L});
    public static final BitSet FOLLOW_rule__Takes__Group_2__1_in_rule__Takes__Group_2__03574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Takes__Group_2__0__Impl3602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Takes__Group_2__1__Impl_in_rule__Takes__Group_2__13633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Takes__TakesAssignment_2_1_in_rule__Takes__Group_2__1__Impl3660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Adds__Group__0__Impl_in_rule__Adds__Group__03694 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Adds__Group__1_in_rule__Adds__Group__03697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Adds__Group__0__Impl3725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Adds__Group__1__Impl_in_rule__Adds__Group__13756 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Adds__Group__2_in_rule__Adds__Group__13759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Adds__Group__1__Impl3787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Adds__Group__2__Impl_in_rule__Adds__Group__23818 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Adds__Group__3_in_rule__Adds__Group__23821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Adds__Group_2__0_in_rule__Adds__Group__2__Impl3848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Adds__Group__3__Impl_in_rule__Adds__Group__33878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Adds__Group__3__Impl3906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Adds__Group_2__0__Impl_in_rule__Adds__Group_2__03945 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Adds__Group_2__1_in_rule__Adds__Group_2__03948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Adds__AddsAssignment_2_0_in_rule__Adds__Group_2__0__Impl3975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Adds__Group_2__1__Impl_in_rule__Adds__Group_2__14005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Adds__Group_2_1__0_in_rule__Adds__Group_2__1__Impl4032 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Adds__Group_2_1__0__Impl_in_rule__Adds__Group_2_1__04067 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Adds__Group_2_1__1_in_rule__Adds__Group_2_1__04070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Adds__Group_2_1__0__Impl4098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Adds__Group_2_1__1__Impl_in_rule__Adds__Group_2_1__14129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Adds__AddsAssignment_2_1_1_in_rule__Adds__Group_2_1__1__Impl4156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__0__Impl_in_rule__Reference__Group__04190 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Reference__Group__1_in_rule__Reference__Group__04193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__1__Impl_in_rule__Reference__Group__14251 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Reference__Group__2_in_rule__Reference__Group__14254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Reference__Group__1__Impl4282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__2__Impl_in_rule__Reference__Group__24313 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Reference__Group__3_in_rule__Reference__Group__24316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__NameAssignment_2_in_rule__Reference__Group__2__Impl4343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__3__Impl_in_rule__Reference__Group__34373 = new BitSet(new long[]{0x0000000140000000L});
    public static final BitSet FOLLOW_rule__Reference__Group__4_in_rule__Reference__Group__34376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__ReferenceAssignment_3_in_rule__Reference__Group__3__Impl4403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__4__Impl_in_rule__Reference__Group__44433 = new BitSet(new long[]{0x0000000140000000L});
    public static final BitSet FOLLOW_rule__Reference__Group__5_in_rule__Reference__Group__44436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__ManyAssignment_4_in_rule__Reference__Group__4__Impl4463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__5__Impl_in_rule__Reference__Group__54494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group_5__0_in_rule__Reference__Group__5__Impl4521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group_5__0__Impl_in_rule__Reference__Group_5__04564 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Reference__Group_5__1_in_rule__Reference__Group_5__04567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Reference__Group_5__0__Impl4595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group_5__1__Impl_in_rule__Reference__Group_5__14626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__OppositeAssignment_5_1_in_rule__Reference__Group_5__1__Impl4653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group__0__Impl_in_rule__DataType__Group__04687 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__DataType__Group__1_in_rule__DataType__Group__04690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group__1__Impl_in_rule__DataType__Group__14748 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DataType__Group__2_in_rule__DataType__Group__14751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__DataType__Group__1__Impl4779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group__2__Impl_in_rule__DataType__Group__24810 = new BitSet(new long[]{0x000000000001F010L});
    public static final BitSet FOLLOW_rule__DataType__Group__3_in_rule__DataType__Group__24813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__NameAssignment_2_in_rule__DataType__Group__2__Impl4840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group__3__Impl_in_rule__DataType__Group__34870 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__DataType__Group__4_in_rule__DataType__Group__34873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__TypeAssignment_3_in_rule__DataType__Group__3__Impl4900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group__4__Impl_in_rule__DataType__Group__44930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__ManyAssignment_4_in_rule__DataType__Group__4__Impl4957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterReference__Group__0__Impl_in_rule__ParameterReference__Group__04998 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ParameterReference__Group__1_in_rule__ParameterReference__Group__05001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterReference__Group__1__Impl_in_rule__ParameterReference__Group__15059 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_rule__ParameterReference__Group__2_in_rule__ParameterReference__Group__15062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterReference__ReferenceAssignment_1_in_rule__ParameterReference__Group__1__Impl5089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterReference__Group__2__Impl_in_rule__ParameterReference__Group__25119 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_rule__ParameterReference__Group__3_in_rule__ParameterReference__Group__25122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterReference__ManyAssignment_2_in_rule__ParameterReference__Group__2__Impl5149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterReference__Group__3__Impl_in_rule__ParameterReference__Group__35180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterReference__NameAssignment_3_in_rule__ParameterReference__Group__3__Impl5207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDataType__Group__0__Impl_in_rule__ParameterDataType__Group__05245 = new BitSet(new long[]{0x000000000001F010L});
    public static final BitSet FOLLOW_rule__ParameterDataType__Group__1_in_rule__ParameterDataType__Group__05248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDataType__Group__1__Impl_in_rule__ParameterDataType__Group__15306 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_rule__ParameterDataType__Group__2_in_rule__ParameterDataType__Group__15309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDataType__TypeAssignment_1_in_rule__ParameterDataType__Group__1__Impl5336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDataType__Group__2__Impl_in_rule__ParameterDataType__Group__25366 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_rule__ParameterDataType__Group__3_in_rule__ParameterDataType__Group__25369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDataType__ManyAssignment_2_in_rule__ParameterDataType__Group__2__Impl5396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDataType__Group__3__Impl_in_rule__ParameterDataType__Group__35427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDataType__NameAssignment_3_in_rule__ParameterDataType__Group__3__Impl5454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QUALIFIED_NAME__Group__0__Impl_in_rule__QUALIFIED_NAME__Group__05492 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__QUALIFIED_NAME__Group__1_in_rule__QUALIFIED_NAME__Group__05495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QUALIFIED_NAME__Group__0__Impl5522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QUALIFIED_NAME__Group__1__Impl_in_rule__QUALIFIED_NAME__Group__15551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QUALIFIED_NAME__Group_1__0_in_rule__QUALIFIED_NAME__Group__1__Impl5578 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__QUALIFIED_NAME__Group_1__0__Impl_in_rule__QUALIFIED_NAME__Group_1__05613 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QUALIFIED_NAME__Group_1__1_in_rule__QUALIFIED_NAME__Group_1__05616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__QUALIFIED_NAME__Group_1__0__Impl5644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QUALIFIED_NAME__Group_1__1__Impl_in_rule__QUALIFIED_NAME__Group_1__15675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QUALIFIED_NAME__Group_1__1__Impl5702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQUALIFIED_NAME_in_rule__Module__NameAssignment_25740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalDSLType_in_rule__Module__TypeAssignment_35771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_rule__Module__PackagesAssignment_4_05802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_rule__Module__PackagesAssignment_4_15833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQUALIFIED_NAME_in_rule__Package__NameAssignment_25864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__Package__EntitiesAssignment_4_05895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__Package__EntitiesAssignment_4_15926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityBuilder_in_rule__Package__EntityBuildersAssignment_5_05957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityBuilder_in_rule__Package__EntityBuildersAssignment_5_15988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_26019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__SuperEntityAssignment_3_16054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_rule__Entity__FeaturesAssignment_5_06089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_rule__Entity__FeaturesAssignment_5_16120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EntityBuilder__NameAssignment_26155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletakes_in_rule__EntityBuilder__TakesAssignment_46190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterFeature_in_rule__Takes__TakesAssignment_16222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterFeature_in_rule__Takes__TakesAssignment_2_16253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleadds_in_rule__Takes__AddsAssignment_36284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQUALIFIED_NAME_in_rule__Adds__AddsAssignment_2_06319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQUALIFIED_NAME_in_rule__Adds__AddsAssignment_2_1_16358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Reference__NameAssignment_26393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Reference__ReferenceAssignment_36428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Reference__ManyAssignment_46468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQUALIFIED_NAME_in_rule__Reference__OppositeAssignment_5_16511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DataType__NameAssignment_26546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypes_in_rule__DataType__TypeAssignment_36577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__DataType__ManyAssignment_46613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ParameterReference__ReferenceAssignment_16656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ParameterReference__ManyAssignment_26696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ParameterReference__NameAssignment_36735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypes_in_rule__ParameterDataType__TypeAssignment_16766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ParameterDataType__ManyAssignment_26802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ParameterDataType__NameAssignment_36841 = new BitSet(new long[]{0x0000000000000002L});

}