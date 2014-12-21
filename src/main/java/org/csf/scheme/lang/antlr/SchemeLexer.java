// $ANTLR 3.5.2 src/main/antlr/Scheme.g 2014-12-21 18:15:50

package org.csf.scheme.lang.antlr;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class SchemeLexer extends Lexer {
	public static final int EOF=-1;
	public static final int DIGIT=4;
	public static final int DOT=5;
	public static final int LPAREN=6;
	public static final int NUMBER=7;
	public static final int RPAREN=8;
	public static final int STRING=9;
	public static final int SYMBOL=10;
	public static final int SYMBOL_START=11;
	public static final int WHITESPACE=12;

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

	// $ANTLR start "LPAREN"
	public final void mLPAREN() throws RecognitionException {
		try {
			int _type = LPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/antlr/Scheme.g:9:8: ( '(' )
			// src/main/antlr/Scheme.g:9:10: '('
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
	// $ANTLR end "LPAREN"

	// $ANTLR start "RPAREN"
	public final void mRPAREN() throws RecognitionException {
		try {
			int _type = RPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/antlr/Scheme.g:10:8: ( ')' )
			// src/main/antlr/Scheme.g:10:10: ')'
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
	// $ANTLR end "RPAREN"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/antlr/Scheme.g:35:2: ( '\"' ( '\\\\' . |~ ( '\\\\' | '\"' ) )* '\"' )
			// src/main/antlr/Scheme.g:35:3: '\"' ( '\\\\' . |~ ( '\\\\' | '\"' ) )* '\"'
			{
			match('\"'); 
			// src/main/antlr/Scheme.g:35:7: ( '\\\\' . |~ ( '\\\\' | '\"' ) )*
			loop1:
			while (true) {
				int alt1=3;
				int LA1_0 = input.LA(1);
				if ( (LA1_0=='\\') ) {
					alt1=1;
				}
				else if ( ((LA1_0 >= '\u0000' && LA1_0 <= '!')||(LA1_0 >= '#' && LA1_0 <= '[')||(LA1_0 >= ']' && LA1_0 <= '\uFFFF')) ) {
					alt1=2;
				}

				switch (alt1) {
				case 1 :
					// src/main/antlr/Scheme.g:35:9: '\\\\' .
					{
					match('\\'); 
					matchAny(); 
					}
					break;
				case 2 :
					// src/main/antlr/Scheme.g:35:18: ~ ( '\\\\' | '\"' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
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

	// $ANTLR start "WHITESPACE"
	public final void mWHITESPACE() throws RecognitionException {
		try {
			int _type = WHITESPACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/antlr/Scheme.g:38:2: ( ( ' ' | '\\n' | '\\t' | '\\r' )+ )
			// src/main/antlr/Scheme.g:38:4: ( ' ' | '\\n' | '\\t' | '\\r' )+
			{
			// src/main/antlr/Scheme.g:38:4: ( ' ' | '\\n' | '\\t' | '\\r' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '\t' && LA2_0 <= '\n')||LA2_0=='\r'||LA2_0==' ') ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// src/main/antlr/Scheme.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
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

			skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHITESPACE"

	// $ANTLR start "NUMBER"
	public final void mNUMBER() throws RecognitionException {
		try {
			int _type = NUMBER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/antlr/Scheme.g:42:2: ( ( '+' | '-' )? ( DIGIT )+ ( '.' ( DIGIT )+ )? )
			// src/main/antlr/Scheme.g:42:4: ( '+' | '-' )? ( DIGIT )+ ( '.' ( DIGIT )+ )?
			{
			// src/main/antlr/Scheme.g:42:4: ( '+' | '-' )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='+'||LA3_0=='-') ) {
				alt3=1;
			}
			switch (alt3) {
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

			// src/main/antlr/Scheme.g:42:17: ( DIGIT )+
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
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
			}

			// src/main/antlr/Scheme.g:42:26: ( '.' ( DIGIT )+ )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0=='.') ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// src/main/antlr/Scheme.g:42:27: '.' ( DIGIT )+
					{
					match('.'); 
					// src/main/antlr/Scheme.g:42:31: ( DIGIT )+
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
	// $ANTLR end "NUMBER"

	// $ANTLR start "SYMBOL"
	public final void mSYMBOL() throws RecognitionException {
		try {
			int _type = SYMBOL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/main/antlr/Scheme.g:45:2: ( SYMBOL_START ( SYMBOL_START | DIGIT )* )
			// src/main/antlr/Scheme.g:45:4: SYMBOL_START ( SYMBOL_START | DIGIT )*
			{
			mSYMBOL_START(); 

			// src/main/antlr/Scheme.g:45:17: ( SYMBOL_START | DIGIT )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= '*' && LA7_0 <= '+')||(LA7_0 >= '-' && LA7_0 <= '9')||(LA7_0 >= 'A' && LA7_0 <= 'Z')||(LA7_0 >= 'a' && LA7_0 <= 'z')) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// src/main/antlr/Scheme.g:
					{
					if ( (input.LA(1) >= '*' && input.LA(1) <= '+')||(input.LA(1) >= '-' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
					break loop7;
				}
			}

			if (getText() == ".")  _type = DOT;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SYMBOL"

	// $ANTLR start "SYMBOL_START"
	public final void mSYMBOL_START() throws RecognitionException {
		try {
			// src/main/antlr/Scheme.g:51:2: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | '+' | '-' | '*' | '/' | '.' )
			// src/main/antlr/Scheme.g:
			{
			if ( (input.LA(1) >= '*' && input.LA(1) <= '+')||(input.LA(1) >= '-' && input.LA(1) <= '/')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
	// $ANTLR end "SYMBOL_START"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// src/main/antlr/Scheme.g:57:2: ( ( '0' .. '9' ) )
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

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	@Override
	public void mTokens() throws RecognitionException {
		// src/main/antlr/Scheme.g:1:8: ( LPAREN | RPAREN | STRING | WHITESPACE | NUMBER | SYMBOL )
		int alt8=6;
		alt8 = dfa8.predict(input);
		switch (alt8) {
			case 1 :
				// src/main/antlr/Scheme.g:1:10: LPAREN
				{
				mLPAREN(); 

				}
				break;
			case 2 :
				// src/main/antlr/Scheme.g:1:17: RPAREN
				{
				mRPAREN(); 

				}
				break;
			case 3 :
				// src/main/antlr/Scheme.g:1:24: STRING
				{
				mSTRING(); 

				}
				break;
			case 4 :
				// src/main/antlr/Scheme.g:1:31: WHITESPACE
				{
				mWHITESPACE(); 

				}
				break;
			case 5 :
				// src/main/antlr/Scheme.g:1:42: NUMBER
				{
				mNUMBER(); 

				}
				break;
			case 6 :
				// src/main/antlr/Scheme.g:1:49: SYMBOL
				{
				mSYMBOL(); 

				}
				break;

		}
	}


	protected DFA8 dfa8 = new DFA8(this);
	static final String DFA8_eotS =
		"\5\uffff\1\7\2\uffff\1\6\1\7\1\6";
	static final String DFA8_eofS =
		"\13\uffff";
	static final String DFA8_minS =
		"\1\11\4\uffff\1\60\2\uffff\1\52\1\60\1\52";
	static final String DFA8_maxS =
		"\1\172\4\uffff\1\71\2\uffff\1\172\1\71\1\172";
	static final String DFA8_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\5\1\6\3\uffff";
	static final String DFA8_specialS =
		"\13\uffff}>";
	static final String[] DFA8_transitionS = {
			"\2\4\2\uffff\1\4\22\uffff\1\4\1\uffff\1\3\5\uffff\1\1\1\2\1\7\1\5\1\uffff"+
			"\1\5\2\7\12\6\7\uffff\32\7\6\uffff\32\7",
			"",
			"",
			"",
			"",
			"\12\10",
			"",
			"",
			"\2\7\1\uffff\1\7\1\11\1\7\12\10\7\uffff\32\7\6\uffff\32\7",
			"\12\12",
			"\2\7\1\uffff\3\7\12\12\7\uffff\32\7\6\uffff\32\7"
	};

	static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
	static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
	static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
	static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
	static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
	static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
	static final short[][] DFA8_transition;

	static {
		int numStates = DFA8_transitionS.length;
		DFA8_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
		}
	}

	protected class DFA8 extends DFA {

		public DFA8(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 8;
			this.eot = DFA8_eot;
			this.eof = DFA8_eof;
			this.min = DFA8_min;
			this.max = DFA8_max;
			this.accept = DFA8_accept;
			this.special = DFA8_special;
			this.transition = DFA8_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( LPAREN | RPAREN | STRING | WHITESPACE | NUMBER | SYMBOL );";
		}
	}

}
