
package packAreopuerto;

public class AreopuertoPrivado extends Areopuerto{
    private String empresa[] = new String[10];
    private int numEmpresa;

    public AreopuertoPrivado(String nombre, String ciudad, String pais) {
        super(nombre, ciudad, pais);
    }

    public AreopuertoPrivado(String nombre, String ciudad, String pais, int numCopañia, Compañia[] c, String e[]) {
        super(nombre, ciudad, pais, numCopañia, c);
        this.empresa = e;
        numEmpresa = e.length;
        
    }
   
    public void insertarEmpresas(String e[]){
      this.empresa = e;
      this.numEmpresa = e.length;
    }
    public void insertarEmpresa(String e){
        empresa[numEmpresa] = e;
        numEmpresa++;
    }

    public String[] getEmpresa() {
        return empresa;
    }

    public int getNumEmpresa() {
        return numEmpresa;
    }
    
}
