
package packPolimorfismo;


public class VehiculoTurismo extends Vehiculo {
    private int npuertas;
    
    public VehiculoTurismo(int npuertas,String matricula,String marca, String modelo){
    super(matricula, marca, modelo);
     this.npuertas = npuertas;
    }

    public int getNpuertas() {
        return npuertas;
    }
    
    
    @Override
    public void MostrarDatos(){
        System.out.println(" la matricula es "+matricula);
      System.out.println(" la marca es "+marca);
      System.out.println(" El modelo es: " +modelo);
        System.out.println(" el numero de puertas es "+ getNpuertas());
    }
}
    
    
    
    

