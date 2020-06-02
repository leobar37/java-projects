/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PACfACTORIAL;

/**
 *
 * @author JOSE
 */
public class Factorial {
    
    
    private float num;

    public float getNum() {
        return num;
    }

    public void setNum(float num) {
        this.num = num;
    }

    
    public float CalcularFactorial(){
         float  factorial;
         factorial=1;
          while ( num!=0) {
          factorial=factorial*num;
            num= num -1;
              }
       
        return factorial;
        
    }
}
