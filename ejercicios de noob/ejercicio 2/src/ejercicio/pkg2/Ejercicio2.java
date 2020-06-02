/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author JOSE
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    
   
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nombre_usuario=JOptionPane.showInputDialog("itroduce tu nombre por favor ");
        
        String edad = JOptionPane.showInputDialog("intrudce tu edad");
        
        int eda_entero = Integer.parseInt(edad);
        
        System.out.println("hola: "+nombre_usuario+"  tienes " + edad +"  años");
        
        System.out.println("dentro de un año tendras:  " + (eda_entero +1));
        
    }
    
}
