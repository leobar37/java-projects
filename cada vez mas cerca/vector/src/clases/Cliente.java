
package clases;

import java.util.Vector;

public class Cliente {
   private String marca;
   private String modelo;
   private byte posicion;
   private float precio;

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
   
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

    public byte getPosicion() {
        return posicion;
    }

    public void setPosicion(byte posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "Cliente{" + "marca=" + marca + ", modelo=" + modelo + ", posicion=" + posicion + ", precio=" + precio + '}';
    }

    
    public void registrar(){
        ListaClientes.agregar(this);
    }
    public Vector consultarTodos(){
        return ListaClientes.Consulta();
    }   
       
   public Vector ListaModelos(String producto){
       Vector listaTotal;
       listaTotal = consultarTodos();
       
       Vector Filtrada = new Vector();
       Cliente obj;
       
       for(int i = 0; i< listaTotal.size(); i++){
           obj= (Cliente)listaTotal.elementAt(i);
           
           if(obj.getModelo().equalsIgnoreCase(producto)){
               Filtrada.addElement(obj);
           }
       }
       return Filtrada;
   }
  
       
   
   
}
