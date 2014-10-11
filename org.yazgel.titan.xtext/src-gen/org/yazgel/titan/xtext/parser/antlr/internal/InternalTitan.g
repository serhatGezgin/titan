/*
* generated by Xtext
*/
grammar InternalTitan;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package org.yazgel.titan.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleModule
entryRuleModule returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getModuleRule()); }
	 iv_ruleModule=ruleModule 
	 { $current=$iv_ruleModule.current; } 
	 EOF 
;

// Rule Module
ruleModule returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getModuleAccess().getModuleAction_0(),
            $current);
    }
)	otherlv_1='module' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getModuleAccess().getModuleKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getModuleAccess().getNameQUALIFIED_NAMEParserRuleCall_2_0()); 
	    }
		lv_name_2_0=ruleQUALIFIED_NAME		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModuleRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"QUALIFIED_NAME");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getModuleAccess().getTypeInternalDSLTypeEnumRuleCall_3_0()); 
	    }
		lv_type_3_0=ruleInternalDSLType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModuleRule());
	        }
       		set(
       			$current, 
       			"type",
        		lv_type_3_0, 
        		"InternalDSLType");
	        afterParserOrEnumRuleCall();
	    }

)
)((
(
		{ 
	        newCompositeNode(grammarAccess.getModuleAccess().getPackagesPackageParserRuleCall_4_0_0()); 
	    }
		lv_packages_4_0=rulePackage		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModuleRule());
	        }
       		add(
       			$current, 
       			"packages",
        		lv_packages_4_0, 
        		"Package");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getModuleAccess().getPackagesPackageParserRuleCall_4_1_0()); 
	    }
		lv_packages_5_0=rulePackage		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModuleRule());
	        }
       		add(
       			$current, 
       			"packages",
        		lv_packages_5_0, 
        		"Package");
	        afterParserOrEnumRuleCall();
	    }

)
)*)?)
;





// Entry rule entryRulePackage
entryRulePackage returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getPackageRule()); }
	 iv_rulePackage=rulePackage 
	 { $current=$iv_rulePackage.current; } 
	 EOF 
;

// Rule Package
rulePackage returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getPackageAccess().getPackageAction_0(),
            $current);
    }
)	otherlv_1='package' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getPackageAccess().getPackageKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getPackageAccess().getNameQUALIFIED_NAMEParserRuleCall_2_0()); 
	    }
		lv_name_2_0=ruleQUALIFIED_NAME		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPackageRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"QUALIFIED_NAME");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3='{' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_3());
    }
((
(
		{ 
	        newCompositeNode(grammarAccess.getPackageAccess().getEntitiesEntityParserRuleCall_4_0_0()); 
	    }
		lv_entities_4_0=ruleEntity		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPackageRule());
	        }
       		add(
       			$current, 
       			"entities",
        		lv_entities_4_0, 
        		"Entity");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getPackageAccess().getEntitiesEntityParserRuleCall_4_1_0()); 
	    }
		lv_entities_5_0=ruleEntity		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPackageRule());
	        }
       		add(
       			$current, 
       			"entities",
        		lv_entities_5_0, 
        		"Entity");
	        afterParserOrEnumRuleCall();
	    }

)
)*)?((
(
		{ 
	        newCompositeNode(grammarAccess.getPackageAccess().getEntityBuildersEntityBuilderParserRuleCall_5_0_0()); 
	    }
		lv_entityBuilders_6_0=ruleEntityBuilder		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPackageRule());
	        }
       		add(
       			$current, 
       			"entityBuilders",
        		lv_entityBuilders_6_0, 
        		"EntityBuilder");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getPackageAccess().getEntityBuildersEntityBuilderParserRuleCall_5_1_0()); 
	    }
		lv_entityBuilders_7_0=ruleEntityBuilder		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPackageRule());
	        }
       		add(
       			$current, 
       			"entityBuilders",
        		lv_entityBuilders_7_0, 
        		"EntityBuilder");
	        afterParserOrEnumRuleCall();
	    }

)
)*)?	otherlv_8='}' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_6());
    }
)
;





// Entry rule entryRuleEntity
entryRuleEntity returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getEntityRule()); }
	 iv_ruleEntity=ruleEntity 
	 { $current=$iv_ruleEntity.current; } 
	 EOF 
;

// Rule Entity
ruleEntity returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getEntityAccess().getEntityAction_0(),
            $current);
    }
)	otherlv_1='entity' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getEntityAccess().getEntityKeyword_1());
    }
(
(
		lv_name_2_0=RULE_ID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getEntityRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"ID");
	    }

)
)(	otherlv_3=':' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getColonKeyword_3_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getEntityRule());
	        }
        }
	otherlv_4=RULE_ID
	{
		newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getSuperEntityEntityCrossReference_3_1_0()); 
	}

)
))?	otherlv_5='{' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_4());
    }
((
(
		{ 
	        newCompositeNode(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_5_0_0()); 
	    }
		lv_features_6_0=ruleFeature		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEntityRule());
	        }
       		add(
       			$current, 
       			"features",
        		lv_features_6_0, 
        		"Feature");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_5_1_0()); 
	    }
		lv_features_7_0=ruleFeature		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEntityRule());
	        }
       		add(
       			$current, 
       			"features",
        		lv_features_7_0, 
        		"Feature");
	        afterParserOrEnumRuleCall();
	    }

)
)*)?	otherlv_8='}' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_6());
    }
)
;





// Entry rule entryRuleEntityBuilder
entryRuleEntityBuilder returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getEntityBuilderRule()); }
	 iv_ruleEntityBuilder=ruleEntityBuilder 
	 { $current=$iv_ruleEntityBuilder.current; } 
	 EOF 
;

// Rule EntityBuilder
ruleEntityBuilder returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getEntityBuilderAccess().getEntityBuilderAction_0(),
            $current);
    }
)	otherlv_1='entityBuilder' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getEntityBuilderAccess().getEntityBuilderKeyword_1());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getEntityBuilderRule());
	        }
        }
	otherlv_2=RULE_ID
	{
		newLeafNode(otherlv_2, grammarAccess.getEntityBuilderAccess().getNameEntityCrossReference_2_0()); 
	}

)
)	otherlv_3='{' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getEntityBuilderAccess().getLeftCurlyBracketKeyword_3());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getEntityBuilderAccess().getTakesTakesParserRuleCall_4_0()); 
	    }
		lv_takes_4_0=ruletakes		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEntityBuilderRule());
	        }
       		set(
       			$current, 
       			"takes",
        		lv_takes_4_0, 
        		"takes");
	        afterParserOrEnumRuleCall();
	    }

)
)?	otherlv_5='}' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getEntityBuilderAccess().getRightCurlyBracketKeyword_5());
    }
)
;







// Entry rule entryRuletakes
entryRuletakes returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTakesRule()); }
	 iv_ruletakes=ruletakes 
	 { $current=$iv_ruletakes.current; } 
	 EOF 
;

// Rule takes
ruletakes returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='takes' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getTakesAccess().getTakesKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getTakesAccess().getTakesParameterFeatureParserRuleCall_1_0()); 
	    }
		lv_takes_1_0=ruleParameterFeature		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getTakesRule());
	        }
       		add(
       			$current, 
       			"takes",
        		lv_takes_1_0, 
        		"ParameterFeature");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_2=',' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getTakesAccess().getCommaKeyword_2_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getTakesAccess().getTakesParameterFeatureParserRuleCall_2_1_0()); 
	    }
		lv_takes_3_0=ruleParameterFeature		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getTakesRule());
	        }
       		add(
       			$current, 
       			"takes",
        		lv_takes_3_0, 
        		"ParameterFeature");
	        afterParserOrEnumRuleCall();
	    }

)
))*(
(
		{ 
	        newCompositeNode(grammarAccess.getTakesAccess().getAddsAddsParserRuleCall_3_0()); 
	    }
		lv_adds_4_0=ruleadds		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getTakesRule());
	        }
       		add(
       			$current, 
       			"adds",
        		lv_adds_4_0, 
        		"adds");
	        afterParserOrEnumRuleCall();
	    }

)
)?)
;





// Entry rule entryRuleadds
entryRuleadds returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAddsRule()); }
	 iv_ruleadds=ruleadds 
	 { $current=$iv_ruleadds.current; } 
	 EOF 
;

// Rule adds
ruleadds returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='adds' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getAddsAccess().getAddsKeyword_0());
    }
	otherlv_1='(' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getAddsAccess().getLeftParenthesisKeyword_1());
    }
((
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getAddsRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getAddsAccess().getAddsFeatureCrossReference_2_0_0()); 
	    }
		ruleQUALIFIED_NAME		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_3=',' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getAddsAccess().getCommaKeyword_2_1_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getAddsRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getAddsAccess().getAddsFeatureCrossReference_2_1_1_0()); 
	    }
		ruleQUALIFIED_NAME		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))*)	otherlv_5=')' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getAddsAccess().getRightParenthesisKeyword_3());
    }
)
;





// Entry rule entryRuleFeature
entryRuleFeature returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFeatureRule()); }
	 iv_ruleFeature=ruleFeature 
	 { $current=$iv_ruleFeature.current; } 
	 EOF 
;

// Rule Feature
ruleFeature returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getFeatureAccess().getReferenceParserRuleCall_0()); 
    }
    this_Reference_0=ruleReference
    { 
        $current = $this_Reference_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getFeatureAccess().getDataTypeParserRuleCall_1()); 
    }
    this_DataType_1=ruleDataType
    { 
        $current = $this_DataType_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleReference
entryRuleReference returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getReferenceRule()); }
	 iv_ruleReference=ruleReference 
	 { $current=$iv_ruleReference.current; } 
	 EOF 
;

// Rule Reference
ruleReference returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getReferenceAccess().getReferenceAction_0(),
            $current);
    }
)	otherlv_1='var' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getReferenceAccess().getVarKeyword_1());
    }
(
(
		lv_name_2_0=RULE_ID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getReferenceAccess().getNameIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getReferenceRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"ID");
	    }

)
)(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getReferenceRule());
	        }
        }
	otherlv_3=RULE_ID
	{
		newLeafNode(otherlv_3, grammarAccess.getReferenceAccess().getReferenceEntityCrossReference_3_0()); 
	}

)
)(
(
		lv_many_4_0=	'[]' 
    {
        newLeafNode(lv_many_4_0, grammarAccess.getReferenceAccess().getManyLeftSquareBracketRightSquareBracketKeyword_4_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getReferenceRule());
	        }
       		setWithLastConsumed($current, "many", true, "[]");
	    }

)
)?(	otherlv_5='opposite' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getReferenceAccess().getOppositeKeyword_5_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getReferenceRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getReferenceAccess().getOppositeReferenceCrossReference_5_1_0()); 
	    }
		ruleQUALIFIED_NAME		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))?)
;





// Entry rule entryRuleDataType
entryRuleDataType returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDataTypeRule()); }
	 iv_ruleDataType=ruleDataType 
	 { $current=$iv_ruleDataType.current; } 
	 EOF 
;

// Rule DataType
ruleDataType returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getDataTypeAccess().getDataTypeAction_0(),
            $current);
    }
)	otherlv_1='var' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getDataTypeAccess().getVarKeyword_1());
    }
(
(
		lv_name_2_0=RULE_ID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getDataTypeRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"ID");
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getDataTypeAccess().getTypeDataTypesEnumRuleCall_3_0()); 
	    }
		lv_type_3_0=ruleDataTypes		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDataTypeRule());
	        }
       		set(
       			$current, 
       			"type",
        		lv_type_3_0, 
        		"DataTypes");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		lv_many_4_0=	'[]' 
    {
        newLeafNode(lv_many_4_0, grammarAccess.getDataTypeAccess().getManyLeftSquareBracketRightSquareBracketKeyword_4_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getDataTypeRule());
	        }
       		setWithLastConsumed($current, "many", true, "[]");
	    }

)
)?)
;





// Entry rule entryRuleParameterFeature
entryRuleParameterFeature returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getParameterFeatureRule()); }
	 iv_ruleParameterFeature=ruleParameterFeature 
	 { $current=$iv_ruleParameterFeature.current; } 
	 EOF 
;

// Rule ParameterFeature
ruleParameterFeature returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getParameterFeatureAccess().getParameterReferenceParserRuleCall_0()); 
    }
    this_ParameterReference_0=ruleParameterReference
    { 
        $current = $this_ParameterReference_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getParameterFeatureAccess().getParameterDataTypeParserRuleCall_1()); 
    }
    this_ParameterDataType_1=ruleParameterDataType
    { 
        $current = $this_ParameterDataType_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleParameterReference
entryRuleParameterReference returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getParameterReferenceRule()); }
	 iv_ruleParameterReference=ruleParameterReference 
	 { $current=$iv_ruleParameterReference.current; } 
	 EOF 
;

// Rule ParameterReference
ruleParameterReference returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getParameterReferenceAccess().getParameterReferenceAction_0(),
            $current);
    }
)(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getParameterReferenceRule());
	        }
        }
	otherlv_1=RULE_ID
	{
		newLeafNode(otherlv_1, grammarAccess.getParameterReferenceAccess().getReferenceEntityCrossReference_1_0()); 
	}

)
)(
(
		lv_many_2_0=	'[]' 
    {
        newLeafNode(lv_many_2_0, grammarAccess.getParameterReferenceAccess().getManyLeftSquareBracketRightSquareBracketKeyword_2_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getParameterReferenceRule());
	        }
       		setWithLastConsumed($current, "many", true, "[]");
	    }

)
)?(
(
		lv_name_3_0=RULE_ID
		{
			newLeafNode(lv_name_3_0, grammarAccess.getParameterReferenceAccess().getNameIDTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getParameterReferenceRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_3_0, 
        		"ID");
	    }

)
))
;





// Entry rule entryRuleParameterDataType
entryRuleParameterDataType returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getParameterDataTypeRule()); }
	 iv_ruleParameterDataType=ruleParameterDataType 
	 { $current=$iv_ruleParameterDataType.current; } 
	 EOF 
;

// Rule ParameterDataType
ruleParameterDataType returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getParameterDataTypeAccess().getParameterDataTypeAction_0(),
            $current);
    }
)(
(
		{ 
	        newCompositeNode(grammarAccess.getParameterDataTypeAccess().getTypeDataTypesEnumRuleCall_1_0()); 
	    }
		lv_type_1_0=ruleDataTypes		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getParameterDataTypeRule());
	        }
       		set(
       			$current, 
       			"type",
        		lv_type_1_0, 
        		"DataTypes");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		lv_many_2_0=	'[]' 
    {
        newLeafNode(lv_many_2_0, grammarAccess.getParameterDataTypeAccess().getManyLeftSquareBracketRightSquareBracketKeyword_2_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getParameterDataTypeRule());
	        }
       		setWithLastConsumed($current, "many", true, "[]");
	    }

)
)?(
(
		lv_name_3_0=RULE_ID
		{
			newLeafNode(lv_name_3_0, grammarAccess.getParameterDataTypeAccess().getNameIDTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getParameterDataTypeRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_3_0, 
        		"ID");
	    }

)
))
;





// Entry rule entryRuleQUALIFIED_NAME
entryRuleQUALIFIED_NAME returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getQUALIFIED_NAMERule()); } 
	 iv_ruleQUALIFIED_NAME=ruleQUALIFIED_NAME 
	 { $current=$iv_ruleQUALIFIED_NAME.current.getText(); }  
	 EOF 
;

// Rule QUALIFIED_NAME
ruleQUALIFIED_NAME returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_ID_0=RULE_ID    {
		$current.merge(this_ID_0);
    }

    { 
    newLeafNode(this_ID_0, grammarAccess.getQUALIFIED_NAMEAccess().getIDTerminalRuleCall_0()); 
    }
(
	kw='.' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getQUALIFIED_NAMEAccess().getFullStopKeyword_1_0()); 
    }
    this_ID_2=RULE_ID    {
		$current.merge(this_ID_2);
    }

    { 
    newLeafNode(this_ID_2, grammarAccess.getQUALIFIED_NAMEAccess().getIDTerminalRuleCall_1_1()); 
    }
)*)
    ;





// Rule InternalDSLType
ruleInternalDSLType returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
(	enumLiteral_0='Nested Functions' 
	{
        $current = grammarAccess.getInternalDSLTypeAccess().getNestedFunctionsEnumLiteralDeclaration().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getInternalDSLTypeAccess().getNestedFunctionsEnumLiteralDeclaration()); 
    }
);



// Rule DataTypes
ruleDataTypes returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='String' 
	{
        $current = grammarAccess.getDataTypesAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getDataTypesAccess().getStringEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='integer' 
	{
        $current = grammarAccess.getDataTypesAccess().getIntegerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getDataTypesAccess().getIntegerEnumLiteralDeclaration_1()); 
    }
)
    |(	enumLiteral_2='boolean' 
	{
        $current = grammarAccess.getDataTypesAccess().getBooleanEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_2, grammarAccess.getDataTypesAccess().getBooleanEnumLiteralDeclaration_2()); 
    }
)
    |(	enumLiteral_3='long' 
	{
        $current = grammarAccess.getDataTypesAccess().getLongEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_3, grammarAccess.getDataTypesAccess().getLongEnumLiteralDeclaration_3()); 
    }
)
    |(	enumLiteral_4='double' 
	{
        $current = grammarAccess.getDataTypesAccess().getDoubleEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_4, grammarAccess.getDataTypesAccess().getDoubleEnumLiteralDeclaration_4()); 
    }
)
    |(	enumLiteral_5='Object' 
	{
        $current = grammarAccess.getDataTypesAccess().getObjectEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_5, grammarAccess.getDataTypesAccess().getObjectEnumLiteralDeclaration_5()); 
    }
));



RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;

