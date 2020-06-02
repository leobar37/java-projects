
package excepciones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Excepciones {

   public void leerarchivo() throws FileNotFoundException,IOException{
     
       File archivo = new File("C:\\Users\\JOSE\\Desktop\\texto de pueba 2.txt");
       FileReader fr = new FileReader(archivo);
       BufferedReader bf = new BufferedReader(fr);
       String linea;
       String cont= "";
       while((linea = bf.readLine())!= null){
       cont = cont + linea;
        }
       System.out.println(cont);
   }
   
   public void leerArchivo2(){
       try {
         leerarchivo();  
       } catch (FileNotFoundException e) {
           JOptionPane.showMessageDialog(null,"ha ocurrido un error en la lectura del archivo xd");
           
       }catch(IOException x){
    JOptionPane.showMessageDialog(null,"ha ocurrido una excepcion verificada");

           
       }
       System.out.println("programa terminado");
      
       
   }
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        Excepciones obj =new Excepciones();
        
        System.out.println("digite el archoivo de teto");
        String texto = entrada.nextLine();
        obj.leerArchivo(texto);
    }
    public String leerArchivo(String texto){
        String cont= "";
        try {
                 File archivo = new File(texto);
       FileReader fr = new FileReader(archivo);
       BufferedReader bf = new BufferedReader(fr);
       String linea;
      
       while((linea = bf.readLine())!= null){
       cont = cont + linea;
        }
       System.out.println(cont);
       return cont;
        
        } catch (Exception e) {
        }
      
     return cont;
    }
}
