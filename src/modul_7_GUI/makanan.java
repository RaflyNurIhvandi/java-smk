/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class makanan extends javax.swing.JFrame {

    /**
     * Creates new form makanan
     */
    public makanan() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField6 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbxbaksobiasa = new javax.swing.JRadioButton();
        txtjumlah1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cbxbaksobesar = new javax.swing.JRadioButton();
        txtjumlah2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cbxmie = new javax.swing.JRadioButton();
        txtjumlah3 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cbxmiebiasa = new javax.swing.JRadioButton();
        txtjumlah4 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cbxmiebesar = new javax.swing.JRadioButton();
        txtjumlah5 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        cbxesjeruk = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txapesan = new javax.swing.JTextArea();
        btnpesan = new javax.swing.JButton();
        btnreset = new javax.swing.JButton();
        cbxesteh = new javax.swing.JRadioButton();
        cbxtehanget = new javax.swing.JRadioButton();
        cbxjerukanget = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtjumlah7 = new javax.swing.JTextField();
        txtjumlah9 = new javax.swing.JTextField();
        txtjumlah8 = new javax.swing.JTextField();
        txtjumlah6 = new javax.swing.JTextField();

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nama Makanan");

        jLabel2.setText("Harga");

        jLabel3.setText("Jumlah");

        jLabel4.setText("Nama Minum");

        jLabel5.setText("Harga");

        jLabel6.setText("Jumlah");

        jLabel7.setText("13.000");

        cbxbaksobiasa.setText("Bakso Biasa");
        cbxbaksobiasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxbaksobiasaActionPerformed(evt);
            }
        });

        txtjumlah1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtjumlah1ActionPerformed(evt);
            }
        });

        jLabel8.setText("18.000");

        cbxbaksobesar.setText("Bakso Besar");
        cbxbaksobesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxbaksobesarActionPerformed(evt);
            }
        });

        jLabel9.setText("11.000");

        cbxmie.setText("Mie Ayam");
        cbxmie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxmieActionPerformed(evt);
            }
        });

        txtjumlah3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtjumlah3ActionPerformed(evt);
            }
        });

        jLabel10.setText("15.000");

        cbxmiebiasa.setText("Mie Ayam Bakso Biasa");
        cbxmiebiasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxmiebiasaActionPerformed(evt);
            }
        });

        jLabel11.setText("27.000");

        cbxmiebesar.setText("Mie Ayam Bakso Besar");
        cbxmiebesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxmiebesarActionPerformed(evt);
            }
        });

        txtjumlah5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtjumlah5ActionPerformed(evt);
            }
        });

        jLabel12.setText("5.000");

        cbxesjeruk.setText("Es Jeruk");
        cbxesjeruk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxesjerukActionPerformed(evt);
            }
        });

        jLabel13.setText("Menu Yang Di Pesan :");

        txapesan.setColumns(20);
        txapesan.setRows(5);
        jScrollPane1.setViewportView(txapesan);

        btnpesan.setText("Pesan");
        btnpesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpesanActionPerformed(evt);
            }
        });

        btnreset.setText("Reset");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });

        cbxesteh.setText("Es Teh");
        cbxesteh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxestehActionPerformed(evt);
            }
        });

        cbxtehanget.setText("Teh Anget");
        cbxtehanget.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxtehangetActionPerformed(evt);
            }
        });

        cbxjerukanget.setText("Jeruk Anget");
        cbxjerukanget.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxjerukangetActionPerformed(evt);
            }
        });

        jLabel14.setText("4.000");

        jLabel15.setText("5.000");

        jLabel16.setText("4.000");

        txtjumlah7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtjumlah7ActionPerformed(evt);
            }
        });

        txtjumlah9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtjumlah9ActionPerformed(evt);
            }
        });

        txtjumlah8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtjumlah8ActionPerformed(evt);
            }
        });

        txtjumlah6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtjumlah6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(cbxbaksobiasa)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(cbxmiebesar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel11)
                                    .addGap(76, 76, 76))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(cbxbaksobesar)
                                            .addGap(79, 79, 79))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(cbxmie)
                                                .addComponent(cbxmiebiasa))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel9)
                                            .addGap(22, 22, 22)
                                            .addComponent(txtjumlah3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel8)
                                                .addComponent(jLabel7)
                                                .addComponent(jLabel2))
                                            .addGap(22, 22, 22)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtjumlah1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtjumlah2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel3)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel10)
                                            .addGap(22, 22, 22)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtjumlah5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtjumlah4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cbxesteh)
                                        .addComponent(cbxesjeruk))
                                    .addGap(68, 68, 68))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cbxjerukanget)
                                        .addComponent(cbxtehanget))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(66, 66, 66)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtjumlah8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtjumlah9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtjumlah6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtjumlah7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(47, 47, 47))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addComponent(btnpesan)
                .addGap(89, 89, 89)
                .addComponent(btnreset)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxbaksobiasa)
                    .addComponent(txtjumlah1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(cbxesjeruk)
                    .addComponent(jLabel12)
                    .addComponent(txtjumlah6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxbaksobesar)
                    .addComponent(txtjumlah2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel15)
                    .addComponent(txtjumlah7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxesteh))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxmie)
                    .addComponent(txtjumlah3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(cbxjerukanget)
                    .addComponent(jLabel16)
                    .addComponent(txtjumlah8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxmiebiasa)
                    .addComponent(txtjumlah4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(cbxtehanget)
                    .addComponent(jLabel14)
                    .addComponent(txtjumlah9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxmiebesar)
                    .addComponent(txtjumlah5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnpesan)
                    .addComponent(btnreset))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxbaksobiasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxbaksobiasaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxbaksobiasaActionPerformed

    private void cbxbaksobesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxbaksobesarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxbaksobesarActionPerformed

    private void cbxmieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxmieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxmieActionPerformed

    private void cbxmiebiasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxmiebiasaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxmiebiasaActionPerformed

    private void cbxmiebesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxmiebesarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxmiebesarActionPerformed

    private void txtjumlah1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjumlah1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtjumlah1ActionPerformed

    private void txtjumlah5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjumlah5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtjumlah5ActionPerformed

    private void cbxesjerukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxesjerukActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxesjerukActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void btnpesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpesanActionPerformed
        // TODO add your handling code here:
        String tampil;
        tampil = "";
        int bayar = 0;
        if (cbxbaksobiasa.isSelected()) {
            int jumlah = Integer.parseInt(txtjumlah1.getText());
            int total;
            total = jumlah * 13000;
            bayar = bayar + total;
            tampil += cbxbaksobiasa.getText() + " Rp.13000" + " x " + jumlah + " = " + total + "\n";
        } if (cbxbaksobesar.isSelected()) {
            int jumlah = Integer.parseInt(txtjumlah2.getText());
            int total;
            total = jumlah * 18000;
            bayar = bayar + total;
            tampil += cbxbaksobesar.getText() + " Rp.18000" + " x " + jumlah + " = " + total + "\n";
        } if (cbxmie.isSelected()) {
            int jumlah = Integer.parseInt(txtjumlah3.getText());
            int total;
            total = jumlah * 11000;
            bayar = bayar + total;
            tampil += cbxmie.getText() + " Rp.11000" + " x " + jumlah + " = " + total + "\n";
        } if (cbxmiebiasa.isSelected()) {
            int jumlah = Integer.parseInt(txtjumlah4.getText());
            int total;
            total = jumlah * 15000;
            bayar = bayar + total;
            tampil += cbxmiebiasa.getText() + " Rp.15000" + " x " + jumlah + " = " + total + "\n";
        } if (cbxmiebesar.isSelected()) {
            int jumlah = Integer.parseInt(txtjumlah5.getText());
            int total;
            total = jumlah * 27000;
            bayar = bayar + total;
            tampil += cbxmiebesar.getText() + " Rp.27000" + " x " + jumlah + " = " + total + "\n";
        } if (cbxesjeruk.isSelected()) {
            int jumlah = Integer.parseInt(txtjumlah6.getText());
            int total;
            total = jumlah * 5000;
            bayar = bayar + total;
            tampil += cbxesjeruk.getText() + " Rp.5000" + " x " + jumlah + " = " + total + "\n";
        } if (cbxesteh.isSelected()) {
            int jumlah = Integer.parseInt(txtjumlah7.getText());
            int total;
            total = jumlah * 5000;
            bayar = bayar + total;
            tampil += cbxesteh.getText() + " Rp.5000" + " x " + jumlah + " = " + total + "\n";
        } if (cbxjerukanget.isSelected()) {
            int jumlah = Integer.parseInt(txtjumlah8.getText());
            int total;
            total = jumlah * 4000;
            bayar = bayar + total;
            tampil += cbxjerukanget.getText() + " Rp.4000" + " x " + jumlah + " = " + total + "\n";
        } if (cbxtehanget.isSelected()) {
            int jumlah = Integer.parseInt(txtjumlah9.getText());
            int total;
            total = jumlah * 4000;
            bayar = bayar + total;
            tampil += cbxtehanget.getText() + " Rp.4000" + " x " + jumlah + " = " + total + "\n";
        }
        txapesan.setText(tampil+"===================="+"\n"+"Total Bayar ="+bayar);
    }//GEN-LAST:event_btnpesanActionPerformed

    private void cbxestehActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxestehActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxestehActionPerformed

    private void cbxtehangetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxtehangetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxtehangetActionPerformed

    private void cbxjerukangetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxjerukangetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxjerukangetActionPerformed

    private void txtjumlah7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjumlah7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtjumlah7ActionPerformed

    private void txtjumlah9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjumlah9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtjumlah9ActionPerformed

    private void txtjumlah8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjumlah8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtjumlah8ActionPerformed

    private void txtjumlah6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjumlah6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtjumlah6ActionPerformed

    private void txtjumlah3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjumlah3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtjumlah3ActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        // TODO add your handling code here:
        txtjumlah1.setText("");
        txtjumlah2.setText("");
        txtjumlah3.setText("");
        txtjumlah4.setText("");
        txtjumlah5.setText("");
        txtjumlah6.setText("");
        txtjumlah7.setText("");
        txtjumlah8.setText("");
        txtjumlah9.setText("");
        txapesan.setText("");
    }//GEN-LAST:event_btnresetActionPerformed

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
            java.util.logging.Logger.getLogger(makanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(makanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(makanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(makanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new makanan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnpesan;
    private javax.swing.JButton btnreset;
    private javax.swing.JRadioButton cbxbaksobesar;
    private javax.swing.JRadioButton cbxbaksobiasa;
    private javax.swing.JRadioButton cbxesjeruk;
    private javax.swing.JRadioButton cbxesteh;
    private javax.swing.JRadioButton cbxjerukanget;
    private javax.swing.JRadioButton cbxmie;
    private javax.swing.JRadioButton cbxmiebesar;
    private javax.swing.JRadioButton cbxmiebiasa;
    private javax.swing.JRadioButton cbxtehanget;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextArea txapesan;
    private javax.swing.JTextField txtjumlah1;
    private javax.swing.JTextField txtjumlah2;
    private javax.swing.JTextField txtjumlah3;
    private javax.swing.JTextField txtjumlah4;
    private javax.swing.JTextField txtjumlah5;
    private javax.swing.JTextField txtjumlah6;
    private javax.swing.JTextField txtjumlah7;
    private javax.swing.JTextField txtjumlah8;
    private javax.swing.JTextField txtjumlah9;
    // End of variables declaration//GEN-END:variables
}
