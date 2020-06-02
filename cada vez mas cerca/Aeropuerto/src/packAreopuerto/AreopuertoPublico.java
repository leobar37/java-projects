/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packAreopuerto;

/**
 *
 * @author JOSE
 */
public class AreopuertoPublico extends Areopuerto {
    
    private double subvencion;

    public AreopuertoPublico(String nombre, String ciudad, String pais) {
        super(nombre, ciudad, pais);
    }

    public AreopuertoPublico(double subvencion, String nombre, String ciudad, String pais, int numCopañia, Compañia[] c) {
        super(nombre, ciudad, pais, numCopañia, c);
        this.subvencion = subvencion;
    }

    
    public AreopuertoPublico(double subvencion, String nombre, String ciudad, String pais) {
        super(nombre, ciudad, pais);
        this.subvencion = subvencion;
    }

    public double getSubvencion() {
        return subvencion;
    }
    
}
