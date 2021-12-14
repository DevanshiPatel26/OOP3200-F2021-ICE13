// Name: Devanshi Patel
// Student ID: 100805084
// Date: December 13, 2021
// Course: OOP3200
// Assignment: In-Class Exercise 13

package ca.durhamcollege.oop3200f2021ice12;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.IOException;

public class Main extends Application
{
    public static int WIDTH = 640;
    public static int HEIGHT = 480;

    @Override
    public void start(Stage primaryStage) throws IOException {
        primaryStage.setTitle("Hello World");

        // Step 1: Create one or more control
        Label imageLabel = new Label("Xbox Series X!");

        Button clickMeButton = new Button("Click Me");
        clickMeButton.setStyle("-fx-font-family: Arial");

        FileInputStream imagePath = new FileInputStream("src/main/java/ca/durhamcollege/oop3200f2021ice12/xboxseries.jpg");

        // Step 1 for images - is load the image
        Image xboxSeriesX = new Image(imagePath);

        // Step 2 for images - is setup a ImageView to "contain it"
        ImageView consoleImageView = new ImageView(xboxSeriesX);
        consoleImageView.setFitWidth(400);
        consoleImageView.setPreserveRatio(true);

        FileInputStream ps5Path = new FileInputStream("src/main/java/ca/durhamcollege/oop3200f2021ice12/ps5.jpg");
        Image ps5 = new Image(ps5Path);

        // Step 1.1: Configure your controls
        // Font font = Font.font("Consolas", FontWeight.BOLD, 20);
        // clickMeButton.setFont(font);

        class ButtonClickHandler implements EventHandler<ActionEvent>
        {
            @Override
            public void handle(ActionEvent event)
            {
                imageLabel.setText("PS5!");
                consoleImageView.setImage(ps5);
            }
        }

        clickMeButton.setOnAction(new ButtonClickHandler());


        // Step 2: Create a container
        HBox hbox = new HBox(10,imageLabel);
        hbox.setStyle("-fx-alignment: center;");

        HBox hBox2 = new HBox(10, consoleImageView);

        GridPane gridPane = new GridPane();

        gridPane.setMinSize(6, 8);
        gridPane.setVgap(10);
        gridPane.setHgap(10);
        gridPane.setPadding(new Insets(10));

        gridPane.add(hbox, 0, 0);
        gridPane.add(hBox2, 0, 1);
        gridPane.add(consoleImageView, 0, 2);
        gridPane.add(clickMeButton, 2, 2);

        gridPane.setStyle("-fx-border-color: black; -fx-font-size: 20; -fx-font-family: Consolas;");

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