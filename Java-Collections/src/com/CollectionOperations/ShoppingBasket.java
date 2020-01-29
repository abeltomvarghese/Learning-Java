package com.CollectionOperations;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ShoppingBasket {
    private final List<Product> items = new ArrayList<>();
    private int totalWeight = 0;

    public void add (Product product) {
        items.add(product);
        totalWeight += product.getWeight();
    }
    public List<Product> getItems() {
        return Collections.unmodifiableList(items);
    }

    @Override
    public String toString() {
        return "Shopping Basket of \n" + items + "\nwith weight: " + totalWeight;
    }

    public static void main(String[] args) {
        ShoppingBasket shoppingBasket = new ShoppingBasket();
        shoppingBasket.add(ProductList.door);
        System.out.println(shoppingBasket);
        shoppingBasket.add(ProductList.sofa);
        System.out.println(shoppingBasket);
    }
}
