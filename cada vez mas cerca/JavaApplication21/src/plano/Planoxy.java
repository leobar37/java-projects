/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plano;

/**
 *
 * @author JOSE
 */
public class Planoxy {
    private int  x ;
    private int y;

    public Planoxy(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void moverhaciaarriba (int incremento ){
        y += incremento;
  
    }
   public void moverhaciaabajo(int incremento){
       y -=incremento;

   }
  public void moverhaciaderecha(int incremento){
      x += incremento;
      
  }  
  public void moverhacialaizquierda(int incremento){
      x-= incremento;
  }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
}
