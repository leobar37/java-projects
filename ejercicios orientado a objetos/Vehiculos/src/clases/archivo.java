/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JOSE
 */
public class archivo {
    private static File archivo;

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    public static void CrearArchivo(){
      archivo = new File("RegistroDeVehiculos.txt");
      
       try {
           if(archivo.createNewFile()){
               JOptionPane.showMessageDialog(null, "se creo el archivo");
           }} catch (IOException ex) {
           System.err.println("no se pudo crear el archivo");
       }
    }
    
    public static void leerArchivo(DefaultTableModel obj){
        String lec;
        String arre[];
       try {
           
           FileReader lectura = new FileReader(archivo);
           BufferedReader lector = new BufferedReader(lectura);
          
           lec = lector.readLine();
           while(lec != null){
               if(lec.equals("")){
                   System.out.println("no se ha encontrado nada en esta linea");
                 lec = lector.readLine(); 
               }else{
              //el metodo split devuelve un arreglo en eset caso lo agregamos a nuetra fila
              arre = lec.split("%");
              obj.addRow(arre);
              lec = lector.readLine(); 
               }
          
              
           }
           
       } catch (FileNotFoundException ex) {
           System.err.println("Erro,"+ex);
       }catch (IOException ex) {
           System.err.println("error,"+ex
           );
       }
        
        
    }
       public static void GuardarArchivoNuevo(String obj){
       try {
            FileWriter escrib = new FileWriter(archivo);
             String line = System.getProperty("line.separator"); 
            escrib.write(obj);
            escrib.close();
            JOptionPane.showMessageDialog(null,"Eliminado");
       } catch (IOException ex) {
           System.err.println("error, "+ex);
       }
       
   }
   public static void GuardarArchivo(Vehiculo obj){
       try {
            FileWriter escrib = new FileWriter(archivo,true);
             String line = System.getProperty("line.separator"); 
            escrib.write(obj.getMarca()+"%"+obj.getTipo()+"%"+obj.getPrecio()+line);
            escrib.close();
            JOptionPane.showMessageDialog(null,"Guardado");
       } catch (IOException ex) {
           System.err.println("error, "+ex);
       }
       
   }
   //a este metodo se le entra una linea  para que pueda boorrarla
   public static void BoorrarLinea(String linea){
      String lec;
      String TextoNuevo="";
       String line = System.getProperty("line.separator");
       try {
           
           FileReader lectura = new FileReader(archivo);
           BufferedReader lector = new BufferedReader(lectura);
          
           lec = lector.readLine();
           while (lec != null) {
              if(lec.equals(linea)){
                  
                  System.out.println("se encontro la linea");
                  lec = lector.readLine();  
              }else{
                  TextoNuevo = TextoNuevo + lec +line;
                 lec = lector.readLine(); 
              }  
            
           }
        lectura.close();
       } catch (FileNotFoundException ex) {
           System.err.println("Erro,"+ex);
       }catch (IOException ex) {
           System.err.println("error,"+ex
           );
       }
       GuardarArchivoNuevo(TextoNuevo);
   }
    
    
}
