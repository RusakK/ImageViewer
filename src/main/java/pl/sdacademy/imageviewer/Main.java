package pl.sdacademy.imageviewer;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class Main extends Application{

    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("view.fxml"));
        primaryStage.setTitle("Przeglądarka obrazów");
        primaryStage.setScene(new Scene(root, 850, 700));
        primaryStage.show();

        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open file");
        fileChooser.showOpenDialog(primaryStage);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
