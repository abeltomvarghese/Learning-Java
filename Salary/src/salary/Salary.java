/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salary;

/**
 *
 * @author PAZHOOR
 */
public class Salary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee worker = new Employee("Harry", 5.5, 48);
        System.out.println(worker.getName());
        System.out.println("Your Gross Salary is £" + worker.getGross());
        System.out.println(String.format("after tax is £%.2f" , worker.getNet()));
    }
    
}
