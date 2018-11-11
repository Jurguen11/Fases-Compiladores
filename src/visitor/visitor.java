package visitor;

import com.sun.org.apache.xml.internal.resolver.readers.ExtendedXMLCatalogReader;
import generated.MiParser;
import generated.MiParserBaseVisitor;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Hashtable;


//Faltantes
//Funcion de errores

//previsita clases y metodos
//Funciones llama solo el tipo en los parametros
//Las clases debe tener cuidado ya que a.b.c
//donde a es una varable de clase de ca se debe ir a buscar el tipo class
//ver el tipo de b y debe ser clase por el punto esto en la tabla debe de llavarlo ligado
//return de metodos

//CREAR UNA LISTA PARA ERRORES QUE SEA LEIDA E IMPRIDA POR EL EDITOR DE TEXTO
public class visitor extends previsit {
    private ArrayList<String> listaErrores = new ArrayList<>();
    private SymbolTable ST; //variables
    private ConstTable CT; //constantes
    private ClassTable CLT; //clases
    private MethodTable MT;//Metodos
    private int errores;
    public visitor(){
    }
    public void setVariables(SymbolTable ST,ConstTable CT, ClassTable CLT,MethodTable MT){
        this.CLT = CLT;
        this.CT = CT;
        this.ST = ST;
        this.MT = MT;
        this.errores=0;
    }
    public ArrayList<String> getListaErrores(){
        return listaErrores;
    }
    private class auxiliar{
        private String t;
        private String id;
        private String value;
        private String tabla;
        private ArrayList<String> lista;
        private Hashtable<String,String[]> atributos;
        private boolean arreglo;

        //constructor
        public auxiliar(){}
        public auxiliar(String t){
            this.t=t;
        }

        // set
        private void setArreglo(boolean a){this.arreglo=a; }
        private void setTabla(String t){this.tabla=t; }
        private void setValue(String v){this.value=v; }
        private void setId(String c){
            this.id=c;
        }
        private void setType(String c){
            this.t=c;
        }
        private void setLista(ArrayList l){
            this.lista=l;
        }
        private void setListaAtributos(Hashtable l){ this.atributos=l;}
        //get
        private boolean getArreglo(){return this.arreglo; }
        private String getTabla(){return this.tabla; }
        private Hashtable<String,String[]> getListaAtributos(){
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
        private String getValue(){return this.value; }
    }

    @Override public Object visitProgramAST(MiParser.ProgramASTContext ctx) {

        for (int i=0; i <= ctx.declaration().size()-1;i++){
            int result=(int)visit(ctx.declaration(i));
            if(result==0){
                System.out.println("Errores Sintacticos en declaracion de variables");
                //return this.errores=this.errores+1;
            }
        }
        System.out.println("------------------------------- 1 ---------------------------------");
        System.out.println("Constantes");
        System.out.println(CT.toString());
        System.out.println("Variables");
        System.out.println(ST.toString());
        System.out.println("Clases");
        System.out.println(CLT.toString());
        System.out.println("Metodos");
        System.out.println(MT.toString());
        for (int i=0; i <= ctx.methodDecl().size()-1;i++){
            int result=(Integer) visit(ctx.methodDecl(i));

            if(result==0){
                System.out.println("Errores Sintacticos en la declaracion de metodos");
                //return this.errores=this.errores+1;
            }
        }
        System.out.println("------------------------------- 2 ---------------------------------");
        System.out.println("Constantes");
        System.out.println(CT.toString());
        System.out.println("Variables");
        System.out.println(ST.toString());
        System.out.println("Clases");
        System.out.println(CLT.toString());
        System.out.println("Metodos");
        System.out.println(MT.toString());
        System.out.println("Errores: " + this.errores);
        return null;
    }

    @Override public Object visitConstDeclAST(MiParser.ConstDeclASTContext ctx) {
        auxiliar tipo= (auxiliar) visit(ctx.constDecl());
        if( tipo.getType().equals("char") | tipo.getType().equals("int"))
        {
            Object value = CT.retrieve(tipo.getId());
            if(value == null){
                this.CT.enter(tipo.getId(),tipo.getType(),tipo.getValue());
                return 1;
            }
            else {
                if(((ConstTable.Symbol) value).getPasadas()==0 & ((ConstTable.Symbol) value).getLevel()==0){
                    ((ConstTable.Symbol) value).setPasadas();
                }
                else{
                    listaErrores.add("La variable "+tipo.getId() +" ya fue declarada");
                    return this.errores=this.errores+1;
                }
                return 1;
            }
        }
        else{
            System.out.println("Error de tipos en declaracion de "+ tipo.getId());
            return this.errores=this.errores+1;
            //funcion de errores
        }
    }

    public int GuardarVariables(auxiliar tipo, ParserRuleContext ctx){

        if( tipo.getType().equals("char") | tipo.getType().equals("int")
                | tipo.getType().equals("float") |  tipo.getType().equals("bool")
                | tipo.getType().equals("string")  |  CLT.retrieve(tipo.getType()) != null)

        {
            for(int i=0 ; i <= tipo.lista.size()-1;i++){
                if(CT.retrieve(tipo.lista.get(i))!=null) {
                    //-------------------------------------------------------------------------------------------------------
                    //Error no puede cambiar el valor de una variable constante
                    System.out.println("No se puede cambiar el valor de la constante "+ tipo.lista.get(i));
                    return this.errores=this.errores+1;
                }
                else{
                    Object value = ST.retrieve(tipo.getLista().get(i));
                    if (ctx.getText().contains("[]") & (tipo.getType().equals("char") | tipo.getType().equals("int")))
                    {
                        if(value == null){
                            if (ST.enter(tipo.getLista().get(i), tipo.getType(), true) != 0){
                                //-------------------------------------------------------------------------------------------------------
                                //Error ya inicializada
                                System.out.println("Error al guardar la variable "+ ((SymbolTable.Symbol) value).getName());
                                return this.errores=this.errores+1;
                            }
                        }
                        else {
                            if( ((SymbolTable.Symbol) value).getPasadas() == 0 & ((SymbolTable.Symbol) value).getLevel()==0){
                                //System.out.println(((SymbolTable.Symbol) value).getName());
                                ((SymbolTable.Symbol) value).setPasadas();
                            }
                            else{
                                System.out.println("La variable "+((SymbolTable.Symbol) value).getName()+ " ya existe declarada en un nivel superior o igual.");
                                return this.errores=this.errores+1;
                            }
                        }
                    }
                    else {
                        if(value == null){
                            if (ST.enter(tipo.getLista().get(i), tipo.getType(), true) != 0){
                                //-------------------------------------------------------------------------------------------------------
                                //Error ya inicializada
                                System.out.println("Error al guardar la variable "+ ((SymbolTable.Symbol) value).getName());
                                return this.errores=this.errores+1;
                            }
                        }
                        else {
                            if( ((SymbolTable.Symbol) value).getPasadas() == 0 & ((SymbolTable.Symbol) value).getLevel()==0){
                                ((SymbolTable.Symbol) value).setPasadas();
                            }
                            else{
                                System.out.println("La variable "+((SymbolTable.Symbol) value).getName()+ " ya existe declarada en un nivel superior o igual.");
                                return this.errores=this.errores+1;
                            }
                        }
                        return 1;
                    }
                }
            }
            return 1;
        }
        else{//-------------------------------------------------------------------------------------------------------
            //Error no existe el tipoSystem.out.println(
            System.out.println("Error no existe el tipo:" + tipo.getType());
            return this.errores = this.errores + 1;

        }
    }
    @Override public Object visitVarDeclAST(MiParser.VarDeclASTContext ctx) {
        auxiliar tipo=(auxiliar) visit(ctx.varDecl());
        int result = GuardarVariables(tipo,ctx);
        return  result;
    }

    @Override public Object visitClassDeclAST(MiParser.ClassDeclASTContext ctx) {
        auxiliar a = (auxiliar) visit(ctx.classDecl());
        if(a!=null){
            Object value = CLT.retrieve(a.getId());
            if(value == null){
                this.CLT.enter(a.getId(), a.getListaAtributos());
                return 1;
            }
            else {
                if(((ClassTable.Class) value).getLevel() == 0 & ((ClassTable.Class) value).getPasadas()==0 ){
                    ((ClassTable.Class) value).setPasadas();
                }
                else if(((ClassTable.Class) value).getLevel() == 0){
                    System.out.println("La clase "+a.getId()+" ya existe");
                    return this.errores=this.errores+1;
                }

            }
            return 1;
        }
        else{
            System.out.println("Error cerca de "+a.getId());
            //Error ---------------------------------------------------------------------------------------------
            return this.errores=this.errores+1;
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
                    | tipo.getText().equals("string") | CLT.retrieve(tipo.getText()) != null)
            {
                retorno=tipo.getText();
                type=tipo.getText();
            }
        }
//Insertando metodos
        if(ctx.formPars()!=null){
            auxiliar a=(auxiliar) visit(ctx.formPars());
            if(a!=null) {
                Object value = MT.retrieve(a.getId());
                if(value == null){
                    MT.enter(ctx.ID().getText(),type,a.getLista(),retorno);
                }
                else{
                    if(((MethodTable.method) value).getLevel() == 0 & ((MethodTable.method) value).getPasadas()==0) {
                        ((MethodTable.method) value).setPasadas();
                    }else{
                        System.out.println("La funcion "+ a.getId()+" ya fue declarada");
                        return this.errores=this.errores+1;
                    }
                }
            }
            else{
                System.out.println("Tipo de dato para "+a.getId()+" no existe");
                //Error -------------------------------------------------------
                return this.errores=this.errores+1;
            }
        }
        //metodod sin parametros
        else{
            Object value = MT.retrieve(ctx.ID().getText());
            if(value == null){
                MT.enter(ctx.ID().getText(),type,new ArrayList(),retorno);
            }
            if(((MethodTable.method) value).getLevel() == 0 & ((MethodTable.method) value).getPasadas()==0) {
                ((MethodTable.method) value).setPasadas();
            }else{
                System.out.println("La funcion "+ ctx.ID().getText()+" ya fue declarada");
                return this.errores=this.errores+1;
            }
        }

        ST.openScope();

        for (int i = 0; i < ctx.varDecl().size(); i++) {
            auxiliar b = (auxiliar) visit(ctx.varDecl(i));
            GuardarVariables(b, ctx);
        }
        visit(ctx.block());

        ST.closeScope();

        return 1;
    }

    @Override public Object visitFormParsAST(MiParser.FormParsASTContext ctx) {
        auxiliar a = new auxiliar();
        Token tipo;
        ArrayList<String> lista=new ArrayList();
        for (int i=0; i <= ctx.type().size()-1;i++) {
            tipo=(Token) visit(ctx.type(i));
            if( tipo.getText().equals("char") | tipo.getText().equals("int")
                    | tipo.getText().equals("float") |  tipo.getText().equals("bool")
                    | tipo.getText().equals("string") | CLT.retrieve(tipo.getText()) != null)
            {
                lista.add(tipo.getText());
            }
            else{
                System.out.println("no existe el tipo"+tipo.getText());
                return this.errores++;
            }
        }
        a.setLista(lista);
        return a;
    }

    @Override public Object visitTypeAST(MiParser.TypeASTContext ctx) {
        return ctx.ID().getSymbol();
    }





















////////////////////////////////////////////////////STATEMENT///////////////////////////////////////////////////////////////////
    @Override public Object visitDesignatorStatementAST(MiParser.DesignatorStatementASTContext ctx) {
        auxiliar a1 = (auxiliar) visit(ctx.designator());
        if(ctx.EQUALS()!=null){
            auxiliar a2=(auxiliar)visit(ctx.expr());
            if( (!a2.getType().equals(a1.getType())) | a2.getArreglo() | a1.getArreglo()){
                System.out.println("Error se asigno un tipo "+a2.getType()+" y "+a1.getId()+" es de tipo "+ a1.getType());
                return this.errores=this.errores+1;
            }
            else{
                if(a1.getTabla().equals("ST")){
                    ST.retrieve(a1.getId()).setValue(a2.getValue());
                }
                else if(a1.getTabla().equals("CT")){
                    System.out.println("No se puede cambiar el valor de una constante");
                    return this.errores=this.errores+1;
                }
            }
        //Para metodos
        } else if(ctx.PARENTL()!=null){
            Object result=MT.retrieve(a1.getId());
            auxiliar a=new auxiliar();
            if(result==null){
                System.out.println("La variable: " +a1.getId() +" no existe");
                return this.errores++;
            }
                //aqui trae una lista de parametros
            try {
                a = (auxiliar) visit(ctx.actPars());
                if (((MethodTable.method) result).getTParametros() != a.getLista().size()) {
                    System.out.println("Los parametros de la funcion " + ((MethodTable.method) result).getName() + " son " + ((MethodTable.method) result).getTParametros() + " y se le estan asignando " + a.getLista().size());
                    return this.errores++;
                } else {
                    for (int i = 0; i < a.getLista().size(); i++) {
                        if (!((MethodTable.method) result).getParametros().get(i).equals(a.getLista().get(i))) {
                            System.out.println("El valor " + ((MethodTable.method) result).getParametros().get(i) + " pero el tipo de la funcion obtiene " +a.getLista().get(i));
                            return this.errores++;
                        }
                    }
                }
            }catch (Exception e){}
            return a;

        } else if(ctx.getText().contains("++")){
            if(!a1.getType().equals("int") | a1.getArreglo()){
                System.out.println("Error se asigno un tipo int y "+a1.getId()+" es de tipo "+ a1.getType());
                return this.errores=this.errores+1;
            }
            else{
                if(a1.getTabla().equals("ST")){
                    ST.retrieve(a1.getId()).setValue(String.valueOf(Integer.parseInt(a1.getValue())+1));
                }
                else if(a1.getTabla().equals("CT")){
                    System.out.println("No se puede cambiar el valor de la constante"+a1.getId());
                    return this.errores=this.errores+1;
                }
            }
        } else if(ctx.getText().contains("--")){
            if(!a1.getType().equals("int") | a1.getArreglo()){
                System.out.println("Error se asigno un tipo int y "+a1.getId()+" es de tipo "+ a1.getType());
                return this.errores=this.errores+1;
            }
            else{
                if(a1.getTabla().equals("ST")){
                    ST.retrieve(a1.getId()).setValue(String.valueOf(Integer.parseInt(a1.getValue())-1));
                }
                else if(a1.getTabla().equals("CT")){
                    System.out.println("No se puede cambiar el valor de la constante "+ a1.getId());
                    return this.errores=this.errores+1;
                }
            }
        } else{
            System.out.println("Error no existe el identificador"+ctx.getText());
            return this.errores=this.errores+1;
        }
        return null;
    }
    @Override public Object visitIfAST(MiParser.IfASTContext ctx) {
        auxiliar result=(auxiliar) visit(ctx.condition());
        if(result.getArreglo()){
            visit(ctx.statement(0));
        }
        else if(ctx.ELSE()!=null){
            visit(ctx.statement(1));
        }
        return null;
    }
    @Override public Object visitForAST(MiParser.ForASTContext ctx) {
        auxiliar a = (auxiliar) visit(ctx.expr());
        try{
            visit(ctx.condition());
        }catch(Exception e){ }
        for (int i=0; i< ctx.statement().size();i++){
            visit(ctx.statement(i));
        }
        return null;
    }

    @Override public Object visitWhileAST(MiParser.WhileASTContext ctx) {
        boolean aux=true;
        while(aux){
            auxiliar a = (auxiliar)visit(ctx.condition());
            aux=a.getArreglo();
            auxiliar b = (auxiliar)visit(ctx.statement());
            if(a.getType().equals("Break")){
                break;
            }
        }
        return null;
    }
    @Override public Object visitBreakAST(MiParser.BreakASTContext ctx) {
        auxiliar a=new auxiliar();
        a.setType("Break");
        return a;
    }
    @Override public Object visitReturnAST(MiParser.ReturnASTContext ctx) {
        auxiliar a=(auxiliar) visit(ctx.expr());
        return a;

    }
    @Override public Object visitReadAST(MiParser.ReadASTContext ctx) {
        auxiliar a=(auxiliar)visit(ctx.designator());
        return a;
    }
    @Override public Object visitWriteAST(MiParser.WriteASTContext ctx) {
        auxiliar a=new auxiliar();
        a = (auxiliar) visit(ctx.expr());
        return null;
    }
    @Override public Object visitBlockStatementAST(MiParser.BlockStatementASTContext ctx) {
        visit(ctx.block());
        return null;
    }
    @Override public Object visitPcAST(MiParser.PcASTContext ctx) {
        auxiliar a=new auxiliar();
        a.setType(";");
        return a;
    }

    @Override public Object visitBlocAST(MiParser.BlocASTContext ctx) {
        auxiliar a =new auxiliar();
        for(int i=0; i < ctx.statement().size(); i++){
             visit(ctx.statement(i));
        }
        return null;
    }


    //Para funciones
    @Override public Object visitActParsAST(MiParser.ActParsASTContext ctx) {
        auxiliar a=new auxiliar();
        ArrayList<String> parametros = new ArrayList<>();

        for (int i = 0;i< ctx.expr().size(); i++){
            a=(auxiliar) visit(ctx.expr(i));
            parametros.add(a.getType());
        }
        a.setLista(parametros);

        return a;
    }

    ///////////////////////////////////////ConditionAST//////////////////////////////////////////////////////
    @Override public Object visitConditionAST(MiParser.ConditionASTContext ctx) {
        auxiliar result =(auxiliar) visit(ctx.condTerm(0));
        if(ctx.OR().size()>0) {
            for (int i = 1; i < ctx.condTerm().size(); i++) {
                auxiliar b = (auxiliar) visit(ctx.condTerm(i));
                if (b.getArreglo() | result.getArreglo()) {
                    result.setArreglo( true);
                } else {
                    result.setArreglo(false);
                }
            }
        }
        return result;
    }
    ////////////////////////////////////////CondTerm AND///////////////////////////////////////////
    @Override public Object visitCondTermAST(MiParser.CondTermASTContext ctx) {
        auxiliar a = (auxiliar) visit(ctx.condFact(0));
        if(ctx.AND().size()>0){
            for(int i=1 ; i<ctx.condFact().size();i++){
            auxiliar b = (auxiliar) visit(ctx.condFact(i));
                if(b.getArreglo() & a.getArreglo()){
                    a.setArreglo(true);
                }
                else{
                    a.setArreglo(false);
                }
            }
        }
        return a;
    }
    ///////////////////////////////////////////CondFact//////////////////////////////////////////
    @Override public Object visitCondFactAST(MiParser.CondFactASTContext ctx) {
        auxiliar a=(auxiliar)visit(ctx.expr(0));
        Token comp=(Token) visit(ctx.relop());
        auxiliar b=(auxiliar)visit(ctx.expr(1));

        if (a.getType().equals(b.getType())){
            if(comp.getText().equals("==")){ //EE
                if(a.getValue().equals(b.getValue())){
                    a.setArreglo(true);
                    return a;
                }else{
                    a.setArreglo(false);
                    return a;
                }
            }else if(comp.getText().equals("!=")){ //DE
                if(! a.getValue().equals(b.getValue())){
                    a.setArreglo(true);
                    return a;
                }else{
                    a.setArreglo(false);
                    return a;
                }
            }else if(comp.getText().equals(">")){  //GREATER
                if( Integer.parseInt(a.getValue()) > Integer.parseInt(b.getValue())){
                    a.setArreglo(true);
                    return a;
                }else{
                    a.setArreglo(false);
                    return a;
                }
            }else if(comp.getText().equals("<")){  //LESS

                if( Integer.parseInt(a.getValue()) < Integer.parseInt(b.getValue())){
                    a.setArreglo(true);
                    return a;
                }else{
                    a.setArreglo(false);
                    return a;
                }
            }else if(comp.getText().equals("<=")){ //LE
                if( Integer.parseInt(a.getValue()) <= Integer.parseInt(b.getValue())){
                    a.setArreglo(true);
                    return a;
                }else{
                    a.setArreglo(false);
                    return a;                }
            }
            else if(comp.getText().equals(">=")){ //GE
                if( Integer.parseInt(a.getValue()) >= Integer.parseInt(b.getValue())){
                    a.setArreglo(true);
                    return a;
                }else{
                    a.setArreglo(false);
                    return a;
                }
            }
            else{
                System.out.println("Ocurrio un error en el cerca de la compracion en "+ctx.getText());
                return this.errores++;
            }
        }
        else{
            System.out.println("Los tipos de la compracion los valores no coinciden"+ ctx.getText());
            return this.errores++;
        }
    }

    //////////////////////////////////////////////////ExpressionAST///////////////////////////////////////
    @Override public Object visitExpressionAST(MiParser.ExpressionASTContext ctx) {
        boolean subInicio=false;
        if(ctx.SUB()!=null){
            subInicio=true;
        }

        auxiliar t=(auxiliar) visit(ctx.term(0));
        for (int i=0; i<ctx.addop().size();i++){
            TerminalNode tadd=(TerminalNode)visit(ctx.addop(i));
            auxiliar t2=(auxiliar) visit(ctx.term(i+1));
            //+
            if( tadd.getText().equals("+") && t2.getType().equals(t.getType())){
                if(t.getType().equals("int")){
                    int v1 = Integer.parseInt(t.getValue());
                    int v2 = Integer.parseInt(t2.getValue());
                    if(subInicio){
                        t.setValue(String.valueOf((- v1 + v2)));
                    }else{
                        t.setValue(String.valueOf((v1 + v2)));
                    }
                } else if (t.getType().equals("char")){
                    t.setValue(t.getValue()+t2.getValue());
                }
            } else if(tadd.getText().equals("-") && t2.getType().equals(t.getType()) && t.getType().equals("int")){ //-
                int v1 = Integer.parseInt(t.getValue());
                int v2 = Integer.parseInt(t2.getValue());
                if(subInicio){
                    t.setValue( String.valueOf( -v1 - v2 ));
                }else{
                    t.setValue( String.valueOf( - v1 - v2 ));
                }
            }
        }
        return t;
    }
    //////////////////////////////////////////////////////TERM AST////////////////////////////////////////////////////////
    @Override public Object visitTermASt(MiParser.TermAStContext ctx) {
        auxiliar t = (auxiliar) visit(ctx.factor(0));
        auxiliar a=new auxiliar();
        //Tipo NUM metodos para hacer operaciones de mult,div y percent
        if(t.getType().equals("int") && t.getValue()!=null){
            int value1 = Integer.parseInt( t.getValue());
            for(int i=0; i < ctx.mulop().size(); i++) {
                int value2;
                TerminalNode operador = (TerminalNode) visit(ctx.mulop(i));
                auxiliar value = (auxiliar) visit(ctx.factor(i + 1));
                if(value.getType().equals("int")){
                    value2 = Integer.parseInt( value.getValue());
                    if (operador.getText().equals("*")) {
                        value1 = value1*value2;
                    } else if (operador.getText().equals("%")) {
                        value1 = value1 % value2;
                    } else if (operador.getText().equals("/")) {
                        value1 = value1 / value2;
                    } else {
                        System.out.println("Error "+ operador.getText()+" operador no existe");
                        return this.errores=this.errores+1;
                    }
                }else{
                    System.out.println("Los tipos"+a.getId()+"no es compatible con"+value.getType());
                    return this.errores=this.errores+1;
                }
                a.setType("int");
                a.setValue(String.valueOf(value1));
                return a;
            }
        }
        //designator-charconst-new-parentL
        return t;
    }
    ////////////////////////////////////////////Factor//////////////////////////////////////////
    @Override public Object visitDesignatorFactorAST(MiParser.DesignatorFactorASTContext ctx) {
        auxiliar a = (auxiliar) visit(ctx.designator());
        if(ctx.PARENTL()!=null){
            auxiliar b=(auxiliar)visit(ctx.actPars());
        }
        return a;
    }
    @Override public Object visitNumAST(MiParser.NumASTContext ctx) {
        auxiliar a=new auxiliar();
        a.setType("int");
        a.setValue(ctx.NUM().getText());
        return a; }
    @Override public Object visitCharAST(MiParser.CharASTContext ctx) {
        auxiliar a=new auxiliar();
        a.setType("char");
        a.setValue(ctx.CHAR_CONST().getText());
        return a; }
    @Override public Object visitBoolAST(MiParser.BoolASTContext ctx) {
        auxiliar a=new auxiliar();
        a.setType("bool");
        if(ctx.FALSE()!=null){
            a.setValue(ctx.FALSE().getText());
            return a;
        }
        else if (ctx.TRUE()!=null){
            a.setValue(ctx.TRUE().getText());
            return a;
        }
        return null;
    }
    @Override public Object visitString(MiParser.StringContext ctx) {
        auxiliar a= new auxiliar();
        a.setValue(ctx.STRING().getText());
        a.setType("string");
        return a;
    }
    @Override public Object visitFloatAST(MiParser.FloatASTContext ctx) {
        auxiliar a =new auxiliar();
        a.setValue(ctx.FLOAT().getText());
        a.setType("float");
        return null;
    }
    @Override public Object visitNewAAST(MiParser.NewAASTContext ctx) {
        auxiliar a=new auxiliar();
        Object result = CLT.retrieve(ctx.ID().getText());
        if(result==null){
            System.out.println("No existe la variable en: "+ctx.ID().getText());
                return this.errores++;
        }
        else {
            a.setType(ctx.ID().getText());
            a.setTabla("ST");
        }
        return a;
    }

    @Override public Object visitPepAST(MiParser.PepASTContext ctx) {
        auxiliar a=(auxiliar) visit(ctx.expr());
        return a;
    }
    ///////////////////////////////////////////////Designator///////////////////////////////////
    @Override public Object visitDesignatorAST(MiParser.DesignatorASTContext ctx) {
        //Recorre la lista ID
        Object result=null;
        if (ctx.ID().size()>1){
            for(int i=1; i<ctx.ID().size();i++){
                //Verifica  si lo siguiente es un .
                if(ctx.DOT().size()>0){
                    result = CLT.retrieve(ctx.ID(0).getText());
                    if(result != null){
                        for(int d=0; d<ctx.DOT().size();d++){
                            if(((ClassTable.Class) result).getContent().get(ctx.ID(i))!=null){

                            }else{
                                System.out.println("El atributo: "+ ctx.ID(i)+" en: "+ ctx.ID(0)+" no existe");
                                return this.errores=this.errores+1;
                            }
                            i++;
                        }
                    }else{
                        System.out.println("El nombre: "+ ctx.ID(0)+" no existe");
                        return this.errores=this.errores+1;
                    }
                }
            }
        } else if(ctx.SBL().size()>0) {
            auxiliar a=new auxiliar();
            for (int d = 0; d < ctx.SBL().size(); d++) {
                 a = (auxiliar) visit(ctx.expr(d));
                 }
            return a;
        } else { //obtiene la variable ya sea const o normal
            auxiliar a=new auxiliar();
            result = CT.retrieve(ctx.ID(0).getText());
            if( result == null ){
                result = ST.retrieve(ctx.ID(0).getText());
                if( result == null){
                    result = CLT.retrieve(ctx.ID(0).getText());
                    if(result==null) {
                        result = MT.retrieve(ctx.ID(0).getText());
                        if(result==null) {
                            System.out.println("No existe la variable: " + ctx.ID(0).getText());
                            return this.errores = this.errores + 1;
                        }
                        else{
                            a.setId(((MethodTable.method) result).getName());
                            a.setLista(((MethodTable.method) result).getParametros());
                            a.setType(((MethodTable.method) result).getType());
                            a.setValue(((MethodTable.method) result).getRetorno());//retorno
                            a.setTabla("MT");
                        }
                    }
                    else{
                        a.setId(((ClassTable.Class) result).getName());
                        a.setListaAtributos(((ClassTable.Class) result).getContent());
                        a.setType("class");
                        a.setTabla("CLT");
                    }
                }
                else{
                    a.setId( ((SymbolTable.Symbol) result).getName());
                    a.setValue(((SymbolTable.Symbol) result).getValue());
                    a.setType(((SymbolTable.Symbol) result).getType());
                    a.setArreglo(((SymbolTable.Symbol) result).getArreglo());
                    a.setTabla("ST");
                }

            }else{
                a.setId(((ConstTable.Symbol) result).getName());
                a.setValue(((ConstTable.Symbol) result).getValue());
                a.setType(((ConstTable.Symbol) result).getType());
                a.setArreglo(false);
                a.setTabla("CT");
            }
            return a;
        }
        return result;
    }

    /////////////////////////////////////////////////////Relop/////////////////////////////////////////
    @Override public Object visitRelopEEAST(MiParser.RelopEEASTContext ctx) { return ctx.EE().getSymbol();}
    @Override public Object visitRelopDEAST(MiParser.RelopDEASTContext ctx) { return ctx.DE().getSymbol(); }
    @Override public Object visitRelopGREATERAST(MiParser.RelopGREATERASTContext ctx) { return ctx.GREATER().getSymbol(); }
    @Override public Object visitRelopGEAST(MiParser.RelopGEASTContext ctx) { return ctx.GE().getSymbol(); }
    @Override public Object visitRelopLESSAST(MiParser.RelopLESSASTContext ctx) { return ctx.LESS().getSymbol(); }
    @Override public Object visitRelopLEAST(MiParser.RelopLEASTContext ctx) { return ctx.LE().getSymbol(); }

    ////////////////////////////////////////////////////////////////addop//////////////////////////////////////
    @Override public Object visitAddopPLUSAST(MiParser.AddopPLUSASTContext ctx) { return ctx.PLUS();}
    @Override public Object visitAddopSUBAST(MiParser.AddopSUBASTContext ctx) { return ctx.SUB();}

    //////////////////////////////////////////////////////////////mulop/////////////////////////////////////
    @Override public Object visitMulopMultAST(MiParser.MulopMultASTContext ctx) { return ctx.MULT();}
    @Override public Object visitMulopDIVAST(MiParser.MulopDIVASTContext ctx) { return ctx.DIV();}
    @Override public Object visitMulopPERCENTAST(MiParser.MulopPERCENTASTContext ctx) { return ctx.PERCENT();}



}
