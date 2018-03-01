/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circles;
import java.lang.Math;
/**
 *
 * @author PAZHOOR
 */
public class Circle {
    int cx, cy;
    double r;
    
    public Circle(int cirX, int cirY) {
        cx = cirX;
        cy = cirY;
        r = 10; 
        
    
    }
    
    public void changeX(int toAdd) {
        cx += toAdd;
    
    }
    public int getX() {
        return cx;
    
    }
    public double calculateArea() {
        return (Math.PI*(r*r));
    
    }
}
