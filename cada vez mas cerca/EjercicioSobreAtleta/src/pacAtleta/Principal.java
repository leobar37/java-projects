/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacAtleta;

import java.util.Scanner;

/**
 *
 * @author JOSE
 */
public class Principal {
    
    public static int Indice(Atleta atletas[]){
        float tiempoHecho;
        int indice=0;
        tiempoHecho = atletas[indice].getTiempo();
        for (int i=1; i<atletas.length;i++){
            if (atletas[i].getTiempo()< tiempoHecho){
                tiempoHecho =atletas[i].getTiempo();
                indice = i;
            }
            return indice;
         }
        
      return indice;  
    }
    
    public static void main (String args[]){
        Scanner obj= new Scanner(System.in);
        int numero, cantidad,indiceGanador;
        String nombre;
        float tiempo;
      
        System.out.println("ingrse la cantidad de atletas");
        cantidad = obj.nextInt();
     
        
        // codigo crear una serie de objetos 
        
        Atleta atletas[] = new Atleta[cantidad];
        
        for (int i = 0;i<atletas.length;i++){
            
            System.out.println("ingrese los datos del atleat: "+(i+1));
            System.out.println("ingrese el numero del atleta ");
            numero = obj.nextInt();
            System.out.println("ingrese el nombre del atleta");
            nombre = obj.next();
            System.out.println("ingrese el tiempo que ha hecho el atleta");
            tiempo = obj.nextFloat();
            
           atletas[i]= new Atleta(numero,nombre,tiempo);
           
        
         }
           indiceGanador =  Indice(atletas);
         
           System.out.println("los datos del atleta ganador son los siguientes");
           System.out.println(atletas[indiceGanador].mostrarDatos());
      
    }
    
    
}
