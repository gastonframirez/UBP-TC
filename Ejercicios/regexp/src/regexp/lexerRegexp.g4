/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
lexer grammar lexerRegexp;


fragment DIGITO : [0-9] ;
ENTERO : [-+]? DIGITO+ ;
FLOAT : [-+]? ENTERO '.' ENTERO;

fragment LETRA : [a-zA-Z] ;
ID : ('_' | LETRA) ('_' | LETRA | DIGITO)*;


OPMAT :  (ENTERO | FLOAT | ID) ([ ]* [-+/*%] [ ]* '('? [ ]* (ENTERO | FLOAT | ID) [ ]* ')'?)+;

OPLOG: (ENTERO | FLOAT | ID) ([ ]* ['<''>''==''>=''<=''!='] [ ]* (ENTERO | FLOAT | ID))+;