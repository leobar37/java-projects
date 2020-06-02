/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventana;

import Alterno.Jugador;
import Alterno.ListaGanador;
import javax.swing.ImageIcon;



public class VentanaGanador extends javax.swing.JDialog {
 

    public VentanaGanador(java.awt.Frame parent, boolean modal) {
        
        super(parent, modal);
        System.out.println("ventana");
        initComponents();
        this.setLocationRelativeTo(null);
        
   
        
    }
    public void Ganador(int ganador,Jugador gano,Jugador perdio){
           if(ganador == 1){
            ImageIcon imagen = ImagenGanaste(1);
            lblImagen.setIcon(imagen);
            lblResultado.setText("Felicidades "+gano.getNombre()+" has ganado");
            //ganador
          
            gano.setGanadas();
            ListaGanador.Modificar(gano);
           
            //perdedor
            
            perdio.setPerdidas();
            ListaGanador.Modificar(perdio);
           
            
        }else{
            if(ganador == 2){
           ImageIcon imagen = ImagenGanaste(2);
            lblImagen.setIcon(imagen);
            lblResultado.setText("nadie ha ganado");  
        }
       
        }  
    }
    
   private ImageIcon ImagenGanaste(int i){
       
       ImageIcon Ganaste = new ImageIcon(getClass().getResource("/Imagenes/gifFornitexD.gif"));
       ImageIcon perdiste = new ImageIcon(getClass().getResource("/Imagenes/homeroTrzte.png"));
       
       if( i == 1){
           return Ganaste;
       }else{ 
           return perdiste;
       }
       
   }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        lblResultado = new javax.swing.JLabel();
        panel2 = new javax.swing.JPanel();
        btnJugar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lblImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblResultado.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblResultado.setText("jLabel1");
        panel.add(lblResultado);

        panel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnJugar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnJugar.setText("Jugar de Nuevo");
        btnJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarActionPerformed(evt);
            }
        });
        panel2.add(btnJugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        jButton2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton2.setText("salir ");
        panel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        lblImagen.setPreferredSize(new java.awt.Dimension(220, 259));
        panel2.add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 220, 270));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
                    .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarActionPerformed
       
        dispose();
        
        /*   int i =JOptionPane.showConfirmDialog(null,"desea jugar con los mismos jugadores");
          if (i ==  0){
              Ventana ventana = new Ventana(, usuario2);
              ventana.setVisible(true);
              dispose();
              
          }else{
               if(i == 1){
                    
                   VentanaInicial obj = new VentanaInicial();
                   obj.setVisible(true);                   
                   dispose();
               }else{
                   System.exit(0);
               }  
 
        }*/
    }//GEN-LAST:event_btnJugarActionPerformed

  
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaGanador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaGanador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaGanador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaGanador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaGanador dialog = new VentanaGanador(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJugar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panel2;
    // End of variables declaration//GEN-END:variables
}
