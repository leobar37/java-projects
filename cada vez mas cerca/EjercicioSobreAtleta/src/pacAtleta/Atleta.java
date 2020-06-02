/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacAtleta;

/**
 *
 * @author JOSE
 */
public class Atleta {
    
  private int numero;
private String nombre;
private float tiempo;

    public Atleta(int numero, String nombre, float tiempo) {
        this.numero = numero;
        this.nombre = nombre;
        this.tiempo = tiempo;
    }

    public float getTiempo() {
        return tiempo;
    }

    public String mostrarDatos(){
        return "\n numero: "+numero+"\n nombre: "+nombre+"\n tiempo: "+tiempo;
    }

    
}
