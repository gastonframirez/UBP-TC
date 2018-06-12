// Generated from C:\Users\Ramiro\Desktop\tp2tc\src\tp2tc\tp2tc.g4 by ANTLR 4.5.3
package tp2tc;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link tp2tcParser}.
 */
public interface tp2tcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link tp2tcParser#numero}.
	 * @param ctx the parse tree
	 */
	void enterNumero(tp2tcParser.NumeroContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp2tcParser#numero}.
	 * @param ctx the parse tree
	 */
	void exitNumero(tp2tcParser.NumeroContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp2tcParser#operando}.
	 * @param ctx the parse tree
	 */
	void enterOperando(tp2tcParser.OperandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp2tcParser#operando}.
	 * @param ctx the parse tree
	 */
	void exitOperando(tp2tcParser.OperandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp2tcParser#tipodato}.
	 * @param ctx the parse tree
	 */
	void enterTipodato(tp2tcParser.TipodatoContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp2tcParser#tipodato}.
	 * @param ctx the parse tree
	 */
	void exitTipodato(tp2tcParser.TipodatoContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp2tcParser#definicionv}.
	 * @param ctx the parse tree
	 */
	void enterDefinicionv(tp2tcParser.DefinicionvContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp2tcParser#definicionv}.
	 * @param ctx the parse tree
	 */
	void exitDefinicionv(tp2tcParser.DefinicionvContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp2tcParser#tipofuncion}.
	 * @param ctx the parse tree
	 */
	void enterTipofuncion(tp2tcParser.TipofuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp2tcParser#tipofuncion}.
	 * @param ctx the parse tree
	 */
	void exitTipofuncion(tp2tcParser.TipofuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp2tcParser#entrepa1}.
	 * @param ctx the parse tree
	 */
	void enterEntrepa1(tp2tcParser.Entrepa1Context ctx);
	/**
	 * Exit a parse tree produced by {@link tp2tcParser#entrepa1}.
	 * @param ctx the parse tree
	 */
	void exitEntrepa1(tp2tcParser.Entrepa1Context ctx);
	/**
	 * Enter a parse tree produced by {@link tp2tcParser#entrepa2}.
	 * @param ctx the parse tree
	 */
	void enterEntrepa2(tp2tcParser.Entrepa2Context ctx);
	/**
	 * Exit a parse tree produced by {@link tp2tcParser#entrepa2}.
	 * @param ctx the parse tree
	 */
	void exitEntrepa2(tp2tcParser.Entrepa2Context ctx);
	/**
	 * Enter a parse tree produced by {@link tp2tcParser#entrepa3}.
	 * @param ctx the parse tree
	 */
	void enterEntrepa3(tp2tcParser.Entrepa3Context ctx);
	/**
	 * Exit a parse tree produced by {@link tp2tcParser#entrepa3}.
	 * @param ctx the parse tree
	 */
	void exitEntrepa3(tp2tcParser.Entrepa3Context ctx);
	/**
	 * Enter a parse tree produced by {@link tp2tcParser#llamadofunc}.
	 * @param ctx the parse tree
	 */
	void enterLlamadofunc(tp2tcParser.LlamadofuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp2tcParser#llamadofunc}.
	 * @param ctx the parse tree
	 */
	void exitLlamadofunc(tp2tcParser.LlamadofuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp2tcParser#definicionfunc}.
	 * @param ctx the parse tree
	 */
	void enterDefinicionfunc(tp2tcParser.DefinicionfuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp2tcParser#definicionfunc}.
	 * @param ctx the parse tree
	 */
	void exitDefinicionfunc(tp2tcParser.DefinicionfuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp2tcParser#declaracionfunc}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracionfunc(tp2tcParser.DeclaracionfuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp2tcParser#declaracionfunc}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracionfunc(tp2tcParser.DeclaracionfuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp2tcParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(tp2tcParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp2tcParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(tp2tcParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp2tcParser#operador}.
	 * @param ctx the parse tree
	 */
	void enterOperador(tp2tcParser.OperadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp2tcParser#operador}.
	 * @param ctx the parse tree
	 */
	void exitOperador(tp2tcParser.OperadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp2tcParser#operacion}.
	 * @param ctx the parse tree
	 */
	void enterOperacion(tp2tcParser.OperacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp2tcParser#operacion}.
	 * @param ctx the parse tree
	 */
	void exitOperacion(tp2tcParser.OperacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp2tcParser#listaop}.
	 * @param ctx the parse tree
	 */
	void enterListaop(tp2tcParser.ListaopContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp2tcParser#listaop}.
	 * @param ctx the parse tree
	 */
	void exitListaop(tp2tcParser.ListaopContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp2tcParser#declaracionv}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracionv(tp2tcParser.DeclaracionvContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp2tcParser#declaracionv}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracionv(tp2tcParser.DeclaracionvContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp2tcParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(tp2tcParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp2tcParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(tp2tcParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp2tcParser#conds}.
	 * @param ctx the parse tree
	 */
	void enterConds(tp2tcParser.CondsContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp2tcParser#conds}.
	 * @param ctx the parse tree
	 */
	void exitConds(tp2tcParser.CondsContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp2tcParser#codigo}.
	 * @param ctx the parse tree
	 */
	void enterCodigo(tp2tcParser.CodigoContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp2tcParser#codigo}.
	 * @param ctx the parse tree
	 */
	void exitCodigo(tp2tcParser.CodigoContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp2tcParser#bloquecodigo}.
	 * @param ctx the parse tree
	 */
	void enterBloquecodigo(tp2tcParser.BloquecodigoContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp2tcParser#bloquecodigo}.
	 * @param ctx the parse tree
	 */
	void exitBloquecodigo(tp2tcParser.BloquecodigoContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp2tcParser#ifcond}.
	 * @param ctx the parse tree
	 */
	void enterIfcond(tp2tcParser.IfcondContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp2tcParser#ifcond}.
	 * @param ctx the parse tree
	 */
	void exitIfcond(tp2tcParser.IfcondContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp2tcParser#argif}.
	 * @param ctx the parse tree
	 */
	void enterArgif(tp2tcParser.ArgifContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp2tcParser#argif}.
	 * @param ctx the parse tree
	 */
	void exitArgif(tp2tcParser.ArgifContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp2tcParser#forloop}.
	 * @param ctx the parse tree
	 */
	void enterForloop(tp2tcParser.ForloopContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp2tcParser#forloop}.
	 * @param ctx the parse tree
	 */
	void exitForloop(tp2tcParser.ForloopContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp2tcParser#argfor}.
	 * @param ctx the parse tree
	 */
	void enterArgfor(tp2tcParser.ArgforContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp2tcParser#argfor}.
	 * @param ctx the parse tree
	 */
	void exitArgfor(tp2tcParser.ArgforContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp2tcParser#whileloop}.
	 * @param ctx the parse tree
	 */
	void enterWhileloop(tp2tcParser.WhileloopContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp2tcParser#whileloop}.
	 * @param ctx the parse tree
	 */
	void exitWhileloop(tp2tcParser.WhileloopContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp2tcParser#argwhile}.
	 * @param ctx the parse tree
	 */
	void enterArgwhile(tp2tcParser.ArgwhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp2tcParser#argwhile}.
	 * @param ctx the parse tree
	 */
	void exitArgwhile(tp2tcParser.ArgwhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp2tcParser#ins}.
	 * @param ctx the parse tree
	 */
	void enterIns(tp2tcParser.InsContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp2tcParser#ins}.
	 * @param ctx the parse tree
	 */
	void exitIns(tp2tcParser.InsContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp2tcParser#arginst}.
	 * @param ctx the parse tree
	 */
	void enterArginst(tp2tcParser.ArginstContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp2tcParser#arginst}.
	 * @param ctx the parse tree
	 */
	void exitArginst(tp2tcParser.ArginstContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp2tcParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion(tp2tcParser.InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp2tcParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion(tp2tcParser.InstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp2tcParser#definicionverror}.
	 * @param ctx the parse tree
	 */
	void enterDefinicionverror(tp2tcParser.DefinicionverrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp2tcParser#definicionverror}.
	 * @param ctx the parse tree
	 */
	void exitDefinicionverror(tp2tcParser.DefinicionverrorContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp2tcParser#entrepaerror}.
	 * @param ctx the parse tree
	 */
	void enterEntrepaerror(tp2tcParser.EntrepaerrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp2tcParser#entrepaerror}.
	 * @param ctx the parse tree
	 */
	void exitEntrepaerror(tp2tcParser.EntrepaerrorContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp2tcParser#funcerror}.
	 * @param ctx the parse tree
	 */
	void enterFuncerror(tp2tcParser.FuncerrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp2tcParser#funcerror}.
	 * @param ctx the parse tree
	 */
	void exitFuncerror(tp2tcParser.FuncerrorContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp2tcParser#declaracionferror}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracionferror(tp2tcParser.DeclaracionferrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp2tcParser#declaracionferror}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracionferror(tp2tcParser.DeclaracionferrorContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp2tcParser#llamadofuncionerror}.
	 * @param ctx the parse tree
	 */
	void enterLlamadofuncionerror(tp2tcParser.LlamadofuncionerrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp2tcParser#llamadofuncionerror}.
	 * @param ctx the parse tree
	 */
	void exitLlamadofuncionerror(tp2tcParser.LlamadofuncionerrorContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp2tcParser#operacionerror}.
	 * @param ctx the parse tree
	 */
	void enterOperacionerror(tp2tcParser.OperacionerrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp2tcParser#operacionerror}.
	 * @param ctx the parse tree
	 */
	void exitOperacionerror(tp2tcParser.OperacionerrorContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp2tcParser#listaoperror}.
	 * @param ctx the parse tree
	 */
	void enterListaoperror(tp2tcParser.ListaoperrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp2tcParser#listaoperror}.
	 * @param ctx the parse tree
	 */
	void exitListaoperror(tp2tcParser.ListaoperrorContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp2tcParser#declaracionverror}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracionverror(tp2tcParser.DeclaracionverrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp2tcParser#declaracionverror}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracionverror(tp2tcParser.DeclaracionverrorContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp2tcParser#conderror}.
	 * @param ctx the parse tree
	 */
	void enterConderror(tp2tcParser.ConderrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp2tcParser#conderror}.
	 * @param ctx the parse tree
	 */
	void exitConderror(tp2tcParser.ConderrorContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp2tcParser#condserror}.
	 * @param ctx the parse tree
	 */
	void enterCondserror(tp2tcParser.CondserrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp2tcParser#condserror}.
	 * @param ctx the parse tree
	 */
	void exitCondserror(tp2tcParser.CondserrorContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp2tcParser#bloquecodigoerror}.
	 * @param ctx the parse tree
	 */
	void enterBloquecodigoerror(tp2tcParser.BloquecodigoerrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp2tcParser#bloquecodigoerror}.
	 * @param ctx the parse tree
	 */
	void exitBloquecodigoerror(tp2tcParser.BloquecodigoerrorContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp2tcParser#ifconderror}.
	 * @param ctx the parse tree
	 */
	void enterIfconderror(tp2tcParser.IfconderrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp2tcParser#ifconderror}.
	 * @param ctx the parse tree
	 */
	void exitIfconderror(tp2tcParser.IfconderrorContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp2tcParser#argiferror}.
	 * @param ctx the parse tree
	 */
	void enterArgiferror(tp2tcParser.ArgiferrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp2tcParser#argiferror}.
	 * @param ctx the parse tree
	 */
	void exitArgiferror(tp2tcParser.ArgiferrorContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp2tcParser#forlooperror}.
	 * @param ctx the parse tree
	 */
	void enterForlooperror(tp2tcParser.ForlooperrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp2tcParser#forlooperror}.
	 * @param ctx the parse tree
	 */
	void exitForlooperror(tp2tcParser.ForlooperrorContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp2tcParser#argforerror}.
	 * @param ctx the parse tree
	 */
	void enterArgforerror(tp2tcParser.ArgforerrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp2tcParser#argforerror}.
	 * @param ctx the parse tree
	 */
	void exitArgforerror(tp2tcParser.ArgforerrorContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp2tcParser#whilelooperror}.
	 * @param ctx the parse tree
	 */
	void enterWhilelooperror(tp2tcParser.WhilelooperrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp2tcParser#whilelooperror}.
	 * @param ctx the parse tree
	 */
	void exitWhilelooperror(tp2tcParser.WhilelooperrorContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp2tcParser#argwhileerror}.
	 * @param ctx the parse tree
	 */
	void enterArgwhileerror(tp2tcParser.ArgwhileerrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp2tcParser#argwhileerror}.
	 * @param ctx the parse tree
	 */
	void exitArgwhileerror(tp2tcParser.ArgwhileerrorContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp2tcParser#inserror}.
	 * @param ctx the parse tree
	 */
	void enterInserror(tp2tcParser.InserrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp2tcParser#inserror}.
	 * @param ctx the parse tree
	 */
	void exitInserror(tp2tcParser.InserrorContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp2tcParser#arginserror}.
	 * @param ctx the parse tree
	 */
	void enterArginserror(tp2tcParser.ArginserrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp2tcParser#arginserror}.
	 * @param ctx the parse tree
	 */
	void exitArginserror(tp2tcParser.ArginserrorContext ctx);
}