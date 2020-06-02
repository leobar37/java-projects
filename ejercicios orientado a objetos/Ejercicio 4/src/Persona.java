
public class Persona {
   private String nombre,apellidos,direc;

    public Persona(String nombre, String apellidos, String direc) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direc = direc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDirec() {
        return direc;
    }

    public void setDirec(String direc) {
        this.direc = direc;
    }

    @Override
    public String toString() {
        return   nombre +""+""+ apellidos;
    }
   
    
}
