/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packCuenta;

import java.util.Scanner;

/**
 *
 * @author JOSE
 */
public class Principal {
    public static int calcularIndice(Cuenta cuentas[],int n){
        int i = 0, indice = 0;
        boolean encontrado = false;        
        while ((i < cuentas.length)  && (encontrado == false) ){
            if (cuentas[i].getNum() == n)
                encontrado = true;
              indice = i;
        }
        if (encontrado == false){
            indice = -1;
        }
            
       return indice; 
        
    }
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
    
         String nombre,apellido,dni;
         int nroCuentas,nro, opcion,indiceCuenta;
         double saldo,cantidad;
        
        Cuenta cuentas[];
        Cliente cliente;
        
        System.out.print("ingrese el nombre del cliente: ");
        nombre = entrada.next();
        System.out.print("ingrese el apellido del cliente: ");
        apellido = entrada.next();
        
        System.out.print("ingrese el dni del cliente: ");
        dni = entrada.next();
        System.out.print("ingrEse el numero de cuentas: ");
        nroCuentas= entrada.nextInt();
        
        cuentas = new Cuenta[nroCuentas];
        
        for (int i=0;i<nroCuentas;i++){
            
                System.out.print("ingrese el numero de la tarjeta "+(i+1)+"  :");
                nro = entrada.nextInt();
                System.out.println("ingrese el valor del saldo: ");
                saldo = entrada.nextDouble();
                
               cuentas[i]= new Cuenta(nro,saldo);
                 }
             cliente = new Cliente(nombre,apellido,dni,cuentas);
             
        do {
            System.out.println("\n. ingrese cualquiera de las opciones");
            System.out.println("1 ingresar el dinero a la cuenta");
            System.out.println("2 retirar dinero de la cuenta ");
            System.out.println("3 consultar saldo ");
            System.out.println("4 salir");
            System.out.print("digite la opcion: ");
            
             opcion = entrada.nextInt();
             
             switch(opcion) {
                 case 1:
                      System.out.println("ingrese el numero de la cuenta: ");
                      nro = entrada.nextInt();
                      
                      indiceCuenta = calcularIndice(cuentas,nro);
                      
                      if ( indiceCuenta == -1){
                          System.out.println("no se a encotrado la cuenta");
                          
                      }
                      else {
                          
                          System.out.println("ingrese el monto del dinero");
                           cantidad = entrada.nextDouble();
                          cuentas[indiceCuenta].ingresarDinero(cantidad);
                          System.out.println("el dinero se ha registrado");
                          System.out.println("le queda un monto de "+cliente.consultarSaldo(indiceCuenta));
                          
                      }
                   break;              
                 case 2:        
                    System.out.println("ingrese el numero de la cuenta:  ");
                      nro = entrada.nextInt();
                      
                      indiceCuenta = calcularIndice(cuentas,nro);
                      
                      if (indiceCuenta == -1){
                          System.out.println("no se a encontrado la cuenta sorry");
                          
                      }
                      else {
                          
                          System.out.println("ingrese el monto del dinero que desea sacar: ");
                           cantidad = entrada.nextDouble();
                           if (cantidad > cliente.consultarSaldo(indiceCuenta)){
                               
                               System.out.println("saldo insuficiente");
                           }else{
                               
                          cuentas[indiceCuenta].retirarDinero(cantidad);
                          System.out.println("el dinero se ha retirado");
                          System.out.println("le queda un monto de "+cliente.consultarSaldo(indiceCuenta));
                           }
                           
                           
                         
                      }
                     break;
              case 3:
                      System.out.print("ingrese el numero de la cuenta:  ");
                      nro = entrada.nextInt();
                      
                      indiceCuenta = calcularIndice(cuentas,nro);
                      
                      if (indiceCuenta == -1){
                          System.out.println("no se a encotrado la cuenta sorry");
                          
                      }
                      else {
                          
                          System.out.println("tiene un monto: "+cliente.consultarSaldo(indiceCuenta));
                      }
                break;
              default:
                     System.out.println(" la opcion es icorrecta");
             }     
             
        } while(opcion != 4); 
        
        
             
             
    }

    
}
