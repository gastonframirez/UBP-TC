/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

grammar reglasANTLR;

@header{
        package ParserCompilable;
        }

PA : '(';
PC : ')';

BA : '[';
BC : ']';

fragment DIGITO : [0-9];
ENTERO : DIGITO+;
fragment LETRA : [a-zA-Z] ;
ID : (LETRA | '_')(LETRA | DIGITO | '_')*;

WS : [ \n\t\r]+ -> skip;


entrada : s EOF ;

s : PA { System.out.println("Apertura de Parentesis"); } s
         PC { System.out.println("Cierre de Parentesis"); } s
  | BA { System.out.println("Apertura de Corchetes"); } s
         BC { System.out.println("Cierre de Corchetes"); } s
  | ENTERO { System.out.println("Valor numerico"); } s
  | ID { System.out.println("Identificador"); } s
  |
  ;

