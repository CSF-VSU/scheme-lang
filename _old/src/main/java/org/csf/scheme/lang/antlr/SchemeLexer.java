// $ANTLR 3.5.2 src/main/antlr3/Scheme.g 2014-10-20 13:52:20

    package org.csf.scheme.lang.antlr;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class SchemeLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int ARGS=4;
	public static final int BODY=5;
	public static final int BOOLEAN=6;
	public static final int CHAR=7;
	public static final int COMMENT=8;
	public static final int ID=9;
	public static final int LAMBDA=10;
	public static final int LIST=11;
	public static final int NIL=12;
	public static final int NUMBER=13;
	public static final int PROGRAM=14;
	public static final int SIGN=15;
	public static final int STRING=16;
	public static final int SYMBOL_HEAD=17;
	public static final int SYMBOL_REST=18;
	public static final int WS=19;

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

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
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
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
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
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
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
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
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
	// $ANTLR end "T__23"

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

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/antlr3/Scheme.g:30:9: ( ( ';' (~ ( '\\r' | '\\n' ) )* ) )
			// src/main/antlr3/Scheme.g:30:11: ( ';' (~ ( '\\r' | '\\n' ) )* )
			{
			// src/main/antlr3/Scheme.g:30:11: ( ';' (~ ( '\\r' | '\\n' ) )* )
			// src/main/antlr3/Scheme.g:30:12: ';' (~ ( '\\r' | '\\n' ) )*
			{
			match(';'); 
			// src/main/antlr3/Scheme.g:30:16: (~ ( '\\r' | '\\n' ) )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '\u0000' && LA1_0 <= '\t')||(LA1_0 >= '\u000B' && LA1_0 <= '\f')||(LA1_0 >= '\u000E' && LA1_0 <= '\uFFFF')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// src/main/antlr3/Scheme.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
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
					break loop1;
				}
			}

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
	// $ANTLR end "COMMENT"

	// $ANTLR start "SIGN"
	public final void mSIGN() throws RecognitionException {
		try {
			// src/main/antlr3/Scheme.g:58:6: ( '+' | '-' )
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
			// src/main/antlr3/Scheme.g:59:8: ( ( SIGN )? ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )? ( ( 'e' | 'E' ) ( SIGN )? ( '0' .. '9' )+ )? )
			// src/main/antlr3/Scheme.g:59:10: ( SIGN )? ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )? ( ( 'e' | 'E' ) ( SIGN )? ( '0' .. '9' )+ )?
			{
			// src/main/antlr3/Scheme.g:59:10: ( SIGN )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='+'||LA2_0=='-') ) {
				alt2=1;
			}
			switch (alt2) {
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

			// src/main/antlr3/Scheme.g:59:16: ( '0' .. '9' )+
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
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			// src/main/antlr3/Scheme.g:59:28: ( '.' ( '0' .. '9' )+ )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0=='.') ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// src/main/antlr3/Scheme.g:59:29: '.' ( '0' .. '9' )+
					{
					match('.'); 
					// src/main/antlr3/Scheme.g:59:33: ( '0' .. '9' )+
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

					}
					break;

			}

			// src/main/antlr3/Scheme.g:59:47: ( ( 'e' | 'E' ) ( SIGN )? ( '0' .. '9' )+ )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0=='E'||LA8_0=='e') ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// src/main/antlr3/Scheme.g:59:48: ( 'e' | 'E' ) ( SIGN )? ( '0' .. '9' )+
					{
					if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					// src/main/antlr3/Scheme.g:59:60: ( SIGN )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0=='+'||LA6_0=='-') ) {
						alt6=1;
					}
					switch (alt6) {
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

					// src/main/antlr3/Scheme.g:59:66: ( '0' .. '9' )+
					int cnt7=0;
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
							alt7=1;
						}

						switch (alt7) {
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
							if ( cnt7 >= 1 ) break loop7;
							EarlyExitException eee = new EarlyExitException(7, input);
							throw eee;
						}
						cnt7++;
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
			// src/main/antlr3/Scheme.g:61:4: ( SYMBOL_HEAD ( SYMBOL_REST )* )
			// src/main/antlr3/Scheme.g:61:6: SYMBOL_HEAD ( SYMBOL_REST )*
			{
			mSYMBOL_HEAD(); 

			// src/main/antlr3/Scheme.g:61:18: ( SYMBOL_REST )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0=='!'||LA9_0=='$'||LA9_0=='&'||(LA9_0 >= '*' && LA9_0 <= '+')||(LA9_0 >= '-' && LA9_0 <= '.')||(LA9_0 >= '0' && LA9_0 <= '9')||(LA9_0 >= '<' && LA9_0 <= '?')||(LA9_0 >= 'A' && LA9_0 <= 'Z')||LA9_0=='_'||(LA9_0 >= 'a' && LA9_0 <= 'z')) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// src/main/antlr3/Scheme.g:
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
					break loop9;
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
			// src/main/antlr3/Scheme.g:66:5: ( SIGN | 'a' .. 'z' | 'A' .. 'Z' | '*' | '!' | '_' | '?' | '>' | '<' | '=' | '$' | '&' )
			// src/main/antlr3/Scheme.g:
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
			// src/main/antlr3/Scheme.g:70:5: ( SYMBOL_HEAD | '0' .. '9' | '.' )
			// src/main/antlr3/Scheme.g:
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
			// src/main/antlr3/Scheme.g:74:9: ( '#t' | '#f' )
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
					// src/main/antlr3/Scheme.g:74:11: '#t'
					{
					match("#t"); 

					}
					break;
				case 2 :
					// src/main/antlr3/Scheme.g:74:18: '#f'
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
			// src/main/antlr3/Scheme.g:76:6: ( '\\'' . '\\'' )
			// src/main/antlr3/Scheme.g:76:8: '\\'' . '\\''
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
			// src/main/antlr3/Scheme.g:78:8: ( '\\\"' ( . )* '\\\"' )
			// src/main/antlr3/Scheme.g:78:10: '\\\"' ( . )* '\\\"'
			{
			match('\"'); 
			// src/main/antlr3/Scheme.g:78:15: ( . )*
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
					// src/main/antlr3/Scheme.g:78:15: .
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
		// src/main/antlr3/Scheme.g:1:8: ( NIL | T__20 | T__21 | T__22 | T__23 | WS | COMMENT | NUMBER | ID | BOOLEAN | CHAR | STRING )
		int alt12=12;
		alt12 = dfa12.predict(input);
		switch (alt12) {
			case 1 :
				// src/main/antlr3/Scheme.g:1:10: NIL
				{
				mNIL(); 

				}
				break;
			case 2 :
				// src/main/antlr3/Scheme.g:1:14: T__20
				{
				mT__20(); 

				}
				break;
			case 3 :
				// src/main/antlr3/Scheme.g:1:20: T__21
				{
				mT__21(); 

				}
				break;
			case 4 :
				// src/main/antlr3/Scheme.g:1:26: T__22
				{
				mT__22(); 

				}
				break;
			case 5 :
				// src/main/antlr3/Scheme.g:1:32: T__23
				{
				mT__23(); 

				}
				break;
			case 6 :
				// src/main/antlr3/Scheme.g:1:38: WS
				{
				mWS(); 

				}
				break;
			case 7 :
				// src/main/antlr3/Scheme.g:1:41: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 8 :
				// src/main/antlr3/Scheme.g:1:49: NUMBER
				{
				mNUMBER(); 

				}
				break;
			case 9 :
				// src/main/antlr3/Scheme.g:1:56: ID
				{
				mID(); 

				}
				break;
			case 10 :
				// src/main/antlr3/Scheme.g:1:59: BOOLEAN
				{
				mBOOLEAN(); 

				}
				break;
			case 11 :
				// src/main/antlr3/Scheme.g:1:67: CHAR
				{
				mCHAR(); 

				}
				break;
			case 12 :
				// src/main/antlr3/Scheme.g:1:72: STRING
				{
				mSTRING(); 

				}
				break;

		}
	}


	protected DFA12 dfa12 = new DFA12(this);
	static final String DFA12_eotS =
		"\1\uffff\1\12\3\uffff\1\12\2\uffff\1\12\4\uffff\1\12\1\23\1\uffff\1\12"+
		"\1\11\1\27\1\uffff\3\12\1\uffff\1\12\1\11\1\12\1\11\1\12\1\36\1\uffff";
	static final String DFA12_eofS =
		"\37\uffff";
	static final String DFA12_minS =
		"\1\11\1\151\2\uffff\1\0\1\141\2\uffff\1\60\4\uffff\1\154\1\47\1\uffff"+
		"\1\155\2\41\1\uffff\1\142\1\60\1\53\1\uffff\1\144\1\41\1\60\1\41\1\141"+
		"\1\41\1\uffff";
	static final String DFA12_maxS =
		"\1\172\1\151\2\uffff\1\uffff\1\141\2\uffff\1\71\4\uffff\1\154\1\47\1\uffff"+
		"\1\155\2\172\1\uffff\1\142\2\71\1\uffff\1\144\1\172\1\71\1\172\1\141\1"+
		"\172\1\uffff";
	static final String DFA12_acceptS =
		"\2\uffff\1\2\1\3\2\uffff\1\6\1\7\1\uffff\1\10\1\11\1\12\1\14\2\uffff\1"+
		"\13\3\uffff\1\4\3\uffff\1\1\6\uffff\1\5";
	static final String DFA12_specialS =
		"\4\uffff\1\0\32\uffff}>";
	static final String[] DFA12_transitionS = {
			"\2\6\2\uffff\1\6\22\uffff\1\6\1\12\1\14\1\13\1\12\1\uffff\1\12\1\4\1"+
			"\2\1\3\1\12\1\10\1\uffff\1\10\2\uffff\12\11\1\uffff\1\7\4\12\1\uffff"+
			"\32\12\4\uffff\1\12\1\uffff\13\12\1\5\1\12\1\1\14\12",
			"\1\15",
			"",
			"",
			"\50\17\1\16\uffd7\17",
			"\1\20",
			"",
			"",
			"\12\21",
			"",
			"",
			"",
			"",
			"\1\22",
			"\1\17",
			"",
			"\1\24",
			"\1\12\2\uffff\1\12\1\uffff\1\12\3\uffff\2\12\1\uffff\1\12\1\25\1\uffff"+
			"\12\21\2\uffff\4\12\1\uffff\4\12\1\26\25\12\4\uffff\1\12\1\uffff\4\12"+
			"\1\26\25\12",
			"\1\12\2\uffff\1\12\1\uffff\1\12\3\uffff\2\12\1\uffff\2\12\1\uffff\12"+
			"\12\2\uffff\4\12\1\uffff\32\12\4\uffff\1\12\1\uffff\32\12",
			"",
			"\1\30",
			"\12\31",
			"\1\32\1\uffff\1\32\2\uffff\12\33",
			"",
			"\1\34",
			"\1\12\2\uffff\1\12\1\uffff\1\12\3\uffff\2\12\1\uffff\2\12\1\uffff\12"+
			"\31\2\uffff\4\12\1\uffff\4\12\1\26\25\12\4\uffff\1\12\1\uffff\4\12\1"+
			"\26\25\12",
			"\12\33",
			"\1\12\2\uffff\1\12\1\uffff\1\12\3\uffff\2\12\1\uffff\2\12\1\uffff\12"+
			"\33\2\uffff\4\12\1\uffff\32\12\4\uffff\1\12\1\uffff\32\12",
			"\1\35",
			"\1\12\2\uffff\1\12\1\uffff\1\12\3\uffff\2\12\1\uffff\2\12\1\uffff\12"+
			"\12\2\uffff\4\12\1\uffff\32\12\4\uffff\1\12\1\uffff\32\12",
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
			return "1:1: Tokens : ( NIL | T__20 | T__21 | T__22 | T__23 | WS | COMMENT | NUMBER | ID | BOOLEAN | CHAR | STRING );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA12_4 = input.LA(1);
						s = -1;
						if ( (LA12_4=='(') ) {s = 14;}
						else if ( ((LA12_4 >= '\u0000' && LA12_4 <= '\'')||(LA12_4 >= ')' && LA12_4 <= '\uFFFF')) ) {s = 15;}
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
