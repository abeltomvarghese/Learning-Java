/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roommanagementsystem;


public abstract class Room {
    private String roomNumber;
    private int capacity;
    private boolean projection;
    public Room(String rm, int n, boolean p) {
        roomNumber = rm;
        capacity = n;
        projection = p;
                
    }
    public String getRoomNumber(){
        return roomNumber;
    }
    public int getCapacity(){
        return capacity;
    }
    public boolean hasProjector(){
        return projection;
    }
    
    public String toString(){
        return "Room Number " + getRoomNumber() + " and capacity " + getCapacity();
    }
}

