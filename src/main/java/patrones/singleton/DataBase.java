package patrones.singleton;

import patrones.proxy.ProxyImage;

import java.awt.image.BufferedImage;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DataBase{

    private static DataBase single = null;

    private final String FILEPATH = "";
    private final File file;

    private DataBase() {
        file = new File(FILEPATH);
    }

    public static synchronized DataBase getInstance() {
        if(single == null){
            single = new DataBase();
        }
        return single;
    }

    public void load() {

    }

    public boolean save(ProxyImage img) {
        File fn;
        BufferedImage toSave = img.display();



        return true;
    }

}
