
package archivosdetexto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ArchivosDetexto {
   File archivo;
   
   
   private void ArchivoTexto() throws IOException{
       archivo = new File("prueba.txt");
       
       if(archivo.createNewFile()){
           System.out.println("el archivo se a creado correctamente");    
       }else{
           System.out.println("el archivo no se ha creado");
       }
       
   }
   private void Directorio(){
       archivo = new File("prueba");
       
       if(archivo.mkdir()){
           System.out.println("se ha creado la carpeta");
       }else{
           System.out.println("no se ha creado a carpeta");
       }
       
   }
   private void EscribirTexto(String texto){
       try {
           //cuando le ponemos por parametro true este va activar el metodo append
           //cuando no se lo ponemos opta por solo chancar el texto que se encuentra en el archivo
           FileWriter escribir = new FileWriter(archivo,true);
           escribir.write(texto);
           escribir.close();
       } catch (IOException ex) {
           System.err.println("no se pudo escribir el archivo");
       }
       
       
   }
   private void leerTexto(){
     String cadena;
       try {
           FileReader lectura = new FileReader(archivo);
           BufferedReader lector = new BufferedReader(lectura);

           cadena = lector.readLine();
           while(cadena != null){
               System.out.println(cadena);
               cadena =lector.readLine();
           }

       } catch (FileNotFoundException ex) {
           Logger.getLogger(ArchivosDetexto.class.getName()).log(Level.SEVERE, null, ex);
       } catch (IOException ex) {
           Logger.getLogger(ArchivosDetexto.class.getName()).log(Level.SEVERE, null, ex);
       }
  
   }
    public static void main(String[] args) {
       ArchivosDetexto obj = new ArchivosDetexto();
       
       try {
           obj.ArchivoTexto();
       } catch (IOException ex) {
           Logger.getLogger(ArchivosDetexto.class.getName()).log(Level.SEVERE, null, ex);
       }
       //obj.Directorio();
       String texto = "hola mundo \r\n segunda linea \r\n tercera linea";
       obj.EscribirTexto(texto);
       obj.leerTexto();
    }
    
}
