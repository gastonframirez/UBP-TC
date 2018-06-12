// Generated from /Users/gframirez/Documents/UBP/Q9/TC/Ejercicios/ParserCompilable/src/ParserCompilable/reglasANTLR.g4 by ANTLR 4.5.3

        package ParserCompilable;
        
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class reglasANTLRParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PA=1, PC=2, BA=3, BC=4, ENTERO=5, ID=6, WS=7;
	public static final int
		RULE_entrada = 0, RULE_s = 1;
	public static final String[] ruleNames = {
		"entrada", "s"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'['", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PA", "PC", "BA", "BC", "ENTERO", "ID", "WS"
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
	public String getGrammarFileName() { return "reglasANTLR.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public reglasANTLRParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class EntradaContext extends ParserRuleContext {
		public SContext s() {
			return getRuleContext(SContext.class,0);
		}
		public TerminalNode EOF() { return getToken(reglasANTLRParser.EOF, 0); }
		public EntradaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entrada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasANTLRListener ) ((reglasANTLRListener)listener).enterEntrada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasANTLRListener ) ((reglasANTLRListener)listener).exitEntrada(this);
		}
	}

	public final EntradaContext entrada() throws RecognitionException {
		EntradaContext _localctx = new EntradaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_entrada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4);
			s();
			setState(5);
			match(EOF);
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

	public static class SContext extends ParserRuleContext {
		public TerminalNode PA() { return getToken(reglasANTLRParser.PA, 0); }
		public List<SContext> s() {
			return getRuleContexts(SContext.class);
		}
		public SContext s(int i) {
			return getRuleContext(SContext.class,i);
		}
		public TerminalNode PC() { return getToken(reglasANTLRParser.PC, 0); }
		public TerminalNode BA() { return getToken(reglasANTLRParser.BA, 0); }
		public TerminalNode BC() { return getToken(reglasANTLRParser.BC, 0); }
		public TerminalNode ENTERO() { return getToken(reglasANTLRParser.ENTERO, 0); }
		public TerminalNode ID() { return getToken(reglasANTLRParser.ID, 0); }
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof reglasANTLRListener ) ((reglasANTLRListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof reglasANTLRListener ) ((reglasANTLRListener)listener).exitS(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_s);
		try {
			setState(28);
			switch (_input.LA(1)) {
			case PA:
				enterOuterAlt(_localctx, 1);
				{
				setState(7);
				match(PA);
				 System.out.println("Apertura de Parentesis"); 
				setState(9);
				s();
				setState(10);
				match(PC);
				 System.out.println("Cierre de Parentesis"); 
				setState(12);
				s();
				}
				break;
			case BA:
				enterOuterAlt(_localctx, 2);
				{
				setState(14);
				match(BA);
				 System.out.println("Apertura de Corchetes"); 
				setState(16);
				s();
				setState(17);
				match(BC);
				 System.out.println("Cierre de Corchetes"); 
				setState(19);
				s();
				}
				break;
			case ENTERO:
				enterOuterAlt(_localctx, 3);
				{
				setState(21);
				match(ENTERO);
				 System.out.println("Valor numerico"); 
				setState(23);
				s();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(24);
				match(ID);
				 System.out.println("Identificador"); 
				setState(26);
				s();
				}
				break;
			case EOF:
			case PC:
			case BC:
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\t!\4\2\t\2\4\3\t"+
		"\3\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\37\n\3\3\3\2\2\4\2\4\2\2\"\2\6\3\2\2"+
		"\2\4\36\3\2\2\2\6\7\5\4\3\2\7\b\7\2\2\3\b\3\3\2\2\2\t\n\7\3\2\2\n\13\b"+
		"\3\1\2\13\f\5\4\3\2\f\r\7\4\2\2\r\16\b\3\1\2\16\17\5\4\3\2\17\37\3\2\2"+
		"\2\20\21\7\5\2\2\21\22\b\3\1\2\22\23\5\4\3\2\23\24\7\6\2\2\24\25\b\3\1"+
		"\2\25\26\5\4\3\2\26\37\3\2\2\2\27\30\7\7\2\2\30\31\b\3\1\2\31\37\5\4\3"+
		"\2\32\33\7\b\2\2\33\34\b\3\1\2\34\37\5\4\3\2\35\37\3\2\2\2\36\t\3\2\2"+
		"\2\36\20\3\2\2\2\36\27\3\2\2\2\36\32\3\2\2\2\36\35\3\2\2\2\37\5\3\2\2"+
		"\2\3\36";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}