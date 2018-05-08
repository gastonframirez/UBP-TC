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
SEMICOLON: ';';
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
INCREMENT: PLUS PLUS;
DECREMENT: LESS LESS;

          
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

instructions: instr instructions
            | instBlock instructions
            |
            ;

instr: varDeclaration SEMICOLON
     | funcPrototype SEMICOLON
     | function
     | aritAssignment SEMICOLON
     | returnStatement
     | functionCall
     | incrementStatement SEMICOLON
     | ifStatement
     | forStatement
     | whileStatement
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


init: varDeclaration
    | idsList
    ;

varDeclaration: type idsList;

idsList: ID assignment idsList //si ASIGNACION? --> otra regla que controle y tenga vacio
       | COMMA ID assignment idsList
       |
       ;                

assignmentOperator:  ASSIGN | MULTIPLYASSIGN | DIVIDEASSIGN | MODULUS | PLUSASSIGN | MINUSASSIGN;

assignment: assignmentOperator expression
          | 
          ;


funcPrototype: functype ID OPAR listArgumentsFunc CPAR;
//funcProtDec: funcPrototype SEMICOLON;

listArgumentsFunc: type ID assignment listArgumentsFunc
                   | COMMA type ID assignment listArgumentsFunc
                   |
                   ;

returnStatement: RETURN SEMICOLON
               | RETURN value SEMICOLON
               | RETURN ID SEMICOLON
               ;
 
function: funcPrototype instBlock;


functionCall: ID OPAR listValuesArguments CPAR SEMICOLON;

listValuesArguments: factor listValuesArguments
               | COMMA factor listValuesArguments
               |
               ;

operator: LESS | PLUS | DIVIDE | MULTIPLY | MODULUS;


//Operacion aritmetica:
aritAssignment: ID assignmentOperator expression
              | type ID assignmentOperator expression
              ;

expression: arithExpression;

arithExpression: term arithExpression
 | 
 ;

term: operator term
 | factor
 ;

factor: value
      | ID
      ;

ifStatement: IF OPAR logic_exp CPAR (instr | instBlock) (elseStatement)?;

elseStatement: ELSE (instr | instBlock);

relationalOperator: EQUAL
                  | NOTEQUAL
                  | GREATERTHAN
                  | GREATERTHANEQUAL
                  | LESSTHAN
                  | LESSTHANEQUAL
                  ;


relationalExpression: relationalOperator relationalExpression
              | factor //ACA VA EL DE RELACION ARITMETICA
              ;

logic_exp: logicExpression;

logicExpression: logic_term logicExpression
 |
 ;

logic_term: logicOperator logic_term
 | relationalExpression
 ;

logicOperator: AND | OR | NOT;

//Loops
forStatement: FOR OPAR forDefinition CPAR instBlock;
forDefinition: init SEMICOLON logic_exp SEMICOLON incrementStatement;

whileStatement: WHILE OPAR logic_exp CPAR instBlock;


//Increment Operations
incrementStatement: ID INCREMENT
                  | ID DECREMENT
                  | aritAssignment
                  ;