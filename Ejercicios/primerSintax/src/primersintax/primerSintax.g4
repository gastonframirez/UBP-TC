/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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

grammar primerSintax;


// Lista de TOKENS
WS: [ \n\t\r] -> skip;


//Tipos
INT: 'int';
DOUBLE: 'double';
CHAR: 'char';
VOID: 'void';
//C++
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
//UNICODE: '\u0000'..'\uFFFE';
//CHARVALUE: '\''UNICODE'\'';

fragment LETTER : [a-zA-Z] ;
ID : ('_' | LETTER) ('_' | LETTER | DIGIT)*;



                           
//Lista de reglas gramaticales
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

prog: instructions
    |
    ;

instructions: instr instructions
            |
            ;

instr: varDeclaration
     | funcProtDec
     | function
     ;


type: INT 
    | DOUBLE 
    | CHAR;

functype: type 
        | VOID;

value: INTNUMBER 
     | FLOATNUMBER 
 //    | CHARVALUE
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
 
function: funcPrototype OBRACE instructions returnStatement CBRACE;
          