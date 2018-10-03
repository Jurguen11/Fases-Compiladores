/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesCompiladores;

import java.io.*;

/**
 *
 * @author Jurguen
 */
public class Archivo {
    private File archivo;
    public String nombre;
    /**
     * 
     * 
     * @param nombreArchivo del archivo creado
     */
    public Archivo(String nombreArchivo){
        nombre=nombreArchivo;
        archivo = new File(nombreArchivo);
    }
    /**
     * 
     * @return el contenido del archivo 
     * @throws Exception
     */
    public String getContenidoArchivo()throws IOException{
        String contenido= "";
        FileReader rf = new FileReader(archivo);
        BufferedReader lector = new BufferedReader(rf);
        String linea = lector.readLine();
        
        while(linea != null){
            contenido =contenido + linea+"\n";
            linea = lector.readLine();
        }
        
        lector.close();
        rf.close();
        
        return contenido;
    }
    
    /**
     * Guardar contenido en un archivo nuevo
     * @param contenido
     * @param direccion 
     */
    public void setGuardarArchivo(String contenido)throws IOException{
        PrintWriter escritor = new PrintWriter(archivo);
        escritor.write(contenido);
        escritor.close();
    }
}
