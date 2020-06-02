/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packPolimorfismo;

/**
 *
 * @author JOSE
 */
public class Vehiculo {
    protected  String matricula;
    protected  String marca;
    protected  String modelo;

    public Vehiculo(String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
    
  public void MostrarDatos(){
      System.out.println(" la matricula es "+matricula);
      System.out.println(" la marca es "+marca);
      System.out.println(" El modelo es: " +modelo);
    ;
  }  
    
    
    
}
