
package ejerciciosucursales;


public class Sucursal {
    private int sucursal;
    private String direccion;
    private String ciudad;

    public Sucursal(int sucursal, String direccion, String ciudad) {
        this.sucursal = sucursal;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }

  
    public int getSucursal() {
        return sucursal;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCiudad() {
        return ciudad;
    }
    
    public String mostrarDatosSucursal(){
       
       return "numero de sucursal: "+sucursal+
              ", direccion : "+direccion
               +",  ciudad : "+ciudad;
             
   }
  
   public double Precio(Paquete t){
       double precio;
       precio = t.getPeso();
       
       if (t.getPrioridad()== 1){
           precio = precio +10;
     
       }
       if (t.getPrioridad()==2){
           precio = precio + 20;
       }    
           
    return precio;   
   }
    
    
}
