/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
 *
 * Escribir las expresiones regulares para detectar: 
 *      Direcciones IPv4.
 *      URLs para los protocolos HTTP y HTTPS
 *      Direcciones de correo electrónic
 */

grammar ejercitacion2;


fragment DOT : '.';

// Direcciones IPv4.
fragment IPv4SEG : ('1'[0-9][0-9]) | ('2'[0-4][0-9]) | ('2''5'[0-5]) | ([1-9]?[0-9]);         
IPv4 : IPv4SEG DOT IPv4SEG DOT IPv4SEG DOT IPv4SEG;

// URLs para los protocolos HTTP y HTTPS
fragment LETRA : [A-Za-z] ;
fragment DIGITO : [0-9];

fragment URLSEG : (LETRA|DIGITO)(LETRA|DIGITO|'_'|'-')*;
fragment URL : URLSEG (DOT URLSEG)*;

fragment HTTP : 'http://';
fragment HTTPS : 'https://';

URLHTTP : HTTP URL;
URLHTTPS : HTTPS URL;

// Direcciones de correo electrónico
EMAIL : URL '@' URL;

WS : [ \n\t\r]+ -> skip;

s:      IPv4 { System.out.println("IPv4 Encontrada"); } s
    |   URLHTTP { System.out.println("URL http Encontrado"); } s
    |   URLHTTPS { System.out.println("URL https Encontrado"); } s
    |   EMAIL { System.out.println("Mail Encontrado"); } s
    |   WS  {System.out.println("En Blanco"); } s
    |
 ;