// Generated from /Users/gframirez/Documents/UBP/Q9/TC/Ejercicios/TP2/src/tp2/sintaxC.g4 by ANTLR 4.5.3
package tp2.mg;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link sintaxCParser}.
 */
public interface sintaxCListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link sintaxCParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(sintaxCParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaxCParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(sintaxCParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaxCParser#instructions}.
	 * @param ctx the parse tree
	 */
	void enterInstructions(sintaxCParser.InstructionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaxCParser#instructions}.
	 * @param ctx the parse tree
	 */
	void exitInstructions(sintaxCParser.InstructionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaxCParser#instr}.
	 * @param ctx the parse tree
	 */
	void enterInstr(sintaxCParser.InstrContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaxCParser#instr}.
	 * @param ctx the parse tree
	 */
	void exitInstr(sintaxCParser.InstrContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaxCParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(sintaxCParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaxCParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(sintaxCParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaxCParser#varDeclList}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclList(sintaxCParser.VarDeclListContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaxCParser#varDeclList}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclList(sintaxCParser.VarDeclListContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaxCParser#varDeclInitialize}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclInitialize(sintaxCParser.VarDeclInitializeContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaxCParser#varDeclInitialize}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclInitialize(sintaxCParser.VarDeclInitializeContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaxCParser#varId}.
	 * @param ctx the parse tree
	 */
	void enterVarId(sintaxCParser.VarIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaxCParser#varId}.
	 * @param ctx the parse tree
	 */
	void exitVarId(sintaxCParser.VarIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaxCParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpecifier(sintaxCParser.TypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaxCParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpecifier(sintaxCParser.TypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaxCParser#returnTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterReturnTypeSpecifier(sintaxCParser.ReturnTypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaxCParser#returnTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitReturnTypeSpecifier(sintaxCParser.ReturnTypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaxCParser#funcDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFuncDeclaration(sintaxCParser.FuncDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaxCParser#funcDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFuncDeclaration(sintaxCParser.FuncDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaxCParser#paramList}.
	 * @param ctx the parse tree
	 */
	void enterParamList(sintaxCParser.ParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaxCParser#paramList}.
	 * @param ctx the parse tree
	 */
	void exitParamList(sintaxCParser.ParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaxCParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(sintaxCParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaxCParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(sintaxCParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaxCParser#instBlock}.
	 * @param ctx the parse tree
	 */
	void enterInstBlock(sintaxCParser.InstBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaxCParser#instBlock}.
	 * @param ctx the parse tree
	 */
	void exitInstBlock(sintaxCParser.InstBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaxCParser#statementList}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(sintaxCParser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaxCParser#statementList}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(sintaxCParser.StatementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaxCParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(sintaxCParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaxCParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(sintaxCParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaxCParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectionStatement(sintaxCParser.SelectionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaxCParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectionStatement(sintaxCParser.SelectionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaxCParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterIterationStatement(sintaxCParser.IterationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaxCParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitIterationStatement(sintaxCParser.IterationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaxCParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(sintaxCParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaxCParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(sintaxCParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaxCParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(sintaxCParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaxCParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(sintaxCParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaxCParser#forDefinition}.
	 * @param ctx the parse tree
	 */
	void enterForDefinition(sintaxCParser.ForDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaxCParser#forDefinition}.
	 * @param ctx the parse tree
	 */
	void exitForDefinition(sintaxCParser.ForDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaxCParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(sintaxCParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaxCParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(sintaxCParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaxCParser#semicolon}.
	 * @param ctx the parse tree
	 */
	void enterSemicolon(sintaxCParser.SemicolonContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaxCParser#semicolon}.
	 * @param ctx the parse tree
	 */
	void exitSemicolon(sintaxCParser.SemicolonContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaxCParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(sintaxCParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaxCParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(sintaxCParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaxCParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(sintaxCParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaxCParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(sintaxCParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaxCParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(sintaxCParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaxCParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(sintaxCParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaxCParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpression(sintaxCParser.SimpleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaxCParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpression(sintaxCParser.SimpleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaxCParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(sintaxCParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaxCParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(sintaxCParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaxCParser#unaryRelExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryRelExpression(sintaxCParser.UnaryRelExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaxCParser#unaryRelExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryRelExpression(sintaxCParser.UnaryRelExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaxCParser#relExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelExpression(sintaxCParser.RelExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaxCParser#relExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelExpression(sintaxCParser.RelExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaxCParser#relationalOperator}.
	 * @param ctx the parse tree
	 */
	void enterRelationalOperator(sintaxCParser.RelationalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaxCParser#relationalOperator}.
	 * @param ctx the parse tree
	 */
	void exitRelationalOperator(sintaxCParser.RelationalOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaxCParser#sumExpression}.
	 * @param ctx the parse tree
	 */
	void enterSumExpression(sintaxCParser.SumExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaxCParser#sumExpression}.
	 * @param ctx the parse tree
	 */
	void exitSumExpression(sintaxCParser.SumExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaxCParser#arithSumOperator}.
	 * @param ctx the parse tree
	 */
	void enterArithSumOperator(sintaxCParser.ArithSumOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaxCParser#arithSumOperator}.
	 * @param ctx the parse tree
	 */
	void exitArithSumOperator(sintaxCParser.ArithSumOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaxCParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(sintaxCParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaxCParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(sintaxCParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaxCParser#arithMultOperator}.
	 * @param ctx the parse tree
	 */
	void enterArithMultOperator(sintaxCParser.ArithMultOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaxCParser#arithMultOperator}.
	 * @param ctx the parse tree
	 */
	void exitArithMultOperator(sintaxCParser.ArithMultOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaxCParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(sintaxCParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaxCParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(sintaxCParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaxCParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperator(sintaxCParser.UnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaxCParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperator(sintaxCParser.UnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaxCParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(sintaxCParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaxCParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(sintaxCParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaxCParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(sintaxCParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaxCParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(sintaxCParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaxCParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(sintaxCParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaxCParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(sintaxCParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaxCParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(sintaxCParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaxCParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(sintaxCParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaxCParser#argList}.
	 * @param ctx the parse tree
	 */
	void enterArgList(sintaxCParser.ArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaxCParser#argList}.
	 * @param ctx the parse tree
	 */
	void exitArgList(sintaxCParser.ArgListContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintaxCParser#resValue}.
	 * @param ctx the parse tree
	 */
	void enterResValue(sintaxCParser.ResValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintaxCParser#resValue}.
	 * @param ctx the parse tree
	 */
	void exitResValue(sintaxCParser.ResValueContext ctx);
}