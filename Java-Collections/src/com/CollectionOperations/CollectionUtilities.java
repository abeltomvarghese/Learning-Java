package com.CollectionOperations;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class CollectionUtilities {


    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        final Product door = ProductList.door;
        final Product sofa = ProductList.sofa;
        final Product table = ProductList.table;
        final Product wardrobe = ProductList.wardrobe;
        Collections.addAll(products, door, sofa, table, wardrobe);

        final Product p1 = Collections.min(products, Product.BY_NAME);
        final Product p2 = Collections.max(products, Product.BY_WEIGHT);
        System.out.println(p1);
        System.out.println(p2);

    }

}
