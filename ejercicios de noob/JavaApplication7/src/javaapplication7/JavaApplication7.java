/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author JOSE
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner entrada =new Scanner(System.in);
        int aleatorio = (int)(Math.random()*100);
        
        
        System.out.println("El siguiente juego consiste en adivinar el numero del sistema el menor de intentos posibles");
        int num=0;
        int intentos =0;
        
        while (num != aleatorio ){
           
           System.out.println("introduce un numero por favor");
            num = entrada.nextInt();
            
            if (aleatorio > num)
                System.out.println("El numero es mayor ");
            else if(aleatorio < num )
                 System.out.println("El numero es menor ");
            intentos = intentos +1;
        }        
        
              System.out.println("adivinaste el numero por fin");
               System.out.println("tu numero de la suerte es  "+ aleatorio);
                  System.out.println("tu numero de intentos es  "+ intentos );
    }
    
}
