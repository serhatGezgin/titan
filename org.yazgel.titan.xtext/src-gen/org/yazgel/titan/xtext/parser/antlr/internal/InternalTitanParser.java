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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'module'", "'package'", "'{'", "'}'", "'entity'", "':'", "'entityBuilder'", "'takes'", "','", "'adds'", "'('", "')'", "'var'", "'[]'", "'opposite'", "'.'", "'Nested Functions'", "'String'", "'integer'", "'boolean'", "'long'", "'double'", "'Object'"
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
    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:180:1: rulePackage returns [EObject current=null] : ( () otherlv_1= 'package' ( (lv_name_2_0= ruleQUALIFIED_NAME ) ) otherlv_3= '{' ( ( (lv_entities_4_0= ruleEntity ) ) ( (lv_entities_5_0= ruleEntity ) )* )? ( ( (lv_entityBuilders_6_0= ruleEntityBuilder ) ) ( (lv_entityBuilders_7_0= ruleEntityBuilder ) )* )? otherlv_8= '}' ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_entities_4_0 = null;

        EObject lv_entities_5_0 = null;

        EObject lv_entityBuilders_6_0 = null;

        EObject lv_entityBuilders_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:183:28: ( ( () otherlv_1= 'package' ( (lv_name_2_0= ruleQUALIFIED_NAME ) ) otherlv_3= '{' ( ( (lv_entities_4_0= ruleEntity ) ) ( (lv_entities_5_0= ruleEntity ) )* )? ( ( (lv_entityBuilders_6_0= ruleEntityBuilder ) ) ( (lv_entityBuilders_7_0= ruleEntityBuilder ) )* )? otherlv_8= '}' ) )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:184:1: ( () otherlv_1= 'package' ( (lv_name_2_0= ruleQUALIFIED_NAME ) ) otherlv_3= '{' ( ( (lv_entities_4_0= ruleEntity ) ) ( (lv_entities_5_0= ruleEntity ) )* )? ( ( (lv_entityBuilders_6_0= ruleEntityBuilder ) ) ( (lv_entityBuilders_7_0= ruleEntityBuilder ) )* )? otherlv_8= '}' )
            {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:184:1: ( () otherlv_1= 'package' ( (lv_name_2_0= ruleQUALIFIED_NAME ) ) otherlv_3= '{' ( ( (lv_entities_4_0= ruleEntity ) ) ( (lv_entities_5_0= ruleEntity ) )* )? ( ( (lv_entityBuilders_6_0= ruleEntityBuilder ) ) ( (lv_entityBuilders_7_0= ruleEntityBuilder ) )* )? otherlv_8= '}' )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:184:2: () otherlv_1= 'package' ( (lv_name_2_0= ruleQUALIFIED_NAME ) ) otherlv_3= '{' ( ( (lv_entities_4_0= ruleEntity ) ) ( (lv_entities_5_0= ruleEntity ) )* )? ( ( (lv_entityBuilders_6_0= ruleEntityBuilder ) ) ( (lv_entityBuilders_7_0= ruleEntityBuilder ) )* )? otherlv_8= '}'
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

            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:252:5: ( ( (lv_entityBuilders_6_0= ruleEntityBuilder ) ) ( (lv_entityBuilders_7_0= ruleEntityBuilder ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:252:6: ( (lv_entityBuilders_6_0= ruleEntityBuilder ) ) ( (lv_entityBuilders_7_0= ruleEntityBuilder ) )*
                    {
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:252:6: ( (lv_entityBuilders_6_0= ruleEntityBuilder ) )
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:253:1: (lv_entityBuilders_6_0= ruleEntityBuilder )
                    {
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:253:1: (lv_entityBuilders_6_0= ruleEntityBuilder )
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:254:3: lv_entityBuilders_6_0= ruleEntityBuilder
                    {
                     
                    	        newCompositeNode(grammarAccess.getPackageAccess().getEntityBuildersEntityBuilderParserRuleCall_5_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEntityBuilder_in_rulePackage412);
                    lv_entityBuilders_6_0=ruleEntityBuilder();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPackageRule());
                    	        }
                           		add(
                           			current, 
                           			"entityBuilders",
                            		lv_entityBuilders_6_0, 
                            		"EntityBuilder");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:270:2: ( (lv_entityBuilders_7_0= ruleEntityBuilder ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==17) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:271:1: (lv_entityBuilders_7_0= ruleEntityBuilder )
                    	    {
                    	    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:271:1: (lv_entityBuilders_7_0= ruleEntityBuilder )
                    	    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:272:3: lv_entityBuilders_7_0= ruleEntityBuilder
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPackageAccess().getEntityBuildersEntityBuilderParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleEntityBuilder_in_rulePackage433);
                    	    lv_entityBuilders_7_0=ruleEntityBuilder();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getPackageRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"entityBuilders",
                    	            		lv_entityBuilders_7_0, 
                    	            		"EntityBuilder");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,14,FOLLOW_14_in_rulePackage448); 

                	newLeafNode(otherlv_8, grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_6());
                

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
    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:300:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:301:2: (iv_ruleEntity= ruleEntity EOF )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:302:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity484);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity494); 

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
    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:309:1: ruleEntity returns [EObject current=null] : ( () otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( ( (lv_features_6_0= ruleFeature ) ) ( (lv_features_7_0= ruleFeature ) )* )? otherlv_8= '}' ) ;
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
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:312:28: ( ( () otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( ( (lv_features_6_0= ruleFeature ) ) ( (lv_features_7_0= ruleFeature ) )* )? otherlv_8= '}' ) )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:313:1: ( () otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( ( (lv_features_6_0= ruleFeature ) ) ( (lv_features_7_0= ruleFeature ) )* )? otherlv_8= '}' )
            {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:313:1: ( () otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( ( (lv_features_6_0= ruleFeature ) ) ( (lv_features_7_0= ruleFeature ) )* )? otherlv_8= '}' )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:313:2: () otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( ( (lv_features_6_0= ruleFeature ) ) ( (lv_features_7_0= ruleFeature ) )* )? otherlv_8= '}'
            {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:313:2: ()
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:314:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEntityAccess().getEntityAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleEntity540); 

                	newLeafNode(otherlv_1, grammarAccess.getEntityAccess().getEntityKeyword_1());
                
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:323:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:324:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:324:1: (lv_name_2_0= RULE_ID )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:325:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity557); 

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

            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:341:2: (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:341:4: otherlv_3= ':' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleEntity575); 

                        	newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getColonKeyword_3_0());
                        
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:345:1: ( (otherlv_4= RULE_ID ) )
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:346:1: (otherlv_4= RULE_ID )
                    {
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:346:1: (otherlv_4= RULE_ID )
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:347:3: otherlv_4= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity595); 

                    		newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getSuperEntityEntityCrossReference_3_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleEntity609); 

                	newLeafNode(otherlv_5, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_4());
                
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:362:1: ( ( (lv_features_6_0= ruleFeature ) ) ( (lv_features_7_0= ruleFeature ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:362:2: ( (lv_features_6_0= ruleFeature ) ) ( (lv_features_7_0= ruleFeature ) )*
                    {
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:362:2: ( (lv_features_6_0= ruleFeature ) )
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:363:1: (lv_features_6_0= ruleFeature )
                    {
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:363:1: (lv_features_6_0= ruleFeature )
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:364:3: lv_features_6_0= ruleFeature
                    {
                     
                    	        newCompositeNode(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_5_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFeature_in_ruleEntity631);
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

                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:380:2: ( (lv_features_7_0= ruleFeature ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==23) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:381:1: (lv_features_7_0= ruleFeature )
                    	    {
                    	    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:381:1: (lv_features_7_0= ruleFeature )
                    	    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:382:3: lv_features_7_0= ruleFeature
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleFeature_in_ruleEntity652);
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
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleEntity667); 

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


    // $ANTLR start "entryRuleEntityBuilder"
    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:410:1: entryRuleEntityBuilder returns [EObject current=null] : iv_ruleEntityBuilder= ruleEntityBuilder EOF ;
    public final EObject entryRuleEntityBuilder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityBuilder = null;


        try {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:411:2: (iv_ruleEntityBuilder= ruleEntityBuilder EOF )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:412:2: iv_ruleEntityBuilder= ruleEntityBuilder EOF
            {
             newCompositeNode(grammarAccess.getEntityBuilderRule()); 
            pushFollow(FOLLOW_ruleEntityBuilder_in_entryRuleEntityBuilder703);
            iv_ruleEntityBuilder=ruleEntityBuilder();

            state._fsp--;

             current =iv_ruleEntityBuilder; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntityBuilder713); 

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
    // $ANTLR end "entryRuleEntityBuilder"


    // $ANTLR start "ruleEntityBuilder"
    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:419:1: ruleEntityBuilder returns [EObject current=null] : ( () otherlv_1= 'entityBuilder' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_takes_4_0= ruletakes ) )? otherlv_5= '}' ) ;
    public final EObject ruleEntityBuilder() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_takes_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:422:28: ( ( () otherlv_1= 'entityBuilder' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_takes_4_0= ruletakes ) )? otherlv_5= '}' ) )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:423:1: ( () otherlv_1= 'entityBuilder' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_takes_4_0= ruletakes ) )? otherlv_5= '}' )
            {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:423:1: ( () otherlv_1= 'entityBuilder' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_takes_4_0= ruletakes ) )? otherlv_5= '}' )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:423:2: () otherlv_1= 'entityBuilder' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_takes_4_0= ruletakes ) )? otherlv_5= '}'
            {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:423:2: ()
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:424:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEntityBuilderAccess().getEntityBuilderAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleEntityBuilder759); 

                	newLeafNode(otherlv_1, grammarAccess.getEntityBuilderAccess().getEntityBuilderKeyword_1());
                
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:433:1: ( (otherlv_2= RULE_ID ) )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:434:1: (otherlv_2= RULE_ID )
            {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:434:1: (otherlv_2= RULE_ID )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:435:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEntityBuilderRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntityBuilder779); 

            		newLeafNode(otherlv_2, grammarAccess.getEntityBuilderAccess().getNameEntityCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleEntityBuilder791); 

                	newLeafNode(otherlv_3, grammarAccess.getEntityBuilderAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:450:1: ( (lv_takes_4_0= ruletakes ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:451:1: (lv_takes_4_0= ruletakes )
                    {
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:451:1: (lv_takes_4_0= ruletakes )
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:452:3: lv_takes_4_0= ruletakes
                    {
                     
                    	        newCompositeNode(grammarAccess.getEntityBuilderAccess().getTakesTakesParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruletakes_in_ruleEntityBuilder812);
                    lv_takes_4_0=ruletakes();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEntityBuilderRule());
                    	        }
                           		set(
                           			current, 
                           			"takes",
                            		lv_takes_4_0, 
                            		"takes");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleEntityBuilder825); 

                	newLeafNode(otherlv_5, grammarAccess.getEntityBuilderAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleEntityBuilder"


    // $ANTLR start "entryRuletakes"
    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:482:1: entryRuletakes returns [EObject current=null] : iv_ruletakes= ruletakes EOF ;
    public final EObject entryRuletakes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletakes = null;


        try {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:483:2: (iv_ruletakes= ruletakes EOF )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:484:2: iv_ruletakes= ruletakes EOF
            {
             newCompositeNode(grammarAccess.getTakesRule()); 
            pushFollow(FOLLOW_ruletakes_in_entryRuletakes863);
            iv_ruletakes=ruletakes();

            state._fsp--;

             current =iv_ruletakes; 
            match(input,EOF,FOLLOW_EOF_in_entryRuletakes873); 

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
    // $ANTLR end "entryRuletakes"


    // $ANTLR start "ruletakes"
    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:491:1: ruletakes returns [EObject current=null] : (otherlv_0= 'takes' ( (lv_takes_1_0= ruleParameterFeature ) ) (otherlv_2= ',' ( (lv_takes_3_0= ruleParameterFeature ) ) )* ( (lv_adds_4_0= ruleadds ) )? ) ;
    public final EObject ruletakes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_takes_1_0 = null;

        EObject lv_takes_3_0 = null;

        EObject lv_adds_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:494:28: ( (otherlv_0= 'takes' ( (lv_takes_1_0= ruleParameterFeature ) ) (otherlv_2= ',' ( (lv_takes_3_0= ruleParameterFeature ) ) )* ( (lv_adds_4_0= ruleadds ) )? ) )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:495:1: (otherlv_0= 'takes' ( (lv_takes_1_0= ruleParameterFeature ) ) (otherlv_2= ',' ( (lv_takes_3_0= ruleParameterFeature ) ) )* ( (lv_adds_4_0= ruleadds ) )? )
            {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:495:1: (otherlv_0= 'takes' ( (lv_takes_1_0= ruleParameterFeature ) ) (otherlv_2= ',' ( (lv_takes_3_0= ruleParameterFeature ) ) )* ( (lv_adds_4_0= ruleadds ) )? )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:495:3: otherlv_0= 'takes' ( (lv_takes_1_0= ruleParameterFeature ) ) (otherlv_2= ',' ( (lv_takes_3_0= ruleParameterFeature ) ) )* ( (lv_adds_4_0= ruleadds ) )?
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruletakes910); 

                	newLeafNode(otherlv_0, grammarAccess.getTakesAccess().getTakesKeyword_0());
                
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:499:1: ( (lv_takes_1_0= ruleParameterFeature ) )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:500:1: (lv_takes_1_0= ruleParameterFeature )
            {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:500:1: (lv_takes_1_0= ruleParameterFeature )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:501:3: lv_takes_1_0= ruleParameterFeature
            {
             
            	        newCompositeNode(grammarAccess.getTakesAccess().getTakesParameterFeatureParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleParameterFeature_in_ruletakes931);
            lv_takes_1_0=ruleParameterFeature();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTakesRule());
            	        }
                   		add(
                   			current, 
                   			"takes",
                    		lv_takes_1_0, 
                    		"ParameterFeature");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:517:2: (otherlv_2= ',' ( (lv_takes_3_0= ruleParameterFeature ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==19) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:517:4: otherlv_2= ',' ( (lv_takes_3_0= ruleParameterFeature ) )
            	    {
            	    otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruletakes944); 

            	        	newLeafNode(otherlv_2, grammarAccess.getTakesAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:521:1: ( (lv_takes_3_0= ruleParameterFeature ) )
            	    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:522:1: (lv_takes_3_0= ruleParameterFeature )
            	    {
            	    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:522:1: (lv_takes_3_0= ruleParameterFeature )
            	    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:523:3: lv_takes_3_0= ruleParameterFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTakesAccess().getTakesParameterFeatureParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleParameterFeature_in_ruletakes965);
            	    lv_takes_3_0=ruleParameterFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTakesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"takes",
            	            		lv_takes_3_0, 
            	            		"ParameterFeature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:539:4: ( (lv_adds_4_0= ruleadds ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:540:1: (lv_adds_4_0= ruleadds )
                    {
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:540:1: (lv_adds_4_0= ruleadds )
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:541:3: lv_adds_4_0= ruleadds
                    {
                     
                    	        newCompositeNode(grammarAccess.getTakesAccess().getAddsAddsParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleadds_in_ruletakes988);
                    lv_adds_4_0=ruleadds();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTakesRule());
                    	        }
                           		add(
                           			current, 
                           			"adds",
                            		lv_adds_4_0, 
                            		"adds");
                    	        afterParserOrEnumRuleCall();
                    	    

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
    // $ANTLR end "ruletakes"


    // $ANTLR start "entryRuleadds"
    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:565:1: entryRuleadds returns [EObject current=null] : iv_ruleadds= ruleadds EOF ;
    public final EObject entryRuleadds() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleadds = null;


        try {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:566:2: (iv_ruleadds= ruleadds EOF )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:567:2: iv_ruleadds= ruleadds EOF
            {
             newCompositeNode(grammarAccess.getAddsRule()); 
            pushFollow(FOLLOW_ruleadds_in_entryRuleadds1025);
            iv_ruleadds=ruleadds();

            state._fsp--;

             current =iv_ruleadds; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleadds1035); 

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
    // $ANTLR end "entryRuleadds"


    // $ANTLR start "ruleadds"
    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:574:1: ruleadds returns [EObject current=null] : (otherlv_0= 'adds' otherlv_1= '(' ( ( ( ruleQUALIFIED_NAME ) ) (otherlv_3= ',' ( ( ruleQUALIFIED_NAME ) ) )* ) otherlv_5= ')' ) ;
    public final EObject ruleadds() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:577:28: ( (otherlv_0= 'adds' otherlv_1= '(' ( ( ( ruleQUALIFIED_NAME ) ) (otherlv_3= ',' ( ( ruleQUALIFIED_NAME ) ) )* ) otherlv_5= ')' ) )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:578:1: (otherlv_0= 'adds' otherlv_1= '(' ( ( ( ruleQUALIFIED_NAME ) ) (otherlv_3= ',' ( ( ruleQUALIFIED_NAME ) ) )* ) otherlv_5= ')' )
            {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:578:1: (otherlv_0= 'adds' otherlv_1= '(' ( ( ( ruleQUALIFIED_NAME ) ) (otherlv_3= ',' ( ( ruleQUALIFIED_NAME ) ) )* ) otherlv_5= ')' )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:578:3: otherlv_0= 'adds' otherlv_1= '(' ( ( ( ruleQUALIFIED_NAME ) ) (otherlv_3= ',' ( ( ruleQUALIFIED_NAME ) ) )* ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleadds1072); 

                	newLeafNode(otherlv_0, grammarAccess.getAddsAccess().getAddsKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleadds1084); 

                	newLeafNode(otherlv_1, grammarAccess.getAddsAccess().getLeftParenthesisKeyword_1());
                
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:586:1: ( ( ( ruleQUALIFIED_NAME ) ) (otherlv_3= ',' ( ( ruleQUALIFIED_NAME ) ) )* )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:586:2: ( ( ruleQUALIFIED_NAME ) ) (otherlv_3= ',' ( ( ruleQUALIFIED_NAME ) ) )*
            {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:586:2: ( ( ruleQUALIFIED_NAME ) )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:587:1: ( ruleQUALIFIED_NAME )
            {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:587:1: ( ruleQUALIFIED_NAME )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:588:3: ruleQUALIFIED_NAME
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAddsRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getAddsAccess().getAddsFeatureCrossReference_2_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQUALIFIED_NAME_in_ruleadds1108);
            ruleQUALIFIED_NAME();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:601:2: (otherlv_3= ',' ( ( ruleQUALIFIED_NAME ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==19) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:601:4: otherlv_3= ',' ( ( ruleQUALIFIED_NAME ) )
            	    {
            	    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleadds1121); 

            	        	newLeafNode(otherlv_3, grammarAccess.getAddsAccess().getCommaKeyword_2_1_0());
            	        
            	    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:605:1: ( ( ruleQUALIFIED_NAME ) )
            	    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:606:1: ( ruleQUALIFIED_NAME )
            	    {
            	    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:606:1: ( ruleQUALIFIED_NAME )
            	    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:607:3: ruleQUALIFIED_NAME
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getAddsRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getAddsAccess().getAddsFeatureCrossReference_2_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQUALIFIED_NAME_in_ruleadds1144);
            	    ruleQUALIFIED_NAME();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }

            otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleadds1159); 

                	newLeafNode(otherlv_5, grammarAccess.getAddsAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleadds"


    // $ANTLR start "entryRuleFeature"
    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:632:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:633:2: (iv_ruleFeature= ruleFeature EOF )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:634:2: iv_ruleFeature= ruleFeature EOF
            {
             newCompositeNode(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature1195);
            iv_ruleFeature=ruleFeature();

            state._fsp--;

             current =iv_ruleFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature1205); 

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
    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:641:1: ruleFeature returns [EObject current=null] : (this_Reference_0= ruleReference | this_DataType_1= ruleDataType ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        EObject this_Reference_0 = null;

        EObject this_DataType_1 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:644:28: ( (this_Reference_0= ruleReference | this_DataType_1= ruleDataType ) )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:645:1: (this_Reference_0= ruleReference | this_DataType_1= ruleDataType )
            {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:645:1: (this_Reference_0= ruleReference | this_DataType_1= ruleDataType )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==RULE_ID) ) {
                    int LA14_2 = input.LA(3);

                    if ( (LA14_2==RULE_ID) ) {
                        alt14=1;
                    }
                    else if ( ((LA14_2>=28 && LA14_2<=33)) ) {
                        alt14=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:646:5: this_Reference_0= ruleReference
                    {
                     
                            newCompositeNode(grammarAccess.getFeatureAccess().getReferenceParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleReference_in_ruleFeature1252);
                    this_Reference_0=ruleReference();

                    state._fsp--;

                     
                            current = this_Reference_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:656:5: this_DataType_1= ruleDataType
                    {
                     
                            newCompositeNode(grammarAccess.getFeatureAccess().getDataTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDataType_in_ruleFeature1279);
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
    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:672:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:673:2: (iv_ruleReference= ruleReference EOF )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:674:2: iv_ruleReference= ruleReference EOF
            {
             newCompositeNode(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_ruleReference_in_entryRuleReference1314);
            iv_ruleReference=ruleReference();

            state._fsp--;

             current =iv_ruleReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReference1324); 

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
    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:681:1: ruleReference returns [EObject current=null] : ( () otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= RULE_ID ) ) ( (lv_many_4_0= '[]' ) )? (otherlv_5= 'opposite' ( ( ruleQUALIFIED_NAME ) ) )? ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_many_4_0=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:684:28: ( ( () otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= RULE_ID ) ) ( (lv_many_4_0= '[]' ) )? (otherlv_5= 'opposite' ( ( ruleQUALIFIED_NAME ) ) )? ) )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:685:1: ( () otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= RULE_ID ) ) ( (lv_many_4_0= '[]' ) )? (otherlv_5= 'opposite' ( ( ruleQUALIFIED_NAME ) ) )? )
            {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:685:1: ( () otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= RULE_ID ) ) ( (lv_many_4_0= '[]' ) )? (otherlv_5= 'opposite' ( ( ruleQUALIFIED_NAME ) ) )? )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:685:2: () otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= RULE_ID ) ) ( (lv_many_4_0= '[]' ) )? (otherlv_5= 'opposite' ( ( ruleQUALIFIED_NAME ) ) )?
            {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:685:2: ()
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:686:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getReferenceAccess().getReferenceAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleReference1370); 

                	newLeafNode(otherlv_1, grammarAccess.getReferenceAccess().getVarKeyword_1());
                
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:695:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:696:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:696:1: (lv_name_2_0= RULE_ID )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:697:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReference1387); 

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

            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:713:2: ( (otherlv_3= RULE_ID ) )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:714:1: (otherlv_3= RULE_ID )
            {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:714:1: (otherlv_3= RULE_ID )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:715:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getReferenceRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReference1412); 

            		newLeafNode(otherlv_3, grammarAccess.getReferenceAccess().getReferenceEntityCrossReference_3_0()); 
            	

            }


            }

            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:726:2: ( (lv_many_4_0= '[]' ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:727:1: (lv_many_4_0= '[]' )
                    {
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:727:1: (lv_many_4_0= '[]' )
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:728:3: lv_many_4_0= '[]'
                    {
                    lv_many_4_0=(Token)match(input,24,FOLLOW_24_in_ruleReference1430); 

                            newLeafNode(lv_many_4_0, grammarAccess.getReferenceAccess().getManyLeftSquareBracketRightSquareBracketKeyword_4_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getReferenceRule());
                    	        }
                           		setWithLastConsumed(current, "many", true, "[]");
                    	    

                    }


                    }
                    break;

            }

            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:741:3: (otherlv_5= 'opposite' ( ( ruleQUALIFIED_NAME ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==25) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:741:5: otherlv_5= 'opposite' ( ( ruleQUALIFIED_NAME ) )
                    {
                    otherlv_5=(Token)match(input,25,FOLLOW_25_in_ruleReference1457); 

                        	newLeafNode(otherlv_5, grammarAccess.getReferenceAccess().getOppositeKeyword_5_0());
                        
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:745:1: ( ( ruleQUALIFIED_NAME ) )
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:746:1: ( ruleQUALIFIED_NAME )
                    {
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:746:1: ( ruleQUALIFIED_NAME )
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:747:3: ruleQUALIFIED_NAME
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getReferenceRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getReferenceAccess().getOppositeReferenceCrossReference_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQUALIFIED_NAME_in_ruleReference1480);
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
    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:768:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:769:2: (iv_ruleDataType= ruleDataType EOF )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:770:2: iv_ruleDataType= ruleDataType EOF
            {
             newCompositeNode(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_ruleDataType_in_entryRuleDataType1518);
            iv_ruleDataType=ruleDataType();

            state._fsp--;

             current =iv_ruleDataType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataType1528); 

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
    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:777:1: ruleDataType returns [EObject current=null] : ( () otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) ( (lv_type_3_0= ruleDataTypes ) ) ( (lv_many_4_0= '[]' ) )? ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token lv_many_4_0=null;
        Enumerator lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:780:28: ( ( () otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) ( (lv_type_3_0= ruleDataTypes ) ) ( (lv_many_4_0= '[]' ) )? ) )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:781:1: ( () otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) ( (lv_type_3_0= ruleDataTypes ) ) ( (lv_many_4_0= '[]' ) )? )
            {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:781:1: ( () otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) ( (lv_type_3_0= ruleDataTypes ) ) ( (lv_many_4_0= '[]' ) )? )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:781:2: () otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) ( (lv_type_3_0= ruleDataTypes ) ) ( (lv_many_4_0= '[]' ) )?
            {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:781:2: ()
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:782:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDataTypeAccess().getDataTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleDataType1574); 

                	newLeafNode(otherlv_1, grammarAccess.getDataTypeAccess().getVarKeyword_1());
                
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:791:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:792:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:792:1: (lv_name_2_0= RULE_ID )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:793:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataType1591); 

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

            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:809:2: ( (lv_type_3_0= ruleDataTypes ) )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:810:1: (lv_type_3_0= ruleDataTypes )
            {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:810:1: (lv_type_3_0= ruleDataTypes )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:811:3: lv_type_3_0= ruleDataTypes
            {
             
            	        newCompositeNode(grammarAccess.getDataTypeAccess().getTypeDataTypesEnumRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleDataTypes_in_ruleDataType1617);
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

            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:827:2: ( (lv_many_4_0= '[]' ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==24) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:828:1: (lv_many_4_0= '[]' )
                    {
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:828:1: (lv_many_4_0= '[]' )
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:829:3: lv_many_4_0= '[]'
                    {
                    lv_many_4_0=(Token)match(input,24,FOLLOW_24_in_ruleDataType1635); 

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


    // $ANTLR start "entryRuleParameterFeature"
    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:850:1: entryRuleParameterFeature returns [EObject current=null] : iv_ruleParameterFeature= ruleParameterFeature EOF ;
    public final EObject entryRuleParameterFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterFeature = null;


        try {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:851:2: (iv_ruleParameterFeature= ruleParameterFeature EOF )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:852:2: iv_ruleParameterFeature= ruleParameterFeature EOF
            {
             newCompositeNode(grammarAccess.getParameterFeatureRule()); 
            pushFollow(FOLLOW_ruleParameterFeature_in_entryRuleParameterFeature1685);
            iv_ruleParameterFeature=ruleParameterFeature();

            state._fsp--;

             current =iv_ruleParameterFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterFeature1695); 

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
    // $ANTLR end "entryRuleParameterFeature"


    // $ANTLR start "ruleParameterFeature"
    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:859:1: ruleParameterFeature returns [EObject current=null] : (this_ParameterReference_0= ruleParameterReference | this_ParameterDataType_1= ruleParameterDataType ) ;
    public final EObject ruleParameterFeature() throws RecognitionException {
        EObject current = null;

        EObject this_ParameterReference_0 = null;

        EObject this_ParameterDataType_1 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:862:28: ( (this_ParameterReference_0= ruleParameterReference | this_ParameterDataType_1= ruleParameterDataType ) )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:863:1: (this_ParameterReference_0= ruleParameterReference | this_ParameterDataType_1= ruleParameterDataType )
            {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:863:1: (this_ParameterReference_0= ruleParameterReference | this_ParameterDataType_1= ruleParameterDataType )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            else if ( ((LA18_0>=28 && LA18_0<=33)) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:864:5: this_ParameterReference_0= ruleParameterReference
                    {
                     
                            newCompositeNode(grammarAccess.getParameterFeatureAccess().getParameterReferenceParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleParameterReference_in_ruleParameterFeature1742);
                    this_ParameterReference_0=ruleParameterReference();

                    state._fsp--;

                     
                            current = this_ParameterReference_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:874:5: this_ParameterDataType_1= ruleParameterDataType
                    {
                     
                            newCompositeNode(grammarAccess.getParameterFeatureAccess().getParameterDataTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleParameterDataType_in_ruleParameterFeature1769);
                    this_ParameterDataType_1=ruleParameterDataType();

                    state._fsp--;

                     
                            current = this_ParameterDataType_1; 
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
    // $ANTLR end "ruleParameterFeature"


    // $ANTLR start "entryRuleParameterReference"
    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:890:1: entryRuleParameterReference returns [EObject current=null] : iv_ruleParameterReference= ruleParameterReference EOF ;
    public final EObject entryRuleParameterReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterReference = null;


        try {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:891:2: (iv_ruleParameterReference= ruleParameterReference EOF )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:892:2: iv_ruleParameterReference= ruleParameterReference EOF
            {
             newCompositeNode(grammarAccess.getParameterReferenceRule()); 
            pushFollow(FOLLOW_ruleParameterReference_in_entryRuleParameterReference1804);
            iv_ruleParameterReference=ruleParameterReference();

            state._fsp--;

             current =iv_ruleParameterReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterReference1814); 

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
    // $ANTLR end "entryRuleParameterReference"


    // $ANTLR start "ruleParameterReference"
    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:899:1: ruleParameterReference returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ( (lv_many_2_0= '[]' ) )? ( (lv_name_3_0= RULE_ID ) ) ) ;
    public final EObject ruleParameterReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_many_2_0=null;
        Token lv_name_3_0=null;

         enterRule(); 
            
        try {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:902:28: ( ( () ( (otherlv_1= RULE_ID ) ) ( (lv_many_2_0= '[]' ) )? ( (lv_name_3_0= RULE_ID ) ) ) )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:903:1: ( () ( (otherlv_1= RULE_ID ) ) ( (lv_many_2_0= '[]' ) )? ( (lv_name_3_0= RULE_ID ) ) )
            {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:903:1: ( () ( (otherlv_1= RULE_ID ) ) ( (lv_many_2_0= '[]' ) )? ( (lv_name_3_0= RULE_ID ) ) )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:903:2: () ( (otherlv_1= RULE_ID ) ) ( (lv_many_2_0= '[]' ) )? ( (lv_name_3_0= RULE_ID ) )
            {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:903:2: ()
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:904:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getParameterReferenceAccess().getParameterReferenceAction_0(),
                        current);
                

            }

            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:909:2: ( (otherlv_1= RULE_ID ) )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:910:1: (otherlv_1= RULE_ID )
            {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:910:1: (otherlv_1= RULE_ID )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:911:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getParameterReferenceRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameterReference1868); 

            		newLeafNode(otherlv_1, grammarAccess.getParameterReferenceAccess().getReferenceEntityCrossReference_1_0()); 
            	

            }


            }

            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:922:2: ( (lv_many_2_0= '[]' ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==24) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:923:1: (lv_many_2_0= '[]' )
                    {
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:923:1: (lv_many_2_0= '[]' )
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:924:3: lv_many_2_0= '[]'
                    {
                    lv_many_2_0=(Token)match(input,24,FOLLOW_24_in_ruleParameterReference1886); 

                            newLeafNode(lv_many_2_0, grammarAccess.getParameterReferenceAccess().getManyLeftSquareBracketRightSquareBracketKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getParameterReferenceRule());
                    	        }
                           		setWithLastConsumed(current, "many", true, "[]");
                    	    

                    }


                    }
                    break;

            }

            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:937:3: ( (lv_name_3_0= RULE_ID ) )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:938:1: (lv_name_3_0= RULE_ID )
            {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:938:1: (lv_name_3_0= RULE_ID )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:939:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameterReference1917); 

            			newLeafNode(lv_name_3_0, grammarAccess.getParameterReferenceAccess().getNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getParameterReferenceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleParameterReference"


    // $ANTLR start "entryRuleParameterDataType"
    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:963:1: entryRuleParameterDataType returns [EObject current=null] : iv_ruleParameterDataType= ruleParameterDataType EOF ;
    public final EObject entryRuleParameterDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDataType = null;


        try {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:964:2: (iv_ruleParameterDataType= ruleParameterDataType EOF )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:965:2: iv_ruleParameterDataType= ruleParameterDataType EOF
            {
             newCompositeNode(grammarAccess.getParameterDataTypeRule()); 
            pushFollow(FOLLOW_ruleParameterDataType_in_entryRuleParameterDataType1958);
            iv_ruleParameterDataType=ruleParameterDataType();

            state._fsp--;

             current =iv_ruleParameterDataType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterDataType1968); 

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
    // $ANTLR end "entryRuleParameterDataType"


    // $ANTLR start "ruleParameterDataType"
    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:972:1: ruleParameterDataType returns [EObject current=null] : ( () ( (lv_type_1_0= ruleDataTypes ) ) ( (lv_many_2_0= '[]' ) )? ( (lv_name_3_0= RULE_ID ) ) ) ;
    public final EObject ruleParameterDataType() throws RecognitionException {
        EObject current = null;

        Token lv_many_2_0=null;
        Token lv_name_3_0=null;
        Enumerator lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:975:28: ( ( () ( (lv_type_1_0= ruleDataTypes ) ) ( (lv_many_2_0= '[]' ) )? ( (lv_name_3_0= RULE_ID ) ) ) )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:976:1: ( () ( (lv_type_1_0= ruleDataTypes ) ) ( (lv_many_2_0= '[]' ) )? ( (lv_name_3_0= RULE_ID ) ) )
            {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:976:1: ( () ( (lv_type_1_0= ruleDataTypes ) ) ( (lv_many_2_0= '[]' ) )? ( (lv_name_3_0= RULE_ID ) ) )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:976:2: () ( (lv_type_1_0= ruleDataTypes ) ) ( (lv_many_2_0= '[]' ) )? ( (lv_name_3_0= RULE_ID ) )
            {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:976:2: ()
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:977:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getParameterDataTypeAccess().getParameterDataTypeAction_0(),
                        current);
                

            }

            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:982:2: ( (lv_type_1_0= ruleDataTypes ) )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:983:1: (lv_type_1_0= ruleDataTypes )
            {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:983:1: (lv_type_1_0= ruleDataTypes )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:984:3: lv_type_1_0= ruleDataTypes
            {
             
            	        newCompositeNode(grammarAccess.getParameterDataTypeAccess().getTypeDataTypesEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleDataTypes_in_ruleParameterDataType2023);
            lv_type_1_0=ruleDataTypes();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParameterDataTypeRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_1_0, 
                    		"DataTypes");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:1000:2: ( (lv_many_2_0= '[]' ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==24) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:1001:1: (lv_many_2_0= '[]' )
                    {
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:1001:1: (lv_many_2_0= '[]' )
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:1002:3: lv_many_2_0= '[]'
                    {
                    lv_many_2_0=(Token)match(input,24,FOLLOW_24_in_ruleParameterDataType2041); 

                            newLeafNode(lv_many_2_0, grammarAccess.getParameterDataTypeAccess().getManyLeftSquareBracketRightSquareBracketKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getParameterDataTypeRule());
                    	        }
                           		setWithLastConsumed(current, "many", true, "[]");
                    	    

                    }


                    }
                    break;

            }

            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:1015:3: ( (lv_name_3_0= RULE_ID ) )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:1016:1: (lv_name_3_0= RULE_ID )
            {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:1016:1: (lv_name_3_0= RULE_ID )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:1017:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameterDataType2072); 

            			newLeafNode(lv_name_3_0, grammarAccess.getParameterDataTypeAccess().getNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getParameterDataTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleParameterDataType"


    // $ANTLR start "entryRuleQUALIFIED_NAME"
    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:1041:1: entryRuleQUALIFIED_NAME returns [String current=null] : iv_ruleQUALIFIED_NAME= ruleQUALIFIED_NAME EOF ;
    public final String entryRuleQUALIFIED_NAME() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQUALIFIED_NAME = null;


        try {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:1042:2: (iv_ruleQUALIFIED_NAME= ruleQUALIFIED_NAME EOF )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:1043:2: iv_ruleQUALIFIED_NAME= ruleQUALIFIED_NAME EOF
            {
             newCompositeNode(grammarAccess.getQUALIFIED_NAMERule()); 
            pushFollow(FOLLOW_ruleQUALIFIED_NAME_in_entryRuleQUALIFIED_NAME2114);
            iv_ruleQUALIFIED_NAME=ruleQUALIFIED_NAME();

            state._fsp--;

             current =iv_ruleQUALIFIED_NAME.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQUALIFIED_NAME2125); 

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
    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:1050:1: ruleQUALIFIED_NAME returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQUALIFIED_NAME() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:1053:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:1054:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:1054:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:1054:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQUALIFIED_NAME2165); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQUALIFIED_NAMEAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:1061:1: (kw= '.' this_ID_2= RULE_ID )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==26) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:1062:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,26,FOLLOW_26_in_ruleQUALIFIED_NAME2184); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQUALIFIED_NAMEAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQUALIFIED_NAME2199); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQUALIFIED_NAMEAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop21;
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
    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:1082:1: ruleInternalDSLType returns [Enumerator current=null] : (enumLiteral_0= 'Nested Functions' ) ;
    public final Enumerator ruleInternalDSLType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:1084:28: ( (enumLiteral_0= 'Nested Functions' ) )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:1085:1: (enumLiteral_0= 'Nested Functions' )
            {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:1085:1: (enumLiteral_0= 'Nested Functions' )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:1085:3: enumLiteral_0= 'Nested Functions'
            {
            enumLiteral_0=(Token)match(input,27,FOLLOW_27_in_ruleInternalDSLType2259); 

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
    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:1095:1: ruleDataTypes returns [Enumerator current=null] : ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'boolean' ) | (enumLiteral_3= 'long' ) | (enumLiteral_4= 'double' ) | (enumLiteral_5= 'Object' ) ) ;
    public final Enumerator ruleDataTypes() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;

         enterRule(); 
        try {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:1097:28: ( ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'boolean' ) | (enumLiteral_3= 'long' ) | (enumLiteral_4= 'double' ) | (enumLiteral_5= 'Object' ) ) )
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:1098:1: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'boolean' ) | (enumLiteral_3= 'long' ) | (enumLiteral_4= 'double' ) | (enumLiteral_5= 'Object' ) )
            {
            // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:1098:1: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'boolean' ) | (enumLiteral_3= 'long' ) | (enumLiteral_4= 'double' ) | (enumLiteral_5= 'Object' ) )
            int alt22=6;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt22=1;
                }
                break;
            case 29:
                {
                alt22=2;
                }
                break;
            case 30:
                {
                alt22=3;
                }
                break;
            case 31:
                {
                alt22=4;
                }
                break;
            case 32:
                {
                alt22=5;
                }
                break;
            case 33:
                {
                alt22=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:1098:2: (enumLiteral_0= 'String' )
                    {
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:1098:2: (enumLiteral_0= 'String' )
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:1098:4: enumLiteral_0= 'String'
                    {
                    enumLiteral_0=(Token)match(input,28,FOLLOW_28_in_ruleDataTypes2303); 

                            current = grammarAccess.getDataTypesAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getDataTypesAccess().getStringEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:1104:6: (enumLiteral_1= 'integer' )
                    {
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:1104:6: (enumLiteral_1= 'integer' )
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:1104:8: enumLiteral_1= 'integer'
                    {
                    enumLiteral_1=(Token)match(input,29,FOLLOW_29_in_ruleDataTypes2320); 

                            current = grammarAccess.getDataTypesAccess().getIntegerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getDataTypesAccess().getIntegerEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:1110:6: (enumLiteral_2= 'boolean' )
                    {
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:1110:6: (enumLiteral_2= 'boolean' )
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:1110:8: enumLiteral_2= 'boolean'
                    {
                    enumLiteral_2=(Token)match(input,30,FOLLOW_30_in_ruleDataTypes2337); 

                            current = grammarAccess.getDataTypesAccess().getBooleanEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getDataTypesAccess().getBooleanEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:1116:6: (enumLiteral_3= 'long' )
                    {
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:1116:6: (enumLiteral_3= 'long' )
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:1116:8: enumLiteral_3= 'long'
                    {
                    enumLiteral_3=(Token)match(input,31,FOLLOW_31_in_ruleDataTypes2354); 

                            current = grammarAccess.getDataTypesAccess().getLongEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getDataTypesAccess().getLongEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:1122:6: (enumLiteral_4= 'double' )
                    {
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:1122:6: (enumLiteral_4= 'double' )
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:1122:8: enumLiteral_4= 'double'
                    {
                    enumLiteral_4=(Token)match(input,32,FOLLOW_32_in_ruleDataTypes2371); 

                            current = grammarAccess.getDataTypesAccess().getDoubleEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getDataTypesAccess().getDoubleEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:1128:6: (enumLiteral_5= 'Object' )
                    {
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:1128:6: (enumLiteral_5= 'Object' )
                    // ../org.yazgel.titan.xtext/src-gen/org/yazgel/titan/xtext/parser/antlr/internal/InternalTitan.g:1128:8: enumLiteral_5= 'Object'
                    {
                    enumLiteral_5=(Token)match(input,33,FOLLOW_33_in_ruleDataTypes2388); 

                            current = grammarAccess.getDataTypesAccess().getObjectEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getDataTypesAccess().getObjectEnumLiteralDeclaration_5()); 
                        

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
    public static final BitSet FOLLOW_ruleQUALIFIED_NAME_in_ruleModule152 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleInternalDSLType_in_ruleModule173 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rulePackage_in_ruleModule195 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rulePackage_in_ruleModule216 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rulePackage_in_entryRulePackage255 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rulePackage311 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQUALIFIED_NAME_in_rulePackage332 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulePackage344 = new BitSet(new long[]{0x000000000002C000L});
    public static final BitSet FOLLOW_ruleEntity_in_rulePackage366 = new BitSet(new long[]{0x000000000002C000L});
    public static final BitSet FOLLOW_ruleEntity_in_rulePackage387 = new BitSet(new long[]{0x000000000002C000L});
    public static final BitSet FOLLOW_ruleEntityBuilder_in_rulePackage412 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_ruleEntityBuilder_in_rulePackage433 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_14_in_rulePackage448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity484 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleEntity540 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity557 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_16_in_ruleEntity575 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity595 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleEntity609 = new BitSet(new long[]{0x0000000000804000L});
    public static final BitSet FOLLOW_ruleFeature_in_ruleEntity631 = new BitSet(new long[]{0x0000000000804000L});
    public static final BitSet FOLLOW_ruleFeature_in_ruleEntity652 = new BitSet(new long[]{0x0000000000804000L});
    public static final BitSet FOLLOW_14_in_ruleEntity667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityBuilder_in_entryRuleEntityBuilder703 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntityBuilder713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleEntityBuilder759 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntityBuilder779 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleEntityBuilder791 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_ruletakes_in_ruleEntityBuilder812 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEntityBuilder825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletakes_in_entryRuletakes863 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletakes873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruletakes910 = new BitSet(new long[]{0x00000003F0000010L});
    public static final BitSet FOLLOW_ruleParameterFeature_in_ruletakes931 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_19_in_ruletakes944 = new BitSet(new long[]{0x00000003F0000010L});
    public static final BitSet FOLLOW_ruleParameterFeature_in_ruletakes965 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_ruleadds_in_ruletakes988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleadds_in_entryRuleadds1025 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleadds1035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleadds1072 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleadds1084 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQUALIFIED_NAME_in_ruleadds1108 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_19_in_ruleadds1121 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQUALIFIED_NAME_in_ruleadds1144 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_22_in_ruleadds1159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature1195 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature1205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_ruleFeature1252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleFeature1279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_entryRuleReference1314 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReference1324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleReference1370 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReference1387 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReference1412 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_24_in_ruleReference1430 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleReference1457 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQUALIFIED_NAME_in_ruleReference1480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_entryRuleDataType1518 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataType1528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleDataType1574 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataType1591 = new BitSet(new long[]{0x00000003F0000010L});
    public static final BitSet FOLLOW_ruleDataTypes_in_ruleDataType1617 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleDataType1635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterFeature_in_entryRuleParameterFeature1685 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterFeature1695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterReference_in_ruleParameterFeature1742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDataType_in_ruleParameterFeature1769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterReference_in_entryRuleParameterReference1804 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterReference1814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameterReference1868 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_24_in_ruleParameterReference1886 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameterReference1917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDataType_in_entryRuleParameterDataType1958 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterDataType1968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypes_in_ruleParameterDataType2023 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_24_in_ruleParameterDataType2041 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameterDataType2072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQUALIFIED_NAME_in_entryRuleQUALIFIED_NAME2114 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQUALIFIED_NAME2125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQUALIFIED_NAME2165 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleQUALIFIED_NAME2184 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQUALIFIED_NAME2199 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_27_in_ruleInternalDSLType2259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleDataTypes2303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleDataTypes2320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleDataTypes2337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleDataTypes2354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleDataTypes2371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleDataTypes2388 = new BitSet(new long[]{0x0000000000000002L});

}