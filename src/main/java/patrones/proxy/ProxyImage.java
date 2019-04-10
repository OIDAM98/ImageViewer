package patrones.proxy;

import java.awt.image.BufferedImage;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class ProxyImage implements Image {

    private RealImage img;
    private File imgpath;
    private BasicFileAttributes attr;
    private String filename;

    public ProxyImage(File i) {
        this.imgpath = i;
        this.filename = imgpath.getName();
        Path file = Paths.get(imgpath.getAbsolutePath());
        try{
            this.attr = Files.readAttributes(file, BasicFileAttributes.class);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public BasicFileAttributes getAttributes() {
        return this.attr;
    }

    public String getExtension() {
        String name = imgpath.getName();
        if(name.lastIndexOf(".") != -1 && name.lastIndexOf(".") != 0)
            return name.substring(name.lastIndexOf(".") + 1);

        return "";
    }

    public String getName() {
        return this.filename;
    }

    @Override
    public BufferedImage display() {
        if(this.img == null) {
            this.img = new RealImage(imgpath);
        }
        return img.display();
    }

    @Override
    public String toString() {
        return filename;
    }

}
