/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.login;



import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.UserAccount.UserAccount;
import Business.business.Customer;
import Business.business.Order;
import Business.business.OrderItem;
import Business.business.Product;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.SercurityServiceRole.ProcessCustomerRequestJPanel;
import userinterface.business.ViewProductJPanel;
import userinterface.business.PaymentJPanel;

/**
 *
 * @author Wanwan Zhang
 */
public class CustomerBrowseJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;

    private UserAccount userAccount;
    private Order order;
    private boolean isCheckedOut;
  

    /**
     * Creates new form CustomerMakeOrderJPanel
     */
    public CustomerBrowseJPanel(JPanel userProcessContainer, EcoSystem business, UserAccount userAccount) {
        initComponents();
        this.business = business;
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
     

        Customer currentcustomer = (Customer) userAccount.getPerson();

        boolean isCheckedOut = false;
        txtcustomername.setText(currentcustomer.getFirstname());

        populateTable();

        if (!isCheckedOut) {
            order = new Order();
        }
    }

    public void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) tbproductCatalog.getModel();
        dtm.setRowCount(0);
        try {
            for (Product p : business.getProductcatalog().getProductcatalog()) {
                Object row[] = new Object[4];
                row[0] = p;
                row[1] = p.getProductid();

                row[2] = p.getListprice();
                row[3] = p.getAvail();

                dtm.addRow(row);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Unable to display user account details");
        }
    }

    private void refreshProductTable(String keyWord) {
        int rowCount = tbproductCatalog.getRowCount();
        DefaultTableModel model = (DefaultTableModel) tbproductCatalog.getModel();
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }

        for (Product p : business.getProductcatalog().getProductcatalog()) {
            if (keyWord.equals(p.getProductname())) {
                Object row[] = new Object[4];
                row[0] = p;
                row[1] = p.getProductid();
                row[2] =  p.getListprice();
                row[3] = p.getAvail();
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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        txtSalesPrice = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        orderTable = new javax.swing.JTable();
        viewProdjButton2 = new javax.swing.JButton();
        addtoCartButton6 = new javax.swing.JButton();
        quantitySpinner = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        txtSearchKeyWord = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbproductCatalog = new javax.swing.JTable();
        btnSearchProduct = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtNewQuantity = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnViewOrderItem = new javax.swing.JButton();
        btnModifyQuantity = new javax.swing.JButton();
        btnRemoveOrderItem = new javax.swing.JButton();
        btnsubmintorder = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtcustomername = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("The Price I want ");

        jLabel7.setText("Item in cart");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Product Catalog");

        orderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Name", "Price", "Quantity", "Total Amount", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(orderTable);

        viewProdjButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        viewProdjButton2.setText("View Product Detail");
        viewProdjButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewProdjButton2ActionPerformed(evt);
            }
        });

        addtoCartButton6.setText("ADD TO CART");
        addtoCartButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addtoCartButton6ActionPerformed(evt);
            }
        });

        quantitySpinner.setModel(new javax.swing.SpinnerNumberModel());

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Quantity:");

        tbproductCatalog.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tbproductCatalog.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Product Id", "Price", "Avail"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbproductCatalog);

        btnSearchProduct.setText("Search Product By Name");
        btnSearchProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchProductActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Welcome to Make Orders");

        btnBack.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnViewOrderItem.setText("View Item");
        btnViewOrderItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewOrderItemActionPerformed(evt);
            }
        });

        btnModifyQuantity.setText("Modify Quantity");
        btnModifyQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyQuantityActionPerformed(evt);
            }
        });

        btnRemoveOrderItem.setText("Remove");
        btnRemoveOrderItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveOrderItemActionPerformed(evt);
            }
        });

        btnsubmintorder.setText("Check Out");
        btnsubmintorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubmintorderActionPerformed(evt);
            }
        });

        jLabel3.setText("User Name");

        jButton1.setText("Customer Service ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Make A Payment");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtcustomername, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(96, 96, 96)
                                .addComponent(jLabel1))
                            .addComponent(jLabel7))
                        .addGap(0, 427, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtSearchKeyWord, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSearchProduct))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(viewProdjButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(txtSalesPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(quantitySpinner)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addtoCartButton6))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnViewOrderItem)
                                        .addGap(27, 27, 27)
                                        .addComponent(btnRemoveOrderItem))
                                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnModifyQuantity)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtNewQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(68, 68, 68)
                                        .addComponent(btnsubmintorder)))))
                        .addGap(58, 58, 58))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(52, 52, 52)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 991, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(57, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtcustomername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSearchProduct)
                        .addComponent(txtSearchKeyWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addtoCartButton6)
                    .addComponent(jLabel6)
                    .addComponent(txtSalesPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(quantitySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewProdjButton2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnsubmintorder)
                            .addComponent(btnModifyQuantity)
                            .addComponent(txtNewQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addGap(71, 71, 71))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 242, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnViewOrderItem)
                            .addComponent(btnRemoveOrderItem))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBack)
                        .addGap(82, 82, 82))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(375, 375, 375)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(168, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewProdjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewProdjButton2ActionPerformed
        // TODO add your handling code here:
        int row = tbproductCatalog.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(null, "You didn't select any rows from the table!");
            return;
        }
        Product p = (Product) tbproductCatalog.getValueAt(row, 0);
        ViewProductJPanel vpdjp = new ViewProductJPanel(userProcessContainer, p);
        userProcessContainer.add("ViewProductJPanel", vpdjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewProdjButton2ActionPerformed

    private void addtoCartButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addtoCartButton6ActionPerformed
        // TODO add your handling code here:

        // TODO add your handling code here:
        int selectedRow = tbproductCatalog.getSelectedRow();
        Product selectedProduct;
        int salesPrice = 0;
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Select a row", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            selectedProduct = (Product) tbproductCatalog.getValueAt(selectedRow, 0);
        }

        try {
            salesPrice = Integer.parseInt(txtSalesPrice.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Enter valid sales price", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (salesPrice > selectedProduct.getListprice()) {
            JOptionPane.showMessageDialog(this, "Your Price is above our price", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int fetchedQty = (Integer) quantitySpinner.getValue();
        if (fetchedQty <= 0) {
            JOptionPane.showMessageDialog(this, "Selected atlest 1 quantity", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        } else if (fetchedQty <= selectedProduct.getAvail()) {
            boolean alreadyPresent = false;
            for (OrderItem orderItem : order.getOrderlist()) {
                if (orderItem.getProduct() == selectedProduct) {
                    int oldAvail = selectedProduct.getAvail();
                    int newAvail = oldAvail - fetchedQty;
                    selectedProduct.setAvail(newAvail);
                    orderItem.setQuantity(fetchedQty + orderItem.getQuantity());
                    alreadyPresent = true;
                    refreshOrderTable();
                    populateTable();
                    break;
                }
            }

            if (!alreadyPresent) {
                int oldAvail = selectedProduct.getAvail();
                int newAvail = oldAvail - fetchedQty;
                selectedProduct.setAvail(newAvail);
                order.addOrderItem(selectedProduct, fetchedQty, salesPrice);
                refreshOrderTable();
                populateTable();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Quantity > Availability!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
       
    }//GEN-LAST:event_addtoCartButton6ActionPerformed

    private void btnSearchProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchProductActionPerformed
        String keyWord = txtSearchKeyWord.getText();
        refreshProductTable(keyWord);
    }//GEN-LAST:event_btnSearchProductActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        if (order.getOrderlist().size() > 0) {
            ArrayList<OrderItem> orderList = order.getOrderlist();
            for (OrderItem orderItem : orderList) {
                Product p = orderItem.getProduct();
                p.setAvail(orderItem.getQuantity() + p.getAvail());
            }
            order.getOrderlist().removeAll(orderList);
        }
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnViewOrderItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewOrderItemActionPerformed
        int selectedRowCount = orderTable.getSelectedRowCount();
        if (selectedRowCount <= 0) {
            JOptionPane.showMessageDialog(null, "You didn't select any rows from the orderItem table!");
            return;
        }

        int row = orderTable.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(null, "Failed to retrive selected row");
            return;
        }
        OrderItem oi = (OrderItem) orderTable.getValueAt(row, 0);
        ViewOrderItemDetailJPanel voidjp = new ViewOrderItemDetailJPanel(userProcessContainer, oi);
        userProcessContainer.add("ViewOrderItemDetailJPanel", voidjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewOrderItemActionPerformed

    private void btnModifyQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyQuantityActionPerformed
        // TODO add your handling code here:
        int selectedRow = orderTable.getSelectedRow();
        //Product selectedProduct;
        //int salesPrice=0;
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Select a row", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (!txtNewQuantity.getText().isEmpty() && !txtNewQuantity.getText().equals("0")) {
            OrderItem orderItem = (OrderItem) orderTable.getValueAt(selectedRow, 0);
            int currentAvail = orderItem.getProduct().getAvail();
            int oldQty = orderItem.getQuantity();
            int newQty = Integer.parseInt(txtNewQuantity.getText());
            if (newQty > (currentAvail + oldQty)) {
                JOptionPane.showMessageDialog(null, "Quantity is more than the availability");
                //return;
            } else {
                if (newQty <= 0) {
                    JOptionPane.showMessageDialog(null, "Invalid qty");
                    return;
                }
                orderItem.setQuantity(newQty);
                orderItem.getProduct().setAvail(currentAvail + (oldQty - newQty));
                refreshOrderTable();
                populateTable();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Quantity cannot be zero!!");
        }
    }//GEN-LAST:event_btnModifyQuantityActionPerformed

    private void btnRemoveOrderItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveOrderItemActionPerformed
        int selectedRowCount = orderTable.getSelectedRowCount();
        if (selectedRowCount <= 0) {
            JOptionPane.showMessageDialog(null, "You didn't select any rows from the orderItem table!");
            return;
        }

        int row = orderTable.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(null, "Failed to retrive selected row");
            return;
        }

        OrderItem oi = (OrderItem) orderTable.getValueAt(row, 0);
        int oldQuantity = oi.getProduct().getAvail();
        int orderQuantity = oi.getQuantity();
        int newQuantity = oldQuantity + orderQuantity;
        oi.getProduct().setAvail(newQuantity);
        order.getOrderlist().remove(oi);
        JOptionPane.showMessageDialog(null, "The order item of " + orderQuantity + "of " + oi + " has been removed.");
        refreshOrderTable();
        populateTable();
    }//GEN-LAST:event_btnRemoveOrderItemActionPerformed

    private void btnsubmintorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubmintorderActionPerformed
        // TODO add your handling code here:

        Customer currentcustomer = (Customer) userAccount.getPerson();
        if (order.getOrderlist().size() > 0) {

            business.getMasterordercatalog().addOrder(order);
            isCheckedOut = true;
            //most important !!!!let the order follow the customer
            order.setCust(currentcustomer);
            order.setPaystatus("WaitingPayment");
            for (OrderItem oi : order.getOrderlist()){
                oi.setPaystatus("WaitingPayment");
            }
  
            JOptionPane.showMessageDialog(null, "Order submitted ssuccessfully!!");

        } else {
            JOptionPane.showMessageDialog(null, "Order not submitted as there are no items!!");
        }
    }//GEN-LAST:event_btnsubmintorderActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        Customer currentcustomer = (Customer) userAccount.getPerson();
        CustomerServiceJPanel csjp = new CustomerServiceJPanel(userProcessContainer, currentcustomer, userAccount, business );
        userProcessContainer.add("CustomerServiceJPanel", csjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
          Customer currentcustomer = (Customer) userAccount.getPerson();
         PaymentJPanel paymentJPanel = new PaymentJPanel(userProcessContainer, currentcustomer,order,userAccount, business );
        userProcessContainer.add("PaymentJPanel", paymentJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed

    public void refreshOrderTable() {
        int rowCount = orderTable.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            ((DefaultTableModel) orderTable.getModel()).removeRow(i);
        }

        for (OrderItem oi : order.getOrderlist()) {
            if (oi.getCustomerprice()!=oi.getProduct().getListprice()){
                oi.setStatus("Pending");
            }else { oi.setStatus("Deal");}
            Object row[] = new Object[5];
            row[0] = oi;
            row[1] = oi.getCustomerprice();
            row[2] = oi.getQuantity();
            row[3] = oi.getCustomerprice() * oi.getQuantity();
            row[4] = oi.getStatus();

            ((DefaultTableModel) orderTable.getModel()).addRow(row);
            
            
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addtoCartButton6;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnModifyQuantity;
    private javax.swing.JButton btnRemoveOrderItem;
    private javax.swing.JButton btnSearchProduct;
    private javax.swing.JButton btnViewOrderItem;
    private javax.swing.JButton btnsubmintorder;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable orderTable;
    private javax.swing.JSpinner quantitySpinner;
    private javax.swing.JTable tbproductCatalog;
    private javax.swing.JTextField txtNewQuantity;
    private javax.swing.JTextField txtSalesPrice;
    private javax.swing.JTextField txtSearchKeyWord;
    private javax.swing.JTextField txtcustomername;
    private javax.swing.JButton viewProdjButton2;
    // End of variables declaration//GEN-END:variables
}