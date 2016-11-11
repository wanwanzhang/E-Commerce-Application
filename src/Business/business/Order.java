/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.business;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Wanwan Zhang
 */
public class Order {
    private ArrayList<OrderItem> orderlist;
    private int ordernumber;
    private static int count = 1000;
    private Customer cust;
    private Salesperson sp;
    private double paytotal;
    private Date paytime;
    private String payaccount;
    private String securitynumber;
    private String Accountname;
    private String banklastfour;
private String financialApprovence; 
    private String paystatus; 

    public String getFinancialApprovence() {
        return financialApprovence;
    }

    public void setFinancialApprovence(String financialApprovence) {
        this.financialApprovence = financialApprovence;
    }

    public String getPaystatus() {
        return paystatus;
    }

    public void setPaystatus(String paystatus) {
        this.paystatus = paystatus;
    }

    public String getBanklastfour() {
        return banklastfour;
    }

    public void setBanklastfour(String banklastfour) {
        this.banklastfour = banklastfour;
    }
    
  

    public String getAccountname() {
        return Accountname;
    }

    public void setAccountname(String Accountname) {
        this.Accountname = Accountname;
    }


    public String getPayaccount() {
        return payaccount;
    }

    public void setPayaccount(String payaccount) {
        this.payaccount = payaccount;
    }

    public String getSecuritynumber() {
        return securitynumber;
    }

    public void setSecuritynumber(String securitynumber) {
        this.securitynumber = securitynumber;
    }


   

    public Date getPaytime() {
        return paytime;
    }

    public void setPaytime(Date paytime) {
        this.paytime = paytime;
    }

    public double getPaytotal() {
        return paytotal;
    }

    public void setPaytotal(double paytotal) {
        this.paytotal = paytotal;
    }
       

    public Customer getCust() {
        return cust;
    }

    public void setCust(Customer cust) {
        this.cust = cust;
    }

    public Salesperson getSp() {
        return sp;
    }

    public void setSp(Salesperson sp) {
        this.sp = sp;
    }


    
   
    
    public Order(){
        orderlist = new ArrayList<>();
        ordernumber= ++count;
       
        //cust = new Customer();
        //sp = new Salesperson();
    }

    public ArrayList<OrderItem> getOrderlist() {
        return orderlist;
    }

    public void setOrderlist(ArrayList<OrderItem> orderlist) {
        this.orderlist = orderlist;
    }

    public int getOrdernumber() {
        return ordernumber;
    }

    public void setOrdernumber(int ordernumber) {
        this.ordernumber = ordernumber;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Order.count = count;
    }
      public OrderItem addOrderItem(Product p, int q, int price) {
        OrderItem o = new OrderItem();
        o.setProduct(p);
        o.setQuantity(q);
        o.setCustomerprice(price);
        orderlist.add(o);
        return o;
    }
       public void removeOrderItem(OrderItem o) {
        orderlist.remove(o);
    }
    
}
