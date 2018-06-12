/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2v3;

import java.io.FileInputStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 *
 * @author Ramiro
 */
public class Tp2v3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{            
            //levantamos el archivo a procesar
            FileInputStream stream=new FileInputStream("/Users/gframirez/Documents/UBP/Q9/TC/Ejercicios/TP2-MG/src/tp2/testCases/prueba.c");
            //creamos un ANTLRInputStream pasándole el stream del archivo
            ANTLRInputStream antlrStream=new ANTLRInputStream(stream);
            //Creamos un lexer
            tp2v3Lexer lexer=new tp2v3Lexer(antlrStream);
            //levantamos los tokens
            CommonTokenStream tokens=new CommonTokenStream(lexer);
            //Creamos el parser
            tp2v3Parser parser=new tp2v3Parser(tokens);
            //Instanciamos la clase que implementa el escuchas
            tp2v3BaseListener listener = new tp2v3BaseListener();
            //le pasamos al parser el listener (podríamos manejar varios escuchas).
            parser.addParseListener(listener);
            //Armamos un árbol iniciando el proceso. para esto el generador 
            //de código crea un método dentro del parser con el nombre del símbolo 
            //inicial. Debemos invocar ese método.
            System.out.println("antes de parseTree");
            ParseTree tree = parser.instruccion();
            System.out.println("primera instruccion");
            //Podríamos imprimir el árbol por consola.
            
            System.out.println("entro al try 2.0");
            
            System.out.println("arbol:"+tree.toStringTree(parser));
            
        }
        catch(Exception e)
        {
            System.out.println("entro al catch: errores");

            //cualquier error, capturamos la exception.   
            e.printStackTrace();
        }
    }
    
}
