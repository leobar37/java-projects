/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventana;

import Alterno.Archivo;
import Alterno.Jugador;
import Alterno.ListaGanador;
import static Alterno.ListaGanador.consultarTodo;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

 
public class VentanaInicial extends javax.swing.JFrame {
   public int[] antx= new int[2]; //guardo los datos del jugador de sus rondas anteriores
   public int[] anty= new int[2];
   private Jugador jugador1;
   private Jugador jugador2;
   private int cbose = 0;
   private int cbose1 = 0;
   
  
    public VentanaInicial() { 
        initComponents();
        btnComenzar.setVisible(false);
        this.setLocationRelativeTo(null);
        this.setSize(584, 490);
        Archivo.iniciar();
        Archivo.llenarVector();
        CargarComboBox1(cboJugador1);
        CargarComboBox2(cboJugador2);
    }
   private void CargarComboBox1(JComboBox e){
       DefaultComboBoxModel modelo = new DefaultComboBoxModel();     
        modelo.addElement("seleccione un jugador");
        Vector v = consultarTodo();   
        Jugador j;
        for(int i=0;i<v.size();i++){
            j = (Jugador)v.elementAt(i);
            modelo.addElement(j.getNombre());
        }
      e.setModel(modelo);
    }
    private void CargarComboBox2(JComboBox e){
       DefaultComboBoxModel modelo2 = new DefaultComboBoxModel();
        
        modelo2.addElement("seleccione un jugador");
        Vector v = consultarTodo();   
        Jugador j;
        for(int i=0;i<v.size();i++){
            j = (Jugador)v.elementAt(i);
            modelo2.addElement(j.getNombre());
        }
      e.setModel(modelo2);
    }
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUsuario1 = new javax.swing.JTextField();
        txtUsuario2 = new javax.swing.JTextField();
        lblImagen = new javax.swing.JLabel();
        btnComenzar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        lblMuestra1 = new javax.swing.JLabel();
        lblMuestra2 = new javax.swing.JLabel();
        cboJugador1 = new javax.swing.JComboBox<>();
        cboJugador2 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel1.setText("Juego 3 en raya");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Digite Usuario 1:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Digite Usuario 2:");

        txtUsuario1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txtUsuario2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tres en raya.png"))); // NOI18N
        lblImagen.setRequestFocusEnabled(false);

        btnComenzar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnComenzar.setText("Comenzar");
        btnComenzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComenzarActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        lblMuestra1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        lblMuestra2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        cboJugador1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboJugador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboJugador1ActionPerformed(evt);
            }
        });

        cboJugador2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboJugador2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboJugador2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMuestra1)
                    .addComponent(lblMuestra2)
                    .addComponent(btnComenzar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblImagen)
                .addGap(32, 32, 32))
            .addGroup(PanelLayout.createSequentialGroup()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jLabel1))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(33, 33, 33)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUsuario1, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                            .addComponent(txtUsuario2))
                        .addGap(35, 35, 35)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cboJugador1, 0, 187, Short.MAX_VALUE)
                            .addComponent(cboJugador2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(btnGuardar)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtUsuario2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnGuardar)
                        .addGap(4, 4, 4)
                        .addComponent(lblImagen)
                        .addContainerGap(48, Short.MAX_VALUE))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(lblMuestra1)
                        .addGap(18, 18, 18)
                        .addComponent(lblMuestra2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnComenzar)
                        .addGap(21, 21, 21))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

            boolean aux = true;
          if (!txtUsuario1.getText().equals("") && !txtUsuario2.getText().equals("")) {
            if (txtUsuario1.getText().equalsIgnoreCase(txtUsuario2.getText())) {
               JOptionPane.showMessageDialog(null, "los jugadores son iguales");
                
            } else {
               
                if (ListaGanador.Existe(txtUsuario1.getText()) && cbose == 0) {
                    JOptionPane.showMessageDialog(null, "ya esta registrado: " + txtUsuario1.getText());
                    jugador1 = ListaGanador.Objeto(txtUsuario1.getText());
                    //en la pos las rondas anteriormente perdidas y ganadas
                 
                    

                } else {
                    jugador1 = new Jugador();
                    jugador1.setNombre(txtUsuario1.getText());
                    ListaGanador.agregar(jugador1);
                    
                    
                }
                if (ListaGanador.Existe(txtUsuario2.getText()) && cbose1 == 0) {
                    JOptionPane.showMessageDialog(null, "ya esta registrado: " + txtUsuario2.getText());
                    jugador2 = ListaGanador.Objeto(txtUsuario2.getText());
                   
                } else {
                    jugador2 = new Jugador();
                    jugador2.setNombre(txtUsuario2.getText());
                    ListaGanador.agregar(jugador2);
                     
                }
                btnGuardar.setVisible(false);
                btnComenzar.setVisible(true);
                lblMuestra1.setText(jugador1.getNombre().toLowerCase()+ ": x");
                lblMuestra2.setText(jugador2.getNombre().toLowerCase()+ ": o");
            }

        } else {
            JOptionPane.showMessageDialog(null, "hay espacios vacios");
        }
          
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnComenzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComenzarActionPerformed

        Ventana obj = new Ventana(jugador1, jugador2);
        System.out.println("1"+jugador1.getNombre());
        System.out.println("2"+jugador2.getNombre());
        obj.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_btnComenzarActionPerformed

    private void cboJugador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboJugador1ActionPerformed
         String excepto = ((JComboBox)evt.getSource()).getSelectedItem().toString();
        if(excepto.equals("seleccione un jugador")){
            
        }else{
        String v  =  (String)cboJugador1.getSelectedItem();
        txtUsuario1.setText(v);
        cbose = 1; 
        }
    }//GEN-LAST:event_cboJugador1ActionPerformed

    private void cboJugador2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboJugador2ActionPerformed
         String excepto = ((JComboBox)evt.getSource()).getSelectedItem().toString();
        if(excepto.equals("seleccione un jugador")){
            
        }else{
        String v  =  (String)cboJugador2.getSelectedItem();
        txtUsuario2.setText(v);
        System.out.println();  
        cbose1 =1;
        }
    }//GEN-LAST:event_cboJugador2ActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel;
    private javax.swing.JButton btnComenzar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cboJugador1;
    private javax.swing.JComboBox<String> cboJugador2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblMuestra1;
    private javax.swing.JLabel lblMuestra2;
    private javax.swing.JTextField txtUsuario1;
    private javax.swing.JTextField txtUsuario2;
    // End of variables declaration//GEN-END:variables
}
