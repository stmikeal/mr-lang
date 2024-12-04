grammar mrlang;

program: stmt* EOF;
stmt:
	varDecl
	| assignment
	| print
	| ifstmt
	| blockstmt
	| whilestmt
	| forstmt;

expr:
	'(' expr ')'
	| expr aritOperator expr
	| expr compOperator expr
	| MINUS numParsed
	| boolParsed
	| idName
	| numParsed
	| stringParsed;

varDecl: (rawVarDecl | filledVarDecl) ';';
rawVarDecl: typeName idName;
filledVarDecl: typeName idName ASSIGN expr;
typeName: 'schetnoe' | 'slovesnoe' | 'dvoyakoe';

assignment: rawAssigment ';';
rawAssigment: ID ASSIGN expr;
idName: ID;
numParsed: NUM;
stringParsed: STRING;
boolParsed: BOOL;
aritOperator: PLUS | MINUS | MUL | SLASH;
compOperator:
	LESS
	| LESS_OR_EQUAL
	| EQUAL
	| NOT_EQUAL
	| GREATER
	| GREATER_OR_EQUAL
	| AND
	| OR;

print: 'povedati' '(' expr ')' ';';
blockstmt: 'startuem' (stmt)* 'konchaem';
ifstmt: 'ezheli' '(' expr ')' stmt elifstmt* elsestmt?;
elifstmt: 'inakoezheli' '(' expr ')' stmt;
elsestmt: 'inako' stmt;
whilestmt: 'dokole' '(' expr ')' stmt;
forstmt:
	'krugoverty' '(' filledVarDecl ';' expr ';' rawAssigment ')' stmt;

NUM: [0-9]+;
BOOL: ('dobro' | 'lzha');
STRING: '"' ~[\r\n]* '"';
MUL: '*';
SLASH: '/';
PLUS: '+';
MINUS: '-';
ASSIGN: '=';
EQUAL: '==';
NOT_EQUAL: '!=';
LESS: '<';
AND: '&&';
OR: '||';
LESS_OR_EQUAL: '<=';
GREATER: '>';
GREATER_OR_EQUAL: '>=';
ID: [a-zA-Z_] [a-zA-Z_0-9]*;

SPACE: [ \r\n\t]+ -> skip;
LINE_COMMENT: '//' ~[\n\r]* -> skip;
MULTILINE_COMMENT: '/*' .*? '*/' -> skip;