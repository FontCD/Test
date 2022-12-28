package com.example.calculator;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import java.util.Objects;

import static com.example.calculator.LogCreator.startLog;

public class Main extends Application {

    public static void main(String[] args) {

        startLog();
        launch(args);

    }

    @Override
    public void start(Stage stage) throws Exception {

        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("baseUI.fxml")));
        stage.setTitle("MyCalculator");
        stage.setResizable(false);
        //TRY

        stage.setScene(new Scene(root));
        stage.show();
    }
}
