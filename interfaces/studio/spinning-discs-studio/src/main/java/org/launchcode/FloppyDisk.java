package org.launchcode;

public class FloppyDisk extends BaseDisc {
    public FloppyDisk(int storageSpace, String name, String contents, String discType, int spinRate) {
        super(storageSpace, name, contents, discType, spinRate);
    }
    public FloppyDisk(int storageSpace, String name, String contents, int spinRate) {
        this(storageSpace, name, contents, "floppy disk", spinRate);
    }
}
