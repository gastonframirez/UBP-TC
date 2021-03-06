// Generated from C:\Users\mauroandres\Documents\NetBeansProjects\TP1Juarez\src\ar\edu\u005Cubp\tc\tp1juarez.g4 by ANTLR 4.5.3
package ar.edu.ubp.tc;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class tp1juarezLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"WS", "CONS", "VCHAR", "SIGN", "TFLOAT", "TINT", "TCHAR", "TDOUBLE", "IF", 
		"FOR", "WHILE", "ELSE", "VOID", "RETURN", "COLON", "SEMICOLON", "LPAREN", 
		"RPAREN", "LBRACKET", "RBRACKET", "LBRACE", "RBRACE", "PLUS", "LESS", 
		"DIVIDE", "MULTIPLY", "AND", "OR", "ASIGN", "EQUALS", "DIF", "SMALLEREQ", 
		"HIGHEREQ", "SMALLER", "HIGHER", "INT", "FLOAT", "ID"
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


	public tp1juarezLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "tp1juarez.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2%\u00e1\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\3\2\3\3\6\3U\n"+
		"\3\r\3\16\3V\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3"+
		"\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3"+
		"\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\37\3"+
		"\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3$\3$\3%\5%\u00c2\n%\3%\6"+
		"%\u00c5\n%\r%\16%\u00c6\3&\5&\u00ca\n&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u00d5"+
		"\n&\3&\3&\5&\u00d9\n&\3\'\3\'\7\'\u00dd\n\'\f\'\16\'\u00e0\13\'\2\2(\3"+
		"\3\5\2\7\2\t\2\13\4\r\5\17\6\21\7\23\b\25\t\27\n\31\13\33\f\35\r\37\16"+
		"!\17#\20%\21\'\22)\23+\24-\25/\26\61\27\63\30\65\31\67\329\33;\34=\35"+
		"?\36A\37C E!G\"I#K$M%\3\2\7\5\2\13\f\17\17\"\"\3\2\62;\6\2\62;C\\aac|"+
		"\4\2--//\5\2C\\aac|\u00e5\2\3\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3"+
		"\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2"+
		"\2\2K\3\2\2\2\2M\3\2\2\2\3O\3\2\2\2\5T\3\2\2\2\7X\3\2\2\2\tZ\3\2\2\2\13"+
		"\\\3\2\2\2\rb\3\2\2\2\17f\3\2\2\2\21k\3\2\2\2\23r\3\2\2\2\25u\3\2\2\2"+
		"\27y\3\2\2\2\31\177\3\2\2\2\33\u0084\3\2\2\2\35\u0089\3\2\2\2\37\u0090"+
		"\3\2\2\2!\u0092\3\2\2\2#\u0094\3\2\2\2%\u0096\3\2\2\2\'\u0098\3\2\2\2"+
		")\u009a\3\2\2\2+\u009c\3\2\2\2-\u009e\3\2\2\2/\u00a0\3\2\2\2\61\u00a2"+
		"\3\2\2\2\63\u00a4\3\2\2\2\65\u00a6\3\2\2\2\67\u00a8\3\2\2\29\u00ab\3\2"+
		"\2\2;\u00ae\3\2\2\2=\u00b0\3\2\2\2?\u00b3\3\2\2\2A\u00b6\3\2\2\2C\u00b9"+
		"\3\2\2\2E\u00bc\3\2\2\2G\u00be\3\2\2\2I\u00c1\3\2\2\2K\u00c9\3\2\2\2M"+
		"\u00da\3\2\2\2OP\t\2\2\2PQ\3\2\2\2QR\b\2\2\2R\4\3\2\2\2SU\t\3\2\2TS\3"+
		"\2\2\2UV\3\2\2\2VT\3\2\2\2VW\3\2\2\2W\6\3\2\2\2XY\t\4\2\2Y\b\3\2\2\2Z"+
		"[\t\5\2\2[\n\3\2\2\2\\]\7h\2\2]^\7n\2\2^_\7q\2\2_`\7c\2\2`a\7v\2\2a\f"+
		"\3\2\2\2bc\7k\2\2cd\7p\2\2de\7v\2\2e\16\3\2\2\2fg\7e\2\2gh\7j\2\2hi\7"+
		"c\2\2ij\7t\2\2j\20\3\2\2\2kl\7f\2\2lm\7q\2\2mn\7w\2\2no\7d\2\2op\7n\2"+
		"\2pq\7g\2\2q\22\3\2\2\2rs\7k\2\2st\7h\2\2t\24\3\2\2\2uv\7h\2\2vw\7q\2"+
		"\2wx\7t\2\2x\26\3\2\2\2yz\7y\2\2z{\7j\2\2{|\7k\2\2|}\7n\2\2}~\7g\2\2~"+
		"\30\3\2\2\2\177\u0080\7g\2\2\u0080\u0081\7n\2\2\u0081\u0082\7u\2\2\u0082"+
		"\u0083\7g\2\2\u0083\32\3\2\2\2\u0084\u0085\7x\2\2\u0085\u0086\7q\2\2\u0086"+
		"\u0087\7k\2\2\u0087\u0088\7f\2\2\u0088\34\3\2\2\2\u0089\u008a\7t\2\2\u008a"+
		"\u008b\7g\2\2\u008b\u008c\7v\2\2\u008c\u008d\7w\2\2\u008d\u008e\7t\2\2"+
		"\u008e\u008f\7p\2\2\u008f\36\3\2\2\2\u0090\u0091\7.\2\2\u0091 \3\2\2\2"+
		"\u0092\u0093\7=\2\2\u0093\"\3\2\2\2\u0094\u0095\7*\2\2\u0095$\3\2\2\2"+
		"\u0096\u0097\7+\2\2\u0097&\3\2\2\2\u0098\u0099\7]\2\2\u0099(\3\2\2\2\u009a"+
		"\u009b\7_\2\2\u009b*\3\2\2\2\u009c\u009d\7}\2\2\u009d,\3\2\2\2\u009e\u009f"+
		"\7\177\2\2\u009f.\3\2\2\2\u00a0\u00a1\7-\2\2\u00a1\60\3\2\2\2\u00a2\u00a3"+
		"\7/\2\2\u00a3\62\3\2\2\2\u00a4\u00a5\7\61\2\2\u00a5\64\3\2\2\2\u00a6\u00a7"+
		"\7,\2\2\u00a7\66\3\2\2\2\u00a8\u00a9\7(\2\2\u00a9\u00aa\7(\2\2\u00aa8"+
		"\3\2\2\2\u00ab\u00ac\7~\2\2\u00ac\u00ad\7~\2\2\u00ad:\3\2\2\2\u00ae\u00af"+
		"\7?\2\2\u00af<\3\2\2\2\u00b0\u00b1\7?\2\2\u00b1\u00b2\7?\2\2\u00b2>\3"+
		"\2\2\2\u00b3\u00b4\7#\2\2\u00b4\u00b5\7?\2\2\u00b5@\3\2\2\2\u00b6\u00b7"+
		"\7>\2\2\u00b7\u00b8\7?\2\2\u00b8B\3\2\2\2\u00b9\u00ba\7@\2\2\u00ba\u00bb"+
		"\7?\2\2\u00bbD\3\2\2\2\u00bc\u00bd\7>\2\2\u00bdF\3\2\2\2\u00be\u00bf\7"+
		"@\2\2\u00bfH\3\2\2\2\u00c0\u00c2\5\t\5\2\u00c1\u00c0\3\2\2\2\u00c1\u00c2"+
		"\3\2\2\2\u00c2\u00c4\3\2\2\2\u00c3\u00c5\5\5\3\2\u00c4\u00c3\3\2\2\2\u00c5"+
		"\u00c6\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7J\3\2\2\2"+
		"\u00c8\u00ca\5\t\5\2\u00c9\u00c8\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00d4"+
		"\3\2\2\2\u00cb\u00cc\5\5\3\2\u00cc\u00cd\7\60\2\2\u00cd\u00ce\5\5\3\2"+
		"\u00ce\u00d5\3\2\2\2\u00cf\u00d0\5\5\3\2\u00d0\u00d1\7\60\2\2\u00d1\u00d5"+
		"\3\2\2\2\u00d2\u00d3\7\60\2\2\u00d3\u00d5\5\5\3\2\u00d4\u00cb\3\2\2\2"+
		"\u00d4\u00cf\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d7"+
		"\7g\2\2\u00d7\u00d9\5I%\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9"+
		"L\3\2\2\2\u00da\u00de\t\6\2\2\u00db\u00dd\5\7\4\2\u00dc\u00db\3\2\2\2"+
		"\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00dfN\3"+
		"\2\2\2\u00e0\u00de\3\2\2\2\n\2V\u00c1\u00c6\u00c9\u00d4\u00d8\u00de\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}