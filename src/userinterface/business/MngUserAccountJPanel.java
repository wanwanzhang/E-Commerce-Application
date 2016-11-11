/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.business;


import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Wanwan Zhang
 */
public class MngUserAccountJPanel extends javax.swing.JPanel {
private EcoSystem business;
private JPanel userProcessContainer;
private UserAccountDirectory userAccountDirectory;
    /**
     * Creates new form MngUserAccountJPanel
     */
    public MngUserAccountJPanel(EcoSystem business,JPanel userProcessContainer,UserAccountDirectory userAccountDirectory) {
        initComponents();
        this.business= business;
        this.userProcessContainer=userProcessContainer;
        this.userAccountDirectory=userAccountDirectory;
        refreshTable();
    }

 public void refreshTable()
    {
        try
        {
            DefaultTableModel dtm = (DefaultTableModel) tbuseraccount.getModel();
            dtm.setRowCount(0);
            for(UserAccount ua : userAccountDirectory.getUserAccountList())
            {
                Object row[] = new Object[3];
                row[0] = ua;               
                row[1] = ua.getUsername();
                row[2] = ua.getRole();
                dtm.addRow(row);
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Unable to display user account details");
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tbuseraccount = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnRemove = new javax.swing.JButton();

        tbuseraccount.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Person", "User Name", "Role"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbuseraccount);

        btnBack.setText("<<BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnAdd.setText("Add Account");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Manage User Account");

        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(347, 347, 347)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBack)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRemove)
                                .addGap(45, 45, 45)
                                .addComponent(btnRefresh)
                                .addGap(39, 39, 39)
                                .addComponent(btnAdd))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(248, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnRefresh)
                    .addComponent(btnBack)
                    .addComponent(btnRemove))
                .addContainerGap(230, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        refreshTable();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        CreateSalesUserAccountJPanel createUserAccount = new CreateSalesUserAccountJPanel( business,userAccountDirectory,userProcessContainer);
        userProcessContainer.add("CreateUserAccountJPanel", createUserAccount);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        try
        {
            int selectedRow = tbuseraccount.getSelectedRow();
            if(selectedRow >=0)
            {
                int dialogResult = JOptionPane.showConfirmDialog (null, "Would you like to remove the selected user account?","Warning",JOptionPane.YES_NO_OPTION);
                if(dialogResult == JOptionPane.YES_OPTION)
                {

                    UserAccount ua = (UserAccount) tbuseraccount.getValueAt(selectedRow, 0);

                    if(ua.getRole().equals(UserAccount.CUSTOMER_ROLE)){
                        userAccountDirectory.deleteUserAccount(ua);
                        JOptionPane.showMessageDialog(null, "Customer deleted successfully.");
                        return;
                    }
                    

             userAccountDirectory.deleteUserAccount(ua);
                    refreshTable();
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Please select a user account from the table to delete.");
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Please select a supplier from the table to delete.");
        }
    }//GEN-LAST:event_btnRemoveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnRemove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbuseraccount;
    // End of variables declaration//GEN-END:variables
}