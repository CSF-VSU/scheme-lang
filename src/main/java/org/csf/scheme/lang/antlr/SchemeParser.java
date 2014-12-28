// $ANTLR 3.5.2 src/main/antlr/Scheme.g 2014-12-28 23:06:56

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
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARGS", "BODY", "BOOLEAN", "CHAR", 
		"ID", "LAMBDA", "LIST", "NIL", "NUMBER", "PROGRAM", "SIGN", "STRING", 
		"SYMBOL_HEAD", "SYMBOL_REST", "WS", "'('", "')'", "'\\'('", "'lambda'"
	};
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


	public static class program_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "program"
	// src/main/antlr/Scheme.g:31:1: program : ( expression )* -> ^( PROGRAM ( expression )* ) ;
	public final SchemeParser.program_return program() throws RecognitionException {
		SchemeParser.program_return retval = new SchemeParser.program_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expression1 =null;

		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// src/main/antlr/Scheme.g:31:9: ( ( expression )* -> ^( PROGRAM ( expression )* ) )
			// src/main/antlr/Scheme.g:31:11: ( expression )*
			{
			// src/main/antlr/Scheme.g:31:11: ( expression )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==19) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// src/main/antlr/Scheme.g:31:12: expression
					{
					pushFollow(FOLLOW_expression_in_program107);
					expression1=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression1.getTree());
					}
					break;

				default :
					break loop1;
				}
			}

			// AST REWRITE
			// elements: expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 31:25: -> ^( PROGRAM ( expression )* )
			{
				// src/main/antlr/Scheme.g:31:28: ^( PROGRAM ( expression )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROGRAM, "PROGRAM"), root_1);
				// src/main/antlr/Scheme.g:31:38: ( expression )*
				while ( stream_expression.hasNext() ) {
					adaptor.addChild(root_1, stream_expression.nextTree());
				}
				stream_expression.reset();

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
	// $ANTLR end "program"


	public static class expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// src/main/antlr/Scheme.g:33:1: expression : '(' ! ID ^ ( arg )* ')' !;
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
			// src/main/antlr/Scheme.g:33:12: ( '(' ! ID ^ ( arg )* ')' !)
			// src/main/antlr/Scheme.g:33:14: '(' ! ID ^ ( arg )* ')' !
			{
			root_0 = (Object)adaptor.nil();


			char_literal2=(Token)match(input,19,FOLLOW_19_in_expression128); if (state.failed) return retval;
			ID3=(Token)match(input,ID,FOLLOW_ID_in_expression131); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			ID3_tree = (Object)adaptor.create(ID3);
			root_0 = (Object)adaptor.becomeRoot(ID3_tree, root_0);
			}

			// src/main/antlr/Scheme.g:33:23: ( arg )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= BOOLEAN && LA2_0 <= ID)||(LA2_0 >= NIL && LA2_0 <= NUMBER)||LA2_0==STRING||LA2_0==19||LA2_0==21) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// src/main/antlr/Scheme.g:33:24: arg
					{
					pushFollow(FOLLOW_arg_in_expression135);
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

			char_literal5=(Token)match(input,20,FOLLOW_20_in_expression139); if (state.failed) return retval;
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
	// src/main/antlr/Scheme.g:35:1: arg : ( lambda | expression | list | ID | literal );
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
			// src/main/antlr/Scheme.g:36:3: ( lambda | expression | list | ID | literal )
			int alt3=5;
			switch ( input.LA(1) ) {
			case 19:
				{
				int LA3_1 = input.LA(2);
				if ( (LA3_1==22) ) {
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
			case 21:
				{
				alt3=3;
				}
				break;
			case ID:
				{
				alt3=4;
				}
				break;
			case BOOLEAN:
			case CHAR:
			case NIL:
			case NUMBER:
			case STRING:
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
					// src/main/antlr/Scheme.g:36:5: lambda
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_lambda_in_arg151);
					lambda6=lambda();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, lambda6.getTree());

					}
					break;
				case 2 :
					// src/main/antlr/Scheme.g:37:5: expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_expression_in_arg157);
					expression7=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression7.getTree());

					}
					break;
				case 3 :
					// src/main/antlr/Scheme.g:38:5: list
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_list_in_arg163);
					list8=list();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, list8.getTree());

					}
					break;
				case 4 :
					// src/main/antlr/Scheme.g:39:5: ID
					{
					root_0 = (Object)adaptor.nil();


					ID9=(Token)match(input,ID,FOLLOW_ID_in_arg169); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ID9_tree = (Object)adaptor.create(ID9);
					adaptor.addChild(root_0, ID9_tree);
					}

					}
					break;
				case 5 :
					// src/main/antlr/Scheme.g:40:5: literal
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_literal_in_arg175);
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
	// src/main/antlr/Scheme.g:43:1: lambda : '(' 'lambda' '(' ( ID )* ')' arg ')' -> ^( LAMBDA ^( ARGS ( ID )* ) ^( BODY arg ) ) ;
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
		RewriteRuleTokenStream stream_22=new RewriteRuleTokenStream(adaptor,"token 22");
		RewriteRuleTokenStream stream_19=new RewriteRuleTokenStream(adaptor,"token 19");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_20=new RewriteRuleTokenStream(adaptor,"token 20");
		RewriteRuleSubtreeStream stream_arg=new RewriteRuleSubtreeStream(adaptor,"rule arg");

		try {
			// src/main/antlr/Scheme.g:43:8: ( '(' 'lambda' '(' ( ID )* ')' arg ')' -> ^( LAMBDA ^( ARGS ( ID )* ) ^( BODY arg ) ) )
			// src/main/antlr/Scheme.g:43:10: '(' 'lambda' '(' ( ID )* ')' arg ')'
			{
			char_literal11=(Token)match(input,19,FOLLOW_19_in_lambda186); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_19.add(char_literal11);

			string_literal12=(Token)match(input,22,FOLLOW_22_in_lambda188); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_22.add(string_literal12);

			char_literal13=(Token)match(input,19,FOLLOW_19_in_lambda191); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_19.add(char_literal13);

			// src/main/antlr/Scheme.g:43:28: ( ID )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==ID) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// src/main/antlr/Scheme.g:43:28: ID
					{
					ID14=(Token)match(input,ID,FOLLOW_ID_in_lambda193); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ID.add(ID14);

					}
					break;

				default :
					break loop4;
				}
			}

			char_literal15=(Token)match(input,20,FOLLOW_20_in_lambda196); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_20.add(char_literal15);

			pushFollow(FOLLOW_arg_in_lambda198);
			arg16=arg();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_arg.add(arg16.getTree());
			char_literal17=(Token)match(input,20,FOLLOW_20_in_lambda200); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_20.add(char_literal17);

			// AST REWRITE
			// elements: ID, arg
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 43:45: -> ^( LAMBDA ^( ARGS ( ID )* ) ^( BODY arg ) )
			{
				// src/main/antlr/Scheme.g:43:48: ^( LAMBDA ^( ARGS ( ID )* ) ^( BODY arg ) )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LAMBDA, "LAMBDA"), root_1);
				// src/main/antlr/Scheme.g:43:57: ^( ARGS ( ID )* )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGS, "ARGS"), root_2);
				// src/main/antlr/Scheme.g:43:64: ( ID )*
				while ( stream_ID.hasNext() ) {
					adaptor.addChild(root_2, stream_ID.nextNode());
				}
				stream_ID.reset();

				adaptor.addChild(root_1, root_2);
				}

				// src/main/antlr/Scheme.g:43:69: ^( BODY arg )
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
	// src/main/antlr/Scheme.g:45:1: list : '\\'(' ( arg )* ')' -> ^( LIST ( arg )* ) ;
	public final SchemeParser.list_return list() throws RecognitionException {
		SchemeParser.list_return retval = new SchemeParser.list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal18=null;
		Token char_literal20=null;
		ParserRuleReturnScope arg19 =null;

		Object string_literal18_tree=null;
		Object char_literal20_tree=null;
		RewriteRuleTokenStream stream_20=new RewriteRuleTokenStream(adaptor,"token 20");
		RewriteRuleTokenStream stream_21=new RewriteRuleTokenStream(adaptor,"token 21");
		RewriteRuleSubtreeStream stream_arg=new RewriteRuleSubtreeStream(adaptor,"rule arg");

		try {
			// src/main/antlr/Scheme.g:45:6: ( '\\'(' ( arg )* ')' -> ^( LIST ( arg )* ) )
			// src/main/antlr/Scheme.g:45:8: '\\'(' ( arg )* ')'
			{
			string_literal18=(Token)match(input,21,FOLLOW_21_in_list228); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_21.add(string_literal18);

			// src/main/antlr/Scheme.g:45:14: ( arg )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= BOOLEAN && LA5_0 <= ID)||(LA5_0 >= NIL && LA5_0 <= NUMBER)||LA5_0==STRING||LA5_0==19||LA5_0==21) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// src/main/antlr/Scheme.g:45:14: arg
					{
					pushFollow(FOLLOW_arg_in_list230);
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

			char_literal20=(Token)match(input,20,FOLLOW_20_in_list233); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_20.add(char_literal20);

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
			// 45:23: -> ^( LIST ( arg )* )
			{
				// src/main/antlr/Scheme.g:45:26: ^( LIST ( arg )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LIST, "LIST"), root_1);
				// src/main/antlr/Scheme.g:45:33: ( arg )*
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
	// src/main/antlr/Scheme.g:47:1: literal : ( NUMBER | NIL | BOOLEAN | CHAR | STRING );
	public final SchemeParser.literal_return literal() throws RecognitionException {
		SchemeParser.literal_return retval = new SchemeParser.literal_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set21=null;

		Object set21_tree=null;

		try {
			// src/main/antlr/Scheme.g:48:3: ( NUMBER | NIL | BOOLEAN | CHAR | STRING )
			// src/main/antlr/Scheme.g:
			{
			root_0 = (Object)adaptor.nil();


			set21=input.LT(1);
			if ( (input.LA(1) >= BOOLEAN && input.LA(1) <= CHAR)||(input.LA(1) >= NIL && input.LA(1) <= NUMBER)||input.LA(1)==STRING ) {
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



	public static final BitSet FOLLOW_expression_in_program107 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_19_in_expression128 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_expression131 = new BitSet(new long[]{0x00000000003899C0L});
	public static final BitSet FOLLOW_arg_in_expression135 = new BitSet(new long[]{0x00000000003899C0L});
	public static final BitSet FOLLOW_20_in_expression139 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lambda_in_arg151 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_arg157 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_list_in_arg163 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_arg169 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_literal_in_arg175 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_lambda186 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_lambda188 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_lambda191 = new BitSet(new long[]{0x0000000000100100L});
	public static final BitSet FOLLOW_ID_in_lambda193 = new BitSet(new long[]{0x0000000000100100L});
	public static final BitSet FOLLOW_20_in_lambda196 = new BitSet(new long[]{0x00000000002899C0L});
	public static final BitSet FOLLOW_arg_in_lambda198 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_lambda200 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_list228 = new BitSet(new long[]{0x00000000003899C0L});
	public static final BitSet FOLLOW_arg_in_list230 = new BitSet(new long[]{0x00000000003899C0L});
	public static final BitSet FOLLOW_20_in_list233 = new BitSet(new long[]{0x0000000000000002L});
}
