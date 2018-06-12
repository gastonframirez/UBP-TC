/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

grammar tp2v3;

WS: [ \n\t\r] -> skip;

//<TIPOS>

FLOAT: 'float';
INT: 'int';
CHAR: 'char';

//</TIPOS>

//<CONDICION>

IF: 'if';
ELSE: 'else';
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

declaracionv : INT ID? (IGUAL NUMERO)?
             | FLOAT ID? (IGUAL numero)?
             | CHAR ID? (IGUAL ID)?;

//</DECLARACION VARIABLE>

//<FUNCIONES>
tipofuncion: FLOAT | INT | CHAR | VOID;

entrepa1: operando | operando COMA entrepa1 | ;
entrepa2:  tipodato ID? COMA entrepa2 | tipodato ID? | ; 

ret: RETURN operando;

llamadofunc: ID PARENTESIS1? entrepa1 PARENTESIS2;  
definicionfunc: tipofuncion ID? PARENTESIS1? entrepa2 PARENTESIS2 bloquecodigo?;
    
//</FUNCIONES>

//<OPERACIONES>

operador: MAS | MENOS | ASTERISCO | BARRA;

operacion: operando listaop
         | (operando listaoperror)?
         | ; 

listaop: operador operando listaop | ;

listaoperror: operador operador listaoperror
            | operador;

definicionv: ID MAS MAS
           | ID MENOS MENOS
           | ID operador IGUAL operando
           | ID IGUAL operacion
           |ID MAS MAS MAS+
           |ID MENOS MENOS MENOS+ 
           |ID operador operador+ IGUAL+ operando 
           |ID MAS MAS (operador+ | IGUAL+ )
           |ID MENOS MENOS (operador+ | IGUAL+) 
           |ID operador+ IGUAL IGUAL+ operando; 
          
//</OPERACIONES>

//<CONDICIONES Y LOOPS>

cond: operando? (IGUALIGUAL | DISTINTO | MENORIGUAL | MENOR | MAYORIGUAL | MAYOR) operando?;

conds: cond
     | cond AND conds
     | cond OR conds;

codigo: ins PUNTOYCOMA? codigo | ;

bloquecodigo: LLAVE1 codigo LLAVE2;

ifcond: IF PARENTESIS1? conds PARENTESIS2 (ins | bloquecodigo)? elsecond?; 
elsecond: ELSE (ins | bloquecodigo)?;
forloop: FOR PARENTESIS1? ins PUNTOYCOMA conds PUNTOYCOMA ins PARENTESIS2 (ins | bloquecodigo)?; 
whileloop: WHILE PARENTESIS1? conds PARENTESIS2 (ins | bloquecodigo)?; 

//</CONDICIONES Y LOOPS>

//<INSTRUCCIONES>

ins: definicionv 
   | declaracionv 
   | definicionfunc
   | ifcond 
   | forloop 
   | whileloop 
   | conds 
   | operando
   | llamadofunc
   | ret;

instruccion: ins PUNTOYCOMA? instruccion
           | <EOF>
           | ;

//</INSTRUCCIONES>

