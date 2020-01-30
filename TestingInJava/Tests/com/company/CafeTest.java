package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CafeTest {

    @Test
    public void canBrewExpresso() {
        Cafe cafe = new Cafe();
        cafe.restockBeans(20);

        Coffee testCoffee = cafe.brew(CoffeeType.Espresso);


        //check whether the coffee is an espresso
        Assertions.assertEquals(CoffeeType.Espresso,testCoffee.getType());

        //check whether the coffee has milk
        Assertions.assertEquals(0,testCoffee.getMilk());

        //check how many coffee beans
        Assertions.assertEquals(7, testCoffee.getBeans());
    }

    @Test
    public void brewingEspressoConsumesBeans() {
        Cafe testCafe = new Cafe();
        testCafe.restockBeans(7);

        Coffee testCoffee = testCafe.brew(CoffeeType.Espresso);

        Assertions.assertEquals(0, testCafe.getBeansInStock());
    }

    @Test
    public void lattesRequiresMilk() {
        Cafe testCafe = new Cafe();
        testCafe.restockBeans(7);



        Assertions.assertThrows(IllegalStateException.class, () -> {
            Coffee coffee = testCafe.brew(CoffeeType.Latte);
        });


    }
}