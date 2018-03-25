package pl.sdacademy.imageviewer;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

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

    public void initialize(){
        imageFileOpener = new ImageFileOpener(stage);

        buttonOpen.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {

             imageFileOpener.openFile();

            }
        });


    }

    private void displayImage(){

    }

}
