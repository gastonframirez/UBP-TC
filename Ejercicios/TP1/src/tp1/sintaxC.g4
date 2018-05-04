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

ASSIGN: '=';

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
     | funcProtDec
     | function
     | aritAssignment SEMICOLON
     | returnStatement
     | functionCall
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

assignmentOperator:   '=' | '*=' | '/=' | '%=' | '+=' | '-=';

assignment: assignmentOperator exp
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

listFunctValues: factor listFunctValues
               | COMMA factor listFunctValues
               |
               ;

operator: LESS | PLUS | DIVIDE | MULTIPLY | MODULUS;


//Operacion aritmetica:
aritAssignment: ID assignmentOperator exp
              | type ID assignmentOperator exp
              ;

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

ifStatement: IF OPAR condList CPAR (instr | instBlock) (elseStatement)?;

elseStatement: ELSE (instr | instBlock);

condList: condition
     | condition AND condList
     | condition OR condList;

condition: b_exp relationalOperator b_exp;

relationalOperator: EQUAL
                  | NOTEQUAL
                  | GREATERTHAN
                  | GREATERTHANEQUAL
                  | LESSTHAN
                  | LESSTHANEQUAL
                  ;

b_exp: boolean_expression;

boolean_expression: boolean_term boolean_expression
 | 
 ;

boolean_term: relationalOperator boolean_term
 | factor
 | term
 ;


//Increment Operations
incrementStatement: ID INCREMENT
                  | ID DECREMENT
                  | aritAssignment
                  ;

forStatement: FOR OPAR forDefinition CPAR instBlock;
forDefinition: init SEMICOLON condList SEMICOLON incrementStatement;

whileStatement: WHILE OPAR condList CPAR instBlock;