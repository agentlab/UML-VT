/*
 * generated by Xtext 2.10.0
 */
package org.eclipse.uml.verification.tl.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.uml.verification.tl.parser.antlr.internal.InternalTemporalLogicParser;
import org.eclipse.uml.verification.tl.services.TemporalLogicGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class TemporalLogicParser extends AbstractAntlrParser {

	@Inject
	private TemporalLogicGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalTemporalLogicParser createParser(XtextTokenStream stream) {
		return new InternalTemporalLogicParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public TemporalLogicGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(TemporalLogicGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
