/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;


/**
 *
 * @author JOSE
 */
public class VentanaCalculadora extends javax.swing.JFrame {
 private String CadenaNum= "";
 private double  Num1=0;

 private int operacion = 0; 
 private double resultado;//son los numeros que se van procesando 
 private String texto ="";
 private boolean activado = true;//para el boton sumar
 private boolean punto = true;
 private double multNum = 1; 
 private int div =0 ; //0 encendido y 1 apagado

 /*
 indice de operacion
   nula = 0
  sumar = 1
  restar = 2
  mult = 3 
  div = 4  
  raiz = 5 
 */
   
    public VentanaCalculadora() {
        
        
        initComponents();
        this.setLocationRelativeTo(null);//establece ene el centro la ventana 
        this.setSize(345, 450); //estbalece el tamaño de la ventana 
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panelPrincipal = new javax.swing.JPanel();
        EtiqMuestra = new javax.swing.JLabel();
        EtiquetaNum = new javax.swing.JLabel();
        Btncleaner = new javax.swing.JButton();
        BtnRaiz = new javax.swing.JButton();
        BtnDividir = new javax.swing.JButton();
        BtnBorrar = new javax.swing.JButton();
        Btn7 = new javax.swing.JButton();
        Btn8 = new javax.swing.JButton();
        Btn9 = new javax.swing.JButton();
        BtnMult = new javax.swing.JButton();
        Btn4 = new javax.swing.JButton();
        Btn5 = new javax.swing.JButton();
        Btn6 = new javax.swing.JButton();
        BtnMenos = new javax.swing.JButton();
        Btn1 = new javax.swing.JButton();
        Btn2 = new javax.swing.JButton();
        Btn3 = new javax.swing.JButton();
        BtnMas = new javax.swing.JButton();
        BtnCambiasSing = new javax.swing.JButton();
        BtnCero = new javax.swing.JButton();
        BtnPUNTO = new javax.swing.JButton();
        BtnIgual = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Mconverosr = new javax.swing.JMenuItem();
        separados = new javax.swing.JPopupMenu.Separator();
        Exit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        panelPrincipal.setLayout(new java.awt.GridBagLayout());

        EtiqMuestra.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        EtiqMuestra.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        EtiqMuestra.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        panelPrincipal.add(EtiqMuestra, gridBagConstraints);

        EtiquetaNum.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        EtiquetaNum.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        EtiquetaNum.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        panelPrincipal.add(EtiquetaNum, gridBagConstraints);

        Btncleaner.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        Btncleaner.setText("C");
        Btncleaner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtncleanerActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panelPrincipal.add(Btncleaner, gridBagConstraints);

        BtnRaiz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/raiz xD.png"))); // NOI18N
        BtnRaiz.setPreferredSize(new java.awt.Dimension(50, 30));
        BtnRaiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRaizActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panelPrincipal.add(BtnRaiz, gridBagConstraints);

        BtnDividir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dividirBtn Redi.png"))); // NOI18N
        BtnDividir.setPreferredSize(new java.awt.Dimension(50, 30));
        BtnDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDividirActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panelPrincipal.add(BtnDividir, gridBagConstraints);

        BtnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnBorrar.png"))); // NOI18N
        BtnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBorrarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panelPrincipal.add(BtnBorrar, gridBagConstraints);

        Btn7.setBackground(new java.awt.Color(204, 204, 204));
        Btn7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Btn7.setText("7");
        Btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn7ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panelPrincipal.add(Btn7, gridBagConstraints);

        Btn8.setBackground(new java.awt.Color(204, 204, 204));
        Btn8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Btn8.setText("8");
        Btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn8ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panelPrincipal.add(Btn8, gridBagConstraints);

        Btn9.setBackground(new java.awt.Color(204, 204, 204));
        Btn9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Btn9.setText("9");
        Btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn9ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panelPrincipal.add(Btn9, gridBagConstraints);

        BtnMult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BtnMult.png"))); // NOI18N
        BtnMult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMultActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panelPrincipal.add(BtnMult, gridBagConstraints);

        Btn4.setBackground(new java.awt.Color(204, 204, 204));
        Btn4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Btn4.setText("4");
        Btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panelPrincipal.add(Btn4, gridBagConstraints);

        Btn5.setBackground(new java.awt.Color(204, 204, 204));
        Btn5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Btn5.setText("5");
        Btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn5ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panelPrincipal.add(Btn5, gridBagConstraints);

        Btn6.setBackground(new java.awt.Color(204, 204, 204));
        Btn6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Btn6.setText("6");
        Btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn6ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panelPrincipal.add(Btn6, gridBagConstraints);

        BtnMenos.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BtnMenos.setText("-");
        BtnMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMenosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelPrincipal.add(BtnMenos, gridBagConstraints);

        Btn1.setBackground(new java.awt.Color(204, 204, 204));
        Btn1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Btn1.setText("1");
        Btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panelPrincipal.add(Btn1, gridBagConstraints);

        Btn2.setBackground(new java.awt.Color(204, 204, 204));
        Btn2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Btn2.setText("2");
        Btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panelPrincipal.add(Btn2, gridBagConstraints);

        Btn3.setBackground(new java.awt.Color(204, 204, 204));
        Btn3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Btn3.setText("3");
        Btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panelPrincipal.add(Btn3, gridBagConstraints);

        BtnMas.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BtnMas.setText("+");
        BtnMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMasActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelPrincipal.add(BtnMas, gridBagConstraints);

        BtnCambiasSing.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnMasMenos.png"))); // NOI18N
        BtnCambiasSing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCambiasSingActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panelPrincipal.add(BtnCambiasSing, gridBagConstraints);

        BtnCero.setBackground(new java.awt.Color(204, 204, 204));
        BtnCero.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BtnCero.setText("0");
        BtnCero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCeroActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panelPrincipal.add(BtnCero, gridBagConstraints);

        BtnPUNTO.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BtnPUNTO.setText(".");
        BtnPUNTO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPUNTOActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panelPrincipal.add(BtnPUNTO, gridBagConstraints);

        BtnIgual.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BtnIgual.setText("=");
        BtnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIgualActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panelPrincipal.add(BtnIgual, gridBagConstraints);

        jMenu1.setText("Menú");
        jMenu1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N

        Mconverosr.setText("conversor de Divisas");
        Mconverosr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MconverosrActionPerformed(evt);
            }
        });
        jMenu1.add(Mconverosr);
        jMenu1.add(separados);

        Exit.setText("Salir");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jMenu1.add(Exit);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
     
        System.exit(0); 
    }//GEN-LAST:event_ExitActionPerformed

    private void MconverosrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MconverosrActionPerformed
       VentanaDivisas obj = new VentanaDivisas();
       
       obj.setVisible(true);
       dispose();
    }//GEN-LAST:event_MconverosrActionPerformed

    private void BtnRaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRaizActionPerformed
           if (activado == true ){
             if(CadenaNum.equals("")){
                 CadenaNum = "0";
             }    
           texto  = texto + "√"+ CadenaNum; 
         
           multNum =  Math.sqrt(Double.parseDouble(CadenaNum));
       
            EtiqMuestra.setText(texto);
           EtiquetaNum.setText("");
            CadenaNum = "";
            
           operacion = 5;
           activado = true;
          }
       punto=true;     
      
        
    }//GEN-LAST:event_BtnRaizActionPerformed

    private void Btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn1ActionPerformed
      CadenaNum += "1";
      EtiquetaNum.setText(CadenaNum);
      activado = true;
    }//GEN-LAST:event_Btn1ActionPerformed

    private void Btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn7ActionPerformed
        CadenaNum += "7";
      EtiquetaNum.setText(CadenaNum);
       activado = true;
    }//GEN-LAST:event_Btn7ActionPerformed

    private void Btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn8ActionPerformed
         CadenaNum += "8";
      EtiquetaNum.setText(CadenaNum);
       activado = true;
    }//GEN-LAST:event_Btn8ActionPerformed

    private void Btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn9ActionPerformed
     CadenaNum += "9";
      EtiquetaNum.setText(CadenaNum);
       activado = true;
    }//GEN-LAST:event_Btn9ActionPerformed

    private void Btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn4ActionPerformed
       CadenaNum += "4";
      EtiquetaNum.setText(CadenaNum);
       activado = true;
    }//GEN-LAST:event_Btn4ActionPerformed

    private void Btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn5ActionPerformed
     CadenaNum += "5";
      EtiquetaNum.setText(CadenaNum);
       activado = true;
    }//GEN-LAST:event_Btn5ActionPerformed

    private void Btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn6ActionPerformed
        CadenaNum += "6";
      EtiquetaNum.setText(CadenaNum);
       activado = true;
    }//GEN-LAST:event_Btn6ActionPerformed

    private void Btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn2ActionPerformed
 CadenaNum += "2";
      EtiquetaNum.setText(CadenaNum);
       activado = true;
    }//GEN-LAST:event_Btn2ActionPerformed

    private void Btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn3ActionPerformed
        CadenaNum += "3";
      EtiquetaNum.setText(CadenaNum);
       activado = true;
    }//GEN-LAST:event_Btn3ActionPerformed

    private void BtnCeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCeroActionPerformed
   
        if(CadenaNum != ""){
                  CadenaNum += "0";
      EtiquetaNum.setText(CadenaNum);
        }
        
    }//GEN-LAST:event_BtnCeroActionPerformed

    private void BtnPUNTOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPUNTOActionPerformed
     if(punto == true){
         if(CadenaNum.equals("")){
          CadenaNum="0.";   
         }else{
             CadenaNum += ".";
         EtiquetaNum.setText(CadenaNum);
         }
         
         punto = false;
     }
       
    }//GEN-LAST:event_BtnPUNTOActionPerformed

    private void BtnMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMasActionPerformed
            if (activado == true ){
                texto  = texto + CadenaNum + "+";  
             if(CadenaNum.equals("")){
                 CadenaNum= "0";
             }    
            
              Num1 =Num1+Double.parseDouble(CadenaNum);

       EtiqMuestra.setText(texto);
       EtiquetaNum.setText("");
       CadenaNum ="";
                
       operacion = 1;
        activado = false;
          }
       punto=true;
        
    }//GEN-LAST:event_BtnMasActionPerformed

    private void BtnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIgualActionPerformed

        if (operacion == 0) {
            EtiquetaNum.setText(CadenaNum);
        } else if (operacion == 1) {
            if (CadenaNum.equals("")) {
                CadenaNum = "0";
            }
            resultado = Num1 + Double.parseDouble(CadenaNum);
            EtiquetaNum.setText(String.format("%.2f", resultado));
            CadenaNum = String.valueOf(resultado);
            EtiqMuestra.setText(CadenaNum);

            texto = "";
            activado = true;
            operacion = 0;

        } else if (operacion == 2) {
            if (CadenaNum.equals("")) {
                CadenaNum = "0";
            }
            resultado = Num1 - Double.parseDouble(CadenaNum);
            EtiquetaNum.setText(String.format("%.2f", resultado));
            CadenaNum = String.valueOf(resultado);
            EtiqMuestra.setText(CadenaNum);

            texto = "";
            activado = true;
            operacion = 0;

        } else if (operacion == 3) {
            if (CadenaNum.equals("")) {
                CadenaNum = "0";
            }
            resultado = Num1 * Double.parseDouble(CadenaNum);
            EtiquetaNum.setText(String.format("%.2f", resultado));
            CadenaNum = String.valueOf(resultado);
            EtiqMuestra.setText(CadenaNum);

            texto = "";
            activado = true;
            operacion = 0;

        } else if (operacion == 4) {
            if (CadenaNum.equals("")) {
                CadenaNum = "0";
            }
            resultado = multNum / Double.parseDouble(CadenaNum);
            EtiquetaNum.setText(String.format("%.2f", resultado));
            CadenaNum = String.valueOf(resultado);
            EtiqMuestra.setText(CadenaNum);

            texto = "";
            activado = true;
            operacion = 0;

        } else if (operacion == 5) {
            if (CadenaNum.equals("")) {
                CadenaNum = "0";
            }
            resultado = multNum;

            EtiquetaNum.setText(String.format("%.2f", resultado));
            CadenaNum = String.format("%.2f", resultado);
            EtiqMuestra.setText(CadenaNum);

            texto = "";
            activado = true;
            operacion = 0;

        }

        Num1 = 0;
        multNum = 1;

    }//GEN-LAST:event_BtnIgualActionPerformed

    private void BtncleanerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtncleanerActionPerformed
       CadenaNum = "";
       EtiquetaNum.setText("0");
       EtiqMuestra.setText("");
       punto = true;
       texto = "";
    }//GEN-LAST:event_BtncleanerActionPerformed

    private void BtnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBorrarActionPerformed
            
      
        int tam = CadenaNum.length();
        int j = 0;
        if (tam > 0) {
            char[] cad = CadenaNum.toCharArray();
            String cadena = "";
            for (int i = 0; i < (cad.length - 1); i++) {
                cadena = cadena + cad[i];

            }

            CadenaNum = cadena;
            EtiquetaNum.setText(CadenaNum);
            if (CadenaNum == "") {
                EtiquetaNum.setText("0");
            }
            punto = true;

        }

    }//GEN-LAST:event_BtnBorrarActionPerformed

    private void BtnCambiasSingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCambiasSingActionPerformed
      int tamaño = CadenaNum.length();
       if(tamaño>0){
           if(CadenaNum.charAt(0) != '-'){
          CadenaNum = "-"+CadenaNum;
      }else{
          CadenaNum = CadenaNum.substring(1,CadenaNum.length());
      }
      EtiquetaNum.setText(CadenaNum);  
       }
      
      
    }//GEN-LAST:event_BtnCambiasSingActionPerformed
  
    
    private void BtnMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMenosActionPerformed
          if (activado == true) {
            if (CadenaNum.equals("")) {
                CadenaNum = "0";
            }
            texto = texto + CadenaNum + "-";

            Num1 = Num1 - Double.parseDouble(CadenaNum);

            EtiqMuestra.setText(texto);
            EtiquetaNum.setText("");
            CadenaNum = "";

            operacion = 2;
            activado = false;
        }
        punto = true;
    }//GEN-LAST:event_BtnMenosActionPerformed

    private void BtnMultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMultActionPerformed
        if (activado == true) {
            if (CadenaNum.equals("")) {
                CadenaNum = "0";
            }

            texto = texto + CadenaNum + "x";
            if (Num1 == 0) {
                Num1 = 1;
            }
            Num1 = Double.parseDouble(CadenaNum);

            EtiqMuestra.setText(texto);
            EtiquetaNum.setText("");
            CadenaNum = "";

            operacion = 3;
            activado = false;
        }
        punto = true;
        
        
    }//GEN-LAST:event_BtnMultActionPerformed

    private void BtnDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDividirActionPerformed
        if (activado == true) {
            if (CadenaNum.equals("")) {
                CadenaNum = "0";
            }
            texto = texto + CadenaNum + "/";

            multNum = Double.parseDouble(CadenaNum) / multNum;
            EtiqMuestra.setText(texto);
            EtiquetaNum.setText("");
            CadenaNum = "";

            operacion = 4;
            activado = false;
        }
        punto = true;


        
    }//GEN-LAST:event_BtnDividirActionPerformed

    public static void main(String args[]) {
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn1;
    private javax.swing.JButton Btn2;
    private javax.swing.JButton Btn3;
    private javax.swing.JButton Btn4;
    private javax.swing.JButton Btn5;
    private javax.swing.JButton Btn6;
    private javax.swing.JButton Btn7;
    private javax.swing.JButton Btn8;
    private javax.swing.JButton Btn9;
    private javax.swing.JButton BtnBorrar;
    private javax.swing.JButton BtnCambiasSing;
    private javax.swing.JButton BtnCero;
    private javax.swing.JButton BtnDividir;
    private javax.swing.JButton BtnIgual;
    private javax.swing.JButton BtnMas;
    private javax.swing.JButton BtnMenos;
    private javax.swing.JButton BtnMult;
    private javax.swing.JButton BtnPUNTO;
    private javax.swing.JButton BtnRaiz;
    private javax.swing.JButton Btncleaner;
    private javax.swing.JLabel EtiqMuestra;
    private javax.swing.JLabel EtiquetaNum;
    private javax.swing.JMenuItem Exit;
    private javax.swing.JMenuItem Mconverosr;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPopupMenu.Separator separados;
    // End of variables declaration//GEN-END:variables
}
