
package PACK9;

import java.util.ArrayList;
import java.util.Scanner;


public class Principal {
    // un arreglo dinamico 
    
    
    static ArrayList<Poligono> poligono = new ArrayList<Poligono>();
    static Scanner entrada = new Scanner(System.in);
    
    
    public static void main(String[] args) {
        // metodo llenar poligono 
        LLenarPoligono();
        //mostramos los resultados
        mostrarResultado();
        
    }
        
       public static void LLenarPoligono(){
        int opcion;
        char repuesta;
        do{
            do{
            System.out.println("digite el poligono");
            System.out.println(" 1: triangulo y 2: rectangulo");
            System.out.println("opcion");
            opcion = entrada.nextInt();
            }while(opcion<1 || opcion>2);
            
            switch(opcion){
                case 1:
                    //llenar triandulo
                    llenarTriangulo();
                    break;
                case 2: 
                    //llenar rectangulo 
                    llenarRectangulo();
                    break;        
            }
              System.out.println("desea ingresar otro poligono xd: s/n ");  
              repuesta = entrada.next().charAt(0);
        }while(repuesta =='s' || repuesta == 'S'); 
  
       }
        
     public static void llenarTriangulo(){
         double lado1, lado2,lado3;
         
         System.out.println("digite el lado 1");
         lado1 = entrada.nextDouble();
         System.out.println("digite el lado 2");
         lado2 = entrada.nextDouble();
         System.out.println("digite el lado 3");
         lado3 = entrada.nextDouble();
         Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
         
         poligono.add(triangulo);
         
     }  
        
      public static void llenarRectangulo(){
          double lado1, lado2;
          System.out.println("digite el lado 1");
          lado1 = entrada.nextDouble();
          System.out.println("digite el lado 2 ");
          lado2 = entrada.nextDouble();
          
          Rectangulo rectangulo = new Rectangulo(lado1, lado2);
           poligono.add(rectangulo);
      
      }
    
      public static void mostrarResultado(){
          //recorriendo todos los poligonos
          for(Poligono poli :poligono){
              System.out.println(poli.toString());
              System.out.println("area es igual a : "+poli.area());
              System.out.println("");
          }
      }
}
