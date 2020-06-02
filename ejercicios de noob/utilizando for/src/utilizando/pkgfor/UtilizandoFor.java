/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilizando.pkgfor;

import javax.swing.JOptionPane;

/**
 *
 * @author JOSE
 */
public class UtilizandoFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        int arroba  = 0;
        
        
        String email = JOptionPane.showInputDialog("ingrese su correo electronico");
        
        int i;
        boolean punto = false; 
        for (i=0;i< email.length();i++)
        {
            if (email.charAt(i)== '@'){
                arroba ++;
                
            }
            if (email.charAt(i)=='.')
                punto = true;
        }
              
        if (arroba == 1 &&  punto == true)
             System.out.println("su correo es correcto");
        else 
            System.out.println("su correo es incorrecto");
        
        
    }
    
}
