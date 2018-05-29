import java_cup.runtime.Symbol;
%%
%{
	public static int linea = 1;
	public static int pos = 0;	
%}

%cup
%full
%line
%char
%ignorecase
%eofval{
	return new Symbol(sym.EOF, new String ("EOF"));
%eofval}
%%

"class"					{return new Symbol(sym.CLASS, new String(yytext()));}
"public"				{return new Symbol(sym.PUBLIC, new String(yytext()));}
"private"				{return new Symbol(sym.PRIVATE, new String(yytext()));}
"protected"				{return new Symbol(sym.PROTECTED, new String(yytext()));}
"void"					{return new Symbol(sym.VOID, new String(yytext()));}
"byte"					{return new Symbol(sym.BYTE, new String(yytext()));}
"short"					{return new Symbol(sym.SHORT, new String(yytext()));}
"int"					{return new Symbol(sym.INT, new String(yytext()));}
"long"					{return new Symbol(sym.LONG, new String(yytext()));}
"boolean"				{return new Symbol(sym.BOOLEAN, new String(yytext()));}
"String"				{return new Symbol(sym.STRING, new String(yytext()));}
"float"					{return new Symbol(sym.FLOAT, new String(yytext()));}
"double"				{return new Symbol(sym.DOUBLE, new String(yytext()));}
"true"					{return new Symbol(sym.TRUE, new String(yytext()));}
"false"					{return new Symbol(sym.FALSE, new String(yytext()));}
"return"				{return new Symbol(sym.RETURN, new String(yytext()));}
"if"					{return new Symbol(sym.IF, new String(yytext()));}			
"else"					{return new Symbol(sym.ELSE, new String(yytext()));}
"{"						{return new Symbol(sym.LCBRACKET, new String(yytext()));}
"}"						{return new Symbol(sym.RCBRACKET, new String(yytext()));}
","						{return new Symbol(sym.COMMA, new String(yytext()));}
";"						{return new Symbol(sym.SEMI, new String(yytext()));}
"%"						{return new Symbol(sym.MOD, new String(yytext()));}
"+"						{return new Symbol(sym.PLUS, new String(yytext()));}
"-"						{return new Symbol(sym.MINUS, new String(yytext()));}
"*"						{return new Symbol(sym.TIMES, new String(yytext()));}
"/"						{return new Symbol(sym.DIVIDE, new String(yytext()));}
"%"						{return new Symbol(sym.MOD, new String(yytext()));}
"&&"					{return new Symbol(sym.AND, new String(yytext()));}
"||"					{return new Symbol(sym.OR, new String(yytext()));}
"!"						{return new Symbol(sym.NOT, new String(yytext()));}
"<"						{return new Symbol(sym.LESS, new String(yytext()));}
"<="					{return new Symbol(sym.LESSEQ, new String(yytext()));}
">"						{return new Symbol(sym.GREATER, new String(yytext()));}
">="					{return new Symbol(sym.GREATEREQ, new String(yytext()));}
"<>"					{return new Symbol(sym.DIFF, new String(yytext()));}
"=="					{return new Symbol(sym.EQUALS, new String(yytext()));}
"("						{return new Symbol(sym.LPAREN, new String(yytext()));}
")"						{return new Symbol(sym.RPAREN, new String(yytext()));}
"="						{return new Symbol(sym.ASSIGN, new String(yytext()));}
[a-zA-Z]+[a-zA-Z0-9_]*	{return new Symbol(sym.ID, new String(yytext())); }
0|([1-9][0-9]*)			{return new Symbol(sym.NUMBER, new Integer(yytext()));}
\"[ -!#-¡]*\"			{return new Symbol(sym.STRING_VALUE, new String(yytext())); }
[\t\r\n\l ]				{}
.						{System.out.println("Caracter no válido "+ yytext()); }