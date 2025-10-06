/*
 * Author: James Brown
 * Assignment: Brown_Module_11.java
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Brown_Module_11 extends Application {

    @Override
    public void start(Stage primaryStage) {
        // --- Create Buttons for the HBox ---
        Button btn1 = new Button("Button 1");
        Button btn2 = new Button("Button 2");
        Button btn3 = new Button("Button 3");

        // HBox arranges items horizontally
        HBox hBox = new HBox(10); 
        hBox.getChildren().addAll(btn1, btn2, btn3);

        // --- Create Labels for the VBox ---
        Label lbl1 = new Label("Label A");
        Label lbl2 = new Label("Label B");
        Label lbl3 = new Label("Label C");

        // VBox arranges items vertically
        VBox vBox = new VBox(10); 
        vBox.getChildren().addAll(lbl1, lbl2, lbl3);

        // --- Combine HBox and VBox in a root container ---
        VBox root = new VBox(20); 
        root.getChildren().addAll(hBox, vBox);

        // Create and set the scene
        Scene scene = new Scene(root, 300, 200);

        // Set the stage title and display it
        primaryStage.setTitle("JavaFX HBox and VBox Example - Brown Module 11");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
