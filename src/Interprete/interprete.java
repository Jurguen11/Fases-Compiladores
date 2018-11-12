package Interprete;

import generated.MiParser;
import generated.MiParserBaseVisitor;
import org.antlr.v4.runtime.Token;


import java.util.ArrayList;

public class interprete extends MiParserBaseVisitor {

    ArrayList<String> listaIntrucciones = new ArrayList<>();
    boolean isGlobal=true;
    /*Todas las instrucciones que utiliza el interprete*/
    class instruccion{
        int linea;
        String params;
        String instruccionNombre;

        public instruccion(int linea,String params, String instruccionNombre) {
            this.linea = linea;
            this.params = params;
            this.instruccionNombre =instruccionNombre;
        }

        public int getLinea() {
            return linea;
        }

        public void setLinea(int linea) {
            this.linea = linea;
        }

        public String getParams() {
            return params;
        }

        public void setParams(String params) {
            this.params = params;
        }

        public String getInstruccionNombre() {
            return instruccionNombre;
        }

        public void setInstruccionNombre(String instruccionNombre) {
            this.instruccionNombre = instruccionNombre;
        }

        @Override
        public String toString() {
            return  + linea  + " " + instruccionNombre + " " + params;
        }
    }

    ArrayList<instruccion> listaIntruccionesGeneradas = new ArrayList<>();
    int linea=0;
    public void agregarInstrucciones() {
        //variable entera
        listaIntrucciones.add("PUSH_LOCAL_I"); //0
        //variable char
        listaIntrucciones.add("PUSH_LOCAL_C"); //1
        //variable global entera
        listaIntrucciones.add("PUSH_GLOBAL_I"); //2
        //variable global char
        listaIntrucciones.add("PUSH_GLOBAL_C"); //3
        //colocar en el tope de la pila valor 0
        listaIntrucciones.add("LOAD_CONST");  //4
        //valor de contenido en la pila
        listaIntrucciones.add("LOAD_FAST"); //5
        //
        listaIntrucciones.add("STORE_FAST"); //6
        //
        listaIntrucciones.add("LOAD_GLOBAL"); //7
        //
        listaIntrucciones.add("CALL_FUNCTION"); //8
        //
        listaIntrucciones.add("RETURN_VALUE"); //9
        //
        listaIntrucciones.add("COMPARE_OP"); //10
        //
        listaIntrucciones.add("BINARY_SUBSTRACT"); //11
        //
        listaIntrucciones.add("BINARY_ADD"); //12
        //
        listaIntrucciones.add("BINARY_MULTIPLY"); //13
        //
        listaIntrucciones.add("BINARY_DIVIDE"); //14
        //
        listaIntrucciones.add("BINARY_AND"); //15
        //
        listaIntrucciones.add("BINARY_OR"); //16
        //
        listaIntrucciones.add("BINARY_MODULO"); //17
        //
        listaIntrucciones.add("JUMP_ABSOLUTE"); //18
        //
        listaIntrucciones.add("JUMP_IF_TRUE"); //19
        //
        listaIntrucciones.add("JUMP_IF_FALSE"); //20
        //
        listaIntrucciones.add("DEF"); //21
        //
        listaIntrucciones.add("STORE_GLOBAL"); //22
    }

    @Override public Object visitProgramAST(MiParser.ProgramASTContext ctx) {
        agregarInstrucciones();
        for (int i=0; i <= ctx.declaration().size()-1;i++){
            visit(ctx.declaration(i));
        }
        for (int i=0; i <= ctx.methodDecl().size()-1;i++) {
            isGlobal=false;
            visit(ctx.methodDecl(i));
        }
        instruccion a = new instruccion(linea,"","END");
        listaIntruccionesGeneradas.add(a);

        for (int i=0; i <= listaIntruccionesGeneradas.size()-1;i++){
            System.out.println(listaIntruccionesGeneradas.get(i));
        }


        return null;
    }



    @Override public Object visitConstDeclAST(MiParser.ConstDeclASTContext ctx) { return null; }

    @Override public Object visitVarDeclAST(MiParser.VarDeclASTContext ctx) {
        Token t= (Token) visit(ctx.varDecl());
        return null;
    }
    @Override public Object visitClassDeclAST(MiParser.ClassDeclASTContext ctx) { return null; }
    @Override public Object visitConstDeclarationNumCharAST(MiParser.ConstDeclarationNumCharASTContext ctx) { return null; }

    @Override public Object visitVarDeclarationVarAST(MiParser.VarDeclarationVarASTContext ctx) {
        Token t = (Token) visit(ctx.type());

        for (int i = 0; i <= ctx.ID().size() - 1; i++) {
            if(isGlobal) {

                if (t.getText().equals("char")) {
                    instruccion a=new instruccion(linea, ctx.ID(i).getText() ,listaIntrucciones.get(3));
                    listaIntruccionesGeneradas.add(a);
                    linea++;
                } else if (t.getText().equals("int")) {
                    instruccion a=new instruccion(linea, ctx.ID(i).getText() ,listaIntrucciones.get(2));
                    listaIntruccionesGeneradas.add(a);
                    linea++;
                }
            }
            else{
                if (t.getText().equals("char")) {
                    instruccion a=new instruccion(linea, ctx.ID(i).getText() ,listaIntrucciones.get(1));
                    listaIntruccionesGeneradas.add(a);
                    linea++;
                } else if (t.getText().equals("int")) {
                    instruccion a=new instruccion(linea, ctx.ID(i).getText() ,listaIntrucciones.get(0));
                    listaIntruccionesGeneradas.add(a);
                    linea++;
                }
            }
        }
        return t;
    }

    @Override public Object visitClassDeclarationClassAST(MiParser.ClassDeclarationClassASTContext ctx) { return null; }
    @Override public Object visitMethodDeclarationAST(MiParser.MethodDeclarationASTContext ctx) {
        instruccion a=new instruccion(linea, ctx.ID().getText() ,listaIntrucciones.get(21));
        listaIntruccionesGeneradas.add(a);
        linea++;
        if (ctx.formPars()!=null){
            visit(ctx.formPars());
        }
        for (int i = 0; i <= ctx.varDecl().size() - 1; i++) {
            visit(ctx.varDecl(i));
        }
        visit(ctx.block());
        return null;
    }
    @Override public Object visitFormParsAST(MiParser.FormParsASTContext ctx) {
        for (int i = ctx.ID().size() - 1; i >= 0; i--) {
            Token t= (Token) visit(ctx.type(i));
            if(t.getText().equals("char")){
                instruccion a=new instruccion(linea, ctx.ID(i).getText() ,listaIntrucciones.get(1));
                listaIntruccionesGeneradas.add(a);
                linea++;
                a=new instruccion(linea, ctx.ID(i).getText() ,listaIntrucciones.get(6));
                listaIntruccionesGeneradas.add(a);
                linea++;
            }
            else if(t.getText().equals("int")){
                instruccion a=new instruccion(linea, ctx.ID(i).getText() ,listaIntrucciones.get(0));
                listaIntruccionesGeneradas.add(a);
                linea++;
                a=new instruccion(linea, ctx.ID(i).getText() ,listaIntrucciones.get(6));
                listaIntruccionesGeneradas.add(a);
                linea++;
            }
        }
        return null;
    }

    //retorno el tipo
    @Override public Object visitTypeAST(MiParser.TypeASTContext ctx) {
        return ctx.ID().getSymbol();
    }

    @Override public Object visitDesignatorStatementAST(MiParser.DesignatorStatementASTContext ctx) {

        String t = (String) visit(ctx.designator());
        if(ctx.EQUALS()!=null) {
            visit(ctx.expr());
            for (int i=0; i < listaIntruccionesGeneradas.size(); i++){
                if(t.equals(listaIntruccionesGeneradas.get(i).getParams())){
                    if(listaIntruccionesGeneradas.get(i).getInstruccionNombre().equals(listaIntrucciones.get(2)) |
                            listaIntruccionesGeneradas.get(i).getInstruccionNombre().equals(listaIntrucciones.get(3))){
                        instruccion a = new instruccion(linea,t,listaIntrucciones.get(22));
                        listaIntruccionesGeneradas.add(a);
                        linea++;
                        break;
                    }
                    else if(listaIntruccionesGeneradas.get(i).getInstruccionNombre().equals(listaIntrucciones.get(0)) |
                            listaIntruccionesGeneradas.get(i).getInstruccionNombre().equals(listaIntrucciones.get(1))){
                        instruccion a = new instruccion(linea,t,listaIntrucciones.get(6));
                        listaIntruccionesGeneradas.add(a);
                        linea++;
                        break;
                    }
                }
            }
        }
        else if(ctx.PP()!=null){
            boolean global=false;
            for (int i=0 ; i < listaIntruccionesGeneradas.size(); i++){
                if(listaIntruccionesGeneradas.get(i).getParams().equals(t)){
                    if(listaIntruccionesGeneradas.get(i).getInstruccionNombre().equals(listaIntrucciones.get(2))){
                        instruccion b = new instruccion(linea,t,listaIntrucciones.get(7));
                        listaIntruccionesGeneradas.add(b);
                        linea++;
                        global=true;
                        System.out.println("Es global");
                        break;
                    }
                    else if(listaIntruccionesGeneradas.get(i).getInstruccionNombre().equals(listaIntrucciones.get(0))){
                        instruccion b = new instruccion(linea,t,listaIntrucciones.get(5));
                        listaIntruccionesGeneradas.add(b);
                        linea++;
                        global=false;
                        System.out.println("Es local");
                        break;
                    }
                }
            }
            instruccion a = new instruccion(linea,String.valueOf(1),listaIntrucciones.get(4));
            listaIntruccionesGeneradas.add(a);
            linea++;
            a = new instruccion(linea,"",listaIntrucciones.get(12));
            listaIntruccionesGeneradas.add(a);
            linea++;
            if(global) {
                a = new instruccion(linea, t, listaIntrucciones.get(22));
                listaIntruccionesGeneradas.add(a);
                linea++;
            }
            else {
                a = new instruccion(linea, t, listaIntrucciones.get(6));
                listaIntruccionesGeneradas.add(a);
                linea++;
            }
        }

        else if(ctx.SS()!= null){
            System.out.println("HOLA");
            boolean global=false;
            for (int i=0 ; i < listaIntruccionesGeneradas.size(); i++){
                if(listaIntruccionesGeneradas.get(i).getParams().equals(t)){
                    if(listaIntruccionesGeneradas.get(i).getInstruccionNombre().equals(listaIntrucciones.get(2))){
                        instruccion b = new instruccion(linea,t,listaIntrucciones.get(7));
                        listaIntruccionesGeneradas.add(b);
                        linea++;
                        global=true;
                        System.out.println("Es global");
                        break;
                    }
                    else if(listaIntruccionesGeneradas.get(i).getInstruccionNombre().equals(listaIntrucciones.get(0))){
                        instruccion b = new instruccion(linea,t,listaIntrucciones.get(5));
                        listaIntruccionesGeneradas.add(b);
                        linea++;
                        global=false;
                        System.out.println("Es local");
                        break;
                    }
                }
            }
            instruccion a = new instruccion(linea,String.valueOf(1),listaIntrucciones.get(4));
            listaIntruccionesGeneradas.add(a);
            linea++;
            a = new instruccion(linea,"",listaIntrucciones.get(11));
            listaIntruccionesGeneradas.add(a);
            linea++;
            if(global) {
                a = new instruccion(linea, t, listaIntrucciones.get(22));
                listaIntruccionesGeneradas.add(a);
                linea++;
            }
            else {
                a = new instruccion(linea, t, listaIntrucciones.get(6));
                listaIntruccionesGeneradas.add(a);
                linea++;
            }
        }
        else{
            int n=(Integer) visit(ctx.actPars());
            instruccion a = new instruccion(linea,String.valueOf(n),listaIntrucciones.get(8));
            listaIntruccionesGeneradas.add(a);
            linea++;
        }
        return null;
    }

    @Override public Object visitIfAST(MiParser.IfASTContext ctx) {
        visit(ctx.condition());

        int aux = linea;
        instruccion a = new instruccion(linea, String.valueOf(linea), listaIntrucciones.get(20));
        listaIntruccionesGeneradas.add(a);
        linea++;
        visit(ctx.statement(0));
        listaIntruccionesGeneradas.get(aux).setParams(String.valueOf(linea-1));

        if(ctx.ELSE()!=null){
            aux = linea;
            a = new instruccion(linea,String.valueOf(linea),listaIntrucciones.get(18));
            listaIntruccionesGeneradas.add(a);
            linea++;
            visit(ctx.statement(1));
            listaIntruccionesGeneradas.get(aux).setParams(String.valueOf(linea-1));
        }
        return null;
    }
    @Override public Object visitForAST(MiParser.ForASTContext ctx) { return null; }
    @Override public Object visitWhileAST(MiParser.WhileASTContext ctx) {
        int aux1 = linea;
        visit(ctx.condition());

        int aux = linea;
        instruccion a = new instruccion(linea, String.valueOf(linea), listaIntrucciones.get(20));
        listaIntruccionesGeneradas.add(a);
        linea++;

        visit(ctx.statement());

        listaIntruccionesGeneradas.get(aux).setParams(String.valueOf(linea));

        a = new instruccion(linea, String.valueOf(linea), listaIntrucciones.get(18));
        listaIntruccionesGeneradas.add(a);
        linea++;

        listaIntruccionesGeneradas.get(linea-1).setParams(String.valueOf(aux1-1));
        return null;
    }
    @Override public Object visitBreakAST(MiParser.BreakASTContext ctx) { return null; }
    @Override public Object visitReturnAST(MiParser.ReturnASTContext ctx) {
        visit(ctx.expr());
        instruccion a = new instruccion(linea,"",listaIntrucciones.get(9));
        listaIntruccionesGeneradas.add(a);
        linea++;
        return null;
    }
    @Override public Object visitReadAST(MiParser.ReadASTContext ctx) { return null; }
    @Override public Object visitWriteAST(MiParser.WriteASTContext ctx) {
        visit(ctx.expr());
        instruccion a = new instruccion(linea,"write",listaIntrucciones.get(7));
        listaIntruccionesGeneradas.add(a);
        linea++;

        a = new instruccion(linea,"0",listaIntrucciones.get(8));
        listaIntruccionesGeneradas.add(a);
        linea++;
        return null;
    }

    @Override public Object visitBlockStatementAST(MiParser.BlockStatementASTContext ctx) {
        visit(ctx.block());
        return null;
    }
    @Override public Object visitPcAST(MiParser.PcASTContext ctx) { return null; }

    @Override public Object visitBlocAST(MiParser.BlocASTContext ctx) {
        for (int i = 0; i <= ctx.statement().size() - 1; i++) {
            visit(ctx.statement(i));
        }
        return null;
    }
    @Override public Object visitActParsAST(MiParser.ActParsASTContext ctx) {
        for(int i = 0; i < ctx.expr().size(); i++) {
            visit(ctx.expr(i));
        }
        return ctx.expr().size();
    }
    @Override public Object visitConditionAST(MiParser.ConditionASTContext ctx) {
        for(int i = 0; i < ctx.condTerm().size();i++){
            visit(ctx.condTerm(i));
            if(i>=1){
                instruccion a = new instruccion(linea,"",listaIntrucciones.get(16));
                listaIntruccionesGeneradas.add(a);
                linea++;
            }
        }
        return null;
    }
    @Override public Object visitCondTermAST(MiParser.CondTermASTContext ctx) {
        for(int i = 0; i < ctx.condFact().size();i++){
            visit(ctx.condFact(i));
            if(i>=1){
                instruccion a = new instruccion(linea,"",listaIntrucciones.get(15));
                listaIntruccionesGeneradas.add(a);
                linea++;
            }
        }
        return null;
    }
    @Override public Object visitCondFactAST(MiParser.CondFactASTContext ctx) {
        visit(ctx.expr(0));
        String t = (String) visit(ctx.relop());
        visit(ctx.expr(1));
        instruccion a = new instruccion(linea,t,listaIntrucciones.get(10));
        listaIntruccionesGeneradas.add(a);
        linea++;
        return null;
    }

    @Override public Object visitExpressionAST(MiParser.ExpressionASTContext ctx) {
        if(ctx.SUB()!=null){
            instruccion a = new instruccion(linea,String.valueOf(-1),listaIntrucciones.get(4));
            listaIntruccionesGeneradas.add(a);
            linea++;
            visit(ctx.term(0));
            a = new instruccion(linea,"",listaIntrucciones.get(13));
            listaIntruccionesGeneradas.add(a);
            linea++;
        }
        else{
            visit(ctx.term(0));
        }
        for(int i = 0; i < ctx.addop().size(); i++) {
            String t = (String) visit(ctx.addop(i ));

            //caragar el operador
            visit(ctx.term(i+1));
            instruccion a=null;
            if(t.equals("+")){
                a = new instruccion(linea,"",listaIntrucciones.get(12));
            }
            else if (t.equals("-")){
                a = new instruccion(linea,"",listaIntrucciones.get(11));
            }
            listaIntruccionesGeneradas.add(a);
            linea++;
        }
        return null;
    }
    @Override public Object visitTermASt(MiParser.TermAStContext ctx) {
        visit(ctx.factor(0));
        for( int i = 0; i < ctx.mulop().size() ; i++){
            String t = (String)visit(ctx.mulop(i));
            //cargar operador
            visit( ctx.factor(i+1));
            instruccion a=null;
            if(t.equals("*")){
                a = new instruccion(linea,"",listaIntrucciones.get(13));
            }
            else if (t.equals("/")){
                a = new instruccion(linea,"",listaIntrucciones.get(14));
            }
            else if(t.equals("%")){
                a = new instruccion(linea,"",listaIntrucciones.get(17));
            }
            listaIntruccionesGeneradas.add(a);
            linea++;
        }
        return null;
    }
    @Override public Object visitDesignatorFactorAST(MiParser.DesignatorFactorASTContext ctx) {
        String t=(String) visit(ctx.designator());
        int n=0;
        if(ctx.actPars()!= null){
            n=(Integer) visit(ctx.actPars());
        }
        for (int i=0; i < listaIntruccionesGeneradas.size(); i++){
            if(t.equals(listaIntruccionesGeneradas.get(i).getParams())){
                if(listaIntruccionesGeneradas.get(i).getInstruccionNombre().equals(listaIntrucciones.get(2)) |
                        listaIntruccionesGeneradas.get(i).getInstruccionNombre().equals(listaIntrucciones.get(3))|
                        listaIntruccionesGeneradas.get(i).getInstruccionNombre().equals(listaIntrucciones.get(21))){

                    instruccion a = new instruccion(linea,t,listaIntrucciones.get(7));
                    listaIntruccionesGeneradas.add(a);
                    linea++;
                    if(listaIntruccionesGeneradas.get(i).getInstruccionNombre().equals(listaIntrucciones.get(21))){
                        a = new instruccion(linea,String.valueOf(n),listaIntrucciones.get(8));
                        listaIntruccionesGeneradas.add(a);
                        linea++;
                    }
                    break;
                }
                else if(listaIntruccionesGeneradas.get(i).getInstruccionNombre().equals(listaIntrucciones.get(0)) |
                        listaIntruccionesGeneradas.get(i).getInstruccionNombre().equals(listaIntrucciones.get(1)) )
                {
                    instruccion a = new instruccion(linea,t,listaIntrucciones.get(5));
                    listaIntruccionesGeneradas.add(a);
                    linea++;
                    break;
                }
            }
        }
        return t;
    }
    @Override public Object visitNumAST(MiParser.NumASTContext ctx) {
        instruccion a = new instruccion(linea,ctx.NUM().getText(),listaIntrucciones.get(4));
        listaIntruccionesGeneradas.add(a);
        linea++;
        return null;
    }
    @Override public Object visitFloatAST(MiParser.FloatASTContext ctx) { return null; }
    @Override public Object visitString(MiParser.StringContext ctx) { return null; }
    @Override public Object visitCharAST(MiParser.CharASTContext ctx) {
        instruccion a = new instruccion(linea,ctx.CHAR_CONST().getText(),listaIntrucciones.get(4));
        listaIntruccionesGeneradas.add(a);
        linea++;
        return null;
    }
    @Override public Object visitBoolAST(MiParser.BoolASTContext ctx) { return null; }
    @Override public Object visitNewAAST(MiParser.NewAASTContext ctx) { return null; }
    @Override public Object visitPepAST(MiParser.PepASTContext ctx) {
        visit(ctx.expr());
        return null;
    }

    @Override public Object visitDesignatorAST(MiParser.DesignatorASTContext ctx) {
        return ctx.getText();
    }

    @Override public Object visitRelopEEAST(MiParser.RelopEEASTContext ctx) {
        return ctx.EE().getText();
    }

    @Override public Object visitRelopDEAST(MiParser.RelopDEASTContext ctx) {
        return ctx.DE().getText();
    }

    @Override public Object visitRelopGREATERAST(MiParser.RelopGREATERASTContext ctx) {
        return ctx.GREATER().getText();
    }

    @Override public Object visitRelopGEAST(MiParser.RelopGEASTContext ctx) {
        return ctx.GE().getText();
    }

    @Override public Object visitRelopLESSAST(MiParser.RelopLESSASTContext ctx) {
        return ctx.LESS().getText();
    }
    @Override public Object visitRelopLEAST(MiParser.RelopLEASTContext ctx) {
        return ctx.LE().getText();
    }
    @Override public Object visitAddopPLUSAST(MiParser.AddopPLUSASTContext ctx) {
        return ctx.PLUS().getText(); }

    @Override public Object visitAddopSUBAST(MiParser.AddopSUBASTContext ctx) {
        return ctx.SUB().getText(); }

    @Override public Object visitMulopMultAST(MiParser.MulopMultASTContext ctx) {
        return ctx.MULT().getText(); }

    @Override public Object visitMulopDIVAST(MiParser.MulopDIVASTContext ctx) {
        return ctx.DIV().getText(); }

    @Override public Object visitMulopPERCENTAST(MiParser.MulopPERCENTASTContext ctx) {
        return ctx.PERCENT().getText();
    }
}
