// Generated from /Users/gframirez/Documents/UBP/Q9/TC/Ejercicios/TP2-MG/src/tp2/mg/TP2.g4 by ANTLR 4.5.3
package tp2.mg;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TP2Parser}.
 */
public interface TP2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TP2Parser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(TP2Parser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP2Parser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(TP2Parser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP2Parser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void enterInstrucciones(TP2Parser.InstruccionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP2Parser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void exitInstrucciones(TP2Parser.InstruccionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP2Parser#inst}.
	 * @param ctx the parse tree
	 */
	void enterInst(TP2Parser.InstContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP2Parser#inst}.
	 * @param ctx the parse tree
	 */
	void exitInst(TP2Parser.InstContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP2Parser#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(TP2Parser.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP2Parser#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(TP2Parser.BloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP2Parser#variables}.
	 * @param ctx the parse tree
	 */
	void enterVariables(TP2Parser.VariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP2Parser#variables}.
	 * @param ctx the parse tree
	 */
	void exitVariables(TP2Parser.VariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP2Parser#semi}.
	 * @param ctx the parse tree
	 */
	void enterSemi(TP2Parser.SemiContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP2Parser#semi}.
	 * @param ctx the parse tree
	 */
	void exitSemi(TP2Parser.SemiContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP2Parser#declaracionv}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracionv(TP2Parser.DeclaracionvContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP2Parser#declaracionv}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracionv(TP2Parser.DeclaracionvContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP2Parser#tipovar}.
	 * @param ctx the parse tree
	 */
	void enterTipovar(TP2Parser.TipovarContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP2Parser#tipovar}.
	 * @param ctx the parse tree
	 */
	void exitTipovar(TP2Parser.TipovarContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP2Parser#lista}.
	 * @param ctx the parse tree
	 */
	void enterLista(TP2Parser.ListaContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP2Parser#lista}.
	 * @param ctx the parse tree
	 */
	void exitLista(TP2Parser.ListaContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP2Parser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(TP2Parser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP2Parser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(TP2Parser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP2Parser#assignMode}.
	 * @param ctx the parse tree
	 */
	void enterAssignMode(TP2Parser.AssignModeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP2Parser#assignMode}.
	 * @param ctx the parse tree
	 */
	void exitAssignMode(TP2Parser.AssignModeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP2Parser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(TP2Parser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP2Parser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(TP2Parser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP2Parser#expSimple}.
	 * @param ctx the parse tree
	 */
	void enterExpSimple(TP2Parser.ExpSimpleContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP2Parser#expSimple}.
	 * @param ctx the parse tree
	 */
	void exitExpSimple(TP2Parser.ExpSimpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP2Parser#exprAND}.
	 * @param ctx the parse tree
	 */
	void enterExprAND(TP2Parser.ExprANDContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP2Parser#exprAND}.
	 * @param ctx the parse tree
	 */
	void exitExprAND(TP2Parser.ExprANDContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP2Parser#exprNOT}.
	 * @param ctx the parse tree
	 */
	void enterExprNOT(TP2Parser.ExprNOTContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP2Parser#exprNOT}.
	 * @param ctx the parse tree
	 */
	void exitExprNOT(TP2Parser.ExprNOTContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP2Parser#exprRelacional}.
	 * @param ctx the parse tree
	 */
	void enterExprRelacional(TP2Parser.ExprRelacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP2Parser#exprRelacional}.
	 * @param ctx the parse tree
	 */
	void exitExprRelacional(TP2Parser.ExprRelacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP2Parser#comparadores}.
	 * @param ctx the parse tree
	 */
	void enterComparadores(TP2Parser.ComparadoresContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP2Parser#comparadores}.
	 * @param ctx the parse tree
	 */
	void exitComparadores(TP2Parser.ComparadoresContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP2Parser#termino}.
	 * @param ctx the parse tree
	 */
	void enterTermino(TP2Parser.TerminoContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP2Parser#termino}.
	 * @param ctx the parse tree
	 */
	void exitTermino(TP2Parser.TerminoContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP2Parser#operadores}.
	 * @param ctx the parse tree
	 */
	void enterOperadores(TP2Parser.OperadoresContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP2Parser#operadores}.
	 * @param ctx the parse tree
	 */
	void exitOperadores(TP2Parser.OperadoresContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP2Parser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(TP2Parser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP2Parser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(TP2Parser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP2Parser#valores}.
	 * @param ctx the parse tree
	 */
	void enterValores(TP2Parser.ValoresContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP2Parser#valores}.
	 * @param ctx the parse tree
	 */
	void exitValores(TP2Parser.ValoresContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP2Parser#valorvar}.
	 * @param ctx the parse tree
	 */
	void enterValorvar(TP2Parser.ValorvarContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP2Parser#valorvar}.
	 * @param ctx the parse tree
	 */
	void exitValorvar(TP2Parser.ValorvarContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP2Parser#asignacionv}.
	 * @param ctx the parse tree
	 */
	void enterAsignacionv(TP2Parser.AsignacionvContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP2Parser#asignacionv}.
	 * @param ctx the parse tree
	 */
	void exitAsignacionv(TP2Parser.AsignacionvContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP2Parser#tipofunc}.
	 * @param ctx the parse tree
	 */
	void enterTipofunc(TP2Parser.TipofuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP2Parser#tipofunc}.
	 * @param ctx the parse tree
	 */
	void exitTipofunc(TP2Parser.TipofuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP2Parser#parentesisAp}.
	 * @param ctx the parse tree
	 */
	void enterParentesisAp(TP2Parser.ParentesisApContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP2Parser#parentesisAp}.
	 * @param ctx the parse tree
	 */
	void exitParentesisAp(TP2Parser.ParentesisApContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP2Parser#deffunc}.
	 * @param ctx the parse tree
	 */
	void enterDeffunc(TP2Parser.DeffuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP2Parser#deffunc}.
	 * @param ctx the parse tree
	 */
	void exitDeffunc(TP2Parser.DeffuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP2Parser#declaracionfunc}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracionfunc(TP2Parser.DeclaracionfuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP2Parser#declaracionfunc}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracionfunc(TP2Parser.DeclaracionfuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP2Parser#definicion}.
	 * @param ctx the parse tree
	 */
	void enterDefinicion(TP2Parser.DefinicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP2Parser#definicion}.
	 * @param ctx the parse tree
	 */
	void exitDefinicion(TP2Parser.DefinicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP2Parser#expresionDef}.
	 * @param ctx the parse tree
	 */
	void enterExpresionDef(TP2Parser.ExpresionDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP2Parser#expresionDef}.
	 * @param ctx the parse tree
	 */
	void exitExpresionDef(TP2Parser.ExpresionDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP2Parser#expresionIF}.
	 * @param ctx the parse tree
	 */
	void enterExpresionIF(TP2Parser.ExpresionIFContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP2Parser#expresionIF}.
	 * @param ctx the parse tree
	 */
	void exitExpresionIF(TP2Parser.ExpresionIFContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP2Parser#expresionWHILE}.
	 * @param ctx the parse tree
	 */
	void enterExpresionWHILE(TP2Parser.ExpresionWHILEContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP2Parser#expresionWHILE}.
	 * @param ctx the parse tree
	 */
	void exitExpresionWHILE(TP2Parser.ExpresionWHILEContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP2Parser#expresionFOR}.
	 * @param ctx the parse tree
	 */
	void enterExpresionFOR(TP2Parser.ExpresionFORContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP2Parser#expresionFOR}.
	 * @param ctx the parse tree
	 */
	void exitExpresionFOR(TP2Parser.ExpresionFORContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP2Parser#loopCtrl}.
	 * @param ctx the parse tree
	 */
	void enterLoopCtrl(TP2Parser.LoopCtrlContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP2Parser#loopCtrl}.
	 * @param ctx the parse tree
	 */
	void exitLoopCtrl(TP2Parser.LoopCtrlContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP2Parser#loopInit}.
	 * @param ctx the parse tree
	 */
	void enterLoopInit(TP2Parser.LoopInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP2Parser#loopInit}.
	 * @param ctx the parse tree
	 */
	void exitLoopInit(TP2Parser.LoopInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP2Parser#loopCond}.
	 * @param ctx the parse tree
	 */
	void enterLoopCond(TP2Parser.LoopCondContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP2Parser#loopCond}.
	 * @param ctx the parse tree
	 */
	void exitLoopCond(TP2Parser.LoopCondContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP2Parser#loopIncr}.
	 * @param ctx the parse tree
	 */
	void enterLoopIncr(TP2Parser.LoopIncrContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP2Parser#loopIncr}.
	 * @param ctx the parse tree
	 */
	void exitLoopIncr(TP2Parser.LoopIncrContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP2Parser#llamadafunc}.
	 * @param ctx the parse tree
	 */
	void enterLlamadafunc(TP2Parser.LlamadafuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP2Parser#llamadafunc}.
	 * @param ctx the parse tree
	 */
	void exitLlamadafunc(TP2Parser.LlamadafuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP2Parser#argumentos}.
	 * @param ctx the parse tree
	 */
	void enterArgumentos(TP2Parser.ArgumentosContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP2Parser#argumentos}.
	 * @param ctx the parse tree
	 */
	void exitArgumentos(TP2Parser.ArgumentosContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP2Parser#listaArgs}.
	 * @param ctx the parse tree
	 */
	void enterListaArgs(TP2Parser.ListaArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP2Parser#listaArgs}.
	 * @param ctx the parse tree
	 */
	void exitListaArgs(TP2Parser.ListaArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP2Parser#returnD}.
	 * @param ctx the parse tree
	 */
	void enterReturnD(TP2Parser.ReturnDContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP2Parser#returnD}.
	 * @param ctx the parse tree
	 */
	void exitReturnD(TP2Parser.ReturnDContext ctx);
}