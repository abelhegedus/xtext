/*
 * generated by Xtext
 */
package org.eclipse.xtext.example.homeautomation.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.example.homeautomation.services.RuleEngineGrammarAccess;

public class RuleEngineParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private RuleEngineGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.antlr.runtime.TokenSource createLexer(org.antlr.runtime.CharStream stream) {
		return new org.eclipse.xtext.example.homeautomation.parser.antlr.RuleEngineTokenSource(super.createLexer(stream));
	}

	/**
	 * Indentation aware languages do not support partial parsing since the lexer is inherently stateful.
	 * Override and return {@code true} if your terminal splitting is stateless.
	 */
	@Override
	protected boolean isReparseSupported() {
		return false;
	}

	@Override
	protected org.eclipse.xtext.example.homeautomation.parser.antlr.internal.InternalRuleEngineParser createParser(XtextTokenStream stream) {
		return new org.eclipse.xtext.example.homeautomation.parser.antlr.internal.InternalRuleEngineParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}
	
	public RuleEngineGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(RuleEngineGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
