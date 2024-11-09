// Generated from /home/stmikeal/homeworks/progLan/mr-lang/mrlang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class mrlangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, ID=15, NUM=16, BOOL=17, 
		STRING=18, MUL=19, SLASH=20, PLUS=21, MINUS=22, ASSIGN=23, EQUAL=24, NOT_EQUAL=25, 
		LESS=26, AND=27, OR=28, LESS_OR_EQUAL=29, GREATER=30, GREATER_OR_EQUAL=31, 
		SPACE=32, LINE_COMMENT=33, MULTILINE_COMMENT=34;
	public static final int
		RULE_program = 0, RULE_stmt = 1, RULE_expr = 2, RULE_logicExpr = 3, RULE_varDecl = 4, 
		RULE_rawVarDecl = 5, RULE_filledVarDecl = 6, RULE_typeName = 7, RULE_assignment = 8, 
		RULE_rawAssigment = 9, RULE_compOperator = 10, RULE_print = 11, RULE_blockstmt = 12, 
		RULE_ifstmt = 13, RULE_elifstmt = 14, RULE_elsestmt = 15, RULE_whilestmt = 16, 
		RULE_forstmt = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "stmt", "expr", "logicExpr", "varDecl", "rawVarDecl", "filledVarDecl", 
			"typeName", "assignment", "rawAssigment", "compOperator", "print", "blockstmt", 
			"ifstmt", "elifstmt", "elsestmt", "whilestmt", "forstmt"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "';'", "'schetnoe'", "'slovesnoe'", "'dvoyakoe'", 
			"'povedati'", "'startuem'", "'konchaem'", "'ezheli'", "'inakoezheli'", 
			"'inako'", "'dokole'", "'krugoverty'", null, null, null, null, "'*'", 
			"'/'", "'+'", "'-'", "'='", "'=='", "'!='", "'<'", "'&&'", "'||'", "'<='", 
			"'>'", "'>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "ID", "NUM", "BOOL", "STRING", "MUL", "SLASH", "PLUS", 
			"MINUS", "ASSIGN", "EQUAL", "NOT_EQUAL", "LESS", "AND", "OR", "LESS_OR_EQUAL", 
			"GREATER", "GREATER_OR_EQUAL", "SPACE", "LINE_COMMENT", "MULTILINE_COMMENT"
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
	public String getGrammarFileName() { return "mrlang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public mrlangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(mrlangParser.EOF, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 58864L) != 0)) {
				{
				{
				setState(36);
				stmt();
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(42);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StmtContext extends ParserRuleContext {
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public IfstmtContext ifstmt() {
			return getRuleContext(IfstmtContext.class,0);
		}
		public BlockstmtContext blockstmt() {
			return getRuleContext(BlockstmtContext.class,0);
		}
		public WhilestmtContext whilestmt() {
			return getRuleContext(WhilestmtContext.class,0);
		}
		public ForstmtContext forstmt() {
			return getRuleContext(ForstmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		try {
			setState(51);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__4:
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				varDecl();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				assignment();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(46);
				print();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 4);
				{
				setState(47);
				ifstmt();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 5);
				{
				setState(48);
				blockstmt();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 6);
				{
				setState(49);
				whilestmt();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 7);
				{
				setState(50);
				forstmt();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LogicExprContext logicExpr() {
			return getRuleContext(LogicExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(mrlangParser.ID, 0); }
		public TerminalNode NUM() { return getToken(mrlangParser.NUM, 0); }
		public TerminalNode STRING() { return getToken(mrlangParser.STRING, 0); }
		public TerminalNode PLUS() { return getToken(mrlangParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(mrlangParser.MINUS, 0); }
		public TerminalNode MUL() { return getToken(mrlangParser.MUL, 0); }
		public TerminalNode SLASH() { return getToken(mrlangParser.SLASH, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(54);
				match(T__0);
				setState(55);
				expr(0);
				setState(56);
				match(T__1);
				}
				break;
			case 2:
				{
				setState(58);
				logicExpr(0);
				}
				break;
			case 3:
				{
				setState(59);
				match(ID);
				}
				break;
			case 4:
				{
				setState(60);
				match(NUM);
				}
				break;
			case 5:
				{
				setState(61);
				match(STRING);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(69);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(64);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(65);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7864320L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(66);
					expr(6);
					}
					} 
				}
				setState(71);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LogicExprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(mrlangParser.ID, 0); }
		public TerminalNode BOOL() { return getToken(mrlangParser.BOOL, 0); }
		public TerminalNode NUM() { return getToken(mrlangParser.NUM, 0); }
		public List<LogicExprContext> logicExpr() {
			return getRuleContexts(LogicExprContext.class);
		}
		public LogicExprContext logicExpr(int i) {
			return getRuleContext(LogicExprContext.class,i);
		}
		public CompOperatorContext compOperator() {
			return getRuleContext(CompOperatorContext.class,0);
		}
		public LogicExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicExpr; }
	}

	public final LogicExprContext logicExpr() throws RecognitionException {
		return logicExpr(0);
	}

	private LogicExprContext logicExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicExprContext _localctx = new LogicExprContext(_ctx, _parentState);
		LogicExprContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_logicExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(73);
				match(T__0);
				setState(74);
				expr(0);
				setState(75);
				match(T__1);
				}
				break;
			case ID:
				{
				setState(77);
				match(ID);
				}
				break;
			case BOOL:
				{
				setState(78);
				match(BOOL);
				}
				break;
			case NUM:
				{
				setState(79);
				match(NUM);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(88);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logicExpr);
					setState(82);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(83);
					compOperator();
					setState(84);
					logicExpr(5);
					}
					} 
				}
				setState(90);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclContext extends ParserRuleContext {
		public RawVarDeclContext rawVarDecl() {
			return getRuleContext(RawVarDeclContext.class,0);
		}
		public FilledVarDeclContext filledVarDecl() {
			return getRuleContext(FilledVarDeclContext.class,0);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_varDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(91);
				rawVarDecl();
				}
				break;
			case 2:
				{
				setState(92);
				filledVarDecl();
				}
				break;
			}
			setState(95);
			match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RawVarDeclContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode ID() { return getToken(mrlangParser.ID, 0); }
		public RawVarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rawVarDecl; }
	}

	public final RawVarDeclContext rawVarDecl() throws RecognitionException {
		RawVarDeclContext _localctx = new RawVarDeclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_rawVarDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			typeName();
			setState(98);
			match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FilledVarDeclContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode ID() { return getToken(mrlangParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(mrlangParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FilledVarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filledVarDecl; }
	}

	public final FilledVarDeclContext filledVarDecl() throws RecognitionException {
		FilledVarDeclContext _localctx = new FilledVarDeclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_filledVarDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			typeName();
			setState(101);
			match(ID);
			setState(102);
			match(ASSIGN);
			setState(103);
			expr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeNameContext extends ParserRuleContext {
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_typeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 112L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public RawAssigmentContext rawAssigment() {
			return getRuleContext(RawAssigmentContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			rawAssigment();
			setState(108);
			match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RawAssigmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(mrlangParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(mrlangParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public RawAssigmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rawAssigment; }
	}

	public final RawAssigmentContext rawAssigment() throws RecognitionException {
		RawAssigmentContext _localctx = new RawAssigmentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_rawAssigment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(ID);
			setState(111);
			match(ASSIGN);
			setState(112);
			expr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CompOperatorContext extends ParserRuleContext {
		public TerminalNode LESS() { return getToken(mrlangParser.LESS, 0); }
		public TerminalNode LESS_OR_EQUAL() { return getToken(mrlangParser.LESS_OR_EQUAL, 0); }
		public TerminalNode EQUAL() { return getToken(mrlangParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(mrlangParser.NOT_EQUAL, 0); }
		public TerminalNode GREATER() { return getToken(mrlangParser.GREATER, 0); }
		public TerminalNode GREATER_OR_EQUAL() { return getToken(mrlangParser.GREATER_OR_EQUAL, 0); }
		public TerminalNode AND() { return getToken(mrlangParser.AND, 0); }
		public TerminalNode OR() { return getToken(mrlangParser.OR, 0); }
		public CompOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compOperator; }
	}

	public final CompOperatorContext compOperator() throws RecognitionException {
		CompOperatorContext _localctx = new CompOperatorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_compOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4278190080L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrintContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(T__6);
			setState(117);
			match(T__0);
			setState(118);
			expr(0);
			setState(119);
			match(T__1);
			setState(120);
			match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockstmtContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public BlockstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockstmt; }
	}

	public final BlockstmtContext blockstmt() throws RecognitionException {
		BlockstmtContext _localctx = new BlockstmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_blockstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(T__7);
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 58864L) != 0)) {
				{
				{
				setState(123);
				stmt();
				}
				}
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(129);
			match(T__8);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfstmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public List<ElifstmtContext> elifstmt() {
			return getRuleContexts(ElifstmtContext.class);
		}
		public ElifstmtContext elifstmt(int i) {
			return getRuleContext(ElifstmtContext.class,i);
		}
		public ElsestmtContext elsestmt() {
			return getRuleContext(ElsestmtContext.class,0);
		}
		public IfstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstmt; }
	}

	public final IfstmtContext ifstmt() throws RecognitionException {
		IfstmtContext _localctx = new IfstmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ifstmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(T__9);
			setState(132);
			match(T__0);
			setState(133);
			expr(0);
			setState(134);
			match(T__1);
			setState(135);
			stmt();
			setState(139);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(136);
					elifstmt();
					}
					} 
				}
				setState(141);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(142);
				elsestmt();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElifstmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public ElifstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elifstmt; }
	}

	public final ElifstmtContext elifstmt() throws RecognitionException {
		ElifstmtContext _localctx = new ElifstmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_elifstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(T__10);
			setState(146);
			match(T__0);
			setState(147);
			expr(0);
			setState(148);
			match(T__1);
			setState(149);
			stmt();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElsestmtContext extends ParserRuleContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public ElsestmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsestmt; }
	}

	public final ElsestmtContext elsestmt() throws RecognitionException {
		ElsestmtContext _localctx = new ElsestmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_elsestmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(T__11);
			setState(152);
			stmt();
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhilestmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public WhilestmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilestmt; }
	}

	public final WhilestmtContext whilestmt() throws RecognitionException {
		WhilestmtContext _localctx = new WhilestmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_whilestmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(T__12);
			setState(155);
			match(T__0);
			setState(156);
			expr(0);
			setState(157);
			match(T__1);
			setState(158);
			stmt();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForstmtContext extends ParserRuleContext {
		public FilledVarDeclContext filledVarDecl() {
			return getRuleContext(FilledVarDeclContext.class,0);
		}
		public LogicExprContext logicExpr() {
			return getRuleContext(LogicExprContext.class,0);
		}
		public RawAssigmentContext rawAssigment() {
			return getRuleContext(RawAssigmentContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public ForstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forstmt; }
	}

	public final ForstmtContext forstmt() throws RecognitionException {
		ForstmtContext _localctx = new ForstmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_forstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(T__13);
			setState(161);
			match(T__0);
			setState(162);
			filledVarDecl();
			setState(163);
			match(T__2);
			setState(164);
			logicExpr(0);
			setState(165);
			match(T__2);
			setState(166);
			rawAssigment();
			setState(167);
			match(T__1);
			setState(168);
			stmt();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 3:
			return logicExpr_sempred((LogicExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean logicExpr_sempred(LogicExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\"\u00ab\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001\u0000\u0005\u0000"+
		"&\b\u0000\n\u0000\f\u0000)\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u00014\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"?\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002D\b\u0002\n\u0002"+
		"\f\u0002G\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003Q\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003W\b\u0003\n\u0003"+
		"\f\u0003Z\t\u0003\u0001\u0004\u0001\u0004\u0003\u0004^\b\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0005\f}\b\f\n\f\f\f\u0080\t\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0005\r\u008a\b\r\n\r\f\r\u008d\t\r\u0001\r"+
		"\u0003\r\u0090\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0000\u0002\u0004\u0006\u0012"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"\u0000\u0003\u0001\u0000\u0013\u0016\u0001\u0000\u0004"+
		"\u0006\u0001\u0000\u0018\u001f\u00ac\u0000\'\u0001\u0000\u0000\u0000\u0002"+
		"3\u0001\u0000\u0000\u0000\u0004>\u0001\u0000\u0000\u0000\u0006P\u0001"+
		"\u0000\u0000\u0000\b]\u0001\u0000\u0000\u0000\na\u0001\u0000\u0000\u0000"+
		"\fd\u0001\u0000\u0000\u0000\u000ei\u0001\u0000\u0000\u0000\u0010k\u0001"+
		"\u0000\u0000\u0000\u0012n\u0001\u0000\u0000\u0000\u0014r\u0001\u0000\u0000"+
		"\u0000\u0016t\u0001\u0000\u0000\u0000\u0018z\u0001\u0000\u0000\u0000\u001a"+
		"\u0083\u0001\u0000\u0000\u0000\u001c\u0091\u0001\u0000\u0000\u0000\u001e"+
		"\u0097\u0001\u0000\u0000\u0000 \u009a\u0001\u0000\u0000\u0000\"\u00a0"+
		"\u0001\u0000\u0000\u0000$&\u0003\u0002\u0001\u0000%$\u0001\u0000\u0000"+
		"\u0000&)\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000\'(\u0001\u0000"+
		"\u0000\u0000(*\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000*+\u0005"+
		"\u0000\u0000\u0001+\u0001\u0001\u0000\u0000\u0000,4\u0003\b\u0004\u0000"+
		"-4\u0003\u0010\b\u0000.4\u0003\u0016\u000b\u0000/4\u0003\u001a\r\u0000"+
		"04\u0003\u0018\f\u000014\u0003 \u0010\u000024\u0003\"\u0011\u00003,\u0001"+
		"\u0000\u0000\u00003-\u0001\u0000\u0000\u00003.\u0001\u0000\u0000\u0000"+
		"3/\u0001\u0000\u0000\u000030\u0001\u0000\u0000\u000031\u0001\u0000\u0000"+
		"\u000032\u0001\u0000\u0000\u00004\u0003\u0001\u0000\u0000\u000056\u0006"+
		"\u0002\uffff\uffff\u000067\u0005\u0001\u0000\u000078\u0003\u0004\u0002"+
		"\u000089\u0005\u0002\u0000\u00009?\u0001\u0000\u0000\u0000:?\u0003\u0006"+
		"\u0003\u0000;?\u0005\u000f\u0000\u0000<?\u0005\u0010\u0000\u0000=?\u0005"+
		"\u0012\u0000\u0000>5\u0001\u0000\u0000\u0000>:\u0001\u0000\u0000\u0000"+
		">;\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000>=\u0001\u0000\u0000"+
		"\u0000?E\u0001\u0000\u0000\u0000@A\n\u0005\u0000\u0000AB\u0007\u0000\u0000"+
		"\u0000BD\u0003\u0004\u0002\u0006C@\u0001\u0000\u0000\u0000DG\u0001\u0000"+
		"\u0000\u0000EC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000F\u0005"+
		"\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000HI\u0006\u0003\uffff"+
		"\uffff\u0000IJ\u0005\u0001\u0000\u0000JK\u0003\u0004\u0002\u0000KL\u0005"+
		"\u0002\u0000\u0000LQ\u0001\u0000\u0000\u0000MQ\u0005\u000f\u0000\u0000"+
		"NQ\u0005\u0011\u0000\u0000OQ\u0005\u0010\u0000\u0000PH\u0001\u0000\u0000"+
		"\u0000PM\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000PO\u0001\u0000"+
		"\u0000\u0000QX\u0001\u0000\u0000\u0000RS\n\u0004\u0000\u0000ST\u0003\u0014"+
		"\n\u0000TU\u0003\u0006\u0003\u0005UW\u0001\u0000\u0000\u0000VR\u0001\u0000"+
		"\u0000\u0000WZ\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000XY\u0001"+
		"\u0000\u0000\u0000Y\u0007\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000"+
		"\u0000[^\u0003\n\u0005\u0000\\^\u0003\f\u0006\u0000][\u0001\u0000\u0000"+
		"\u0000]\\\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_`\u0005\u0003"+
		"\u0000\u0000`\t\u0001\u0000\u0000\u0000ab\u0003\u000e\u0007\u0000bc\u0005"+
		"\u000f\u0000\u0000c\u000b\u0001\u0000\u0000\u0000de\u0003\u000e\u0007"+
		"\u0000ef\u0005\u000f\u0000\u0000fg\u0005\u0017\u0000\u0000gh\u0003\u0004"+
		"\u0002\u0000h\r\u0001\u0000\u0000\u0000ij\u0007\u0001\u0000\u0000j\u000f"+
		"\u0001\u0000\u0000\u0000kl\u0003\u0012\t\u0000lm\u0005\u0003\u0000\u0000"+
		"m\u0011\u0001\u0000\u0000\u0000no\u0005\u000f\u0000\u0000op\u0005\u0017"+
		"\u0000\u0000pq\u0003\u0004\u0002\u0000q\u0013\u0001\u0000\u0000\u0000"+
		"rs\u0007\u0002\u0000\u0000s\u0015\u0001\u0000\u0000\u0000tu\u0005\u0007"+
		"\u0000\u0000uv\u0005\u0001\u0000\u0000vw\u0003\u0004\u0002\u0000wx\u0005"+
		"\u0002\u0000\u0000xy\u0005\u0003\u0000\u0000y\u0017\u0001\u0000\u0000"+
		"\u0000z~\u0005\b\u0000\u0000{}\u0003\u0002\u0001\u0000|{\u0001\u0000\u0000"+
		"\u0000}\u0080\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000~\u007f"+
		"\u0001\u0000\u0000\u0000\u007f\u0081\u0001\u0000\u0000\u0000\u0080~\u0001"+
		"\u0000\u0000\u0000\u0081\u0082\u0005\t\u0000\u0000\u0082\u0019\u0001\u0000"+
		"\u0000\u0000\u0083\u0084\u0005\n\u0000\u0000\u0084\u0085\u0005\u0001\u0000"+
		"\u0000\u0085\u0086\u0003\u0004\u0002\u0000\u0086\u0087\u0005\u0002\u0000"+
		"\u0000\u0087\u008b\u0003\u0002\u0001\u0000\u0088\u008a\u0003\u001c\u000e"+
		"\u0000\u0089\u0088\u0001\u0000\u0000\u0000\u008a\u008d\u0001\u0000\u0000"+
		"\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000"+
		"\u0000\u008c\u008f\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000"+
		"\u0000\u008e\u0090\u0003\u001e\u000f\u0000\u008f\u008e\u0001\u0000\u0000"+
		"\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u001b\u0001\u0000\u0000"+
		"\u0000\u0091\u0092\u0005\u000b\u0000\u0000\u0092\u0093\u0005\u0001\u0000"+
		"\u0000\u0093\u0094\u0003\u0004\u0002\u0000\u0094\u0095\u0005\u0002\u0000"+
		"\u0000\u0095\u0096\u0003\u0002\u0001\u0000\u0096\u001d\u0001\u0000\u0000"+
		"\u0000\u0097\u0098\u0005\f\u0000\u0000\u0098\u0099\u0003\u0002\u0001\u0000"+
		"\u0099\u001f\u0001\u0000\u0000\u0000\u009a\u009b\u0005\r\u0000\u0000\u009b"+
		"\u009c\u0005\u0001\u0000\u0000\u009c\u009d\u0003\u0004\u0002\u0000\u009d"+
		"\u009e\u0005\u0002\u0000\u0000\u009e\u009f\u0003\u0002\u0001\u0000\u009f"+
		"!\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005\u000e\u0000\u0000\u00a1\u00a2"+
		"\u0005\u0001\u0000\u0000\u00a2\u00a3\u0003\f\u0006\u0000\u00a3\u00a4\u0005"+
		"\u0003\u0000\u0000\u00a4\u00a5\u0003\u0006\u0003\u0000\u00a5\u00a6\u0005"+
		"\u0003\u0000\u0000\u00a6\u00a7\u0003\u0012\t\u0000\u00a7\u00a8\u0005\u0002"+
		"\u0000\u0000\u00a8\u00a9\u0003\u0002\u0001\u0000\u00a9#\u0001\u0000\u0000"+
		"\u0000\n\'3>EPX]~\u008b\u008f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}