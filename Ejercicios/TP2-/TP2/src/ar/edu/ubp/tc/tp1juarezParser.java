// Generated from C:\Users\mauroandres\Documents\NetBeansProjects\TP1Juarez\src\ar\edu\u005Cubp\tc\tp1juarez.g4 by ANTLR 4.5.3
package ar.edu.ubp.tc;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class tp1juarezParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, TFLOAT=2, TINT=3, TCHAR=4, TDOUBLE=5, IF=6, FOR=7, WHILE=8, VOID=9, 
		RETURN=10, COLON=11, SEMICOLON=12, LPAREN=13, RPAREN=14, LBRACKET=15, 
		RBRACKET=16, LBRACE=17, RBRACE=18, PLUS=19, LESS=20, DIVIDE=21, MULTIPLY=22, 
		AND=23, OR=24, ASIGN=25, EQUALS=26, DIF=27, SMALLEREQ=28, HIGHEREQ=29, 
		SMALLER=30, HIGHER=31, INT=32, FLOAT=33, ID=34;
	public static final int
		RULE_vtype = 0, RULE_val = 1, RULE_dec = 2, RULE_ftype = 3, RULE_arg = 4, 
		RULE_ret = 5, RULE_func = 6, RULE_condition = 7, RULE_conditions = 8, 
		RULE_ifc = 9, RULE_forc = 10, RULE_whilec = 11, RULE_operator = 12, RULE_operation = 13, 
		RULE_operations = 14, RULE_ops = 15, RULE_code = 16, RULE_cblock = 17, 
		RULE_instr = 18, RULE_instruction = 19;
	public static final String[] ruleNames = {
		"vtype", "val", "dec", "ftype", "arg", "ret", "func", "condition", "conditions", 
		"ifc", "forc", "whilec", "operator", "operation", "operations", "ops", 
		"code", "cblock", "instr", "instruction"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'float'", "'int'", "'char'", "'double'", "'if'", "'for'", 
		"'while'", "'void'", "'return'", "','", "';'", "'('", "')'", "'['", "']'", 
		"'{'", "'}'", "'+'", "'-'", "'/'", "'*'", "'&&'", "'||'", "'='", "'=='", 
		"'!='", "'<='", "'>='", "'<'", "'>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "TFLOAT", "TINT", "TCHAR", "TDOUBLE", "IF", "FOR", "WHILE", 
		"VOID", "RETURN", "COLON", "SEMICOLON", "LPAREN", "RPAREN", "LBRACKET", 
		"RBRACKET", "LBRACE", "RBRACE", "PLUS", "LESS", "DIVIDE", "MULTIPLY", 
		"AND", "OR", "ASIGN", "EQUALS", "DIF", "SMALLEREQ", "HIGHEREQ", "SMALLER", 
		"HIGHER", "INT", "FLOAT", "ID"
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
	public String getGrammarFileName() { return "tp1juarez.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public tp1juarezParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class VtypeContext extends ParserRuleContext {
		public TerminalNode TINT() { return getToken(tp1juarezParser.TINT, 0); }
		public TerminalNode TFLOAT() { return getToken(tp1juarezParser.TFLOAT, 0); }
		public TerminalNode TCHAR() { return getToken(tp1juarezParser.TCHAR, 0); }
		public TerminalNode TDOUBLE() { return getToken(tp1juarezParser.TDOUBLE, 0); }
		public VtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vtype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tp1juarezListener ) ((tp1juarezListener)listener).enterVtype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp1juarezListener ) ((tp1juarezListener)listener).exitVtype(this);
		}
	}

	public final VtypeContext vtype() throws RecognitionException {
		VtypeContext _localctx = new VtypeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_vtype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TFLOAT) | (1L << TINT) | (1L << TCHAR) | (1L << TDOUBLE))) != 0)) ) {
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

	public static class ValContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(tp1juarezParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(tp1juarezParser.INT, 0); }
		public TerminalNode ID() { return getToken(tp1juarezParser.ID, 0); }
		public ValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tp1juarezListener ) ((tp1juarezListener)listener).enterVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp1juarezListener ) ((tp1juarezListener)listener).exitVal(this);
		}
	}

	public final ValContext val() throws RecognitionException {
		ValContext _localctx = new ValContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_val);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << ID))) != 0)) ) {
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

	public static class DecContext extends ParserRuleContext {
		public VtypeContext vtype() {
			return getRuleContext(VtypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(tp1juarezParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(tp1juarezParser.ID, i);
		}
		public TerminalNode LBRACKET() { return getToken(tp1juarezParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(tp1juarezParser.RBRACKET, 0); }
		public TerminalNode INT() { return getToken(tp1juarezParser.INT, 0); }
		public List<TerminalNode> MULTIPLY() { return getTokens(tp1juarezParser.MULTIPLY); }
		public TerminalNode MULTIPLY(int i) {
			return getToken(tp1juarezParser.MULTIPLY, i);
		}
		public List<TerminalNode> ASIGN() { return getTokens(tp1juarezParser.ASIGN); }
		public TerminalNode ASIGN(int i) {
			return getToken(tp1juarezParser.ASIGN, i);
		}
		public List<ValContext> val() {
			return getRuleContexts(ValContext.class);
		}
		public ValContext val(int i) {
			return getRuleContext(ValContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(tp1juarezParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(tp1juarezParser.COLON, i);
		}
		public DecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tp1juarezListener ) ((tp1juarezListener)listener).enterDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp1juarezListener ) ((tp1juarezListener)listener).exitDec(this);
		}
	}

	public final DecContext dec() throws RecognitionException {
		DecContext _localctx = new DecContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_dec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			vtype();
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(45);
				match(ID);
				setState(64);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(48);
					_la = _input.LA(1);
					if (_la==ASIGN) {
						{
						setState(46);
						match(ASIGN);
						setState(47);
						val();
						}
					}

					}
					break;
				case 2:
					{
					setState(60); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(52);
						_la = _input.LA(1);
						if (_la==ASIGN) {
							{
							setState(50);
							match(ASIGN);
							setState(51);
							val();
							}
						}

						setState(54);
						match(COLON);
						setState(55);
						match(ID);
						setState(58);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
						case 1:
							{
							setState(56);
							match(ASIGN);
							setState(57);
							val();
							}
							break;
						}
						}
						}
						setState(62); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==COLON || _la==ASIGN );
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(66);
				match(ID);
				setState(67);
				match(LBRACKET);
				setState(69);
				_la = _input.LA(1);
				if (_la==INT) {
					{
					setState(68);
					match(INT);
					}
				}

				setState(71);
				match(RBRACKET);
				}
				break;
			case 3:
				{
				setState(73); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(72);
					match(MULTIPLY);
					}
					}
					setState(75); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==MULTIPLY );
				setState(77);
				match(ID);
				}
				break;
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

	public static class FtypeContext extends ParserRuleContext {
		public VtypeContext vtype() {
			return getRuleContext(VtypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(tp1juarezParser.VOID, 0); }
		public FtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ftype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tp1juarezListener ) ((tp1juarezListener)listener).enterFtype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp1juarezListener ) ((tp1juarezListener)listener).exitFtype(this);
		}
	}

	public final FtypeContext ftype() throws RecognitionException {
		FtypeContext _localctx = new FtypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ftype);
		try {
			setState(82);
			switch (_input.LA(1)) {
			case TFLOAT:
			case TINT:
			case TCHAR:
			case TDOUBLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				vtype();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				match(VOID);
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

	public static class ArgContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(tp1juarezParser.ID, 0); }
		public TerminalNode COLON() { return getToken(tp1juarezParser.COLON, 0); }
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public FtypeContext ftype() {
			return getRuleContext(FtypeContext.class,0);
		}
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tp1juarezListener ) ((tp1juarezListener)listener).enterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp1juarezListener ) ((tp1juarezListener)listener).exitArg(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_arg);
		try {
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				match(ID);
				setState(86);
				match(COLON);
				setState(87);
				arg();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				ftype();
				setState(89);
				match(ID);
				setState(90);
				match(COLON);
				setState(91);
				arg();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(93);
				ftype();
				setState(94);
				match(ID);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(96);
				ftype();
				setState(97);
				match(COLON);
				setState(98);
				arg();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(100);
				ftype();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
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

	public static class RetContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(tp1juarezParser.RETURN, 0); }
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public RetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ret; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tp1juarezListener ) ((tp1juarezListener)listener).enterRet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp1juarezListener ) ((tp1juarezListener)listener).exitRet(this);
		}
	}

	public final RetContext ret() throws RecognitionException {
		RetContext _localctx = new RetContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ret);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(RETURN);
			setState(105);
			val();
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

	public static class FuncContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(tp1juarezParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(tp1juarezParser.LPAREN, 0); }
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(tp1juarezParser.RPAREN, 0); }
		public FtypeContext ftype() {
			return getRuleContext(FtypeContext.class,0);
		}
		public CblockContext cblock() {
			return getRuleContext(CblockContext.class,0);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tp1juarezListener ) ((tp1juarezListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp1juarezListener ) ((tp1juarezListener)listener).exitFunc(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TFLOAT) | (1L << TINT) | (1L << TCHAR) | (1L << TDOUBLE) | (1L << VOID))) != 0)) {
				{
				setState(107);
				ftype();
				}
			}

			setState(110);
			match(ID);
			setState(111);
			match(LPAREN);
			setState(112);
			arg();
			setState(113);
			match(RPAREN);
			setState(115);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(114);
				cblock();
				}
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

	public static class ConditionContext extends ParserRuleContext {
		public List<ValContext> val() {
			return getRuleContexts(ValContext.class);
		}
		public ValContext val(int i) {
			return getRuleContext(ValContext.class,i);
		}
		public TerminalNode EQUALS() { return getToken(tp1juarezParser.EQUALS, 0); }
		public TerminalNode DIF() { return getToken(tp1juarezParser.DIF, 0); }
		public TerminalNode SMALLEREQ() { return getToken(tp1juarezParser.SMALLEREQ, 0); }
		public TerminalNode SMALLER() { return getToken(tp1juarezParser.SMALLER, 0); }
		public TerminalNode HIGHER() { return getToken(tp1juarezParser.HIGHER, 0); }
		public TerminalNode HIGHEREQ() { return getToken(tp1juarezParser.HIGHEREQ, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tp1juarezListener ) ((tp1juarezListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp1juarezListener ) ((tp1juarezListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			val();
			setState(124);
			switch (_input.LA(1)) {
			case EQUALS:
				{
				setState(118);
				match(EQUALS);
				}
				break;
			case DIF:
				{
				setState(119);
				match(DIF);
				setState(120);
				match(SMALLEREQ);
				}
				break;
			case SMALLER:
				{
				setState(121);
				match(SMALLER);
				}
				break;
			case HIGHER:
				{
				setState(122);
				match(HIGHER);
				}
				break;
			case HIGHEREQ:
				{
				setState(123);
				match(HIGHEREQ);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(126);
			val();
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

	public static class ConditionsContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(tp1juarezParser.LPAREN, 0); }
		public List<ConditionsContext> conditions() {
			return getRuleContexts(ConditionsContext.class);
		}
		public ConditionsContext conditions(int i) {
			return getRuleContext(ConditionsContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(tp1juarezParser.RPAREN, 0); }
		public TerminalNode AND() { return getToken(tp1juarezParser.AND, 0); }
		public TerminalNode OR() { return getToken(tp1juarezParser.OR, 0); }
		public TerminalNode LBRACE() { return getToken(tp1juarezParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(tp1juarezParser.RBRACE, 0); }
		public TerminalNode LBRACKET() { return getToken(tp1juarezParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(tp1juarezParser.RBRACKET, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ConditionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tp1juarezListener ) ((tp1juarezListener)listener).enterConditions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp1juarezListener ) ((tp1juarezListener)listener).exitConditions(this);
		}
	}

	public final ConditionsContext conditions() throws RecognitionException {
		ConditionsContext _localctx = new ConditionsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_conditions);
		int _la;
		try {
			setState(158);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				match(LPAREN);
				setState(129);
				conditions();
				setState(130);
				match(RPAREN);
				setState(132);
				_la = _input.LA(1);
				if (_la==AND || _la==OR) {
					{
					setState(131);
					_la = _input.LA(1);
					if ( !(_la==AND || _la==OR) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(134);
				conditions();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				match(LBRACE);
				setState(137);
				conditions();
				setState(138);
				match(RBRACE);
				setState(140);
				_la = _input.LA(1);
				if (_la==AND || _la==OR) {
					{
					setState(139);
					_la = _input.LA(1);
					if ( !(_la==AND || _la==OR) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(142);
				conditions();
				}
				break;
			case LBRACKET:
				enterOuterAlt(_localctx, 3);
				{
				setState(144);
				match(LBRACKET);
				setState(145);
				conditions();
				setState(146);
				match(RBRACKET);
				setState(148);
				_la = _input.LA(1);
				if (_la==AND || _la==OR) {
					{
					setState(147);
					_la = _input.LA(1);
					if ( !(_la==AND || _la==OR) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(150);
				conditions();
				}
				break;
			case INT:
			case FLOAT:
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(152);
				condition();
				setState(155);
				_la = _input.LA(1);
				if (_la==AND || _la==OR) {
					{
					setState(153);
					_la = _input.LA(1);
					if ( !(_la==AND || _la==OR) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(154);
					conditions();
					}
				}

				}
				break;
			case RPAREN:
			case RBRACKET:
			case RBRACE:
				enterOuterAlt(_localctx, 5);
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

	public static class IfcContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(tp1juarezParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(tp1juarezParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(tp1juarezParser.RPAREN, 0); }
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public InstrContext instr() {
			return getRuleContext(InstrContext.class,0);
		}
		public CblockContext cblock() {
			return getRuleContext(CblockContext.class,0);
		}
		public IfcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tp1juarezListener ) ((tp1juarezListener)listener).enterIfc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp1juarezListener ) ((tp1juarezListener)listener).exitIfc(this);
		}
	}

	public final IfcContext ifc() throws RecognitionException {
		IfcContext _localctx = new IfcContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ifc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(IF);
			setState(161);
			match(LPAREN);
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(162);
				conditions();
				}
				break;
			case 2:
				{
				setState(163);
				val();
				}
				break;
			}
			setState(166);
			match(RPAREN);
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(167);
				instr();
				}
				break;
			case 2:
				{
				setState(168);
				cblock();
				}
				break;
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

	public static class ForcContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(tp1juarezParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(tp1juarezParser.LPAREN, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(tp1juarezParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(tp1juarezParser.SEMICOLON, i);
		}
		public TerminalNode RPAREN() { return getToken(tp1juarezParser.RPAREN, 0); }
		public List<InstrContext> instr() {
			return getRuleContexts(InstrContext.class);
		}
		public InstrContext instr(int i) {
			return getRuleContext(InstrContext.class,i);
		}
		public CblockContext cblock() {
			return getRuleContext(CblockContext.class,0);
		}
		public ForcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tp1juarezListener ) ((tp1juarezListener)listener).enterForc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp1juarezListener ) ((tp1juarezListener)listener).exitForc(this);
		}
	}

	public final ForcContext forc() throws RecognitionException {
		ForcContext _localctx = new ForcContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_forc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(FOR);
			setState(172);
			match(LPAREN);
			setState(174);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TFLOAT) | (1L << TINT) | (1L << TCHAR) | (1L << TDOUBLE) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << VOID) | (1L << RETURN) | (1L << INT) | (1L << FLOAT) | (1L << ID))) != 0)) {
				{
				setState(173);
				instr();
				}
			}

			setState(176);
			match(SEMICOLON);
			setState(178);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TFLOAT) | (1L << TINT) | (1L << TCHAR) | (1L << TDOUBLE) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << VOID) | (1L << RETURN) | (1L << INT) | (1L << FLOAT) | (1L << ID))) != 0)) {
				{
				setState(177);
				instr();
				}
			}

			setState(180);
			match(SEMICOLON);
			setState(182);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TFLOAT) | (1L << TINT) | (1L << TCHAR) | (1L << TDOUBLE) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << VOID) | (1L << RETURN) | (1L << INT) | (1L << FLOAT) | (1L << ID))) != 0)) {
				{
				setState(181);
				instr();
				}
			}

			setState(184);
			match(RPAREN);
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(185);
				instr();
				}
				break;
			case 2:
				{
				setState(186);
				cblock();
				}
				break;
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

	public static class WhilecContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(tp1juarezParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(tp1juarezParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(tp1juarezParser.RPAREN, 0); }
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public InstrContext instr() {
			return getRuleContext(InstrContext.class,0);
		}
		public CblockContext cblock() {
			return getRuleContext(CblockContext.class,0);
		}
		public WhilecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tp1juarezListener ) ((tp1juarezListener)listener).enterWhilec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp1juarezListener ) ((tp1juarezListener)listener).exitWhilec(this);
		}
	}

	public final WhilecContext whilec() throws RecognitionException {
		WhilecContext _localctx = new WhilecContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_whilec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(WHILE);
			setState(190);
			match(LPAREN);
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(191);
				conditions();
				}
				break;
			case 2:
				{
				setState(192);
				val();
				}
				break;
			}
			setState(195);
			match(RPAREN);
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(196);
				instr();
				}
				break;
			case 2:
				{
				setState(197);
				cblock();
				}
				break;
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

	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode LESS() { return getToken(tp1juarezParser.LESS, 0); }
		public TerminalNode PLUS() { return getToken(tp1juarezParser.PLUS, 0); }
		public TerminalNode DIVIDE() { return getToken(tp1juarezParser.DIVIDE, 0); }
		public TerminalNode MULTIPLY() { return getToken(tp1juarezParser.MULTIPLY, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tp1juarezListener ) ((tp1juarezListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp1juarezListener ) ((tp1juarezListener)listener).exitOperator(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << LESS) | (1L << DIVIDE) | (1L << MULTIPLY))) != 0)) ) {
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

	public static class OperationContext extends ParserRuleContext {
		public List<OperatorContext> operator() {
			return getRuleContexts(OperatorContext.class);
		}
		public OperatorContext operator(int i) {
			return getRuleContext(OperatorContext.class,i);
		}
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(tp1juarezParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(tp1juarezParser.RPAREN, 0); }
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tp1juarezListener ) ((tp1juarezListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp1juarezListener ) ((tp1juarezListener)listener).exitOperation(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_operation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(210);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(202);
					val();
					}
					break;
				case 2:
					{
					setState(203);
					func();
					}
					break;
				case 3:
					{
					setState(204);
					match(LPAREN);
					setState(205);
					operation();
					setState(206);
					operator();
					setState(207);
					operation();
					setState(208);
					match(RPAREN);
					}
					break;
				}
				setState(212);
				operator();
				setState(213);
				operation();
				}
				break;
			case 2:
				{
				setState(215);
				match(LPAREN);
				setState(216);
				operation();
				setState(217);
				operator();
				setState(218);
				operation();
				setState(219);
				match(RPAREN);
				}
				break;
			case 3:
				{
				setState(221);
				val();
				}
				break;
			case 4:
				{
				setState(222);
				func();
				}
				break;
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

	public static class OperationsContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(tp1juarezParser.LPAREN, 0); }
		public List<OperationsContext> operations() {
			return getRuleContexts(OperationsContext.class);
		}
		public OperationsContext operations(int i) {
			return getRuleContext(OperationsContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(tp1juarezParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(tp1juarezParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(tp1juarezParser.RBRACE, 0); }
		public TerminalNode LBRACKET() { return getToken(tp1juarezParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(tp1juarezParser.RBRACKET, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public OperationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tp1juarezListener ) ((tp1juarezListener)listener).enterOperations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp1juarezListener ) ((tp1juarezListener)listener).exitOperations(this);
		}
	}

	public final OperationsContext operations() throws RecognitionException {
		OperationsContext _localctx = new OperationsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_operations);
		try {
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				match(LPAREN);
				setState(226);
				operations();
				setState(227);
				match(RPAREN);
				setState(228);
				operations();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				match(LBRACE);
				setState(231);
				operations();
				setState(232);
				match(RBRACE);
				setState(233);
				operations();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(235);
				match(LBRACKET);
				setState(236);
				operations();
				setState(237);
				match(RBRACKET);
				setState(238);
				operations();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(240);
				operation();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
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

	public static class OpsContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(tp1juarezParser.ID, 0); }
		public List<TerminalNode> PLUS() { return getTokens(tp1juarezParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(tp1juarezParser.PLUS, i);
		}
		public List<TerminalNode> LESS() { return getTokens(tp1juarezParser.LESS); }
		public TerminalNode LESS(int i) {
			return getToken(tp1juarezParser.LESS, i);
		}
		public TerminalNode ASIGN() { return getToken(tp1juarezParser.ASIGN, 0); }
		public OperationsContext operations() {
			return getRuleContext(OperationsContext.class,0);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public OpsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ops; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tp1juarezListener ) ((tp1juarezListener)listener).enterOps(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp1juarezListener ) ((tp1juarezListener)listener).exitOps(this);
		}
	}

	public final OpsContext ops() throws RecognitionException {
		OpsContext _localctx = new OpsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_ops);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(244);
				match(ID);
				setState(245);
				match(PLUS);
				setState(246);
				match(PLUS);
				}
				break;
			case 2:
				{
				setState(247);
				match(ID);
				setState(248);
				match(LESS);
				setState(249);
				match(LESS);
				}
				break;
			case 3:
				{
				setState(250);
				match(ID);
				setState(252);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << LESS) | (1L << DIVIDE) | (1L << MULTIPLY))) != 0)) {
					{
					setState(251);
					operator();
					}
				}

				setState(254);
				match(ASIGN);
				setState(255);
				operations();
				}
				break;
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

	public static class CodeContext extends ParserRuleContext {
		public InstrContext instr() {
			return getRuleContext(InstrContext.class,0);
		}
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(tp1juarezParser.SEMICOLON, 0); }
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tp1juarezListener ) ((tp1juarezListener)listener).enterCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp1juarezListener ) ((tp1juarezListener)listener).exitCode(this);
		}
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_code);
		int _la;
		try {
			setState(265);
			switch (_input.LA(1)) {
			case TFLOAT:
			case TINT:
			case TCHAR:
			case TDOUBLE:
			case IF:
			case FOR:
			case WHILE:
			case VOID:
			case RETURN:
			case INT:
			case FLOAT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				instr();
				setState(260);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(259);
					match(SEMICOLON);
					}
				}

				setState(262);
				code();
				}
				break;
			case RBRACE:
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

	public static class CblockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(tp1juarezParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(tp1juarezParser.RBRACE, 0); }
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public CblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tp1juarezListener ) ((tp1juarezListener)listener).enterCblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp1juarezListener ) ((tp1juarezListener)listener).exitCblock(this);
		}
	}

	public final CblockContext cblock() throws RecognitionException {
		CblockContext _localctx = new CblockContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_cblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(LBRACE);
			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(268);
				code();
				}
				break;
			}
			setState(271);
			match(RBRACE);
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

	public static class InstrContext extends ParserRuleContext {
		public DecContext dec() {
			return getRuleContext(DecContext.class,0);
		}
		public OpsContext ops() {
			return getRuleContext(OpsContext.class,0);
		}
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public IfcContext ifc() {
			return getRuleContext(IfcContext.class,0);
		}
		public ForcContext forc() {
			return getRuleContext(ForcContext.class,0);
		}
		public WhilecContext whilec() {
			return getRuleContext(WhilecContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public RetContext ret() {
			return getRuleContext(RetContext.class,0);
		}
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public InstrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tp1juarezListener ) ((tp1juarezListener)listener).enterInstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp1juarezListener ) ((tp1juarezListener)listener).exitInstr(this);
		}
	}

	public final InstrContext instr() throws RecognitionException {
		InstrContext _localctx = new InstrContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_instr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(273);
				dec();
				}
				break;
			case 2:
				{
				setState(274);
				ops();
				}
				break;
			case 3:
				{
				setState(275);
				func();
				}
				break;
			case 4:
				{
				setState(276);
				func();
				}
				break;
			case 5:
				{
				setState(277);
				ifc();
				}
				break;
			case 6:
				{
				setState(278);
				forc();
				}
				break;
			case 7:
				{
				setState(279);
				whilec();
				}
				break;
			case 8:
				{
				setState(280);
				condition();
				}
				break;
			case 9:
				{
				setState(281);
				ret();
				}
				break;
			case 10:
				{
				setState(282);
				val();
				}
				break;
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

	public static class InstructionContext extends ParserRuleContext {
		public InstrContext instr() {
			return getRuleContext(InstrContext.class,0);
		}
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(tp1juarezParser.SEMICOLON, 0); }
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tp1juarezListener ) ((tp1juarezListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp1juarezListener ) ((tp1juarezListener)listener).exitInstruction(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_instruction);
		int _la;
		try {
			setState(293);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				instr();
				setState(287);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(286);
					match(SEMICOLON);
					}
				}

				setState(289);
				instruction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3$\u012a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\5\4\63"+
		"\n\4\3\4\3\4\5\4\67\n\4\3\4\3\4\3\4\3\4\5\4=\n\4\6\4?\n\4\r\4\16\4@\5"+
		"\4C\n\4\3\4\3\4\3\4\5\4H\n\4\3\4\3\4\6\4L\n\4\r\4\16\4M\3\4\5\4Q\n\4\3"+
		"\5\3\5\5\5U\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\5\6i\n\6\3\7\3\7\3\7\3\b\5\bo\n\b\3\b\3\b\3\b\3\b\3"+
		"\b\5\bv\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\177\n\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\5\n\u0087\n\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u008f\n\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\5\n\u0097\n\n\3\n\3\n\3\n\3\n\3\n\5\n\u009e\n\n\3\n\5\n\u00a1"+
		"\n\n\3\13\3\13\3\13\3\13\5\13\u00a7\n\13\3\13\3\13\3\13\5\13\u00ac\n\13"+
		"\3\f\3\f\3\f\5\f\u00b1\n\f\3\f\3\f\5\f\u00b5\n\f\3\f\3\f\5\f\u00b9\n\f"+
		"\3\f\3\f\3\f\5\f\u00be\n\f\3\r\3\r\3\r\3\r\5\r\u00c4\n\r\3\r\3\r\3\r\5"+
		"\r\u00c9\n\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00d5"+
		"\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00e2"+
		"\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\5\20\u00f5\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\5\21\u00ff\n\21\3\21\3\21\5\21\u0103\n\21\3\22\3\22\5\22\u0107\n"+
		"\22\3\22\3\22\3\22\5\22\u010c\n\22\3\23\3\23\5\23\u0110\n\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u011e\n\24\3\25"+
		"\3\25\5\25\u0122\n\25\3\25\3\25\3\25\3\25\5\25\u0128\n\25\3\25\2\2\26"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\6\3\2\4\7\3\2\"$\3\2\31"+
		"\32\3\2\25\30\u0159\2*\3\2\2\2\4,\3\2\2\2\6.\3\2\2\2\bT\3\2\2\2\nh\3\2"+
		"\2\2\fj\3\2\2\2\16n\3\2\2\2\20w\3\2\2\2\22\u00a0\3\2\2\2\24\u00a2\3\2"+
		"\2\2\26\u00ad\3\2\2\2\30\u00bf\3\2\2\2\32\u00ca\3\2\2\2\34\u00e1\3\2\2"+
		"\2\36\u00f4\3\2\2\2 \u0102\3\2\2\2\"\u010b\3\2\2\2$\u010d\3\2\2\2&\u011d"+
		"\3\2\2\2(\u0127\3\2\2\2*+\t\2\2\2+\3\3\2\2\2,-\t\3\2\2-\5\3\2\2\2.P\5"+
		"\2\2\2/B\7$\2\2\60\61\7\33\2\2\61\63\5\4\3\2\62\60\3\2\2\2\62\63\3\2\2"+
		"\2\63C\3\2\2\2\64\65\7\33\2\2\65\67\5\4\3\2\66\64\3\2\2\2\66\67\3\2\2"+
		"\2\678\3\2\2\289\7\r\2\29<\7$\2\2:;\7\33\2\2;=\5\4\3\2<:\3\2\2\2<=\3\2"+
		"\2\2=?\3\2\2\2>\66\3\2\2\2?@\3\2\2\2@>\3\2\2\2@A\3\2\2\2AC\3\2\2\2B\62"+
		"\3\2\2\2B>\3\2\2\2CQ\3\2\2\2DE\7$\2\2EG\7\21\2\2FH\7\"\2\2GF\3\2\2\2G"+
		"H\3\2\2\2HI\3\2\2\2IQ\7\22\2\2JL\7\30\2\2KJ\3\2\2\2LM\3\2\2\2MK\3\2\2"+
		"\2MN\3\2\2\2NO\3\2\2\2OQ\7$\2\2P/\3\2\2\2PD\3\2\2\2PK\3\2\2\2Q\7\3\2\2"+
		"\2RU\5\2\2\2SU\7\13\2\2TR\3\2\2\2TS\3\2\2\2U\t\3\2\2\2Vi\7$\2\2WX\7$\2"+
		"\2XY\7\r\2\2Yi\5\n\6\2Z[\5\b\5\2[\\\7$\2\2\\]\7\r\2\2]^\5\n\6\2^i\3\2"+
		"\2\2_`\5\b\5\2`a\7$\2\2ai\3\2\2\2bc\5\b\5\2cd\7\r\2\2de\5\n\6\2ei\3\2"+
		"\2\2fi\5\b\5\2gi\3\2\2\2hV\3\2\2\2hW\3\2\2\2hZ\3\2\2\2h_\3\2\2\2hb\3\2"+
		"\2\2hf\3\2\2\2hg\3\2\2\2i\13\3\2\2\2jk\7\f\2\2kl\5\4\3\2l\r\3\2\2\2mo"+
		"\5\b\5\2nm\3\2\2\2no\3\2\2\2op\3\2\2\2pq\7$\2\2qr\7\17\2\2rs\5\n\6\2s"+
		"u\7\20\2\2tv\5$\23\2ut\3\2\2\2uv\3\2\2\2v\17\3\2\2\2w~\5\4\3\2x\177\7"+
		"\34\2\2yz\7\35\2\2z\177\7\36\2\2{\177\7 \2\2|\177\7!\2\2}\177\7\37\2\2"+
		"~x\3\2\2\2~y\3\2\2\2~{\3\2\2\2~|\3\2\2\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080"+
		"\u0081\5\4\3\2\u0081\21\3\2\2\2\u0082\u0083\7\17\2\2\u0083\u0084\5\22"+
		"\n\2\u0084\u0086\7\20\2\2\u0085\u0087\t\4\2\2\u0086\u0085\3\2\2\2\u0086"+
		"\u0087\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\5\22\n\2\u0089\u00a1\3"+
		"\2\2\2\u008a\u008b\7\23\2\2\u008b\u008c\5\22\n\2\u008c\u008e\7\24\2\2"+
		"\u008d\u008f\t\4\2\2\u008e\u008d\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090"+
		"\3\2\2\2\u0090\u0091\5\22\n\2\u0091\u00a1\3\2\2\2\u0092\u0093\7\21\2\2"+
		"\u0093\u0094\5\22\n\2\u0094\u0096\7\22\2\2\u0095\u0097\t\4\2\2\u0096\u0095"+
		"\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\5\22\n\2"+
		"\u0099\u00a1\3\2\2\2\u009a\u009d\5\20\t\2\u009b\u009c\t\4\2\2\u009c\u009e"+
		"\5\22\n\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a1\3\2\2\2"+
		"\u009f\u00a1\3\2\2\2\u00a0\u0082\3\2\2\2\u00a0\u008a\3\2\2\2\u00a0\u0092"+
		"\3\2\2\2\u00a0\u009a\3\2\2\2\u00a0\u009f\3\2\2\2\u00a1\23\3\2\2\2\u00a2"+
		"\u00a3\7\b\2\2\u00a3\u00a6\7\17\2\2\u00a4\u00a7\5\22\n\2\u00a5\u00a7\5"+
		"\4\3\2\u00a6\u00a4\3\2\2\2\u00a6\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8"+
		"\u00ab\7\20\2\2\u00a9\u00ac\5&\24\2\u00aa\u00ac\5$\23\2\u00ab\u00a9\3"+
		"\2\2\2\u00ab\u00aa\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\25\3\2\2\2\u00ad"+
		"\u00ae\7\t\2\2\u00ae\u00b0\7\17\2\2\u00af\u00b1\5&\24\2\u00b0\u00af\3"+
		"\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b4\7\16\2\2\u00b3"+
		"\u00b5\5&\24\2\u00b4\u00b3\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\3\2"+
		"\2\2\u00b6\u00b8\7\16\2\2\u00b7\u00b9\5&\24\2\u00b8\u00b7\3\2\2\2\u00b8"+
		"\u00b9\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bd\7\20\2\2\u00bb\u00be\5"+
		"&\24\2\u00bc\u00be\5$\23\2\u00bd\u00bb\3\2\2\2\u00bd\u00bc\3\2\2\2\u00bd"+
		"\u00be\3\2\2\2\u00be\27\3\2\2\2\u00bf\u00c0\7\n\2\2\u00c0\u00c3\7\17\2"+
		"\2\u00c1\u00c4\5\22\n\2\u00c2\u00c4\5\4\3\2\u00c3\u00c1\3\2\2\2\u00c3"+
		"\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c8\7\20\2\2\u00c6\u00c9\5"+
		"&\24\2\u00c7\u00c9\5$\23\2\u00c8\u00c6\3\2\2\2\u00c8\u00c7\3\2\2\2\u00c8"+
		"\u00c9\3\2\2\2\u00c9\31\3\2\2\2\u00ca\u00cb\t\5\2\2\u00cb\33\3\2\2\2\u00cc"+
		"\u00d5\5\4\3\2\u00cd\u00d5\5\16\b\2\u00ce\u00cf\7\17\2\2\u00cf\u00d0\5"+
		"\34\17\2\u00d0\u00d1\5\32\16\2\u00d1\u00d2\5\34\17\2\u00d2\u00d3\7\20"+
		"\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00cc\3\2\2\2\u00d4\u00cd\3\2\2\2\u00d4"+
		"\u00ce\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\5\32\16\2\u00d7\u00d8\5"+
		"\34\17\2\u00d8\u00e2\3\2\2\2\u00d9\u00da\7\17\2\2\u00da\u00db\5\34\17"+
		"\2\u00db\u00dc\5\32\16\2\u00dc\u00dd\5\34\17\2\u00dd\u00de\7\20\2\2\u00de"+
		"\u00e2\3\2\2\2\u00df\u00e2\5\4\3\2\u00e0\u00e2\5\16\b\2\u00e1\u00d4\3"+
		"\2\2\2\u00e1\u00d9\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e0\3\2\2\2\u00e2"+
		"\35\3\2\2\2\u00e3\u00e4\7\17\2\2\u00e4\u00e5\5\36\20\2\u00e5\u00e6\7\20"+
		"\2\2\u00e6\u00e7\5\36\20\2\u00e7\u00f5\3\2\2\2\u00e8\u00e9\7\23\2\2\u00e9"+
		"\u00ea\5\36\20\2\u00ea\u00eb\7\24\2\2\u00eb\u00ec\5\36\20\2\u00ec\u00f5"+
		"\3\2\2\2\u00ed\u00ee\7\21\2\2\u00ee\u00ef\5\36\20\2\u00ef\u00f0\7\22\2"+
		"\2\u00f0\u00f1\5\36\20\2\u00f1\u00f5\3\2\2\2\u00f2\u00f5\5\34\17\2\u00f3"+
		"\u00f5\3\2\2\2\u00f4\u00e3\3\2\2\2\u00f4\u00e8\3\2\2\2\u00f4\u00ed\3\2"+
		"\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f3\3\2\2\2\u00f5\37\3\2\2\2\u00f6\u00f7"+
		"\7$\2\2\u00f7\u00f8\7\25\2\2\u00f8\u0103\7\25\2\2\u00f9\u00fa\7$\2\2\u00fa"+
		"\u00fb\7\26\2\2\u00fb\u0103\7\26\2\2\u00fc\u00fe\7$\2\2\u00fd\u00ff\5"+
		"\32\16\2\u00fe\u00fd\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\3\2\2\2\u0100"+
		"\u0101\7\33\2\2\u0101\u0103\5\36\20\2\u0102\u00f6\3\2\2\2\u0102\u00f9"+
		"\3\2\2\2\u0102\u00fc\3\2\2\2\u0103!\3\2\2\2\u0104\u0106\5&\24\2\u0105"+
		"\u0107\7\16\2\2\u0106\u0105\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0108\3"+
		"\2\2\2\u0108\u0109\5\"\22\2\u0109\u010c\3\2\2\2\u010a\u010c\3\2\2\2\u010b"+
		"\u0104\3\2\2\2\u010b\u010a\3\2\2\2\u010c#\3\2\2\2\u010d\u010f\7\23\2\2"+
		"\u010e\u0110\5\"\22\2\u010f\u010e\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111"+
		"\3\2\2\2\u0111\u0112\7\24\2\2\u0112%\3\2\2\2\u0113\u011e\5\6\4\2\u0114"+
		"\u011e\5 \21\2\u0115\u011e\5\16\b\2\u0116\u011e\5\16\b\2\u0117\u011e\5"+
		"\24\13\2\u0118\u011e\5\26\f\2\u0119\u011e\5\30\r\2\u011a\u011e\5\20\t"+
		"\2\u011b\u011e\5\f\7\2\u011c\u011e\5\4\3\2\u011d\u0113\3\2\2\2\u011d\u0114"+
		"\3\2\2\2\u011d\u0115\3\2\2\2\u011d\u0116\3\2\2\2\u011d\u0117\3\2\2\2\u011d"+
		"\u0118\3\2\2\2\u011d\u0119\3\2\2\2\u011d\u011a\3\2\2\2\u011d\u011b\3\2"+
		"\2\2\u011d\u011c\3\2\2\2\u011e\'\3\2\2\2\u011f\u0121\5&\24\2\u0120\u0122"+
		"\7\16\2\2\u0121\u0120\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0123\3\2\2\2"+
		"\u0123\u0124\5(\25\2\u0124\u0128\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0128"+
		"\3\2\2\2\u0127\u011f\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0126\3\2\2\2\u0128"+
		")\3\2\2\2\'\62\66<@BGMPThnu~\u0086\u008e\u0096\u009d\u00a0\u00a6\u00ab"+
		"\u00b0\u00b4\u00b8\u00bd\u00c3\u00c8\u00d4\u00e1\u00f4\u00fe\u0102\u0106"+
		"\u010b\u010f\u011d\u0121\u0127";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}