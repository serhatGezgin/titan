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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'module'", "'package'", "'{'", "'}'", "'entity'", "':'", "'var'", "'unique'", "'opposite'", "'[]'", "'.'", "'Nested Functions'", "'String'", "'integer'", "'boolean'", "'long'", "'double'"
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

                    if ( ((LA8_2>=23 && LA8_2<=27)) ) {
                        alt8=2;
                    }
                    else if ( (LA8_2==RULE_ID) ) {
                        alt8=1;
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
    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:423:1: ruleReference returns [EObject current=null] : (this_SingleReference_0= ruleSingleReference | this_MultiReference_1= ruleMultiReference ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        EObject this_SingleReference_0 = null;

        EObject this_MultiReference_1 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:426:28: ( (this_SingleReference_0= ruleSingleReference | this_MultiReference_1= ruleMultiReference ) )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:427:1: (this_SingleReference_0= ruleSingleReference | this_MultiReference_1= ruleMultiReference )
            {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:427:1: (this_SingleReference_0= ruleSingleReference | this_MultiReference_1= ruleMultiReference )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==RULE_ID) ) {
                    int LA9_2 = input.LA(3);

                    if ( (LA9_2==RULE_ID) ) {
                        int LA9_3 = input.LA(4);

                        if ( (LA9_3==EOF||LA9_3==14||(LA9_3>=17 && LA9_3<=19)) ) {
                            alt9=1;
                        }
                        else if ( (LA9_3==20) ) {
                            alt9=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 9, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:428:5: this_SingleReference_0= ruleSingleReference
                    {
                     
                            newCompositeNode(grammarAccess.getReferenceAccess().getSingleReferenceParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSingleReference_in_ruleReference833);
                    this_SingleReference_0=ruleSingleReference();

                    state._fsp--;

                     
                            current = this_SingleReference_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:438:5: this_MultiReference_1= ruleMultiReference
                    {
                     
                            newCompositeNode(grammarAccess.getReferenceAccess().getMultiReferenceParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleMultiReference_in_ruleReference860);
                    this_MultiReference_1=ruleMultiReference();

                    state._fsp--;

                     
                            current = this_MultiReference_1; 
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
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleSingleReference"
    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:454:1: entryRuleSingleReference returns [EObject current=null] : iv_ruleSingleReference= ruleSingleReference EOF ;
    public final EObject entryRuleSingleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleReference = null;


        try {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:455:2: (iv_ruleSingleReference= ruleSingleReference EOF )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:456:2: iv_ruleSingleReference= ruleSingleReference EOF
            {
             newCompositeNode(grammarAccess.getSingleReferenceRule()); 
            pushFollow(FOLLOW_ruleSingleReference_in_entryRuleSingleReference895);
            iv_ruleSingleReference=ruleSingleReference();

            state._fsp--;

             current =iv_ruleSingleReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleReference905); 

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
    // $ANTLR end "entryRuleSingleReference"


    // $ANTLR start "ruleSingleReference"
    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:463:1: ruleSingleReference returns [EObject current=null] : ( () otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= RULE_ID ) ) ( (lv_unique_4_0= 'unique' ) )? (otherlv_5= 'opposite' ( ( ruleQUALIFIED_NAME ) ) )? ) ;
    public final EObject ruleSingleReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_unique_4_0=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:466:28: ( ( () otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= RULE_ID ) ) ( (lv_unique_4_0= 'unique' ) )? (otherlv_5= 'opposite' ( ( ruleQUALIFIED_NAME ) ) )? ) )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:467:1: ( () otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= RULE_ID ) ) ( (lv_unique_4_0= 'unique' ) )? (otherlv_5= 'opposite' ( ( ruleQUALIFIED_NAME ) ) )? )
            {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:467:1: ( () otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= RULE_ID ) ) ( (lv_unique_4_0= 'unique' ) )? (otherlv_5= 'opposite' ( ( ruleQUALIFIED_NAME ) ) )? )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:467:2: () otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= RULE_ID ) ) ( (lv_unique_4_0= 'unique' ) )? (otherlv_5= 'opposite' ( ( ruleQUALIFIED_NAME ) ) )?
            {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:467:2: ()
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:468:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSingleReferenceAccess().getSingleReferenceAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleSingleReference951); 

                	newLeafNode(otherlv_1, grammarAccess.getSingleReferenceAccess().getVarKeyword_1());
                
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:477:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:478:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:478:1: (lv_name_2_0= RULE_ID )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:479:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSingleReference968); 

            			newLeafNode(lv_name_2_0, grammarAccess.getSingleReferenceAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSingleReferenceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:495:2: ( (otherlv_3= RULE_ID ) )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:496:1: (otherlv_3= RULE_ID )
            {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:496:1: (otherlv_3= RULE_ID )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:497:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSingleReferenceRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSingleReference993); 

            		newLeafNode(otherlv_3, grammarAccess.getSingleReferenceAccess().getReferenceEntityCrossReference_3_0()); 
            	

            }


            }

            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:508:2: ( (lv_unique_4_0= 'unique' ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:509:1: (lv_unique_4_0= 'unique' )
                    {
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:509:1: (lv_unique_4_0= 'unique' )
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:510:3: lv_unique_4_0= 'unique'
                    {
                    lv_unique_4_0=(Token)match(input,18,FOLLOW_18_in_ruleSingleReference1011); 

                            newLeafNode(lv_unique_4_0, grammarAccess.getSingleReferenceAccess().getUniqueUniqueKeyword_4_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSingleReferenceRule());
                    	        }
                           		setWithLastConsumed(current, "unique", true, "unique");
                    	    

                    }


                    }
                    break;

            }

            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:523:3: (otherlv_5= 'opposite' ( ( ruleQUALIFIED_NAME ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:523:5: otherlv_5= 'opposite' ( ( ruleQUALIFIED_NAME ) )
                    {
                    otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleSingleReference1038); 

                        	newLeafNode(otherlv_5, grammarAccess.getSingleReferenceAccess().getOppositeKeyword_5_0());
                        
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:527:1: ( ( ruleQUALIFIED_NAME ) )
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:528:1: ( ruleQUALIFIED_NAME )
                    {
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:528:1: ( ruleQUALIFIED_NAME )
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:529:3: ruleQUALIFIED_NAME
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSingleReferenceRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getSingleReferenceAccess().getOppositeMultiReferenceCrossReference_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQUALIFIED_NAME_in_ruleSingleReference1061);
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
    // $ANTLR end "ruleSingleReference"


    // $ANTLR start "entryRuleMultiReference"
    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:550:1: entryRuleMultiReference returns [EObject current=null] : iv_ruleMultiReference= ruleMultiReference EOF ;
    public final EObject entryRuleMultiReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiReference = null;


        try {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:551:2: (iv_ruleMultiReference= ruleMultiReference EOF )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:552:2: iv_ruleMultiReference= ruleMultiReference EOF
            {
             newCompositeNode(grammarAccess.getMultiReferenceRule()); 
            pushFollow(FOLLOW_ruleMultiReference_in_entryRuleMultiReference1099);
            iv_ruleMultiReference=ruleMultiReference();

            state._fsp--;

             current =iv_ruleMultiReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiReference1109); 

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
    // $ANTLR end "entryRuleMultiReference"


    // $ANTLR start "ruleMultiReference"
    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:559:1: ruleMultiReference returns [EObject current=null] : ( () otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= RULE_ID ) ) otherlv_4= '[]' ( (lv_unique_5_0= 'unique' ) )? ) ;
    public final EObject ruleMultiReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_unique_5_0=null;

         enterRule(); 
            
        try {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:562:28: ( ( () otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= RULE_ID ) ) otherlv_4= '[]' ( (lv_unique_5_0= 'unique' ) )? ) )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:563:1: ( () otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= RULE_ID ) ) otherlv_4= '[]' ( (lv_unique_5_0= 'unique' ) )? )
            {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:563:1: ( () otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= RULE_ID ) ) otherlv_4= '[]' ( (lv_unique_5_0= 'unique' ) )? )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:563:2: () otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= RULE_ID ) ) otherlv_4= '[]' ( (lv_unique_5_0= 'unique' ) )?
            {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:563:2: ()
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:564:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMultiReferenceAccess().getMultiReferenceAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleMultiReference1155); 

                	newLeafNode(otherlv_1, grammarAccess.getMultiReferenceAccess().getVarKeyword_1());
                
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:573:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:574:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:574:1: (lv_name_2_0= RULE_ID )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:575:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMultiReference1172); 

            			newLeafNode(lv_name_2_0, grammarAccess.getMultiReferenceAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMultiReferenceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:591:2: ( (otherlv_3= RULE_ID ) )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:592:1: (otherlv_3= RULE_ID )
            {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:592:1: (otherlv_3= RULE_ID )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:593:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMultiReferenceRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMultiReference1197); 

            		newLeafNode(otherlv_3, grammarAccess.getMultiReferenceAccess().getReferenceEntityCrossReference_3_0()); 
            	

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleMultiReference1209); 

                	newLeafNode(otherlv_4, grammarAccess.getMultiReferenceAccess().getLeftSquareBracketRightSquareBracketKeyword_4());
                
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:608:1: ( (lv_unique_5_0= 'unique' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==18) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:609:1: (lv_unique_5_0= 'unique' )
                    {
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:609:1: (lv_unique_5_0= 'unique' )
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:610:3: lv_unique_5_0= 'unique'
                    {
                    lv_unique_5_0=(Token)match(input,18,FOLLOW_18_in_ruleMultiReference1227); 

                            newLeafNode(lv_unique_5_0, grammarAccess.getMultiReferenceAccess().getUniqueUniqueKeyword_5_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultiReferenceRule());
                    	        }
                           		setWithLastConsumed(current, "unique", true, "unique");
                    	    

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
    // $ANTLR end "ruleMultiReference"


    // $ANTLR start "entryRuleDataType"
    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:631:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:632:2: (iv_ruleDataType= ruleDataType EOF )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:633:2: iv_ruleDataType= ruleDataType EOF
            {
             newCompositeNode(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_ruleDataType_in_entryRuleDataType1277);
            iv_ruleDataType=ruleDataType();

            state._fsp--;

             current =iv_ruleDataType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataType1287); 

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
    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:640:1: ruleDataType returns [EObject current=null] : (this_SingleDataType_0= ruleSingleDataType | this_MultiDataType_1= ruleMultiDataType ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        EObject this_SingleDataType_0 = null;

        EObject this_MultiDataType_1 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:643:28: ( (this_SingleDataType_0= ruleSingleDataType | this_MultiDataType_1= ruleMultiDataType ) )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:644:1: (this_SingleDataType_0= ruleSingleDataType | this_MultiDataType_1= ruleMultiDataType )
            {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:644:1: (this_SingleDataType_0= ruleSingleDataType | this_MultiDataType_1= ruleMultiDataType )
            int alt13=2;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:645:5: this_SingleDataType_0= ruleSingleDataType
                    {
                     
                            newCompositeNode(grammarAccess.getDataTypeAccess().getSingleDataTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSingleDataType_in_ruleDataType1334);
                    this_SingleDataType_0=ruleSingleDataType();

                    state._fsp--;

                     
                            current = this_SingleDataType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:655:5: this_MultiDataType_1= ruleMultiDataType
                    {
                     
                            newCompositeNode(grammarAccess.getDataTypeAccess().getMultiDataTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleMultiDataType_in_ruleDataType1361);
                    this_MultiDataType_1=ruleMultiDataType();

                    state._fsp--;

                     
                            current = this_MultiDataType_1; 
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
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleSingleDataType"
    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:671:1: entryRuleSingleDataType returns [EObject current=null] : iv_ruleSingleDataType= ruleSingleDataType EOF ;
    public final EObject entryRuleSingleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleDataType = null;


        try {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:672:2: (iv_ruleSingleDataType= ruleSingleDataType EOF )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:673:2: iv_ruleSingleDataType= ruleSingleDataType EOF
            {
             newCompositeNode(grammarAccess.getSingleDataTypeRule()); 
            pushFollow(FOLLOW_ruleSingleDataType_in_entryRuleSingleDataType1396);
            iv_ruleSingleDataType=ruleSingleDataType();

            state._fsp--;

             current =iv_ruleSingleDataType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleDataType1406); 

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
    // $ANTLR end "entryRuleSingleDataType"


    // $ANTLR start "ruleSingleDataType"
    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:680:1: ruleSingleDataType returns [EObject current=null] : ( () otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) ( (lv_type_3_0= ruleDataTypes ) ) (otherlv_4= 'opposite' ( ( ruleQUALIFIED_NAME ) ) )? ) ;
    public final EObject ruleSingleDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_4=null;
        Enumerator lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:683:28: ( ( () otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) ( (lv_type_3_0= ruleDataTypes ) ) (otherlv_4= 'opposite' ( ( ruleQUALIFIED_NAME ) ) )? ) )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:684:1: ( () otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) ( (lv_type_3_0= ruleDataTypes ) ) (otherlv_4= 'opposite' ( ( ruleQUALIFIED_NAME ) ) )? )
            {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:684:1: ( () otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) ( (lv_type_3_0= ruleDataTypes ) ) (otherlv_4= 'opposite' ( ( ruleQUALIFIED_NAME ) ) )? )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:684:2: () otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) ( (lv_type_3_0= ruleDataTypes ) ) (otherlv_4= 'opposite' ( ( ruleQUALIFIED_NAME ) ) )?
            {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:684:2: ()
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:685:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSingleDataTypeAccess().getSingleDataTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleSingleDataType1452); 

                	newLeafNode(otherlv_1, grammarAccess.getSingleDataTypeAccess().getVarKeyword_1());
                
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:694:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:695:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:695:1: (lv_name_2_0= RULE_ID )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:696:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSingleDataType1469); 

            			newLeafNode(lv_name_2_0, grammarAccess.getSingleDataTypeAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSingleDataTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:712:2: ( (lv_type_3_0= ruleDataTypes ) )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:713:1: (lv_type_3_0= ruleDataTypes )
            {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:713:1: (lv_type_3_0= ruleDataTypes )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:714:3: lv_type_3_0= ruleDataTypes
            {
             
            	        newCompositeNode(grammarAccess.getSingleDataTypeAccess().getTypeDataTypesEnumRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleDataTypes_in_ruleSingleDataType1495);
            lv_type_3_0=ruleDataTypes();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSingleDataTypeRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"DataTypes");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:730:2: (otherlv_4= 'opposite' ( ( ruleQUALIFIED_NAME ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==19) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:730:4: otherlv_4= 'opposite' ( ( ruleQUALIFIED_NAME ) )
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleSingleDataType1508); 

                        	newLeafNode(otherlv_4, grammarAccess.getSingleDataTypeAccess().getOppositeKeyword_4_0());
                        
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:734:1: ( ( ruleQUALIFIED_NAME ) )
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:735:1: ( ruleQUALIFIED_NAME )
                    {
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:735:1: ( ruleQUALIFIED_NAME )
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:736:3: ruleQUALIFIED_NAME
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSingleDataTypeRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getSingleDataTypeAccess().getOppositeMultiDataTypeCrossReference_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQUALIFIED_NAME_in_ruleSingleDataType1531);
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
    // $ANTLR end "ruleSingleDataType"


    // $ANTLR start "entryRuleMultiDataType"
    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:757:1: entryRuleMultiDataType returns [EObject current=null] : iv_ruleMultiDataType= ruleMultiDataType EOF ;
    public final EObject entryRuleMultiDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiDataType = null;


        try {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:758:2: (iv_ruleMultiDataType= ruleMultiDataType EOF )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:759:2: iv_ruleMultiDataType= ruleMultiDataType EOF
            {
             newCompositeNode(grammarAccess.getMultiDataTypeRule()); 
            pushFollow(FOLLOW_ruleMultiDataType_in_entryRuleMultiDataType1569);
            iv_ruleMultiDataType=ruleMultiDataType();

            state._fsp--;

             current =iv_ruleMultiDataType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiDataType1579); 

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
    // $ANTLR end "entryRuleMultiDataType"


    // $ANTLR start "ruleMultiDataType"
    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:766:1: ruleMultiDataType returns [EObject current=null] : ( () otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) ( (lv_type_3_0= ruleDataTypes ) ) otherlv_4= '[]' ( (lv_unique_5_0= 'unique' ) )? ) ;
    public final EObject ruleMultiDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_4=null;
        Token lv_unique_5_0=null;
        Enumerator lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:769:28: ( ( () otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) ( (lv_type_3_0= ruleDataTypes ) ) otherlv_4= '[]' ( (lv_unique_5_0= 'unique' ) )? ) )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:770:1: ( () otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) ( (lv_type_3_0= ruleDataTypes ) ) otherlv_4= '[]' ( (lv_unique_5_0= 'unique' ) )? )
            {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:770:1: ( () otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) ( (lv_type_3_0= ruleDataTypes ) ) otherlv_4= '[]' ( (lv_unique_5_0= 'unique' ) )? )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:770:2: () otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) ( (lv_type_3_0= ruleDataTypes ) ) otherlv_4= '[]' ( (lv_unique_5_0= 'unique' ) )?
            {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:770:2: ()
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:771:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMultiDataTypeAccess().getMultiDataTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleMultiDataType1625); 

                	newLeafNode(otherlv_1, grammarAccess.getMultiDataTypeAccess().getVarKeyword_1());
                
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:780:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:781:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:781:1: (lv_name_2_0= RULE_ID )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:782:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMultiDataType1642); 

            			newLeafNode(lv_name_2_0, grammarAccess.getMultiDataTypeAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMultiDataTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:798:2: ( (lv_type_3_0= ruleDataTypes ) )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:799:1: (lv_type_3_0= ruleDataTypes )
            {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:799:1: (lv_type_3_0= ruleDataTypes )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:800:3: lv_type_3_0= ruleDataTypes
            {
             
            	        newCompositeNode(grammarAccess.getMultiDataTypeAccess().getTypeDataTypesEnumRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleDataTypes_in_ruleMultiDataType1668);
            lv_type_3_0=ruleDataTypes();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMultiDataTypeRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"DataTypes");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleMultiDataType1680); 

                	newLeafNode(otherlv_4, grammarAccess.getMultiDataTypeAccess().getLeftSquareBracketRightSquareBracketKeyword_4());
                
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:820:1: ( (lv_unique_5_0= 'unique' ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==18) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:821:1: (lv_unique_5_0= 'unique' )
                    {
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:821:1: (lv_unique_5_0= 'unique' )
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:822:3: lv_unique_5_0= 'unique'
                    {
                    lv_unique_5_0=(Token)match(input,18,FOLLOW_18_in_ruleMultiDataType1698); 

                            newLeafNode(lv_unique_5_0, grammarAccess.getMultiDataTypeAccess().getUniqueUniqueKeyword_5_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultiDataTypeRule());
                    	        }
                           		setWithLastConsumed(current, "unique", true, "unique");
                    	    

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
    // $ANTLR end "ruleMultiDataType"


    // $ANTLR start "entryRuleQUALIFIED_NAME"
    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:843:1: entryRuleQUALIFIED_NAME returns [String current=null] : iv_ruleQUALIFIED_NAME= ruleQUALIFIED_NAME EOF ;
    public final String entryRuleQUALIFIED_NAME() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQUALIFIED_NAME = null;


        try {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:844:2: (iv_ruleQUALIFIED_NAME= ruleQUALIFIED_NAME EOF )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:845:2: iv_ruleQUALIFIED_NAME= ruleQUALIFIED_NAME EOF
            {
             newCompositeNode(grammarAccess.getQUALIFIED_NAMERule()); 
            pushFollow(FOLLOW_ruleQUALIFIED_NAME_in_entryRuleQUALIFIED_NAME1749);
            iv_ruleQUALIFIED_NAME=ruleQUALIFIED_NAME();

            state._fsp--;

             current =iv_ruleQUALIFIED_NAME.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQUALIFIED_NAME1760); 

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
    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:852:1: ruleQUALIFIED_NAME returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQUALIFIED_NAME() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:855:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:856:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:856:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:856:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQUALIFIED_NAME1800); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQUALIFIED_NAMEAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:863:1: (kw= '.' this_ID_2= RULE_ID )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==21) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:864:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,21,FOLLOW_21_in_ruleQUALIFIED_NAME1819); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQUALIFIED_NAMEAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQUALIFIED_NAME1834); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQUALIFIED_NAMEAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop16;
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
    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:884:1: ruleInternalDSLType returns [Enumerator current=null] : (enumLiteral_0= 'Nested Functions' ) ;
    public final Enumerator ruleInternalDSLType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:886:28: ( (enumLiteral_0= 'Nested Functions' ) )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:887:1: (enumLiteral_0= 'Nested Functions' )
            {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:887:1: (enumLiteral_0= 'Nested Functions' )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:887:3: enumLiteral_0= 'Nested Functions'
            {
            enumLiteral_0=(Token)match(input,22,FOLLOW_22_in_ruleInternalDSLType1894); 

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
    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:897:1: ruleDataTypes returns [Enumerator current=null] : ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'boolean' ) | (enumLiteral_3= 'long' ) | (enumLiteral_4= 'double' ) ) ;
    public final Enumerator ruleDataTypes() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:899:28: ( ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'boolean' ) | (enumLiteral_3= 'long' ) | (enumLiteral_4= 'double' ) ) )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:900:1: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'boolean' ) | (enumLiteral_3= 'long' ) | (enumLiteral_4= 'double' ) )
            {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:900:1: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'boolean' ) | (enumLiteral_3= 'long' ) | (enumLiteral_4= 'double' ) )
            int alt17=5;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt17=1;
                }
                break;
            case 24:
                {
                alt17=2;
                }
                break;
            case 25:
                {
                alt17=3;
                }
                break;
            case 26:
                {
                alt17=4;
                }
                break;
            case 27:
                {
                alt17=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:900:2: (enumLiteral_0= 'String' )
                    {
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:900:2: (enumLiteral_0= 'String' )
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:900:4: enumLiteral_0= 'String'
                    {
                    enumLiteral_0=(Token)match(input,23,FOLLOW_23_in_ruleDataTypes1938); 

                            current = grammarAccess.getDataTypesAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getDataTypesAccess().getStringEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:906:6: (enumLiteral_1= 'integer' )
                    {
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:906:6: (enumLiteral_1= 'integer' )
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:906:8: enumLiteral_1= 'integer'
                    {
                    enumLiteral_1=(Token)match(input,24,FOLLOW_24_in_ruleDataTypes1955); 

                            current = grammarAccess.getDataTypesAccess().getIntegerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getDataTypesAccess().getIntegerEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:912:6: (enumLiteral_2= 'boolean' )
                    {
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:912:6: (enumLiteral_2= 'boolean' )
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:912:8: enumLiteral_2= 'boolean'
                    {
                    enumLiteral_2=(Token)match(input,25,FOLLOW_25_in_ruleDataTypes1972); 

                            current = grammarAccess.getDataTypesAccess().getBooleanEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getDataTypesAccess().getBooleanEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:918:6: (enumLiteral_3= 'long' )
                    {
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:918:6: (enumLiteral_3= 'long' )
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:918:8: enumLiteral_3= 'long'
                    {
                    enumLiteral_3=(Token)match(input,26,FOLLOW_26_in_ruleDataTypes1989); 

                            current = grammarAccess.getDataTypesAccess().getLongEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getDataTypesAccess().getLongEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:924:6: (enumLiteral_4= 'double' )
                    {
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:924:6: (enumLiteral_4= 'double' )
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:924:8: enumLiteral_4= 'double'
                    {
                    enumLiteral_4=(Token)match(input,27,FOLLOW_27_in_ruleDataTypes2006); 

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


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\12\uffff";
    static final String DFA13_eofS =
        "\3\uffff\5\11\2\uffff";
    static final String DFA13_minS =
        "\1\21\1\4\1\27\5\16\2\uffff";
    static final String DFA13_maxS =
        "\1\21\1\4\1\33\5\24\2\uffff";
    static final String DFA13_acceptS =
        "\10\uffff\1\2\1\1";
    static final String DFA13_specialS =
        "\12\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3\1\4\1\5\1\6\1\7",
            "\1\11\2\uffff\1\11\1\uffff\1\11\1\10",
            "\1\11\2\uffff\1\11\1\uffff\1\11\1\10",
            "\1\11\2\uffff\1\11\1\uffff\1\11\1\10",
            "\1\11\2\uffff\1\11\1\uffff\1\11\1\10",
            "\1\11\2\uffff\1\11\1\uffff\1\11\1\10",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "644:1: (this_SingleDataType_0= ruleSingleDataType | this_MultiDataType_1= ruleMultiDataType )";
        }
    }
 

    public static final BitSet FOLLOW_ruleModule_in_entryRuleModule75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModule85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleModule131 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQUALIFIED_NAME_in_ruleModule152 = new BitSet(new long[]{0x0000000000400000L});
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
    public static final BitSet FOLLOW_ruleSingleReference_in_ruleReference833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiReference_in_ruleReference860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleReference_in_entryRuleSingleReference895 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleReference905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleSingleReference951 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSingleReference968 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSingleReference993 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_18_in_ruleSingleReference1011 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleSingleReference1038 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQUALIFIED_NAME_in_ruleSingleReference1061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiReference_in_entryRuleMultiReference1099 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiReference1109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleMultiReference1155 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMultiReference1172 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMultiReference1197 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleMultiReference1209 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleMultiReference1227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_entryRuleDataType1277 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataType1287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleDataType_in_ruleDataType1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiDataType_in_ruleDataType1361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleDataType_in_entryRuleSingleDataType1396 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleDataType1406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleSingleDataType1452 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSingleDataType1469 = new BitSet(new long[]{0x000000000F800000L});
    public static final BitSet FOLLOW_ruleDataTypes_in_ruleSingleDataType1495 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleSingleDataType1508 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQUALIFIED_NAME_in_ruleSingleDataType1531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiDataType_in_entryRuleMultiDataType1569 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiDataType1579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleMultiDataType1625 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMultiDataType1642 = new BitSet(new long[]{0x000000000F800000L});
    public static final BitSet FOLLOW_ruleDataTypes_in_ruleMultiDataType1668 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleMultiDataType1680 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleMultiDataType1698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQUALIFIED_NAME_in_entryRuleQUALIFIED_NAME1749 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQUALIFIED_NAME1760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQUALIFIED_NAME1800 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleQUALIFIED_NAME1819 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQUALIFIED_NAME1834 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_22_in_ruleInternalDSLType1894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleDataTypes1938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleDataTypes1955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleDataTypes1972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleDataTypes1989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleDataTypes2006 = new BitSet(new long[]{0x0000000000000002L});

}