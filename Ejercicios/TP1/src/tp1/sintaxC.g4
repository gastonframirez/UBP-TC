/*
 * Creado por: Gaston F. Ramirez
 * Año: 2018
 * Materia: Técnicas de Compilación
 */
 
 
/*
    - Declaracion de variables (int, double, char) 
        - 1 var
        - m variables --> lista de variables (var1, var2, var3)
        - 1 var con asignacion
        - m variables con asignacion (var1 = 2, var2 = 1, ...)
        
    - Prototipo de funcion
        - sin argumentos
        - 1 argumento
        - n argumento
        
    Utilizando los símbolos del Analizador Léxico que venimos trabajando, se pide realizar las 
    Reglas Gramaticales de un lenguaje C reducido considerando lo siguiente:

    - Declaraciones de datos
    - Funciones, sus prototipos y return
    - Asignaciones (solo operaciones aritméticas)
    
    ACLARACIÓN: Las instrucciones son una única instrucción o un bloque de instrucciones encerradas entre llaves. 
*/

grammar sintaxC;


// Lista de TOKENS
WS: [ \n\t\r] -> skip;


//Tipos
INT: 'int';
DOUBLE: 'double';
CHAR: 'char';
VOID: 'void';

//Palabras C++
RETURN: 'return';

// Punctuation marks
SEMICOLON: ';';
COMMA: ',';


//Simbolos Extra
OPAR: '('; //Token de Parentesis de apertura
CPAR: ')'; //Token de Parentesis de cierre

OBRACE: '{'; //Token de Llave de apertura
CBRACE: '}'; //Token de Llave de cierre
 
OBRACKET: '['; //Token de Corchete de apertura
CBRACKET: ']'; //Token de Corchete de cierre

ASSIGN: '=';

//valores
FLOATNUMBER: INTNUMBER '.' | INTNUMBER '.' INTNUMBER | '.' INTNUMBER;
INTNUMBER: (DIGIT)+;

DIGIT: [0-9];

fragment LETTER : [a-zA-Z] ;
ID : ('_' | LETTER) ('_' | LETTER | DIGIT)*;

CHARVALUE: '\'' LETTER '\'';

//OPERACIONES
PLUS: '+';
LESS: '-';
DIVIDE: '/';
MULTIPLY: '*';
MODULUS: '%';
INCREMENT: PLUS PLUS;
DECREMENT: LESS LESS;
                           
// int a;
// int a,b,c;
// declaracion: tipo + id + (',' id)*

// int a = 0;
// int a = 0, b = 1, c = 2;
// char d = 'a';
// float e = 1.002;

// declaracion: tipo + asignacion + (',' asignacion)*
// asignacion: id + = + valor
// RECURSIVO LO DEL MEDIO ENTRE TIPO Y ;


//Lista de reglas gramaticales
prog: instructions
    |
    ;

instructions: instr instructions
            | instBlock instructions
            |
            ;

instr: varDeclaration
     | funcProtDec
     | function
     | aritAssignment
     | returnStatement
     | functionCall
     ;

instBlock: OBRACE instructions CBRACE;


type: INT 
    | DOUBLE 
    | CHAR;

functype: INT 
        | DOUBLE 
        | CHAR 
        | VOID;

value: INTNUMBER 
     | FLOATNUMBER 
     | CHARVALUE
     ;

varDeclaration: type idsList SEMICOLON;

idsList: ID assignment idsList //si ASIGNACION? --> otra regla que controle y tenga vacio
       | COMMA ID assignment idsList
       |
       ;                

assignment: ASSIGN value
          | 
          ;


funcPrototype: functype ID OPAR listDeclarationFunc CPAR;
funcProtDec: funcPrototype SEMICOLON;

listDeclarationFunc: type ID assignment listDeclarationFunc
                   | COMMA type ID assignment listDeclarationFunc
                   |
                   ;

returnStatement: RETURN SEMICOLON
               | RETURN value SEMICOLON
               | RETURN ID SEMICOLON
               ;
 
function: funcPrototype instBlock;


functionCall: ID OPAR listFunctValues CPAR SEMICOLON;

listFunctValues: value listFunctValues
               | COMMA value listFunctValues
               |
               ;

operator: LESS | PLUS | DIVIDE | MULTIPLY | MODULUS ;


//Operacion aritmetica:
aritAssignment: ID ASSIGN exp SEMICOLON
              | type ID ASSIGN exp SEMICOLON;

exp: expression;

expression: term expression
 | 
 ;

term: operator term
 | factor
 ;

factor: value
      | ID
      ;