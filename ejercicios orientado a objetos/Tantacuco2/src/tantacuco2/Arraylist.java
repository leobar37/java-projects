
package tantacuco2;

import java.util.ArrayList;
import java.util.Scanner;


public class Arraylist {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner  entrada = new Scanner(System.in);
         ArrayList<Alumno> listaAlumnos = new ArrayList<>();
         int numero;
         float[] practicas= new float[2];
        float practica1, practica2, examFinal;
         int i=0;
       int opcion;
          do{
              System.out.println("ingrese un alumno si(1) no (0)");
              opcion= entrada.nextInt();
              if (opcion == 1){
                  
                  for(int j=0;i<2;i++){
                      System.out.println("ingrese la practica "+ i);
                      practicas[i]= entrada.nextFloat();
                  }
                  System.out.println("ingrese el examen parcial");
                  practica2 = entrada.nextFloat();
                  System.out.println("ingrese el examen final");
                  examFinal = entrada.nextFloat();
                  
                  Alumno obj = new Alumno();
                  obj.setPracticas(practicas);
                  obj.setExamFinal(examFinal);
                  obj.setPracial(practica2);
                 listaAlumnos.add(obj);
               i++;
              
              }
              if (i == 4){
                  opcion = 0;
              }
              
              
              
          }while(listaAlumnos.size() < 4);
        
        System.out.println("datos de los alumnos");
        System.out.println("cantidad : "+listaAlumnos.size());
        for(int f = 0; i<listaAlumnos.size();i++){
            System.out.println("promedio "+listaAlumnos.get(i).PromedioPracticas());
            System.out.println("numero"+i);
            System.out.println("examen final"+listaAlumnos.get(i).getExamFinal());
            System.out.println("pracial "+listaAlumnos.get(i).getPracial());
        }
        
        
    }
    
    
}
