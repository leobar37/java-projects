/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodo_constructor;

/**
 *
 * @author JOSE
 */
public class Persona {
      String nombre;
      int edad;
      String dni;
      
      
      //metodo coonstructor 
      
      public Persona (String nombre , int edad){
          this.nombre = nombre ;
          this.edad = edad;
          }

    public Persona(String dni) {
        this.dni = dni;
    }
   
   
      public  void mostrar_datos (){
          System.out.println("su nombre es "+ nombre);
          System.out.println("su edad es "+edad);
          
      }
     public void mostrar_dni(){
         System.out.println("mi dni es "+ dni);
     }     
     
      public int sumaredad(){
        int sum = edad+1;  
        return sum;
      }
    
      
      }