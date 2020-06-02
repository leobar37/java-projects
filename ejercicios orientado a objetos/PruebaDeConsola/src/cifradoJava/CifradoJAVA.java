package cifradoJava;
 
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

public class CifradoJAVA {
   
    static char ALFA[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '_', '.', ',', ';', ':'};
        static int count = 0, pos;
        static String aux,encrypt;
        
    static String Cifrar(String key, String phrase) {
        count = 0;
        aux = "";
        encrypt = "";
      for(int i= 0;i<phrase.length();i++){
         if(!" ".equalsIgnoreCase(phrase.substring(i, i+1))){
             aux = aux+key.substring(count,count+1);
             count ++;
         }else{
             aux = aux+"";
         } 
         if(count > key.length()){
             count = 0;
         }  
      
        }
    
 
        for (int i = 0; i < phrase.length(); i++) {
 
            for (int j = 0; j < ALFA.length; j++) {
                if (String.valueOf(ALFA[j]).equalsIgnoreCase(phrase.substring(i, i + 1))) {
                    pos = j + Integer.parseInt(aux.substring(i, i + 1));
 
                    if (pos >= ALFA.length) {
                        pos = pos - ALFA.length;
                    }
                    encrypt = encrypt + ALFA[pos];
                }
                if (phrase.substring(i, i + 1).equalsIgnoreCase(" ")) {
                    encrypt = encrypt + " ";
                    j = ALFA.length;
                }
            }
 
        }
 
        System.out.println(phrase);
        System.out.println(aux);
        System.out.println(encrypt);
        return encrypt;
    }
 
    static String Decifrar(String key, String phrase) {
        count = 0;
        aux = "";
        encrypt = "";
        for (int i = 0; i < phrase.length(); i++) {
 
            if (!" ".equals(phrase.substring(i, i + 1))) {
                aux = aux + key.substring(count, count + 1);
                count++;
            } else {
                aux = aux + " ";
            }
 
            if (count > key.length() - 1) {
                count = 0;
            }
        }
 
        for (int i = 0; i < phrase.length(); i++) {
 
            for (int j = 0; j < ALFA.length; j++) {
                if (String.valueOf(ALFA[j]).equalsIgnoreCase(phrase.substring(i, i + 1))) {
                    pos = j - Integer.parseInt(aux.substring(i, i + 1));
 
                    if (pos < 0) {
                        pos = (ALFA.length) - pos;
                    }
                    //System.out.println("pos: "+pos);
                    encrypt = encrypt + ALFA[pos];
                }
                if (phrase.substring(i, i + 1).equalsIgnoreCase(" ")) {
                    encrypt = encrypt + " ";
                    j = ALFA.length;
                }
            }
 
        }
        return encrypt;
    }

} 
   
