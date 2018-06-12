// Generated from C:\Users\Ramiro\Desktop\tp2v3\src\tp2v3\tp2v3.g4 by ANTLR 4.5.3
package tp2v3;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class tp2v3Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, FLOAT=2, INT=3, CHAR=4, IF=5, ELSE=6, FOR=7, WHILE=8, VOID=9, RETURN=10, 
		COMA=11, PUNTOYCOMA=12, LLAVE1=13, LLAVE2=14, PARENTESIS1=15, PARENTESIS2=16, 
		CORCHETE1=17, CORCHETE2=18, MAS=19, MENOS=20, BARRA=21, ASTERISCO=22, 
		AND=23, OR=24, IGUAL=25, IGUALIGUAL=26, DISTINTO=27, MENORIGUAL=28, MENOR=29, 
		MAYORIGUAL=30, MAYOR=31, NUMERO=32, FLOTANTE=33, ID=34;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"WS", "FLOAT", "INT", "CHAR", "IF", "ELSE", "FOR", "WHILE", "VOID", "RETURN", 
		"COMA", "PUNTOYCOMA", "LLAVE1", "LLAVE2", "PARENTESIS1", "PARENTESIS2", 
		"CORCHETE1", "CORCHETE2", "MAS", "MENOS", "BARRA", "ASTERISCO", "AND", 
		"OR", "IGUAL", "IGUALIGUAL", "DISTINTO", "MENORIGUAL", "MENOR", "MAYORIGUAL", 
		"MAYOR", "NUMERO", "FLOTANTE", "ID"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'float'", "'int'", "'char'", "'if'", "'else'", "'for'", "'while'", 
		"'void'", "'return'", "','", "';'", "'{'", "'}'", "'('", "')'", "'['", 
		"']'", "'+'", "'-'", "'/'", "'*'", "'&&'", "'||'", "'='", "'=='", "'!='", 
		"'<='", "'<'", "'>='", "'>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "FLOAT", "INT", "CHAR", "IF", "ELSE", "FOR", "WHILE", "VOID", 
		"RETURN", "COMA", "PUNTOYCOMA", "LLAVE1", "LLAVE2", "PARENTESIS1", "PARENTESIS2", 
		"CORCHETE1", "CORCHETE2", "MAS", "MENOS", "BARRA", "ASTERISCO", "AND", 
		"OR", "IGUAL", "IGUALIGUAL", "DISTINTO", "MENORIGUAL", "MENOR", "MAYORIGUAL", 
		"MAYOR", "NUMERO", "FLOTANTE", "ID"
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


	public tp2v3Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "tp2v3.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2$\u00bf\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\6!\u00aa\n!\r!\16!\u00ab\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u00b7\n\"\3#\3#\7#\u00bb\n#\f#\16#\u00be"+
		"\13#\2\2$\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$\3\2\6\5\2\13\f\17\17\"\"\3\2\62;\4\2C\\c|\5\2\62"+
		";C\\c|\u00c2\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2"+
		"\2\3G\3\2\2\2\5K\3\2\2\2\7Q\3\2\2\2\tU\3\2\2\2\13Z\3\2\2\2\r]\3\2\2\2"+
		"\17b\3\2\2\2\21f\3\2\2\2\23l\3\2\2\2\25q\3\2\2\2\27x\3\2\2\2\31z\3\2\2"+
		"\2\33|\3\2\2\2\35~\3\2\2\2\37\u0080\3\2\2\2!\u0082\3\2\2\2#\u0084\3\2"+
		"\2\2%\u0086\3\2\2\2\'\u0088\3\2\2\2)\u008a\3\2\2\2+\u008c\3\2\2\2-\u008e"+
		"\3\2\2\2/\u0090\3\2\2\2\61\u0093\3\2\2\2\63\u0096\3\2\2\2\65\u0098\3\2"+
		"\2\2\67\u009b\3\2\2\29\u009e\3\2\2\2;\u00a1\3\2\2\2=\u00a3\3\2\2\2?\u00a6"+
		"\3\2\2\2A\u00a9\3\2\2\2C\u00b6\3\2\2\2E\u00b8\3\2\2\2GH\t\2\2\2HI\3\2"+
		"\2\2IJ\b\2\2\2J\4\3\2\2\2KL\7h\2\2LM\7n\2\2MN\7q\2\2NO\7c\2\2OP\7v\2\2"+
		"P\6\3\2\2\2QR\7k\2\2RS\7p\2\2ST\7v\2\2T\b\3\2\2\2UV\7e\2\2VW\7j\2\2WX"+
		"\7c\2\2XY\7t\2\2Y\n\3\2\2\2Z[\7k\2\2[\\\7h\2\2\\\f\3\2\2\2]^\7g\2\2^_"+
		"\7n\2\2_`\7u\2\2`a\7g\2\2a\16\3\2\2\2bc\7h\2\2cd\7q\2\2de\7t\2\2e\20\3"+
		"\2\2\2fg\7y\2\2gh\7j\2\2hi\7k\2\2ij\7n\2\2jk\7g\2\2k\22\3\2\2\2lm\7x\2"+
		"\2mn\7q\2\2no\7k\2\2op\7f\2\2p\24\3\2\2\2qr\7t\2\2rs\7g\2\2st\7v\2\2t"+
		"u\7w\2\2uv\7t\2\2vw\7p\2\2w\26\3\2\2\2xy\7.\2\2y\30\3\2\2\2z{\7=\2\2{"+
		"\32\3\2\2\2|}\7}\2\2}\34\3\2\2\2~\177\7\177\2\2\177\36\3\2\2\2\u0080\u0081"+
		"\7*\2\2\u0081 \3\2\2\2\u0082\u0083\7+\2\2\u0083\"\3\2\2\2\u0084\u0085"+
		"\7]\2\2\u0085$\3\2\2\2\u0086\u0087\7_\2\2\u0087&\3\2\2\2\u0088\u0089\7"+
		"-\2\2\u0089(\3\2\2\2\u008a\u008b\7/\2\2\u008b*\3\2\2\2\u008c\u008d\7\61"+
		"\2\2\u008d,\3\2\2\2\u008e\u008f\7,\2\2\u008f.\3\2\2\2\u0090\u0091\7(\2"+
		"\2\u0091\u0092\7(\2\2\u0092\60\3\2\2\2\u0093\u0094\7~\2\2\u0094\u0095"+
		"\7~\2\2\u0095\62\3\2\2\2\u0096\u0097\7?\2\2\u0097\64\3\2\2\2\u0098\u0099"+
		"\7?\2\2\u0099\u009a\7?\2\2\u009a\66\3\2\2\2\u009b\u009c\7#\2\2\u009c\u009d"+
		"\7?\2\2\u009d8\3\2\2\2\u009e\u009f\7>\2\2\u009f\u00a0\7?\2\2\u00a0:\3"+
		"\2\2\2\u00a1\u00a2\7>\2\2\u00a2<\3\2\2\2\u00a3\u00a4\7@\2\2\u00a4\u00a5"+
		"\7?\2\2\u00a5>\3\2\2\2\u00a6\u00a7\7@\2\2\u00a7@\3\2\2\2\u00a8\u00aa\t"+
		"\3\2\2\u00a9\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab"+
		"\u00ac\3\2\2\2\u00acB\3\2\2\2\u00ad\u00ae\5A!\2\u00ae\u00af\7\60\2\2\u00af"+
		"\u00b7\3\2\2\2\u00b0\u00b1\5A!\2\u00b1\u00b2\7\60\2\2\u00b2\u00b3\5A!"+
		"\2\u00b3\u00b7\3\2\2\2\u00b4\u00b5\7\60\2\2\u00b5\u00b7\5A!\2\u00b6\u00ad"+
		"\3\2\2\2\u00b6\u00b0\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7D\3\2\2\2\u00b8"+
		"\u00bc\t\4\2\2\u00b9\u00bb\t\5\2\2\u00ba\u00b9\3\2\2\2\u00bb\u00be\3\2"+
		"\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bdF\3\2\2\2\u00be\u00bc"+
		"\3\2\2\2\6\2\u00ab\u00b6\u00bc\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}