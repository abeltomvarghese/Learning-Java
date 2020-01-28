package com.Maps;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class NaiveProductLookupTable implements ProductLookupTable{
    List<Product> products = new ArrayList<>();
    public void addProduct(final Product productToAdd) throws Exception{
        for (Product p : products) {
            if (p.getId() == productToAdd.getId()) {
                throw new IllegalArgumentException("Unable to add product, duplicate id for " + productToAdd);
            }
        }
        products.add(productToAdd);
    }

    public Product lookupById(final int id) {
        Product returnedProduct = null;
        for (Product p : products) {
            if (p.getId() == id) {
                returnedProduct = p;
            }
        }

        return returnedProduct;
    }

    public void clear() {
        products.clear();
    }
}
