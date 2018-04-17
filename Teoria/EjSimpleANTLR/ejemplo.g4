/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/* Instalar ANTLR en Linux
 *
 * Como 'root' o con 'sudo'
 *      # cd /usr/local/lib
 *      # wget http://www.antlr.org/download/antlr-4.5.3-complete.jar
 *
 * Como usuario (se puede incluir en '.bashrc')
 *
 *      $ export CLASSPATH=".:/usr/local/lib/antlr-4.5.3-complete.jar:$CLASSPATH"
 *      $ alias antlr4='java -jar /usr/local/lib/antlr-4.5.3-complete.jar'
 *      $ alias grun='java org.antlr.v4.gui.TestRig'
 *
 * Compilar y Ejecutar el proyecto
 *
 *      $ antlr4 ejemplo.g4
 *      $ javac ejemplo*.java
 *      $ grun ejemplo si [-tree] [-gui] [ < input.txt ]
 *
 * 'si' es el nombre de la regla inicial (simbolo inicial)
 * '-tree' es para generar arbol sintactico como texto
 * '-gui' es para generar arbol sintactico en formato grafico
 * '< input.txt' es para leer el archivo a parsear
 *
 */

grammar prueba1;

@header{
/*  Aqui van los import necesarios
 *
 *      import java.io.*;
 *      import java.util.HashMap;
 */
}

@members{
//  Aqui van las variables y objetos globales

    int intCount = 0, strCount = 0;
}

// Simbolo inicial
si : s { System.out.println("Fin de la regla");
         System.out.println("Enteros = " + intCount);
         System.out.println("Strings = " + strCount); };

/* Entre llaves se puede poner cualquier codigo en Java
 * que se necesite
 */

s : ENTERO { System.out.println("Token ENTERO"); intCount++; } s 
  | ID { System.out.println("Token ID"); strCount++; } s
  |
  ;
  catch [InputMismatchException  e ] {
        System.out.println("caracter desconocido");
        
  }
//   finally { System.out.println("Fin de la regla"); }

fragment DIGITO : [0-9] ;

ENTERO : DIGITO+ ;

LETRA : [A-Za-z] ;

ID : (LETRA | '_') (LETRA | DIGITO | '_')*;

WS : [ \n\u000D] -> skip;
