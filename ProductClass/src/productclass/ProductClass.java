/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productclass;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author PAZHOOR
 */
public class ProductClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Product cravendale = new Product("milk");
        cravendale.addStock(cravendale);
        cravendale.setPrice(0.89);
        
        cravendale.displayStock();
    }
    
}
