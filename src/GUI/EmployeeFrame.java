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
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author jonat_ns
 */
public class EmployeeFrame extends javax.swing.JFrame {
    int patientCount = 0;
    /**
     * Creates new form GUI
     */
    public EmployeeFrame() {
        initComponents();
        inHabilitarSave();
        inHabilitarSearch();
        currentDate_Time();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel11 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        employeeTabs = new javax.swing.JTabbedPane();
        tbPatientInfo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPatientFirstName = new javax.swing.JTextField();
        txtPatientLastName = new javax.swing.JTextField();
        txtPatientAddress = new javax.swing.JTextField();
        txtPatientEmail = new javax.swing.JTextField();
        txtPatientTelephone = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        cmbPatientGender = new javax.swing.JComboBox();
        btnNew = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        lblPatientNo = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtDOB = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        search_editPanel = new javax.swing.JPanel();
        lblSearchTelephone = new javax.swing.JLabel();
        txtSearchTelephone = new javax.swing.JTextField();
        lblSearchLastName = new javax.swing.JLabel();
        txtSearchName = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        lblOr = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblTelephone = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblDOB = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        lblFirstName = new javax.swing.JLabel();
        lblPatientNo2 = new javax.swing.JLabel();
        lblSearchBy = new javax.swing.JLabel();
        btnEdit = new javax.swing.JButton();
        firstNameSearch = new javax.swing.JTextField();
        lastNameSearch = new javax.swing.JTextField();
        genderSearch = new javax.swing.JTextField();
        addressSearch = new javax.swing.JTextField();
        emailSearch = new javax.swing.JTextField();
        telephoneSearch = new javax.swing.JTextField();
        PatientNoSearch = new javax.swing.JLabel();
        dobSearch = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        lblStatus = new javax.swing.JLabel();
        lblUpdateStatus = new javax.swing.JLabel();
        time = new javax.swing.JLabel();

        jLabel11.setText("Health Card#");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select one:", "Reforma(Triple-S)", "Humana", "MCS", "MMM" }));

        jLabel10.setText("Health Plan:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Patient no:");

        jLabel2.setText("First Name:");

        jLabel3.setText("Last Name:");

        jLabel4.setText("Gender:");

        jLabel5.setText("Address:");

        jLabel6.setText("E-mail:");

        jLabel7.setText("Telephone:");

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

        jLabel12.setText("DOB MM/DD/YYYY");

        txtDOB.setText("//");
        txtDOB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDOBActionPerformed(evt);
            }
        });

        jLabel13.setText("Health Plan:");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select one:", "Reforma(Triple-S)", "Humana", "MCS", "MMM" }));

        jLabel14.setText("Health Card#");

        javax.swing.GroupLayout tbPatientInfoLayout = new javax.swing.GroupLayout(tbPatientInfo);
        tbPatientInfo.setLayout(tbPatientInfoLayout);
        tbPatientInfoLayout.setHorizontalGroup(
            tbPatientInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tbPatientInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tbPatientInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tbPatientInfoLayout.createSequentialGroup()
                        .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tbPatientInfoLayout.createSequentialGroup()
                        .addGroup(tbPatientInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tbPatientInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(tbPatientInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPatientAddress)
                            .addComponent(txtPatientLastName)
                            .addComponent(lblPatientNo)
                            .addGroup(tbPatientInfoLayout.createSequentialGroup()
                                .addComponent(cmbPatientGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDOB, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                            .addComponent(txtPatientFirstName)
                            .addComponent(txtPatientTelephone)
                            .addComponent(txtPatientEmail))
                        .addGap(18, 18, 18)
                        .addGroup(tbPatientInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(tbPatientInfoLayout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField4))
                            .addGroup(tbPatientInfoLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tbPatientInfoLayout.setVerticalGroup(
            tbPatientInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tbPatientInfoLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(tbPatientInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblPatientNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tbPatientInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPatientFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel13)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(tbPatientInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPatientLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tbPatientInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbPatientGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tbPatientInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPatientAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
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
                .addGap(71, 71, 71))
        );

        employeeTabs.addTab("Create Patient", tbPatientInfo);

        lblSearchTelephone.setText("Telephone:");

        txtSearchTelephone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchTelephoneActionPerformed(evt);
            }
        });

        lblSearchLastName.setText("Name");

        btnSearch.setText("Search...");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        lblOr.setText("or");

        lblEmail.setText("E-mail:");

        lblTelephone.setText("Telephone:");

        lblGender.setText("Gender:");

        lblDOB.setText("DOB MM/DD/YYYY:");

        lblAddress.setText("Address:");

        lblLastName.setText("Last Name:");

        lblFirstName.setText("First Name:");

        lblPatientNo2.setText("Patient no:");

        lblSearchBy.setText("Search Patient by:");

        btnEdit.setText("Edit");

        telephoneSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telephoneSearchActionPerformed(evt);
            }
        });

        jButton1.setText("Delete");

        jLabel8.setText("Health Card#");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select one:", "Reforma(Triple-S)", "Humana", "MCS", "MMM" }));

        jLabel9.setText("Health Plan:");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout search_editPanelLayout = new javax.swing.GroupLayout(search_editPanel);
        search_editPanel.setLayout(search_editPanelLayout);
        search_editPanelLayout.setHorizontalGroup(
            search_editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(search_editPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(search_editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(search_editPanelLayout.createSequentialGroup()
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(search_editPanelLayout.createSequentialGroup()
                        .addGroup(search_editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblAddress, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblGender, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(search_editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lastNameSearch)
                            .addComponent(addressSearch)
                            .addComponent(emailSearch)
                            .addComponent(telephoneSearch)
                            .addGroup(search_editPanelLayout.createSequentialGroup()
                                .addComponent(genderSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblDOB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dobSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))))
                    .addComponent(lblSearchBy)
                    .addGroup(search_editPanelLayout.createSequentialGroup()
                        .addGroup(search_editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSearchTelephone)
                            .addComponent(lblPatientNo2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFirstName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(search_editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(search_editPanelLayout.createSequentialGroup()
                                .addComponent(txtSearchTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblOr, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblSearchLastName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSearchName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSearch))
                            .addGroup(search_editPanelLayout.createSequentialGroup()
                                .addGroup(search_editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(firstNameSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                    .addComponent(jTextField2))
                                .addGroup(search_editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(search_editPanelLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel9))
                                    .addGroup(search_editPanelLayout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(jLabel8)))
                                .addGap(18, 18, 18)
                                .addGroup(search_editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBox1, 0, 250, Short.MAX_VALUE)
                                    .addComponent(jTextField1))
                                .addGap(24, 24, 24)
                                .addComponent(PatientNoSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(276, 276, 276))
        );
        search_editPanelLayout.setVerticalGroup(
            search_editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(search_editPanelLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(lblSearchBy)
                .addGap(18, 18, 18)
                .addGroup(search_editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSearchTelephone)
                    .addComponent(txtSearchTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOr)
                    .addComponent(lblSearchLastName)
                    .addComponent(txtSearchName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGap(18, 18, 18)
                .addGroup(search_editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(search_editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblPatientNo2)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(search_editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(search_editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(PatientNoSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(search_editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(firstNameSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(search_editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLastName)
                    .addComponent(lastNameSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(search_editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGender)
                    .addComponent(genderSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDOB)
                    .addComponent(dobSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(search_editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddress)
                    .addComponent(addressSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(search_editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(search_editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telephoneSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelephone))
                .addGap(18, 18, 18)
                .addGroup(search_editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEdit)
                    .addComponent(jButton1))
                .addGap(21, 21, 21))
        );

        employeeTabs.addTab("Search/Edit Patient", search_editPanel);

        lblStatus.setText("Status:");

        lblUpdateStatus.setText("Welcome");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblStatus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblUpdateStatus)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(employeeTabs, javax.swing.GroupLayout.PREFERRED_SIZE, 849, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(employeeTabs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStatus)
                    .addComponent(lblUpdateStatus))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchTelephoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchTelephoneActionPerformed
       txtSearchTelephone.transferFocus();
    }//GEN-LAST:event_txtSearchTelephoneActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        
        Connect mysql = new Connect();
        Connection cn = mysql.connect();
        
        inHabilitarSave();
  
        if(txtSearchTelephone.getText().equals("") && !txtSearchName.getText().equals("")){
            String searchName = txtSearchName.getText();
        
            String sSQL = "SELECT * FROM cliente WHERE firstname ='" +searchName+"'";
        
            try {
                Statement st = (Statement) cn.createStatement();
                ResultSet rs = st.executeQuery(sSQL);

                while(rs.next()){    
                      next(rs);

                }
                if(lblFirstName.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Patient name not found");
                    inHabilitarSearch();
                    txtSearchTelephone.setText("");
                    txtSearchName.setText("");
                    }
                else{
                    habilitarSearch();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
        else if(txtSearchName.getText().equals("") && !txtSearchTelephone.getText().equals("")){
            String searchTelephone = txtSearchTelephone.getText();
        
            String sSQL = "SELECT * FROM cliente WHERE telephone ='" +searchTelephone+"'";
        
            try {
                Statement st = (Statement) cn.createStatement();
                ResultSet rs = st.executeQuery(sSQL);
           
            while(rs.next()){    
                    
                next(rs);
                }
            if(lblFirstName.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Patient number not found");
                    inHabilitarSave();
                    lblTelephone.setText("");
                    txtSearchName.setText("");
                    }
                else{
                    habilitarSearch();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
        else if(txtSearchName.getText().equals("") && txtSearchTelephone.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please enter at least one patient number or name");

        }
        else{
          JOptionPane.showMessageDialog(null, "Please enter only one patient number or name"); 
          txtSearchName.setText("");
          txtSearchTelephone.setText("");
        }
    }//GEN-LAST:event_btnSearchActionPerformed
    
    public void next(ResultSet rs){
        try {
            PatientNoSearch.setText(rs.getString("patient_number"));
       
            firstNameSearch.setText(rs.getString("firstname"));
            lastNameSearch.setText(rs.getString("lastname"));
            genderSearch.setText(rs.getString("gender"));
            addressSearch.setText(rs.getString("address"));
            emailSearch.setText(rs.getString("email"));
            telephoneSearch.setText(rs.getString("telephone"));

         } catch (SQLException ex) {
            Logger.getLogger(EmployeeFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
       inHabilitarSave();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        habilitarNew();
    }//GEN-LAST:event_btnNewActionPerformed

    private void cmbPatientGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPatientGenderActionPerformed
        cmbPatientGender.transferFocus();
    }//GEN-LAST:event_cmbPatientGenderActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        Connect mysql = new Connect();
        Connection cn = mysql.connect();
        String pNum, fName, lName, gen, address, email, tel;
        String aSQL = "";
        String message = "";
       
        pNum = lblPatientNo.getText();
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
                lblUpdateStatus.setText(message);

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
          inHabilitarSave();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtPatientTelephoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientTelephoneActionPerformed
        txtPatientEmail.transferFocus();
        btnSave.setFocusable(true);
    }//GEN-LAST:event_txtPatientTelephoneActionPerformed

    private void txtPatientEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientEmailActionPerformed
        txtPatientEmail.transferFocus();
    }//GEN-LAST:event_txtPatientEmailActionPerformed

    private void txtPatientAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientAddressActionPerformed
        txtPatientAddress.transferFocus();
    }//GEN-LAST:event_txtPatientAddressActionPerformed

    private void txtPatientLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientLastNameActionPerformed
        txtPatientLastName.transferFocus();
    }//GEN-LAST:event_txtPatientLastNameActionPerformed

    private void txtPatientFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientFirstNameActionPerformed
        txtPatientFirstName.transferFocus();
    }//GEN-LAST:event_txtPatientFirstNameActionPerformed

    private void txtDOBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDOBActionPerformed

    }//GEN-LAST:event_txtDOBActionPerformed

    private void telephoneSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telephoneSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telephoneSearchActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed
   
     
    private void habilitarSearch(){
    
        btnEdit.setVisible(true);

    }
    
    public void currentDate_Time(){
        
       // Instantiate a Date object
       Date date = new Date();
        
       time.setText(date.toString());
    }
    
    private void habilitarNew(){
        txtDOB.setEnabled(true);
        txtPatientAddress.setEnabled(true);
        txtPatientEmail.setEnabled(true);
        txtPatientFirstName.setEnabled(true);
        txtPatientLastName.setEnabled(true);
        txtPatientTelephone.setEnabled(true);
        lblPatientNo.setEnabled(true);
        cmbPatientGender.setEnabled(true);
        btnSave.setEnabled(true);
        tbPatientInfo.setEnabled(true);
        
        Connect mysql = new Connect();
        Connection cn = mysql.connect();
        String aSQL = "";
        aSQL = "SELECT * FROM cliente";
        
        patientCount = 0;
        
        try {
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(aSQL);
           
            while(rs.next()){    
               patientCount++;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
        lblPatientNo.setText(Integer.toString(patientCount));
        txtPatientAddress.setText("");
        txtPatientEmail.setText("");
        txtPatientFirstName.setText("");
        txtPatientLastName.setText("");
        txtPatientTelephone.setText("");
        txtSearchName.setText("");
        txtSearchTelephone.setText("");
        employeeTabs.transferFocus();
   
    }
    
    private void inHabilitarSave(){
        txtDOB.setEnabled(false);
        txtPatientAddress.setEnabled(false);
        txtPatientEmail.setEnabled(false);
        txtPatientFirstName.setEnabled(false);
        txtPatientLastName.setEnabled(false);
        txtPatientTelephone.setEnabled(false);
        lblPatientNo.setEnabled(false);
        cmbPatientGender.setEnabled(false);
        btnSave.setEnabled(false);
        tbPatientInfo.setEnabled(false);
        
        cmbPatientGender.setSelectedItem("M");
        txtPatientAddress.setText("");
        txtPatientEmail.setText("");
        txtPatientFirstName.setText("");
        txtPatientLastName.setText("");
        txtPatientTelephone.setText("");
        lblPatientNo.setText("");
     
    }
    
    private void inHabilitarSearch(){
        PatientNoSearch.setText("");
        dobSearch.setText("");
        addressSearch.setText("");
        emailSearch.setText("");
        lastNameSearch.setText("");
        lastNameSearch.setText("");
        telephoneSearch.setText("");
        genderSearch.setText("");
        btnEdit.setVisible(false);
             
    }
    
    
    String action = "Insertar";

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
            java.util.logging.Logger.getLogger(EmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PatientNoSearch;
    private javax.swing.JTextField addressSearch;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cmbPatientGender;
    private javax.swing.JTextField dobSearch;
    private javax.swing.JTextField emailSearch;
    private javax.swing.JTabbedPane employeeTabs;
    private javax.swing.JTextField firstNameSearch;
    private javax.swing.JTextField genderSearch;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField lastNameSearch;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblOr;
    private javax.swing.JLabel lblPatientNo;
    private javax.swing.JLabel lblPatientNo2;
    private javax.swing.JLabel lblSearchBy;
    private javax.swing.JLabel lblSearchLastName;
    private javax.swing.JLabel lblSearchTelephone;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTelephone;
    private javax.swing.JLabel lblUpdateStatus;
    private javax.swing.JPanel search_editPanel;
    private javax.swing.JPanel tbPatientInfo;
    private javax.swing.JTextField telephoneSearch;
    private javax.swing.JLabel time;
    private javax.swing.JTextField txtDOB;
    private javax.swing.JTextField txtPatientAddress;
    private javax.swing.JTextField txtPatientEmail;
    private javax.swing.JTextField txtPatientFirstName;
    private javax.swing.JTextField txtPatientLastName;
    private javax.swing.JTextField txtPatientTelephone;
    private javax.swing.JTextField txtSearchName;
    private javax.swing.JTextField txtSearchTelephone;
    // End of variables declaration//GEN-END:variables


}
