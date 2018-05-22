/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package life;

import java.util.ArrayList;
import javafx.geometry.Point2D;

/**
 *
 * @author p0073862
 */
public class BoardNew {

    private int width, height;
    private ArrayList<Point2D> cellsArray;

    public BoardNew(int width, int height) {
        this.width = width;
        this.height = height;
        cellsArray = new ArrayList<>();
    }

    public void clear() {
        cellsArray.clear();
    }

    public boolean getCell(int x, int y) {
        return cellsArray.contains(new Point2D(x, y));
    }

    public void makeCellLive(int x, int y) {
        cellsArray.add(new Point2D(x ,y));
    }
    
    public Point2D[] getLiveCells(){
        return cellsArray.toArray(new Point2D[cellsArray.size()]);
    }

}