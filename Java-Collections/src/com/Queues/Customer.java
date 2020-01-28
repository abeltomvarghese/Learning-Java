package com.Queues;

public class Customer {
    public static final Customer JACK = new Customer("Jack Horse");
    public static final Customer JILL = new Customer("Jill Jillson");
    public static final Customer HARRY = new Customer("Harry Potter");


    private final String name;

    public Customer(String name) {
        this.name = name;
    }

    public void reply(final String message) {
        System.out.printf("%s: %s\n",name, message);
    }

    public String getName() {return name;}
}
