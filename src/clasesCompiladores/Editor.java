/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesCompiladores;

/**
 *
 * @author Jurguen
 */
public class Editor {
    
    public Archivo archivo;
    public Editor(){
        archivo = null;
    }
    
    /**
     * abre archivo de texto
     * 
     * post: El archivo esta ha inicializado
     * 
     * @param nombre
     * @return String contenido en archivo
     * @throws Exception cuando hay un error al abrir archivo
     * 
     * 
     */
    public String OpenArchivo(String nombre) throws Exception{
        String contenido= "";
        archivo = new Archivo(nombre);
        try {
            contenido = archivo.getContenidoArchivo();
        }     
        catch (Exception e){
            throw new Exception("Error Leyendo archivo", e);
        }
        return contenido;
    }
    
    /**
     * Crea un nuevo archivo
     * 
     * post: Que archivo este en NULL
     */
    public void createArchivo(){
        archivo=null;
    }
    
    
    /**
     * Salva el archivo en memoria
     * 
     * post: Debe existir un archivo ya creado
     * 
     * @param contenido String que contiene el archivo
     * @param ruta lugar donde se guardara el archivo
     */
    public void saveArchivo(String contenido, String ruta)throws Exception{
        if (archivo==null){
            archivo= new Archivo(ruta);
        }
        try {
            archivo.setGuardarArchivo(contenido);
        }
        catch(Exception e){
            throw new Exception("Error al guardar archivo",e);
        }
        
    }
    /**
     * para verificar si el archivo es nuevo
     * @return 
     */
    public boolean esNueva(){
        return archivo == null;
    }
    

}
