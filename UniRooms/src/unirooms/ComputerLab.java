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
public class ComputerLab extends Room {
    private String os;
    public ComputerLab(String rm, int n, boolean p, String os) {
        super(rm,n,p);
        this.os = os;
        
                
    }
    public ComputerLab(String rm, boolean p, String os){
        super(rm,20,p);
        this.os = os;
                
    }
    public String getOS() {
        return os;
    }
    public void setOS(String update) {
        os = update;
    }
    public String toString(){
        return "Computer lab Room Number " + getRoomNumber() + " and capacity " + getCapacity();
    }
}
