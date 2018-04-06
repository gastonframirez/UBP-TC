/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
 *
 * Escribir las expresiones regulares para detectar: 
 *      Encontrar los artículos con precio entre 100 y 200 pesos.
 *      Encontrar los artículos con códigos 33 a 48.
 *      Encontrar los artículos que incluyan la palabra "zapatero" y no superen los 55 pesos.
 *      Encontrar los artículos de "navidad" con precio superior a 99 pesos.
 *      Encontrar los artículos que contengan las palabras "cupcake", "peace", "barbi" o "retrato".
 */

grammar ejercitacion3;

fragment NL : '\n';

// Encontrar los artículos con precio entre 100 y 200 pesos.
fragment DIGITO : [0-9];
fragment CHAR : [A-Za-z0-9] | '/' | ',' | ' ' | '"' | 'º' | '-';
//PRECIO_100_200 : CHAR* '"'(('1' DIGITO DIGITO',' DIGITO DIGITO) | '200,00')'"';

// Encontrar los artículos con códigos 33 a 48.
fragment IND_COD : 'a'|'c'|'co-'|'v-'|'e-'|'p''-'?|'n-'|'m-'|'mi-'|'t'|'fl'|'s'|'st'|'B'|'CO-'|'A'|'BAT'|'FL'|'letc';
fragment LETRA : [A-Za-z];
COD_33_48 : IND_COD ('3'[3-9] | '4'[0-8]) ' '? LETRA* ',' CHAR* ;

// Encontrar los artículos que incluyan la palabra "zapato" y no superen los 55 pesos.
fragment PRECIO_55 : '"'(((DIGITO | [1-4] DIGITO | '5'[0-4])',' DIGITO DIGITO) | '55,00')'"';
//ZAPATO : CHAR* 'zapato' CHAR* ',' PRECIO_55 ;

// Encontrar los artículos de "navidad" con precio superior a 99 pesos.
fragment PRECIO_100 : '"'[1-9] DIGITO DIGITO (DIGITO+)? ',' DIGITO DIGITO'"';
//NAVIDAD : CHAR* 'navid' CHAR* ',' PRECIO_100 ;

// ncontrar los artículos que contengan las palabras "cupcake", "peace", "barbi" o "retrato".
fragment CONJPALABRAS : ('c' | 'C')'upcake' | ('p' | 'P')'eace' | ('b' | 'B')'arbie' | ('r' | 'R')'etrato';
//ARTPALABRAS : CHAR* CONJPALABRAS CHAR* ',' '"' DIGITO+ ',' DIGITO DIGITO '"' ;
