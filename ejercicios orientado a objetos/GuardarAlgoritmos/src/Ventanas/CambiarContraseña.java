/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Clases.Archivo;
import Clases.Contraseña;

import Clases.listaArchivos;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class CambiarContraseña extends javax.swing.JFrame {
  
    private String usuario;
    private String contraseñanew;
    private String condicion;
    public CambiarContraseña(String usuario, String contraseña,String condicion) {
        Archivo.LLenarVector();
        initComponents();
           cargarDatos();
        this.setLocationRelativeTo(null);
        //visibilidad de el campo ingresar contraseña
        visibilidad(false);
        //visibilidad de el campo cambiar contraseña
        visibilidadCon(false);
        lblUsuario.setText(usuario);
        this.usuario = usuario;
        this.contraseñanew = contraseña;
        this.condicion =condicion;
    }
    private void cargarDatos(){
           DefaultTableModel modelo = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        modelo.addColumn("usuario");
        modelo.addColumn("contraseña");
        modelo.addColumn("Condicion");
        Vector obj;
    Contraseña contraseObj;
     obj = listaArchivos.consultar();
     Object[] linea = new Object[3];
   for(int i = 0;i<obj.size();i++){
       contraseObj = (Contraseña)obj.elementAt(i);
       linea[0] = contraseObj.getUsuario();
       linea[1] = contraseObj.getContraseña();
       linea[2] =contraseObj.getCondicion();
       modelo.addRow(linea);
      }  
      TablaContraseña.setModel(modelo);
    }
  
    
 private void visibilidad(boolean c){
     ingresarnueva.setVisible(c);
     lblUsuario.setVisible(c);
     lblcontraseñanew.setVisible(c);
     txtUsuario.setVisible(c);
     TXTcontraseña.setVisible(c);
     btnGuardar.setVisible(c);
     lblCondicion.setVisible(c);
     cboCondicion.setVisible(c);
   
    
 }
  private void visibilidadCon(boolean c){
     btnCambiar.setVisible(c);
     txtNueva.setVisible(c);
     txtVieja.setVisible(c);
     lblNueva.setVisible(c);
     lblVieja.setVisible(c);
   
 }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaContraseña = new javax.swing.JTable();
        ingresarnueva = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        lblusuario = new javax.swing.JLabel();
        lblcontraseñanew = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        TXTcontraseña = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        lblNueva = new javax.swing.JLabel();
        lblVieja = new javax.swing.JLabel();
        txtVieja = new javax.swing.JTextField();
        txtNueva = new javax.swing.JTextField();
        btnCambiar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        lblCondicion = new javax.swing.JLabel();
        cboCondicion = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel1.setText("Usuario:");

        lblUsuario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setText("salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(TablaContraseña);

        ingresarnueva.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ingresarnueva.setText("ingresar nueva contraseña:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("contraseñas disponibles:");

        jButton2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton2.setText("registrar nueva contraseña");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        lblusuario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblusuario.setText("usuario");

        lblcontraseñanew.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblcontraseñanew.setText("contraseña");

        btnGuardar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton3.setText("cambiar contraseña");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        lblNueva.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblNueva.setText("contraseña actual");

        lblVieja.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblVieja.setText("nueva contraseña");

        btnCambiar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCambiar.setText("cambiar");
        btnCambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarActionPerformed(evt);
            }
        });

        lblCondicion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblCondicion.setText("Condicion");

        cboCondicion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cboCondicion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "admin", "normal" }));

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator3)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(lblusuario))
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(txtVieja, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblNueva, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addGap(132, 132, 132)
                                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblVieja)
                                            .addComponent(txtNueva, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(panelLayout.createSequentialGroup()
                                                .addGap(38, 38, 38)
                                                .addComponent(TXTcontraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblcontraseñanew)
                                                .addGap(39, 39, 39)))
                                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(panelLayout.createSequentialGroup()
                                                .addGap(60, 60, 60)
                                                .addComponent(lblCondicion))
                                            .addGroup(panelLayout.createSequentialGroup()
                                                .addGap(51, 51, 51)
                                                .addComponent(cboCondicion, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addComponent(jButton2)
                                        .addGap(68, 68, 68)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel3)
                                    .addComponent(ingresarnueva)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 6, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ingresarnueva)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblusuario)
                    .addComponent(lblcontraseñanew)
                    .addComponent(lblCondicion))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXTcontraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboCondicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNueva)
                    .addComponent(lblVieja))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVieja, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNueva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(btnCambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jButton1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      visibilidad(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
   if(txtUsuario.getText().equals("")|| TXTcontraseña.getText().equals("")){
       JOptionPane.showMessageDialog(null,"no puede haber campos vacios");  
   }else{
      //la contraseña esta encriptada con 3 
      String condicion = cboCondicion.getSelectedItem().toString();
      Contraseña obj = new Contraseña(txtUsuario.getText(), TXTcontraseña.getText(),condicion);
      JOptionPane.showMessageDialog(null,"contraseña agregada");
      listaArchivos.agregar(obj);
      cargarDatos();
      Archivo.ReescribirArchivo();
      txtUsuario.setText("");
      TXTcontraseña.setText("");
   }
     
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        visibilidadCon(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnCambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarActionPerformed

        String contraseñaVieja;
     contraseñaVieja = txtVieja.getText();
     Contraseña contraseñaProbar = new Contraseña(usuario,contraseñaVieja,condicion);
    if( Archivo.leer(contraseñaProbar)!=null){
        
        int i =posicion(contraseñaProbar);
        System.out.println("la posicion encontrada es"+i);
        String ContraseñaNueva;
        ContraseñaNueva = txtNueva.getText();
        Contraseña objNuevo = new Contraseña(usuario,ContraseñaNueva,condicion);
        listaArchivos.Modificar(i,objNuevo);
        cargarDatos();
        Archivo.ReescribirArchivo();
        JOptionPane.showMessageDialog(null,"se ha cambiado la contraseña "+usuario);
        txtNueva.setText("");
        txtVieja.setText("");
     }else{
       JOptionPane.showMessageDialog(null,"no se han encontrado coincidencias");  
     }
    }//GEN-LAST:event_btnCambiarActionPerformed
  

 private int posicion(Contraseña obj){
  int posicion=0;   
  Vector  vector = listaArchivos.consultar();
   for(int i = 0;i<vector.size();i++){
     if(obj == (Contraseña)vector.elementAt(i)){
      posicion = i;
     }  
   }
  return posicion;   
 }
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
            java.util.logging.Logger.getLogger(CambiarContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CambiarContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CambiarContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CambiarContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CambiarContraseña(null,null,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TXTcontraseña;
    private javax.swing.JTable TablaContraseña;
    private javax.swing.JButton btnCambiar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cboCondicion;
    private javax.swing.JLabel ingresarnueva;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblCondicion;
    private javax.swing.JLabel lblNueva;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblVieja;
    private javax.swing.JLabel lblcontraseñanew;
    private javax.swing.JLabel lblusuario;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField txtNueva;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JTextField txtVieja;
    // End of variables declaration//GEN-END:variables
}
