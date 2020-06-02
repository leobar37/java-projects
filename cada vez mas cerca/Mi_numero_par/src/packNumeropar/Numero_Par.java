/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packNumeropar;

/**
 *
 * @author JOSE
 */
public class Numero_Par {
    public int num;
    
    public int  calcular_numero(){
        int cantidad = 0;
        int digito;
        while (num != 0){
              
            digito = num %10;
            num = num/10;
            
            if (digito % 2 == 0){
                cantidad= cantidad + 1;
            }
                    
        }
        
        
        return cantidad;
    }
}
