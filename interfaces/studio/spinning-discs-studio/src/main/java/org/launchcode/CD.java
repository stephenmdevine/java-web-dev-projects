package org.launchcode;

public class CD extends BaseDisc implements OpticalDisc {
    public CD(int storageSpace, String name, String contents, String discType, int spinRate) {
        super(storageSpace, name, contents, discType, spinRate);
    }
    public CD(String name, String contents) {
        this(700, name, contents, "CD", 300);
    }

    @Override
    public void writeData() {
        System.out.println("You have written up to " + this.getStorageSpace() + "MB of data.");

    }

    @Override
    public void readData() {
        System.out.println("The disc spins at " + this.getSpinRate() + " rpm and plays some music.");

    }
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
