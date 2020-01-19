package com.product;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Shipment implements Iterable<Product>{

    private final List<Product> products = new ArrayList<>();
    private final static int PRODUCT_NOT_PRESENT = -1;
    private final static int SIZE_SPLIT = 22;
    private List<Product> lightVan = new ArrayList<>();
    private List<Product> heavyVan = new ArrayList<>();
    @Override
    public Iterator<Product> iterator() {
        return new Iterator<Product>() {
            int index = 0;
            @Override
            public boolean hasNext() {
                return index < products.size();
            }

            @Override
            public Product next() {
                Product p = products.get(index);
                index++;
                return p;
            }
        };
    }

    public void add (Product product) {
        products.add(product);
    }

    public void replace(Product oldProduct, Product newProduct) {
        int index = products.indexOf(oldProduct);
        if (index != PRODUCT_NOT_PRESENT) {
            products.add(index,newProduct);
        }
    }

    public void prepare() {
        products.sort(Product::compareTo);
        int index = findSplit();
        if (index != -1) {
            lightVan = products.subList(0,index);
            heavyVan = products.subList(index, products.size());
        }
    }

    private int findSplit() {
        int index = -1;
        for (int x = 0; x < products.size();x++) {
            if (SIZE_SPLIT < products.get(x).getWeight()) {
                index = x;
                break;
            }
        }
        return index;
    }

    public void getVan() {
        System.out.println("LIGHT OBJECTS");
        for (Product product : lightVan) {
            System.out.println(product.getName() + product.getWeight());
        }
        System.out.println("HEAVY OBJECTS");
        for (Product product : heavyVan) {
            System.out.println(product.getName() + product.getWeight());
        }

    }


}
