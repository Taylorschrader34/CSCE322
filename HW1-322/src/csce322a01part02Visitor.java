// Generated from C:/Users/taylo/IdeaProjects/HW1-322/src\csce322a01part02.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link csce322a01part02Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface csce322a01part02Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link csce322a01part02Parser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(csce322a01part02Parser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link csce322a01part02Parser#extremePegSolitaire}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtremePegSolitaire(csce322a01part02Parser.ExtremePegSolitaireContext ctx);
	/**
	 * Visit a parse tree produced by {@link csce322a01part02Parser#gameSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGameSection(csce322a01part02Parser.GameSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link csce322a01part02Parser#moveSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoveSection(csce322a01part02Parser.MoveSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link csce322a01part02Parser#fullGame}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullGame(csce322a01part02Parser.FullGameContext ctx);
	/**
	 * Visit a parse tree produced by {@link csce322a01part02Parser#fullRowEnding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullRowEnding(csce322a01part02Parser.FullRowEndingContext ctx);
	/**
	 * Visit a parse tree produced by {@link csce322a01part02Parser#fullGameEnding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullGameEnding(csce322a01part02Parser.FullGameEndingContext ctx);
	/**
	 * Visit a parse tree produced by {@link csce322a01part02Parser#gameMove}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGameMove(csce322a01part02Parser.GameMoveContext ctx);
	/**
	 * Visit a parse tree produced by {@link csce322a01part02Parser#moveMove}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoveMove(csce322a01part02Parser.MoveMoveContext ctx);
}