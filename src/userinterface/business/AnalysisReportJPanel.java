/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.business;


import Business.EcoSystem;
import Business.business.Customer;
import Business.business.Order;
import Business.business.OrderItem;
import Business.business.Product;
import Business.business.Salesperson;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Wanwan Zhang
 */
public class AnalysisReportJPanel extends javax.swing.JPanel {
        private EcoSystem business;
        private JPanel userProcessContainer;
    /**
     * Creates new form AnalysisReportJPanel
     */
    public AnalysisReportJPanel(EcoSystem business,JPanel userProcessContainer) {
        initComponents();
        this.business= business;
        this.userProcessContainer= userProcessContainer;
        
        //int totalqty =0;
        //double commission=0;
     /*   int aqty=0;
        int bqty= 0 ;
        
        for(Salesperson sp : business.getSalespersonlist().getsalespersonlist()){
            for(Order o : business.getMasterordercatalog().getMasterorderlist()){
                if(sp.getSalespersonid()==o.getSp().getSalespersonid()){
                    //if(sp.getOrder().getOrdernumber()==o.getOrdernumber()){
                        for(OrderItem oi : o.getOrderlist()){
                            if(oi.getStatus().equals("Deal")){
                                 if(oi.getCustomerprice()>oi.getProduct().getTargetprice()){
                                aqty = aqty +oi.getQuantity();
                                sp.setTotalaboveqty(aqty);
                                
                            //}
                            }
                        }
                    }
                }
            }
        }
          for(Salesperson sp : business.getSalespersonlist().getsalespersonlist()){
            for(Order o : business.getMasterordercatalog().getMasterorderlist()){
                if(sp.getSalespersonid()==o.getSp().getSalespersonid()){
                    //if(sp.getOrder().get==o.getOrdernumber()){
                        for(OrderItem oi : o.getOrderlist()){
                            if(oi.getStatus().equals("Deal")){
                                 if(oi.getCustomerprice()<oi.getProduct().getTargetprice()){
                                bqty = bqty + oi.getQuantity();
                                sp.setTotalbelowqty(bqty);
                                
                            //}
                                                         
                            }
                        }
                    }
                }
            }
        }*/
       /* for(Salesperson sp : business.getSalespersonlist().getsalespersonlist()){
            for(Order o : business.getMasterordercatalog().getMasterorderlist()){
                if(sp.getSalespersonid()==o.getSp().getSalespersonid()){
                    //if(sp.getSalespersonorderid()==o.getOrdernumber()){
                        for(OrderItem oi : o.getOrderlist()){
                            if(oi.getStatus().equals("Deal")){
                            totalqty=totalqty+oi.getQuantity();
                            commission = commission + oi.getCommission();
                            sp.setTotalqty(totalqty);
                            sp.setTotalcommission(commission);
                           
                            
                        //}
                    }
                }
            }
        }
        }*/
    }
public void populateTable(){
    DefaultTableModel dtm = (DefaultTableModel) tbar.getModel();
        dtm.setRowCount(0);
        try {
            for (Salesperson sp : business.getSalespersonlist().getsalespersonlist()) {
                Object row[] = new Object[5];
                row[0] = sp;
                row[1] = sp.getSalespersonid();               
                row[2] = sp.getTotalaboveqty();
                row[3] = sp.getTotalbelowqty();
                row[4] = sp.getTotalcommission();
                dtm.addRow(row);
            }
        } catch (Exception e) {
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
        tbar = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtqty = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        txtbc = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtqty1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtbp = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        tbar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SalespersonName", "SalespersonID", "AboveTargetQTY", "BelowTargetQTY", "TotalCommssion"
            }
        ));
        jScrollPane1.setViewportView(tbar);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Sales Persons sales quantity Analysis ");

        jButton1.setText("TOP 3 Salespersons");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("The most popular product");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("The best customer");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setText("CustomerID");

        jLabel3.setText("TotalQTY");

        jLabel4.setText("ProductName");

        jLabel5.setText("TotalQTY");

        jButton4.setText("Analysis Price Qty");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton1)
                                .addComponent(jScrollPane1)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton2))
                                        .addComponent(jButton5))
                                    .addGap(65, 65, 65)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(40, 40, 40)
                                            .addComponent(txtbc, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(64, 64, 64)
                                            .addComponent(jLabel3)
                                            .addGap(50, 50, 50)
                                            .addComponent(txtqty, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addGap(40, 40, 40)
                                            .addComponent(txtbp, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(64, 64, 64)
                                            .addComponent(jLabel5)
                                            .addGap(50, 50, 50)
                                            .addComponent(txtqty1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addContainerGap(327, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addGap(21, 21, 21)
                .addComponent(jButton1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(txtqty1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(txtqty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(36, 36, 36)
                .addComponent(jButton5)
                .addContainerGap(138, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        Customer bestcust = new Customer();
        int maxbc = 0;
        for (Customer c : business.getCustomercatalog().getCustomerlist()) {
            int qty = 0;
            for (Order o : business.getMasterordercatalog().getMasterorderlist()) {
                if (c.getCustomerid() == o.getCust().getCustomerid()) {
                    for (OrderItem oi : o.getOrderlist()) {
                        if (oi.getStatus().equals("Deal")) {
                            qty = qty + oi.getQuantity();
                        }

                    }
                }
            }

            if (qty > maxbc) {
                maxbc = qty;
                bestcust = c;
            }

        }

        txtbc.setText(String.valueOf(bestcust.getCustomerid()));
        txtqty.setText(String.valueOf(maxbc));
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        ArrayList<Integer> myList = new ArrayList<>();

        for(Salesperson sp : business.getSalespersonlist().getsalespersonlist()){
            int tqty = (int) (sp.getTotalqty());
            myList.add(tqty);
        }

        Collections.sort(myList,Collections.reverseOrder());

        for (int i = 0; i < 3; ++i) {
            int a = myList.get(i);

            for(Salesperson sp : business.getSalespersonlist().getsalespersonlist()){
                if(a==sp.getTotalqty()){
                    dataset.setValue(a, "TotalqtyBySalesperson", String.valueOf(sp.getSalespersonid()));
                }else{

                }
            }
        }

        JFreeChart chart= ChartFactory.createBarChart("Quantity","Salesperson Quantity", "Quantity", dataset, PlotOrientation.VERTICAL, false, true, false);
        CategoryPlot p=chart.getCategoryPlot();
        p.setRangeGridlinePaint(Color.blue);
        ChartFrame frame = new ChartFrame("TOP3", chart);
        frame.setVisible(true);
        frame.setSize(1200, 600);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
       Product bestproduct = null;        
 int maxbc = 0 ;
 for (Product p : business.getProductcatalog().getProductcatalog()){
     if (p.getOriginalavail()-p.getAvail()> maxbc) {
                maxbc = p.getOriginalavail()-p.getAvail();
                bestproduct= p;
            }
     txtbp.setText(bestproduct.getProductname());
            txtqty1.setText(String.valueOf(maxbc));

 }
            
            
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
            userProcessContainer.remove(this);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbar;
    private javax.swing.JTextField txtbc;
    private javax.swing.JTextField txtbp;
    private javax.swing.JTextField txtqty;
    private javax.swing.JTextField txtqty1;
    // End of variables declaration//GEN-END:variables
}