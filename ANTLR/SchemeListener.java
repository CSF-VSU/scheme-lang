// Generated from Scheme.g by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SchemeParser}.
 */
public interface SchemeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SchemeParser#lambda}.
	 * @param ctx the parse tree
	 */
	void enterLambda(@NotNull SchemeParser.LambdaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SchemeParser#lambda}.
	 * @param ctx the parse tree
	 */
	void exitLambda(@NotNull SchemeParser.LambdaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SchemeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull SchemeParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SchemeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull SchemeParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SchemeParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(@NotNull SchemeParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link SchemeParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(@NotNull SchemeParser.ArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link SchemeParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull SchemeParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SchemeParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull SchemeParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SchemeParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(@NotNull SchemeParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SchemeParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(@NotNull SchemeParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SchemeParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(@NotNull SchemeParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SchemeParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(@NotNull SchemeParser.LiteralContext ctx);
}