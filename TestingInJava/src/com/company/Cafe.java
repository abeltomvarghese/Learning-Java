package com.company;

public class Cafe {

    private int beansInStock = 0;
    private int milkInStock = 0;

    public Coffee brew(CoffeeType type) {return brew(type,1);}

    public Coffee brew(CoffeeType type, int quantity) {
        requirePositive(quantity);

        int requiredBeans = type.getRequiredBeans() * quantity;
        int requiredMilk = type.getRequiredMilk() * quantity;
        if (requiredBeans > beansInStock || requiredMilk > milkInStock) {
            throw new IllegalStateException("Insufficient beans or milk");
        }

        beansInStock -= requiredBeans;
        milkInStock -= requiredMilk;
        return new Coffee(type, requiredBeans, requiredMilk);
    }

    public void restockBeans(int weightInGrams) {
        requirePositive(weightInGrams);
        beansInStock += weightInGrams;
    }

    public void restockMilk(int weightInGrams) {
        requirePositive(weightInGrams);
        milkInStock += weightInGrams;
    }

    public void requirePositive(int quantity) {
        if (quantity < 1) {
            throw new IllegalArgumentException();
        }
    }

    public int getBeansInStock() {return beansInStock;}
    public int getMilkInStock() {return  milkInStock;}

}
