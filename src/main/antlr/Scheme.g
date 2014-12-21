grammar Scheme;

options {
	language=Java;
	output=AST;
	ASTLabelType=CommonTree;
}

tokens {
	LPAREN='(';
	RPAREN=')';
	DOT;
}

@package {org.csf.scheme.lang.antlr}
@lexer::package {org.csf.scheme.lang.antlr}


sexpr
	: item* EOF
	;
item
	: atom
	| (list) => list
	| LPAREN item DOT item RPAREN
	;
list
	: LPAREN item* RPAREN
	;
atom
	: STRING | SYMBOL | NUMBER | DOT
	;
	
STRING
	:'"' ( '\\' . | ~('\\'|'"') )* '"'
	;
WHITESPACE
	: (' ' | '\n' | '\t' | '\r')+ 
		{skip();}
	;
NUMBER
	: ('+' | '-')? (DIGIT)+ ('.' (DIGIT)+)?
	;
SYMBOL
	: SYMBOL_START (SYMBOL_START | DIGIT)*  {if ($text == '.')  $type = DOT;}
	;

fragment
SYMBOL_START 
	: ('a'..'z') | ('A'..'Z') 
	| '+' | '-' | '*' | '/' 
	| '.'
	;
fragment
DIGIT
	: ('0'..'9')
	;
