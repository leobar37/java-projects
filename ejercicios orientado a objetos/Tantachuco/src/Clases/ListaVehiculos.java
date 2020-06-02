
package Clases;

import java.util.Vector;


public class ListaVehiculos {
  
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
 
}
