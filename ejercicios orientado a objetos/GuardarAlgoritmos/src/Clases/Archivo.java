
package Clases;

import java.io.EOFException;
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
/*
 Esta clase sirve para manipular contraseñas
 Para que funcione se tendra que crear una clase Contraseña
 y reescribir el metodo writeStreamHeader() de la clase objectOutputStream en una clase diferente
 y se le debera poner por nombre Añadir(por cuestion de tiempo)
 public void writeStreamHeader() throws IOException{
        File archivo = new File("contraseña.bin");
        if(archivo.length() == 0){
            super.writeStreamHeader();
        }else{
         reset();  
  }
    
*/
//añadir contraseña al archivo.bin
    public static void añadir(Contraseña nuevaContraseña) {
       
        try {
            FileOutputStream archivo = new FileOutputStream("contraseña.bin", true);
            Añadir escritor = new Añadir(archivo);
            
            escritor.writeObject(nuevaContraseña);
            listaArchivos.agregar(nuevaContraseña);
            escritor.close();
        } catch (FileNotFoundException ex) {
            System.err.println("error" + ex);
        } catch (IOException ex) {
            System.err.println("error" + ex);
        }

    } 
 
  //verificar  perfil  y contraseña(este metodo se acciona cuando se ingresa al login) 
    public static String leer(Contraseña obj2) {
        Contraseña obj;
       String verificacion=null;
        try {
            FileInputStream archivo = new FileInputStream("contraseña.bin");
            ObjectInputStream lector = new ObjectInputStream(archivo);
            while (true) {
                obj = (Contraseña) lector.readObject();
                
                if (obj.getContraseña().equals(obj2.getContraseña()) && obj.getUsuario().equals(obj2.getUsuario())) {
                    verificacion = obj.getCondicion();
                }
            }

        } catch (EOFException ex) {

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return  verificacion;
    }
    //llenar el vector con las contraseñas para poder manipular las contraseñas las guardamos en un vector
      public static void LLenarVector() {
        Contraseña obj;
        boolean verificacion = false;
        try {
            FileInputStream archivo = new FileInputStream("contraseña.bin");
            ObjectInputStream lector = new ObjectInputStream(archivo);
            while (true) {
                obj = (Contraseña) lector.readObject();
                listaArchivos.agregar(obj);
            }  
           
        } catch (EOFException ex) {
           return;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        }   
       
  }
 //borrar archivo(Este metodo borra todo el archivo.bin para poder reescribirlo)
    public static void ReescribirArchivo() {
    Vector obj = listaArchivos.consultar();
        try {

            FileOutputStream archivo = new FileOutputStream("contraseña.bin");
            ObjectOutputStream escritor = new ObjectOutputStream(archivo);
            for(int i =0;i<obj.size();i++){
             Contraseña con;
              con = (Contraseña)obj.elementAt(i);
              escritor.writeObject(con); 
            }
            escritor.close();
        } catch (FileNotFoundException ex) {
            System.err.println("error" + ex);
        } catch (IOException ex) {
            System.err.println("error" + ex);
        }
 
    }      
  //llenar el archivo con el vector(Este metodo toma informacion del vector para llenar el archivo)     
    public static void NuevoBim() {
        Vector obj = listaArchivos.consultar();
        Contraseña contraseña;
        try {

            FileOutputStream archivo = new FileOutputStream("contraseña.bin",true);
            Añadir escritor = new Añadir(archivo);
            for (int i = 0; i < obj.size(); i++) {
                contraseña = (Contraseña) obj.elementAt(i);
                escritor.writeObject(contraseña);
            }
            escritor.close();
        } catch (FileNotFoundException ex) {
            System.err.println("error" + ex);
        } catch (IOException ex) {
            System.err.println("error" + ex);
        }

    }

  
    }   
        
    
      
    

