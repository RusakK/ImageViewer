package pl.sdacademy.imageviewer;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.awt.*;
import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class Controller {

    @FXML
    private ImageView imageViewer;
    @FXML
    private Button buttonLeft;
    @FXML
    private Button buttonRight;
    @FXML
    private Button buttonOpen;
    @FXML
    private Button buttonMultipleOpen;

    private Stage stage;
    private ImageFileOpener imageFileOpener;
    private Desktop desktop;


    private List<File> list;
    private List<Image> images = new ArrayList<>();
    private int numer = 0;



    public void initialize(){
        imageFileOpener = new ImageFileOpener(stage);

        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open file");
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Pliki graficzne", "*.jpg", "*.png", "*jpeg")
        );


        buttonOpen.setOnAction(e ->
            selectOneImage(fileChooser)
        );

        buttonMultipleOpen.setOnAction(event ->
            selectMultipleImages(fileChooser)
        );

        buttonRight.setOnAction(e ->
            showNextImage()
        );

        buttonLeft.setOnAction(e ->
            showPreviousImage()
        );


    }

    private void showPreviousImage() {
        numer--;
        if(numer < 0){
            numer = images.size();
        } else {
            imageViewer.setImage(images.get(numer));

        }
    }

    private void showNextImage() {
        numer++;
        if(numer < images.size()){
            imageViewer.setImage(images.get(numer));
        } else
            numer = -1;
    }

    private void selectMultipleImages(FileChooser fileChooser) {
        list = fileChooser.showOpenMultipleDialog(null);
        images = new ArrayList<>();
        if(list != null){
        for (File file : list) {
            Image image = new Image(file.toURI().toString());
            images.add(image);
        }
        imageViewer.setImage(images.get(numer));
    }
    }

    private void selectOneImage(FileChooser fileChooser) {
        File selectedFile = fileChooser.showOpenDialog(null );
        if(selectedFile != null){
            Image image = new Image(selectedFile.toURI().toString());
            imageViewer.setImage(image);
        }
    }
}
