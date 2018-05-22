/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bounceboxframework;

import java.util.ArrayList;
import java.util.List;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

/**
 *
 * @author Dan
 */
public class BounceCanvas extends Canvas {
    
    private List<Drawable> drawShapes;
    
    public BounceCanvas(double width, double height) {
        super(width, height);
        drawShapes = new ArrayList<>();
    }
    
    public void addDrawable(Drawable d) {
        drawShapes.add(d);
    }
    
    public void draw() {        
        GraphicsContext g = getGraphicsContext2D();
        g.clearRect(0, 0, getWidth(), getHeight());        
        for (Drawable d: drawShapes) {
            d.draw(g);
        }
    }
    
}
