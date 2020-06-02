
package packPolimorfismo;


public class Principal {
    public static void main(String[] args) {
        Vehiculo misVehiculo[] = new Vehiculo[3]; 
        
        misVehiculo[0] = new Vehiculo("b453", "ferrari", "A35");
        misVehiculo[1] = new VehiculoTurismo(6, "carro", "sndsnpd","jsdonsaod");
          misVehiculo[2] = new VehiculoDeportivo(5, "ubadbaod", "sdnosdnos", "adnubadps");
          
          
          
          for (Vehiculo Vehiculos: misVehiculo){
              Vehiculos.MostrarDatos();
              System.out.println("");
          
          
    }
  
    
    
    
    }
}
