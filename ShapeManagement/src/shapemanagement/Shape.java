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
public abstract class Shape implements IShape, Moveable {

    private double x, y;
    

    public Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }
    

    @Override
    public abstract double getArea();

    @Override
    public abstract double getPerimeter();
    
    @Override
    public abstract void scale(double factor);
    public void move(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double newX) {
        x = newX;
    }

    public void setY(double newY) {
        y = newY;
    }
}

