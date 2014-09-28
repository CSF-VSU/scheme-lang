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
}

@header {
    package org.csf.scheme.lang;
}

@lexer::header {
    package org.csf.scheme.lang;
}


WS : (' '|'\n'|'\r'|'\t') {$channel=HIDDEN;} ;

program : (expression)* ;

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
  ;

NUMBER : '0'..'9'+;

ID : ('a'..'z' | 'A'..'Z'|'_') ('a'..'z' | 'A'..'Z' | '0'..'9'|'_')*;
