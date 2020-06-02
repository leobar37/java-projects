/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otra.clase;

import javax.swing.JOptionPane;

/**
 *
 * @author JOSE
 */
public class OtraClase {

    /**
     * @param args the command line arguments
     */
    
    
    
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        
       
      String contra = "joselo";
      String pass = "";
      
      while (contra.equals(pass)==false);
      {
         
      pass = JOptionPane.showInputDialog("ingrese por favor la contraseña correcta");
      
      
      if (contra.equals(pass)==false);
         System.out.println("la contraseña es incorrecta");
      
       
    }
      System.out.println("acceso permitido ");
    }
}
