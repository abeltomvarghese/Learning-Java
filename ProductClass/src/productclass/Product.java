/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productclass;
import java.util.ArrayList;
/**
 *
 * @author PAZHOOR
 */
public class Product {
    private String pName; 
    private double pPrice;
    ArrayList<Product> stock;
    public Product(String name) {
        pName = name;
        pPrice = 0;
        stock = new ArrayList<>();
        
    
    }
    public void setPrice(double price) {
        pPrice = price;
    }
    public double getPrice() {
        return pPrice;
    }
    public void addStock(Product P) {
        stock.add(P);
        addIT();
    
    }
    public void addIT(){
       // stock.add();
       Product dairy;
       stock.add(dairy = new Product("Cheese"));
       
       
    }
    public void displayStock() {
        for (Product item : stock) {
            System.out.println("Product Name: " + item.pName + "     Price: " + item.pPrice);
        }
    }
}
