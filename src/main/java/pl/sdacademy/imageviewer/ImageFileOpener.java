package pl.sdacademy.imageviewer;

import javafx.stage.FileChooser;
import javafx.stage.Stage;


import java.awt.image.BufferedImage;
import java.io.File;
import java.util.List;

public class ImageFileOpener {


    private Stage stage;
    private List<File> imageFiles;
    private int currentFileIndex;

    public ImageFileOpener(Stage stage) {
        this.stage = stage;
    }

    public void openFile() {

//        FileChooser fileChooser = new FileChooser();
//        fileChooser.setTitle("Open file");
//        fileChooser.getExtensionFilters().addAll(
//                new FileChooser.ExtensionFilter("Pliki graficzne", "*.jpg", "*.png", "*jpeg")
//        );
//
//        File selectedFile = fileChooser.showOpenDialog(null );
//        if(selectedFile != null){
//            imageFiles.add(new File(selectedFile.getName()));
//        } else {
//            System.out.println("Błędny plik");
//        }

//        fileChooser.showOpenDialog(stage);


    }

    private void diplay(File file) {

    }
}
