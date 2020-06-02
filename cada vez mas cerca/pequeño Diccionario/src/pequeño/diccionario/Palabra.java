
package pequeño.diccionario;

public class Palabra {
    
    private String nombre;
    private String texto;

    public Palabra(String nombre, String texto) {
        this.nombre = nombre;
        this.texto = texto;
    }

    public String getNombre() {
        return nombre;
    }
   public String obtenerDatos(){
       
  return "nombre: "+ nombre + " "+ "Significado:"+ texto;
          
   }
    public String getTexto() {
        return texto;
    }
  
    public String leer(String archivo) {
        Gestion obj = new Gestion();
        return obj.abrirArchivo(archivo);
    }
  public void insertar(String archivo) {
      Gestion obj = new Gestion();
      obj.GuardarArchivo(archivo,obtenerDatos());
  }
}
