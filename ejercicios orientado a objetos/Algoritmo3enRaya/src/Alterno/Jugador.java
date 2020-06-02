
package Alterno;

import java.io.Serializable;


public class Jugador implements Serializable{
 private String nombre;
 private int ganadas=0;
 private int perdidas=0;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getGanadas() {
        return ganadas;
    }

    public void setGanadas() {
        this.ganadas++;
    }

    public int getPerdidas() {
        return perdidas;
    }

    public void setPerdidas() {
        this.perdidas ++;
    }

  
 
 
}
