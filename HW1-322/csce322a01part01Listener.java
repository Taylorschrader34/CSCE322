// Generated from C:/Users/taylo/IdeaProjects/HW1-322/src\csce322a01part01.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link csce322a01part01Parser}.
 */
public interface csce322a01part01Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link csce322a01part01Parser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(csce322a01part01Parser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link csce322a01part01Parser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(csce322a01part01Parser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link csce322a01part01Parser#extremePegSolitaire}.
	 * @param ctx the parse tree
	 */
	void enterExtremePegSolitaire(csce322a01part01Parser.ExtremePegSolitaireContext ctx);
	/**
	 * Exit a parse tree produced by {@link csce322a01part01Parser#extremePegSolitaire}.
	 * @param ctx the parse tree
	 */
	void exitExtremePegSolitaire(csce322a01part01Parser.ExtremePegSolitaireContext ctx);
	/**
	 * Enter a parse tree produced by {@link csce322a01part01Parser#gameSection}.
	 * @param ctx the parse tree
	 */
	void enterGameSection(csce322a01part01Parser.GameSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link csce322a01part01Parser#gameSection}.
	 * @param ctx the parse tree
	 */
	void exitGameSection(csce322a01part01Parser.GameSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link csce322a01part01Parser#moveSection}.
	 * @param ctx the parse tree
	 */
	void enterMoveSection(csce322a01part01Parser.MoveSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link csce322a01part01Parser#moveSection}.
	 * @param ctx the parse tree
	 */
	void exitMoveSection(csce322a01part01Parser.MoveSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link csce322a01part01Parser#fullGame}.
	 * @param ctx the parse tree
	 */
	void enterFullGame(csce322a01part01Parser.FullGameContext ctx);
	/**
	 * Exit a parse tree produced by {@link csce322a01part01Parser#fullGame}.
	 * @param ctx the parse tree
	 */
	void exitFullGame(csce322a01part01Parser.FullGameContext ctx);
	/**
	 * Enter a parse tree produced by {@link csce322a01part01Parser#fullRow}.
	 * @param ctx the parse tree
	 */
	void enterFullRow(csce322a01part01Parser.FullRowContext ctx);
	/**
	 * Exit a parse tree produced by {@link csce322a01part01Parser#fullRow}.
	 * @param ctx the parse tree
	 */
	void exitFullRow(csce322a01part01Parser.FullRowContext ctx);
}