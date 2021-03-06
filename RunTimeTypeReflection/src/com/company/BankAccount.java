package com.company;

public class BankAccount {

    private final String id;
    private int balance;

    public BankAccount(String id) {
        this.id = id;
    }

    public BankAccount(String id, int balance) {
        this.id = id;
        this.balance = balance;
    }

    public String getId() {return id;}

    public synchronized int getBalance() {return this.balance;}

    public synchronized void deposit(int amount) {this.balance += amount;}

    public synchronized void withdrawal(int amount) {this.balance -= amount;}

}
