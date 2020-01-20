package com.product;

import java.lang.invoke.MethodHandle;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import static com.product.Product.BY_NAME;
import static com.product.Product.BY_WEIGHT;

public class ProductCatalog implements Iterable<Product>{

    SortedSet<Product> products = new TreeSet<>(BY_WEIGHT);

    public void isSuppliedBy(Supplier supplier) {
        products.addAll(supplier.getProducts());
    }

    public Iterator<Product> iterator() {return products.iterator();}

    public Set<Product> lightVanProducts () {
        Product hLightProduct = getHeavyProduct();
        return products.headSet(hLightProduct);
    }

    public Set<Product> HeavyVanProducts () {
        Product heavyProduct = getHeavyProduct();
        return products.tailSet(heavyProduct);
    }

    private Product getHeavyProduct() {
        Product returnProduct = null;
        int firstFlag = 0;

        for (Product p : products) {
            if (p.getWeight() > 20 && firstFlag == 0) {
                returnProduct = p;
                firstFlag += 1;
            }
        }

        if (returnProduct == null) {
            returnProduct = products.last();
        }
        return returnProduct;
    }

}
