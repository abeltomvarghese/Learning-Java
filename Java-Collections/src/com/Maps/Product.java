package com.Maps;

import java.util.Comparator;
import java.util.Objects;

import static java.util.Comparator.comparing;

public class Product implements Comparable<Product>{
    private int id;
    private String name;
    private int weight;

    public static final Comparator<Product> BY_NAME = comparing(Product::getName);
    public static final Comparator<Product> BY_WEIGHT = comparing(Product::getWeight);
    public Product(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return String.join(" ",name,":",Integer.toString(weight));
    }

    @Override
    public int compareTo(Product o) {
        return this.getWeight() < o.getWeight() ? -1 : this.getWeight() > o.getWeight() ? 1 : 0;
        
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return weight == product.weight &&
                Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight);
    }


}
