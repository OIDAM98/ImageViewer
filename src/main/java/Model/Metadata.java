package Model;

import java.nio.file.attribute.BasicFileAttributes;
import java.text.SimpleDateFormat;

class Metadata {

    private static final SimpleDateFormat FORMATTER = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private String creation;
    private String access;
    private String modified;
    private String name;
    private long size;

    public Metadata(BasicFileAttributes atr, String n) {
        this.creation = FORMATTER.format( atr.creationTime().toMillis() );
        this.access = FORMATTER.format( atr.lastAccessTime().toMillis() );
        this.modified = FORMATTER.format( atr.lastModifiedTime().toMillis() );

        this.size = atr.size();
        this.name = n;
    }

    public String getCreationTime() {
        return this.creation;
    }

    public String getAccessTime() {
        return this.access;
    }

    public String getModifiedTime() {
        return this.modified;
    }

    public long getSize() {
        return this.size;
    }
}
