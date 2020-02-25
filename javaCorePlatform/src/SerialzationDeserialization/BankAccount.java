package SerialzationDeserialization;

import java.io.Serializable;

public class BankAccount implements Serializable {

    private final String id;
    private int balance = 0;

    public BankAccount(String id) {this.id = id;}

    public BankAccount(String id, int balance) {this.id = id; this.balance = balance;}

    public synchronized void deposit(int amt) {
        this.balance += amt;
    }

    public synchronized void withdrawal(int amt) {
        this.balance -= amt;
    }

    public String getId() {
        return id;
    }

    public int getBalance() {
        return balance;
    }
}
