/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */

package academicrecordmaintenancesystem;

import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author Lerum
 */

public class frmCreateProfile extends javax.swing.JInternalFrame {
    
    /**
     * Creates new form frmNewProfile
     */
    
    public frmCreateProfile() {
        initComponents();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        
        // Focus In Name Field At Start Up
        txtName.requestFocusInWindow();
        
        // Set Mark 1 And Mark 2 Fields To Not Editable
        txtMark1.setText("");
        txtMark2.setText("");
        txtMark1.setEditable(false);
        txtMark2.setEditable(false);
        
    }
    
    // Variables And Assignments
    String strName = null;
    String strSurname = null;
    String strGender = null;
    String strEmail = null;
    String strPhone = null;
    String strUsername = null;
    String strPassword = null;
    String strModule1 = null;
    String strMark1 = null;
    String strModule2 = null;
    String strMark2 = null;
    
    // Getting User Information Function
    private void mGetValuesFromGUI(){
        
        strName = txtName.getText();
        strSurname = txtSurname.getText();
        
        if(rbMale.isSelected()) {
            
            rbMale.setSelected(true);
            rbFemale.setSelected(false);
            strGender = "Male";
            
        }
        
        else {
            
            rbMale.setSelected(false);
            rbFemale.setSelected(true);
            strGender = "Female";
            
        }
        
        strEmail = txtEmail.getText();
        strPhone = txtPhone.getText();
        strUsername = txtUsername.getText();
        strPassword = txtPassword.getText();
        strModule1 = cboModule1.getSelectedItem().toString();
        strMark1 = txtMark1.getText();
        strModule2 = cboModule2.getSelectedItem().toString();
        strMark2 = txtMark2.getText();
        
    }
     
    // Creating Profile Function
    private void mCreateProfile(){
        
        // Variables For Connecting Database
        String strDBConnectionString = "jdbc:mysql://localhost:3306/students_information";
        String strDBUser = "root";
        String strDBPassword = "Password";
        java.sql.Connection conMySQLConnectionString;
        
        try{
            
            // Database Connection
            conMySQLConnectionString = DriverManager.getConnection(strDBConnectionString, strDBUser, strDBPassword);
            Statement myStatement = conMySQLConnectionString.createStatement();
            
            // Insert Query
            String strQuery = " insert into students_profiles "+"(name, surname, gender, email, phone, username, pass, module_1, mark_1, module_2, mark_2)"
                    + "values('"+ strName +"', '"+ strSurname +"', '"+ strGender +"', '"+ strEmail +"', '"+ strPhone +"', '"+ strUsername +"', '"+ strPassword +"', "
                    + "'"+ strModule1 +"', '"+ strMark1 +"', '"+ strModule2 +"', '"+ strMark2 +"')";
            
            myStatement.executeUpdate(strQuery);
            myStatement.close();
            
            // If Connection Is Successful
            JOptionPane.showMessageDialog(null, "Created Profile Successfully");
            
        }
        catch(Exception e){
            
            // If Connection Fails
            JOptionPane.showMessageDialog(null, "ERROR! Database Connection Failed.");
            
        }
    
    }
    
    // Clearing All Fields Function
    private void mClearTextFields(){
        
        txtName.setText("");
        txtSurname.setText("");
        rbMale.setSelected(false);
        rbFemale.setSelected(false);
        txtEmail.setText("");
        txtPhone.setText("");
        txtUsername.setText("");
        txtPassword.setText("");
        cboModule1.setSelectedIndex(0);
        txtMark1.setText("");
        cboModule2.setSelectedIndex(0);
        txtMark2.setText("");
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        pnlMainCreateProfile = new javax.swing.JPanel();
        pnlHeader = new javax.swing.JPanel();
        lblCreateProfile = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtSurname = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        lblMark1 = new javax.swing.JLabel();
        lblModule1 = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblSurname = new javax.swing.JLabel();
        lblMark2 = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblPhone = new javax.swing.JLabel();
        lblModule2 = new javax.swing.JLabel();
        txtMark1 = new javax.swing.JTextField();
        txtMark2 = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        rbMale = new javax.swing.JRadioButton();
        txtPassword = new javax.swing.JTextField();
        cboModule1 = new javax.swing.JComboBox<>();
        cboModule2 = new javax.swing.JComboBox<>();
        rbFemale = new javax.swing.JRadioButton();
        lblRequiredField1 = new javax.swing.JLabel();
        lblRequiredField2 = new javax.swing.JLabel();
        lblRequiredField3 = new javax.swing.JLabel();
        lblRequiredField4 = new javax.swing.JLabel();
        lblRequiredField5 = new javax.swing.JLabel();
        lblRequiredField6 = new javax.swing.JLabel();
        lblRequiredField7 = new javax.swing.JLabel();
        lblRequiredField8 = new javax.swing.JLabel();
        lblRequiredField9 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setPreferredSize(new java.awt.Dimension(1660, 950));

        pnlMainCreateProfile.setBackground(new java.awt.Color(204, 204, 204));
        pnlMainCreateProfile.setPreferredSize(new java.awt.Dimension(840, 612));

        pnlHeader.setBackground(new java.awt.Color(153, 153, 153));
        pnlHeader.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlHeader.setForeground(new java.awt.Color(255, 255, 255));

        lblCreateProfile.setBackground(new java.awt.Color(153, 153, 153));
        lblCreateProfile.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        lblCreateProfile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCreateProfile.setText("Create Profile");

        javax.swing.GroupLayout pnlHeaderLayout = new javax.swing.GroupLayout(pnlHeader);
        pnlHeader.setLayout(pnlHeaderLayout);
        pnlHeaderLayout.setHorizontalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCreateProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlHeaderLayout.setVerticalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCreateProfile)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblName.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        lblName.setText("Name");

        txtName.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        txtSurname.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        txtEmail.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        txtUsername.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        txtPhone.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        lblMark1.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        lblMark1.setText("Mark 1");

        lblModule1.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        lblModule1.setText("Module 1");

        lblEmail.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        lblEmail.setText("Email");

        lblSurname.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        lblSurname.setText("Surname");

        lblMark2.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        lblMark2.setText("Mark 2");

        lblGender.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        lblGender.setText("Gender");

        lblPassword.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        lblPassword.setText("Password");

        lblUsername.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        lblUsername.setText("Username");

        lblPhone.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        lblPhone.setText("Phone");

        lblModule2.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        lblModule2.setText("Module 2");

        txtMark1.setBackground(new java.awt.Color(204, 204, 204));
        txtMark1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        txtMark2.setBackground(new java.awt.Color(204, 204, 204));
        txtMark2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        btnCreate.setBackground(new java.awt.Color(0, 0, 0));
        btnCreate.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnCreate.setForeground(new java.awt.Color(255, 255, 255));
        btnCreate.setText("CREATE");
        btnCreate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        rbMale.setBackground(new java.awt.Color(204, 204, 204));
        rbMale.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        rbMale.setText("Male");
        rbMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMaleActionPerformed(evt);
            }
        });

        txtPassword.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        cboModule1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cboModule1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<SELECT>", "JAVA", "C#", "JAVASCRIPT", "PYTHON" }));

        cboModule2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cboModule2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<SELECT>", "PHP", "HTML", "CSS", "C++" }));

        rbFemale.setBackground(new java.awt.Color(204, 204, 204));
        rbFemale.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        rbFemale.setText("Female");
        rbFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFemaleActionPerformed(evt);
            }
        });

        lblRequiredField1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblRequiredField1.setForeground(new java.awt.Color(255, 0, 0));
        lblRequiredField1.setText("*");

        lblRequiredField2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblRequiredField2.setForeground(new java.awt.Color(255, 0, 0));
        lblRequiredField2.setText("*");

        lblRequiredField3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblRequiredField3.setForeground(new java.awt.Color(255, 0, 0));
        lblRequiredField3.setText("*");

        lblRequiredField4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblRequiredField4.setForeground(new java.awt.Color(255, 0, 0));
        lblRequiredField4.setText("*");

        lblRequiredField5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblRequiredField5.setForeground(new java.awt.Color(255, 0, 0));
        lblRequiredField5.setText("*");

        lblRequiredField6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblRequiredField6.setForeground(new java.awt.Color(255, 0, 0));
        lblRequiredField6.setText("*");

        lblRequiredField7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblRequiredField7.setForeground(new java.awt.Color(255, 0, 0));
        lblRequiredField7.setText("*");

        lblRequiredField8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblRequiredField8.setForeground(new java.awt.Color(255, 0, 0));
        lblRequiredField8.setText("*");

        lblRequiredField9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblRequiredField9.setForeground(new java.awt.Color(255, 0, 0));
        lblRequiredField9.setText("*");

        javax.swing.GroupLayout pnlMainCreateProfileLayout = new javax.swing.GroupLayout(pnlMainCreateProfile);
        pnlMainCreateProfile.setLayout(pnlMainCreateProfileLayout);
        pnlMainCreateProfileLayout.setHorizontalGroup(
            pnlMainCreateProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainCreateProfileLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMainCreateProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMainCreateProfileLayout.createSequentialGroup()
                        .addComponent(pnlHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainCreateProfileLayout.createSequentialGroup()
                        .addGap(0, 488, Short.MAX_VALUE)
                        .addGroup(pnlMainCreateProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlMainCreateProfileLayout.createSequentialGroup()
                                .addComponent(lblMark2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(219, 219, 219)
                                .addComponent(txtMark2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlMainCreateProfileLayout.createSequentialGroup()
                                .addGroup(pnlMainCreateProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainCreateProfileLayout.createSequentialGroup()
                                        .addComponent(lblModule2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(219, 219, 219)
                                        .addComponent(cboModule2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainCreateProfileLayout.createSequentialGroup()
                                        .addGroup(pnlMainCreateProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(lblPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblUsername, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblPhone, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblSurname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblGender, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblModule1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(152, 152, 152)
                                        .addGroup(pnlMainCreateProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(pnlMainCreateProfileLayout.createSequentialGroup()
                                                .addComponent(rbMale)
                                                .addGap(18, 18, 18)
                                                .addComponent(rbFemale))
                                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cboModule1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainCreateProfileLayout.createSequentialGroup()
                                        .addComponent(lblMark1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(219, 219, 219)
                                        .addComponent(txtMark1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlMainCreateProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblRequiredField2)
                                    .addComponent(lblRequiredField3)
                                    .addComponent(lblRequiredField4)
                                    .addComponent(lblRequiredField5)
                                    .addComponent(lblRequiredField1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblRequiredField6)
                                    .addComponent(lblRequiredField7)
                                    .addGroup(pnlMainCreateProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lblRequiredField9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblRequiredField8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(467, 467, 467))))
            .addGroup(pnlMainCreateProfileLayout.createSequentialGroup()
                .addGap(713, 713, 713)
                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlMainCreateProfileLayout.setVerticalGroup(
            pnlMainCreateProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainCreateProfileLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(pnlHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addGroup(pnlMainCreateProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRequiredField1))
                .addGap(26, 26, 26)
                .addGroup(pnlMainCreateProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSurname)
                    .addComponent(txtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRequiredField2))
                .addGap(26, 26, 26)
                .addGroup(pnlMainCreateProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGender)
                    .addComponent(rbMale)
                    .addComponent(rbFemale)
                    .addComponent(lblRequiredField3))
                .addGap(31, 31, 31)
                .addGroup(pnlMainCreateProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRequiredField4))
                .addGap(25, 25, 25)
                .addGroup(pnlMainCreateProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPhone)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRequiredField5))
                .addGap(23, 23, 23)
                .addGroup(pnlMainCreateProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRequiredField6))
                .addGap(24, 24, 24)
                .addGroup(pnlMainCreateProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRequiredField7))
                .addGap(30, 30, 30)
                .addGroup(pnlMainCreateProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblModule1)
                    .addComponent(cboModule1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRequiredField8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(pnlMainCreateProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMark1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMark1))
                .addGap(19, 19, 19)
                .addGroup(pnlMainCreateProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboModule2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblModule2)
                    .addComponent(lblRequiredField9))
                .addGap(28, 28, 28)
                .addGroup(pnlMainCreateProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMark2)
                    .addComponent(txtMark2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMainCreateProfile, javax.swing.GroupLayout.DEFAULT_SIZE, 1656, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMainCreateProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 883, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed

        // Check If Fields Are Empty
        if(txtName.getText().equals("")) {
            
            // If Empty
            JOptionPane.showMessageDialog(null, "Name Field Is Empty!");
            txtName.requestFocusInWindow();
        
        }
        
        else if(txtSurname.getText().equals("")) {
            
            // If Empty
            JOptionPane.showMessageDialog(null, "Surname Field Is Empty!");
            txtSurname.requestFocusInWindow();
            
        }
        
        else if(!rbMale.isSelected() && !rbFemale.isSelected()) {
            
            // If Empty
            JOptionPane.showMessageDialog(null, "Gender Field Is Empty!");
            
        }
        
        else if(txtEmail.getText().equals("")) {
            
            // If Empty
            JOptionPane.showMessageDialog(null, "Email Field Is Empty!");
            txtEmail.requestFocusInWindow();
            
        }
        
        else if(txtPhone.getText().equals("")) {
            
            // If Empty
            JOptionPane.showMessageDialog(null, "Phone Field Is Empty!");
            txtPhone.requestFocusInWindow();
            
        }
        
        else if(txtUsername.getText().equals("")) {
            
            // If Empty
            JOptionPane.showMessageDialog(null, "Username Field Is Empty!");
            txtUsername.requestFocusInWindow();
            
        }
        
        else if(txtPassword.getText().equals("")) {
            
            // If Empty
            JOptionPane.showMessageDialog(null, "Password Field Is Empty!");
            txtPassword.requestFocusInWindow();
            
        }
        
        else if(cboModule1.getSelectedItem().equals("<SELECT>")) {
            
            // If Empty
            JOptionPane.showMessageDialog(null, "Module 1 Field Is Empty!");
            cboModule1.requestFocusInWindow();
            
        }
        
        else if(cboModule2.getSelectedItem().equals("<SELECT>")) {
            
            // If Empty
            JOptionPane.showMessageDialog(null, "Module 2 Field Is Empty!");
            cboModule2.requestFocusInWindow();
            
        }
        
        else {
            
            // If Fields Are Filled
            mGetValuesFromGUI();
            mCreateProfile();
            mClearTextFields(); 
            
        }
        
    }//GEN-LAST:event_btnCreateActionPerformed

    private void rbFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFemaleActionPerformed
       
        // Female Is Selected
        if(rbFemale.isSelected()) {
            
            // Male Is Dssabled
            rbMale.setSelected(false);
            
        }
        
    }//GEN-LAST:event_rbFemaleActionPerformed

    private void rbMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMaleActionPerformed
        
        // Male Is Selected
        if(rbMale.isSelected()) {
            
            // Female Is Disabled
            rbFemale.setSelected(false);
            
        }
        
    }//GEN-LAST:event_rbMaleActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboModule1;
    private javax.swing.JComboBox<String> cboModule2;
    private javax.swing.JLabel lblCreateProfile;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblMark1;
    private javax.swing.JLabel lblMark2;
    private javax.swing.JLabel lblModule1;
    private javax.swing.JLabel lblModule2;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblRequiredField1;
    private javax.swing.JLabel lblRequiredField2;
    private javax.swing.JLabel lblRequiredField3;
    private javax.swing.JLabel lblRequiredField4;
    private javax.swing.JLabel lblRequiredField5;
    private javax.swing.JLabel lblRequiredField6;
    private javax.swing.JLabel lblRequiredField7;
    private javax.swing.JLabel lblRequiredField8;
    private javax.swing.JLabel lblRequiredField9;
    private javax.swing.JLabel lblSurname;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlMainCreateProfile;
    private javax.swing.JRadioButton rbFemale;
    private javax.swing.JRadioButton rbMale;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMark1;
    private javax.swing.JTextField txtMark2;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtSurname;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}