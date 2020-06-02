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
//clase hija
public class EmpleadoFt extends Empleado{
    private int antiguedad;
    private int horas_extra;
    //pueden trabajar como maximo 15 horas
    private double  tarifa_horas_extras;
    private double sueldo_base;

    public EmpleadoFt() {
    }

    public EmpleadoFt(String dni,String paterno, String materno, String nombres) {
        super(paterno, materno, nombres);
        this.setDni(dni);
    }

    public int getAntiguedad() {
        return antiguedad;
    }

   

    public int getHoras_extra() {
        return horas_extra;
    }

    public void setHoras_extra(int horas_extra) {
        this.horas_extra = horas_extra;
    }

    public double getTarifa_horas_extras() {
        return tarifa_horas_extras;
    }

    public void setTarifa_horas_extras(double tarifa_horas_extras) {
        this.tarifa_horas_extras = tarifa_horas_extras;
    }



    @Override
    public void sueldoNeto() {
        double retorno;
       if(antiguedad > 2){
          retorno = (sueldo_base * 0.25)+sueldo_base;
               
       }else{
          retorno = (sueldo_base * 0.15)+sueldo_base;
       }     
       this.setSueldo(retorno);
    }

    @Override
    public void KilosPavo() {
        float retorno = 0;
        
        if(antiguedad == 2){
            retorno = 7;
        }else if(antiguedad > 2){
           retorno = 7 +((antiguedad-2) * 2);
        }      
        
        this.setPesoPavo(retorno);
    }

    public double getSueldo_base() {
        return sueldo_base;
    }

    public void setSueldo_base(double sueldo_base) {
        this.sueldo_base = sueldo_base;
    }
     public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
    
    @Override
      public void registrar(){
        ListaEmpleados.agregar(this);
    }
  public Vector ConsultarTodos(){
        return ListaEmpleados.consultar();
                
    }
}
