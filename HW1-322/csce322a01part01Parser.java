// Generated from C:/Users/taylo/IdeaProjects/HW1-322/src\csce322a01part01.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class csce322a01part01Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SECTION_BEGINNING=1, SECTION_ENDING=2, MOVES_SECTION_TITLE=3, GAME_SECTION_TITLE=4, 
		MOVE_SYMBOL=5, GAME_SYMBOL=6, NUMERICAL_SYMBOL=7, ROW_ENDING=8, GAME_BEGINNING=9, 
		GAME_ENDING=10, MOVES_BEGGINING=11, MOVES_ENDING=12, WHITE_SPACE=13;
	public static final int
		RULE_main = 0, RULE_extremePegSolitaire = 1, RULE_gameSection = 2, RULE_moveSection = 3, 
		RULE_fullGame = 4, RULE_fullRow = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "extremePegSolitaire", "gameSection", "moveSection", "fullGame", 
			"fullRow"
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

	@Override
	public String getGrammarFileName() { return "csce322a01part01.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public csce322a01part01Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class MainContext extends ParserRuleContext {
		public ExtremePegSolitaireContext extremePegSolitaire() {
			return getRuleContext(ExtremePegSolitaireContext.class,0);
		}
		public TerminalNode EOF() { return getToken(csce322a01part01Parser.EOF, 0); }
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322a01part01Listener ) ((csce322a01part01Listener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322a01part01Listener ) ((csce322a01part01Listener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csce322a01part01Visitor ) return ((csce322a01part01Visitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			extremePegSolitaire();
			setState(13);
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

	public static class ExtremePegSolitaireContext extends ParserRuleContext {
		public GameSectionContext gameSection() {
			return getRuleContext(GameSectionContext.class,0);
		}
		public MoveSectionContext moveSection() {
			return getRuleContext(MoveSectionContext.class,0);
		}
		public ExtremePegSolitaireContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extremePegSolitaire; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322a01part01Listener ) ((csce322a01part01Listener)listener).enterExtremePegSolitaire(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322a01part01Listener ) ((csce322a01part01Listener)listener).exitExtremePegSolitaire(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csce322a01part01Visitor ) return ((csce322a01part01Visitor<? extends T>)visitor).visitExtremePegSolitaire(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtremePegSolitaireContext extremePegSolitaire() throws RecognitionException {
		ExtremePegSolitaireContext _localctx = new ExtremePegSolitaireContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_extremePegSolitaire);
		try {
			setState(23);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GAME_SECTION_TITLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(15);
				gameSection();
				setState(16);
				moveSection();
				System.out.println("End the File");
				}
				break;
			case MOVES_SECTION_TITLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(19);
				moveSection();
				setState(20);
				gameSection();
				System.out.println("End the File");
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

	public static class GameSectionContext extends ParserRuleContext {
		public TerminalNode GAME_SECTION_TITLE() { return getToken(csce322a01part01Parser.GAME_SECTION_TITLE, 0); }
		public TerminalNode SECTION_BEGINNING() { return getToken(csce322a01part01Parser.SECTION_BEGINNING, 0); }
		public TerminalNode GAME_BEGINNING() { return getToken(csce322a01part01Parser.GAME_BEGINNING, 0); }
		public FullGameContext fullGame() {
			return getRuleContext(FullGameContext.class,0);
		}
		public TerminalNode SECTION_ENDING() { return getToken(csce322a01part01Parser.SECTION_ENDING, 0); }
		public GameSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gameSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322a01part01Listener ) ((csce322a01part01Listener)listener).enterGameSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322a01part01Listener ) ((csce322a01part01Listener)listener).exitGameSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csce322a01part01Visitor ) return ((csce322a01part01Visitor<? extends T>)visitor).visitGameSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GameSectionContext gameSection() throws RecognitionException {
		GameSectionContext _localctx = new GameSectionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_gameSection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			match(GAME_SECTION_TITLE);
			System.out.println("game Section");
			setState(27);
			match(SECTION_BEGINNING);
			System.out.println("Begin the Section");
			setState(29);
			match(GAME_BEGINNING);
			System.out.println("Start the Game");
			setState(31);
			fullGame();
			setState(32);
			match(SECTION_ENDING);
			System.out.println("End the Section");
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

	public static class MoveSectionContext extends ParserRuleContext {
		public Token MOVE_SYMBOL;
		public TerminalNode MOVES_SECTION_TITLE() { return getToken(csce322a01part01Parser.MOVES_SECTION_TITLE, 0); }
		public TerminalNode SECTION_BEGINNING() { return getToken(csce322a01part01Parser.SECTION_BEGINNING, 0); }
		public TerminalNode MOVES_BEGGINING() { return getToken(csce322a01part01Parser.MOVES_BEGGINING, 0); }
		public TerminalNode MOVES_ENDING() { return getToken(csce322a01part01Parser.MOVES_ENDING, 0); }
		public TerminalNode SECTION_ENDING() { return getToken(csce322a01part01Parser.SECTION_ENDING, 0); }
		public List<TerminalNode> MOVE_SYMBOL() { return getTokens(csce322a01part01Parser.MOVE_SYMBOL); }
		public TerminalNode MOVE_SYMBOL(int i) {
			return getToken(csce322a01part01Parser.MOVE_SYMBOL, i);
		}
		public MoveSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moveSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322a01part01Listener ) ((csce322a01part01Listener)listener).enterMoveSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322a01part01Listener ) ((csce322a01part01Listener)listener).exitMoveSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csce322a01part01Visitor ) return ((csce322a01part01Visitor<? extends T>)visitor).visitMoveSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MoveSectionContext moveSection() throws RecognitionException {
		MoveSectionContext _localctx = new MoveSectionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_moveSection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(MOVES_SECTION_TITLE);
			System.out.println("moves Section");
			setState(37);
			match(SECTION_BEGINNING);
			System.out.println("Begin the Section");
			setState(39);
			match(MOVES_BEGGINING);
			System.out.println("Begin the List");
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MOVE_SYMBOL) {
				{
				{
				setState(41);
				((MoveSectionContext)_localctx).MOVE_SYMBOL = match(MOVE_SYMBOL);
				System.out.println("Move: " + (((MoveSectionContext)_localctx).MOVE_SYMBOL!=null?((MoveSectionContext)_localctx).MOVE_SYMBOL.getText():null));
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(48);
			match(MOVES_ENDING);
			System.out.println("End the List");
			setState(50);
			match(SECTION_ENDING);
			System.out.println("End the Section");
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

	public static class FullGameContext extends ParserRuleContext {
		public List<FullRowContext> fullRow() {
			return getRuleContexts(FullRowContext.class);
		}
		public FullRowContext fullRow(int i) {
			return getRuleContext(FullRowContext.class,i);
		}
		public FullGameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullGame; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322a01part01Listener ) ((csce322a01part01Listener)listener).enterFullGame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322a01part01Listener ) ((csce322a01part01Listener)listener).exitFullGame(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csce322a01part01Visitor ) return ((csce322a01part01Visitor<? extends T>)visitor).visitFullGame(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FullGameContext fullGame() throws RecognitionException {
		FullGameContext _localctx = new FullGameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_fullGame);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(53);
				fullRow();
				}
				}
				setState(56); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GAME_SYMBOL) | (1L << ROW_ENDING) | (1L << GAME_ENDING))) != 0) );
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

	public static class FullRowContext extends ParserRuleContext {
		public Token GAME_SYMBOL;
		public TerminalNode ROW_ENDING() { return getToken(csce322a01part01Parser.ROW_ENDING, 0); }
		public List<TerminalNode> GAME_SYMBOL() { return getTokens(csce322a01part01Parser.GAME_SYMBOL); }
		public TerminalNode GAME_SYMBOL(int i) {
			return getToken(csce322a01part01Parser.GAME_SYMBOL, i);
		}
		public TerminalNode GAME_ENDING() { return getToken(csce322a01part01Parser.GAME_ENDING, 0); }
		public FullRowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullRow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322a01part01Listener ) ((csce322a01part01Listener)listener).enterFullRow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322a01part01Listener ) ((csce322a01part01Listener)listener).exitFullRow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csce322a01part01Visitor ) return ((csce322a01part01Visitor<? extends T>)visitor).visitFullRow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FullRowContext fullRow() throws RecognitionException {
		FullRowContext _localctx = new FullRowContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_fullRow);
		int _la;
		try {
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==GAME_SYMBOL) {
					{
					{
					setState(58);
					((FullRowContext)_localctx).GAME_SYMBOL = match(GAME_SYMBOL);
					  if((((FullRowContext)_localctx).GAME_SYMBOL!=null?((FullRowContext)_localctx).GAME_SYMBOL.getText():null).equals("-")){
					                                System.out.println("Space: Empty");
					                            }else{
					                                System.out.println("Space: " + (((FullRowContext)_localctx).GAME_SYMBOL!=null?((FullRowContext)_localctx).GAME_SYMBOL.getText():null));
					                                 }
					                        
					}
					}
					setState(64);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(65);
				match(ROW_ENDING);
				System.out.println("End the Row");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==GAME_SYMBOL) {
					{
					{
					setState(67);
					((FullRowContext)_localctx).GAME_SYMBOL = match(GAME_SYMBOL);
					  if((((FullRowContext)_localctx).GAME_SYMBOL!=null?((FullRowContext)_localctx).GAME_SYMBOL.getText():null).equals("-")){
					                                System.out.println("Space: Empty");
					                            }else{
					                                System.out.println("Space: " + (((FullRowContext)_localctx).GAME_SYMBOL!=null?((FullRowContext)_localctx).GAME_SYMBOL.getText():null));
					                                }
					                        
					}
					}
					setState(73);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(74);
				match(GAME_ENDING);
				System.out.println("End the Game");
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\17Q\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\5\3\32\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\7\5.\n\5\f\5\16\5\61\13\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\6\69\n\6\r\6\16\6:\3\7\3\7\7\7?\n\7\f\7\16\7B\13\7\3\7\3\7\3\7\3\7"+
		"\7\7H\n\7\f\7\16\7K\13\7\3\7\3\7\5\7O\n\7\3\7\2\2\b\2\4\6\b\n\f\2\2\2"+
		"P\2\16\3\2\2\2\4\31\3\2\2\2\6\33\3\2\2\2\b%\3\2\2\2\n8\3\2\2\2\fN\3\2"+
		"\2\2\16\17\5\4\3\2\17\20\7\2\2\3\20\3\3\2\2\2\21\22\5\6\4\2\22\23\5\b"+
		"\5\2\23\24\b\3\1\2\24\32\3\2\2\2\25\26\5\b\5\2\26\27\5\6\4\2\27\30\b\3"+
		"\1\2\30\32\3\2\2\2\31\21\3\2\2\2\31\25\3\2\2\2\32\5\3\2\2\2\33\34\7\6"+
		"\2\2\34\35\b\4\1\2\35\36\7\3\2\2\36\37\b\4\1\2\37 \7\13\2\2 !\b\4\1\2"+
		"!\"\5\n\6\2\"#\7\4\2\2#$\b\4\1\2$\7\3\2\2\2%&\7\5\2\2&\'\b\5\1\2\'(\7"+
		"\3\2\2()\b\5\1\2)*\7\r\2\2*/\b\5\1\2+,\7\7\2\2,.\b\5\1\2-+\3\2\2\2.\61"+
		"\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\62\3\2\2\2\61/\3\2\2\2\62\63\7\16\2"+
		"\2\63\64\b\5\1\2\64\65\7\4\2\2\65\66\b\5\1\2\66\t\3\2\2\2\679\5\f\7\2"+
		"8\67\3\2\2\29:\3\2\2\2:8\3\2\2\2:;\3\2\2\2;\13\3\2\2\2<=\7\b\2\2=?\b\7"+
		"\1\2><\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2AC\3\2\2\2B@\3\2\2\2CD\7\n"+
		"\2\2DO\b\7\1\2EF\7\b\2\2FH\b\7\1\2GE\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2"+
		"\2\2JL\3\2\2\2KI\3\2\2\2LM\7\f\2\2MO\b\7\1\2N@\3\2\2\2NI\3\2\2\2O\r\3"+
		"\2\2\2\b\31/:@IN";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}