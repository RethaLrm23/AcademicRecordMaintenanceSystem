/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */

package academicrecordmaintenancesystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lerum
 */

public class frmEditProfiles extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmNewProfile
     */
    
    public frmEditProfiles() {
        initComponents();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        
        // Show Students Information In Table
        show_StudentsProfiles();
        
    }    
    
    public  ArrayList<Student_Information> studentsProfileList() {
        
        ArrayList<Student_Information> studentsProfileList = new ArrayList<>();
        
        java.sql.Connection conMySQLConnectionString = null;
        String URL = "jdbc:mysql://localhost:3306/students_information";
        String User = "root";
        String Password = "Password";
        
        try {
            
            conMySQLConnectionString = DriverManager.getConnection(URL,User,Password);
            Statement myStatement = conMySQLConnectionString.createStatement();
            String sqlinsert = "Select * from students_profiles";
            
            ResultSet rs = myStatement.executeQuery(sqlinsert);            
            Student_Information students_information;
            
            while(rs.next()) {

                students_information = new Student_Information(rs.getInt("id"), rs.getString("name"), rs.getString("surname"), rs.getString("gender"), 
                        rs.getString("email"), rs.getString("phone"), rs.getString("username"), rs.getString("pass"), rs.getString("module_1"), rs.getString("mark_1"),
                        rs.getString("module_2"), rs.getString("mark_2"));
                studentsProfileList.add(students_information);

            }
                              
            myStatement.close();
            
        }
        catch(Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
            
        }
        
        return studentsProfileList;
        
    }
    
    // Show Student Information In Table Function
    public void show_StudentsProfiles() {
        
        ArrayList<Student_Information> studentsInformation = studentsProfileList();
        DefaultTableModel model = (DefaultTableModel)tblStudentsInfo.getModel();
        Object[] row = new Object [12];
        
        int exitingRows = tblStudentsInfo.getRowCount();
        
        while(exitingRows >= 1) {
            
            model.removeRow(0);
            exitingRows = exitingRows - 1;
            
        }
        
        for(int i = 0; i < studentsInformation.size(); i++) {
            
            row[0]=studentsInformation.get(i).getid();
            row[1]=studentsInformation.get(i).getname();
            row[2]=studentsInformation.get(i).getsurname();
            row[3]=studentsInformation.get(i).getgender();
            row[4]=studentsInformation.get(i).getemail();
            row[5]=studentsInformation.get(i).getphone();
            row[6]=studentsInformation.get(i).getusername();
            row[7]=studentsInformation.get(i).getpass();
            row[8]=studentsInformation.get(i).getmodule_1();
            row[9]=studentsInformation.get(i).getmark_1();
            row[10]=studentsInformation.get(i).getmodule_2();
            row[11]=studentsInformation.get(i).getmark_2();
            model.addRow(row);
            
        }
        
    }
    
    public void Update(){
        try {
            // Establish a connection to the MySQL server
            String url = "jdbc:mysql://localhost/students_information";
            String username = "root";
            String password = "Password";
            Connection conn = DriverManager.getConnection(url, username, password);


            String sql = "Update students_profiles SET name = ?, surname = ?, gender = ?, email = ?,"
                    + "phone = ?, username = ?, pass = ?, module_1 = ?,"
                    + "mark_1 = ?, module_2 = ?, mark_2 = ? WHERE id = ?";
            
            // Create a Prepared Statement object to execute SQL commands           
            PreparedStatement preparedStmt = conn.prepareStatement(sql);

            // Set the values for the update statement using the text fields
            preparedStmt.setString(12, lblNumber.getText());
            preparedStmt.setString(1, txtName.getText());
            preparedStmt.setString(2, txtSurname.getText());
             
            if(rbMale.isSelected()) {
            
                rbMale.setSelected(true);
                rbFemale.setSelected(false);
                preparedStmt.setString(3, rbMale.getText());
            
            }

            else {

                rbMale.setSelected(false);
                rbFemale.setSelected(true);
                preparedStmt.setString(3, rbFemale.getText());
                
            
            }   
            
            preparedStmt.setString(4, txtEmail.getText());
            preparedStmt.setString(5, txtPhone.getText());
            preparedStmt.setString(6, txtUsername.getText());
            preparedStmt.setString(7, txtPassword.getText());
            preparedStmt.setString(8, cboModule1.getSelectedItem().toString());
            preparedStmt.setString(9, txtMark1.getText());
            preparedStmt.setString(10, cboModule2.getSelectedItem().toString());
            preparedStmt.setString(11, txtMark2.getText());
            
        
        
            // Execute the update statement
            int rowsUpdated = preparedStmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Updated successfully");

            // Close the resources
            preparedStmt.close();
            conn.close();
            
        } 
        catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
        
        }
        
    }
    
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
        txtPassword = new javax.swing.JTextField();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStudentsInfo = new javax.swing.JTable();
        cboModule1 = new javax.swing.JComboBox<>();
        cboModule2 = new javax.swing.JComboBox<>();
        rbMale = new javax.swing.JRadioButton();
        rbFemale = new javax.swing.JRadioButton();
        lblID = new javax.swing.JLabel();
        lblNumber = new javax.swing.JLabel();

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

        txtUsername.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        txtEmail.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        txtPhone.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        txtPassword.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

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

        txtMark1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

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

        tblStudentsInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Stud_ID", "Name", "Surname", "Gender", "Email", "Phone", "Username", "Password", "Module 1", "Mark 1", "Module 2", "Mark 2"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblStudentsInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblStudentsInfoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblStudentsInfo);

        cboModule1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cboModule1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<SELECT>", "JAVA", "C#", "JAVASCRIPT", "PYTHON" }));

        cboModule2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cboModule2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<SELECT>", "PHP", "HTML", "CSS", "C++" }));

        rbMale.setBackground(new java.awt.Color(204, 204, 204));
        rbMale.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        rbMale.setLabel("Male");
        rbMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMaleActionPerformed(evt);
            }
        });

        rbFemale.setBackground(new java.awt.Color(204, 204, 204));
        rbFemale.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        rbFemale.setLabel("Female");
        rbFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFemaleActionPerformed(evt);
            }
        });

        lblID.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        lblID.setText("Stud ID");

        lblNumber.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        lblNumber.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(486, 486, 486)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                .addComponent(lblModule1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblMark1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblModule2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblMark2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblUsername, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                .addComponent(lblPhone, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblGender, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblSurname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMark2)
                            .addComponent(cboModule2, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtMark1)
                            .addComponent(cboModule1, 0, 250, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rbMale)
                                .addGap(18, 18, 18)
                                .addComponent(rbFemale))
                            .addComponent(txtUsername)
                            .addComponent(txtPhone)
                            .addComponent(txtEmail)
                            .addComponent(txtSurname)
                            .addComponent(txtName)
                            .addComponent(txtPassword))
                        .addGap(157, 157, 157)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(229, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1626, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 16, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbMale)
                            .addComponent(rbFemale))
                        .addGap(33, 33, 33)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(cboModule1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(txtMark1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(cboModule2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(txtMark2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblName)
                        .addGap(26, 26, 26)
                        .addComponent(lblSurname)
                        .addGap(24, 24, 24)
                        .addComponent(lblGender)
                        .addGap(31, 31, 31)
                        .addComponent(lblEmail)
                        .addGap(28, 28, 28)
                        .addComponent(lblPhone)
                        .addGap(26, 26, 26)
                        .addComponent(lblUsername)
                        .addGap(31, 31, 31)
                        .addComponent(lblPassword)
                        .addGap(28, 28, 28)
                        .addComponent(lblModule1)
                        .addGap(27, 27, 27)
                        .addComponent(lblMark1)
                        .addGap(26, 26, 26)
                        .addComponent(lblModule2)
                        .addGap(30, 30, 30)
                        .addComponent(lblMark2)))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1652, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 899, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblStudentsInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblStudentsInfoMouseClicked
        
        DefaultTableModel RecordTable = (DefaultTableModel)tblStudentsInfo.getModel();
        int selectedRow = tblStudentsInfo.getSelectedRow();
       
        lblNumber.setText(RecordTable.getValueAt(selectedRow, 0).toString());
        txtName.setText(RecordTable.getValueAt(selectedRow, 1).toString());
        txtSurname.setText(RecordTable.getValueAt(selectedRow, 2).toString());
        
        String strGen = RecordTable.getValueAt(selectedRow, 3).toString();
        
        if(strGen.equals("Male")) {
            
            rbMale.setSelected(true);
            rbFemale.setSelected(false);
            
        }
        else {
            
            rbFemale.setSelected(true);
            rbMale.setSelected(false);
            
        }
        
        txtEmail.setText(RecordTable.getValueAt(selectedRow, 4).toString());
        txtPhone.setText(RecordTable.getValueAt(selectedRow, 5).toString());
        txtUsername.setText(RecordTable.getValueAt(selectedRow, 6).toString());
        txtPassword.setText(RecordTable.getValueAt(selectedRow, 7).toString());
        cboModule1.setSelectedItem(RecordTable.getValueAt(selectedRow, 8).toString());
        txtMark1.setText(RecordTable.getValueAt(selectedRow, 9).toString());
        cboModule2.setSelectedItem(RecordTable.getValueAt(selectedRow, 10).toString());
        txtMark2.setText(RecordTable.getValueAt(selectedRow, 11).toString());
        
    }//GEN-LAST:event_tblStudentsInfoMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
               
        Update();
        show_StudentsProfiles();
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void rbFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFemaleActionPerformed
        
        // Female Is Selected
        if(rbFemale.isSelected()) {
            
            // Male Is Disabled
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
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cboModule1;
    private javax.swing.JComboBox<String> cboModule2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
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
    private javax.swing.JRadioButton rbFemale;
    private javax.swing.JRadioButton rbMale;
    private javax.swing.JTable tblStudentsInfo;
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
