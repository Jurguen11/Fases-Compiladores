package visitor;

import generated.MiParser;
import org.antlr.v4.runtime.ParserRuleContext;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;

public class ClassTable {

    //Nombew y lista de variables
    public class Class {
        private String name;
        private Hashtable<String,String[]> content; //id,[tipo,valor]
        private int level;
        private int pasadas;
        public Class(String n, Hashtable c, int l) {
            this.name = n;
            this.content = c;
            this.level = l;
        }

        public int getPasadas() {
            return pasadas;
        }

        public void setPasadas() {
            this.pasadas = this.pasadas+1;
        }

        public int getLevel() {
            return level;
        }

        public String getName() {
            return name;
        }

        public Hashtable<String, String[]> getContent() {
            return content;
        }

        @Override
        public String toString(){
            return "ID:"+this.name+",Type:"+this.content+",Level:"+this.level;
        }
    }

    private int actualLevel = 0;
    private LinkedList<Class> table = new LinkedList<Class>();

    /**
     * Agrega un identificador a la Tabla
     */
    public int enter(String id, Hashtable c) {
        if (!this.exists(id)) {
            table.add(new Class(id, c, actualLevel));
            return 0; //means id was succesfully inserted in table
        }
        else
            return 1; //means id exists already in table
    }

    private boolean exists(String id){
        for (Iterator i = table.descendingIterator(); i.hasNext(); ) {
            Class aux = (Class) i.next();
            if (aux.getName().equals(id))
                return true;
            if (aux.getLevel() != actualLevel)
                break;
        }
        return false;
    }

    /**
     * Devuelve un identificador de la tabla. Retorna null
     * cuando el identificador no se encuentra en la tabla
     */
    public Class retrieve(String id) {
        for (Iterator i = table.descendingIterator(); i.hasNext(); ) {
            Class aux = (Class)i.next();
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
