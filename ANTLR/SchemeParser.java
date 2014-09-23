// Generated from Scheme.g by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SchemeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__3=1, T__2=2, T__1=3, T__0=4, WS=5, NUMBER=6, ID=7, CHARACTER=8, NIL=9, 
		BOOLEAN=10;
	public static final String[] tokenNames = {
		"<INVALID>", "''('", "'(lambda'", "'('", "')'", "WS", "NUMBER", "ID", 
		"CHARACTER", "'nil'", "BOOLEAN"
	};
	public static final int
		RULE_program = 0, RULE_expression = 1, RULE_arg = 2, RULE_lambda = 3, 
		RULE_list = 4, RULE_literal = 5;
	public static final String[] ruleNames = {
		"program", "expression", "arg", "lambda", "list", "literal"
	};

	@Override
	public String getGrammarFileName() { return "Scheme.g"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SchemeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SchemeListener ) ((SchemeListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SchemeListener ) ((SchemeListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(12); expression();
				}
				}
				setState(17);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public TerminalNode ID() { return getToken(SchemeParser.ID, 0); }
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SchemeListener ) ((SchemeListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SchemeListener ) ((SchemeListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18); match(T__1);
			setState(19); match(ID);
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__2) | (1L << T__1) | (1L << NUMBER) | (1L << ID) | (1L << CHARACTER) | (1L << NIL) | (1L << BOOLEAN))) != 0)) {
				{
				{
				setState(20); arg();
				}
				}
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(26); match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SchemeParser.ID, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LambdaContext lambda() {
			return getRuleContext(LambdaContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SchemeListener ) ((SchemeListener)listener).enterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SchemeListener ) ((SchemeListener)listener).exitArg(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_arg);
		try {
			setState(33);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(28); lambda();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(29); expression();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 3);
				{
				setState(30); list();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(31); match(ID);
				}
				break;
			case NUMBER:
			case CHARACTER:
			case NIL:
			case BOOLEAN:
				enterOuterAlt(_localctx, 5);
				{
				setState(32); literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(SchemeParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SchemeParser.ID, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LambdaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambda; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SchemeListener ) ((SchemeListener)listener).enterLambda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SchemeListener ) ((SchemeListener)listener).exitLambda(this);
		}
	}

	public final LambdaContext lambda() throws RecognitionException {
		LambdaContext _localctx = new LambdaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_lambda);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35); match(T__2);
			setState(36); match(T__1);
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(37); match(ID);
				}
				}
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(43); match(T__0);
			setState(44); expression();
			setState(45); match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SchemeListener ) ((SchemeListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SchemeListener ) ((SchemeListener)listener).exitList(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47); match(T__3);
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(48); expression();
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(54); match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode CHARACTER() { return getToken(SchemeParser.CHARACTER, 0); }
		public TerminalNode NUMBER() { return getToken(SchemeParser.NUMBER, 0); }
		public TerminalNode BOOLEAN() { return getToken(SchemeParser.BOOLEAN, 0); }
		public TerminalNode NIL() { return getToken(SchemeParser.NIL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SchemeListener ) ((SchemeListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SchemeListener ) ((SchemeListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << CHARACTER) | (1L << NIL) | (1L << BOOLEAN))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\f=\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\7\2\20\n\2\f\2\16\2\23\13\2\3\3"+
		"\3\3\3\3\7\3\30\n\3\f\3\16\3\33\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5\4$"+
		"\n\4\3\5\3\5\3\5\7\5)\n\5\f\5\16\5,\13\5\3\5\3\5\3\5\3\5\3\6\3\6\7\6\64"+
		"\n\6\f\6\16\6\67\13\6\3\6\3\6\3\7\3\7\3\7\2\2\b\2\4\6\b\n\f\2\3\4\2\b"+
		"\b\n\f>\2\21\3\2\2\2\4\24\3\2\2\2\6#\3\2\2\2\b%\3\2\2\2\n\61\3\2\2\2\f"+
		":\3\2\2\2\16\20\5\4\3\2\17\16\3\2\2\2\20\23\3\2\2\2\21\17\3\2\2\2\21\22"+
		"\3\2\2\2\22\3\3\2\2\2\23\21\3\2\2\2\24\25\7\5\2\2\25\31\7\t\2\2\26\30"+
		"\5\6\4\2\27\26\3\2\2\2\30\33\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32\34"+
		"\3\2\2\2\33\31\3\2\2\2\34\35\7\6\2\2\35\5\3\2\2\2\36$\5\b\5\2\37$\5\4"+
		"\3\2 $\5\n\6\2!$\7\t\2\2\"$\5\f\7\2#\36\3\2\2\2#\37\3\2\2\2# \3\2\2\2"+
		"#!\3\2\2\2#\"\3\2\2\2$\7\3\2\2\2%&\7\4\2\2&*\7\5\2\2\')\7\t\2\2(\'\3\2"+
		"\2\2),\3\2\2\2*(\3\2\2\2*+\3\2\2\2+-\3\2\2\2,*\3\2\2\2-.\7\6\2\2./\5\4"+
		"\3\2/\60\7\6\2\2\60\t\3\2\2\2\61\65\7\3\2\2\62\64\5\4\3\2\63\62\3\2\2"+
		"\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\668\3\2\2\2\67\65\3\2\2\2"+
		"89\7\6\2\29\13\3\2\2\2:;\t\2\2\2;\r\3\2\2\2\7\21\31#*\65";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}