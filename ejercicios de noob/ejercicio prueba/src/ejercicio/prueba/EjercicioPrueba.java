/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.prueba;
import javax.swing.JOptionPane;
/**
 *
 * @author JOSE
 */
public class EjercicioPrueba {

    /**
     * @param args the command line arguments
     */
   
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nombre = JOptionPane.showInputDialog("introduce tu nombre ");
        String edad = JOptionPane.showInputDialog("ingrse su edad");
        
        
        int edad1=Integer.parseInt(edad);
        
        if (edad1 > 18)
            System.out.println("usted ya es mayor de edad");
        else 
            System.out.println("usted  es menor de edad");
                
        
       System.out.println("Muy bien "+nombre +" usted cuenta con esta edad  "+edad1);         
                
        
        
    }
    
}
