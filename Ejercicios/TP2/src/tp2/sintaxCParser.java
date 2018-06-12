// Generated from /Users/gframirez/Documents/UBP/Q9/TC/Ejercicios/TP2/src/tp2/sintaxC.g4 by ANTLR 4.5.3
package tp2.mg;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class sintaxCParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, INT=2, DOUBLE=3, CHAR=4, VOID=5, IF=6, ELSE=7, RETURN=8, TRUE=9, 
		FALSE=10, WHILE=11, FOR=12, SEMI=13, COMMA=14, OPAR=15, CPAR=16, OBRACE=17, 
		CBRACE=18, OBRACKET=19, CBRACKET=20, ASSIGN=21, MULTIPLYASSIGN=22, DIVIDEASSIGN=23, 
		MODULUSASSIGN=24, PLUSASSIGN=25, MINUSASSIGN=26, PLUS=27, LESS=28, DIVIDE=29, 
		MULTIPLY=30, MODULUS=31, PLUSPLUS=32, LESSLESS=33, QUESTION=34, OR=35, 
		AND=36, NOT=37, EQUAL=38, NOTEQUAL=39, GREATERTHAN=40, LESSTHAN=41, GREATERTHANEQUAL=42, 
		LESSTHANEQUAL=43, INTNUMBER=44, FLOATNUMBER=45, ID=46, CHARVALUE=47;
	public static final int
		RULE_prog = 0, RULE_instructions = 1, RULE_instr = 2, RULE_varDeclaration = 3, 
		RULE_varDeclList = 4, RULE_varDeclInitialize = 5, RULE_varId = 6, RULE_typeSpecifier = 7, 
		RULE_returnTypeSpecifier = 8, RULE_funcDeclaration = 9, RULE_paramList = 10, 
		RULE_statement = 11, RULE_instBlock = 12, RULE_statementList = 13, RULE_expressionStatement = 14, 
		RULE_selectionStatement = 15, RULE_iterationStatement = 16, RULE_whileStatement = 17, 
		RULE_forStatement = 18, RULE_forDefinition = 19, RULE_forInit = 20, RULE_semicolon = 21, 
		RULE_returnStatement = 22, RULE_assignmentOperator = 23, RULE_expression = 24, 
		RULE_simpleExpression = 25, RULE_andExpression = 26, RULE_unaryRelExpression = 27, 
		RULE_relExpression = 28, RULE_relationalOperator = 29, RULE_sumExpression = 30, 
		RULE_arithSumOperator = 31, RULE_term = 32, RULE_arithMultOperator = 33, 
		RULE_unaryExpression = 34, RULE_unaryOperator = 35, RULE_factor = 36, 
		RULE_value = 37, RULE_call = 38, RULE_args = 39, RULE_argList = 40, RULE_resValue = 41;
	public static final String[] ruleNames = {
		"prog", "instructions", "instr", "varDeclaration", "varDeclList", "varDeclInitialize", 
		"varId", "typeSpecifier", "returnTypeSpecifier", "funcDeclaration", "paramList", 
		"statement", "instBlock", "statementList", "expressionStatement", "selectionStatement", 
		"iterationStatement", "whileStatement", "forStatement", "forDefinition", 
		"forInit", "semicolon", "returnStatement", "assignmentOperator", "expression", 
		"simpleExpression", "andExpression", "unaryRelExpression", "relExpression", 
		"relationalOperator", "sumExpression", "arithSumOperator", "term", "arithMultOperator", 
		"unaryExpression", "unaryOperator", "factor", "value", "call", "args", 
		"argList", "resValue"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'int'", "'double'", "'char'", "'void'", "'if'", "'else'", 
		"'return'", "'true'", "'false'", "'while'", "'for'", "';'", "','", "'('", 
		"')'", "'{'", "'}'", "'['", "']'", "'='", "'*='", "'/='", "'%='", "'+='", 
		"'-='", "'+'", "'-'", "'/'", "'*'", "'%'", "'++'", "'--'", "'?'", "'||'", 
		"'&&'", "'!'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "INT", "DOUBLE", "CHAR", "VOID", "IF", "ELSE", "RETURN", "TRUE", 
		"FALSE", "WHILE", "FOR", "SEMI", "COMMA", "OPAR", "CPAR", "OBRACE", "CBRACE", 
		"OBRACKET", "CBRACKET", "ASSIGN", "MULTIPLYASSIGN", "DIVIDEASSIGN", "MODULUSASSIGN", 
		"PLUSASSIGN", "MINUSASSIGN", "PLUS", "LESS", "DIVIDE", "MULTIPLY", "MODULUS", 
		"PLUSPLUS", "LESSLESS", "QUESTION", "OR", "AND", "NOT", "EQUAL", "NOTEQUAL", 
		"GREATERTHAN", "LESSTHAN", "GREATERTHANEQUAL", "LESSTHANEQUAL", "INTNUMBER", 
		"FLOATNUMBER", "ID", "CHARVALUE"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "sintaxC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public sintaxCParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(sintaxCParser.EOF, 0); }
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintaxCListener ) ((sintaxCListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintaxCListener ) ((sintaxCListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				instructions(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				match(EOF);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstructionsContext extends ParserRuleContext {
		public InstrContext instr() {
			return getRuleContext(InstrContext.class,0);
		}
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public InstructionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instructions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintaxCListener ) ((sintaxCListener)listener).enterInstructions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintaxCListener ) ((sintaxCListener)listener).exitInstructions(this);
		}
	}

	public final InstructionsContext instructions() throws RecognitionException {
		return instructions(0);
	}

	private InstructionsContext instructions(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InstructionsContext _localctx = new InstructionsContext(_ctx, _parentState);
		InstructionsContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_instructions, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(90);
			instr();
			}
			_ctx.stop = _input.LT(-1);
			setState(96);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InstructionsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_instructions);
					setState(92);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(93);
					instr();
					}
					} 
				}
				setState(98);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class InstrContext extends ParserRuleContext {
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public SemicolonContext semicolon() {
			return getRuleContext(SemicolonContext.class,0);
		}
		public FuncDeclarationContext funcDeclaration() {
			return getRuleContext(FuncDeclarationContext.class,0);
		}
		public InstrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintaxCListener ) ((sintaxCListener)listener).enterInstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintaxCListener ) ((sintaxCListener)listener).exitInstr(this);
		}
	}

	public final InstrContext instr() throws RecognitionException {
		InstrContext _localctx = new InstrContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instr);
		try {
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				varDeclaration();
				setState(100);
				semicolon();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				funcDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclarationContext extends ParserRuleContext {
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public VarDeclListContext varDeclList() {
			return getRuleContext(VarDeclListContext.class,0);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintaxCListener ) ((sintaxCListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintaxCListener ) ((sintaxCListener)listener).exitVarDeclaration(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			typeSpecifier();
			setState(106);
			varDeclList(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclListContext extends ParserRuleContext {
		public VarDeclInitializeContext varDeclInitialize() {
			return getRuleContext(VarDeclInitializeContext.class,0);
		}
		public VarDeclListContext varDeclList() {
			return getRuleContext(VarDeclListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(sintaxCParser.COMMA, 0); }
		public VarDeclListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintaxCListener ) ((sintaxCListener)listener).enterVarDeclList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintaxCListener ) ((sintaxCListener)listener).exitVarDeclList(this);
		}
	}

	public final VarDeclListContext varDeclList() throws RecognitionException {
		return varDeclList(0);
	}

	private VarDeclListContext varDeclList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		VarDeclListContext _localctx = new VarDeclListContext(_ctx, _parentState);
		VarDeclListContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_varDeclList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(109);
			varDeclInitialize();
			}
			_ctx.stop = _input.LT(-1);
			setState(116);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new VarDeclListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_varDeclList);
					setState(111);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(112);
					match(COMMA);
					setState(113);
					varDeclInitialize();
					}
					} 
				}
				setState(118);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class VarDeclInitializeContext extends ParserRuleContext {
		public VarIdContext varId() {
			return getRuleContext(VarIdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarDeclInitializeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclInitialize; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintaxCListener ) ((sintaxCListener)listener).enterVarDeclInitialize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintaxCListener ) ((sintaxCListener)listener).exitVarDeclInitialize(this);
		}
	}

	public final VarDeclInitializeContext varDeclInitialize() throws RecognitionException {
		VarDeclInitializeContext _localctx = new VarDeclInitializeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_varDeclInitialize);
		try {
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				varId();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarIdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(sintaxCParser.ID, 0); }
		public VarIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintaxCListener ) ((sintaxCListener)listener).enterVarId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintaxCListener ) ((sintaxCListener)listener).exitVarId(this);
		}
	}

	public final VarIdContext varId() throws RecognitionException {
		VarIdContext _localctx = new VarIdContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_varId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeSpecifierContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(sintaxCParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(sintaxCParser.DOUBLE, 0); }
		public TerminalNode CHAR() { return getToken(sintaxCParser.CHAR, 0); }
		public TypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintaxCListener ) ((sintaxCListener)listener).enterTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintaxCListener ) ((sintaxCListener)listener).exitTypeSpecifier(this);
		}
	}

	public final TypeSpecifierContext typeSpecifier() throws RecognitionException {
		TypeSpecifierContext _localctx = new TypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_typeSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << DOUBLE) | (1L << CHAR))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnTypeSpecifierContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(sintaxCParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(sintaxCParser.DOUBLE, 0); }
		public TerminalNode CHAR() { return getToken(sintaxCParser.CHAR, 0); }
		public TerminalNode VOID() { return getToken(sintaxCParser.VOID, 0); }
		public ReturnTypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnTypeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintaxCListener ) ((sintaxCListener)listener).enterReturnTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintaxCListener ) ((sintaxCListener)listener).exitReturnTypeSpecifier(this);
		}
	}

	public final ReturnTypeSpecifierContext returnTypeSpecifier() throws RecognitionException {
		ReturnTypeSpecifierContext _localctx = new ReturnTypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_returnTypeSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << DOUBLE) | (1L << CHAR) | (1L << VOID))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncDeclarationContext extends ParserRuleContext {
		public ReturnTypeSpecifierContext returnTypeSpecifier() {
			return getRuleContext(ReturnTypeSpecifierContext.class,0);
		}
		public TerminalNode ID() { return getToken(sintaxCParser.ID, 0); }
		public TerminalNode OPAR() { return getToken(sintaxCParser.OPAR, 0); }
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(sintaxCParser.CPAR, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public FuncDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintaxCListener ) ((sintaxCListener)listener).enterFuncDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintaxCListener ) ((sintaxCListener)listener).exitFuncDeclaration(this);
		}
	}

	public final FuncDeclarationContext funcDeclaration() throws RecognitionException {
		FuncDeclarationContext _localctx = new FuncDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_funcDeclaration);
		try {
			setState(142);
			switch (_input.LA(1)) {
			case INT:
			case DOUBLE:
			case CHAR:
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				returnTypeSpecifier();
				setState(130);
				match(ID);
				setState(131);
				match(OPAR);
				setState(132);
				paramList();
				setState(133);
				match(CPAR);
				setState(134);
				statement();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				match(ID);
				setState(137);
				match(OPAR);
				setState(138);
				paramList();
				setState(139);
				match(CPAR);
				setState(140);
				statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamListContext extends ParserRuleContext {
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public VarIdContext varId() {
			return getRuleContext(VarIdContext.class,0);
		}
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(sintaxCParser.COMMA, 0); }
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintaxCListener ) ((sintaxCListener)listener).enterParamList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintaxCListener ) ((sintaxCListener)listener).exitParamList(this);
		}
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_paramList);
		try {
			setState(154);
			switch (_input.LA(1)) {
			case INT:
			case DOUBLE:
			case CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				typeSpecifier();
				setState(145);
				varId();
				setState(146);
				paramList();
				}
				break;
			case COMMA:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				match(COMMA);
				setState(149);
				typeSpecifier();
				setState(150);
				varId();
				setState(151);
				paramList();
				}
				break;
			case CPAR:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public InstBlockContext instBlock() {
			return getRuleContext(InstBlockContext.class,0);
		}
		public SelectionStatementContext selectionStatement() {
			return getRuleContext(SelectionStatementContext.class,0);
		}
		public IterationStatementContext iterationStatement() {
			return getRuleContext(IterationStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public InstrContext instr() {
			return getRuleContext(InstrContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintaxCListener ) ((sintaxCListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintaxCListener ) ((sintaxCListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statement);
		try {
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				expressionStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				instBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(158);
				selectionStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(159);
				iterationStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(160);
				returnStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(161);
				instr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstBlockContext extends ParserRuleContext {
		public TerminalNode OBRACE() { return getToken(sintaxCParser.OBRACE, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public TerminalNode CBRACE() { return getToken(sintaxCParser.CBRACE, 0); }
		public InstBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintaxCListener ) ((sintaxCListener)listener).enterInstBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintaxCListener ) ((sintaxCListener)listener).exitInstBlock(this);
		}
	}

	public final InstBlockContext instBlock() throws RecognitionException {
		InstBlockContext _localctx = new InstBlockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_instBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(OBRACE);
			setState(165);
			statementList();
			setState(166);
			match(CBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementListContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public StatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintaxCListener ) ((sintaxCListener)listener).enterStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintaxCListener ) ((sintaxCListener)listener).exitStatementList(this);
		}
	}

	public final StatementListContext statementList() throws RecognitionException {
		StatementListContext _localctx = new StatementListContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_statementList);
		try {
			setState(172);
			switch (_input.LA(1)) {
			case INT:
			case DOUBLE:
			case CHAR:
			case VOID:
			case IF:
			case RETURN:
			case TRUE:
			case FALSE:
			case WHILE:
			case FOR:
			case SEMI:
			case OPAR:
			case OBRACE:
			case LESS:
			case MULTIPLY:
			case QUESTION:
			case NOT:
			case INTNUMBER:
			case FLOATNUMBER:
			case ID:
			case CHARVALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				statement();
				setState(169);
				statementList();
				}
				break;
			case CBRACE:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SemicolonContext semicolon() {
			return getRuleContext(SemicolonContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintaxCListener ) ((sintaxCListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintaxCListener ) ((sintaxCListener)listener).exitExpressionStatement(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expressionStatement);
		try {
			setState(178);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case OPAR:
			case LESS:
			case MULTIPLY:
			case QUESTION:
			case NOT:
			case INTNUMBER:
			case FLOATNUMBER:
			case ID:
			case CHARVALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				expression();
				setState(175);
				semicolon();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				semicolon();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectionStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(sintaxCParser.IF, 0); }
		public TerminalNode OPAR() { return getToken(sintaxCParser.OPAR, 0); }
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(sintaxCParser.CPAR, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(sintaxCParser.ELSE, 0); }
		public SelectionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintaxCListener ) ((sintaxCListener)listener).enterSelectionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintaxCListener ) ((sintaxCListener)listener).exitSelectionStatement(this);
		}
	}

	public final SelectionStatementContext selectionStatement() throws RecognitionException {
		SelectionStatementContext _localctx = new SelectionStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_selectionStatement);
		try {
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				match(IF);
				setState(181);
				match(OPAR);
				setState(182);
				simpleExpression(0);
				setState(183);
				match(CPAR);
				setState(184);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				match(IF);
				setState(187);
				match(OPAR);
				setState(188);
				simpleExpression(0);
				setState(189);
				match(CPAR);
				setState(190);
				statement();
				setState(191);
				match(ELSE);
				setState(192);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IterationStatementContext extends ParserRuleContext {
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public IterationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintaxCListener ) ((sintaxCListener)listener).enterIterationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintaxCListener ) ((sintaxCListener)listener).exitIterationStatement(this);
		}
	}

	public final IterationStatementContext iterationStatement() throws RecognitionException {
		IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_iterationStatement);
		try {
			setState(198);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				whileStatement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				forStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(sintaxCParser.WHILE, 0); }
		public TerminalNode OPAR() { return getToken(sintaxCParser.OPAR, 0); }
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(sintaxCParser.CPAR, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintaxCListener ) ((sintaxCListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintaxCListener ) ((sintaxCListener)listener).exitWhileStatement(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(WHILE);
			setState(201);
			match(OPAR);
			setState(202);
			simpleExpression(0);
			setState(203);
			match(CPAR);
			setState(204);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(sintaxCParser.FOR, 0); }
		public TerminalNode OPAR() { return getToken(sintaxCParser.OPAR, 0); }
		public ForDefinitionContext forDefinition() {
			return getRuleContext(ForDefinitionContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(sintaxCParser.CPAR, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintaxCListener ) ((sintaxCListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintaxCListener ) ((sintaxCListener)listener).exitForStatement(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(FOR);
			setState(207);
			match(OPAR);
			setState(208);
			forDefinition();
			setState(209);
			match(CPAR);
			setState(210);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForDefinitionContext extends ParserRuleContext {
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(sintaxCParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(sintaxCParser.SEMI, i);
		}
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintaxCListener ) ((sintaxCListener)listener).enterForDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintaxCListener ) ((sintaxCListener)listener).exitForDefinition(this);
		}
	}

	public final ForDefinitionContext forDefinition() throws RecognitionException {
		ForDefinitionContext _localctx = new ForDefinitionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_forDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			forInit();
			setState(213);
			match(SEMI);
			setState(214);
			simpleExpression(0);
			setState(215);
			match(SEMI);
			setState(216);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInitContext extends ParserRuleContext {
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public VarDeclListContext varDeclList() {
			return getRuleContext(VarDeclListContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintaxCListener ) ((sintaxCListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintaxCListener ) ((sintaxCListener)listener).exitForInit(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_forInit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			typeSpecifier();
			setState(219);
			varDeclList(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SemicolonContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(sintaxCParser.SEMI, 0); }
		public SemicolonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_semicolon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintaxCListener ) ((sintaxCListener)listener).enterSemicolon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintaxCListener ) ((sintaxCListener)listener).exitSemicolon(this);
		}
	}

	public final SemicolonContext semicolon() throws RecognitionException {
		SemicolonContext _localctx = new SemicolonContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_semicolon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(sintaxCParser.RETURN, 0); }
		public SemicolonContext semicolon() {
			return getRuleContext(SemicolonContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintaxCListener ) ((sintaxCListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintaxCListener ) ((sintaxCListener)listener).exitReturnStatement(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_returnStatement);
		try {
			setState(229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				match(RETURN);
				setState(224);
				semicolon();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				match(RETURN);
				setState(226);
				expression();
				setState(227);
				semicolon();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(sintaxCParser.ASSIGN, 0); }
		public TerminalNode MULTIPLYASSIGN() { return getToken(sintaxCParser.MULTIPLYASSIGN, 0); }
		public TerminalNode DIVIDEASSIGN() { return getToken(sintaxCParser.DIVIDEASSIGN, 0); }
		public TerminalNode MODULUS() { return getToken(sintaxCParser.MODULUS, 0); }
		public TerminalNode PLUSASSIGN() { return getToken(sintaxCParser.PLUSASSIGN, 0); }
		public TerminalNode MINUSASSIGN() { return getToken(sintaxCParser.MINUSASSIGN, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintaxCListener ) ((sintaxCListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintaxCListener ) ((sintaxCListener)listener).exitAssignmentOperator(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSIGN) | (1L << MULTIPLYASSIGN) | (1L << DIVIDEASSIGN) | (1L << PLUSASSIGN) | (1L << MINUSASSIGN) | (1L << MODULUS))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public VarIdContext varId() {
			return getRuleContext(VarIdContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PLUSPLUS() { return getToken(sintaxCParser.PLUSPLUS, 0); }
		public TerminalNode LESSLESS() { return getToken(sintaxCParser.LESSLESS, 0); }
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintaxCListener ) ((sintaxCListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintaxCListener ) ((sintaxCListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_expression);
		try {
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				varId();
				setState(234);
				assignmentOperator();
				setState(235);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				varId();
				setState(238);
				match(PLUSPLUS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(240);
				varId();
				setState(241);
				match(LESSLESS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(243);
				simpleExpression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleExpressionContext extends ParserRuleContext {
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public TerminalNode OR() { return getToken(sintaxCParser.OR, 0); }
		public SimpleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintaxCListener ) ((sintaxCListener)listener).enterSimpleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintaxCListener ) ((sintaxCListener)listener).exitSimpleExpression(this);
		}
	}

	public final SimpleExpressionContext simpleExpression() throws RecognitionException {
		return simpleExpression(0);
	}

	private SimpleExpressionContext simpleExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SimpleExpressionContext _localctx = new SimpleExpressionContext(_ctx, _parentState);
		SimpleExpressionContext _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_simpleExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(247);
			andExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(254);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SimpleExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_simpleExpression);
					setState(249);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(250);
					match(OR);
					setState(251);
					andExpression(0);
					}
					} 
				}
				setState(256);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AndExpressionContext extends ParserRuleContext {
		public UnaryRelExpressionContext unaryRelExpression() {
			return getRuleContext(UnaryRelExpressionContext.class,0);
		}
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public TerminalNode AND() { return getToken(sintaxCParser.AND, 0); }
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintaxCListener ) ((sintaxCListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintaxCListener ) ((sintaxCListener)listener).exitAndExpression(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		return andExpression(0);
	}

	private AndExpressionContext andExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, _parentState);
		AndExpressionContext _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_andExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(258);
			unaryRelExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(265);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andExpression);
					setState(260);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(261);
					match(AND);
					setState(262);
					unaryRelExpression();
					}
					} 
				}
				setState(267);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class UnaryRelExpressionContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(sintaxCParser.NOT, 0); }
		public UnaryRelExpressionContext unaryRelExpression() {
			return getRuleContext(UnaryRelExpressionContext.class,0);
		}
		public RelExpressionContext relExpression() {
			return getRuleContext(RelExpressionContext.class,0);
		}
		public UnaryRelExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryRelExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintaxCListener ) ((sintaxCListener)listener).enterUnaryRelExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintaxCListener ) ((sintaxCListener)listener).exitUnaryRelExpression(this);
		}
	}

	public final UnaryRelExpressionContext unaryRelExpression() throws RecognitionException {
		UnaryRelExpressionContext _localctx = new UnaryRelExpressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_unaryRelExpression);
		try {
			setState(271);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				match(NOT);
				setState(269);
				unaryRelExpression();
				}
				break;
			case TRUE:
			case FALSE:
			case OPAR:
			case LESS:
			case MULTIPLY:
			case QUESTION:
			case INTNUMBER:
			case FLOATNUMBER:
			case ID:
			case CHARVALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(270);
				relExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelExpressionContext extends ParserRuleContext {
		public List<SumExpressionContext> sumExpression() {
			return getRuleContexts(SumExpressionContext.class);
		}
		public SumExpressionContext sumExpression(int i) {
			return getRuleContext(SumExpressionContext.class,i);
		}
		public RelationalOperatorContext relationalOperator() {
			return getRuleContext(RelationalOperatorContext.class,0);
		}
		public RelExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintaxCListener ) ((sintaxCListener)listener).enterRelExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintaxCListener ) ((sintaxCListener)listener).exitRelExpression(this);
		}
	}

	public final RelExpressionContext relExpression() throws RecognitionException {
		RelExpressionContext _localctx = new RelExpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_relExpression);
		try {
			setState(278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				sumExpression(0);
				setState(274);
				relationalOperator();
				setState(275);
				sumExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				sumExpression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationalOperatorContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(sintaxCParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(sintaxCParser.NOTEQUAL, 0); }
		public TerminalNode GREATERTHAN() { return getToken(sintaxCParser.GREATERTHAN, 0); }
		public TerminalNode GREATERTHANEQUAL() { return getToken(sintaxCParser.GREATERTHANEQUAL, 0); }
		public TerminalNode LESSTHAN() { return getToken(sintaxCParser.LESSTHAN, 0); }
		public TerminalNode LESSTHANEQUAL() { return getToken(sintaxCParser.LESSTHANEQUAL, 0); }
		public RelationalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintaxCListener ) ((sintaxCListener)listener).enterRelationalOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintaxCListener ) ((sintaxCListener)listener).exitRelationalOperator(this);
		}
	}

	public final RelationalOperatorContext relationalOperator() throws RecognitionException {
		RelationalOperatorContext _localctx = new RelationalOperatorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_relationalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << NOTEQUAL) | (1L << GREATERTHAN) | (1L << LESSTHAN) | (1L << GREATERTHANEQUAL) | (1L << LESSTHANEQUAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SumExpressionContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public SumExpressionContext sumExpression() {
			return getRuleContext(SumExpressionContext.class,0);
		}
		public ArithSumOperatorContext arithSumOperator() {
			return getRuleContext(ArithSumOperatorContext.class,0);
		}
		public SumExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sumExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintaxCListener ) ((sintaxCListener)listener).enterSumExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintaxCListener ) ((sintaxCListener)listener).exitSumExpression(this);
		}
	}

	public final SumExpressionContext sumExpression() throws RecognitionException {
		return sumExpression(0);
	}

	private SumExpressionContext sumExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SumExpressionContext _localctx = new SumExpressionContext(_ctx, _parentState);
		SumExpressionContext _prevctx = _localctx;
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_sumExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(283);
			term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(291);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SumExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_sumExpression);
					setState(285);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(286);
					arithSumOperator();
					setState(287);
					term(0);
					}
					} 
				}
				setState(293);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ArithSumOperatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(sintaxCParser.PLUS, 0); }
		public TerminalNode LESS() { return getToken(sintaxCParser.LESS, 0); }
		public ArithSumOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithSumOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintaxCListener ) ((sintaxCListener)listener).enterArithSumOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintaxCListener ) ((sintaxCListener)listener).exitArithSumOperator(this);
		}
	}

	public final ArithSumOperatorContext arithSumOperator() throws RecognitionException {
		ArithSumOperatorContext _localctx = new ArithSumOperatorContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_arithSumOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==LESS) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ArithMultOperatorContext arithMultOperator() {
			return getRuleContext(ArithMultOperatorContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintaxCListener ) ((sintaxCListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintaxCListener ) ((sintaxCListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(297);
			unaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(305);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TermContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_term);
					setState(299);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(300);
					arithMultOperator();
					setState(301);
					unaryExpression();
					}
					} 
				}
				setState(307);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ArithMultOperatorContext extends ParserRuleContext {
		public TerminalNode MULTIPLY() { return getToken(sintaxCParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(sintaxCParser.DIVIDE, 0); }
		public TerminalNode MODULUS() { return getToken(sintaxCParser.MODULUS, 0); }
		public ArithMultOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithMultOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintaxCListener ) ((sintaxCListener)listener).enterArithMultOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintaxCListener ) ((sintaxCListener)listener).exitArithMultOperator(this);
		}
	}

	public final ArithMultOperatorContext arithMultOperator() throws RecognitionException {
		ArithMultOperatorContext _localctx = new ArithMultOperatorContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_arithMultOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIVIDE) | (1L << MULTIPLY) | (1L << MODULUS))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryExpressionContext extends ParserRuleContext {
		public UnaryOperatorContext unaryOperator() {
			return getRuleContext(UnaryOperatorContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintaxCListener ) ((sintaxCListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintaxCListener ) ((sintaxCListener)listener).exitUnaryExpression(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_unaryExpression);
		try {
			setState(314);
			switch (_input.LA(1)) {
			case LESS:
			case MULTIPLY:
			case QUESTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(310);
				unaryOperator();
				setState(311);
				unaryExpression();
				}
				break;
			case TRUE:
			case FALSE:
			case OPAR:
			case INTNUMBER:
			case FLOATNUMBER:
			case ID:
			case CHARVALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(313);
				factor();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryOperatorContext extends ParserRuleContext {
		public TerminalNode LESS() { return getToken(sintaxCParser.LESS, 0); }
		public TerminalNode MULTIPLY() { return getToken(sintaxCParser.MULTIPLY, 0); }
		public TerminalNode QUESTION() { return getToken(sintaxCParser.QUESTION, 0); }
		public UnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintaxCListener ) ((sintaxCListener)listener).enterUnaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintaxCListener ) ((sintaxCListener)listener).exitUnaryOperator(this);
		}
	}

	public final UnaryOperatorContext unaryOperator() throws RecognitionException {
		UnaryOperatorContext _localctx = new UnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_unaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS) | (1L << MULTIPLY) | (1L << QUESTION))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public VarIdContext varId() {
			return getRuleContext(VarIdContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintaxCListener ) ((sintaxCListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintaxCListener ) ((sintaxCListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_factor);
		try {
			setState(320);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(318);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(319);
				varId();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode OPAR() { return getToken(sintaxCParser.OPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(sintaxCParser.CPAR, 0); }
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public ResValueContext resValue() {
			return getRuleContext(ResValueContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintaxCListener ) ((sintaxCListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintaxCListener ) ((sintaxCListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_value);
		try {
			setState(328);
			switch (_input.LA(1)) {
			case OPAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(322);
				match(OPAR);
				setState(323);
				expression();
				setState(324);
				match(CPAR);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(326);
				call();
				}
				break;
			case TRUE:
			case FALSE:
			case INTNUMBER:
			case FLOATNUMBER:
			case CHARVALUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(327);
				resValue();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallContext extends ParserRuleContext {
		public VarIdContext varId() {
			return getRuleContext(VarIdContext.class,0);
		}
		public TerminalNode OPAR() { return getToken(sintaxCParser.OPAR, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(sintaxCParser.CPAR, 0); }
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintaxCListener ) ((sintaxCListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintaxCListener ) ((sintaxCListener)listener).exitCall(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			varId();
			setState(331);
			match(OPAR);
			setState(332);
			args();
			setState(333);
			match(CPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgsContext extends ParserRuleContext {
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintaxCListener ) ((sintaxCListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintaxCListener ) ((sintaxCListener)listener).exitArgs(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_args);
		try {
			setState(337);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case OPAR:
			case LESS:
			case MULTIPLY:
			case QUESTION:
			case NOT:
			case INTNUMBER:
			case FLOATNUMBER:
			case ID:
			case CHARVALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(335);
				argList(0);
				}
				break;
			case CPAR:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgListContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(sintaxCParser.COMMA, 0); }
		public ArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintaxCListener ) ((sintaxCListener)listener).enterArgList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintaxCListener ) ((sintaxCListener)listener).exitArgList(this);
		}
	}

	public final ArgListContext argList() throws RecognitionException {
		return argList(0);
	}

	private ArgListContext argList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArgListContext _localctx = new ArgListContext(_ctx, _parentState);
		ArgListContext _prevctx = _localctx;
		int _startState = 80;
		enterRecursionRule(_localctx, 80, RULE_argList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(340);
			expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(347);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArgListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_argList);
					setState(342);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(343);
					match(COMMA);
					setState(344);
					expression();
					}
					} 
				}
				setState(349);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ResValueContext extends ParserRuleContext {
		public TerminalNode INTNUMBER() { return getToken(sintaxCParser.INTNUMBER, 0); }
		public TerminalNode FLOATNUMBER() { return getToken(sintaxCParser.FLOATNUMBER, 0); }
		public TerminalNode CHARVALUE() { return getToken(sintaxCParser.CHARVALUE, 0); }
		public TerminalNode TRUE() { return getToken(sintaxCParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(sintaxCParser.FALSE, 0); }
		public ResValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintaxCListener ) ((sintaxCListener)listener).enterResValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintaxCListener ) ((sintaxCListener)listener).exitResValue(this);
		}
	}

	public final ResValueContext resValue() throws RecognitionException {
		ResValueContext _localctx = new ResValueContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_resValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << INTNUMBER) | (1L << FLOATNUMBER) | (1L << CHARVALUE))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return instructions_sempred((InstructionsContext)_localctx, predIndex);
		case 4:
			return varDeclList_sempred((VarDeclListContext)_localctx, predIndex);
		case 25:
			return simpleExpression_sempred((SimpleExpressionContext)_localctx, predIndex);
		case 26:
			return andExpression_sempred((AndExpressionContext)_localctx, predIndex);
		case 30:
			return sumExpression_sempred((SumExpressionContext)_localctx, predIndex);
		case 32:
			return term_sempred((TermContext)_localctx, predIndex);
		case 40:
			return argList_sempred((ArgListContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean instructions_sempred(InstructionsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean varDeclList_sempred(VarDeclListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean simpleExpression_sempred(SimpleExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean andExpression_sempred(AndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean sumExpression_sempred(SumExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean argList_sempred(ArgListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\61\u0163\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\2\5\2Z\n\2\3\3\3\3\3\3\3\3\3\3\7\3a\n\3\f\3\16\3d\13\3\3\4\3"+
		"\4\3\4\3\4\5\4j\n\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6u\n\6\f\6\16"+
		"\6x\13\6\3\7\3\7\5\7|\n\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0091\n\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u009d\n\f\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\5\r\u00a5\n\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\5\17\u00af\n\17"+
		"\3\20\3\20\3\20\3\20\5\20\u00b5\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00c5\n\21\3\22\3\22\5\22\u00c9"+
		"\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\5\30\u00e8\n\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\5\32\u00f7\n\32\3\33\3\33\3\33\3\33\3\33\3\33\7\33"+
		"\u00ff\n\33\f\33\16\33\u0102\13\33\3\34\3\34\3\34\3\34\3\34\3\34\7\34"+
		"\u010a\n\34\f\34\16\34\u010d\13\34\3\35\3\35\3\35\5\35\u0112\n\35\3\36"+
		"\3\36\3\36\3\36\3\36\5\36\u0119\n\36\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \7"+
		" \u0124\n \f \16 \u0127\13 \3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u0132"+
		"\n\"\f\"\16\"\u0135\13\"\3#\3#\3$\3$\3$\3$\5$\u013d\n$\3%\3%\3&\3&\5&"+
		"\u0143\n&\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u014b\n\'\3(\3(\3(\3(\3(\3)\3)\5"+
		")\u0154\n)\3*\3*\3*\3*\3*\3*\7*\u015c\n*\f*\16*\u015f\13*\3+\3+\3+\2\t"+
		"\4\n\64\66>BR,\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@BDFHJLNPRT\2\n\3\2\4\6\3\2\4\7\5\2\27\31\33\34!!\3\2(-\3\2\35"+
		"\36\3\2\37!\5\2\36\36  $$\5\2\13\f./\61\61\u015a\2Y\3\2\2\2\4[\3\2\2\2"+
		"\6i\3\2\2\2\bk\3\2\2\2\nn\3\2\2\2\f{\3\2\2\2\16}\3\2\2\2\20\177\3\2\2"+
		"\2\22\u0081\3\2\2\2\24\u0090\3\2\2\2\26\u009c\3\2\2\2\30\u00a4\3\2\2\2"+
		"\32\u00a6\3\2\2\2\34\u00ae\3\2\2\2\36\u00b4\3\2\2\2 \u00c4\3\2\2\2\"\u00c8"+
		"\3\2\2\2$\u00ca\3\2\2\2&\u00d0\3\2\2\2(\u00d6\3\2\2\2*\u00dc\3\2\2\2,"+
		"\u00df\3\2\2\2.\u00e7\3\2\2\2\60\u00e9\3\2\2\2\62\u00f6\3\2\2\2\64\u00f8"+
		"\3\2\2\2\66\u0103\3\2\2\28\u0111\3\2\2\2:\u0118\3\2\2\2<\u011a\3\2\2\2"+
		">\u011c\3\2\2\2@\u0128\3\2\2\2B\u012a\3\2\2\2D\u0136\3\2\2\2F\u013c\3"+
		"\2\2\2H\u013e\3\2\2\2J\u0142\3\2\2\2L\u014a\3\2\2\2N\u014c\3\2\2\2P\u0153"+
		"\3\2\2\2R\u0155\3\2\2\2T\u0160\3\2\2\2VZ\5\4\3\2WZ\7\2\2\3XZ\3\2\2\2Y"+
		"V\3\2\2\2YW\3\2\2\2YX\3\2\2\2Z\3\3\2\2\2[\\\b\3\1\2\\]\5\6\4\2]b\3\2\2"+
		"\2^_\f\4\2\2_a\5\6\4\2`^\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2c\5\3\2"+
		"\2\2db\3\2\2\2ef\5\b\5\2fg\5,\27\2gj\3\2\2\2hj\5\24\13\2ie\3\2\2\2ih\3"+
		"\2\2\2j\7\3\2\2\2kl\5\20\t\2lm\5\n\6\2m\t\3\2\2\2no\b\6\1\2op\5\f\7\2"+
		"pv\3\2\2\2qr\f\4\2\2rs\7\20\2\2su\5\f\7\2tq\3\2\2\2ux\3\2\2\2vt\3\2\2"+
		"\2vw\3\2\2\2w\13\3\2\2\2xv\3\2\2\2y|\5\16\b\2z|\5\62\32\2{y\3\2\2\2{z"+
		"\3\2\2\2|\r\3\2\2\2}~\7\60\2\2~\17\3\2\2\2\177\u0080\t\2\2\2\u0080\21"+
		"\3\2\2\2\u0081\u0082\t\3\2\2\u0082\23\3\2\2\2\u0083\u0084\5\22\n\2\u0084"+
		"\u0085\7\60\2\2\u0085\u0086\7\21\2\2\u0086\u0087\5\26\f\2\u0087\u0088"+
		"\7\22\2\2\u0088\u0089\5\30\r\2\u0089\u0091\3\2\2\2\u008a\u008b\7\60\2"+
		"\2\u008b\u008c\7\21\2\2\u008c\u008d\5\26\f\2\u008d\u008e\7\22\2\2\u008e"+
		"\u008f\5\30\r\2\u008f\u0091\3\2\2\2\u0090\u0083\3\2\2\2\u0090\u008a\3"+
		"\2\2\2\u0091\25\3\2\2\2\u0092\u0093\5\20\t\2\u0093\u0094\5\16\b\2\u0094"+
		"\u0095\5\26\f\2\u0095\u009d\3\2\2\2\u0096\u0097\7\20\2\2\u0097\u0098\5"+
		"\20\t\2\u0098\u0099\5\16\b\2\u0099\u009a\5\26\f\2\u009a\u009d\3\2\2\2"+
		"\u009b\u009d\3\2\2\2\u009c\u0092\3\2\2\2\u009c\u0096\3\2\2\2\u009c\u009b"+
		"\3\2\2\2\u009d\27\3\2\2\2\u009e\u00a5\5\36\20\2\u009f\u00a5\5\32\16\2"+
		"\u00a0\u00a5\5 \21\2\u00a1\u00a5\5\"\22\2\u00a2\u00a5\5.\30\2\u00a3\u00a5"+
		"\5\6\4\2\u00a4\u009e\3\2\2\2\u00a4\u009f\3\2\2\2\u00a4\u00a0\3\2\2\2\u00a4"+
		"\u00a1\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a3\3\2\2\2\u00a5\31\3\2\2"+
		"\2\u00a6\u00a7\7\23\2\2\u00a7\u00a8\5\34\17\2\u00a8\u00a9\7\24\2\2\u00a9"+
		"\33\3\2\2\2\u00aa\u00ab\5\30\r\2\u00ab\u00ac\5\34\17\2\u00ac\u00af\3\2"+
		"\2\2\u00ad\u00af\3\2\2\2\u00ae\u00aa\3\2\2\2\u00ae\u00ad\3\2\2\2\u00af"+
		"\35\3\2\2\2\u00b0\u00b1\5\62\32\2\u00b1\u00b2\5,\27\2\u00b2\u00b5\3\2"+
		"\2\2\u00b3\u00b5\5,\27\2\u00b4\u00b0\3\2\2\2\u00b4\u00b3\3\2\2\2\u00b5"+
		"\37\3\2\2\2\u00b6\u00b7\7\b\2\2\u00b7\u00b8\7\21\2\2\u00b8\u00b9\5\64"+
		"\33\2\u00b9\u00ba\7\22\2\2\u00ba\u00bb\5\30\r\2\u00bb\u00c5\3\2\2\2\u00bc"+
		"\u00bd\7\b\2\2\u00bd\u00be\7\21\2\2\u00be\u00bf\5\64\33\2\u00bf\u00c0"+
		"\7\22\2\2\u00c0\u00c1\5\30\r\2\u00c1\u00c2\7\t\2\2\u00c2\u00c3\5\30\r"+
		"\2\u00c3\u00c5\3\2\2\2\u00c4\u00b6\3\2\2\2\u00c4\u00bc\3\2\2\2\u00c5!"+
		"\3\2\2\2\u00c6\u00c9\5$\23\2\u00c7\u00c9\5&\24\2\u00c8\u00c6\3\2\2\2\u00c8"+
		"\u00c7\3\2\2\2\u00c9#\3\2\2\2\u00ca\u00cb\7\r\2\2\u00cb\u00cc\7\21\2\2"+
		"\u00cc\u00cd\5\64\33\2\u00cd\u00ce\7\22\2\2\u00ce\u00cf\5\30\r\2\u00cf"+
		"%\3\2\2\2\u00d0\u00d1\7\16\2\2\u00d1\u00d2\7\21\2\2\u00d2\u00d3\5(\25"+
		"\2\u00d3\u00d4\7\22\2\2\u00d4\u00d5\5\30\r\2\u00d5\'\3\2\2\2\u00d6\u00d7"+
		"\5*\26\2\u00d7\u00d8\7\17\2\2\u00d8\u00d9\5\64\33\2\u00d9\u00da\7\17\2"+
		"\2\u00da\u00db\5\62\32\2\u00db)\3\2\2\2\u00dc\u00dd\5\20\t\2\u00dd\u00de"+
		"\5\n\6\2\u00de+\3\2\2\2\u00df\u00e0\7\17\2\2\u00e0-\3\2\2\2\u00e1\u00e2"+
		"\7\n\2\2\u00e2\u00e8\5,\27\2\u00e3\u00e4\7\n\2\2\u00e4\u00e5\5\62\32\2"+
		"\u00e5\u00e6\5,\27\2\u00e6\u00e8\3\2\2\2\u00e7\u00e1\3\2\2\2\u00e7\u00e3"+
		"\3\2\2\2\u00e8/\3\2\2\2\u00e9\u00ea\t\4\2\2\u00ea\61\3\2\2\2\u00eb\u00ec"+
		"\5\16\b\2\u00ec\u00ed\5\60\31\2\u00ed\u00ee\5\62\32\2\u00ee\u00f7\3\2"+
		"\2\2\u00ef\u00f0\5\16\b\2\u00f0\u00f1\7\"\2\2\u00f1\u00f7\3\2\2\2\u00f2"+
		"\u00f3\5\16\b\2\u00f3\u00f4\7#\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f7\5\64"+
		"\33\2\u00f6\u00eb\3\2\2\2\u00f6\u00ef\3\2\2\2\u00f6\u00f2\3\2\2\2\u00f6"+
		"\u00f5\3\2\2\2\u00f7\63\3\2\2\2\u00f8\u00f9\b\33\1\2\u00f9\u00fa\5\66"+
		"\34\2\u00fa\u0100\3\2\2\2\u00fb\u00fc\f\4\2\2\u00fc\u00fd\7%\2\2\u00fd"+
		"\u00ff\5\66\34\2\u00fe\u00fb\3\2\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3"+
		"\2\2\2\u0100\u0101\3\2\2\2\u0101\65\3\2\2\2\u0102\u0100\3\2\2\2\u0103"+
		"\u0104\b\34\1\2\u0104\u0105\58\35\2\u0105\u010b\3\2\2\2\u0106\u0107\f"+
		"\4\2\2\u0107\u0108\7&\2\2\u0108\u010a\58\35\2\u0109\u0106\3\2\2\2\u010a"+
		"\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\67\3\2\2"+
		"\2\u010d\u010b\3\2\2\2\u010e\u010f\7\'\2\2\u010f\u0112\58\35\2\u0110\u0112"+
		"\5:\36\2\u0111\u010e\3\2\2\2\u0111\u0110\3\2\2\2\u01129\3\2\2\2\u0113"+
		"\u0114\5> \2\u0114\u0115\5<\37\2\u0115\u0116\5> \2\u0116\u0119\3\2\2\2"+
		"\u0117\u0119\5> \2\u0118\u0113\3\2\2\2\u0118\u0117\3\2\2\2\u0119;\3\2"+
		"\2\2\u011a\u011b\t\5\2\2\u011b=\3\2\2\2\u011c\u011d\b \1\2\u011d\u011e"+
		"\5B\"\2\u011e\u0125\3\2\2\2\u011f\u0120\f\4\2\2\u0120\u0121\5@!\2\u0121"+
		"\u0122\5B\"\2\u0122\u0124\3\2\2\2\u0123\u011f\3\2\2\2\u0124\u0127\3\2"+
		"\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126?\3\2\2\2\u0127\u0125"+
		"\3\2\2\2\u0128\u0129\t\6\2\2\u0129A\3\2\2\2\u012a\u012b\b\"\1\2\u012b"+
		"\u012c\5F$\2\u012c\u0133\3\2\2\2\u012d\u012e\f\4\2\2\u012e\u012f\5D#\2"+
		"\u012f\u0130\5F$\2\u0130\u0132\3\2\2\2\u0131\u012d\3\2\2\2\u0132\u0135"+
		"\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134C\3\2\2\2\u0135"+
		"\u0133\3\2\2\2\u0136\u0137\t\7\2\2\u0137E\3\2\2\2\u0138\u0139\5H%\2\u0139"+
		"\u013a\5F$\2\u013a\u013d\3\2\2\2\u013b\u013d\5J&\2\u013c\u0138\3\2\2\2"+
		"\u013c\u013b\3\2\2\2\u013dG\3\2\2\2\u013e\u013f\t\b\2\2\u013fI\3\2\2\2"+
		"\u0140\u0143\5L\'\2\u0141\u0143\5\16\b\2\u0142\u0140\3\2\2\2\u0142\u0141"+
		"\3\2\2\2\u0143K\3\2\2\2\u0144\u0145\7\21\2\2\u0145\u0146\5\62\32\2\u0146"+
		"\u0147\7\22\2\2\u0147\u014b\3\2\2\2\u0148\u014b\5N(\2\u0149\u014b\5T+"+
		"\2\u014a\u0144\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u0149\3\2\2\2\u014bM"+
		"\3\2\2\2\u014c\u014d\5\16\b\2\u014d\u014e\7\21\2\2\u014e\u014f\5P)\2\u014f"+
		"\u0150\7\22\2\2\u0150O\3\2\2\2\u0151\u0154\5R*\2\u0152\u0154\3\2\2\2\u0153"+
		"\u0151\3\2\2\2\u0153\u0152\3\2\2\2\u0154Q\3\2\2\2\u0155\u0156\b*\1\2\u0156"+
		"\u0157\5\62\32\2\u0157\u015d\3\2\2\2\u0158\u0159\f\4\2\2\u0159\u015a\7"+
		"\20\2\2\u015a\u015c\5\62\32\2\u015b\u0158\3\2\2\2\u015c\u015f\3\2\2\2"+
		"\u015d\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015eS\3\2\2\2\u015f\u015d\3"+
		"\2\2\2\u0160\u0161\t\t\2\2\u0161U\3\2\2\2\33Ybiv{\u0090\u009c\u00a4\u00ae"+
		"\u00b4\u00c4\u00c8\u00e7\u00f6\u0100\u010b\u0111\u0118\u0125\u0133\u013c"+
		"\u0142\u014a\u0153\u015d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}