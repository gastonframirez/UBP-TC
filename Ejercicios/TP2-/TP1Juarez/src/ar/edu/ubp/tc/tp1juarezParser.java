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
		WS=1, TFLOAT=2, TINT=3, TCHAR=4, TDOUBLE=5, IF=6, FOR=7, WHILE=8, ELSE=9, 
		VOID=10, RETURN=11, COLON=12, SEMICOLON=13, LPAREN=14, RPAREN=15, LBRACKET=16, 
		RBRACKET=17, LBRACE=18, RBRACE=19, PLUS=20, LESS=21, DIVIDE=22, MULTIPLY=23, 
		AND=24, OR=25, ASIGN=26, EQUALS=27, DIF=28, SMALLEREQ=29, HIGHEREQ=30, 
		SMALLER=31, HIGHER=32, INT=33, FLOAT=34, ID=35;
	public static final int
		RULE_vtype = 0, RULE_val = 1, RULE_dec = 2, RULE_ftype = 3, RULE_arg = 4, 
		RULE_ret = 5, RULE_func = 6, RULE_condition = 7, RULE_conditions = 8, 
		RULE_ifc = 9, RULE_elsec = 10, RULE_forc = 11, RULE_whilec = 12, RULE_operator = 13, 
		RULE_operation = 14, RULE_operations = 15, RULE_ops = 16, RULE_code = 17, 
		RULE_cblock = 18, RULE_instr = 19, RULE_instruction = 20;
	public static final String[] ruleNames = {
		"vtype", "val", "dec", "ftype", "arg", "ret", "func", "condition", "conditions", 
		"ifc", "elsec", "forc", "whilec", "operator", "operation", "operations", 
		"ops", "code", "cblock", "instr", "instruction"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'float'", "'int'", "'char'", "'double'", "'if'", "'for'", 
		"'while'", "'else'", "'void'", "'return'", "','", "';'", "'('", "')'", 
		"'['", "']'", "'{'", "'}'", "'+'", "'-'", "'/'", "'*'", "'&&'", "'||'", 
		"'='", "'=='", "'!='", "'<='", "'>='", "'<'", "'>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "TFLOAT", "TINT", "TCHAR", "TDOUBLE", "IF", "FOR", "WHILE", 
		"ELSE", "VOID", "RETURN", "COLON", "SEMICOLON", "LPAREN", "RPAREN", "LBRACKET", 
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
			setState(42);
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
			setState(44);
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
			setState(46);
			vtype();
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(47);
				match(ID);
				setState(66);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(50);
					_la = _input.LA(1);
					if (_la==ASIGN) {
						{
						setState(48);
						match(ASIGN);
						setState(49);
						val();
						}
					}

					}
					break;
				case 2:
					{
					setState(62); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(54);
						_la = _input.LA(1);
						if (_la==ASIGN) {
							{
							setState(52);
							match(ASIGN);
							setState(53);
							val();
							}
						}

						setState(56);
						match(COLON);
						setState(57);
						match(ID);
						setState(60);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
						case 1:
							{
							setState(58);
							match(ASIGN);
							setState(59);
							val();
							}
							break;
						}
						}
						}
						setState(64); 
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
				setState(68);
				match(ID);
				setState(69);
				match(LBRACKET);
				setState(71);
				_la = _input.LA(1);
				if (_la==INT) {
					{
					setState(70);
					match(INT);
					}
				}

				setState(73);
				match(RBRACKET);
				}
				break;
			case 3:
				{
				setState(75); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(74);
					match(MULTIPLY);
					}
					}
					setState(77); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==MULTIPLY );
				setState(79);
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
			setState(84);
			switch (_input.LA(1)) {
			case TFLOAT:
			case TINT:
			case TCHAR:
			case TDOUBLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				vtype();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
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
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				match(ID);
				setState(88);
				match(COLON);
				setState(89);
				arg();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(90);
				ftype();
				setState(91);
				match(ID);
				setState(92);
				match(COLON);
				setState(93);
				arg();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(95);
				ftype();
				setState(96);
				match(ID);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(98);
				ftype();
				setState(99);
				match(COLON);
				setState(100);
				arg();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(102);
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
			setState(106);
			match(RETURN);
			setState(107);
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
			setState(110);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TFLOAT) | (1L << TINT) | (1L << TCHAR) | (1L << TDOUBLE) | (1L << VOID))) != 0)) {
				{
				setState(109);
				ftype();
				}
			}

			setState(112);
			match(ID);
			setState(113);
			match(LPAREN);
			setState(114);
			arg();
			setState(115);
			match(RPAREN);
			setState(117);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(116);
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
			setState(119);
			val();
			setState(126);
			switch (_input.LA(1)) {
			case EQUALS:
				{
				setState(120);
				match(EQUALS);
				}
				break;
			case DIF:
				{
				setState(121);
				match(DIF);
				setState(122);
				match(SMALLEREQ);
				}
				break;
			case SMALLER:
				{
				setState(123);
				match(SMALLER);
				}
				break;
			case HIGHER:
				{
				setState(124);
				match(HIGHER);
				}
				break;
			case HIGHEREQ:
				{
				setState(125);
				match(HIGHEREQ);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(128);
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
			setState(160);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				match(LPAREN);
				setState(131);
				conditions();
				setState(132);
				match(RPAREN);
				setState(134);
				_la = _input.LA(1);
				if (_la==AND || _la==OR) {
					{
					setState(133);
					_la = _input.LA(1);
					if ( !(_la==AND || _la==OR) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(136);
				conditions();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				match(LBRACE);
				setState(139);
				conditions();
				setState(140);
				match(RBRACE);
				setState(142);
				_la = _input.LA(1);
				if (_la==AND || _la==OR) {
					{
					setState(141);
					_la = _input.LA(1);
					if ( !(_la==AND || _la==OR) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(144);
				conditions();
				}
				break;
			case LBRACKET:
				enterOuterAlt(_localctx, 3);
				{
				setState(146);
				match(LBRACKET);
				setState(147);
				conditions();
				setState(148);
				match(RBRACKET);
				setState(150);
				_la = _input.LA(1);
				if (_la==AND || _la==OR) {
					{
					setState(149);
					_la = _input.LA(1);
					if ( !(_la==AND || _la==OR) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(152);
				conditions();
				}
				break;
			case INT:
			case FLOAT:
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(154);
				condition();
				setState(157);
				_la = _input.LA(1);
				if (_la==AND || _la==OR) {
					{
					setState(155);
					_la = _input.LA(1);
					if ( !(_la==AND || _la==OR) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(156);
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
		public ElsecContext elsec() {
			return getRuleContext(ElsecContext.class,0);
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
			setState(162);
			match(IF);
			setState(163);
			match(LPAREN);
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(164);
				conditions();
				}
				break;
			case 2:
				{
				setState(165);
				val();
				}
				break;
			}
			setState(168);
			match(RPAREN);
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(169);
				instr();
				}
				break;
			case 2:
				{
				setState(170);
				cblock();
				}
				break;
			}
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(173);
				elsec();
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

	public static class ElsecContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(tp1juarezParser.ELSE, 0); }
		public IfcContext ifc() {
			return getRuleContext(IfcContext.class,0);
		}
		public InstrContext instr() {
			return getRuleContext(InstrContext.class,0);
		}
		public CblockContext cblock() {
			return getRuleContext(CblockContext.class,0);
		}
		public ElsecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tp1juarezListener ) ((tp1juarezListener)listener).enterElsec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp1juarezListener ) ((tp1juarezListener)listener).exitElsec(this);
		}
	}

	public final ElsecContext elsec() throws RecognitionException {
		ElsecContext _localctx = new ElsecContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_elsec);
		try {
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				match(ELSE);
				setState(177);
				ifc();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				match(ELSE);
				setState(181);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(179);
					instr();
					}
					break;
				case 2:
					{
					setState(180);
					cblock();
					}
					break;
				}
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
		enterRule(_localctx, 22, RULE_forc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(FOR);
			setState(186);
			match(LPAREN);
			setState(188);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TFLOAT) | (1L << TINT) | (1L << TCHAR) | (1L << TDOUBLE) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << VOID) | (1L << RETURN) | (1L << INT) | (1L << FLOAT) | (1L << ID))) != 0)) {
				{
				setState(187);
				instr();
				}
			}

			setState(190);
			match(SEMICOLON);
			setState(192);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TFLOAT) | (1L << TINT) | (1L << TCHAR) | (1L << TDOUBLE) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << VOID) | (1L << RETURN) | (1L << INT) | (1L << FLOAT) | (1L << ID))) != 0)) {
				{
				setState(191);
				instr();
				}
			}

			setState(194);
			match(SEMICOLON);
			setState(196);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TFLOAT) | (1L << TINT) | (1L << TCHAR) | (1L << TDOUBLE) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << VOID) | (1L << RETURN) | (1L << INT) | (1L << FLOAT) | (1L << ID))) != 0)) {
				{
				setState(195);
				instr();
				}
			}

			setState(198);
			match(RPAREN);
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(199);
				instr();
				}
				break;
			case 2:
				{
				setState(200);
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
		enterRule(_localctx, 24, RULE_whilec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(WHILE);
			setState(204);
			match(LPAREN);
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(205);
				conditions();
				}
				break;
			case 2:
				{
				setState(206);
				val();
				}
				break;
			}
			setState(209);
			match(RPAREN);
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(210);
				instr();
				}
				break;
			case 2:
				{
				setState(211);
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
		enterRule(_localctx, 26, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
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
		enterRule(_localctx, 28, RULE_operation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(224);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(216);
					val();
					}
					break;
				case 2:
					{
					setState(217);
					func();
					}
					break;
				case 3:
					{
					setState(218);
					match(LPAREN);
					setState(219);
					operation();
					setState(220);
					operator();
					setState(221);
					operation();
					setState(222);
					match(RPAREN);
					}
					break;
				}
				setState(226);
				operator();
				setState(227);
				operation();
				}
				break;
			case 2:
				{
				setState(229);
				match(LPAREN);
				setState(230);
				operation();
				setState(231);
				operator();
				setState(232);
				operation();
				setState(233);
				match(RPAREN);
				}
				break;
			case 3:
				{
				setState(235);
				val();
				}
				break;
			case 4:
				{
				setState(236);
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
		enterRule(_localctx, 30, RULE_operations);
		try {
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				match(LPAREN);
				setState(240);
				operations();
				setState(241);
				match(RPAREN);
				setState(242);
				operations();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(244);
				match(LBRACE);
				setState(245);
				operations();
				setState(246);
				match(RBRACE);
				setState(247);
				operations();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(249);
				match(LBRACKET);
				setState(250);
				operations();
				setState(251);
				match(RBRACKET);
				setState(252);
				operations();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(254);
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
		enterRule(_localctx, 32, RULE_ops);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(258);
				match(ID);
				setState(259);
				match(PLUS);
				setState(260);
				match(PLUS);
				}
				break;
			case 2:
				{
				setState(261);
				match(ID);
				setState(262);
				match(LESS);
				setState(263);
				match(LESS);
				}
				break;
			case 3:
				{
				setState(264);
				match(ID);
				setState(266);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << LESS) | (1L << DIVIDE) | (1L << MULTIPLY))) != 0)) {
					{
					setState(265);
					operator();
					}
				}

				setState(268);
				match(ASIGN);
				setState(269);
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
		enterRule(_localctx, 34, RULE_code);
		int _la;
		try {
			setState(279);
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
				setState(272);
				instr();
				setState(274);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(273);
					match(SEMICOLON);
					}
				}

				setState(276);
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
		enterRule(_localctx, 36, RULE_cblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(LBRACE);
			setState(283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(282);
				code();
				}
				break;
			}
			setState(285);
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
		enterRule(_localctx, 38, RULE_instr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(287);
				dec();
				}
				break;
			case 2:
				{
				setState(288);
				ops();
				}
				break;
			case 3:
				{
				setState(289);
				func();
				}
				break;
			case 4:
				{
				setState(290);
				func();
				}
				break;
			case 5:
				{
				setState(291);
				ifc();
				}
				break;
			case 6:
				{
				setState(292);
				forc();
				}
				break;
			case 7:
				{
				setState(293);
				whilec();
				}
				break;
			case 8:
				{
				setState(294);
				condition();
				}
				break;
			case 9:
				{
				setState(295);
				ret();
				}
				break;
			case 10:
				{
				setState(296);
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
		enterRule(_localctx, 40, RULE_instruction);
		int _la;
		try {
			setState(307);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(299);
				instr();
				setState(301);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(300);
					match(SEMICOLON);
					}
				}

				setState(303);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3%\u0138\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\5\4\65\n\4\3\4\3\4\5\49\n\4\3\4\3\4\3\4\3\4\5\4?\n\4\6\4A\n\4\r\4\16"+
		"\4B\5\4E\n\4\3\4\3\4\3\4\5\4J\n\4\3\4\3\4\6\4N\n\4\r\4\16\4O\3\4\5\4S"+
		"\n\4\3\5\3\5\5\5W\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\5\6k\n\6\3\7\3\7\3\7\3\b\5\bq\n\b\3\b\3\b\3\b"+
		"\3\b\3\b\5\bx\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0081\n\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\5\n\u0089\n\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0091\n\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\5\n\u0099\n\n\3\n\3\n\3\n\3\n\3\n\5\n\u00a0\n\n\3"+
		"\n\5\n\u00a3\n\n\3\13\3\13\3\13\3\13\5\13\u00a9\n\13\3\13\3\13\3\13\5"+
		"\13\u00ae\n\13\3\13\5\13\u00b1\n\13\3\f\3\f\3\f\3\f\3\f\5\f\u00b8\n\f"+
		"\5\f\u00ba\n\f\3\r\3\r\3\r\5\r\u00bf\n\r\3\r\3\r\5\r\u00c3\n\r\3\r\3\r"+
		"\5\r\u00c7\n\r\3\r\3\r\3\r\5\r\u00cc\n\r\3\16\3\16\3\16\3\16\5\16\u00d2"+
		"\n\16\3\16\3\16\3\16\5\16\u00d7\n\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u00e3\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u00f0\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0103\n\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u010d\n\22\3\22\3\22\5\22\u0111\n"+
		"\22\3\23\3\23\5\23\u0115\n\23\3\23\3\23\3\23\5\23\u011a\n\23\3\24\3\24"+
		"\5\24\u011e\n\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\5\25\u012c\n\25\3\26\3\26\5\26\u0130\n\26\3\26\3\26\3\26\3\26\5"+
		"\26\u0136\n\26\3\26\2\2\27\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$"+
		"&(*\2\6\3\2\4\7\3\2#%\3\2\32\33\3\2\26\31\u016a\2,\3\2\2\2\4.\3\2\2\2"+
		"\6\60\3\2\2\2\bV\3\2\2\2\nj\3\2\2\2\fl\3\2\2\2\16p\3\2\2\2\20y\3\2\2\2"+
		"\22\u00a2\3\2\2\2\24\u00a4\3\2\2\2\26\u00b9\3\2\2\2\30\u00bb\3\2\2\2\32"+
		"\u00cd\3\2\2\2\34\u00d8\3\2\2\2\36\u00ef\3\2\2\2 \u0102\3\2\2\2\"\u0110"+
		"\3\2\2\2$\u0119\3\2\2\2&\u011b\3\2\2\2(\u012b\3\2\2\2*\u0135\3\2\2\2,"+
		"-\t\2\2\2-\3\3\2\2\2./\t\3\2\2/\5\3\2\2\2\60R\5\2\2\2\61D\7%\2\2\62\63"+
		"\7\34\2\2\63\65\5\4\3\2\64\62\3\2\2\2\64\65\3\2\2\2\65E\3\2\2\2\66\67"+
		"\7\34\2\2\679\5\4\3\28\66\3\2\2\289\3\2\2\29:\3\2\2\2:;\7\16\2\2;>\7%"+
		"\2\2<=\7\34\2\2=?\5\4\3\2><\3\2\2\2>?\3\2\2\2?A\3\2\2\2@8\3\2\2\2AB\3"+
		"\2\2\2B@\3\2\2\2BC\3\2\2\2CE\3\2\2\2D\64\3\2\2\2D@\3\2\2\2ES\3\2\2\2F"+
		"G\7%\2\2GI\7\22\2\2HJ\7#\2\2IH\3\2\2\2IJ\3\2\2\2JK\3\2\2\2KS\7\23\2\2"+
		"LN\7\31\2\2ML\3\2\2\2NO\3\2\2\2OM\3\2\2\2OP\3\2\2\2PQ\3\2\2\2QS\7%\2\2"+
		"R\61\3\2\2\2RF\3\2\2\2RM\3\2\2\2S\7\3\2\2\2TW\5\2\2\2UW\7\f\2\2VT\3\2"+
		"\2\2VU\3\2\2\2W\t\3\2\2\2Xk\7%\2\2YZ\7%\2\2Z[\7\16\2\2[k\5\n\6\2\\]\5"+
		"\b\5\2]^\7%\2\2^_\7\16\2\2_`\5\n\6\2`k\3\2\2\2ab\5\b\5\2bc\7%\2\2ck\3"+
		"\2\2\2de\5\b\5\2ef\7\16\2\2fg\5\n\6\2gk\3\2\2\2hk\5\b\5\2ik\3\2\2\2jX"+
		"\3\2\2\2jY\3\2\2\2j\\\3\2\2\2ja\3\2\2\2jd\3\2\2\2jh\3\2\2\2ji\3\2\2\2"+
		"k\13\3\2\2\2lm\7\r\2\2mn\5\4\3\2n\r\3\2\2\2oq\5\b\5\2po\3\2\2\2pq\3\2"+
		"\2\2qr\3\2\2\2rs\7%\2\2st\7\20\2\2tu\5\n\6\2uw\7\21\2\2vx\5&\24\2wv\3"+
		"\2\2\2wx\3\2\2\2x\17\3\2\2\2y\u0080\5\4\3\2z\u0081\7\35\2\2{|\7\36\2\2"+
		"|\u0081\7\37\2\2}\u0081\7!\2\2~\u0081\7\"\2\2\177\u0081\7 \2\2\u0080z"+
		"\3\2\2\2\u0080{\3\2\2\2\u0080}\3\2\2\2\u0080~\3\2\2\2\u0080\177\3\2\2"+
		"\2\u0081\u0082\3\2\2\2\u0082\u0083\5\4\3\2\u0083\21\3\2\2\2\u0084\u0085"+
		"\7\20\2\2\u0085\u0086\5\22\n\2\u0086\u0088\7\21\2\2\u0087\u0089\t\4\2"+
		"\2\u0088\u0087\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b"+
		"\5\22\n\2\u008b\u00a3\3\2\2\2\u008c\u008d\7\24\2\2\u008d\u008e\5\22\n"+
		"\2\u008e\u0090\7\25\2\2\u008f\u0091\t\4\2\2\u0090\u008f\3\2\2\2\u0090"+
		"\u0091\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\5\22\n\2\u0093\u00a3\3"+
		"\2\2\2\u0094\u0095\7\22\2\2\u0095\u0096\5\22\n\2\u0096\u0098\7\23\2\2"+
		"\u0097\u0099\t\4\2\2\u0098\u0097\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a"+
		"\3\2\2\2\u009a\u009b\5\22\n\2\u009b\u00a3\3\2\2\2\u009c\u009f\5\20\t\2"+
		"\u009d\u009e\t\4\2\2\u009e\u00a0\5\22\n\2\u009f\u009d\3\2\2\2\u009f\u00a0"+
		"\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u00a3\3\2\2\2\u00a2\u0084\3\2\2\2\u00a2"+
		"\u008c\3\2\2\2\u00a2\u0094\3\2\2\2\u00a2\u009c\3\2\2\2\u00a2\u00a1\3\2"+
		"\2\2\u00a3\23\3\2\2\2\u00a4\u00a5\7\b\2\2\u00a5\u00a8\7\20\2\2\u00a6\u00a9"+
		"\5\22\n\2\u00a7\u00a9\5\4\3\2\u00a8\u00a6\3\2\2\2\u00a8\u00a7\3\2\2\2"+
		"\u00a9\u00aa\3\2\2\2\u00aa\u00ad\7\21\2\2\u00ab\u00ae\5(\25\2\u00ac\u00ae"+
		"\5&\24\2\u00ad\u00ab\3\2\2\2\u00ad\u00ac\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		"\u00b0\3\2\2\2\u00af\u00b1\5\26\f\2\u00b0\u00af\3\2\2\2\u00b0\u00b1\3"+
		"\2\2\2\u00b1\25\3\2\2\2\u00b2\u00b3\7\13\2\2\u00b3\u00ba\5\24\13\2\u00b4"+
		"\u00b7\7\13\2\2\u00b5\u00b8\5(\25\2\u00b6\u00b8\5&\24\2\u00b7\u00b5\3"+
		"\2\2\2\u00b7\u00b6\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00ba\3\2\2\2\u00b9"+
		"\u00b2\3\2\2\2\u00b9\u00b4\3\2\2\2\u00ba\27\3\2\2\2\u00bb\u00bc\7\t\2"+
		"\2\u00bc\u00be\7\20\2\2\u00bd\u00bf\5(\25\2\u00be\u00bd\3\2\2\2\u00be"+
		"\u00bf\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c2\7\17\2\2\u00c1\u00c3\5"+
		"(\25\2\u00c2\u00c1\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4"+
		"\u00c6\7\17\2\2\u00c5\u00c7\5(\25\2\u00c6\u00c5\3\2\2\2\u00c6\u00c7\3"+
		"\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00cb\7\21\2\2\u00c9\u00cc\5(\25\2\u00ca"+
		"\u00cc\5&\24\2\u00cb\u00c9\3\2\2\2\u00cb\u00ca\3\2\2\2\u00cb\u00cc\3\2"+
		"\2\2\u00cc\31\3\2\2\2\u00cd\u00ce\7\n\2\2\u00ce\u00d1\7\20\2\2\u00cf\u00d2"+
		"\5\22\n\2\u00d0\u00d2\5\4\3\2\u00d1\u00cf\3\2\2\2\u00d1\u00d0\3\2\2\2"+
		"\u00d2\u00d3\3\2\2\2\u00d3\u00d6\7\21\2\2\u00d4\u00d7\5(\25\2\u00d5\u00d7"+
		"\5&\24\2\u00d6\u00d4\3\2\2\2\u00d6\u00d5\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7"+
		"\33\3\2\2\2\u00d8\u00d9\t\5\2\2\u00d9\35\3\2\2\2\u00da\u00e3\5\4\3\2\u00db"+
		"\u00e3\5\16\b\2\u00dc\u00dd\7\20\2\2\u00dd\u00de\5\36\20\2\u00de\u00df"+
		"\5\34\17\2\u00df\u00e0\5\36\20\2\u00e0\u00e1\7\21\2\2\u00e1\u00e3\3\2"+
		"\2\2\u00e2\u00da\3\2\2\2\u00e2\u00db\3\2\2\2\u00e2\u00dc\3\2\2\2\u00e3"+
		"\u00e4\3\2\2\2\u00e4\u00e5\5\34\17\2\u00e5\u00e6\5\36\20\2\u00e6\u00f0"+
		"\3\2\2\2\u00e7\u00e8\7\20\2\2\u00e8\u00e9\5\36\20\2\u00e9\u00ea\5\34\17"+
		"\2\u00ea\u00eb\5\36\20\2\u00eb\u00ec\7\21\2\2\u00ec\u00f0\3\2\2\2\u00ed"+
		"\u00f0\5\4\3\2\u00ee\u00f0\5\16\b\2\u00ef\u00e2\3\2\2\2\u00ef\u00e7\3"+
		"\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00ee\3\2\2\2\u00f0\37\3\2\2\2\u00f1"+
		"\u00f2\7\20\2\2\u00f2\u00f3\5 \21\2\u00f3\u00f4\7\21\2\2\u00f4\u00f5\5"+
		" \21\2\u00f5\u0103\3\2\2\2\u00f6\u00f7\7\24\2\2\u00f7\u00f8\5 \21\2\u00f8"+
		"\u00f9\7\25\2\2\u00f9\u00fa\5 \21\2\u00fa\u0103\3\2\2\2\u00fb\u00fc\7"+
		"\22\2\2\u00fc\u00fd\5 \21\2\u00fd\u00fe\7\23\2\2\u00fe\u00ff\5 \21\2\u00ff"+
		"\u0103\3\2\2\2\u0100\u0103\5\36\20\2\u0101\u0103\3\2\2\2\u0102\u00f1\3"+
		"\2\2\2\u0102\u00f6\3\2\2\2\u0102\u00fb\3\2\2\2\u0102\u0100\3\2\2\2\u0102"+
		"\u0101\3\2\2\2\u0103!\3\2\2\2\u0104\u0105\7%\2\2\u0105\u0106\7\26\2\2"+
		"\u0106\u0111\7\26\2\2\u0107\u0108\7%\2\2\u0108\u0109\7\27\2\2\u0109\u0111"+
		"\7\27\2\2\u010a\u010c\7%\2\2\u010b\u010d\5\34\17\2\u010c\u010b\3\2\2\2"+
		"\u010c\u010d\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\7\34\2\2\u010f\u0111"+
		"\5 \21\2\u0110\u0104\3\2\2\2\u0110\u0107\3\2\2\2\u0110\u010a\3\2\2\2\u0111"+
		"#\3\2\2\2\u0112\u0114\5(\25\2\u0113\u0115\7\17\2\2\u0114\u0113\3\2\2\2"+
		"\u0114\u0115\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0117\5$\23\2\u0117\u011a"+
		"\3\2\2\2\u0118\u011a\3\2\2\2\u0119\u0112\3\2\2\2\u0119\u0118\3\2\2\2\u011a"+
		"%\3\2\2\2\u011b\u011d\7\24\2\2\u011c\u011e\5$\23\2\u011d\u011c\3\2\2\2"+
		"\u011d\u011e\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120\7\25\2\2\u0120\'"+
		"\3\2\2\2\u0121\u012c\5\6\4\2\u0122\u012c\5\"\22\2\u0123\u012c\5\16\b\2"+
		"\u0124\u012c\5\16\b\2\u0125\u012c\5\24\13\2\u0126\u012c\5\30\r\2\u0127"+
		"\u012c\5\32\16\2\u0128\u012c\5\20\t\2\u0129\u012c\5\f\7\2\u012a\u012c"+
		"\5\4\3\2\u012b\u0121\3\2\2\2\u012b\u0122\3\2\2\2\u012b\u0123\3\2\2\2\u012b"+
		"\u0124\3\2\2\2\u012b\u0125\3\2\2\2\u012b\u0126\3\2\2\2\u012b\u0127\3\2"+
		"\2\2\u012b\u0128\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012a\3\2\2\2\u012c"+
		")\3\2\2\2\u012d\u012f\5(\25\2\u012e\u0130\7\17\2\2\u012f\u012e\3\2\2\2"+
		"\u012f\u0130\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0132\5*\26\2\u0132\u0136"+
		"\3\2\2\2\u0133\u0136\3\2\2\2\u0134\u0136\3\2\2\2\u0135\u012d\3\2\2\2\u0135"+
		"\u0133\3\2\2\2\u0135\u0134\3\2\2\2\u0136+\3\2\2\2*\648>BDIORVjpw\u0080"+
		"\u0088\u0090\u0098\u009f\u00a2\u00a8\u00ad\u00b0\u00b7\u00b9\u00be\u00c2"+
		"\u00c6\u00cb\u00d1\u00d6\u00e2\u00ef\u0102\u010c\u0110\u0114\u0119\u011d"+
		"\u012b\u012f\u0135";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}