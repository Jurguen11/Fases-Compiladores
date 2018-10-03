// Generated from C:/Users/Jurguen/Desktop/Materia/2018/2 Semestre 2018/Compi/Proyecto Compiladores 2018/Primera parte compiladores\MiParser.g4 by ANTLR 4.7
package generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiParser}.
 */
public interface MiParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code programAST}
	 * labeled alternative in {@link MiParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgramAST(MiParser.ProgramASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code programAST}
	 * labeled alternative in {@link MiParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgramAST(MiParser.ProgramASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constDeclarationNumCharAST}
	 * labeled alternative in {@link MiParser#constDecl}.
	 * @param ctx the parse tree
	 */
	void enterConstDeclarationNumCharAST(MiParser.ConstDeclarationNumCharASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constDeclarationNumCharAST}
	 * labeled alternative in {@link MiParser#constDecl}.
	 * @param ctx the parse tree
	 */
	void exitConstDeclarationNumCharAST(MiParser.ConstDeclarationNumCharASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varDeclarationVarAST}
	 * labeled alternative in {@link MiParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclarationVarAST(MiParser.VarDeclarationVarASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varDeclarationVarAST}
	 * labeled alternative in {@link MiParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclarationVarAST(MiParser.VarDeclarationVarASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classDeclarationClassAST}
	 * labeled alternative in {@link MiParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclarationClassAST(MiParser.ClassDeclarationClassASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classDeclarationClassAST}
	 * labeled alternative in {@link MiParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclarationClassAST(MiParser.ClassDeclarationClassASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodDeclarationAST}
	 * labeled alternative in {@link MiParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclarationAST(MiParser.MethodDeclarationASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methodDeclarationAST}
	 * labeled alternative in {@link MiParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclarationAST(MiParser.MethodDeclarationASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code formParsAST}
	 * labeled alternative in {@link MiParser#formPars}.
	 * @param ctx the parse tree
	 */
	void enterFormParsAST(MiParser.FormParsASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code formParsAST}
	 * labeled alternative in {@link MiParser#formPars}.
	 * @param ctx the parse tree
	 */
	void exitFormParsAST(MiParser.FormParsASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeAST}
	 * labeled alternative in {@link MiParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeAST(MiParser.TypeASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeAST}
	 * labeled alternative in {@link MiParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeAST(MiParser.TypeASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code designatorStatementAST}
	 * labeled alternative in {@link MiParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDesignatorStatementAST(MiParser.DesignatorStatementASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code designatorStatementAST}
	 * labeled alternative in {@link MiParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDesignatorStatementAST(MiParser.DesignatorStatementASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifAST}
	 * labeled alternative in {@link MiParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfAST(MiParser.IfASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifAST}
	 * labeled alternative in {@link MiParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfAST(MiParser.IfASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forAST}
	 * labeled alternative in {@link MiParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterForAST(MiParser.ForASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forAST}
	 * labeled alternative in {@link MiParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitForAST(MiParser.ForASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileAST}
	 * labeled alternative in {@link MiParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileAST(MiParser.WhileASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileAST}
	 * labeled alternative in {@link MiParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileAST(MiParser.WhileASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code breakAST}
	 * labeled alternative in {@link MiParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBreakAST(MiParser.BreakASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code breakAST}
	 * labeled alternative in {@link MiParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBreakAST(MiParser.BreakASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnAST}
	 * labeled alternative in {@link MiParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturnAST(MiParser.ReturnASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnAST}
	 * labeled alternative in {@link MiParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturnAST(MiParser.ReturnASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code readAST}
	 * labeled alternative in {@link MiParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReadAST(MiParser.ReadASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code readAST}
	 * labeled alternative in {@link MiParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReadAST(MiParser.ReadASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code writeAST}
	 * labeled alternative in {@link MiParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWriteAST(MiParser.WriteASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code writeAST}
	 * labeled alternative in {@link MiParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWriteAST(MiParser.WriteASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blockStatementAST}
	 * labeled alternative in {@link MiParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatementAST(MiParser.BlockStatementASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blockStatementAST}
	 * labeled alternative in {@link MiParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatementAST(MiParser.BlockStatementASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pcAST}
	 * labeled alternative in {@link MiParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPcAST(MiParser.PcASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pcAST}
	 * labeled alternative in {@link MiParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPcAST(MiParser.PcASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blocAST}
	 * labeled alternative in {@link MiParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlocAST(MiParser.BlocASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blocAST}
	 * labeled alternative in {@link MiParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlocAST(MiParser.BlocASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code actParsAST}
	 * labeled alternative in {@link MiParser#actPars}.
	 * @param ctx the parse tree
	 */
	void enterActParsAST(MiParser.ActParsASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code actParsAST}
	 * labeled alternative in {@link MiParser#actPars}.
	 * @param ctx the parse tree
	 */
	void exitActParsAST(MiParser.ActParsASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code conditionAST}
	 * labeled alternative in {@link MiParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterConditionAST(MiParser.ConditionASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code conditionAST}
	 * labeled alternative in {@link MiParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitConditionAST(MiParser.ConditionASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condTermAST}
	 * labeled alternative in {@link MiParser#condTerm}.
	 * @param ctx the parse tree
	 */
	void enterCondTermAST(MiParser.CondTermASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condTermAST}
	 * labeled alternative in {@link MiParser#condTerm}.
	 * @param ctx the parse tree
	 */
	void exitCondTermAST(MiParser.CondTermASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condFactAST}
	 * labeled alternative in {@link MiParser#condFact}.
	 * @param ctx the parse tree
	 */
	void enterCondFactAST(MiParser.CondFactASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condFactAST}
	 * labeled alternative in {@link MiParser#condFact}.
	 * @param ctx the parse tree
	 */
	void exitCondFactAST(MiParser.CondFactASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionAST}
	 * labeled alternative in {@link MiParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpressionAST(MiParser.ExpressionASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionAST}
	 * labeled alternative in {@link MiParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpressionAST(MiParser.ExpressionASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termASt}
	 * labeled alternative in {@link MiParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTermASt(MiParser.TermAStContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termASt}
	 * labeled alternative in {@link MiParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTermASt(MiParser.TermAStContext ctx);
	/**
	 * Enter a parse tree produced by the {@code designatorFactorAST}
	 * labeled alternative in {@link MiParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterDesignatorFactorAST(MiParser.DesignatorFactorASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code designatorFactorAST}
	 * labeled alternative in {@link MiParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitDesignatorFactorAST(MiParser.DesignatorFactorASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numAST}
	 * labeled alternative in {@link MiParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterNumAST(MiParser.NumASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numAST}
	 * labeled alternative in {@link MiParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitNumAST(MiParser.NumASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code charAST}
	 * labeled alternative in {@link MiParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterCharAST(MiParser.CharASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code charAST}
	 * labeled alternative in {@link MiParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitCharAST(MiParser.CharASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolAST}
	 * labeled alternative in {@link MiParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterBoolAST(MiParser.BoolASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolAST}
	 * labeled alternative in {@link MiParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitBoolAST(MiParser.BoolASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code newAAST}
	 * labeled alternative in {@link MiParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterNewAAST(MiParser.NewAASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code newAAST}
	 * labeled alternative in {@link MiParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitNewAAST(MiParser.NewAASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pepAST}
	 * labeled alternative in {@link MiParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterPepAST(MiParser.PepASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pepAST}
	 * labeled alternative in {@link MiParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitPepAST(MiParser.PepASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code designatorAST}
	 * labeled alternative in {@link MiParser#designator}.
	 * @param ctx the parse tree
	 */
	void enterDesignatorAST(MiParser.DesignatorASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code designatorAST}
	 * labeled alternative in {@link MiParser#designator}.
	 * @param ctx the parse tree
	 */
	void exitDesignatorAST(MiParser.DesignatorASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relopEEAST}
	 * labeled alternative in {@link MiParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterRelopEEAST(MiParser.RelopEEASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relopEEAST}
	 * labeled alternative in {@link MiParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitRelopEEAST(MiParser.RelopEEASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relopDEAST}
	 * labeled alternative in {@link MiParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterRelopDEAST(MiParser.RelopDEASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relopDEAST}
	 * labeled alternative in {@link MiParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitRelopDEAST(MiParser.RelopDEASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relopGREATERAST}
	 * labeled alternative in {@link MiParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterRelopGREATERAST(MiParser.RelopGREATERASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relopGREATERAST}
	 * labeled alternative in {@link MiParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitRelopGREATERAST(MiParser.RelopGREATERASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relopGEAST}
	 * labeled alternative in {@link MiParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterRelopGEAST(MiParser.RelopGEASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relopGEAST}
	 * labeled alternative in {@link MiParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitRelopGEAST(MiParser.RelopGEASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relopLESSAST}
	 * labeled alternative in {@link MiParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterRelopLESSAST(MiParser.RelopLESSASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relopLESSAST}
	 * labeled alternative in {@link MiParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitRelopLESSAST(MiParser.RelopLESSASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relopLEAST}
	 * labeled alternative in {@link MiParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterRelopLEAST(MiParser.RelopLEASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relopLEAST}
	 * labeled alternative in {@link MiParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitRelopLEAST(MiParser.RelopLEASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addopPLUSAST}
	 * labeled alternative in {@link MiParser#addop}.
	 * @param ctx the parse tree
	 */
	void enterAddopPLUSAST(MiParser.AddopPLUSASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addopPLUSAST}
	 * labeled alternative in {@link MiParser#addop}.
	 * @param ctx the parse tree
	 */
	void exitAddopPLUSAST(MiParser.AddopPLUSASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addopSUBAST}
	 * labeled alternative in {@link MiParser#addop}.
	 * @param ctx the parse tree
	 */
	void enterAddopSUBAST(MiParser.AddopSUBASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addopSUBAST}
	 * labeled alternative in {@link MiParser#addop}.
	 * @param ctx the parse tree
	 */
	void exitAddopSUBAST(MiParser.AddopSUBASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulopMultAST}
	 * labeled alternative in {@link MiParser#mulop}.
	 * @param ctx the parse tree
	 */
	void enterMulopMultAST(MiParser.MulopMultASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulopMultAST}
	 * labeled alternative in {@link MiParser#mulop}.
	 * @param ctx the parse tree
	 */
	void exitMulopMultAST(MiParser.MulopMultASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulopDIVAST}
	 * labeled alternative in {@link MiParser#mulop}.
	 * @param ctx the parse tree
	 */
	void enterMulopDIVAST(MiParser.MulopDIVASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulopDIVAST}
	 * labeled alternative in {@link MiParser#mulop}.
	 * @param ctx the parse tree
	 */
	void exitMulopDIVAST(MiParser.MulopDIVASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulopPERCENTAST}
	 * labeled alternative in {@link MiParser#mulop}.
	 * @param ctx the parse tree
	 */
	void enterMulopPERCENTAST(MiParser.MulopPERCENTASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulopPERCENTAST}
	 * labeled alternative in {@link MiParser#mulop}.
	 * @param ctx the parse tree
	 */
	void exitMulopPERCENTAST(MiParser.MulopPERCENTASTContext ctx);
}