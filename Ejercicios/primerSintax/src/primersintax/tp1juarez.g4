grammar tp1juarez;

WS: [ \n\t\r] -> skip;

FLOAT: 'float';
INT: 'int';
CHAR: 'char';

IF: 'if';
FOR: 'for';
WHILE: 'while';

VOID: 'void';
RETURN: 'return';
COLON: ',';
SEMICOLON: ';';

LPAREN: '(';
RPAREN: ')';

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

CONS: ([0-9])+;
FLOT: CONS '.' | CONS '.' CONS | '.' CONS;
STR: ([a-zA-Z])+;

num: (CONS | FLOT);
val: num | STR;
vtype: (INT | FLOAT | CHAR);

dec:
    (INT STR (ASIGN CONS)?
    | FLOAT STR (ASIGN num)?
    | CHAR STR (ASIGN STR)?);

operator: (LESS | PLUS | DIVIDE | MULTIPLY);

operation: 
    (val | LPAREN operation operator operation RPAREN) operator operation
    | LPAREN operation operator operation RPAREN
    | val;

operations:
    (STR PLUS PLUS
    | STR LESS LESS
    | STR operator ASIGN val
    | STR ASIGN operation);


ftype: (FLOAT | INT | CHAR | VOID);
arg: (STR | STR COLON arg | vtype STR COLON arg | vtype STR | );

func: STR LPAREN arg RPAREN;

funcd: ftype func;

funcdb: ftype func cblock;

condition: val (EQUALS | DIF SMALLEREQ | SMALLER | HIGHER | HIGHEREQ) val;

conditions: 
    (condition
    | condition AND conditions
    | condition OR conditions);

code: instr SEMICOLON code | ;

cblock: LBRACE code? RBRACE;

ifc: IF LPAREN (conditions | val)  RPAREN
    (instr
    | );

ifcb: IF LPAREN (conditions | val)  RPAREN cblock;

forc: FOR LPAREN instr? SEMICOLON instr? SEMICOLON instr? RPAREN
    (instr
    | );

forcb: FOR LPAREN instr? SEMICOLON instr? SEMICOLON instr? RPAREN cblock;

whilec: WHILE LPAREN instr? RPAREN
    (instr
    | );

whilecb: WHILE LPAREN instr? RPAREN cblock;

instr: (dec | operations | func | funcd | ifc | forc | whilec | conditions | val);

instrb: (funcdb | ifcb | forcb | whilecb);

instruction: 
    (instr SEMICOLON instruction
    | instrb instruction
    | <EOF>
    | );