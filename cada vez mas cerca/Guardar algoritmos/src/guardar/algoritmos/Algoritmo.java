
package guardar.algoritmos;

import java.io.File;


public class Algoritmo {
    private String nombre;
    private String  Algoritmo;
    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlgoritmo() {
        return Algoritmo;
    }

    public void setAlgoritmo(String Algoritmo) {
        this.Algoritmo = Algoritmo;
    }

    @Override
    public String toString() {
        String line = System.getProperty("line.separator");
        return "Identificador: " + nombre +line+"Algoritmo: "+line + Algoritmo;
    }
    //D:\Notas\mis algoritmos
    //Algoritmo, Notas, Ideas
    public void Guardar()throws Exception{
        Archivos obj = new Archivos();
        if(tipo.equalsIgnoreCase("Algoritmo")){
            obj.setUbicacionNombre("D:\\Notas\\mis algoritmos\\"+nombre+".txt");
        }else{
            if(tipo.equalsIgnoreCase("Clases")){
              obj.setUbicacionNombre("D:\\Notas\\mis clases\\"+nombre+".txt");  
            }else{
                 obj.setUbicacionNombre("D:\\Notas\\mis metodos\\"+nombre+".txt");  
            }
        }
        
        obj.GuardarArchivo(toString());
        
    }
    public String GuardarJfile(File archivo, String contenido ){
        Archivos  obj = new Archivos();
        obj.setArchivo(archivo);
       return obj.GuardarArchivoJfile(contenido);
    }
   public String AbrirArchivo(File archivo) throws Exception{
       Archivos obj = new Archivos();
       return obj.abrirArchivo(archivo);
       
   } 
    
}
