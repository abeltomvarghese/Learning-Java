package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CafeTest {
    private final int ESPRESSO_BEANS = 7;
    private final int EMPTY_STOCK = 0;

    private Cafe testCafe;

    @BeforeEach
    public void before() {
        testCafe = new Cafe();
    }

    private Cafe initBeans() {
        testCafe.restockBeans(ESPRESSO_BEANS);
        return testCafe;
    }



    @Test
    public void canBrewExpresso() {
        initBeans();

        Coffee testCoffee = testCafe.brew(CoffeeType.Espresso);


        //check whether the coffee is an espresso
        Assertions.assertEquals(CoffeeType.Espresso,testCoffee.getType(), "Wrong type of coffee");

        //check whether the coffee has milk
        Assertions.assertEquals(EMPTY_STOCK,testCoffee.getMilk(),"Wrong amount of milk");

        //check how many coffee beans
        Assertions.assertEquals(ESPRESSO_BEANS, testCoffee.getBeans(),"Wrong amount of coffee beans");
    }

    @Test
    public void brewingEspressoConsumesBeans() {
        initBeans();

        Coffee testCoffee = testCafe.brew(CoffeeType.Espresso);

        Assertions.assertEquals(EMPTY_STOCK, testCafe.getBeansInStock(),"Wrong number of coffee in cafe");
    }

    @Test
    public void lattesRequiresMilk() {
        initBeans();

        Assertions.assertThrows(IllegalStateException.class, () -> {
            Coffee coffee = testCafe.brew(CoffeeType.Latte);
        },"Not enough milk or coffee beans");
    }

    @Test
    public void canBrewLatte() {
        initBeans();
        testCafe.restockMilk(227);

        Coffee testCoffee = testCafe.brew(CoffeeType.Latte);

        Assertions.assertEquals(CoffeeType.Latte.getRequiredMilk(), testCoffee.getMilk(),"Wrong Amount of Milk");
        Assertions.assertEquals(CoffeeType.Latte, testCoffee.getType(),"Wrong Type of Coffee");

    }
}