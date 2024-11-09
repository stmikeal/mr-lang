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
	| expr (PLUS | MINUS | MUL | SLASH) expr
	| logicExpr
	| ID
	| NUM
	| STRING;

logicExpr:
	'(' expr ')'
	| logicExpr compOperator logicExpr
	| ID
	| BOOL
	| NUM;

varDecl: (rawVarDecl | filledVarDecl) ';';
rawVarDecl: typeName ID;
filledVarDecl: typeName ID ASSIGN expr;
typeName: 'schetnoe' | 'slovesnoe' | 'dvoyakoe';

assignment: rawAssigment ';';
rawAssigment: ID ASSIGN expr;
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
	'krugoverty' '(' filledVarDecl ';' logicExpr ';' rawAssigment ')' stmt;

ID: [a-zA-Z_] [a-zA-Z_0-9]*;
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

SPACE: [ \r\n\t]+ -> skip;
LINE_COMMENT: '//' ~[\n\r]* -> skip;
MULTILINE_COMMENT: '/*' ~[\r]* '*/' -> skip;