/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ParserCompilable;

import java.io.IOException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 *
 * @author meschoyez
 */
public class ParserCompilable {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        // create a CharStream that reads from file
        ANTLRFileStream input = new ANTLRFileStream("paraParsear.txt");

        // create a lexer that feeds off of input CharStream
        reglasANTLRLexer lexer = new reglasANTLRLexer(input);

        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // create a parser that feeds off the tokens buffer
        reglasANTLRParser parser = new reglasANTLRParser(tokens);
        
        // Creo el objeto que tiene los Listeners
//        reglasANTLRBaseListener escucha = new reglasANTLRBaseListener();
        reglasANTLRBaseListener escucha = new MiListener();
        
        // Conecto el objeto con Listeners al parser
        parser.addParseListener(escucha);
        
        // Solicito al parser que comience indicando una regla gramatical
        // En este caso la regla es el simbolo inicial
        ParseTree tree = parser.entrada();
        
        // Imprime estadisticas
        System.out.println(escucha);
        // Imprime el arbol obtenido
        System.out.println(tree.toStringTree(parser)); 
    }
    
}
