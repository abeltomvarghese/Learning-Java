/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bounceboxframework;

import bounceboxframework.BounceModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author p0073862
 */
public class BounceController  {

    private BounceModel model;
    private Timer timer;
    private double doubleInterval;

    public BounceController(BounceModel model, int refreshInterval) {
        this.model = model;
        doubleInterval = refreshInterval / 1000.0;
        timer = new Timer(refreshInterval, e -> model.moveShapes(doubleInterval));
    }

    public void start() {
        timer.start();
    }

}
