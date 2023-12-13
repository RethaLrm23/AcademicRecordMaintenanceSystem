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

public class frmAchievements extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmNewProfile
     */
    
    public frmAchievements() {
        initComponents();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        
        // Show Database Table In The JTable
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
    
    // Submit and Add Student Marks
    public void mSubmitMarks(){
        
        try {
            
            // Establish a connection to the MySQL server
            String url = "jdbc:mysql://localhost/students_information";
            String username = "root";
            String password = "Password";
            Connection conn = DriverManager.getConnection(url, username, password);

            // Create a Prepared Statement object to execute SQL commands
            String sql = "Update students_profiles SET mark_1 = ?, mark_2 = ? WHERE id = ?";
            
            PreparedStatement preparedStmt = conn.prepareStatement(sql);

            // Set the values for the update statement using the text fields
            preparedStmt.setString(3, lblNumber.getText());
            preparedStmt.setString(1, txtMark1.getText());
            preparedStmt.setString(2, txtMark2.getText());
            
        
        
            // Execute the update statement
            int rowsUpdated = preparedStmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Submited Successfully");

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
        lblAchievements = new javax.swing.JLabel();
        lblmark1 = new javax.swing.JLabel();
        lblModule1 = new javax.swing.JLabel();
        lblMark2 = new javax.swing.JLabel();
        lblModule2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStudentsInfo = new javax.swing.JTable();
        lblStudentID = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        lblModuleName2 = new javax.swing.JLabel();
        lblNumber = new javax.swing.JLabel();
        lblModuleName1 = new javax.swing.JLabel();
        txtMark2 = new javax.swing.JTextField();
        txtMark1 = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(1660, 950));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setPreferredSize(new java.awt.Dimension(1660, 950));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        lblAchievements.setBackground(new java.awt.Color(153, 153, 153));
        lblAchievements.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        lblAchievements.setForeground(new java.awt.Color(255, 255, 255));
        lblAchievements.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAchievements.setText("Achievements");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAchievements, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAchievements)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblmark1.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        lblmark1.setText("Mark 1");

        lblModule1.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        lblModule1.setText("Module 1");

        lblMark2.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        lblMark2.setText("Mark 2");

        lblModule2.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        lblModule2.setText("Module 2");

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

        lblStudentID.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        lblStudentID.setText("Stud_ID");

        btnSubmit.setBackground(new java.awt.Color(0, 0, 0));
        btnSubmit.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnSubmit.setText("SUBMIT");
        btnSubmit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSubmit.setMaximumSize(new java.awt.Dimension(88, 30));
        btnSubmit.setMinimumSize(new java.awt.Dimension(88, 30));
        btnSubmit.setPreferredSize(new java.awt.Dimension(88, 30));
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        lblModuleName2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        lblNumber.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        lblModuleName1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        txtMark2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtMark2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMark2ActionPerformed(evt);
            }
        });

        txtMark1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(6, 6, 6))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(436, 436, 436)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblModule2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblModuleName2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblModule1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblModuleName1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(93, 93, 93)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblmark1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMark1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblMark2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMark2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(258, 258, 258)))
                .addContainerGap(456, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStudentID)
                    .addComponent(lblNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblModule1)
                    .addComponent(lblmark1)
                    .addComponent(lblModuleName1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMark1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblModule2)
                    .addComponent(lblMark2)
                    .addComponent(lblModuleName2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMark2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78)
                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1656, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 914, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblStudentsInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblStudentsInfoMouseClicked
        
        DefaultTableModel RecordTable = (DefaultTableModel)tblStudentsInfo.getModel();
        int selectedRow = tblStudentsInfo.getSelectedRow();
       
        lblNumber.setText(RecordTable.getValueAt(selectedRow, 0).toString());
        lblModuleName1.setText(RecordTable.getValueAt(selectedRow, 8).toString());
        txtMark1.setText(RecordTable.getValueAt(selectedRow, 9).toString());
        lblModuleName2.setText(RecordTable.getValueAt(selectedRow, 10).toString());
        txtMark2.setText(RecordTable.getValueAt(selectedRow, 11).toString());
        
     
    }//GEN-LAST:event_tblStudentsInfoMouseClicked

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        
        mSubmitMarks();
        show_StudentsProfiles();
           
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void txtMark2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMark2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMark2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAchievements;
    private javax.swing.JLabel lblMark2;
    private javax.swing.JLabel lblModule1;
    private javax.swing.JLabel lblModule2;
    private javax.swing.JLabel lblModuleName1;
    private javax.swing.JLabel lblModuleName2;
    private javax.swing.JLabel lblNumber;
    private javax.swing.JLabel lblStudentID;
    private javax.swing.JLabel lblmark1;
    private javax.swing.JTable tblStudentsInfo;
    private javax.swing.JTextField txtMark1;
    private javax.swing.JTextField txtMark2;
    // End of variables declaration//GEN-END:variables
}
