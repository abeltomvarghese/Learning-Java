/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawcircles;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import java.util.Random;
import javafx.scene.paint.Color;


/**
 *
 * @author PAZHOOR
 */
public class DrawCircles extends Application {
    private Canvas canvas = new Canvas(400, 400);
    @Override
    public void start(Stage primaryStage) {
        VBox root = new VBox();
        root.getChildren().add(canvas);
        
        Scene scene = new Scene(root);
        canvas.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent me) {
                drawCircles();
            }
        });
        
            
        
        primaryStage.setTitle("Draw Circles");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    public void drawCircles() {
        final int RADIUS = 20;
        Random rand = new Random();
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.clearRect(0,0,canvas.getWidth(), canvas.getHeight());
        for (int i = 0; i < 50; i++) {
            int x = rand.nextInt(400);
            int y = rand.nextInt(400);
            gc.fillOval(x, y, RADIUS, RADIUS);
            gc.setFill(Color.rgb(rand.nextInt(255),rand.nextInt(255),rand.nextInt(255)));
        
        }
    }
        
        
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
