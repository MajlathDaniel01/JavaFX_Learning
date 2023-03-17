package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {


    public static void main(String[] args) {
        launch(args); //static method that we inherit from the Application class
    }

    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, Color.BLACK);
        Image icon = new Image("C:/Users/majlath/IdeaProjects/demo/src/hackerIco.jpg");
        stage.getIcons().add(icon);
        stage.setTitle("Stage Demo Program");
        stage.setScene(scene);
        stage.show();
    }
}