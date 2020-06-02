/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Clases.Proceso;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

/**
 *
 * @author JOSE
 */
public class Principal extends javax.swing.JFrame {
  private String usuario;
  private String contraseña;
  private String condicion="admin";    
  
    public Principal(String usuario,String contraseña,String condicion) {
     
        initComponents();
        File carpeta = new File("Notas");
  
        if(carpeta.mkdir()){
            System.out.println("archivo creado");  
        }
        CrearLista();
       // Permiso(condicion);
        this.setLocationRelativeTo(null);
        lblUsuario.setText(usuario);
        this.usuario = usuario;
       this.contraseña = contraseña;
       this.condicion =condicion;
    }
    private void CrearLista(){
        Proceso pr = new Proceso();
        File carpeta = new File("Notas");
        
        DefaultListModel modelo = new DefaultListModel();
        
        File[] files = carpeta.listFiles();
        for(int i=0;i<files.length;i++){
            
            modelo.addElement(files[i].getName());
            
            
        }         
        
        lista.setModel(modelo);
    }
private void Permiso(String con){
   if(con.equals("admin")){
    
   }else{
      ContraseñaMen.setVisible(false); 
   }  
} 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jColorChooser1 = new javax.swing.JColorChooser();
        panel = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        texto = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtNombreArchivo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        MENU = new javax.swing.JMenu();
        ContraseñaMen = new javax.swing.JMenuItem();
        Salir = new javax.swing.JMenuItem();

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(102, 102, 255));
        panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelMouseClicked(evt);
            }
        });

        lblUsuario.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUsuario.setPreferredSize(new java.awt.Dimension(100, 25));

        texto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        texto.setText("Usuario:");

        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setText("Crear un archivo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lista.setBackground(new java.awt.Color(255, 255, 102));
        lista.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lista.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lista.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lista);

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(278, Short.MAX_VALUE)
                .addComponent(texto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(26, 26, 26)
                        .addComponent(txtNombreArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texto))
                .addGap(46, 46, 46)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(txtNombreArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        MENU.setText("Menú");

        ContraseñaMen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/contraseña.png"))); // NOI18N
        ContraseñaMen.setText("contraseñas");
        ContraseñaMen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContraseñaMenActionPerformed(evt);
            }
        });
        MENU.add(ContraseñaMen);

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        MENU.add(Salir);

        jMenuBar1.add(MENU);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ContraseñaMenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContraseñaMenActionPerformed
        CambiarContraseña obj = new CambiarContraseña(usuario, contraseña,condicion);
        obj.setVisible(true);
        
        
    }//GEN-LAST:event_ContraseñaMenActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
       System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
        
      try {
          File archivo = new File("Notas/"+txtNombreArchivo.getText()+".txt");
          archivo.createNewFile();
          Runtime runtime = Runtime.getRuntime(); 
          Process process = runtime.exec("C:\\Windows\\notepad.exe "+"Notas/"+txtNombreArchivo.getText()+".txt");
          CrearLista();
      } catch (IOException ex) {
          System.err.println("no se creo el archivo");
      }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMouseClicked
        System.out.println("panel");
    }//GEN-LAST:event_panelMouseClicked

    private void listaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaMouseClicked
        String l = lista.getSelectedValue();
        System.out.println(l);
      try {
          
          Runtime runtime = Runtime.getRuntime(); 
          Process process = runtime.exec("C:\\Windows\\notepad.exe "+"Notas/"+l);
          //CrearLista();
      } catch (IOException ex) {
          System.err.println("no se creo el archivo");
      }
        
        
    }//GEN-LAST:event_listaMouseClicked

  
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal(null,null,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ContraseñaMen;
    private javax.swing.JMenu MENU;
    private javax.swing.JMenuItem Salir;
    private javax.swing.JButton jButton1;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JList<String> lista;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel texto;
    private javax.swing.JTextField txtNombreArchivo;
    // End of variables declaration//GEN-END:variables
}
