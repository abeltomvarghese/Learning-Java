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
public class Person {
    private String name;
    private String surname;
    private String address;
    private Pet[] livingWithPets;
    private int numOfPets;
    public Person(String name, String surname, String address) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        livingWithPets = new Pet[5];
        numOfPets = 0; 
    }
    public void setName(String newName) {
        name = newName;
    }
    public void setSurname(String newSurname) {
        surname = newSurname;
    }
    public void setAddress(String newAddress) {
        address = newAddress;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getAddress() {
        return address;
    }
    public void displayDetails() {
        System.out.println("Name: " + name + " " + surname + "     Address: " + address);
    }
    public void addPet(Pet p) {
        if (numOfPets < 5) {
            livingWithPets[numOfPets] = p;
            numOfPets++; 
        } else {
            System.out.println("You cannot keep more pets!");    
        }
        
    }
    public void removePet(int pos) {
        int i = pos;
        while (i<numOfPets-1) {
            livingWithPets[i] = livingWithPets[i+1];
            i++;
        }
        numOfPets--;
    }
    public void displayAll() {
        for (int x = 0; x<1;x++) {
            System.out.println(this.name + " owns " + livingWithPets[x].getName());
        }
    }
    
    
}
