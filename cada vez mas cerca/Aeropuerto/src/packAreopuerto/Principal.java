
package packAreopuerto;

import com.sun.org.apache.xpath.internal.operations.Quo;
import java.util.Scanner;
import jdk.internal.org.objectweb.asm.commons.RemappingSignatureAdapter;


public class Principal {
    static Scanner entrada = new Scanner(System.in);
    final static int num =1;
   static Areopuerto areopuerto[] = new Areopuerto[num];
   
    public static void main(String[] args) {
        //insertar datos de los aeropuertos
        insertarDatos(areopuerto);
        //Menú
        Menú();
        
    }
    
    public static void insertarDatos(Areopuerto aero[]){
        aero[0]= new AreopuertoPublico(200, "jorge Chavez", "lima", "peru");
        aero[0].insertarCompañia(new Compañia("latam"));
        aero[0].insertarCompañia(new Compañia("Aero Peru"));
        aero[0].geCompañia("Aero Peru").InsertarVuelo(new Vuelo("ib20", "lima", "mexico",150.90, 150));
        aero[0].geCompañia("Aero Peru").InsertarVuelo(new Vuelo("ib30", "lima", "uruguay",157.90, 150));
        aero[0].geCompañia("latam").InsertarVuelo(new Vuelo("fc12", "lima", "europa", 205.9, 180));
        aero[0].geCompañia("Aero Peru").getVuelo("ib20").InsertarPasajero(new Persona("joselo", "pjk20", "serrano"));
        aero[0].geCompañia("Aero Peru").getVuelo("ib30").InsertarPasajero(new Persona("joselo2", "1235jl", "erupopa"));
        aero[0].geCompañia("latam").getVuelo("fc12").InsertarPasajero(new Persona("joselo3", "afcd", "limeño"));
        aero[0].geCompañia("latam").getVuelo("fc12").InsertarPasajero(new Persona("joselo4", "abcdf", "no sabemos"));
        //aereopuerto Privado
        /*
        aero[1].insertarCompañia(new Compañia("ASI"));
        aero[1].insertarCompañia(new Compañia("ETO"));      
        aero[1]=new AreopuertoPrivado("volar es libre", "lima","peru");

        aero[1].geCompañia("ASI").InsertarVuelo(new Vuelo("2307", "lima", "europa", 234.89, 130));
        String empresas[]={"usat","usag"};
        ((AreopuertoPrivado)aero[1]).insertarEmpresas(empresas);
        aero[1].geCompañia("ETO").InsertarVuelo(new Vuelo("ALFK","LIMA", "NEW YORK", 195.87,116));
        aero[1].geCompañia("ASI").InsertarVuelo(new Vuelo("ALFK2","LIMA", "europa", 1234.58,116));
        aero[1].geCompañia("ETO").getVuelo("ALFK").InsertarPasajero(new Persona("ROBERT", "4564MN", "LIMEÑA"));
       aero[1].geCompañia("ASI").getVuelo("ALFK2").InsertarPasajero(new Persona("ROBERTA", "4564ML", "LIMEÑA"));
  
*/
    }   
    
   public static void Menú(){
       int opcion;
       String aeroport;
       String comp;
        Areopuerto aero;
        String origen;
        String destino;
       do{
           System.out.println("menú");
           System.out.println("1. ver aeropuertos getionados(Publico o Privado)");
           System.out.println("2. ver Empresas(privado) o subvencion de un Publico");
           System.out.println("3. listar las compañias de un aeropuerto");
           System.out.println("4. listar vuelo por compañia");
           System.out.println("5. lista de posibles vuelo de origen a destino");
           System.out.println("6. salir");
           opcion = entrada.nextInt();
           //entrada.nextLine();
           switch(opcion){
               case 1:
                   //ver aeropuertos gestionados
                   opcion1(areopuerto);
                   break;
               case 2: 
                   //ver Empresas(privado) o subvencion de un Publico
                   opcion2(areopuerto);
                   break;
               case 3:
                  //listar las compañias de un aeropuerto
                   entrada.nextLine();
                   System.out.print("ingrse el nombre del aereopuerto ");
                   aeroport =entrada.nextLine();
                   aero=opcion3(aeroport,areopuerto);
                   
                   if(aero==null){
                       System.out.println("no se ha encontrado ese nombre");
                       
                   }else{
                       mostrarCompañias(aero);
                   }
                   
                   break;
                   
               case 4:
                   //listar vuelo por compañia
                   entrada.nextLine();
                   System.out.print("ingrese el nombre del aeropuerto: ");
                   aeroport = entrada.nextLine();
                    aero=opcion3(aeroport,areopuerto);
                   if(aero==null){
                       System.out.println("no se ha encontrado ese nombre");
                       
                   }else{
                      
                       System.out.print("ingrese la compañia: ");
                       comp = entrada.nextLine();
                       Compañia compañia=aero.geCompañia(comp);
                       if(compañia==null){
                           System.out.println("la compañia no existe");
                           
                       }else{
                           System.out.println("esta compañia tiene esta cantidad de vuelo: "+compañia.getNumVuelo());
                          for(int i=0;i<compañia.getNumVuelo();i++){
                              System.out.println("vuelo numero: "+i);
                              System.out.println("identificador: "+compañia.getVuelo(i).getIdentificador());
                              System.out.println("ciudad de origen: "+compañia.getVuelo(i).getCiudadOrigen());
                              System.out.println("ciudad de destino "+compañia.getVuelo(i).getCiudadDestino());
                          } 
                       }
                   }
                   
                   break;
               case 5: 
                  //lista de posibles vuelo de origen a destino
                   entrada.nextLine();
                   System.out.println("ingrese la ciudad de origen");
                   origen = entrada.nextLine();
                   System.out.println("ingrse la ciudad destinoo");
                   destino = entrada.nextLine();
                   mostrarDatosOrigenDestino(origen, destino, areopuerto);
                   break;
               case 6:  break;
               default:
                   System.out.println("la opcion no se encuentra en el menu xd");
                 
           }
           
           
       }while(opcion != 6);
  
   }
   public static Vuelo[] arregloDeVuelos(String origen, String destino, Areopuerto areopuerto[]){
       int cont =0;
       Vuelo vuelo;
       Vuelo vuelos[];
       for(int i=0;i<areopuerto.length;i++){//recorrer los aeropuertos 
           for(int j=0;j<areopuerto[i].getNumCopañia();j++){//recorrer las compañias 
               for(int k=0; k<areopuerto[i].getCompañia(j).getNumVuelo();k++){//recorrer los vuelos xd
                 vuelo = areopuerto[i].getCompañia(j).getVuelo(k);
                 if(origen.equals(vuelo.getCiudadOrigen())&& destino.equals(vuelo.getCiudadDestino())){
                     cont++;
                 }
                   
               }
           }
       }
      vuelos = new Vuelo[cont];
      int q = 0;
       for(int i=0;i<areopuerto.length;i++){
           for(int j=0;j<areopuerto[i].getNumCopañia();j++){
               for(int k=0; k<areopuerto[i].getCompañia(j).getNumVuelo();k++){
                 vuelo = areopuerto[i].getCompañia(j).getVuelo(k);
                 if(origen.equals(vuelo.getCiudadOrigen())&& destino.equals(vuelo.getCiudadDestino())){
                     vuelo = areopuerto[i].getCompañia(j).getVuelo(k);
                     vuelos[q] = vuelo;
                     q++;
                 }
                   
               }
           }
       }
      return vuelos;
       
   }
   
   public static void mostrarDatosOrigenDestino(String origen, String destino, Areopuerto areopuertos[]){
    
       Vuelo vuelos[];
       vuelos = arregloDeVuelos(origen, destino,areopuertos );
       if(vuelos.length ==0){
           System.out.println("no se a encontrado ningun vuelo de origen a destino xd");
       }else{
            for(int i =0; i<vuelos.length;i++){
           System.out.println("\nvuelos encontrados ");
                System.out.println("identiicador: "+vuelos[i].getIdentificador());
                System.out.println("ciudad de origen: "+vuelos[i].getCiudadOrigen());
                System.out.println("ciudad destino: "+vuelos[i].getCiudadDestino());
                System.out.println("Precio: "+vuelos[i].getPrecio());
                System.out.println("");
           }
       }
       
      
       
       
   }
   
   public static void opcion1(Areopuerto aeropuertos[]){
       for(int i=0;i<aeropuertos.length;i++){
           if(aeropuertos[i] instanceof AreopuertoPrivado){//compara si en el iterador i es un aeropuerto privado
               System.out.println("Areopuerto Privado");
               System.out.println("Nombre: "+aeropuertos[i].getNombre());
               System.out.println("Ciudad: "+aeropuertos[i].getCiudad());
               System.out.println("pais: "+ aeropuertos[i].getPais());
               
           }else{
               System.out.println("Areopuerto Publico");
               System.out.println("Nombre: "+aeropuertos[i].getNombre());
               System.out.println("Ciudad: "+aeropuertos[i].getCiudad());
               System.out.println("pais: "+ aeropuertos[i].getPais());
           }
           System.out.println("");
       }
           
       }
   public static void opcion2(Areopuerto aeropuertos[]){
       String empresa[];
       int numEmpresa;
       for(int i=0;i<aeropuertos.length;i++){
           if(aeropuertos[i] instanceof AreopuertoPrivado){
               System.out.println("Areopuerto Privado");
               System.out.println("Nombre: "+aeropuertos[i].getNombre());
               System.out.println("Empresas que patrocinan a este aeropuerto");
               empresa = ((AreopuertoPrivado)aeropuertos[i]).getEmpresa();
                numEmpresa = ((AreopuertoPrivado)aeropuertos[i]).getNumEmpresa();
              for(int j=0;j<numEmpresa;j++){
                  System.out.println(empresa[j]);
              }
               
           }else{
                System.out.println("Areopuerto Publico");
               System.out.println("Nombre: "+aeropuertos[i].getNombre());
               System.out.println("Subvención: "+((AreopuertoPublico)aeropuertos[i]).getSubvencion());
           }
       }
   }
   public static Areopuerto opcion3(String nombreAreopuerto,Areopuerto areopuerto[]){
    boolean encontrado = false;
    Areopuerto aero= null;
    int i=0;
    while((!encontrado) && (i<areopuerto.length)){
       if(nombreAreopuerto.equals(areopuerto[i].getNombre())){
           encontrado = true;
           aero = areopuerto[i];
       }
       i++;
   }
    return aero;
   }
   public static void mostrarCompañias(Areopuerto aero){
       for(int i=0;i<aero.getNumCopañia();i++){
           System.out.println("compañia " + i);
           System.out.println("nombre: "+aero.getCompañia(i).getNombre());
       }
       
   }
  
}
