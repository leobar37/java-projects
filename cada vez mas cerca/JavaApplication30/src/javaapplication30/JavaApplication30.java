/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication30;

/**
 *
 * @author JOSE
 */
public class JavaApplication30 {
 public int codigo;
   public String Cesar(int codigo){
       String frase = "probando el codigo";
       StringBuilder cifrado = new StringBuilder();
        
       codigo = codigo%26;
       
      for (int i = 0; i < frase.length();i++ ){
           
           if(frase.charAt(i)>='a' && frase.charAt(i)<= 'z'){
               if (frase.charAt(i)+codigo >'z'){
                   cifrado.append((char)(frase.charAt(i)+codigo-26));
               }else{
                   cifrado.append((char)(frase.charAt(i)+codigo));
               }
            }else  if(frase.charAt(i)>='A' && frase.charAt(i)<= 'Z'){
               if (frase.charAt(i)+codigo >'Z'){
                   cifrado.append((char)(frase.charAt(i)+codigo-26));
               }else{
                   cifrado.append((char)(frase.charAt(i)+codigo));
               }
            }
        }
   
      return cifrado.toString();
   }
}
