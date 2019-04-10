package Model;

import patrones.iterator.MyListIterator;
import patrones.proxy.ProxyImage;

import java.util.ArrayList;

public class ImageCollection {

    private ArrayList<LoadedImage> collection;

    public ImageCollection() {
        this.collection = new ArrayList<LoadedImage>();
    }

    public void add(ProxyImage toAdd) {
        collection.add(new LoadedImage(toAdd, new Metadata(toAdd.getAttributes(), toAdd.getName())));
    }

    public void remove(LoadedImage toRemove) {
        collection.remove(toRemove);
    }

    public MyListIterator iterator() {
        return new MyListIterator(this.collection);
    }

}
