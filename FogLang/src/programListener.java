// Generated from program.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link programParser}.
 */
public interface programListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link programParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(@NotNull programParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link programParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(@NotNull programParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link programParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull programParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link programParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull programParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link programParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(@NotNull programParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link programParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(@NotNull programParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link programParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(@NotNull programParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link programParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(@NotNull programParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link programParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull programParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link programParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull programParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link programParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull programParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link programParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull programParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link programParser#control_flow}.
	 * @param ctx the parse tree
	 */
	void enterControl_flow(@NotNull programParser.Control_flowContext ctx);
	/**
	 * Exit a parse tree produced by {@link programParser#control_flow}.
	 * @param ctx the parse tree
	 */
	void exitControl_flow(@NotNull programParser.Control_flowContext ctx);
	/**
	 * Enter a parse tree produced by {@link programParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(@NotNull programParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link programParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(@NotNull programParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link programParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(@NotNull programParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link programParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(@NotNull programParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link programParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(@NotNull programParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link programParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(@NotNull programParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link programParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(@NotNull programParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link programParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(@NotNull programParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link programParser#letter}.
	 * @param ctx the parse tree
	 */
	void enterLetter(@NotNull programParser.LetterContext ctx);
	/**
	 * Exit a parse tree produced by {@link programParser#letter}.
	 * @param ctx the parse tree
	 */
	void exitLetter(@NotNull programParser.LetterContext ctx);
	/**
	 * Enter a parse tree produced by {@link programParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull programParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link programParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull programParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link programParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(@NotNull programParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link programParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(@NotNull programParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link programParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull programParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link programParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull programParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link programParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(@NotNull programParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link programParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(@NotNull programParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link programParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(@NotNull programParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link programParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(@NotNull programParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link programParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(@NotNull programParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link programParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(@NotNull programParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link programParser#digit}.
	 * @param ctx the parse tree
	 */
	void enterDigit(@NotNull programParser.DigitContext ctx);
	/**
	 * Exit a parse tree produced by {@link programParser#digit}.
	 * @param ctx the parse tree
	 */
	void exitDigit(@NotNull programParser.DigitContext ctx);
}