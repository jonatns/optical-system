/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DBConnect.Connect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jonat_ns
 */
public class MainGUI extends javax.swing.JFrame {
    DefaultTableModel model;

    /**
     * Creates new form GUI
     */
    public MainGUI() {
        searchTable("");
        initComponents();
        inHabilitar();
    }
    
    public void searchTable(String value){
        
        String[] title = {"Patient#", "Name", "Last Name", "Gender", "Address", "Email", "Telephone"};
        String[] registry = new String[7];
        String sSQL = "";
        
        model = new DefaultTableModel(null, title);
        
        Connect mysql = new Connect();
        Connection cn = mysql.connect();
        
        sSQL = "SELECT patient_number, firstname, lastname, gender, address, email, telephone FROM cliente" 
                + "WHERE CONCAT_WS(firstname, ' ',lastname) LIKE '%"+value+"%'";
       
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            
            while(rs.next()){
                registry[0] = rs.getString("patient_number");
                registry[1] = rs.getString("firstname");
                registry[2] = rs.getString("lastname");
                registry[3] = rs.getString("gender");
                registry[4] = rs.getString("address");
                registry[5] = rs.getString("email");
                registry[6] = rs.getString("telephone");
                model.addRow(registry);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        tbPanel = new javax.swing.JTabbedPane();
        tbPatientInfo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPatientNo = new javax.swing.JTextField();
        txtPatientFirstName = new javax.swing.JTextField();
        txtPatientLastName = new javax.swing.JTextField();
        txtPatientAddress = new javax.swing.JTextField();
        txtPatientEmail = new javax.swing.JTextField();
        txtPatientTelephone = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        cmbPatientGender = new javax.swing.JComboBox();
        btnNew = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtSearchNo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtSearchName = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        lblUser = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tnlSearch = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Pacient no:");

        jLabel2.setText("First Name:");

        jLabel3.setText("Last Name:");

        jLabel4.setText("Gender:");

        jLabel5.setText("Address:");

        jLabel6.setText("E-mail:");

        jLabel7.setText("Telephone:");

        txtPatientNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientNoActionPerformed(evt);
            }
        });

        txtPatientFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientFirstNameActionPerformed(evt);
            }
        });

        txtPatientLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientLastNameActionPerformed(evt);
            }
        });

        txtPatientAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientAddressActionPerformed(evt);
            }
        });

        txtPatientEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientEmailActionPerformed(evt);
            }
        });

        txtPatientTelephone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientTelephoneActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        cmbPatientGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "M", "F" }));
        cmbPatientGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPatientGenderActionPerformed(evt);
            }
        });

        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tbPatientInfoLayout = new javax.swing.GroupLayout(tbPatientInfo);
        tbPatientInfo.setLayout(tbPatientInfoLayout);
        tbPatientInfoLayout.setHorizontalGroup(
            tbPatientInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tbPatientInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tbPatientInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tbPatientInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(tbPatientInfoLayout.createSequentialGroup()
                            .addGroup(tbPatientInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(tbPatientInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtPatientFirstName)
                                .addComponent(txtPatientNo)))
                        .addGroup(tbPatientInfoLayout.createSequentialGroup()
                            .addGroup(tbPatientInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(6, 6, 6)
                            .addGroup(tbPatientInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtPatientTelephone)
                                .addComponent(txtPatientEmail)
                                .addComponent(txtPatientAddress)
                                .addGroup(tbPatientInfoLayout.createSequentialGroup()
                                    .addComponent(cmbPatientGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 83, Short.MAX_VALUE))
                                .addComponent(txtPatientLastName))))
                    .addGroup(tbPatientInfoLayout.createSequentialGroup()
                        .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(280, Short.MAX_VALUE))
        );
        tbPatientInfoLayout.setVerticalGroup(
            tbPatientInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tbPatientInfoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(tbPatientInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtPatientNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tbPatientInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPatientFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(12, 12, 12)
                .addGroup(tbPatientInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPatientLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tbPatientInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbPatientGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tbPatientInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPatientAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tbPatientInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPatientEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tbPatientInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtPatientTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(tbPatientInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSave)
                    .addGroup(tbPatientInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNew)
                        .addComponent(btnClear)))
                .addGap(279, 279, 279))
        );

        tbPanel.addTab("Patient Information", tbPatientInfo);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 598, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 326, Short.MAX_VALUE)
        );

        tbPanel.addTab("Receta*", jPanel2);

        jLabel8.setText("Patient no:");

        txtSearchNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchNoActionPerformed(evt);
            }
        });

        jLabel9.setText("Patient name:");

        btnSearch.setText("Search...");

        tnlSearch.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tnlSearch);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbPanel, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(txtSearchNo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(txtSearchName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSearch))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(lblUser)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtSearchNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtSearchName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(lblUser)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchNoActionPerformed
       txtSearchNo.transferFocus();
    }//GEN-LAST:event_txtSearchNoActionPerformed

    private void txtPatientFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientFirstNameActionPerformed
        txtPatientFirstName.transferFocus();       
    }//GEN-LAST:event_txtPatientFirstNameActionPerformed

    private void txtPatientTelephoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientTelephoneActionPerformed
        txtPatientEmail.transferFocus();
        btnSave.setFocusable(true);
    }//GEN-LAST:event_txtPatientTelephoneActionPerformed
   
    
    private void habilitar(){
        txtPatientAddress.setEnabled(true);
        txtPatientEmail.setEnabled(true);
        txtPatientFirstName.setEnabled(true);
        txtPatientLastName.setEnabled(true);
        txtPatientTelephone.setEnabled(true);
        txtPatientNo.setEnabled(true);
        cmbPatientGender.setEnabled(true);
        btnSave.setEnabled(true);
        tbPatientInfo.setEnabled(true);
        
        txtPatientAddress.setText("");
        txtPatientEmail.setText("");
        txtPatientFirstName.setText("");
        txtPatientLastName.setText("");
        txtPatientTelephone.setText("");
        txtPatientNo.setText("");
        txtSearchName.setText("");
        txtSearchNo.setText("");
        tbPanel.transferFocus();
   
    }
    
    private void inHabilitar(){
        txtPatientAddress.setEnabled(false);
        txtPatientEmail.setEnabled(false);
        txtPatientFirstName.setEnabled(false);
        txtPatientLastName.setEnabled(false);
        txtPatientTelephone.setEnabled(false);
        txtPatientNo.setEnabled(false);
        cmbPatientGender.setEnabled(false);
        btnSave.setEnabled(false);
        tbPatientInfo.setEnabled(false);
        
        txtPatientAddress.setText("");
        txtPatientEmail.setText("");
        txtPatientFirstName.setText("");
        txtPatientLastName.setText("");
        txtPatientTelephone.setText("");
        txtPatientNo.setText("");
        txtSearchName.setText("");
        txtSearchNo.setText("");   
    }
    
    
    
    String action = "Insertar";
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        
        Connect mysql = new Connect();
        Connection cn = mysql.connect();
        String pNum, fName, lName, gen, address, email, tel;
        String aSQL = "";
        String message = "";
        
        pNum = txtPatientNo.getText();
        fName = txtPatientFirstName.getText();
        lName = txtPatientLastName.getText();
        gen = cmbPatientGender.getSelectedItem().toString();
        address = txtPatientAddress.getText();
        email = txtPatientEmail.getText();
        tel = txtPatientTelephone.getText();
        
        aSQL = "INSERT INTO cliente(patient_number, firstname, lastName, gender, address, email, telephone)" +
                "VALUES(?,?,?,?,?,?,?)";
        
        message = "Patient Information Saved";
        
        try {
            PreparedStatement pst = cn.prepareStatement(aSQL);
            pst.setString(1, pNum);
            pst.setString(2, fName);
            pst.setString(3, lName);
            pst.setString(4, gen);
            pst.setString(5, address);
            pst.setString(6, email);
            pst.setString(7, tel);
            
            int n = pst.executeUpdate();
            
            if(n > 0){
                JOptionPane.showMessageDialog(null, message);
                
            }        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }


    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtPatientNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientNoActionPerformed
        txtPatientNo.transferFocus();       
    }//GEN-LAST:event_txtPatientNoActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        habilitar();
    }//GEN-LAST:event_btnNewActionPerformed

    private void txtPatientLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientLastNameActionPerformed
        txtPatientLastName.transferFocus();
    }//GEN-LAST:event_txtPatientLastNameActionPerformed

    private void cmbPatientGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPatientGenderActionPerformed
        cmbPatientGender.transferFocus();
    }//GEN-LAST:event_cmbPatientGenderActionPerformed

    private void txtPatientAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientAddressActionPerformed
        txtPatientAddress.transferFocus();
    }//GEN-LAST:event_txtPatientAddressActionPerformed

    private void txtPatientEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientEmailActionPerformed
          txtPatientEmail.transferFocus();
    }//GEN-LAST:event_txtPatientEmailActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtPatientAddress.setText("");
        txtPatientEmail.setText("");
        txtPatientFirstName.setText("");
        txtPatientLastName.setText("");
        txtPatientTelephone.setText("");
        txtPatientNo.setText("");
        txtSearchName.setText("");
        txtSearchNo.setText(""); 
    }//GEN-LAST:event_btnClearActionPerformed

    public void setUserLabel(String user){
        lblUser.setText(user);
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
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cmbPatientGender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblUser;
    private javax.swing.JTabbedPane tbPanel;
    private javax.swing.JPanel tbPatientInfo;
    private javax.swing.JTable tnlSearch;
    private javax.swing.JTextField txtPatientAddress;
    private javax.swing.JTextField txtPatientEmail;
    private javax.swing.JTextField txtPatientFirstName;
    private javax.swing.JTextField txtPatientLastName;
    private javax.swing.JTextField txtPatientNo;
    private javax.swing.JTextField txtPatientTelephone;
    private javax.swing.JTextField txtSearchName;
    private javax.swing.JTextField txtSearchNo;
    // End of variables declaration//GEN-END:variables


}
