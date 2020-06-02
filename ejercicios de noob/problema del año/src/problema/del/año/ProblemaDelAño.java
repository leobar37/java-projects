/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.del.año;

import javax.swing.JOptionPane;

/**
 *
 * @author JOSE
 */
public class ProblemaDelAño {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int año,mes,dia;
        
        
        dia = Integer.parseInt(JOptionPane.showInputDialog("ingrese el dia"));
        mes = Integer.parseInt(JOptionPane.showInputDialog("ingrese el mes"));
        año = Integer.parseInt(JOptionPane.showInputDialog("ingrese el año"));
        
        
        if ((dia>=1) && (dia<=30)){
            if ((mes>=1) && (mes<=30)){
                if (año !=0)
                        {
                       JOptionPane.showMessageDialog(null,"la fecha es correcta"); 
                }else{
                  JOptionPane.showMessageDialog(null,"el año es incorrecto");    
                }
            }else{
              JOptionPane.showMessageDialog(null,"el mes es incorrecto");  
            }
       
                }else {
            JOptionPane.showMessageDialog(null,"el dia es incorrecto");
        }
          
                   
    }
    
}
