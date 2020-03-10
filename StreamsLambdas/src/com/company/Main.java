package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static class Employee {

        public String salary;

        public Employee(String Salary) {
            this.salary = Salary;
        }

    }

    public static void main(String[] args) {
	// write your code here
        /*List<String> list = new ArrayList<>();
        list.add("ELeMeNt 1");
        list.add("ELeMeNt 2");
        list.add("ELeMeNt 3");
        list.add("ELeMeNt 4");
        list.add("ELeMeNt 5");
        list.add("ELeMeNt 6");

        list.stream()
            .map(String::toLowerCase)
            .map(String::toUpperCase)
            .forEach(System.out::println);
*/
        List<Employee> employeeRoster = new ArrayList<>();
        employeeRoster.add(new Employee("5000"));
        employeeRoster.add(new Employee("6000"));
        employeeRoster.add(new Employee("4000"));

        int paidOut = employeeRoster.stream()
                .map(employee -> employee.salary)
                .map(Integer::parseInt)
                .reduce(0, (tempSum, sum) -> tempSum + sum);

        System.out.println(paidOut);
    }
}
