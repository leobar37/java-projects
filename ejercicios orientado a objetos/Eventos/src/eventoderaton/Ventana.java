
package eventoderaton;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Ventana extends JFrame{
   private JPanel  panel;
   private JTextField texto;
   private JTextArea  Area;
    int contador = 0;
   private  JButton boton;
    public Ventana() {
        this.setBounds(50,50,500,500);
        this.setTitle("eventos ");
        iniciarComponenetes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
         
    }
    
    private void iniciarComponenetes(){
       agregarPanel();
        JtxtArea();   
      ColocarBoton();
      oyentesDeraton();
      

    }
    private void ColocarBoton(){
        boton = new JButton();
        boton.setBounds(30, 400, 200, 50);
        boton.setText("click");
        panel.add(boton);
    }
    private void agregarPanel(){
        panel = new JPanel();
        panel.setBounds(50,50,500,500);
        this.getContentPane().add(panel);
        panel.setLayout(null);
    }
    private void JtxtArea(){
        Area = new JTextArea();
        Area.setBounds(30,60,200,300);
        panel.add(Area);
    }  
    private void oyentesDeraton(){
         MouseListener obj = new MouseListener() {
             @Override
             public void mouseClicked(MouseEvent me) {
              Area.append("click \n");
              
             }

             @Override
             public void mousePressed(MouseEvent me) {
               Area.append(" mousePressed \n");
             }

             @Override
             public void mouseReleased(MouseEvent me) {
             //   Area.append(" mouseReleased \n");
             }

             @Override
             public void mouseEntered(MouseEvent me) {
             //  Area.append("mouse enterend \n");   //  = 1 activado
             }

             @Override
             public void mouseExited(MouseEvent me) {
             //    Area.append("mouse exited \n");   // 0  = desacivado
             }
         
         };
        boton.addMouseListener(obj);
      
    }       
           
}
