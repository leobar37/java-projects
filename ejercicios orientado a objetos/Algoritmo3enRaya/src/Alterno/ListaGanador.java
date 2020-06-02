/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alterno;

import java.util.Vector;



public class ListaGanador {
   
 
  
   private static Vector datos = new Vector(); 
   
   public static void agregar(Object obj){
       datos.addElement(obj);
   }
   public static void Eliminar(int posicion){
       datos.removeElementAt(posicion);
   }
  
   public static Vector consultarTodo(){
      return datos;
   }

   public static void  EliminarTodo(){
      datos.clear();
   }
   public static boolean Existe(String com){
       boolean verificacion = false;
       Vector v = consultarTodo();
      Jugador j;
     for(int i = 0;i<consultarTodo().size();i++){
           j = (Jugador)v.elementAt(i);
          if(com.equalsIgnoreCase(j.getNombre())){
             verificacion = true; 
          } 
         
     }     
    return  verificacion;
   }
     public static Jugador Objeto(String com){
       Jugador retorno=null;
       boolean verificacion = false;
       Vector v = consultarTodo();
       Jugador j;
       for(int i = 0;i<consultarTodo().size();i++){
            j = (Jugador)v.elementAt(i);
          if(com.equalsIgnoreCase(j.getNombre())){
             retorno = j;
          }else{
              
          } 
         
     }     
    return retorno;
   }
        public static boolean Modificar(Jugador jugador){
        boolean verificacion = false;
        Vector vector = consultarTodo();
        Jugador j;
        for(int i = 0;i<consultarTodo().size();i++){
            j = (Jugador)vector.elementAt(i);
          if(jugador.getNombre().equalsIgnoreCase(j.getNombre())){        
             consultarTodo().add(i,jugador);
             System.out.println("pos"+i);
             return true;
             
          }
         
     }     
    return false;
   }  
 
   
   
}
