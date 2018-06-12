package ar.edu.ubp.tc;

import java.io.FileInputStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 *
 * @author mauroandres
 */
public class Main {
    
    public static void main(String args[]){
        try{
            //levantamos el archivo a procesar
            FileInputStream stream=new FileInputStream("CodigoFuenteEjemplo.c");
            //creamos un ANTLRInputStream pasándole el stream del archivo
            ANTLRInputStream antlrStream=new ANTLRInputStream(stream);
            //Creamos un lexer
            tp1juarezLexer lexer=new tp1juarezLexer(antlrStream);
            //levantamos los tokens
            CommonTokenStream tokens=new CommonTokenStream(lexer);
            //Creamos el parser
            tp1juarezParser parser=new tp1juarezParser(tokens);
            //Instanciamos la clase que implementa el escuchas
            tp1juarezBaseListener listener = new tp1juarezBaseListener();
            //le pasamos al parser el listener (podríamos manejar varios escuchas).
            parser.addParseListener(listener);
            //Aramamos un árbol iniciando el proceso. para esto el generador
            //de código crea un método dentro del parser con el nombre del símbolo
            //inicial. Debemos invocar ese método.
            ParseTree tree =parser.instruction();
            //Podríamos imprimir el árbol por consola.
            System.out.println("arbol:"+tree.toStringTree(parser));
        }catch(Exception e){
            //cualquier error, capturamos la exception.
            e.printStackTrace();
        }
    }
    
}
