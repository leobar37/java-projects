
package Clases;


import java.io.Serializable;


public class Contraseña implements Serializable {

    private String usuario;
    private String contraseña;
    private String condicion;

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }
     
   public Contraseña(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
      
    }
    public Contraseña(String usuario, String contraseña,String condicion) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.condicion =condicion;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
   private String comprobarContraseña(){
        
      String rpta= null;
       if(contraseña.length() < 8){
          rpta = "la contraseñas no  puede ser tan corta";
           
       }else{
         if(contraseña.equalsIgnoreCase(usuario)){
          rpta  = "el usuario y la contraseña no pueden ser iguales";
          }
       }
   return rpta;
   }  
}
