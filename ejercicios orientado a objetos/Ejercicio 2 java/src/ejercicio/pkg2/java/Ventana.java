
package ejercicio.pkg2.java;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Ventana extends JFrame{
    private JPanel panel;
    private JLabel etiqueta,imagen;
    private JRadioButton rb1,rb2,rb3,rb4;
    public Ventana() {
        setSize(700,400);
        setTitle("nuevo ejercicio");
        setLocationRelativeTo(null);
        iniciarComponentes();
        
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);

                
     }
    
    private void iniciarComponentes(){
        colocarPanel();
        colocarEtiqueta();
        colocarRadioBotones();
    }
    private void colocarPanel(){
        panel = new JPanel();
        this.add(panel);
        panel.setLayout(null);
 
    }
    private void colocarEtiqueta(){
        etiqueta = new JLabel("Escoja su deporte favorito");
         etiqueta.setBounds(20, 10, 250, 40);
         etiqueta.setFont(new Font("arial",3,18));
         panel.add(etiqueta);
    }
    private void colocarRadioBotones(){
        rb1 = new JRadioButton("Futbol");
         rb1.setBounds(20,80,100,40);
        rb1.setFont(new Font("arial rounded mt bolt",0,18));
       panel.add(rb1);
        
              rb2 = new JRadioButton("Baloncesto");
        rb2.setBounds(20, 140, 150,40);
        rb2.setFont(new Font("arial rounded mt bolt",0,18));
        panel.add(rb2);
              rb3 = new JRadioButton("tenis");
        rb3.setBounds(20, 200, 150,40);
        rb3.setFont(new Font("arial rounded mt bolt",0,18));
       panel.add(rb3);
        
        rb4 = new JRadioButton("natación");
        rb4.setBounds(20,260, 150,40);
        rb4.setFont(new Font("arial rounded mt bolt",0,18));
        panel.add(rb4);
        
        ButtonGroup ovjButtonGroup = new ButtonGroup();//agrupando los radio botones para que solo se pueda seleccionar uno 
        ovjButtonGroup.add(rb1);
        ovjButtonGroup.add(rb2);
        ovjButtonGroup.add(rb3);
        ovjButtonGroup.add(rb4);
        
        oyentesdeAccion();
        
    }
    private void oyentesdeAccion(){
        imagen = new JLabel();
        imagen.setBounds(200,80,350,250);
        panel.add(imagen);
        //imagenes 
          ImageIcon imagenFutbol = new ImageIcon(getClass().getResource("/imagenes/fut.jpeg"));
          ImageIcon imagenNatacion = new ImageIcon(getClass().getResource("/imagenes/natacion.jpg"));
         ImageIcon imagenTenis = new ImageIcon(getClass().getResource("/imagenes/tenis.jpg"));
          ImageIcon imagenBaloncesto = new ImageIcon(getClass().getResource("/imagenes/Baloncesto.jpg"));
          
       //oyectes de accion    
        ActionListener obj1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
              imagen.setIcon(new ImageIcon(imagenFutbol.getImage().getScaledInstance(imagen.getWidth(),imagen.getHeight(),Image.SCALE_SMOOTH)));
              // a la etiqueta imagen se le da un icono/establezco una imagen/otorgo imagen (futbol en este caso)/le eztablesco el mismo ancho y alto que la etiqueta
            
            }
        };
         ActionListener obj2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
              imagen.setIcon(new ImageIcon(imagenNatacion.getImage().getScaledInstance(imagen.getWidth(),imagen.getHeight(),Image.SCALE_SMOOTH)));
              // a la etiqueta imagen se le da un icono/establezco una imagen/otorgo imagen (futbol en este caso)/le eztablesco el mismo ancho y alto que la etiqueta
            
            }
        };
          ActionListener obj3 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
              imagen.setIcon(new ImageIcon(imagenTenis.getImage().getScaledInstance(imagen.getWidth(),imagen.getHeight(),Image.SCALE_SMOOTH)));
              // a la etiqueta imagen se le da un icono/establezco una imagen/otorgo imagen (futbol en este caso)/le eztablesco el mismo ancho y alto que la etiqueta
            
            }
        };
           ActionListener obj4 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
              imagen.setIcon(new ImageIcon(imagenBaloncesto.getImage().getScaledInstance(imagen.getWidth(),imagen.getHeight(),Image.SCALE_SMOOTH)));
              // a la etiqueta imagen se le da un icono/establezco una imagen/otorgo imagen (futbol en este caso)/le eztablesco el mismo ancho y alto que la etiqueta
            
            }
        };
        
     //otorgando el oyente de accion a los radioBotones 
     
        rb1.addActionListener(obj1);   
        rb2.addActionListener(obj2);  
        rb3.addActionListener(obj3);  
        rb4.addActionListener(obj4);  
    }
}
