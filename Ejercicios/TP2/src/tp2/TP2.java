/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2;

import java.io.FileInputStream;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 *
 * @author gframirez
 */
public class TP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{            
            
        String testCasePath = "/Users/gframirez/Documents/UBP/Q9/TC/Ejercicios/TP2-MG/src/tp2/testCases/";
        // create a CharStream that reads from file
        ANTLRFileStream input = new ANTLRFileStream(testCasePath+ "prueba.c");

        // create a lexer that feeds off of input CharStream
        sintaxCLexer lexer = new sintaxCLexer(input);

        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // create a parser that feeds off the tokens buffer
        sintaxCParser parser = new sintaxCParser(tokens);
        
        // Creo el objeto que tiene los Listeners
//        reglasANTLRBaseListener escucha = new reglasANTLRBaseListener();
        sintaxCBaseListener escucha = new sintaxCCustomListener();
        
        // Conecto el objeto con Listeners al parser
        parser.addParseListener(escucha);
        
        // Solicito al parser que comience indicando una regla gramatical
        // En este caso la regla es el simbolo inicial
        ParseTree tree = parser.prog();
        
        // Imprime estadisticas
        System.out.println(escucha);
        // Imprime el arbol obtenido
        System.out.println(tree.toStringTree(parser));         
        }
        catch(Exception e)
        {
            System.out.println("Error");

            //cualquier error, capturamos la exception.   
            e.printStackTrace();
        }
    }
    
}
