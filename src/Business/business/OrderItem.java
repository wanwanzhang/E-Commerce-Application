/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.business;

/**
 *
 * @author Wanwan Zhang
 */
public class OrderItem {
    private int quantity;
    private double  customerprice;
    private Product product;
    private String status;
    private double commission; 

   private String paystatus; 

    public String getPaystatus() {
        return paystatus;
    }

    public void setPaystatus(String paystatus) {
        this.paystatus = paystatus;
    }

  
    

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getCustomerprice() {
        return customerprice;
    }

    public void setCustomerprice(double customerprice) {
        this.customerprice = customerprice;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString(){
        return product.getProductname();
    }
    
}
