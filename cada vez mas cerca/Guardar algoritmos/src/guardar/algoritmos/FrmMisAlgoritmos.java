/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guardar.algoritmos;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

import javax.swing.JOptionPane;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author JOSE
 */
public class FrmMisAlgoritmos extends javax.swing.JFrame {
private DefaultListModel<File> modeloModel;
private String contenido;       
private File misArchivos[];  
private int controlEvento = 0; //1 = adentro     y 0  ==afuera
    public FrmMisAlgoritmos() {
         
        initComponents();
        OyentedeAccion();
        modeloModel = new DefaultListModel<File>();
        jlistGeneral.setModel(modeloModel);
        
         jArea.setLineWrap(true); 
         setTitle("Guardar las notas");
         setDefaultCloseOperation(EXIT_ON_CLOSE);
         setLocationRelativeTo(null);
         setMinimumSize(new Dimension(700,700));
         setMaximumSize(new Dimension(700,600) );
         jPanel1.setBackground(Color.LIGHT_GRAY);
         jPanel2.setBackground(Color.gray);
         btnGuardar.setFont(new Font("calibri(cuerpo)", Font.BOLD, 16));
       jButton6.setFont(new Font("calibri(cuerpo)", Font.BOLD, 14));
       jLabel1.setFont(new Font("calibri(cuerpo)", Font.BOLD, 16));
       jLabel3.setFont(new Font("calibri(cuerpo)", Font.BOLD, 16));
       jLabel2.setFont(new Font("calibri(cuerpo)", Font.BOLD, 16));
        setResizable(false);
        jLabel1.setBackground(Color.black);
        jLabel2.setBackground(Color.black);
        jLabel3.setBackground(Color.black);
    }
    private void OyentedeAccion(){
        MouseListener obj = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
            }

            @Override
            public void mousePressed(MouseEvent me) {
                
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                
            }

            @Override
            public void mouseEntered(MouseEvent me) {
              
                controlEvento = 1;
            }

            @Override
            public void mouseExited(MouseEvent me) {
                controlEvento = 0;
            }
        };
        
        
        jlistGeneral.addMouseListener(obj);
    }
   
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtAlgoritmo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cboNotaTipo = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jArea = new javax.swing.JTextArea();
        jButton6 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        cboGeneral = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jlistGeneral = new javax.swing.JList<>();

        jButton1.setText("jButton1");

        jButton3.setText("jButton3");

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(960, 900));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel1.setText("Identificador de la nota");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 20, 181, 24);
        jPanel1.add(txtAlgoritmo);
        txtAlgoritmo.setBounds(210, 20, 408, 28);

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel2.setText("texto de la nota");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 130, 139, 28);

        btnGuardar.setText("Guardar Notas");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar);
        btnGuardar.setBounds(260, 680, 150, 40);

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel3.setText("Tipo de nota: ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(50, 80, 111, 24);

        cboNotaTipo.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        cboNotaTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Algoritmo", "Clases", "Metodos" }));
        cboNotaTipo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cboNotaTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboNotaTipoActionPerformed(evt);
            }
        });
        jPanel1.add(cboNotaTipo);
        cboNotaTipo.setBounds(200, 70, 137, 43);

        jArea.setColumns(20);
        jArea.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jArea.setRows(5);
        jScrollPane2.setViewportView(jArea);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(10, 160, 680, 520);

        jButton6.setText("Limpiar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(580, 130, 104, 28);

        jTabbedPane1.addTab("guardar Algoritmo", jPanel1);

        jPanel2.setForeground(new java.awt.Color(0, 204, 102));
        jPanel2.setLayout(null);

        cboGeneral.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Algoritmos", "clases", "metodos" }));
        cboGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboGeneralActionPerformed(evt);
            }
        });
        jPanel2.add(cboGeneral);
        cboGeneral.setBounds(30, 30, 570, 50);

        jlistGeneral.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ListSelectionListener obj = new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent lse) {

                if(lse.getValueIsAdjusting()){
                    if(controlEvento == 1){
                        int res =  JOptionPane.showConfirmDialog(null, "desea abrir el archivo");
                        if(res == 0){
                            int resp = jlistGeneral.getSelectedIndex();
                            File archivo  = modeloModel.getElementAt(resp);

                            Algoritmo obj = new Algoritmo();

                            try {

                                contenido =  obj.AbrirArchivo(archivo);
                                JOptionPane.showMessageDialog(null,"se mostro en ventana principal");
                            } catch (Exception ex) {
                                Logger.getLogger(FrmMisAlgoritmos.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            String  nombre = archivo.getName();

                            txtAlgoritmo.setText(nombre);
                            jArea.setText(contenido);

                        }

                    }

                }

            }

        };
        jlistGeneral.getSelectionModel().addListSelectionListener(obj);
        jScrollPane3.setViewportView(jlistGeneral);

        jPanel2.add(jScrollPane3);
        jScrollPane3.setBounds(30, 100, 660, 610);

        jTabbedPane1.addTab("leer algoritmo", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 751, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if((txtAlgoritmo.getText().equalsIgnoreCase("")) || jArea.getText().equalsIgnoreCase("")){
         JOptionPane.showMessageDialog(null, "hay campos vacios");
        }else{
        String nombre, algoritmo,tipo,texto="";
        nombre = txtAlgoritmo.getText();
        algoritmo = jArea.getText();
        tipo = cboNotaTipo.getSelectedItem().toString();
        String [] lineas = algoritmo.split("\n");
        String line = System.getProperty("line.separator"); 
        for(int i=0;i<lineas.length;i++){
          //  System.out.println("Linea "+i+ ": "+lineas[i]);
            texto = texto + lineas[i]+line;
        }
        Algoritmo obj = new Algoritmo();
        obj.setAlgoritmo(texto);
        obj.setNombre(nombre);
        obj.setTipo(tipo);
        try {
            obj.Guardar();
             JOptionPane.showMessageDialog(null, "se guardo en "+ tipo);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "hubo un error al guardar el archivo");
        }      
        }     
 
        
    }//GEN-LAST:event_btnGuardarActionPerformed

   
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
      txtAlgoritmo.setText("");
      jArea.setText("");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void cboGeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboGeneralActionPerformed
       File ruta;
        String  cbo =  cboGeneral.getSelectedItem().toString();
         if(cbo.equals("Algoritmos")){
             modeloModel.clear();
           ruta = new File("D:/Notas/mis algoritmos");  
            LLenarLista(ruta);
         }else{
             modeloModel.clear();
              if(cbo.equals("clases")){
         ruta = new File("D:/Notas/mis clases");
                  LLenarLista(ruta);
         }else{
                  modeloModel.clear();
                 ruta = new File("D:/Notas/mis metodos"); 
                LLenarLista(ruta);          
              }
         }
 
    }//GEN-LAST:event_cboGeneralActionPerformed

    private void cboNotaTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboNotaTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboNotaTipoActionPerformed
   private void LLenarLista(File ruta){
          misArchivos = ruta.listFiles();
         
         for(int i = 0; i<misArchivos.length ;i++){
             
             modeloModel.addElement(misArchivos[i]);
             
         }
            
   }
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
            java.util.logging.Logger.getLogger(FrmMisAlgoritmos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMisAlgoritmos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMisAlgoritmos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMisAlgoritmos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(FrmMisAlgoritmos.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(FrmMisAlgoritmos.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(FrmMisAlgoritmos.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(FrmMisAlgoritmos.class.getName()).log(Level.SEVERE, null, ex);
                }
                new FrmMisAlgoritmos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cboGeneral;
    private javax.swing.JComboBox<String> cboNotaTipo;
    private javax.swing.JTextArea jArea;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JList<File> jlistGeneral;
    private javax.swing.JTextField txtAlgoritmo;
    // End of variables declaration//GEN-END:variables
}
