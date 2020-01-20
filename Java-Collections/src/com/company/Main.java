package com.company;
import com.product.Product;
import com.product.Shipment;
import com.product.Supplier;
import com.product.ProductCatalog;
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

        Collection<Product> extraStock = new ArrayList<>();
        extraStock.add(window);
        extraStock.add(door);
        products.removeAll(extraStock);

        System.out.println(products.toString());


        System.out.println("*** USING LISTS ***");

        Product BonsaiTree = new Product("Bonsai Tree", 23);
        Product ChristmasTree = new Product("Christmas Tree", 20);
        Product oakTree = new Product("Oak Tree", 50);
        Shipment toChina = new Shipment();
        toChina.add(BonsaiTree);
        toChina.add(ChristmasTree);
        toChina.add(oakTree);

        for (Product product : toChina) {
            System.out.println(product.toString());
        }

        toChina.prepare();

        for (Product product : toChina) {
            System.out.println(product.toString());
        }

        toChina.getVan();

        System.out.println("*** USING SETS ***");

        Supplier BobsHardwares = new Supplier("Bob's Hardware Shop");
        BobsHardwares.addItem(BonsaiTree);

        ProductCatalog springCatalog = new ProductCatalog();
        springCatalog.isSuppliedBy(BobsHardwares);

        for (Product p : springCatalog) {
            System.out.println(p.getName());
        }
    }
}
