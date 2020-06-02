/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.arrays;

/**
 *
 * @author JOSE
 */
public class ClaseArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int  mi_matrix[] = new int[5];//
        
        mi_matrix[0]=5;
        mi_matrix[1]=8;
        mi_matrix[2]=15;
        mi_matrix[3]=18;
        mi_matrix[4]=22;
        for(int i =0;i<mi_matrix.length;i++ ){
          System.out.println(mi_matrix[i]);         
        }
            
        System.out.println(mi_matrix[2]);        
              
       int [] nombre = new int[3];
       
       nombre[0]=8;
       nombre[1]=15;
       nombre[2]=18;
             
        System.out.println(nombre[2]);
        
        
        
        
    
    }
    
}
