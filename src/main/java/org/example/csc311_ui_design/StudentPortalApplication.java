package org.example.csc311_ui_design;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class StudentPortalApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(StudentPortalApplication.class.getResource("splash-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Farmingdale Student Portal");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}