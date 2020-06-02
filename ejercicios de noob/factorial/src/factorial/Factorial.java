/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

import javax.swing.JOptionPane;

/**
 *
 * @author JOSE
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int factorial = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero"));
        int resultado  =1 ;
        int i;
        for (i=factorial; i>0; i-- ) 
        {
            resultado = resultado * i;
            
        }   
            
           System.out.println("su facorial es "+ resultado);     
    }
    
}
