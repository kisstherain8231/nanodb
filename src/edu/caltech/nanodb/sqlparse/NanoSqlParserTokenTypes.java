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

public interface NanoSqlParserTokenTypes {
	int EOF = 1;
	int NULL_TREE_LOOKAHEAD = 3;
	int ADD = 4;
	int ALL = 5;
	int ALTER = 6;
	int ANALYZE = 7;
	int AND = 8;
	int ANY = 9;
	int AS = 10;
	int ASC = 11;
	int AVG = 12;
	int BEGIN = 13;
	int BETWEEN = 14;
	int BY = 15;
	int COLUMN = 16;
	int COMMIT = 17;
	int CONSTRAINT = 18;
	int COUNT = 19;
	int CREATE = 20;
	int CROSS = 21;
	int DEFAULT = 22;
	int DELETE = 23;
	int DESC = 24;
	int DISTINCT = 25;
	int DROP = 26;
	int EXISTS = 27;
	int EXIT = 28;
	int EXPLAIN = 29;
	int FALSE = 30;
	int FOREIGN = 31;
	int FROM = 32;
	int FULL = 33;
	int IF = 34;
	int IN = 35;
	int INDEX = 36;
	int INNER = 37;
	int INSERT = 38;
	int INTO = 39;
	int IS = 40;
	int JOIN = 41;
	int KEY = 42;
	int LEFT = 43;
	int LIKE = 44;
	int MAX = 45;
	int MIN = 46;
	int NATURAL = 47;
	int NOT = 48;
	int NULL = 49;
	int ON = 50;
	int OPTIMIZE = 51;
	int OR = 52;
	int ORDER = 53;
	int OUTER = 54;
	int PRIMARY = 55;
	int QUIT = 56;
	int REFERENCES = 57;
	int RENAME = 58;
	int RIGHT = 59;
	int ROLLBACK = 60;
	int SELECT = 61;
	int SET = 62;
	int SIMILAR = 63;
	int SOME = 64;
	int START = 65;
	int STDDEV = 66;
	int SUM = 67;
	int TABLE = 68;
	int TO = 69;
	int TRANSACTION = 70;
	int TRUE = 71;
	int UNIQUE = 72;
	int UNKNOWN = 73;
	int UPDATE = 74;
	int USING = 75;
	int VALUES = 76;
	int VARIANCE = 77;
	int VERBOSE = 78;
	int VERIFY = 79;
	int VIEW = 80;
	int WHERE = 81;
	int WORK = 82;
	int TYPE_BIGINT = 83;
	int TYPE_BLOB = 84;
	int TYPE_CHAR = 85;
	int TYPE_CHARACTER = 86;
	int TYPE_DATE = 87;
	int TYPE_DATETIME = 88;
	int TYPE_DECIMAL = 89;
	int TYPE_FLOAT = 90;
	int TYPE_DOUBLE = 91;
	int TYPE_INT = 92;
	int TYPE_INTEGER = 93;
	int TYPE_NUMERIC = 94;
	int TYPE_TEXT = 95;
	int TYPE_TIME = 96;
	int TYPE_TIMESTAMP = 97;
	int TYPE_VARCHAR = 98;
	int TYPE_VARYING = 99;
	int INT_LITERAL = 100;
	int LONG_LITERAL = 101;
	int FLOAT_LITERAL = 102;
	int DEC_LITERAL = 103;
	int PERIOD = 104;
	int SEMICOLON = 105;
	int IDENT = 106;
	int QUOTED_IDENT = 107;
	int TEMPORARY = 108;
	int LPAREN = 109;
	int COMMA = 110;
	int RPAREN = 111;
	int GROUP = 112;
	int HAVING = 113;
	int STAR = 114;
	int EQUALS = 115;
	int NOT_EQUALS = 116;
	int GRTR_THAN = 117;
	int LESS_THAN = 118;
	int GRTR_EQUAL = 119;
	int LESS_EQUAL = 120;
	int PLUS = 121;
	int MINUS = 122;
	int SLASH = 123;
	int PERCENT = 124;
	int STRING_LITERAL = 125;
	int COLON = 126;
	int NEWLINE = 127;
	int WS = 128;
	int COMMENT = 129;
	int COMPARE_OPERATOR = 130;
	int NUM_LITERAL_OR_SYMBOL = 131;
}
