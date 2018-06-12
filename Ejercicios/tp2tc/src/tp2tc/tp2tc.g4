grammar tp2tc;

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

INCLUDE : '#include';
DEFINE : '#define';

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
            | CHAR ID (IGUAL ID)?;//listo

//</DECLARACION VARIABLE>

//<FUNCIONES>
tipofuncion: FLOAT | INT | CHAR | VOID;

entrepa1: ID | ID COMA entrepa1;
entrepa2:  tipodato ID COMA entrepa2 | tipodato ID;
entrepa3: ;

llamadofunc: ID PARENTESIS1 (entrepa1|entrepa3) PARENTESIS2; 

definicionfunc: tipofuncion func;
    
declaracionfunc: tipofuncion func bloquecodigo;

func: ID PARENTESIS1 (entrepa2|entrepa3) PARENTESIS2; 


//</FUNCIONES>

//<OPERACIONES>

operador: MAS | MENOS | ASTERISCO | BARRA;

operacion: operando listaop;

listaop: operador operando listaop | ;

declaracionv: ID MAS MAS
            | ID MENOS MENOS
            | ID operador IGUAL operando
            | ID IGUAL operacion; //listo

//</OPERACIONES>

//<CONDICIONES Y LOOPS>

cond: operando (IGUALIGUAL | DISTINTO | MENORIGUAL | MENOR | MAYORIGUAL | MAYOR) operando;

conds: cond
     | cond AND conds
     | cond OR conds;

codigo: ins PUNTOYCOMA codigo | ;//revisar punto y coma en listener

bloquecodigo: LLAVE1 codigo? LLAVE2;

ifcond: IF PARENTESIS1 conds  PARENTESIS2 instruccion; //listo

argif: IF PARENTESIS1 conds PARENTESIS2 bloquecodigo;

forloop: FOR PARENTESIS1 ins? PUNTOYCOMA conds? PUNTOYCOMA ins? PARENTESIS2 ins | ; //revisar punto y coma en listener

argfor: FOR PARENTESIS1 ins? PUNTOYCOMA conds? PUNTOYCOMA ins? PARENTESIS2 bloquecodigo;//revisar punto y coma en listener

whileloop: WHILE PARENTESIS1 conds PARENTESIS2 ins | ; //listo

argwhile: WHILE PARENTESIS1 conds PARENTESIS2 bloquecodigo;

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
   | func
   | ;

arginst: declaracionfunc | argif | argfor | argwhile;

instruccion: ins PUNTOYCOMA instruccion 
           | arginst instruccion
           | inserror PUNTOYCOMA instruccion 
           | arginserror instruccion
           | <EOF>
           | ;

//</INSTRUCCIONES>


//ERRORES //

definicionverror: ID (IGUAL NUMERO)?
                | ID (IGUAL numero)?
                | ID (IGUAL ID)? 
                | INT (IGUAL NUMERO)?
                | FLOAT (IGUAL numero)?
                | CHAR (IGUAL ID)?//listo
                | INT ID IGUAL
                | FLOAT ID (IGUAL )?
                | CHAR ID (IGUAL )?;//listo

//</DECLARACION VARIABLE>

//<FUNCIONES>

entrepaerror: ID entrepaerror | tipodato COMA entrepaerror
            | tipodato ID
            | ID COMA entrepaerror | tipodato ID COMA entrepaerror;

funcerror: ID entrepaerror PARENTESIS2
          | ID PARENTESIS1 entrepaerror;

declaracionferror: tipofuncion funcerror;

llamadofuncionerror: tipofuncion funcerror bloquecodigoerror;

//</FUNCIONES>

//<OPERACIONES>

operacionerror: operando listaoperror;

listaoperror: operando listaoperror
            | operador listaoperror
            | operando
            | operador;

declaracionverror: MAS MAS
                 | MENOS MENOS
                 | operador IGUAL operando
                 | IGUAL operacionerror //listo
                 | ID MAS MAS MAS+
                 | ID MENOS MENOS MENOS+
                 | ID operador operador+ IGUAL+ operando
                 | ID IGUAL+ operacionerror+ //listo
                 | ID MAS MAS (operador+ | IGUAL+)
                 | ID MENOS MENOS (operador+ | IGUAL+)
                 | ID operador IGUAL+ operando
                 | ID IGUAL operacionerror+ ;

//</OPERACIONES>

//<CONDICIONES Y LOOPS>

conderror: (IGUALIGUAL | DISTINTO | MENORIGUAL | MENOR | MAYORIGUAL | MAYOR) operando
          | operando (IGUALIGUAL | DISTINTO | MENORIGUAL | MENOR | MAYORIGUAL | MAYOR);

condserror: conderror
          | AND condserror 
          | OR condserror; 
//revisar punto y coma en listener

bloquecodigoerror: codigo? LLAVE2 | LLAVE1 codigo? ;

//revisar punto y coma en bloquecodigo error - a lo mejor haga falta codigo error con inserror sin cadena vacia


//LISTO

// errores de parentesis
ifconderror: IF PARENTESIS1? condserror  PARENTESIS2? instruccion;
            
argiferror: IF PARENTESIS1? condserror PARENTESIS2? bloquecodigoerror;

forlooperror: FOR PARENTESIS1? ins? PUNTOYCOMA? condserror? PUNTOYCOMA? ins? PARENTESIS2?; //revisar punto y coma en listener

argforerror: FOR PARENTESIS1? ins? PUNTOYCOMA?  condserror? PUNTOYCOMA? ins? PARENTESIS2? bloquecodigoerror;//revisar punto y coma en listener

whilelooperror: WHILE PARENTESIS1? condserror PARENTESIS2? ins; //listo

argwhileerror: WHILE PARENTESIS1? condserror PARENTESIS2 bloquecodigoerror; //falta poner signo de pregunta en parentesis2 PELOTUDO RAMIROOO

//</CONDICIONES Y LOOPS>

//<INSTRUCCIONES>

inserror: definicionverror | declaracionverror | funcerror |  ifconderror | llamadofuncionerror
        | forlooperror | whilelooperror | condserror | ;

arginserror: declaracionferror |  argiferror | argforerror | argwhileerror;
