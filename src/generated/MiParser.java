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
		MULT=35, DIV=36, PERCENT=37, TRUE=38, FALSE=39, STRING=40, ID=41, NUM=42, 
		FLOAT=43, COMMENT=44, LINE_COMMENT=45, CHAR_CONST=46, WS=47;
	public static final int
		RULE_program = 0, RULE_declaration = 1, RULE_constDecl = 2, RULE_varDecl = 3, 
		RULE_classDecl = 4, RULE_methodDecl = 5, RULE_formPars = 6, RULE_type = 7, 
		RULE_statement = 8, RULE_block = 9, RULE_actPars = 10, RULE_condition = 11, 
		RULE_condTerm = 12, RULE_condFact = 13, RULE_expr = 14, RULE_term = 15, 
		RULE_factor = 16, RULE_designator = 17, RULE_relop = 18, RULE_addop = 19, 
		RULE_mulop = 20;
	public static final String[] ruleNames = {
		"program", "declaration", "constDecl", "varDecl", "classDecl", "methodDecl", 
		"formPars", "type", "statement", "block", "actPars", "condition", "condTerm", 
		"condFact", "expr", "term", "factor", "designator", "relop", "addop", 
		"mulop"
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
		"PERCENT", "TRUE", "FALSE", "STRING", "ID", "NUM", "FLOAT", "COMMENT", 
		"LINE_COMMENT", "CHAR_CONST", "WS"
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
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
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
			setState(42);
			match(CLASS);
			setState(43);
			match(ID);
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << CONST) | (1L << ID))) != 0)) {
				{
				{
				setState(44);
				declaration();
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

	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	 
		public DeclarationContext() { }
		public void copyFrom(DeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConstDeclASTContext extends DeclarationContext {
		public ConstDeclContext constDecl() {
			return getRuleContext(ConstDeclContext.class,0);
		}
		public ConstDeclASTContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).enterConstDeclAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).exitConstDeclAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitConstDeclAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarDeclASTContext extends DeclarationContext {
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public VarDeclASTContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).enterVarDeclAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).exitVarDeclAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitVarDeclAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ClassDeclASTContext extends DeclarationContext {
		public ClassDeclContext classDecl() {
			return getRuleContext(ClassDeclContext.class,0);
		}
		public ClassDeclASTContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).enterClassDeclAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).exitClassDeclAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitClassDeclAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration);
		try {
			setState(62);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				_localctx = new ConstDeclASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				constDecl();
				}
				break;
			case ID:
				_localctx = new VarDeclASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				varDecl();
				}
				break;
			case CLASS:
				_localctx = new ClassDeclASTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(61);
				classDecl();
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
		enterRule(_localctx, 4, RULE_constDecl);
		int _la;
		try {
			_localctx = new ConstDeclarationNumCharASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(CONST);
			setState(65);
			type();
			setState(66);
			match(ID);
			setState(67);
			match(EQUALS);
			setState(68);
			_la = _input.LA(1);
			if ( !(_la==NUM || _la==CHAR_CONST) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(69);
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
		enterRule(_localctx, 6, RULE_varDecl);
		int _la;
		try {
			_localctx = new VarDeclarationVarASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			type();
			setState(72);
			match(ID);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(73);
				match(COMMA);
				setState(74);
				match(ID);
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
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
		enterRule(_localctx, 8, RULE_classDecl);
		int _la;
		try {
			_localctx = new ClassDeclarationClassASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(CLASS);
			setState(83);
			match(ID);
			setState(84);
			match(KEYL);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(85);
				varDecl();
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(91);
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
		enterRule(_localctx, 10, RULE_methodDecl);
		int _la;
		try {
			_localctx = new MethodDeclarationASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(93);
				type();
				}
				break;
			case VOID:
				{
				setState(94);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(97);
			match(ID);
			setState(98);
			match(PARENTL);
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(99);
				formPars();
				}
			}

			setState(102);
			match(PARENTR);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(103);
				varDecl();
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(109);
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
		enterRule(_localctx, 12, RULE_formPars);
		int _la;
		try {
			_localctx = new FormParsASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			type();
			setState(112);
			match(ID);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(113);
				match(COMMA);
				setState(114);
				type();
				setState(115);
				match(ID);
				}
				}
				setState(121);
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
		enterRule(_localctx, 14, RULE_type);
		int _la;
		try {
			_localctx = new TypeASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(ID);
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SBL) {
				{
				setState(123);
				match(SBL);
				setState(124);
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
		enterRule(_localctx, 16, RULE_statement);
		int _la;
		try {
			setState(195);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new DesignatorStatementASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				designator();
				setState(137);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EQUALS:
					{
					setState(128);
					match(EQUALS);
					setState(129);
					expr();
					}
					break;
				case PARENTL:
					{
					setState(130);
					match(PARENTL);
					setState(132);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PARENTL) | (1L << NEW) | (1L << SUB) | (1L << TRUE) | (1L << FALSE) | (1L << STRING) | (1L << ID) | (1L << NUM) | (1L << FLOAT) | (1L << CHAR_CONST))) != 0)) {
						{
						setState(131);
						actPars();
						}
					}

					setState(134);
					match(PARENTR);
					}
					break;
				case PP:
					{
					setState(135);
					match(PP);
					}
					break;
				case SS:
					{
					setState(136);
					match(SS);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(139);
				match(POINTC);
				}
				break;
			case IF:
				_localctx = new IfASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				match(IF);
				setState(142);
				match(PARENTL);
				setState(143);
				condition();
				setState(144);
				match(PARENTR);
				setState(145);
				statement();
				setState(148);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(146);
					match(ELSE);
					setState(147);
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
				setState(150);
				match(FOR);
				setState(151);
				match(PARENTL);
				setState(152);
				expr();
				setState(153);
				match(POINTC);
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PARENTL) | (1L << NEW) | (1L << SUB) | (1L << TRUE) | (1L << FALSE) | (1L << STRING) | (1L << ID) | (1L << NUM) | (1L << FLOAT) | (1L << CHAR_CONST))) != 0)) {
					{
					setState(154);
					condition();
					}
				}

				setState(157);
				match(POINTC);
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << POINTC) | (1L << KEYL) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << BREAK) | (1L << RETURN) | (1L << READ) | (1L << WRITE) | (1L << ID))) != 0)) {
					{
					setState(158);
					statement();
					}
				}

				setState(161);
				match(PARENTR);
				setState(162);
				statement();
				}
				break;
			case WHILE:
				_localctx = new WhileASTContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(164);
				match(WHILE);
				setState(165);
				match(PARENTL);
				setState(166);
				condition();
				setState(167);
				match(PARENTR);
				setState(168);
				statement();
				}
				break;
			case BREAK:
				_localctx = new BreakASTContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(170);
				match(BREAK);
				setState(171);
				match(POINTC);
				}
				break;
			case RETURN:
				_localctx = new ReturnASTContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(172);
				match(RETURN);
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PARENTL) | (1L << NEW) | (1L << SUB) | (1L << TRUE) | (1L << FALSE) | (1L << STRING) | (1L << ID) | (1L << NUM) | (1L << FLOAT) | (1L << CHAR_CONST))) != 0)) {
					{
					setState(173);
					expr();
					}
				}

				setState(176);
				match(POINTC);
				}
				break;
			case READ:
				_localctx = new ReadASTContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(177);
				match(READ);
				setState(178);
				match(PARENTL);
				setState(179);
				designator();
				setState(180);
				match(PARENTR);
				setState(181);
				match(POINTC);
				}
				break;
			case WRITE:
				_localctx = new WriteASTContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(183);
				match(WRITE);
				setState(184);
				match(PARENTL);
				setState(185);
				expr();
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(186);
					match(COMMA);
					setState(187);
					match(NUM);
					}
				}

				setState(190);
				match(PARENTR);
				setState(191);
				match(POINTC);
				}
				break;
			case KEYL:
				_localctx = new BlockStatementASTContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(193);
				block();
				}
				break;
			case POINTC:
				_localctx = new PcASTContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(194);
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
		enterRule(_localctx, 18, RULE_block);
		int _la;
		try {
			_localctx = new BlocASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(KEYL);
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << POINTC) | (1L << KEYL) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << BREAK) | (1L << RETURN) | (1L << READ) | (1L << WRITE) | (1L << ID))) != 0)) {
				{
				{
				setState(198);
				statement();
				}
				}
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(204);
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
		enterRule(_localctx, 20, RULE_actPars);
		int _la;
		try {
			_localctx = new ActParsASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			expr();
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(207);
				match(COMMA);
				setState(208);
				expr();
				}
				}
				setState(213);
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
		enterRule(_localctx, 22, RULE_condition);
		int _la;
		try {
			_localctx = new ConditionASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			condTerm();
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(215);
				match(OR);
				setState(216);
				condTerm();
				}
				}
				setState(221);
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
		enterRule(_localctx, 24, RULE_condTerm);
		int _la;
		try {
			_localctx = new CondTermASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			condFact();
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(223);
				match(AND);
				setState(224);
				condFact();
				}
				}
				setState(229);
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
		enterRule(_localctx, 26, RULE_condFact);
		try {
			_localctx = new CondFactASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			expr();
			setState(231);
			relop();
			setState(232);
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
		enterRule(_localctx, 28, RULE_expr);
		int _la;
		try {
			_localctx = new ExpressionASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SUB) {
				{
				setState(234);
				match(SUB);
				}
			}

			setState(237);
			term();
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==SUB) {
				{
				{
				setState(238);
				addop();
				setState(239);
				term();
				}
				}
				setState(245);
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
		enterRule(_localctx, 30, RULE_term);
		int _la;
		try {
			_localctx = new TermAStContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			factor();
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << DIV) | (1L << PERCENT))) != 0)) {
				{
				{
				setState(247);
				mulop();
				setState(248);
				factor();
				}
				}
				setState(254);
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
	public static class StringContext extends FactorContext {
		public TerminalNode STRING() { return getToken(MiParser.STRING, 0); }
		public StringContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitString(this);
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
	public static class FloatASTContext extends FactorContext {
		public TerminalNode FLOAT() { return getToken(MiParser.FLOAT, 0); }
		public FloatASTContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).enterFloatAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiParserListener ) ((MiParserListener)listener).exitFloatAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitFloatAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_factor);
		int _la;
		try {
			setState(275);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new DesignatorFactorASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				designator();
				setState(262);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PARENTL:
					{
					setState(256);
					match(PARENTL);
					setState(258);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PARENTL) | (1L << NEW) | (1L << SUB) | (1L << TRUE) | (1L << FALSE) | (1L << STRING) | (1L << ID) | (1L << NUM) | (1L << FLOAT) | (1L << CHAR_CONST))) != 0)) {
						{
						setState(257);
						actPars();
						}
					}

					setState(260);
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
				setState(264);
				match(NUM);
				}
				break;
			case FLOAT:
				_localctx = new FloatASTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(265);
				match(FLOAT);
				}
				break;
			case STRING:
				_localctx = new StringContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(266);
				match(STRING);
				}
				break;
			case CHAR_CONST:
				_localctx = new CharASTContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(267);
				match(CHAR_CONST);
				}
				break;
			case TRUE:
			case FALSE:
				_localctx = new BoolASTContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(268);
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
				enterOuterAlt(_localctx, 7);
				{
				setState(269);
				match(NEW);
				setState(270);
				match(ID);
				}
				break;
			case PARENTL:
				_localctx = new PepASTContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(271);
				match(PARENTL);
				setState(272);
				expr();
				setState(273);
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
		enterRule(_localctx, 34, RULE_designator);
		int _la;
		try {
			_localctx = new DesignatorASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(ID);
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SBL || _la==DOT) {
				{
				setState(284);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DOT:
					{
					setState(278);
					match(DOT);
					setState(279);
					match(ID);
					}
					break;
				case SBL:
					{
					setState(280);
					match(SBL);
					setState(281);
					expr();
					setState(282);
					match(SBR);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(288);
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
		enterRule(_localctx, 36, RULE_relop);
		try {
			setState(295);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EE:
				_localctx = new RelopEEASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
				match(EE);
				}
				break;
			case DE:
				_localctx = new RelopDEASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				match(DE);
				}
				break;
			case GREATER:
				_localctx = new RelopGREATERASTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(291);
				match(GREATER);
				}
				break;
			case GE:
				_localctx = new RelopGEASTContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(292);
				match(GE);
				}
				break;
			case LESS:
				_localctx = new RelopLESSASTContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(293);
				match(LESS);
				}
				break;
			case LE:
				_localctx = new RelopLEASTContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(294);
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
		enterRule(_localctx, 38, RULE_addop);
		try {
			setState(299);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				_localctx = new AddopPLUSASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				match(PLUS);
				}
				break;
			case SUB:
				_localctx = new AddopSUBASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
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
		enterRule(_localctx, 40, RULE_mulop);
		try {
			setState(304);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULT:
				_localctx = new MulopMultASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(301);
				match(MULT);
				}
				break;
			case DIV:
				_localctx = new MulopDIVASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(302);
				match(DIV);
				}
				break;
			case PERCENT:
				_localctx = new MulopPERCENTASTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(303);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u0135\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\7\2\60\n\2\f\2\16"+
		"\2\63\13\2\3\2\3\2\7\2\67\n\2\f\2\16\2:\13\2\3\2\3\2\3\3\3\3\3\3\5\3A"+
		"\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5N\n\5\f\5\16\5Q\13"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6Y\n\6\f\6\16\6\\\13\6\3\6\3\6\3\7\3\7\5"+
		"\7b\n\7\3\7\3\7\3\7\5\7g\n\7\3\7\3\7\7\7k\n\7\f\7\16\7n\13\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\7\bx\n\b\f\b\16\b{\13\b\3\t\3\t\3\t\5\t\u0080\n"+
		"\t\3\n\3\n\3\n\3\n\3\n\5\n\u0087\n\n\3\n\3\n\3\n\5\n\u008c\n\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0097\n\n\3\n\3\n\3\n\3\n\3\n\5\n\u009e"+
		"\n\n\3\n\3\n\5\n\u00a2\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\5\n\u00b1\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\5\n\u00bf\n\n\3\n\3\n\3\n\3\n\3\n\5\n\u00c6\n\n\3\13\3\13\7\13\u00ca"+
		"\n\13\f\13\16\13\u00cd\13\13\3\13\3\13\3\f\3\f\3\f\7\f\u00d4\n\f\f\f\16"+
		"\f\u00d7\13\f\3\r\3\r\3\r\7\r\u00dc\n\r\f\r\16\r\u00df\13\r\3\16\3\16"+
		"\3\16\7\16\u00e4\n\16\f\16\16\16\u00e7\13\16\3\17\3\17\3\17\3\17\3\20"+
		"\5\20\u00ee\n\20\3\20\3\20\3\20\3\20\7\20\u00f4\n\20\f\20\16\20\u00f7"+
		"\13\20\3\21\3\21\3\21\3\21\7\21\u00fd\n\21\f\21\16\21\u0100\13\21\3\22"+
		"\3\22\3\22\5\22\u0105\n\22\3\22\3\22\5\22\u0109\n\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0116\n\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\7\23\u011f\n\23\f\23\16\23\u0122\13\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\5\24\u012a\n\24\3\25\3\25\5\25\u012e\n\25\3\26\3"+
		"\26\3\26\5\26\u0133\n\26\3\26\2\2\27\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*\2\4\4\2,,\60\60\3\2()\2\u0156\2,\3\2\2\2\4@\3\2\2\2\6B\3"+
		"\2\2\2\bI\3\2\2\2\nT\3\2\2\2\fa\3\2\2\2\16q\3\2\2\2\20|\3\2\2\2\22\u00c5"+
		"\3\2\2\2\24\u00c7\3\2\2\2\26\u00d0\3\2\2\2\30\u00d8\3\2\2\2\32\u00e0\3"+
		"\2\2\2\34\u00e8\3\2\2\2\36\u00ed\3\2\2\2 \u00f8\3\2\2\2\"\u0115\3\2\2"+
		"\2$\u0117\3\2\2\2&\u0129\3\2\2\2(\u012d\3\2\2\2*\u0132\3\2\2\2,-\7\24"+
		"\2\2-\61\7+\2\2.\60\5\4\3\2/.\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62"+
		"\3\2\2\2\62\64\3\2\2\2\63\61\3\2\2\2\648\7\5\2\2\65\67\5\f\7\2\66\65\3"+
		"\2\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29;\3\2\2\2:8\3\2\2\2;<\7\6\2\2"+
		"<\3\3\2\2\2=A\5\6\4\2>A\5\b\5\2?A\5\n\6\2@=\3\2\2\2@>\3\2\2\2@?\3\2\2"+
		"\2A\5\3\2\2\2BC\7\25\2\2CD\5\20\t\2DE\7+\2\2EF\7\34\2\2FG\t\2\2\2GH\7"+
		"\4\2\2H\7\3\2\2\2IJ\5\20\t\2JO\7+\2\2KL\7\3\2\2LN\7+\2\2MK\3\2\2\2NQ\3"+
		"\2\2\2OM\3\2\2\2OP\3\2\2\2PR\3\2\2\2QO\3\2\2\2RS\7\4\2\2S\t\3\2\2\2TU"+
		"\7\24\2\2UV\7+\2\2VZ\7\5\2\2WY\5\b\5\2XW\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2"+
		"Z[\3\2\2\2[]\3\2\2\2\\Z\3\2\2\2]^\7\6\2\2^\13\3\2\2\2_b\5\20\t\2`b\7\26"+
		"\2\2a_\3\2\2\2a`\3\2\2\2bc\3\2\2\2cd\7+\2\2df\7\7\2\2eg\5\16\b\2fe\3\2"+
		"\2\2fg\3\2\2\2gh\3\2\2\2hl\7\b\2\2ik\5\b\5\2ji\3\2\2\2kn\3\2\2\2lj\3\2"+
		"\2\2lm\3\2\2\2mo\3\2\2\2nl\3\2\2\2op\5\24\13\2p\r\3\2\2\2qr\5\20\t\2r"+
		"y\7+\2\2st\7\3\2\2tu\5\20\t\2uv\7+\2\2vx\3\2\2\2ws\3\2\2\2x{\3\2\2\2y"+
		"w\3\2\2\2yz\3\2\2\2z\17\3\2\2\2{y\3\2\2\2|\177\7+\2\2}~\7\t\2\2~\u0080"+
		"\7\n\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\21\3\2\2\2\u0081\u008b\5"+
		"$\23\2\u0082\u0083\7\34\2\2\u0083\u008c\5\36\20\2\u0084\u0086\7\7\2\2"+
		"\u0085\u0087\5\26\f\2\u0086\u0085\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088"+
		"\3\2\2\2\u0088\u008c\7\b\2\2\u0089\u008c\7\32\2\2\u008a\u008c\7\33\2\2"+
		"\u008b\u0082\3\2\2\2\u008b\u0084\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008a"+
		"\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\7\4\2\2\u008e\u00c6\3\2\2\2\u008f"+
		"\u0090\7\f\2\2\u0090\u0091\7\7\2\2\u0091\u0092\5\30\r\2\u0092\u0093\7"+
		"\b\2\2\u0093\u0096\5\22\n\2\u0094\u0095\7\r\2\2\u0095\u0097\5\22\n\2\u0096"+
		"\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u00c6\3\2\2\2\u0098\u0099\7\16"+
		"\2\2\u0099\u009a\7\7\2\2\u009a\u009b\5\36\20\2\u009b\u009d\7\4\2\2\u009c"+
		"\u009e\5\30\r\2\u009d\u009c\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\3"+
		"\2\2\2\u009f\u00a1\7\4\2\2\u00a0\u00a2\5\22\n\2\u00a1\u00a0\3\2\2\2\u00a1"+
		"\u00a2\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\7\b\2\2\u00a4\u00a5\5\22"+
		"\n\2\u00a5\u00c6\3\2\2\2\u00a6\u00a7\7\17\2\2\u00a7\u00a8\7\7\2\2\u00a8"+
		"\u00a9\5\30\r\2\u00a9\u00aa\7\b\2\2\u00aa\u00ab\5\22\n\2\u00ab\u00c6\3"+
		"\2\2\2\u00ac\u00ad\7\20\2\2\u00ad\u00c6\7\4\2\2\u00ae\u00b0\7\21\2\2\u00af"+
		"\u00b1\5\36\20\2\u00b0\u00af\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\3"+
		"\2\2\2\u00b2\u00c6\7\4\2\2\u00b3\u00b4\7\22\2\2\u00b4\u00b5\7\7\2\2\u00b5"+
		"\u00b6\5$\23\2\u00b6\u00b7\7\b\2\2\u00b7\u00b8\7\4\2\2\u00b8\u00c6\3\2"+
		"\2\2\u00b9\u00ba\7\23\2\2\u00ba\u00bb\7\7\2\2\u00bb\u00be\5\36\20\2\u00bc"+
		"\u00bd\7\3\2\2\u00bd\u00bf\7,\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2"+
		"\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\7\b\2\2\u00c1\u00c2\7\4\2\2\u00c2"+
		"\u00c6\3\2\2\2\u00c3\u00c6\5\24\13\2\u00c4\u00c6\7\4\2\2\u00c5\u0081\3"+
		"\2\2\2\u00c5\u008f\3\2\2\2\u00c5\u0098\3\2\2\2\u00c5\u00a6\3\2\2\2\u00c5"+
		"\u00ac\3\2\2\2\u00c5\u00ae\3\2\2\2\u00c5\u00b3\3\2\2\2\u00c5\u00b9\3\2"+
		"\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c4\3\2\2\2\u00c6\23\3\2\2\2\u00c7\u00cb"+
		"\7\5\2\2\u00c8\u00ca\5\22\n\2\u00c9\u00c8\3\2\2\2\u00ca\u00cd\3\2\2\2"+
		"\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00cb"+
		"\3\2\2\2\u00ce\u00cf\7\6\2\2\u00cf\25\3\2\2\2\u00d0\u00d5\5\36\20\2\u00d1"+
		"\u00d2\7\3\2\2\u00d2\u00d4\5\36\20\2\u00d3\u00d1\3\2\2\2\u00d4\u00d7\3"+
		"\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\27\3\2\2\2\u00d7"+
		"\u00d5\3\2\2\2\u00d8\u00dd\5\32\16\2\u00d9\u00da\7\30\2\2\u00da\u00dc"+
		"\5\32\16\2\u00db\u00d9\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2\2\2"+
		"\u00dd\u00de\3\2\2\2\u00de\31\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e5"+
		"\5\34\17\2\u00e1\u00e2\7\31\2\2\u00e2\u00e4\5\34\17\2\u00e3\u00e1\3\2"+
		"\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6"+
		"\33\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00e9\5\36\20\2\u00e9\u00ea\5&\24"+
		"\2\u00ea\u00eb\5\36\20\2\u00eb\35\3\2\2\2\u00ec\u00ee\7$\2\2\u00ed\u00ec"+
		"\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f5\5 \21\2\u00f0"+
		"\u00f1\5(\25\2\u00f1\u00f2\5 \21\2\u00f2\u00f4\3\2\2\2\u00f3\u00f0\3\2"+
		"\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6"+
		"\37\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00fe\5\"\22\2\u00f9\u00fa\5*\26"+
		"\2\u00fa\u00fb\5\"\22\2\u00fb\u00fd\3\2\2\2\u00fc\u00f9\3\2\2\2\u00fd"+
		"\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff!\3\2\2\2"+
		"\u0100\u00fe\3\2\2\2\u0101\u0108\5$\23\2\u0102\u0104\7\7\2\2\u0103\u0105"+
		"\5\26\f\2\u0104\u0103\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106\3\2\2\2"+
		"\u0106\u0109\7\b\2\2\u0107\u0109\3\2\2\2\u0108\u0102\3\2\2\2\u0108\u0107"+
		"\3\2\2\2\u0109\u0116\3\2\2\2\u010a\u0116\7,\2\2\u010b\u0116\7-\2\2\u010c"+
		"\u0116\7*\2\2\u010d\u0116\7\60\2\2\u010e\u0116\t\3\2\2\u010f\u0110\7\27"+
		"\2\2\u0110\u0116\7+\2\2\u0111\u0112\7\7\2\2\u0112\u0113\5\36\20\2\u0113"+
		"\u0114\7\b\2\2\u0114\u0116\3\2\2\2\u0115\u0101\3\2\2\2\u0115\u010a\3\2"+
		"\2\2\u0115\u010b\3\2\2\2\u0115\u010c\3\2\2\2\u0115\u010d\3\2\2\2\u0115"+
		"\u010e\3\2\2\2\u0115\u010f\3\2\2\2\u0115\u0111\3\2\2\2\u0116#\3\2\2\2"+
		"\u0117\u0120\7+\2\2\u0118\u0119\7\13\2\2\u0119\u011f\7+\2\2\u011a\u011b"+
		"\7\t\2\2\u011b\u011c\5\36\20\2\u011c\u011d\7\n\2\2\u011d\u011f\3\2\2\2"+
		"\u011e\u0118\3\2\2\2\u011e\u011a\3\2\2\2\u011f\u0122\3\2\2\2\u0120\u011e"+
		"\3\2\2\2\u0120\u0121\3\2\2\2\u0121%\3\2\2\2\u0122\u0120\3\2\2\2\u0123"+
		"\u012a\7\35\2\2\u0124\u012a\7\36\2\2\u0125\u012a\7!\2\2\u0126\u012a\7"+
		"\"\2\2\u0127\u012a\7\37\2\2\u0128\u012a\7 \2\2\u0129\u0123\3\2\2\2\u0129"+
		"\u0124\3\2\2\2\u0129\u0125\3\2\2\2\u0129\u0126\3\2\2\2\u0129\u0127\3\2"+
		"\2\2\u0129\u0128\3\2\2\2\u012a\'\3\2\2\2\u012b\u012e\7#\2\2\u012c\u012e"+
		"\7$\2\2\u012d\u012b\3\2\2\2\u012d\u012c\3\2\2\2\u012e)\3\2\2\2\u012f\u0133"+
		"\7%\2\2\u0130\u0133\7&\2\2\u0131\u0133\7\'\2\2\u0132\u012f\3\2\2\2\u0132"+
		"\u0130\3\2\2\2\u0132\u0131\3\2\2\2\u0133+\3\2\2\2#\618@OZafly\177\u0086"+
		"\u008b\u0096\u009d\u00a1\u00b0\u00be\u00c5\u00cb\u00d5\u00dd\u00e5\u00ed"+
		"\u00f5\u00fe\u0104\u0108\u0115\u011e\u0120\u0129\u012d\u0132";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}