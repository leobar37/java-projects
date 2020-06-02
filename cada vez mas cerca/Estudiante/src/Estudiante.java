
import java.io.File;


public class Estudiante {
    
    private String nombre;
    private String codigo;
    private String  dni;
    private String escuela;

    public Estudiante() {
    }

    public Estudiante(String nombre, String codigo, String dni, String escuela) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.dni = dni;
        this.escuela = escuela;
    }

  

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDni() {
        return dni;
    }

    public String getEscuela() {
        return escuela;
        
    }
    public String pedirdatos(){
      
        String estudiantenuevo; 
        estudiantenuevo = "nombre: "+ nombre  +"\n codigo:  "+codigo +"\n. dni:  "+ dni + "\n escuela:  "+ escuela+"\n";
        
        return estudiantenuevo;
    }
    public String Insertar(File archivo, String texto) throws Exception{
        
        Gestion  objArchivo = new Gestion();
       return  objArchivo.GuardarArchivo(archivo,texto);
        
    }
   public void AbrirArchivo(File archivo) throws Exception{
       Gestion objArchivo = new Gestion();
       objArchivo.abrirArchivo(archivo);
   }
    
}
