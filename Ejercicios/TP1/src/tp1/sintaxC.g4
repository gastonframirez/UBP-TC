/*
 * Creado por: Gaston F. Ramirez
 * Año: 2018
 * Materia: Técnicas de Compilación
 */
 
 
/*
    Dado un archivo de entrada en lenguaje C, se debe generar como salida el Árbol Sintáctico (ANTLR) correcto. 
    Para lograr esto se debe construir un parser que tenga como mínimo la implementación de los siguientes puntos:
        - Reconocimiento de un bloque de código, que puede estar en cualquier parte del código fuente, controlando balance de llaves.
        - Verificación de :
            - declaraciones y asignaciones, 
            - operaciones aritmético/lógicas, 
            - declaración/llamada a función.

        - Verificación de las estructuras de control if, for y while. 
    Ante el primer error léxico o sintáctico el programa deberá terminar.
*/

grammar sintaxC;


// Lista de TOKENS

// Caracteres especiales
WS: [ \n\t\r] -> skip;


//TOKENS de palabras reservadas de tipos
INT: 'int';
DOUBLE: 'double';
CHAR: 'char';
VOID: 'void';


// TOKENS de palabras reservadas 
IF : 'if';
ELSE : 'else';
RETURN: 'return';
TRUE: 'true';
FALSE: 'false';


// TOKENS de palabras reservadas de ciclos
WHILE : 'while';
FOR : 'for';




// TOKENS de simbolos de puntuacion
SEMI: ';';
COMMA: ',';


//TOKENS de Simbolos
OPAR: '('; //Token de Parentesis de apertura
CPAR: ')'; //Token de Parentesis de cierre

OBRACE: '{'; //Token de Llave de apertura
CBRACE: '}'; //Token de Llave de cierre
 
OBRACKET: '['; //Token de Corchete de apertura
CBRACKET: ']'; //Token de Corchete de cierre

// TOKENS de Asignaciones
ASSIGN: '=';
MULTIPLYASSIGN: '*=';
DIVIDEASSIGN: '/=';
MODULUSASSIGN: '%=';
PLUSASSIGN: '+=';
MINUSASSIGN: '-=';

// TOKENS de Operaciones Aritmeticas
PLUS: '+';
LESS: '-';
DIVIDE: '/';
MULTIPLY: '*';
MODULUS: '%';
PLUSPLUS: '++';
LESSLESS: '--';
QUESTION: '?';
          
// TOKENS de Operaciones Logicas
OR : '||';
AND : '&&';
NOT : '!';


// TOKENS de operaciones relacionales
EQUAL : '==';
NOTEQUAL : '!=';
GREATERTHAN : '>';
LESSTHAN : '<';
GREATERTHANEQUAL : '>=';
LESSTHANEQUAL : '<=';


//TOKENS de valores
fragment DIGIT: [0-9];

//Entero
INTNUMBER: (DIGIT)+;

//Flotante
FLOATNUMBER: INTNUMBER '.' | INTNUMBER '.' INTNUMBER | '.' INTNUMBER;

fragment LETTER : [a-zA-Z] ;
ID : ('_' | LETTER) ('_' | LETTER | DIGIT)*;

CHARVALUE: '\'' LETTER '\'';



//Lista de reglas gramaticales
prog: instructions
       |
       ;

instructions: instructions intr 
            | intr
            ;

intr: varDeclaration
    | funcDeclaration
    ;

//Declaracion de variables
varDeclaration: typeSpecifier varDeclList SEMI;

varDeclList: varDeclList COMMA varDeclInitialize
           | varDeclInitialize
           ;

//Inicializacion de variables
varDeclInitialize: varDeclId
                 | expression
                 ;

varDeclId: ID;

//Tipos de variables
typeSpecifier: INT | DOUBLE | CHAR;

//Tipos de returns
returnTypeSpecifier: INT | DOUBLE | CHAR | VOID;


//Declaracion de funcion
funcDeclaration: returnTypeSpecifier ID OPAR paramList CPAR statement
               | ID OPAR paramList CPAR statement
               ;

paramList: typeSpecifier paramId paramList
         | COMMA typeSpecifier paramId paramList
         |
         ;

paramId: ID;

statement: expressionStatement | instBlock | selectionStatement | iterationStatement | returnStatement | intr;

//Bloque de instrucciones
instBlock: OBRACE statementList CBRACE;

statementList: statement statementList
             | 
             ;

expressionStatement: expression SEMI
                   | SEMI
                   ;

//Seleccion
selectionStatement: IF OPAR simpleExpression CPAR statement
                  | IF OPAR simpleExpression CPAR statement ELSE statement
                  ;

//Ciclos
iterationStatement: whileStatement
                  | forStatement
                  ;
//While
whileStatement: WHILE OPAR simpleExpression CPAR statement;

//For
forStatement: FOR OPAR forDefinition CPAR statement;
forDefinition: forInit SEMI simpleExpression SEMI expression;
forInit: typeSpecifier varDeclList;

//Return
returnStatement: RETURN SEMI
               | RETURN expression SEMI
               ;

// Operadores de asignacion
assignmentOperator:  ASSIGN | MULTIPLYASSIGN | DIVIDEASSIGN | MODULUS | PLUSASSIGN | MINUSASSIGN;

expression : mutable assignmentOperator expression 
           | mutable PLUSPLUS 
           | mutable LESSLESS 
           | simpleExpression
           ;

simpleExpression: simpleExpression OR andExpression
                | andExpression
                ;

andExpression: andExpression AND unaryRelExpression
             | unaryRelExpression
             ;

unaryRelExpression: NOT unaryRelExpression
                  | relExpression
                  ;

relExpression: sumExpression relationalOperator sumExpression
             | sumExpression
             ;

// Operadores relacionales
relationalOperator: EQUAL
                  | NOTEQUAL
                  | GREATERTHAN
                  | GREATERTHANEQUAL
                  | LESSTHAN
                  | LESSTHANEQUAL
                  ;
// Suma Aritmetica
sumExpression: sumExpression arithSumOperator term
             | term
             ;

// Operadores de suma aritmetica
arithSumOperator: PLUS | LESS ;

// Multiplicacion aritmetica
term: term arithMultOperator unaryExpression
    | unaryExpression
    ;

// Operadores de multiplicacion aritmetica
arithMultOperator: MULTIPLY | DIVIDE | MODULUS;

// Operacion unaria
unaryExpression: unaryOperator unaryExpression
               | factor
               ;

// Operadores unarios
unaryOperator: LESS | MULTIPLY | QUESTION ;

factor: immutable 
      | mutable;

mutable: ID;

immutable: OPAR expression CPAR 
         | call
         | value
         ;

// Llamada a funcion
call: ID OPAR args CPAR;

// Argumentos de funcion
args: argList
    |
    ;
// Lista de argumentos de funcion
argList: argList COMMA expression
       | expression
       ;

// Valores posibles
value: INTNUMBER 
     | FLOATNUMBER 
     | CHARVALUE
     | TRUE
     | FALSE
     ;
