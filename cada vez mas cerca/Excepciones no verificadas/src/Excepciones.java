
import javax.swing.JOptionPane;


//try catch para excepciones no verificadas 
public class Excepciones {
    public void operacion(){
    int num = 5, num2 = 0;
    
    int resultado = num / num2;
   
        System.out.println(resultado);
        
    
    }
    public void operaciones2(){
        try{
        operacion();
        }catch(ArithmeticException e){
         JOptionPane.showMessageDialog(null, "no se puede dividir entre cero burro");
        }
        System.out.println("programa terminado");
    }
        
  public static void main(String[] args) {
        Excepciones obj =  new Excepciones();
        obj.operaciones2();
    }

    
}
 