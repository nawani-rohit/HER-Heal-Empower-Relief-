/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.CaseVolunteer;

import javax.swing.JPanel; 
import business.EcoSystem;
import business.Network.Network;
import business.Organization.CaseSupervisorOrganization;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import business.WorkQueue.CaseReporterWorkRequest;
import business.WorkQueue.CounselorWorkRequest;
import business.WorkQueue.DrWorkRequest;
import business.WorkQueue.LawyerWorkRequest;
import business.WorkQueue.PsychiatristWorkRequest;
import business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jyothi
 */
public class CaseRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CaseRequestJPanel
     */
    
    JPanel userProcessContainer;
    EcoSystem system;
    Organization organization; 
    UserAccount userAccount;
    Network network; 
    
    public CaseRequestJPanel(JPanel userProcessContainer, EcoSystem system, Organization organization,UserAccount userAccount,Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.organization=(CaseSupervisorOrganization)organization;
        this.userAccount=userAccount;
        this.network = network;
        
        popTable();
        lblReceiver.setVisible(false);
        lblStatus.setVisible(false);
        lblDate.setVisible(false);
        lblDoctor.setVisible(false);
        lblCounsellar.setVisible(false);
        lblLawyer.setVisible(false);
        lblPsychiatrist.setVisible(false);
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
        lblCaseReq = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCaseRequest = new javax.swing.JTable();
        btnAssignRequest = new javax.swing.JButton();
        btnViewCaseReport = new javax.swing.JButton();
        btnCheckStatus = new javax.swing.JButton();
        txtPsyhDate = new javax.swing.JLabel();
        txtLawyerReceiver = new javax.swing.JLabel();
        txtLawyerDate = new javax.swing.JLabel();
        txtCousellarStatus = new javax.swing.JLabel();
        txtCounsellarReceiver = new javax.swing.JLabel();
        txtCounsellarDate = new javax.swing.JLabel();
        lblPsychiatrist = new javax.swing.JLabel();
        lblDoctor = new javax.swing.JLabel();
        lblLawyer = new javax.swing.JLabel();
        txtPsychStatus = new javax.swing.JLabel();
        txtLawyerStatus = new javax.swing.JLabel();
        lblCounsellar = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        lblReceiver = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        txtPsychReceiver = new javax.swing.JLabel();
        txtDocStatus = new javax.swing.JLabel();
        txtDocReceiver = new javax.swing.JLabel();
        txtDoctorDate = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(59, 66, 63));

        lblCaseReq.setFont(new java.awt.Font("Monaco", 1, 18)); // NOI18N
        lblCaseReq.setForeground(new java.awt.Color(255, 204, 204));
        lblCaseReq.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCaseReq.setText("Case Requests");
        lblCaseReq.setToolTipText("");
        lblCaseReq.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        tblCaseRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name ", "Location", "Status", "Assigned To"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCaseRequest);

        btnAssignRequest.setBackground(new java.awt.Color(255, 204, 204));
        btnAssignRequest.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        btnAssignRequest.setForeground(new java.awt.Color(61, 64, 91));
        btnAssignRequest.setText("Assign Request");
        btnAssignRequest.setBorderPainted(false);
        btnAssignRequest.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAssignRequest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAssignRequestMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAssignRequestMouseExited(evt);
            }
        });
        btnAssignRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignRequestActionPerformed(evt);
            }
        });

        btnViewCaseReport.setBackground(new java.awt.Color(255, 204, 204));
        btnViewCaseReport.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        btnViewCaseReport.setForeground(new java.awt.Color(61, 64, 91));
        btnViewCaseReport.setText("View Case Report");
        btnViewCaseReport.setBorderPainted(false);
        btnViewCaseReport.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnViewCaseReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnViewCaseReportMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnViewCaseReportMouseExited(evt);
            }
        });
        btnViewCaseReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewCaseReportActionPerformed(evt);
            }
        });

        btnCheckStatus.setBackground(new java.awt.Color(255, 204, 204));
        btnCheckStatus.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        btnCheckStatus.setForeground(new java.awt.Color(61, 64, 91));
        btnCheckStatus.setText("Check Status");
        btnCheckStatus.setBorderPainted(false);
        btnCheckStatus.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCheckStatus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCheckStatusMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCheckStatusMouseExited(evt);
            }
        });
        btnCheckStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckStatusActionPerformed(evt);
            }
        });

        lblPsychiatrist.setBackground(new java.awt.Color(255, 255, 255));
        lblPsychiatrist.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        lblPsychiatrist.setForeground(new java.awt.Color(255, 255, 255));
        lblPsychiatrist.setText("Psychiatrist");

        lblDoctor.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        lblDoctor.setForeground(new java.awt.Color(255, 255, 255));
        lblDoctor.setText("Doctor");

        lblLawyer.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        lblLawyer.setForeground(new java.awt.Color(255, 255, 255));
        lblLawyer.setText("Lawyer");

        lblCounsellar.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        lblCounsellar.setForeground(new java.awt.Color(255, 255, 255));
        lblCounsellar.setText("Counsellar");

        lblStatus.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        lblStatus.setForeground(new java.awt.Color(255, 255, 255));
        lblStatus.setText("Status:");

        lblReceiver.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        lblReceiver.setForeground(new java.awt.Color(255, 255, 255));
        lblReceiver.setText("Receiver:");

        lblDate.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        lblDate.setForeground(new java.awt.Color(255, 255, 255));
        lblDate.setText("Date:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1005, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblCaseReq, javax.swing.GroupLayout.PREFERRED_SIZE, 879, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnAssignRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnCheckStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnViewCaseReport))
                            .addGap(130, 130, 130)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(368, 368, 368)
                            .addComponent(lblDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(7, 7, 7)
                            .addComponent(lblCounsellar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(47, 47, 47)
                            .addComponent(lblLawyer, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(8, 8, 8)
                            .addComponent(lblPsychiatrist))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(218, 218, 218)
                            .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(txtDoctorDate, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtCounsellarDate, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(22, 22, 22)
                            .addComponent(txtLawyerDate, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(26, 26, 26)
                            .addComponent(txtPsyhDate, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(218, 218, 218)
                            .addComponent(lblReceiver, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(txtDocReceiver, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(23, 23, 23)
                            .addComponent(txtCounsellarReceiver, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(14, 14, 14)
                            .addComponent(txtLawyerReceiver, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(txtPsychReceiver, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(218, 218, 218)
                            .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(txtDocStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(23, 23, 23)
                            .addComponent(txtCousellarStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(14, 14, 14)
                            .addComponent(txtLawyerStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(txtPsychStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 464, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblCaseReq)
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addComponent(btnAssignRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(9, 9, 9)
                            .addComponent(btnCheckStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(8, 8, 8)
                            .addComponent(btnViewCaseReport, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(2, 2, 2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblDoctor)
                        .addComponent(lblCounsellar)
                        .addComponent(lblLawyer)
                        .addComponent(lblPsychiatrist))
                    .addGap(21, 21, 21)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDoctorDate, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCounsellarDate, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtLawyerDate, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtPsyhDate, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(13, 13, 13)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblReceiver, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDocReceiver, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCounsellarReceiver, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtLawyerReceiver, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtPsychReceiver, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(11, 11, 11)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDocStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCousellarStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtLawyerStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtPsychStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignRequestMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAssignRequestMouseEntered
        btnAssignRequest.setForeground(new Color(0,128,128));        // TODO add your handling code here:
    }//GEN-LAST:event_btnAssignRequestMouseEntered

    private void btnAssignRequestMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAssignRequestMouseExited
        btnAssignRequest.setForeground(Color.black);        // TODO add your handling code here:
    }//GEN-LAST:event_btnAssignRequestMouseExited

    private void btnAssignRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignRequestActionPerformed
        try{
        int i=1;
        if(i<5)
        {
            int selectedRow = tblCaseRequest.getSelectedRow();

            if (selectedRow < 0){
                return;
            }

            WorkRequest request = (CaseReporterWorkRequest)tblCaseRequest.getValueAt(selectedRow, 2);
            request.setReceiver(userAccount);
            request.setStatus("Accepted");

            popTable();
            i++;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Only 4 cases can be handled");
        }

        // TODO add your handling code here:
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Please select atleast one row");
        }
    }//GEN-LAST:event_btnAssignRequestActionPerformed

    private void btnViewCaseReportMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewCaseReportMouseEntered
        btnViewCaseReport.setForeground(new Color(0,128,128));        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewCaseReportMouseEntered

    private void btnViewCaseReportMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewCaseReportMouseExited
        btnViewCaseReport.setForeground(Color.black);        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewCaseReportMouseExited

    private void btnViewCaseReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewCaseReportActionPerformed
        // TODO add your handling code here:
        try{
        int selectedRow = tblCaseRequest.getSelectedRow();

        if (selectedRow < 0){
            return;
        }

        CaseReporterWorkRequest request = (CaseReporterWorkRequest)tblCaseRequest.getValueAt(selectedRow, 2);

        if (request.getReceiver()!=userAccount){
            JOptionPane.showMessageDialog(this, "You cannot view the report of the case. Access Denied.");
        }else{

            CaseReportJPanel caseReportJPanel = new CaseReportJPanel(userProcessContainer,system,request,userAccount,network);
            userProcessContainer.add("caseReportJPanel", caseReportJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
            /*CaseReportJPanel casereportJPanel=new CaseReportJPanel(userProcessContainer,system,request);
            casereportJPanel.setVisible(true);*/
        }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Please select atleast one row");
        }
    }//GEN-LAST:event_btnViewCaseReportActionPerformed

    private void btnCheckStatusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCheckStatusMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCheckStatusMouseEntered

    private void btnCheckStatusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCheckStatusMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCheckStatusMouseExited

    private void btnCheckStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckStatusActionPerformed
        // TODO add your handling code here:

        try{
        int selectedRow = tblCaseRequest.getSelectedRow();

        if (selectedRow < 0){
            return;
        }
        if (selectedRow >= 0) {
            lblReceiver.setVisible(true);
            lblStatus.setVisible(true);
            lblDate.setVisible(true);
            lblDoctor.setVisible(true);
            lblCounsellar.setVisible(true);
            lblLawyer.setVisible(true);
            lblPsychiatrist.setVisible(true);
            CaseReporterWorkRequest  CRWorkReq  = (CaseReporterWorkRequest) tblCaseRequest.getValueAt(selectedRow, 2);

            if(CRWorkReq.getDoctorWorkRequest()!=null){
                DrWorkRequest D = CRWorkReq.getDoctorWorkRequest();
                txtDoctorDate.setText(D.getRequestDate().toString());
                if(D.getReceiver()==null){
                    txtDocReceiver.setText("Not Assigned");
                }else{
                    txtDocReceiver.setText(D.getReceiver().toString());
                }
                txtDocStatus.setText(D.getStatus());
            }else{
                txtDoctorDate.setText("-");
                txtDocReceiver.setText("-");
                txtDocStatus.setText("-");
            }

            if(CRWorkReq.getCounselorWorkRequest()!=null){
                CounselorWorkRequest C = CRWorkReq.getCounselorWorkRequest();
                txtCounsellarDate.setText(C.getRequestDate().toString());
                if(C.getReceiver()==null){
                    txtCounsellarReceiver.setText("Not Assigned");
                }else{
                    txtCounsellarReceiver.setText(C.getReceiver().toString());
                }
                txtCousellarStatus.setText(C.getStatus());
            }else{
                txtCounsellarDate.setText("-");
                txtCounsellarReceiver.setText("-");
                txtCousellarStatus.setText("-");
            }

            if(CRWorkReq.getHpWorkRequest()!=null){
                PsychiatristWorkRequest P = CRWorkReq.getHpWorkRequest();
                txtPsyhDate.setText(P.getRequestDate().toString());
                if(P.getReceiver()==null){
                    txtPsychReceiver.setText("Not Assigned");
                }else{
                    txtPsychReceiver.setText(P.getReceiver().toString());
                }
                txtPsychStatus.setText(P.getStatus());
            }else{
                txtPsychStatus.setText("-");
                txtPsyhDate.setText("-");
                txtPsychReceiver.setText("-");
            }

            if(CRWorkReq.getLawyerWorkRequest()!=null){
                LawyerWorkRequest L = CRWorkReq.getLawyerWorkRequest();
                txtLawyerDate.setText(L.getRequestDate().toString());
                if(L.getReceiver()==null){
                    txtLawyerReceiver.setText("Not Assigned");
                }else{
                    txtLawyerReceiver.setText(L.getReceiver().toString());
                }
                txtLawyerStatus.setText(L.getStatus());
            }else{
                txtLawyerDate.setText("-");
                txtLawyerReceiver.setText("-");
                txtLawyerStatus.setText("-");
            }

        }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Please select atleast one row");
        }
    }//GEN-LAST:event_btnCheckStatusActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignRequest;
    private javax.swing.JButton btnCheckStatus;
    private javax.swing.JButton btnViewCaseReport;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCaseReq;
    private javax.swing.JLabel lblCounsellar;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDoctor;
    private javax.swing.JLabel lblLawyer;
    private javax.swing.JLabel lblPsychiatrist;
    private javax.swing.JLabel lblReceiver;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JTable tblCaseRequest;
    private javax.swing.JLabel txtCounsellarDate;
    private javax.swing.JLabel txtCounsellarReceiver;
    private javax.swing.JLabel txtCousellarStatus;
    private javax.swing.JLabel txtDocReceiver;
    private javax.swing.JLabel txtDocStatus;
    private javax.swing.JLabel txtDoctorDate;
    private javax.swing.JLabel txtLawyerDate;
    private javax.swing.JLabel txtLawyerReceiver;
    private javax.swing.JLabel txtLawyerStatus;
    private javax.swing.JLabel txtPsychReceiver;
    private javax.swing.JLabel txtPsychStatus;
    private javax.swing.JLabel txtPsyhDate;
    // End of variables declaration//GEN-END:variables
    private void popTable() {
        
        DefaultTableModel model= (DefaultTableModel) tblCaseRequest.getModel();
        Object[] row=new Object[4];
        model.setRowCount(0);
        
         for(CaseReporterWorkRequest request : organization.getWorkQueue().getCaseReporterWorkRequestList())
         {
         
            row[0] = request.getChildName();
            row[1] = request.getLocation();
            row[2] = request;
            if (request.getReceiver()==null){
                row[3] = "Not Assigned";
            }else{
                row[3] = request.getReceiver();
            }
         
            
            model.addRow(row);
        }
    }

}
