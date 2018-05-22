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
public class Square extends Shape {

    private double contactRadius;
    private int width;

    public Square(int x, int y, int width) {
        super(x, y);
        this.width = width;
        contactRadius = Math.sqrt(width * width / 2);
    }

    public int getWidth() {
        return width;
    }

    @Override
    public double getContactRadius() {
        return contactRadius;
    }

    @Override
    public double getMass() {
        return width * width;
    }

    @Override
    public void draw(GraphicsContext g) {
        g.setFill(getColor());
        g.setStroke(getColor());
        double left = getX() - width / 2;
        double top = getY() - width / 2;

        double rad = getContactRadius();

        g.fillRect(left, top, width, width);

        double cleft = getX() - rad;
        double ctop = getY() - rad;
        g.strokeOval(cleft, ctop, rad * 2, rad * 2);
    }
}
