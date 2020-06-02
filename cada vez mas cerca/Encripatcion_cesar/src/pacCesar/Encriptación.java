/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacCesar;
public class Encriptación {
  /*
   Algoritmo de encriptación (Cesar) para que funcione es necesario
    que se le pase como parametro el codigo de encriptacion num
  */ 
   //cuenta la cantidad de  "a" que hay en la palabra 
   public int CantidadDeA(String frase){
       int cantidad=0;
       
       
       for (int i = 0;i<frase.length();i++){
         char pos = frase.charAt(i);
            String letra1 = "abc";
           char  letra = letra1.charAt(0);
           
               if (pos == letra){
                   cantidad = cantidad+1;
               }
            }
   return  cantidad;
      }
   //metodo para encriptar varias palabras conservando el espacio
   public String encriptarPorPartes(int codigo,String frase){
      String texto =""; 
     String[] fase = frase.split(" ");
     
     for(int i  = 0;i<fase.length;i++){
         System.out.println(fase[i]);
         String textNu = Encriptar(codigo,fase[i]);
        texto = texto+textNu+" ";
     }
    return  texto;
     
   }
   //este metodo es usado por el metdo por partes si se usa este metodo el resultado sera sin espacios
   public String Encriptar(int codigo, String palbra){
      
    StringBuilder cifrado = new StringBuilder();
    codigo = codigo % 26;
    
    
        for (int i = 0; i < palbra.length(); i++) {
            if (palbra.charAt(i) >= 'a' && palbra.charAt(i) <= 'z') {
                if ((palbra.charAt(i) + codigo) > 'z') {
                    cifrado.append((char) (palbra.charAt(i) + codigo - 26));
                } else {
                    cifrado.append((char) (palbra.charAt(i) + codigo));
                }
            } else if (palbra.charAt(i) >= 'A' && palbra.charAt(i) <= 'Z') {
                if ((palbra.charAt(i) + codigo) > 'Z') {
                    cifrado.append((char) (palbra.charAt(i) + codigo - 26));
                } else {
                    cifrado.append((char) (palbra.charAt(i) + codigo));
                }
            }
        }
        return cifrado.toString();
   }
   //descrifrar conjuntos de palabras
     public String DescifrarPorPartes(int codigo,String frase){
         
      String texto =""; 
     String[] fase = frase.split(" ");
     
     for(int i  = 0;i<fase.length;i++){
         System.out.println(fase[i]);
         
         String textNu = Descifrar(codigo,fase[i]);
        texto = texto+textNu+" ";
     }
    return  texto;
     
   }
   
   
  //descifra tan solo una palabra 
   public void baby(String p){
    char c;
    String texto ="";
    char[] t = p.toCharArray();
    String prueba = "123456789ñ@.()";
     for(int i=0;i<t.length;i++){
         c = t[i];
       for(int j = 0;j<prueba.length();i++){
          if(c ==prueba.charAt(i)){
             
          }
       } 
         
     }
    
    
   }  
     
   public String Descifrar(int codigo,String p){
       
        StringBuilder cifrado = new StringBuilder();
        codigo = codigo % 26;
        for (int i = 0; i < p.length(); i++) {
            if (p.charAt(i) >= 'a' && p.charAt(i) <= 'z') {
                if ((p.charAt(i) - codigo) < 'a') {
                    cifrado.append((char) (p.charAt(i) - codigo + 26));
                } else {
                    cifrado.append((char) (p.charAt(i) - codigo));
                }
            } else if (p.charAt(i) >= 'A' && p.charAt(i) <= 'Z') {
                if ((p.charAt(i) - codigo) < 'A') {
                    cifrado.append((char) (p.charAt(i) - codigo + 26));
                } else {
                    cifrado.append((char) (p.charAt(i) - codigo));
                }
            }
        }
        return cifrado.toString();
   }
}
