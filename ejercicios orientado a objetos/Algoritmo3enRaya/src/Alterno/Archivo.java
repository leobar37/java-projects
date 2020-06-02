/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alterno;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import java.io.ObjectOutputStream;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Archivo {
    
public static void iniciar(){
    try {
        File archivo = new File("jugadas.bin");
        archivo.createNewFile();
    } catch (IOException ex) {
        Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
    }
   
} 
/*anotacion
recordar output es entrada 
 input es salida
 
*/
 public static void Registrar(){
     Vector vector = ListaGanador.consultarTodo();
     Jugador obj ;
    try {
        FileOutputStream lectura = new FileOutputStream("jugadas.bin",false);
        ObjectOutputStream escritor = new ObjectOutputStream(lectura);
         
        for(int i=0;i<vector.size();i++){
          obj =  (Jugador)vector.elementAt(i);
          escritor.writeObject(obj);
        }
       
     escritor.close();
    } catch (FileNotFoundException ex) {
        Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
        Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
    }
   
 }
public static void llenarVector(){
    Jugador obj; 
    try {
         FileInputStream lectura = new FileInputStream("jugadas.bin");
         ObjectInputStream lector = new ObjectInputStream(lectura);
         while(true){
           obj = (Jugador)lector.readObject();
           ListaGanador.agregar(obj);
             System.out.println(""+obj.getNombre());
         }
         
    }catch(EOFException ex){
    return;
    } catch (FileNotFoundException ex) {
        Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
        Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
    }
  System.out.println("cantidad de elementos en el vector"+ListaGanador.consultarTodo().elements());     
} 

    
}
