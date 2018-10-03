// Generated from C:/Users/Jurguen/Desktop/Materia/2018/2 Semestre 2018/Compi/Proyecto Compiladores 2018/Primera parte compiladores\MiParser.g4 by ANTLR 4.7
package generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMA=1, POINTC=2, KEYL=3, KEYR=4, PARENTL=5, PARENTR=6, SBL=7, SBR=8, 
		DOT=9, IF=10, ELSE=11, FOR=12, WHILE=13, BREAK=14, RETURN=15, READ=16, 
		WRITE=17, CLASS=18, CONST=19, VOID=20, NEW=21, OR=22, AND=23, PP=24, SS=25, 
		EQUALS=26, EE=27, DE=28, LESS=29, LE=30, GREATER=31, GE=32, PLUS=33, SUB=34, 
		MULT=35, DIV=36, PERCENT=37, TRUE=38, FALSE=39, ID=40, NUM=41, COMMENT=42, 
		LINE_COMMENT=43, CHAR_CONST=44, WS=45;
	public static final int
		RULE_program = 0, RULE_constDecl = 1, RULE_varDecl = 2, RULE_classDecl = 3, 
		RULE_methodDecl = 4, RULE_formPars = 5, RULE_type = 6, RULE_statement = 7, 
		RULE_block = 8, RULE_actPars = 9, RULE_condition = 10, RULE_condTerm = 11, 
		RULE_condFact = 12, RULE_expr = 13, RULE_term = 14, RULE_factor = 15, 
		RULE_designator = 16, RULE_relop = 17, RULE_addop = 18, RULE_mulop = 19;
	public static final String[] ruleNames = {
		"program", "constDecl", "varDecl", "classDecl", "methodDecl", "formPars", 
		"type", "statement", "block", "actPars", "condition", "condTerm", "condFact", 
		"expr", "term", "factor", "designator", "relop", "addop", "mulop"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "';'", "'{'", "'}'", "'('", "')'", "'['", "']'", "'.'", "'if'", 
		"'else'", "'for'", "'while'", "'break'", "'return'", "'read'", "'write'", 
		"'class'", "'const'", "'void'", "'new'", "'||'", "'&&'", "'++'", "'--'", 
		"'='", "'=='", "'!='", "'<'", "'<='", "'>'", "'>='", "'+'", "'-'", "'*'", 
		"'/'", "'%'", "'true'", "'false'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "COMMA", "POINTC", "KEYL", "KEYR", "PARENTL", "PARENTR", "SBL", 
		"SBR", "DOT", "IF", "ELSE", "FOR", "WHILE", "BREAK", "RETURN", "READ", 
		"WRITE", "CLASS", "CONST", "VOID", "NEW", "OR", "AND", "PP", "SS", "EQUALS", 
		"EE", "DE", "LESS", "LE", "GREATER", "GE", "PLUS", "SUB", "MULT", "DIV", 
		"PERCENT", "TRUE", "FALSE", "ID", "NUM", "COMMENT", "LINE_COMMENT", "CHAR_CONST", 
		"WS"
	};
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
	public String getGrammarFileName() { return "MiParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	 
		public ProgramContext() { }
		public void copyFrom(ProgramContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ProgramASTContext extends ProgramContext {
		public TerminalNode CLASS() { return getToken(MiParser.CLASS, 0); }
		public TerminalNode ID() { return getToken(MiParser.ID, 0); }
		public TerminalNode KEYL() { return getToken(MiParser.KEYL, 0); }
		public TerminalNode KEYR() { return getToken(MiParser.KEYR, 0); }
		public List<ConstDeclContext> constDecl() {
			return getRuleContexts(ConstDeclContext.class);
		}
		public ConstDeclContext constDecl(int i) {
			return getRuleContext(ConstDeclContext.class,i);
		}
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public List<ClassDeclContext> classDecl() {
			return getRuleContexts(ClassDeclContext.class);
		}
		public ClassDeclContext classDecl(int i) {
			return getRuleContext(ClassDeclContext.class,i);
		}
		public List<MethodDeclContext> methodDecl() {
			return getRuleContexts(MethodDeclContext.class);
		}
		public MethodDeclContext methodDecl(int i) {
			return getRuleContext(MethodDeclContext.class,i);
		}
		public ProgramASTContext(ProgramContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).enterProgramAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).exitProgramAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitProgramAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			_localctx = new ProgramASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(CLASS);
			setState(41);
			match(ID);
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << CONST) | (1L << ID))) != 0)) {
				{
				setState(45);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CONST:
					{
					setState(42);
					constDecl();
					}
					break;
				case ID:
					{
					setState(43);
					varDecl();
					}
					break;
				case CLASS:
					{
					setState(44);
					classDecl();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
			match(KEYL);
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VOID || _la==ID) {
				{
				{
				setState(51);
				methodDecl();
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57);
			match(KEYR);
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

	public static class ConstDeclContext extends ParserRuleContext {
		public ConstDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDecl; }
	 
		public ConstDeclContext() { }
		public void copyFrom(ConstDeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConstDeclarationNumCharASTContext extends ConstDeclContext {
		public TerminalNode CONST() { return getToken(MiParser.CONST, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiParser.ID, 0); }
		public TerminalNode EQUALS() { return getToken(MiParser.EQUALS, 0); }
		public TerminalNode POINTC() { return getToken(MiParser.POINTC, 0); }
		public TerminalNode NUM() { return getToken(MiParser.NUM, 0); }
		public TerminalNode CHAR_CONST() { return getToken(MiParser.CHAR_CONST, 0); }
		public ConstDeclarationNumCharASTContext(ConstDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).enterConstDeclarationNumCharAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).exitConstDeclarationNumCharAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitConstDeclarationNumCharAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstDeclContext constDecl() throws RecognitionException {
		ConstDeclContext _localctx = new ConstDeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_constDecl);
		int _la;
		try {
			_localctx = new ConstDeclarationNumCharASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(CONST);
			setState(60);
			type();
			setState(61);
			match(ID);
			setState(62);
			match(EQUALS);
			setState(63);
			_la = _input.LA(1);
			if ( !(_la==NUM || _la==CHAR_CONST) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(64);
			match(POINTC);
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

	public static class VarDeclContext extends ParserRuleContext {
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
	 
		public VarDeclContext() { }
		public void copyFrom(VarDeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarDeclarationVarASTContext extends VarDeclContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(MiParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiParser.ID, i);
		}
		public TerminalNode POINTC() { return getToken(MiParser.POINTC, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MiParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MiParser.COMMA, i);
		}
		public VarDeclarationVarASTContext(VarDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).enterVarDeclarationVarAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).exitVarDeclarationVarAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitVarDeclarationVarAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varDecl);
		int _la;
		try {
			_localctx = new VarDeclarationVarASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			type();
			setState(67);
			match(ID);
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(68);
				match(COMMA);
				setState(69);
				match(ID);
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(75);
			match(POINTC);
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

	public static class ClassDeclContext extends ParserRuleContext {
		public ClassDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDecl; }
	 
		public ClassDeclContext() { }
		public void copyFrom(ClassDeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ClassDeclarationClassASTContext extends ClassDeclContext {
		public TerminalNode CLASS() { return getToken(MiParser.CLASS, 0); }
		public TerminalNode ID() { return getToken(MiParser.ID, 0); }
		public TerminalNode KEYL() { return getToken(MiParser.KEYL, 0); }
		public TerminalNode KEYR() { return getToken(MiParser.KEYR, 0); }
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public ClassDeclarationClassASTContext(ClassDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).enterClassDeclarationClassAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).exitClassDeclarationClassAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitClassDeclarationClassAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclContext classDecl() throws RecognitionException {
		ClassDeclContext _localctx = new ClassDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classDecl);
		int _la;
		try {
			_localctx = new ClassDeclarationClassASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(CLASS);
			setState(78);
			match(ID);
			setState(79);
			match(KEYL);
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(80);
				varDecl();
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(86);
			match(KEYR);
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

	public static class MethodDeclContext extends ParserRuleContext {
		public MethodDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDecl; }
	 
		public MethodDeclContext() { }
		public void copyFrom(MethodDeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MethodDeclarationASTContext extends MethodDeclContext {
		public TerminalNode ID() { return getToken(MiParser.ID, 0); }
		public TerminalNode PARENTL() { return getToken(MiParser.PARENTL, 0); }
		public TerminalNode PARENTR() { return getToken(MiParser.PARENTR, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(MiParser.VOID, 0); }
		public FormParsContext formPars() {
			return getRuleContext(FormParsContext.class,0);
		}
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public MethodDeclarationASTContext(MethodDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).enterMethodDeclarationAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).exitMethodDeclarationAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitMethodDeclarationAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclContext methodDecl() throws RecognitionException {
		MethodDeclContext _localctx = new MethodDeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_methodDecl);
		int _la;
		try {
			_localctx = new MethodDeclarationASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(88);
				type();
				}
				break;
			case VOID:
				{
				setState(89);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(92);
			match(ID);
			setState(93);
			match(PARENTL);
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(94);
				formPars();
				}
			}

			setState(97);
			match(PARENTR);
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(98);
				varDecl();
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(104);
			block();
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

	public static class FormParsContext extends ParserRuleContext {
		public FormParsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formPars; }
	 
		public FormParsContext() { }
		public void copyFrom(FormParsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FormParsASTContext extends FormParsContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(MiParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MiParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MiParser.COMMA, i);
		}
		public FormParsASTContext(FormParsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).enterFormParsAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).exitFormParsAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitFormParsAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormParsContext formPars() throws RecognitionException {
		FormParsContext _localctx = new FormParsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_formPars);
		int _la;
		try {
			_localctx = new FormParsASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			type();
			setState(107);
			match(ID);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(108);
				match(COMMA);
				setState(109);
				type();
				setState(110);
				match(ID);
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TypeASTContext extends TypeContext {
		public TerminalNode ID() { return getToken(MiParser.ID, 0); }
		public TerminalNode SBL() { return getToken(MiParser.SBL, 0); }
		public TerminalNode SBR() { return getToken(MiParser.SBR, 0); }
		public TypeASTContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).enterTypeAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).exitTypeAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitTypeAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_type);
		int _la;
		try {
			_localctx = new TypeASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(ID);
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SBL) {
				{
				setState(118);
				match(SBL);
				setState(119);
				match(SBR);
				}
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhileASTContext extends StatementContext {
		public TerminalNode WHILE() { return getToken(MiParser.WHILE, 0); }
		public TerminalNode PARENTL() { return getToken(MiParser.PARENTL, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode PARENTR() { return getToken(MiParser.PARENTR, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).enterWhileAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).exitWhileAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitWhileAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnASTContext extends StatementContext {
		public TerminalNode RETURN() { return getToken(MiParser.RETURN, 0); }
		public TerminalNode POINTC() { return getToken(MiParser.POINTC, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).enterReturnAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).exitReturnAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitReturnAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfASTContext extends StatementContext {
		public TerminalNode IF() { return getToken(MiParser.IF, 0); }
		public TerminalNode PARENTL() { return getToken(MiParser.PARENTL, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode PARENTR() { return getToken(MiParser.PARENTR, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(MiParser.ELSE, 0); }
		public IfASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).enterIfAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).exitIfAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitIfAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WriteASTContext extends StatementContext {
		public TerminalNode WRITE() { return getToken(MiParser.WRITE, 0); }
		public TerminalNode PARENTL() { return getToken(MiParser.PARENTL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PARENTR() { return getToken(MiParser.PARENTR, 0); }
		public TerminalNode POINTC() { return getToken(MiParser.POINTC, 0); }
		public TerminalNode COMMA() { return getToken(MiParser.COMMA, 0); }
		public TerminalNode NUM() { return getToken(MiParser.NUM, 0); }
		public WriteASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).enterWriteAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).exitWriteAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitWriteAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForASTContext extends StatementContext {
		public TerminalNode FOR() { return getToken(MiParser.FOR, 0); }
		public TerminalNode PARENTL() { return getToken(MiParser.PARENTL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> POINTC() { return getTokens(MiParser.POINTC); }
		public TerminalNode POINTC(int i) {
			return getToken(MiParser.POINTC, i);
		}
		public TerminalNode PARENTR() { return getToken(MiParser.PARENTR, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ForASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).enterForAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).exitForAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitForAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlockStatementASTContext extends StatementContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlockStatementASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).enterBlockStatementAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).exitBlockStatementAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitBlockStatementAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PcASTContext extends StatementContext {
		public TerminalNode POINTC() { return getToken(MiParser.POINTC, 0); }
		public PcASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).enterPcAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).exitPcAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitPcAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BreakASTContext extends StatementContext {
		public TerminalNode BREAK() { return getToken(MiParser.BREAK, 0); }
		public TerminalNode POINTC() { return getToken(MiParser.POINTC, 0); }
		public BreakASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).enterBreakAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).exitBreakAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitBreakAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReadASTContext extends StatementContext {
		public TerminalNode READ() { return getToken(MiParser.READ, 0); }
		public TerminalNode PARENTL() { return getToken(MiParser.PARENTL, 0); }
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public TerminalNode PARENTR() { return getToken(MiParser.PARENTR, 0); }
		public TerminalNode POINTC() { return getToken(MiParser.POINTC, 0); }
		public ReadASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).enterReadAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).exitReadAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitReadAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DesignatorStatementASTContext extends StatementContext {
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public TerminalNode POINTC() { return getToken(MiParser.POINTC, 0); }
		public TerminalNode EQUALS() { return getToken(MiParser.EQUALS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PARENTL() { return getToken(MiParser.PARENTL, 0); }
		public TerminalNode PARENTR() { return getToken(MiParser.PARENTR, 0); }
		public TerminalNode PP() { return getToken(MiParser.PP, 0); }
		public TerminalNode SS() { return getToken(MiParser.SS, 0); }
		public ActParsContext actPars() {
			return getRuleContext(ActParsContext.class,0);
		}
		public DesignatorStatementASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).enterDesignatorStatementAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).exitDesignatorStatementAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitDesignatorStatementAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		int _la;
		try {
			setState(190);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new DesignatorStatementASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				designator();
				setState(132);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EQUALS:
					{
					setState(123);
					match(EQUALS);
					setState(124);
					expr();
					}
					break;
				case PARENTL:
					{
					setState(125);
					match(PARENTL);
					setState(127);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PARENTL) | (1L << NEW) | (1L << SUB) | (1L << TRUE) | (1L << FALSE) | (1L << ID) | (1L << NUM) | (1L << CHAR_CONST))) != 0)) {
						{
						setState(126);
						actPars();
						}
					}

					setState(129);
					match(PARENTR);
					}
					break;
				case PP:
					{
					setState(130);
					match(PP);
					}
					break;
				case SS:
					{
					setState(131);
					match(SS);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(134);
				match(POINTC);
				}
				break;
			case IF:
				_localctx = new IfASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				match(IF);
				setState(137);
				match(PARENTL);
				setState(138);
				condition();
				setState(139);
				match(PARENTR);
				setState(140);
				statement();
				setState(143);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(141);
					match(ELSE);
					setState(142);
					statement();
					}
					break;
				}
				}
				break;
			case FOR:
				_localctx = new ForASTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(145);
				match(FOR);
				setState(146);
				match(PARENTL);
				setState(147);
				expr();
				setState(148);
				match(POINTC);
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PARENTL) | (1L << NEW) | (1L << SUB) | (1L << TRUE) | (1L << FALSE) | (1L << ID) | (1L << NUM) | (1L << CHAR_CONST))) != 0)) {
					{
					setState(149);
					condition();
					}
				}

				setState(152);
				match(POINTC);
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << POINTC) | (1L << KEYL) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << BREAK) | (1L << RETURN) | (1L << READ) | (1L << WRITE) | (1L << ID))) != 0)) {
					{
					setState(153);
					statement();
					}
				}

				setState(156);
				match(PARENTR);
				setState(157);
				statement();
				}
				break;
			case WHILE:
				_localctx = new WhileASTContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(159);
				match(WHILE);
				setState(160);
				match(PARENTL);
				setState(161);
				condition();
				setState(162);
				match(PARENTR);
				setState(163);
				statement();
				}
				break;
			case BREAK:
				_localctx = new BreakASTContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(165);
				match(BREAK);
				setState(166);
				match(POINTC);
				}
				break;
			case RETURN:
				_localctx = new ReturnASTContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(167);
				match(RETURN);
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PARENTL) | (1L << NEW) | (1L << SUB) | (1L << TRUE) | (1L << FALSE) | (1L << ID) | (1L << NUM) | (1L << CHAR_CONST))) != 0)) {
					{
					setState(168);
					expr();
					}
				}

				setState(171);
				match(POINTC);
				}
				break;
			case READ:
				_localctx = new ReadASTContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(172);
				match(READ);
				setState(173);
				match(PARENTL);
				setState(174);
				designator();
				setState(175);
				match(PARENTR);
				setState(176);
				match(POINTC);
				}
				break;
			case WRITE:
				_localctx = new WriteASTContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(178);
				match(WRITE);
				setState(179);
				match(PARENTL);
				setState(180);
				expr();
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(181);
					match(COMMA);
					setState(182);
					match(NUM);
					}
				}

				setState(185);
				match(PARENTR);
				setState(186);
				match(POINTC);
				}
				break;
			case KEYL:
				_localctx = new BlockStatementASTContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(188);
				block();
				}
				break;
			case POINTC:
				_localctx = new PcASTContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(189);
				match(POINTC);
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

	public static class BlockContext extends ParserRuleContext {
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	 
		public BlockContext() { }
		public void copyFrom(BlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BlocASTContext extends BlockContext {
		public TerminalNode KEYL() { return getToken(MiParser.KEYL, 0); }
		public TerminalNode KEYR() { return getToken(MiParser.KEYR, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlocASTContext(BlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).enterBlocAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).exitBlocAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitBlocAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_block);
		int _la;
		try {
			_localctx = new BlocASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(KEYL);
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << POINTC) | (1L << KEYL) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << BREAK) | (1L << RETURN) | (1L << READ) | (1L << WRITE) | (1L << ID))) != 0)) {
				{
				{
				setState(193);
				statement();
				}
				}
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(199);
			match(KEYR);
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

	public static class ActParsContext extends ParserRuleContext {
		public ActParsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actPars; }
	 
		public ActParsContext() { }
		public void copyFrom(ActParsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ActParsASTContext extends ActParsContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MiParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MiParser.COMMA, i);
		}
		public ActParsASTContext(ActParsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).enterActParsAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).exitActParsAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitActParsAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActParsContext actPars() throws RecognitionException {
		ActParsContext _localctx = new ActParsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_actPars);
		int _la;
		try {
			_localctx = new ActParsASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			expr();
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(202);
				match(COMMA);
				setState(203);
				expr();
				}
				}
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ConditionContext extends ParserRuleContext {
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	 
		public ConditionContext() { }
		public void copyFrom(ConditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConditionASTContext extends ConditionContext {
		public List<CondTermContext> condTerm() {
			return getRuleContexts(CondTermContext.class);
		}
		public CondTermContext condTerm(int i) {
			return getRuleContext(CondTermContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(MiParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(MiParser.OR, i);
		}
		public ConditionASTContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).enterConditionAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).exitConditionAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitConditionAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_condition);
		int _la;
		try {
			_localctx = new ConditionASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			condTerm();
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(210);
				match(OR);
				setState(211);
				condTerm();
				}
				}
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class CondTermContext extends ParserRuleContext {
		public CondTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condTerm; }
	 
		public CondTermContext() { }
		public void copyFrom(CondTermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CondTermASTContext extends CondTermContext {
		public List<CondFactContext> condFact() {
			return getRuleContexts(CondFactContext.class);
		}
		public CondFactContext condFact(int i) {
			return getRuleContext(CondFactContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(MiParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(MiParser.AND, i);
		}
		public CondTermASTContext(CondTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).enterCondTermAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).exitCondTermAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitCondTermAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondTermContext condTerm() throws RecognitionException {
		CondTermContext _localctx = new CondTermContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_condTerm);
		int _la;
		try {
			_localctx = new CondTermASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			condFact();
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(218);
				match(AND);
				setState(219);
				condFact();
				}
				}
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class CondFactContext extends ParserRuleContext {
		public CondFactContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condFact; }
	 
		public CondFactContext() { }
		public void copyFrom(CondFactContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CondFactASTContext extends CondFactContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public RelopContext relop() {
			return getRuleContext(RelopContext.class,0);
		}
		public CondFactASTContext(CondFactContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).enterCondFactAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).exitCondFactAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitCondFactAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondFactContext condFact() throws RecognitionException {
		CondFactContext _localctx = new CondFactContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_condFact);
		try {
			_localctx = new CondFactASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			expr();
			setState(226);
			relop();
			setState(227);
			expr();
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpressionASTContext extends ExprContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode SUB() { return getToken(MiParser.SUB, 0); }
		public List<AddopContext> addop() {
			return getRuleContexts(AddopContext.class);
		}
		public AddopContext addop(int i) {
			return getRuleContext(AddopContext.class,i);
		}
		public ExpressionASTContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).enterExpressionAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).exitExpressionAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitExpressionAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expr);
		int _la;
		try {
			_localctx = new ExpressionASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SUB) {
				{
				setState(229);
				match(SUB);
				}
			}

			setState(232);
			term();
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==SUB) {
				{
				{
				setState(233);
				addop();
				setState(234);
				term();
				}
				}
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class TermContext extends ParserRuleContext {
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TermAStContext extends TermContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<MulopContext> mulop() {
			return getRuleContexts(MulopContext.class);
		}
		public MulopContext mulop(int i) {
			return getRuleContext(MulopContext.class,i);
		}
		public TermAStContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).enterTermASt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).exitTermASt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitTermASt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_term);
		int _la;
		try {
			_localctx = new TermAStContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			factor();
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << DIV) | (1L << PERCENT))) != 0)) {
				{
				{
				setState(242);
				mulop();
				setState(243);
				factor();
				}
				}
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class FactorContext extends ParserRuleContext {
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	 
		public FactorContext() { }
		public void copyFrom(FactorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CharASTContext extends FactorContext {
		public TerminalNode CHAR_CONST() { return getToken(MiParser.CHAR_CONST, 0); }
		public CharASTContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).enterCharAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).exitCharAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitCharAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolASTContext extends FactorContext {
		public TerminalNode TRUE() { return getToken(MiParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(MiParser.FALSE, 0); }
		public BoolASTContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).enterBoolAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).exitBoolAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitBoolAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NewAASTContext extends FactorContext {
		public TerminalNode NEW() { return getToken(MiParser.NEW, 0); }
		public TerminalNode ID() { return getToken(MiParser.ID, 0); }
		public NewAASTContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).enterNewAAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).exitNewAAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitNewAAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumASTContext extends FactorContext {
		public TerminalNode NUM() { return getToken(MiParser.NUM, 0); }
		public NumASTContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).enterNumAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).exitNumAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitNumAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DesignatorFactorASTContext extends FactorContext {
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public TerminalNode PARENTL() { return getToken(MiParser.PARENTL, 0); }
		public TerminalNode PARENTR() { return getToken(MiParser.PARENTR, 0); }
		public ActParsContext actPars() {
			return getRuleContext(ActParsContext.class,0);
		}
		public DesignatorFactorASTContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).enterDesignatorFactorAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).exitDesignatorFactorAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitDesignatorFactorAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PepASTContext extends FactorContext {
		public TerminalNode PARENTL() { return getToken(MiParser.PARENTL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PARENTR() { return getToken(MiParser.PARENTR, 0); }
		public PepASTContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).enterPepAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).exitPepAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitPepAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_factor);
		int _la;
		try {
			setState(268);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new DesignatorFactorASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				designator();
				setState(257);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PARENTL:
					{
					setState(251);
					match(PARENTL);
					setState(253);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PARENTL) | (1L << NEW) | (1L << SUB) | (1L << TRUE) | (1L << FALSE) | (1L << ID) | (1L << NUM) | (1L << CHAR_CONST))) != 0)) {
						{
						setState(252);
						actPars();
						}
					}

					setState(255);
					match(PARENTR);
					}
					break;
				case COMMA:
				case POINTC:
				case PARENTR:
				case SBR:
				case OR:
				case AND:
				case EE:
				case DE:
				case LESS:
				case LE:
				case GREATER:
				case GE:
				case PLUS:
				case SUB:
				case MULT:
				case DIV:
				case PERCENT:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case NUM:
				_localctx = new NumASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				match(NUM);
				}
				break;
			case CHAR_CONST:
				_localctx = new CharASTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(260);
				match(CHAR_CONST);
				}
				break;
			case TRUE:
			case FALSE:
				_localctx = new BoolASTContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(261);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case NEW:
				_localctx = new NewAASTContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(262);
				match(NEW);
				setState(263);
				match(ID);
				}
				break;
			case PARENTL:
				_localctx = new PepASTContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(264);
				match(PARENTL);
				setState(265);
				expr();
				setState(266);
				match(PARENTR);
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

	public static class DesignatorContext extends ParserRuleContext {
		public DesignatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designator; }
	 
		public DesignatorContext() { }
		public void copyFrom(DesignatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DesignatorASTContext extends DesignatorContext {
		public List<TerminalNode> ID() { return getTokens(MiParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiParser.ID, i);
		}
		public List<TerminalNode> DOT() { return getTokens(MiParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(MiParser.DOT, i);
		}
		public List<TerminalNode> SBL() { return getTokens(MiParser.SBL); }
		public TerminalNode SBL(int i) {
			return getToken(MiParser.SBL, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> SBR() { return getTokens(MiParser.SBR); }
		public TerminalNode SBR(int i) {
			return getToken(MiParser.SBR, i);
		}
		public DesignatorASTContext(DesignatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).enterDesignatorAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).exitDesignatorAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitDesignatorAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DesignatorContext designator() throws RecognitionException {
		DesignatorContext _localctx = new DesignatorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_designator);
		int _la;
		try {
			_localctx = new DesignatorASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(ID);
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SBL || _la==DOT) {
				{
				setState(277);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DOT:
					{
					setState(271);
					match(DOT);
					setState(272);
					match(ID);
					}
					break;
				case SBL:
					{
					setState(273);
					match(SBL);
					setState(274);
					expr();
					setState(275);
					match(SBR);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class RelopContext extends ParserRuleContext {
		public RelopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relop; }
	 
		public RelopContext() { }
		public void copyFrom(RelopContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RelopDEASTContext extends RelopContext {
		public TerminalNode DE() { return getToken(MiParser.DE, 0); }
		public RelopDEASTContext(RelopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).enterRelopDEAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).exitRelopDEAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitRelopDEAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelopGEASTContext extends RelopContext {
		public TerminalNode GE() { return getToken(MiParser.GE, 0); }
		public RelopGEASTContext(RelopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).enterRelopGEAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).exitRelopGEAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitRelopGEAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelopGREATERASTContext extends RelopContext {
		public TerminalNode GREATER() { return getToken(MiParser.GREATER, 0); }
		public RelopGREATERASTContext(RelopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).enterRelopGREATERAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).exitRelopGREATERAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitRelopGREATERAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelopEEASTContext extends RelopContext {
		public TerminalNode EE() { return getToken(MiParser.EE, 0); }
		public RelopEEASTContext(RelopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).enterRelopEEAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).exitRelopEEAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitRelopEEAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelopLEASTContext extends RelopContext {
		public TerminalNode LE() { return getToken(MiParser.LE, 0); }
		public RelopLEASTContext(RelopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).enterRelopLEAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).exitRelopLEAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitRelopLEAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelopLESSASTContext extends RelopContext {
		public TerminalNode LESS() { return getToken(MiParser.LESS, 0); }
		public RelopLESSASTContext(RelopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).enterRelopLESSAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).exitRelopLESSAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitRelopLESSAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelopContext relop() throws RecognitionException {
		RelopContext _localctx = new RelopContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_relop);
		try {
			setState(288);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EE:
				_localctx = new RelopEEASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				match(EE);
				}
				break;
			case DE:
				_localctx = new RelopDEASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				match(DE);
				}
				break;
			case GREATER:
				_localctx = new RelopGREATERASTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(284);
				match(GREATER);
				}
				break;
			case GE:
				_localctx = new RelopGEASTContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(285);
				match(GE);
				}
				break;
			case LESS:
				_localctx = new RelopLESSASTContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(286);
				match(LESS);
				}
				break;
			case LE:
				_localctx = new RelopLEASTContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(287);
				match(LE);
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

	public static class AddopContext extends ParserRuleContext {
		public AddopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addop; }
	 
		public AddopContext() { }
		public void copyFrom(AddopContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AddopPLUSASTContext extends AddopContext {
		public TerminalNode PLUS() { return getToken(MiParser.PLUS, 0); }
		public AddopPLUSASTContext(AddopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).enterAddopPLUSAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).exitAddopPLUSAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitAddopPLUSAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddopSUBASTContext extends AddopContext {
		public TerminalNode SUB() { return getToken(MiParser.SUB, 0); }
		public AddopSUBASTContext(AddopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).enterAddopSUBAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).exitAddopSUBAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitAddopSUBAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddopContext addop() throws RecognitionException {
		AddopContext _localctx = new AddopContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_addop);
		try {
			setState(292);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				_localctx = new AddopPLUSASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
				match(PLUS);
				}
				break;
			case SUB:
				_localctx = new AddopSUBASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(291);
				match(SUB);
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

	public static class MulopContext extends ParserRuleContext {
		public MulopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulop; }
	 
		public MulopContext() { }
		public void copyFrom(MulopContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MulopDIVASTContext extends MulopContext {
		public TerminalNode DIV() { return getToken(MiParser.DIV, 0); }
		public MulopDIVASTContext(MulopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).enterMulopDIVAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).exitMulopDIVAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitMulopDIVAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulopMultASTContext extends MulopContext {
		public TerminalNode MULT() { return getToken(MiParser.MULT, 0); }
		public MulopMultASTContext(MulopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).enterMulopMultAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).exitMulopMultAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitMulopMultAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulopPERCENTASTContext extends MulopContext {
		public TerminalNode PERCENT() { return getToken(MiParser.PERCENT, 0); }
		public MulopPERCENTASTContext(MulopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).enterMulopPERCENTAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).exitMulopPERCENTAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitMulopPERCENTAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulopContext mulop() throws RecognitionException {
		MulopContext _localctx = new MulopContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_mulop);
		try {
			setState(297);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULT:
				_localctx = new MulopMultASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				match(MULT);
				}
				break;
			case DIV:
				_localctx = new MulopDIVASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(295);
				match(DIV);
				}
				break;
			case PERCENT:
				_localctx = new MulopPERCENTASTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(296);
				match(PERCENT);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u012e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\2\7\2\60\n\2\f\2\16\2"+
		"\63\13\2\3\2\3\2\7\2\67\n\2\f\2\16\2:\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\7\4I\n\4\f\4\16\4L\13\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\7\5T\n\5\f\5\16\5W\13\5\3\5\3\5\3\6\3\6\5\6]\n\6\3\6\3\6\3\6\5\6b\n"+
		"\6\3\6\3\6\7\6f\n\6\f\6\16\6i\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7"+
		"s\n\7\f\7\16\7v\13\7\3\b\3\b\3\b\5\b{\n\b\3\t\3\t\3\t\3\t\3\t\5\t\u0082"+
		"\n\t\3\t\3\t\3\t\5\t\u0087\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t"+
		"\u0092\n\t\3\t\3\t\3\t\3\t\3\t\5\t\u0099\n\t\3\t\3\t\5\t\u009d\n\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00ac\n\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00ba\n\t\3\t\3\t\3\t\3\t"+
		"\3\t\5\t\u00c1\n\t\3\n\3\n\7\n\u00c5\n\n\f\n\16\n\u00c8\13\n\3\n\3\n\3"+
		"\13\3\13\3\13\7\13\u00cf\n\13\f\13\16\13\u00d2\13\13\3\f\3\f\3\f\7\f\u00d7"+
		"\n\f\f\f\16\f\u00da\13\f\3\r\3\r\3\r\7\r\u00df\n\r\f\r\16\r\u00e2\13\r"+
		"\3\16\3\16\3\16\3\16\3\17\5\17\u00e9\n\17\3\17\3\17\3\17\3\17\7\17\u00ef"+
		"\n\17\f\17\16\17\u00f2\13\17\3\20\3\20\3\20\3\20\7\20\u00f8\n\20\f\20"+
		"\16\20\u00fb\13\20\3\21\3\21\3\21\5\21\u0100\n\21\3\21\3\21\5\21\u0104"+
		"\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u010f\n\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u0118\n\22\f\22\16\22\u011b\13\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0123\n\23\3\24\3\24\5\24\u0127\n"+
		"\24\3\25\3\25\3\25\5\25\u012c\n\25\3\25\2\2\26\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(\2\4\4\2++..\3\2()\2\u014e\2*\3\2\2\2\4=\3\2\2\2"+
		"\6D\3\2\2\2\bO\3\2\2\2\n\\\3\2\2\2\fl\3\2\2\2\16w\3\2\2\2\20\u00c0\3\2"+
		"\2\2\22\u00c2\3\2\2\2\24\u00cb\3\2\2\2\26\u00d3\3\2\2\2\30\u00db\3\2\2"+
		"\2\32\u00e3\3\2\2\2\34\u00e8\3\2\2\2\36\u00f3\3\2\2\2 \u010e\3\2\2\2\""+
		"\u0110\3\2\2\2$\u0122\3\2\2\2&\u0126\3\2\2\2(\u012b\3\2\2\2*+\7\24\2\2"+
		"+\61\7*\2\2,\60\5\4\3\2-\60\5\6\4\2.\60\5\b\5\2/,\3\2\2\2/-\3\2\2\2/."+
		"\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\64\3\2\2\2\63\61\3"+
		"\2\2\2\648\7\5\2\2\65\67\5\n\6\2\66\65\3\2\2\2\67:\3\2\2\28\66\3\2\2\2"+
		"89\3\2\2\29;\3\2\2\2:8\3\2\2\2;<\7\6\2\2<\3\3\2\2\2=>\7\25\2\2>?\5\16"+
		"\b\2?@\7*\2\2@A\7\34\2\2AB\t\2\2\2BC\7\4\2\2C\5\3\2\2\2DE\5\16\b\2EJ\7"+
		"*\2\2FG\7\3\2\2GI\7*\2\2HF\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2KM\3\2"+
		"\2\2LJ\3\2\2\2MN\7\4\2\2N\7\3\2\2\2OP\7\24\2\2PQ\7*\2\2QU\7\5\2\2RT\5"+
		"\6\4\2SR\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2VX\3\2\2\2WU\3\2\2\2XY\7"+
		"\6\2\2Y\t\3\2\2\2Z]\5\16\b\2[]\7\26\2\2\\Z\3\2\2\2\\[\3\2\2\2]^\3\2\2"+
		"\2^_\7*\2\2_a\7\7\2\2`b\5\f\7\2a`\3\2\2\2ab\3\2\2\2bc\3\2\2\2cg\7\b\2"+
		"\2df\5\6\4\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2hj\3\2\2\2ig\3\2\2"+
		"\2jk\5\22\n\2k\13\3\2\2\2lm\5\16\b\2mt\7*\2\2no\7\3\2\2op\5\16\b\2pq\7"+
		"*\2\2qs\3\2\2\2rn\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2u\r\3\2\2\2vt\3"+
		"\2\2\2wz\7*\2\2xy\7\t\2\2y{\7\n\2\2zx\3\2\2\2z{\3\2\2\2{\17\3\2\2\2|\u0086"+
		"\5\"\22\2}~\7\34\2\2~\u0087\5\34\17\2\177\u0081\7\7\2\2\u0080\u0082\5"+
		"\24\13\2\u0081\u0080\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\3\2\2\2\u0083"+
		"\u0087\7\b\2\2\u0084\u0087\7\32\2\2\u0085\u0087\7\33\2\2\u0086}\3\2\2"+
		"\2\u0086\177\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0085\3\2\2\2\u0087\u0088"+
		"\3\2\2\2\u0088\u0089\7\4\2\2\u0089\u00c1\3\2\2\2\u008a\u008b\7\f\2\2\u008b"+
		"\u008c\7\7\2\2\u008c\u008d\5\26\f\2\u008d\u008e\7\b\2\2\u008e\u0091\5"+
		"\20\t\2\u008f\u0090\7\r\2\2\u0090\u0092\5\20\t\2\u0091\u008f\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\u00c1\3\2\2\2\u0093\u0094\7\16\2\2\u0094\u0095\7"+
		"\7\2\2\u0095\u0096\5\34\17\2\u0096\u0098\7\4\2\2\u0097\u0099\5\26\f\2"+
		"\u0098\u0097\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009c"+
		"\7\4\2\2\u009b\u009d\5\20\t\2\u009c\u009b\3\2\2\2\u009c\u009d\3\2\2\2"+
		"\u009d\u009e\3\2\2\2\u009e\u009f\7\b\2\2\u009f\u00a0\5\20\t\2\u00a0\u00c1"+
		"\3\2\2\2\u00a1\u00a2\7\17\2\2\u00a2\u00a3\7\7\2\2\u00a3\u00a4\5\26\f\2"+
		"\u00a4\u00a5\7\b\2\2\u00a5\u00a6\5\20\t\2\u00a6\u00c1\3\2\2\2\u00a7\u00a8"+
		"\7\20\2\2\u00a8\u00c1\7\4\2\2\u00a9\u00ab\7\21\2\2\u00aa\u00ac\5\34\17"+
		"\2\u00ab\u00aa\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00c1"+
		"\7\4\2\2\u00ae\u00af\7\22\2\2\u00af\u00b0\7\7\2\2\u00b0\u00b1\5\"\22\2"+
		"\u00b1\u00b2\7\b\2\2\u00b2\u00b3\7\4\2\2\u00b3\u00c1\3\2\2\2\u00b4\u00b5"+
		"\7\23\2\2\u00b5\u00b6\7\7\2\2\u00b6\u00b9\5\34\17\2\u00b7\u00b8\7\3\2"+
		"\2\u00b8\u00ba\7+\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb"+
		"\3\2\2\2\u00bb\u00bc\7\b\2\2\u00bc\u00bd\7\4\2\2\u00bd\u00c1\3\2\2\2\u00be"+
		"\u00c1\5\22\n\2\u00bf\u00c1\7\4\2\2\u00c0|\3\2\2\2\u00c0\u008a\3\2\2\2"+
		"\u00c0\u0093\3\2\2\2\u00c0\u00a1\3\2\2\2\u00c0\u00a7\3\2\2\2\u00c0\u00a9"+
		"\3\2\2\2\u00c0\u00ae\3\2\2\2\u00c0\u00b4\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0"+
		"\u00bf\3\2\2\2\u00c1\21\3\2\2\2\u00c2\u00c6\7\5\2\2\u00c3\u00c5\5\20\t"+
		"\2\u00c4\u00c3\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7"+
		"\3\2\2\2\u00c7\u00c9\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00ca\7\6\2\2\u00ca"+
		"\23\3\2\2\2\u00cb\u00d0\5\34\17\2\u00cc\u00cd\7\3\2\2\u00cd\u00cf\5\34"+
		"\17\2\u00ce\u00cc\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0"+
		"\u00d1\3\2\2\2\u00d1\25\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d8\5\30\r"+
		"\2\u00d4\u00d5\7\30\2\2\u00d5\u00d7\5\30\r\2\u00d6\u00d4\3\2\2\2\u00d7"+
		"\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\27\3\2\2"+
		"\2\u00da\u00d8\3\2\2\2\u00db\u00e0\5\32\16\2\u00dc\u00dd\7\31\2\2\u00dd"+
		"\u00df\5\32\16\2\u00de\u00dc\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3"+
		"\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\31\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3"+
		"\u00e4\5\34\17\2\u00e4\u00e5\5$\23\2\u00e5\u00e6\5\34\17\2\u00e6\33\3"+
		"\2\2\2\u00e7\u00e9\7$\2\2\u00e8\u00e7\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9"+
		"\u00ea\3\2\2\2\u00ea\u00f0\5\36\20\2\u00eb\u00ec\5&\24\2\u00ec\u00ed\5"+
		"\36\20\2\u00ed\u00ef\3\2\2\2\u00ee\u00eb\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0"+
		"\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\35\3\2\2\2\u00f2\u00f0\3\2\2"+
		"\2\u00f3\u00f9\5 \21\2\u00f4\u00f5\5(\25\2\u00f5\u00f6\5 \21\2\u00f6\u00f8"+
		"\3\2\2\2\u00f7\u00f4\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9"+
		"\u00fa\3\2\2\2\u00fa\37\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc\u0103\5\"\22"+
		"\2\u00fd\u00ff\7\7\2\2\u00fe\u0100\5\24\13\2\u00ff\u00fe\3\2\2\2\u00ff"+
		"\u0100\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0104\7\b\2\2\u0102\u0104\3\2"+
		"\2\2\u0103\u00fd\3\2\2\2\u0103\u0102\3\2\2\2\u0104\u010f\3\2\2\2\u0105"+
		"\u010f\7+\2\2\u0106\u010f\7.\2\2\u0107\u010f\t\3\2\2\u0108\u0109\7\27"+
		"\2\2\u0109\u010f\7*\2\2\u010a\u010b\7\7\2\2\u010b\u010c\5\34\17\2\u010c"+
		"\u010d\7\b\2\2\u010d\u010f\3\2\2\2\u010e\u00fc\3\2\2\2\u010e\u0105\3\2"+
		"\2\2\u010e\u0106\3\2\2\2\u010e\u0107\3\2\2\2\u010e\u0108\3\2\2\2\u010e"+
		"\u010a\3\2\2\2\u010f!\3\2\2\2\u0110\u0119\7*\2\2\u0111\u0112\7\13\2\2"+
		"\u0112\u0118\7*\2\2\u0113\u0114\7\t\2\2\u0114\u0115\5\34\17\2\u0115\u0116"+
		"\7\n\2\2\u0116\u0118\3\2\2\2\u0117\u0111\3\2\2\2\u0117\u0113\3\2\2\2\u0118"+
		"\u011b\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a#\3\2\2\2"+
		"\u011b\u0119\3\2\2\2\u011c\u0123\7\35\2\2\u011d\u0123\7\36\2\2\u011e\u0123"+
		"\7!\2\2\u011f\u0123\7\"\2\2\u0120\u0123\7\37\2\2\u0121\u0123\7 \2\2\u0122"+
		"\u011c\3\2\2\2\u0122\u011d\3\2\2\2\u0122\u011e\3\2\2\2\u0122\u011f\3\2"+
		"\2\2\u0122\u0120\3\2\2\2\u0122\u0121\3\2\2\2\u0123%\3\2\2\2\u0124\u0127"+
		"\7#\2\2\u0125\u0127\7$\2\2\u0126\u0124\3\2\2\2\u0126\u0125\3\2\2\2\u0127"+
		"\'\3\2\2\2\u0128\u012c\7%\2\2\u0129\u012c\7&\2\2\u012a\u012c\7\'\2\2\u012b"+
		"\u0128\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012a\3\2\2\2\u012c)\3\2\2\2"+
		"#/\618JU\\agtz\u0081\u0086\u0091\u0098\u009c\u00ab\u00b9\u00c0\u00c6\u00d0"+
		"\u00d8\u00e0\u00e8\u00f0\u00f9\u00ff\u0103\u010e\u0117\u0119\u0122\u0126"+
		"\u012b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}