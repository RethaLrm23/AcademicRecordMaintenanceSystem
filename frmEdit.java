/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */

package academicrecordmaintenancesystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Lerum
 */

public class frmEdit extends javax.swing.JInternalFrame {
    
    // Variables
    public static frmEdit Instance; 
    public JLabel lblStudID;
    public JTextField txtSN;
    public JTextField txtSS;
    public JTextField txtSG;
    public JTextField txtSE;
    public JTextField txtSP;
    public JTextField txtSU;
    public JTextField txtSPa;
    public JTextField txtSMo1;
    public JTextField txtSMo2;
    public JTextField txtSMa1;
    public JTextField txtSMa2;
        
    /**
     * Creates new form frmNewProfile
     */
    
    public frmEdit() {
        initComponents();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        
        // Instance Assignment
        Instance = this;
        
        // Converting Private Variables to Public Variables
        lblStudID = lblNumber;
        txtSN = txtName;
        txtSS = txtSurname;
        txtSG = txtGender;
        txtSE = txtEmail;
        txtSP = txtPhone;
        txtSU = txtUsername;
        txtSPa = txtPassword;
        txtSMo1 = txtModule1;
        txtSMo2 = txtModule2;
        txtSMa1 = txtMark1;
        txtSMa2 = txtMark2;
        
        // Making Text Fields Uneditable
        txtGender.setEditable(false);
        txtUsername.setEditable(false);
        txtModule1.setEditable(false);
        txtModule2.setEditable(false);
        txtMark1.setEditable(false);
        txtMark2.setEditable(false);
        
    }

    // Beginning Of The UPDATE Method
    public void Update(){
        
        try {
            
            // Establish A Connection To The MySQL Server
            String url = "jdbc:mysql://localhost/students_information";
            String username = "root";
            String password = "Password";
            Connection conn = DriverManager.getConnection(url, username, password);

            // UPDATE SQL Command
            String sql = "Update students_profiles SET name = ?, surname = ?, gender = ?, email = ?,"
                    + "phone = ?, username = ?, pass = ?, module_1 = ?,"
                    + "mark_1 = ?, module_2 = ?, mark_2 = ? WHERE id = ?";
            
            // Create A Prepared Statement Object To Execute SQL Command
            PreparedStatement preparedStmt = conn.prepareStatement(sql);

            // Set The Values For The Update Statement Using The Text Fields
            preparedStmt.setString(12, lblNumber.getText());
            preparedStmt.setString(1, txtName.getText());
            preparedStmt.setString(2, txtSurname.getText());
            preparedStmt.setString(3, txtGender.getText());
            preparedStmt.setString(4, txtEmail.getText());
            preparedStmt.setString(5, txtPhone.getText());
            preparedStmt.setString(6, txtUsername.getText());
            preparedStmt.setString(7, txtPassword.getText());
            preparedStmt.setString(8, txtModule1.getText());
            preparedStmt.setString(9, txtMark1.getText());
            preparedStmt.setString(10, txtModule2.getText());
            preparedStmt.setString(11, txtMark2.getText());
            
            // Execute The Update Statement
            int rowsUpdated = preparedStmt.executeUpdate();
            
            // Show This If Update Was Successful
            JOptionPane.showMessageDialog(null, "Updated successfully");

            // Close PreparedStatement and Connection
            preparedStmt.close();
            conn.close();
            
        } 
        catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
        
        }
        
    }
    // End Of The UPDATE Method
        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblEditProfiles = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtSurname = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtModule1 = new javax.swing.JTextField();
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
        btnUpdate = new javax.swing.JButton();
        lblID = new javax.swing.JLabel();
        lblNumber = new javax.swing.JLabel();
        txtGender = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        txtModule2 = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(1660, 950));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setPreferredSize(new java.awt.Dimension(840, 612));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        lblEditProfiles.setBackground(new java.awt.Color(153, 153, 153));
        lblEditProfiles.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        lblEditProfiles.setForeground(new java.awt.Color(255, 255, 255));
        lblEditProfiles.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEditProfiles.setText("Edit Profiles");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEditProfiles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEditProfiles)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblName.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        lblName.setText("Name");

        txtName.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        txtSurname.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        txtUsername.setBackground(new java.awt.Color(204, 204, 204));
        txtUsername.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        txtEmail.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        txtPhone.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        txtModule1.setBackground(new java.awt.Color(204, 204, 204));
        txtModule1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

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

        btnUpdate.setBackground(new java.awt.Color(0, 0, 0));
        btnUpdate.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("UPDATE");
        btnUpdate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUpdate.setMaximumSize(new java.awt.Dimension(88, 30));
        btnUpdate.setMinimumSize(new java.awt.Dimension(88, 30));
        btnUpdate.setPreferredSize(new java.awt.Dimension(88, 30));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        lblID.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        lblID.setText("Stud ID");

        lblNumber.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        lblNumber.setForeground(new java.awt.Color(255, 255, 255));

        txtGender.setBackground(new java.awt.Color(204, 204, 204));
        txtGender.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        txtPassword.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        txtModule2.setBackground(new java.awt.Color(204, 204, 204));
        txtModule2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 478, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblModule1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblMark1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblModule2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblMark2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblUsername, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblPhone, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblGender, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblSurname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMark2)
                            .addComponent(txtMark1)
                            .addComponent(txtUsername)
                            .addComponent(txtPhone)
                            .addComponent(txtEmail)
                            .addComponent(txtSurname)
                            .addComponent(txtName)
                            .addComponent(txtModule1)
                            .addComponent(txtGender)
                            .addComponent(txtPassword)
                            .addComponent(txtModule2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(255, 255, 255)
                        .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(233, 233, 233))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(676, 676, 676))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblName)
                        .addGap(26, 26, 26)
                        .addComponent(lblSurname)
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGender)
                            .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(lblEmail)
                        .addGap(28, 28, 28)
                        .addComponent(lblPhone)
                        .addGap(26, 26, 26)
                        .addComponent(lblUsername)
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPassword)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblModule1)
                            .addComponent(txtModule1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblID))))
                        .addGap(17, 17, 17)
                        .addComponent(txtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblMark1)
                        .addGap(26, 26, 26)
                        .addComponent(lblModule2)
                        .addGap(30, 30, 30)
                        .addComponent(lblMark2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtMark1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(txtModule2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(txtMark2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1648, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 914, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        
        // Update Student Information
        Update();
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblEditProfiles;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblMark1;
    private javax.swing.JLabel lblMark2;
    private javax.swing.JLabel lblModule1;
    private javax.swing.JLabel lblModule2;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNumber;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblSurname;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtMark1;
    private javax.swing.JTextField txtMark2;
    private javax.swing.JTextField txtModule1;
    private javax.swing.JTextField txtModule2;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtSurname;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
