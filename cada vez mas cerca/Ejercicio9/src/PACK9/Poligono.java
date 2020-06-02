
package PACK9;


public abstract class Poligono {
    protected int nlados;

    public Poligono(int nlados) {
        this.nlados = nlados;
    }

    public int getNlados() {
        return nlados;
    }

    @Override
    public String toString() {
        return "numero de lados es " + nlados ;
    }
    
    public abstract double area();
    
}
