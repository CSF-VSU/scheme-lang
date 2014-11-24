grammar Scheme;

options {
  // output=AST;

  // backtrack=true;
  // memoize=true;
}


@header {
    package org.csf.scheme.lang.antlr;
}

file: PROGRAM;

PROGRAM : (EXPRESSION)*;

EXPRESSION : '(' ID (EXPRESSION)* ')'
    | LIST
    | LITERAL
    | ID
    ;

LIST : '\'(' EXPRESSION* ')' ;

LITERAL
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

STRING : '\"' . *? '\"';

NIL : 'nil';

WS : [ \n\r\t\,] -> channel(HIDDEN) ;

COMMENT : ';' ~[\r\n]* -> channel(HIDDEN) ;