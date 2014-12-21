// $ANTLR 3.5.2 src/main/antlr/Scheme.g 2014-12-21 18:15:50
package org.csf.scheme.lang.antlr;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class SchemeParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "DIGIT", "DOT", "LPAREN", "NUMBER", 
		"RPAREN", "STRING", "SYMBOL", "SYMBOL_START", "WHITESPACE"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public SchemeParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public SchemeParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return SchemeParser.tokenNames; }
	@Override public String getGrammarFileName() { return "src/main/antlr/Scheme.g"; }


	public static class sexpr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "sexpr"
	// src/main/antlr/Scheme.g:19:1: sexpr : ( item )* EOF ;
	public final SchemeParser.sexpr_return sexpr() throws RecognitionException {
		SchemeParser.sexpr_return retval = new SchemeParser.sexpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token EOF2=null;
		ParserRuleReturnScope item1 =null;

		CommonTree EOF2_tree=null;

		try {
			// src/main/antlr/Scheme.g:20:2: ( ( item )* EOF )
			// src/main/antlr/Scheme.g:20:4: ( item )* EOF
			{
			root_0 = (CommonTree)adaptor.nil();


			// src/main/antlr/Scheme.g:20:4: ( item )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= DOT && LA1_0 <= NUMBER)||(LA1_0 >= STRING && LA1_0 <= SYMBOL)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// src/main/antlr/Scheme.g:20:4: item
					{
					pushFollow(FOLLOW_item_in_sexpr70);
					item1=item();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, item1.getTree());

					}
					break;

				default :
					break loop1;
				}
			}

			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_sexpr73); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			EOF2_tree = (CommonTree)adaptor.create(EOF2);
			adaptor.addChild(root_0, EOF2_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "sexpr"


	public static class item_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "item"
	// src/main/antlr/Scheme.g:22:1: item : ( atom | ( list )=> list | LPAREN item DOT item RPAREN );
	public final SchemeParser.item_return item() throws RecognitionException {
		SchemeParser.item_return retval = new SchemeParser.item_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token LPAREN5=null;
		Token DOT7=null;
		Token RPAREN9=null;
		ParserRuleReturnScope atom3 =null;
		ParserRuleReturnScope list4 =null;
		ParserRuleReturnScope item6 =null;
		ParserRuleReturnScope item8 =null;

		CommonTree LPAREN5_tree=null;
		CommonTree DOT7_tree=null;
		CommonTree RPAREN9_tree=null;

		try {
			// src/main/antlr/Scheme.g:23:2: ( atom | ( list )=> list | LPAREN item DOT item RPAREN )
			int alt2=3;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==DOT||LA2_0==NUMBER||(LA2_0 >= STRING && LA2_0 <= SYMBOL)) ) {
				alt2=1;
			}
			else if ( (LA2_0==LPAREN) ) {
				int LA2_2 = input.LA(2);
				if ( (synpred1_Scheme()) ) {
					alt2=2;
				}
				else if ( (true) ) {
					alt2=3;
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// src/main/antlr/Scheme.g:23:4: atom
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_atom_in_item83);
					atom3=atom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, atom3.getTree());

					}
					break;
				case 2 :
					// src/main/antlr/Scheme.g:24:4: ( list )=> list
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_list_in_item94);
					list4=list();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, list4.getTree());

					}
					break;
				case 3 :
					// src/main/antlr/Scheme.g:25:4: LPAREN item DOT item RPAREN
					{
					root_0 = (CommonTree)adaptor.nil();


					LPAREN5=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_item99); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LPAREN5_tree = (CommonTree)adaptor.create(LPAREN5);
					adaptor.addChild(root_0, LPAREN5_tree);
					}

					pushFollow(FOLLOW_item_in_item101);
					item6=item();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, item6.getTree());

					DOT7=(Token)match(input,DOT,FOLLOW_DOT_in_item103); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					DOT7_tree = (CommonTree)adaptor.create(DOT7);
					adaptor.addChild(root_0, DOT7_tree);
					}

					pushFollow(FOLLOW_item_in_item105);
					item8=item();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, item8.getTree());

					RPAREN9=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_item107); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					RPAREN9_tree = (CommonTree)adaptor.create(RPAREN9);
					adaptor.addChild(root_0, RPAREN9_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "item"


	public static class list_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "list"
	// src/main/antlr/Scheme.g:27:1: list : LPAREN ( item )* RPAREN ;
	public final SchemeParser.list_return list() throws RecognitionException {
		SchemeParser.list_return retval = new SchemeParser.list_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token LPAREN10=null;
		Token RPAREN12=null;
		ParserRuleReturnScope item11 =null;

		CommonTree LPAREN10_tree=null;
		CommonTree RPAREN12_tree=null;

		try {
			// src/main/antlr/Scheme.g:28:2: ( LPAREN ( item )* RPAREN )
			// src/main/antlr/Scheme.g:28:4: LPAREN ( item )* RPAREN
			{
			root_0 = (CommonTree)adaptor.nil();


			LPAREN10=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_list117); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LPAREN10_tree = (CommonTree)adaptor.create(LPAREN10);
			adaptor.addChild(root_0, LPAREN10_tree);
			}

			// src/main/antlr/Scheme.g:28:11: ( item )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= DOT && LA3_0 <= NUMBER)||(LA3_0 >= STRING && LA3_0 <= SYMBOL)) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// src/main/antlr/Scheme.g:28:11: item
					{
					pushFollow(FOLLOW_item_in_list119);
					item11=item();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, item11.getTree());

					}
					break;

				default :
					break loop3;
				}
			}

			RPAREN12=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_list122); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			RPAREN12_tree = (CommonTree)adaptor.create(RPAREN12);
			adaptor.addChild(root_0, RPAREN12_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "list"


	public static class atom_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "atom"
	// src/main/antlr/Scheme.g:30:1: atom : ( STRING | SYMBOL | NUMBER | DOT );
	public final SchemeParser.atom_return atom() throws RecognitionException {
		SchemeParser.atom_return retval = new SchemeParser.atom_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set13=null;

		CommonTree set13_tree=null;

		try {
			// src/main/antlr/Scheme.g:31:2: ( STRING | SYMBOL | NUMBER | DOT )
			// src/main/antlr/Scheme.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set13=input.LT(1);
			if ( input.LA(1)==DOT||input.LA(1)==NUMBER||(input.LA(1) >= STRING && input.LA(1) <= SYMBOL) ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set13));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "atom"

	// $ANTLR start synpred1_Scheme
	public final void synpred1_Scheme_fragment() throws RecognitionException {
		// src/main/antlr/Scheme.g:24:4: ( list )
		// src/main/antlr/Scheme.g:24:5: list
		{
		pushFollow(FOLLOW_list_in_synpred1_Scheme89);
		list();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred1_Scheme

	// Delegated rules

	public final boolean synpred1_Scheme() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred1_Scheme_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_item_in_sexpr70 = new BitSet(new long[]{0x00000000000006E0L});
	public static final BitSet FOLLOW_EOF_in_sexpr73 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_in_item83 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_list_in_item94 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_item99 = new BitSet(new long[]{0x00000000000006E0L});
	public static final BitSet FOLLOW_item_in_item101 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_DOT_in_item103 = new BitSet(new long[]{0x00000000000006E0L});
	public static final BitSet FOLLOW_item_in_item105 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_RPAREN_in_item107 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_list117 = new BitSet(new long[]{0x00000000000007E0L});
	public static final BitSet FOLLOW_item_in_list119 = new BitSet(new long[]{0x00000000000007E0L});
	public static final BitSet FOLLOW_RPAREN_in_list122 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_list_in_synpred1_Scheme89 = new BitSet(new long[]{0x0000000000000002L});
}
