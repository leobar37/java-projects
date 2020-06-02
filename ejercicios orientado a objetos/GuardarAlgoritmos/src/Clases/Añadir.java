/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.File;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 *
 * @author JOSE
 */
public class Añadir extends ObjectOutputStream{
       public Añadir(OutputStream out) throws IOException {
        super(out);
    }

  
  
    @Override
    public void writeStreamHeader() throws IOException{
        File archivo = new File("contraseña.bin");
        if(archivo.length() == 0){
            super.writeStreamHeader();
        }else{
         reset();  
       }
          

    }
   
}
