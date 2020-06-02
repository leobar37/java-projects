/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JOSE
 */
public class Operaciones {
   private  String dato1;
     private String dato2;
    private int dato3;

    public Operaciones(String dato1, String dato2, int dato3) {
        this.dato1 = dato1;
        this.dato2 = dato2;
        this.dato3 = dato3;
    }

    public String getDato1() {
        return dato1;
    }

    public String getDato2() {
        return dato2;
    }

    public int getDato3() {
        return dato3;
    }
    
    public String cadenasIguales(){
        String resultado = "";
        if (dato1.equalsIgnoreCase(dato2)){
            resultado= "se han ingresado datos iguales entre el dato 1 y 2 ";
        }
            
      return resultado;  
        
    }
    public String substringCdena(int inicio, int fin, String cadena){
        
        String resultao;
        resultao  = cadena.substring(inicio, fin);
        
       return resultao;
    }
     public int LocalizarCaracter(char car, String cadena){
         
        int posicion = 0;
         for(int i =0; i<cadena.length();i++){
             if(cadena.charAt(i) == car){
                posicion = i;
             }
         }
         
       return posicion;  
     }       
    public String concatenar(){
       String cad;
       cad = dato1.toLowerCase() + dato2.toLowerCase() + String.valueOf(dato3);
       return cad;
    } 
    
    public String Remplazar(char car, char remplazar,String cadena){
     return   cadena.replace(car, remplazar);
   
    }
}
