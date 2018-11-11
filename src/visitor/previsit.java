package visitor;

import com.sun.org.apache.xml.internal.resolver.readers.ExtendedXMLCatalogReader;
import generated.MiParser;
import generated.MiParserBaseVisitor;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Hashtable;

public class previsit extends MiParserBaseVisitor{

//Faltantes
//Funcion de errores

//previsita clases y metodos
//Funciones llama solo el tipo en los parametros
//Las clases debe tener cuidado ya que a.b.c
//donde a es una varable de clase de ca se debe ir a buscar el tipo class
//ver el tipo de b y debe ser clase por el punto esto en la tabla debe de llavarlo ligado
//return de metodos
//mETER CTX EN METODOS.

    private SymbolTable ST; //variables
    private ConstTable CT; //constantes
    private ClassTable CLT; //clases
    private MethodTable MT;//Metodos


    private class auxiliar{
        private String t;
        private String id;
        private ArrayList<String> lista;
        private Hashtable<String,String> atributos;
        private String value;

        public auxiliar(){}
        public auxiliar(String t){
            this.t=t;
        }

        private void setId(String c){
            this.id=c;
        }
        private void setType(String c){
            this.t=c;
        }
        private void setLista(ArrayList l){
            this.lista=l;
        }
        private void setListaAtributos(Hashtable l){
            this.atributos=l;
        }
        private void setValue(String v){this.value=v; }

        private String getValue(){return this.value; }
        private Hashtable getListaAtributos(){
            return this.atributos;
        }
        private ArrayList<String> getLista(){
            return lista;
        }
        private String getType(){
            return this.t;
        }
        private  String getId(){
            return this.id;
        }
    }
    public void agregarPredefinidas(){
        ArrayList<String> l=new ArrayList<>();
        l.add("Array");
        MT.enter("len","int",l,"int");
        l=new ArrayList<>();
        l.add("char");
        MT.enter("ord","int",l,"int");
        l=new ArrayList<>();
        l.add("int");
        MT.enter("chr","char",l,"char");
    }

    public previsit() {
        this.ST = new SymbolTable();
        this.CT = new ConstTable();
        this.CLT = new ClassTable();
        this.MT = new MethodTable();

    }

    public SymbolTable getST(){return this.ST;}
    public ClassTable getCLT(){return this.CLT;}
    public ConstTable getCT(){return this.CT;}
    public MethodTable getMT(){return this.MT;}

    @Override public Object visitProgramAST(MiParser.ProgramASTContext ctx) {
        for (int i=0; i <= ctx.declaration().size()-1;i++){
            int result=(int)visit(ctx.declaration(i));
            if(result==0){
                System.out.println("Errores Sintacticos en declaracion de variables");
                return 0;
            }
        }
        agregarPredefinidas();
        for (int i=0; i <= ctx.methodDecl().size()-1;i++){
            int result=(Integer) visit(ctx.methodDecl(i));

            if(result==0){
                System.out.println("Errores Sintacticos en la declaracion de metodos");
                return 0;
            }
        }
        System.out.println("Constantes PRE");
        System.out.println(CT.toString());
        System.out.println("Variables PRE");
        System.out.println(ST.toString());
        System.out.println("Clases PRE");
        System.out.println(CLT.toString());
        System.out.println("Metodos PRE");
        System.out.println(MT.toString());


        //corriendo checker

        return null;
    }

    @Override public Object visitConstDeclAST(MiParser.ConstDeclASTContext ctx) {
        auxiliar tipo= (auxiliar) visit(ctx.constDecl());
        if( tipo.getType().equals("char") | tipo.getType().equals("int"))
        {
            this.CT.enter(tipo.getId(),tipo.getType(),tipo.getValue());
            return 1;
        }
        else{
            return 0;
            //funcion de errores
        }
    }

    @Override public Object visitVarDeclAST(MiParser.VarDeclASTContext ctx) {
        auxiliar tipo=(auxiliar) visit(ctx.varDecl());
        //System.out.println(tipo.getSymbol()+tipo.getSymbol()+"Vamos con esta");
        if( tipo.getType().equals("char") | tipo.getType().equals("int")
                | tipo.getType().equals("float") |  tipo.getType().equals("bool")
                | tipo.getType().equals("string")  )
        {
            for(int i=0 ; i <= tipo.lista.size()-1;i++){
                if(CT.retrieve(tipo.lista.get(i))!=null) {
                    //-------------------------------------------------------------------------------------------------------
                    //Error no puede cambiar el valor de una variable constante
                    System.out.println("Error variable es constante");
                    return 0;
                }
                else{
                    if (ctx.getText().contains("[]"))
                    {
                        if (ST.enter(tipo.getLista().get(i), tipo.getType(), true)!=0){
                            //-------------------------------------------------------------------------------------------------------
                            //Error ya inicializada
                            System.out.println("Error variable ya inicializada");
                            return 0;
                        }
                    }
                    else {
                        if (ST.enter(tipo.getLista().get(i), tipo.getType(), false)!=0) {
                            //-------------------------------------------------------------------------------------------------------
                            //Error no esta variable esta inicializada
                            System.out.println("Error variable ya inicializada");
                            return 0;
                        }
                    }
                }

            }
            return 1;
        }
        else{
            //-------------------------------------------------------------------------------------------------------
            //Error no existe el tipo
            System.out.println("Error no existe el tipo:");
            return 0;
        }
    }

    @Override public Object visitClassDeclAST(MiParser.ClassDeclASTContext ctx) {
        auxiliar a = (auxiliar) visit(ctx.classDecl());
        if(a!=null){
            this.CLT.enter(a.getId(),a.getListaAtributos());
            return 1;
        }
        else{
            //Error ---------------------------------------------------------------------------------------------
            return 0;
        }

    }

    //Insercion en tabla de variables constantes.
    @Override public Object visitConstDeclarationNumCharAST(MiParser.ConstDeclarationNumCharASTContext ctx) {
        Token tipo = (Token) visit(ctx.type());
        auxiliar a = new auxiliar(tipo.getText());
        a.setId(ctx.ID().getText());
        if(ctx.NUM()!=null){
            a.setValue(ctx.NUM().getText());
        }
        else if(ctx.CHAR_CONST()!=null){
            a.setValue(ctx.CHAR_CONST().getText());
        }
        return a;
    }


//declaracion de variables
    @Override public Object visitVarDeclarationVarAST(MiParser.VarDeclarationVarASTContext ctx) {
        Token tipo=(Token) visit(ctx.type());
        auxiliar a=new auxiliar(tipo.getText());
        ArrayList<String> lista=new ArrayList<String>();
        for (int i=0; i <= ctx.ID().size()-1;i++){
            lista.add(ctx.ID().get(i).getText());
        }
        a.setLista(lista);
        return a;

    }
//Declaracion de clases
    @Override public Object visitClassDeclarationClassAST(MiParser.ClassDeclarationClassASTContext ctx) {
        auxiliar a=new auxiliar();
        String[] arreglo=new String[2]; //id,[tipo,valor]
        Hashtable<String,String[]> listaAtributos= new Hashtable();

        for (int i=0; i <= ctx.varDecl().size()-1;i++) {
            a = (auxiliar) visit(ctx.varDecl(i));
            for (int j=0; j <= a.getLista().size()-1; j++){
                arreglo[0]=a.getType();
                listaAtributos.put(a.getLista().get(j),arreglo);
            }
        }
        a.setId(ctx.ID().getText());
        a.setListaAtributos(listaAtributos);
        return a;
    }

    @Override public Object visitMethodDeclarationAST(MiParser.MethodDeclarationASTContext ctx) {

        String type="";
        String retorno = "";
        if (ctx.getText().contains("void")){
            type= "void";
            retorno="";
        }
        else{
            Token tipo=(Token) visit(ctx.type());
            if( tipo.getText().equals("char") | tipo.getText().equals("int")
                    | tipo.getText().equals("float") |  tipo.getText().equals("bool")
                    | tipo.getText().equals("string"))
            {

                retorno=tipo.getText();
                type=tipo.getText();
            }
        }
        if(ctx.formPars()!=null){
            auxiliar a=(auxiliar) visit(ctx.formPars());
            if(a!=null) {
                MT.enter(ctx.ID().getText(),type,a.getLista(),retorno);
                return 1;
            }
            else{
                //Error -------------------------------------------------------
                return 0;
            }
        }
        else{
            MT.enter(ctx.ID().getText(),type,new ArrayList(),retorno);
            return 1;
        }
    }

    @Override public Object visitFormParsAST(MiParser.FormParsASTContext ctx) {
        auxiliar a = new auxiliar();
        Token tipo;
        ArrayList<String> lista=new ArrayList();
        for (int i=0; i <= ctx.type().size()-1;i++) {
            tipo=(Token) visit(ctx.type(i));
            if( tipo.getText().equals("char") | tipo.getText().equals("int")
                    | tipo.getText().equals("float") |  tipo.getText().equals("bool")
                    | tipo.getText().equals("string"))
            {
                lista.add(tipo.getText());
            }
            else{
                System.out.println("Error de tipos");
                return null;
            }
        }
        a.setLista(lista);
        return a;
    }

    @Override public Object visitTypeAST(MiParser.TypeASTContext ctx) {
        return ctx.ID().getSymbol();
    }
    @Override public Object visitDesignatorStatementAST(MiParser.DesignatorStatementASTContext ctx) { return null; }
    @Override public Object visitIfAST(MiParser.IfASTContext ctx) { return null; }
    @Override public Object visitForAST(MiParser.ForASTContext ctx) { return null; }
    @Override public Object visitWhileAST(MiParser.WhileASTContext ctx) { return null; }
    @Override public Object visitBreakAST(MiParser.BreakASTContext ctx) { return null; }
    @Override public Object visitReturnAST(MiParser.ReturnASTContext ctx) { return null; }
    @Override public Object visitReadAST(MiParser.ReadASTContext ctx) { return null; }
    @Override public Object visitWriteAST(MiParser.WriteASTContext ctx) { return null; }
    @Override public Object visitBlockStatementAST(MiParser.BlockStatementASTContext ctx) { return null; }
    @Override public Object visitPcAST(MiParser.PcASTContext ctx) { return null; }
    @Override public Object visitBlocAST(MiParser.BlocASTContext ctx) { return null; }
    @Override public Object visitActParsAST(MiParser.ActParsASTContext ctx) { return null; }
    @Override public Object visitConditionAST(MiParser.ConditionASTContext ctx) { return null; }
    @Override public Object visitCondTermAST(MiParser.CondTermASTContext ctx) { return null; }
    @Override public Object visitCondFactAST(MiParser.CondFactASTContext ctx) { return null; }
    @Override public Object visitExpressionAST(MiParser.ExpressionASTContext ctx) { return null; }
    @Override public Object visitTermASt(MiParser.TermAStContext ctx) { return null; }
    @Override public Object visitDesignatorFactorAST(MiParser.DesignatorFactorASTContext ctx) { return null; }
    @Override public Object visitNumAST(MiParser.NumASTContext ctx) { return null; }
    @Override public Object visitCharAST(MiParser.CharASTContext ctx) { return null; }
    @Override public Object visitBoolAST(MiParser.BoolASTContext ctx) { return null; }
    @Override public Object visitNewAAST(MiParser.NewAASTContext ctx) { return null; }
    @Override public Object visitPepAST(MiParser.PepASTContext ctx) { return null; }
    @Override public Object visitDesignatorAST(MiParser.DesignatorASTContext ctx) { return null; }
    @Override public Object visitRelopEEAST(MiParser.RelopEEASTContext ctx) { return null; }
    @Override public Object visitRelopDEAST(MiParser.RelopDEASTContext ctx) { return null; }
    @Override public Object visitRelopGREATERAST(MiParser.RelopGREATERASTContext ctx) { return null; }
    @Override public Object visitRelopGEAST(MiParser.RelopGEASTContext ctx) { return null; }
    @Override public Object visitRelopLESSAST(MiParser.RelopLESSASTContext ctx) { return null; }
    @Override public Object visitRelopLEAST(MiParser.RelopLEASTContext ctx) { return null; }
    @Override public Object visitAddopPLUSAST(MiParser.AddopPLUSASTContext ctx) { return null; }
    @Override public Object visitAddopSUBAST(MiParser.AddopSUBASTContext ctx) { return null; }
    @Override public Object visitMulopMultAST(MiParser.MulopMultASTContext ctx) { return null; }
    @Override public Object visitMulopDIVAST(MiParser.MulopDIVASTContext ctx) { return null; }
    @Override public Object visitMulopPERCENTAST(MiParser.MulopPERCENTASTContext ctx) { return null; }
}
