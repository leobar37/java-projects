
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JOSE
 */
public class Prueba {
    
    
    private void Prueba(DefaultTableModel modeloTableModel){
        ListSelectionListener obj = new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent lse) {
             if(lse.getValueIsAdjusting()){
               int res =  JOptionPane.showConfirmDialog(null, "desea abrir el archivo");
                 if(res == 0){
                     
                 }
                 
                 
             }
                 
            }
        };
  
    }
    
    
}
