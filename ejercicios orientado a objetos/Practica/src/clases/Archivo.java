/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author JOSE
 */
public class Archivo {
       private  String ubicacionNombre;
   private File archivo;

    public Archivo() {
    }
   
    
    
    public String GuardarArchivo( String contenido){
     String rpta ="no se guardo el archivo";
        try {
           File directorio = new File("reportes");
           File obj2 = new File("D:\\archivo.txt");
           FileOutputStream salida = new FileOutputStream(obj2);
            byte[] texto = contenido.getBytes();
            salida.write(texto);
            rpta = "se guardo el archivo";
        } catch (Exception e) {
        }
     return rpta;
          
    }

    public String abrirArchivo(File texto){
        String contenido= "";
        
        try {
         
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
}
