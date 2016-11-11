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
public class ProductCatalog {
    private ArrayList<Product> productcatalog;
    
    public ProductCatalog(){
        productcatalog = new ArrayList<>();
        
    }

    public ArrayList<Product> getProductcatalog() {
        return productcatalog;
    }

    public void setProductcatalog(ArrayList<Product> productcatalog) {
        this.productcatalog = productcatalog;
    }
    public Product addProduct(){
        Product p = new Product();
        productcatalog.add(p);
        return p;
    }
    public void deleteProduct(Product p){
        productcatalog.remove(p);
        
    }
    public Product searchProduct(int key){
        for(Product p : productcatalog){
            if (key == p.getProductid() ){
                return p ;
            }
        }
        return null;
    }
}
