/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bouncebox;

import bounceboxframework.Shape;
import javafx.scene.canvas.GraphicsContext;

/**
 *
 * @author p0073862
 */
public class Circle extends Shape {

    private int radius;

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double getContactRadius() {
        return radius;
    }

    @Override
    public double getMass() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw(GraphicsContext g) {
        g.setFill(getColor());
        double left = getX() - getRadius();
        double top = getY() - getRadius();
        g.fillOval(left, top, getRadius() * 2, getRadius() * 2);
    }
}
