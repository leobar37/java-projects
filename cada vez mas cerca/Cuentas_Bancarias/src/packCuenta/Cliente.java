/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packCuenta;

/**
 *
 * @author JOSE
 */
public class Cliente {
    
   private String nombre;
   private String apellido;
   private String dni;
   Cuenta cuentas[];

    public Cliente(String nombre, String apellido, String dni, Cuenta[] cuentas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.cuentas = cuentas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }
   public double consultarSaldo(int cuenta){
       
       return cuentas[cuenta].getSaldo();
   }
    
   public void retirarDinero(int cuenta,double cantidad){
       
        cuentas[cuenta].retirarDinero(cantidad);
        
       
   }
}
