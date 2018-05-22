/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapemanagement;

/**
 *
 * @author PAZHOOR
 */
public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        super(0,0);
        this.radius = radius;
    } 
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    public void scale(double factor) {
        this.radius = radius* factor;
    }
    
}
