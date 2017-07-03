package by.zti.main;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

public class Main {
private static MainWindow window;
private static BufferedImage image;

	public static void main(String[] args) {
	setWindow(new MainWindow(640,480));
	}
    public static void setImage(URL url){
    	try {
			ImageIO.read(url);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
    }
    
    public static void setImage(File file){
    	try {
			ImageIO.read(file);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
    }
    
    public static void saveImage(File file,String format){
    	try {
			ImageIO.write(image, format, file);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
    }
    
    
	public static BufferedImage getImage() {
		return image;
	}

	public static void setImage(BufferedImage image) {
		Main.image = image;
	}

	public static MainWindow getWindow() {
		return window;
	}

	public static void setWindow(MainWindow window) {
		Main.window = window;
	}

}
