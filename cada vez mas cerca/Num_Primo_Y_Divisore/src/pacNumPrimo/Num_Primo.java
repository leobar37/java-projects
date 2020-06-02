/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacNumPrimo;

/**
 *
 * @author JOSE
 */
public class Num_Primo {
    
    public int num;
    
    
    public String DeterminaPrimo(){
     String rpta;
        boolean primo = true;
        for (int i =2; i < num; i++)
            if (num % i ==0){
                primo = false;
            }
        if (primo){
            rpta = "si";
        }else{
            rpta = "no";
            
            
        }
     return rpta;    
    }
    
    public int cantDivisores(){
      int contador=0;
     for(int i=1 ;i<=num;i++){
         if (num %i==0)
             contador = contador +1;
         
     }   
     return contador;
    }
}
