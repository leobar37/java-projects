
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JOSE
 */
public class Ventana extends javax.swing.JFrame {
   private   Timer tiempo;
   private int centesimas = 0 , segundos = 0, minutos =0, horas =0;
   private ActionListener acciones = new ActionListener() {
       @Override
       public void actionPerformed(ActionEvent ae) {
           centesimas ++;
           
           if(centesimas ==100){
               segundos ++;
               centesimas = 0;
           }
           if(segundos == 60){
               minutos ++;
               segundos =0;
               
           }
           if(minutos == 60){
               horas ++;
               minutos = 0;
           }
         actualizarTiempo();
       }
   };
    public Ventana() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        
        tiempo = new Timer(10,acciones);
       
    }
    private void  actualizarTiempo(){
        String mil,seg,min,h;
        if(centesimas <10){
            mil = "0"+centesimas;
            
        }else{
            mil = ""+centesimas;
        }
          if(segundos <10)seg = "0"+segundos;
          else seg = ""+segundos;
          if(minutos <10)min = "0"+minutos;
          else min = ""+minutos;
          if(horas <10)h = "0"+horas;
          else h = ""+horas;
        
        String rpta = h +":"+ min +":"+ seg +":"+ mil;
         
        lblTiempo.setText(rpta);
              
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        lblTiempo = new javax.swing.JLabel();
        BtnIniciar = new javax.swing.JButton();
        BtnParar = new javax.swing.JButton();
        BtnDetener = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTiempo.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        lblTiempo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTiempo.setText("00:00:00:00");
        lblTiempo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        BtnIniciar.setBackground(new java.awt.Color(255, 255, 51));
        BtnIniciar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnIniciar.setText("iniciar");
        BtnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIniciarActionPerformed(evt);
            }
        });

        BtnParar.setBackground(new java.awt.Color(255, 255, 102));
        BtnParar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnParar.setText("parar ");
        BtnParar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPararActionPerformed(evt);
            }
        });

        BtnDetener.setBackground(new java.awt.Color(255, 255, 102));
        BtnDetener.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnDetener.setText("detener");
        BtnDetener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDetenerActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("cronometro:");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(BtnParar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(BtnDetener, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(181, 181, 181)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(28, 28, 28)
                .addComponent(lblTiempo)
                .addGap(45, 45, 45)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnDetener, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnParar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIniciarActionPerformed
      tiempo.start();
      BtnIniciar.setEnabled(false);
      BtnIniciar.setText("reanudar");
      BtnParar.setEnabled(true);
      BtnDetener.setEnabled(true);
      
        
    }//GEN-LAST:event_BtnIniciarActionPerformed

    private void BtnPararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPararActionPerformed
       if(tiempo.isRunning()){
        tiempo.stop();
        BtnParar.setEnabled(false);
        BtnIniciar.setEnabled(true); 
       }

    }//GEN-LAST:event_BtnPararActionPerformed

    private void BtnDetenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDetenerActionPerformed
          tiempo.restart();
         centesimas = 0;
         segundos = 0;
          minutos = 0;
          horas = 0;
          actualizarTiempo();
         
        BtnDetener.setEnabled(false);
        BtnParar.setEnabled(true);
        BtnIniciar.setEnabled(true); 
        BtnIniciar.setText("iniciar");
       
        
        
    }//GEN-LAST:event_BtnDetenerActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnDetener;
    private javax.swing.JButton BtnIniciar;
    private javax.swing.JButton BtnParar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblTiempo;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
