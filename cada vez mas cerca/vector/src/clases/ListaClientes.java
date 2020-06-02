
package clases;

import java.util.Vector;


public class ListaClientes {
    private static Vector datos = new Vector();
   
   public static void agregar(Object obj){
       datos.addElement(obj);
   }
   public static void eliminar(int posicion){
       datos.removeElementAt(posicion);
   }
   public static Vector Consulta(){
       return datos;
   }
   
}
