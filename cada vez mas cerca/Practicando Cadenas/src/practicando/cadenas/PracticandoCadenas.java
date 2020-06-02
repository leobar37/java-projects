
package practicando.cadenas;

import java.util.Scanner;


public class PracticandoCadenas {

    public static void main(String[] args) {
 String rpta;
 Scanner obj = new Scanner(System.in);  
String cad = "Hola buenos dias feliz dia feliz de la MADRE";
int ap;
 System.out.println("ingrese la palaba que desea buscar");
 rpta = obj.next();
ap = cad.indexOf(rpta);   
System.out.println("la posicion de la inicial de la palabra es");
System.out.println(ap);
System.out.println("la oracion de guia ");
System.out.println(buscarpalabra(cad, ap));

  }
 public static String buscarpalabra(String cad,int posicion){
     String msj= "";
      int i = posicion;
      
     char[] arr = cad.toCharArray();
    
     while(arr[i] != ' '){
      msj = msj + cad.charAt(i);
          i = i +1; 
          
     }
     int j = i + 1;
     String msjSGT="";
      while(arr[j] != ' '){
      msjSGT = msjSGT + cad.charAt(j);
          j = j +1; 
     }
    String rpta = msj +" "+msjSGT;
    
 return  rpta ;
}
 public String cadenas(String cad){
     return cad.toLowerCase().trim();
     
 }
}
  
    