
public class NombreCorrecto {
    
   public String  AcomodaNombre(String nombre){
     String[] nombres = nombre.split(" ");
       

     String nombreAc ="";
     for(int i =0;i<nombres.length;i++){
         int n = nombres[i].length();
         nombreAc = nombreAc + nombres[i].substring(0,1).toUpperCase() + nombres[i].substring(1,n) +" ";
     }
    return nombreAc; 
   }  
    public static void main(String[] args) {
        
     NombreCorrecto obj = new NombreCorrecto();
    String nombre = "elmer joselo leon barboza";  
    String n = obj.AcomodaNombre(nombre);
        System.out.println(n);
    }
  
    
}
