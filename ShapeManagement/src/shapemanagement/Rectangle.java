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
public class Rectangle extends Shape {

 private double width, height;

    public Rectangle(double width, double height) {
        super(0,0);
        this.width = width;
        this.height = height;
        
    }
    @Override
    public double getArea() {
        return width * height;
    }
    @Override
    public double getPerimeter() {
        return 2 * width + 2 * height;
    }
    public void scale(double factor) {
        this.height = height * factor;
        this.width = width*factor; 
        
    }
}

