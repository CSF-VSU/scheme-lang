// $ANTLR 3.5.2 src/main/antlr3/Scheme.g 2014-09-29 01:38:09

    package org.csf.scheme.lang;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class SchemeLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int ARGS=4;
	public static final int BODY=5;
	public static final int ID=6;
	public static final int LAMBDA=7;
	public static final int LIST=8;
	public static final int NIL=9;
	public static final int NUMBER=10;
	public static final int WS=11;

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

	// $ANTLR start "T__12"
	public final void mT__12() throws RecognitionException {
		try {
			int _type = T__12;
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
	// $ANTLR end "T__12"

	// $ANTLR start "T__13"
	public final void mT__13() throws RecognitionException {
		try {
			int _type = T__13;
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
	// $ANTLR end "T__13"

	// $ANTLR start "T__14"
	public final void mT__14() throws RecognitionException {
		try {
			int _type = T__14;
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
	// $ANTLR end "T__14"

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
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
	// $ANTLR end "T__15"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/antlr3/Scheme.g:28:4: ( ( ' ' | '\\n' | '\\r' | '\\t' ) )
			// src/main/antlr3/Scheme.g:28:6: ( ' ' | '\\n' | '\\r' | '\\t' )
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

	// $ANTLR start "NUMBER"
	public final void mNUMBER() throws RecognitionException {
		try {
			int _type = NUMBER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/antlr3/Scheme.g:51:8: ( ( '0' .. '9' )+ )
			// src/main/antlr3/Scheme.g:51:10: ( '0' .. '9' )+
			{
			// src/main/antlr3/Scheme.g:51:10: ( '0' .. '9' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
					alt1=1;
				}

				switch (alt1) {
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
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
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
			// src/main/antlr3/Scheme.g:53:4: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// src/main/antlr3/Scheme.g:53:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// src/main/antlr3/Scheme.g:53:32: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
					alt2=1;
				}

				switch (alt2) {
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
					break loop2;
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

	@Override
	public void mTokens() throws RecognitionException {
		// src/main/antlr3/Scheme.g:1:8: ( NIL | T__12 | T__13 | T__14 | T__15 | WS | NUMBER | ID )
		int alt3=8;
		switch ( input.LA(1) ) {
		case 'n':
			{
			int LA3_1 = input.LA(2);
			if ( (LA3_1=='i') ) {
				int LA3_9 = input.LA(3);
				if ( (LA3_9=='l') ) {
					int LA3_11 = input.LA(4);
					if ( ((LA3_11 >= '0' && LA3_11 <= '9')||(LA3_11 >= 'A' && LA3_11 <= 'Z')||LA3_11=='_'||(LA3_11 >= 'a' && LA3_11 <= 'z')) ) {
						alt3=8;
					}

					else {
						alt3=1;
					}

				}

				else {
					alt3=8;
				}

			}

			else {
				alt3=8;
			}

			}
			break;
		case '(':
			{
			alt3=2;
			}
			break;
		case ')':
			{
			alt3=3;
			}
			break;
		case '\'':
			{
			alt3=4;
			}
			break;
		case 'l':
			{
			int LA3_5 = input.LA(2);
			if ( (LA3_5=='a') ) {
				int LA3_10 = input.LA(3);
				if ( (LA3_10=='m') ) {
					int LA3_12 = input.LA(4);
					if ( (LA3_12=='b') ) {
						int LA3_14 = input.LA(5);
						if ( (LA3_14=='d') ) {
							int LA3_15 = input.LA(6);
							if ( (LA3_15=='a') ) {
								int LA3_16 = input.LA(7);
								if ( ((LA3_16 >= '0' && LA3_16 <= '9')||(LA3_16 >= 'A' && LA3_16 <= 'Z')||LA3_16=='_'||(LA3_16 >= 'a' && LA3_16 <= 'z')) ) {
									alt3=8;
								}

								else {
									alt3=5;
								}

							}

							else {
								alt3=8;
							}

						}

						else {
							alt3=8;
						}

					}

					else {
						alt3=8;
					}

				}

				else {
					alt3=8;
				}

			}

			else {
				alt3=8;
			}

			}
			break;
		case '\t':
		case '\n':
		case '\r':
		case ' ':
			{
			alt3=6;
			}
			break;
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
			{
			alt3=7;
			}
			break;
		case 'A':
		case 'B':
		case 'C':
		case 'D':
		case 'E':
		case 'F':
		case 'G':
		case 'H':
		case 'I':
		case 'J':
		case 'K':
		case 'L':
		case 'M':
		case 'N':
		case 'O':
		case 'P':
		case 'Q':
		case 'R':
		case 'S':
		case 'T':
		case 'U':
		case 'V':
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
		case '_':
		case 'a':
		case 'b':
		case 'c':
		case 'd':
		case 'e':
		case 'f':
		case 'g':
		case 'h':
		case 'i':
		case 'j':
		case 'k':
		case 'm':
		case 'o':
		case 'p':
		case 'q':
		case 'r':
		case 's':
		case 't':
		case 'u':
		case 'v':
		case 'w':
		case 'x':
		case 'y':
		case 'z':
			{
			alt3=8;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 3, 0, input);
			throw nvae;
		}
		switch (alt3) {
			case 1 :
				// src/main/antlr3/Scheme.g:1:10: NIL
				{
				mNIL(); 

				}
				break;
			case 2 :
				// src/main/antlr3/Scheme.g:1:14: T__12
				{
				mT__12(); 

				}
				break;
			case 3 :
				// src/main/antlr3/Scheme.g:1:20: T__13
				{
				mT__13(); 

				}
				break;
			case 4 :
				// src/main/antlr3/Scheme.g:1:26: T__14
				{
				mT__14(); 

				}
				break;
			case 5 :
				// src/main/antlr3/Scheme.g:1:32: T__15
				{
				mT__15(); 

				}
				break;
			case 6 :
				// src/main/antlr3/Scheme.g:1:38: WS
				{
				mWS(); 

				}
				break;
			case 7 :
				// src/main/antlr3/Scheme.g:1:41: NUMBER
				{
				mNUMBER(); 

				}
				break;
			case 8 :
				// src/main/antlr3/Scheme.g:1:48: ID
				{
				mID(); 

				}
				break;

		}
	}



}
