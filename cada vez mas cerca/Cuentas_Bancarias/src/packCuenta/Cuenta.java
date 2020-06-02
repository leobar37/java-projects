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
public class Cuenta {
    
    private int num;
    private double saldo;

    public Cuenta(int num, double saldo) {
        this.num = num;
        this.saldo = saldo;
    }

    public int getNum() {
        return num;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void ingresarDinero(double cantidad){
        saldo =saldo +cantidad;
        
    }
    public void retirarDinero(double cantidad){
        saldo = saldo - cantidad;
    }
}
