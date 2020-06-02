|/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventana;

import Alterno.Archivo;
import Alterno.Jugador;
import Alterno.ListaGanador;
import javax.swing.JOptionPane;


public class Ventana extends javax.swing.JFrame {
private boolean  jugador = true;//jugador 1 = true y jugador 2 == false
private String datosx="";
private String datosy ="";
private int jugadax = 0;
private  int jugaday = 0;
private boolean  casilla[][] =  new boolean[3][3];
private Jugador jugador1;
private Jugador jugador2;

 
    public Ventana(Jugador J1,Jugador J2) {
        initComponents();
        this.setLocationRelativeTo(null);
        iniciarMatriz();
        this.jugador1=J1;
        this.jugador2=J2;
   
    }

    public Jugador getJugador1() {
        return jugador1;
    }

    public Jugador getJugador2() {
        return jugador2;
    }
    
    private void Reiniciar(){
       iniciarMatriz();
        jugador = true;
      datosx = "";
      datosy = "";
      jugadax = 0;
      jugaday = 0;
      Btn1.setText("");
      Btn2.setText("");
      Btn3.setText("");
      Btn4.setText("");
      Btn5.setText("");
      btn6.setText("");
      Btn7.setText("");
      btn8.setText("");
      Btn9.setText("");
     
    }
    private void iniciarMatriz(){
        for(int i = 0 ; i<3 ; i++){
            for(int j = 0; j<3;j++){
                casilla[i][j] = true;
            }
        }
    }
  private void ActualizarDatos(){
    if(Buscar(datosx)== true){  
        System.out.println("gando x");
      
           getJugador1().setGanadas();
           getJugador2().setPerdidas();
           ListaGanador.Modificar(jugador1);
           ListaGanador.Modificar(jugador2);
           Archivo.Registrar();
           
    }else{
         if(Buscar(datosy)==true){
           /*VentanaGanador ventanaGanador = new VentanaGanador(null,false);
            ventanaGanador.Ganador( 1, getJugador2(),getJugador1());
           ventanaGanador.setVisible(true);*/
          // jugador = true;
          JOptionPane.showMessageDialog(null, "gano el jugador con o");
           getJugador2().setGanadas();
           getJugador1().setPerdidas();
           ListaGanador.Modificar(jugador1);
           ListaGanador.Modificar(jugador2);
           Archivo.Registrar();
           
        }else{
             if((jugadax+jugaday) == 9){
                VentanaGanador ventanaGanador = new VentanaGanador(null, false);
                 ventanaGanador.Ganador( 2, getJugador1(),getJugador2());
                ventanaGanador.setVisible(true);
                iniciarMatriz();
             
             }
        }
    } 
        

    }
    private Boolean Buscar(String cadena){
        boolean ganador = false;
        char[] cady = cadena.toCharArray();
        char c;
        
      int cont1 = 0;
      int cont2 = 0;
      int cont3 = 0;
      int cont4 = 0;
      int cont5 = 0;
      int cont6 = 0;
      int cont7 = 0;
      int cont8 = 0;
      String comb1 = "123";
      String com2 = "456";
      String com3 = "789";
      String com4 = "159";
      String com5 = "357";
      String com6 = "147";
      String com8 = "258";
      String com9 = "369";
      for (int i = 0; i < cady.length; i++) { //saco los caracteres recogidos por datos x
          c = cady[i];
          for (int j = 0; j < comb1.length(); j++) {//comparando con la primera combinacion
              if (c == comb1.charAt(j)) {
                  cont1 = cont1 + 1;
              }
          }
          for (int j = 0; j < com2.length(); j++) {//comparando con la segunda combinacion
              if (c == com2.charAt(j)) {
                  cont2 = cont2 + 1;
              }
          }
          for (int j = 0; j < com3.length(); j++) {//comparando con la tercera combinacion
              if (c == com3.charAt(j)) {
                  cont3 = cont3 + 1;
              }
          }
          for (int j = 0; j < com4.length(); j++) {//comparando con la cuarta combinacion
              if (c == com4.charAt(j)) {
                  cont4 = cont4 + 1;
              }
          }
          for (int j = 0; j < com5.length(); j++) {//comparando con la quinta combinacion
              if (c == com5.charAt(j)) {
                  cont5 = cont5 + 1;
              }
          }
          for (int j = 0; j < com6.length(); j++) {//comparando con la sexta combinacion
              if (c == com6.charAt(j)) {
                  cont6 = cont6 + 1;
              }                                //por error me salte un numero no lo arreglo quiero evitar la fatiga 
          }
          for (int j = 0; j < com8.length(); j++) {//comparando con la quinta combinacion
              if (c == com8.charAt(j)) {
                  cont7 = cont7 + 1;
              }
          }
          for (int j = 0; j < com9.length(); j++) {//comparando con la quinta combinacion
              if (c == com8.charAt(j)) {
                  cont8 = cont8 + 1;
              }
          }

      }
     if (cont1 == 3 || cont2 == 3 || cont3 == 3 || cont4 == 3 || cont5 == 3 || cont6 == 3 || cont7 == 3 || cont8 == 3) {
          ganador = true;
      } 
      
     return ganador;
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jSeparator3 = new javax.swing.JSeparator();
        Panel = new javax.swing.JPanel();
        Btn1 = new javax.swing.JButton();
        Btn2 = new javax.swing.JButton();
        Btn3 = new javax.swing.JButton();
        Btn4 = new javax.swing.JButton();
        Btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        Btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        Btn9 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        BarraPrincipal = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menTabla = new javax.swing.JMenuItem();
        MenJugarDeNuevo = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        MenSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Juego tres en raya");
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
        });

        Panel.setLayout(new java.awt.GridBagLayout());

        Btn1.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        Btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        Panel.add(Btn1, gridBagConstraints);

        Btn2.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        Btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        Panel.add(Btn2, gridBagConstraints);

        Btn3.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        Btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        Panel.add(Btn3, gridBagConstraints);

        Btn4.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        Btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        Panel.add(Btn4, gridBagConstraints);

        Btn5.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        Btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn5ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        Panel.add(Btn5, gridBagConstraints);

        btn6.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        Panel.add(btn6, gridBagConstraints);

        Btn7.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        Btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn7ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        Panel.add(Btn7, gridBagConstraints);

        btn8.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        Panel.add(btn8, gridBagConstraints);

        Btn9.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        Btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn9ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        Panel.add(Btn9, gridBagConstraints);
        Panel.add(jSeparator1, new java.awt.GridBagConstraints());

        jMenu1.setText("Menu");

        menTabla.setText("Tabla");
        menTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menTablaActionPerformed(evt);
            }
        });
        jMenu1.add(menTabla);

        MenJugarDeNuevo.setText("Jugar de Nuevo");
        MenJugarDeNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenJugarDeNuevoActionPerformed(evt);
            }
        });
        jMenu1.add(MenJugarDeNuevo);
        jMenu1.add(jSeparator2);

        MenSalir.setText("Salir");
        MenSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenSalirActionPerformed(evt);
            }
        });
        jMenu1.add(MenSalir);

        BarraPrincipal.add(jMenu1);

        setJMenuBar(BarraPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, 681, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
       
    }//GEN-LAST:event_formMouseEntered
   
    private void Btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn1ActionPerformed
      if(casilla[0][0]==true){
          if(jugador == true){
            Btn1.setText("x");
            datosx = datosx + "1";
            jugadax = jugadax + 1;
            if(jugadax >= 3){
                ActualizarDatos();
            }
            
         jugador=false;  //cambio de jugador         
        }else{
            Btn1.setText("o");
            datosy = datosy + "1";
            jugaday = jugaday+1;
            if(jugaday >= 3){
                ActualizarDatos(); 
            }
            jugador= true;//cambio de jugador 
        }
         casilla[0][0]=false; 
      }
        
        
    }//GEN-LAST:event_Btn1ActionPerformed

    private void Btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn2ActionPerformed
        if(casilla[0][1]==true){
              if(jugador == true){
            Btn2.setText("x");
            datosx = datosx + "2";
            jugadax = jugadax + 1;
            if(jugadax >= 3){
                ActualizarDatos();
            }
         jugador=false;  //cambio de jugador         
        }else{
            Btn2.setText("o");
            datosy = datosy + "2";
            jugaday = jugaday+1;
            if(jugaday >= 3){
                ActualizarDatos(); 
            }
            jugador= true;//cambio de jugador 
            casilla[0][1] =false;
           } 
        }
        
     
    }//GEN-LAST:event_Btn2ActionPerformed

    private void Btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn3ActionPerformed
        if(casilla[0][2]==true){
             if(jugador == true){
            Btn3.setText("x");
            datosx = datosx + "3";
            jugadax = jugadax + 1;
            if(jugadax >= 3){
                ActualizarDatos();
            }
           jugador = false;      
        }else{
            Btn3.setText("o");
            datosy = datosy + "3";
            jugaday = jugaday+1;
            if(jugaday >= 3){
                ActualizarDatos(); 
            }
          jugador = true;
          casilla[0][2]=false;
        }
        } 
       
    }//GEN-LAST:event_Btn3ActionPerformed

    private void Btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn4ActionPerformed
      if(casilla[1][0]){
         if(jugador == true){
            Btn4.setText("x");
            datosx = datosx + "4";
            jugadax = jugadax + 1;
            if(jugadax >= 3){
                ActualizarDatos();
            }
            jugador = false;
                 
        }else{
            Btn4.setText("o");
            datosy = datosy + "4";
            jugaday = jugaday+1;
            if(jugaday >= 3){
                ActualizarDatos(); 
            }
            jugador = true;
        }
        casilla[1][0]=false;
      }
        
    }//GEN-LAST:event_Btn4ActionPerformed

    private void Btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn5ActionPerformed
       if(casilla[1][1]==true){
           if(jugador == true){
            Btn5.setText("x");
            datosx = datosx + "5";
            jugadax = jugadax + 1;
            if(jugadax >= 3){
                ActualizarDatos();
            }
         jugador = false;
        }else{
            Btn5.setText("o");
            datosy = datosy + "5";
            jugaday = jugaday+1;
            if(jugaday >= 3){
                ActualizarDatos(); 
            }
         jugador= true;
        }
       casilla[1][1]=false;    
       }
        
    }//GEN-LAST:event_Btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
       if(casilla[1][2]){
          if(jugador == true){
            btn6.setText("x");
            datosx = datosx + "6";
            jugadax = jugadax + 1;
            if(jugadax >= 3){
                ActualizarDatos();
            }
            jugador = false;
                 
        }else{
            btn6.setText("o");
            datosy = datosy + "6";
            jugaday = jugaday+1;
            if(jugaday >= 3){
                ActualizarDatos(); 
            }
            jugador = true;
            
        }
         casilla[1][2]=false;
       }
        
    }//GEN-LAST:event_btn6ActionPerformed

    private void Btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn7ActionPerformed
    if(casilla[2][0]==true){
        if(jugador == true){
            Btn7.setText("x");
            datosx = datosx + "7";
            jugadax = jugadax + 1;
            if(jugadax >= 3){
                ActualizarDatos();
            }
            jugador = false;
                 
        }else{
            Btn7.setText("o");
            datosy = datosy + "7";
            jugaday = jugaday+1;
            if(jugaday >= 3){
                ActualizarDatos(); 
            }
           jugador = true;
        }
       casilla[2][0]=false;
    }
       
    }//GEN-LAST:event_Btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
       if(casilla[2][1]==true){
        if(jugador == true){
            btn8.setText("x");
            datosx = datosx + "8";
            jugadax = jugadax + 1;
            if(jugadax >= 3){
                ActualizarDatos();
            }
           jugador = false;
                 
        }else{
            btn8.setText("o");
            datosy = datosy + "8";
            jugaday = jugaday+1;
            if(jugaday >= 3){
                ActualizarDatos(); 
            }
           jugador = true;
        }
        casilla[2][1]=false;
       }
        
    }//GEN-LAST:event_btn8ActionPerformed

    private void Btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn9ActionPerformed
       if(casilla[2][2]==true){
        if(jugador == true){
            Btn9.setText("x");
            datosx = datosx + "9";
            jugadax = jugadax + 1;
            if(jugadax >= 3){
                ActualizarDatos();
            }
          jugador = false;  
                 
        }else{
            Btn9.setText("o");
            datosy = datosy + "9";
            jugaday = jugaday+1;
            if(jugaday >= 3){
                ActualizarDatos(); 
            }
          jugador = true;
        }
       casilla[2][2]=false; 
       }
        
    }//GEN-LAST:event_Btn9ActionPerformed

    private void MenJugarDeNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenJugarDeNuevoActionPerformed
  
     Reiniciar();
        
    }//GEN-LAST:event_MenJugarDeNuevoActionPerformed
  
    private void MenSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenSalirActionPerformed
     System.exit(0);
        
    }//GEN-LAST:event_MenSalirActionPerformed

    private void menTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menTablaActionPerformed
     Resultados tabla = new Resultados(null, false);
     tabla.Jugadores(getJugador1(), getJugador2());
     tabla.setVisible(true);
    }//GEN-LAST:event_menTablaActionPerformed


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
                new Ventana(null,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar BarraPrincipal;
    private javax.swing.JButton Btn1;
    private javax.swing.JButton Btn2;
    private javax.swing.JButton Btn3;
    private javax.swing.JButton Btn4;
    private javax.swing.JButton Btn5;
    private javax.swing.JButton Btn7;
    private javax.swing.JButton Btn9;
    private javax.swing.JMenuItem MenJugarDeNuevo;
    private javax.swing.JMenuItem MenSalir;
    private javax.swing.JPanel Panel;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JMenuItem menTabla;
    // End of variables declaration//GEN-END:variables
}
