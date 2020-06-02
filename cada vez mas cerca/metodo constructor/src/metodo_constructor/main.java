/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodo_constructor;

import java.util.Scanner;

/**
 *
 * @author JOSE
 */
public class main {
    public static void main (String [] args){
        String nombre;
        int edad;
        
        
     Scanner  objEntrada = new Scanner (System.in);

     
        System.out.println("ingrse su nombre");
        nombre = objEntrada.next();
        System.out.println("ingrse su edad");
        edad = objEntrada.nextInt();
        System.out.println("ingrse su dni");
       String dni = objEntrada.next();
        
            Persona p1 = new Persona(nombre,edad);  
            Persona p2 = new Persona(dni);
            p1.mostrar_datos();
            p2.mostrar_dni();
            int sumatoria  = p1.sumaredad();
           System.out.println("la sumatoria de la edad es "+ sumatoria);      
    }
        
    }

