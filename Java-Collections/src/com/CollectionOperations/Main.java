package com.CollectionOperations;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(ProductList.table);
        products.add(ProductList.wardrobe);
        products.add(ProductList.door);
        products.add(ProductList.sofa);

        System.out.println(products);
        Collections.rotate(products,1);
        System.out.println(products);
        Collections.rotate(products,1);
        System.out.println(products);
        Collections.rotate(products,1);
        System.out.println(products);
        Collections.rotate(products,1);
        System.out.println(products);


        System.out.println("SHUFFLING");
        Collections.shuffle(products);
        System.out.println(products);
        Collections.shuffle(products);
        System.out.println(products);

        System.out.println("SORTING");
        products.sort(Product.BY_WEIGHT);
        System.out.println(products);


    }
}
