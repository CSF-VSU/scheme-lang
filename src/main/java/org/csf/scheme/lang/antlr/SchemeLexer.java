// Generated from src/main/antlr/Scheme.g4 by ANTLR 4.4

    package org.csf.scheme.lang.antlr;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SchemeLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM=1, EXPRESSION=2, LIST=3, LITERAL=4, NUMBER=5, ID=6, BOOLEAN=7, 
		CHAR=8, STRING=9, NIL=10, WS=11, COMMENT=12;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'"
	};
	public static final String[] ruleNames = {
		"PROGRAM", "EXPRESSION", "LIST", "LITERAL", "SIGN", "NUMBER", "ID", "SYMBOL_HEAD", 
		"SYMBOL_REST", "BOOLEAN", "CHAR", "STRING", "NIL", "WS", "COMMENT"
	};


	public SchemeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Scheme.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\16\u0098\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\7\2#\n\2\f"+
		"\2\16\2&\13\2\3\3\3\3\3\3\7\3+\n\3\f\3\16\3.\13\3\3\3\3\3\3\3\3\3\3\3"+
		"\5\3\65\n\3\3\4\3\4\3\4\3\4\7\4;\n\4\f\4\16\4>\13\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\5\5G\n\5\3\6\3\6\3\7\5\7L\n\7\3\7\6\7O\n\7\r\7\16\7P\3\7\3"+
		"\7\6\7U\n\7\r\7\16\7V\5\7Y\n\7\3\7\3\7\5\7]\n\7\3\7\6\7`\n\7\r\7\16\7"+
		"a\5\7d\n\7\3\b\3\b\7\bh\n\b\f\b\16\bk\13\b\3\t\3\t\5\to\n\t\3\n\3\n\5"+
		"\ns\n\n\3\13\3\13\3\13\3\13\5\13y\n\13\3\f\3\f\3\f\3\f\3\r\3\r\7\r\u0081"+
		"\n\r\f\r\16\r\u0084\13\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\7\20\u0092\n\20\f\20\16\20\u0095\13\20\3\20\3\20\3\u0082"+
		"\2\21\3\3\5\4\7\5\t\6\13\2\r\7\17\b\21\2\23\2\25\t\27\n\31\13\33\f\35"+
		"\r\37\16\3\2\b\4\2--//\4\2GGgg\n\2##&&((,,>AC\\aac|\4\2\60\60\62;\7\2"+
		"\13\f\17\17\"\"..^^\4\2\f\f\17\17\u00ab\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3$\3\2\2\2\5\64\3"+
		"\2\2\2\7\66\3\2\2\2\tF\3\2\2\2\13H\3\2\2\2\rK\3\2\2\2\17e\3\2\2\2\21n"+
		"\3\2\2\2\23r\3\2\2\2\25x\3\2\2\2\27z\3\2\2\2\31~\3\2\2\2\33\u0087\3\2"+
		"\2\2\35\u008b\3\2\2\2\37\u008f\3\2\2\2!#\5\5\3\2\"!\3\2\2\2#&\3\2\2\2"+
		"$\"\3\2\2\2$%\3\2\2\2%\4\3\2\2\2&$\3\2\2\2\'(\7*\2\2(,\5\17\b\2)+\5\5"+
		"\3\2*)\3\2\2\2+.\3\2\2\2,*\3\2\2\2,-\3\2\2\2-/\3\2\2\2.,\3\2\2\2/\60\7"+
		"+\2\2\60\65\3\2\2\2\61\65\5\7\4\2\62\65\5\t\5\2\63\65\5\17\b\2\64\'\3"+
		"\2\2\2\64\61\3\2\2\2\64\62\3\2\2\2\64\63\3\2\2\2\65\6\3\2\2\2\66\67\7"+
		")\2\2\678\7*\2\28<\3\2\2\29;\5\5\3\2:9\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3"+
		"\2\2\2=?\3\2\2\2><\3\2\2\2?@\7+\2\2@\b\3\2\2\2AG\5\r\7\2BG\5\33\16\2C"+
		"G\5\25\13\2DG\5\27\f\2EG\5\31\r\2FA\3\2\2\2FB\3\2\2\2FC\3\2\2\2FD\3\2"+
		"\2\2FE\3\2\2\2G\n\3\2\2\2HI\t\2\2\2I\f\3\2\2\2JL\5\13\6\2KJ\3\2\2\2KL"+
		"\3\2\2\2LN\3\2\2\2MO\4\62;\2NM\3\2\2\2OP\3\2\2\2PN\3\2\2\2PQ\3\2\2\2Q"+
		"X\3\2\2\2RT\7\60\2\2SU\4\62;\2TS\3\2\2\2UV\3\2\2\2VT\3\2\2\2VW\3\2\2\2"+
		"WY\3\2\2\2XR\3\2\2\2XY\3\2\2\2Yc\3\2\2\2Z\\\t\3\2\2[]\5\13\6\2\\[\3\2"+
		"\2\2\\]\3\2\2\2]_\3\2\2\2^`\4\62;\2_^\3\2\2\2`a\3\2\2\2a_\3\2\2\2ab\3"+
		"\2\2\2bd\3\2\2\2cZ\3\2\2\2cd\3\2\2\2d\16\3\2\2\2ei\5\21\t\2fh\5\23\n\2"+
		"gf\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2j\20\3\2\2\2ki\3\2\2\2lo\5\13"+
		"\6\2mo\t\4\2\2nl\3\2\2\2nm\3\2\2\2o\22\3\2\2\2ps\5\21\t\2qs\t\5\2\2rp"+
		"\3\2\2\2rq\3\2\2\2s\24\3\2\2\2tu\7%\2\2uy\7v\2\2vw\7%\2\2wy\7h\2\2xt\3"+
		"\2\2\2xv\3\2\2\2y\26\3\2\2\2z{\7)\2\2{|\13\2\2\2|}\7)\2\2}\30\3\2\2\2"+
		"~\u0082\7$\2\2\177\u0081\13\2\2\2\u0080\177\3\2\2\2\u0081\u0084\3\2\2"+
		"\2\u0082\u0083\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0085\3\2\2\2\u0084\u0082"+
		"\3\2\2\2\u0085\u0086\7$\2\2\u0086\32\3\2\2\2\u0087\u0088\7p\2\2\u0088"+
		"\u0089\7k\2\2\u0089\u008a\7n\2\2\u008a\34\3\2\2\2\u008b\u008c\t\6\2\2"+
		"\u008c\u008d\3\2\2\2\u008d\u008e\b\17\2\2\u008e\36\3\2\2\2\u008f\u0093"+
		"\7=\2\2\u0090\u0092\n\7\2\2\u0091\u0090\3\2\2\2\u0092\u0095\3\2\2\2\u0093"+
		"\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0096\3\2\2\2\u0095\u0093\3\2"+
		"\2\2\u0096\u0097\b\20\2\2\u0097 \3\2\2\2\25\2$,\64<FKPVX\\acinrx\u0082"+
		"\u0093\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}