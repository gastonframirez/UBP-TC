/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

grammar tp1;

WS: [ \n\t\r] -> skip;

//<TIPOS>

FLOAT: 'float';
INT: 'int';
CHAR: 'char';


//</TIPOS>

//<CONDICION>

IF: 'if';
FOR: 'for';
WHILE: 'while';
VOID: 'void';


//</CONDICION>

//<VARIOS>

RETURN: 'return';
COMA: ',';
PUNTOYCOMA: ';';

LLAVE1 : '{';
LLAVE2 : '}';

PARENTESIS1 : '(';
PARENTESIS2 : ')';

CORCHETE1 : '[';
CORCHETE2 : ']';



//</VARIOS>

//<OPERACION MAT>

MAS: '+';
MENOS: '-';
BARRA: '/';
ASTERISCO: '*';

//</OPERACION MAT>


//<COMPARACION>

AND: '&&';
OR: '||';

IGUAL: '=';
IGUALIGUAL: '==';
DISTINTO: '!=';
MENORIGUAL: '<=';
MENOR: '<';
MAYORIGUAL: '>=';
MAYOR : '>';

//</COMPARACION>

//<ID NUMERO>

NUMERO: ([0-9])+;
FLOTANTE: NUMERO '.' | NUMERO '.' NUMERO | '.' NUMERO;
ID: [a-zA-Z] [a-zA-Z0-9]*;

//</ID NUMERO>

//<DECLARACION VARIABLE>

numero: NUMERO | FLOTANTE;
operando: numero | ID;
tipodato: INT | FLOAT | CHAR;

definicionv : INT ID (IGUAL NUMERO)?
            | FLOAT ID (IGUAL numero)?
            | CHAR ID (IGUAL ID)?;

//</DECLARACION VARIABLE>

//<FUNCIONES>

tipofuncion: (FLOAT | INT | CHAR | VOID);

entrepa: ID | ID COMA entrepa | tipodato ID COMA entrepa | tipodato ID | ;

func: ID PARENTESIS1 entrepa PARENTESIS2;

declaracionf: tipofuncion func;

llamadofuncion: tipofuncion func bloquecodigo;

//</FUNCIONES>

//<OPERACIONES>

operador: MAS | MENOS | ASTERISCO | BARRA;
operacion: (operando | PARENTESIS1 operacion operador operacion PARENTESIS2) operador operacion
         | PARENTESIS1 operacion operador operacion PARENTESIS2
         | operando;

declaracionv: ID MAS MAS
            | ID MENOS MENOS
            | ID operador IGUAL operando
            | ID IGUAL operacion; 

//</OPERACIONES>

//<CONDICIONES Y LOOPS>

cond: operando (IGUALIGUAL | DISTINTO | MENORIGUAL | MENOR | MAYORIGUAL | MAYOR) operando;

conds: cond
     | cond AND conds
     | cond OR conds;

codigo: ins PUNTOYCOMA codigo | ;

bloquecodigo: LLAVE1 codigo? LLAVE2;

ifcond: IF PARENTESIS1 conds  PARENTESIS2 instruccion | ;

argif: IF PARENTESIS1 conds PARENTESIS2 bloquecodigo;

forloop: FOR PARENTESIS1 ins? PUNTOYCOMA conds? PUNTOYCOMA ins? PARENTESIS2 ins | ;

argfor: FOR PARENTESIS1 ins? PUNTOYCOMA conds? PUNTOYCOMA ins? PARENTESIS2 bloquecodigo;

whileloop: WHILE PARENTESIS1 conds PARENTESIS2 ins | ;

argwhile: WHILE PARENTESIS1 conds PARENTESIS2 bloquecodigo;

//</CONDICIONES Y LOOPS>

//<INSTRUCCIONES>

ins: definicionv | declaracionv | func | declaracionf | ifcond | forloop | whileloop | conds | operando ;

arginst: llamadofuncion | argif | argfor | argwhile;

instruccion: ins PUNTOYCOMA instruccion
           | arginst instruccion
           | <EOF>
           | ;


//</INSTRUCCIONES>
