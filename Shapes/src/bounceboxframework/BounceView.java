/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bounceboxframework;

import java.util.Observable;
import java.util.Observer;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

/**
 *
 * @author Dan
 */
public class BounceView implements Observer {

    private Stage stage;
    private BounceCanvas canvas;
    private BounceModel model;

    public BounceView(int width, int height, BounceModel model) {
        this.model = model;
        model.addObserver(this);
        stage = new Stage();
        stage.setTitle("Bounce Box");
        canvas = new BounceCanvas(width, height);
        stage.setScene(new Scene(new Pane(canvas)));
        stage.setResizable(false);
        stage.setOnCloseRequest(new EventHandler<WindowEvent>() {

            @Override
            public void handle(WindowEvent event) {
                System.exit(0);
            }
        });
        stage.show();
    }

    @Override
    public void update(Observable o, Object arg) {
        Platform.runLater(new Runnable() {

            @Override
            public void run() {
                canvas.draw();
            }
        });
    }

    public void addDrawable(Drawable d) {
        canvas.addDrawable(d);
    }
}
