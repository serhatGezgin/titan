package org.yazgel.titan.xtext.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.yazgel.titan.xtext.services.TitanGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTitanParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'module'", "'package'", "'{'", "'}'", "'entity'", "':'", "'var'", "'[]'", "'opposite'", "'.'", "'Nested Functions'", "'String'", "'integer'", "'boolean'", "'long'", "'double'"
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
    public String getGrammarFileName() { return "../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g"; }



     	private TitanGrammarAccess grammarAccess;
     	
        public InternalTitanParser(TokenStream input, TitanGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Module";	
       	}
       	
       	@Override
       	protected TitanGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModule"
    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:68:1: entryRuleModule returns [EObject current=null] : iv_ruleModule= ruleModule EOF ;
    public final EObject entryRuleModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModule = null;


        try {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:69:2: (iv_ruleModule= ruleModule EOF )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:70:2: iv_ruleModule= ruleModule EOF
            {
             newCompositeNode(grammarAccess.getModuleRule()); 
            pushFollow(FOLLOW_ruleModule_in_entryRuleModule75);
            iv_ruleModule=ruleModule();

            state._fsp--;

             current =iv_ruleModule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModule85); 

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
    // $ANTLR end "entryRuleModule"


    // $ANTLR start "ruleModule"
    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:77:1: ruleModule returns [EObject current=null] : ( () otherlv_1= 'module' ( (lv_name_2_0= ruleQUALIFIED_NAME ) ) ( (lv_type_3_0= ruleInternalDSLType ) ) ( ( (lv_packages_4_0= rulePackage ) ) ( (lv_packages_5_0= rulePackage ) )* )? ) ;
    public final EObject ruleModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_type_3_0 = null;

        EObject lv_packages_4_0 = null;

        EObject lv_packages_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:80:28: ( ( () otherlv_1= 'module' ( (lv_name_2_0= ruleQUALIFIED_NAME ) ) ( (lv_type_3_0= ruleInternalDSLType ) ) ( ( (lv_packages_4_0= rulePackage ) ) ( (lv_packages_5_0= rulePackage ) )* )? ) )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:81:1: ( () otherlv_1= 'module' ( (lv_name_2_0= ruleQUALIFIED_NAME ) ) ( (lv_type_3_0= ruleInternalDSLType ) ) ( ( (lv_packages_4_0= rulePackage ) ) ( (lv_packages_5_0= rulePackage ) )* )? )
            {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:81:1: ( () otherlv_1= 'module' ( (lv_name_2_0= ruleQUALIFIED_NAME ) ) ( (lv_type_3_0= ruleInternalDSLType ) ) ( ( (lv_packages_4_0= rulePackage ) ) ( (lv_packages_5_0= rulePackage ) )* )? )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:81:2: () otherlv_1= 'module' ( (lv_name_2_0= ruleQUALIFIED_NAME ) ) ( (lv_type_3_0= ruleInternalDSLType ) ) ( ( (lv_packages_4_0= rulePackage ) ) ( (lv_packages_5_0= rulePackage ) )* )?
            {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:81:2: ()
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:82:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getModuleAccess().getModuleAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleModule131); 

                	newLeafNode(otherlv_1, grammarAccess.getModuleAccess().getModuleKeyword_1());
                
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:91:1: ( (lv_name_2_0= ruleQUALIFIED_NAME ) )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:92:1: (lv_name_2_0= ruleQUALIFIED_NAME )
            {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:92:1: (lv_name_2_0= ruleQUALIFIED_NAME )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:93:3: lv_name_2_0= ruleQUALIFIED_NAME
            {
             
            	        newCompositeNode(grammarAccess.getModuleAccess().getNameQUALIFIED_NAMEParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQUALIFIED_NAME_in_ruleModule152);
            lv_name_2_0=ruleQUALIFIED_NAME();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModuleRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"QUALIFIED_NAME");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:109:2: ( (lv_type_3_0= ruleInternalDSLType ) )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:110:1: (lv_type_3_0= ruleInternalDSLType )
            {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:110:1: (lv_type_3_0= ruleInternalDSLType )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:111:3: lv_type_3_0= ruleInternalDSLType
            {
             
            	        newCompositeNode(grammarAccess.getModuleAccess().getTypeInternalDSLTypeEnumRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleInternalDSLType_in_ruleModule173);
            lv_type_3_0=ruleInternalDSLType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModuleRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"InternalDSLType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:127:2: ( ( (lv_packages_4_0= rulePackage ) ) ( (lv_packages_5_0= rulePackage ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:127:3: ( (lv_packages_4_0= rulePackage ) ) ( (lv_packages_5_0= rulePackage ) )*
                    {
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:127:3: ( (lv_packages_4_0= rulePackage ) )
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:128:1: (lv_packages_4_0= rulePackage )
                    {
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:128:1: (lv_packages_4_0= rulePackage )
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:129:3: lv_packages_4_0= rulePackage
                    {
                     
                    	        newCompositeNode(grammarAccess.getModuleAccess().getPackagesPackageParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulePackage_in_ruleModule195);
                    lv_packages_4_0=rulePackage();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModuleRule());
                    	        }
                           		add(
                           			current, 
                           			"packages",
                            		lv_packages_4_0, 
                            		"Package");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:145:2: ( (lv_packages_5_0= rulePackage ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==12) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:146:1: (lv_packages_5_0= rulePackage )
                    	    {
                    	    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:146:1: (lv_packages_5_0= rulePackage )
                    	    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:147:3: lv_packages_5_0= rulePackage
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getModuleAccess().getPackagesPackageParserRuleCall_4_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulePackage_in_ruleModule216);
                    	    lv_packages_5_0=rulePackage();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getModuleRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"packages",
                    	            		lv_packages_5_0, 
                    	            		"Package");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


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
    // $ANTLR end "ruleModule"


    // $ANTLR start "entryRulePackage"
    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:171:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:172:2: (iv_rulePackage= rulePackage EOF )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:173:2: iv_rulePackage= rulePackage EOF
            {
             newCompositeNode(grammarAccess.getPackageRule()); 
            pushFollow(FOLLOW_rulePackage_in_entryRulePackage255);
            iv_rulePackage=rulePackage();

            state._fsp--;

             current =iv_rulePackage; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage265); 

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
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:180:1: rulePackage returns [EObject current=null] : ( () otherlv_1= 'package' ( (lv_name_2_0= ruleQUALIFIED_NAME ) ) otherlv_3= '{' ( ( (lv_entities_4_0= ruleEntity ) ) ( (lv_entities_5_0= ruleEntity ) )* )? otherlv_6= '}' ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_entities_4_0 = null;

        EObject lv_entities_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:183:28: ( ( () otherlv_1= 'package' ( (lv_name_2_0= ruleQUALIFIED_NAME ) ) otherlv_3= '{' ( ( (lv_entities_4_0= ruleEntity ) ) ( (lv_entities_5_0= ruleEntity ) )* )? otherlv_6= '}' ) )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:184:1: ( () otherlv_1= 'package' ( (lv_name_2_0= ruleQUALIFIED_NAME ) ) otherlv_3= '{' ( ( (lv_entities_4_0= ruleEntity ) ) ( (lv_entities_5_0= ruleEntity ) )* )? otherlv_6= '}' )
            {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:184:1: ( () otherlv_1= 'package' ( (lv_name_2_0= ruleQUALIFIED_NAME ) ) otherlv_3= '{' ( ( (lv_entities_4_0= ruleEntity ) ) ( (lv_entities_5_0= ruleEntity ) )* )? otherlv_6= '}' )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:184:2: () otherlv_1= 'package' ( (lv_name_2_0= ruleQUALIFIED_NAME ) ) otherlv_3= '{' ( ( (lv_entities_4_0= ruleEntity ) ) ( (lv_entities_5_0= ruleEntity ) )* )? otherlv_6= '}'
            {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:184:2: ()
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:185:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPackageAccess().getPackageAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_rulePackage311); 

                	newLeafNode(otherlv_1, grammarAccess.getPackageAccess().getPackageKeyword_1());
                
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:194:1: ( (lv_name_2_0= ruleQUALIFIED_NAME ) )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:195:1: (lv_name_2_0= ruleQUALIFIED_NAME )
            {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:195:1: (lv_name_2_0= ruleQUALIFIED_NAME )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:196:3: lv_name_2_0= ruleQUALIFIED_NAME
            {
             
            	        newCompositeNode(grammarAccess.getPackageAccess().getNameQUALIFIED_NAMEParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQUALIFIED_NAME_in_rulePackage332);
            lv_name_2_0=ruleQUALIFIED_NAME();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPackageRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"QUALIFIED_NAME");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_rulePackage344); 

                	newLeafNode(otherlv_3, grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:216:1: ( ( (lv_entities_4_0= ruleEntity ) ) ( (lv_entities_5_0= ruleEntity ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:216:2: ( (lv_entities_4_0= ruleEntity ) ) ( (lv_entities_5_0= ruleEntity ) )*
                    {
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:216:2: ( (lv_entities_4_0= ruleEntity ) )
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:217:1: (lv_entities_4_0= ruleEntity )
                    {
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:217:1: (lv_entities_4_0= ruleEntity )
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:218:3: lv_entities_4_0= ruleEntity
                    {
                     
                    	        newCompositeNode(grammarAccess.getPackageAccess().getEntitiesEntityParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEntity_in_rulePackage366);
                    lv_entities_4_0=ruleEntity();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPackageRule());
                    	        }
                           		add(
                           			current, 
                           			"entities",
                            		lv_entities_4_0, 
                            		"Entity");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:234:2: ( (lv_entities_5_0= ruleEntity ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==15) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:235:1: (lv_entities_5_0= ruleEntity )
                    	    {
                    	    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:235:1: (lv_entities_5_0= ruleEntity )
                    	    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:236:3: lv_entities_5_0= ruleEntity
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPackageAccess().getEntitiesEntityParserRuleCall_4_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleEntity_in_rulePackage387);
                    	    lv_entities_5_0=ruleEntity();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getPackageRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"entities",
                    	            		lv_entities_5_0, 
                    	            		"Entity");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_rulePackage402); 

                	newLeafNode(otherlv_6, grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRuleEntity"
    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:264:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:265:2: (iv_ruleEntity= ruleEntity EOF )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:266:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity438);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity448); 

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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:273:1: ruleEntity returns [EObject current=null] : ( () otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( ( (lv_features_6_0= ruleFeature ) ) ( (lv_features_7_0= ruleFeature ) )* )? otherlv_8= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        EObject lv_features_6_0 = null;

        EObject lv_features_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:276:28: ( ( () otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( ( (lv_features_6_0= ruleFeature ) ) ( (lv_features_7_0= ruleFeature ) )* )? otherlv_8= '}' ) )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:277:1: ( () otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( ( (lv_features_6_0= ruleFeature ) ) ( (lv_features_7_0= ruleFeature ) )* )? otherlv_8= '}' )
            {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:277:1: ( () otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( ( (lv_features_6_0= ruleFeature ) ) ( (lv_features_7_0= ruleFeature ) )* )? otherlv_8= '}' )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:277:2: () otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( ( (lv_features_6_0= ruleFeature ) ) ( (lv_features_7_0= ruleFeature ) )* )? otherlv_8= '}'
            {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:277:2: ()
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:278:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEntityAccess().getEntityAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleEntity494); 

                	newLeafNode(otherlv_1, grammarAccess.getEntityAccess().getEntityKeyword_1());
                
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:287:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:288:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:288:1: (lv_name_2_0= RULE_ID )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:289:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity511); 

            			newLeafNode(lv_name_2_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEntityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:305:2: (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:305:4: otherlv_3= ':' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleEntity529); 

                        	newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getColonKeyword_3_0());
                        
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:309:1: ( (otherlv_4= RULE_ID ) )
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:310:1: (otherlv_4= RULE_ID )
                    {
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:310:1: (otherlv_4= RULE_ID )
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:311:3: otherlv_4= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity549); 

                    		newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getSuperEntityEntityCrossReference_3_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleEntity563); 

                	newLeafNode(otherlv_5, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_4());
                
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:326:1: ( ( (lv_features_6_0= ruleFeature ) ) ( (lv_features_7_0= ruleFeature ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:326:2: ( (lv_features_6_0= ruleFeature ) ) ( (lv_features_7_0= ruleFeature ) )*
                    {
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:326:2: ( (lv_features_6_0= ruleFeature ) )
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:327:1: (lv_features_6_0= ruleFeature )
                    {
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:327:1: (lv_features_6_0= ruleFeature )
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:328:3: lv_features_6_0= ruleFeature
                    {
                     
                    	        newCompositeNode(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_5_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFeature_in_ruleEntity585);
                    lv_features_6_0=ruleFeature();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEntityRule());
                    	        }
                           		add(
                           			current, 
                           			"features",
                            		lv_features_6_0, 
                            		"Feature");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:344:2: ( (lv_features_7_0= ruleFeature ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==17) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:345:1: (lv_features_7_0= ruleFeature )
                    	    {
                    	    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:345:1: (lv_features_7_0= ruleFeature )
                    	    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:346:3: lv_features_7_0= ruleFeature
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleFeature_in_ruleEntity606);
                    	    lv_features_7_0=ruleFeature();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEntityRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"features",
                    	            		lv_features_7_0, 
                    	            		"Feature");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleEntity621); 

                	newLeafNode(otherlv_8, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleFeature"
    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:374:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:375:2: (iv_ruleFeature= ruleFeature EOF )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:376:2: iv_ruleFeature= ruleFeature EOF
            {
             newCompositeNode(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature657);
            iv_ruleFeature=ruleFeature();

            state._fsp--;

             current =iv_ruleFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature667); 

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
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:383:1: ruleFeature returns [EObject current=null] : (this_Reference_0= ruleReference | this_DataType_1= ruleDataType ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        EObject this_Reference_0 = null;

        EObject this_DataType_1 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:386:28: ( (this_Reference_0= ruleReference | this_DataType_1= ruleDataType ) )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:387:1: (this_Reference_0= ruleReference | this_DataType_1= ruleDataType )
            {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:387:1: (this_Reference_0= ruleReference | this_DataType_1= ruleDataType )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==RULE_ID) ) {
                    int LA8_2 = input.LA(3);

                    if ( (LA8_2==RULE_ID) ) {
                        alt8=1;
                    }
                    else if ( ((LA8_2>=22 && LA8_2<=26)) ) {
                        alt8=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:388:5: this_Reference_0= ruleReference
                    {
                     
                            newCompositeNode(grammarAccess.getFeatureAccess().getReferenceParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleReference_in_ruleFeature714);
                    this_Reference_0=ruleReference();

                    state._fsp--;

                     
                            current = this_Reference_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:398:5: this_DataType_1= ruleDataType
                    {
                     
                            newCompositeNode(grammarAccess.getFeatureAccess().getDataTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDataType_in_ruleFeature741);
                    this_DataType_1=ruleDataType();

                    state._fsp--;

                     
                            current = this_DataType_1; 
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
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleReference"
    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:414:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:415:2: (iv_ruleReference= ruleReference EOF )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:416:2: iv_ruleReference= ruleReference EOF
            {
             newCompositeNode(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_ruleReference_in_entryRuleReference776);
            iv_ruleReference=ruleReference();

            state._fsp--;

             current =iv_ruleReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReference786); 

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
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:423:1: ruleReference returns [EObject current=null] : ( () otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= RULE_ID ) ) ( (lv_many_4_0= '[]' ) )? (otherlv_5= 'opposite' ( ( ruleQUALIFIED_NAME ) ) )? ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_many_4_0=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:426:28: ( ( () otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= RULE_ID ) ) ( (lv_many_4_0= '[]' ) )? (otherlv_5= 'opposite' ( ( ruleQUALIFIED_NAME ) ) )? ) )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:427:1: ( () otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= RULE_ID ) ) ( (lv_many_4_0= '[]' ) )? (otherlv_5= 'opposite' ( ( ruleQUALIFIED_NAME ) ) )? )
            {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:427:1: ( () otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= RULE_ID ) ) ( (lv_many_4_0= '[]' ) )? (otherlv_5= 'opposite' ( ( ruleQUALIFIED_NAME ) ) )? )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:427:2: () otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= RULE_ID ) ) ( (lv_many_4_0= '[]' ) )? (otherlv_5= 'opposite' ( ( ruleQUALIFIED_NAME ) ) )?
            {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:427:2: ()
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:428:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getReferenceAccess().getReferenceAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleReference832); 

                	newLeafNode(otherlv_1, grammarAccess.getReferenceAccess().getVarKeyword_1());
                
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:437:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:438:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:438:1: (lv_name_2_0= RULE_ID )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:439:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReference849); 

            			newLeafNode(lv_name_2_0, grammarAccess.getReferenceAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getReferenceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:455:2: ( (otherlv_3= RULE_ID ) )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:456:1: (otherlv_3= RULE_ID )
            {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:456:1: (otherlv_3= RULE_ID )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:457:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getReferenceRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReference874); 

            		newLeafNode(otherlv_3, grammarAccess.getReferenceAccess().getReferenceEntityCrossReference_3_0()); 
            	

            }


            }

            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:468:2: ( (lv_many_4_0= '[]' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:469:1: (lv_many_4_0= '[]' )
                    {
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:469:1: (lv_many_4_0= '[]' )
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:470:3: lv_many_4_0= '[]'
                    {
                    lv_many_4_0=(Token)match(input,18,FOLLOW_18_in_ruleReference892); 

                            newLeafNode(lv_many_4_0, grammarAccess.getReferenceAccess().getManyLeftSquareBracketRightSquareBracketKeyword_4_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getReferenceRule());
                    	        }
                           		setWithLastConsumed(current, "many", true, "[]");
                    	    

                    }


                    }
                    break;

            }

            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:483:3: (otherlv_5= 'opposite' ( ( ruleQUALIFIED_NAME ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:483:5: otherlv_5= 'opposite' ( ( ruleQUALIFIED_NAME ) )
                    {
                    otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleReference919); 

                        	newLeafNode(otherlv_5, grammarAccess.getReferenceAccess().getOppositeKeyword_5_0());
                        
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:487:1: ( ( ruleQUALIFIED_NAME ) )
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:488:1: ( ruleQUALIFIED_NAME )
                    {
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:488:1: ( ruleQUALIFIED_NAME )
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:489:3: ruleQUALIFIED_NAME
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getReferenceRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getReferenceAccess().getOppositeReferenceCrossReference_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQUALIFIED_NAME_in_ruleReference942);
                    ruleQUALIFIED_NAME();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


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
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleDataType"
    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:510:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:511:2: (iv_ruleDataType= ruleDataType EOF )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:512:2: iv_ruleDataType= ruleDataType EOF
            {
             newCompositeNode(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_ruleDataType_in_entryRuleDataType980);
            iv_ruleDataType=ruleDataType();

            state._fsp--;

             current =iv_ruleDataType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataType990); 

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
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:519:1: ruleDataType returns [EObject current=null] : ( () otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) ( (lv_type_3_0= ruleDataTypes ) ) ( (lv_many_4_0= '[]' ) )? ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token lv_many_4_0=null;
        Enumerator lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:522:28: ( ( () otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) ( (lv_type_3_0= ruleDataTypes ) ) ( (lv_many_4_0= '[]' ) )? ) )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:523:1: ( () otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) ( (lv_type_3_0= ruleDataTypes ) ) ( (lv_many_4_0= '[]' ) )? )
            {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:523:1: ( () otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) ( (lv_type_3_0= ruleDataTypes ) ) ( (lv_many_4_0= '[]' ) )? )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:523:2: () otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) ( (lv_type_3_0= ruleDataTypes ) ) ( (lv_many_4_0= '[]' ) )?
            {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:523:2: ()
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:524:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDataTypeAccess().getDataTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleDataType1036); 

                	newLeafNode(otherlv_1, grammarAccess.getDataTypeAccess().getVarKeyword_1());
                
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:533:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:534:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:534:1: (lv_name_2_0= RULE_ID )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:535:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataType1053); 

            			newLeafNode(lv_name_2_0, grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDataTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:551:2: ( (lv_type_3_0= ruleDataTypes ) )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:552:1: (lv_type_3_0= ruleDataTypes )
            {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:552:1: (lv_type_3_0= ruleDataTypes )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:553:3: lv_type_3_0= ruleDataTypes
            {
             
            	        newCompositeNode(grammarAccess.getDataTypeAccess().getTypeDataTypesEnumRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleDataTypes_in_ruleDataType1079);
            lv_type_3_0=ruleDataTypes();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDataTypeRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"DataTypes");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:569:2: ( (lv_many_4_0= '[]' ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==18) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:570:1: (lv_many_4_0= '[]' )
                    {
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:570:1: (lv_many_4_0= '[]' )
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:571:3: lv_many_4_0= '[]'
                    {
                    lv_many_4_0=(Token)match(input,18,FOLLOW_18_in_ruleDataType1097); 

                            newLeafNode(lv_many_4_0, grammarAccess.getDataTypeAccess().getManyLeftSquareBracketRightSquareBracketKeyword_4_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDataTypeRule());
                    	        }
                           		setWithLastConsumed(current, "many", true, "[]");
                    	    

                    }


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
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleQUALIFIED_NAME"
    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:592:1: entryRuleQUALIFIED_NAME returns [String current=null] : iv_ruleQUALIFIED_NAME= ruleQUALIFIED_NAME EOF ;
    public final String entryRuleQUALIFIED_NAME() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQUALIFIED_NAME = null;


        try {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:593:2: (iv_ruleQUALIFIED_NAME= ruleQUALIFIED_NAME EOF )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:594:2: iv_ruleQUALIFIED_NAME= ruleQUALIFIED_NAME EOF
            {
             newCompositeNode(grammarAccess.getQUALIFIED_NAMERule()); 
            pushFollow(FOLLOW_ruleQUALIFIED_NAME_in_entryRuleQUALIFIED_NAME1148);
            iv_ruleQUALIFIED_NAME=ruleQUALIFIED_NAME();

            state._fsp--;

             current =iv_ruleQUALIFIED_NAME.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQUALIFIED_NAME1159); 

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
    // $ANTLR end "entryRuleQUALIFIED_NAME"


    // $ANTLR start "ruleQUALIFIED_NAME"
    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:601:1: ruleQUALIFIED_NAME returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQUALIFIED_NAME() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:604:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:605:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:605:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:605:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQUALIFIED_NAME1199); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQUALIFIED_NAMEAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:612:1: (kw= '.' this_ID_2= RULE_ID )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==20) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:613:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,20,FOLLOW_20_in_ruleQUALIFIED_NAME1218); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQUALIFIED_NAMEAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQUALIFIED_NAME1233); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQUALIFIED_NAMEAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop12;
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
    // $ANTLR end "ruleQUALIFIED_NAME"


    // $ANTLR start "ruleInternalDSLType"
    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:633:1: ruleInternalDSLType returns [Enumerator current=null] : (enumLiteral_0= 'Nested Functions' ) ;
    public final Enumerator ruleInternalDSLType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:635:28: ( (enumLiteral_0= 'Nested Functions' ) )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:636:1: (enumLiteral_0= 'Nested Functions' )
            {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:636:1: (enumLiteral_0= 'Nested Functions' )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:636:3: enumLiteral_0= 'Nested Functions'
            {
            enumLiteral_0=(Token)match(input,21,FOLLOW_21_in_ruleInternalDSLType1293); 

                    current = grammarAccess.getInternalDSLTypeAccess().getNestedFunctionsEnumLiteralDeclaration().getEnumLiteral().getInstance();
                    newLeafNode(enumLiteral_0, grammarAccess.getInternalDSLTypeAccess().getNestedFunctionsEnumLiteralDeclaration()); 
                

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
    // $ANTLR end "ruleInternalDSLType"


    // $ANTLR start "ruleDataTypes"
    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:646:1: ruleDataTypes returns [Enumerator current=null] : ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'boolean' ) | (enumLiteral_3= 'long' ) | (enumLiteral_4= 'double' ) ) ;
    public final Enumerator ruleDataTypes() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:648:28: ( ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'boolean' ) | (enumLiteral_3= 'long' ) | (enumLiteral_4= 'double' ) ) )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:649:1: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'boolean' ) | (enumLiteral_3= 'long' ) | (enumLiteral_4= 'double' ) )
            {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:649:1: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'boolean' ) | (enumLiteral_3= 'long' ) | (enumLiteral_4= 'double' ) )
            int alt13=5;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt13=1;
                }
                break;
            case 23:
                {
                alt13=2;
                }
                break;
            case 24:
                {
                alt13=3;
                }
                break;
            case 25:
                {
                alt13=4;
                }
                break;
            case 26:
                {
                alt13=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:649:2: (enumLiteral_0= 'String' )
                    {
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:649:2: (enumLiteral_0= 'String' )
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:649:4: enumLiteral_0= 'String'
                    {
                    enumLiteral_0=(Token)match(input,22,FOLLOW_22_in_ruleDataTypes1337); 

                            current = grammarAccess.getDataTypesAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getDataTypesAccess().getStringEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:655:6: (enumLiteral_1= 'integer' )
                    {
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:655:6: (enumLiteral_1= 'integer' )
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:655:8: enumLiteral_1= 'integer'
                    {
                    enumLiteral_1=(Token)match(input,23,FOLLOW_23_in_ruleDataTypes1354); 

                            current = grammarAccess.getDataTypesAccess().getIntegerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getDataTypesAccess().getIntegerEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:661:6: (enumLiteral_2= 'boolean' )
                    {
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:661:6: (enumLiteral_2= 'boolean' )
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:661:8: enumLiteral_2= 'boolean'
                    {
                    enumLiteral_2=(Token)match(input,24,FOLLOW_24_in_ruleDataTypes1371); 

                            current = grammarAccess.getDataTypesAccess().getBooleanEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getDataTypesAccess().getBooleanEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:667:6: (enumLiteral_3= 'long' )
                    {
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:667:6: (enumLiteral_3= 'long' )
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:667:8: enumLiteral_3= 'long'
                    {
                    enumLiteral_3=(Token)match(input,25,FOLLOW_25_in_ruleDataTypes1388); 

                            current = grammarAccess.getDataTypesAccess().getLongEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getDataTypesAccess().getLongEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:673:6: (enumLiteral_4= 'double' )
                    {
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:673:6: (enumLiteral_4= 'double' )
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:673:8: enumLiteral_4= 'double'
                    {
                    enumLiteral_4=(Token)match(input,26,FOLLOW_26_in_ruleDataTypes1405); 

                            current = grammarAccess.getDataTypesAccess().getDoubleEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getDataTypesAccess().getDoubleEnumLiteralDeclaration_4()); 
                        

                    }


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
    // $ANTLR end "ruleDataTypes"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModule_in_entryRuleModule75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModule85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleModule131 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQUALIFIED_NAME_in_ruleModule152 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ruleInternalDSLType_in_ruleModule173 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rulePackage_in_ruleModule195 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rulePackage_in_ruleModule216 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rulePackage_in_entryRulePackage255 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rulePackage311 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQUALIFIED_NAME_in_rulePackage332 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulePackage344 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_ruleEntity_in_rulePackage366 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_ruleEntity_in_rulePackage387 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_rulePackage402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity438 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleEntity494 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity511 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_16_in_ruleEntity529 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity549 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleEntity563 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_ruleFeature_in_ruleEntity585 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_ruleFeature_in_ruleEntity606 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_14_in_ruleEntity621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature657 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_ruleFeature714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleFeature741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_entryRuleReference776 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReference786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleReference832 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReference849 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReference874 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_18_in_ruleReference892 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleReference919 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQUALIFIED_NAME_in_ruleReference942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_entryRuleDataType980 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataType990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleDataType1036 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataType1053 = new BitSet(new long[]{0x0000000007C00000L});
    public static final BitSet FOLLOW_ruleDataTypes_in_ruleDataType1079 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleDataType1097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQUALIFIED_NAME_in_entryRuleQUALIFIED_NAME1148 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQUALIFIED_NAME1159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQUALIFIED_NAME1199 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleQUALIFIED_NAME1218 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQUALIFIED_NAME1233 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_21_in_ruleInternalDSLType1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleDataTypes1337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleDataTypes1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleDataTypes1371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleDataTypes1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleDataTypes1405 = new BitSet(new long[]{0x0000000000000002L});

}