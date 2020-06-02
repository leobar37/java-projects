/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primer.ejercicio;

import java.util.Scanner;

/**
 *
 * @author JOSE
 */
public class PrimerEjercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int gui,luis,juan,sumas;
        
        Scanner objentrada = new Scanner(System.in);
        
        System.out.println("INGRSEEL DINERO DE Guillermo");
        gui= objentrada.nextInt();
        
        luis = gui /2;
        juan = (luis + gui)/2;
        
        sumas= gui+luis+juan;
        
        System.out.println("la cantidad que tienen entre los 3 es;"+ sumas);
        
        
        
        
        
        
        
        
        
       
    }
    
}
