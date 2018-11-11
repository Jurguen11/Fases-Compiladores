parser grammar MiParser;

options{
    tokenVocab=MiScanner;
}

program: CLASS ID (declaration)*
            KEYL (methodDecl)* KEYR                                             #programAST;

declaration: constDecl              #constDeclAST
            |varDecl                #varDeclAST
            |classDecl              #classDeclAST;

constDecl: CONST type ID EQUALS ( NUM|CHAR_CONST) POINTC                        #constDeclarationNumCharAST;

varDecl: type ID ( COMMA ID )* POINTC                                           #varDeclarationVarAST;

classDecl: CLASS ID KEYL (varDecl)* KEYR                                        #classDeclarationClassAST;

methodDecl: ( type | VOID ) ID PARENTL (formPars)? PARENTR (varDecl)* block     #methodDeclarationAST;

formPars: type ID ( COMMA type ID )*                                            #formParsAST;

type: ID (SBL SBR)?                                                           #typeAST;

statement: designator ( EQUALS expr | PARENTL (actPars)? PARENTR  | PP | SS ) POINTC            #designatorStatementAST
		 |  IF PARENTL condition PARENTR statement (ELSE statement)?                            #ifAST
		 |  FOR PARENTL expr POINTC (condition)? POINTC (statement)? PARENTR statement          #forAST
		 |  WHILE PARENTL condition PARENTR statement                                           #whileAST
		 |  BREAK POINTC                                                                        #breakAST
		 |  RETURN (expr)? POINTC                                                               #returnAST
		 |  READ PARENTL designator PARENTR POINTC                                              #readAST
		 |  WRITE PARENTL expr (COMMA NUM)? PARENTR POINTC                                      #writeAST
		 |  block                                                                               #blockStatementAST
		 |  POINTC                                                                              #pcAST;

block: KEYL ( statement )* KEYR                                                 #blocAST;

actPars: expr (COMMA expr)*                                                     #actParsAST;

condition: condTerm (OR condTerm)*                                              #conditionAST;

condTerm: condFact (AND condFact)*                                              #condTermAST;

condFact: expr relop expr                                                       #condFactAST;

expr: (SUB)? term (addop term)*                                                 #expressionAST;

term: factor (mulop factor)*                                                    #termASt;

factor: designator (  PARENTL (actPars)? PARENTR| )                             #designatorFactorAST
		 |  NUM                                                                 #numAST
		 |  FLOAT                                                               #floatAST
		 |  STRING                                                              #string
		 |  CHAR_CONST                                                          #charAST
		 | (TRUE | FALSE)                                                       #boolAST
		 |  NEW ID                                                              #newAAST
		 |  PARENTL expr PARENTR                                                #pepAST;

designator: ID ( DOT ID | SBL expr SBR )*                                       #designatorAST;

relop: EE                                                               #relopEEAST
| DE                                                                    #relopDEAST
| GREATER                                                               #relopGREATERAST
| GE                                                                    #relopGEAST
| LESS                                                                  #relopLESSAST
| LE                                                                    #relopLEAST;

addop: PLUS                                                             #addopPLUSAST
        |SUB                                                            #addopSUBAST;

mulop: MULT                                                             #mulopMultAST
 |DIV                                                                   #mulopDIVAST
 |PERCENT                                                               #mulopPERCENTAST;


