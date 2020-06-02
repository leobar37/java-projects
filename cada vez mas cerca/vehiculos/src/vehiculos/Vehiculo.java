/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculos;

/**
 *
 * @author JOSE
 */
public class Vehiculo {
    private String marca;
    private String modelo;
    private float precio;

    public Vehiculo(String marca, String modelo, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }
    public String MostrarDatos(){
       return "la marca es: "+marca+"\nmodelo: "+modelo+"\n precio: "+precio;
    }
   
}
