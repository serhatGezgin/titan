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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Nested Functions'", "'String'", "'Integer'", "'Boolean'", "'Long'", "'Double'", "'module'", "'package'", "'{'", "'}'", "'entity'", "':'", "'var'", "'opposite'", "'[]'", "'.'", "'unique'"
    };
    public static final int RULE_ID=4;
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
    public static final int T__19=19;
    public static final int RULE_STRING=6;
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


    // $ANTLR start "entryRuleFeature"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:144:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:145:1: ( ruleFeature EOF )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:146:1: ruleFeature EOF
            {
             before(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature241);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getFeatureRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature248); 

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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:153:1: ruleFeature : ( ( rule__Feature__Alternatives ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:157:2: ( ( ( rule__Feature__Alternatives ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:158:1: ( ( rule__Feature__Alternatives ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:158:1: ( ( rule__Feature__Alternatives ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:159:1: ( rule__Feature__Alternatives )
            {
             before(grammarAccess.getFeatureAccess().getAlternatives()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:160:1: ( rule__Feature__Alternatives )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:160:2: rule__Feature__Alternatives
            {
            pushFollow(FOLLOW_rule__Feature__Alternatives_in_ruleFeature274);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:172:1: entryRuleReference : ruleReference EOF ;
    public final void entryRuleReference() throws RecognitionException {
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:173:1: ( ruleReference EOF )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:174:1: ruleReference EOF
            {
             before(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_ruleReference_in_entryRuleReference301);
            ruleReference();

            state._fsp--;

             after(grammarAccess.getReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReference308); 

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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:181:1: ruleReference : ( ( rule__Reference__Alternatives ) ) ;
    public final void ruleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:185:2: ( ( ( rule__Reference__Alternatives ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:186:1: ( ( rule__Reference__Alternatives ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:186:1: ( ( rule__Reference__Alternatives ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:187:1: ( rule__Reference__Alternatives )
            {
             before(grammarAccess.getReferenceAccess().getAlternatives()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:188:1: ( rule__Reference__Alternatives )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:188:2: rule__Reference__Alternatives
            {
            pushFollow(FOLLOW_rule__Reference__Alternatives_in_ruleReference334);
            rule__Reference__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleSingleReference"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:200:1: entryRuleSingleReference : ruleSingleReference EOF ;
    public final void entryRuleSingleReference() throws RecognitionException {
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:201:1: ( ruleSingleReference EOF )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:202:1: ruleSingleReference EOF
            {
             before(grammarAccess.getSingleReferenceRule()); 
            pushFollow(FOLLOW_ruleSingleReference_in_entryRuleSingleReference361);
            ruleSingleReference();

            state._fsp--;

             after(grammarAccess.getSingleReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleReference368); 

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
    // $ANTLR end "entryRuleSingleReference"


    // $ANTLR start "ruleSingleReference"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:209:1: ruleSingleReference : ( ( rule__SingleReference__Group__0 ) ) ;
    public final void ruleSingleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:213:2: ( ( ( rule__SingleReference__Group__0 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:214:1: ( ( rule__SingleReference__Group__0 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:214:1: ( ( rule__SingleReference__Group__0 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:215:1: ( rule__SingleReference__Group__0 )
            {
             before(grammarAccess.getSingleReferenceAccess().getGroup()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:216:1: ( rule__SingleReference__Group__0 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:216:2: rule__SingleReference__Group__0
            {
            pushFollow(FOLLOW_rule__SingleReference__Group__0_in_ruleSingleReference394);
            rule__SingleReference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSingleReferenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSingleReference"


    // $ANTLR start "entryRuleMultiReference"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:228:1: entryRuleMultiReference : ruleMultiReference EOF ;
    public final void entryRuleMultiReference() throws RecognitionException {
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:229:1: ( ruleMultiReference EOF )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:230:1: ruleMultiReference EOF
            {
             before(grammarAccess.getMultiReferenceRule()); 
            pushFollow(FOLLOW_ruleMultiReference_in_entryRuleMultiReference421);
            ruleMultiReference();

            state._fsp--;

             after(grammarAccess.getMultiReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiReference428); 

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
    // $ANTLR end "entryRuleMultiReference"


    // $ANTLR start "ruleMultiReference"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:237:1: ruleMultiReference : ( ( rule__MultiReference__Group__0 ) ) ;
    public final void ruleMultiReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:241:2: ( ( ( rule__MultiReference__Group__0 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:242:1: ( ( rule__MultiReference__Group__0 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:242:1: ( ( rule__MultiReference__Group__0 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:243:1: ( rule__MultiReference__Group__0 )
            {
             before(grammarAccess.getMultiReferenceAccess().getGroup()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:244:1: ( rule__MultiReference__Group__0 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:244:2: rule__MultiReference__Group__0
            {
            pushFollow(FOLLOW_rule__MultiReference__Group__0_in_ruleMultiReference454);
            rule__MultiReference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiReferenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiReference"


    // $ANTLR start "entryRuleDataType"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:256:1: entryRuleDataType : ruleDataType EOF ;
    public final void entryRuleDataType() throws RecognitionException {
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:257:1: ( ruleDataType EOF )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:258:1: ruleDataType EOF
            {
             before(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_ruleDataType_in_entryRuleDataType481);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getDataTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataType488); 

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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:265:1: ruleDataType : ( ( rule__DataType__Alternatives ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:269:2: ( ( ( rule__DataType__Alternatives ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:270:1: ( ( rule__DataType__Alternatives ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:270:1: ( ( rule__DataType__Alternatives ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:271:1: ( rule__DataType__Alternatives )
            {
             before(grammarAccess.getDataTypeAccess().getAlternatives()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:272:1: ( rule__DataType__Alternatives )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:272:2: rule__DataType__Alternatives
            {
            pushFollow(FOLLOW_rule__DataType__Alternatives_in_ruleDataType514);
            rule__DataType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleSingleDataType"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:284:1: entryRuleSingleDataType : ruleSingleDataType EOF ;
    public final void entryRuleSingleDataType() throws RecognitionException {
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:285:1: ( ruleSingleDataType EOF )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:286:1: ruleSingleDataType EOF
            {
             before(grammarAccess.getSingleDataTypeRule()); 
            pushFollow(FOLLOW_ruleSingleDataType_in_entryRuleSingleDataType541);
            ruleSingleDataType();

            state._fsp--;

             after(grammarAccess.getSingleDataTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleDataType548); 

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
    // $ANTLR end "entryRuleSingleDataType"


    // $ANTLR start "ruleSingleDataType"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:293:1: ruleSingleDataType : ( ( rule__SingleDataType__Group__0 ) ) ;
    public final void ruleSingleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:297:2: ( ( ( rule__SingleDataType__Group__0 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:298:1: ( ( rule__SingleDataType__Group__0 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:298:1: ( ( rule__SingleDataType__Group__0 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:299:1: ( rule__SingleDataType__Group__0 )
            {
             before(grammarAccess.getSingleDataTypeAccess().getGroup()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:300:1: ( rule__SingleDataType__Group__0 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:300:2: rule__SingleDataType__Group__0
            {
            pushFollow(FOLLOW_rule__SingleDataType__Group__0_in_ruleSingleDataType574);
            rule__SingleDataType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSingleDataTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSingleDataType"


    // $ANTLR start "entryRuleMultiDataType"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:312:1: entryRuleMultiDataType : ruleMultiDataType EOF ;
    public final void entryRuleMultiDataType() throws RecognitionException {
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:313:1: ( ruleMultiDataType EOF )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:314:1: ruleMultiDataType EOF
            {
             before(grammarAccess.getMultiDataTypeRule()); 
            pushFollow(FOLLOW_ruleMultiDataType_in_entryRuleMultiDataType601);
            ruleMultiDataType();

            state._fsp--;

             after(grammarAccess.getMultiDataTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiDataType608); 

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
    // $ANTLR end "entryRuleMultiDataType"


    // $ANTLR start "ruleMultiDataType"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:321:1: ruleMultiDataType : ( ( rule__MultiDataType__Group__0 ) ) ;
    public final void ruleMultiDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:325:2: ( ( ( rule__MultiDataType__Group__0 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:326:1: ( ( rule__MultiDataType__Group__0 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:326:1: ( ( rule__MultiDataType__Group__0 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:327:1: ( rule__MultiDataType__Group__0 )
            {
             before(grammarAccess.getMultiDataTypeAccess().getGroup()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:328:1: ( rule__MultiDataType__Group__0 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:328:2: rule__MultiDataType__Group__0
            {
            pushFollow(FOLLOW_rule__MultiDataType__Group__0_in_ruleMultiDataType634);
            rule__MultiDataType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiDataTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiDataType"


    // $ANTLR start "entryRuleQUALIFIED_NAME"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:340:1: entryRuleQUALIFIED_NAME : ruleQUALIFIED_NAME EOF ;
    public final void entryRuleQUALIFIED_NAME() throws RecognitionException {
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:341:1: ( ruleQUALIFIED_NAME EOF )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:342:1: ruleQUALIFIED_NAME EOF
            {
             before(grammarAccess.getQUALIFIED_NAMERule()); 
            pushFollow(FOLLOW_ruleQUALIFIED_NAME_in_entryRuleQUALIFIED_NAME661);
            ruleQUALIFIED_NAME();

            state._fsp--;

             after(grammarAccess.getQUALIFIED_NAMERule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQUALIFIED_NAME668); 

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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:349:1: ruleQUALIFIED_NAME : ( ( rule__QUALIFIED_NAME__Group__0 ) ) ;
    public final void ruleQUALIFIED_NAME() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:353:2: ( ( ( rule__QUALIFIED_NAME__Group__0 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:354:1: ( ( rule__QUALIFIED_NAME__Group__0 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:354:1: ( ( rule__QUALIFIED_NAME__Group__0 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:355:1: ( rule__QUALIFIED_NAME__Group__0 )
            {
             before(grammarAccess.getQUALIFIED_NAMEAccess().getGroup()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:356:1: ( rule__QUALIFIED_NAME__Group__0 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:356:2: rule__QUALIFIED_NAME__Group__0
            {
            pushFollow(FOLLOW_rule__QUALIFIED_NAME__Group__0_in_ruleQUALIFIED_NAME694);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:369:1: ruleInternalDSLType : ( ( 'Nested Functions' ) ) ;
    public final void ruleInternalDSLType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:373:1: ( ( ( 'Nested Functions' ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:374:1: ( ( 'Nested Functions' ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:374:1: ( ( 'Nested Functions' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:375:1: ( 'Nested Functions' )
            {
             before(grammarAccess.getInternalDSLTypeAccess().getNestedFunctionsEnumLiteralDeclaration()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:376:1: ( 'Nested Functions' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:376:3: 'Nested Functions'
            {
            match(input,11,FOLLOW_11_in_ruleInternalDSLType732); 

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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:389:1: ruleDataTypes : ( ( rule__DataTypes__Alternatives ) ) ;
    public final void ruleDataTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:393:1: ( ( ( rule__DataTypes__Alternatives ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:394:1: ( ( rule__DataTypes__Alternatives ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:394:1: ( ( rule__DataTypes__Alternatives ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:395:1: ( rule__DataTypes__Alternatives )
            {
             before(grammarAccess.getDataTypesAccess().getAlternatives()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:396:1: ( rule__DataTypes__Alternatives )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:396:2: rule__DataTypes__Alternatives
            {
            pushFollow(FOLLOW_rule__DataTypes__Alternatives_in_ruleDataTypes770);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:407:1: rule__Feature__Alternatives : ( ( ruleReference ) | ( ruleDataType ) );
    public final void rule__Feature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:411:1: ( ( ruleReference ) | ( ruleDataType ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==23) ) {
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
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:412:1: ( ruleReference )
                    {
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:412:1: ( ruleReference )
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:413:1: ruleReference
                    {
                     before(grammarAccess.getFeatureAccess().getReferenceParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleReference_in_rule__Feature__Alternatives805);
                    ruleReference();

                    state._fsp--;

                     after(grammarAccess.getFeatureAccess().getReferenceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:418:6: ( ruleDataType )
                    {
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:418:6: ( ruleDataType )
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:419:1: ruleDataType
                    {
                     before(grammarAccess.getFeatureAccess().getDataTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleDataType_in_rule__Feature__Alternatives822);
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


    // $ANTLR start "rule__Reference__Alternatives"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:429:1: rule__Reference__Alternatives : ( ( ruleSingleReference ) | ( ruleMultiReference ) );
    public final void rule__Reference__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:433:1: ( ( ruleSingleReference ) | ( ruleMultiReference ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==23) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==RULE_ID) ) {
                    int LA2_2 = input.LA(3);

                    if ( (LA2_2==RULE_ID) ) {
                        int LA2_3 = input.LA(4);

                        if ( (LA2_3==EOF||LA2_3==20||(LA2_3>=23 && LA2_3<=24)||LA2_3==27) ) {
                            alt2=1;
                        }
                        else if ( (LA2_3==25) ) {
                            alt2=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:434:1: ( ruleSingleReference )
                    {
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:434:1: ( ruleSingleReference )
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:435:1: ruleSingleReference
                    {
                     before(grammarAccess.getReferenceAccess().getSingleReferenceParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSingleReference_in_rule__Reference__Alternatives854);
                    ruleSingleReference();

                    state._fsp--;

                     after(grammarAccess.getReferenceAccess().getSingleReferenceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:440:6: ( ruleMultiReference )
                    {
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:440:6: ( ruleMultiReference )
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:441:1: ruleMultiReference
                    {
                     before(grammarAccess.getReferenceAccess().getMultiReferenceParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleMultiReference_in_rule__Reference__Alternatives871);
                    ruleMultiReference();

                    state._fsp--;

                     after(grammarAccess.getReferenceAccess().getMultiReferenceParserRuleCall_1()); 

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
    // $ANTLR end "rule__Reference__Alternatives"


    // $ANTLR start "rule__DataType__Alternatives"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:451:1: rule__DataType__Alternatives : ( ( ruleSingleDataType ) | ( ruleMultiDataType ) );
    public final void rule__DataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:455:1: ( ( ruleSingleDataType ) | ( ruleMultiDataType ) )
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:456:1: ( ruleSingleDataType )
                    {
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:456:1: ( ruleSingleDataType )
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:457:1: ruleSingleDataType
                    {
                     before(grammarAccess.getDataTypeAccess().getSingleDataTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSingleDataType_in_rule__DataType__Alternatives903);
                    ruleSingleDataType();

                    state._fsp--;

                     after(grammarAccess.getDataTypeAccess().getSingleDataTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:462:6: ( ruleMultiDataType )
                    {
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:462:6: ( ruleMultiDataType )
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:463:1: ruleMultiDataType
                    {
                     before(grammarAccess.getDataTypeAccess().getMultiDataTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleMultiDataType_in_rule__DataType__Alternatives920);
                    ruleMultiDataType();

                    state._fsp--;

                     after(grammarAccess.getDataTypeAccess().getMultiDataTypeParserRuleCall_1()); 

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
    // $ANTLR end "rule__DataType__Alternatives"


    // $ANTLR start "rule__DataTypes__Alternatives"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:473:1: rule__DataTypes__Alternatives : ( ( ( 'String' ) ) | ( ( 'Integer' ) ) | ( ( 'Boolean' ) ) | ( ( 'Long' ) ) | ( ( 'Double' ) ) );
    public final void rule__DataTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:477:1: ( ( ( 'String' ) ) | ( ( 'Integer' ) ) | ( ( 'Boolean' ) ) | ( ( 'Long' ) ) | ( ( 'Double' ) ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt4=1;
                }
                break;
            case 13:
                {
                alt4=2;
                }
                break;
            case 14:
                {
                alt4=3;
                }
                break;
            case 15:
                {
                alt4=4;
                }
                break;
            case 16:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:478:1: ( ( 'String' ) )
                    {
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:478:1: ( ( 'String' ) )
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:479:1: ( 'String' )
                    {
                     before(grammarAccess.getDataTypesAccess().getStringEnumLiteralDeclaration_0()); 
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:480:1: ( 'String' )
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:480:3: 'String'
                    {
                    match(input,12,FOLLOW_12_in_rule__DataTypes__Alternatives953); 

                    }

                     after(grammarAccess.getDataTypesAccess().getStringEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:485:6: ( ( 'Integer' ) )
                    {
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:485:6: ( ( 'Integer' ) )
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:486:1: ( 'Integer' )
                    {
                     before(grammarAccess.getDataTypesAccess().getIntegerEnumLiteralDeclaration_1()); 
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:487:1: ( 'Integer' )
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:487:3: 'Integer'
                    {
                    match(input,13,FOLLOW_13_in_rule__DataTypes__Alternatives974); 

                    }

                     after(grammarAccess.getDataTypesAccess().getIntegerEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:492:6: ( ( 'Boolean' ) )
                    {
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:492:6: ( ( 'Boolean' ) )
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:493:1: ( 'Boolean' )
                    {
                     before(grammarAccess.getDataTypesAccess().getBooleanEnumLiteralDeclaration_2()); 
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:494:1: ( 'Boolean' )
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:494:3: 'Boolean'
                    {
                    match(input,14,FOLLOW_14_in_rule__DataTypes__Alternatives995); 

                    }

                     after(grammarAccess.getDataTypesAccess().getBooleanEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:499:6: ( ( 'Long' ) )
                    {
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:499:6: ( ( 'Long' ) )
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:500:1: ( 'Long' )
                    {
                     before(grammarAccess.getDataTypesAccess().getLongEnumLiteralDeclaration_3()); 
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:501:1: ( 'Long' )
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:501:3: 'Long'
                    {
                    match(input,15,FOLLOW_15_in_rule__DataTypes__Alternatives1016); 

                    }

                     after(grammarAccess.getDataTypesAccess().getLongEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:506:6: ( ( 'Double' ) )
                    {
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:506:6: ( ( 'Double' ) )
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:507:1: ( 'Double' )
                    {
                     before(grammarAccess.getDataTypesAccess().getDoubleEnumLiteralDeclaration_4()); 
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:508:1: ( 'Double' )
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:508:3: 'Double'
                    {
                    match(input,16,FOLLOW_16_in_rule__DataTypes__Alternatives1037); 

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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:520:1: rule__Module__Group__0 : rule__Module__Group__0__Impl rule__Module__Group__1 ;
    public final void rule__Module__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:524:1: ( rule__Module__Group__0__Impl rule__Module__Group__1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:525:2: rule__Module__Group__0__Impl rule__Module__Group__1
            {
            pushFollow(FOLLOW_rule__Module__Group__0__Impl_in_rule__Module__Group__01070);
            rule__Module__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__1_in_rule__Module__Group__01073);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:532:1: rule__Module__Group__0__Impl : ( () ) ;
    public final void rule__Module__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:536:1: ( ( () ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:537:1: ( () )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:537:1: ( () )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:538:1: ()
            {
             before(grammarAccess.getModuleAccess().getModuleAction_0()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:539:1: ()
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:541:1: 
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:551:1: rule__Module__Group__1 : rule__Module__Group__1__Impl rule__Module__Group__2 ;
    public final void rule__Module__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:555:1: ( rule__Module__Group__1__Impl rule__Module__Group__2 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:556:2: rule__Module__Group__1__Impl rule__Module__Group__2
            {
            pushFollow(FOLLOW_rule__Module__Group__1__Impl_in_rule__Module__Group__11131);
            rule__Module__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__2_in_rule__Module__Group__11134);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:563:1: rule__Module__Group__1__Impl : ( 'module' ) ;
    public final void rule__Module__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:567:1: ( ( 'module' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:568:1: ( 'module' )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:568:1: ( 'module' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:569:1: 'module'
            {
             before(grammarAccess.getModuleAccess().getModuleKeyword_1()); 
            match(input,17,FOLLOW_17_in_rule__Module__Group__1__Impl1162); 
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:582:1: rule__Module__Group__2 : rule__Module__Group__2__Impl rule__Module__Group__3 ;
    public final void rule__Module__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:586:1: ( rule__Module__Group__2__Impl rule__Module__Group__3 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:587:2: rule__Module__Group__2__Impl rule__Module__Group__3
            {
            pushFollow(FOLLOW_rule__Module__Group__2__Impl_in_rule__Module__Group__21193);
            rule__Module__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__3_in_rule__Module__Group__21196);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:594:1: rule__Module__Group__2__Impl : ( ( rule__Module__NameAssignment_2 ) ) ;
    public final void rule__Module__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:598:1: ( ( ( rule__Module__NameAssignment_2 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:599:1: ( ( rule__Module__NameAssignment_2 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:599:1: ( ( rule__Module__NameAssignment_2 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:600:1: ( rule__Module__NameAssignment_2 )
            {
             before(grammarAccess.getModuleAccess().getNameAssignment_2()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:601:1: ( rule__Module__NameAssignment_2 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:601:2: rule__Module__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Module__NameAssignment_2_in_rule__Module__Group__2__Impl1223);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:611:1: rule__Module__Group__3 : rule__Module__Group__3__Impl rule__Module__Group__4 ;
    public final void rule__Module__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:615:1: ( rule__Module__Group__3__Impl rule__Module__Group__4 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:616:2: rule__Module__Group__3__Impl rule__Module__Group__4
            {
            pushFollow(FOLLOW_rule__Module__Group__3__Impl_in_rule__Module__Group__31253);
            rule__Module__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__4_in_rule__Module__Group__31256);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:623:1: rule__Module__Group__3__Impl : ( ( rule__Module__TypeAssignment_3 ) ) ;
    public final void rule__Module__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:627:1: ( ( ( rule__Module__TypeAssignment_3 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:628:1: ( ( rule__Module__TypeAssignment_3 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:628:1: ( ( rule__Module__TypeAssignment_3 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:629:1: ( rule__Module__TypeAssignment_3 )
            {
             before(grammarAccess.getModuleAccess().getTypeAssignment_3()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:630:1: ( rule__Module__TypeAssignment_3 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:630:2: rule__Module__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Module__TypeAssignment_3_in_rule__Module__Group__3__Impl1283);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:640:1: rule__Module__Group__4 : rule__Module__Group__4__Impl ;
    public final void rule__Module__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:644:1: ( rule__Module__Group__4__Impl )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:645:2: rule__Module__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Module__Group__4__Impl_in_rule__Module__Group__41313);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:651:1: rule__Module__Group__4__Impl : ( ( rule__Module__Group_4__0 )? ) ;
    public final void rule__Module__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:655:1: ( ( ( rule__Module__Group_4__0 )? ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:656:1: ( ( rule__Module__Group_4__0 )? )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:656:1: ( ( rule__Module__Group_4__0 )? )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:657:1: ( rule__Module__Group_4__0 )?
            {
             before(grammarAccess.getModuleAccess().getGroup_4()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:658:1: ( rule__Module__Group_4__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:658:2: rule__Module__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Module__Group_4__0_in_rule__Module__Group__4__Impl1340);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:678:1: rule__Module__Group_4__0 : rule__Module__Group_4__0__Impl rule__Module__Group_4__1 ;
    public final void rule__Module__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:682:1: ( rule__Module__Group_4__0__Impl rule__Module__Group_4__1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:683:2: rule__Module__Group_4__0__Impl rule__Module__Group_4__1
            {
            pushFollow(FOLLOW_rule__Module__Group_4__0__Impl_in_rule__Module__Group_4__01381);
            rule__Module__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group_4__1_in_rule__Module__Group_4__01384);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:690:1: rule__Module__Group_4__0__Impl : ( ( rule__Module__PackagesAssignment_4_0 ) ) ;
    public final void rule__Module__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:694:1: ( ( ( rule__Module__PackagesAssignment_4_0 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:695:1: ( ( rule__Module__PackagesAssignment_4_0 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:695:1: ( ( rule__Module__PackagesAssignment_4_0 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:696:1: ( rule__Module__PackagesAssignment_4_0 )
            {
             before(grammarAccess.getModuleAccess().getPackagesAssignment_4_0()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:697:1: ( rule__Module__PackagesAssignment_4_0 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:697:2: rule__Module__PackagesAssignment_4_0
            {
            pushFollow(FOLLOW_rule__Module__PackagesAssignment_4_0_in_rule__Module__Group_4__0__Impl1411);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:707:1: rule__Module__Group_4__1 : rule__Module__Group_4__1__Impl ;
    public final void rule__Module__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:711:1: ( rule__Module__Group_4__1__Impl )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:712:2: rule__Module__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Module__Group_4__1__Impl_in_rule__Module__Group_4__11441);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:718:1: rule__Module__Group_4__1__Impl : ( ( rule__Module__PackagesAssignment_4_1 )* ) ;
    public final void rule__Module__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:722:1: ( ( ( rule__Module__PackagesAssignment_4_1 )* ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:723:1: ( ( rule__Module__PackagesAssignment_4_1 )* )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:723:1: ( ( rule__Module__PackagesAssignment_4_1 )* )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:724:1: ( rule__Module__PackagesAssignment_4_1 )*
            {
             before(grammarAccess.getModuleAccess().getPackagesAssignment_4_1()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:725:1: ( rule__Module__PackagesAssignment_4_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:725:2: rule__Module__PackagesAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_rule__Module__PackagesAssignment_4_1_in_rule__Module__Group_4__1__Impl1468);
            	    rule__Module__PackagesAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:739:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:743:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:744:2: rule__Package__Group__0__Impl rule__Package__Group__1
            {
            pushFollow(FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__01503);
            rule__Package__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__1_in_rule__Package__Group__01506);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:751:1: rule__Package__Group__0__Impl : ( () ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:755:1: ( ( () ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:756:1: ( () )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:756:1: ( () )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:757:1: ()
            {
             before(grammarAccess.getPackageAccess().getPackageAction_0()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:758:1: ()
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:760:1: 
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:770:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:774:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:775:2: rule__Package__Group__1__Impl rule__Package__Group__2
            {
            pushFollow(FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__11564);
            rule__Package__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__2_in_rule__Package__Group__11567);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:782:1: rule__Package__Group__1__Impl : ( 'package' ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:786:1: ( ( 'package' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:787:1: ( 'package' )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:787:1: ( 'package' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:788:1: 'package'
            {
             before(grammarAccess.getPackageAccess().getPackageKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__Package__Group__1__Impl1595); 
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:801:1: rule__Package__Group__2 : rule__Package__Group__2__Impl rule__Package__Group__3 ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:805:1: ( rule__Package__Group__2__Impl rule__Package__Group__3 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:806:2: rule__Package__Group__2__Impl rule__Package__Group__3
            {
            pushFollow(FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__21626);
            rule__Package__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__3_in_rule__Package__Group__21629);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:813:1: rule__Package__Group__2__Impl : ( ( rule__Package__NameAssignment_2 ) ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:817:1: ( ( ( rule__Package__NameAssignment_2 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:818:1: ( ( rule__Package__NameAssignment_2 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:818:1: ( ( rule__Package__NameAssignment_2 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:819:1: ( rule__Package__NameAssignment_2 )
            {
             before(grammarAccess.getPackageAccess().getNameAssignment_2()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:820:1: ( rule__Package__NameAssignment_2 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:820:2: rule__Package__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Package__NameAssignment_2_in_rule__Package__Group__2__Impl1656);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:830:1: rule__Package__Group__3 : rule__Package__Group__3__Impl rule__Package__Group__4 ;
    public final void rule__Package__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:834:1: ( rule__Package__Group__3__Impl rule__Package__Group__4 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:835:2: rule__Package__Group__3__Impl rule__Package__Group__4
            {
            pushFollow(FOLLOW_rule__Package__Group__3__Impl_in_rule__Package__Group__31686);
            rule__Package__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__4_in_rule__Package__Group__31689);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:842:1: rule__Package__Group__3__Impl : ( '{' ) ;
    public final void rule__Package__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:846:1: ( ( '{' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:847:1: ( '{' )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:847:1: ( '{' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:848:1: '{'
            {
             before(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,19,FOLLOW_19_in_rule__Package__Group__3__Impl1717); 
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:861:1: rule__Package__Group__4 : rule__Package__Group__4__Impl rule__Package__Group__5 ;
    public final void rule__Package__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:865:1: ( rule__Package__Group__4__Impl rule__Package__Group__5 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:866:2: rule__Package__Group__4__Impl rule__Package__Group__5
            {
            pushFollow(FOLLOW_rule__Package__Group__4__Impl_in_rule__Package__Group__41748);
            rule__Package__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__5_in_rule__Package__Group__41751);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:873:1: rule__Package__Group__4__Impl : ( ( rule__Package__Group_4__0 )? ) ;
    public final void rule__Package__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:877:1: ( ( ( rule__Package__Group_4__0 )? ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:878:1: ( ( rule__Package__Group_4__0 )? )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:878:1: ( ( rule__Package__Group_4__0 )? )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:879:1: ( rule__Package__Group_4__0 )?
            {
             before(grammarAccess.getPackageAccess().getGroup_4()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:880:1: ( rule__Package__Group_4__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:880:2: rule__Package__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Package__Group_4__0_in_rule__Package__Group__4__Impl1778);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:890:1: rule__Package__Group__5 : rule__Package__Group__5__Impl ;
    public final void rule__Package__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:894:1: ( rule__Package__Group__5__Impl )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:895:2: rule__Package__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Package__Group__5__Impl_in_rule__Package__Group__51809);
            rule__Package__Group__5__Impl();

            state._fsp--;


            }

        }
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:901:1: rule__Package__Group__5__Impl : ( '}' ) ;
    public final void rule__Package__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:905:1: ( ( '}' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:906:1: ( '}' )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:906:1: ( '}' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:907:1: '}'
            {
             before(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_5()); 
            match(input,20,FOLLOW_20_in_rule__Package__Group__5__Impl1837); 
             after(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__Package__Group_4__0"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:932:1: rule__Package__Group_4__0 : rule__Package__Group_4__0__Impl rule__Package__Group_4__1 ;
    public final void rule__Package__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:936:1: ( rule__Package__Group_4__0__Impl rule__Package__Group_4__1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:937:2: rule__Package__Group_4__0__Impl rule__Package__Group_4__1
            {
            pushFollow(FOLLOW_rule__Package__Group_4__0__Impl_in_rule__Package__Group_4__01880);
            rule__Package__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group_4__1_in_rule__Package__Group_4__01883);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:944:1: rule__Package__Group_4__0__Impl : ( ( rule__Package__EntitiesAssignment_4_0 ) ) ;
    public final void rule__Package__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:948:1: ( ( ( rule__Package__EntitiesAssignment_4_0 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:949:1: ( ( rule__Package__EntitiesAssignment_4_0 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:949:1: ( ( rule__Package__EntitiesAssignment_4_0 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:950:1: ( rule__Package__EntitiesAssignment_4_0 )
            {
             before(grammarAccess.getPackageAccess().getEntitiesAssignment_4_0()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:951:1: ( rule__Package__EntitiesAssignment_4_0 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:951:2: rule__Package__EntitiesAssignment_4_0
            {
            pushFollow(FOLLOW_rule__Package__EntitiesAssignment_4_0_in_rule__Package__Group_4__0__Impl1910);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:961:1: rule__Package__Group_4__1 : rule__Package__Group_4__1__Impl ;
    public final void rule__Package__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:965:1: ( rule__Package__Group_4__1__Impl )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:966:2: rule__Package__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Package__Group_4__1__Impl_in_rule__Package__Group_4__11940);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:972:1: rule__Package__Group_4__1__Impl : ( ( rule__Package__EntitiesAssignment_4_1 )* ) ;
    public final void rule__Package__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:976:1: ( ( ( rule__Package__EntitiesAssignment_4_1 )* ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:977:1: ( ( rule__Package__EntitiesAssignment_4_1 )* )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:977:1: ( ( rule__Package__EntitiesAssignment_4_1 )* )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:978:1: ( rule__Package__EntitiesAssignment_4_1 )*
            {
             before(grammarAccess.getPackageAccess().getEntitiesAssignment_4_1()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:979:1: ( rule__Package__EntitiesAssignment_4_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==21) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:979:2: rule__Package__EntitiesAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_rule__Package__EntitiesAssignment_4_1_in_rule__Package__Group_4__1__Impl1967);
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


    // $ANTLR start "rule__Entity__Group__0"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:993:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:997:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:998:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__02002);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__02005);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1005:1: rule__Entity__Group__0__Impl : ( () ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1009:1: ( ( () ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1010:1: ( () )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1010:1: ( () )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1011:1: ()
            {
             before(grammarAccess.getEntityAccess().getEntityAction_0()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1012:1: ()
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1014:1: 
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1024:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1028:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1029:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__12063);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__12066);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1036:1: rule__Entity__Group__1__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1040:1: ( ( 'entity' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1041:1: ( 'entity' )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1041:1: ( 'entity' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1042:1: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_1()); 
            match(input,21,FOLLOW_21_in_rule__Entity__Group__1__Impl2094); 
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1055:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1059:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1060:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__22125);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__22128);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1067:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__NameAssignment_2 ) ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1071:1: ( ( ( rule__Entity__NameAssignment_2 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1072:1: ( ( rule__Entity__NameAssignment_2 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1072:1: ( ( rule__Entity__NameAssignment_2 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1073:1: ( rule__Entity__NameAssignment_2 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_2()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1074:1: ( rule__Entity__NameAssignment_2 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1074:2: rule__Entity__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Entity__NameAssignment_2_in_rule__Entity__Group__2__Impl2155);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1084:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1088:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1089:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__32185);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__32188);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1096:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__Group_3__0 )? ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1100:1: ( ( ( rule__Entity__Group_3__0 )? ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1101:1: ( ( rule__Entity__Group_3__0 )? )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1101:1: ( ( rule__Entity__Group_3__0 )? )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1102:1: ( rule__Entity__Group_3__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_3()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1103:1: ( rule__Entity__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1103:2: rule__Entity__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Entity__Group_3__0_in_rule__Entity__Group__3__Impl2215);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1113:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1117:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1118:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__42246);
            rule__Entity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__42249);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1125:1: rule__Entity__Group__4__Impl : ( '{' ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1129:1: ( ( '{' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1130:1: ( '{' )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1130:1: ( '{' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1131:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,19,FOLLOW_19_in_rule__Entity__Group__4__Impl2277); 
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1144:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl rule__Entity__Group__6 ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1148:1: ( rule__Entity__Group__5__Impl rule__Entity__Group__6 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1149:2: rule__Entity__Group__5__Impl rule__Entity__Group__6
            {
            pushFollow(FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__52308);
            rule__Entity__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__6_in_rule__Entity__Group__52311);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1156:1: rule__Entity__Group__5__Impl : ( ( rule__Entity__Group_5__0 )? ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1160:1: ( ( ( rule__Entity__Group_5__0 )? ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1161:1: ( ( rule__Entity__Group_5__0 )? )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1161:1: ( ( rule__Entity__Group_5__0 )? )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1162:1: ( rule__Entity__Group_5__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_5()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1163:1: ( rule__Entity__Group_5__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1163:2: rule__Entity__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Entity__Group_5__0_in_rule__Entity__Group__5__Impl2338);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1173:1: rule__Entity__Group__6 : rule__Entity__Group__6__Impl ;
    public final void rule__Entity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1177:1: ( rule__Entity__Group__6__Impl )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1178:2: rule__Entity__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group__6__Impl_in_rule__Entity__Group__62369);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1184:1: rule__Entity__Group__6__Impl : ( '}' ) ;
    public final void rule__Entity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1188:1: ( ( '}' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1189:1: ( '}' )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1189:1: ( '}' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1190:1: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_6()); 
            match(input,20,FOLLOW_20_in_rule__Entity__Group__6__Impl2397); 
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1217:1: rule__Entity__Group_3__0 : rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1 ;
    public final void rule__Entity__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1221:1: ( rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1222:2: rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1
            {
            pushFollow(FOLLOW_rule__Entity__Group_3__0__Impl_in_rule__Entity__Group_3__02442);
            rule__Entity__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group_3__1_in_rule__Entity__Group_3__02445);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1229:1: rule__Entity__Group_3__0__Impl : ( ':' ) ;
    public final void rule__Entity__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1233:1: ( ( ':' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1234:1: ( ':' )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1234:1: ( ':' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1235:1: ':'
            {
             before(grammarAccess.getEntityAccess().getColonKeyword_3_0()); 
            match(input,22,FOLLOW_22_in_rule__Entity__Group_3__0__Impl2473); 
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1248:1: rule__Entity__Group_3__1 : rule__Entity__Group_3__1__Impl ;
    public final void rule__Entity__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1252:1: ( rule__Entity__Group_3__1__Impl )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1253:2: rule__Entity__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group_3__1__Impl_in_rule__Entity__Group_3__12504);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1259:1: rule__Entity__Group_3__1__Impl : ( ( rule__Entity__SuperEntityAssignment_3_1 ) ) ;
    public final void rule__Entity__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1263:1: ( ( ( rule__Entity__SuperEntityAssignment_3_1 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1264:1: ( ( rule__Entity__SuperEntityAssignment_3_1 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1264:1: ( ( rule__Entity__SuperEntityAssignment_3_1 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1265:1: ( rule__Entity__SuperEntityAssignment_3_1 )
            {
             before(grammarAccess.getEntityAccess().getSuperEntityAssignment_3_1()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1266:1: ( rule__Entity__SuperEntityAssignment_3_1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1266:2: rule__Entity__SuperEntityAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Entity__SuperEntityAssignment_3_1_in_rule__Entity__Group_3__1__Impl2531);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1280:1: rule__Entity__Group_5__0 : rule__Entity__Group_5__0__Impl rule__Entity__Group_5__1 ;
    public final void rule__Entity__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1284:1: ( rule__Entity__Group_5__0__Impl rule__Entity__Group_5__1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1285:2: rule__Entity__Group_5__0__Impl rule__Entity__Group_5__1
            {
            pushFollow(FOLLOW_rule__Entity__Group_5__0__Impl_in_rule__Entity__Group_5__02565);
            rule__Entity__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group_5__1_in_rule__Entity__Group_5__02568);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1292:1: rule__Entity__Group_5__0__Impl : ( ( rule__Entity__FeaturesAssignment_5_0 ) ) ;
    public final void rule__Entity__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1296:1: ( ( ( rule__Entity__FeaturesAssignment_5_0 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1297:1: ( ( rule__Entity__FeaturesAssignment_5_0 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1297:1: ( ( rule__Entity__FeaturesAssignment_5_0 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1298:1: ( rule__Entity__FeaturesAssignment_5_0 )
            {
             before(grammarAccess.getEntityAccess().getFeaturesAssignment_5_0()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1299:1: ( rule__Entity__FeaturesAssignment_5_0 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1299:2: rule__Entity__FeaturesAssignment_5_0
            {
            pushFollow(FOLLOW_rule__Entity__FeaturesAssignment_5_0_in_rule__Entity__Group_5__0__Impl2595);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1309:1: rule__Entity__Group_5__1 : rule__Entity__Group_5__1__Impl ;
    public final void rule__Entity__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1313:1: ( rule__Entity__Group_5__1__Impl )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1314:2: rule__Entity__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group_5__1__Impl_in_rule__Entity__Group_5__12625);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1320:1: rule__Entity__Group_5__1__Impl : ( ( rule__Entity__FeaturesAssignment_5_1 )* ) ;
    public final void rule__Entity__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1324:1: ( ( ( rule__Entity__FeaturesAssignment_5_1 )* ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1325:1: ( ( rule__Entity__FeaturesAssignment_5_1 )* )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1325:1: ( ( rule__Entity__FeaturesAssignment_5_1 )* )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1326:1: ( rule__Entity__FeaturesAssignment_5_1 )*
            {
             before(grammarAccess.getEntityAccess().getFeaturesAssignment_5_1()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1327:1: ( rule__Entity__FeaturesAssignment_5_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==23) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1327:2: rule__Entity__FeaturesAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_rule__Entity__FeaturesAssignment_5_1_in_rule__Entity__Group_5__1__Impl2652);
            	    rule__Entity__FeaturesAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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


    // $ANTLR start "rule__SingleReference__Group__0"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1341:1: rule__SingleReference__Group__0 : rule__SingleReference__Group__0__Impl rule__SingleReference__Group__1 ;
    public final void rule__SingleReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1345:1: ( rule__SingleReference__Group__0__Impl rule__SingleReference__Group__1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1346:2: rule__SingleReference__Group__0__Impl rule__SingleReference__Group__1
            {
            pushFollow(FOLLOW_rule__SingleReference__Group__0__Impl_in_rule__SingleReference__Group__02687);
            rule__SingleReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SingleReference__Group__1_in_rule__SingleReference__Group__02690);
            rule__SingleReference__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleReference__Group__0"


    // $ANTLR start "rule__SingleReference__Group__0__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1353:1: rule__SingleReference__Group__0__Impl : ( () ) ;
    public final void rule__SingleReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1357:1: ( ( () ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1358:1: ( () )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1358:1: ( () )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1359:1: ()
            {
             before(grammarAccess.getSingleReferenceAccess().getSingleReferenceAction_0()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1360:1: ()
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1362:1: 
            {
            }

             after(grammarAccess.getSingleReferenceAccess().getSingleReferenceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleReference__Group__0__Impl"


    // $ANTLR start "rule__SingleReference__Group__1"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1372:1: rule__SingleReference__Group__1 : rule__SingleReference__Group__1__Impl rule__SingleReference__Group__2 ;
    public final void rule__SingleReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1376:1: ( rule__SingleReference__Group__1__Impl rule__SingleReference__Group__2 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1377:2: rule__SingleReference__Group__1__Impl rule__SingleReference__Group__2
            {
            pushFollow(FOLLOW_rule__SingleReference__Group__1__Impl_in_rule__SingleReference__Group__12748);
            rule__SingleReference__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SingleReference__Group__2_in_rule__SingleReference__Group__12751);
            rule__SingleReference__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleReference__Group__1"


    // $ANTLR start "rule__SingleReference__Group__1__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1384:1: rule__SingleReference__Group__1__Impl : ( 'var' ) ;
    public final void rule__SingleReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1388:1: ( ( 'var' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1389:1: ( 'var' )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1389:1: ( 'var' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1390:1: 'var'
            {
             before(grammarAccess.getSingleReferenceAccess().getVarKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__SingleReference__Group__1__Impl2779); 
             after(grammarAccess.getSingleReferenceAccess().getVarKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleReference__Group__1__Impl"


    // $ANTLR start "rule__SingleReference__Group__2"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1403:1: rule__SingleReference__Group__2 : rule__SingleReference__Group__2__Impl rule__SingleReference__Group__3 ;
    public final void rule__SingleReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1407:1: ( rule__SingleReference__Group__2__Impl rule__SingleReference__Group__3 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1408:2: rule__SingleReference__Group__2__Impl rule__SingleReference__Group__3
            {
            pushFollow(FOLLOW_rule__SingleReference__Group__2__Impl_in_rule__SingleReference__Group__22810);
            rule__SingleReference__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SingleReference__Group__3_in_rule__SingleReference__Group__22813);
            rule__SingleReference__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleReference__Group__2"


    // $ANTLR start "rule__SingleReference__Group__2__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1415:1: rule__SingleReference__Group__2__Impl : ( ( rule__SingleReference__NameAssignment_2 ) ) ;
    public final void rule__SingleReference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1419:1: ( ( ( rule__SingleReference__NameAssignment_2 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1420:1: ( ( rule__SingleReference__NameAssignment_2 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1420:1: ( ( rule__SingleReference__NameAssignment_2 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1421:1: ( rule__SingleReference__NameAssignment_2 )
            {
             before(grammarAccess.getSingleReferenceAccess().getNameAssignment_2()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1422:1: ( rule__SingleReference__NameAssignment_2 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1422:2: rule__SingleReference__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__SingleReference__NameAssignment_2_in_rule__SingleReference__Group__2__Impl2840);
            rule__SingleReference__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSingleReferenceAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleReference__Group__2__Impl"


    // $ANTLR start "rule__SingleReference__Group__3"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1432:1: rule__SingleReference__Group__3 : rule__SingleReference__Group__3__Impl rule__SingleReference__Group__4 ;
    public final void rule__SingleReference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1436:1: ( rule__SingleReference__Group__3__Impl rule__SingleReference__Group__4 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1437:2: rule__SingleReference__Group__3__Impl rule__SingleReference__Group__4
            {
            pushFollow(FOLLOW_rule__SingleReference__Group__3__Impl_in_rule__SingleReference__Group__32870);
            rule__SingleReference__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SingleReference__Group__4_in_rule__SingleReference__Group__32873);
            rule__SingleReference__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleReference__Group__3"


    // $ANTLR start "rule__SingleReference__Group__3__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1444:1: rule__SingleReference__Group__3__Impl : ( ( rule__SingleReference__ReferenceAssignment_3 ) ) ;
    public final void rule__SingleReference__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1448:1: ( ( ( rule__SingleReference__ReferenceAssignment_3 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1449:1: ( ( rule__SingleReference__ReferenceAssignment_3 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1449:1: ( ( rule__SingleReference__ReferenceAssignment_3 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1450:1: ( rule__SingleReference__ReferenceAssignment_3 )
            {
             before(grammarAccess.getSingleReferenceAccess().getReferenceAssignment_3()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1451:1: ( rule__SingleReference__ReferenceAssignment_3 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1451:2: rule__SingleReference__ReferenceAssignment_3
            {
            pushFollow(FOLLOW_rule__SingleReference__ReferenceAssignment_3_in_rule__SingleReference__Group__3__Impl2900);
            rule__SingleReference__ReferenceAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSingleReferenceAccess().getReferenceAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleReference__Group__3__Impl"


    // $ANTLR start "rule__SingleReference__Group__4"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1461:1: rule__SingleReference__Group__4 : rule__SingleReference__Group__4__Impl rule__SingleReference__Group__5 ;
    public final void rule__SingleReference__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1465:1: ( rule__SingleReference__Group__4__Impl rule__SingleReference__Group__5 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1466:2: rule__SingleReference__Group__4__Impl rule__SingleReference__Group__5
            {
            pushFollow(FOLLOW_rule__SingleReference__Group__4__Impl_in_rule__SingleReference__Group__42930);
            rule__SingleReference__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SingleReference__Group__5_in_rule__SingleReference__Group__42933);
            rule__SingleReference__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleReference__Group__4"


    // $ANTLR start "rule__SingleReference__Group__4__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1473:1: rule__SingleReference__Group__4__Impl : ( ( rule__SingleReference__UniqueAssignment_4 )? ) ;
    public final void rule__SingleReference__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1477:1: ( ( ( rule__SingleReference__UniqueAssignment_4 )? ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1478:1: ( ( rule__SingleReference__UniqueAssignment_4 )? )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1478:1: ( ( rule__SingleReference__UniqueAssignment_4 )? )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1479:1: ( rule__SingleReference__UniqueAssignment_4 )?
            {
             before(grammarAccess.getSingleReferenceAccess().getUniqueAssignment_4()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1480:1: ( rule__SingleReference__UniqueAssignment_4 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==27) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1480:2: rule__SingleReference__UniqueAssignment_4
                    {
                    pushFollow(FOLLOW_rule__SingleReference__UniqueAssignment_4_in_rule__SingleReference__Group__4__Impl2960);
                    rule__SingleReference__UniqueAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSingleReferenceAccess().getUniqueAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleReference__Group__4__Impl"


    // $ANTLR start "rule__SingleReference__Group__5"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1490:1: rule__SingleReference__Group__5 : rule__SingleReference__Group__5__Impl ;
    public final void rule__SingleReference__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1494:1: ( rule__SingleReference__Group__5__Impl )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1495:2: rule__SingleReference__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__SingleReference__Group__5__Impl_in_rule__SingleReference__Group__52991);
            rule__SingleReference__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleReference__Group__5"


    // $ANTLR start "rule__SingleReference__Group__5__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1501:1: rule__SingleReference__Group__5__Impl : ( ( rule__SingleReference__Group_5__0 )? ) ;
    public final void rule__SingleReference__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1505:1: ( ( ( rule__SingleReference__Group_5__0 )? ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1506:1: ( ( rule__SingleReference__Group_5__0 )? )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1506:1: ( ( rule__SingleReference__Group_5__0 )? )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1507:1: ( rule__SingleReference__Group_5__0 )?
            {
             before(grammarAccess.getSingleReferenceAccess().getGroup_5()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1508:1: ( rule__SingleReference__Group_5__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1508:2: rule__SingleReference__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__SingleReference__Group_5__0_in_rule__SingleReference__Group__5__Impl3018);
                    rule__SingleReference__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSingleReferenceAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleReference__Group__5__Impl"


    // $ANTLR start "rule__SingleReference__Group_5__0"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1530:1: rule__SingleReference__Group_5__0 : rule__SingleReference__Group_5__0__Impl rule__SingleReference__Group_5__1 ;
    public final void rule__SingleReference__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1534:1: ( rule__SingleReference__Group_5__0__Impl rule__SingleReference__Group_5__1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1535:2: rule__SingleReference__Group_5__0__Impl rule__SingleReference__Group_5__1
            {
            pushFollow(FOLLOW_rule__SingleReference__Group_5__0__Impl_in_rule__SingleReference__Group_5__03061);
            rule__SingleReference__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SingleReference__Group_5__1_in_rule__SingleReference__Group_5__03064);
            rule__SingleReference__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleReference__Group_5__0"


    // $ANTLR start "rule__SingleReference__Group_5__0__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1542:1: rule__SingleReference__Group_5__0__Impl : ( 'opposite' ) ;
    public final void rule__SingleReference__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1546:1: ( ( 'opposite' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1547:1: ( 'opposite' )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1547:1: ( 'opposite' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1548:1: 'opposite'
            {
             before(grammarAccess.getSingleReferenceAccess().getOppositeKeyword_5_0()); 
            match(input,24,FOLLOW_24_in_rule__SingleReference__Group_5__0__Impl3092); 
             after(grammarAccess.getSingleReferenceAccess().getOppositeKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleReference__Group_5__0__Impl"


    // $ANTLR start "rule__SingleReference__Group_5__1"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1561:1: rule__SingleReference__Group_5__1 : rule__SingleReference__Group_5__1__Impl ;
    public final void rule__SingleReference__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1565:1: ( rule__SingleReference__Group_5__1__Impl )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1566:2: rule__SingleReference__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__SingleReference__Group_5__1__Impl_in_rule__SingleReference__Group_5__13123);
            rule__SingleReference__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleReference__Group_5__1"


    // $ANTLR start "rule__SingleReference__Group_5__1__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1572:1: rule__SingleReference__Group_5__1__Impl : ( ( rule__SingleReference__OppositeAssignment_5_1 ) ) ;
    public final void rule__SingleReference__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1576:1: ( ( ( rule__SingleReference__OppositeAssignment_5_1 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1577:1: ( ( rule__SingleReference__OppositeAssignment_5_1 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1577:1: ( ( rule__SingleReference__OppositeAssignment_5_1 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1578:1: ( rule__SingleReference__OppositeAssignment_5_1 )
            {
             before(grammarAccess.getSingleReferenceAccess().getOppositeAssignment_5_1()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1579:1: ( rule__SingleReference__OppositeAssignment_5_1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1579:2: rule__SingleReference__OppositeAssignment_5_1
            {
            pushFollow(FOLLOW_rule__SingleReference__OppositeAssignment_5_1_in_rule__SingleReference__Group_5__1__Impl3150);
            rule__SingleReference__OppositeAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getSingleReferenceAccess().getOppositeAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleReference__Group_5__1__Impl"


    // $ANTLR start "rule__MultiReference__Group__0"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1593:1: rule__MultiReference__Group__0 : rule__MultiReference__Group__0__Impl rule__MultiReference__Group__1 ;
    public final void rule__MultiReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1597:1: ( rule__MultiReference__Group__0__Impl rule__MultiReference__Group__1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1598:2: rule__MultiReference__Group__0__Impl rule__MultiReference__Group__1
            {
            pushFollow(FOLLOW_rule__MultiReference__Group__0__Impl_in_rule__MultiReference__Group__03184);
            rule__MultiReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiReference__Group__1_in_rule__MultiReference__Group__03187);
            rule__MultiReference__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiReference__Group__0"


    // $ANTLR start "rule__MultiReference__Group__0__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1605:1: rule__MultiReference__Group__0__Impl : ( () ) ;
    public final void rule__MultiReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1609:1: ( ( () ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1610:1: ( () )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1610:1: ( () )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1611:1: ()
            {
             before(grammarAccess.getMultiReferenceAccess().getMultiReferenceAction_0()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1612:1: ()
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1614:1: 
            {
            }

             after(grammarAccess.getMultiReferenceAccess().getMultiReferenceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiReference__Group__0__Impl"


    // $ANTLR start "rule__MultiReference__Group__1"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1624:1: rule__MultiReference__Group__1 : rule__MultiReference__Group__1__Impl rule__MultiReference__Group__2 ;
    public final void rule__MultiReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1628:1: ( rule__MultiReference__Group__1__Impl rule__MultiReference__Group__2 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1629:2: rule__MultiReference__Group__1__Impl rule__MultiReference__Group__2
            {
            pushFollow(FOLLOW_rule__MultiReference__Group__1__Impl_in_rule__MultiReference__Group__13245);
            rule__MultiReference__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiReference__Group__2_in_rule__MultiReference__Group__13248);
            rule__MultiReference__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiReference__Group__1"


    // $ANTLR start "rule__MultiReference__Group__1__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1636:1: rule__MultiReference__Group__1__Impl : ( 'var' ) ;
    public final void rule__MultiReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1640:1: ( ( 'var' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1641:1: ( 'var' )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1641:1: ( 'var' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1642:1: 'var'
            {
             before(grammarAccess.getMultiReferenceAccess().getVarKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__MultiReference__Group__1__Impl3276); 
             after(grammarAccess.getMultiReferenceAccess().getVarKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiReference__Group__1__Impl"


    // $ANTLR start "rule__MultiReference__Group__2"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1655:1: rule__MultiReference__Group__2 : rule__MultiReference__Group__2__Impl rule__MultiReference__Group__3 ;
    public final void rule__MultiReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1659:1: ( rule__MultiReference__Group__2__Impl rule__MultiReference__Group__3 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1660:2: rule__MultiReference__Group__2__Impl rule__MultiReference__Group__3
            {
            pushFollow(FOLLOW_rule__MultiReference__Group__2__Impl_in_rule__MultiReference__Group__23307);
            rule__MultiReference__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiReference__Group__3_in_rule__MultiReference__Group__23310);
            rule__MultiReference__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiReference__Group__2"


    // $ANTLR start "rule__MultiReference__Group__2__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1667:1: rule__MultiReference__Group__2__Impl : ( ( rule__MultiReference__NameAssignment_2 ) ) ;
    public final void rule__MultiReference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1671:1: ( ( ( rule__MultiReference__NameAssignment_2 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1672:1: ( ( rule__MultiReference__NameAssignment_2 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1672:1: ( ( rule__MultiReference__NameAssignment_2 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1673:1: ( rule__MultiReference__NameAssignment_2 )
            {
             before(grammarAccess.getMultiReferenceAccess().getNameAssignment_2()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1674:1: ( rule__MultiReference__NameAssignment_2 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1674:2: rule__MultiReference__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__MultiReference__NameAssignment_2_in_rule__MultiReference__Group__2__Impl3337);
            rule__MultiReference__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMultiReferenceAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiReference__Group__2__Impl"


    // $ANTLR start "rule__MultiReference__Group__3"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1684:1: rule__MultiReference__Group__3 : rule__MultiReference__Group__3__Impl rule__MultiReference__Group__4 ;
    public final void rule__MultiReference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1688:1: ( rule__MultiReference__Group__3__Impl rule__MultiReference__Group__4 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1689:2: rule__MultiReference__Group__3__Impl rule__MultiReference__Group__4
            {
            pushFollow(FOLLOW_rule__MultiReference__Group__3__Impl_in_rule__MultiReference__Group__33367);
            rule__MultiReference__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiReference__Group__4_in_rule__MultiReference__Group__33370);
            rule__MultiReference__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiReference__Group__3"


    // $ANTLR start "rule__MultiReference__Group__3__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1696:1: rule__MultiReference__Group__3__Impl : ( ( rule__MultiReference__ReferenceAssignment_3 ) ) ;
    public final void rule__MultiReference__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1700:1: ( ( ( rule__MultiReference__ReferenceAssignment_3 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1701:1: ( ( rule__MultiReference__ReferenceAssignment_3 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1701:1: ( ( rule__MultiReference__ReferenceAssignment_3 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1702:1: ( rule__MultiReference__ReferenceAssignment_3 )
            {
             before(grammarAccess.getMultiReferenceAccess().getReferenceAssignment_3()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1703:1: ( rule__MultiReference__ReferenceAssignment_3 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1703:2: rule__MultiReference__ReferenceAssignment_3
            {
            pushFollow(FOLLOW_rule__MultiReference__ReferenceAssignment_3_in_rule__MultiReference__Group__3__Impl3397);
            rule__MultiReference__ReferenceAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMultiReferenceAccess().getReferenceAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiReference__Group__3__Impl"


    // $ANTLR start "rule__MultiReference__Group__4"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1713:1: rule__MultiReference__Group__4 : rule__MultiReference__Group__4__Impl rule__MultiReference__Group__5 ;
    public final void rule__MultiReference__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1717:1: ( rule__MultiReference__Group__4__Impl rule__MultiReference__Group__5 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1718:2: rule__MultiReference__Group__4__Impl rule__MultiReference__Group__5
            {
            pushFollow(FOLLOW_rule__MultiReference__Group__4__Impl_in_rule__MultiReference__Group__43427);
            rule__MultiReference__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiReference__Group__5_in_rule__MultiReference__Group__43430);
            rule__MultiReference__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiReference__Group__4"


    // $ANTLR start "rule__MultiReference__Group__4__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1725:1: rule__MultiReference__Group__4__Impl : ( '[]' ) ;
    public final void rule__MultiReference__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1729:1: ( ( '[]' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1730:1: ( '[]' )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1730:1: ( '[]' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1731:1: '[]'
            {
             before(grammarAccess.getMultiReferenceAccess().getLeftSquareBracketRightSquareBracketKeyword_4()); 
            match(input,25,FOLLOW_25_in_rule__MultiReference__Group__4__Impl3458); 
             after(grammarAccess.getMultiReferenceAccess().getLeftSquareBracketRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiReference__Group__4__Impl"


    // $ANTLR start "rule__MultiReference__Group__5"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1744:1: rule__MultiReference__Group__5 : rule__MultiReference__Group__5__Impl rule__MultiReference__Group__6 ;
    public final void rule__MultiReference__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1748:1: ( rule__MultiReference__Group__5__Impl rule__MultiReference__Group__6 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1749:2: rule__MultiReference__Group__5__Impl rule__MultiReference__Group__6
            {
            pushFollow(FOLLOW_rule__MultiReference__Group__5__Impl_in_rule__MultiReference__Group__53489);
            rule__MultiReference__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiReference__Group__6_in_rule__MultiReference__Group__53492);
            rule__MultiReference__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiReference__Group__5"


    // $ANTLR start "rule__MultiReference__Group__5__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1756:1: rule__MultiReference__Group__5__Impl : ( ( rule__MultiReference__UniqueAssignment_5 )? ) ;
    public final void rule__MultiReference__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1760:1: ( ( ( rule__MultiReference__UniqueAssignment_5 )? ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1761:1: ( ( rule__MultiReference__UniqueAssignment_5 )? )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1761:1: ( ( rule__MultiReference__UniqueAssignment_5 )? )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1762:1: ( rule__MultiReference__UniqueAssignment_5 )?
            {
             before(grammarAccess.getMultiReferenceAccess().getUniqueAssignment_5()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1763:1: ( rule__MultiReference__UniqueAssignment_5 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==27) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1763:2: rule__MultiReference__UniqueAssignment_5
                    {
                    pushFollow(FOLLOW_rule__MultiReference__UniqueAssignment_5_in_rule__MultiReference__Group__5__Impl3519);
                    rule__MultiReference__UniqueAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMultiReferenceAccess().getUniqueAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiReference__Group__5__Impl"


    // $ANTLR start "rule__MultiReference__Group__6"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1773:1: rule__MultiReference__Group__6 : rule__MultiReference__Group__6__Impl ;
    public final void rule__MultiReference__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1777:1: ( rule__MultiReference__Group__6__Impl )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1778:2: rule__MultiReference__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__MultiReference__Group__6__Impl_in_rule__MultiReference__Group__63550);
            rule__MultiReference__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiReference__Group__6"


    // $ANTLR start "rule__MultiReference__Group__6__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1784:1: rule__MultiReference__Group__6__Impl : ( ( rule__MultiReference__Group_6__0 )? ) ;
    public final void rule__MultiReference__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1788:1: ( ( ( rule__MultiReference__Group_6__0 )? ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1789:1: ( ( rule__MultiReference__Group_6__0 )? )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1789:1: ( ( rule__MultiReference__Group_6__0 )? )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1790:1: ( rule__MultiReference__Group_6__0 )?
            {
             before(grammarAccess.getMultiReferenceAccess().getGroup_6()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1791:1: ( rule__MultiReference__Group_6__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1791:2: rule__MultiReference__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__MultiReference__Group_6__0_in_rule__MultiReference__Group__6__Impl3577);
                    rule__MultiReference__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMultiReferenceAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiReference__Group__6__Impl"


    // $ANTLR start "rule__MultiReference__Group_6__0"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1815:1: rule__MultiReference__Group_6__0 : rule__MultiReference__Group_6__0__Impl rule__MultiReference__Group_6__1 ;
    public final void rule__MultiReference__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1819:1: ( rule__MultiReference__Group_6__0__Impl rule__MultiReference__Group_6__1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1820:2: rule__MultiReference__Group_6__0__Impl rule__MultiReference__Group_6__1
            {
            pushFollow(FOLLOW_rule__MultiReference__Group_6__0__Impl_in_rule__MultiReference__Group_6__03622);
            rule__MultiReference__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiReference__Group_6__1_in_rule__MultiReference__Group_6__03625);
            rule__MultiReference__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiReference__Group_6__0"


    // $ANTLR start "rule__MultiReference__Group_6__0__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1827:1: rule__MultiReference__Group_6__0__Impl : ( 'opposite' ) ;
    public final void rule__MultiReference__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1831:1: ( ( 'opposite' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1832:1: ( 'opposite' )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1832:1: ( 'opposite' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1833:1: 'opposite'
            {
             before(grammarAccess.getMultiReferenceAccess().getOppositeKeyword_6_0()); 
            match(input,24,FOLLOW_24_in_rule__MultiReference__Group_6__0__Impl3653); 
             after(grammarAccess.getMultiReferenceAccess().getOppositeKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiReference__Group_6__0__Impl"


    // $ANTLR start "rule__MultiReference__Group_6__1"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1846:1: rule__MultiReference__Group_6__1 : rule__MultiReference__Group_6__1__Impl ;
    public final void rule__MultiReference__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1850:1: ( rule__MultiReference__Group_6__1__Impl )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1851:2: rule__MultiReference__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__MultiReference__Group_6__1__Impl_in_rule__MultiReference__Group_6__13684);
            rule__MultiReference__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiReference__Group_6__1"


    // $ANTLR start "rule__MultiReference__Group_6__1__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1857:1: rule__MultiReference__Group_6__1__Impl : ( ( rule__MultiReference__OppositeAssignment_6_1 ) ) ;
    public final void rule__MultiReference__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1861:1: ( ( ( rule__MultiReference__OppositeAssignment_6_1 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1862:1: ( ( rule__MultiReference__OppositeAssignment_6_1 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1862:1: ( ( rule__MultiReference__OppositeAssignment_6_1 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1863:1: ( rule__MultiReference__OppositeAssignment_6_1 )
            {
             before(grammarAccess.getMultiReferenceAccess().getOppositeAssignment_6_1()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1864:1: ( rule__MultiReference__OppositeAssignment_6_1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1864:2: rule__MultiReference__OppositeAssignment_6_1
            {
            pushFollow(FOLLOW_rule__MultiReference__OppositeAssignment_6_1_in_rule__MultiReference__Group_6__1__Impl3711);
            rule__MultiReference__OppositeAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiReferenceAccess().getOppositeAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiReference__Group_6__1__Impl"


    // $ANTLR start "rule__SingleDataType__Group__0"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1878:1: rule__SingleDataType__Group__0 : rule__SingleDataType__Group__0__Impl rule__SingleDataType__Group__1 ;
    public final void rule__SingleDataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1882:1: ( rule__SingleDataType__Group__0__Impl rule__SingleDataType__Group__1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1883:2: rule__SingleDataType__Group__0__Impl rule__SingleDataType__Group__1
            {
            pushFollow(FOLLOW_rule__SingleDataType__Group__0__Impl_in_rule__SingleDataType__Group__03745);
            rule__SingleDataType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SingleDataType__Group__1_in_rule__SingleDataType__Group__03748);
            rule__SingleDataType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleDataType__Group__0"


    // $ANTLR start "rule__SingleDataType__Group__0__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1890:1: rule__SingleDataType__Group__0__Impl : ( () ) ;
    public final void rule__SingleDataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1894:1: ( ( () ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1895:1: ( () )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1895:1: ( () )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1896:1: ()
            {
             before(grammarAccess.getSingleDataTypeAccess().getSingleDataTypeAction_0()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1897:1: ()
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1899:1: 
            {
            }

             after(grammarAccess.getSingleDataTypeAccess().getSingleDataTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleDataType__Group__0__Impl"


    // $ANTLR start "rule__SingleDataType__Group__1"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1909:1: rule__SingleDataType__Group__1 : rule__SingleDataType__Group__1__Impl rule__SingleDataType__Group__2 ;
    public final void rule__SingleDataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1913:1: ( rule__SingleDataType__Group__1__Impl rule__SingleDataType__Group__2 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1914:2: rule__SingleDataType__Group__1__Impl rule__SingleDataType__Group__2
            {
            pushFollow(FOLLOW_rule__SingleDataType__Group__1__Impl_in_rule__SingleDataType__Group__13806);
            rule__SingleDataType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SingleDataType__Group__2_in_rule__SingleDataType__Group__13809);
            rule__SingleDataType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleDataType__Group__1"


    // $ANTLR start "rule__SingleDataType__Group__1__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1921:1: rule__SingleDataType__Group__1__Impl : ( 'var' ) ;
    public final void rule__SingleDataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1925:1: ( ( 'var' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1926:1: ( 'var' )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1926:1: ( 'var' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1927:1: 'var'
            {
             before(grammarAccess.getSingleDataTypeAccess().getVarKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__SingleDataType__Group__1__Impl3837); 
             after(grammarAccess.getSingleDataTypeAccess().getVarKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleDataType__Group__1__Impl"


    // $ANTLR start "rule__SingleDataType__Group__2"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1940:1: rule__SingleDataType__Group__2 : rule__SingleDataType__Group__2__Impl rule__SingleDataType__Group__3 ;
    public final void rule__SingleDataType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1944:1: ( rule__SingleDataType__Group__2__Impl rule__SingleDataType__Group__3 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1945:2: rule__SingleDataType__Group__2__Impl rule__SingleDataType__Group__3
            {
            pushFollow(FOLLOW_rule__SingleDataType__Group__2__Impl_in_rule__SingleDataType__Group__23868);
            rule__SingleDataType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SingleDataType__Group__3_in_rule__SingleDataType__Group__23871);
            rule__SingleDataType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleDataType__Group__2"


    // $ANTLR start "rule__SingleDataType__Group__2__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1952:1: rule__SingleDataType__Group__2__Impl : ( ( rule__SingleDataType__NameAssignment_2 ) ) ;
    public final void rule__SingleDataType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1956:1: ( ( ( rule__SingleDataType__NameAssignment_2 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1957:1: ( ( rule__SingleDataType__NameAssignment_2 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1957:1: ( ( rule__SingleDataType__NameAssignment_2 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1958:1: ( rule__SingleDataType__NameAssignment_2 )
            {
             before(grammarAccess.getSingleDataTypeAccess().getNameAssignment_2()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1959:1: ( rule__SingleDataType__NameAssignment_2 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1959:2: rule__SingleDataType__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__SingleDataType__NameAssignment_2_in_rule__SingleDataType__Group__2__Impl3898);
            rule__SingleDataType__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSingleDataTypeAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleDataType__Group__2__Impl"


    // $ANTLR start "rule__SingleDataType__Group__3"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1969:1: rule__SingleDataType__Group__3 : rule__SingleDataType__Group__3__Impl rule__SingleDataType__Group__4 ;
    public final void rule__SingleDataType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1973:1: ( rule__SingleDataType__Group__3__Impl rule__SingleDataType__Group__4 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1974:2: rule__SingleDataType__Group__3__Impl rule__SingleDataType__Group__4
            {
            pushFollow(FOLLOW_rule__SingleDataType__Group__3__Impl_in_rule__SingleDataType__Group__33928);
            rule__SingleDataType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SingleDataType__Group__4_in_rule__SingleDataType__Group__33931);
            rule__SingleDataType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleDataType__Group__3"


    // $ANTLR start "rule__SingleDataType__Group__3__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1981:1: rule__SingleDataType__Group__3__Impl : ( ( rule__SingleDataType__TypeAssignment_3 ) ) ;
    public final void rule__SingleDataType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1985:1: ( ( ( rule__SingleDataType__TypeAssignment_3 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1986:1: ( ( rule__SingleDataType__TypeAssignment_3 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1986:1: ( ( rule__SingleDataType__TypeAssignment_3 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1987:1: ( rule__SingleDataType__TypeAssignment_3 )
            {
             before(grammarAccess.getSingleDataTypeAccess().getTypeAssignment_3()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1988:1: ( rule__SingleDataType__TypeAssignment_3 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1988:2: rule__SingleDataType__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__SingleDataType__TypeAssignment_3_in_rule__SingleDataType__Group__3__Impl3958);
            rule__SingleDataType__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSingleDataTypeAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleDataType__Group__3__Impl"


    // $ANTLR start "rule__SingleDataType__Group__4"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1998:1: rule__SingleDataType__Group__4 : rule__SingleDataType__Group__4__Impl ;
    public final void rule__SingleDataType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2002:1: ( rule__SingleDataType__Group__4__Impl )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2003:2: rule__SingleDataType__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__SingleDataType__Group__4__Impl_in_rule__SingleDataType__Group__43988);
            rule__SingleDataType__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleDataType__Group__4"


    // $ANTLR start "rule__SingleDataType__Group__4__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2009:1: rule__SingleDataType__Group__4__Impl : ( ( rule__SingleDataType__Group_4__0 )? ) ;
    public final void rule__SingleDataType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2013:1: ( ( ( rule__SingleDataType__Group_4__0 )? ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2014:1: ( ( rule__SingleDataType__Group_4__0 )? )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2014:1: ( ( rule__SingleDataType__Group_4__0 )? )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2015:1: ( rule__SingleDataType__Group_4__0 )?
            {
             before(grammarAccess.getSingleDataTypeAccess().getGroup_4()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2016:1: ( rule__SingleDataType__Group_4__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==24) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2016:2: rule__SingleDataType__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__SingleDataType__Group_4__0_in_rule__SingleDataType__Group__4__Impl4015);
                    rule__SingleDataType__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSingleDataTypeAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleDataType__Group__4__Impl"


    // $ANTLR start "rule__SingleDataType__Group_4__0"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2036:1: rule__SingleDataType__Group_4__0 : rule__SingleDataType__Group_4__0__Impl rule__SingleDataType__Group_4__1 ;
    public final void rule__SingleDataType__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2040:1: ( rule__SingleDataType__Group_4__0__Impl rule__SingleDataType__Group_4__1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2041:2: rule__SingleDataType__Group_4__0__Impl rule__SingleDataType__Group_4__1
            {
            pushFollow(FOLLOW_rule__SingleDataType__Group_4__0__Impl_in_rule__SingleDataType__Group_4__04056);
            rule__SingleDataType__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SingleDataType__Group_4__1_in_rule__SingleDataType__Group_4__04059);
            rule__SingleDataType__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleDataType__Group_4__0"


    // $ANTLR start "rule__SingleDataType__Group_4__0__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2048:1: rule__SingleDataType__Group_4__0__Impl : ( 'opposite' ) ;
    public final void rule__SingleDataType__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2052:1: ( ( 'opposite' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2053:1: ( 'opposite' )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2053:1: ( 'opposite' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2054:1: 'opposite'
            {
             before(grammarAccess.getSingleDataTypeAccess().getOppositeKeyword_4_0()); 
            match(input,24,FOLLOW_24_in_rule__SingleDataType__Group_4__0__Impl4087); 
             after(grammarAccess.getSingleDataTypeAccess().getOppositeKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleDataType__Group_4__0__Impl"


    // $ANTLR start "rule__SingleDataType__Group_4__1"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2067:1: rule__SingleDataType__Group_4__1 : rule__SingleDataType__Group_4__1__Impl ;
    public final void rule__SingleDataType__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2071:1: ( rule__SingleDataType__Group_4__1__Impl )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2072:2: rule__SingleDataType__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__SingleDataType__Group_4__1__Impl_in_rule__SingleDataType__Group_4__14118);
            rule__SingleDataType__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleDataType__Group_4__1"


    // $ANTLR start "rule__SingleDataType__Group_4__1__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2078:1: rule__SingleDataType__Group_4__1__Impl : ( ( rule__SingleDataType__OppositeAssignment_4_1 ) ) ;
    public final void rule__SingleDataType__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2082:1: ( ( ( rule__SingleDataType__OppositeAssignment_4_1 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2083:1: ( ( rule__SingleDataType__OppositeAssignment_4_1 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2083:1: ( ( rule__SingleDataType__OppositeAssignment_4_1 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2084:1: ( rule__SingleDataType__OppositeAssignment_4_1 )
            {
             before(grammarAccess.getSingleDataTypeAccess().getOppositeAssignment_4_1()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2085:1: ( rule__SingleDataType__OppositeAssignment_4_1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2085:2: rule__SingleDataType__OppositeAssignment_4_1
            {
            pushFollow(FOLLOW_rule__SingleDataType__OppositeAssignment_4_1_in_rule__SingleDataType__Group_4__1__Impl4145);
            rule__SingleDataType__OppositeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSingleDataTypeAccess().getOppositeAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleDataType__Group_4__1__Impl"


    // $ANTLR start "rule__MultiDataType__Group__0"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2099:1: rule__MultiDataType__Group__0 : rule__MultiDataType__Group__0__Impl rule__MultiDataType__Group__1 ;
    public final void rule__MultiDataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2103:1: ( rule__MultiDataType__Group__0__Impl rule__MultiDataType__Group__1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2104:2: rule__MultiDataType__Group__0__Impl rule__MultiDataType__Group__1
            {
            pushFollow(FOLLOW_rule__MultiDataType__Group__0__Impl_in_rule__MultiDataType__Group__04179);
            rule__MultiDataType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiDataType__Group__1_in_rule__MultiDataType__Group__04182);
            rule__MultiDataType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiDataType__Group__0"


    // $ANTLR start "rule__MultiDataType__Group__0__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2111:1: rule__MultiDataType__Group__0__Impl : ( () ) ;
    public final void rule__MultiDataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2115:1: ( ( () ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2116:1: ( () )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2116:1: ( () )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2117:1: ()
            {
             before(grammarAccess.getMultiDataTypeAccess().getMultiDataTypeAction_0()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2118:1: ()
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2120:1: 
            {
            }

             after(grammarAccess.getMultiDataTypeAccess().getMultiDataTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiDataType__Group__0__Impl"


    // $ANTLR start "rule__MultiDataType__Group__1"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2130:1: rule__MultiDataType__Group__1 : rule__MultiDataType__Group__1__Impl rule__MultiDataType__Group__2 ;
    public final void rule__MultiDataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2134:1: ( rule__MultiDataType__Group__1__Impl rule__MultiDataType__Group__2 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2135:2: rule__MultiDataType__Group__1__Impl rule__MultiDataType__Group__2
            {
            pushFollow(FOLLOW_rule__MultiDataType__Group__1__Impl_in_rule__MultiDataType__Group__14240);
            rule__MultiDataType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiDataType__Group__2_in_rule__MultiDataType__Group__14243);
            rule__MultiDataType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiDataType__Group__1"


    // $ANTLR start "rule__MultiDataType__Group__1__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2142:1: rule__MultiDataType__Group__1__Impl : ( 'var' ) ;
    public final void rule__MultiDataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2146:1: ( ( 'var' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2147:1: ( 'var' )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2147:1: ( 'var' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2148:1: 'var'
            {
             before(grammarAccess.getMultiDataTypeAccess().getVarKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__MultiDataType__Group__1__Impl4271); 
             after(grammarAccess.getMultiDataTypeAccess().getVarKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiDataType__Group__1__Impl"


    // $ANTLR start "rule__MultiDataType__Group__2"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2161:1: rule__MultiDataType__Group__2 : rule__MultiDataType__Group__2__Impl rule__MultiDataType__Group__3 ;
    public final void rule__MultiDataType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2165:1: ( rule__MultiDataType__Group__2__Impl rule__MultiDataType__Group__3 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2166:2: rule__MultiDataType__Group__2__Impl rule__MultiDataType__Group__3
            {
            pushFollow(FOLLOW_rule__MultiDataType__Group__2__Impl_in_rule__MultiDataType__Group__24302);
            rule__MultiDataType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiDataType__Group__3_in_rule__MultiDataType__Group__24305);
            rule__MultiDataType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiDataType__Group__2"


    // $ANTLR start "rule__MultiDataType__Group__2__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2173:1: rule__MultiDataType__Group__2__Impl : ( ( rule__MultiDataType__NameAssignment_2 ) ) ;
    public final void rule__MultiDataType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2177:1: ( ( ( rule__MultiDataType__NameAssignment_2 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2178:1: ( ( rule__MultiDataType__NameAssignment_2 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2178:1: ( ( rule__MultiDataType__NameAssignment_2 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2179:1: ( rule__MultiDataType__NameAssignment_2 )
            {
             before(grammarAccess.getMultiDataTypeAccess().getNameAssignment_2()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2180:1: ( rule__MultiDataType__NameAssignment_2 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2180:2: rule__MultiDataType__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__MultiDataType__NameAssignment_2_in_rule__MultiDataType__Group__2__Impl4332);
            rule__MultiDataType__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMultiDataTypeAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiDataType__Group__2__Impl"


    // $ANTLR start "rule__MultiDataType__Group__3"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2190:1: rule__MultiDataType__Group__3 : rule__MultiDataType__Group__3__Impl rule__MultiDataType__Group__4 ;
    public final void rule__MultiDataType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2194:1: ( rule__MultiDataType__Group__3__Impl rule__MultiDataType__Group__4 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2195:2: rule__MultiDataType__Group__3__Impl rule__MultiDataType__Group__4
            {
            pushFollow(FOLLOW_rule__MultiDataType__Group__3__Impl_in_rule__MultiDataType__Group__34362);
            rule__MultiDataType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiDataType__Group__4_in_rule__MultiDataType__Group__34365);
            rule__MultiDataType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiDataType__Group__3"


    // $ANTLR start "rule__MultiDataType__Group__3__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2202:1: rule__MultiDataType__Group__3__Impl : ( ( rule__MultiDataType__TypeAssignment_3 ) ) ;
    public final void rule__MultiDataType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2206:1: ( ( ( rule__MultiDataType__TypeAssignment_3 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2207:1: ( ( rule__MultiDataType__TypeAssignment_3 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2207:1: ( ( rule__MultiDataType__TypeAssignment_3 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2208:1: ( rule__MultiDataType__TypeAssignment_3 )
            {
             before(grammarAccess.getMultiDataTypeAccess().getTypeAssignment_3()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2209:1: ( rule__MultiDataType__TypeAssignment_3 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2209:2: rule__MultiDataType__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__MultiDataType__TypeAssignment_3_in_rule__MultiDataType__Group__3__Impl4392);
            rule__MultiDataType__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMultiDataTypeAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiDataType__Group__3__Impl"


    // $ANTLR start "rule__MultiDataType__Group__4"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2219:1: rule__MultiDataType__Group__4 : rule__MultiDataType__Group__4__Impl rule__MultiDataType__Group__5 ;
    public final void rule__MultiDataType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2223:1: ( rule__MultiDataType__Group__4__Impl rule__MultiDataType__Group__5 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2224:2: rule__MultiDataType__Group__4__Impl rule__MultiDataType__Group__5
            {
            pushFollow(FOLLOW_rule__MultiDataType__Group__4__Impl_in_rule__MultiDataType__Group__44422);
            rule__MultiDataType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiDataType__Group__5_in_rule__MultiDataType__Group__44425);
            rule__MultiDataType__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiDataType__Group__4"


    // $ANTLR start "rule__MultiDataType__Group__4__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2231:1: rule__MultiDataType__Group__4__Impl : ( '[]' ) ;
    public final void rule__MultiDataType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2235:1: ( ( '[]' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2236:1: ( '[]' )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2236:1: ( '[]' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2237:1: '[]'
            {
             before(grammarAccess.getMultiDataTypeAccess().getLeftSquareBracketRightSquareBracketKeyword_4()); 
            match(input,25,FOLLOW_25_in_rule__MultiDataType__Group__4__Impl4453); 
             after(grammarAccess.getMultiDataTypeAccess().getLeftSquareBracketRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiDataType__Group__4__Impl"


    // $ANTLR start "rule__MultiDataType__Group__5"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2250:1: rule__MultiDataType__Group__5 : rule__MultiDataType__Group__5__Impl rule__MultiDataType__Group__6 ;
    public final void rule__MultiDataType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2254:1: ( rule__MultiDataType__Group__5__Impl rule__MultiDataType__Group__6 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2255:2: rule__MultiDataType__Group__5__Impl rule__MultiDataType__Group__6
            {
            pushFollow(FOLLOW_rule__MultiDataType__Group__5__Impl_in_rule__MultiDataType__Group__54484);
            rule__MultiDataType__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiDataType__Group__6_in_rule__MultiDataType__Group__54487);
            rule__MultiDataType__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiDataType__Group__5"


    // $ANTLR start "rule__MultiDataType__Group__5__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2262:1: rule__MultiDataType__Group__5__Impl : ( ( rule__MultiDataType__UniqueAssignment_5 )? ) ;
    public final void rule__MultiDataType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2266:1: ( ( ( rule__MultiDataType__UniqueAssignment_5 )? ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2267:1: ( ( rule__MultiDataType__UniqueAssignment_5 )? )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2267:1: ( ( rule__MultiDataType__UniqueAssignment_5 )? )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2268:1: ( rule__MultiDataType__UniqueAssignment_5 )?
            {
             before(grammarAccess.getMultiDataTypeAccess().getUniqueAssignment_5()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2269:1: ( rule__MultiDataType__UniqueAssignment_5 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==27) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2269:2: rule__MultiDataType__UniqueAssignment_5
                    {
                    pushFollow(FOLLOW_rule__MultiDataType__UniqueAssignment_5_in_rule__MultiDataType__Group__5__Impl4514);
                    rule__MultiDataType__UniqueAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMultiDataTypeAccess().getUniqueAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiDataType__Group__5__Impl"


    // $ANTLR start "rule__MultiDataType__Group__6"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2279:1: rule__MultiDataType__Group__6 : rule__MultiDataType__Group__6__Impl ;
    public final void rule__MultiDataType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2283:1: ( rule__MultiDataType__Group__6__Impl )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2284:2: rule__MultiDataType__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__MultiDataType__Group__6__Impl_in_rule__MultiDataType__Group__64545);
            rule__MultiDataType__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiDataType__Group__6"


    // $ANTLR start "rule__MultiDataType__Group__6__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2290:1: rule__MultiDataType__Group__6__Impl : ( ( rule__MultiDataType__Group_6__0 )? ) ;
    public final void rule__MultiDataType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2294:1: ( ( ( rule__MultiDataType__Group_6__0 )? ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2295:1: ( ( rule__MultiDataType__Group_6__0 )? )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2295:1: ( ( rule__MultiDataType__Group_6__0 )? )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2296:1: ( rule__MultiDataType__Group_6__0 )?
            {
             before(grammarAccess.getMultiDataTypeAccess().getGroup_6()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2297:1: ( rule__MultiDataType__Group_6__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==24) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2297:2: rule__MultiDataType__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__MultiDataType__Group_6__0_in_rule__MultiDataType__Group__6__Impl4572);
                    rule__MultiDataType__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMultiDataTypeAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiDataType__Group__6__Impl"


    // $ANTLR start "rule__MultiDataType__Group_6__0"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2321:1: rule__MultiDataType__Group_6__0 : rule__MultiDataType__Group_6__0__Impl rule__MultiDataType__Group_6__1 ;
    public final void rule__MultiDataType__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2325:1: ( rule__MultiDataType__Group_6__0__Impl rule__MultiDataType__Group_6__1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2326:2: rule__MultiDataType__Group_6__0__Impl rule__MultiDataType__Group_6__1
            {
            pushFollow(FOLLOW_rule__MultiDataType__Group_6__0__Impl_in_rule__MultiDataType__Group_6__04617);
            rule__MultiDataType__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiDataType__Group_6__1_in_rule__MultiDataType__Group_6__04620);
            rule__MultiDataType__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiDataType__Group_6__0"


    // $ANTLR start "rule__MultiDataType__Group_6__0__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2333:1: rule__MultiDataType__Group_6__0__Impl : ( 'opposite' ) ;
    public final void rule__MultiDataType__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2337:1: ( ( 'opposite' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2338:1: ( 'opposite' )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2338:1: ( 'opposite' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2339:1: 'opposite'
            {
             before(grammarAccess.getMultiDataTypeAccess().getOppositeKeyword_6_0()); 
            match(input,24,FOLLOW_24_in_rule__MultiDataType__Group_6__0__Impl4648); 
             after(grammarAccess.getMultiDataTypeAccess().getOppositeKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiDataType__Group_6__0__Impl"


    // $ANTLR start "rule__MultiDataType__Group_6__1"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2352:1: rule__MultiDataType__Group_6__1 : rule__MultiDataType__Group_6__1__Impl ;
    public final void rule__MultiDataType__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2356:1: ( rule__MultiDataType__Group_6__1__Impl )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2357:2: rule__MultiDataType__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__MultiDataType__Group_6__1__Impl_in_rule__MultiDataType__Group_6__14679);
            rule__MultiDataType__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiDataType__Group_6__1"


    // $ANTLR start "rule__MultiDataType__Group_6__1__Impl"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2363:1: rule__MultiDataType__Group_6__1__Impl : ( ( rule__MultiDataType__OppositeAssignment_6_1 ) ) ;
    public final void rule__MultiDataType__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2367:1: ( ( ( rule__MultiDataType__OppositeAssignment_6_1 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2368:1: ( ( rule__MultiDataType__OppositeAssignment_6_1 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2368:1: ( ( rule__MultiDataType__OppositeAssignment_6_1 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2369:1: ( rule__MultiDataType__OppositeAssignment_6_1 )
            {
             before(grammarAccess.getMultiDataTypeAccess().getOppositeAssignment_6_1()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2370:1: ( rule__MultiDataType__OppositeAssignment_6_1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2370:2: rule__MultiDataType__OppositeAssignment_6_1
            {
            pushFollow(FOLLOW_rule__MultiDataType__OppositeAssignment_6_1_in_rule__MultiDataType__Group_6__1__Impl4706);
            rule__MultiDataType__OppositeAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiDataTypeAccess().getOppositeAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiDataType__Group_6__1__Impl"


    // $ANTLR start "rule__QUALIFIED_NAME__Group__0"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2384:1: rule__QUALIFIED_NAME__Group__0 : rule__QUALIFIED_NAME__Group__0__Impl rule__QUALIFIED_NAME__Group__1 ;
    public final void rule__QUALIFIED_NAME__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2388:1: ( rule__QUALIFIED_NAME__Group__0__Impl rule__QUALIFIED_NAME__Group__1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2389:2: rule__QUALIFIED_NAME__Group__0__Impl rule__QUALIFIED_NAME__Group__1
            {
            pushFollow(FOLLOW_rule__QUALIFIED_NAME__Group__0__Impl_in_rule__QUALIFIED_NAME__Group__04740);
            rule__QUALIFIED_NAME__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QUALIFIED_NAME__Group__1_in_rule__QUALIFIED_NAME__Group__04743);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2396:1: rule__QUALIFIED_NAME__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QUALIFIED_NAME__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2400:1: ( ( RULE_ID ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2401:1: ( RULE_ID )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2401:1: ( RULE_ID )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2402:1: RULE_ID
            {
             before(grammarAccess.getQUALIFIED_NAMEAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QUALIFIED_NAME__Group__0__Impl4770); 
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2413:1: rule__QUALIFIED_NAME__Group__1 : rule__QUALIFIED_NAME__Group__1__Impl ;
    public final void rule__QUALIFIED_NAME__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2417:1: ( rule__QUALIFIED_NAME__Group__1__Impl )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2418:2: rule__QUALIFIED_NAME__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QUALIFIED_NAME__Group__1__Impl_in_rule__QUALIFIED_NAME__Group__14799);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2424:1: rule__QUALIFIED_NAME__Group__1__Impl : ( ( rule__QUALIFIED_NAME__Group_1__0 )* ) ;
    public final void rule__QUALIFIED_NAME__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2428:1: ( ( ( rule__QUALIFIED_NAME__Group_1__0 )* ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2429:1: ( ( rule__QUALIFIED_NAME__Group_1__0 )* )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2429:1: ( ( rule__QUALIFIED_NAME__Group_1__0 )* )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2430:1: ( rule__QUALIFIED_NAME__Group_1__0 )*
            {
             before(grammarAccess.getQUALIFIED_NAMEAccess().getGroup_1()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2431:1: ( rule__QUALIFIED_NAME__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==26) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2431:2: rule__QUALIFIED_NAME__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QUALIFIED_NAME__Group_1__0_in_rule__QUALIFIED_NAME__Group__1__Impl4826);
            	    rule__QUALIFIED_NAME__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2445:1: rule__QUALIFIED_NAME__Group_1__0 : rule__QUALIFIED_NAME__Group_1__0__Impl rule__QUALIFIED_NAME__Group_1__1 ;
    public final void rule__QUALIFIED_NAME__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2449:1: ( rule__QUALIFIED_NAME__Group_1__0__Impl rule__QUALIFIED_NAME__Group_1__1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2450:2: rule__QUALIFIED_NAME__Group_1__0__Impl rule__QUALIFIED_NAME__Group_1__1
            {
            pushFollow(FOLLOW_rule__QUALIFIED_NAME__Group_1__0__Impl_in_rule__QUALIFIED_NAME__Group_1__04861);
            rule__QUALIFIED_NAME__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QUALIFIED_NAME__Group_1__1_in_rule__QUALIFIED_NAME__Group_1__04864);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2457:1: rule__QUALIFIED_NAME__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QUALIFIED_NAME__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2461:1: ( ( '.' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2462:1: ( '.' )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2462:1: ( '.' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2463:1: '.'
            {
             before(grammarAccess.getQUALIFIED_NAMEAccess().getFullStopKeyword_1_0()); 
            match(input,26,FOLLOW_26_in_rule__QUALIFIED_NAME__Group_1__0__Impl4892); 
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2476:1: rule__QUALIFIED_NAME__Group_1__1 : rule__QUALIFIED_NAME__Group_1__1__Impl ;
    public final void rule__QUALIFIED_NAME__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2480:1: ( rule__QUALIFIED_NAME__Group_1__1__Impl )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2481:2: rule__QUALIFIED_NAME__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QUALIFIED_NAME__Group_1__1__Impl_in_rule__QUALIFIED_NAME__Group_1__14923);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2487:1: rule__QUALIFIED_NAME__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QUALIFIED_NAME__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2491:1: ( ( RULE_ID ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2492:1: ( RULE_ID )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2492:1: ( RULE_ID )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2493:1: RULE_ID
            {
             before(grammarAccess.getQUALIFIED_NAMEAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QUALIFIED_NAME__Group_1__1__Impl4950); 
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2509:1: rule__Module__NameAssignment_2 : ( ruleQUALIFIED_NAME ) ;
    public final void rule__Module__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2513:1: ( ( ruleQUALIFIED_NAME ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2514:1: ( ruleQUALIFIED_NAME )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2514:1: ( ruleQUALIFIED_NAME )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2515:1: ruleQUALIFIED_NAME
            {
             before(grammarAccess.getModuleAccess().getNameQUALIFIED_NAMEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleQUALIFIED_NAME_in_rule__Module__NameAssignment_24988);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2524:1: rule__Module__TypeAssignment_3 : ( ruleInternalDSLType ) ;
    public final void rule__Module__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2528:1: ( ( ruleInternalDSLType ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2529:1: ( ruleInternalDSLType )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2529:1: ( ruleInternalDSLType )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2530:1: ruleInternalDSLType
            {
             before(grammarAccess.getModuleAccess().getTypeInternalDSLTypeEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleInternalDSLType_in_rule__Module__TypeAssignment_35019);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2539:1: rule__Module__PackagesAssignment_4_0 : ( rulePackage ) ;
    public final void rule__Module__PackagesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2543:1: ( ( rulePackage ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2544:1: ( rulePackage )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2544:1: ( rulePackage )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2545:1: rulePackage
            {
             before(grammarAccess.getModuleAccess().getPackagesPackageParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_rulePackage_in_rule__Module__PackagesAssignment_4_05050);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2554:1: rule__Module__PackagesAssignment_4_1 : ( rulePackage ) ;
    public final void rule__Module__PackagesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2558:1: ( ( rulePackage ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2559:1: ( rulePackage )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2559:1: ( rulePackage )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2560:1: rulePackage
            {
             before(grammarAccess.getModuleAccess().getPackagesPackageParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_rulePackage_in_rule__Module__PackagesAssignment_4_15081);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2569:1: rule__Package__NameAssignment_2 : ( ruleQUALIFIED_NAME ) ;
    public final void rule__Package__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2573:1: ( ( ruleQUALIFIED_NAME ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2574:1: ( ruleQUALIFIED_NAME )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2574:1: ( ruleQUALIFIED_NAME )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2575:1: ruleQUALIFIED_NAME
            {
             before(grammarAccess.getPackageAccess().getNameQUALIFIED_NAMEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleQUALIFIED_NAME_in_rule__Package__NameAssignment_25112);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2584:1: rule__Package__EntitiesAssignment_4_0 : ( ruleEntity ) ;
    public final void rule__Package__EntitiesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2588:1: ( ( ruleEntity ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2589:1: ( ruleEntity )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2589:1: ( ruleEntity )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2590:1: ruleEntity
            {
             before(grammarAccess.getPackageAccess().getEntitiesEntityParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_ruleEntity_in_rule__Package__EntitiesAssignment_4_05143);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2599:1: rule__Package__EntitiesAssignment_4_1 : ( ruleEntity ) ;
    public final void rule__Package__EntitiesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2603:1: ( ( ruleEntity ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2604:1: ( ruleEntity )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2604:1: ( ruleEntity )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2605:1: ruleEntity
            {
             before(grammarAccess.getPackageAccess().getEntitiesEntityParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleEntity_in_rule__Package__EntitiesAssignment_4_15174);
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


    // $ANTLR start "rule__Entity__NameAssignment_2"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2614:1: rule__Entity__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2618:1: ( ( RULE_ID ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2619:1: ( RULE_ID )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2619:1: ( RULE_ID )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2620:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_25205); 
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2629:1: rule__Entity__SuperEntityAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__SuperEntityAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2633:1: ( ( ( RULE_ID ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2634:1: ( ( RULE_ID ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2634:1: ( ( RULE_ID ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2635:1: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getSuperEntityEntityCrossReference_3_1_0()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2636:1: ( RULE_ID )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2637:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getSuperEntityEntityIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__SuperEntityAssignment_3_15240); 
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2648:1: rule__Entity__FeaturesAssignment_5_0 : ( ruleFeature ) ;
    public final void rule__Entity__FeaturesAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2652:1: ( ( ruleFeature ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2653:1: ( ruleFeature )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2653:1: ( ruleFeature )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2654:1: ruleFeature
            {
             before(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_ruleFeature_in_rule__Entity__FeaturesAssignment_5_05275);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2663:1: rule__Entity__FeaturesAssignment_5_1 : ( ruleFeature ) ;
    public final void rule__Entity__FeaturesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2667:1: ( ( ruleFeature ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2668:1: ( ruleFeature )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2668:1: ( ruleFeature )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2669:1: ruleFeature
            {
             before(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleFeature_in_rule__Entity__FeaturesAssignment_5_15306);
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


    // $ANTLR start "rule__SingleReference__NameAssignment_2"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2678:1: rule__SingleReference__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__SingleReference__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2682:1: ( ( RULE_ID ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2683:1: ( RULE_ID )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2683:1: ( RULE_ID )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2684:1: RULE_ID
            {
             before(grammarAccess.getSingleReferenceAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SingleReference__NameAssignment_25337); 
             after(grammarAccess.getSingleReferenceAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleReference__NameAssignment_2"


    // $ANTLR start "rule__SingleReference__ReferenceAssignment_3"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2693:1: rule__SingleReference__ReferenceAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__SingleReference__ReferenceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2697:1: ( ( ( RULE_ID ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2698:1: ( ( RULE_ID ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2698:1: ( ( RULE_ID ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2699:1: ( RULE_ID )
            {
             before(grammarAccess.getSingleReferenceAccess().getReferenceEntityCrossReference_3_0()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2700:1: ( RULE_ID )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2701:1: RULE_ID
            {
             before(grammarAccess.getSingleReferenceAccess().getReferenceEntityIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SingleReference__ReferenceAssignment_35372); 
             after(grammarAccess.getSingleReferenceAccess().getReferenceEntityIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getSingleReferenceAccess().getReferenceEntityCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleReference__ReferenceAssignment_3"


    // $ANTLR start "rule__SingleReference__UniqueAssignment_4"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2712:1: rule__SingleReference__UniqueAssignment_4 : ( ( 'unique' ) ) ;
    public final void rule__SingleReference__UniqueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2716:1: ( ( ( 'unique' ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2717:1: ( ( 'unique' ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2717:1: ( ( 'unique' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2718:1: ( 'unique' )
            {
             before(grammarAccess.getSingleReferenceAccess().getUniqueUniqueKeyword_4_0()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2719:1: ( 'unique' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2720:1: 'unique'
            {
             before(grammarAccess.getSingleReferenceAccess().getUniqueUniqueKeyword_4_0()); 
            match(input,27,FOLLOW_27_in_rule__SingleReference__UniqueAssignment_45412); 
             after(grammarAccess.getSingleReferenceAccess().getUniqueUniqueKeyword_4_0()); 

            }

             after(grammarAccess.getSingleReferenceAccess().getUniqueUniqueKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleReference__UniqueAssignment_4"


    // $ANTLR start "rule__SingleReference__OppositeAssignment_5_1"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2735:1: rule__SingleReference__OppositeAssignment_5_1 : ( ( ruleQUALIFIED_NAME ) ) ;
    public final void rule__SingleReference__OppositeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2739:1: ( ( ( ruleQUALIFIED_NAME ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2740:1: ( ( ruleQUALIFIED_NAME ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2740:1: ( ( ruleQUALIFIED_NAME ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2741:1: ( ruleQUALIFIED_NAME )
            {
             before(grammarAccess.getSingleReferenceAccess().getOppositeMultiReferenceCrossReference_5_1_0()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2742:1: ( ruleQUALIFIED_NAME )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2743:1: ruleQUALIFIED_NAME
            {
             before(grammarAccess.getSingleReferenceAccess().getOppositeMultiReferenceQUALIFIED_NAMEParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_ruleQUALIFIED_NAME_in_rule__SingleReference__OppositeAssignment_5_15455);
            ruleQUALIFIED_NAME();

            state._fsp--;

             after(grammarAccess.getSingleReferenceAccess().getOppositeMultiReferenceQUALIFIED_NAMEParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getSingleReferenceAccess().getOppositeMultiReferenceCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleReference__OppositeAssignment_5_1"


    // $ANTLR start "rule__MultiReference__NameAssignment_2"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2754:1: rule__MultiReference__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__MultiReference__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2758:1: ( ( RULE_ID ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2759:1: ( RULE_ID )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2759:1: ( RULE_ID )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2760:1: RULE_ID
            {
             before(grammarAccess.getMultiReferenceAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MultiReference__NameAssignment_25490); 
             after(grammarAccess.getMultiReferenceAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiReference__NameAssignment_2"


    // $ANTLR start "rule__MultiReference__ReferenceAssignment_3"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2769:1: rule__MultiReference__ReferenceAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__MultiReference__ReferenceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2773:1: ( ( ( RULE_ID ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2774:1: ( ( RULE_ID ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2774:1: ( ( RULE_ID ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2775:1: ( RULE_ID )
            {
             before(grammarAccess.getMultiReferenceAccess().getReferenceEntityCrossReference_3_0()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2776:1: ( RULE_ID )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2777:1: RULE_ID
            {
             before(grammarAccess.getMultiReferenceAccess().getReferenceEntityIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MultiReference__ReferenceAssignment_35525); 
             after(grammarAccess.getMultiReferenceAccess().getReferenceEntityIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getMultiReferenceAccess().getReferenceEntityCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiReference__ReferenceAssignment_3"


    // $ANTLR start "rule__MultiReference__UniqueAssignment_5"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2788:1: rule__MultiReference__UniqueAssignment_5 : ( ( 'unique' ) ) ;
    public final void rule__MultiReference__UniqueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2792:1: ( ( ( 'unique' ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2793:1: ( ( 'unique' ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2793:1: ( ( 'unique' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2794:1: ( 'unique' )
            {
             before(grammarAccess.getMultiReferenceAccess().getUniqueUniqueKeyword_5_0()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2795:1: ( 'unique' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2796:1: 'unique'
            {
             before(grammarAccess.getMultiReferenceAccess().getUniqueUniqueKeyword_5_0()); 
            match(input,27,FOLLOW_27_in_rule__MultiReference__UniqueAssignment_55565); 
             after(grammarAccess.getMultiReferenceAccess().getUniqueUniqueKeyword_5_0()); 

            }

             after(grammarAccess.getMultiReferenceAccess().getUniqueUniqueKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiReference__UniqueAssignment_5"


    // $ANTLR start "rule__MultiReference__OppositeAssignment_6_1"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2811:1: rule__MultiReference__OppositeAssignment_6_1 : ( ( ruleQUALIFIED_NAME ) ) ;
    public final void rule__MultiReference__OppositeAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2815:1: ( ( ( ruleQUALIFIED_NAME ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2816:1: ( ( ruleQUALIFIED_NAME ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2816:1: ( ( ruleQUALIFIED_NAME ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2817:1: ( ruleQUALIFIED_NAME )
            {
             before(grammarAccess.getMultiReferenceAccess().getOppositeMultiReferenceCrossReference_6_1_0()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2818:1: ( ruleQUALIFIED_NAME )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2819:1: ruleQUALIFIED_NAME
            {
             before(grammarAccess.getMultiReferenceAccess().getOppositeMultiReferenceQUALIFIED_NAMEParserRuleCall_6_1_0_1()); 
            pushFollow(FOLLOW_ruleQUALIFIED_NAME_in_rule__MultiReference__OppositeAssignment_6_15608);
            ruleQUALIFIED_NAME();

            state._fsp--;

             after(grammarAccess.getMultiReferenceAccess().getOppositeMultiReferenceQUALIFIED_NAMEParserRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getMultiReferenceAccess().getOppositeMultiReferenceCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiReference__OppositeAssignment_6_1"


    // $ANTLR start "rule__SingleDataType__NameAssignment_2"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2830:1: rule__SingleDataType__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__SingleDataType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2834:1: ( ( RULE_ID ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2835:1: ( RULE_ID )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2835:1: ( RULE_ID )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2836:1: RULE_ID
            {
             before(grammarAccess.getSingleDataTypeAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SingleDataType__NameAssignment_25643); 
             after(grammarAccess.getSingleDataTypeAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleDataType__NameAssignment_2"


    // $ANTLR start "rule__SingleDataType__TypeAssignment_3"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2845:1: rule__SingleDataType__TypeAssignment_3 : ( ruleDataTypes ) ;
    public final void rule__SingleDataType__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2849:1: ( ( ruleDataTypes ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2850:1: ( ruleDataTypes )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2850:1: ( ruleDataTypes )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2851:1: ruleDataTypes
            {
             before(grammarAccess.getSingleDataTypeAccess().getTypeDataTypesEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleDataTypes_in_rule__SingleDataType__TypeAssignment_35674);
            ruleDataTypes();

            state._fsp--;

             after(grammarAccess.getSingleDataTypeAccess().getTypeDataTypesEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleDataType__TypeAssignment_3"


    // $ANTLR start "rule__SingleDataType__OppositeAssignment_4_1"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2860:1: rule__SingleDataType__OppositeAssignment_4_1 : ( ( ruleQUALIFIED_NAME ) ) ;
    public final void rule__SingleDataType__OppositeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2864:1: ( ( ( ruleQUALIFIED_NAME ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2865:1: ( ( ruleQUALIFIED_NAME ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2865:1: ( ( ruleQUALIFIED_NAME ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2866:1: ( ruleQUALIFIED_NAME )
            {
             before(grammarAccess.getSingleDataTypeAccess().getOppositeMultiDataTypeCrossReference_4_1_0()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2867:1: ( ruleQUALIFIED_NAME )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2868:1: ruleQUALIFIED_NAME
            {
             before(grammarAccess.getSingleDataTypeAccess().getOppositeMultiDataTypeQUALIFIED_NAMEParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_ruleQUALIFIED_NAME_in_rule__SingleDataType__OppositeAssignment_4_15709);
            ruleQUALIFIED_NAME();

            state._fsp--;

             after(grammarAccess.getSingleDataTypeAccess().getOppositeMultiDataTypeQUALIFIED_NAMEParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getSingleDataTypeAccess().getOppositeMultiDataTypeCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleDataType__OppositeAssignment_4_1"


    // $ANTLR start "rule__MultiDataType__NameAssignment_2"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2879:1: rule__MultiDataType__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__MultiDataType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2883:1: ( ( RULE_ID ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2884:1: ( RULE_ID )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2884:1: ( RULE_ID )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2885:1: RULE_ID
            {
             before(grammarAccess.getMultiDataTypeAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MultiDataType__NameAssignment_25744); 
             after(grammarAccess.getMultiDataTypeAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiDataType__NameAssignment_2"


    // $ANTLR start "rule__MultiDataType__TypeAssignment_3"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2894:1: rule__MultiDataType__TypeAssignment_3 : ( ruleDataTypes ) ;
    public final void rule__MultiDataType__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2898:1: ( ( ruleDataTypes ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2899:1: ( ruleDataTypes )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2899:1: ( ruleDataTypes )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2900:1: ruleDataTypes
            {
             before(grammarAccess.getMultiDataTypeAccess().getTypeDataTypesEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleDataTypes_in_rule__MultiDataType__TypeAssignment_35775);
            ruleDataTypes();

            state._fsp--;

             after(grammarAccess.getMultiDataTypeAccess().getTypeDataTypesEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiDataType__TypeAssignment_3"


    // $ANTLR start "rule__MultiDataType__UniqueAssignment_5"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2909:1: rule__MultiDataType__UniqueAssignment_5 : ( ( 'unique' ) ) ;
    public final void rule__MultiDataType__UniqueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2913:1: ( ( ( 'unique' ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2914:1: ( ( 'unique' ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2914:1: ( ( 'unique' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2915:1: ( 'unique' )
            {
             before(grammarAccess.getMultiDataTypeAccess().getUniqueUniqueKeyword_5_0()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2916:1: ( 'unique' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2917:1: 'unique'
            {
             before(grammarAccess.getMultiDataTypeAccess().getUniqueUniqueKeyword_5_0()); 
            match(input,27,FOLLOW_27_in_rule__MultiDataType__UniqueAssignment_55811); 
             after(grammarAccess.getMultiDataTypeAccess().getUniqueUniqueKeyword_5_0()); 

            }

             after(grammarAccess.getMultiDataTypeAccess().getUniqueUniqueKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiDataType__UniqueAssignment_5"


    // $ANTLR start "rule__MultiDataType__OppositeAssignment_6_1"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2932:1: rule__MultiDataType__OppositeAssignment_6_1 : ( ( ruleQUALIFIED_NAME ) ) ;
    public final void rule__MultiDataType__OppositeAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2936:1: ( ( ( ruleQUALIFIED_NAME ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2937:1: ( ( ruleQUALIFIED_NAME ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2937:1: ( ( ruleQUALIFIED_NAME ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2938:1: ( ruleQUALIFIED_NAME )
            {
             before(grammarAccess.getMultiDataTypeAccess().getOppositeMultiDataTypeCrossReference_6_1_0()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2939:1: ( ruleQUALIFIED_NAME )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2940:1: ruleQUALIFIED_NAME
            {
             before(grammarAccess.getMultiDataTypeAccess().getOppositeMultiDataTypeQUALIFIED_NAMEParserRuleCall_6_1_0_1()); 
            pushFollow(FOLLOW_ruleQUALIFIED_NAME_in_rule__MultiDataType__OppositeAssignment_6_15854);
            ruleQUALIFIED_NAME();

            state._fsp--;

             after(grammarAccess.getMultiDataTypeAccess().getOppositeMultiDataTypeQUALIFIED_NAMEParserRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getMultiDataTypeAccess().getOppositeMultiDataTypeCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiDataType__OppositeAssignment_6_1"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    static final String DFA3_eotS =
        "\12\uffff";
    static final String DFA3_eofS =
        "\3\uffff\5\10\2\uffff";
    static final String DFA3_minS =
        "\1\27\1\4\1\14\5\24\2\uffff";
    static final String DFA3_maxS =
        "\1\27\1\4\1\20\5\31\2\uffff";
    static final String DFA3_acceptS =
        "\10\uffff\1\1\1\2";
    static final String DFA3_specialS =
        "\12\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3\1\4\1\5\1\6\1\7",
            "\1\10\2\uffff\2\10\1\11",
            "\1\10\2\uffff\2\10\1\11",
            "\1\10\2\uffff\2\10\1\11",
            "\1\10\2\uffff\2\10\1\11",
            "\1\10\2\uffff\2\10\1\11",
            "",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "451:1: rule__DataType__Alternatives : ( ( ruleSingleDataType ) | ( ruleMultiDataType ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleModule_in_entryRuleModule61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModule68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__0_in_ruleModule94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_entryRulePackage121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__0_in_rulePackage154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0_in_ruleEntity214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Alternatives_in_ruleFeature274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_entryRuleReference301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReference308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Alternatives_in_ruleReference334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleReference_in_entryRuleSingleReference361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleReference368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleReference__Group__0_in_ruleSingleReference394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiReference_in_entryRuleMultiReference421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiReference428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiReference__Group__0_in_ruleMultiReference454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_entryRuleDataType481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataType488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Alternatives_in_ruleDataType514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleDataType_in_entryRuleSingleDataType541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleDataType548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleDataType__Group__0_in_ruleSingleDataType574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiDataType_in_entryRuleMultiDataType601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiDataType608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiDataType__Group__0_in_ruleMultiDataType634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQUALIFIED_NAME_in_entryRuleQUALIFIED_NAME661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQUALIFIED_NAME668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QUALIFIED_NAME__Group__0_in_ruleQUALIFIED_NAME694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleInternalDSLType732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataTypes__Alternatives_in_ruleDataTypes770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_rule__Feature__Alternatives805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_rule__Feature__Alternatives822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleReference_in_rule__Reference__Alternatives854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiReference_in_rule__Reference__Alternatives871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleDataType_in_rule__DataType__Alternatives903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiDataType_in_rule__DataType__Alternatives920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__DataTypes__Alternatives953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__DataTypes__Alternatives974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__DataTypes__Alternatives995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__DataTypes__Alternatives1016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__DataTypes__Alternatives1037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__0__Impl_in_rule__Module__Group__01070 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Module__Group__1_in_rule__Module__Group__01073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__1__Impl_in_rule__Module__Group__11131 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Module__Group__2_in_rule__Module__Group__11134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Module__Group__1__Impl1162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__2__Impl_in_rule__Module__Group__21193 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Module__Group__3_in_rule__Module__Group__21196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__NameAssignment_2_in_rule__Module__Group__2__Impl1223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__3__Impl_in_rule__Module__Group__31253 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Module__Group__4_in_rule__Module__Group__31256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__TypeAssignment_3_in_rule__Module__Group__3__Impl1283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__4__Impl_in_rule__Module__Group__41313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_4__0_in_rule__Module__Group__4__Impl1340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_4__0__Impl_in_rule__Module__Group_4__01381 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Module__Group_4__1_in_rule__Module__Group_4__01384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__PackagesAssignment_4_0_in_rule__Module__Group_4__0__Impl1411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_4__1__Impl_in_rule__Module__Group_4__11441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__PackagesAssignment_4_1_in_rule__Module__Group_4__1__Impl1468 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__01503 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Package__Group__1_in_rule__Package__Group__01506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__11564 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Package__Group__2_in_rule__Package__Group__11567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Package__Group__1__Impl1595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__21626 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Package__Group__3_in_rule__Package__Group__21629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__NameAssignment_2_in_rule__Package__Group__2__Impl1656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__3__Impl_in_rule__Package__Group__31686 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__Package__Group__4_in_rule__Package__Group__31689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Package__Group__3__Impl1717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__4__Impl_in_rule__Package__Group__41748 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__Package__Group__5_in_rule__Package__Group__41751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group_4__0_in_rule__Package__Group__4__Impl1778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__5__Impl_in_rule__Package__Group__51809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Package__Group__5__Impl1837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group_4__0__Impl_in_rule__Package__Group_4__01880 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Package__Group_4__1_in_rule__Package__Group_4__01883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__EntitiesAssignment_4_0_in_rule__Package__Group_4__0__Impl1910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group_4__1__Impl_in_rule__Package__Group_4__11940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__EntitiesAssignment_4_1_in_rule__Package__Group_4__1__Impl1967 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__02002 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__02005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__12063 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__12066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Entity__Group__1__Impl2094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__22125 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__22128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__NameAssignment_2_in_rule__Entity__Group__2__Impl2155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__32185 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__32188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__0_in_rule__Entity__Group__3__Impl2215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__42246 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__42249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Entity__Group__4__Impl2277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__52308 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_rule__Entity__Group__6_in_rule__Entity__Group__52311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_5__0_in_rule__Entity__Group__5__Impl2338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__6__Impl_in_rule__Entity__Group__62369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Entity__Group__6__Impl2397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__0__Impl_in_rule__Entity__Group_3__02442 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__1_in_rule__Entity__Group_3__02445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Entity__Group_3__0__Impl2473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__1__Impl_in_rule__Entity__Group_3__12504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__SuperEntityAssignment_3_1_in_rule__Entity__Group_3__1__Impl2531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_5__0__Impl_in_rule__Entity__Group_5__02565 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Entity__Group_5__1_in_rule__Entity__Group_5__02568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__FeaturesAssignment_5_0_in_rule__Entity__Group_5__0__Impl2595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_5__1__Impl_in_rule__Entity__Group_5__12625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__FeaturesAssignment_5_1_in_rule__Entity__Group_5__1__Impl2652 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__SingleReference__Group__0__Impl_in_rule__SingleReference__Group__02687 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__SingleReference__Group__1_in_rule__SingleReference__Group__02690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleReference__Group__1__Impl_in_rule__SingleReference__Group__12748 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SingleReference__Group__2_in_rule__SingleReference__Group__12751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__SingleReference__Group__1__Impl2779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleReference__Group__2__Impl_in_rule__SingleReference__Group__22810 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SingleReference__Group__3_in_rule__SingleReference__Group__22813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleReference__NameAssignment_2_in_rule__SingleReference__Group__2__Impl2840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleReference__Group__3__Impl_in_rule__SingleReference__Group__32870 = new BitSet(new long[]{0x0000000009000000L});
    public static final BitSet FOLLOW_rule__SingleReference__Group__4_in_rule__SingleReference__Group__32873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleReference__ReferenceAssignment_3_in_rule__SingleReference__Group__3__Impl2900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleReference__Group__4__Impl_in_rule__SingleReference__Group__42930 = new BitSet(new long[]{0x0000000009000000L});
    public static final BitSet FOLLOW_rule__SingleReference__Group__5_in_rule__SingleReference__Group__42933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleReference__UniqueAssignment_4_in_rule__SingleReference__Group__4__Impl2960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleReference__Group__5__Impl_in_rule__SingleReference__Group__52991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleReference__Group_5__0_in_rule__SingleReference__Group__5__Impl3018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleReference__Group_5__0__Impl_in_rule__SingleReference__Group_5__03061 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SingleReference__Group_5__1_in_rule__SingleReference__Group_5__03064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__SingleReference__Group_5__0__Impl3092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleReference__Group_5__1__Impl_in_rule__SingleReference__Group_5__13123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleReference__OppositeAssignment_5_1_in_rule__SingleReference__Group_5__1__Impl3150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiReference__Group__0__Impl_in_rule__MultiReference__Group__03184 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__MultiReference__Group__1_in_rule__MultiReference__Group__03187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiReference__Group__1__Impl_in_rule__MultiReference__Group__13245 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MultiReference__Group__2_in_rule__MultiReference__Group__13248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__MultiReference__Group__1__Impl3276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiReference__Group__2__Impl_in_rule__MultiReference__Group__23307 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MultiReference__Group__3_in_rule__MultiReference__Group__23310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiReference__NameAssignment_2_in_rule__MultiReference__Group__2__Impl3337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiReference__Group__3__Impl_in_rule__MultiReference__Group__33367 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__MultiReference__Group__4_in_rule__MultiReference__Group__33370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiReference__ReferenceAssignment_3_in_rule__MultiReference__Group__3__Impl3397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiReference__Group__4__Impl_in_rule__MultiReference__Group__43427 = new BitSet(new long[]{0x0000000009000000L});
    public static final BitSet FOLLOW_rule__MultiReference__Group__5_in_rule__MultiReference__Group__43430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__MultiReference__Group__4__Impl3458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiReference__Group__5__Impl_in_rule__MultiReference__Group__53489 = new BitSet(new long[]{0x0000000009000000L});
    public static final BitSet FOLLOW_rule__MultiReference__Group__6_in_rule__MultiReference__Group__53492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiReference__UniqueAssignment_5_in_rule__MultiReference__Group__5__Impl3519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiReference__Group__6__Impl_in_rule__MultiReference__Group__63550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiReference__Group_6__0_in_rule__MultiReference__Group__6__Impl3577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiReference__Group_6__0__Impl_in_rule__MultiReference__Group_6__03622 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MultiReference__Group_6__1_in_rule__MultiReference__Group_6__03625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__MultiReference__Group_6__0__Impl3653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiReference__Group_6__1__Impl_in_rule__MultiReference__Group_6__13684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiReference__OppositeAssignment_6_1_in_rule__MultiReference__Group_6__1__Impl3711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleDataType__Group__0__Impl_in_rule__SingleDataType__Group__03745 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__SingleDataType__Group__1_in_rule__SingleDataType__Group__03748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleDataType__Group__1__Impl_in_rule__SingleDataType__Group__13806 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SingleDataType__Group__2_in_rule__SingleDataType__Group__13809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__SingleDataType__Group__1__Impl3837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleDataType__Group__2__Impl_in_rule__SingleDataType__Group__23868 = new BitSet(new long[]{0x000000000001F000L});
    public static final BitSet FOLLOW_rule__SingleDataType__Group__3_in_rule__SingleDataType__Group__23871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleDataType__NameAssignment_2_in_rule__SingleDataType__Group__2__Impl3898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleDataType__Group__3__Impl_in_rule__SingleDataType__Group__33928 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__SingleDataType__Group__4_in_rule__SingleDataType__Group__33931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleDataType__TypeAssignment_3_in_rule__SingleDataType__Group__3__Impl3958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleDataType__Group__4__Impl_in_rule__SingleDataType__Group__43988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleDataType__Group_4__0_in_rule__SingleDataType__Group__4__Impl4015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleDataType__Group_4__0__Impl_in_rule__SingleDataType__Group_4__04056 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SingleDataType__Group_4__1_in_rule__SingleDataType__Group_4__04059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__SingleDataType__Group_4__0__Impl4087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleDataType__Group_4__1__Impl_in_rule__SingleDataType__Group_4__14118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleDataType__OppositeAssignment_4_1_in_rule__SingleDataType__Group_4__1__Impl4145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiDataType__Group__0__Impl_in_rule__MultiDataType__Group__04179 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__MultiDataType__Group__1_in_rule__MultiDataType__Group__04182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiDataType__Group__1__Impl_in_rule__MultiDataType__Group__14240 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MultiDataType__Group__2_in_rule__MultiDataType__Group__14243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__MultiDataType__Group__1__Impl4271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiDataType__Group__2__Impl_in_rule__MultiDataType__Group__24302 = new BitSet(new long[]{0x000000000001F000L});
    public static final BitSet FOLLOW_rule__MultiDataType__Group__3_in_rule__MultiDataType__Group__24305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiDataType__NameAssignment_2_in_rule__MultiDataType__Group__2__Impl4332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiDataType__Group__3__Impl_in_rule__MultiDataType__Group__34362 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__MultiDataType__Group__4_in_rule__MultiDataType__Group__34365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiDataType__TypeAssignment_3_in_rule__MultiDataType__Group__3__Impl4392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiDataType__Group__4__Impl_in_rule__MultiDataType__Group__44422 = new BitSet(new long[]{0x0000000009000000L});
    public static final BitSet FOLLOW_rule__MultiDataType__Group__5_in_rule__MultiDataType__Group__44425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__MultiDataType__Group__4__Impl4453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiDataType__Group__5__Impl_in_rule__MultiDataType__Group__54484 = new BitSet(new long[]{0x0000000009000000L});
    public static final BitSet FOLLOW_rule__MultiDataType__Group__6_in_rule__MultiDataType__Group__54487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiDataType__UniqueAssignment_5_in_rule__MultiDataType__Group__5__Impl4514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiDataType__Group__6__Impl_in_rule__MultiDataType__Group__64545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiDataType__Group_6__0_in_rule__MultiDataType__Group__6__Impl4572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiDataType__Group_6__0__Impl_in_rule__MultiDataType__Group_6__04617 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MultiDataType__Group_6__1_in_rule__MultiDataType__Group_6__04620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__MultiDataType__Group_6__0__Impl4648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiDataType__Group_6__1__Impl_in_rule__MultiDataType__Group_6__14679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiDataType__OppositeAssignment_6_1_in_rule__MultiDataType__Group_6__1__Impl4706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QUALIFIED_NAME__Group__0__Impl_in_rule__QUALIFIED_NAME__Group__04740 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__QUALIFIED_NAME__Group__1_in_rule__QUALIFIED_NAME__Group__04743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QUALIFIED_NAME__Group__0__Impl4770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QUALIFIED_NAME__Group__1__Impl_in_rule__QUALIFIED_NAME__Group__14799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QUALIFIED_NAME__Group_1__0_in_rule__QUALIFIED_NAME__Group__1__Impl4826 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__QUALIFIED_NAME__Group_1__0__Impl_in_rule__QUALIFIED_NAME__Group_1__04861 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QUALIFIED_NAME__Group_1__1_in_rule__QUALIFIED_NAME__Group_1__04864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__QUALIFIED_NAME__Group_1__0__Impl4892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QUALIFIED_NAME__Group_1__1__Impl_in_rule__QUALIFIED_NAME__Group_1__14923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QUALIFIED_NAME__Group_1__1__Impl4950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQUALIFIED_NAME_in_rule__Module__NameAssignment_24988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalDSLType_in_rule__Module__TypeAssignment_35019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_rule__Module__PackagesAssignment_4_05050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_rule__Module__PackagesAssignment_4_15081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQUALIFIED_NAME_in_rule__Package__NameAssignment_25112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__Package__EntitiesAssignment_4_05143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__Package__EntitiesAssignment_4_15174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_25205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__SuperEntityAssignment_3_15240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_rule__Entity__FeaturesAssignment_5_05275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_rule__Entity__FeaturesAssignment_5_15306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SingleReference__NameAssignment_25337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SingleReference__ReferenceAssignment_35372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__SingleReference__UniqueAssignment_45412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQUALIFIED_NAME_in_rule__SingleReference__OppositeAssignment_5_15455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MultiReference__NameAssignment_25490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MultiReference__ReferenceAssignment_35525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__MultiReference__UniqueAssignment_55565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQUALIFIED_NAME_in_rule__MultiReference__OppositeAssignment_6_15608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SingleDataType__NameAssignment_25643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypes_in_rule__SingleDataType__TypeAssignment_35674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQUALIFIED_NAME_in_rule__SingleDataType__OppositeAssignment_4_15709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MultiDataType__NameAssignment_25744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypes_in_rule__MultiDataType__TypeAssignment_35775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__MultiDataType__UniqueAssignment_55811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQUALIFIED_NAME_in_rule__MultiDataType__OppositeAssignment_6_15854 = new BitSet(new long[]{0x0000000000000002L});

}