/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 *
 * @author gframirez
 */
/**
 * This class provides an empty implementation of {@link sintaxCListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */

public class sintaxCCustomListener extends sintaxCBaseListener{
    private int cantidadNodos;
    
    public sintaxCCustomListener () {
        cantidadNodos = 0;
    }
    
    @Override public void enterInstructions(@NotNull sintaxCParser.InstructionsContext ctx) {
        System.out.println("Entrando a nodo Instr");
        cantidadNodos++;
    }
//    @Override public void exitVarDeclaration(@NotNull sintaxCParser.VarDeclarationContext ctx) {
//        System.out.println("Entrando a nodo VarDeclaration");
//        System.out.println(ctx.getText()); 
//    }
    
    @Override 
    public void exitSemicolon(sintaxCParser.SemicolonContext ctx) { 
        if(ctx.SEMI()!=null){
            if(!ctx.SEMI().getText().equals(";")){ //Si esta, devuelve ";", sino "<missing ';'>"... Comparamos negativamente
             System.out.println("Error sintáctico: Falta punto y coma.(Linea "+ctx.getParent().start.getLine()+")");
            }
        }
    }    
    
   
    @Override
    public void visitTerminal(@NotNull TerminalNode node) {
//        System.out.println(node);
    }
    
    @Override
    public String toString () {
        return "Soy sintaxCCustomListener y he visitado " + cantidadNodos + " nodos";
    }
}
