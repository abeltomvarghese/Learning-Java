package com.Maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        final Map<Integer,Product> products = new HashMap<>();
        products.put(1, ProductList.door);
        products.put(2, ProductList.table);
        products.put(3, ProductList.wardrobe);
        products.put(4, ProductList.sofa);

        System.out.println(products);

        final Set<Integer> ids = products.keySet();
        ids.remove(1);
        System.out.println(ids);
        System.out.println(products);

        final Collection<Product> values = products.values();
        values.remove(ProductList.wardrobe);
        System.out.println(products);

        final Set<Map.Entry<Integer, Product>> entries = products.entrySet();
        for (Map.Entry<Integer, Product> p : entries) {
            System.out.println(p);
            p.setValue(ProductList.wardrobe);
        }
        System.out.println(products);

        Product result = products.getOrDefault(10, new Product("Whatever the customer wants",-1));
        System.out.println(result);
        System.out.println(products.get(10));


        Product replaceResult = products.replace(2,new Product("Night Stand",15));
        System.out.println(replaceResult);
        System.out.println(products);

        products.replaceAll((id, oldProduct) -> new Product(oldProduct.getName(), oldProduct.getWeight() + 10));
        System.out.println(products);

        products.computeIfAbsent(24, (id) -> new Product("Custom Product",100));
        System.out.println(products);

        products.forEach((key, value) -> {
            System.out.println(key + "-> " + value);
        });
    }
}
