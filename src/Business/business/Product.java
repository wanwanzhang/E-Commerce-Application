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
public class Product {
    private String productname;
    private static int count=1000;
    private int productid;
    private double floorprice;
    private double targetprice;
    private double listprice;

    public double getListprice() {
        return listprice;
    }

    public void setListprice(double listprice) {
        this.listprice = listprice;
    }
    
    private int avail;
    private double ceilingprice;
    private int originalavail;

    public int getOriginalavail() {
        return originalavail;
    }

    public void setOriginalavail(int originalavail) {
        this.originalavail = originalavail;
    }
    
    public Product (){
        productid = ++count;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Product.count = count;
    }

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public double getFloorprice() {
        return floorprice;
    }

    public void setFloorprice(double floorprice) {
        this.floorprice = floorprice;
    }

    public double getTargetprice() {
        return targetprice;
    }

    public void setTargetprice(double targetprice) {
        this.targetprice = targetprice;
    }


    public int getAvail() {
        return avail;
    }

    public void setAvail(int avail) {
        this.avail = avail;
    }

    public double getCeilingprice() {
        return ceilingprice;
    }

    public void setCeilingprice(double ceilingprice) {
        this.ceilingprice = ceilingprice;
    }


    @Override
    public String toString(){
        return productname;
    }
}
