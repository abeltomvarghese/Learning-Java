package com.company;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CafeTest {
    private final int ESPRESSO_BEANS = 7;
    private final int EMPTY_STOCK = 0;

    private Cafe testCafe;

    private Cafe initBeans() {
        System.out.println("constructor");
        Cafe testCafe = new Cafe();
        testCafe.restockBeans(ESPRESSO_BEANS);
        return testCafe;
    }

    @BeforeEach
    public void before() {
        testCafe = new Cafe();
    }

    @Test
    public void canBrewExpresso() {
        Cafe testCafe = initBeans();

        Coffee testCoffee = testCafe.brew(CoffeeType.Espresso);


        //check whether the coffee is an espresso
        Assertions.assertEquals(CoffeeType.Espresso,testCoffee.getType(), "Wrong type of coffee");

        //check whether the coffee has milk
        assertEquals(EMPTY_STOCK,testCoffee.getMilk(),"Wrong amount of milk");

        //check how many coffee beans
        assertEquals(ESPRESSO_BEANS, testCoffee.getBeans(),"Wrong amount of coffee beans");
    }

    @Test
    public void brewingEspressoConsumesBeans() {
        Cafe testCafe = initBeans();

        Coffee testCoffee = testCafe.brew(CoffeeType.Espresso);

        assertEquals(EMPTY_STOCK, testCafe.getBeansInStock(),"Wrong number of coffee in cafe");
    }

    @Test
    public void lattesRequiresMilk() {
        Cafe testCafe = initBeans();

        Assertions.assertThrows(IllegalStateException.class, () -> {
            Coffee coffee = testCafe.brew(CoffeeType.Latte);
        },"Not enough milk or coffee beans");



    }

    @Test
    public void canBrewLatte() {
        Cafe testCafe = initBeans();
        testCafe.restockMilk(227);

        Coffee testCoffee = testCafe.brew(CoffeeType.Latte);

        assertEquals(CoffeeType.Latte.getRequiredMilk(), testCoffee.getMilk(),"Wrong Amount of Milk");
        assertEquals(CoffeeType.Latte, testCoffee.getType(),"Wrong Type of Coffee");

    }
}