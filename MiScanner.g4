lexer grammar MiScanner;


//Puntuation Marks
COMMA:      ',';
POINTC:     ';';
KEYL:       '{';
KEYR:       '}';
PARENTL:    '(';
PARENTR:    ')';
SBL:        '[';
SBR:        ']';
DOT:        '.';

//Reserved word
IF:     'if';
ELSE:   'else';
FOR:    'for';
WHILE:  'while';
BREAK:  'break';
RETURN: 'return';
READ:   'read';
WRITE:  'write';
CLASS:  'class';
CONST:  'const';
VOID:   'void';
NEW:    'new';
//Operators
OR:     '||';
AND:    '&&';
PP:     '++';
SS:     '--';
EQUALS: '=';
EE:     '==';
DE:     '!=';
LESS:   '<';
LE :    '<=';
GREATER:'>';
GE:     '>=';
PLUS:   '+';
SUB:    '-';
MULT:   '*';
DIV:    '/';
PERCENT:'%';

TRUE:'true';
FALSE:'false';

STRING: '"' (LETTER|DIGIT)* '"';
ID: LETTER(LETTER|DIGIT|'_')*;
NUM: DIGIT(DIGIT)*;
FLOAT:DIGIT+ '.' ('0'..'9')*;
//CHARCONST: ;

COMMENT:   '/*' .*? '*/' -> skip;
LINE_COMMENT:   '//'.*?'\r'?'\n' -> skip ;
CHAR_CONST: '\''(PRINTABLECHAR|'\\n'|'\\r')'\'' ;


fragment LETTER :'a'..'z' | 'A'..'Z'|'_';
fragment DIGIT :'0'..'9';
fragment PRINTABLECHAR:  (LETTER | DIGIT| '!'| '"'| '#' |'$'| '%'| '&'| '\''| '('|  ')'| '*'| '+'| ','| '-'| '.'| '/'| ':'| ';'| '<' |'='| '>'|'?');



WS : [ \t\n\r]+ -> skip;

