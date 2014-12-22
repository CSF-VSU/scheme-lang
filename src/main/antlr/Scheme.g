grammar Scheme;

options {
  output=AST;

  backtrack=true;
  //memoize=true;
}


tokens {
  NIL='nil';
  LIST;
  LAMBDA;
  ARGS;
  BODY;
  PROGRAM;
}

@header {
    package org.csf.scheme.lang.antlr;
}

@lexer::header {
    package org.csf.scheme.lang.antlr;
}


WS : (' '|'\n'|'\r'|'\t') {$channel=HIDDEN;} ;

program : (expression)* -> ^(PROGRAM (expression)*);

expression : '('! ID^ (arg)* ')'! ;

arg
  : lambda
  | expression
  | list
  | ID
  | literal
  ;

lambda : '(' 'lambda'  '(' ID* ')' arg ')'  -> ^(LAMBDA ^(ARGS ID*) ^(BODY arg));

list : '\'(' arg* ')' -> ^(LIST arg*);

literal
  : NUMBER
  | NIL
  | BOOLEAN
  | CHAR
  | STRING
  ;

fragment
SIGN : '+' | '-';

NUMBER : SIGN? ('0'..'9')+ ('.' ('0'..'9')+)? (('e' | 'E') SIGN? ('0'..'9')+)? ;

ID : SYMBOL_HEAD SYMBOL_REST*;

fragment
SYMBOL_HEAD
    : SIGN | 'a'..'z' | 'A'..'Z' | '*' | '!'  | '_' | '?' | '>' | '<' | '=' | '$' | '&' ;

fragment
SYMBOL_REST
    : SYMBOL_HEAD
    | '0'..'9'
    | '.'
    ;

BOOLEAN : '#t' | '#f';

CHAR : '\'' . '\'';

STRING : '\"' . * '\"';