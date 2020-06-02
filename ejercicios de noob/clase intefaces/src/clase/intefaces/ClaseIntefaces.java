/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.intefaces;

import javax.swing.JOptionPane;

/**
 *
 * @author JOSE
 */
public class ClaseIntefaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num, s = 0, d,mult=1;
        
       
        num= Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero entero"));
        
     while (num > 0)
     {
      d =num%10;
        s =s+d;
           num = num /10;
         if (d==0)
              mult = mult +d;
         else 
             mult = mult * d;
       
     }
       
     
            JOptionPane.showMessageDialog(null, "la multiplicacion es : "+ mult+" y su sumas es:  "+s);
           System.out.println(s);
     
       
        
    }
    
}
