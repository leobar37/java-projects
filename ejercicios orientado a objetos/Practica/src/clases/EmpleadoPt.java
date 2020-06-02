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
public class EmpleadoPt extends Empleado{
    private boolean  turno;// true mañana false tarde
    private int   cantHoras;
    private double precio_hora;
   private int entrada;
   private int salida;
   private int  hora_adicional;
    public EmpleadoPt() {
    }


    public EmpleadoPt(String dni, int  cantHoras, String paterno, String materno, String nombres,double preciohORA) {
        super(paterno, materno, nombres);
       this.precio_hora = preciohORA;
         this.cantHoras = cantHoras;
         this.setDni(dni);
    }

    public boolean isTurno() {
        return turno;
    }

    public void setTurno(boolean turno) {
        this.turno = turno;
    }

    public double getCantHoras() {
        return cantHoras;
    }

    public void setCantHoras(int cantHoras) {
        this.cantHoras = cantHoras;
    }
    
    public void calcularSaldo(){
       
        if(entrada  == 11 && salida== 6 ){
            turno = true;
        }if (entrada > 6) {
           turno = false;            
        }
     
    }
    
    public double calcularBonificacion(){
        return 0;
    }
    public double calcularPesoP(){
        return 0;
    }

    @Override
    public void sueldoNeto() {
          double retorno = cantHoras * precio_hora;
          if(isTurno() == true){
              retorno = retorno + 500;
          }else{
              retorno = retorno +700;
          }
         this.setSueldo(retorno);
    }

    @Override
    public void KilosPavo() {
      float retorno;
      
      retorno = (hora_adicional / 10f)+ 7;
        
this.setPesoPavo(retorno);
    }
    
    
    public double getPrecio_hora() {
        return precio_hora;
    }

    public void setPrecio_hora(double precio_hora) {
        this.precio_hora = precio_hora;
    }

    public int getHora_adicional() {
        return hora_adicional;
    }

    public void setHora_adicional(int hora_adicional) {
        this.hora_adicional = hora_adicional;
    }
    @Override
      public void registrar(){
        ListaEmpleados.agregar(this);
    }
    @Override
  public Vector ConsultarTodos(){
        return ListaEmpleados.consultar();
                
    }
}
