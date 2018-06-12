/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ParserCompilable;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 *
 * @author meschoyez
 */
public class MiListener extends reglasANTLRBaseListener {
    private int cantidadNodos;
    
    public MiListener () {
        cantidadNodos = 0;
    }
    
    @Override public void enterS(@NotNull reglasANTLRParser.SContext ctx) {
        System.out.println("Entrando a nodo S");
        cantidadNodos++;
    }

    @Override public void exitS(@NotNull reglasANTLRParser.SContext ctx) {
        System.out.println("Saliendo de nodo S");
    }

    @Override
    public void visitTerminal(@NotNull TerminalNode node) {
        System.out.println("Encontre el terminal " + node.getSymbol() );
        System.out.println("    '--> Texto del terminal " + node.getSymbol().getText() );
        System.out.println("    '--> Tipo de terminal " + node.getSymbol().getType() );
    }

    
    @Override
    public String toString () {
        return "Soy MiListener y he visitado " + cantidadNodos + " nodos";
        
    }
}
