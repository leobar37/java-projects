
import java.util.Scanner;
import javax.swing.JOptionPane;


public class BusquedaInserccion {
    public static void main(String[] args) {
     Scanner lector = new Scanner(System.in);
     int nElem,elementos[];
     nElem = Integer.parseInt(JOptionPane.showInputDialog(null,"N. Elementos"));
     
     elementos = new int[nElem];
      for(int i = 0;i<elementos.length;i++){
        System.out.println("numero");
        elementos[i] = lector.nextInt();
        
    } 
     for(int i =0;i<nElem;i++){
       int pos = i;
       int aux = elementos[i];
       
       while((pos>0)&&(elementos[pos-1]>aux)){
           elementos[pos] = elementos[pos-1];
           pos--;
           
       }
      elementos[pos]=aux;
         
     }

    for(int i = 0;i<elementos.length;i++){
        System.out.print(elementos[i]+"-");
  
    }     
        
        
    }
         
}
