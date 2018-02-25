/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package humancohabitation;

/**
 *
 * @author PAZHOOR
 */
public class HumanCohabitation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pet dog = new Pet("Jeff","Dog","Labrador",3);
        dog.displayDetails();
        Person abel = new Person("Abel", "Varghese","44 Malins Road");
        abel.displayDetails();
        abel.addPet(dog);
        abel.displayAll();
        
    }
    
}
