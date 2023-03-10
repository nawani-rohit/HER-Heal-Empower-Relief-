/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.sysadmin;

import java.awt.Color;
import business.EcoSystem;
import business.Enterprise.Enterprise;
import business.Network.Network;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jyothi
 */
public class ManageEnterpriseJPanel extends javax.swing.JPanel {

    
    /**
     * Creates new form ManageEnterpriseJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    
    public ManageEnterpriseJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;

        populateTable();
        populateComboBox();
    }
     private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tableEnterprises.getModel();

        model.setRowCount(0);
        for (Network network : system.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                Object[] row = new Object[3];
                row[0] = enterprise;
                row[1] = network.getNameOfNetwork();
                row[2] = enterprise.getEnterpriseType().getValue();

                model.addRow(row);
            }
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void populateComboBox() {
        comboBoxNetworkName.removeAllItems();
        comboBoxEnterpriseType.removeAllItems();

        for (Network network : system.getNetworkList()) {
            comboBoxNetworkName.addItem(network);
        }

        for (Enterprise.EnterpriseType type : Enterprise.EnterpriseType.values()) {
            if (!type.getValue().equals(Enterprise.EnterpriseType.CaseReporter.getValue())){
                 if (!type.getValue().equals(Enterprise.EnterpriseType.Psychiatrist.getValue())){
                comboBoxEnterpriseType.addItem(type);
            }}
        }

    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblManageEnterprises = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableEnterprises = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        lblNetworkName = new javax.swing.JLabel();
        txtEnterpriseName = new javax.swing.JTextField();
        comboBoxNetworkName = new javax.swing.JComboBox();
        comboBoxEnterpriseType = new javax.swing.JComboBox();
        btnDelete = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblManageEnterprises.setBackground(new java.awt.Color(255, 255, 255));
        lblManageEnterprises.setFont(new java.awt.Font("Monaco", 1, 24)); // NOI18N
        lblManageEnterprises.setForeground(new java.awt.Color(255, 204, 204));
        lblManageEnterprises.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManageEnterprises.setText("Maintain Enterprises");
        add(lblManageEnterprises, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 113, 628, 40));

        tableEnterprises.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Enterprise Name", "City", "Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableEnterprises);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 193, 430, 130));

        jLabel2.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        jLabel2.setText("Enterprise Type:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 235, -1, -1));

        jLabel3.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        jLabel3.setText("City:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 194, -1, -1));

        btnSubmit.setBackground(new java.awt.Color(255, 204, 204));
        btnSubmit.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.setBorderPainted(false);
        btnSubmit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSubmitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSubmitMouseExited(evt);
            }
        });
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 331, 120, -1));

        lblNetworkName.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        lblNetworkName.setText("Name:");
        add(lblNetworkName, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 284, -1, -1));
        add(txtEnterpriseName, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 273, 120, -1));

        comboBoxNetworkName.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBoxNetworkName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxNetworkNameActionPerformed(evt);
            }
        });
        add(comboBoxNetworkName, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 193, 120, -1));

        comboBoxEnterpriseType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBoxEnterpriseType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxEnterpriseTypeActionPerformed(evt);
            }
        });
        add(comboBoxEnterpriseType, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 233, 120, -1));

        btnDelete.setBackground(new java.awt.Color(255, 204, 204));
        btnDelete.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setBorderPainted(false);
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeleteMouseExited(evt);
            }
        });
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 333, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubmitMouseEntered
        btnSubmit.setForeground(new Color(0,128,128));        // TODO add your handling code here:
    }//GEN-LAST:event_btnSubmitMouseEntered

    private void btnSubmitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubmitMouseExited
        btnSubmit.setForeground(Color.black);        // TODO add your handling code here:
    }//GEN-LAST:event_btnSubmitMouseExited

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        if( txtEnterpriseName.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "please enter all mandatory fields");
            return;
        }

        Network network = (Network) comboBoxNetworkName.getSelectedItem();
        Enterprise.EnterpriseType type = (Enterprise.EnterpriseType) comboBoxEnterpriseType.getSelectedItem();

        if (network == null || type == null) {
            JOptionPane.showMessageDialog(null, "Invalid Input!");
            return;
        }

        String name = txtEnterpriseName.getText();

        Enterprise enterprise = network.getEnterpriseDirectory().createAndAddEnterprise(name, type);

        populateTable();
        txtEnterpriseName.setText("");
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void comboBoxNetworkNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxNetworkNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxNetworkNameActionPerformed

    private void comboBoxEnterpriseTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxEnterpriseTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxEnterpriseTypeActionPerformed

    private void btnDeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteMouseEntered

    private void btnDeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteMouseExited

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:

        int selectedRow = tableEnterprises.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row to delete!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{
            Enterprise p = (Enterprise) tableEnterprises.getValueAt(selectedRow, 0);
            for (Network network : system.getNetworkList()) {
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {

                    if(p==enterprise){
                        network.getEnterpriseDirectory().getEnterpriseList().remove(p);
                        break;
                    }

                }
            }
            JOptionPane.showMessageDialog(null, "You have successfully deleted the account");
            populateTable();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox comboBoxEnterpriseType;
    private javax.swing.JComboBox comboBoxNetworkName;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblManageEnterprises;
    private javax.swing.JLabel lblNetworkName;
    private javax.swing.JTable tableEnterprises;
    private javax.swing.JTextField txtEnterpriseName;
    // End of variables declaration//GEN-END:variables
}
