/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roommanagementsystem;


public class LectureRoom extends Room{
    public LectureRoom(String rm, int n) {
        super(rm,n,true);
    }
    public String toString(){
        return "This is a lecture Theatre Room Number " + getRoomNumber() + " and capacity " + getCapacity();
    }
}

