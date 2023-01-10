/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.MainFrame;
import business.DB4OUtil.DB4OUtil;
import business.EcoSystem;
import business.Enterprise.Enterprise;
import business.Enterprise.ASITEnterprise;
import business.Network.Network;
import business.Organization.CaseSupervisorOrganization;
import business.Organization.CaseReporterOrganization;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import business.WorkQueue.CaseReporterWorkRequest;
import javax.swing.JOptionPane;
/**
 *
 * @author Jyothi
 */
public class ReportJFrame extends javax.swing.JFrame {

    /**
     * Creates new form ReportJFrame
     */
    private static EcoSystem system;
      private static Network network;
      static UserAccount userAccount;
     
    public ReportJFrame() {
        initComponents();
        this.system=system;
        this.network=network;
        this.userAccount=userAccount;
       
        this.setSize(1080, 680);
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
        ReportjLabel = new javax.swing.JLabel();
        namesurvivorjLabel = new javax.swing.JLabel();
        relationjLabel = new javax.swing.JLabel();
        typejLabel = new javax.swing.JLabel();
        locationjLabel = new javax.swing.JLabel();
        timejLabel = new javax.swing.JLabel();
        detailsjLabel = new javax.swing.JLabel();
        suspecttypejLabel = new javax.swing.JLabel();
        namesuspectjLabel = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        friendRadioButton = new javax.swing.JRadioButton();
        parentRadioButton = new javax.swing.JRadioButton();
        jTextField2 = new javax.swing.JTextField();
        knownRadioButton = new javax.swing.JRadioButton();
        unknownRadioButton = new javax.swing.JRadioButton();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        Colleagueradiobutton = new javax.swing.JRadioButton();
        otherRadioButton = new javax.swing.JRadioButton();
        ReportjButton = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        ReportjLabel.setBackground(new java.awt.Color(253, 235, 208));
        ReportjLabel.setFont(new java.awt.Font("Monaco", 1, 24)); // NOI18N
        ReportjLabel.setForeground(new java.awt.Color(51, 102, 255));
        ReportjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ReportjLabel.setText("Register Report");
        ReportjLabel.setOpaque(true);

        namesurvivorjLabel.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        namesurvivorjLabel.setText("Name of Survivor: ");

        relationjLabel.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        relationjLabel.setText("Relation with Survivor: ");

        typejLabel.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        typejLabel.setText("Type of Sexual Assault: ");

        locationjLabel.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        locationjLabel.setText("Location of Incident:");
        locationjLabel.setToolTipText("");

        timejLabel.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        timejLabel.setText("Date of Incident:");

        detailsjLabel.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        detailsjLabel.setText("More Details: ");
        detailsjLabel.setToolTipText("");

        suspecttypejLabel.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        suspecttypejLabel.setText("Suspect:");
        suspecttypejLabel.setToolTipText("");

        namesuspectjLabel.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        namesuspectjLabel.setText("Name of Suspect : ");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        friendRadioButton.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        friendRadioButton.setText("Friend");

        parentRadioButton.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        parentRadioButton.setText("Parent");
        parentRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parentRadioButtonActionPerformed(evt);
            }
        });

        knownRadioButton.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        knownRadioButton.setText("Known");
        knownRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                knownRadioButtonActionPerformed(evt);
            }
        });

        unknownRadioButton.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        unknownRadioButton.setText("Unknown");

        Colleagueradiobutton.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        Colleagueradiobutton.setText("Self");

        otherRadioButton.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        otherRadioButton.setText("Other");

        ReportjButton.setBackground(new java.awt.Color(255, 0, 51));
        ReportjButton.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        ReportjButton.setText("Report");
        ReportjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReportjButtonActionPerformed(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select one", "Rape", "Marital Rape", "Child Sexual Abuse", "Unwanted Sexual Touching", "Incest" }));

        jLabel1.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        jLabel1.setText("Email:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(175, Short.MAX_VALUE)
                .addComponent(ReportjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(188, 188, 188))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(namesurvivorjLabel)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(friendRadioButton)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(parentRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(53, 53, 53)
                                        .addComponent(Colleagueradiobutton)
                                        .addGap(53, 53, 53)
                                        .addComponent(otherRadioButton)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(typejLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(relationjLabel)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(timejLabel)
                                    .addComponent(locationjLabel))
                                .addGap(30, 30, 30)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(suspecttypejLabel)
                                        .addGap(30, 30, 30))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(detailsjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(namesuspectjLabel)
                                        .addGap(18, 18, 18)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(knownRadioButton)
                                        .addGap(18, 18, 18)
                                        .addComponent(unknownRadioButton))
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ReportjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(64, 64, 64)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(ReportjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namesurvivorjLabel)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(relationjLabel)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(friendRadioButton)
                            .addComponent(parentRadioButton)
                            .addComponent(Colleagueradiobutton)
                            .addComponent(otherRadioButton))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(typejLabel)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(locationjLabel))
                        .addGap(26, 26, 26)
                        .addComponent(timejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(detailsjLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(knownRadioButton)
                    .addComponent(unknownRadioButton)
                    .addComponent(suspecttypejLabel))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namesuspectjLabel))
                .addGap(30, 30, 30)
                .addComponent(ReportjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void parentRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parentRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_parentRadioButtonActionPerformed

    private void knownRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_knownRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_knownRadioButtonActionPerformed

    private void ReportjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReportjButtonActionPerformed

        CaseReporterWorkRequest request = new CaseReporterWorkRequest();
        request.setStatus("Waiting");
        request.setSender(userAccount);

        request.setChildName(jTextField1.getText());
        //for choosing relations

        String em=jTextField5.getText();
        String validate="^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        if(1==0)
        {
            JOptionPane.showMessageDialog(null, "Please enter valid email");
            return;
        }
        request.setEmail(em);
        if(friendRadioButton.isSelected()){
            request.setRelation("Friend");
        }
        else if(parentRadioButton.isSelected()){
            request.setRelation("Parent");
        }
        else if(Colleagueradiobutton.isSelected()){
            request.setRelation("Self");
        }
        else if(otherRadioButton.isSelected()){
            request.setRelation("Other");
        }
        else{
            JOptionPane.showMessageDialog(null, "Please select a relation");

        }
        //for choosing type
        if(jComboBox1.getSelectedItem().toString().equalsIgnoreCase("Select one"))
        {
            JOptionPane.showMessageDialog(null, "Please select a type");
        }
        else{
            request.setAssaultType(jComboBox1.getSelectedItem().toString());
        }
        //location
        request.setLocation(jTextField4.getText());
        //date
        if(jDateChooser1.getDate()==null)
        {
            JOptionPane.showMessageDialog(null, "Please select a date");
        }else{
            request.setDoi(jDateChooser1.getDate());
        }
        //more detaisl
        request.setMoredetails(jTextField3.getText());
        //suspect
        if(knownRadioButton.isSelected()){
            request.setSuspecttype("Known");
        }
        else if(unknownRadioButton.isSelected()){
            request.setSuspecttype("Unknown");
        }else{
            JOptionPane.showMessageDialog(null, "Please select a suspect type");
        }

        //name of suspect
        request.setNameofsuspect(jTextField2.getText());

        if(request.getDoi()!=null && request.getLocation()!=null && request.getRelation()!=null && request.getSuspecttype()!=null
            && request.getChildName()!=null && request.getAssaultType()!=null){

            Enterprise e=network.getEnterpriseDirectory().searchEnterprisebyType(Enterprise.EnterpriseType.ASIT);
            Organization org = null;
            for (Organization organization : e.getOrganizationDirectory().getOrganizationList()){
                if (organization instanceof CaseReporterOrganization){
                    org = organization;
                    break;
                }
            }
            if (org!=null){

                org.getWorkQueue().getCaseReporterWorkRequestList().add(request);
                userAccount.getWrkQue().getCaseReporterWorkRequestList().add(request);

            }

            this.dispose();
            SignInJFrame eng = new SignInJFrame();
            eng.setVisible(true);

        }
    }//GEN-LAST:event_ReportjButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ReportJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReportJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReportJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReportJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReportJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Colleagueradiobutton;
    private javax.swing.JButton ReportjButton;
    private javax.swing.JLabel ReportjLabel;
    private javax.swing.JLabel detailsjLabel;
    private javax.swing.JRadioButton friendRadioButton;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JRadioButton knownRadioButton;
    private javax.swing.JLabel locationjLabel;
    private javax.swing.JLabel namesurvivorjLabel;
    private javax.swing.JLabel namesuspectjLabel;
    private javax.swing.JRadioButton otherRadioButton;
    private javax.swing.JRadioButton parentRadioButton;
    private javax.swing.JLabel relationjLabel;
    private javax.swing.JLabel suspecttypejLabel;
    private javax.swing.JLabel timejLabel;
    private javax.swing.JLabel typejLabel;
    private javax.swing.JRadioButton unknownRadioButton;
    // End of variables declaration//GEN-END:variables
}
