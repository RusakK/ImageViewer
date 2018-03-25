package pl.sdacademy.imageviewer;

import javafx.stage.FileChooser;
import javafx.stage.Stage;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class ImageFileOpener {


    private Stage stage;
    private List<BufferedImage> imageFiles;
    private int currentFileIndex;

    public ImageFileOpener(Stage stage) {
        this.stage = stage;
    }

    public void openFile() {

        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open file");
        fileChooser.showOpenDialog(stage);
        fileChooser.setInitialDirectory(
                new File(System.getProperty("user.home"))
        );
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("All Images", "*.*"),
                new FileChooser.ExtensionFilter("JPG", "*.jpg"),
                new FileChooser.ExtensionFilter("PNG", "*.png")
        );
    
    }
}
