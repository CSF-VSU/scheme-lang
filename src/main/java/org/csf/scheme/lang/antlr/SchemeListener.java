// Generated from src/main/antlr/Scheme.g4 by ANTLR 4.4

    package org.csf.scheme.lang.antlr;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SchemeParser}.
 */
public interface SchemeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SchemeParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(@NotNull SchemeParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link SchemeParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(@NotNull SchemeParser.FileContext ctx);
}