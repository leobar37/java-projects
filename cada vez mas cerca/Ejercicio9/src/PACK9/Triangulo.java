/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PACK9;

/**
 *
 * @author JOSE
 */
public class Triangulo extends Poligono {
    
    private double lado1;
    private double lad2;
    private double lado3;

    public Triangulo(double lado1, double lad2, double lado3) {
        super(3);
        this.lado1 = lado1;
        this.lad2 = lad2;
        this.lado3 = lado3;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLad2() {
        return lad2;
    }

    public double getLado3() {
        return lado3;
    }

    @Override
    public String toString() {
        return "numero de lados: " +super.toString() +"lado1:  " + lado1 + ", lado 2: " + lad2 + ", lado 3:  " + lado3;
    }
    
    @Override
    public double area(){
        double p;
        p = (lado1 + lad2 +lado3)/2;
        
        return Math.sqrt(p*(p-lado1)*(p-lad2)*(p-lado3));
    }
    
}
