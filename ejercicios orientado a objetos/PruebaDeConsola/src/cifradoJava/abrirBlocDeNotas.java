
package cifradoJava;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class abrirBlocDeNotas {
    public static void main(String[] args) {
        try {
            Runtime runtime = Runtime.getRuntime(); 
            Process process = runtime.exec("C:\\Windows\\notepad.exe D:\\agenda\\datos.txt");
        } catch (IOException ex) {
            Logger.getLogger(abrirBlocDeNotas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
