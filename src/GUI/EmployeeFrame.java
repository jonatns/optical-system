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
    /**
     * Creates new form GUI
     */
    public EmployeeFrame() {
        initComponents();
        inHabilitarSave();
        inHabilitarSearch();
        currentDate_Time();
        setNotEditable();
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
        txtHealthCardNum = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        cmbHealthPlan = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
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
        dobSearch = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        lblHealthCardNum = new javax.swing.JLabel();
        lblHealthPlan = new javax.swing.JLabel();
        healthCardSearch = new javax.swing.JTextField();
        txtPatientNoSearch = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btnSearchClear = new javax.swing.JButton();
        btnSearchSave = new javax.swing.JButton();
        cmbHealthPlanSearch = new javax.swing.JComboBox();
        lblStatus = new javax.swing.JLabel();
        lblUpdateStatus = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

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

        jLabel12.setText("DOB MM/DD/YYYY:");

        txtDOB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDOBActionPerformed(evt);
            }
        });

        jLabel13.setText("Health Plan:");

        cmbHealthPlan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select one:", "Reforma(Triple-S)", "Humana", "MCS", "MMM" }));

        jLabel14.setText("Health Card#:");

        jLabel8.setText("Create Patient:");

        javax.swing.GroupLayout tbPatientInfoLayout = new javax.swing.GroupLayout(tbPatientInfo);
        tbPatientInfo.setLayout(tbPatientInfoLayout);
        tbPatientInfoLayout.setHorizontalGroup(
            tbPatientInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tbPatientInfoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(tbPatientInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(tbPatientInfoLayout.createSequentialGroup()
                        .addGroup(tbPatientInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, tbPatientInfoLayout.createSequentialGroup()
                                .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, tbPatientInfoLayout.createSequentialGroup()
                                .addGroup(tbPatientInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(tbPatientInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(tbPatientInfoLayout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(lblPatientNo))
                                    .addGroup(tbPatientInfoLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(tbPatientInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtPatientEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtPatientTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtPatientAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tbPatientInfoLayout.createSequentialGroup()
                                                .addComponent(cmbPatientGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txtPatientLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtPatientFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(18, 18, 18)
                        .addGroup(tbPatientInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(tbPatientInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbHealthPlan, 0, 250, Short.MAX_VALUE)
                            .addComponent(txtHealthCardNum))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tbPatientInfoLayout.setVerticalGroup(
            tbPatientInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tbPatientInfoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(tbPatientInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblPatientNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tbPatientInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPatientFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel13)
                    .addComponent(cmbHealthPlan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(tbPatientInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPatientLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(txtHealthCardNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGroup(tbPatientInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNew)
                    .addComponent(btnSave)
                    .addComponent(btnClear))
                .addGap(71, 71, 71))
        );

        employeeTabs.addTab("Create Patient", tbPatientInfo);

        lblSearchTelephone.setText("Telephone:");

        txtSearchTelephone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchTelephoneActionPerformed(evt);
            }
        });

        lblSearchLastName.setText("Name:");

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
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        firstNameSearch.setBorder(null);

        lastNameSearch.setBorder(null);

        genderSearch.setBorder(null);

        addressSearch.setBorder(null);

        emailSearch.setBorder(null);

        telephoneSearch.setBorder(null);
        telephoneSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telephoneSearchActionPerformed(evt);
            }
        });

        dobSearch.setBorder(null);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lblHealthCardNum.setText("Health Card#");

        lblHealthPlan.setText("Health Plan:");

        healthCardSearch.setBorder(null);

        txtPatientNoSearch.setBorder(null);
        txtPatientNoSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientNoSearchActionPerformed(evt);
            }
        });

        btnSearchClear.setText("Clear");
        btnSearchClear.setToolTipText("");
        btnSearchClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchClearActionPerformed(evt);
            }
        });

        btnSearchSave.setText("Save");
        btnSearchSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchSaveActionPerformed(evt);
            }
        });

        cmbHealthPlanSearch.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select one:", "Reforma(Triple-S)", "Humana", "MCS", "MMM" }));
        cmbHealthPlanSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbHealthPlanSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout search_editPanelLayout = new javax.swing.GroupLayout(search_editPanel);
        search_editPanel.setLayout(search_editPanelLayout);
        search_editPanelLayout.setHorizontalGroup(
            search_editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(search_editPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(search_editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addGroup(search_editPanelLayout.createSequentialGroup()
                        .addGroup(search_editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(search_editPanelLayout.createSequentialGroup()
                                .addComponent(lblSearchTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSearchTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblOr)
                                .addGap(18, 18, 18)
                                .addComponent(lblSearchLastName)
                                .addGap(18, 18, 18)
                                .addComponent(txtSearchName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSearch))
                            .addComponent(lblSearchBy, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(search_editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(dobSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, search_editPanelLayout.createSequentialGroup()
                                    .addComponent(lblAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(addressSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(search_editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, search_editPanelLayout.createSequentialGroup()
                                    .addGroup(search_editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, search_editPanelLayout.createSequentialGroup()
                                            .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(btnSearchClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, search_editPanelLayout.createSequentialGroup()
                                            .addGroup(search_editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(lblEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lblTelephone, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(search_editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(emailSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(telephoneSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnSearchSave, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, search_editPanelLayout.createSequentialGroup()
                                    .addGroup(search_editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(search_editPanelLayout.createSequentialGroup()
                                            .addGroup(search_editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(lblGender, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(search_editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(lblPatientNo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(lblFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(search_editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(search_editPanelLayout.createSequentialGroup()
                                                    .addComponent(genderSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(lblDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(search_editPanelLayout.createSequentialGroup()
                                                    .addGroup(search_editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtPatientNoSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(firstNameSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addGroup(search_editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(lblHealthPlan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(lblHealthCardNum, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)))))
                                        .addGroup(search_editPanelLayout.createSequentialGroup()
                                            .addComponent(lblLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lastNameSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(search_editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(healthCardSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cmbHealthPlanSearch, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(378, 378, Short.MAX_VALUE))
                    .addComponent(jSeparator1)))
        );
        search_editPanelLayout.setVerticalGroup(
            search_editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(search_editPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblSearchBy)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(search_editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSearchTelephone)
                    .addComponent(txtSearchTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOr, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch)
                    .addComponent(txtSearchName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSearchLastName))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(search_editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPatientNo2)
                    .addComponent(txtPatientNoSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHealthPlan)
                    .addComponent(cmbHealthPlanSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(search_editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(firstNameSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHealthCardNum)
                    .addComponent(healthCardSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(search_editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLastName)
                    .addComponent(lastNameSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(search_editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGender)
                    .addComponent(lblDOB)
                    .addComponent(dobSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genderSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(search_editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddress)
                    .addComponent(addressSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(search_editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(emailSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(search_editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telephoneSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelephone))
                .addGap(18, 18, 18)
                .addGroup(search_editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEdit)
                    .addComponent(btnDelete)
                    .addComponent(btnSearchClear)
                    .addComponent(btnSearchSave))
                .addGap(126, 126, 126))
        );

        employeeTabs.addTab("Search/Edit Patient", search_editPanel);

        lblStatus.setText("Status:");

        lblUpdateStatus.setText("Welcome");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Eyesys logo blue small.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 505, Short.MAX_VALUE))
                    .addComponent(employeeTabs, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblStatus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblUpdateStatus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(employeeTabs, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblStatus)
                        .addComponent(lblUpdateStatus)))
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
                if(firstNameSearch.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Name not found");
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
            if(firstNameSearch.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Telephone not found");
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
            txtPatientNoSearch.setText(rs.getString("patient_number"));
       
            firstNameSearch.setText(rs.getString("firstname"));
            lastNameSearch.setText(rs.getString("lastname"));
            genderSearch.setText(rs.getString("gender"));
            addressSearch.setText(rs.getString("address"));
            emailSearch.setText(rs.getString("email"));
            telephoneSearch.setText(rs.getString("telephone"));
            cmbHealthPlanSearch.setSelectedItem(rs.getString("health_plan"));
            healthCardSearch.setText(rs.getString("health_cardNum"));

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
        String pNum, fName, lName, gen, address, email, tel, hPlan, hCardNum;
        String aSQL = "";
        String message = "";
       
        pNum = lblPatientNo.getText();
        fName = txtPatientFirstName.getText();
        lName = txtPatientLastName.getText();
        gen = cmbPatientGender.getSelectedItem().toString();
        address = txtPatientAddress.getText();
        email = txtPatientEmail.getText();
        tel = txtPatientTelephone.getText();
        hPlan = cmbHealthPlan.getSelectedItem().toString();
        hCardNum = txtHealthCardNum.getText();
        
        
        aSQL = "INSERT INTO cliente(patient_number, firstname, lastName, gender, "
                + "address, email, telephone, health_plan, health_cardNum)" +
        "VALUES(?,?,?,?,?,?,?,?,?)";

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
            pst.setString(8, hPlan);
            pst.setString(9, hCardNum);

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

    private void txtPatientNoSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientNoSearchActionPerformed
 
    }//GEN-LAST:event_txtPatientNoSearchActionPerformed

    private void btnSearchClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchClearActionPerformed
        inHabilitarSearch();
    }//GEN-LAST:event_btnSearchClearActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        setEditable();     
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
         int response = JOptionPane.showConfirmDialog(null, "Do you want to delete this patient?", "Confirm",
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
         if (response == JOptionPane.NO_OPTION) {
             System.out.println("No button clicked");
        }
         else if (response == JOptionPane.YES_OPTION) {
            delete();
            lblUpdateStatus.setText("Patient deleted");
            inHabilitarSearch();
        }    
         else if (response == JOptionPane.CLOSED_OPTION) {
             System.out.println("JOptionPane closed");
         }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSearchSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchSaveActionPerformed
        Connect mysql = new Connect();
        Connection cn = mysql.connect();
        String fName, lName, gen, address, email, tel, hPlan, hCardNum;
        String aSQL = "";
        String message = "";
       
        fName = firstNameSearch.getText();
        lName = lastNameSearch.getText();
        gen = genderSearch.getText();
        address = addressSearch.getText();
        email = emailSearch.getText();
        tel = telephoneSearch.getText();
        hPlan = cmbHealthPlanSearch.getSelectedItem().toString();
        hCardNum = healthCardSearch.getText();
        
        
        String SQL = "UPDATE cliente SET firstname='" + fName + "', lastName='"+ lName+"', "
                + "gender='"+ gen+"', address='"+address+"', email='"+ email+"', "
                + "telephone='"+ tel+"', health_plan='"+ hPlan+"', health_cardNum='"+ hCardNum+"' WHERE patient_number='" 
                + txtPatientNoSearch.getText() + "'";

        message = "Patient Information Edited";

        try {
            Statement st;
            st = (Statement) cn.createStatement();

            st.execute(SQL);

                lblUpdateStatus.setText(message);
                
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
          inHabilitarSearch();
    }//GEN-LAST:event_btnSearchSaveActionPerformed

    private void cmbHealthPlanSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbHealthPlanSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbHealthPlanSearchActionPerformed
   
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
        cmbHealthPlan.setEnabled(true);
        txtHealthCardNum.setEnabled(true);
        btnSave.setEnabled(true);
        tbPatientInfo.setEnabled(true);
        
        Connect mysql = new Connect();
        Connection cn = mysql.connect();
        String aSQL = "";
        aSQL = "SELECT patient_number FROM cliente";
        int patientCount = 0;
        
        try {
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(aSQL);
           
            while(rs.next()){  
            patientCount = rs.getInt("patient_number");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
        lblPatientNo.setText(Integer.toString(patientCount + 1));
        txtPatientAddress.setText("");
        txtPatientEmail.setText("");
        txtPatientFirstName.setText("");
        txtPatientLastName.setText("");
        txtPatientTelephone.setText("");
        txtSearchName.setText("");
        txtSearchTelephone.setText("");
        cmbHealthPlan.setSelectedIndex(0);
        txtHealthCardNum.setText("");
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
        cmbHealthPlan.setEnabled(false);
        txtHealthCardNum.setEnabled(false);
        btnSave.setEnabled(false);
        tbPatientInfo.setEnabled(false);
        
        cmbPatientGender.setSelectedItem("M");
        txtPatientAddress.setText("");
        txtPatientEmail.setText("");
        txtPatientFirstName.setText("");
        txtPatientLastName.setText("");
        txtPatientTelephone.setText("");
        lblPatientNo.setText("");
        cmbHealthPlan.setSelectedIndex(0);
        txtHealthCardNum.setText("");
     
    }
    
    public void setNotEditable()
    {
        txtPatientNoSearch.setEditable(false);
        dobSearch.setEditable(false);
        addressSearch.setEditable(false);
        emailSearch.setEditable(false);
        firstNameSearch.setEditable(false);
        lastNameSearch.setEditable(false);
        telephoneSearch.setEditable(false);
        genderSearch.setEditable(false);
        cmbHealthPlanSearch.setEditable(false);
        healthCardSearch.setEditable(false);
        btnSearchSave.setVisible(false);
    }    
    public void setEditable()
    {

        dobSearch.setEditable(true);
        addressSearch.setEditable(true);
        emailSearch.setEditable(true);
        firstNameSearch.setEditable(true);
        lastNameSearch.setEditable(true);
        telephoneSearch.setEditable(true);
        cmbHealthPlanSearch.setEditable(true);
        healthCardSearch.setEditable(true);
        btnSearchSave.setVisible(true);
        
        dobSearch.setBorder((txtSearchName.getBorder()));
        addressSearch.setBorder((txtSearchName.getBorder()));
        emailSearch.setBorder((txtSearchName.getBorder()));
        firstNameSearch.setBorder((txtSearchName.getBorder()));
        lastNameSearch.setBorder((txtSearchName.getBorder()));
        telephoneSearch.setBorder((txtSearchName.getBorder()));
        genderSearch.setBorder((txtSearchName.getBorder()));
        healthCardSearch.setBorder((txtSearchName.getBorder()));
        
        
        lblUpdateStatus.setText("Editing Patient #" + txtPatientNoSearch.getText());
    }    
    
    private void habilitarSearch(){
    
        
        txtPatientNoSearch.setEnabled(true);
        dobSearch.setEnabled(true);
        addressSearch.setEnabled(true);
        emailSearch.setEnabled(true);
        firstNameSearch.setEnabled(true);
        lastNameSearch.setEnabled(true);
        telephoneSearch.setEnabled(true);
        genderSearch.setEnabled(true);
        cmbHealthPlanSearch.setEnabled(true);
        healthCardSearch.setEnabled(true);
        btnEdit.setEnabled(true);
        btnDelete.setEnabled(true);
        btnSearchClear.setEnabled(true);
        
        

    }
    
    private void inHabilitarSearch(){
         
        txtPatientNoSearch.setEnabled(false);
        dobSearch.setEnabled(false);
        addressSearch.setEnabled(false);
        emailSearch.setEnabled(false);
        firstNameSearch.setEnabled(false);
        lastNameSearch.setEnabled(false);
        telephoneSearch.setEnabled(false);
        genderSearch.setEnabled(false);
        cmbHealthPlanSearch.setEnabled(false);
        healthCardSearch.setEnabled(false);
        btnEdit.setEnabled(false);
        btnSearchClear.setEnabled(false);
        btnDelete.setEnabled(false);
        btnSearchSave.setVisible(false);
        
        txtPatientNoSearch.setText("");
        dobSearch.setText("");
        addressSearch.setText("");
        emailSearch.setText("");
        firstNameSearch.setText("");
        lastNameSearch.setText("");
        cmbHealthPlanSearch.setSelectedIndex(0);
        healthCardSearch.setText("");
        telephoneSearch.setText("");
        genderSearch.setText("");
        txtSearchTelephone.setText("");
        txtSearchName.setText("");
        
        dobSearch.setBorder(null);
        addressSearch.setBorder(null);
        emailSearch.setBorder(null);
        firstNameSearch.setBorder(null);
        lastNameSearch.setBorder(null);
        telephoneSearch.setBorder(null);
        genderSearch.setBorder(null);
        healthCardSearch.setBorder(null);
    
        setNotEditable();
              
    }
    
    private void delete(){
        
        Connect mysql = new Connect();
        Connection cn = mysql.connect();
        
        String sql = "DELETE FROM cliente WHERE patient_number = '"+txtPatientNoSearch.getText()+"'";
        
         
        try {
            Statement st;
            st = (Statement) cn.createStatement();
            st.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
         
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
    private javax.swing.JTextField addressSearch;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSearchClear;
    private javax.swing.JButton btnSearchSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cmbHealthPlan;
    private javax.swing.JComboBox cmbHealthPlanSearch;
    private javax.swing.JComboBox cmbPatientGender;
    private javax.swing.JTextField dobSearch;
    private javax.swing.JTextField emailSearch;
    private javax.swing.JTabbedPane employeeTabs;
    private javax.swing.JTextField firstNameSearch;
    private javax.swing.JTextField genderSearch;
    private javax.swing.JTextField healthCardSearch;
    private javax.swing.JComboBox jComboBox2;
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField lastNameSearch;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblHealthCardNum;
    private javax.swing.JLabel lblHealthPlan;
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
    private javax.swing.JTextField txtHealthCardNum;
    private javax.swing.JTextField txtPatientAddress;
    private javax.swing.JTextField txtPatientEmail;
    private javax.swing.JTextField txtPatientFirstName;
    private javax.swing.JTextField txtPatientLastName;
    private javax.swing.JTextField txtPatientNoSearch;
    private javax.swing.JTextField txtPatientTelephone;
    private javax.swing.JTextField txtSearchName;
    private javax.swing.JTextField txtSearchTelephone;
    // End of variables declaration//GEN-END:variables


}
