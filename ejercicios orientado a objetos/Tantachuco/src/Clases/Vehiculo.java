

package Clases;

import java.util.Vector;

public class Vehiculo {
   private String marca;
   private String modelo;
   private String tipo;
   private float precio;
   private float montoInicial;
   private int numCueotas;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getMontoInicial() {
        return montoInicial;
    }

    public void setMontoInicial(float montoInicial) {
        this.montoInicial = montoInicial;
    }

    public int getNumCueotas() {
        return numCueotas;
    }

    public void setNumCueotas(int numCueotas) {
        this.numCueotas = numCueotas;
    }

    @Override
    public String toString() {
        return  "marca: " + marca + " modelo: " + modelo + "tipo: " + tipo + ", precio: " + precio + " montoInicial: " + montoInicial + ", numero de cuentas : " + numCueotas  +"nuevo precio: "+ NuevoPrecio()+"saldo: "+ Saldo();
    }
    
   public void registrar(){
        ListaVehiculos.agregar(this);
    }
  public Vector ConsultarTodos(){
        return ListaVehiculos.consultar();
                
    }
  public float NuevoPrecio(){
      return (precio * 0.055f);
      
  }
 public float Saldo(){
     return precio - montoInicial;
 }
}
