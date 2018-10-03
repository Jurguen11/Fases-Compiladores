// Generated from C:/Users/Jurguen/Desktop/Materia/2018/2 Semestre 2018/Compi/Proyecto Compiladores 2018/Primera parte compiladores\MiParser.g4 by ANTLR 4.7
package generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MiParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MiParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code programAST}
	 * labeled alternative in {@link MiParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramAST(MiParser.ProgramASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constDeclarationNumCharAST}
	 * labeled alternative in {@link MiParser#constDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDeclarationNumCharAST(MiParser.ConstDeclarationNumCharASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varDeclarationVarAST}
	 * labeled alternative in {@link MiParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclarationVarAST(MiParser.VarDeclarationVarASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classDeclarationClassAST}
	 * labeled alternative in {@link MiParser#classDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclarationClassAST(MiParser.ClassDeclarationClassASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methodDeclarationAST}
	 * labeled alternative in {@link MiParser#methodDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclarationAST(MiParser.MethodDeclarationASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code formParsAST}
	 * labeled alternative in {@link MiParser#formPars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormParsAST(MiParser.FormParsASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeAST}
	 * labeled alternative in {@link MiParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeAST(MiParser.TypeASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code designatorStatementAST}
	 * labeled alternative in {@link MiParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesignatorStatementAST(MiParser.DesignatorStatementASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifAST}
	 * labeled alternative in {@link MiParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfAST(MiParser.IfASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forAST}
	 * labeled alternative in {@link MiParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForAST(MiParser.ForASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileAST}
	 * labeled alternative in {@link MiParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileAST(MiParser.WhileASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code breakAST}
	 * labeled alternative in {@link MiParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakAST(MiParser.BreakASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnAST}
	 * labeled alternative in {@link MiParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnAST(MiParser.ReturnASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code readAST}
	 * labeled alternative in {@link MiParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadAST(MiParser.ReadASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code writeAST}
	 * labeled alternative in {@link MiParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteAST(MiParser.WriteASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blockStatementAST}
	 * labeled alternative in {@link MiParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatementAST(MiParser.BlockStatementASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pcAST}
	 * labeled alternative in {@link MiParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPcAST(MiParser.PcASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blocAST}
	 * labeled alternative in {@link MiParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlocAST(MiParser.BlocASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code actParsAST}
	 * labeled alternative in {@link MiParser#actPars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActParsAST(MiParser.ActParsASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code conditionAST}
	 * labeled alternative in {@link MiParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionAST(MiParser.ConditionASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condTermAST}
	 * labeled alternative in {@link MiParser#condTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondTermAST(MiParser.CondTermASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condFactAST}
	 * labeled alternative in {@link MiParser#condFact}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondFactAST(MiParser.CondFactASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionAST}
	 * labeled alternative in {@link MiParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionAST(MiParser.ExpressionASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termASt}
	 * labeled alternative in {@link MiParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermASt(MiParser.TermAStContext ctx);
	/**
	 * Visit a parse tree produced by the {@code designatorFactorAST}
	 * labeled alternative in {@link MiParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesignatorFactorAST(MiParser.DesignatorFactorASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numAST}
	 * labeled alternative in {@link MiParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumAST(MiParser.NumASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code charAST}
	 * labeled alternative in {@link MiParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharAST(MiParser.CharASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolAST}
	 * labeled alternative in {@link MiParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolAST(MiParser.BoolASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code newAAST}
	 * labeled alternative in {@link MiParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewAAST(MiParser.NewAASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pepAST}
	 * labeled alternative in {@link MiParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPepAST(MiParser.PepASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code designatorAST}
	 * labeled alternative in {@link MiParser#designator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesignatorAST(MiParser.DesignatorASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relopEEAST}
	 * labeled alternative in {@link MiParser#relop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelopEEAST(MiParser.RelopEEASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relopDEAST}
	 * labeled alternative in {@link MiParser#relop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelopDEAST(MiParser.RelopDEASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relopGREATERAST}
	 * labeled alternative in {@link MiParser#relop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelopGREATERAST(MiParser.RelopGREATERASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relopGEAST}
	 * labeled alternative in {@link MiParser#relop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelopGEAST(MiParser.RelopGEASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relopLESSAST}
	 * labeled alternative in {@link MiParser#relop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelopLESSAST(MiParser.RelopLESSASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relopLEAST}
	 * labeled alternative in {@link MiParser#relop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelopLEAST(MiParser.RelopLEASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addopPLUSAST}
	 * labeled alternative in {@link MiParser#addop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddopPLUSAST(MiParser.AddopPLUSASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addopSUBAST}
	 * labeled alternative in {@link MiParser#addop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddopSUBAST(MiParser.AddopSUBASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulopMultAST}
	 * labeled alternative in {@link MiParser#mulop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulopMultAST(MiParser.MulopMultASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulopDIVAST}
	 * labeled alternative in {@link MiParser#mulop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulopDIVAST(MiParser.MulopDIVASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulopPERCENTAST}
	 * labeled alternative in {@link MiParser#mulop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulopPERCENTAST(MiParser.MulopPERCENTASTContext ctx);
}