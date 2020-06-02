/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packHerencia;


public class Estudiante extends Persona{
    // extendes declara que este es una clase hija
    
    public String codigoEstudiante;
    public float nota_final;
    
    public Estudiante(String nombre, String apellido, int edad,String codigoEstudiante, float nota_final){
       super(nombre,apellido,edad);    // super quiere decir que heredo eso atributos de la clase padre xd
       
       
       this.codigoEstudiante = codigoEstudiante;
       this.nota_final =  nota_final;
       
       
    }

  
    
    public void mostrarDatos(){
        
        
        System.out.println("el nombre es: "+ getNombre());
        System.out.println("el apellido es "+ getApellido());
        System.out.println("el edad es "+ getEdad());
        System.out.println("el codigo del estudiante es " + codigoEstudiante);
        System.out.println("la nota final es "+ nota_final);
    }
    
    
}
