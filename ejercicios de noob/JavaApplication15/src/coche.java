/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JOSE
 */
public class coche {
    //atributos 
    
    String color;
    String marca;
    int km;
    
    public static void main(String [] args){
      
        coche coche1 = new coche ();
        
        coche1.color= "blanco";
        coche1.marca ="ferrari";
        coche1.km = 0;
        System.out.println(coche1.color);
        System.out.println(coche1.marca);
        System.out.println(coche1.km);
    }
    
    
}
