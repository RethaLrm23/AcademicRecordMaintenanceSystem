/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */

package academicrecordmaintenancesystem;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Lerum
 */

public class frmViewProfiles extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmNewProfile
     */
    
    public frmViewProfiles() {
        initComponents();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        /*
        if(txtSearch.getText().equals("")){
            tblStudentsInfo.setModel(new DefaultTableModel(null, new String[]{"id", "name", "surname", "gender","email", "phone", "username", "pass", "module_1", "mark_1", "module_2", "mark_2"}));
            show_StudentsProfiles(); 
            mSearch();
        }
        */
        
        mSearch();

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
    
    // Delete Selected table Row
    public void mDeleteRow(){
        
        java.sql.Connection conMySQLConnectionString= null;
        String URL = "jdbc:mysql://localhost:3306/students_information";
        String User = "root";
        String Password = "Password";
       
        try {
            
            conMySQLConnectionString = DriverManager.getConnection(URL,User,Password);
            Statement myStatement = conMySQLConnectionString.createStatement();
            
            int row = tblStudentsInfo.getSelectedRow();
            String cell = tblStudentsInfo.getModel().getValueAt(row, 0).toString();
            
            String sqlinsert = "DELETE FROM `students_profiles` WHERE ID = " + cell;
            
            myStatement.executeUpdate(sqlinsert);
            myStatement.close();
            
            show_StudentsProfiles();
            
            JOptionPane.showMessageDialog(null, "Deleted Sucessfully!");

        } 
        catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
        
        }    
    }
    
    // Print Table
    public void mPrint(){
        
        try{
            
            boolean print = tblStudentsInfo.print();
            
            if(!print){
                
                JOptionPane.showMessageDialog(null, "Unable to print");
                
            }
            
        }catch(Exception ex){
            
            JOptionPane.showMessageDialog(null, ex.getMessage());
            
        }
        
    }
    
    // Search For Specific Data In Table
    public void mSearch(){
                
        DefaultTableModel ob = (DefaultTableModel)tblStudentsInfo.getModel();
        
        TableRowSorter<DefaultTableModel> obj = new TableRowSorter<>(ob);
        
        tblStudentsInfo.setRowSorter(obj);
        obj.setRowFilter(RowFilter.regexFilter(txtSearch.getText()));
        
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
        lblViewProfiles = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStudentsInfo = new javax.swing.JTable();
        btnView = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1660, 950));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setPreferredSize(new java.awt.Dimension(1660, 950));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        lblViewProfiles.setBackground(new java.awt.Color(153, 153, 153));
        lblViewProfiles.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        lblViewProfiles.setForeground(new java.awt.Color(255, 255, 255));
        lblViewProfiles.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblViewProfiles.setText("View Profiles");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblViewProfiles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblViewProfiles)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblStudentsInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
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
        jScrollPane1.setViewportView(tblStudentsInfo);

        btnView.setBackground(new java.awt.Color(0, 0, 0));
        btnView.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnView.setForeground(new java.awt.Color(255, 255, 255));
        btnView.setText("VIEW");
        btnView.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnView.setMaximumSize(new java.awt.Dimension(88, 38));
        btnView.setMinimumSize(new java.awt.Dimension(88, 38));
        btnView.setPreferredSize(new java.awt.Dimension(88, 38));
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(0, 0, 0));
        btnDelete.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("DELETE");
        btnDelete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDelete.setMaximumSize(new java.awt.Dimension(88, 38));
        btnDelete.setMinimumSize(new java.awt.Dimension(88, 38));
        btnDelete.setPreferredSize(new java.awt.Dimension(88, 38));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnPrint.setBackground(new java.awt.Color(0, 0, 0));
        btnPrint.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnPrint.setForeground(new java.awt.Color(255, 255, 255));
        btnPrint.setText("PRINT");
        btnPrint.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPrint.setMaximumSize(new java.awt.Dimension(88, 38));
        btnPrint.setMinimumSize(new java.awt.Dimension(88, 38));
        btnPrint.setPreferredSize(new java.awt.Dimension(88, 38));
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Search Here");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(663, 663, 663)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 420, Short.MAX_VALUE)
                .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103)
                .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(369, 369, 369))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(193, Short.MAX_VALUE))
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

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        
        show_StudentsProfiles();
        
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        
        mDeleteRow();
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        
        mPrint();       
       
    }//GEN-LAST:event_btnPrintActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        /*
        if(txtSearch.getText().equals("")){
            tblStudentsInfo.setModel(new DefaultTableModel(null, new String[]{"id", "name", "surname", "gender","email", "phone", "username", "pass", "module_1", "mark_1", "module_2", "mark_2"}));
            show_StudentsProfiles();  
        }
        */
        mSearch();

    }//GEN-LAST:event_txtSearchKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblViewProfiles;
    private javax.swing.JTable tblStudentsInfo;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
