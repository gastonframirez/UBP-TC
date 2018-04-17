/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

grammar grammarBalance;

// Lista de TOKENS
WS: [ \n\t\r] -> skip; //Saltea los caracteres no deseados

OPAR: '('; //Token de Parentesis de apertura
CPAR: ')'; //Token de Parentesis de cierre

OBRACE: '{'; //Token de Llave de apertura
CBRACE: '}'; //Token de Llave de cierre
 
OBRACKET: '['; //Token de Corchete de apertura
CBRACKET: ']'; //Token de Corchete de cierre


//Reglas gramaticales
si: s { System.out.println("Fin de la regla"); }; //Regla inicial
       
s: OPAR s CPAR { System.out.println("Parentesis abierto y cerrado"); } s  //Controla apertura y cierre de parentesis
 | OBRACE s CBRACE { System.out.println("Llaves abierta y cerrada"); } s //Controla apertura y cierre de llaves
 | OBRACKET s CBRACKET { System.out.println("Corchetes abierto y cerrado"); } s  //Controla apertura y cierre de corchetes.
 | 
 ;

