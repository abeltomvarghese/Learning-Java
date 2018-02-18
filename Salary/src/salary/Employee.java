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
public class Employee {
    String eName; 
    double epayRate, eHours;
    
    public Employee(String name, double payRate, double hours){
        eName = name;
        epayRate = payRate; 
        eHours = hours; 
    }
    public String getName() {
        return eName;
    }
    public double getGross(){
        return (epayRate * eHours);
    }
    public double getNet(){
        return (0.8 * (epayRate * eHours));
    }
    
}
