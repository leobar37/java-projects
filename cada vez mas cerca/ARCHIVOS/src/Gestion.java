

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class Gestion {
    
    FileInputStream entrada;
    FileOutputStream salida;
    File archivo;

    public Gestion() {
    }
    
    public String abrirArchivo(File texto){
        String contenido= "";
        
        try {
           // File direccion = new File(texto);
            entrada = new FileInputStream(texto);
            int car;
            while ((car = entrada.read()) != -1){
                char  caracter = (char)car;
                contenido = contenido + caracter;
            }
        } catch (Exception e) {           
        }
        return  contenido;
        
    }
    public String GuardarArchivo(File direccion, String contenido){
     String rpta = null;
        try {
            //File file= new File(direccion);
            salida = new FileOutputStream(direccion);
            byte[] texto = contenido.getBytes();
            salida.write(texto);
            rpta = "se guardo el archivo";
        } catch (Exception e) {
        }
     return rpta;
          
    }
    
    
}
