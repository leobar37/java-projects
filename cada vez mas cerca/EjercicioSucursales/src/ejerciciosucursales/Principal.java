
package ejerciciosucursales;

import java.util.Scanner;


public class Principal {
    
    public static int BuscarSucursal(Sucursal t[], int sucursales, int ContSucursales){
        
        int indice = 0;
        boolean encontrado= false;
        
        for (int i = 0; i <ContSucursales; i++){
            if (t[i].getSucursal()==sucursales)
            encontrado = true;
            indice = i;
            
        }
        
        if (encontrado == false){
            indice= -1;
        }
        return indice;
    }
       public static int BuscarPaquete(Paquete t[], int nroPaquete, int contPaquete){
        
        int indice = 0;
        boolean encontrado= false;
        
        for (int i = 0; i <contPaquete; i++){
            if (t[i].getNumeroPaquete()==nroPaquete)
            encontrado = true;
            indice = i;
            
        }
        
        if (encontrado == false){
            indice= -1;
        }
        return indice;
    }
    public static void main(String[] args){
        
     Scanner entrada = new Scanner(System.in);
     int sucursal;
      String direccion;
      String ciudad;
      int numeroPaquete,opcion,indiceSucursal, cantidaSucursal=0, catPaquetes=0, idicePaquete;
      String dni;
      double peso,precioPaquete;
      int prioridad;
   
         Sucursal sucursales[] = new Sucursal[50];
         Paquete paquete[]= new Paquete[100];
 
   do{
            System.out.println("\n digite una opcion");
            System.out.println("1) crear una nueva sucursal: ");
            System.out.println("2) enviar un paquete: ");
            System.out.println("3) consultar sucursal: ");
            System.out.println("4) consultar paquete:  ");
            System.out.println("5) mostrar todas las sucursales:  ");
            System.out.println("6) mostrar todos los paquetes: ");
            System.out.println("7) salir");
            System.out.print("dijite la opcion: ");
            opcion = entrada.nextInt();
            
            
            switch(opcion){
                case 1: 
                    
                    System.out.print("igrese el numero de la sucursal: ");
                    sucursal = entrada.nextInt();
                    System.out.print("digite la direccion: ");
                   
                    direccion = entrada.next();
                    System.out.print("ingrese la ciudad: ");
                    ciudad = entrada.next();
                    
                    sucursales[cantidaSucursal]= new Sucursal(sucursal,direccion,ciudad);
                    cantidaSucursal++;
                   break;
                   
                case 2 :
                    System.out.println("ingrse la sucursal a la cual desea enviar");
                    sucursal = entrada.nextInt();
                    
                    indiceSucursal = BuscarSucursal(sucursales,sucursal,cantidaSucursal);
                    
                    
                    if (indiceSucursal == -1){
                        System.out.println("sucursl no encontarda");  
                        
                    }else{
                        System.out.println("igrese el numero del paquete ");
                        numeroPaquete = entrada.nextInt();
                        
                        System.out.println("ingrese el numero de dni ");
                        dni = entrada.next();
                        System.out.println("ingrese el peso");
                        peso = entrada.nextDouble();
                        
                        System.out.println("ingrese a prioridad");
                        prioridad = entrada.nextInt();
                        
                         paquete[catPaquetes]= new Paquete(numeroPaquete,dni, peso,prioridad);
                        
                        
                         precioPaquete = sucursales[indiceSucursal].Precio(paquete[catPaquetes]);
                         catPaquetes ++;
                        
                         
                         System.out.println("el precio que le va ha resultar el paqute es: "+precioPaquete);
                    }
                    break;
                case 3: 
                    System.out.println("ingrse la sucursal la cual desea consultar");
                    sucursal = entrada.nextInt();
                     indiceSucursal = BuscarSucursal(sucursales,sucursal,cantidaSucursal);
                      if (indiceSucursal == -1){
                        System.out.println("sucursl no encontarda");  
                        
                    }else{
           
                          System.out.println(sucursales[indiceSucursal].mostrarDatosSucursal());
                      }
                    break;  
                case 4: 
                      System.out.println("igrese el numero del paquete ");
                     numeroPaquete = entrada.nextInt();
                        
                   idicePaquete =  BuscarPaquete(paquete, numeroPaquete, catPaquetes);
                   
                    if (idicePaquete == -1){
                        System.out.println("sucursl no encontarda");  
                        
                    }else{
           
                          System.out.println(paquete[idicePaquete].mostrarDatos());
                         
                      }
                   break;
                case 5:
                    for (int i = 0; i <cantidaSucursal; i++){
                        
                        System.out.println("datos de la sucursal "+(i+1));
                        System.out.println(sucursales[i].mostrarDatosSucursal());
                    }
                    break;
                
                case 6: 
                      for (int i = 0; i <catPaquetes; i++){
                        
                        System.out.println("datos de la paquete: "+(i+1));
                        System.out.println(paquete[i].mostrarDatos());
                    }
                      break;
                case 7 :
                    break;
                    
                default:
                    System.out.println("la opcion ingresada no es la correcta");
      
            }
        
                     
                
     }while(opcion != 7);     
   
     
   
    }

    
}    
