grammar Scheme;

WS : [ \n\r\t\,] -> channel(HIDDEN) ;

program : (expression)* ;

expression : '(' ID (arg)* ')' ;

arg
  : lambda
  | expression
  | list
  | ID
  | literal
  ;

lambda : '(lambda'  '(' ID* ')' expression ')' ;

list : '\'(' expression* ')' ;

literal
  : NUMBER
  | CHARACTER
  | BOOLEAN
  | NIL
  ;

NUMBER : '-'? [0-9]+ ('.' [0-9]+)? ([eE] '-'? [0-9]+)? ;

ID : (('a'..'z' | 'A'..'Z'|'_')('a'..'z' | 'A'..'Z'|'0'..'9'|'_'))*;

CHARACTER : '\\' . ;

NIL : 'nil' ;
  
BOOLEAN : 'true' | 'false' ;