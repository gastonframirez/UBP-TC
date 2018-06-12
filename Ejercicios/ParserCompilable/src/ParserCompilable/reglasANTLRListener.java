// Generated from /Users/gframirez/Documents/UBP/Q9/TC/Ejercicios/ParserCompilable/src/ParserCompilable/reglasANTLR.g4 by ANTLR 4.5.3

        package ParserCompilable;
        
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link reglasANTLRParser}.
 */
public interface reglasANTLRListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link reglasANTLRParser#entrada}.
	 * @param ctx the parse tree
	 */
	void enterEntrada(reglasANTLRParser.EntradaContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasANTLRParser#entrada}.
	 * @param ctx the parse tree
	 */
	void exitEntrada(reglasANTLRParser.EntradaContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglasANTLRParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(reglasANTLRParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglasANTLRParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(reglasANTLRParser.SContext ctx);
}