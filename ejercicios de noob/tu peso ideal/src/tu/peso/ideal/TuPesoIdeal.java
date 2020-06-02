/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tu.peso.ideal;

import javax.swing.JOptionPane;

/**
 *
 * @author JOSE
 */
public class TuPesoIdeal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // el peso correcto resulta a partir de la altura-110 si es hombre , altura -120  si es mujer
        String genero = "";
        
        
        do{
             genero = JOptionPane.showInputDialog("introduce tu genero(H/M)");
             
             
        }while(genero.equalsIgnoreCase("h")==false && genero.equalsIgnoreCase("m")==false);
        
        int altura = Integer.parseInt(JOptionPane.showInputDialog("ingrese su altura"));
        
       int pesoideal = 0;
       
       if (genero.equalsIgnoreCase("h")){
           pesoideal = altura -110;
           
       }else
              if(genero.equalsIgnoreCase("m")){
                   pesoideal=altura-120;
                   
                   }
        System.out.println("tu peso ideal es: "+ pesoideal);           
       }
           
           
    }
   
