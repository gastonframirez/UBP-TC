/* Alumnos: Macarena Parisi + Gaston Ramirez
 * Trabajo Practico 2 - TC
* El programa a desarrollar tiene como objetivo tomar un archivo de código
* fuente en una versión reducida del lenguaje C y generar como salida el Árbol Sintáctico (ANTLR).
 */

grammar TP2;

//TOKENS//
WS : [\t\r\n ] -> skip; //limpia espacios en blanco y saltos de linea 
COMMENT : '//' .+? ('\n'|EOF) -> skip ;

//Parentesis, corchetes y llaves
PA : '(' ; //Parentesis de apertura
PC : ')' ; //Parentesis de cierre
CA : '[' ; //Corchete de apertura
CC : ']' ; //Corchete de cierre
LA : '{' ; //Llave de apertura
LC : '}' ; //Lave de cierre

//OPERACIONES MATEMATICAS 
MAS : '+';
MENOS : '-';
ASTERISCO : '*';
DIVISION : '/';
MODULO : '%';
MASMAS : '++';
MENOSMENOS : '--';

//ASIGNACIONES
MASIGUAL : '+=';
MENOSIGUAL : '-=';
PORIGUAL : '*=';
BARRAIGUAL : '/=';
MODULOIGUAL : '%=';
IGUAL : '=';

//OPERACIONES LOGICAS
AND : '&&';
OR : '||';
NOT : '!';
TRUE : 'true';
FALSE : 'false';

//COMPARADORES
MAYOR : '>';
MENOR: '<';
IGUALIGUAL : '==';
DISTINTOIGUAL : '!='; 
MAYORIGUAL : '>=';
MENORIGUAL : '<=';

//Tipos de datos
INT : 'int';
CHAR : 'char';
DOUBLE : 'double';
VOID : 'void';

//Condiciones
IF : 'if';
FOR : 'for';
WHILE : 'while';

//VARIOS
COMILLAS : '"';
PUNTO : '.';
COMA : ',';
PUNTOYCOMA : ';';
RETURN : 'return';
THEN : 'then';
ELSE : 'else';

//IDENTIFICADORES Y NUMEROS 
ID : [_A-Za-z] [_A-Za-z0-9]*;
NUMINT :   [0-9]+ ;   
CARACTER : '\u0000'..'\uFFFE' ;
VALORCHAR: '\'' CARACTER '\''  ;
NUMDOUBLE: [-+]? NUMINT '.' NUMINT; 


//REGLAS INICIALES
prog : instrucciones
     ;

instrucciones : inst instrucciones
              | bloque instrucciones
              | //Puede ser un programa vacio
              ;

inst : variables 
     | deffunc
     | llamadafunc
     | returnD
     | definicion
     ; 

bloque : LA instrucciones LC
       ;

//VARIABLES
variables : declaracionv // DECLARACION PURA y DECLARACION Y ASIGNACION
         | asignacionv //ASIGNACION PURA
         ;

semi: PUNTOYCOMA;

declaracionv : tipovar lista semi
            ;               

tipovar : INT | CHAR | DOUBLE ;

lista : ID asignacion lista
       | COMA tipovar? ID asignacion lista //Podemos ponerlo mal a proposito?
       |
       ;

asignacion : assignMode expSimple 
           |
           ;

assignMode : MASIGUAL | MENOSIGUAL | PORIGUAL | BARRAIGUAL | MODULOIGUAL | IGUAL ;

//Expresiones matematicas y logicas
expresion : ID assignMode expresion
          | ID MASMAS
          | ID MENOSMENOS
          | expSimple
          ;

//Expresiones logicas (AND, OR, NOT)
expSimple : expSimple OR exprAND 
          | exprAND
          ;

exprAND : exprAND AND exprNOT
        | exprNOT
        ;

exprNOT : NOT exprNOT
        | exprRelacional 
        ;

//Expresiones relacionales (>, < , >=, <=, =)
exprRelacional : termino comparadores termino
               | termino
               ;

comparadores : MAYOR | MENOR | IGUALIGUAL | MAYORIGUAL | MENORIGUAL | DISTINTOIGUAL;

//Expresiones matematicas
termino : termino operadores termino
        | factor
        ;
       
operadores : MAS | MENOS | ASTERISCO | DIVISION | MODULO ;

factor : valores 
       | ID
       ;

valores: PA expresion PC //Ver recursion izq
         | llamadafunc
         | valorvar
         ;

valorvar : NUMINT | VALORCHAR | NUMDOUBLE | TRUE | FALSE ;

//ASIGNACION PURA
asignacionv : lista semi
            ;

//funciones
tipofunc: INT | CHAR | DOUBLE | VOID ;


parentesisAp: PA?;

//Delcaracion y definicion de funciones
deffunc : tipofunc ID parentesisAp declaracionfunc PC definicion
        | ID parentesisAp declaracionfunc PC definicion
        ;

declaracionfunc : tipovar ID declaracionfunc
                  |   COMA tipovar ID declaracionfunc
                  |
                  ;

definicion : expresionDef
           | bloque
           | expresionIF
           | expresionWHILE
           | expresionFOR
           | returnD
           ;

expresionDef : expresion semi
             | semi
             ;



expresionIF : IF parentesisAp expSimple PC definicion
            | IF parentesisAp expSimple PC definicion ELSE definicion
            ;

expresionWHILE : WHILE parentesisAp expSimple PC definicion
               ;

expresionFOR : FOR parentesisAp loopCtrl PC definicion///COMPLETAR//////
             ;

loopCtrl : loopInit loopCond loopIncr
         ;

loopInit : declaracionv
         ;

loopCond : expSimple PUNTOYCOMA
         ;

loopIncr : expresion
         ;

//Llamadas funciones
llamadafunc : ID parentesisAp argumentos PC
            ;

argumentos : listaArgs
           |
           ;

listaArgs : listaArgs COMA expresion 
        | expresion 
        ;

//Return
returnD : RETURN expresion semi
        | RETURN semi
       ;
