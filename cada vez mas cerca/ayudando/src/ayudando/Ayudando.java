/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ayudando;

import java.util.Scanner;

/**
 *
 * @author JOSE
 */
public class Ayudando {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner obj = new Scanner(System. in);
       
       int num;
       
        System.out.println("ingrese el numero");
        num = obj.nextInt();
        
        
        switch(num){
            case 1:
                System.out.println("soltero");
                break;
            case 2:
                System.out.println("etc");
                break;
             //puede agregar mas cases si deseas   
                
        }
    }
    
}
