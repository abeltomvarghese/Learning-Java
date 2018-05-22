/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layoutarea;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



/**
 *
 * @author PAZHOOR
 */
public class LayoutArea extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        TextField widthField = new TextField("Enter width");
        TextField heightField = new TextField("Enter height");
        Label areaLabel = new Label("Area");
        Button button = new Button("Calculate Area");        
        button.setOnAction(new EventHandler<ActionEvent>() {
 
            @Override
            public void handle(ActionEvent event) {
                String area = getArea(widthField.getText(), heightField.getText());
                areaLabel.setText(area);
            }
        });

        VBox root = new VBox();
        root.getChildren().addAll(widthField, heightField, areaLabel, button);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Areas");
        primaryStage.show();
    }
    
    public String getArea(String h, String w){
        int height = Integer.parseInt(h);
        int width = Integer.parseInt(w);      
        return String.valueOf(width * height);   
    }
      

    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    
}
