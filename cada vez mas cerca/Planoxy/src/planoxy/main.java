/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planoxy;

import java.util.Scanner;

/**
 *
 * @author JOSE
 */
public class main {
     public static void main (String [] args){
        Scanner objentrada = new Scanner(System.in);
        
      Planoxy t1;
      int x;
      int y;
      int opcion,incremento=0;
      
    
        System.out.println("ingrese la posicion inicial de x");
        x = objentrada.nextInt();
        System.out.println("ingrese la posicion inicial de y");
        y = objentrada.nextInt();
        
       t1= new Planoxy( x,y);
  ;
      
       do {
           System.out.println("\n\t.: Menú:. ");
           System.out.println("1 : mover hacia arriba");
           System.out.println("2 mover hacia abajo");
           System.out.println("3 mover hacia la derecha");
           System.out.println("4 mover hacia la izquierda");
           System.out.println("5 salir del menu");
           opcion = objentrada.nextInt();
           if (opcion != 5){
               System.out.println("ingrese el incremnto");
               incremento = objentrada.nextInt();
           }
           switch(opcion){
               case 1 : 
                   t1.moverhaciaarriba(incremento);break;
               case 2 :
                   t1.moverhaciaabajo(incremento);break;
               case 3 : 
                   t1.moverhaciaderecha(incremento);break;
               case 4 : 
                   t1.moverhacialaizquierda(incremento);break;
               case 5: 
                   break;
               default: 
                   System.out.println("se equivoco de menu ");
                  
           }
    System.out.println("la posicion actual es de ("+t1.getX()+" ; "+t1.getY()+" ) ");
      
       }while(opcion != 5);
      
       }
    
    
}
