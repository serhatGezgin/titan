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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Nested Functions'", "'String'", "'integer'", "'boolean'", "'long'", "'double'", "'module'", "'package'", "'{'", "'}'", "'entity'", "':'", "'var'", "'opposite'", "'.'", "'[]'"
    };
    public static final int RULE_ID=4;
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:181:1: ruleReference : ( ( rule__Reference__Group__0 ) ) ;
    public final void ruleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:185:2: ( ( ( rule__Reference__Group__0 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:186:1: ( ( rule__Reference__Group__0 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:186:1: ( ( rule__Reference__Group__0 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:187:1: ( rule__Reference__Group__0 )
            {
             before(grammarAccess.getReferenceAccess().getGroup()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:188:1: ( rule__Reference__Group__0 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:188:2: rule__Reference__Group__0
            {
            pushFollow(FOLLOW_rule__Reference__Group__0_in_ruleReference334);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:200:1: entryRuleDataType : ruleDataType EOF ;
    public final void entryRuleDataType() throws RecognitionException {
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:201:1: ( ruleDataType EOF )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:202:1: ruleDataType EOF
            {
             before(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_ruleDataType_in_entryRuleDataType361);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getDataTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataType368); 

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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:209:1: ruleDataType : ( ( rule__DataType__Group__0 ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:213:2: ( ( ( rule__DataType__Group__0 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:214:1: ( ( rule__DataType__Group__0 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:214:1: ( ( rule__DataType__Group__0 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:215:1: ( rule__DataType__Group__0 )
            {
             before(grammarAccess.getDataTypeAccess().getGroup()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:216:1: ( rule__DataType__Group__0 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:216:2: rule__DataType__Group__0
            {
            pushFollow(FOLLOW_rule__DataType__Group__0_in_ruleDataType394);
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


    // $ANTLR start "entryRuleQUALIFIED_NAME"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:228:1: entryRuleQUALIFIED_NAME : ruleQUALIFIED_NAME EOF ;
    public final void entryRuleQUALIFIED_NAME() throws RecognitionException {
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:229:1: ( ruleQUALIFIED_NAME EOF )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:230:1: ruleQUALIFIED_NAME EOF
            {
             before(grammarAccess.getQUALIFIED_NAMERule()); 
            pushFollow(FOLLOW_ruleQUALIFIED_NAME_in_entryRuleQUALIFIED_NAME421);
            ruleQUALIFIED_NAME();

            state._fsp--;

             after(grammarAccess.getQUALIFIED_NAMERule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQUALIFIED_NAME428); 

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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:237:1: ruleQUALIFIED_NAME : ( ( rule__QUALIFIED_NAME__Group__0 ) ) ;
    public final void ruleQUALIFIED_NAME() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:241:2: ( ( ( rule__QUALIFIED_NAME__Group__0 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:242:1: ( ( rule__QUALIFIED_NAME__Group__0 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:242:1: ( ( rule__QUALIFIED_NAME__Group__0 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:243:1: ( rule__QUALIFIED_NAME__Group__0 )
            {
             before(grammarAccess.getQUALIFIED_NAMEAccess().getGroup()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:244:1: ( rule__QUALIFIED_NAME__Group__0 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:244:2: rule__QUALIFIED_NAME__Group__0
            {
            pushFollow(FOLLOW_rule__QUALIFIED_NAME__Group__0_in_ruleQUALIFIED_NAME454);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:257:1: ruleInternalDSLType : ( ( 'Nested Functions' ) ) ;
    public final void ruleInternalDSLType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:261:1: ( ( ( 'Nested Functions' ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:262:1: ( ( 'Nested Functions' ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:262:1: ( ( 'Nested Functions' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:263:1: ( 'Nested Functions' )
            {
             before(grammarAccess.getInternalDSLTypeAccess().getNestedFunctionsEnumLiteralDeclaration()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:264:1: ( 'Nested Functions' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:264:3: 'Nested Functions'
            {
            match(input,11,FOLLOW_11_in_ruleInternalDSLType492); 

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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:277:1: ruleDataTypes : ( ( rule__DataTypes__Alternatives ) ) ;
    public final void ruleDataTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:281:1: ( ( ( rule__DataTypes__Alternatives ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:282:1: ( ( rule__DataTypes__Alternatives ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:282:1: ( ( rule__DataTypes__Alternatives ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:283:1: ( rule__DataTypes__Alternatives )
            {
             before(grammarAccess.getDataTypesAccess().getAlternatives()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:284:1: ( rule__DataTypes__Alternatives )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:284:2: rule__DataTypes__Alternatives
            {
            pushFollow(FOLLOW_rule__DataTypes__Alternatives_in_ruleDataTypes530);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:295:1: rule__Feature__Alternatives : ( ( ruleReference ) | ( ruleDataType ) );
    public final void rule__Feature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:299:1: ( ( ruleReference ) | ( ruleDataType ) )
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
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:300:1: ( ruleReference )
                    {
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:300:1: ( ruleReference )
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:301:1: ruleReference
                    {
                     before(grammarAccess.getFeatureAccess().getReferenceParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleReference_in_rule__Feature__Alternatives565);
                    ruleReference();

                    state._fsp--;

                     after(grammarAccess.getFeatureAccess().getReferenceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:306:6: ( ruleDataType )
                    {
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:306:6: ( ruleDataType )
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:307:1: ruleDataType
                    {
                     before(grammarAccess.getFeatureAccess().getDataTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleDataType_in_rule__Feature__Alternatives582);
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


    // $ANTLR start "rule__DataTypes__Alternatives"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:317:1: rule__DataTypes__Alternatives : ( ( ( 'String' ) ) | ( ( 'integer' ) ) | ( ( 'boolean' ) ) | ( ( 'long' ) ) | ( ( 'double' ) ) );
    public final void rule__DataTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:321:1: ( ( ( 'String' ) ) | ( ( 'integer' ) ) | ( ( 'boolean' ) ) | ( ( 'long' ) ) | ( ( 'double' ) ) )
            int alt2=5;
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
            case 16:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:322:1: ( ( 'String' ) )
                    {
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:322:1: ( ( 'String' ) )
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:323:1: ( 'String' )
                    {
                     before(grammarAccess.getDataTypesAccess().getStringEnumLiteralDeclaration_0()); 
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:324:1: ( 'String' )
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:324:3: 'String'
                    {
                    match(input,12,FOLLOW_12_in_rule__DataTypes__Alternatives615); 

                    }

                     after(grammarAccess.getDataTypesAccess().getStringEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:329:6: ( ( 'integer' ) )
                    {
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:329:6: ( ( 'integer' ) )
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:330:1: ( 'integer' )
                    {
                     before(grammarAccess.getDataTypesAccess().getIntegerEnumLiteralDeclaration_1()); 
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:331:1: ( 'integer' )
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:331:3: 'integer'
                    {
                    match(input,13,FOLLOW_13_in_rule__DataTypes__Alternatives636); 

                    }

                     after(grammarAccess.getDataTypesAccess().getIntegerEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:336:6: ( ( 'boolean' ) )
                    {
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:336:6: ( ( 'boolean' ) )
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:337:1: ( 'boolean' )
                    {
                     before(grammarAccess.getDataTypesAccess().getBooleanEnumLiteralDeclaration_2()); 
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:338:1: ( 'boolean' )
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:338:3: 'boolean'
                    {
                    match(input,14,FOLLOW_14_in_rule__DataTypes__Alternatives657); 

                    }

                     after(grammarAccess.getDataTypesAccess().getBooleanEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:343:6: ( ( 'long' ) )
                    {
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:343:6: ( ( 'long' ) )
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:344:1: ( 'long' )
                    {
                     before(grammarAccess.getDataTypesAccess().getLongEnumLiteralDeclaration_3()); 
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:345:1: ( 'long' )
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:345:3: 'long'
                    {
                    match(input,15,FOLLOW_15_in_rule__DataTypes__Alternatives678); 

                    }

                     after(grammarAccess.getDataTypesAccess().getLongEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:350:6: ( ( 'double' ) )
                    {
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:350:6: ( ( 'double' ) )
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:351:1: ( 'double' )
                    {
                     before(grammarAccess.getDataTypesAccess().getDoubleEnumLiteralDeclaration_4()); 
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:352:1: ( 'double' )
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:352:3: 'double'
                    {
                    match(input,16,FOLLOW_16_in_rule__DataTypes__Alternatives699); 

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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:364:1: rule__Module__Group__0 : rule__Module__Group__0__Impl rule__Module__Group__1 ;
    public final void rule__Module__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:368:1: ( rule__Module__Group__0__Impl rule__Module__Group__1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:369:2: rule__Module__Group__0__Impl rule__Module__Group__1
            {
            pushFollow(FOLLOW_rule__Module__Group__0__Impl_in_rule__Module__Group__0732);
            rule__Module__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__1_in_rule__Module__Group__0735);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:376:1: rule__Module__Group__0__Impl : ( () ) ;
    public final void rule__Module__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:380:1: ( ( () ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:381:1: ( () )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:381:1: ( () )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:382:1: ()
            {
             before(grammarAccess.getModuleAccess().getModuleAction_0()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:383:1: ()
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:385:1: 
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:395:1: rule__Module__Group__1 : rule__Module__Group__1__Impl rule__Module__Group__2 ;
    public final void rule__Module__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:399:1: ( rule__Module__Group__1__Impl rule__Module__Group__2 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:400:2: rule__Module__Group__1__Impl rule__Module__Group__2
            {
            pushFollow(FOLLOW_rule__Module__Group__1__Impl_in_rule__Module__Group__1793);
            rule__Module__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__2_in_rule__Module__Group__1796);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:407:1: rule__Module__Group__1__Impl : ( 'module' ) ;
    public final void rule__Module__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:411:1: ( ( 'module' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:412:1: ( 'module' )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:412:1: ( 'module' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:413:1: 'module'
            {
             before(grammarAccess.getModuleAccess().getModuleKeyword_1()); 
            match(input,17,FOLLOW_17_in_rule__Module__Group__1__Impl824); 
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:426:1: rule__Module__Group__2 : rule__Module__Group__2__Impl rule__Module__Group__3 ;
    public final void rule__Module__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:430:1: ( rule__Module__Group__2__Impl rule__Module__Group__3 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:431:2: rule__Module__Group__2__Impl rule__Module__Group__3
            {
            pushFollow(FOLLOW_rule__Module__Group__2__Impl_in_rule__Module__Group__2855);
            rule__Module__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__3_in_rule__Module__Group__2858);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:438:1: rule__Module__Group__2__Impl : ( ( rule__Module__NameAssignment_2 ) ) ;
    public final void rule__Module__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:442:1: ( ( ( rule__Module__NameAssignment_2 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:443:1: ( ( rule__Module__NameAssignment_2 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:443:1: ( ( rule__Module__NameAssignment_2 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:444:1: ( rule__Module__NameAssignment_2 )
            {
             before(grammarAccess.getModuleAccess().getNameAssignment_2()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:445:1: ( rule__Module__NameAssignment_2 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:445:2: rule__Module__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Module__NameAssignment_2_in_rule__Module__Group__2__Impl885);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:455:1: rule__Module__Group__3 : rule__Module__Group__3__Impl rule__Module__Group__4 ;
    public final void rule__Module__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:459:1: ( rule__Module__Group__3__Impl rule__Module__Group__4 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:460:2: rule__Module__Group__3__Impl rule__Module__Group__4
            {
            pushFollow(FOLLOW_rule__Module__Group__3__Impl_in_rule__Module__Group__3915);
            rule__Module__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__4_in_rule__Module__Group__3918);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:467:1: rule__Module__Group__3__Impl : ( ( rule__Module__TypeAssignment_3 ) ) ;
    public final void rule__Module__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:471:1: ( ( ( rule__Module__TypeAssignment_3 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:472:1: ( ( rule__Module__TypeAssignment_3 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:472:1: ( ( rule__Module__TypeAssignment_3 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:473:1: ( rule__Module__TypeAssignment_3 )
            {
             before(grammarAccess.getModuleAccess().getTypeAssignment_3()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:474:1: ( rule__Module__TypeAssignment_3 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:474:2: rule__Module__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Module__TypeAssignment_3_in_rule__Module__Group__3__Impl945);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:484:1: rule__Module__Group__4 : rule__Module__Group__4__Impl ;
    public final void rule__Module__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:488:1: ( rule__Module__Group__4__Impl )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:489:2: rule__Module__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Module__Group__4__Impl_in_rule__Module__Group__4975);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:495:1: rule__Module__Group__4__Impl : ( ( rule__Module__Group_4__0 )? ) ;
    public final void rule__Module__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:499:1: ( ( ( rule__Module__Group_4__0 )? ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:500:1: ( ( rule__Module__Group_4__0 )? )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:500:1: ( ( rule__Module__Group_4__0 )? )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:501:1: ( rule__Module__Group_4__0 )?
            {
             before(grammarAccess.getModuleAccess().getGroup_4()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:502:1: ( rule__Module__Group_4__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:502:2: rule__Module__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Module__Group_4__0_in_rule__Module__Group__4__Impl1002);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:522:1: rule__Module__Group_4__0 : rule__Module__Group_4__0__Impl rule__Module__Group_4__1 ;
    public final void rule__Module__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:526:1: ( rule__Module__Group_4__0__Impl rule__Module__Group_4__1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:527:2: rule__Module__Group_4__0__Impl rule__Module__Group_4__1
            {
            pushFollow(FOLLOW_rule__Module__Group_4__0__Impl_in_rule__Module__Group_4__01043);
            rule__Module__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group_4__1_in_rule__Module__Group_4__01046);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:534:1: rule__Module__Group_4__0__Impl : ( ( rule__Module__PackagesAssignment_4_0 ) ) ;
    public final void rule__Module__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:538:1: ( ( ( rule__Module__PackagesAssignment_4_0 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:539:1: ( ( rule__Module__PackagesAssignment_4_0 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:539:1: ( ( rule__Module__PackagesAssignment_4_0 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:540:1: ( rule__Module__PackagesAssignment_4_0 )
            {
             before(grammarAccess.getModuleAccess().getPackagesAssignment_4_0()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:541:1: ( rule__Module__PackagesAssignment_4_0 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:541:2: rule__Module__PackagesAssignment_4_0
            {
            pushFollow(FOLLOW_rule__Module__PackagesAssignment_4_0_in_rule__Module__Group_4__0__Impl1073);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:551:1: rule__Module__Group_4__1 : rule__Module__Group_4__1__Impl ;
    public final void rule__Module__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:555:1: ( rule__Module__Group_4__1__Impl )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:556:2: rule__Module__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Module__Group_4__1__Impl_in_rule__Module__Group_4__11103);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:562:1: rule__Module__Group_4__1__Impl : ( ( rule__Module__PackagesAssignment_4_1 )* ) ;
    public final void rule__Module__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:566:1: ( ( ( rule__Module__PackagesAssignment_4_1 )* ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:567:1: ( ( rule__Module__PackagesAssignment_4_1 )* )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:567:1: ( ( rule__Module__PackagesAssignment_4_1 )* )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:568:1: ( rule__Module__PackagesAssignment_4_1 )*
            {
             before(grammarAccess.getModuleAccess().getPackagesAssignment_4_1()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:569:1: ( rule__Module__PackagesAssignment_4_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:569:2: rule__Module__PackagesAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_rule__Module__PackagesAssignment_4_1_in_rule__Module__Group_4__1__Impl1130);
            	    rule__Module__PackagesAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:583:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:587:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:588:2: rule__Package__Group__0__Impl rule__Package__Group__1
            {
            pushFollow(FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__01165);
            rule__Package__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__1_in_rule__Package__Group__01168);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:595:1: rule__Package__Group__0__Impl : ( () ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:599:1: ( ( () ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:600:1: ( () )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:600:1: ( () )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:601:1: ()
            {
             before(grammarAccess.getPackageAccess().getPackageAction_0()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:602:1: ()
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:604:1: 
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:614:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:618:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:619:2: rule__Package__Group__1__Impl rule__Package__Group__2
            {
            pushFollow(FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__11226);
            rule__Package__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__2_in_rule__Package__Group__11229);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:626:1: rule__Package__Group__1__Impl : ( 'package' ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:630:1: ( ( 'package' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:631:1: ( 'package' )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:631:1: ( 'package' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:632:1: 'package'
            {
             before(grammarAccess.getPackageAccess().getPackageKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__Package__Group__1__Impl1257); 
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:645:1: rule__Package__Group__2 : rule__Package__Group__2__Impl rule__Package__Group__3 ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:649:1: ( rule__Package__Group__2__Impl rule__Package__Group__3 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:650:2: rule__Package__Group__2__Impl rule__Package__Group__3
            {
            pushFollow(FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__21288);
            rule__Package__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__3_in_rule__Package__Group__21291);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:657:1: rule__Package__Group__2__Impl : ( ( rule__Package__NameAssignment_2 ) ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:661:1: ( ( ( rule__Package__NameAssignment_2 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:662:1: ( ( rule__Package__NameAssignment_2 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:662:1: ( ( rule__Package__NameAssignment_2 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:663:1: ( rule__Package__NameAssignment_2 )
            {
             before(grammarAccess.getPackageAccess().getNameAssignment_2()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:664:1: ( rule__Package__NameAssignment_2 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:664:2: rule__Package__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Package__NameAssignment_2_in_rule__Package__Group__2__Impl1318);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:674:1: rule__Package__Group__3 : rule__Package__Group__3__Impl rule__Package__Group__4 ;
    public final void rule__Package__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:678:1: ( rule__Package__Group__3__Impl rule__Package__Group__4 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:679:2: rule__Package__Group__3__Impl rule__Package__Group__4
            {
            pushFollow(FOLLOW_rule__Package__Group__3__Impl_in_rule__Package__Group__31348);
            rule__Package__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__4_in_rule__Package__Group__31351);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:686:1: rule__Package__Group__3__Impl : ( '{' ) ;
    public final void rule__Package__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:690:1: ( ( '{' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:691:1: ( '{' )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:691:1: ( '{' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:692:1: '{'
            {
             before(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,19,FOLLOW_19_in_rule__Package__Group__3__Impl1379); 
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:705:1: rule__Package__Group__4 : rule__Package__Group__4__Impl rule__Package__Group__5 ;
    public final void rule__Package__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:709:1: ( rule__Package__Group__4__Impl rule__Package__Group__5 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:710:2: rule__Package__Group__4__Impl rule__Package__Group__5
            {
            pushFollow(FOLLOW_rule__Package__Group__4__Impl_in_rule__Package__Group__41410);
            rule__Package__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__5_in_rule__Package__Group__41413);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:717:1: rule__Package__Group__4__Impl : ( ( rule__Package__Group_4__0 )? ) ;
    public final void rule__Package__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:721:1: ( ( ( rule__Package__Group_4__0 )? ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:722:1: ( ( rule__Package__Group_4__0 )? )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:722:1: ( ( rule__Package__Group_4__0 )? )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:723:1: ( rule__Package__Group_4__0 )?
            {
             before(grammarAccess.getPackageAccess().getGroup_4()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:724:1: ( rule__Package__Group_4__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:724:2: rule__Package__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Package__Group_4__0_in_rule__Package__Group__4__Impl1440);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:734:1: rule__Package__Group__5 : rule__Package__Group__5__Impl ;
    public final void rule__Package__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:738:1: ( rule__Package__Group__5__Impl )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:739:2: rule__Package__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Package__Group__5__Impl_in_rule__Package__Group__51471);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:745:1: rule__Package__Group__5__Impl : ( '}' ) ;
    public final void rule__Package__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:749:1: ( ( '}' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:750:1: ( '}' )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:750:1: ( '}' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:751:1: '}'
            {
             before(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_5()); 
            match(input,20,FOLLOW_20_in_rule__Package__Group__5__Impl1499); 
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:776:1: rule__Package__Group_4__0 : rule__Package__Group_4__0__Impl rule__Package__Group_4__1 ;
    public final void rule__Package__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:780:1: ( rule__Package__Group_4__0__Impl rule__Package__Group_4__1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:781:2: rule__Package__Group_4__0__Impl rule__Package__Group_4__1
            {
            pushFollow(FOLLOW_rule__Package__Group_4__0__Impl_in_rule__Package__Group_4__01542);
            rule__Package__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group_4__1_in_rule__Package__Group_4__01545);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:788:1: rule__Package__Group_4__0__Impl : ( ( rule__Package__EntitiesAssignment_4_0 ) ) ;
    public final void rule__Package__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:792:1: ( ( ( rule__Package__EntitiesAssignment_4_0 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:793:1: ( ( rule__Package__EntitiesAssignment_4_0 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:793:1: ( ( rule__Package__EntitiesAssignment_4_0 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:794:1: ( rule__Package__EntitiesAssignment_4_0 )
            {
             before(grammarAccess.getPackageAccess().getEntitiesAssignment_4_0()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:795:1: ( rule__Package__EntitiesAssignment_4_0 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:795:2: rule__Package__EntitiesAssignment_4_0
            {
            pushFollow(FOLLOW_rule__Package__EntitiesAssignment_4_0_in_rule__Package__Group_4__0__Impl1572);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:805:1: rule__Package__Group_4__1 : rule__Package__Group_4__1__Impl ;
    public final void rule__Package__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:809:1: ( rule__Package__Group_4__1__Impl )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:810:2: rule__Package__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Package__Group_4__1__Impl_in_rule__Package__Group_4__11602);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:816:1: rule__Package__Group_4__1__Impl : ( ( rule__Package__EntitiesAssignment_4_1 )* ) ;
    public final void rule__Package__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:820:1: ( ( ( rule__Package__EntitiesAssignment_4_1 )* ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:821:1: ( ( rule__Package__EntitiesAssignment_4_1 )* )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:821:1: ( ( rule__Package__EntitiesAssignment_4_1 )* )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:822:1: ( rule__Package__EntitiesAssignment_4_1 )*
            {
             before(grammarAccess.getPackageAccess().getEntitiesAssignment_4_1()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:823:1: ( rule__Package__EntitiesAssignment_4_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==21) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:823:2: rule__Package__EntitiesAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_rule__Package__EntitiesAssignment_4_1_in_rule__Package__Group_4__1__Impl1629);
            	    rule__Package__EntitiesAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:837:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:841:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:842:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__01664);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__01667);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:849:1: rule__Entity__Group__0__Impl : ( () ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:853:1: ( ( () ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:854:1: ( () )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:854:1: ( () )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:855:1: ()
            {
             before(grammarAccess.getEntityAccess().getEntityAction_0()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:856:1: ()
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:858:1: 
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:868:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:872:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:873:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__11725);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__11728);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:880:1: rule__Entity__Group__1__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:884:1: ( ( 'entity' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:885:1: ( 'entity' )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:885:1: ( 'entity' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:886:1: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_1()); 
            match(input,21,FOLLOW_21_in_rule__Entity__Group__1__Impl1756); 
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:899:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:903:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:904:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__21787);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__21790);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:911:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__NameAssignment_2 ) ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:915:1: ( ( ( rule__Entity__NameAssignment_2 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:916:1: ( ( rule__Entity__NameAssignment_2 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:916:1: ( ( rule__Entity__NameAssignment_2 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:917:1: ( rule__Entity__NameAssignment_2 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_2()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:918:1: ( rule__Entity__NameAssignment_2 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:918:2: rule__Entity__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Entity__NameAssignment_2_in_rule__Entity__Group__2__Impl1817);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:928:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:932:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:933:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__31847);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__31850);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:940:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__Group_3__0 )? ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:944:1: ( ( ( rule__Entity__Group_3__0 )? ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:945:1: ( ( rule__Entity__Group_3__0 )? )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:945:1: ( ( rule__Entity__Group_3__0 )? )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:946:1: ( rule__Entity__Group_3__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_3()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:947:1: ( rule__Entity__Group_3__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:947:2: rule__Entity__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Entity__Group_3__0_in_rule__Entity__Group__3__Impl1877);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:957:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:961:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:962:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__41908);
            rule__Entity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__41911);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:969:1: rule__Entity__Group__4__Impl : ( '{' ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:973:1: ( ( '{' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:974:1: ( '{' )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:974:1: ( '{' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:975:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,19,FOLLOW_19_in_rule__Entity__Group__4__Impl1939); 
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:988:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl rule__Entity__Group__6 ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:992:1: ( rule__Entity__Group__5__Impl rule__Entity__Group__6 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:993:2: rule__Entity__Group__5__Impl rule__Entity__Group__6
            {
            pushFollow(FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__51970);
            rule__Entity__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__6_in_rule__Entity__Group__51973);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1000:1: rule__Entity__Group__5__Impl : ( ( rule__Entity__Group_5__0 )? ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1004:1: ( ( ( rule__Entity__Group_5__0 )? ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1005:1: ( ( rule__Entity__Group_5__0 )? )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1005:1: ( ( rule__Entity__Group_5__0 )? )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1006:1: ( rule__Entity__Group_5__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_5()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1007:1: ( rule__Entity__Group_5__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1007:2: rule__Entity__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Entity__Group_5__0_in_rule__Entity__Group__5__Impl2000);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1017:1: rule__Entity__Group__6 : rule__Entity__Group__6__Impl ;
    public final void rule__Entity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1021:1: ( rule__Entity__Group__6__Impl )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1022:2: rule__Entity__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group__6__Impl_in_rule__Entity__Group__62031);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1028:1: rule__Entity__Group__6__Impl : ( '}' ) ;
    public final void rule__Entity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1032:1: ( ( '}' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1033:1: ( '}' )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1033:1: ( '}' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1034:1: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_6()); 
            match(input,20,FOLLOW_20_in_rule__Entity__Group__6__Impl2059); 
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1061:1: rule__Entity__Group_3__0 : rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1 ;
    public final void rule__Entity__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1065:1: ( rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1066:2: rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1
            {
            pushFollow(FOLLOW_rule__Entity__Group_3__0__Impl_in_rule__Entity__Group_3__02104);
            rule__Entity__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group_3__1_in_rule__Entity__Group_3__02107);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1073:1: rule__Entity__Group_3__0__Impl : ( ':' ) ;
    public final void rule__Entity__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1077:1: ( ( ':' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1078:1: ( ':' )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1078:1: ( ':' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1079:1: ':'
            {
             before(grammarAccess.getEntityAccess().getColonKeyword_3_0()); 
            match(input,22,FOLLOW_22_in_rule__Entity__Group_3__0__Impl2135); 
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1092:1: rule__Entity__Group_3__1 : rule__Entity__Group_3__1__Impl ;
    public final void rule__Entity__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1096:1: ( rule__Entity__Group_3__1__Impl )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1097:2: rule__Entity__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group_3__1__Impl_in_rule__Entity__Group_3__12166);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1103:1: rule__Entity__Group_3__1__Impl : ( ( rule__Entity__SuperEntityAssignment_3_1 ) ) ;
    public final void rule__Entity__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1107:1: ( ( ( rule__Entity__SuperEntityAssignment_3_1 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1108:1: ( ( rule__Entity__SuperEntityAssignment_3_1 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1108:1: ( ( rule__Entity__SuperEntityAssignment_3_1 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1109:1: ( rule__Entity__SuperEntityAssignment_3_1 )
            {
             before(grammarAccess.getEntityAccess().getSuperEntityAssignment_3_1()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1110:1: ( rule__Entity__SuperEntityAssignment_3_1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1110:2: rule__Entity__SuperEntityAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Entity__SuperEntityAssignment_3_1_in_rule__Entity__Group_3__1__Impl2193);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1124:1: rule__Entity__Group_5__0 : rule__Entity__Group_5__0__Impl rule__Entity__Group_5__1 ;
    public final void rule__Entity__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1128:1: ( rule__Entity__Group_5__0__Impl rule__Entity__Group_5__1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1129:2: rule__Entity__Group_5__0__Impl rule__Entity__Group_5__1
            {
            pushFollow(FOLLOW_rule__Entity__Group_5__0__Impl_in_rule__Entity__Group_5__02227);
            rule__Entity__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group_5__1_in_rule__Entity__Group_5__02230);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1136:1: rule__Entity__Group_5__0__Impl : ( ( rule__Entity__FeaturesAssignment_5_0 ) ) ;
    public final void rule__Entity__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1140:1: ( ( ( rule__Entity__FeaturesAssignment_5_0 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1141:1: ( ( rule__Entity__FeaturesAssignment_5_0 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1141:1: ( ( rule__Entity__FeaturesAssignment_5_0 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1142:1: ( rule__Entity__FeaturesAssignment_5_0 )
            {
             before(grammarAccess.getEntityAccess().getFeaturesAssignment_5_0()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1143:1: ( rule__Entity__FeaturesAssignment_5_0 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1143:2: rule__Entity__FeaturesAssignment_5_0
            {
            pushFollow(FOLLOW_rule__Entity__FeaturesAssignment_5_0_in_rule__Entity__Group_5__0__Impl2257);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1153:1: rule__Entity__Group_5__1 : rule__Entity__Group_5__1__Impl ;
    public final void rule__Entity__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1157:1: ( rule__Entity__Group_5__1__Impl )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1158:2: rule__Entity__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group_5__1__Impl_in_rule__Entity__Group_5__12287);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1164:1: rule__Entity__Group_5__1__Impl : ( ( rule__Entity__FeaturesAssignment_5_1 )* ) ;
    public final void rule__Entity__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1168:1: ( ( ( rule__Entity__FeaturesAssignment_5_1 )* ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1169:1: ( ( rule__Entity__FeaturesAssignment_5_1 )* )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1169:1: ( ( rule__Entity__FeaturesAssignment_5_1 )* )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1170:1: ( rule__Entity__FeaturesAssignment_5_1 )*
            {
             before(grammarAccess.getEntityAccess().getFeaturesAssignment_5_1()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1171:1: ( rule__Entity__FeaturesAssignment_5_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==23) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1171:2: rule__Entity__FeaturesAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_rule__Entity__FeaturesAssignment_5_1_in_rule__Entity__Group_5__1__Impl2314);
            	    rule__Entity__FeaturesAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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


    // $ANTLR start "rule__Reference__Group__0"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1185:1: rule__Reference__Group__0 : rule__Reference__Group__0__Impl rule__Reference__Group__1 ;
    public final void rule__Reference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1189:1: ( rule__Reference__Group__0__Impl rule__Reference__Group__1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1190:2: rule__Reference__Group__0__Impl rule__Reference__Group__1
            {
            pushFollow(FOLLOW_rule__Reference__Group__0__Impl_in_rule__Reference__Group__02349);
            rule__Reference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Reference__Group__1_in_rule__Reference__Group__02352);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1197:1: rule__Reference__Group__0__Impl : ( () ) ;
    public final void rule__Reference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1201:1: ( ( () ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1202:1: ( () )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1202:1: ( () )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1203:1: ()
            {
             before(grammarAccess.getReferenceAccess().getReferenceAction_0()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1204:1: ()
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1206:1: 
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1216:1: rule__Reference__Group__1 : rule__Reference__Group__1__Impl rule__Reference__Group__2 ;
    public final void rule__Reference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1220:1: ( rule__Reference__Group__1__Impl rule__Reference__Group__2 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1221:2: rule__Reference__Group__1__Impl rule__Reference__Group__2
            {
            pushFollow(FOLLOW_rule__Reference__Group__1__Impl_in_rule__Reference__Group__12410);
            rule__Reference__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Reference__Group__2_in_rule__Reference__Group__12413);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1228:1: rule__Reference__Group__1__Impl : ( 'var' ) ;
    public final void rule__Reference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1232:1: ( ( 'var' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1233:1: ( 'var' )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1233:1: ( 'var' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1234:1: 'var'
            {
             before(grammarAccess.getReferenceAccess().getVarKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__Reference__Group__1__Impl2441); 
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1247:1: rule__Reference__Group__2 : rule__Reference__Group__2__Impl rule__Reference__Group__3 ;
    public final void rule__Reference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1251:1: ( rule__Reference__Group__2__Impl rule__Reference__Group__3 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1252:2: rule__Reference__Group__2__Impl rule__Reference__Group__3
            {
            pushFollow(FOLLOW_rule__Reference__Group__2__Impl_in_rule__Reference__Group__22472);
            rule__Reference__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Reference__Group__3_in_rule__Reference__Group__22475);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1259:1: rule__Reference__Group__2__Impl : ( ( rule__Reference__NameAssignment_2 ) ) ;
    public final void rule__Reference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1263:1: ( ( ( rule__Reference__NameAssignment_2 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1264:1: ( ( rule__Reference__NameAssignment_2 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1264:1: ( ( rule__Reference__NameAssignment_2 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1265:1: ( rule__Reference__NameAssignment_2 )
            {
             before(grammarAccess.getReferenceAccess().getNameAssignment_2()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1266:1: ( rule__Reference__NameAssignment_2 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1266:2: rule__Reference__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Reference__NameAssignment_2_in_rule__Reference__Group__2__Impl2502);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1276:1: rule__Reference__Group__3 : rule__Reference__Group__3__Impl rule__Reference__Group__4 ;
    public final void rule__Reference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1280:1: ( rule__Reference__Group__3__Impl rule__Reference__Group__4 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1281:2: rule__Reference__Group__3__Impl rule__Reference__Group__4
            {
            pushFollow(FOLLOW_rule__Reference__Group__3__Impl_in_rule__Reference__Group__32532);
            rule__Reference__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Reference__Group__4_in_rule__Reference__Group__32535);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1288:1: rule__Reference__Group__3__Impl : ( ( rule__Reference__ReferenceAssignment_3 ) ) ;
    public final void rule__Reference__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1292:1: ( ( ( rule__Reference__ReferenceAssignment_3 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1293:1: ( ( rule__Reference__ReferenceAssignment_3 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1293:1: ( ( rule__Reference__ReferenceAssignment_3 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1294:1: ( rule__Reference__ReferenceAssignment_3 )
            {
             before(grammarAccess.getReferenceAccess().getReferenceAssignment_3()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1295:1: ( rule__Reference__ReferenceAssignment_3 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1295:2: rule__Reference__ReferenceAssignment_3
            {
            pushFollow(FOLLOW_rule__Reference__ReferenceAssignment_3_in_rule__Reference__Group__3__Impl2562);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1305:1: rule__Reference__Group__4 : rule__Reference__Group__4__Impl rule__Reference__Group__5 ;
    public final void rule__Reference__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1309:1: ( rule__Reference__Group__4__Impl rule__Reference__Group__5 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1310:2: rule__Reference__Group__4__Impl rule__Reference__Group__5
            {
            pushFollow(FOLLOW_rule__Reference__Group__4__Impl_in_rule__Reference__Group__42592);
            rule__Reference__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Reference__Group__5_in_rule__Reference__Group__42595);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1317:1: rule__Reference__Group__4__Impl : ( ( rule__Reference__ManyAssignment_4 )? ) ;
    public final void rule__Reference__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1321:1: ( ( ( rule__Reference__ManyAssignment_4 )? ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1322:1: ( ( rule__Reference__ManyAssignment_4 )? )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1322:1: ( ( rule__Reference__ManyAssignment_4 )? )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1323:1: ( rule__Reference__ManyAssignment_4 )?
            {
             before(grammarAccess.getReferenceAccess().getManyAssignment_4()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1324:1: ( rule__Reference__ManyAssignment_4 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1324:2: rule__Reference__ManyAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Reference__ManyAssignment_4_in_rule__Reference__Group__4__Impl2622);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1334:1: rule__Reference__Group__5 : rule__Reference__Group__5__Impl ;
    public final void rule__Reference__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1338:1: ( rule__Reference__Group__5__Impl )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1339:2: rule__Reference__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Reference__Group__5__Impl_in_rule__Reference__Group__52653);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1345:1: rule__Reference__Group__5__Impl : ( ( rule__Reference__Group_5__0 )? ) ;
    public final void rule__Reference__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1349:1: ( ( ( rule__Reference__Group_5__0 )? ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1350:1: ( ( rule__Reference__Group_5__0 )? )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1350:1: ( ( rule__Reference__Group_5__0 )? )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1351:1: ( rule__Reference__Group_5__0 )?
            {
             before(grammarAccess.getReferenceAccess().getGroup_5()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1352:1: ( rule__Reference__Group_5__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1352:2: rule__Reference__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Reference__Group_5__0_in_rule__Reference__Group__5__Impl2680);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1374:1: rule__Reference__Group_5__0 : rule__Reference__Group_5__0__Impl rule__Reference__Group_5__1 ;
    public final void rule__Reference__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1378:1: ( rule__Reference__Group_5__0__Impl rule__Reference__Group_5__1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1379:2: rule__Reference__Group_5__0__Impl rule__Reference__Group_5__1
            {
            pushFollow(FOLLOW_rule__Reference__Group_5__0__Impl_in_rule__Reference__Group_5__02723);
            rule__Reference__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Reference__Group_5__1_in_rule__Reference__Group_5__02726);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1386:1: rule__Reference__Group_5__0__Impl : ( 'opposite' ) ;
    public final void rule__Reference__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1390:1: ( ( 'opposite' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1391:1: ( 'opposite' )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1391:1: ( 'opposite' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1392:1: 'opposite'
            {
             before(grammarAccess.getReferenceAccess().getOppositeKeyword_5_0()); 
            match(input,24,FOLLOW_24_in_rule__Reference__Group_5__0__Impl2754); 
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1405:1: rule__Reference__Group_5__1 : rule__Reference__Group_5__1__Impl ;
    public final void rule__Reference__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1409:1: ( rule__Reference__Group_5__1__Impl )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1410:2: rule__Reference__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Reference__Group_5__1__Impl_in_rule__Reference__Group_5__12785);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1416:1: rule__Reference__Group_5__1__Impl : ( ( rule__Reference__OppositeAssignment_5_1 ) ) ;
    public final void rule__Reference__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1420:1: ( ( ( rule__Reference__OppositeAssignment_5_1 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1421:1: ( ( rule__Reference__OppositeAssignment_5_1 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1421:1: ( ( rule__Reference__OppositeAssignment_5_1 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1422:1: ( rule__Reference__OppositeAssignment_5_1 )
            {
             before(grammarAccess.getReferenceAccess().getOppositeAssignment_5_1()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1423:1: ( rule__Reference__OppositeAssignment_5_1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1423:2: rule__Reference__OppositeAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Reference__OppositeAssignment_5_1_in_rule__Reference__Group_5__1__Impl2812);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1437:1: rule__DataType__Group__0 : rule__DataType__Group__0__Impl rule__DataType__Group__1 ;
    public final void rule__DataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1441:1: ( rule__DataType__Group__0__Impl rule__DataType__Group__1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1442:2: rule__DataType__Group__0__Impl rule__DataType__Group__1
            {
            pushFollow(FOLLOW_rule__DataType__Group__0__Impl_in_rule__DataType__Group__02846);
            rule__DataType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataType__Group__1_in_rule__DataType__Group__02849);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1449:1: rule__DataType__Group__0__Impl : ( () ) ;
    public final void rule__DataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1453:1: ( ( () ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1454:1: ( () )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1454:1: ( () )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1455:1: ()
            {
             before(grammarAccess.getDataTypeAccess().getDataTypeAction_0()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1456:1: ()
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1458:1: 
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1468:1: rule__DataType__Group__1 : rule__DataType__Group__1__Impl rule__DataType__Group__2 ;
    public final void rule__DataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1472:1: ( rule__DataType__Group__1__Impl rule__DataType__Group__2 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1473:2: rule__DataType__Group__1__Impl rule__DataType__Group__2
            {
            pushFollow(FOLLOW_rule__DataType__Group__1__Impl_in_rule__DataType__Group__12907);
            rule__DataType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataType__Group__2_in_rule__DataType__Group__12910);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1480:1: rule__DataType__Group__1__Impl : ( 'var' ) ;
    public final void rule__DataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1484:1: ( ( 'var' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1485:1: ( 'var' )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1485:1: ( 'var' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1486:1: 'var'
            {
             before(grammarAccess.getDataTypeAccess().getVarKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__DataType__Group__1__Impl2938); 
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1499:1: rule__DataType__Group__2 : rule__DataType__Group__2__Impl rule__DataType__Group__3 ;
    public final void rule__DataType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1503:1: ( rule__DataType__Group__2__Impl rule__DataType__Group__3 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1504:2: rule__DataType__Group__2__Impl rule__DataType__Group__3
            {
            pushFollow(FOLLOW_rule__DataType__Group__2__Impl_in_rule__DataType__Group__22969);
            rule__DataType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataType__Group__3_in_rule__DataType__Group__22972);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1511:1: rule__DataType__Group__2__Impl : ( ( rule__DataType__NameAssignment_2 ) ) ;
    public final void rule__DataType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1515:1: ( ( ( rule__DataType__NameAssignment_2 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1516:1: ( ( rule__DataType__NameAssignment_2 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1516:1: ( ( rule__DataType__NameAssignment_2 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1517:1: ( rule__DataType__NameAssignment_2 )
            {
             before(grammarAccess.getDataTypeAccess().getNameAssignment_2()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1518:1: ( rule__DataType__NameAssignment_2 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1518:2: rule__DataType__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__DataType__NameAssignment_2_in_rule__DataType__Group__2__Impl2999);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1528:1: rule__DataType__Group__3 : rule__DataType__Group__3__Impl rule__DataType__Group__4 ;
    public final void rule__DataType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1532:1: ( rule__DataType__Group__3__Impl rule__DataType__Group__4 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1533:2: rule__DataType__Group__3__Impl rule__DataType__Group__4
            {
            pushFollow(FOLLOW_rule__DataType__Group__3__Impl_in_rule__DataType__Group__33029);
            rule__DataType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataType__Group__4_in_rule__DataType__Group__33032);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1540:1: rule__DataType__Group__3__Impl : ( ( rule__DataType__TypeAssignment_3 ) ) ;
    public final void rule__DataType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1544:1: ( ( ( rule__DataType__TypeAssignment_3 ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1545:1: ( ( rule__DataType__TypeAssignment_3 ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1545:1: ( ( rule__DataType__TypeAssignment_3 ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1546:1: ( rule__DataType__TypeAssignment_3 )
            {
             before(grammarAccess.getDataTypeAccess().getTypeAssignment_3()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1547:1: ( rule__DataType__TypeAssignment_3 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1547:2: rule__DataType__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__DataType__TypeAssignment_3_in_rule__DataType__Group__3__Impl3059);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1557:1: rule__DataType__Group__4 : rule__DataType__Group__4__Impl ;
    public final void rule__DataType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1561:1: ( rule__DataType__Group__4__Impl )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1562:2: rule__DataType__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__DataType__Group__4__Impl_in_rule__DataType__Group__43089);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1568:1: rule__DataType__Group__4__Impl : ( ( rule__DataType__ManyAssignment_4 )? ) ;
    public final void rule__DataType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1572:1: ( ( ( rule__DataType__ManyAssignment_4 )? ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1573:1: ( ( rule__DataType__ManyAssignment_4 )? )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1573:1: ( ( rule__DataType__ManyAssignment_4 )? )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1574:1: ( rule__DataType__ManyAssignment_4 )?
            {
             before(grammarAccess.getDataTypeAccess().getManyAssignment_4()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1575:1: ( rule__DataType__ManyAssignment_4 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1575:2: rule__DataType__ManyAssignment_4
                    {
                    pushFollow(FOLLOW_rule__DataType__ManyAssignment_4_in_rule__DataType__Group__4__Impl3116);
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


    // $ANTLR start "rule__QUALIFIED_NAME__Group__0"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1595:1: rule__QUALIFIED_NAME__Group__0 : rule__QUALIFIED_NAME__Group__0__Impl rule__QUALIFIED_NAME__Group__1 ;
    public final void rule__QUALIFIED_NAME__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1599:1: ( rule__QUALIFIED_NAME__Group__0__Impl rule__QUALIFIED_NAME__Group__1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1600:2: rule__QUALIFIED_NAME__Group__0__Impl rule__QUALIFIED_NAME__Group__1
            {
            pushFollow(FOLLOW_rule__QUALIFIED_NAME__Group__0__Impl_in_rule__QUALIFIED_NAME__Group__03157);
            rule__QUALIFIED_NAME__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QUALIFIED_NAME__Group__1_in_rule__QUALIFIED_NAME__Group__03160);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1607:1: rule__QUALIFIED_NAME__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QUALIFIED_NAME__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1611:1: ( ( RULE_ID ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1612:1: ( RULE_ID )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1612:1: ( RULE_ID )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1613:1: RULE_ID
            {
             before(grammarAccess.getQUALIFIED_NAMEAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QUALIFIED_NAME__Group__0__Impl3187); 
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1624:1: rule__QUALIFIED_NAME__Group__1 : rule__QUALIFIED_NAME__Group__1__Impl ;
    public final void rule__QUALIFIED_NAME__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1628:1: ( rule__QUALIFIED_NAME__Group__1__Impl )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1629:2: rule__QUALIFIED_NAME__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QUALIFIED_NAME__Group__1__Impl_in_rule__QUALIFIED_NAME__Group__13216);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1635:1: rule__QUALIFIED_NAME__Group__1__Impl : ( ( rule__QUALIFIED_NAME__Group_1__0 )* ) ;
    public final void rule__QUALIFIED_NAME__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1639:1: ( ( ( rule__QUALIFIED_NAME__Group_1__0 )* ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1640:1: ( ( rule__QUALIFIED_NAME__Group_1__0 )* )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1640:1: ( ( rule__QUALIFIED_NAME__Group_1__0 )* )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1641:1: ( rule__QUALIFIED_NAME__Group_1__0 )*
            {
             before(grammarAccess.getQUALIFIED_NAMEAccess().getGroup_1()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1642:1: ( rule__QUALIFIED_NAME__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==25) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1642:2: rule__QUALIFIED_NAME__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QUALIFIED_NAME__Group_1__0_in_rule__QUALIFIED_NAME__Group__1__Impl3243);
            	    rule__QUALIFIED_NAME__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1656:1: rule__QUALIFIED_NAME__Group_1__0 : rule__QUALIFIED_NAME__Group_1__0__Impl rule__QUALIFIED_NAME__Group_1__1 ;
    public final void rule__QUALIFIED_NAME__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1660:1: ( rule__QUALIFIED_NAME__Group_1__0__Impl rule__QUALIFIED_NAME__Group_1__1 )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1661:2: rule__QUALIFIED_NAME__Group_1__0__Impl rule__QUALIFIED_NAME__Group_1__1
            {
            pushFollow(FOLLOW_rule__QUALIFIED_NAME__Group_1__0__Impl_in_rule__QUALIFIED_NAME__Group_1__03278);
            rule__QUALIFIED_NAME__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QUALIFIED_NAME__Group_1__1_in_rule__QUALIFIED_NAME__Group_1__03281);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1668:1: rule__QUALIFIED_NAME__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QUALIFIED_NAME__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1672:1: ( ( '.' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1673:1: ( '.' )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1673:1: ( '.' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1674:1: '.'
            {
             before(grammarAccess.getQUALIFIED_NAMEAccess().getFullStopKeyword_1_0()); 
            match(input,25,FOLLOW_25_in_rule__QUALIFIED_NAME__Group_1__0__Impl3309); 
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1687:1: rule__QUALIFIED_NAME__Group_1__1 : rule__QUALIFIED_NAME__Group_1__1__Impl ;
    public final void rule__QUALIFIED_NAME__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1691:1: ( rule__QUALIFIED_NAME__Group_1__1__Impl )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1692:2: rule__QUALIFIED_NAME__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QUALIFIED_NAME__Group_1__1__Impl_in_rule__QUALIFIED_NAME__Group_1__13340);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1698:1: rule__QUALIFIED_NAME__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QUALIFIED_NAME__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1702:1: ( ( RULE_ID ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1703:1: ( RULE_ID )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1703:1: ( RULE_ID )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1704:1: RULE_ID
            {
             before(grammarAccess.getQUALIFIED_NAMEAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QUALIFIED_NAME__Group_1__1__Impl3367); 
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1720:1: rule__Module__NameAssignment_2 : ( ruleQUALIFIED_NAME ) ;
    public final void rule__Module__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1724:1: ( ( ruleQUALIFIED_NAME ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1725:1: ( ruleQUALIFIED_NAME )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1725:1: ( ruleQUALIFIED_NAME )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1726:1: ruleQUALIFIED_NAME
            {
             before(grammarAccess.getModuleAccess().getNameQUALIFIED_NAMEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleQUALIFIED_NAME_in_rule__Module__NameAssignment_23405);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1735:1: rule__Module__TypeAssignment_3 : ( ruleInternalDSLType ) ;
    public final void rule__Module__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1739:1: ( ( ruleInternalDSLType ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1740:1: ( ruleInternalDSLType )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1740:1: ( ruleInternalDSLType )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1741:1: ruleInternalDSLType
            {
             before(grammarAccess.getModuleAccess().getTypeInternalDSLTypeEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleInternalDSLType_in_rule__Module__TypeAssignment_33436);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1750:1: rule__Module__PackagesAssignment_4_0 : ( rulePackage ) ;
    public final void rule__Module__PackagesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1754:1: ( ( rulePackage ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1755:1: ( rulePackage )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1755:1: ( rulePackage )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1756:1: rulePackage
            {
             before(grammarAccess.getModuleAccess().getPackagesPackageParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_rulePackage_in_rule__Module__PackagesAssignment_4_03467);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1765:1: rule__Module__PackagesAssignment_4_1 : ( rulePackage ) ;
    public final void rule__Module__PackagesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1769:1: ( ( rulePackage ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1770:1: ( rulePackage )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1770:1: ( rulePackage )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1771:1: rulePackage
            {
             before(grammarAccess.getModuleAccess().getPackagesPackageParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_rulePackage_in_rule__Module__PackagesAssignment_4_13498);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1780:1: rule__Package__NameAssignment_2 : ( ruleQUALIFIED_NAME ) ;
    public final void rule__Package__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1784:1: ( ( ruleQUALIFIED_NAME ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1785:1: ( ruleQUALIFIED_NAME )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1785:1: ( ruleQUALIFIED_NAME )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1786:1: ruleQUALIFIED_NAME
            {
             before(grammarAccess.getPackageAccess().getNameQUALIFIED_NAMEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleQUALIFIED_NAME_in_rule__Package__NameAssignment_23529);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1795:1: rule__Package__EntitiesAssignment_4_0 : ( ruleEntity ) ;
    public final void rule__Package__EntitiesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1799:1: ( ( ruleEntity ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1800:1: ( ruleEntity )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1800:1: ( ruleEntity )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1801:1: ruleEntity
            {
             before(grammarAccess.getPackageAccess().getEntitiesEntityParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_ruleEntity_in_rule__Package__EntitiesAssignment_4_03560);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1810:1: rule__Package__EntitiesAssignment_4_1 : ( ruleEntity ) ;
    public final void rule__Package__EntitiesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1814:1: ( ( ruleEntity ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1815:1: ( ruleEntity )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1815:1: ( ruleEntity )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1816:1: ruleEntity
            {
             before(grammarAccess.getPackageAccess().getEntitiesEntityParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleEntity_in_rule__Package__EntitiesAssignment_4_13591);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1825:1: rule__Entity__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1829:1: ( ( RULE_ID ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1830:1: ( RULE_ID )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1830:1: ( RULE_ID )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1831:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_23622); 
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1840:1: rule__Entity__SuperEntityAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__SuperEntityAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1844:1: ( ( ( RULE_ID ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1845:1: ( ( RULE_ID ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1845:1: ( ( RULE_ID ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1846:1: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getSuperEntityEntityCrossReference_3_1_0()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1847:1: ( RULE_ID )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1848:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getSuperEntityEntityIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__SuperEntityAssignment_3_13657); 
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1859:1: rule__Entity__FeaturesAssignment_5_0 : ( ruleFeature ) ;
    public final void rule__Entity__FeaturesAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1863:1: ( ( ruleFeature ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1864:1: ( ruleFeature )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1864:1: ( ruleFeature )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1865:1: ruleFeature
            {
             before(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_ruleFeature_in_rule__Entity__FeaturesAssignment_5_03692);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1874:1: rule__Entity__FeaturesAssignment_5_1 : ( ruleFeature ) ;
    public final void rule__Entity__FeaturesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1878:1: ( ( ruleFeature ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1879:1: ( ruleFeature )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1879:1: ( ruleFeature )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1880:1: ruleFeature
            {
             before(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleFeature_in_rule__Entity__FeaturesAssignment_5_13723);
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


    // $ANTLR start "rule__Reference__NameAssignment_2"
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1889:1: rule__Reference__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Reference__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1893:1: ( ( RULE_ID ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1894:1: ( RULE_ID )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1894:1: ( RULE_ID )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1895:1: RULE_ID
            {
             before(grammarAccess.getReferenceAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Reference__NameAssignment_23754); 
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1904:1: rule__Reference__ReferenceAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Reference__ReferenceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1908:1: ( ( ( RULE_ID ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1909:1: ( ( RULE_ID ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1909:1: ( ( RULE_ID ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1910:1: ( RULE_ID )
            {
             before(grammarAccess.getReferenceAccess().getReferenceEntityCrossReference_3_0()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1911:1: ( RULE_ID )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1912:1: RULE_ID
            {
             before(grammarAccess.getReferenceAccess().getReferenceEntityIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Reference__ReferenceAssignment_33789); 
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1923:1: rule__Reference__ManyAssignment_4 : ( ( '[]' ) ) ;
    public final void rule__Reference__ManyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1927:1: ( ( ( '[]' ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1928:1: ( ( '[]' ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1928:1: ( ( '[]' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1929:1: ( '[]' )
            {
             before(grammarAccess.getReferenceAccess().getManyLeftSquareBracketRightSquareBracketKeyword_4_0()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1930:1: ( '[]' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1931:1: '[]'
            {
             before(grammarAccess.getReferenceAccess().getManyLeftSquareBracketRightSquareBracketKeyword_4_0()); 
            match(input,26,FOLLOW_26_in_rule__Reference__ManyAssignment_43829); 
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1946:1: rule__Reference__OppositeAssignment_5_1 : ( ( ruleQUALIFIED_NAME ) ) ;
    public final void rule__Reference__OppositeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1950:1: ( ( ( ruleQUALIFIED_NAME ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1951:1: ( ( ruleQUALIFIED_NAME ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1951:1: ( ( ruleQUALIFIED_NAME ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1952:1: ( ruleQUALIFIED_NAME )
            {
             before(grammarAccess.getReferenceAccess().getOppositeReferenceCrossReference_5_1_0()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1953:1: ( ruleQUALIFIED_NAME )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1954:1: ruleQUALIFIED_NAME
            {
             before(grammarAccess.getReferenceAccess().getOppositeReferenceQUALIFIED_NAMEParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_ruleQUALIFIED_NAME_in_rule__Reference__OppositeAssignment_5_13872);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1965:1: rule__DataType__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DataType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1969:1: ( ( RULE_ID ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1970:1: ( RULE_ID )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1970:1: ( RULE_ID )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1971:1: RULE_ID
            {
             before(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DataType__NameAssignment_23907); 
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1980:1: rule__DataType__TypeAssignment_3 : ( ruleDataTypes ) ;
    public final void rule__DataType__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1984:1: ( ( ruleDataTypes ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1985:1: ( ruleDataTypes )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1985:1: ( ruleDataTypes )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1986:1: ruleDataTypes
            {
             before(grammarAccess.getDataTypeAccess().getTypeDataTypesEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleDataTypes_in_rule__DataType__TypeAssignment_33938);
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
    // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1995:1: rule__DataType__ManyAssignment_4 : ( ( '[]' ) ) ;
    public final void rule__DataType__ManyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:1999:1: ( ( ( '[]' ) ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2000:1: ( ( '[]' ) )
            {
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2000:1: ( ( '[]' ) )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2001:1: ( '[]' )
            {
             before(grammarAccess.getDataTypeAccess().getManyLeftSquareBracketRightSquareBracketKeyword_4_0()); 
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2002:1: ( '[]' )
            // ../org.yazgel.titan.xtext.ui/src-gen/org/yazgel/titan/xtext/ui/contentassist/antlr/internal/InternalTitan.g:2003:1: '[]'
            {
             before(grammarAccess.getDataTypeAccess().getManyLeftSquareBracketRightSquareBracketKeyword_4_0()); 
            match(input,26,FOLLOW_26_in_rule__DataType__ManyAssignment_43974); 
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
    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Alternatives_in_ruleFeature274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_entryRuleReference301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReference308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__0_in_ruleReference334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_entryRuleDataType361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataType368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group__0_in_ruleDataType394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQUALIFIED_NAME_in_entryRuleQUALIFIED_NAME421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQUALIFIED_NAME428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QUALIFIED_NAME__Group__0_in_ruleQUALIFIED_NAME454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleInternalDSLType492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataTypes__Alternatives_in_ruleDataTypes530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_rule__Feature__Alternatives565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_rule__Feature__Alternatives582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__DataTypes__Alternatives615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__DataTypes__Alternatives636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__DataTypes__Alternatives657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__DataTypes__Alternatives678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__DataTypes__Alternatives699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__0__Impl_in_rule__Module__Group__0732 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Module__Group__1_in_rule__Module__Group__0735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__1__Impl_in_rule__Module__Group__1793 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Module__Group__2_in_rule__Module__Group__1796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Module__Group__1__Impl824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__2__Impl_in_rule__Module__Group__2855 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Module__Group__3_in_rule__Module__Group__2858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__NameAssignment_2_in_rule__Module__Group__2__Impl885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__3__Impl_in_rule__Module__Group__3915 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Module__Group__4_in_rule__Module__Group__3918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__TypeAssignment_3_in_rule__Module__Group__3__Impl945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__4__Impl_in_rule__Module__Group__4975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_4__0_in_rule__Module__Group__4__Impl1002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_4__0__Impl_in_rule__Module__Group_4__01043 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Module__Group_4__1_in_rule__Module__Group_4__01046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__PackagesAssignment_4_0_in_rule__Module__Group_4__0__Impl1073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_4__1__Impl_in_rule__Module__Group_4__11103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__PackagesAssignment_4_1_in_rule__Module__Group_4__1__Impl1130 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__01165 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Package__Group__1_in_rule__Package__Group__01168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__11226 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Package__Group__2_in_rule__Package__Group__11229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Package__Group__1__Impl1257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__21288 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Package__Group__3_in_rule__Package__Group__21291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__NameAssignment_2_in_rule__Package__Group__2__Impl1318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__3__Impl_in_rule__Package__Group__31348 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__Package__Group__4_in_rule__Package__Group__31351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Package__Group__3__Impl1379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__4__Impl_in_rule__Package__Group__41410 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__Package__Group__5_in_rule__Package__Group__41413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group_4__0_in_rule__Package__Group__4__Impl1440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__5__Impl_in_rule__Package__Group__51471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Package__Group__5__Impl1499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group_4__0__Impl_in_rule__Package__Group_4__01542 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Package__Group_4__1_in_rule__Package__Group_4__01545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__EntitiesAssignment_4_0_in_rule__Package__Group_4__0__Impl1572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group_4__1__Impl_in_rule__Package__Group_4__11602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__EntitiesAssignment_4_1_in_rule__Package__Group_4__1__Impl1629 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__01664 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__01667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__11725 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__11728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Entity__Group__1__Impl1756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__21787 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__21790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__NameAssignment_2_in_rule__Entity__Group__2__Impl1817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__31847 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__31850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__0_in_rule__Entity__Group__3__Impl1877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__41908 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__41911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Entity__Group__4__Impl1939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__51970 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_rule__Entity__Group__6_in_rule__Entity__Group__51973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_5__0_in_rule__Entity__Group__5__Impl2000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__6__Impl_in_rule__Entity__Group__62031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Entity__Group__6__Impl2059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__0__Impl_in_rule__Entity__Group_3__02104 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__1_in_rule__Entity__Group_3__02107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Entity__Group_3__0__Impl2135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__1__Impl_in_rule__Entity__Group_3__12166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__SuperEntityAssignment_3_1_in_rule__Entity__Group_3__1__Impl2193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_5__0__Impl_in_rule__Entity__Group_5__02227 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Entity__Group_5__1_in_rule__Entity__Group_5__02230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__FeaturesAssignment_5_0_in_rule__Entity__Group_5__0__Impl2257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_5__1__Impl_in_rule__Entity__Group_5__12287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__FeaturesAssignment_5_1_in_rule__Entity__Group_5__1__Impl2314 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__Reference__Group__0__Impl_in_rule__Reference__Group__02349 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Reference__Group__1_in_rule__Reference__Group__02352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__1__Impl_in_rule__Reference__Group__12410 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Reference__Group__2_in_rule__Reference__Group__12413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Reference__Group__1__Impl2441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__2__Impl_in_rule__Reference__Group__22472 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Reference__Group__3_in_rule__Reference__Group__22475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__NameAssignment_2_in_rule__Reference__Group__2__Impl2502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__3__Impl_in_rule__Reference__Group__32532 = new BitSet(new long[]{0x0000000005000000L});
    public static final BitSet FOLLOW_rule__Reference__Group__4_in_rule__Reference__Group__32535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__ReferenceAssignment_3_in_rule__Reference__Group__3__Impl2562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__4__Impl_in_rule__Reference__Group__42592 = new BitSet(new long[]{0x0000000005000000L});
    public static final BitSet FOLLOW_rule__Reference__Group__5_in_rule__Reference__Group__42595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__ManyAssignment_4_in_rule__Reference__Group__4__Impl2622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__5__Impl_in_rule__Reference__Group__52653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group_5__0_in_rule__Reference__Group__5__Impl2680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group_5__0__Impl_in_rule__Reference__Group_5__02723 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Reference__Group_5__1_in_rule__Reference__Group_5__02726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Reference__Group_5__0__Impl2754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group_5__1__Impl_in_rule__Reference__Group_5__12785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__OppositeAssignment_5_1_in_rule__Reference__Group_5__1__Impl2812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group__0__Impl_in_rule__DataType__Group__02846 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__DataType__Group__1_in_rule__DataType__Group__02849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group__1__Impl_in_rule__DataType__Group__12907 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DataType__Group__2_in_rule__DataType__Group__12910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__DataType__Group__1__Impl2938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group__2__Impl_in_rule__DataType__Group__22969 = new BitSet(new long[]{0x000000000001F000L});
    public static final BitSet FOLLOW_rule__DataType__Group__3_in_rule__DataType__Group__22972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__NameAssignment_2_in_rule__DataType__Group__2__Impl2999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group__3__Impl_in_rule__DataType__Group__33029 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__DataType__Group__4_in_rule__DataType__Group__33032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__TypeAssignment_3_in_rule__DataType__Group__3__Impl3059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group__4__Impl_in_rule__DataType__Group__43089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__ManyAssignment_4_in_rule__DataType__Group__4__Impl3116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QUALIFIED_NAME__Group__0__Impl_in_rule__QUALIFIED_NAME__Group__03157 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__QUALIFIED_NAME__Group__1_in_rule__QUALIFIED_NAME__Group__03160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QUALIFIED_NAME__Group__0__Impl3187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QUALIFIED_NAME__Group__1__Impl_in_rule__QUALIFIED_NAME__Group__13216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QUALIFIED_NAME__Group_1__0_in_rule__QUALIFIED_NAME__Group__1__Impl3243 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__QUALIFIED_NAME__Group_1__0__Impl_in_rule__QUALIFIED_NAME__Group_1__03278 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QUALIFIED_NAME__Group_1__1_in_rule__QUALIFIED_NAME__Group_1__03281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__QUALIFIED_NAME__Group_1__0__Impl3309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QUALIFIED_NAME__Group_1__1__Impl_in_rule__QUALIFIED_NAME__Group_1__13340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QUALIFIED_NAME__Group_1__1__Impl3367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQUALIFIED_NAME_in_rule__Module__NameAssignment_23405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalDSLType_in_rule__Module__TypeAssignment_33436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_rule__Module__PackagesAssignment_4_03467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_rule__Module__PackagesAssignment_4_13498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQUALIFIED_NAME_in_rule__Package__NameAssignment_23529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__Package__EntitiesAssignment_4_03560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__Package__EntitiesAssignment_4_13591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_23622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__SuperEntityAssignment_3_13657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_rule__Entity__FeaturesAssignment_5_03692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_rule__Entity__FeaturesAssignment_5_13723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Reference__NameAssignment_23754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Reference__ReferenceAssignment_33789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Reference__ManyAssignment_43829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQUALIFIED_NAME_in_rule__Reference__OppositeAssignment_5_13872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DataType__NameAssignment_23907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypes_in_rule__DataType__TypeAssignment_33938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__DataType__ManyAssignment_43974 = new BitSet(new long[]{0x0000000000000002L});

}