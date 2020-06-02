/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Vector;

public class listaArchivos {
      private static Vector datos = new Vector(); 
   
   public static void agregar(Object obj){
       datos.addElement(obj);
   }
   public static void Eliminar(int posicion){
       datos.removeElementAt(posicion);
   }
   public static Vector consultar(){
      return datos;
   }
   public static void Modificar(int index,Contraseña el){
       datos.add(index,el);
      
   }
   public static void  EliminarTodo(){
      datos.clear();
   }
}
