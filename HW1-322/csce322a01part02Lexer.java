// Generated from C:/Users/taylo/IdeaProjects/HW1-322/src\csce322a01part01.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class csce322a01part02Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SECTION_BEGINNING=1, SECTION_ENDING=2, MOVES_SECTION_TITLE=3, GAME_SECTION_TITLE=4, 
		MOVE_SYMBOL=5, GAME_SYMBOL=6, NUMERICAL_SYMBOL=7, ROW_ENDING=8, GAME_BEGINNING=9, 
		GAME_ENDING=10, MOVES_BEGGINING=11, MOVES_ENDING=12, WHITE_SPACE=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SECTION_BEGINNING", "SECTION_ENDING", "MOVES_SECTION_TITLE", "GAME_SECTION_TITLE", 
			"MOVE_SYMBOL", "GAME_SYMBOL", "NUMERICAL_SYMBOL", "ROW_ENDING", "GAME_BEGINNING", 
			"GAME_ENDING", "MOVES_BEGGINING", "MOVES_ENDING", "WHITE_SPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'>>'", "'<<'", "'!moves'", "'!game'", null, null, null, "'*'", 
			"'{'", "'}'", "'^'", "'$'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SECTION_BEGINNING", "SECTION_ENDING", "MOVES_SECTION_TITLE", "GAME_SECTION_TITLE", 
			"MOVE_SYMBOL", "GAME_SYMBOL", "NUMERICAL_SYMBOL", "ROW_ENDING", "GAME_BEGINNING", 
			"GAME_ENDING", "MOVES_BEGGINING", "MOVES_ENDING", "WHITE_SPACE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public csce322a01part02Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "csce322a01part01.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17M\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\6\7\65\n\7\r\7\16"+
		"\7\66\5\79\n\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\6\16H\n\16\r\16\16\16I\3\16\3\16\2\2\17\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\3\2\6\6\2ffnnttww\4\2//zz\3\2\62;\6"+
		"\2\13\f\17\17\"\"..\2O\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\3\35\3\2\2\2\5 \3\2\2"+
		"\2\7#\3\2\2\2\t*\3\2\2\2\13\60\3\2\2\2\r8\3\2\2\2\17:\3\2\2\2\21<\3\2"+
		"\2\2\23>\3\2\2\2\25@\3\2\2\2\27B\3\2\2\2\31D\3\2\2\2\33G\3\2\2\2\35\36"+
		"\7@\2\2\36\37\7@\2\2\37\4\3\2\2\2 !\7>\2\2!\"\7>\2\2\"\6\3\2\2\2#$\7#"+
		"\2\2$%\7o\2\2%&\7q\2\2&\'\7x\2\2\'(\7g\2\2()\7u\2\2)\b\3\2\2\2*+\7#\2"+
		"\2+,\7i\2\2,-\7c\2\2-.\7o\2\2./\7g\2\2/\n\3\2\2\2\60\61\t\2\2\2\61\f\3"+
		"\2\2\2\629\t\3\2\2\63\65\5\17\b\2\64\63\3\2\2\2\65\66\3\2\2\2\66\64\3"+
		"\2\2\2\66\67\3\2\2\2\679\3\2\2\28\62\3\2\2\28\64\3\2\2\29\16\3\2\2\2:"+
		";\t\4\2\2;\20\3\2\2\2<=\7,\2\2=\22\3\2\2\2>?\7}\2\2?\24\3\2\2\2@A\7\177"+
		"\2\2A\26\3\2\2\2BC\7`\2\2C\30\3\2\2\2DE\7&\2\2E\32\3\2\2\2FH\t\5\2\2G"+
		"F\3\2\2\2HI\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JK\3\2\2\2KL\b\16\2\2L\34\3\2\2"+
		"\2\6\2\668I\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}