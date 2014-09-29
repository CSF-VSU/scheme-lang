// $ANTLR 3.5.2 src/main/antlr3/Scheme.g 2014-09-29 18:02:59

    package org.csf.scheme.lang;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class SchemeLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int ARGS=4;
	public static final int BODY=5;
	public static final int BOOLEAN=6;
	public static final int CHAR=7;
	public static final int DOUBLE=8;
	public static final int ID=9;
	public static final int INTEGER=10;
	public static final int LAMBDA=11;
	public static final int LIST=12;
	public static final int NIL=13;
	public static final int PROGRAM=14;
	public static final int SIGN=15;
	public static final int STRING=16;
	public static final int WS=17;

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
	@Override public String getGrammarFileName() { return "src/main/antlr3/Scheme.g"; }

	// $ANTLR start "NIL"
	public final void mNIL() throws RecognitionException {
		try {
			int _type = NIL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/antlr3/Scheme.g:6:5: ( 'nil' )
			// src/main/antlr3/Scheme.g:6:7: 'nil'
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

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/antlr3/Scheme.g:7:7: ( '(' )
			// src/main/antlr3/Scheme.g:7:9: '('
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
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/antlr3/Scheme.g:8:7: ( ')' )
			// src/main/antlr3/Scheme.g:8:9: ')'
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
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/antlr3/Scheme.g:9:7: ( '\\'(' )
			// src/main/antlr3/Scheme.g:9:9: '\\'('
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
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/antlr3/Scheme.g:10:7: ( 'lambda' )
			// src/main/antlr3/Scheme.g:10:9: 'lambda'
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
	// $ANTLR end "T__21"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/antlr3/Scheme.g:29:4: ( ( ' ' | '\\n' | '\\r' | '\\t' ) )
			// src/main/antlr3/Scheme.g:29:6: ( ' ' | '\\n' | '\\r' | '\\t' )
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
			int _type = SIGN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/antlr3/Scheme.g:56:6: ( ( '-' | '+' ) )
			// src/main/antlr3/Scheme.g:
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

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SIGN"

	// $ANTLR start "INTEGER"
	public final void mINTEGER() throws RecognitionException {
		try {
			int _type = INTEGER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/antlr3/Scheme.g:58:9: ( ( SIGN )? ( '0' .. '9' )+ )
			// src/main/antlr3/Scheme.g:58:11: ( SIGN )? ( '0' .. '9' )+
			{
			// src/main/antlr3/Scheme.g:58:11: ( SIGN )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='+'||LA1_0=='-') ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// src/main/antlr3/Scheme.g:
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

			// src/main/antlr3/Scheme.g:58:17: ( '0' .. '9' )+
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
					// src/main/antlr3/Scheme.g:
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

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INTEGER"

	// $ANTLR start "DOUBLE"
	public final void mDOUBLE() throws RecognitionException {
		try {
			int _type = DOUBLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/antlr3/Scheme.g:60:8: ( INTEGER ( '.' )? ( '0' .. '9' )+ ( ( 'e' | 'E' ) ( '0' .. '9' )+ )? )
			// src/main/antlr3/Scheme.g:60:10: INTEGER ( '.' )? ( '0' .. '9' )+ ( ( 'e' | 'E' ) ( '0' .. '9' )+ )?
			{
			mINTEGER(); 

			// src/main/antlr3/Scheme.g:60:18: ( '.' )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='.') ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// src/main/antlr3/Scheme.g:60:18: '.'
					{
					match('.'); 
					}
					break;

			}

			// src/main/antlr3/Scheme.g:60:23: ( '0' .. '9' )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// src/main/antlr3/Scheme.g:
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
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
			}

			// src/main/antlr3/Scheme.g:60:35: ( ( 'e' | 'E' ) ( '0' .. '9' )+ )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0=='E'||LA6_0=='e') ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// src/main/antlr3/Scheme.g:60:36: ( 'e' | 'E' ) ( '0' .. '9' )+
					{
					if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					// src/main/antlr3/Scheme.g:60:48: ( '0' .. '9' )+
					int cnt5=0;
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// src/main/antlr3/Scheme.g:
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
							if ( cnt5 >= 1 ) break loop5;
							EarlyExitException eee = new EarlyExitException(5, input);
							throw eee;
						}
						cnt5++;
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
	// $ANTLR end "DOUBLE"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/antlr3/Scheme.g:62:4: ( SIGN | ( ( SIGN )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* ) )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0=='+'||LA9_0=='-') ) {
				int LA9_1 = input.LA(2);
				if ( ((LA9_1 >= 'A' && LA9_1 <= 'Z')||LA9_1=='_'||(LA9_1 >= 'a' && LA9_1 <= 'z')) ) {
					alt9=2;
				}

				else {
					alt9=1;
				}

			}
			else if ( ((LA9_0 >= 'A' && LA9_0 <= 'Z')||LA9_0=='_'||(LA9_0 >= 'a' && LA9_0 <= 'z')) ) {
				alt9=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// src/main/antlr3/Scheme.g:62:6: SIGN
					{
					mSIGN(); 

					}
					break;
				case 2 :
					// src/main/antlr3/Scheme.g:62:13: ( ( SIGN )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
					{
					// src/main/antlr3/Scheme.g:62:13: ( ( SIGN )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
					// src/main/antlr3/Scheme.g:62:14: ( SIGN )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
					{
					// src/main/antlr3/Scheme.g:62:14: ( SIGN )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0=='+'||LA7_0=='-') ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// src/main/antlr3/Scheme.g:
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

					if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					// src/main/antlr3/Scheme.g:62:46: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( ((LA8_0 >= '0' && LA8_0 <= '9')||(LA8_0 >= 'A' && LA8_0 <= 'Z')||LA8_0=='_'||(LA8_0 >= 'a' && LA8_0 <= 'z')) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// src/main/antlr3/Scheme.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
	// $ANTLR end "ID"

	// $ANTLR start "BOOLEAN"
	public final void mBOOLEAN() throws RecognitionException {
		try {
			int _type = BOOLEAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/antlr3/Scheme.g:64:9: ( '#t' | '#f' )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0=='#') ) {
				int LA10_1 = input.LA(2);
				if ( (LA10_1=='t') ) {
					alt10=1;
				}
				else if ( (LA10_1=='f') ) {
					alt10=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 10, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// src/main/antlr3/Scheme.g:64:11: '#t'
					{
					match("#t"); 

					}
					break;
				case 2 :
					// src/main/antlr3/Scheme.g:64:18: '#f'
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
			// src/main/antlr3/Scheme.g:66:6: ( '\\'' . '\\'' )
			// src/main/antlr3/Scheme.g:66:8: '\\'' . '\\''
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
			// src/main/antlr3/Scheme.g:68:8: ( '\\\"' ( . )* '\\\"' )
			// src/main/antlr3/Scheme.g:68:10: '\\\"' ( . )* '\\\"'
			{
			match('\"'); 
			// src/main/antlr3/Scheme.g:68:15: ( . )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0=='\"') ) {
					alt11=2;
				}
				else if ( ((LA11_0 >= '\u0000' && LA11_0 <= '!')||(LA11_0 >= '#' && LA11_0 <= '\uFFFF')) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// src/main/antlr3/Scheme.g:68:15: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop11;
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
		// src/main/antlr3/Scheme.g:1:8: ( NIL | T__18 | T__19 | T__20 | T__21 | WS | SIGN | INTEGER | DOUBLE | ID | BOOLEAN | CHAR | STRING )
		int alt12=13;
		alt12 = dfa12.predict(input);
		switch (alt12) {
			case 1 :
				// src/main/antlr3/Scheme.g:1:10: NIL
				{
				mNIL(); 

				}
				break;
			case 2 :
				// src/main/antlr3/Scheme.g:1:14: T__18
				{
				mT__18(); 

				}
				break;
			case 3 :
				// src/main/antlr3/Scheme.g:1:20: T__19
				{
				mT__19(); 

				}
				break;
			case 4 :
				// src/main/antlr3/Scheme.g:1:26: T__20
				{
				mT__20(); 

				}
				break;
			case 5 :
				// src/main/antlr3/Scheme.g:1:32: T__21
				{
				mT__21(); 

				}
				break;
			case 6 :
				// src/main/antlr3/Scheme.g:1:38: WS
				{
				mWS(); 

				}
				break;
			case 7 :
				// src/main/antlr3/Scheme.g:1:41: SIGN
				{
				mSIGN(); 

				}
				break;
			case 8 :
				// src/main/antlr3/Scheme.g:1:46: INTEGER
				{
				mINTEGER(); 

				}
				break;
			case 9 :
				// src/main/antlr3/Scheme.g:1:54: DOUBLE
				{
				mDOUBLE(); 

				}
				break;
			case 10 :
				// src/main/antlr3/Scheme.g:1:61: ID
				{
				mID(); 

				}
				break;
			case 11 :
				// src/main/antlr3/Scheme.g:1:64: BOOLEAN
				{
				mBOOLEAN(); 

				}
				break;
			case 12 :
				// src/main/antlr3/Scheme.g:1:72: CHAR
				{
				mCHAR(); 

				}
				break;
			case 13 :
				// src/main/antlr3/Scheme.g:1:77: STRING
				{
				mSTRING(); 

				}
				break;

		}
	}


	protected DFA12 dfa12 = new DFA12(this);
	static final String DFA12_eotS =
		"\1\uffff\1\11\3\uffff\1\11\1\uffff\1\20\1\21\3\uffff\1\11\1\25\1\uffff"+
		"\1\11\2\uffff\1\21\1\uffff\1\27\1\uffff\1\11\1\uffff\2\11\1\33\1\uffff";
	static final String DFA12_eofS =
		"\34\uffff";
	static final String DFA12_minS =
		"\1\11\1\151\2\uffff\1\0\1\141\1\uffff\1\60\1\56\3\uffff\1\154\1\47\1\uffff"+
		"\1\155\2\uffff\1\56\1\uffff\1\60\1\uffff\1\142\1\uffff\1\144\1\141\1\60"+
		"\1\uffff";
	static final String DFA12_maxS =
		"\1\172\1\151\2\uffff\1\uffff\1\141\1\uffff\1\172\1\71\3\uffff\1\154\1"+
		"\47\1\uffff\1\155\2\uffff\1\145\1\uffff\1\172\1\uffff\1\142\1\uffff\1"+
		"\144\1\141\1\172\1\uffff";
	static final String DFA12_acceptS =
		"\2\uffff\1\2\1\3\2\uffff\1\6\2\uffff\1\12\1\13\1\15\2\uffff\1\14\1\uffff"+
		"\1\7\1\10\1\uffff\1\11\1\uffff\1\4\1\uffff\1\1\3\uffff\1\5";
	static final String DFA12_specialS =
		"\4\uffff\1\0\27\uffff}>";
	static final String[] DFA12_transitionS = {
			"\2\6\2\uffff\1\6\22\uffff\1\6\1\uffff\1\13\1\12\3\uffff\1\4\1\2\1\3\1"+
			"\uffff\1\7\1\uffff\1\7\2\uffff\12\10\7\uffff\32\11\4\uffff\1\11\1\uffff"+
			"\13\11\1\5\1\11\1\1\14\11",
			"\1\14",
			"",
			"",
			"\50\16\1\15\uffd7\16",
			"\1\17",
			"",
			"\12\10\7\uffff\32\11\4\uffff\1\11\1\uffff\32\11",
			"\1\23\1\uffff\12\22",
			"",
			"",
			"",
			"\1\24",
			"\1\16",
			"",
			"\1\26",
			"",
			"",
			"\1\23\1\uffff\12\22\13\uffff\1\23\37\uffff\1\23",
			"",
			"\12\11\7\uffff\32\11\4\uffff\1\11\1\uffff\32\11",
			"",
			"\1\30",
			"",
			"\1\31",
			"\1\32",
			"\12\11\7\uffff\32\11\4\uffff\1\11\1\uffff\32\11",
			""
	};

	static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
	static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
	static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
	static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
	static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
	static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
	static final short[][] DFA12_transition;

	static {
		int numStates = DFA12_transitionS.length;
		DFA12_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
		}
	}

	protected class DFA12 extends DFA {

		public DFA12(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 12;
			this.eot = DFA12_eot;
			this.eof = DFA12_eof;
			this.min = DFA12_min;
			this.max = DFA12_max;
			this.accept = DFA12_accept;
			this.special = DFA12_special;
			this.transition = DFA12_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( NIL | T__18 | T__19 | T__20 | T__21 | WS | SIGN | INTEGER | DOUBLE | ID | BOOLEAN | CHAR | STRING );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA12_4 = input.LA(1);
						s = -1;
						if ( (LA12_4=='(') ) {s = 13;}
						else if ( ((LA12_4 >= '\u0000' && LA12_4 <= '\'')||(LA12_4 >= ')' && LA12_4 <= '\uFFFF')) ) {s = 14;}
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 12, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
