

import java.io.File;
import java.io.IOException;

import java.io.ObjectOutputStream;
import java.io.OutputStream;


public class Añadir extends ObjectOutputStream{
   
  

    public Añadir(OutputStream out) throws IOException {
        super(out);
    }

    public Añadir() throws IOException, SecurityException {
    }

  
    @Override
    public void writeStreamHeader() throws IOException{
        File archivo = new File("prueba.bin");
        if(archivo.length() == 0){
            super.writeStreamHeader();
        }else{
         reset();  
       }
          

    }
   
    
}
