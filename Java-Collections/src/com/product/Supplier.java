package com.product;

import java.util.ArrayList;
import java.util.Collection;

public class Supplier {
    private String name;
    public Collection<Product> products = new ArrayList<>();

    public Supplier(String name) {
        this.name = name;
    }

    public void addItem(Product product) {
        products.add(product);
    }

    public Collection<Product> getProducts() {
        return products;
    }
}
