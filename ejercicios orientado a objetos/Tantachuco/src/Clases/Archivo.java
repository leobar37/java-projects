
package Clases;

import java.io.File;
import java.io.FileOutputStream;
import javax.swing.JOptionPane;


public class Archivo {
    private String ubicacionNombre;

    public String getUbicacionNombre() {
        return ubicacionNombre;
    }

    public void setUbicacionNombre(String ubicacionNombre) {
        this.ubicacionNombre = ubicacionNombre;
    }
    
    public String GuardarArchivo( String contenido){
     String rpta = null;
        try {
            File file= new File(ubicacionNombre);
           FileOutputStream salida = new FileOutputStream(file);
            byte[] texto = contenido.getBytes();
            salida.write(texto);
            rpta = "se guardo el archivo";
            JOptionPane.showMessageDialog(null, "se guardo en el disco local c: con el nombre de archivo");
        } catch (Exception e) {
        }
     return rpta;
          
    }

}
