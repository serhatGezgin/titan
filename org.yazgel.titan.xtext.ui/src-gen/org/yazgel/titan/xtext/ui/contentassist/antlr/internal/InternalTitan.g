/*
* generated by Xtext
*/
grammar InternalTitan;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package org.yazgel.titan.xtext.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
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

}

@parser::members {
 
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

}




// Entry rule entryRuleModule
entryRuleModule 
:
{ before(grammarAccess.getModuleRule()); }
	 ruleModule
{ after(grammarAccess.getModuleRule()); } 
	 EOF 
;

// Rule Module
ruleModule
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getModuleAccess().getGroup()); }
(rule__Module__Group__0)
{ after(grammarAccess.getModuleAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRulePackage
entryRulePackage 
:
{ before(grammarAccess.getPackageRule()); }
	 rulePackage
{ after(grammarAccess.getPackageRule()); } 
	 EOF 
;

// Rule Package
rulePackage
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getPackageAccess().getGroup()); }
(rule__Package__Group__0)
{ after(grammarAccess.getPackageAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleEntity
entryRuleEntity 
:
{ before(grammarAccess.getEntityRule()); }
	 ruleEntity
{ after(grammarAccess.getEntityRule()); } 
	 EOF 
;

// Rule Entity
ruleEntity
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getEntityAccess().getGroup()); }
(rule__Entity__Group__0)
{ after(grammarAccess.getEntityAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleFeature
entryRuleFeature 
:
{ before(grammarAccess.getFeatureRule()); }
	 ruleFeature
{ after(grammarAccess.getFeatureRule()); } 
	 EOF 
;

// Rule Feature
ruleFeature
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getFeatureAccess().getAlternatives()); }
(rule__Feature__Alternatives)
{ after(grammarAccess.getFeatureAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleReference
entryRuleReference 
:
{ before(grammarAccess.getReferenceRule()); }
	 ruleReference
{ after(grammarAccess.getReferenceRule()); } 
	 EOF 
;

// Rule Reference
ruleReference
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getReferenceAccess().getGroup()); }
(rule__Reference__Group__0)
{ after(grammarAccess.getReferenceAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleDataType
entryRuleDataType 
:
{ before(grammarAccess.getDataTypeRule()); }
	 ruleDataType
{ after(grammarAccess.getDataTypeRule()); } 
	 EOF 
;

// Rule DataType
ruleDataType
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getDataTypeAccess().getGroup()); }
(rule__DataType__Group__0)
{ after(grammarAccess.getDataTypeAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleQUALIFIED_NAME
entryRuleQUALIFIED_NAME 
:
{ before(grammarAccess.getQUALIFIED_NAMERule()); }
	 ruleQUALIFIED_NAME
{ after(grammarAccess.getQUALIFIED_NAMERule()); } 
	 EOF 
;

// Rule QUALIFIED_NAME
ruleQUALIFIED_NAME
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getQUALIFIED_NAMEAccess().getGroup()); }
(rule__QUALIFIED_NAME__Group__0)
{ after(grammarAccess.getQUALIFIED_NAMEAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}




// Rule InternalDSLType
ruleInternalDSLType
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInternalDSLTypeAccess().getNestedFunctionsEnumLiteralDeclaration()); }
(	'Nested Functions' 
)
{ after(grammarAccess.getInternalDSLTypeAccess().getNestedFunctionsEnumLiteralDeclaration()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Rule DataTypes
ruleDataTypes
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataTypesAccess().getAlternatives()); }
(rule__DataTypes__Alternatives)
{ after(grammarAccess.getDataTypesAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__Feature__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFeatureAccess().getReferenceParserRuleCall_0()); }
	ruleReference
{ after(grammarAccess.getFeatureAccess().getReferenceParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getFeatureAccess().getDataTypeParserRuleCall_1()); }
	ruleDataType
{ after(grammarAccess.getFeatureAccess().getDataTypeParserRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__DataTypes__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataTypesAccess().getStringEnumLiteralDeclaration_0()); }
(	'String' 
)
{ after(grammarAccess.getDataTypesAccess().getStringEnumLiteralDeclaration_0()); }
)

    |(
{ before(grammarAccess.getDataTypesAccess().getIntegerEnumLiteralDeclaration_1()); }
(	'integer' 
)
{ after(grammarAccess.getDataTypesAccess().getIntegerEnumLiteralDeclaration_1()); }
)

    |(
{ before(grammarAccess.getDataTypesAccess().getBooleanEnumLiteralDeclaration_2()); }
(	'boolean' 
)
{ after(grammarAccess.getDataTypesAccess().getBooleanEnumLiteralDeclaration_2()); }
)

    |(
{ before(grammarAccess.getDataTypesAccess().getLongEnumLiteralDeclaration_3()); }
(	'long' 
)
{ after(grammarAccess.getDataTypesAccess().getLongEnumLiteralDeclaration_3()); }
)

    |(
{ before(grammarAccess.getDataTypesAccess().getDoubleEnumLiteralDeclaration_4()); }
(	'double' 
)
{ after(grammarAccess.getDataTypesAccess().getDoubleEnumLiteralDeclaration_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__Module__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Module__Group__0__Impl
	rule__Module__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Module__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleAccess().getModuleAction_0()); }
(

)
{ after(grammarAccess.getModuleAccess().getModuleAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Module__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Module__Group__1__Impl
	rule__Module__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Module__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleAccess().getModuleKeyword_1()); }

	'module' 

{ after(grammarAccess.getModuleAccess().getModuleKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Module__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Module__Group__2__Impl
	rule__Module__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Module__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleAccess().getNameAssignment_2()); }
(rule__Module__NameAssignment_2)
{ after(grammarAccess.getModuleAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Module__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Module__Group__3__Impl
	rule__Module__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Module__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleAccess().getTypeAssignment_3()); }
(rule__Module__TypeAssignment_3)
{ after(grammarAccess.getModuleAccess().getTypeAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Module__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Module__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Module__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleAccess().getGroup_4()); }
(rule__Module__Group_4__0)?
{ after(grammarAccess.getModuleAccess().getGroup_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__Module__Group_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Module__Group_4__0__Impl
	rule__Module__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Module__Group_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleAccess().getPackagesAssignment_4_0()); }
(rule__Module__PackagesAssignment_4_0)
{ after(grammarAccess.getModuleAccess().getPackagesAssignment_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Module__Group_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Module__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Module__Group_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleAccess().getPackagesAssignment_4_1()); }
(rule__Module__PackagesAssignment_4_1)*
{ after(grammarAccess.getModuleAccess().getPackagesAssignment_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Package__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Package__Group__0__Impl
	rule__Package__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Package__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPackageAccess().getPackageAction_0()); }
(

)
{ after(grammarAccess.getPackageAccess().getPackageAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Package__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Package__Group__1__Impl
	rule__Package__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Package__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPackageAccess().getPackageKeyword_1()); }

	'package' 

{ after(grammarAccess.getPackageAccess().getPackageKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Package__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Package__Group__2__Impl
	rule__Package__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Package__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPackageAccess().getNameAssignment_2()); }
(rule__Package__NameAssignment_2)
{ after(grammarAccess.getPackageAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Package__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Package__Group__3__Impl
	rule__Package__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Package__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_3()); }

	'{' 

{ after(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Package__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Package__Group__4__Impl
	rule__Package__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Package__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPackageAccess().getGroup_4()); }
(rule__Package__Group_4__0)?
{ after(grammarAccess.getPackageAccess().getGroup_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Package__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Package__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Package__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_5()); }

	'}' 

{ after(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__Package__Group_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Package__Group_4__0__Impl
	rule__Package__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Package__Group_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPackageAccess().getEntitiesAssignment_4_0()); }
(rule__Package__EntitiesAssignment_4_0)
{ after(grammarAccess.getPackageAccess().getEntitiesAssignment_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Package__Group_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Package__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Package__Group_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPackageAccess().getEntitiesAssignment_4_1()); }
(rule__Package__EntitiesAssignment_4_1)*
{ after(grammarAccess.getPackageAccess().getEntitiesAssignment_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Entity__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Entity__Group__0__Impl
	rule__Entity__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityAccess().getEntityAction_0()); }
(

)
{ after(grammarAccess.getEntityAccess().getEntityAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Entity__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Entity__Group__1__Impl
	rule__Entity__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityAccess().getEntityKeyword_1()); }

	'entity' 

{ after(grammarAccess.getEntityAccess().getEntityKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Entity__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Entity__Group__2__Impl
	rule__Entity__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityAccess().getNameAssignment_2()); }
(rule__Entity__NameAssignment_2)
{ after(grammarAccess.getEntityAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Entity__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Entity__Group__3__Impl
	rule__Entity__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityAccess().getGroup_3()); }
(rule__Entity__Group_3__0)?
{ after(grammarAccess.getEntityAccess().getGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Entity__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Entity__Group__4__Impl
	rule__Entity__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_4()); }

	'{' 

{ after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Entity__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Entity__Group__5__Impl
	rule__Entity__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityAccess().getGroup_5()); }
(rule__Entity__Group_5__0)?
{ after(grammarAccess.getEntityAccess().getGroup_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Entity__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Entity__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_6()); }

	'}' 

{ after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}
















rule__Entity__Group_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Entity__Group_3__0__Impl
	rule__Entity__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityAccess().getColonKeyword_3_0()); }

	':' 

{ after(grammarAccess.getEntityAccess().getColonKeyword_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Entity__Group_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Entity__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityAccess().getSuperEntityAssignment_3_1()); }
(rule__Entity__SuperEntityAssignment_3_1)
{ after(grammarAccess.getEntityAccess().getSuperEntityAssignment_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Entity__Group_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Entity__Group_5__0__Impl
	rule__Entity__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group_5__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityAccess().getFeaturesAssignment_5_0()); }
(rule__Entity__FeaturesAssignment_5_0)
{ after(grammarAccess.getEntityAccess().getFeaturesAssignment_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Entity__Group_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Entity__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group_5__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityAccess().getFeaturesAssignment_5_1()); }
(rule__Entity__FeaturesAssignment_5_1)*
{ after(grammarAccess.getEntityAccess().getFeaturesAssignment_5_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Reference__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Reference__Group__0__Impl
	rule__Reference__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Reference__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getReferenceAccess().getReferenceAction_0()); }
(

)
{ after(grammarAccess.getReferenceAccess().getReferenceAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Reference__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Reference__Group__1__Impl
	rule__Reference__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Reference__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getReferenceAccess().getVarKeyword_1()); }

	'var' 

{ after(grammarAccess.getReferenceAccess().getVarKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Reference__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Reference__Group__2__Impl
	rule__Reference__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Reference__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getReferenceAccess().getNameAssignment_2()); }
(rule__Reference__NameAssignment_2)
{ after(grammarAccess.getReferenceAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Reference__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Reference__Group__3__Impl
	rule__Reference__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Reference__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getReferenceAccess().getReferenceAssignment_3()); }
(rule__Reference__ReferenceAssignment_3)
{ after(grammarAccess.getReferenceAccess().getReferenceAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Reference__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Reference__Group__4__Impl
	rule__Reference__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Reference__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getReferenceAccess().getManyAssignment_4()); }
(rule__Reference__ManyAssignment_4)?
{ after(grammarAccess.getReferenceAccess().getManyAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Reference__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Reference__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Reference__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getReferenceAccess().getGroup_5()); }
(rule__Reference__Group_5__0)?
{ after(grammarAccess.getReferenceAccess().getGroup_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__Reference__Group_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Reference__Group_5__0__Impl
	rule__Reference__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Reference__Group_5__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getReferenceAccess().getOppositeKeyword_5_0()); }

	'opposite' 

{ after(grammarAccess.getReferenceAccess().getOppositeKeyword_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Reference__Group_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Reference__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Reference__Group_5__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getReferenceAccess().getOppositeAssignment_5_1()); }
(rule__Reference__OppositeAssignment_5_1)
{ after(grammarAccess.getReferenceAccess().getOppositeAssignment_5_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__DataType__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DataType__Group__0__Impl
	rule__DataType__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DataType__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataTypeAccess().getDataTypeAction_0()); }
(

)
{ after(grammarAccess.getDataTypeAccess().getDataTypeAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DataType__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DataType__Group__1__Impl
	rule__DataType__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DataType__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataTypeAccess().getVarKeyword_1()); }

	'var' 

{ after(grammarAccess.getDataTypeAccess().getVarKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DataType__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DataType__Group__2__Impl
	rule__DataType__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__DataType__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataTypeAccess().getNameAssignment_2()); }
(rule__DataType__NameAssignment_2)
{ after(grammarAccess.getDataTypeAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DataType__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DataType__Group__3__Impl
	rule__DataType__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__DataType__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataTypeAccess().getTypeAssignment_3()); }
(rule__DataType__TypeAssignment_3)
{ after(grammarAccess.getDataTypeAccess().getTypeAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DataType__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DataType__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DataType__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataTypeAccess().getManyAssignment_4()); }
(rule__DataType__ManyAssignment_4)?
{ after(grammarAccess.getDataTypeAccess().getManyAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__QUALIFIED_NAME__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__QUALIFIED_NAME__Group__0__Impl
	rule__QUALIFIED_NAME__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QUALIFIED_NAME__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQUALIFIED_NAMEAccess().getIDTerminalRuleCall_0()); }
	RULE_ID
{ after(grammarAccess.getQUALIFIED_NAMEAccess().getIDTerminalRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__QUALIFIED_NAME__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__QUALIFIED_NAME__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QUALIFIED_NAME__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQUALIFIED_NAMEAccess().getGroup_1()); }
(rule__QUALIFIED_NAME__Group_1__0)*
{ after(grammarAccess.getQUALIFIED_NAMEAccess().getGroup_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__QUALIFIED_NAME__Group_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__QUALIFIED_NAME__Group_1__0__Impl
	rule__QUALIFIED_NAME__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QUALIFIED_NAME__Group_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQUALIFIED_NAMEAccess().getFullStopKeyword_1_0()); }

	'.' 

{ after(grammarAccess.getQUALIFIED_NAMEAccess().getFullStopKeyword_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__QUALIFIED_NAME__Group_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__QUALIFIED_NAME__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QUALIFIED_NAME__Group_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQUALIFIED_NAMEAccess().getIDTerminalRuleCall_1_1()); }
	RULE_ID
{ after(grammarAccess.getQUALIFIED_NAMEAccess().getIDTerminalRuleCall_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}







rule__Module__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleAccess().getNameQUALIFIED_NAMEParserRuleCall_2_0()); }
	ruleQUALIFIED_NAME{ after(grammarAccess.getModuleAccess().getNameQUALIFIED_NAMEParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Module__TypeAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleAccess().getTypeInternalDSLTypeEnumRuleCall_3_0()); }
	ruleInternalDSLType{ after(grammarAccess.getModuleAccess().getTypeInternalDSLTypeEnumRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Module__PackagesAssignment_4_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleAccess().getPackagesPackageParserRuleCall_4_0_0()); }
	rulePackage{ after(grammarAccess.getModuleAccess().getPackagesPackageParserRuleCall_4_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Module__PackagesAssignment_4_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleAccess().getPackagesPackageParserRuleCall_4_1_0()); }
	rulePackage{ after(grammarAccess.getModuleAccess().getPackagesPackageParserRuleCall_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Package__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPackageAccess().getNameQUALIFIED_NAMEParserRuleCall_2_0()); }
	ruleQUALIFIED_NAME{ after(grammarAccess.getPackageAccess().getNameQUALIFIED_NAMEParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Package__EntitiesAssignment_4_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPackageAccess().getEntitiesEntityParserRuleCall_4_0_0()); }
	ruleEntity{ after(grammarAccess.getPackageAccess().getEntitiesEntityParserRuleCall_4_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Package__EntitiesAssignment_4_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPackageAccess().getEntitiesEntityParserRuleCall_4_1_0()); }
	ruleEntity{ after(grammarAccess.getPackageAccess().getEntitiesEntityParserRuleCall_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_2_0()); }
	RULE_ID{ after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__SuperEntityAssignment_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityAccess().getSuperEntityEntityCrossReference_3_1_0()); }
(
{ before(grammarAccess.getEntityAccess().getSuperEntityEntityIDTerminalRuleCall_3_1_0_1()); }
	RULE_ID{ after(grammarAccess.getEntityAccess().getSuperEntityEntityIDTerminalRuleCall_3_1_0_1()); }
)
{ after(grammarAccess.getEntityAccess().getSuperEntityEntityCrossReference_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__FeaturesAssignment_5_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_5_0_0()); }
	ruleFeature{ after(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_5_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__FeaturesAssignment_5_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_5_1_0()); }
	ruleFeature{ after(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_5_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Reference__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getReferenceAccess().getNameIDTerminalRuleCall_2_0()); }
	RULE_ID{ after(grammarAccess.getReferenceAccess().getNameIDTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Reference__ReferenceAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getReferenceAccess().getReferenceEntityCrossReference_3_0()); }
(
{ before(grammarAccess.getReferenceAccess().getReferenceEntityIDTerminalRuleCall_3_0_1()); }
	RULE_ID{ after(grammarAccess.getReferenceAccess().getReferenceEntityIDTerminalRuleCall_3_0_1()); }
)
{ after(grammarAccess.getReferenceAccess().getReferenceEntityCrossReference_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Reference__ManyAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getReferenceAccess().getManyLeftSquareBracketRightSquareBracketKeyword_4_0()); }
(
{ before(grammarAccess.getReferenceAccess().getManyLeftSquareBracketRightSquareBracketKeyword_4_0()); }

	'[]' 

{ after(grammarAccess.getReferenceAccess().getManyLeftSquareBracketRightSquareBracketKeyword_4_0()); }
)

{ after(grammarAccess.getReferenceAccess().getManyLeftSquareBracketRightSquareBracketKeyword_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Reference__OppositeAssignment_5_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getReferenceAccess().getOppositeReferenceCrossReference_5_1_0()); }
(
{ before(grammarAccess.getReferenceAccess().getOppositeReferenceQUALIFIED_NAMEParserRuleCall_5_1_0_1()); }
	ruleQUALIFIED_NAME{ after(grammarAccess.getReferenceAccess().getOppositeReferenceQUALIFIED_NAMEParserRuleCall_5_1_0_1()); }
)
{ after(grammarAccess.getReferenceAccess().getOppositeReferenceCrossReference_5_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__DataType__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_2_0()); }
	RULE_ID{ after(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__DataType__TypeAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataTypeAccess().getTypeDataTypesEnumRuleCall_3_0()); }
	ruleDataTypes{ after(grammarAccess.getDataTypeAccess().getTypeDataTypesEnumRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__DataType__ManyAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataTypeAccess().getManyLeftSquareBracketRightSquareBracketKeyword_4_0()); }
(
{ before(grammarAccess.getDataTypeAccess().getManyLeftSquareBracketRightSquareBracketKeyword_4_0()); }

	'[]' 

{ after(grammarAccess.getDataTypeAccess().getManyLeftSquareBracketRightSquareBracketKeyword_4_0()); }
)

{ after(grammarAccess.getDataTypeAccess().getManyLeftSquareBracketRightSquareBracketKeyword_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


