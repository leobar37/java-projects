/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

//calase padre

import java.util.Vector;


public abstract class Empleado {
   
    private String dni;
    private String paterno;
    private String materno;
    private String nombres;
    private double sueldo;
    private double pesoPavo;

    public Empleado() {
    }

    public Empleado(String paterno, String materno, String nombres) {
        this.paterno = paterno;
        this.materno = materno;
        this.nombres = nombres;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
   public  abstract void sueldoNeto();
   public abstract  void KilosPavo();

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getPesoPavo() {
        return pesoPavo;
    }

    public void setPesoPavo(double pesoPavo) {
        this.pesoPavo = pesoPavo;
    }
       public abstract void registrar();
  public abstract Vector ConsultarTodos();

    public String getPaterno() {
        return paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public String getNombres() {
        return nombres;
    }
  
    public String ConsultarTipo(){
       
       if ( this instanceof EmpleadoFt){
           return "Full time";
           
       } else{
           return  "par Time";
       }
       
    }
    
    @Override
    public String toString() {
          String line = System.getProperty("line.separator"); 
          
          String info = "datos del Empleado: "+ ConsultarTipo()+ line +"con nombre: "+nombres + line +"apellidos: "+materno +" "+ paterno + "sueldo: "+sueldo +line +"paso pavo:"+pesoPavo+line;
       return info;
    }
  

    
}
