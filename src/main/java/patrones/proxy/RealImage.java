package patrones.proxy;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class RealImage implements Image {

    private File imgpath;
    private BufferedImage img;

    public RealImage(File i){
        this.imgpath = i;
        loadImage();
    }

    private void loadImage(){
        try{
            img = ImageIO.read(imgpath);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public BufferedImage display(){
        return this.img;
    }

}
