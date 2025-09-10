/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab_02;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;

/**
 *
 * @author Jacques-Conrad Calagui-Painchaud
 */
public class Lab_02 extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Java Games");
        
        BorderPane root = new BorderPane();
        
        Label topLabel = new Label("Random Game");
        root.setTop(topLabel);
        
        Label bottomLabel = new Label("Waiting...");
        root.setBottom(bottomLabel);
        
        Label labelImage = new Label();
        StackPane middle = new StackPane(labelImage);
        root.setCenter(middle);
        
        primaryStage.setScene(new Scene(root, 250, 300));
        primaryStage.show();
    }
    
}
