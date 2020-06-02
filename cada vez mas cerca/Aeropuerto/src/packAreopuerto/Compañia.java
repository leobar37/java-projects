
package packAreopuerto;


public class Compañia {
    
    private String nombre;
   
    private Vuelo listaDeVuelo[] = new Vuelo[10];
    private int numVuelo= 0;

    public Compañia(String nombre) {
        this.nombre = nombre;
    }

    public Compañia(String nombre, Vuelo v[]) {
        this.nombre = nombre;
       listaDeVuelo = v;
        numVuelo = v.length;
        
    }   
    
    public void InsertarVuelo(Vuelo vuelo){
       listaDeVuelo[numVuelo]= vuelo;
       numVuelo++;
       
        
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumVuelo() {
        return numVuelo;
    }
    public Vuelo getVuelo(int num){
        return listaDeVuelo[num];
    }
    
    public Vuelo getVuelo(String id){
        boolean encontrado = false;
        int i =0;
        Vuelo vuelo = null;
        while((encontrado == false)&& (i < listaDeVuelo.length)){
            if(id.equals(listaDeVuelo[i].getIdentificador())){
                 encontrado = true;
                vuelo = listaDeVuelo[i];
            }
        i++;
         
        }
      return vuelo;
      
    }
    
    
}
