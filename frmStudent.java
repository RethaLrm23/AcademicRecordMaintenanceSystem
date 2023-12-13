/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package academicrecordmaintenancesystem;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Lerum
 */

public class frmStudent extends javax.swing.JFrame {

    // Variables
    public static frmStudent Instance; 
    public JLabel lbl;
    private JFrame frame;
    Color DefaultColor, ClickedColor;
    
    /**
     * Creates new form frmRegistrarClerk
     */
    
    public frmStudent() {
        initComponents();
        
        // Set Form To Full Screen Automatically
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        // Panel Defualt Colur 
        DefaultColor = new Color(0,0,0);
        
        // Panel Colour When Clicked
        ClickedColor = new Color(204,204,204);
        
        // Panels All Set To Default Colour When System Starts
        pnlMyProfile.setBackground(DefaultColor);
        pnlUpdateProfile.setBackground(DefaultColor);
        pnlLogOut.setBackground(DefaultColor);
        
        // Instance Assignment
        Instance = this;
        
        // Converting Private Variable To Public Variable
        lbl = lblStudName;
        
    }
    
    // Beginning Of The mLogout Method
    private void mLogout(){
        
        frame = new JFrame("Logout");
        
        if(JOptionPane.showConfirmDialog(frame, "Are You Sure You Want To Logout?", "LRM College", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
            
            // Display Form
            frmLoginPage menu = new frmLoginPage();
            menu.show();
            dispose();
            
        }
        
    }
    // End Of The mLogout Method
    
    // Beginning Of The mViewStudentDetail Method
    public void mViewStudentDetial(){
        
        try {
            
            // Variables and Assignment
            String m = frmMyProfile.Instance.lblSU.getText();
            Statement st;
            ResultSet rs;
            
            // Establish A Connection To The MySQL Server
            String url = "jdbc:mysql://localhost/students_information";
            String username = "root";
            String password = "Password";
            Connection conn = DriverManager.getConnection(url, username, password);

            st = conn.createStatement();
            rs = st.executeQuery("Select * from students_profiles where username = '"+ m +"'");
          
            if(rs.next()){
                
                frmMyProfile.Instance.lblSID.setText(rs.getString(1));
                frmMyProfile.Instance.lblSN.setText(rs.getString(2));
                frmMyProfile.Instance.lblSS.setText(rs.getString(3));
                frmMyProfile.Instance.lblSG.setText(rs.getString(4));
                frmMyProfile.Instance.lblSE.setText(rs.getString(5));
                frmMyProfile.Instance.lblSP.setText(rs.getString(6));
                frmMyProfile.Instance.lblSU.setText(rs.getString(7));
                frmMyProfile.Instance.lblSPa.setText(rs.getString(8));
                frmMyProfile.Instance.lblSMo1.setText(rs.getString(9));
                frmMyProfile.Instance.lblSMa1.setText(rs.getString(10));
                frmMyProfile.Instance.lblSMo2.setText(rs.getString(11));
                frmMyProfile.Instance.lblSMa2.setText(rs.getString(12));
                
            }

        } 
        catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
            
        }

    }
    // End Of The mViewStudentDetail Method
    
    // Beginning Of The mDisplayStudentDetial Method
    public void mDisplayStudentDetial(){
        
        try {
            
            // Variables and Assignment
            String m = frmEdit.Instance.txtSU.getText();
            Statement st;
            ResultSet rs;
            
            // Establish A Connection To The MySQL Server
            String url = "jdbc:mysql://localhost/students_information";
            String username = "root";
            String password = "Password";
            Connection conn = DriverManager.getConnection(url, username, password);

            st = conn.createStatement();
            rs = st.executeQuery("Select * from students_profiles where username = '"+ m +"'");
          
            if(rs.next()){
                
                frmEdit.Instance.lblStudID.setText(rs.getString(1));
                frmEdit.Instance.txtSN.setText(rs.getString(2));
                frmEdit.Instance.txtSS.setText(rs.getString(3));
                frmEdit.Instance.txtSG.setText(rs.getString(4));
                frmEdit.Instance.txtSE.setText(rs.getString(5));
                frmEdit.Instance.txtSP.setText(rs.getString(6));
                frmEdit.Instance.txtSU.setText(rs.getString(7));
                frmEdit.Instance.txtSPa.setText(rs.getString(8));
                frmEdit.Instance.txtSMo1.setText(rs.getString(9));
                frmEdit.Instance.txtSMa1.setText(rs.getString(10));
                frmEdit.Instance.txtSMo2.setText(rs.getString(11));
                frmEdit.Instance.txtSMa2.setText(rs.getString(12));
                  
            }
            
        } 
        catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
            
        }

    }
    // End Of The mDisplayStudentDetial Method
 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnlHeader = new javax.swing.JPanel();
        lblDashboard = new javax.swing.JLabel();
        lblStudName = new javax.swing.JLabel();
        pnlMenu = new javax.swing.JPanel();
        pnlLogOut = new javax.swing.JPanel();
        lblLogOut = new javax.swing.JLabel();
        pnlMyProfile = new javax.swing.JPanel();
        lblMyProfile = new javax.swing.JLabel();
        pnlUpdateProfile = new javax.swing.JPanel();
        lblUpdateProfile = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pnlMain = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LRM College");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        pnlHeader.setBackground(new java.awt.Color(0, 0, 0));
        pnlHeader.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblDashboard.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        lblDashboard.setForeground(new java.awt.Color(255, 255, 255));
        lblDashboard.setText("DASHBOARD");

        lblStudName.setFont(new java.awt.Font("Arial Black", 3, 14)); // NOI18N
        lblStudName.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlHeaderLayout = new javax.swing.GroupLayout(pnlHeader);
        pnlHeader.setLayout(pnlHeaderLayout);
        pnlHeaderLayout.setHorizontalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStudName, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlHeaderLayout.setVerticalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblStudName, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlMenu.setBackground(new java.awt.Color(0, 0, 0));
        pnlMenu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        pnlLogOut.setBackground(new java.awt.Color(0, 0, 0));
        pnlLogOut.setPreferredSize(new java.awt.Dimension(200, 40));
        pnlLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlLogOutMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlLogOutMousePressed(evt);
            }
        });

        lblLogOut.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblLogOut.setForeground(new java.awt.Color(255, 255, 255));
        lblLogOut.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogOut.setText("LOGOUT");

        javax.swing.GroupLayout pnlLogOutLayout = new javax.swing.GroupLayout(pnlLogOut);
        pnlLogOut.setLayout(pnlLogOutLayout);
        pnlLogOutLayout.setHorizontalGroup(
            pnlLogOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLogOutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlLogOutLayout.setVerticalGroup(
            pnlLogOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLogOutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogOut, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlMyProfile.setBackground(new java.awt.Color(0, 0, 0));
        pnlMyProfile.setPreferredSize(new java.awt.Dimension(200, 40));
        pnlMyProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlMyProfileMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlMyProfileMousePressed(evt);
            }
        });

        lblMyProfile.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblMyProfile.setForeground(new java.awt.Color(255, 255, 255));
        lblMyProfile.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMyProfile.setText("MY PROFILE");

        javax.swing.GroupLayout pnlMyProfileLayout = new javax.swing.GroupLayout(pnlMyProfile);
        pnlMyProfile.setLayout(pnlMyProfileLayout);
        pnlMyProfileLayout.setHorizontalGroup(
            pnlMyProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMyProfileLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMyProfile, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlMyProfileLayout.setVerticalGroup(
            pnlMyProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMyProfileLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMyProfile, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlUpdateProfile.setBackground(new java.awt.Color(0, 0, 0));
        pnlUpdateProfile.setPreferredSize(new java.awt.Dimension(200, 40));
        pnlUpdateProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlUpdateProfileMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlUpdateProfileMousePressed(evt);
            }
        });

        lblUpdateProfile.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblUpdateProfile.setForeground(new java.awt.Color(255, 255, 255));
        lblUpdateProfile.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUpdateProfile.setText("UPDATE PROFILE");

        javax.swing.GroupLayout pnlUpdateProfileLayout = new javax.swing.GroupLayout(pnlUpdateProfile);
        pnlUpdateProfile.setLayout(pnlUpdateProfileLayout);
        pnlUpdateProfileLayout.setHorizontalGroup(
            pnlUpdateProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUpdateProfileLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUpdateProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlUpdateProfileLayout.setVerticalGroup(
            pnlUpdateProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUpdateProfileLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUpdateProfile, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/academicrecordmaintenancesystem/School Logo.png"))); // NOI18N

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMenuLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlMenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlLogOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlUpdateProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pnlMenuLayout.createSequentialGroup()
                                .addComponent(pnlMyProfile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addComponent(pnlMyProfile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlUpdateProfile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        pnlMain.setBackground(new java.awt.Color(204, 204, 204));
        pnlMain.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlMain.setPreferredSize(new java.awt.Dimension(1660, 950));

        javax.swing.GroupLayout pnlMainLayout = new javax.swing.GroupLayout(pnlMain);
        pnlMain.setLayout(pnlMainLayout);
        pnlMainLayout.setHorizontalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 898, Short.MAX_VALUE)
        );
        pnlMainLayout.setVerticalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 535, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, 902, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pnlHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE))
                    .addComponent(pnlMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pnlMyProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlMyProfileMouseClicked
        
        // Display Form
        frmMyProfile menu = new frmMyProfile();
        pnlMain.removeAll();
        pnlMain.add(menu).setVisible(true);
        
        frmMyProfile.Instance.lblSU.setText(lbl.getText());
        
        // Calling Method
        mViewStudentDetial();
        
    }//GEN-LAST:event_pnlMyProfileMouseClicked

    private void pnlMyProfileMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlMyProfileMousePressed
                
        // Change The Colour Of pnlCreateProfile
        pnlMyProfile.setBackground(ClickedColor);
        pnlUpdateProfile.setBackground(DefaultColor);
        pnlLogOut.setBackground(DefaultColor);
        
    }//GEN-LAST:event_pnlMyProfileMousePressed

    private void pnlUpdateProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlUpdateProfileMouseClicked
              
        // Display Form
        frmEdit menu = new frmEdit();
        pnlMain.removeAll();
        pnlMain.add(menu).setVisible(true);
        
        frmEdit.Instance.txtSU.setText(lbl.getText());
        
        // Calling Method
        mDisplayStudentDetial();
        
    }//GEN-LAST:event_pnlUpdateProfileMouseClicked

    private void pnlUpdateProfileMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlUpdateProfileMousePressed
                
        // Change The Colour Of pnlEditProfiles
        pnlMyProfile.setBackground(DefaultColor);
        pnlUpdateProfile.setBackground(ClickedColor);
        pnlLogOut.setBackground(DefaultColor);
        
    }//GEN-LAST:event_pnlUpdateProfileMousePressed

    private void pnlLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlLogOutMouseClicked
        
        // Calling Method
        mLogout();
        
    }//GEN-LAST:event_pnlLogOutMouseClicked

    private void pnlLogOutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlLogOutMousePressed
                
        // Change The Colour Of pnlLogOut
        pnlMyProfile.setBackground(DefaultColor);
        pnlUpdateProfile.setBackground(DefaultColor);
        pnlLogOut.setBackground(ClickedColor);
        
    }//GEN-LAST:event_pnlLogOutMousePressed

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
            java.util.logging.Logger.getLogger(frmRegistrarClerk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRegistrarClerk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRegistrarClerk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRegistrarClerk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDashboard;
    private javax.swing.JLabel lblLogOut;
    private javax.swing.JLabel lblMyProfile;
    private javax.swing.JLabel lblStudName;
    private javax.swing.JLabel lblUpdateProfile;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlLogOut;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlMyProfile;
    private javax.swing.JPanel pnlUpdateProfile;
    // End of variables declaration//GEN-END:variables
}
