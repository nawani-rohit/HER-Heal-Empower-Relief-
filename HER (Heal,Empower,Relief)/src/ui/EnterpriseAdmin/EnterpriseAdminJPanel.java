/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.EnterpriseAdmin;

import business.EcoSystem;
import business.Enterprise.Enterprise;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author rohit
 */
public class EnterpriseAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form EnterpriseAdminJPanel
     */
    JPanel userProcessContainer;
    Enterprise enterprise;
    EcoSystem system;
   
    public EnterpriseAdminJPanel(JPanel userProcessContainer, Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.system = system;
        jSplitPane2.setDividerSize(0);
        jSplitPane2.setDividerLocation(120);
        txtFieldEnterpriseName1.setText(enterprise.getEnterpriseType().getValue());
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
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel2 = new javax.swing.JPanel();
        btnManageEmployeeAccess = new javax.swing.JButton();
        btnManageEmployee = new javax.swing.JButton();
        btnManageOrg = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jSplitPane2 = new javax.swing.JSplitPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtFieldEnterpriseName1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel2.setForeground(new java.awt.Color(51, 102, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnManageEmployeeAccess.setBackground(new java.awt.Color(0, 0, 0));
        btnManageEmployeeAccess.setFont(new java.awt.Font("Monaco", 1, 18)); // NOI18N
        btnManageEmployeeAccess.setForeground(new java.awt.Color(255, 255, 255));
        btnManageEmployeeAccess.setText("Manage User");
        btnManageEmployeeAccess.setBorderPainted(false);
        btnManageEmployeeAccess.setContentAreaFilled(false);
        btnManageEmployeeAccess.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnManageEmployeeAccessMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnManageEmployeeAccessMouseExited(evt);
            }
        });
        btnManageEmployeeAccess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEmployeeAccessActionPerformed(evt);
            }
        });
        jPanel2.add(btnManageEmployeeAccess, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        btnManageEmployee.setBackground(new java.awt.Color(0, 0, 0));
        btnManageEmployee.setFont(new java.awt.Font("Monaco", 1, 18)); // NOI18N
        btnManageEmployee.setForeground(new java.awt.Color(255, 255, 255));
        btnManageEmployee.setText("Manage Employee");
        btnManageEmployee.setBorderPainted(false);
        btnManageEmployee.setContentAreaFilled(false);
        btnManageEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnManageEmployeeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnManageEmployeeMouseExited(evt);
            }
        });
        btnManageEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEmployeeActionPerformed(evt);
            }
        });
        jPanel2.add(btnManageEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        btnManageOrg.setBackground(new java.awt.Color(0, 0, 0));
        btnManageOrg.setFont(new java.awt.Font("Monaco", 1, 18)); // NOI18N
        btnManageOrg.setForeground(new java.awt.Color(255, 255, 255));
        btnManageOrg.setText("Manage Organizations");
        btnManageOrg.setBorderPainted(false);
        btnManageOrg.setContentAreaFilled(false);
        btnManageOrg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnManageOrgMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnManageOrgMouseExited(evt);
            }
        });
        btnManageOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageOrgActionPerformed(evt);
            }
        });
        jPanel2.add(btnManageOrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jSplitPane1.setTopComponent(jPanel2);

        jPanel3.setBackground(new java.awt.Color(59, 63, 66));

        jSplitPane2.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        jSplitPane2.setOpaque(false);

        jPanel5.setMinimumSize(new java.awt.Dimension(200, 50));
        jPanel5.setPreferredSize(new java.awt.Dimension(522, 80));

        jLabel3.setFont(new java.awt.Font("Monaco", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 204));
        jLabel3.setText("Enterprise ");

        txtFieldEnterpriseName1.setEditable(false);
        txtFieldEnterpriseName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldEnterpriseName1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Monaco", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 204));
        jLabel4.setText("Enterprise Admin");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(txtFieldEnterpriseName1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(jLabel4)))
                .addContainerGap(219, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFieldEnterpriseName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(19, 19, 19))
        );

        jSplitPane2.setLeftComponent(jPanel5);

        jPanel4.setPreferredSize(new java.awt.Dimension(703, 578));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 762, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 287, Short.MAX_VALUE)
        );

        jSplitPane2.setRightComponent(jPanel4);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jSplitPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 762, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jSplitPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jSplitPane1.setRightComponent(jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1056, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageOrgMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManageOrgMouseExited
        btnManageOrg.setForeground(Color.white);        // TODO add your handling code here:
    }//GEN-LAST:event_btnManageOrgMouseExited

    private void btnManageOrgMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManageOrgMouseEntered
//        btnManageOrg.setForeground(Color.black);        // TODO add your handling code here:
    }//GEN-LAST:event_btnManageOrgMouseEntered

    private void btnManageOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageOrgActionPerformed
        ManageOrganizationsJPanel manageorganizationsJPanel=new ManageOrganizationsJPanel(userProcessContainer,enterprise, system,enterprise.getOrganizationDirectory());
        jSplitPane2.setBottomComponent(manageorganizationsJPanel);
    }//GEN-LAST:event_btnManageOrgActionPerformed

    private void btnManageEmployeeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManageEmployeeMouseExited
        btnManageEmployee.setForeground(Color.white);        // TODO add your handling code here:
    }//GEN-LAST:event_btnManageEmployeeMouseExited

    private void btnManageEmployeeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManageEmployeeMouseEntered
//        btnManageEmployee.setForeground(Color.black);        // TODO add your handling code here:
    }//GEN-LAST:event_btnManageEmployeeMouseEntered

    private void btnManageEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEmployeeActionPerformed
        ManageEmployeeJPanel manageemployeeJPanel=new ManageEmployeeJPanel(userProcessContainer,enterprise, system,enterprise.getOrganizationDirectory());
        jSplitPane2.setBottomComponent(manageemployeeJPanel);
    }//GEN-LAST:event_btnManageEmployeeActionPerformed

    private void txtFieldEnterpriseName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldEnterpriseName1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldEnterpriseName1ActionPerformed

    private void btnManageEmployeeAccessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEmployeeAccessActionPerformed
        ManageUserJPanel manageuserJPanel=new ManageUserJPanel(userProcessContainer,enterprise, system);
        jSplitPane2.setBottomComponent(manageuserJPanel);
    }//GEN-LAST:event_btnManageEmployeeAccessActionPerformed

    private void btnManageEmployeeAccessMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManageEmployeeAccessMouseExited
        btnManageEmployeeAccess.setForeground(Color.white);        // TODO add your handling code here:
    }//GEN-LAST:event_btnManageEmployeeAccessMouseExited

    private void btnManageEmployeeAccessMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManageEmployeeAccessMouseEntered
        //        btnManageEmployeeAccess.setForeground(Color.black);        // TODO add your handling code here:
    }//GEN-LAST:event_btnManageEmployeeAccessMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageEmployee;
    private javax.swing.JButton btnManageEmployeeAccess;
    private javax.swing.JButton btnManageOrg;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JTextField txtFieldEnterpriseName1;
    // End of variables declaration//GEN-END:variables
}
