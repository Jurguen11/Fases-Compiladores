import interfaz.*;

/*import generated.*;
import org.antlr.v4.runtime.*;
import listeners.ErrorListener;
import java.io.FileNotFoundException;
import java.io.IOException;
*/

public class Main {
    public static void main(String[] args){
        Interfaz i= new Interfaz();
        i.setVisible(true);

        /* MiScanner inst = null;
        MiParser myParser = null;
        CharStream input = null; //Es para abrir leer y escribir
        CommonTokenStream tokens = null; //la lista tokens

        try{
            input = CharStreams.fromFileName("test.txt");
            inst = new MiScanner(input);

            //error scanner

            inst.removeErrorListeners();
            inst.addErrorListener(ErrorListener.INSTANCE);

            //---------------------//

            tokens = new CommonTokenStream(inst);
            myParser = new MiParser(tokens);
            myParser.removeErrorListeners();
            myParser.addErrorListener(ErrorListener.INSTANCE);

            myParser.program();

            //errores parser

        }
        catch(FileNotFoundException e){System.out.println("No hay archivo");}
        catch (IOException e) { e.printStackTrace(); }
        //inst.reset();
        /*List<Token> lista = (List<Token>) inst.getAllTokens();
        for (Token t : lista) {
            System.out.println(MiScanner.VOCABULARY.getSymbolicName(t.getType()) + ":" + t.getText() + "\n");
        }
        */

    }}