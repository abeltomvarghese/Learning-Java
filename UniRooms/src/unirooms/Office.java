/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unirooms;

/**
 *
 * @author PAZHOOR
 */
public class Office extends Room {
    private String name;
    public Office(String rm, String name){
        super(rm,1,false);
        this.name = name; 
    }
    public String getName() {
        return name;
    }
    
    public void SetName(String name) {
        this.name = name;
    }
    @Override
    public String toString(){
        return "Office Room Number " + getRoomNumber() + " and capacity " + getCapacity() + " and the name " + getName();
    }
}
