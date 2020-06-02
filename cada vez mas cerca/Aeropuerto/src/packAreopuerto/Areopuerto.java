
package packAreopuerto;

public class Areopuerto {
   private String nombre;
   private String ciudad;
   private String pais;
   private  Compañia listCompañia[] = new Compañia[10];
   private int numCopañia;

    public Areopuerto(String nombre, String ciudad, String pais) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.pais = pais;
        this.numCopañia = 0;
    }

   public Areopuerto(String nombre, String ciudad, String pais, int numCopañia,Compañia c[]) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.pais = pais;
        listCompañia = c;
        this.numCopañia = c.length;
    }

   public void  insertarCompañia(Compañia c){
       listCompañia[numCopañia]= c;
       numCopañia++;
   }

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getPais() {
        return pais;
    }

    public Compañia[] getListCompañia() {
        return listCompañia;
    }

    public int getNumCopañia() {
        return numCopañia;
    }
    public Compañia getCompañia(int num){
        return listCompañia[num];
        
    }
  public Compañia geCompañia(String nombre){
      boolean encontrado = false;
      Compañia compañia = null;
      int i =0;
       while((encontrado ==false)&&(i < listCompañia.length)){
           if(nombre.equalsIgnoreCase(listCompañia[i].getNombre())){
               encontrado = true;
               compañia = listCompañia[i];
           }
           i++;
       }
      return compañia;
  }       
    
}
