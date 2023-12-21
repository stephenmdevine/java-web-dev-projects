package technology;

public class Laptop extends Computer {
    private double screenSize;

    public Laptop(String brand, String operatingSystem, int storageSpace, double screenSize) {
        super(brand, operatingSystem, storageSpace);
        this.screenSize = screenSize;
    }

    public String plugInPeripheral() {
        return "Peripheral plugged in.";
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }
}
