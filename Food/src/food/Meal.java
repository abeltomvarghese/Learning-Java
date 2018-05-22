/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package food;
import java.util.ArrayList;


public class Meal implements IPrice, Ingredients {
    private String name;
    private double price;
    //private double mealPrice = 0;
    ArrayList<Ingredient> getIngredients = new ArrayList<>();
    
    public Meal(String mName, double mPrice) {
        this.name = mName;
        this.price = mPrice;
        
    }
    public String getName(){
        return name;
    }
    @Override
    public double getPrice() {
        return price;
    }
    @Override
    public void addingIngredient(Ingredient i) {
        getIngredients.add(i);
        
        
    }
    public void calcMealPrice(){
        for (Ingredient x:getIngredients) {
            price += x.getPrice();
        }
        System.out.println("Price of meal: " + price);
    }
    
    

}
