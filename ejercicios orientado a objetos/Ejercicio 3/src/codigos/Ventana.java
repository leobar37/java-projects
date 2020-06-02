/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigos;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public class Ventana extends  JFrame{
    private JPanel panel;
    private JLabel etiqueta;
    private JButton btnRojo,btnVerde,btnAzul;
    private int pulsado =0;
    private int contRojo = 0, contVerde =0, contAzul =0 ;
    
    public  Ventana(){
        setSize(600,400);
        setLocationRelativeTo(null);
        setTitle("ejercicio 3 colores Rgb");
        iniciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
        
     }
    private void iniciarComponentes(){
        colocarPaneles();
        colocarEtiquetas();
        colocarBotones();
    }
    private void colocarPaneles(){
        panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);
        colocarEventoRaton();

    }
    private void colocarEtiquetas(){
        etiqueta = new JLabel();
        etiqueta.setText("colores: (rojo, verde,azul)");
        etiqueta.setBounds(80,30, 400, 50);
        etiqueta.setFont(new Font("arial",Font.ITALIC,18));
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(etiqueta);
    
    }
    private void colocarBotones(){
        /*
        pulsado = 1 -> boton Rojo
        pulsado = 2 ->boton Verde
        pulsado = 3 -> boton Azul
        */
      btnRojo = new JButton("Rojo");
      btnRojo.setBounds(50,230,130,50);
      btnRojo.setForeground(Color.RED);
      btnRojo.setFont(new Font("arial rounded mt bold",0,20));
      panel.add(btnRojo);
      btnRojo.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent ae) {
           pulsado = 1;
          }
      });
     
      
            btnVerde = new JButton("Verde");
      btnVerde.setBounds(230,230,130,50);
      btnVerde.setForeground(Color.green);
      btnVerde.setFont(new Font("arial rounded mt bold",0,20));
      panel.add(btnVerde);
       btnVerde.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent ae) {
           pulsado = 2;
          }
      });
            btnAzul = new JButton("Azul");
      btnAzul.setBounds(410,230,130,50);
      btnAzul.setForeground(Color.blue);
      btnAzul.setFont(new Font("arial rounded mt bold",0,20));
      panel.add(btnAzul);
       btnAzul.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent ae) {
           pulsado = 3;
          }
      });
      
    }
    private void colocarEventoRaton(){
        
        MouseWheelListener obj = new MouseWheelListener() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent mwe) {
             if(pulsado != 0){//se ha pulsado algun boton
                 if(pulsado == 1){ //se ha pulsado el boton rojo
                   contRojo += mwe.getPreciseWheelRotation();
                   
                   if(contRojo < 0 ){
                       contRojo = 0;
                   }else if(contRojo > 255){
                        contRojo = 255;
                   }
                 }else if(pulsado == 2){ //se ha pulsado el boton verde 
                      contVerde += mwe.getPreciseWheelRotation();
                   
                   if(contVerde < 0 ){
                       contVerde = 0;
                   }else if(contVerde > 255){
                        contVerde = 255;
                   }
                 }else{ // se ha pulsado el boton azul
                        contAzul += mwe.getPreciseWheelRotation();
                   
                   if(contAzul < 0 ){
                       contAzul = 0;
                   }else if(contAzul > 255){
                        contAzul = 255;
                   }  
                 }
             }
            etiqueta.setText("colores: rojo: "+contRojo+  " verde: "+contVerde+" azul: "+contAzul);
            panel.setBackground(new Color(contRojo, contVerde,contAzul));
            }
        };
        
        
        
        panel.addMouseWheelListener(obj);
    }
}
