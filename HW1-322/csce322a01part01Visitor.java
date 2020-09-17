// Generated from C:/Users/taylo/IdeaProjects/HW1-322/src\csce322a01part01.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link csce322a01part01Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface csce322a01part01Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link csce322a01part01Parser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(csce322a01part01Parser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link csce322a01part01Parser#extremePegSolitaire}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtremePegSolitaire(csce322a01part01Parser.ExtremePegSolitaireContext ctx);
	/**
	 * Visit a parse tree produced by {@link csce322a01part01Parser#gameSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGameSection(csce322a01part01Parser.GameSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link csce322a01part01Parser#moveSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoveSection(csce322a01part01Parser.MoveSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link csce322a01part01Parser#fullGame}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullGame(csce322a01part01Parser.FullGameContext ctx);
	/**
	 * Visit a parse tree produced by {@link csce322a01part01Parser#fullRow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullRow(csce322a01part01Parser.FullRowContext ctx);
}