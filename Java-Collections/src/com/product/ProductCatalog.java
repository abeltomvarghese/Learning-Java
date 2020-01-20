package com.product;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ProductCatalog implements Iterable<Product>{
    Set<Product> products = new HashSet<>();
    public void isSuppliedBy(Supplier supplier) {
        products.addAll(supplier.getProducts());
    }
    public Iterator<Product> iterator() {return products.iterator();}
}
