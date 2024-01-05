package org.launchcode;

public class Vinyl extends BaseDisc {
    public Vinyl(int storageSpace, String name, String contents, String discType, int spinRate) {
        super(storageSpace, name, contents, discType, spinRate);
    }
    public Vinyl(String name, String contents) {
        this(322, name, contents, "Vinyl", 45);
    }
}
