package com.company;
import com.product.Product;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        Product door = new Product("Wooden Door", 35);
        Product floorPanel = new Product("Floor Panel", 25);
        Product window = new Product("Glass Window",10);

        Collection<Product> products = new ArrayList<>();
        products.add(door);
        products.add(floorPanel);
        products.add(window);

        ///ONE METHOD
        final Iterator<Product> productIterator = products.iterator();

        while (productIterator.hasNext()) {
            Product product = productIterator.next();
            if (product.getWeight() > 20) {
                System.out.println(product);
            } else {
                productIterator.remove();
            }

        }
        System.out.println(products);

        ///ALTERNATIVE METHOD

        for(Product product:products) {
            System.out.println(product);
        }

        System.out.println(products.size());
        System.out.println(products.isEmpty());

        System.out.println(products.contains(window));
        System.out.println(products.contains(door));

    }
}
