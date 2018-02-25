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
public class Pet {
    private String name;
    private String type;
    private String race;
    private int age;
    public Pet(String pName, String pType, String pRace, int pAge) {
        name = pName;
        type = pType;
        race = pRace;
        age = pAge;
    
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setRace(String race) {
        this.race = race;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }
    public String getRace() {
        return race;
    }
    public int getAge() {
        return age;
    }
    public void displayDetails() {
        System.out.println("Name: " +name+ " Type: " +type+ " Race: " +race+ " age: " + age);
    }
}
