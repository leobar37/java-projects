package pequeño.diccionario;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class Gestion {
    
   
    FileInputStream entrada;
    FileOutputStream salida;
    File archivo;

    public Gestion() {
    }
    
    public String abrirArchivo(String texto){
        String contenido= "";
        
        try {
            File direccion = new File(texto);
            entrada = new FileInputStream(direccion);
            int car;
            while ((car = entrada.read()) != -1){
                char  caracter = (char)car;
                contenido = contenido + caracter;
            }
        } catch (Exception e) {           
        }
        return  contenido;
        
    }
    public String GuardarArchivo(String direccion, String contenido){
     String rpta = null;
        try {
            File file= new File(direccion);
            salida = new FileOutputStream(direccion);
            byte[] texto = contenido.getBytes();
            salida.write(texto);
            rpta = "se guardo el archivo";
        } catch (Exception e) {
        }
     return rpta;
          
    }
    
    
    
}
