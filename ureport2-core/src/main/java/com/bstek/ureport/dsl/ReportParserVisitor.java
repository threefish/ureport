// Generated from ReportParser.g4 by ANTLR 4.5.3
package com.bstek.ureport.dsl;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ReportParserParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ReportParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ReportParserParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(ReportParserParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReportParserParser#ternaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernaryExpr(ReportParserParser.TernaryExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReportParserParser#caseExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseExpr(ReportParserParser.CaseExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReportParserParser#casePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCasePart(ReportParserParser.CasePartContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReportParserParser#ifExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExpr(ReportParserParser.IfExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReportParserParser#ifPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfPart(ReportParserParser.IfPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReportParserParser#elseIfPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIfPart(ReportParserParser.ElseIfPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReportParserParser#elsePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElsePart(ReportParserParser.ElsePartContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReportParserParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(ReportParserParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReportParserParser#ifCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfCondition(ReportParserParser.IfConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleJoin}
	 * labeled alternative in {@link ReportParserParser#item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleJoin(ReportParserParser.SimpleJoinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleParenJoin}
	 * labeled alternative in {@link ReportParserParser#item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleParenJoin(ReportParserParser.SingleParenJoinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenJoin}
	 * labeled alternative in {@link ReportParserParser#item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenJoin(ReportParserParser.ParenJoinContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReportParserParser#unit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnit(ReportParserParser.UnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReportParserParser#cellPosition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCellPosition(ReportParserParser.CellPositionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReportParserParser#relativeCell}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelativeCell(ReportParserParser.RelativeCellContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReportParserParser#cell}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCell(ReportParserParser.CellContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReportParserParser#dataset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataset(ReportParserParser.DatasetContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReportParserParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(ReportParserParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReportParserParser#functionParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionParameter(ReportParserParser.FunctionParameterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cellPair}
	 * labeled alternative in {@link ReportParserParser#set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCellPair(ReportParserParser.CellPairContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wholeCell}
	 * labeled alternative in {@link ReportParserParser#set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWholeCell(ReportParserParser.WholeCellContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cellCoordinateCondition}
	 * labeled alternative in {@link ReportParserParser#set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCellCoordinateCondition(ReportParserParser.CellCoordinateConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleCellCondition}
	 * labeled alternative in {@link ReportParserParser#set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleCellCondition(ReportParserParser.SingleCellConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleCell}
	 * labeled alternative in {@link ReportParserParser#set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleCell(ReportParserParser.SingleCellContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleData}
	 * labeled alternative in {@link ReportParserParser#set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleData(ReportParserParser.SimpleDataContext ctx);
	/**
	 * Visit a parse tree produced by the {@code range}
	 * labeled alternative in {@link ReportParserParser#set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange(ReportParserParser.RangeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleCellCoordinate}
	 * labeled alternative in {@link ReportParserParser#set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleCellCoordinate(ReportParserParser.SingleCellCoordinateContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReportParserParser#cellCoordinate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCellCoordinate(ReportParserParser.CellCoordinateContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReportParserParser#coordinate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCoordinate(ReportParserParser.CoordinateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relative}
	 * labeled alternative in {@link ReportParserParser#cellIndicator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelative(ReportParserParser.RelativeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code absolute}
	 * labeled alternative in {@link ReportParserParser#cellIndicator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbsolute(ReportParserParser.AbsoluteContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReportParserParser#conditions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditions(ReportParserParser.ConditionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cellNameExprCondition}
	 * labeled alternative in {@link ReportParserParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCellNameExprCondition(ReportParserParser.CellNameExprConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code propertyCondition}
	 * labeled alternative in {@link ReportParserParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyCondition(ReportParserParser.PropertyConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprCondition}
	 * labeled alternative in {@link ReportParserParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCondition(ReportParserParser.ExprConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReportParserParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(ReportParserParser.PropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReportParserParser#simpleValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleValue(ReportParserParser.SimpleValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReportParserParser#join}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin(ReportParserParser.JoinContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReportParserParser#aggregate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregate(ReportParserParser.AggregateContext ctx);
}