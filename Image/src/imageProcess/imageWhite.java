package imageProcess;

import java.awt.*;
import java.awt.image.BufferedImage;

import java.io.*;

import javax.imageio.ImageIO;

public class imageWhite {

    BufferedImage image;
    int width;
    int height;

    public imageWhite() {
        try {
            File input = new File("C:\\Pics\\image.jpg");
            image = ImageIO.read(input);
            width = image.getWidth();
            height = image.getHeight();
            Color white = new Color(255,255,255);
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    Color c = new Color(image.getRGB(j, i));
                    if (c.getRGB() == 0 || (c.getRed() < 50 && c.getBlue() < 50 && c.getGreen() < 50)) {} else { image.setRGB(j, i, white.getRGB()); }  
                }
            }
            File ouptut = new File("C:\\Pics\\new.jpg");
            ImageIO.write(image, "jpg", ouptut);

        } catch (IOException e) {
            System.out.println("Error!");
        }
    }

    static public void main(String args[]) throws Exception {
        imageWhite obj = new imageWhite();
    }
}
