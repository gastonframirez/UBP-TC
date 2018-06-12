// Generated from /home/meschoyez/NetBeansProjects/ParserCompilable/src/ParserCompilable/reglasANTLR.g4 by ANTLR 4.2.2

        package ParserCompilable;
        
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link reglasANTLRParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface reglasANTLRVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link reglasANTLRParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS(@NotNull reglasANTLRParser.SContext ctx);

	/**
	 * Visit a parse tree produced by {@link reglasANTLRParser#entrada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntrada(@NotNull reglasANTLRParser.EntradaContext ctx);
}