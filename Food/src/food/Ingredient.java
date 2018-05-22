/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package food;

/**
 *
 * @author PAZHOOR
 */
public class Ingredient implements IPrice{
    private String name;
    private double price;
    public Ingredient(String Iname, double Iprice) {
        this.name = Iname;
        this.price = Iprice;
    }
    public String getName() {
        return name;
    }
    @Override
    public double getPrice() {
        return price;
    }
}
