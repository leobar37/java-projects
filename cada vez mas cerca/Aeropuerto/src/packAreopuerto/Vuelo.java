
package packAreopuerto;

public class Vuelo {
   private  String identificador;
   private String ciudadOrigen;
   private String ciudadDestino;
   private  double precio;
   private int numMaxPasajeros;
   private int numActualPasjeros;
   private Persona listaPasajeros[];

    public Vuelo(String identificador, String ciudadOrigen, String ciudadDestino, double precio, int numMaxPasajeros) {
        this.identificador = identificador;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.precio = precio;
        this.numMaxPasajeros = numMaxPasajeros;
        this.numActualPasjeros =0;
        this.listaPasajeros = new Persona[numMaxPasajeros];
    }
   
   public void InsertarPasajero(Persona persona){
       listaPasajeros[numActualPasjeros]= persona;
       numActualPasjeros = numActualPasjeros + 1;
       
   }

    public String getIdentificador() {
        return identificador;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public double getPrecio() {
        return precio;
    }

    public int getNumMaxPasajeros() {
        return numMaxPasajeros;
    }

    public int getNumActualPasjeros() {
        return numActualPasjeros;
    }

    public Persona[] getListaPasajeros() {
        return listaPasajeros;
    }
 
    public Persona getPasajero(int i){
       return listaPasajeros[i];
   }
   
   public Persona getPasajero(String pasaporte){
      boolean encontrado = false;
       Persona pas = null;
       int i=0;
      while((encontrado = false) && (i <listaPasajeros.length)){
 
          if ( pasaporte.equals(listaPasajeros[i].getPasaporte())){
              encontrado = true;
               
              pas = listaPasajeros[i];
              
          }
          i++;

      } 
      return listaPasajeros[i];
      }
   }
    
    
   
   
   
   

