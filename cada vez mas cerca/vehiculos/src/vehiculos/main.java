/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculos;
import java.util.Scanner;
/**
 *
 * @author JOSE
 */
public class main {
    public static int indicemasbarato(Vehiculo coches[]){
        float precio;
       int indice=0;
       
       precio = coches[0].getPrecio();
       for (int i=1 ; i<coches.length;i++){
           if (coches[i].getPrecio()<precio){
              precio = coches[i].getPrecio();
              indice= i;
               
           }
       }
        
      return indice;  
    }
   
    public static void main (String [] args){
      Scanner entrada = new Scanner(System.in);
      
     String marca, modelo;
     float precio;
     int cantidad,indicemasbarato;
     
        System.out.println("ingrese la cantidad de vehiculos que desea evaluar ");
        cantidad = entrada.nextInt();
        
        Vehiculo coches[] = new Vehiculo[cantidad];
        
        for (int i = 0; i<cantidad;i++){
            System.out.println("\n ingrese las caracteristicas del vehiculo"+(i+1));   
            System.out.print("ingrse la marca del vehiculo: ");
            marca = entrada.next();
            System.out.print("ingrse el modelo del vehiculo: ");
            modelo = entrada.next();
            System.out.println("ingrse el precio del vehiculo:  ");
            precio = entrada.nextFloat();
            
          coches[i]= new Vehiculo(marca,modelo,precio);
         
        }
        indicemasbarato= indicemasbarato(coches);
        System.out.println("el vehiculo mas barato es: "+coches[indicemasbarato].MostrarDatos());
        
       
    }
   
}
