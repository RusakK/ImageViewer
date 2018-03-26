package pl.sdacademy.imageviewer;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Controller {


    @FXML
    private ImageView imageViewer;
    @FXML
    private Button buttonLeft;
    @FXML
    private Button buttonRight;

    @FXML
    private Button buttonOpen;

    private Stage stage;

    private ImageFileOpener imageFileOpener;

    private Desktop desktop;

    public void initialize(){
        imageFileOpener = new ImageFileOpener(stage);

        buttonOpen.setOnAction(e -> {
                FileChooser fileChooser = new FileChooser();
                fileChooser.setTitle("Open file");
                fileChooser.getExtensionFilters().addAll(
                        new FileChooser.ExtensionFilter("Pliki graficzne", "*.jpg", "*.png", "*jpeg")
                );

                File selectedFile = fileChooser.showOpenDialog(null );
                if(selectedFile != null){
                    Image image = new Image(selectedFile.toURI().toString());
                    imageViewer.setImage(image);

                } else {
                    System.out.println("Błędny plik");
                }

        });



    }

    private void displayImage(){

    }

}
