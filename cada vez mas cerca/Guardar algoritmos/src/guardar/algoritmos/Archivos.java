
package guardar.algoritmos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;


public class Archivos {
    
     
    private  String ubicacionNombre;
   private File archivo;

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
   
    public  String getUbicacionNombre() {
        return ubicacionNombre;
    }

    public void setUbicacionNombre(String ubicacionNom) {
        ubicacionNombre = ubicacionNom;
    }
    public String abrirArchivo(File archivo){
        String contenido= "";
        
        try {
           //File direccion = new File(archivo);
            FileInputStream entrada = new FileInputStream(archivo);
            int car;
            while ((car = entrada.read()) != -1){
                char  caracter = (char)car;
                contenido = contenido + caracter;
            }
        } catch (Exception e) {           
        }
        return  contenido;
        
    }
     /* planificando ejercicio
     1. se importe todos los archivos
      2. se pongan en la lista 
      3. llamo al metodo abrir para que lo lea al texto 
      4 .finish 
    
    
    */
    
    public  String leer(File archivo) throws Exception{
 
      
       FileReader fr = new FileReader (archivo);
       BufferedReader br = new BufferedReader(fr);
       
       String contenido, linea;
       contenido = "";
       while((linea=br.readLine())!=null){
                contenido = contenido +  linea + "\n";
       }
       fr.close();     
       return contenido;
    }
    
    
    public void escribir (String texto) throws Exception{

        FileWriter fw = new FileWriter(archivo);
        PrintWriter pw = new PrintWriter(fw);

        pw.println (texto);
        fw.close();
        
    }
     public String GuardarArchivo( String contenido){
     String rpta = null;
        try {
            File file= new File(ubicacionNombre);
           FileOutputStream salida = new FileOutputStream(file);
            byte[] texto = contenido.getBytes();
            salida.write(texto);
            rpta = "se guardo el archivo";
        } catch (Exception e) {
        }
     return rpta;
          
    }
   public String GuardarArchivoJfile(String contenido){
     String rpta = null;
        try {
           // File file= new File(ubicacionNombre);
           FileOutputStream salida = new FileOutputStream(archivo);
            byte[] texto = contenido.getBytes();
            salida.write(texto);
            rpta = "se guardo el archivo";
        } catch (Exception e) {
        }
     return rpta;
          
    }
    

    public  void insertar (String texto) throws Exception{
        
     
        File archivo = new File (ubicacionNombre);
        FileWriter fw = new FileWriter(archivo, true);;
        PrintWriter pw = new PrintWriter(fw);
        pw.println (texto);
        fw.close();
        
    }
    
    
}
