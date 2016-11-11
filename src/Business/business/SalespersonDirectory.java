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
public class SalespersonDirectory {
    private ArrayList<Salesperson> salespersonlist;
    
    public SalespersonDirectory(){
        salespersonlist = new ArrayList<>();
        
    }

    public ArrayList<Salesperson> getsalespersonlist() {
        return salespersonlist;
    }

    public void setsalespersonlist(ArrayList<Salesperson> salespersonlist) {
        this.salespersonlist = salespersonlist;
    }
    public Salesperson addSalesperson(){
        Salesperson sp = new Salesperson();
        salespersonlist.add(sp);
        return sp;
    }
    public void deleteSlesperson(Salesperson sp){
        salespersonlist.remove(sp);
    }
    
}
