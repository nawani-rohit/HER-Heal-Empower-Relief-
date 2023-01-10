/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.PhysicalExaminationCenter;

import business.EcoSystem;
import business.Enterprise.Enterprise;
import business.Network.Network;
import business.Organization.MRIScanCenterOrganization;
import business.Organization.Organization;
import business.Organization.RehabCenterOrganization;
import business.UserAccount.UserAccount;
import business.WorkQueue.CaseReporterWorkRequest;
import business.WorkQueue.LabAssistantWorkRequest;
import business.WorkQueue.RehabCounselorWorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Jyothi
 */
public class CaseReportDJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CaseReportDPanel
     */
    JPanel userProcessContainer;
    EcoSystem system;
    CaseReporterWorkRequest request;
    UserAccount userAccount;
    Network network;
    Enterprise enterprise;
    Organization organization;

    public CaseReportDJPanel(JPanel userProcessContainer, EcoSystem system, CaseReporterWorkRequest request,UserAccount userAccount, Network network,Enterprise enterprise, Organization organization) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.request = request;
        this.userAccount = userAccount;
        this.network = network;
        this.enterprise = enterprise;
        this.organization = organization;
        PopulateReport();
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
        namesurvivorjLabel = new javax.swing.JLabel();
        relationjLabel = new javax.swing.JLabel();
        typejLabel = new javax.swing.JLabel();
        locationjLabel = new javax.swing.JLabel();
        timejLabel = new javax.swing.JLabel();
        detailsjLabel = new javax.swing.JLabel();
        suspecttypejLabel = new javax.swing.JLabel();
        namesuspectjLabel = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(59, 63, 66));

        jPanel2.setBackground(new java.awt.Color(59, 63, 66));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        namesurvivorjLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        namesurvivorjLabel.setForeground(new java.awt.Color(255, 255, 255));
        namesurvivorjLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        namesurvivorjLabel.setText("Name of Survivor : ");

        relationjLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        relationjLabel.setForeground(new java.awt.Color(255, 255, 255));
        relationjLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        relationjLabel.setText("Relation with Survivor : ");

        typejLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        typejLabel.setForeground(new java.awt.Color(255, 255, 255));
        typejLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        typejLabel.setText("Severity of burns : ");

        locationjLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        locationjLabel.setForeground(new java.awt.Color(255, 255, 255));
        locationjLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        locationjLabel.setText("Location of Incident :");

        timejLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        timejLabel.setForeground(new java.awt.Color(255, 255, 255));
        timejLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        timejLabel.setText("Date of Incident :");

        detailsjLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        detailsjLabel.setForeground(new java.awt.Color(255, 255, 255));
        detailsjLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        detailsjLabel.setText("More Details : ");

        suspecttypejLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        suspecttypejLabel.setForeground(new java.awt.Color(255, 255, 255));
        suspecttypejLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        suspecttypejLabel.setText("Suspect :");

        namesuspectjLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        namesuspectjLabel.setForeground(new java.awt.Color(255, 255, 255));
        namesuspectjLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        namesuspectjLabel.setText("Name of Suspect : ");

        jTextField1.setEditable(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setEditable(false);

        jTextField3.setEditable(false);

        jTextField4.setEditable(false);

        jTextField5.setEditable(false);
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jTextField6.setEditable(false);
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jTextField7.setEditable(false);

        jTextField8.setEditable(false);

        jButton1.setBackground(new java.awt.Color(255, 204, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Request Lab Test");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 204, 204));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("View Lab Test");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 204, 204));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Send Medical Report");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 204, 204));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton5.setText("Back");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton5MouseExited(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(typejLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(relationjLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(locationjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(timejLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(detailsjLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(suspecttypejLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(namesuspectjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(namesurvivorjLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField4)
                            .addComponent(jTextField7)
                            .addComponent(jTextField3)
                            .addComponent(jTextField8)
                            .addComponent(jTextField2)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField5)
                            .addComponent(jTextField6)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(30, 30, 30)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namesurvivorjLabel)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(relationjLabel))
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(typejLabel)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(locationjLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timejLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(detailsjLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(suspecttypejLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namesuspectjLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 77, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(117, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        jButton1.setForeground(new Color(0,128,128));        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        jButton1.setForeground(Color.black);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        LabAssistantWorkRequest labrequest = new LabAssistantWorkRequest();
        labrequest.setDoctorWorkRequest(request.getDoctorWorkRequest());
        request.getDoctorWorkRequest().setLabAssistanceWorkRequest(labrequest);
        labrequest.setSender(userAccount);
        labrequest.setStatus("Waiting");
        if (userAccount==null){
            System.out.println("userAccount is not set");
        }

        Enterprise e= network.getEnterpriseDirectory().searchEnterprisebyType(Enterprise.EnterpriseType.MedicalServices);
        Organization org = null;
        for (Organization organization : e.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof MRIScanCenterOrganization){
                org = organization;
                break;
            }
        }
        if (org!=null){
            org.getWorkQueue().getLabAssistanceWorkRequest().add(labrequest);
            //userAccount.getWorkQueue().getHelpSeekerworkRequestList().add(request);
            if(userAccount.getWrkQue().getLabAssistanceWorkRequest()==null){
                System.out.println("True");
            }
            userAccount.getWrkQue().getLabAssistanceWorkRequest().add(labrequest);
        }

        RequestLabTestJPanel requestLabTestJPanel = new RequestLabTestJPanel(userProcessContainer,system,labrequest,userAccount,network);
        userProcessContainer.add("caseReportJPanel", requestLabTestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

        //JOptionPane.showMessageDialog(null, "Request submitted to Forensic Department.");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        jButton3.setForeground(new Color(0,128,128));        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
        jButton3.setForeground(Color.black);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3MouseExited

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        //System.out.println("Status "+request.getDoctorWorkRequest().getLabAssistanceWorkRequest().getStatus());
        if(request.getDoctorWorkRequest().getLabAssistanceWorkRequest().getStatus().equalsIgnoreCase("Waiting")){
            JOptionPane.showMessageDialog(this, "Requested has not been acccepted yet.");
        }else{
            LabTestResultsJPanel requestLabTestJPanel = new LabTestResultsJPanel(userProcessContainer,system,request.getDoctorWorkRequest().getLabAssistanceWorkRequest());
            userProcessContainer.add("caseReportJPanel", requestLabTestJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);}
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        jButton2.setForeground(new Color(0,128,128));        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        jButton2.setForeground(Color.black);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        RehabCounselorWorkRequest prequest = new RehabCounselorWorkRequest();
        prequest.setDoctorWorkRequest(request.getDoctorWorkRequest());
        request.getDoctorWorkRequest().setRehabCounselorWorkRequest(prequest);
        prequest.setSender(userAccount);
        prequest.setStatus("Waiting");
        if (userAccount==null){
            System.out.println("userAccount is not set");
        }

        Enterprise e= network.getEnterpriseDirectory().searchEnterprisebyType(Enterprise.EnterpriseType.Rehabilitation);
        Organization org = null;
        for (Organization organization : e.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof RehabCenterOrganization){
                org = organization;
                break;
            }
        }
        if (org!=null){
            org.getWorkQueue().getRehabCounselorWorkRequest().add(prequest);
            //userAccount.getWorkQueue().getHelpSeekerworkRequestList().add(request);
            if(userAccount.getWrkQue().getLabAssistanceWorkRequest()==null){
                System.out.println("True");
            }
            userAccount.getWrkQue().getRehabCounselorWorkRequest().add(prequest);
        }

        PrescribeMedicinesJPanel requestLabTestJPanel = new PrescribeMedicinesJPanel(userProcessContainer,system,prequest);
        userProcessContainer.add("caseReportJPanel", requestLabTestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseEntered
        jButton5.setForeground(new Color(0,128,128));        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5MouseEntered

    private void jButton5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseExited
        jButton5.setForeground(Color.black);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5MouseExited

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:

        /*
        RequestDoctorJPanel lencounterJPanel = new RequestDoctorJPanel(userProcessContainer,system,userAccount,DOrganization,network);
        userProcessContainer.add("caseReportJPanel", lencounterJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        //DoctorJPanel sysAdminwjp = (DoctorJPanel) component;
        //sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        */

        DoctorJPanel caseReportJPanel = new DoctorJPanel(userProcessContainer,userAccount,organization,enterprise,system,network);
        userProcessContainer.add("caseReportJPanel", caseReportJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel detailsjLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JLabel locationjLabel;
    private javax.swing.JLabel namesurvivorjLabel;
    private javax.swing.JLabel namesuspectjLabel;
    private javax.swing.JLabel relationjLabel;
    private javax.swing.JLabel suspecttypejLabel;
    private javax.swing.JLabel timejLabel;
    private javax.swing.JLabel typejLabel;
    // End of variables declaration//GEN-END:variables
    private void PopulateReport() {
        jTextField1.setText(request.getChildName());
        jTextField5.setText(request.getRelation());
        jTextField6.setText(request.getAssaultType());
        jTextField4.setText(request.getLocation());
        jTextField7.setText(request.getDoi().toString());
        jTextField3.setText(request.getMoredetails());
        jTextField8.setText(request.getSuspecttype());
        jTextField2.setText(request.getNameofsuspect());


    }
}
