// Generated from Scheme.g by ANTLR 4.4
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
		T__3=1, T__2=2, T__1=3, T__0=4, WS=5, NUMBER=6, ID=7, CHARACTER=8, NIL=9, 
		BOOLEAN=10;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'"
	};
	public static final String[] ruleNames = {
		"T__3", "T__2", "T__1", "T__0", "WS", "NUMBER", "ID", "CHARACTER", "NIL", 
		"BOOLEAN"
	};


	public SchemeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Scheme.g"; }

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\f^\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\7\5\7,\n\7\3\7\6\7/\n\7\r\7\16\7\60\3\7\3\7\6\7\65\n\7\r"+
		"\7\16\7\66\5\79\n\7\3\7\3\7\5\7=\n\7\3\7\6\7@\n\7\r\7\16\7A\5\7D\n\7\3"+
		"\b\3\b\7\bH\n\b\f\b\16\bK\13\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13]\n\13\2\2\f\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\3\2\7\7\2\13\f\17\17\"\"..^^\3\2\62;\4\2G"+
		"Ggg\5\2C\\aac|\6\2\62;C\\aac|f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\3\27\3\2\2\2\5\32\3\2\2\2\7\"\3\2\2\2\t$\3\2\2\2\13&\3"+
		"\2\2\2\r+\3\2\2\2\17I\3\2\2\2\21L\3\2\2\2\23O\3\2\2\2\25\\\3\2\2\2\27"+
		"\30\7)\2\2\30\31\7*\2\2\31\4\3\2\2\2\32\33\7*\2\2\33\34\7n\2\2\34\35\7"+
		"c\2\2\35\36\7o\2\2\36\37\7d\2\2\37 \7f\2\2 !\7c\2\2!\6\3\2\2\2\"#\7*\2"+
		"\2#\b\3\2\2\2$%\7+\2\2%\n\3\2\2\2&\'\t\2\2\2\'(\3\2\2\2()\b\6\2\2)\f\3"+
		"\2\2\2*,\7/\2\2+*\3\2\2\2+,\3\2\2\2,.\3\2\2\2-/\t\3\2\2.-\3\2\2\2/\60"+
		"\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\618\3\2\2\2\62\64\7\60\2\2\63\65\t"+
		"\3\2\2\64\63\3\2\2\2\65\66\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\679\3\2"+
		"\2\28\62\3\2\2\289\3\2\2\29C\3\2\2\2:<\t\4\2\2;=\7/\2\2<;\3\2\2\2<=\3"+
		"\2\2\2=?\3\2\2\2>@\t\3\2\2?>\3\2\2\2@A\3\2\2\2A?\3\2\2\2AB\3\2\2\2BD\3"+
		"\2\2\2C:\3\2\2\2CD\3\2\2\2D\16\3\2\2\2EF\t\5\2\2FH\t\6\2\2GE\3\2\2\2H"+
		"K\3\2\2\2IG\3\2\2\2IJ\3\2\2\2J\20\3\2\2\2KI\3\2\2\2LM\7^\2\2MN\13\2\2"+
		"\2N\22\3\2\2\2OP\7p\2\2PQ\7k\2\2QR\7n\2\2R\24\3\2\2\2ST\7v\2\2TU\7t\2"+
		"\2UV\7w\2\2V]\7g\2\2WX\7h\2\2XY\7c\2\2YZ\7n\2\2Z[\7u\2\2[]\7g\2\2\\S\3"+
		"\2\2\2\\W\3\2\2\2]\26\3\2\2\2\f\2+\60\668<ACI\\\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}