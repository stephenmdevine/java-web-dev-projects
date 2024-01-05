package org.launchcode;

public abstract class BaseDisc {
    private int storageSpace;
    private String name;
    private String contents;
    private String discType;
    private int spinRate;

    public BaseDisc(int storageSpace, String name, String contents, String discType, int spinRate) {
        this.storageSpace = storageSpace;
        this.name = name;
        this.contents = contents;
        this.discType = discType;
        this.spinRate = spinRate;
    }

    public void spinDisc() {
        System.out.println("A " + this.discType + " spins at a rate of " + this.spinRate + " rpm.");
    }

    public int getStorageSpace() {
        return storageSpace;
    }

    public void setStorageSpace(int storageSpace) {
        this.storageSpace = storageSpace;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }

    public int getSpinRate() {
        return spinRate;
    }

    public void setSpinRate(int spinRate) {
        this.spinRate = spinRate;
    }
}
