/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Vector;

/**
 *
 * @author JOSE
 */
public class ListaEmpleados {

   private static final Vector datos = new Vector(); 
   
   public static void agregar(Object obj){
       datos.addElement(obj);
   }
   public static void Eliminar(int posicion){
       datos.removeElementAt(posicion);
   }
   public static Vector consultar(){
      return datos;
   }

}
