/*
 * Creado por: Gaston F. Ramirez
 * Año: 2018
 * Materia: Técnicas de Compilación
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
       

operator: LESS | PLUS | DIVIDE | MULTIPLY | MODULUS ;


//Operacion aritmetica:
aritAssignment: ID ASSIGN exp SEMICOLON
              | type ID ASSIGN exp SEMICOLON;

exp: e;

e: t e
 | 
 ;

t: operator t
 | factor
 ;

factor: value
      | ID
      ;