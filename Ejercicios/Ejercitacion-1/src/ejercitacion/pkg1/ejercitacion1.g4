/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * Los números de DNI entre 32800000 y 35300000.
 * Los apellidos que comienzan con las letras G a la N. 
 * Los estudiantes con apellidos que comienzan con una vocal y el número de DNI comienza con 33 a 37.
 */

grammar ejercitacion1;


// Los números de DNI entre 32800000 y 35300000.
fragment DIGITO : [0-9] ;
DNI : '3'(( '2'[8-9] | [3-4][0-9] | '5'[0-2] ) DIGITO DIGITO DIGITO DIGITO DIGITO | '5''3''0''0''0''0''0' );

// Los apellidos que comienzan con las letras G a la N.
fragment LETRA : [A-Z] ;
fragment PALABRA : LETRA+;
APELLIDO : '\t' [G-N] LETRA+ ' '? PALABRA? '¸';

// Los estudiantes con apellidos que comienzan con una vocal y el número de DNI comienza con 33 a 37.
fragment DNI_33_37 : '3'[3-7] DIGITO DIGITO DIGITO DIGITO DIGITO DIGITO '\t';
fragment APELLIDO_VOCAL : ('A'|'E'|'I'|'O'|'U')LETRA+' '? PALABRA? '¸';

ESTUDIANTE :  DNI_33_37 APELLIDO_VOCAL;

s:  DNI { System.out.println("DNI Encontrado"); } s
    |  APELLIDO { System.out.println("Apellido entre G y N Encontrado"); } s
    |  ESTUDIANTE { System.out.println("Estudiante con DNI que entre 33 y 37 y apellido con vocal"); } s
    |
 ;