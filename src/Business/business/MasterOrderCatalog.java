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
public class MasterOrderCatalog {
    private ArrayList<Order> masterorderlist;
     public MasterOrderCatalog() {
        masterorderlist = new ArrayList<>();
    }

    public ArrayList<Order> getMasterorderlist() {
        return masterorderlist;
    }

    public void setMasterorderlist(ArrayList<Order> masterorderlist) {
        this.masterorderlist = masterorderlist;
    }
      public Order addOrder(Order o) {
        masterorderlist.add(o);
        return o;
    }
}
