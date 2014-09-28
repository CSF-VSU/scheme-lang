// $ANTLR 3.5.2 src/main/antlr3/Scheme.g 2014-09-29 01:38:08

    package org.csf.scheme.lang;


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
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARGS", "BODY", "ID", "LAMBDA", 
		"LIST", "NIL", "NUMBER", "WS", "'('", "')'", "'\\'('", "'lambda'"
	};
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
	@Override public String getGrammarFileName() { return "src/main/antlr3/Scheme.g"; }


	public static class program_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "program"
	// src/main/antlr3/Scheme.g:30:1: program : ( expression )* ;
	public final SchemeParser.program_return program() throws RecognitionException {
		SchemeParser.program_return retval = new SchemeParser.program_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expression1 =null;


		try {
			// src/main/antlr3/Scheme.g:30:9: ( ( expression )* )
			// src/main/antlr3/Scheme.g:30:11: ( expression )*
			{
			root_0 = (Object)adaptor.nil();


			// src/main/antlr3/Scheme.g:30:11: ( expression )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==12) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// src/main/antlr3/Scheme.g:30:12: expression
					{
					pushFollow(FOLLOW_expression_in_program102);
					expression1=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression1.getTree());

					}
					break;

				default :
					break loop1;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "program"


	public static class expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// src/main/antlr3/Scheme.g:32:1: expression : '(' ! ID ^ ( arg )* ')' !;
	public final SchemeParser.expression_return expression() throws RecognitionException {
		SchemeParser.expression_return retval = new SchemeParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal2=null;
		Token ID3=null;
		Token char_literal5=null;
		ParserRuleReturnScope arg4 =null;

		Object char_literal2_tree=null;
		Object ID3_tree=null;
		Object char_literal5_tree=null;

		try {
			// src/main/antlr3/Scheme.g:32:12: ( '(' ! ID ^ ( arg )* ')' !)
			// src/main/antlr3/Scheme.g:32:14: '(' ! ID ^ ( arg )* ')' !
			{
			root_0 = (Object)adaptor.nil();


			char_literal2=(Token)match(input,12,FOLLOW_12_in_expression113); if (state.failed) return retval;
			ID3=(Token)match(input,ID,FOLLOW_ID_in_expression116); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			ID3_tree = (Object)adaptor.create(ID3);
			root_0 = (Object)adaptor.becomeRoot(ID3_tree, root_0);
			}

			// src/main/antlr3/Scheme.g:32:23: ( arg )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==ID||(LA2_0 >= NIL && LA2_0 <= NUMBER)||LA2_0==12||LA2_0==14) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// src/main/antlr3/Scheme.g:32:24: arg
					{
					pushFollow(FOLLOW_arg_in_expression120);
					arg4=arg();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arg4.getTree());

					}
					break;

				default :
					break loop2;
				}
			}

			char_literal5=(Token)match(input,13,FOLLOW_13_in_expression124); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expression"


	public static class arg_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "arg"
	// src/main/antlr3/Scheme.g:34:1: arg : ( lambda | expression | list | ID | literal );
	public final SchemeParser.arg_return arg() throws RecognitionException {
		SchemeParser.arg_return retval = new SchemeParser.arg_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID9=null;
		ParserRuleReturnScope lambda6 =null;
		ParserRuleReturnScope expression7 =null;
		ParserRuleReturnScope list8 =null;
		ParserRuleReturnScope literal10 =null;

		Object ID9_tree=null;

		try {
			// src/main/antlr3/Scheme.g:35:3: ( lambda | expression | list | ID | literal )
			int alt3=5;
			switch ( input.LA(1) ) {
			case 12:
				{
				int LA3_1 = input.LA(2);
				if ( (LA3_1==15) ) {
					alt3=1;
				}
				else if ( (LA3_1==ID) ) {
					alt3=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 3, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 14:
				{
				alt3=3;
				}
				break;
			case ID:
				{
				alt3=4;
				}
				break;
			case NIL:
			case NUMBER:
				{
				alt3=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// src/main/antlr3/Scheme.g:35:5: lambda
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_lambda_in_arg136);
					lambda6=lambda();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, lambda6.getTree());

					}
					break;
				case 2 :
					// src/main/antlr3/Scheme.g:36:5: expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_expression_in_arg142);
					expression7=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression7.getTree());

					}
					break;
				case 3 :
					// src/main/antlr3/Scheme.g:37:5: list
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_list_in_arg148);
					list8=list();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, list8.getTree());

					}
					break;
				case 4 :
					// src/main/antlr3/Scheme.g:38:5: ID
					{
					root_0 = (Object)adaptor.nil();


					ID9=(Token)match(input,ID,FOLLOW_ID_in_arg154); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ID9_tree = (Object)adaptor.create(ID9);
					adaptor.addChild(root_0, ID9_tree);
					}

					}
					break;
				case 5 :
					// src/main/antlr3/Scheme.g:39:5: literal
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_literal_in_arg160);
					literal10=literal();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, literal10.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "arg"


	public static class lambda_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "lambda"
	// src/main/antlr3/Scheme.g:42:1: lambda : '(' 'lambda' '(' ( ID )* ')' arg ')' -> ^( LAMBDA ^( ARGS ( ID )* ) ^( BODY arg ) ) ;
	public final SchemeParser.lambda_return lambda() throws RecognitionException {
		SchemeParser.lambda_return retval = new SchemeParser.lambda_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal11=null;
		Token string_literal12=null;
		Token char_literal13=null;
		Token ID14=null;
		Token char_literal15=null;
		Token char_literal17=null;
		ParserRuleReturnScope arg16 =null;

		Object char_literal11_tree=null;
		Object string_literal12_tree=null;
		Object char_literal13_tree=null;
		Object ID14_tree=null;
		Object char_literal15_tree=null;
		Object char_literal17_tree=null;
		RewriteRuleTokenStream stream_12=new RewriteRuleTokenStream(adaptor,"token 12");
		RewriteRuleTokenStream stream_13=new RewriteRuleTokenStream(adaptor,"token 13");
		RewriteRuleTokenStream stream_15=new RewriteRuleTokenStream(adaptor,"token 15");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_arg=new RewriteRuleSubtreeStream(adaptor,"rule arg");

		try {
			// src/main/antlr3/Scheme.g:42:8: ( '(' 'lambda' '(' ( ID )* ')' arg ')' -> ^( LAMBDA ^( ARGS ( ID )* ) ^( BODY arg ) ) )
			// src/main/antlr3/Scheme.g:42:10: '(' 'lambda' '(' ( ID )* ')' arg ')'
			{
			char_literal11=(Token)match(input,12,FOLLOW_12_in_lambda171); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_12.add(char_literal11);

			string_literal12=(Token)match(input,15,FOLLOW_15_in_lambda173); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_15.add(string_literal12);

			char_literal13=(Token)match(input,12,FOLLOW_12_in_lambda176); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_12.add(char_literal13);

			// src/main/antlr3/Scheme.g:42:28: ( ID )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==ID) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// src/main/antlr3/Scheme.g:42:28: ID
					{
					ID14=(Token)match(input,ID,FOLLOW_ID_in_lambda178); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ID.add(ID14);

					}
					break;

				default :
					break loop4;
				}
			}

			char_literal15=(Token)match(input,13,FOLLOW_13_in_lambda181); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_13.add(char_literal15);

			pushFollow(FOLLOW_arg_in_lambda183);
			arg16=arg();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_arg.add(arg16.getTree());
			char_literal17=(Token)match(input,13,FOLLOW_13_in_lambda185); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_13.add(char_literal17);

			// AST REWRITE
			// elements: arg, ID
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 42:45: -> ^( LAMBDA ^( ARGS ( ID )* ) ^( BODY arg ) )
			{
				// src/main/antlr3/Scheme.g:42:48: ^( LAMBDA ^( ARGS ( ID )* ) ^( BODY arg ) )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LAMBDA, "LAMBDA"), root_1);
				// src/main/antlr3/Scheme.g:42:57: ^( ARGS ( ID )* )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGS, "ARGS"), root_2);
				// src/main/antlr3/Scheme.g:42:64: ( ID )*
				while ( stream_ID.hasNext() ) {
					adaptor.addChild(root_2, stream_ID.nextNode());
				}
				stream_ID.reset();

				adaptor.addChild(root_1, root_2);
				}

				// src/main/antlr3/Scheme.g:42:69: ^( BODY arg )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(BODY, "BODY"), root_2);
				adaptor.addChild(root_2, stream_arg.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "lambda"


	public static class list_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "list"
	// src/main/antlr3/Scheme.g:44:1: list : '\\'(' ( arg )* ')' -> ^( LIST ( arg )* ) ;
	public final SchemeParser.list_return list() throws RecognitionException {
		SchemeParser.list_return retval = new SchemeParser.list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal18=null;
		Token char_literal20=null;
		ParserRuleReturnScope arg19 =null;

		Object string_literal18_tree=null;
		Object char_literal20_tree=null;
		RewriteRuleTokenStream stream_13=new RewriteRuleTokenStream(adaptor,"token 13");
		RewriteRuleTokenStream stream_14=new RewriteRuleTokenStream(adaptor,"token 14");
		RewriteRuleSubtreeStream stream_arg=new RewriteRuleSubtreeStream(adaptor,"rule arg");

		try {
			// src/main/antlr3/Scheme.g:44:6: ( '\\'(' ( arg )* ')' -> ^( LIST ( arg )* ) )
			// src/main/antlr3/Scheme.g:44:8: '\\'(' ( arg )* ')'
			{
			string_literal18=(Token)match(input,14,FOLLOW_14_in_list213); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_14.add(string_literal18);

			// src/main/antlr3/Scheme.g:44:14: ( arg )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==ID||(LA5_0 >= NIL && LA5_0 <= NUMBER)||LA5_0==12||LA5_0==14) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// src/main/antlr3/Scheme.g:44:14: arg
					{
					pushFollow(FOLLOW_arg_in_list215);
					arg19=arg();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_arg.add(arg19.getTree());
					}
					break;

				default :
					break loop5;
				}
			}

			char_literal20=(Token)match(input,13,FOLLOW_13_in_list218); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_13.add(char_literal20);

			// AST REWRITE
			// elements: arg
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 44:23: -> ^( LIST ( arg )* )
			{
				// src/main/antlr3/Scheme.g:44:26: ^( LIST ( arg )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LIST, "LIST"), root_1);
				// src/main/antlr3/Scheme.g:44:33: ( arg )*
				while ( stream_arg.hasNext() ) {
					adaptor.addChild(root_1, stream_arg.nextTree());
				}
				stream_arg.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "list"


	public static class literal_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "literal"
	// src/main/antlr3/Scheme.g:46:1: literal : ( NUMBER | NIL );
	public final SchemeParser.literal_return literal() throws RecognitionException {
		SchemeParser.literal_return retval = new SchemeParser.literal_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set21=null;

		Object set21_tree=null;

		try {
			// src/main/antlr3/Scheme.g:47:3: ( NUMBER | NIL )
			// src/main/antlr3/Scheme.g:
			{
			root_0 = (Object)adaptor.nil();


			set21=input.LT(1);
			if ( (input.LA(1) >= NIL && input.LA(1) <= NUMBER) ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set21));
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
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "literal"

	// Delegated rules



	public static final BitSet FOLLOW_expression_in_program102 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_12_in_expression113 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_expression116 = new BitSet(new long[]{0x0000000000007640L});
	public static final BitSet FOLLOW_arg_in_expression120 = new BitSet(new long[]{0x0000000000007640L});
	public static final BitSet FOLLOW_13_in_expression124 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lambda_in_arg136 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_arg142 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_list_in_arg148 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_arg154 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_literal_in_arg160 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_lambda171 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_lambda173 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_lambda176 = new BitSet(new long[]{0x0000000000002040L});
	public static final BitSet FOLLOW_ID_in_lambda178 = new BitSet(new long[]{0x0000000000002040L});
	public static final BitSet FOLLOW_13_in_lambda181 = new BitSet(new long[]{0x0000000000005640L});
	public static final BitSet FOLLOW_arg_in_lambda183 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_lambda185 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_list213 = new BitSet(new long[]{0x0000000000007640L});
	public static final BitSet FOLLOW_arg_in_list215 = new BitSet(new long[]{0x0000000000007640L});
	public static final BitSet FOLLOW_13_in_list218 = new BitSet(new long[]{0x0000000000000002L});
}
