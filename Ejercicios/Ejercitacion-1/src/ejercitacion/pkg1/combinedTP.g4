/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

grammar test;

WS : [\t\r\n ] -> skip; //limpia espacios en blanco y saltos de linea -- saca las cosas molestas =D 

//<TIPOS DE DATOS>
TIPODATO : INT | FLOAT | CHAR | DOUBLE;
TIPOFUNCION : INT | FLOAT | CHAR | DOUBLE | VOID;

INT : 'int';
FLOAT : 'float';
CHAR : 'char';
DOUBLE : 'double';
VOID : 'void';
//</TIPOS DE DATOS>

//<LIBRERIAS>
INCLUDE : '#include';
PRAGMA : '#pragma';
//</LIBRERIAS>

//<OPERACIONES LOGICAS>

OR : '||';
AND : '&&';

//</OPERACIONES LOGICAS>

//<CICLOS/CONDICIONES>

IF : 'if';
ELSE : 'else';

WHILE : 'while';
FOR : 'for';

TRY : 'try';
CATCH : 'catch';

IGUALIGUAL : '==';
DISTINTO : '!=';
MAYOR : '>';
MENOR : '<';
MAYORIGUAL : '>=';
MENORIGUAL : '<=';

//</CICLOS/CONDICIONES>

//<LLAVES/ETC>
LLAVE1 : '{';
LLAVE2 : '}';

PARENTESIS1 : '(';
PARENTESIS2 : ')';

CORCHETE1 : '[';
CORCHETE2 : ']';

//</LLAVES/ETC>

//<ADD/DECREASE>

ADD : '++';
DECREASE : '--';

//</ADD/DECREASE>

//<OPERACIONES MATEMATICAS>

MAS : '+';
MENOS : '-';
ASTERISCO : '*';
BARRA : '/';
//CONTRABARRA : '\ ' ;
IGUAL : '=';
POTENCIA : '**';
MODULO : '%';

//</OPERACIONES MATEMATICAS>


//<ASIGNACIONES>

MASIGUAL : '+=';
MENOSIGUAL : '-=';
PORIGUAL : '*=';
BARRAIGUAL : '/=';
MODULOIGUAL : '%=';


//</ASIGNACIONES>

//<IDENTIFICADORES Y NUMEROS >

ID : [_A-Za-z] [_A-Za-z0-9]*;
ENTERO : DIGITO+;
DIGITO : [0-9];
FLOTANTE : ENTERO '.' ENTERO;


//</IDENTIFICADORES Y ETC >


//<VARIOS>
COMILLAS : '"';
PUNTO : '.';
COMA : ',';
PUNTOYCOMA : ';';
RETURN : 'return';
DEFINE : 'define';
STRUCT : 'struct';
CONST : 'const';
SIZEOF : 'sizeof';
STATIC : 'static';
COMENTARIOSIMPLE : '//';
COMENTARIOCOMP1 : '/*';
COMENTARIOCOMP2 : '*/';

//</VARIOS>

si : declaracionv | ;

//<DECLARACION VARIABLE>
declaracionv : TIPODATO ID IGUAL (dato|ID) PUNTOYCOMA declaracionv
            | TIPODATO ID seq PUNTOYCOMA declaracionv
            | <EOF>;

seq : COMA ID seq| ;

dato : (ENTERO | FLOTANTE) | ;

CONS: ([0-9])+;
FLOT: CONS '.' | CONS '.' CONS | '.' CONS;
BOL: 'true' | 'false';
STR: ([a-zA-Z])+;

num: (CONS | FLOT);

val: num | STR;

vtype: (INT | FLOAT | CHAR | BOOL);

dec:
    (INT ID (ASIGN CONS)?
    | FLOAT ID (ASIGN num)?
    | CHAR STR (ASIGN STR)?
    | BOOL STR (ASIGN BOL)?);

asig: STR ASIGN (val | BOL);

operator: (LESS | PLUS | DIVIDE | MULTIPLY);

operation:
    (STR PLUS PLUS
    | STR LESS LESS
    | STR operator ASIGN val
    | STR ASIGN val operator val);

condition:
    ((val | BOL) EQUALS (val | BOL)
     | (val | BOL)  

ftype: (FLOAT | INT | CHAR | BOOL | VOID);

arg: (TIPODATO ID COLON arg | TIPODATO STR | );

func: STR LPAREN arg RPAREN; asdsad ( int x , int y )

funcd: ftype func; void asdasd ( int x ) 

if: IF LPAREN 

instr: (def | asig | operation | func | funcd) instr;

instruction: 
    (instr SEMICOLON instruction
    | <EOF>
    | );
