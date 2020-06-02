/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JOSE
 */
public class PagoDocente {
    private float sueldoBasico;
    private float caandtidadHorasExtras;
    private float cantidadMinutosTardanza;
    private boolean tieneHijos;

    public float getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(float sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public float getCaandtidadHorasExtras() {
        return caandtidadHorasExtras;
    }

    public void setCaandtidadHorasExtras(float caandtidadHorasExtras) {
        this.caandtidadHorasExtras = caandtidadHorasExtras;
    }

    public float getCantidadMinutosTardanza() {
        return cantidadMinutosTardanza;
    }

    public void setCantidadMinutosTardanza(float cantidadMinutosTardanza) {
        this.cantidadMinutosTardanza = cantidadMinutosTardanza;
    }

    public boolean isTieneHijos() {
        return tieneHijos;
    }

    public void setTieneHijos(boolean tieneHijos) {
        this.tieneHijos = tieneHijos;
    }
    public float PrecioCadaHora(){
       float horaExtra;
       
       horaExtra =(float)(sueldoBasico/30f/8f);
       
       return horaExtra;
       
    }
   
    
    
}
