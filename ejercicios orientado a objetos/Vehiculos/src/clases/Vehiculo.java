
package clases;


public class Vehiculo {
    private String marca;
    private String tipo;
    private  String precio;

    public Vehiculo(String marca, String tipo, String precio) {
        this.marca = marca;
        this.tipo = tipo;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
    
    
}
