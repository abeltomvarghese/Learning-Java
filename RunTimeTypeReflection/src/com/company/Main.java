package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        doWork(new BankAccount("23"));
        Class<?> c = BankAccount.class;
        showName(c);
    }

    public static void doWork(Object o) {
        Class<?> c = o.getClass();
        showName(c);
    }

    public static void showName(Class<?> theClass) {
        System.out.println(theClass.getSimpleName());

    }
}
