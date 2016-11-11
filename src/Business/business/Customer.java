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
public class Customer extends Person {

    private static int count = 1000;
    private int customerid;
    private int customertotalqty;
    private int custcontact; 

    

    public int getCustcontact() {
        return custcontact;
    }

    public void setCustcontact(int custcontact) {
        this.custcontact = custcontact;
    }


   public void Customer(){
       
   }
    

    public int getCustomertotalqty() {
        return customertotalqty;
    }

    public void setCustomertotalqty(int customertotalqty) {
        this.customertotalqty = customertotalqty;
    }

   

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Customer.count = count;
    }

    public int getCustomerid() {
        return customerid;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

    public Customer() {
        customerid = count++;
         
    }
 @Override
    public String toString(){
        return this.getFirstname();
    }
}
