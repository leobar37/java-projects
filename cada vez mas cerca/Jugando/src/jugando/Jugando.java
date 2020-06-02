/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jugando;

import java.util.Scanner;

/**
 *
 * @author JOSE
 */
public class Jugando {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       
        System.out.println("quieres que te diga lo que significas para mi");
        System.out.print("de cuantas veces quieres que te lo escriba:" );
         int  rpta = entrada.nextInt();
       
       
        String  frase = "eres cabro y siempre lo seras";
        
        
        for (int i =0;i< rpta ; i ++ ){
            System.out.println("");
            System.out.println(frase);
            
            
        }
        
        
        
    }
    
}
