// Name: Devanshi Patel
// Student ID: 100805084
// Date: December 10, 2021
// Course: OOP3200
// Assignment: In-Class Exercise 12

package ca.durhamcollege.oop3200f2021ice12;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application
{
    public static int WIDTH = 640;
    public static int HEIGHT = 480;

    @Override
    public void start(Stage primaryStage) throws IOException {
        // FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        // Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        primaryStage.setTitle("Hello!");

        // Step 1: Create one or more control
        Label helloLabel = new Label("Hello, World");
        Label goodByeLabel = new Label("Good Bye!");
        Button clickMeButton = new Button("Click Me");

        // Step 1.1: Configure your controls
        Font font = Font.font("Consolas", FontWeight.BOLD, 20);
        clickMeButton.setFont(font);

        // Step 1.2: For button controls (or other event-type controls) - set the event
        clickMeButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("ClickMe Button Clicked!");
                helloLabel.setText("Clicked!");
            }
        });

        // Step 2: Create a container
        // HBox hbox = new HBox(helloLabel, goodByeLabel);
        // VBox vbox = new VBox(helloLabel, clickMeButton);
        GridPane gridPane = new GridPane();

        gridPane.add(helloLabel, 1, 0);
        gridPane.add(goodByeLabel, 1, 1);
        gridPane.add(clickMeButton, 2, 2);

        // Step 3: Add layout container to scene
        Scene scene = new Scene(gridPane, WIDTH, HEIGHT);

        // Step 4: Add scene to stage
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    public static void main(String[] args)
    {
        launch();
    }
}