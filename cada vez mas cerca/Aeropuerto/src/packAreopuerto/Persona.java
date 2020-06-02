
package packAreopuerto;

public class Persona {
 
    private String nombre;
    private String pasaporte;
    private String nacionalidad;

    public Persona(String nombre, String pasaporte, String nacionalidad) {
        this.nombre = nombre;
        this.pasaporte = pasaporte;
        this.nacionalidad = nacionalidad;
    }

   

    public String getNombre() {
        return nombre;
    }

    public String getPasaporte() {
        return pasaporte;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }
    
    
    
    
    
    
}
