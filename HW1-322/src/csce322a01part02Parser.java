// Generated from C:/Users/taylo/IdeaProjects/HW1-322/src\csce322a01part02.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class csce322a01part02Parser extends Parser {
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
		RULE_fullGame = 4, RULE_fullRowEnding = 5, RULE_fullGameEnding = 6, RULE_gameMove = 7, 
		RULE_moveMove = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "extremePegSolitaire", "gameSection", "moveSection", "fullGame", 
			"fullRowEnding", "fullGameEnding", "gameMove", "moveMove"
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
	public String getGrammarFileName() { return "csce322a01part02.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }



	int countRows = 0;
	int countColumns = 0;
	int countMoves = 0;
	int countMoveSection = 0;
	int countGameSection = 0;
	int countPlayers = 0;
	int countWhiteSpace = 0;
	int countUMoves = 0;
	int countDMoves = 0;
	int countLMoves = 0;
	int countRMoves = 0;
	int countTotalSpace = 0;
	int countGameSpace =0;
	double fracWhiteSpace =0;
	int errorFound = 0;

	public csce322a01part02Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class MainContext extends ParserRuleContext {
		public ExtremePegSolitaireContext extremePegSolitaire() {
			return getRuleContext(ExtremePegSolitaireContext.class,0);
		}
		public TerminalNode EOF() { return getToken(csce322a01part02Parser.EOF, 0); }
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322a01part02Listener ) ((csce322a01part02Listener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322a01part02Listener ) ((csce322a01part02Listener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csce322a01part02Visitor ) return ((csce322a01part02Visitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			extremePegSolitaire();
			setState(19);
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
			if ( listener instanceof csce322a01part02Listener ) ((csce322a01part02Listener)listener).enterExtremePegSolitaire(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322a01part02Listener ) ((csce322a01part02Listener)listener).exitExtremePegSolitaire(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csce322a01part02Visitor ) return ((csce322a01part02Visitor<? extends T>)visitor).visitExtremePegSolitaire(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtremePegSolitaireContext extremePegSolitaire() throws RecognitionException {
		ExtremePegSolitaireContext _localctx = new ExtremePegSolitaireContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_extremePegSolitaire);
		try {
			setState(29);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GAME_SECTION_TITLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(21);
				gameSection();
				setState(22);
				moveSection();

				                                            countTotalSpace = countWhiteSpace + countGameSpace;
				                                            fracWhiteSpace = (double)countWhiteSpace/(double)countTotalSpace;
				                                            if(countPlayers < 2 | countPlayers > 4){
				                                            System.out.println("SEMANTIC PROBLEM 1");
				                                            errorFound = 1;
				                                            }
				                                            if(fracWhiteSpace > .4){
				                                            System.out.println("SEMANTIC PROBLEM 2");
				                                            errorFound = 1;
				                                            }
				                                            if(countUMoves < 1 | countDMoves < 1 | countLMoves < 1 | countRMoves < 1){
				                                            System.out.println("SEMANTIC PROBLEM 3");
				                                            errorFound = 1;
				                                            }
				                                            if(errorFound == 0){
				                                            System.out.println("There are " + countWhiteSpace +" empty spaces on the board");
				                                            }
				}
				break;
			case MOVES_SECTION_TITLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(25);
				moveSection();
				setState(26);
				gameSection();

				                                            countTotalSpace = countWhiteSpace + countGameSpace;
				                                            fracWhiteSpace = (double)countWhiteSpace/(double)countTotalSpace;
				                                            if(countPlayers < 2 | countPlayers > 4){
				                                            System.out.println("SEMANTIC PROBLEM 1");
				                                            errorFound = 1;
				                                            }
				                                            if(fracWhiteSpace > .4){
				                                            System.out.println("SEMANTIC PROBLEM 2");
				                                            errorFound = 1;
				                                            }
				                                            if(countUMoves < 1 | countDMoves < 1 | countLMoves < 1 | countRMoves < 1){
				                                            System.out.println("SEMANTIC PROBLEM 3");
				                                            errorFound = 1;
				                                            }
				                                            if(errorFound == 0){
				                                            System.out.println("There are " + countWhiteSpace +" empty spaces on the board");
				                                            }
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
		public TerminalNode GAME_SECTION_TITLE() { return getToken(csce322a01part02Parser.GAME_SECTION_TITLE, 0); }
		public TerminalNode SECTION_BEGINNING() { return getToken(csce322a01part02Parser.SECTION_BEGINNING, 0); }
		public TerminalNode GAME_BEGINNING() { return getToken(csce322a01part02Parser.GAME_BEGINNING, 0); }
		public FullGameContext fullGame() {
			return getRuleContext(FullGameContext.class,0);
		}
		public TerminalNode SECTION_ENDING() { return getToken(csce322a01part02Parser.SECTION_ENDING, 0); }
		public GameSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gameSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322a01part02Listener ) ((csce322a01part02Listener)listener).enterGameSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322a01part02Listener ) ((csce322a01part02Listener)listener).exitGameSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csce322a01part02Visitor ) return ((csce322a01part02Visitor<? extends T>)visitor).visitGameSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GameSectionContext gameSection() throws RecognitionException {
		GameSectionContext _localctx = new GameSectionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_gameSection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(GAME_SECTION_TITLE);
			setState(32);
			match(SECTION_BEGINNING);
			setState(33);
			match(GAME_BEGINNING);
			setState(34);
			fullGame();
			setState(35);
			match(SECTION_ENDING);
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
		public TerminalNode MOVES_SECTION_TITLE() { return getToken(csce322a01part02Parser.MOVES_SECTION_TITLE, 0); }
		public TerminalNode SECTION_BEGINNING() { return getToken(csce322a01part02Parser.SECTION_BEGINNING, 0); }
		public TerminalNode MOVES_BEGGINING() { return getToken(csce322a01part02Parser.MOVES_BEGGINING, 0); }
		public List<MoveMoveContext> moveMove() {
			return getRuleContexts(MoveMoveContext.class);
		}
		public MoveMoveContext moveMove(int i) {
			return getRuleContext(MoveMoveContext.class,i);
		}
		public TerminalNode MOVES_ENDING() { return getToken(csce322a01part02Parser.MOVES_ENDING, 0); }
		public TerminalNode SECTION_ENDING() { return getToken(csce322a01part02Parser.SECTION_ENDING, 0); }
		public MoveSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moveSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322a01part02Listener ) ((csce322a01part02Listener)listener).enterMoveSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322a01part02Listener ) ((csce322a01part02Listener)listener).exitMoveSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csce322a01part02Visitor ) return ((csce322a01part02Visitor<? extends T>)visitor).visitMoveSection(this);
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
			setState(37);
			match(MOVES_SECTION_TITLE);
			setState(38);
			match(SECTION_BEGINNING);
			setState(39);
			match(MOVES_BEGGINING);
			setState(40);
			moveMove();
			setState(41);
			moveMove();
			setState(42);
			moveMove();
			setState(43);
			moveMove();
			setState(45); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(44);
				moveMove();
				}
				}
				setState(47); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==MOVE_SYMBOL );
			setState(49);
			match(MOVES_ENDING);
			setState(50);
			match(SECTION_ENDING);
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
		public List<FullRowEndingContext> fullRowEnding() {
			return getRuleContexts(FullRowEndingContext.class);
		}
		public FullRowEndingContext fullRowEnding(int i) {
			return getRuleContext(FullRowEndingContext.class,i);
		}
		public FullGameEndingContext fullGameEnding() {
			return getRuleContext(FullGameEndingContext.class,0);
		}
		public FullGameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullGame; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322a01part02Listener ) ((csce322a01part02Listener)listener).enterFullGame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322a01part02Listener ) ((csce322a01part02Listener)listener).exitFullGame(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csce322a01part02Visitor ) return ((csce322a01part02Visitor<? extends T>)visitor).visitFullGame(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FullGameContext fullGame() throws RecognitionException {
		FullGameContext _localctx = new FullGameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_fullGame);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			fullRowEnding();
			setState(53);
			fullRowEnding();
			setState(54);
			fullRowEnding();
			setState(55);
			fullRowEnding();
			setState(56);
			fullRowEnding();
			setState(57);
			fullRowEnding();
			setState(58);
			fullRowEnding();
			setState(59);
			fullRowEnding();
			setState(61); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(60);
					fullRowEnding();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(63); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(65);
			fullGameEnding();
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

	public static class FullRowEndingContext extends ParserRuleContext {
		public List<GameMoveContext> gameMove() {
			return getRuleContexts(GameMoveContext.class);
		}
		public GameMoveContext gameMove(int i) {
			return getRuleContext(GameMoveContext.class,i);
		}
		public TerminalNode ROW_ENDING() { return getToken(csce322a01part02Parser.ROW_ENDING, 0); }
		public FullRowEndingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullRowEnding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322a01part02Listener ) ((csce322a01part02Listener)listener).enterFullRowEnding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322a01part02Listener ) ((csce322a01part02Listener)listener).exitFullRowEnding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csce322a01part02Visitor ) return ((csce322a01part02Visitor<? extends T>)visitor).visitFullRowEnding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FullRowEndingContext fullRowEnding() throws RecognitionException {
		FullRowEndingContext _localctx = new FullRowEndingContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_fullRowEnding);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			gameMove();
			setState(68);
			gameMove();
			setState(69);
			gameMove();
			setState(70);
			gameMove();
			setState(71);
			gameMove();
			setState(72);
			gameMove();
			setState(73);
			gameMove();
			setState(74);
			gameMove();
			setState(75);
			gameMove();
			setState(77); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(76);
				gameMove();
				}
				}
				setState(79); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==GAME_SYMBOL );
			setState(81);
			match(ROW_ENDING);
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

	public static class FullGameEndingContext extends ParserRuleContext {
		public List<GameMoveContext> gameMove() {
			return getRuleContexts(GameMoveContext.class);
		}
		public GameMoveContext gameMove(int i) {
			return getRuleContext(GameMoveContext.class,i);
		}
		public TerminalNode GAME_ENDING() { return getToken(csce322a01part02Parser.GAME_ENDING, 0); }
		public FullGameEndingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullGameEnding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322a01part02Listener ) ((csce322a01part02Listener)listener).enterFullGameEnding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322a01part02Listener ) ((csce322a01part02Listener)listener).exitFullGameEnding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csce322a01part02Visitor ) return ((csce322a01part02Visitor<? extends T>)visitor).visitFullGameEnding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FullGameEndingContext fullGameEnding() throws RecognitionException {
		FullGameEndingContext _localctx = new FullGameEndingContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_fullGameEnding);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			gameMove();
			setState(84);
			gameMove();
			setState(85);
			gameMove();
			setState(86);
			gameMove();
			setState(87);
			gameMove();
			setState(88);
			gameMove();
			setState(89);
			gameMove();
			setState(90);
			gameMove();
			setState(91);
			gameMove();
			setState(93); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(92);
				gameMove();
				}
				}
				setState(95); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==GAME_SYMBOL );
			setState(97);
			match(GAME_ENDING);
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

	public static class GameMoveContext extends ParserRuleContext {
		public Token GAME_SYMBOL;
		public TerminalNode GAME_SYMBOL() { return getToken(csce322a01part02Parser.GAME_SYMBOL, 0); }
		public GameMoveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gameMove; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322a01part02Listener ) ((csce322a01part02Listener)listener).enterGameMove(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322a01part02Listener ) ((csce322a01part02Listener)listener).exitGameMove(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csce322a01part02Visitor ) return ((csce322a01part02Visitor<? extends T>)visitor).visitGameMove(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GameMoveContext gameMove() throws RecognitionException {
		GameMoveContext _localctx = new GameMoveContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_gameMove);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			((GameMoveContext)_localctx).GAME_SYMBOL = match(GAME_SYMBOL);
			  if((((GameMoveContext)_localctx).GAME_SYMBOL!=null?((GameMoveContext)_localctx).GAME_SYMBOL.getText():null).equals("-")){
			                                        countWhiteSpace++;
			                                  }else{
			                                         if(!(((GameMoveContext)_localctx).GAME_SYMBOL!=null?((GameMoveContext)_localctx).GAME_SYMBOL.getText():null).equals("-") && !(((GameMoveContext)_localctx).GAME_SYMBOL!=null?((GameMoveContext)_localctx).GAME_SYMBOL.getText():null).equals("x")){
			                                             countPlayers++;
			                                         }
			                                        countGameSpace++;
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

	public static class MoveMoveContext extends ParserRuleContext {
		public Token MOVE_SYMBOL;
		public TerminalNode MOVE_SYMBOL() { return getToken(csce322a01part02Parser.MOVE_SYMBOL, 0); }
		public MoveMoveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moveMove; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322a01part02Listener ) ((csce322a01part02Listener)listener).enterMoveMove(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322a01part02Listener ) ((csce322a01part02Listener)listener).exitMoveMove(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof csce322a01part02Visitor ) return ((csce322a01part02Visitor<? extends T>)visitor).visitMoveMove(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MoveMoveContext moveMove() throws RecognitionException {
		MoveMoveContext _localctx = new MoveMoveContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_moveMove);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			((MoveMoveContext)_localctx).MOVE_SYMBOL = match(MOVE_SYMBOL);

			                                    countMoves++;
			                                    if((((MoveMoveContext)_localctx).MOVE_SYMBOL!=null?((MoveMoveContext)_localctx).MOVE_SYMBOL.getText():null).equals("u")){
			                                    countUMoves++;
			                                    }else if((((MoveMoveContext)_localctx).MOVE_SYMBOL!=null?((MoveMoveContext)_localctx).MOVE_SYMBOL.getText():null).equals("d")){
			                                    countDMoves++;
			                                    }else if((((MoveMoveContext)_localctx).MOVE_SYMBOL!=null?((MoveMoveContext)_localctx).MOVE_SYMBOL.getText():null).equals("l")){
			                                    countLMoves++;
			                                    }else if((((MoveMoveContext)_localctx).MOVE_SYMBOL!=null?((MoveMoveContext)_localctx).MOVE_SYMBOL.getText():null).equals("r")){
			                                    countRMoves++;
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\17l\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3 \n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\6\5\60\n\5\r\5\16\5\61\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\6\6@\n\6\r\6\16\6A\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\6\7P\n\7\r\7\16\7Q\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\6\b`\n\b\r\b\16\ba\3\b\3\b\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\2\2\13\2\4\6\b\n\f\16\20\22\2\2\2g\2\24\3\2\2\2\4\37\3\2"+
		"\2\2\6!\3\2\2\2\b\'\3\2\2\2\n\66\3\2\2\2\fE\3\2\2\2\16U\3\2\2\2\20e\3"+
		"\2\2\2\22h\3\2\2\2\24\25\5\4\3\2\25\26\7\2\2\3\26\3\3\2\2\2\27\30\5\6"+
		"\4\2\30\31\5\b\5\2\31\32\b\3\1\2\32 \3\2\2\2\33\34\5\b\5\2\34\35\5\6\4"+
		"\2\35\36\b\3\1\2\36 \3\2\2\2\37\27\3\2\2\2\37\33\3\2\2\2 \5\3\2\2\2!\""+
		"\7\6\2\2\"#\7\3\2\2#$\7\13\2\2$%\5\n\6\2%&\7\4\2\2&\7\3\2\2\2\'(\7\5\2"+
		"\2()\7\3\2\2)*\7\r\2\2*+\5\22\n\2+,\5\22\n\2,-\5\22\n\2-/\5\22\n\2.\60"+
		"\5\22\n\2/.\3\2\2\2\60\61\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\63\3\2"+
		"\2\2\63\64\7\16\2\2\64\65\7\4\2\2\65\t\3\2\2\2\66\67\5\f\7\2\678\5\f\7"+
		"\289\5\f\7\29:\5\f\7\2:;\5\f\7\2;<\5\f\7\2<=\5\f\7\2=?\5\f\7\2>@\5\f\7"+
		"\2?>\3\2\2\2@A\3\2\2\2A?\3\2\2\2AB\3\2\2\2BC\3\2\2\2CD\5\16\b\2D\13\3"+
		"\2\2\2EF\5\20\t\2FG\5\20\t\2GH\5\20\t\2HI\5\20\t\2IJ\5\20\t\2JK\5\20\t"+
		"\2KL\5\20\t\2LM\5\20\t\2MO\5\20\t\2NP\5\20\t\2ON\3\2\2\2PQ\3\2\2\2QO\3"+
		"\2\2\2QR\3\2\2\2RS\3\2\2\2ST\7\n\2\2T\r\3\2\2\2UV\5\20\t\2VW\5\20\t\2"+
		"WX\5\20\t\2XY\5\20\t\2YZ\5\20\t\2Z[\5\20\t\2[\\\5\20\t\2\\]\5\20\t\2]"+
		"_\5\20\t\2^`\5\20\t\2_^\3\2\2\2`a\3\2\2\2a_\3\2\2\2ab\3\2\2\2bc\3\2\2"+
		"\2cd\7\f\2\2d\17\3\2\2\2ef\7\b\2\2fg\b\t\1\2g\21\3\2\2\2hi\7\7\2\2ij\b"+
		"\n\1\2j\23\3\2\2\2\7\37\61AQa";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}