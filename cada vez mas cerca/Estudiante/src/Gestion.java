
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class Gestion {
    
    private File archivo;
   
  
    
    
    public File getArchivo() {
        return archivo;
    }
     
    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
 
   
   
     public String GuardarArchivo(File archivo, String contenido){
     String rpta = null;
        try {
            FileOutputStream salida = new FileOutputStream(archivo);
            byte[] texto = contenido.getBytes();
            salida.write(texto);
            rpta = "se guardo el archivo";
        } catch (Exception e) {
        }
     
     return rpta;
          
    }
       public String abrirArchivo(File archivo){
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
