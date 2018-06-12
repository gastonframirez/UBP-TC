grammar tp1juarez;

WS: [ \n\t\r] -> skip;

fragment CONS : [0-9]+;
fragment VCHAR: [_0-9a-zA-Z];
fragment SIGN: [-+];

TFLOAT: 'float';
TINT: 'int';
TCHAR: 'char';
TDOUBLE: 'double';

IF: 'if';
FOR: 'for';
WHILE: 'while';
ELSE: 'else';

VOID: 'void';
RETURN: 'return';
COLON: ',';
SEMICOLON: ';';

LPAREN: '(';
RPAREN: ')';

LBRACKET: '[';
RBRACKET: ']';

LBRACE: '{';
RBRACE: '}';

PLUS: '+';
LESS: '-';
DIVIDE: '/';
MULTIPLY: '*';

AND: '&&';
OR: '||';
ASIGN: '=';
EQUALS: '==';
DIF: '!=';
SMALLEREQ: '<=';
HIGHEREQ: '>=';
SMALLER: '<';
HIGHER: '>';

INT: SIGN? CONS+;
FLOAT: SIGN? (CONS '.' CONS | CONS '.' | '.' CONS) ('e' INT)?;
ID: [_a-zA-Z]VCHAR*;

// 1.Declaraciones de datos
vtype: TINT | TFLOAT | TCHAR | TDOUBLE;
val: FLOAT | INT | ID;
dec: vtype 
     (ID ( (ASIGN val)? | ((ASIGN val)? COLON ID (ASIGN val)?)+)
     | ID LBRACKET INT? RBRACKET
     | MULTIPLY+ ID);

// 2.Funciones, sus prototipos y return
ftype: vtype | VOID;
arg: ID | ID COLON arg | ftype ID COLON arg | ftype ID | ftype COLON arg | ftype | ;
ret: RETURN val;
func: ftype? ID LPAREN arg RPAREN cblock?;

// 3.Estructuras de control con y sin anidación (if, if-else, for, while)
condition: val (EQUALS | DIF SMALLEREQ | SMALLER | HIGHER | HIGHEREQ) val;
conditions:
    LPAREN conditions RPAREN (AND | OR)? conditions
    | LBRACE conditions RBRACE (AND | OR)? conditions
    | LBRACKET conditions RBRACKET (AND | OR)? conditions
    | condition ((AND | OR) conditions)?
    | ;
ifc: IF LPAREN (conditions | val)  RPAREN (instr | cblock)? elsec?;
elsec: ELSE ifc | ELSE (instr | cblock)?;
forc: FOR LPAREN instr? SEMICOLON instr? SEMICOLON instr? RPAREN (instr | cblock)?;
whilec: WHILE LPAREN (conditions | val) RPAREN (instr | cblock)?;

// 4.Asignaciones (solo operaciones aritméticas)
operator: LESS | PLUS | DIVIDE | MULTIPLY;
operation: 
    ((val | func | LPAREN operation operator operation RPAREN) operator operation
    | LPAREN operation operator operation RPAREN
    | val
    | func);
operations:
    LPAREN operations RPAREN operations
    | LBRACE operations RBRACE operations
    | LBRACKET operations RBRACKET operations
    | operation
    | ;
ops:
    (ID PLUS PLUS
    | ID LESS LESS
    | ID operator? ASIGN operations);

// Extra
code: instr SEMICOLON? code | ;
cblock: LBRACE code? RBRACE;
instr: (dec | ops | func | func | ifc | forc | whilec | condition | ret | val);
instruction: instr SEMICOLON? instruction | <EOF> | ;