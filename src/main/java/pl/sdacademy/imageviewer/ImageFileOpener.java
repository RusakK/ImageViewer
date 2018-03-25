package pl.sdacademy.imageviewer;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class ImageFileOpener {
    private List<BufferedImage> imageFiles;
    private int currentFileIndex;

    public void openFile() {
        BufferedImage img = null;

        try {
            img = ImageIO.read(new File("path"));
        } catch (IOException e) {
            System.out.println("Can't open.");
        }
        currentFileIndex = 0;
        imageFiles.add(img);
    }
}
