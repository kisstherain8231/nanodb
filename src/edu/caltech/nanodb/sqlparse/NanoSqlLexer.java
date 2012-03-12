// $ANTLR 2.7.7 (20060906): "nanosql.g" -> "NanoSqlLexer.java"$

  /**
   * Copyright (c) 2005-2011 by the California Institute of Technology.
   * All rights reserved.
   */
  package edu.caltech.nanodb.sqlparse;

  import java.util.ArrayList;
  import java.util.List;

  import edu.caltech.nanodb.commands.*;
  import edu.caltech.nanodb.expressions.*;
  import edu.caltech.nanodb.relations.*;

import java.io.InputStream;
import antlr.TokenStreamException;
import antlr.TokenStreamIOException;
import antlr.TokenStreamRecognitionException;
import antlr.CharStreamException;
import antlr.CharStreamIOException;
import antlr.ANTLRException;
import java.io.Reader;
import java.util.Hashtable;
import antlr.CharScanner;
import antlr.InputBuffer;
import antlr.ByteBuffer;
import antlr.CharBuffer;
import antlr.Token;
import antlr.CommonToken;
import antlr.RecognitionException;
import antlr.NoViableAltForCharException;
import antlr.MismatchedCharException;
import antlr.TokenStream;
import antlr.ANTLRHashString;
import antlr.LexerSharedInputState;
import antlr.collections.impl.BitSet;
import antlr.SemanticException;

/**
 * A lexer for tokenizing SQL commands into various tokens necessary for
 * parsing.  As is true for most lexers generated by ANTLR, this one primarily
 * concentrates on identifying various symbols like punctuation characters,
 * whitespace, and newlines, although it also identifies some more "high-level"
 * tokens such as identifiers and "typed" literals (i.e. literals that follow a
 * well-defined format based on their type).
 * <p>
 * All of the SQL-specific keywords are actually declared in the parser, so that
 * keeps the lexer definition pretty short and sweet.
 */
@SuppressWarnings({"unchecked", "cast"})

public class NanoSqlLexer extends antlr.CharScanner implements NanoSqlParserTokenTypes, TokenStream
 {
public NanoSqlLexer(InputStream in) {
	this(new ByteBuffer(in));
}
public NanoSqlLexer(Reader in) {
	this(new CharBuffer(in));
}
public NanoSqlLexer(InputBuffer ib) {
	this(new LexerSharedInputState(ib));
}
public NanoSqlLexer(LexerSharedInputState state) {
	super(state);
	caseSensitiveLiterals = false;
	setCaseSensitive(true);
	literals = new Hashtable();
	literals.put(new ANTLRHashString("blob", this), new Integer(86));
	literals.put(new ANTLRHashString("between", this), new Integer(14));
	literals.put(new ANTLRHashString("time", this), new Integer(98));
	literals.put(new ANTLRHashString("delete", this), new Integer(24));
	literals.put(new ANTLRHashString("transaction", this), new Integer(72));
	literals.put(new ANTLRHashString("view", this), new Integer(82));
	literals.put(new ANTLRHashString("timestamp", this), new Integer(99));
	literals.put(new ANTLRHashString("insert", this), new Integer(40));
	literals.put(new ANTLRHashString("distinct", this), new Integer(26));
	literals.put(new ANTLRHashString("where", this), new Integer(83));
	literals.put(new ANTLRHashString("alter", this), new Integer(6));
	literals.put(new ANTLRHashString("integer", this), new Integer(95));
	literals.put(new ANTLRHashString("analyze", this), new Integer(7));
	literals.put(new ANTLRHashString("decimal", this), new Integer(91));
	literals.put(new ANTLRHashString("select", this), new Integer(63));
	literals.put(new ANTLRHashString("to", this), new Integer(71));
	literals.put(new ANTLRHashString("and", this), new Integer(8));
	literals.put(new ANTLRHashString("outer", this), new Integer(56));
	literals.put(new ANTLRHashString("float", this), new Integer(92));
	literals.put(new ANTLRHashString("not", this), new Integer(50));
	literals.put(new ANTLRHashString("constraint", this), new Integer(18));
	literals.put(new ANTLRHashString("verbose", this), new Integer(80));
	literals.put(new ANTLRHashString("numeric", this), new Integer(96));
	literals.put(new ANTLRHashString("date", this), new Integer(89));
	literals.put(new ANTLRHashString("using", this), new Integer(77));
	literals.put(new ANTLRHashString("key", this), new Integer(44));
	literals.put(new ANTLRHashString("from", this), new Integer(34));
	literals.put(new ANTLRHashString("bigint", this), new Integer(85));
	literals.put(new ANTLRHashString("null", this), new Integer(51));
	literals.put(new ANTLRHashString("count", this), new Integer(19));
	literals.put(new ANTLRHashString("variance", this), new Integer(79));
	literals.put(new ANTLRHashString("optimize", this), new Integer(53));
	literals.put(new ANTLRHashString("add", this), new Integer(4));
	literals.put(new ANTLRHashString("quit", this), new Integer(58));
	literals.put(new ANTLRHashString("like", this), new Integer(46));
	literals.put(new ANTLRHashString("natural", this), new Integer(49));
	literals.put(new ANTLRHashString("flush", this), new Integer(32));
	literals.put(new ANTLRHashString("inner", this), new Integer(39));
	literals.put(new ANTLRHashString("exit", this), new Integer(29));
	literals.put(new ANTLRHashString("text", this), new Integer(97));
	literals.put(new ANTLRHashString("character", this), new Integer(88));
	literals.put(new ANTLRHashString("verify", this), new Integer(81));
	literals.put(new ANTLRHashString("set", this), new Integer(64));
	literals.put(new ANTLRHashString("foreign", this), new Integer(33));
	literals.put(new ANTLRHashString("work", this), new Integer(84));
	literals.put(new ANTLRHashString("similar", this), new Integer(65));
	literals.put(new ANTLRHashString("join", this), new Integer(43));
	literals.put(new ANTLRHashString("rollback", this), new Integer(62));
	literals.put(new ANTLRHashString("commit", this), new Integer(17));
	literals.put(new ANTLRHashString("is", this), new Integer(42));
	literals.put(new ANTLRHashString("or", this), new Integer(54));
	literals.put(new ANTLRHashString("any", this), new Integer(9));
	literals.put(new ANTLRHashString("create", this), new Integer(21));
	literals.put(new ANTLRHashString("crash", this), new Integer(20));
	literals.put(new ANTLRHashString("if", this), new Integer(36));
	literals.put(new ANTLRHashString("full", this), new Integer(35));
	literals.put(new ANTLRHashString("double", this), new Integer(93));
	literals.put(new ANTLRHashString("min", this), new Integer(48));
	literals.put(new ANTLRHashString("as", this), new Integer(10));
	literals.put(new ANTLRHashString("by", this), new Integer(15));
	literals.put(new ANTLRHashString("all", this), new Integer(5));
	literals.put(new ANTLRHashString("drop", this), new Integer(27));
	literals.put(new ANTLRHashString("order", this), new Integer(55));
	literals.put(new ANTLRHashString("primary", this), new Integer(57));
	literals.put(new ANTLRHashString("some", this), new Integer(66));
	literals.put(new ANTLRHashString("values", this), new Integer(78));
	literals.put(new ANTLRHashString("start", this), new Integer(67));
	literals.put(new ANTLRHashString("int", this), new Integer(94));
	literals.put(new ANTLRHashString("cross", this), new Integer(22));
	literals.put(new ANTLRHashString("varchar", this), new Integer(100));
	literals.put(new ANTLRHashString("char", this), new Integer(87));
	literals.put(new ANTLRHashString("index", this), new Integer(38));
	literals.put(new ANTLRHashString("default", this), new Integer(23));
	literals.put(new ANTLRHashString("explain", this), new Integer(30));
	literals.put(new ANTLRHashString("false", this), new Integer(31));
	literals.put(new ANTLRHashString("exists", this), new Integer(28));
	literals.put(new ANTLRHashString("table", this), new Integer(70));
	literals.put(new ANTLRHashString("asc", this), new Integer(11));
	literals.put(new ANTLRHashString("unknown", this), new Integer(75));
	literals.put(new ANTLRHashString("left", this), new Integer(45));
	literals.put(new ANTLRHashString("desc", this), new Integer(25));
	literals.put(new ANTLRHashString("max", this), new Integer(47));
	literals.put(new ANTLRHashString("sum", this), new Integer(69));
	literals.put(new ANTLRHashString("datetime", this), new Integer(90));
	literals.put(new ANTLRHashString("on", this), new Integer(52));
	literals.put(new ANTLRHashString("begin", this), new Integer(13));
	literals.put(new ANTLRHashString("into", this), new Integer(41));
	literals.put(new ANTLRHashString("rename", this), new Integer(60));
	literals.put(new ANTLRHashString("right", this), new Integer(61));
	literals.put(new ANTLRHashString("in", this), new Integer(37));
	literals.put(new ANTLRHashString("avg", this), new Integer(12));
	literals.put(new ANTLRHashString("update", this), new Integer(76));
	literals.put(new ANTLRHashString("true", this), new Integer(73));
	literals.put(new ANTLRHashString("stddev", this), new Integer(68));
	literals.put(new ANTLRHashString("column", this), new Integer(16));
	literals.put(new ANTLRHashString("unique", this), new Integer(74));
	literals.put(new ANTLRHashString("references", this), new Integer(59));
	literals.put(new ANTLRHashString("varying", this), new Integer(101));
}

public Token nextToken() throws TokenStreamException {
	Token theRetToken=null;
tryAgain:
	for (;;) {
		Token _token = null;
		int _ttype = Token.INVALID_TYPE;
		resetText();
		try {   // for char stream error handling
			try {   // for lexical error handling
				switch ( LA(1)) {
				case ':':
				{
					mCOLON(true);
					theRetToken=_returnToken;
					break;
				}
				case ',':
				{
					mCOMMA(true);
					theRetToken=_returnToken;
					break;
				}
				case '(':
				{
					mLPAREN(true);
					theRetToken=_returnToken;
					break;
				}
				case ')':
				{
					mRPAREN(true);
					theRetToken=_returnToken;
					break;
				}
				case ';':
				{
					mSEMICOLON(true);
					theRetToken=_returnToken;
					break;
				}
				case '*':
				{
					mSTAR(true);
					theRetToken=_returnToken;
					break;
				}
				case '/':
				{
					mSLASH(true);
					theRetToken=_returnToken;
					break;
				}
				case '%':
				{
					mPERCENT(true);
					theRetToken=_returnToken;
					break;
				}
				case '+':
				{
					mPLUS(true);
					theRetToken=_returnToken;
					break;
				}
				case '\n':  case '\r':
				{
					mNEWLINE(true);
					theRetToken=_returnToken;
					break;
				}
				case '\t':  case ' ':
				{
					mWS(true);
					theRetToken=_returnToken;
					break;
				}
				case '!':  case '<':  case '=':  case '>':
				{
					mCOMPARE_OPERATOR(true);
					theRetToken=_returnToken;
					break;
				}
				case 'A':  case 'B':  case 'C':  case 'D':
				case 'E':  case 'F':  case 'G':  case 'H':
				case 'I':  case 'J':  case 'K':  case 'L':
				case 'M':  case 'N':  case 'O':  case 'P':
				case 'Q':  case 'R':  case 'S':  case 'T':
				case 'U':  case 'V':  case 'W':  case 'X':
				case 'Y':  case 'Z':  case '_':  case 'a':
				case 'b':  case 'c':  case 'd':  case 'e':
				case 'f':  case 'g':  case 'h':  case 'i':
				case 'j':  case 'k':  case 'l':  case 'm':
				case 'n':  case 'o':  case 'p':  case 'q':
				case 'r':  case 's':  case 't':  case 'u':
				case 'v':  case 'w':  case 'x':  case 'y':
				case 'z':
				{
					mIDENT(true);
					theRetToken=_returnToken;
					break;
				}
				case '"':
				{
					mQUOTED_IDENT(true);
					theRetToken=_returnToken;
					break;
				}
				case '.':  case '0':  case '1':  case '2':
				case '3':  case '4':  case '5':  case '6':
				case '7':  case '8':  case '9':
				{
					mNUM_LITERAL_OR_SYMBOL(true);
					theRetToken=_returnToken;
					break;
				}
				case '\'':
				{
					mSTRING_LITERAL(true);
					theRetToken=_returnToken;
					break;
				}
				default:
					if ((LA(1)=='-') && (LA(2)=='-')) {
						mCOMMENT(true);
						theRetToken=_returnToken;
					}
					else if ((LA(1)=='-') && (true)) {
						mMINUS(true);
						theRetToken=_returnToken;
					}
				else {
					if (LA(1)==EOF_CHAR) {uponEOF(); _returnToken = makeToken(Token.EOF_TYPE);}
				else {throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());}
				}
				}
				if ( _returnToken==null ) continue tryAgain; // found SKIP token
				_ttype = _returnToken.getType();
				_returnToken.setType(_ttype);
				return _returnToken;
			}
			catch (RecognitionException e) {
				throw new TokenStreamRecognitionException(e);
			}
		}
		catch (CharStreamException cse) {
			if ( cse instanceof CharStreamIOException ) {
				throw new TokenStreamIOException(((CharStreamIOException)cse).io);
			}
			else {
				throw new TokenStreamException(cse.getMessage());
			}
		}
	}
}

	public final void mCOLON(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = COLON;
		int _saveIndex;
		
		match(':');
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mCOMMA(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = COMMA;
		int _saveIndex;
		
		match(',');
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mLPAREN(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = LPAREN;
		int _saveIndex;
		
		match('(');
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mRPAREN(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = RPAREN;
		int _saveIndex;
		
		match(')');
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mSEMICOLON(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = SEMICOLON;
		int _saveIndex;
		
		match(';');
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mSTAR(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = STAR;
		int _saveIndex;
		
		match('*');
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mSLASH(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = SLASH;
		int _saveIndex;
		
		match('/');
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mPERCENT(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = PERCENT;
		int _saveIndex;
		
		match('%');
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mPLUS(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = PLUS;
		int _saveIndex;
		
		match('+');
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mMINUS(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = MINUS;
		int _saveIndex;
		
		match('-');
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mNEWLINE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = NEWLINE;
		int _saveIndex;
		
		{
		{
		switch ( LA(1)) {
		case '\r':
		{
			match('\r');
			break;
		}
		case '\n':
		{
			break;
		}
		default:
		{
			throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());
		}
		}
		}
		match('\n');
		}
		newline(); _ttype = Token.SKIP;
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mWS(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = WS;
		int _saveIndex;
		
		{
		int _cnt184=0;
		_loop184:
		do {
			switch ( LA(1)) {
			case ' ':
			{
				match(' ');
				break;
			}
			case '\t':
			{
				match('\t');
				break;
			}
			default:
			{
				if ( _cnt184>=1 ) { break _loop184; } else {throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());}
			}
			}
			_cnt184++;
		} while (true);
		}
		_ttype = Token.SKIP;
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
/**
 * Comments - we skip those too.
 *
 * Note:  No need to mention '\r' in this rule since it will match the wildcard
 *        character that consumes characters up to the '\n'.
 */
	public final void mCOMMENT(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = COMMENT;
		int _saveIndex;
		
		{
		match('-');
		match('-');
		{
		_loop188:
		do {
			// nongreedy exit test
			if ((LA(1)=='\n') && (true)) break _loop188;
			if (((LA(1) >= '\u0000' && LA(1) <= '\u007f')) && ((LA(2) >= '\u0000' && LA(2) <= '\u007f'))) {
				matchNot(EOF_CHAR);
			}
			else {
				break _loop188;
			}
			
		} while (true);
		}
		match('\n');
		}
		newline(); _ttype = Token.SKIP;
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mCOMPARE_OPERATOR(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = COMPARE_OPERATOR;
		int _saveIndex;
		
		switch ( LA(1)) {
		case '=':
		{
			match('=');
			{
			if ((LA(1)=='=')) {
				match('=');
			}
			else {
			}
			
			}
			_ttype = EQUALS;
			break;
		}
		case '<':
		{
			match('<');
			_ttype = LESS_THAN;
			{
			switch ( LA(1)) {
			case '>':
			{
				{
				match('>');
				_ttype = NOT_EQUALS;
				}
				break;
			}
			case '=':
			{
				{
				match('=');
				_ttype = LESS_EQUAL;
				}
				break;
			}
			default:
				{
				}
			}
			}
			break;
		}
		case '!':
		{
			match('!');
			match('=');
			_ttype = NOT_EQUALS;
			break;
		}
		case '>':
		{
			match('>');
			_ttype = GRTR_THAN;
			{
			if ((LA(1)=='=')) {
				match('=');
				_ttype = GRTR_EQUAL;
			}
			else {
			}
			
			}
			break;
		}
		default:
		{
			throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());
		}
		}
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mIDENT(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = IDENT;
		int _saveIndex;
		
		{
		switch ( LA(1)) {
		case 'A':  case 'B':  case 'C':  case 'D':
		case 'E':  case 'F':  case 'G':  case 'H':
		case 'I':  case 'J':  case 'K':  case 'L':
		case 'M':  case 'N':  case 'O':  case 'P':
		case 'Q':  case 'R':  case 'S':  case 'T':
		case 'U':  case 'V':  case 'W':  case 'X':
		case 'Y':  case 'Z':
		{
			matchRange('A','Z');
			break;
		}
		case 'a':  case 'b':  case 'c':  case 'd':
		case 'e':  case 'f':  case 'g':  case 'h':
		case 'i':  case 'j':  case 'k':  case 'l':
		case 'm':  case 'n':  case 'o':  case 'p':
		case 'q':  case 'r':  case 's':  case 't':
		case 'u':  case 'v':  case 'w':  case 'x':
		case 'y':  case 'z':
		{
			matchRange('a','z');
			break;
		}
		case '_':
		{
			match('_');
			break;
		}
		default:
		{
			throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());
		}
		}
		}
		{
		_loop198:
		do {
			switch ( LA(1)) {
			case 'A':  case 'B':  case 'C':  case 'D':
			case 'E':  case 'F':  case 'G':  case 'H':
			case 'I':  case 'J':  case 'K':  case 'L':
			case 'M':  case 'N':  case 'O':  case 'P':
			case 'Q':  case 'R':  case 'S':  case 'T':
			case 'U':  case 'V':  case 'W':  case 'X':
			case 'Y':  case 'Z':
			{
				matchRange('A','Z');
				break;
			}
			case 'a':  case 'b':  case 'c':  case 'd':
			case 'e':  case 'f':  case 'g':  case 'h':
			case 'i':  case 'j':  case 'k':  case 'l':
			case 'm':  case 'n':  case 'o':  case 'p':
			case 'q':  case 'r':  case 's':  case 't':
			case 'u':  case 'v':  case 'w':  case 'x':
			case 'y':  case 'z':
			{
				matchRange('a','z');
				break;
			}
			case '0':  case '1':  case '2':  case '3':
			case '4':  case '5':  case '6':  case '7':
			case '8':  case '9':
			{
				matchRange('0','9');
				break;
			}
			case '_':
			{
				match('_');
				break;
			}
			default:
			{
				break _loop198;
			}
			}
		} while (true);
		}
		String su = new String(text.getBuffer(),_begin,text.length()-_begin).toUpperCase(); text.setLength(_begin); text.append(su);
		_ttype = testLiteralsTable(_ttype);
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mQUOTED_IDENT(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = QUOTED_IDENT;
		int _saveIndex;
		
		_saveIndex=text.length();
		match('"');
		text.setLength(_saveIndex);
		{
		switch ( LA(1)) {
		case 'A':  case 'B':  case 'C':  case 'D':
		case 'E':  case 'F':  case 'G':  case 'H':
		case 'I':  case 'J':  case 'K':  case 'L':
		case 'M':  case 'N':  case 'O':  case 'P':
		case 'Q':  case 'R':  case 'S':  case 'T':
		case 'U':  case 'V':  case 'W':  case 'X':
		case 'Y':  case 'Z':
		{
			matchRange('A','Z');
			break;
		}
		case 'a':  case 'b':  case 'c':  case 'd':
		case 'e':  case 'f':  case 'g':  case 'h':
		case 'i':  case 'j':  case 'k':  case 'l':
		case 'm':  case 'n':  case 'o':  case 'p':
		case 'q':  case 'r':  case 's':  case 't':
		case 'u':  case 'v':  case 'w':  case 'x':
		case 'y':  case 'z':
		{
			matchRange('a','z');
			break;
		}
		case '_':
		{
			match('_');
			break;
		}
		default:
		{
			throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());
		}
		}
		}
		{
		_loop202:
		do {
			switch ( LA(1)) {
			case 'A':  case 'B':  case 'C':  case 'D':
			case 'E':  case 'F':  case 'G':  case 'H':
			case 'I':  case 'J':  case 'K':  case 'L':
			case 'M':  case 'N':  case 'O':  case 'P':
			case 'Q':  case 'R':  case 'S':  case 'T':
			case 'U':  case 'V':  case 'W':  case 'X':
			case 'Y':  case 'Z':
			{
				matchRange('A','Z');
				break;
			}
			case 'a':  case 'b':  case 'c':  case 'd':
			case 'e':  case 'f':  case 'g':  case 'h':
			case 'i':  case 'j':  case 'k':  case 'l':
			case 'm':  case 'n':  case 'o':  case 'p':
			case 'q':  case 'r':  case 's':  case 't':
			case 'u':  case 'v':  case 'w':  case 'x':
			case 'y':  case 'z':
			{
				matchRange('a','z');
				break;
			}
			case '0':  case '1':  case '2':  case '3':
			case '4':  case '5':  case '6':  case '7':
			case '8':  case '9':
			{
				matchRange('0','9');
				break;
			}
			case '_':
			{
				match('_');
				break;
			}
			default:
			{
				break _loop202;
			}
			}
		} while (true);
		}
		_saveIndex=text.length();
		match('"');
		text.setLength(_saveIndex);
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
/**
 * Number-literal parsing is tricky, because you might have an integer, a
 * decimal number, or a simple period ('.') by itself.  This lexer rule handles
 * all three of these options, and sets the token-type appropriately.
 * <p>
 * Note that these numbers are <i>unsigned</i>.  Signed numbers have to be
 * processed separately.
 */
	public final void mNUM_LITERAL_OR_SYMBOL(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = NUM_LITERAL_OR_SYMBOL;
		int _saveIndex;
		
		switch ( LA(1)) {
		case '0':  case '1':  case '2':  case '3':
		case '4':  case '5':  case '6':  case '7':
		case '8':  case '9':
		{
			{
			int _cnt205=0;
			_loop205:
			do {
				if (((LA(1) >= '0' && LA(1) <= '9'))) {
					matchRange('0','9');
				}
				else {
					if ( _cnt205>=1 ) { break _loop205; } else {throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());}
				}
				
				_cnt205++;
			} while (true);
			}
			_ttype = INT_LITERAL;
			{
			switch ( LA(1)) {
			case 'L':
			{
				{
				_saveIndex=text.length();
				match('L');
				text.setLength(_saveIndex);
				_ttype = LONG_LITERAL;
				}
				break;
			}
			case '.':
			{
				{
				match('.');
				_ttype = DEC_LITERAL;
				{
				_loop210:
				do {
					if (((LA(1) >= '0' && LA(1) <= '9'))) {
						matchRange('0','9');
					}
					else {
						break _loop210;
					}
					
				} while (true);
				}
				{
				if ((LA(1)=='F'||LA(1)=='f')) {
					{
					switch ( LA(1)) {
					case 'f':
					{
						_saveIndex=text.length();
						match('f');
						text.setLength(_saveIndex);
						break;
					}
					case 'F':
					{
						_saveIndex=text.length();
						match('F');
						text.setLength(_saveIndex);
						break;
					}
					default:
					{
						throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());
					}
					}
					}
					_ttype = FLOAT_LITERAL;
				}
				else {
				}
				
				}
				}
				break;
			}
			default:
				{
				}
			}
			}
			break;
		}
		case '.':
		{
			match('.');
			_ttype = PERIOD;
			{
			if (((LA(1) >= '0' && LA(1) <= '9'))) {
				{
				matchRange('0','9');
				}
				_ttype = DEC_LITERAL;
				{
				_loop216:
				do {
					if (((LA(1) >= '0' && LA(1) <= '9'))) {
						matchRange('0','9');
					}
					else {
						break _loop216;
					}
					
				} while (true);
				}
				{
				if ((LA(1)=='F'||LA(1)=='f')) {
					{
					switch ( LA(1)) {
					case 'f':
					{
						_saveIndex=text.length();
						match('f');
						text.setLength(_saveIndex);
						break;
					}
					case 'F':
					{
						_saveIndex=text.length();
						match('F');
						text.setLength(_saveIndex);
						break;
					}
					default:
					{
						throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());
					}
					}
					}
					_ttype = FLOAT_LITERAL;
				}
				else {
				}
				
				}
			}
			else {
			}
			
			}
			break;
		}
		default:
		{
			throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());
		}
		}
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mSTRING_LITERAL(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = STRING_LITERAL;
		int _saveIndex;
		
		_saveIndex=text.length();
		match('\'');
		text.setLength(_saveIndex);
		{
		_loop222:
		do {
			if ((_tokenSet_0.member(LA(1)))) {
				{
				match(_tokenSet_0);
				}
			}
			else {
				break _loop222;
			}
			
		} while (true);
		}
		_saveIndex=text.length();
		match('\'');
		text.setLength(_saveIndex);
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	
	private static final long[] mk_tokenSet_0() {
		long[] data = { -549755823105L, -1L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_0 = new BitSet(mk_tokenSet_0());
	
	}
