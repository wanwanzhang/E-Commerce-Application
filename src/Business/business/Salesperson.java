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
public class Salesperson extends Person {

    private static int count = 1000;
    private int salespersonid;   
    private String orgnization;
    private double totalcommission=0;
    private int totalqty=0;
    private int totalaboveqty=0;
    private int totalbelowqty=0;    


    



    public double getTotalcommission() {
        return totalcommission;
    }

    public void setTotalcommission(double totalcommission) {
        this.totalcommission = totalcommission;
    }

    public int getTotalqty() {
        return totalqty;
    }

    public void setTotalqty(int totalqty) {
        this.totalqty = totalqty;
    }

    public int getTotalaboveqty() {
        return totalaboveqty;
    }

    public void setTotalaboveqty(int totalaboveqty) {
        this.totalaboveqty = totalaboveqty;
    }

    public int getTotalbelowqty() {
        return totalbelowqty;
    }

    public void setTotalbelowqty(int totalbelowqty) {
        this.totalbelowqty = totalbelowqty;
    }



    public Salesperson() {
        salespersonid = count++;
        
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Salesperson.count = count;
    }

    public int getSalespersonid() {
        return salespersonid;
    }

    public void setSalespersonid(int salespersonid) {
        this.salespersonid = salespersonid;
    }

    public String getOrgnization() {
        return orgnization;
    }

    public void setOrgnization(String orgnization) {
        this.orgnization = orgnization;
    }

    @Override
    public String toString() {
        return this.getFirstname();
    }
}
