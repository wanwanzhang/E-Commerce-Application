/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.business;

import java.util.ArrayList;

/**
 *
 * @author Wanwan Zhang
 */
public class CustomerCatalog {
     private ArrayList<Customer> Customerlist;

    public ArrayList<Customer> getCustomerlist() {
        return Customerlist;
    }

    public void setCustomerlist(ArrayList<Customer> Customerlist) {
        this.Customerlist = Customerlist;
    }
    
    public CustomerCatalog(){
        Customerlist = new ArrayList<>();
        
    }
     public Customer addCustomer(){
        Customer c = new Customer();
        Customerlist.add(c);
        return c;
    }
    public void deleteCustomer(Customer c){
        Customerlist.remove(c);
    }
}
