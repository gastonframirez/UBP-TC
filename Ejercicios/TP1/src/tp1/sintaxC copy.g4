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
WS: [ \n\t\r] -> skip;


//Tipos
INT: 'int';
DOUBLE: 'double';
CHAR: 'char';
VOID: 'void';

//Palabras C++
RETURN: 'return';

// Punctuation marks
SEMI: ';';
COMMA: ',';


//Simbolos Extra
OPAR: '('; //Token de Parentesis de apertura
CPAR: ')'; //Token de Parentesis de cierre

OBRACE: '{'; //Token de Llave de apertura
CBRACE: '}'; //Token de Llave de cierre
 
OBRACKET: '['; //Token de Corchete de apertura
CBRACKET: ']'; //Token de Corchete de cierre

// Asignaciones
ASSIGN: '=';
MULTIPLYASSIGN: '*=';
DIVIDEASSIGN: '/=';
MODULUSASSIGN: '%=';
PLUSASSIGN: '+=';
MINUSASSIGN: '-=';

// Operaciones Aritmeticas
PLUS: '+';
LESS: '-';
DIVIDE: '/';
MULTIPLY: '*';
MODULUS: '%';
PLUSPLUS: '++';
LESSLESS: '--';
QUESTION: '?';
          
// Operaciones Logicas
OR : '||';
AND : '&&';
NOT : '!';


// Ciclos
WHILE : 'while';
FOR : 'for';

// Condiciones
IF : 'if';
ELSE : 'else';

// Comparaciones logicas
EQUAL : '==';
NOTEQUAL : '!=';
GREATERTHAN : '>';
LESSTHAN : '<';
GREATERTHANEQUAL : '>=';
LESSTHANEQUAL : '<=';



//valores
TRUE: 'true';
FALSE: 'false';

FLOATNUMBER: INTNUMBER '.' | INTNUMBER '.' INTNUMBER | '.' INTNUMBER;
INTNUMBER: (DIGIT)+;

DIGIT: [0-9];

fragment LETTER : [a-zA-Z] ;
ID : ('_' | LETTER) ('_' | LETTER | DIGIT)*;

CHARVALUE: '\'' LETTER '\'';



//Lista de reglas gramaticales
prog: instructions
    |
    ;

instructions: instructions declaration 
            | declaration
            ;

declaration: varDeclaration
           | funcDeclaration
           ;

varDeclaration: typeSpecifier varDeclList SEMI;

scopedVarDeclaration: scopedTypeSpecifier varDeclList SEMI;

varDeclList: varDeclList COMMA varDeclInitialize
           | varDeclInitialize
           ;

varDeclInitialize: varDeclId
                 | expression
                 ;

varDeclId: ID;

scopedTypeSpecifier: typeSpecifier;

typeSpecifier: INT | DOUBLE | CHAR;

returnTypeSpecifier: INT | DOUBLE | CHAR | VOID;

funcDeclaration: returnTypeSpecifier ID OPAR params CPAR statement
               | ID OPAR params CPAR statement
               ;

params: paramList
      |
      ;

paramList: paramList SEMI paramTypeList
         | paramTypeList
         ;

paramTypeList: typeSpecifier paramIdList;

paramIdList: paramIdList COMMA paramTypeList
           | paramIdList COMMA paramId
           | paramId
           ;

paramId: ID;

statement: expressionStmt | compoundStmt | selectionStmt | iterationStmt | returnStmt;

compoundStmt: OBRACE localDeclarations statementList CBRACE;

localDeclarations: localDeclarations scopedVarDeclaration
                 |
                 ;

statementList: statementList statement
             |
             ;

expressionStmt: expression SEMI
              | SEMI
              ;

selectionStmt: IF OPAR simpleExpression CPAR statement
             | IF OPAR simpleExpression CPAR statement ELSE statement
             ;

iterationStmt: whileStmt
             | forStmt
             ;

whileStmt: WHILE OPAR simpleExpression CPAR statement;

forStmt: FOR OPAR forDefinition CPAR statement;

forDefinition: forInit SEMI simpleExpression SEMI expression;

forInit: scopedTypeSpecifier varDeclList;

returnStmt: RETURN SEMI
          | RETURN expression SEMI
          ;

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

relationalOperator: EQUAL
                  | NOTEQUAL
                  | GREATERTHAN
                  | GREATERTHANEQUAL
                  | LESSTHAN
                  | LESSTHANEQUAL
                  ;

sumExpression: sumExpression arithSumOperator term
             | term
             ;

arithSumOperator: PLUS | LESS ;

term: term arithMultOperator unaryExpression
    | unaryExpression
    ;

arithMultOperator: MULTIPLY | DIVIDE | MODULUS;

unaryExpression: unaryOperator unaryExpression
               | factor
               ;

unaryOperator: LESS | MULTIPLY | QUESTION ;

factor: immutable 
      | mutable;

mutable: ID;

immutable: OPAR expression CPAR 
         | call
         | constant
         ;

call: ID OPAR args CPAR;

args: argList
    |
    ;

argList: argList COMMA expression
       | expression
       ;

value: INTNUMBER 
     | FLOATNUMBER 
     | CHARVALUE
     ;

constant: value | TRUE | FALSE;