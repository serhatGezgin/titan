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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Nested Functions'", "'String'", "'integer'", "'boolean'", "'long'", "'double'", "'Object'", "'module'", "'package'", "'{'", "'}'", "'entity'", "':'", "'entityBuilder'", "'takes'", "','", "'adds'", "'('", "')'", "'var'", "'opposite'", "'.'", "'[]'"
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
    public static final int T__33=33;
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

            if ( (LA1_0==30) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==RULE_ID) ) {
                    int LA1_2 = input.LA(3);

                    if ( ((LA1_2>=12 && LA1_2<=17)) ) {
                        alt1=2;
                    }
                    else if ( (LA1_2==RULE_ID) ) {
                        alt1=1;
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
            else if ( ((LA2_0>=12 && LA2_0<=17)) ) {
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:509:1: rule__DataTypes__Alternatives : ( ( ( 'String' ) ) | ( ( 'integer' ) ) | ( ( 'boolean' ) ) | ( ( 'long' ) ) | ( ( 'double' ) ) | ( ( 'Object' ) ) );
    public final void rule__DataTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:513:1: ( ( ( 'String' ) ) | ( ( 'integer' ) ) | ( ( 'boolean' ) ) | ( ( 'long' ) ) | ( ( 'double' ) ) | ( ( 'Object' ) ) )
            int alt3=6;
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
            case 17:
                {
                alt3=6;
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
                case 6 :
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:549:6: ( ( 'Object' ) )
                    {
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:549:6: ( ( 'Object' ) )
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:550:1: ( 'Object' )
                    {
                     before(grammarAccess.getDataTypesAccess().getObjectEnumLiteralDeclaration_5()); 
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:551:1: ( 'Object' )
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:551:3: 'Object'
                    {
                    match(input,17,FOLLOW_17_in_rule__DataTypes__Alternatives1131); 

                    }

                     after(grammarAccess.getDataTypesAccess().getObjectEnumLiteralDeclaration_5()); 

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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:563:1: rule__Module__Group__0 : rule__Module__Group__0__Impl rule__Module__Group__1 ;
    public final void rule__Module__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:567:1: ( rule__Module__Group__0__Impl rule__Module__Group__1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:568:2: rule__Module__Group__0__Impl rule__Module__Group__1
            {
            pushFollow(FOLLOW_rule__Module__Group__0__Impl_in_rule__Module__Group__01164);
            rule__Module__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__1_in_rule__Module__Group__01167);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:575:1: rule__Module__Group__0__Impl : ( () ) ;
    public final void rule__Module__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:579:1: ( ( () ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:580:1: ( () )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:580:1: ( () )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:581:1: ()
            {
             before(grammarAccess.getModuleAccess().getModuleAction_0()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:582:1: ()
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:584:1: 
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:594:1: rule__Module__Group__1 : rule__Module__Group__1__Impl rule__Module__Group__2 ;
    public final void rule__Module__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:598:1: ( rule__Module__Group__1__Impl rule__Module__Group__2 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:599:2: rule__Module__Group__1__Impl rule__Module__Group__2
            {
            pushFollow(FOLLOW_rule__Module__Group__1__Impl_in_rule__Module__Group__11225);
            rule__Module__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__2_in_rule__Module__Group__11228);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:606:1: rule__Module__Group__1__Impl : ( 'module' ) ;
    public final void rule__Module__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:610:1: ( ( 'module' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:611:1: ( 'module' )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:611:1: ( 'module' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:612:1: 'module'
            {
             before(grammarAccess.getModuleAccess().getModuleKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__Module__Group__1__Impl1256); 
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:625:1: rule__Module__Group__2 : rule__Module__Group__2__Impl rule__Module__Group__3 ;
    public final void rule__Module__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:629:1: ( rule__Module__Group__2__Impl rule__Module__Group__3 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:630:2: rule__Module__Group__2__Impl rule__Module__Group__3
            {
            pushFollow(FOLLOW_rule__Module__Group__2__Impl_in_rule__Module__Group__21287);
            rule__Module__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__3_in_rule__Module__Group__21290);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:637:1: rule__Module__Group__2__Impl : ( ( rule__Module__NameAssignment_2 ) ) ;
    public final void rule__Module__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:641:1: ( ( ( rule__Module__NameAssignment_2 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:642:1: ( ( rule__Module__NameAssignment_2 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:642:1: ( ( rule__Module__NameAssignment_2 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:643:1: ( rule__Module__NameAssignment_2 )
            {
             before(grammarAccess.getModuleAccess().getNameAssignment_2()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:644:1: ( rule__Module__NameAssignment_2 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:644:2: rule__Module__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Module__NameAssignment_2_in_rule__Module__Group__2__Impl1317);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:654:1: rule__Module__Group__3 : rule__Module__Group__3__Impl rule__Module__Group__4 ;
    public final void rule__Module__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:658:1: ( rule__Module__Group__3__Impl rule__Module__Group__4 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:659:2: rule__Module__Group__3__Impl rule__Module__Group__4
            {
            pushFollow(FOLLOW_rule__Module__Group__3__Impl_in_rule__Module__Group__31347);
            rule__Module__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__4_in_rule__Module__Group__31350);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:666:1: rule__Module__Group__3__Impl : ( ( rule__Module__TypeAssignment_3 ) ) ;
    public final void rule__Module__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:670:1: ( ( ( rule__Module__TypeAssignment_3 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:671:1: ( ( rule__Module__TypeAssignment_3 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:671:1: ( ( rule__Module__TypeAssignment_3 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:672:1: ( rule__Module__TypeAssignment_3 )
            {
             before(grammarAccess.getModuleAccess().getTypeAssignment_3()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:673:1: ( rule__Module__TypeAssignment_3 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:673:2: rule__Module__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Module__TypeAssignment_3_in_rule__Module__Group__3__Impl1377);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:683:1: rule__Module__Group__4 : rule__Module__Group__4__Impl ;
    public final void rule__Module__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:687:1: ( rule__Module__Group__4__Impl )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:688:2: rule__Module__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Module__Group__4__Impl_in_rule__Module__Group__41407);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:694:1: rule__Module__Group__4__Impl : ( ( rule__Module__Group_4__0 )? ) ;
    public final void rule__Module__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:698:1: ( ( ( rule__Module__Group_4__0 )? ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:699:1: ( ( rule__Module__Group_4__0 )? )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:699:1: ( ( rule__Module__Group_4__0 )? )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:700:1: ( rule__Module__Group_4__0 )?
            {
             before(grammarAccess.getModuleAccess().getGroup_4()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:701:1: ( rule__Module__Group_4__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:701:2: rule__Module__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Module__Group_4__0_in_rule__Module__Group__4__Impl1434);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:721:1: rule__Module__Group_4__0 : rule__Module__Group_4__0__Impl rule__Module__Group_4__1 ;
    public final void rule__Module__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:725:1: ( rule__Module__Group_4__0__Impl rule__Module__Group_4__1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:726:2: rule__Module__Group_4__0__Impl rule__Module__Group_4__1
            {
            pushFollow(FOLLOW_rule__Module__Group_4__0__Impl_in_rule__Module__Group_4__01475);
            rule__Module__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group_4__1_in_rule__Module__Group_4__01478);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:733:1: rule__Module__Group_4__0__Impl : ( ( rule__Module__PackagesAssignment_4_0 ) ) ;
    public final void rule__Module__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:737:1: ( ( ( rule__Module__PackagesAssignment_4_0 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:738:1: ( ( rule__Module__PackagesAssignment_4_0 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:738:1: ( ( rule__Module__PackagesAssignment_4_0 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:739:1: ( rule__Module__PackagesAssignment_4_0 )
            {
             before(grammarAccess.getModuleAccess().getPackagesAssignment_4_0()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:740:1: ( rule__Module__PackagesAssignment_4_0 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:740:2: rule__Module__PackagesAssignment_4_0
            {
            pushFollow(FOLLOW_rule__Module__PackagesAssignment_4_0_in_rule__Module__Group_4__0__Impl1505);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:750:1: rule__Module__Group_4__1 : rule__Module__Group_4__1__Impl ;
    public final void rule__Module__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:754:1: ( rule__Module__Group_4__1__Impl )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:755:2: rule__Module__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Module__Group_4__1__Impl_in_rule__Module__Group_4__11535);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:761:1: rule__Module__Group_4__1__Impl : ( ( rule__Module__PackagesAssignment_4_1 )* ) ;
    public final void rule__Module__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:765:1: ( ( ( rule__Module__PackagesAssignment_4_1 )* ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:766:1: ( ( rule__Module__PackagesAssignment_4_1 )* )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:766:1: ( ( rule__Module__PackagesAssignment_4_1 )* )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:767:1: ( rule__Module__PackagesAssignment_4_1 )*
            {
             before(grammarAccess.getModuleAccess().getPackagesAssignment_4_1()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:768:1: ( rule__Module__PackagesAssignment_4_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:768:2: rule__Module__PackagesAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_rule__Module__PackagesAssignment_4_1_in_rule__Module__Group_4__1__Impl1562);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:782:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:786:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:787:2: rule__Package__Group__0__Impl rule__Package__Group__1
            {
            pushFollow(FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__01597);
            rule__Package__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__1_in_rule__Package__Group__01600);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:794:1: rule__Package__Group__0__Impl : ( () ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:798:1: ( ( () ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:799:1: ( () )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:799:1: ( () )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:800:1: ()
            {
             before(grammarAccess.getPackageAccess().getPackageAction_0()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:801:1: ()
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:803:1: 
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:813:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:817:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:818:2: rule__Package__Group__1__Impl rule__Package__Group__2
            {
            pushFollow(FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__11658);
            rule__Package__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__2_in_rule__Package__Group__11661);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:825:1: rule__Package__Group__1__Impl : ( 'package' ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:829:1: ( ( 'package' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:830:1: ( 'package' )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:830:1: ( 'package' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:831:1: 'package'
            {
             before(grammarAccess.getPackageAccess().getPackageKeyword_1()); 
            match(input,19,FOLLOW_19_in_rule__Package__Group__1__Impl1689); 
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:844:1: rule__Package__Group__2 : rule__Package__Group__2__Impl rule__Package__Group__3 ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:848:1: ( rule__Package__Group__2__Impl rule__Package__Group__3 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:849:2: rule__Package__Group__2__Impl rule__Package__Group__3
            {
            pushFollow(FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__21720);
            rule__Package__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__3_in_rule__Package__Group__21723);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:856:1: rule__Package__Group__2__Impl : ( ( rule__Package__NameAssignment_2 ) ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:860:1: ( ( ( rule__Package__NameAssignment_2 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:861:1: ( ( rule__Package__NameAssignment_2 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:861:1: ( ( rule__Package__NameAssignment_2 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:862:1: ( rule__Package__NameAssignment_2 )
            {
             before(grammarAccess.getPackageAccess().getNameAssignment_2()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:863:1: ( rule__Package__NameAssignment_2 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:863:2: rule__Package__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Package__NameAssignment_2_in_rule__Package__Group__2__Impl1750);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:873:1: rule__Package__Group__3 : rule__Package__Group__3__Impl rule__Package__Group__4 ;
    public final void rule__Package__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:877:1: ( rule__Package__Group__3__Impl rule__Package__Group__4 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:878:2: rule__Package__Group__3__Impl rule__Package__Group__4
            {
            pushFollow(FOLLOW_rule__Package__Group__3__Impl_in_rule__Package__Group__31780);
            rule__Package__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__4_in_rule__Package__Group__31783);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:885:1: rule__Package__Group__3__Impl : ( '{' ) ;
    public final void rule__Package__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:889:1: ( ( '{' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:890:1: ( '{' )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:890:1: ( '{' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:891:1: '{'
            {
             before(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,20,FOLLOW_20_in_rule__Package__Group__3__Impl1811); 
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:904:1: rule__Package__Group__4 : rule__Package__Group__4__Impl rule__Package__Group__5 ;
    public final void rule__Package__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:908:1: ( rule__Package__Group__4__Impl rule__Package__Group__5 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:909:2: rule__Package__Group__4__Impl rule__Package__Group__5
            {
            pushFollow(FOLLOW_rule__Package__Group__4__Impl_in_rule__Package__Group__41842);
            rule__Package__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__5_in_rule__Package__Group__41845);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:916:1: rule__Package__Group__4__Impl : ( ( rule__Package__Group_4__0 )? ) ;
    public final void rule__Package__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:920:1: ( ( ( rule__Package__Group_4__0 )? ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:921:1: ( ( rule__Package__Group_4__0 )? )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:921:1: ( ( rule__Package__Group_4__0 )? )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:922:1: ( rule__Package__Group_4__0 )?
            {
             before(grammarAccess.getPackageAccess().getGroup_4()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:923:1: ( rule__Package__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:923:2: rule__Package__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Package__Group_4__0_in_rule__Package__Group__4__Impl1872);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:933:1: rule__Package__Group__5 : rule__Package__Group__5__Impl rule__Package__Group__6 ;
    public final void rule__Package__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:937:1: ( rule__Package__Group__5__Impl rule__Package__Group__6 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:938:2: rule__Package__Group__5__Impl rule__Package__Group__6
            {
            pushFollow(FOLLOW_rule__Package__Group__5__Impl_in_rule__Package__Group__51903);
            rule__Package__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__6_in_rule__Package__Group__51906);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:945:1: rule__Package__Group__5__Impl : ( ( rule__Package__Group_5__0 )? ) ;
    public final void rule__Package__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:949:1: ( ( ( rule__Package__Group_5__0 )? ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:950:1: ( ( rule__Package__Group_5__0 )? )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:950:1: ( ( rule__Package__Group_5__0 )? )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:951:1: ( rule__Package__Group_5__0 )?
            {
             before(grammarAccess.getPackageAccess().getGroup_5()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:952:1: ( rule__Package__Group_5__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:952:2: rule__Package__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Package__Group_5__0_in_rule__Package__Group__5__Impl1933);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:962:1: rule__Package__Group__6 : rule__Package__Group__6__Impl ;
    public final void rule__Package__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:966:1: ( rule__Package__Group__6__Impl )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:967:2: rule__Package__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Package__Group__6__Impl_in_rule__Package__Group__61964);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:973:1: rule__Package__Group__6__Impl : ( '}' ) ;
    public final void rule__Package__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:977:1: ( ( '}' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:978:1: ( '}' )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:978:1: ( '}' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:979:1: '}'
            {
             before(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_6()); 
            match(input,21,FOLLOW_21_in_rule__Package__Group__6__Impl1992); 
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1006:1: rule__Package__Group_4__0 : rule__Package__Group_4__0__Impl rule__Package__Group_4__1 ;
    public final void rule__Package__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1010:1: ( rule__Package__Group_4__0__Impl rule__Package__Group_4__1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1011:2: rule__Package__Group_4__0__Impl rule__Package__Group_4__1
            {
            pushFollow(FOLLOW_rule__Package__Group_4__0__Impl_in_rule__Package__Group_4__02037);
            rule__Package__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group_4__1_in_rule__Package__Group_4__02040);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1018:1: rule__Package__Group_4__0__Impl : ( ( rule__Package__EntitiesAssignment_4_0 ) ) ;
    public final void rule__Package__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1022:1: ( ( ( rule__Package__EntitiesAssignment_4_0 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1023:1: ( ( rule__Package__EntitiesAssignment_4_0 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1023:1: ( ( rule__Package__EntitiesAssignment_4_0 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1024:1: ( rule__Package__EntitiesAssignment_4_0 )
            {
             before(grammarAccess.getPackageAccess().getEntitiesAssignment_4_0()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1025:1: ( rule__Package__EntitiesAssignment_4_0 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1025:2: rule__Package__EntitiesAssignment_4_0
            {
            pushFollow(FOLLOW_rule__Package__EntitiesAssignment_4_0_in_rule__Package__Group_4__0__Impl2067);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1035:1: rule__Package__Group_4__1 : rule__Package__Group_4__1__Impl ;
    public final void rule__Package__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1039:1: ( rule__Package__Group_4__1__Impl )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1040:2: rule__Package__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Package__Group_4__1__Impl_in_rule__Package__Group_4__12097);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1046:1: rule__Package__Group_4__1__Impl : ( ( rule__Package__EntitiesAssignment_4_1 )* ) ;
    public final void rule__Package__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1050:1: ( ( ( rule__Package__EntitiesAssignment_4_1 )* ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1051:1: ( ( rule__Package__EntitiesAssignment_4_1 )* )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1051:1: ( ( rule__Package__EntitiesAssignment_4_1 )* )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1052:1: ( rule__Package__EntitiesAssignment_4_1 )*
            {
             before(grammarAccess.getPackageAccess().getEntitiesAssignment_4_1()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1053:1: ( rule__Package__EntitiesAssignment_4_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==22) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1053:2: rule__Package__EntitiesAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_rule__Package__EntitiesAssignment_4_1_in_rule__Package__Group_4__1__Impl2124);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1067:1: rule__Package__Group_5__0 : rule__Package__Group_5__0__Impl rule__Package__Group_5__1 ;
    public final void rule__Package__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1071:1: ( rule__Package__Group_5__0__Impl rule__Package__Group_5__1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1072:2: rule__Package__Group_5__0__Impl rule__Package__Group_5__1
            {
            pushFollow(FOLLOW_rule__Package__Group_5__0__Impl_in_rule__Package__Group_5__02159);
            rule__Package__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group_5__1_in_rule__Package__Group_5__02162);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1079:1: rule__Package__Group_5__0__Impl : ( ( rule__Package__EntityBuildersAssignment_5_0 ) ) ;
    public final void rule__Package__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1083:1: ( ( ( rule__Package__EntityBuildersAssignment_5_0 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1084:1: ( ( rule__Package__EntityBuildersAssignment_5_0 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1084:1: ( ( rule__Package__EntityBuildersAssignment_5_0 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1085:1: ( rule__Package__EntityBuildersAssignment_5_0 )
            {
             before(grammarAccess.getPackageAccess().getEntityBuildersAssignment_5_0()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1086:1: ( rule__Package__EntityBuildersAssignment_5_0 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1086:2: rule__Package__EntityBuildersAssignment_5_0
            {
            pushFollow(FOLLOW_rule__Package__EntityBuildersAssignment_5_0_in_rule__Package__Group_5__0__Impl2189);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1096:1: rule__Package__Group_5__1 : rule__Package__Group_5__1__Impl ;
    public final void rule__Package__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1100:1: ( rule__Package__Group_5__1__Impl )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1101:2: rule__Package__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Package__Group_5__1__Impl_in_rule__Package__Group_5__12219);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1107:1: rule__Package__Group_5__1__Impl : ( ( rule__Package__EntityBuildersAssignment_5_1 )* ) ;
    public final void rule__Package__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1111:1: ( ( ( rule__Package__EntityBuildersAssignment_5_1 )* ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1112:1: ( ( rule__Package__EntityBuildersAssignment_5_1 )* )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1112:1: ( ( rule__Package__EntityBuildersAssignment_5_1 )* )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1113:1: ( rule__Package__EntityBuildersAssignment_5_1 )*
            {
             before(grammarAccess.getPackageAccess().getEntityBuildersAssignment_5_1()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1114:1: ( rule__Package__EntityBuildersAssignment_5_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==24) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1114:2: rule__Package__EntityBuildersAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_rule__Package__EntityBuildersAssignment_5_1_in_rule__Package__Group_5__1__Impl2246);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1128:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1132:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1133:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__02281);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__02284);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1140:1: rule__Entity__Group__0__Impl : ( () ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1144:1: ( ( () ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1145:1: ( () )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1145:1: ( () )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1146:1: ()
            {
             before(grammarAccess.getEntityAccess().getEntityAction_0()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1147:1: ()
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1149:1: 
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1159:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1163:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1164:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__12342);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__12345);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1171:1: rule__Entity__Group__1__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1175:1: ( ( 'entity' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1176:1: ( 'entity' )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1176:1: ( 'entity' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1177:1: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__Entity__Group__1__Impl2373); 
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1190:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1194:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1195:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__22404);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__22407);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1202:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__NameAssignment_2 ) ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1206:1: ( ( ( rule__Entity__NameAssignment_2 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1207:1: ( ( rule__Entity__NameAssignment_2 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1207:1: ( ( rule__Entity__NameAssignment_2 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1208:1: ( rule__Entity__NameAssignment_2 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_2()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1209:1: ( rule__Entity__NameAssignment_2 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1209:2: rule__Entity__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Entity__NameAssignment_2_in_rule__Entity__Group__2__Impl2434);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1219:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1223:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1224:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__32464);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__32467);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1231:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__Group_3__0 )? ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1235:1: ( ( ( rule__Entity__Group_3__0 )? ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1236:1: ( ( rule__Entity__Group_3__0 )? )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1236:1: ( ( rule__Entity__Group_3__0 )? )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1237:1: ( rule__Entity__Group_3__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_3()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1238:1: ( rule__Entity__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1238:2: rule__Entity__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Entity__Group_3__0_in_rule__Entity__Group__3__Impl2494);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1248:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1252:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1253:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__42525);
            rule__Entity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__42528);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1260:1: rule__Entity__Group__4__Impl : ( '{' ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1264:1: ( ( '{' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1265:1: ( '{' )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1265:1: ( '{' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1266:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,20,FOLLOW_20_in_rule__Entity__Group__4__Impl2556); 
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1279:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl rule__Entity__Group__6 ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1283:1: ( rule__Entity__Group__5__Impl rule__Entity__Group__6 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1284:2: rule__Entity__Group__5__Impl rule__Entity__Group__6
            {
            pushFollow(FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__52587);
            rule__Entity__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__6_in_rule__Entity__Group__52590);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1291:1: rule__Entity__Group__5__Impl : ( ( rule__Entity__Group_5__0 )? ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1295:1: ( ( ( rule__Entity__Group_5__0 )? ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1296:1: ( ( rule__Entity__Group_5__0 )? )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1296:1: ( ( rule__Entity__Group_5__0 )? )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1297:1: ( rule__Entity__Group_5__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_5()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1298:1: ( rule__Entity__Group_5__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==30) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1298:2: rule__Entity__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Entity__Group_5__0_in_rule__Entity__Group__5__Impl2617);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1308:1: rule__Entity__Group__6 : rule__Entity__Group__6__Impl ;
    public final void rule__Entity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1312:1: ( rule__Entity__Group__6__Impl )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1313:2: rule__Entity__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group__6__Impl_in_rule__Entity__Group__62648);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1319:1: rule__Entity__Group__6__Impl : ( '}' ) ;
    public final void rule__Entity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1323:1: ( ( '}' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1324:1: ( '}' )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1324:1: ( '}' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1325:1: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_6()); 
            match(input,21,FOLLOW_21_in_rule__Entity__Group__6__Impl2676); 
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1352:1: rule__Entity__Group_3__0 : rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1 ;
    public final void rule__Entity__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1356:1: ( rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1357:2: rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1
            {
            pushFollow(FOLLOW_rule__Entity__Group_3__0__Impl_in_rule__Entity__Group_3__02721);
            rule__Entity__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group_3__1_in_rule__Entity__Group_3__02724);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1364:1: rule__Entity__Group_3__0__Impl : ( ':' ) ;
    public final void rule__Entity__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1368:1: ( ( ':' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1369:1: ( ':' )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1369:1: ( ':' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1370:1: ':'
            {
             before(grammarAccess.getEntityAccess().getColonKeyword_3_0()); 
            match(input,23,FOLLOW_23_in_rule__Entity__Group_3__0__Impl2752); 
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1383:1: rule__Entity__Group_3__1 : rule__Entity__Group_3__1__Impl ;
    public final void rule__Entity__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1387:1: ( rule__Entity__Group_3__1__Impl )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1388:2: rule__Entity__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group_3__1__Impl_in_rule__Entity__Group_3__12783);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1394:1: rule__Entity__Group_3__1__Impl : ( ( rule__Entity__SuperEntityAssignment_3_1 ) ) ;
    public final void rule__Entity__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1398:1: ( ( ( rule__Entity__SuperEntityAssignment_3_1 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1399:1: ( ( rule__Entity__SuperEntityAssignment_3_1 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1399:1: ( ( rule__Entity__SuperEntityAssignment_3_1 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1400:1: ( rule__Entity__SuperEntityAssignment_3_1 )
            {
             before(grammarAccess.getEntityAccess().getSuperEntityAssignment_3_1()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1401:1: ( rule__Entity__SuperEntityAssignment_3_1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1401:2: rule__Entity__SuperEntityAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Entity__SuperEntityAssignment_3_1_in_rule__Entity__Group_3__1__Impl2810);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1415:1: rule__Entity__Group_5__0 : rule__Entity__Group_5__0__Impl rule__Entity__Group_5__1 ;
    public final void rule__Entity__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1419:1: ( rule__Entity__Group_5__0__Impl rule__Entity__Group_5__1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1420:2: rule__Entity__Group_5__0__Impl rule__Entity__Group_5__1
            {
            pushFollow(FOLLOW_rule__Entity__Group_5__0__Impl_in_rule__Entity__Group_5__02844);
            rule__Entity__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group_5__1_in_rule__Entity__Group_5__02847);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1427:1: rule__Entity__Group_5__0__Impl : ( ( rule__Entity__FeaturesAssignment_5_0 ) ) ;
    public final void rule__Entity__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1431:1: ( ( ( rule__Entity__FeaturesAssignment_5_0 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1432:1: ( ( rule__Entity__FeaturesAssignment_5_0 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1432:1: ( ( rule__Entity__FeaturesAssignment_5_0 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1433:1: ( rule__Entity__FeaturesAssignment_5_0 )
            {
             before(grammarAccess.getEntityAccess().getFeaturesAssignment_5_0()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1434:1: ( rule__Entity__FeaturesAssignment_5_0 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1434:2: rule__Entity__FeaturesAssignment_5_0
            {
            pushFollow(FOLLOW_rule__Entity__FeaturesAssignment_5_0_in_rule__Entity__Group_5__0__Impl2874);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1444:1: rule__Entity__Group_5__1 : rule__Entity__Group_5__1__Impl ;
    public final void rule__Entity__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1448:1: ( rule__Entity__Group_5__1__Impl )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1449:2: rule__Entity__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group_5__1__Impl_in_rule__Entity__Group_5__12904);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1455:1: rule__Entity__Group_5__1__Impl : ( ( rule__Entity__FeaturesAssignment_5_1 )* ) ;
    public final void rule__Entity__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1459:1: ( ( ( rule__Entity__FeaturesAssignment_5_1 )* ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1460:1: ( ( rule__Entity__FeaturesAssignment_5_1 )* )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1460:1: ( ( rule__Entity__FeaturesAssignment_5_1 )* )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1461:1: ( rule__Entity__FeaturesAssignment_5_1 )*
            {
             before(grammarAccess.getEntityAccess().getFeaturesAssignment_5_1()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1462:1: ( rule__Entity__FeaturesAssignment_5_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==30) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1462:2: rule__Entity__FeaturesAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_rule__Entity__FeaturesAssignment_5_1_in_rule__Entity__Group_5__1__Impl2931);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1476:1: rule__EntityBuilder__Group__0 : rule__EntityBuilder__Group__0__Impl rule__EntityBuilder__Group__1 ;
    public final void rule__EntityBuilder__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1480:1: ( rule__EntityBuilder__Group__0__Impl rule__EntityBuilder__Group__1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1481:2: rule__EntityBuilder__Group__0__Impl rule__EntityBuilder__Group__1
            {
            pushFollow(FOLLOW_rule__EntityBuilder__Group__0__Impl_in_rule__EntityBuilder__Group__02966);
            rule__EntityBuilder__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityBuilder__Group__1_in_rule__EntityBuilder__Group__02969);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1488:1: rule__EntityBuilder__Group__0__Impl : ( () ) ;
    public final void rule__EntityBuilder__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1492:1: ( ( () ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1493:1: ( () )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1493:1: ( () )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1494:1: ()
            {
             before(grammarAccess.getEntityBuilderAccess().getEntityBuilderAction_0()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1495:1: ()
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1497:1: 
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1507:1: rule__EntityBuilder__Group__1 : rule__EntityBuilder__Group__1__Impl rule__EntityBuilder__Group__2 ;
    public final void rule__EntityBuilder__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1511:1: ( rule__EntityBuilder__Group__1__Impl rule__EntityBuilder__Group__2 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1512:2: rule__EntityBuilder__Group__1__Impl rule__EntityBuilder__Group__2
            {
            pushFollow(FOLLOW_rule__EntityBuilder__Group__1__Impl_in_rule__EntityBuilder__Group__13027);
            rule__EntityBuilder__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityBuilder__Group__2_in_rule__EntityBuilder__Group__13030);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1519:1: rule__EntityBuilder__Group__1__Impl : ( 'entityBuilder' ) ;
    public final void rule__EntityBuilder__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1523:1: ( ( 'entityBuilder' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1524:1: ( 'entityBuilder' )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1524:1: ( 'entityBuilder' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1525:1: 'entityBuilder'
            {
             before(grammarAccess.getEntityBuilderAccess().getEntityBuilderKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__EntityBuilder__Group__1__Impl3058); 
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1538:1: rule__EntityBuilder__Group__2 : rule__EntityBuilder__Group__2__Impl rule__EntityBuilder__Group__3 ;
    public final void rule__EntityBuilder__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1542:1: ( rule__EntityBuilder__Group__2__Impl rule__EntityBuilder__Group__3 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1543:2: rule__EntityBuilder__Group__2__Impl rule__EntityBuilder__Group__3
            {
            pushFollow(FOLLOW_rule__EntityBuilder__Group__2__Impl_in_rule__EntityBuilder__Group__23089);
            rule__EntityBuilder__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityBuilder__Group__3_in_rule__EntityBuilder__Group__23092);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1550:1: rule__EntityBuilder__Group__2__Impl : ( ( rule__EntityBuilder__NameAssignment_2 ) ) ;
    public final void rule__EntityBuilder__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1554:1: ( ( ( rule__EntityBuilder__NameAssignment_2 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1555:1: ( ( rule__EntityBuilder__NameAssignment_2 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1555:1: ( ( rule__EntityBuilder__NameAssignment_2 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1556:1: ( rule__EntityBuilder__NameAssignment_2 )
            {
             before(grammarAccess.getEntityBuilderAccess().getNameAssignment_2()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1557:1: ( rule__EntityBuilder__NameAssignment_2 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1557:2: rule__EntityBuilder__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__EntityBuilder__NameAssignment_2_in_rule__EntityBuilder__Group__2__Impl3119);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1567:1: rule__EntityBuilder__Group__3 : rule__EntityBuilder__Group__3__Impl rule__EntityBuilder__Group__4 ;
    public final void rule__EntityBuilder__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1571:1: ( rule__EntityBuilder__Group__3__Impl rule__EntityBuilder__Group__4 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1572:2: rule__EntityBuilder__Group__3__Impl rule__EntityBuilder__Group__4
            {
            pushFollow(FOLLOW_rule__EntityBuilder__Group__3__Impl_in_rule__EntityBuilder__Group__33149);
            rule__EntityBuilder__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityBuilder__Group__4_in_rule__EntityBuilder__Group__33152);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1579:1: rule__EntityBuilder__Group__3__Impl : ( '{' ) ;
    public final void rule__EntityBuilder__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1583:1: ( ( '{' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1584:1: ( '{' )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1584:1: ( '{' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1585:1: '{'
            {
             before(grammarAccess.getEntityBuilderAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,20,FOLLOW_20_in_rule__EntityBuilder__Group__3__Impl3180); 
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1598:1: rule__EntityBuilder__Group__4 : rule__EntityBuilder__Group__4__Impl rule__EntityBuilder__Group__5 ;
    public final void rule__EntityBuilder__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1602:1: ( rule__EntityBuilder__Group__4__Impl rule__EntityBuilder__Group__5 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1603:2: rule__EntityBuilder__Group__4__Impl rule__EntityBuilder__Group__5
            {
            pushFollow(FOLLOW_rule__EntityBuilder__Group__4__Impl_in_rule__EntityBuilder__Group__43211);
            rule__EntityBuilder__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityBuilder__Group__5_in_rule__EntityBuilder__Group__43214);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1610:1: rule__EntityBuilder__Group__4__Impl : ( ( rule__EntityBuilder__TakesAssignment_4 )? ) ;
    public final void rule__EntityBuilder__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1614:1: ( ( ( rule__EntityBuilder__TakesAssignment_4 )? ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1615:1: ( ( rule__EntityBuilder__TakesAssignment_4 )? )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1615:1: ( ( rule__EntityBuilder__TakesAssignment_4 )? )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1616:1: ( rule__EntityBuilder__TakesAssignment_4 )?
            {
             before(grammarAccess.getEntityBuilderAccess().getTakesAssignment_4()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1617:1: ( rule__EntityBuilder__TakesAssignment_4 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1617:2: rule__EntityBuilder__TakesAssignment_4
                    {
                    pushFollow(FOLLOW_rule__EntityBuilder__TakesAssignment_4_in_rule__EntityBuilder__Group__4__Impl3241);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1627:1: rule__EntityBuilder__Group__5 : rule__EntityBuilder__Group__5__Impl ;
    public final void rule__EntityBuilder__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1631:1: ( rule__EntityBuilder__Group__5__Impl )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1632:2: rule__EntityBuilder__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__EntityBuilder__Group__5__Impl_in_rule__EntityBuilder__Group__53272);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1638:1: rule__EntityBuilder__Group__5__Impl : ( '}' ) ;
    public final void rule__EntityBuilder__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1642:1: ( ( '}' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1643:1: ( '}' )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1643:1: ( '}' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1644:1: '}'
            {
             before(grammarAccess.getEntityBuilderAccess().getRightCurlyBracketKeyword_5()); 
            match(input,21,FOLLOW_21_in_rule__EntityBuilder__Group__5__Impl3300); 
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1669:1: rule__Takes__Group__0 : rule__Takes__Group__0__Impl rule__Takes__Group__1 ;
    public final void rule__Takes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1673:1: ( rule__Takes__Group__0__Impl rule__Takes__Group__1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1674:2: rule__Takes__Group__0__Impl rule__Takes__Group__1
            {
            pushFollow(FOLLOW_rule__Takes__Group__0__Impl_in_rule__Takes__Group__03343);
            rule__Takes__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Takes__Group__1_in_rule__Takes__Group__03346);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1681:1: rule__Takes__Group__0__Impl : ( 'takes' ) ;
    public final void rule__Takes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1685:1: ( ( 'takes' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1686:1: ( 'takes' )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1686:1: ( 'takes' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1687:1: 'takes'
            {
             before(grammarAccess.getTakesAccess().getTakesKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__Takes__Group__0__Impl3374); 
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1700:1: rule__Takes__Group__1 : rule__Takes__Group__1__Impl rule__Takes__Group__2 ;
    public final void rule__Takes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1704:1: ( rule__Takes__Group__1__Impl rule__Takes__Group__2 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1705:2: rule__Takes__Group__1__Impl rule__Takes__Group__2
            {
            pushFollow(FOLLOW_rule__Takes__Group__1__Impl_in_rule__Takes__Group__13405);
            rule__Takes__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Takes__Group__2_in_rule__Takes__Group__13408);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1712:1: rule__Takes__Group__1__Impl : ( ( rule__Takes__TakesAssignment_1 ) ) ;
    public final void rule__Takes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1716:1: ( ( ( rule__Takes__TakesAssignment_1 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1717:1: ( ( rule__Takes__TakesAssignment_1 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1717:1: ( ( rule__Takes__TakesAssignment_1 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1718:1: ( rule__Takes__TakesAssignment_1 )
            {
             before(grammarAccess.getTakesAccess().getTakesAssignment_1()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1719:1: ( rule__Takes__TakesAssignment_1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1719:2: rule__Takes__TakesAssignment_1
            {
            pushFollow(FOLLOW_rule__Takes__TakesAssignment_1_in_rule__Takes__Group__1__Impl3435);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1729:1: rule__Takes__Group__2 : rule__Takes__Group__2__Impl rule__Takes__Group__3 ;
    public final void rule__Takes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1733:1: ( rule__Takes__Group__2__Impl rule__Takes__Group__3 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1734:2: rule__Takes__Group__2__Impl rule__Takes__Group__3
            {
            pushFollow(FOLLOW_rule__Takes__Group__2__Impl_in_rule__Takes__Group__23465);
            rule__Takes__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Takes__Group__3_in_rule__Takes__Group__23468);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1741:1: rule__Takes__Group__2__Impl : ( ( rule__Takes__Group_2__0 )* ) ;
    public final void rule__Takes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1745:1: ( ( ( rule__Takes__Group_2__0 )* ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1746:1: ( ( rule__Takes__Group_2__0 )* )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1746:1: ( ( rule__Takes__Group_2__0 )* )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1747:1: ( rule__Takes__Group_2__0 )*
            {
             before(grammarAccess.getTakesAccess().getGroup_2()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1748:1: ( rule__Takes__Group_2__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==26) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1748:2: rule__Takes__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Takes__Group_2__0_in_rule__Takes__Group__2__Impl3495);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1758:1: rule__Takes__Group__3 : rule__Takes__Group__3__Impl ;
    public final void rule__Takes__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1762:1: ( rule__Takes__Group__3__Impl )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1763:2: rule__Takes__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Takes__Group__3__Impl_in_rule__Takes__Group__33526);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1769:1: rule__Takes__Group__3__Impl : ( ( rule__Takes__AddsAssignment_3 )? ) ;
    public final void rule__Takes__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1773:1: ( ( ( rule__Takes__AddsAssignment_3 )? ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1774:1: ( ( rule__Takes__AddsAssignment_3 )? )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1774:1: ( ( rule__Takes__AddsAssignment_3 )? )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1775:1: ( rule__Takes__AddsAssignment_3 )?
            {
             before(grammarAccess.getTakesAccess().getAddsAssignment_3()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1776:1: ( rule__Takes__AddsAssignment_3 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1776:2: rule__Takes__AddsAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Takes__AddsAssignment_3_in_rule__Takes__Group__3__Impl3553);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1794:1: rule__Takes__Group_2__0 : rule__Takes__Group_2__0__Impl rule__Takes__Group_2__1 ;
    public final void rule__Takes__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1798:1: ( rule__Takes__Group_2__0__Impl rule__Takes__Group_2__1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1799:2: rule__Takes__Group_2__0__Impl rule__Takes__Group_2__1
            {
            pushFollow(FOLLOW_rule__Takes__Group_2__0__Impl_in_rule__Takes__Group_2__03592);
            rule__Takes__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Takes__Group_2__1_in_rule__Takes__Group_2__03595);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1806:1: rule__Takes__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Takes__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1810:1: ( ( ',' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1811:1: ( ',' )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1811:1: ( ',' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1812:1: ','
            {
             before(grammarAccess.getTakesAccess().getCommaKeyword_2_0()); 
            match(input,26,FOLLOW_26_in_rule__Takes__Group_2__0__Impl3623); 
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1825:1: rule__Takes__Group_2__1 : rule__Takes__Group_2__1__Impl ;
    public final void rule__Takes__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1829:1: ( rule__Takes__Group_2__1__Impl )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1830:2: rule__Takes__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Takes__Group_2__1__Impl_in_rule__Takes__Group_2__13654);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1836:1: rule__Takes__Group_2__1__Impl : ( ( rule__Takes__TakesAssignment_2_1 ) ) ;
    public final void rule__Takes__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1840:1: ( ( ( rule__Takes__TakesAssignment_2_1 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1841:1: ( ( rule__Takes__TakesAssignment_2_1 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1841:1: ( ( rule__Takes__TakesAssignment_2_1 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1842:1: ( rule__Takes__TakesAssignment_2_1 )
            {
             before(grammarAccess.getTakesAccess().getTakesAssignment_2_1()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1843:1: ( rule__Takes__TakesAssignment_2_1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1843:2: rule__Takes__TakesAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Takes__TakesAssignment_2_1_in_rule__Takes__Group_2__1__Impl3681);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1857:1: rule__Adds__Group__0 : rule__Adds__Group__0__Impl rule__Adds__Group__1 ;
    public final void rule__Adds__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1861:1: ( rule__Adds__Group__0__Impl rule__Adds__Group__1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1862:2: rule__Adds__Group__0__Impl rule__Adds__Group__1
            {
            pushFollow(FOLLOW_rule__Adds__Group__0__Impl_in_rule__Adds__Group__03715);
            rule__Adds__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Adds__Group__1_in_rule__Adds__Group__03718);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1869:1: rule__Adds__Group__0__Impl : ( 'adds' ) ;
    public final void rule__Adds__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1873:1: ( ( 'adds' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1874:1: ( 'adds' )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1874:1: ( 'adds' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1875:1: 'adds'
            {
             before(grammarAccess.getAddsAccess().getAddsKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__Adds__Group__0__Impl3746); 
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1888:1: rule__Adds__Group__1 : rule__Adds__Group__1__Impl rule__Adds__Group__2 ;
    public final void rule__Adds__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1892:1: ( rule__Adds__Group__1__Impl rule__Adds__Group__2 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1893:2: rule__Adds__Group__1__Impl rule__Adds__Group__2
            {
            pushFollow(FOLLOW_rule__Adds__Group__1__Impl_in_rule__Adds__Group__13777);
            rule__Adds__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Adds__Group__2_in_rule__Adds__Group__13780);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1900:1: rule__Adds__Group__1__Impl : ( '(' ) ;
    public final void rule__Adds__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1904:1: ( ( '(' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1905:1: ( '(' )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1905:1: ( '(' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1906:1: '('
            {
             before(grammarAccess.getAddsAccess().getLeftParenthesisKeyword_1()); 
            match(input,28,FOLLOW_28_in_rule__Adds__Group__1__Impl3808); 
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1919:1: rule__Adds__Group__2 : rule__Adds__Group__2__Impl rule__Adds__Group__3 ;
    public final void rule__Adds__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1923:1: ( rule__Adds__Group__2__Impl rule__Adds__Group__3 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1924:2: rule__Adds__Group__2__Impl rule__Adds__Group__3
            {
            pushFollow(FOLLOW_rule__Adds__Group__2__Impl_in_rule__Adds__Group__23839);
            rule__Adds__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Adds__Group__3_in_rule__Adds__Group__23842);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1931:1: rule__Adds__Group__2__Impl : ( ( rule__Adds__Group_2__0 ) ) ;
    public final void rule__Adds__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1935:1: ( ( ( rule__Adds__Group_2__0 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1936:1: ( ( rule__Adds__Group_2__0 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1936:1: ( ( rule__Adds__Group_2__0 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1937:1: ( rule__Adds__Group_2__0 )
            {
             before(grammarAccess.getAddsAccess().getGroup_2()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1938:1: ( rule__Adds__Group_2__0 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1938:2: rule__Adds__Group_2__0
            {
            pushFollow(FOLLOW_rule__Adds__Group_2__0_in_rule__Adds__Group__2__Impl3869);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1948:1: rule__Adds__Group__3 : rule__Adds__Group__3__Impl ;
    public final void rule__Adds__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1952:1: ( rule__Adds__Group__3__Impl )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1953:2: rule__Adds__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Adds__Group__3__Impl_in_rule__Adds__Group__33899);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1959:1: rule__Adds__Group__3__Impl : ( ')' ) ;
    public final void rule__Adds__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1963:1: ( ( ')' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1964:1: ( ')' )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1964:1: ( ')' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1965:1: ')'
            {
             before(grammarAccess.getAddsAccess().getRightParenthesisKeyword_3()); 
            match(input,29,FOLLOW_29_in_rule__Adds__Group__3__Impl3927); 
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1986:1: rule__Adds__Group_2__0 : rule__Adds__Group_2__0__Impl rule__Adds__Group_2__1 ;
    public final void rule__Adds__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1990:1: ( rule__Adds__Group_2__0__Impl rule__Adds__Group_2__1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1991:2: rule__Adds__Group_2__0__Impl rule__Adds__Group_2__1
            {
            pushFollow(FOLLOW_rule__Adds__Group_2__0__Impl_in_rule__Adds__Group_2__03966);
            rule__Adds__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Adds__Group_2__1_in_rule__Adds__Group_2__03969);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1998:1: rule__Adds__Group_2__0__Impl : ( ( rule__Adds__AddsAssignment_2_0 ) ) ;
    public final void rule__Adds__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2002:1: ( ( ( rule__Adds__AddsAssignment_2_0 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2003:1: ( ( rule__Adds__AddsAssignment_2_0 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2003:1: ( ( rule__Adds__AddsAssignment_2_0 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2004:1: ( rule__Adds__AddsAssignment_2_0 )
            {
             before(grammarAccess.getAddsAccess().getAddsAssignment_2_0()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2005:1: ( rule__Adds__AddsAssignment_2_0 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2005:2: rule__Adds__AddsAssignment_2_0
            {
            pushFollow(FOLLOW_rule__Adds__AddsAssignment_2_0_in_rule__Adds__Group_2__0__Impl3996);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2015:1: rule__Adds__Group_2__1 : rule__Adds__Group_2__1__Impl ;
    public final void rule__Adds__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2019:1: ( rule__Adds__Group_2__1__Impl )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2020:2: rule__Adds__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Adds__Group_2__1__Impl_in_rule__Adds__Group_2__14026);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2026:1: rule__Adds__Group_2__1__Impl : ( ( rule__Adds__Group_2_1__0 )* ) ;
    public final void rule__Adds__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2030:1: ( ( ( rule__Adds__Group_2_1__0 )* ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2031:1: ( ( rule__Adds__Group_2_1__0 )* )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2031:1: ( ( rule__Adds__Group_2_1__0 )* )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2032:1: ( rule__Adds__Group_2_1__0 )*
            {
             before(grammarAccess.getAddsAccess().getGroup_2_1()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2033:1: ( rule__Adds__Group_2_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==26) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2033:2: rule__Adds__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Adds__Group_2_1__0_in_rule__Adds__Group_2__1__Impl4053);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2047:1: rule__Adds__Group_2_1__0 : rule__Adds__Group_2_1__0__Impl rule__Adds__Group_2_1__1 ;
    public final void rule__Adds__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2051:1: ( rule__Adds__Group_2_1__0__Impl rule__Adds__Group_2_1__1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2052:2: rule__Adds__Group_2_1__0__Impl rule__Adds__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__Adds__Group_2_1__0__Impl_in_rule__Adds__Group_2_1__04088);
            rule__Adds__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Adds__Group_2_1__1_in_rule__Adds__Group_2_1__04091);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2059:1: rule__Adds__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__Adds__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2063:1: ( ( ',' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2064:1: ( ',' )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2064:1: ( ',' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2065:1: ','
            {
             before(grammarAccess.getAddsAccess().getCommaKeyword_2_1_0()); 
            match(input,26,FOLLOW_26_in_rule__Adds__Group_2_1__0__Impl4119); 
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2078:1: rule__Adds__Group_2_1__1 : rule__Adds__Group_2_1__1__Impl ;
    public final void rule__Adds__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2082:1: ( rule__Adds__Group_2_1__1__Impl )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2083:2: rule__Adds__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Adds__Group_2_1__1__Impl_in_rule__Adds__Group_2_1__14150);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2089:1: rule__Adds__Group_2_1__1__Impl : ( ( rule__Adds__AddsAssignment_2_1_1 ) ) ;
    public final void rule__Adds__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2093:1: ( ( ( rule__Adds__AddsAssignment_2_1_1 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2094:1: ( ( rule__Adds__AddsAssignment_2_1_1 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2094:1: ( ( rule__Adds__AddsAssignment_2_1_1 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2095:1: ( rule__Adds__AddsAssignment_2_1_1 )
            {
             before(grammarAccess.getAddsAccess().getAddsAssignment_2_1_1()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2096:1: ( rule__Adds__AddsAssignment_2_1_1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2096:2: rule__Adds__AddsAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__Adds__AddsAssignment_2_1_1_in_rule__Adds__Group_2_1__1__Impl4177);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2110:1: rule__Reference__Group__0 : rule__Reference__Group__0__Impl rule__Reference__Group__1 ;
    public final void rule__Reference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2114:1: ( rule__Reference__Group__0__Impl rule__Reference__Group__1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2115:2: rule__Reference__Group__0__Impl rule__Reference__Group__1
            {
            pushFollow(FOLLOW_rule__Reference__Group__0__Impl_in_rule__Reference__Group__04211);
            rule__Reference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Reference__Group__1_in_rule__Reference__Group__04214);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2122:1: rule__Reference__Group__0__Impl : ( () ) ;
    public final void rule__Reference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2126:1: ( ( () ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2127:1: ( () )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2127:1: ( () )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2128:1: ()
            {
             before(grammarAccess.getReferenceAccess().getReferenceAction_0()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2129:1: ()
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2131:1: 
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2141:1: rule__Reference__Group__1 : rule__Reference__Group__1__Impl rule__Reference__Group__2 ;
    public final void rule__Reference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2145:1: ( rule__Reference__Group__1__Impl rule__Reference__Group__2 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2146:2: rule__Reference__Group__1__Impl rule__Reference__Group__2
            {
            pushFollow(FOLLOW_rule__Reference__Group__1__Impl_in_rule__Reference__Group__14272);
            rule__Reference__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Reference__Group__2_in_rule__Reference__Group__14275);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2153:1: rule__Reference__Group__1__Impl : ( 'var' ) ;
    public final void rule__Reference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2157:1: ( ( 'var' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2158:1: ( 'var' )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2158:1: ( 'var' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2159:1: 'var'
            {
             before(grammarAccess.getReferenceAccess().getVarKeyword_1()); 
            match(input,30,FOLLOW_30_in_rule__Reference__Group__1__Impl4303); 
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2172:1: rule__Reference__Group__2 : rule__Reference__Group__2__Impl rule__Reference__Group__3 ;
    public final void rule__Reference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2176:1: ( rule__Reference__Group__2__Impl rule__Reference__Group__3 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2177:2: rule__Reference__Group__2__Impl rule__Reference__Group__3
            {
            pushFollow(FOLLOW_rule__Reference__Group__2__Impl_in_rule__Reference__Group__24334);
            rule__Reference__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Reference__Group__3_in_rule__Reference__Group__24337);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2184:1: rule__Reference__Group__2__Impl : ( ( rule__Reference__NameAssignment_2 ) ) ;
    public final void rule__Reference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2188:1: ( ( ( rule__Reference__NameAssignment_2 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2189:1: ( ( rule__Reference__NameAssignment_2 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2189:1: ( ( rule__Reference__NameAssignment_2 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2190:1: ( rule__Reference__NameAssignment_2 )
            {
             before(grammarAccess.getReferenceAccess().getNameAssignment_2()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2191:1: ( rule__Reference__NameAssignment_2 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2191:2: rule__Reference__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Reference__NameAssignment_2_in_rule__Reference__Group__2__Impl4364);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2201:1: rule__Reference__Group__3 : rule__Reference__Group__3__Impl rule__Reference__Group__4 ;
    public final void rule__Reference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2205:1: ( rule__Reference__Group__3__Impl rule__Reference__Group__4 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2206:2: rule__Reference__Group__3__Impl rule__Reference__Group__4
            {
            pushFollow(FOLLOW_rule__Reference__Group__3__Impl_in_rule__Reference__Group__34394);
            rule__Reference__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Reference__Group__4_in_rule__Reference__Group__34397);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2213:1: rule__Reference__Group__3__Impl : ( ( rule__Reference__ReferenceAssignment_3 ) ) ;
    public final void rule__Reference__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2217:1: ( ( ( rule__Reference__ReferenceAssignment_3 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2218:1: ( ( rule__Reference__ReferenceAssignment_3 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2218:1: ( ( rule__Reference__ReferenceAssignment_3 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2219:1: ( rule__Reference__ReferenceAssignment_3 )
            {
             before(grammarAccess.getReferenceAccess().getReferenceAssignment_3()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2220:1: ( rule__Reference__ReferenceAssignment_3 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2220:2: rule__Reference__ReferenceAssignment_3
            {
            pushFollow(FOLLOW_rule__Reference__ReferenceAssignment_3_in_rule__Reference__Group__3__Impl4424);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2230:1: rule__Reference__Group__4 : rule__Reference__Group__4__Impl rule__Reference__Group__5 ;
    public final void rule__Reference__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2234:1: ( rule__Reference__Group__4__Impl rule__Reference__Group__5 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2235:2: rule__Reference__Group__4__Impl rule__Reference__Group__5
            {
            pushFollow(FOLLOW_rule__Reference__Group__4__Impl_in_rule__Reference__Group__44454);
            rule__Reference__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Reference__Group__5_in_rule__Reference__Group__44457);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2242:1: rule__Reference__Group__4__Impl : ( ( rule__Reference__ManyAssignment_4 )? ) ;
    public final void rule__Reference__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2246:1: ( ( ( rule__Reference__ManyAssignment_4 )? ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2247:1: ( ( rule__Reference__ManyAssignment_4 )? )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2247:1: ( ( rule__Reference__ManyAssignment_4 )? )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2248:1: ( rule__Reference__ManyAssignment_4 )?
            {
             before(grammarAccess.getReferenceAccess().getManyAssignment_4()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2249:1: ( rule__Reference__ManyAssignment_4 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==33) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2249:2: rule__Reference__ManyAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Reference__ManyAssignment_4_in_rule__Reference__Group__4__Impl4484);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2259:1: rule__Reference__Group__5 : rule__Reference__Group__5__Impl ;
    public final void rule__Reference__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2263:1: ( rule__Reference__Group__5__Impl )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2264:2: rule__Reference__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Reference__Group__5__Impl_in_rule__Reference__Group__54515);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2270:1: rule__Reference__Group__5__Impl : ( ( rule__Reference__Group_5__0 )? ) ;
    public final void rule__Reference__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2274:1: ( ( ( rule__Reference__Group_5__0 )? ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2275:1: ( ( rule__Reference__Group_5__0 )? )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2275:1: ( ( rule__Reference__Group_5__0 )? )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2276:1: ( rule__Reference__Group_5__0 )?
            {
             before(grammarAccess.getReferenceAccess().getGroup_5()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2277:1: ( rule__Reference__Group_5__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==31) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2277:2: rule__Reference__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Reference__Group_5__0_in_rule__Reference__Group__5__Impl4542);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2299:1: rule__Reference__Group_5__0 : rule__Reference__Group_5__0__Impl rule__Reference__Group_5__1 ;
    public final void rule__Reference__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2303:1: ( rule__Reference__Group_5__0__Impl rule__Reference__Group_5__1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2304:2: rule__Reference__Group_5__0__Impl rule__Reference__Group_5__1
            {
            pushFollow(FOLLOW_rule__Reference__Group_5__0__Impl_in_rule__Reference__Group_5__04585);
            rule__Reference__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Reference__Group_5__1_in_rule__Reference__Group_5__04588);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2311:1: rule__Reference__Group_5__0__Impl : ( 'opposite' ) ;
    public final void rule__Reference__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2315:1: ( ( 'opposite' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2316:1: ( 'opposite' )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2316:1: ( 'opposite' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2317:1: 'opposite'
            {
             before(grammarAccess.getReferenceAccess().getOppositeKeyword_5_0()); 
            match(input,31,FOLLOW_31_in_rule__Reference__Group_5__0__Impl4616); 
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2330:1: rule__Reference__Group_5__1 : rule__Reference__Group_5__1__Impl ;
    public final void rule__Reference__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2334:1: ( rule__Reference__Group_5__1__Impl )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2335:2: rule__Reference__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Reference__Group_5__1__Impl_in_rule__Reference__Group_5__14647);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2341:1: rule__Reference__Group_5__1__Impl : ( ( rule__Reference__OppositeAssignment_5_1 ) ) ;
    public final void rule__Reference__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2345:1: ( ( ( rule__Reference__OppositeAssignment_5_1 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2346:1: ( ( rule__Reference__OppositeAssignment_5_1 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2346:1: ( ( rule__Reference__OppositeAssignment_5_1 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2347:1: ( rule__Reference__OppositeAssignment_5_1 )
            {
             before(grammarAccess.getReferenceAccess().getOppositeAssignment_5_1()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2348:1: ( rule__Reference__OppositeAssignment_5_1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2348:2: rule__Reference__OppositeAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Reference__OppositeAssignment_5_1_in_rule__Reference__Group_5__1__Impl4674);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2362:1: rule__DataType__Group__0 : rule__DataType__Group__0__Impl rule__DataType__Group__1 ;
    public final void rule__DataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2366:1: ( rule__DataType__Group__0__Impl rule__DataType__Group__1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2367:2: rule__DataType__Group__0__Impl rule__DataType__Group__1
            {
            pushFollow(FOLLOW_rule__DataType__Group__0__Impl_in_rule__DataType__Group__04708);
            rule__DataType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataType__Group__1_in_rule__DataType__Group__04711);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2374:1: rule__DataType__Group__0__Impl : ( () ) ;
    public final void rule__DataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2378:1: ( ( () ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2379:1: ( () )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2379:1: ( () )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2380:1: ()
            {
             before(grammarAccess.getDataTypeAccess().getDataTypeAction_0()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2381:1: ()
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2383:1: 
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2393:1: rule__DataType__Group__1 : rule__DataType__Group__1__Impl rule__DataType__Group__2 ;
    public final void rule__DataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2397:1: ( rule__DataType__Group__1__Impl rule__DataType__Group__2 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2398:2: rule__DataType__Group__1__Impl rule__DataType__Group__2
            {
            pushFollow(FOLLOW_rule__DataType__Group__1__Impl_in_rule__DataType__Group__14769);
            rule__DataType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataType__Group__2_in_rule__DataType__Group__14772);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2405:1: rule__DataType__Group__1__Impl : ( 'var' ) ;
    public final void rule__DataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2409:1: ( ( 'var' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2410:1: ( 'var' )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2410:1: ( 'var' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2411:1: 'var'
            {
             before(grammarAccess.getDataTypeAccess().getVarKeyword_1()); 
            match(input,30,FOLLOW_30_in_rule__DataType__Group__1__Impl4800); 
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2424:1: rule__DataType__Group__2 : rule__DataType__Group__2__Impl rule__DataType__Group__3 ;
    public final void rule__DataType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2428:1: ( rule__DataType__Group__2__Impl rule__DataType__Group__3 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2429:2: rule__DataType__Group__2__Impl rule__DataType__Group__3
            {
            pushFollow(FOLLOW_rule__DataType__Group__2__Impl_in_rule__DataType__Group__24831);
            rule__DataType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataType__Group__3_in_rule__DataType__Group__24834);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2436:1: rule__DataType__Group__2__Impl : ( ( rule__DataType__NameAssignment_2 ) ) ;
    public final void rule__DataType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2440:1: ( ( ( rule__DataType__NameAssignment_2 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2441:1: ( ( rule__DataType__NameAssignment_2 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2441:1: ( ( rule__DataType__NameAssignment_2 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2442:1: ( rule__DataType__NameAssignment_2 )
            {
             before(grammarAccess.getDataTypeAccess().getNameAssignment_2()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2443:1: ( rule__DataType__NameAssignment_2 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2443:2: rule__DataType__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__DataType__NameAssignment_2_in_rule__DataType__Group__2__Impl4861);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2453:1: rule__DataType__Group__3 : rule__DataType__Group__3__Impl rule__DataType__Group__4 ;
    public final void rule__DataType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2457:1: ( rule__DataType__Group__3__Impl rule__DataType__Group__4 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2458:2: rule__DataType__Group__3__Impl rule__DataType__Group__4
            {
            pushFollow(FOLLOW_rule__DataType__Group__3__Impl_in_rule__DataType__Group__34891);
            rule__DataType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataType__Group__4_in_rule__DataType__Group__34894);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2465:1: rule__DataType__Group__3__Impl : ( ( rule__DataType__TypeAssignment_3 ) ) ;
    public final void rule__DataType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2469:1: ( ( ( rule__DataType__TypeAssignment_3 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2470:1: ( ( rule__DataType__TypeAssignment_3 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2470:1: ( ( rule__DataType__TypeAssignment_3 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2471:1: ( rule__DataType__TypeAssignment_3 )
            {
             before(grammarAccess.getDataTypeAccess().getTypeAssignment_3()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2472:1: ( rule__DataType__TypeAssignment_3 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2472:2: rule__DataType__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__DataType__TypeAssignment_3_in_rule__DataType__Group__3__Impl4921);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2482:1: rule__DataType__Group__4 : rule__DataType__Group__4__Impl ;
    public final void rule__DataType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2486:1: ( rule__DataType__Group__4__Impl )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2487:2: rule__DataType__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__DataType__Group__4__Impl_in_rule__DataType__Group__44951);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2493:1: rule__DataType__Group__4__Impl : ( ( rule__DataType__ManyAssignment_4 )? ) ;
    public final void rule__DataType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2497:1: ( ( ( rule__DataType__ManyAssignment_4 )? ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2498:1: ( ( rule__DataType__ManyAssignment_4 )? )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2498:1: ( ( rule__DataType__ManyAssignment_4 )? )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2499:1: ( rule__DataType__ManyAssignment_4 )?
            {
             before(grammarAccess.getDataTypeAccess().getManyAssignment_4()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2500:1: ( rule__DataType__ManyAssignment_4 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==33) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2500:2: rule__DataType__ManyAssignment_4
                    {
                    pushFollow(FOLLOW_rule__DataType__ManyAssignment_4_in_rule__DataType__Group__4__Impl4978);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2520:1: rule__ParameterReference__Group__0 : rule__ParameterReference__Group__0__Impl rule__ParameterReference__Group__1 ;
    public final void rule__ParameterReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2524:1: ( rule__ParameterReference__Group__0__Impl rule__ParameterReference__Group__1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2525:2: rule__ParameterReference__Group__0__Impl rule__ParameterReference__Group__1
            {
            pushFollow(FOLLOW_rule__ParameterReference__Group__0__Impl_in_rule__ParameterReference__Group__05019);
            rule__ParameterReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParameterReference__Group__1_in_rule__ParameterReference__Group__05022);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2532:1: rule__ParameterReference__Group__0__Impl : ( () ) ;
    public final void rule__ParameterReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2536:1: ( ( () ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2537:1: ( () )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2537:1: ( () )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2538:1: ()
            {
             before(grammarAccess.getParameterReferenceAccess().getParameterReferenceAction_0()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2539:1: ()
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2541:1: 
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2551:1: rule__ParameterReference__Group__1 : rule__ParameterReference__Group__1__Impl rule__ParameterReference__Group__2 ;
    public final void rule__ParameterReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2555:1: ( rule__ParameterReference__Group__1__Impl rule__ParameterReference__Group__2 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2556:2: rule__ParameterReference__Group__1__Impl rule__ParameterReference__Group__2
            {
            pushFollow(FOLLOW_rule__ParameterReference__Group__1__Impl_in_rule__ParameterReference__Group__15080);
            rule__ParameterReference__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParameterReference__Group__2_in_rule__ParameterReference__Group__15083);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2563:1: rule__ParameterReference__Group__1__Impl : ( ( rule__ParameterReference__ReferenceAssignment_1 ) ) ;
    public final void rule__ParameterReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2567:1: ( ( ( rule__ParameterReference__ReferenceAssignment_1 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2568:1: ( ( rule__ParameterReference__ReferenceAssignment_1 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2568:1: ( ( rule__ParameterReference__ReferenceAssignment_1 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2569:1: ( rule__ParameterReference__ReferenceAssignment_1 )
            {
             before(grammarAccess.getParameterReferenceAccess().getReferenceAssignment_1()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2570:1: ( rule__ParameterReference__ReferenceAssignment_1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2570:2: rule__ParameterReference__ReferenceAssignment_1
            {
            pushFollow(FOLLOW_rule__ParameterReference__ReferenceAssignment_1_in_rule__ParameterReference__Group__1__Impl5110);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2580:1: rule__ParameterReference__Group__2 : rule__ParameterReference__Group__2__Impl rule__ParameterReference__Group__3 ;
    public final void rule__ParameterReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2584:1: ( rule__ParameterReference__Group__2__Impl rule__ParameterReference__Group__3 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2585:2: rule__ParameterReference__Group__2__Impl rule__ParameterReference__Group__3
            {
            pushFollow(FOLLOW_rule__ParameterReference__Group__2__Impl_in_rule__ParameterReference__Group__25140);
            rule__ParameterReference__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParameterReference__Group__3_in_rule__ParameterReference__Group__25143);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2592:1: rule__ParameterReference__Group__2__Impl : ( ( rule__ParameterReference__ManyAssignment_2 )? ) ;
    public final void rule__ParameterReference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2596:1: ( ( ( rule__ParameterReference__ManyAssignment_2 )? ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2597:1: ( ( rule__ParameterReference__ManyAssignment_2 )? )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2597:1: ( ( rule__ParameterReference__ManyAssignment_2 )? )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2598:1: ( rule__ParameterReference__ManyAssignment_2 )?
            {
             before(grammarAccess.getParameterReferenceAccess().getManyAssignment_2()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2599:1: ( rule__ParameterReference__ManyAssignment_2 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==33) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2599:2: rule__ParameterReference__ManyAssignment_2
                    {
                    pushFollow(FOLLOW_rule__ParameterReference__ManyAssignment_2_in_rule__ParameterReference__Group__2__Impl5170);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2609:1: rule__ParameterReference__Group__3 : rule__ParameterReference__Group__3__Impl ;
    public final void rule__ParameterReference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2613:1: ( rule__ParameterReference__Group__3__Impl )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2614:2: rule__ParameterReference__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ParameterReference__Group__3__Impl_in_rule__ParameterReference__Group__35201);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2620:1: rule__ParameterReference__Group__3__Impl : ( ( rule__ParameterReference__NameAssignment_3 ) ) ;
    public final void rule__ParameterReference__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2624:1: ( ( ( rule__ParameterReference__NameAssignment_3 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2625:1: ( ( rule__ParameterReference__NameAssignment_3 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2625:1: ( ( rule__ParameterReference__NameAssignment_3 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2626:1: ( rule__ParameterReference__NameAssignment_3 )
            {
             before(grammarAccess.getParameterReferenceAccess().getNameAssignment_3()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2627:1: ( rule__ParameterReference__NameAssignment_3 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2627:2: rule__ParameterReference__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__ParameterReference__NameAssignment_3_in_rule__ParameterReference__Group__3__Impl5228);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2645:1: rule__ParameterDataType__Group__0 : rule__ParameterDataType__Group__0__Impl rule__ParameterDataType__Group__1 ;
    public final void rule__ParameterDataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2649:1: ( rule__ParameterDataType__Group__0__Impl rule__ParameterDataType__Group__1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2650:2: rule__ParameterDataType__Group__0__Impl rule__ParameterDataType__Group__1
            {
            pushFollow(FOLLOW_rule__ParameterDataType__Group__0__Impl_in_rule__ParameterDataType__Group__05266);
            rule__ParameterDataType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParameterDataType__Group__1_in_rule__ParameterDataType__Group__05269);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2657:1: rule__ParameterDataType__Group__0__Impl : ( () ) ;
    public final void rule__ParameterDataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2661:1: ( ( () ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2662:1: ( () )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2662:1: ( () )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2663:1: ()
            {
             before(grammarAccess.getParameterDataTypeAccess().getParameterDataTypeAction_0()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2664:1: ()
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2666:1: 
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2676:1: rule__ParameterDataType__Group__1 : rule__ParameterDataType__Group__1__Impl rule__ParameterDataType__Group__2 ;
    public final void rule__ParameterDataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2680:1: ( rule__ParameterDataType__Group__1__Impl rule__ParameterDataType__Group__2 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2681:2: rule__ParameterDataType__Group__1__Impl rule__ParameterDataType__Group__2
            {
            pushFollow(FOLLOW_rule__ParameterDataType__Group__1__Impl_in_rule__ParameterDataType__Group__15327);
            rule__ParameterDataType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParameterDataType__Group__2_in_rule__ParameterDataType__Group__15330);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2688:1: rule__ParameterDataType__Group__1__Impl : ( ( rule__ParameterDataType__TypeAssignment_1 ) ) ;
    public final void rule__ParameterDataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2692:1: ( ( ( rule__ParameterDataType__TypeAssignment_1 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2693:1: ( ( rule__ParameterDataType__TypeAssignment_1 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2693:1: ( ( rule__ParameterDataType__TypeAssignment_1 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2694:1: ( rule__ParameterDataType__TypeAssignment_1 )
            {
             before(grammarAccess.getParameterDataTypeAccess().getTypeAssignment_1()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2695:1: ( rule__ParameterDataType__TypeAssignment_1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2695:2: rule__ParameterDataType__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__ParameterDataType__TypeAssignment_1_in_rule__ParameterDataType__Group__1__Impl5357);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2705:1: rule__ParameterDataType__Group__2 : rule__ParameterDataType__Group__2__Impl rule__ParameterDataType__Group__3 ;
    public final void rule__ParameterDataType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2709:1: ( rule__ParameterDataType__Group__2__Impl rule__ParameterDataType__Group__3 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2710:2: rule__ParameterDataType__Group__2__Impl rule__ParameterDataType__Group__3
            {
            pushFollow(FOLLOW_rule__ParameterDataType__Group__2__Impl_in_rule__ParameterDataType__Group__25387);
            rule__ParameterDataType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParameterDataType__Group__3_in_rule__ParameterDataType__Group__25390);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2717:1: rule__ParameterDataType__Group__2__Impl : ( ( rule__ParameterDataType__ManyAssignment_2 )? ) ;
    public final void rule__ParameterDataType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2721:1: ( ( ( rule__ParameterDataType__ManyAssignment_2 )? ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2722:1: ( ( rule__ParameterDataType__ManyAssignment_2 )? )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2722:1: ( ( rule__ParameterDataType__ManyAssignment_2 )? )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2723:1: ( rule__ParameterDataType__ManyAssignment_2 )?
            {
             before(grammarAccess.getParameterDataTypeAccess().getManyAssignment_2()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2724:1: ( rule__ParameterDataType__ManyAssignment_2 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==33) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2724:2: rule__ParameterDataType__ManyAssignment_2
                    {
                    pushFollow(FOLLOW_rule__ParameterDataType__ManyAssignment_2_in_rule__ParameterDataType__Group__2__Impl5417);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2734:1: rule__ParameterDataType__Group__3 : rule__ParameterDataType__Group__3__Impl ;
    public final void rule__ParameterDataType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2738:1: ( rule__ParameterDataType__Group__3__Impl )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2739:2: rule__ParameterDataType__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ParameterDataType__Group__3__Impl_in_rule__ParameterDataType__Group__35448);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2745:1: rule__ParameterDataType__Group__3__Impl : ( ( rule__ParameterDataType__NameAssignment_3 ) ) ;
    public final void rule__ParameterDataType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2749:1: ( ( ( rule__ParameterDataType__NameAssignment_3 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2750:1: ( ( rule__ParameterDataType__NameAssignment_3 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2750:1: ( ( rule__ParameterDataType__NameAssignment_3 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2751:1: ( rule__ParameterDataType__NameAssignment_3 )
            {
             before(grammarAccess.getParameterDataTypeAccess().getNameAssignment_3()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2752:1: ( rule__ParameterDataType__NameAssignment_3 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2752:2: rule__ParameterDataType__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__ParameterDataType__NameAssignment_3_in_rule__ParameterDataType__Group__3__Impl5475);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2770:1: rule__QUALIFIED_NAME__Group__0 : rule__QUALIFIED_NAME__Group__0__Impl rule__QUALIFIED_NAME__Group__1 ;
    public final void rule__QUALIFIED_NAME__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2774:1: ( rule__QUALIFIED_NAME__Group__0__Impl rule__QUALIFIED_NAME__Group__1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2775:2: rule__QUALIFIED_NAME__Group__0__Impl rule__QUALIFIED_NAME__Group__1
            {
            pushFollow(FOLLOW_rule__QUALIFIED_NAME__Group__0__Impl_in_rule__QUALIFIED_NAME__Group__05513);
            rule__QUALIFIED_NAME__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QUALIFIED_NAME__Group__1_in_rule__QUALIFIED_NAME__Group__05516);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2782:1: rule__QUALIFIED_NAME__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QUALIFIED_NAME__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2786:1: ( ( RULE_ID ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2787:1: ( RULE_ID )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2787:1: ( RULE_ID )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2788:1: RULE_ID
            {
             before(grammarAccess.getQUALIFIED_NAMEAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QUALIFIED_NAME__Group__0__Impl5543); 
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2799:1: rule__QUALIFIED_NAME__Group__1 : rule__QUALIFIED_NAME__Group__1__Impl ;
    public final void rule__QUALIFIED_NAME__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2803:1: ( rule__QUALIFIED_NAME__Group__1__Impl )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2804:2: rule__QUALIFIED_NAME__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QUALIFIED_NAME__Group__1__Impl_in_rule__QUALIFIED_NAME__Group__15572);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2810:1: rule__QUALIFIED_NAME__Group__1__Impl : ( ( rule__QUALIFIED_NAME__Group_1__0 )* ) ;
    public final void rule__QUALIFIED_NAME__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2814:1: ( ( ( rule__QUALIFIED_NAME__Group_1__0 )* ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2815:1: ( ( rule__QUALIFIED_NAME__Group_1__0 )* )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2815:1: ( ( rule__QUALIFIED_NAME__Group_1__0 )* )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2816:1: ( rule__QUALIFIED_NAME__Group_1__0 )*
            {
             before(grammarAccess.getQUALIFIED_NAMEAccess().getGroup_1()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2817:1: ( rule__QUALIFIED_NAME__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==32) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2817:2: rule__QUALIFIED_NAME__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QUALIFIED_NAME__Group_1__0_in_rule__QUALIFIED_NAME__Group__1__Impl5599);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2831:1: rule__QUALIFIED_NAME__Group_1__0 : rule__QUALIFIED_NAME__Group_1__0__Impl rule__QUALIFIED_NAME__Group_1__1 ;
    public final void rule__QUALIFIED_NAME__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2835:1: ( rule__QUALIFIED_NAME__Group_1__0__Impl rule__QUALIFIED_NAME__Group_1__1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2836:2: rule__QUALIFIED_NAME__Group_1__0__Impl rule__QUALIFIED_NAME__Group_1__1
            {
            pushFollow(FOLLOW_rule__QUALIFIED_NAME__Group_1__0__Impl_in_rule__QUALIFIED_NAME__Group_1__05634);
            rule__QUALIFIED_NAME__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QUALIFIED_NAME__Group_1__1_in_rule__QUALIFIED_NAME__Group_1__05637);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2843:1: rule__QUALIFIED_NAME__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QUALIFIED_NAME__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2847:1: ( ( '.' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2848:1: ( '.' )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2848:1: ( '.' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2849:1: '.'
            {
             before(grammarAccess.getQUALIFIED_NAMEAccess().getFullStopKeyword_1_0()); 
            match(input,32,FOLLOW_32_in_rule__QUALIFIED_NAME__Group_1__0__Impl5665); 
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2862:1: rule__QUALIFIED_NAME__Group_1__1 : rule__QUALIFIED_NAME__Group_1__1__Impl ;
    public final void rule__QUALIFIED_NAME__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2866:1: ( rule__QUALIFIED_NAME__Group_1__1__Impl )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2867:2: rule__QUALIFIED_NAME__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QUALIFIED_NAME__Group_1__1__Impl_in_rule__QUALIFIED_NAME__Group_1__15696);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2873:1: rule__QUALIFIED_NAME__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QUALIFIED_NAME__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2877:1: ( ( RULE_ID ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2878:1: ( RULE_ID )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2878:1: ( RULE_ID )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2879:1: RULE_ID
            {
             before(grammarAccess.getQUALIFIED_NAMEAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QUALIFIED_NAME__Group_1__1__Impl5723); 
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2895:1: rule__Module__NameAssignment_2 : ( ruleQUALIFIED_NAME ) ;
    public final void rule__Module__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2899:1: ( ( ruleQUALIFIED_NAME ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2900:1: ( ruleQUALIFIED_NAME )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2900:1: ( ruleQUALIFIED_NAME )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2901:1: ruleQUALIFIED_NAME
            {
             before(grammarAccess.getModuleAccess().getNameQUALIFIED_NAMEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleQUALIFIED_NAME_in_rule__Module__NameAssignment_25761);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2910:1: rule__Module__TypeAssignment_3 : ( ruleInternalDSLType ) ;
    public final void rule__Module__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2914:1: ( ( ruleInternalDSLType ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2915:1: ( ruleInternalDSLType )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2915:1: ( ruleInternalDSLType )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2916:1: ruleInternalDSLType
            {
             before(grammarAccess.getModuleAccess().getTypeInternalDSLTypeEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleInternalDSLType_in_rule__Module__TypeAssignment_35792);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2925:1: rule__Module__PackagesAssignment_4_0 : ( rulePackage ) ;
    public final void rule__Module__PackagesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2929:1: ( ( rulePackage ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2930:1: ( rulePackage )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2930:1: ( rulePackage )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2931:1: rulePackage
            {
             before(grammarAccess.getModuleAccess().getPackagesPackageParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_rulePackage_in_rule__Module__PackagesAssignment_4_05823);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2940:1: rule__Module__PackagesAssignment_4_1 : ( rulePackage ) ;
    public final void rule__Module__PackagesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2944:1: ( ( rulePackage ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2945:1: ( rulePackage )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2945:1: ( rulePackage )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2946:1: rulePackage
            {
             before(grammarAccess.getModuleAccess().getPackagesPackageParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_rulePackage_in_rule__Module__PackagesAssignment_4_15854);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2955:1: rule__Package__NameAssignment_2 : ( ruleQUALIFIED_NAME ) ;
    public final void rule__Package__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2959:1: ( ( ruleQUALIFIED_NAME ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2960:1: ( ruleQUALIFIED_NAME )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2960:1: ( ruleQUALIFIED_NAME )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2961:1: ruleQUALIFIED_NAME
            {
             before(grammarAccess.getPackageAccess().getNameQUALIFIED_NAMEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleQUALIFIED_NAME_in_rule__Package__NameAssignment_25885);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2970:1: rule__Package__EntitiesAssignment_4_0 : ( ruleEntity ) ;
    public final void rule__Package__EntitiesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2974:1: ( ( ruleEntity ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2975:1: ( ruleEntity )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2975:1: ( ruleEntity )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2976:1: ruleEntity
            {
             before(grammarAccess.getPackageAccess().getEntitiesEntityParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_ruleEntity_in_rule__Package__EntitiesAssignment_4_05916);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2985:1: rule__Package__EntitiesAssignment_4_1 : ( ruleEntity ) ;
    public final void rule__Package__EntitiesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2989:1: ( ( ruleEntity ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2990:1: ( ruleEntity )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2990:1: ( ruleEntity )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2991:1: ruleEntity
            {
             before(grammarAccess.getPackageAccess().getEntitiesEntityParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleEntity_in_rule__Package__EntitiesAssignment_4_15947);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3000:1: rule__Package__EntityBuildersAssignment_5_0 : ( ruleEntityBuilder ) ;
    public final void rule__Package__EntityBuildersAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3004:1: ( ( ruleEntityBuilder ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3005:1: ( ruleEntityBuilder )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3005:1: ( ruleEntityBuilder )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3006:1: ruleEntityBuilder
            {
             before(grammarAccess.getPackageAccess().getEntityBuildersEntityBuilderParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_ruleEntityBuilder_in_rule__Package__EntityBuildersAssignment_5_05978);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3015:1: rule__Package__EntityBuildersAssignment_5_1 : ( ruleEntityBuilder ) ;
    public final void rule__Package__EntityBuildersAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3019:1: ( ( ruleEntityBuilder ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3020:1: ( ruleEntityBuilder )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3020:1: ( ruleEntityBuilder )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3021:1: ruleEntityBuilder
            {
             before(grammarAccess.getPackageAccess().getEntityBuildersEntityBuilderParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleEntityBuilder_in_rule__Package__EntityBuildersAssignment_5_16009);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3030:1: rule__Entity__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3034:1: ( ( RULE_ID ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3035:1: ( RULE_ID )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3035:1: ( RULE_ID )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3036:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_26040); 
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3045:1: rule__Entity__SuperEntityAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__SuperEntityAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3049:1: ( ( ( RULE_ID ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3050:1: ( ( RULE_ID ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3050:1: ( ( RULE_ID ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3051:1: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getSuperEntityEntityCrossReference_3_1_0()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3052:1: ( RULE_ID )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3053:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getSuperEntityEntityIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__SuperEntityAssignment_3_16075); 
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3064:1: rule__Entity__FeaturesAssignment_5_0 : ( ruleFeature ) ;
    public final void rule__Entity__FeaturesAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3068:1: ( ( ruleFeature ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3069:1: ( ruleFeature )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3069:1: ( ruleFeature )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3070:1: ruleFeature
            {
             before(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_ruleFeature_in_rule__Entity__FeaturesAssignment_5_06110);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3079:1: rule__Entity__FeaturesAssignment_5_1 : ( ruleFeature ) ;
    public final void rule__Entity__FeaturesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3083:1: ( ( ruleFeature ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3084:1: ( ruleFeature )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3084:1: ( ruleFeature )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3085:1: ruleFeature
            {
             before(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleFeature_in_rule__Entity__FeaturesAssignment_5_16141);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3094:1: rule__EntityBuilder__NameAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__EntityBuilder__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3098:1: ( ( ( RULE_ID ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3099:1: ( ( RULE_ID ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3099:1: ( ( RULE_ID ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3100:1: ( RULE_ID )
            {
             before(grammarAccess.getEntityBuilderAccess().getNameEntityCrossReference_2_0()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3101:1: ( RULE_ID )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3102:1: RULE_ID
            {
             before(grammarAccess.getEntityBuilderAccess().getNameEntityIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EntityBuilder__NameAssignment_26176); 
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3113:1: rule__EntityBuilder__TakesAssignment_4 : ( ruletakes ) ;
    public final void rule__EntityBuilder__TakesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3117:1: ( ( ruletakes ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3118:1: ( ruletakes )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3118:1: ( ruletakes )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3119:1: ruletakes
            {
             before(grammarAccess.getEntityBuilderAccess().getTakesTakesParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruletakes_in_rule__EntityBuilder__TakesAssignment_46211);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3129:1: rule__Takes__TakesAssignment_1 : ( ruleParameterFeature ) ;
    public final void rule__Takes__TakesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3133:1: ( ( ruleParameterFeature ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3134:1: ( ruleParameterFeature )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3134:1: ( ruleParameterFeature )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3135:1: ruleParameterFeature
            {
             before(grammarAccess.getTakesAccess().getTakesParameterFeatureParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleParameterFeature_in_rule__Takes__TakesAssignment_16243);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3144:1: rule__Takes__TakesAssignment_2_1 : ( ruleParameterFeature ) ;
    public final void rule__Takes__TakesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3148:1: ( ( ruleParameterFeature ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3149:1: ( ruleParameterFeature )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3149:1: ( ruleParameterFeature )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3150:1: ruleParameterFeature
            {
             before(grammarAccess.getTakesAccess().getTakesParameterFeatureParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleParameterFeature_in_rule__Takes__TakesAssignment_2_16274);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3159:1: rule__Takes__AddsAssignment_3 : ( ruleadds ) ;
    public final void rule__Takes__AddsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3163:1: ( ( ruleadds ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3164:1: ( ruleadds )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3164:1: ( ruleadds )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3165:1: ruleadds
            {
             before(grammarAccess.getTakesAccess().getAddsAddsParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleadds_in_rule__Takes__AddsAssignment_36305);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3174:1: rule__Adds__AddsAssignment_2_0 : ( ( ruleQUALIFIED_NAME ) ) ;
    public final void rule__Adds__AddsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3178:1: ( ( ( ruleQUALIFIED_NAME ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3179:1: ( ( ruleQUALIFIED_NAME ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3179:1: ( ( ruleQUALIFIED_NAME ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3180:1: ( ruleQUALIFIED_NAME )
            {
             before(grammarAccess.getAddsAccess().getAddsFeatureCrossReference_2_0_0()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3181:1: ( ruleQUALIFIED_NAME )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3182:1: ruleQUALIFIED_NAME
            {
             before(grammarAccess.getAddsAccess().getAddsFeatureQUALIFIED_NAMEParserRuleCall_2_0_0_1()); 
            pushFollow(FOLLOW_ruleQUALIFIED_NAME_in_rule__Adds__AddsAssignment_2_06340);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3193:1: rule__Adds__AddsAssignment_2_1_1 : ( ( ruleQUALIFIED_NAME ) ) ;
    public final void rule__Adds__AddsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3197:1: ( ( ( ruleQUALIFIED_NAME ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3198:1: ( ( ruleQUALIFIED_NAME ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3198:1: ( ( ruleQUALIFIED_NAME ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3199:1: ( ruleQUALIFIED_NAME )
            {
             before(grammarAccess.getAddsAccess().getAddsFeatureCrossReference_2_1_1_0()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3200:1: ( ruleQUALIFIED_NAME )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3201:1: ruleQUALIFIED_NAME
            {
             before(grammarAccess.getAddsAccess().getAddsFeatureQUALIFIED_NAMEParserRuleCall_2_1_1_0_1()); 
            pushFollow(FOLLOW_ruleQUALIFIED_NAME_in_rule__Adds__AddsAssignment_2_1_16379);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3212:1: rule__Reference__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Reference__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3216:1: ( ( RULE_ID ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3217:1: ( RULE_ID )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3217:1: ( RULE_ID )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3218:1: RULE_ID
            {
             before(grammarAccess.getReferenceAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Reference__NameAssignment_26414); 
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3227:1: rule__Reference__ReferenceAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Reference__ReferenceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3231:1: ( ( ( RULE_ID ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3232:1: ( ( RULE_ID ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3232:1: ( ( RULE_ID ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3233:1: ( RULE_ID )
            {
             before(grammarAccess.getReferenceAccess().getReferenceEntityCrossReference_3_0()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3234:1: ( RULE_ID )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3235:1: RULE_ID
            {
             before(grammarAccess.getReferenceAccess().getReferenceEntityIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Reference__ReferenceAssignment_36449); 
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3246:1: rule__Reference__ManyAssignment_4 : ( ( '[]' ) ) ;
    public final void rule__Reference__ManyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3250:1: ( ( ( '[]' ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3251:1: ( ( '[]' ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3251:1: ( ( '[]' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3252:1: ( '[]' )
            {
             before(grammarAccess.getReferenceAccess().getManyLeftSquareBracketRightSquareBracketKeyword_4_0()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3253:1: ( '[]' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3254:1: '[]'
            {
             before(grammarAccess.getReferenceAccess().getManyLeftSquareBracketRightSquareBracketKeyword_4_0()); 
            match(input,33,FOLLOW_33_in_rule__Reference__ManyAssignment_46489); 
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3269:1: rule__Reference__OppositeAssignment_5_1 : ( ( ruleQUALIFIED_NAME ) ) ;
    public final void rule__Reference__OppositeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3273:1: ( ( ( ruleQUALIFIED_NAME ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3274:1: ( ( ruleQUALIFIED_NAME ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3274:1: ( ( ruleQUALIFIED_NAME ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3275:1: ( ruleQUALIFIED_NAME )
            {
             before(grammarAccess.getReferenceAccess().getOppositeReferenceCrossReference_5_1_0()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3276:1: ( ruleQUALIFIED_NAME )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3277:1: ruleQUALIFIED_NAME
            {
             before(grammarAccess.getReferenceAccess().getOppositeReferenceQUALIFIED_NAMEParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_ruleQUALIFIED_NAME_in_rule__Reference__OppositeAssignment_5_16532);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3288:1: rule__DataType__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DataType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3292:1: ( ( RULE_ID ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3293:1: ( RULE_ID )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3293:1: ( RULE_ID )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3294:1: RULE_ID
            {
             before(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DataType__NameAssignment_26567); 
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3303:1: rule__DataType__TypeAssignment_3 : ( ruleDataTypes ) ;
    public final void rule__DataType__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3307:1: ( ( ruleDataTypes ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3308:1: ( ruleDataTypes )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3308:1: ( ruleDataTypes )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3309:1: ruleDataTypes
            {
             before(grammarAccess.getDataTypeAccess().getTypeDataTypesEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleDataTypes_in_rule__DataType__TypeAssignment_36598);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3318:1: rule__DataType__ManyAssignment_4 : ( ( '[]' ) ) ;
    public final void rule__DataType__ManyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3322:1: ( ( ( '[]' ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3323:1: ( ( '[]' ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3323:1: ( ( '[]' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3324:1: ( '[]' )
            {
             before(grammarAccess.getDataTypeAccess().getManyLeftSquareBracketRightSquareBracketKeyword_4_0()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3325:1: ( '[]' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3326:1: '[]'
            {
             before(grammarAccess.getDataTypeAccess().getManyLeftSquareBracketRightSquareBracketKeyword_4_0()); 
            match(input,33,FOLLOW_33_in_rule__DataType__ManyAssignment_46634); 
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3341:1: rule__ParameterReference__ReferenceAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ParameterReference__ReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3345:1: ( ( ( RULE_ID ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3346:1: ( ( RULE_ID ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3346:1: ( ( RULE_ID ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3347:1: ( RULE_ID )
            {
             before(grammarAccess.getParameterReferenceAccess().getReferenceEntityCrossReference_1_0()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3348:1: ( RULE_ID )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3349:1: RULE_ID
            {
             before(grammarAccess.getParameterReferenceAccess().getReferenceEntityIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ParameterReference__ReferenceAssignment_16677); 
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3360:1: rule__ParameterReference__ManyAssignment_2 : ( ( '[]' ) ) ;
    public final void rule__ParameterReference__ManyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3364:1: ( ( ( '[]' ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3365:1: ( ( '[]' ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3365:1: ( ( '[]' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3366:1: ( '[]' )
            {
             before(grammarAccess.getParameterReferenceAccess().getManyLeftSquareBracketRightSquareBracketKeyword_2_0()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3367:1: ( '[]' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3368:1: '[]'
            {
             before(grammarAccess.getParameterReferenceAccess().getManyLeftSquareBracketRightSquareBracketKeyword_2_0()); 
            match(input,33,FOLLOW_33_in_rule__ParameterReference__ManyAssignment_26717); 
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3383:1: rule__ParameterReference__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__ParameterReference__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3387:1: ( ( RULE_ID ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3388:1: ( RULE_ID )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3388:1: ( RULE_ID )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3389:1: RULE_ID
            {
             before(grammarAccess.getParameterReferenceAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ParameterReference__NameAssignment_36756); 
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3398:1: rule__ParameterDataType__TypeAssignment_1 : ( ruleDataTypes ) ;
    public final void rule__ParameterDataType__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3402:1: ( ( ruleDataTypes ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3403:1: ( ruleDataTypes )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3403:1: ( ruleDataTypes )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3404:1: ruleDataTypes
            {
             before(grammarAccess.getParameterDataTypeAccess().getTypeDataTypesEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleDataTypes_in_rule__ParameterDataType__TypeAssignment_16787);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3413:1: rule__ParameterDataType__ManyAssignment_2 : ( ( '[]' ) ) ;
    public final void rule__ParameterDataType__ManyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3417:1: ( ( ( '[]' ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3418:1: ( ( '[]' ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3418:1: ( ( '[]' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3419:1: ( '[]' )
            {
             before(grammarAccess.getParameterDataTypeAccess().getManyLeftSquareBracketRightSquareBracketKeyword_2_0()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3420:1: ( '[]' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3421:1: '[]'
            {
             before(grammarAccess.getParameterDataTypeAccess().getManyLeftSquareBracketRightSquareBracketKeyword_2_0()); 
            match(input,33,FOLLOW_33_in_rule__ParameterDataType__ManyAssignment_26823); 
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3436:1: rule__ParameterDataType__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__ParameterDataType__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3440:1: ( ( RULE_ID ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3441:1: ( RULE_ID )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3441:1: ( RULE_ID )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:3442:1: RULE_ID
            {
             before(grammarAccess.getParameterDataTypeAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ParameterDataType__NameAssignment_36862); 
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
    public static final BitSet FOLLOW_17_in_rule__DataTypes__Alternatives1131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__0__Impl_in_rule__Module__Group__01164 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Module__Group__1_in_rule__Module__Group__01167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__1__Impl_in_rule__Module__Group__11225 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Module__Group__2_in_rule__Module__Group__11228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Module__Group__1__Impl1256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__2__Impl_in_rule__Module__Group__21287 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Module__Group__3_in_rule__Module__Group__21290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__NameAssignment_2_in_rule__Module__Group__2__Impl1317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__3__Impl_in_rule__Module__Group__31347 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Module__Group__4_in_rule__Module__Group__31350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__TypeAssignment_3_in_rule__Module__Group__3__Impl1377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__4__Impl_in_rule__Module__Group__41407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_4__0_in_rule__Module__Group__4__Impl1434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_4__0__Impl_in_rule__Module__Group_4__01475 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Module__Group_4__1_in_rule__Module__Group_4__01478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__PackagesAssignment_4_0_in_rule__Module__Group_4__0__Impl1505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_4__1__Impl_in_rule__Module__Group_4__11535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__PackagesAssignment_4_1_in_rule__Module__Group_4__1__Impl1562 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__01597 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Package__Group__1_in_rule__Package__Group__01600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__11658 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Package__Group__2_in_rule__Package__Group__11661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Package__Group__1__Impl1689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__21720 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Package__Group__3_in_rule__Package__Group__21723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__NameAssignment_2_in_rule__Package__Group__2__Impl1750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__3__Impl_in_rule__Package__Group__31780 = new BitSet(new long[]{0x0000000001600000L});
    public static final BitSet FOLLOW_rule__Package__Group__4_in_rule__Package__Group__31783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Package__Group__3__Impl1811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__4__Impl_in_rule__Package__Group__41842 = new BitSet(new long[]{0x0000000001600000L});
    public static final BitSet FOLLOW_rule__Package__Group__5_in_rule__Package__Group__41845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group_4__0_in_rule__Package__Group__4__Impl1872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__5__Impl_in_rule__Package__Group__51903 = new BitSet(new long[]{0x0000000001600000L});
    public static final BitSet FOLLOW_rule__Package__Group__6_in_rule__Package__Group__51906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group_5__0_in_rule__Package__Group__5__Impl1933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__6__Impl_in_rule__Package__Group__61964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Package__Group__6__Impl1992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group_4__0__Impl_in_rule__Package__Group_4__02037 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Package__Group_4__1_in_rule__Package__Group_4__02040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__EntitiesAssignment_4_0_in_rule__Package__Group_4__0__Impl2067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group_4__1__Impl_in_rule__Package__Group_4__12097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__EntitiesAssignment_4_1_in_rule__Package__Group_4__1__Impl2124 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__Package__Group_5__0__Impl_in_rule__Package__Group_5__02159 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Package__Group_5__1_in_rule__Package__Group_5__02162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__EntityBuildersAssignment_5_0_in_rule__Package__Group_5__0__Impl2189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group_5__1__Impl_in_rule__Package__Group_5__12219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__EntityBuildersAssignment_5_1_in_rule__Package__Group_5__1__Impl2246 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__02281 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__02284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__12342 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__12345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Entity__Group__1__Impl2373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__22404 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__22407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__NameAssignment_2_in_rule__Entity__Group__2__Impl2434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__32464 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__32467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__0_in_rule__Entity__Group__3__Impl2494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__42525 = new BitSet(new long[]{0x0000000040200000L});
    public static final BitSet FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__42528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Entity__Group__4__Impl2556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__52587 = new BitSet(new long[]{0x0000000040200000L});
    public static final BitSet FOLLOW_rule__Entity__Group__6_in_rule__Entity__Group__52590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_5__0_in_rule__Entity__Group__5__Impl2617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__6__Impl_in_rule__Entity__Group__62648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Entity__Group__6__Impl2676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__0__Impl_in_rule__Entity__Group_3__02721 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__1_in_rule__Entity__Group_3__02724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Entity__Group_3__0__Impl2752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__1__Impl_in_rule__Entity__Group_3__12783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__SuperEntityAssignment_3_1_in_rule__Entity__Group_3__1__Impl2810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_5__0__Impl_in_rule__Entity__Group_5__02844 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Entity__Group_5__1_in_rule__Entity__Group_5__02847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__FeaturesAssignment_5_0_in_rule__Entity__Group_5__0__Impl2874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_5__1__Impl_in_rule__Entity__Group_5__12904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__FeaturesAssignment_5_1_in_rule__Entity__Group_5__1__Impl2931 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__EntityBuilder__Group__0__Impl_in_rule__EntityBuilder__Group__02966 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__EntityBuilder__Group__1_in_rule__EntityBuilder__Group__02969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityBuilder__Group__1__Impl_in_rule__EntityBuilder__Group__13027 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EntityBuilder__Group__2_in_rule__EntityBuilder__Group__13030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__EntityBuilder__Group__1__Impl3058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityBuilder__Group__2__Impl_in_rule__EntityBuilder__Group__23089 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__EntityBuilder__Group__3_in_rule__EntityBuilder__Group__23092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityBuilder__NameAssignment_2_in_rule__EntityBuilder__Group__2__Impl3119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityBuilder__Group__3__Impl_in_rule__EntityBuilder__Group__33149 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_rule__EntityBuilder__Group__4_in_rule__EntityBuilder__Group__33152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__EntityBuilder__Group__3__Impl3180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityBuilder__Group__4__Impl_in_rule__EntityBuilder__Group__43211 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_rule__EntityBuilder__Group__5_in_rule__EntityBuilder__Group__43214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityBuilder__TakesAssignment_4_in_rule__EntityBuilder__Group__4__Impl3241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityBuilder__Group__5__Impl_in_rule__EntityBuilder__Group__53272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__EntityBuilder__Group__5__Impl3300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Takes__Group__0__Impl_in_rule__Takes__Group__03343 = new BitSet(new long[]{0x000000000003F010L});
    public static final BitSet FOLLOW_rule__Takes__Group__1_in_rule__Takes__Group__03346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Takes__Group__0__Impl3374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Takes__Group__1__Impl_in_rule__Takes__Group__13405 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_rule__Takes__Group__2_in_rule__Takes__Group__13408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Takes__TakesAssignment_1_in_rule__Takes__Group__1__Impl3435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Takes__Group__2__Impl_in_rule__Takes__Group__23465 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_rule__Takes__Group__3_in_rule__Takes__Group__23468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Takes__Group_2__0_in_rule__Takes__Group__2__Impl3495 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Takes__Group__3__Impl_in_rule__Takes__Group__33526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Takes__AddsAssignment_3_in_rule__Takes__Group__3__Impl3553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Takes__Group_2__0__Impl_in_rule__Takes__Group_2__03592 = new BitSet(new long[]{0x000000000003F010L});
    public static final BitSet FOLLOW_rule__Takes__Group_2__1_in_rule__Takes__Group_2__03595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Takes__Group_2__0__Impl3623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Takes__Group_2__1__Impl_in_rule__Takes__Group_2__13654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Takes__TakesAssignment_2_1_in_rule__Takes__Group_2__1__Impl3681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Adds__Group__0__Impl_in_rule__Adds__Group__03715 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Adds__Group__1_in_rule__Adds__Group__03718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Adds__Group__0__Impl3746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Adds__Group__1__Impl_in_rule__Adds__Group__13777 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Adds__Group__2_in_rule__Adds__Group__13780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Adds__Group__1__Impl3808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Adds__Group__2__Impl_in_rule__Adds__Group__23839 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Adds__Group__3_in_rule__Adds__Group__23842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Adds__Group_2__0_in_rule__Adds__Group__2__Impl3869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Adds__Group__3__Impl_in_rule__Adds__Group__33899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Adds__Group__3__Impl3927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Adds__Group_2__0__Impl_in_rule__Adds__Group_2__03966 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Adds__Group_2__1_in_rule__Adds__Group_2__03969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Adds__AddsAssignment_2_0_in_rule__Adds__Group_2__0__Impl3996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Adds__Group_2__1__Impl_in_rule__Adds__Group_2__14026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Adds__Group_2_1__0_in_rule__Adds__Group_2__1__Impl4053 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Adds__Group_2_1__0__Impl_in_rule__Adds__Group_2_1__04088 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Adds__Group_2_1__1_in_rule__Adds__Group_2_1__04091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Adds__Group_2_1__0__Impl4119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Adds__Group_2_1__1__Impl_in_rule__Adds__Group_2_1__14150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Adds__AddsAssignment_2_1_1_in_rule__Adds__Group_2_1__1__Impl4177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__0__Impl_in_rule__Reference__Group__04211 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Reference__Group__1_in_rule__Reference__Group__04214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__1__Impl_in_rule__Reference__Group__14272 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Reference__Group__2_in_rule__Reference__Group__14275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Reference__Group__1__Impl4303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__2__Impl_in_rule__Reference__Group__24334 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Reference__Group__3_in_rule__Reference__Group__24337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__NameAssignment_2_in_rule__Reference__Group__2__Impl4364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__3__Impl_in_rule__Reference__Group__34394 = new BitSet(new long[]{0x0000000280000000L});
    public static final BitSet FOLLOW_rule__Reference__Group__4_in_rule__Reference__Group__34397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__ReferenceAssignment_3_in_rule__Reference__Group__3__Impl4424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__4__Impl_in_rule__Reference__Group__44454 = new BitSet(new long[]{0x0000000280000000L});
    public static final BitSet FOLLOW_rule__Reference__Group__5_in_rule__Reference__Group__44457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__ManyAssignment_4_in_rule__Reference__Group__4__Impl4484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__5__Impl_in_rule__Reference__Group__54515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group_5__0_in_rule__Reference__Group__5__Impl4542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group_5__0__Impl_in_rule__Reference__Group_5__04585 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Reference__Group_5__1_in_rule__Reference__Group_5__04588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Reference__Group_5__0__Impl4616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group_5__1__Impl_in_rule__Reference__Group_5__14647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__OppositeAssignment_5_1_in_rule__Reference__Group_5__1__Impl4674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group__0__Impl_in_rule__DataType__Group__04708 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__DataType__Group__1_in_rule__DataType__Group__04711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group__1__Impl_in_rule__DataType__Group__14769 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DataType__Group__2_in_rule__DataType__Group__14772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__DataType__Group__1__Impl4800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group__2__Impl_in_rule__DataType__Group__24831 = new BitSet(new long[]{0x000000000003F010L});
    public static final BitSet FOLLOW_rule__DataType__Group__3_in_rule__DataType__Group__24834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__NameAssignment_2_in_rule__DataType__Group__2__Impl4861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group__3__Impl_in_rule__DataType__Group__34891 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__DataType__Group__4_in_rule__DataType__Group__34894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__TypeAssignment_3_in_rule__DataType__Group__3__Impl4921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group__4__Impl_in_rule__DataType__Group__44951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__ManyAssignment_4_in_rule__DataType__Group__4__Impl4978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterReference__Group__0__Impl_in_rule__ParameterReference__Group__05019 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ParameterReference__Group__1_in_rule__ParameterReference__Group__05022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterReference__Group__1__Impl_in_rule__ParameterReference__Group__15080 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_rule__ParameterReference__Group__2_in_rule__ParameterReference__Group__15083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterReference__ReferenceAssignment_1_in_rule__ParameterReference__Group__1__Impl5110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterReference__Group__2__Impl_in_rule__ParameterReference__Group__25140 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_rule__ParameterReference__Group__3_in_rule__ParameterReference__Group__25143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterReference__ManyAssignment_2_in_rule__ParameterReference__Group__2__Impl5170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterReference__Group__3__Impl_in_rule__ParameterReference__Group__35201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterReference__NameAssignment_3_in_rule__ParameterReference__Group__3__Impl5228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDataType__Group__0__Impl_in_rule__ParameterDataType__Group__05266 = new BitSet(new long[]{0x000000000003F010L});
    public static final BitSet FOLLOW_rule__ParameterDataType__Group__1_in_rule__ParameterDataType__Group__05269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDataType__Group__1__Impl_in_rule__ParameterDataType__Group__15327 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_rule__ParameterDataType__Group__2_in_rule__ParameterDataType__Group__15330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDataType__TypeAssignment_1_in_rule__ParameterDataType__Group__1__Impl5357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDataType__Group__2__Impl_in_rule__ParameterDataType__Group__25387 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_rule__ParameterDataType__Group__3_in_rule__ParameterDataType__Group__25390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDataType__ManyAssignment_2_in_rule__ParameterDataType__Group__2__Impl5417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDataType__Group__3__Impl_in_rule__ParameterDataType__Group__35448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDataType__NameAssignment_3_in_rule__ParameterDataType__Group__3__Impl5475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QUALIFIED_NAME__Group__0__Impl_in_rule__QUALIFIED_NAME__Group__05513 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__QUALIFIED_NAME__Group__1_in_rule__QUALIFIED_NAME__Group__05516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QUALIFIED_NAME__Group__0__Impl5543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QUALIFIED_NAME__Group__1__Impl_in_rule__QUALIFIED_NAME__Group__15572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QUALIFIED_NAME__Group_1__0_in_rule__QUALIFIED_NAME__Group__1__Impl5599 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__QUALIFIED_NAME__Group_1__0__Impl_in_rule__QUALIFIED_NAME__Group_1__05634 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QUALIFIED_NAME__Group_1__1_in_rule__QUALIFIED_NAME__Group_1__05637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__QUALIFIED_NAME__Group_1__0__Impl5665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QUALIFIED_NAME__Group_1__1__Impl_in_rule__QUALIFIED_NAME__Group_1__15696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QUALIFIED_NAME__Group_1__1__Impl5723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQUALIFIED_NAME_in_rule__Module__NameAssignment_25761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalDSLType_in_rule__Module__TypeAssignment_35792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_rule__Module__PackagesAssignment_4_05823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_rule__Module__PackagesAssignment_4_15854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQUALIFIED_NAME_in_rule__Package__NameAssignment_25885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__Package__EntitiesAssignment_4_05916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__Package__EntitiesAssignment_4_15947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityBuilder_in_rule__Package__EntityBuildersAssignment_5_05978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityBuilder_in_rule__Package__EntityBuildersAssignment_5_16009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_26040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__SuperEntityAssignment_3_16075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_rule__Entity__FeaturesAssignment_5_06110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_rule__Entity__FeaturesAssignment_5_16141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EntityBuilder__NameAssignment_26176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletakes_in_rule__EntityBuilder__TakesAssignment_46211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterFeature_in_rule__Takes__TakesAssignment_16243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterFeature_in_rule__Takes__TakesAssignment_2_16274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleadds_in_rule__Takes__AddsAssignment_36305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQUALIFIED_NAME_in_rule__Adds__AddsAssignment_2_06340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQUALIFIED_NAME_in_rule__Adds__AddsAssignment_2_1_16379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Reference__NameAssignment_26414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Reference__ReferenceAssignment_36449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Reference__ManyAssignment_46489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQUALIFIED_NAME_in_rule__Reference__OppositeAssignment_5_16532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DataType__NameAssignment_26567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypes_in_rule__DataType__TypeAssignment_36598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__DataType__ManyAssignment_46634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ParameterReference__ReferenceAssignment_16677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ParameterReference__ManyAssignment_26717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ParameterReference__NameAssignment_36756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypes_in_rule__ParameterDataType__TypeAssignment_16787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ParameterDataType__ManyAssignment_26823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ParameterDataType__NameAssignment_36862 = new BitSet(new long[]{0x0000000000000002L});

}