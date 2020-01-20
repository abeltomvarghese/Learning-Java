package com.product;
public class Product implements Comparable<Product>{
    private String name;
    private int weight;

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

    @Override
    public String toString() {
        return String.join(" ",name,":",Integer.toString(weight));
    }

    @Override
    public int compareTo(Product o) {
        return this.getWeight() < o.getWeight() ? -1 : this.getWeight() > o.getWeight() ? 1 : 0;
        
    }


}
