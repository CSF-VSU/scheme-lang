// $ANTLR 3.5.2 src/main/antlr/Scheme.g 2015-01-04 15:42:54

    package org.csf.scheme.lang.antlr;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class SchemeLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int ARGS=4;
	public static final int BODY=5;
	public static final int BOOLEAN=6;
	public static final int CHAR=7;
	public static final int ID=8;
	public static final int LAMBDA=9;
	public static final int LIST=10;
	public static final int NIL=11;
	public static final int NUMBER=12;
	public static final int PROGRAM=13;
	public static final int SIGN=14;
	public static final int STRING=15;
	public static final int SYMBOL_HEAD=16;
	public static final int SYMBOL_REST=17;
	public static final int WS=18;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public SchemeLexer() {} 
	public SchemeLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public SchemeLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "src/main/antlr/Scheme.g"; }

	// $ANTLR start "NIL"
	public final void mNIL() throws RecognitionException {
		try {
			int _type = NIL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/antlr/Scheme.g:6:5: ( 'nil' )
			// src/main/antlr/Scheme.g:6:7: 'nil'
			{
			match("nil"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NIL"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/antlr/Scheme.g:7:7: ( '(' )
			// src/main/antlr/Scheme.g:7:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/antlr/Scheme.g:8:7: ( ')' )
			// src/main/antlr/Scheme.g:8:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/antlr/Scheme.g:9:7: ( '\\'(' )
			// src/main/antlr/Scheme.g:9:9: '\\'('
			{
			match("'("); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/antlr/Scheme.g:10:7: ( 'lambda' )
			// src/main/antlr/Scheme.g:10:9: 'lambda'
			{
			match("lambda"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__22"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/antlr/Scheme.g:29:4: ( ( ' ' | '\\n' | '\\r' | '\\t' ) )
			// src/main/antlr/Scheme.g:29:6: ( ' ' | '\\n' | '\\r' | '\\t' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "SIGN"
	public final void mSIGN() throws RecognitionException {
		try {
			// src/main/antlr/Scheme.g:57:6: ( '+' | '-' )
			// src/main/antlr/Scheme.g:
			{
			if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SIGN"

	// $ANTLR start "NUMBER"
	public final void mNUMBER() throws RecognitionException {
		try {
			int _type = NUMBER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/antlr/Scheme.g:58:8: ( ( SIGN )? ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )? ( ( 'e' | 'E' ) ( SIGN )? ( '0' .. '9' )+ )? )
			// src/main/antlr/Scheme.g:58:10: ( SIGN )? ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )? ( ( 'e' | 'E' ) ( SIGN )? ( '0' .. '9' )+ )?
			{
			// src/main/antlr/Scheme.g:58:10: ( SIGN )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='+'||LA1_0=='-') ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// src/main/antlr/Scheme.g:
					{
					if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			// src/main/antlr/Scheme.g:58:16: ( '0' .. '9' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// src/main/antlr/Scheme.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			// src/main/antlr/Scheme.g:58:28: ( '.' ( '0' .. '9' )+ )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='.') ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// src/main/antlr/Scheme.g:58:29: '.' ( '0' .. '9' )+
					{
					match('.'); 
					// src/main/antlr/Scheme.g:58:33: ( '0' .. '9' )+
					int cnt3=0;
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// src/main/antlr/Scheme.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt3 >= 1 ) break loop3;
							EarlyExitException eee = new EarlyExitException(3, input);
							throw eee;
						}
						cnt3++;
					}

					}
					break;

			}

			// src/main/antlr/Scheme.g:58:47: ( ( 'e' | 'E' ) ( SIGN )? ( '0' .. '9' )+ )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0=='E'||LA7_0=='e') ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// src/main/antlr/Scheme.g:58:48: ( 'e' | 'E' ) ( SIGN )? ( '0' .. '9' )+
					{
					if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					// src/main/antlr/Scheme.g:58:60: ( SIGN )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0=='+'||LA5_0=='-') ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// src/main/antlr/Scheme.g:
							{
							if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					// src/main/antlr/Scheme.g:58:66: ( '0' .. '9' )+
					int cnt6=0;
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// src/main/antlr/Scheme.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt6 >= 1 ) break loop6;
							EarlyExitException eee = new EarlyExitException(6, input);
							throw eee;
						}
						cnt6++;
					}

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUMBER"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/antlr/Scheme.g:60:4: ( SYMBOL_HEAD ( SYMBOL_REST )* )
			// src/main/antlr/Scheme.g:60:6: SYMBOL_HEAD ( SYMBOL_REST )*
			{
			mSYMBOL_HEAD(); 

			// src/main/antlr/Scheme.g:60:18: ( SYMBOL_REST )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0=='!'||LA8_0=='$'||LA8_0=='&'||(LA8_0 >= '*' && LA8_0 <= '+')||(LA8_0 >= '-' && LA8_0 <= '.')||(LA8_0 >= '0' && LA8_0 <= '9')||(LA8_0 >= '<' && LA8_0 <= '?')||(LA8_0 >= 'A' && LA8_0 <= 'Z')||LA8_0=='_'||(LA8_0 >= 'a' && LA8_0 <= 'z')) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// src/main/antlr/Scheme.g:
					{
					if ( input.LA(1)=='!'||input.LA(1)=='$'||input.LA(1)=='&'||(input.LA(1) >= '*' && input.LA(1) <= '+')||(input.LA(1) >= '-' && input.LA(1) <= '.')||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= '<' && input.LA(1) <= '?')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop8;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "SYMBOL_HEAD"
	public final void mSYMBOL_HEAD() throws RecognitionException {
		try {
			// src/main/antlr/Scheme.g:65:5: ( SIGN | 'a' .. 'z' | 'A' .. 'Z' | '*' | '!' | '_' | '?' | '>' | '<' | '=' | '$' | '&' )
			// src/main/antlr/Scheme.g:
			{
			if ( input.LA(1)=='!'||input.LA(1)=='$'||input.LA(1)=='&'||(input.LA(1) >= '*' && input.LA(1) <= '+')||input.LA(1)=='-'||(input.LA(1) >= '<' && input.LA(1) <= '?')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SYMBOL_HEAD"

	// $ANTLR start "SYMBOL_REST"
	public final void mSYMBOL_REST() throws RecognitionException {
		try {
			// src/main/antlr/Scheme.g:69:5: ( SYMBOL_HEAD | '0' .. '9' | '.' )
			// src/main/antlr/Scheme.g:
			{
			if ( input.LA(1)=='!'||input.LA(1)=='$'||input.LA(1)=='&'||(input.LA(1) >= '*' && input.LA(1) <= '+')||(input.LA(1) >= '-' && input.LA(1) <= '.')||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= '<' && input.LA(1) <= '?')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SYMBOL_REST"

	// $ANTLR start "BOOLEAN"
	public final void mBOOLEAN() throws RecognitionException {
		try {
			int _type = BOOLEAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/antlr/Scheme.g:73:9: ( '#t' | '#f' )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0=='#') ) {
				int LA9_1 = input.LA(2);
				if ( (LA9_1=='t') ) {
					alt9=1;
				}
				else if ( (LA9_1=='f') ) {
					alt9=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 9, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// src/main/antlr/Scheme.g:73:11: '#t'
					{
					match("#t"); 

					}
					break;
				case 2 :
					// src/main/antlr/Scheme.g:73:18: '#f'
					{
					match("#f"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BOOLEAN"

	// $ANTLR start "CHAR"
	public final void mCHAR() throws RecognitionException {
		try {
			int _type = CHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/antlr/Scheme.g:75:6: ( '\\'' . '\\'' )
			// src/main/antlr/Scheme.g:75:8: '\\'' . '\\''
			{
			match('\''); 
			matchAny(); 
			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/antlr/Scheme.g:77:8: ( '\\\"' ( . )* '\\\"' )
			// src/main/antlr/Scheme.g:77:10: '\\\"' ( . )* '\\\"'
			{
			match('\"'); 
			// src/main/antlr/Scheme.g:77:15: ( . )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0=='\"') ) {
					alt10=2;
				}
				else if ( ((LA10_0 >= '\u0000' && LA10_0 <= '!')||(LA10_0 >= '#' && LA10_0 <= '\uFFFF')) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// src/main/antlr/Scheme.g:77:15: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop10;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	@Override
	public void mTokens() throws RecognitionException {
		// src/main/antlr/Scheme.g:1:8: ( NIL | T__19 | T__20 | T__21 | T__22 | WS | NUMBER | ID | BOOLEAN | CHAR | STRING )
		int alt11=11;
		alt11 = dfa11.predict(input);
		switch (alt11) {
			case 1 :
				// src/main/antlr/Scheme.g:1:10: NIL
				{
				mNIL(); 

				}
				break;
			case 2 :
				// src/main/antlr/Scheme.g:1:14: T__19
				{
				mT__19(); 

				}
				break;
			case 3 :
				// src/main/antlr/Scheme.g:1:20: T__20
				{
				mT__20(); 

				}
				break;
			case 4 :
				// src/main/antlr/Scheme.g:1:26: T__21
				{
				mT__21(); 

				}
				break;
			case 5 :
				// src/main/antlr/Scheme.g:1:32: T__22
				{
				mT__22(); 

				}
				break;
			case 6 :
				// src/main/antlr/Scheme.g:1:38: WS
				{
				mWS(); 

				}
				break;
			case 7 :
				// src/main/antlr/Scheme.g:1:41: NUMBER
				{
				mNUMBER(); 

				}
				break;
			case 8 :
				// src/main/antlr/Scheme.g:1:48: ID
				{
				mID(); 

				}
				break;
			case 9 :
				// src/main/antlr/Scheme.g:1:51: BOOLEAN
				{
				mBOOLEAN(); 

				}
				break;
			case 10 :
				// src/main/antlr/Scheme.g:1:59: CHAR
				{
				mCHAR(); 

				}
				break;
			case 11 :
				// src/main/antlr/Scheme.g:1:64: STRING
				{
				mSTRING(); 

				}
				break;

		}
	}


	protected DFA11 dfa11 = new DFA11(this);
	static final String DFA11_eotS =
		"\1\uffff\1\11\3\uffff\1\11\1\uffff\1\11\4\uffff\1\11\1\22\1\uffff\1\11"+
		"\1\10\1\26\1\uffff\3\11\1\uffff\1\11\1\10\1\11\1\10\1\11\1\35\1\uffff";
	static final String DFA11_eofS =
		"\36\uffff";
	static final String DFA11_minS =
		"\1\11\1\151\2\uffff\1\0\1\141\1\uffff\1\60\4\uffff\1\154\1\47\1\uffff"+
		"\1\155\2\41\1\uffff\1\142\1\60\1\53\1\uffff\1\144\1\41\1\60\1\41\1\141"+
		"\1\41\1\uffff";
	static final String DFA11_maxS =
		"\1\172\1\151\2\uffff\1\uffff\1\141\1\uffff\1\71\4\uffff\1\154\1\47\1\uffff"+
		"\1\155\2\172\1\uffff\1\142\2\71\1\uffff\1\144\1\172\1\71\1\172\1\141\1"+
		"\172\1\uffff";
	static final String DFA11_acceptS =
		"\2\uffff\1\2\1\3\2\uffff\1\6\1\uffff\1\7\1\10\1\11\1\13\2\uffff\1\12\3"+
		"\uffff\1\4\3\uffff\1\1\6\uffff\1\5";
	static final String DFA11_specialS =
		"\4\uffff\1\0\31\uffff}>";
	static final String[] DFA11_transitionS = {
			"\2\6\2\uffff\1\6\22\uffff\1\6\1\11\1\13\1\12\1\11\1\uffff\1\11\1\4\1"+
			"\2\1\3\1\11\1\7\1\uffff\1\7\2\uffff\12\10\2\uffff\4\11\1\uffff\32\11"+
			"\4\uffff\1\11\1\uffff\13\11\1\5\1\11\1\1\14\11",
			"\1\14",
			"",
			"",
			"\50\16\1\15\uffd7\16",
			"\1\17",
			"",
			"\12\20",
			"",
			"",
			"",
			"",
			"\1\21",
			"\1\16",
			"",
			"\1\23",
			"\1\11\2\uffff\1\11\1\uffff\1\11\3\uffff\2\11\1\uffff\1\11\1\24\1\uffff"+
			"\12\20\2\uffff\4\11\1\uffff\4\11\1\25\25\11\4\uffff\1\11\1\uffff\4\11"+
			"\1\25\25\11",
			"\1\11\2\uffff\1\11\1\uffff\1\11\3\uffff\2\11\1\uffff\2\11\1\uffff\12"+
			"\11\2\uffff\4\11\1\uffff\32\11\4\uffff\1\11\1\uffff\32\11",
			"",
			"\1\27",
			"\12\30",
			"\1\31\1\uffff\1\31\2\uffff\12\32",
			"",
			"\1\33",
			"\1\11\2\uffff\1\11\1\uffff\1\11\3\uffff\2\11\1\uffff\2\11\1\uffff\12"+
			"\30\2\uffff\4\11\1\uffff\4\11\1\25\25\11\4\uffff\1\11\1\uffff\4\11\1"+
			"\25\25\11",
			"\12\32",
			"\1\11\2\uffff\1\11\1\uffff\1\11\3\uffff\2\11\1\uffff\2\11\1\uffff\12"+
			"\32\2\uffff\4\11\1\uffff\32\11\4\uffff\1\11\1\uffff\32\11",
			"\1\34",
			"\1\11\2\uffff\1\11\1\uffff\1\11\3\uffff\2\11\1\uffff\2\11\1\uffff\12"+
			"\11\2\uffff\4\11\1\uffff\32\11\4\uffff\1\11\1\uffff\32\11",
			""
	};

	static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
	static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
	static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
	static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
	static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
	static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
	static final short[][] DFA11_transition;

	static {
		int numStates = DFA11_transitionS.length;
		DFA11_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
		}
	}

	protected class DFA11 extends DFA {

		public DFA11(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 11;
			this.eot = DFA11_eot;
			this.eof = DFA11_eof;
			this.min = DFA11_min;
			this.max = DFA11_max;
			this.accept = DFA11_accept;
			this.special = DFA11_special;
			this.transition = DFA11_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( NIL | T__19 | T__20 | T__21 | T__22 | WS | NUMBER | ID | BOOLEAN | CHAR | STRING );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA11_4 = input.LA(1);
						s = -1;
						if ( (LA11_4=='(') ) {s = 13;}
						else if ( ((LA11_4 >= '\u0000' && LA11_4 <= '\'')||(LA11_4 >= ')' && LA11_4 <= '\uFFFF')) ) {s = 14;}
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 11, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
