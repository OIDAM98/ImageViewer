package Model;

import patrones.proxy.ProxyImage;

public class LoadedImage {

    private ProxyImage image;
    private Metadata data;

    public LoadedImage(ProxyImage img, Metadata d) {
        this.image = img;
        this.data = d;
    }

}
