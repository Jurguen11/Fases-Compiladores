package visitor;

import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class MethodTable {
    public class method {
        private String name;
        private String type;
        private int level;
        private String retorno;
        private ArrayList<String> listaTipos;
        private ParserRuleContext body;
        private int pasadas=0;

        public method(String n, String t, int l, ArrayList lista, String r) {
            this.name = n;
            this.type = t;
            this.level = l;
            this.listaTipos = lista;
            this.retorno = r;
        }

        public int getPasadas() {
            return pasadas;
        }

        public void setPasadas() {
            this.pasadas=this.pasadas+1;
        }

        public int getLevel() {
            return level;
        }

        public String getName() {
            return name;
        }

        public String getType() {
            return type;
        }

        public ParserRuleContext getBody(){return this.body; }

        public int getTParametros() {
            return listaTipos.size();
        }

        public ArrayList getParametros() {
            return listaTipos;
        }

        public String getRetorno() {
            return this.retorno;
        }

        @Override
        public String toString(){
            return "ID:"+this.name+",Type:"+this.type+",Level:"+this.level+",Parametros:"+this.listaTipos +",Return:"+this.retorno;
        }
    }

    private int actualLevel = 0;
    private LinkedList<method> table = new LinkedList<method>();

    /**
     * Agrega un identificador a la Tabla
     */
    public int enter(String id, String t, ArrayList lista, String r) {
        if (!this.exists(id,actualLevel)) {
            table.add(new method(id, t, actualLevel, lista, r));
            return 0; //means id was succesfully inserted in table
        }
        else
            return 1; //means id exists already in table
    }


    private boolean exists(String id, int level){
        for (Iterator i = table.descendingIterator(); i.hasNext(); ) {
            method aux = (method) i.next();
            if (aux.getName().equals(id))
                return true;
            if (aux.getLevel() != level)
                break;
        }
        return false;
    }

    /**
     * Devuelve un identificador de la tabla. Retorna null
     * cuando el identificador no se encuentra en la tabla
     */
    public method retrieve(String id) {
        for (Iterator i = table.descendingIterator(); i.hasNext(); ) {
            method aux = (method) i.next();
            if ( aux.getName().equals(id) )
                return aux;
        }
        return null;
    }

    /**
     * Agrega un nuevo nivel de identificadores a la tabla
     * El más “profundo”
     */
    public void openScope() {
        this.actualLevel++;
    }

    /**
     * Elimina el más profundo nivel de identificadores de la tabla.
     * Se borran todos los campos de la tabla asociados con el nivel
     */
    public void closeScope() {
        for (int i=table.size()-1; i >= 0; i--)
            if (table.get(i).getLevel()==this.actualLevel) {
                table.remove(i);
            }
        this.actualLevel--;
    }
    @Override
    public String toString() {
        String result="";
        for (Iterator i = table.descendingIterator(); i.hasNext(); )
            result += i.next().toString()+"\n";
        return result;
    }

}
