/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guardar.imagenes;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author JOSE
 */
public class Imagen {
    private BufferedImage imagenActual;
    private int  cont = 0;

    public BufferedImage getImagenActual() {
        return imagenActual;
    }

    public void setImagenActual(BufferedImage imagenActual) {
        this.imagenActual = imagenActual;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }
    
    
    public BufferedImage[] leerImagen(){
        int cont;
        BufferedImage retorno[]=null;
    
        JFileChooser selector = new JFileChooser("C:\\Users\\JOSE\\Pictures");
         selector.setMultiSelectionEnabled(true);
        selector.setDialogTitle("seleccione su imagen");
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("png","png");
        selector.setFileFilter(filtro);
        
        int abrir = selector.showOpenDialog(null);
           
        if(abrir == JFileChooser.APPROVE_OPTION){
            try {
                File archivo[] = selector.getSelectedFiles();
                cont = archivo.length;
              retorno = new BufferedImage[cont];
                for(int i = 0;i<archivo.length ;i++){
                retorno[i] = ImageIO.read(archivo[i]);
                  }

            } catch (Exception e) {
            }
       
        }
     return retorno;
    }
    
    public void GurdarImagen(JTextArea j) throws IOException{
      BufferedImage  imajenes[]  = leerImagen();
        JFileChooser selector2 = new JFileChooser("C:\\Users\\JOSE\\Pictures");
         selector2.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
         int abrir =selector2.showSaveDialog(null);
            if(abrir == JFileChooser.APPROVE_OPTION){
                try {
                     String ruta= selector2.getSelectedFile().getAbsolutePath();
                     for(int i = 0; i<imajenes.length;i++){
                        ImageIO.write(imajenes[i],"png",new File(ruta+"\\"+i+".png")); 
                        j.append("archivo"+i+"convertido correctamente\n");
                     }
                   
                } catch (IOException e) {
                }
 
            }
           
    }
}
