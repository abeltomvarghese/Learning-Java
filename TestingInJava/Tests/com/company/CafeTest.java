package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CafeTest {
    private final int ESPRESSO_BEANS = 7;
    private final int EMPTY_STOCK = 0;
    @Test
    public void canBrewExpresso() {
        Cafe cafe = new Cafe();
        cafe.restockBeans(ESPRESSO_BEANS);

        Coffee testCoffee = cafe.brew(CoffeeType.Espresso);


        //check whether the coffee is an espresso
        Assertions.assertEquals(CoffeeType.Espresso,testCoffee.getType());

        //check whether the coffee has milk
        Assertions.assertEquals(EMPTY_STOCK,testCoffee.getMilk());

        //check how many coffee beans
        Assertions.assertEquals(ESPRESSO_BEANS, testCoffee.getBeans());
    }

    @Test
    public void brewingEspressoConsumesBeans() {
        Cafe testCafe = new Cafe();
        testCafe.restockBeans(7);

        Coffee testCoffee = testCafe.brew(CoffeeType.Espresso);

        Assertions.assertEquals(EMPTY_STOCK, testCafe.getBeansInStock());
    }

    @Test
    public void lattesRequiresMilk() {
        Cafe testCafe = new Cafe();
        testCafe.restockBeans(ESPRESSO_BEANS);

        Assertions.assertThrows(IllegalStateException.class, () -> {
            Coffee coffee = testCafe.brew(CoffeeType.Latte);
        });
    }

    @Test
    public void canBrewLatte() {
        Cafe testCafe = new Cafe();
        testCafe.restockBeans(ESPRESSO_BEANS);
        testCafe.restockMilk(227);

        Coffee testCoffee = testCafe.brew(CoffeeType.Latte);

        Assertions.assertEquals(227, testCoffee.getMilk(),"Wrong Amount of Milk");
        Assertions.assertEquals(CoffeeType.Latte, testCoffee.getType(),"Wrong Type of Coffee");

    }
}