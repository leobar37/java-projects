
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

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
    DefaultMutableTreeNode Raiz = new DefaultMutableTreeNode("raiz");
    DefaultTreeModel Jtree = new DefaultTreeModel(Raiz);
    /*
     secuecia para poner un Jtree 
     1. poner un modelo por defecto 
      2. psarle por parametro un node DefaultTreeModel 
      3 . Despues cargarle los metodos que sean necesarios 
      
    
    nota: 
    para agrgarle un evento se necesita  instanciar primero el JTREE
    y despues se puede agregar el pedazo de codigo en post-init-cod   
    
     
     
    */
     
    
    public Ventana() {
        
        CargarDatos();
        initComponents();
    }
    
    private void EventoJtree(){
        TreeSelectionListener Evento = new TreeSelectionListener() {
            @Override
            public void valueChanged(TreeSelectionEvent tse) {
                
               DefaultMutableTreeNode nodo = (DefaultMutableTreeNode)Arbol.getLastSelectedPathComponent();                      //este metodo guarda el ultimo elemento seleccionado
                if(nodo.toString().equals("rojo")){
                   etqImagen.setIcon(new ImageIcon(getClass().getResource("/imagenes/rojo .png")));
                }
            }
        };
        Arbol.getSelectionModel().addTreeSelectionListener(Evento);
        
    }
   private void CargarDatos(){
       DefaultMutableTreeNode colores = new DefaultMutableTreeNode("colores");
       DefaultMutableTreeNode Deportes = new DefaultMutableTreeNode("deportes");
        Raiz.add(colores);
        Raiz.add(Deportes);
        DefaultMutableTreeNode rojo = new DefaultMutableTreeNode("rojo");
        DefaultMutableTreeNode azul = new DefaultMutableTreeNode("azul");
        colores.add(azul);
        colores.add(rojo);
        
        DefaultMutableTreeNode Futbol = new DefaultMutableTreeNode("futbol");
        DefaultMutableTreeNode voley = new DefaultMutableTreeNode("voley");
        Deportes.add(Futbol);
        Deportes.add(voley);
        
        
   }  

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MenuDesplegable = new javax.swing.JPopupMenu();
        Jdialog = new javax.swing.JMenuItem();
        Cerrar = new javax.swing.JMenuItem();
        Panel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Arbol = new javax.swing.JTree();
        etqImagen = new javax.swing.JLabel();

        Jdialog.setText("JDialog");
        Jdialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JdialogActionPerformed(evt);
            }
        });
        MenuDesplegable.add(Jdialog);

        Cerrar.setText("Cerrar");
        Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarActionPerformed(evt);
            }
        });
        MenuDesplegable.add(Cerrar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                PanelMouseReleased(evt);
            }
        });
        Panel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        Arbol.setModel(Jtree);
        EventoJtree();
        jScrollPane1.setViewportView(Arbol);

        Panel.add(jScrollPane1);

        etqImagen.setPreferredSize(new java.awt.Dimension(250, 250));
        Panel.add(etqImagen);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JdialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JdialogActionPerformed
         JDialog  obj = new JDialog(this, false);   //cuando es true la ventana principal se va ha poder modificar 
         
        obj.setVisible(true);
    }//GEN-LAST:event_JdialogActionPerformed

    private void PanelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelMouseReleased
        if(evt.isPopupTrigger()){
              MenuDesplegable.show(evt.getComponent(), evt.getX(),evt.getY());
        }
        
    }//GEN-LAST:event_PanelMouseReleased

    private void CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarActionPerformed
       System.exit(0);
    }//GEN-LAST:event_CerrarActionPerformed

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
    private javax.swing.JTree Arbol;
    private javax.swing.JMenuItem Cerrar;
    private javax.swing.JMenuItem Jdialog;
    private javax.swing.JPopupMenu MenuDesplegable;
    private javax.swing.JPanel Panel;
    private javax.swing.JLabel etqImagen;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
