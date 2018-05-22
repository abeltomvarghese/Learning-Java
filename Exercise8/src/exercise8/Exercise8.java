/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise8;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Button;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
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
public class Exercise8 extends Application {
    private Canvas canvas = new Canvas(400,400);
    @Override
    public void start(Stage primaryStage) {
        VBox root = new VBox();
        root.getChildren().add(canvas);
        RadioButton rbt1 = new RadioButton("circles");
        rbt1.setSelected(true);
        RadioButton rbt2 = new RadioButton("rectangle");
        ToggleGroup radioGroup = new ToggleGroup();
        rbt1.setToggleGroup(radioGroup);
        rbt2.setToggleGroup(radioGroup);
        Button b = new Button("Type");
        
        
        
        
        HBox pane12 = new HBox();
        pane12.getChildren().add(b);
        pane12.getChildren().add(rbt1);
        pane12.getChildren().add(rbt2);
        root.getChildren().add(pane12);
        b.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                if (rbt1.isSelected()) {
                    drawShapes("circle");
                } else if (rbt2.isSelected()) {
                    drawShapes("rectangle");
                }
            }
        });
        
        
        
        
        
        
        
        
        
        Scene scene = new Scene(root);
        
        
        primaryStage.setTitle("Draw Shapes!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public void drawShapes(String shapeType) {
        final int RADIUS = 20;
        Random rand = new Random();
        GraphicsContext gc = canvas.getGraphicsContext2D();
        //gc.clearRect(0,0,canvas.getWidth(), canvas.getHeight());
        if (shapeType.equals("rectangle")) {
            int x = rand.nextInt(400);
            int y = rand.nextInt(400);
            gc.fillRect(x, y, RADIUS, RADIUS);
            gc.setFill(Color.rgb(rand.nextInt(255),rand.nextInt(255),rand.nextInt(255)));
        } else if (shapeType.equals("circle")) {
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

    