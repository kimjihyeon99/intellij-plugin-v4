package org.antlr.intellij.plugin.preview;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.Tree;

/**
 * Fired when a parsing result element (token or matched rule)
 * is selected in one of the viewers. Used to highlight the
 * corresponding area in the input editor.
 */
public interface ParsingResultSelectionListener {

	void onLexerTokenSelected(Token token);

	void onParserRuleSelected(Tree rule);
}
