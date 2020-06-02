
package packPolimorfismo;


public class VehiculoDeportivo  extends Vehiculo{
    private int cilindrada;
    
     public VehiculoDeportivo(int cilindrada,String matricula,String marca, String modelo){
    super(matricula, marca, modelo);
    this.cilindrada =cilindrada;
     
     }

    public int getCilindrada() {
        return cilindrada;
    }
     
    @Override
      public void MostrarDatos(){
        System.out.println(" la matricula es "+matricula);
      System.out.println(" la marca es "+marca);
      System.out.println(" El modelo es: " +modelo);
        System.out.println(" el numero de puertas es "+ getCilindrada());
    }
     
     
     
}
