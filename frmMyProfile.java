/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */

package academicrecordmaintenancesystem;

import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.JLabel;

/**
 *
 * @author Lerum
 */

public class frmMyProfile extends javax.swing.JInternalFrame {
    
    // Variables
    public static frmMyProfile Instance; 
    public JLabel lblSID;
    public JLabel lblSN;
    public JLabel lblSS;
    public JLabel lblSG;
    public JLabel lblSE;
    public JLabel lblSP;
    public JLabel lblSU;
    public JLabel lblSPa;
    public JLabel lblSMo1;
    public JLabel lblSMo2;
    public JLabel lblSMa1;
    public JLabel lblSMa2;
    
    /**
     * Creates new form frmNewProfile
     */
    
    public frmMyProfile() {
        initComponents();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null); 
        
        // Instance Assignment
        Instance = this;
        
        // Converting Private Variables To Public Variables
        lblSU = lblStudentUsername;
        lblSID = lblStudentID;
        lblSN = lblStudentName;
        lblSS = lblStudentSurname;
        lblSG = lblStudentGender;
        lblSE = lblStudentEmail;
        lblSP = lblStudentPhone;
        lblSPa = lblStudentPassword;
        lblSMo1 = lblStudentModule1;
        lblSMo2 = lblStudentModule2;
        lblSMa1 = lblStudentMark1;
        lblSMa2 = lblStudentMark2;
        
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
        lblID = new javax.swing.JLabel();
        lblStudentID = new javax.swing.JLabel();
        lblStudentUsername = new javax.swing.JLabel();
        lblStudentGender = new javax.swing.JLabel();
        lblStudentName = new javax.swing.JLabel();
        lblStudentSurname = new javax.swing.JLabel();
        lblStudentPhone = new javax.swing.JLabel();
        lblStudentEmail = new javax.swing.JLabel();
        lblStudentModule1 = new javax.swing.JLabel();
        lblStudentPassword = new javax.swing.JLabel();
        lblStudentModule2 = new javax.swing.JLabel();
        lblStudentMark1 = new javax.swing.JLabel();
        lblStudentMark2 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1660, 950));

        pnlMainCreateProfile.setBackground(new java.awt.Color(204, 204, 204));
        pnlMainCreateProfile.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlMainCreateProfile.setForeground(new java.awt.Color(0, 0, 255));
        pnlMainCreateProfile.setPreferredSize(new java.awt.Dimension(840, 612));

        pnlHeader.setBackground(new java.awt.Color(153, 153, 153));
        pnlHeader.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlHeader.setForeground(new java.awt.Color(255, 255, 255));

        lblCreateProfile.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        lblCreateProfile.setForeground(new java.awt.Color(255, 255, 255));
        lblCreateProfile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCreateProfile.setText("My Profile");

        javax.swing.GroupLayout pnlHeaderLayout = new javax.swing.GroupLayout(pnlHeader);
        pnlHeader.setLayout(pnlHeaderLayout);
        pnlHeaderLayout.setHorizontalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCreateProfile, javax.swing.GroupLayout.DEFAULT_SIZE, 1616, Short.MAX_VALUE)
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
        lblName.setText("Name:");

        lblMark1.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        lblMark1.setText("Mark 1:");

        lblModule1.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        lblModule1.setText("Module 1:");

        lblEmail.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        lblEmail.setText("Email:");

        lblSurname.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        lblSurname.setText("Surname:");

        lblMark2.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        lblMark2.setText("Mark 2:");

        lblGender.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        lblGender.setText("Gender:");

        lblPassword.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        lblPassword.setText("Password:");

        lblUsername.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        lblUsername.setText("Username:");

        lblPhone.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        lblPhone.setText("Phone:");

        lblModule2.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        lblModule2.setText("Module 2:");

        lblID.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        lblID.setText("ID:");

        lblStudentID.setBackground(new java.awt.Color(255, 255, 255));
        lblStudentID.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        lblStudentID.setText("Student ID");
        lblStudentID.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblStudentUsername.setBackground(new java.awt.Color(255, 255, 255));
        lblStudentUsername.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        lblStudentUsername.setText("Student Username");
        lblStudentUsername.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblStudentGender.setBackground(new java.awt.Color(255, 255, 255));
        lblStudentGender.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        lblStudentGender.setText("Student Gender");
        lblStudentGender.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblStudentName.setBackground(new java.awt.Color(255, 255, 255));
        lblStudentName.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        lblStudentName.setText("Student Name");
        lblStudentName.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblStudentSurname.setBackground(new java.awt.Color(255, 255, 255));
        lblStudentSurname.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        lblStudentSurname.setText("Student Surname");
        lblStudentSurname.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblStudentPhone.setBackground(new java.awt.Color(255, 255, 255));
        lblStudentPhone.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        lblStudentPhone.setText("Student Phone");
        lblStudentPhone.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblStudentEmail.setBackground(new java.awt.Color(255, 255, 255));
        lblStudentEmail.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        lblStudentEmail.setText("Student Email");
        lblStudentEmail.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblStudentModule1.setBackground(new java.awt.Color(255, 255, 255));
        lblStudentModule1.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        lblStudentModule1.setText("Student Module 1");
        lblStudentModule1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblStudentPassword.setBackground(new java.awt.Color(255, 255, 255));
        lblStudentPassword.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        lblStudentPassword.setText("Student Password");
        lblStudentPassword.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblStudentModule2.setBackground(new java.awt.Color(255, 255, 255));
        lblStudentModule2.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        lblStudentModule2.setText("Student Module 2");
        lblStudentModule2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblStudentMark1.setBackground(new java.awt.Color(255, 255, 255));
        lblStudentMark1.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        lblStudentMark1.setText("No Mark Available");
        lblStudentMark1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblStudentMark2.setBackground(new java.awt.Color(255, 255, 255));
        lblStudentMark2.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        lblStudentMark2.setText("No Mark Available");
        lblStudentMark2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout pnlMainCreateProfileLayout = new javax.swing.GroupLayout(pnlMainCreateProfile);
        pnlMainCreateProfile.setLayout(pnlMainCreateProfileLayout);
        pnlMainCreateProfileLayout.setHorizontalGroup(
            pnlMainCreateProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainCreateProfileLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainCreateProfileLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlMainCreateProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMainCreateProfileLayout.createSequentialGroup()
                        .addComponent(lblModule2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblStudentModule2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(137, 137, 137)
                        .addComponent(lblMark2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblStudentMark2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlMainCreateProfileLayout.createSequentialGroup()
                        .addComponent(lblModule1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(lblStudentModule1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(136, 136, 136)
                        .addComponent(lblMark1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblStudentMark1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlMainCreateProfileLayout.createSequentialGroup()
                        .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(lblStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlMainCreateProfileLayout.createSequentialGroup()
                        .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(lblStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(134, 134, 134)
                        .addComponent(lblSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(lblStudentSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlMainCreateProfileLayout.createSequentialGroup()
                        .addComponent(lblGender, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblStudentGender, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(134, 134, 134)
                        .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(lblStudentEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlMainCreateProfileLayout.createSequentialGroup()
                        .addComponent(lblPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(lblStudentPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlMainCreateProfileLayout.createSequentialGroup()
                        .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(lblStudentUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(154, 154, 154)
                        .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(lblStudentPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(292, 292, 292))
        );
        pnlMainCreateProfileLayout.setVerticalGroup(
            pnlMainCreateProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainCreateProfileLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(pnlHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(168, 168, 168)
                .addGroup(pnlMainCreateProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblID)
                    .addComponent(lblStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(pnlMainCreateProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblName)
                    .addComponent(lblStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSurname)
                    .addComponent(lblStudentSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(pnlMainCreateProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblGender)
                    .addComponent(lblStudentGender, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail)
                    .addComponent(lblStudentEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(pnlMainCreateProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPhone)
                    .addComponent(lblStudentPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addGroup(pnlMainCreateProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUsername)
                    .addComponent(lblStudentUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPassword)
                    .addComponent(lblStudentPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addGroup(pnlMainCreateProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblModule1)
                    .addComponent(lblStudentModule1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMark1)
                    .addComponent(lblStudentMark1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(pnlMainCreateProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblModule2)
                    .addComponent(lblStudentModule2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMark2)
                    .addComponent(lblStudentMark2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMainCreateProfile, javax.swing.GroupLayout.DEFAULT_SIZE, 1648, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMainCreateProfile, javax.swing.GroupLayout.DEFAULT_SIZE, 914, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel lblCreateProfile;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblMark1;
    private javax.swing.JLabel lblMark2;
    private javax.swing.JLabel lblModule1;
    private javax.swing.JLabel lblModule2;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblStudentEmail;
    private javax.swing.JLabel lblStudentGender;
    private javax.swing.JLabel lblStudentID;
    private javax.swing.JLabel lblStudentMark1;
    private javax.swing.JLabel lblStudentMark2;
    private javax.swing.JLabel lblStudentModule1;
    private javax.swing.JLabel lblStudentModule2;
    private javax.swing.JLabel lblStudentName;
    private javax.swing.JLabel lblStudentPassword;
    private javax.swing.JLabel lblStudentPhone;
    private javax.swing.JLabel lblStudentSurname;
    private javax.swing.JLabel lblStudentUsername;
    private javax.swing.JLabel lblSurname;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlMainCreateProfile;
    // End of variables declaration//GEN-END:variables
}
