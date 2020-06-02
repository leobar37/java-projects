
import java.io.EOFException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Binarios {
 
  private void escribirArchivo(){
      String prueba ="";
      try {
          FileOutputStream archivo = new FileOutputStream("prueba.bin");
          ObjectOutputStream escritor = new ObjectOutputStream(archivo);
          Persona persona1 = new Persona("joselo", "15");
          Persona persona2 = new Persona( "leobar","15");
          Persona persona3 = new Persona( "luis","18");
       
         escritor.close();
      } catch (FileNotFoundException ex) {
          Logger.getLogger(Binarios.class.getName()).log(Level.SEVERE, null, ex);
      } catch (IOException ex) {
          Logger.getLogger(Binarios.class.getName()).log(Level.SEVERE, null, ex);
      }
      
  } 
  private void leerArchivo(){
      Persona obj;
      try {
          FileInputStream archivo = new FileInputStream("prueba.bin");
          ObjectInputStream lector = new ObjectInputStream(archivo);
          while(true){
              obj =  (Persona)lector.readObject();
              System.out.println(obj.toString()); 
          }
        //EOF
      }catch(EOFException EX){
       //DE ESTA MANERA HACEMOS QUE EL METODO WHILW PARE CUANDO TERMINE DE LEER EL ARCHIVO
      } catch (FileNotFoundException ex) {
          Logger.getLogger(Binarios.class.getName()).log(Level.SEVERE, null, ex);
      } catch (IOException ex) {
          Logger.getLogger(Binarios.class.getName()).log(Level.SEVERE, null, ex);
      } catch (ClassNotFoundException ex) {
          Logger.getLogger(Binarios.class.getName()).log(Level.SEVERE, null, ex);
      }
  }
  
  private void añadir(){
    try {
          
          FileOutputStream archivo = new FileOutputStream("prueba.bin",true);
          Añadir escritor = new Añadir(archivo);
         
          Persona persona1 = new Persona("joselo", "15");
          Persona persona2 = new Persona( "leobar","15");
          Persona persona3 = new Persona( "luis","18");
          
          escritor.writeObject(persona1);
          escritor.writeObject(persona2);
          escritor.writeObject(persona3);
           
         escritor.close();
      } catch (FileNotFoundException ex) {
          Logger.getLogger(Binarios.class.getName()).log(Level.SEVERE, null, ex);
      } catch (IOException ex) {
          Logger.getLogger(Binarios.class.getName()).log(Level.SEVERE, null, ex);
      }
  }
 public static void EscribirTexto(){
             String texto = "";
       try {
           //cuando le ponemos por parametro true este va activar el metodo append
           //cuando no se lo ponemos opta por solo chancar el texto que se encuentra en el archivo
           FileWriter escribir = new FileWriter("contraseña.bin");
           escribir.write(texto);
           escribir.close();
       } catch (IOException ex) {
           System.err.println("no se pudo escribir el archivo");
       }
      
  }
    public static void main(String[] args) {
        Binarios obj = new Binarios();
       obj.escribirArchivo();
      // obj.añadir();
       obj.leerArchivo();
          
        
        
    }
    
}
