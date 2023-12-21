package technology;

public class Computer extends AbstractEntity {
    private String brand;
    private String operatingSystem;
    private int storageSpace;

    public Computer(String brand, String operatingSystem, int storageSpace) {
        super();
        this.brand = brand;
        this.operatingSystem = operatingSystem;
        this.storageSpace = storageSpace;
    }

    public double calculatorAdd(double num1, double num2) {
        return num1 + num2;
    }

    public String openBrowser() {
        return "Browser is now open.";
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public int getStorageSpace() {
        return storageSpace;
    }

    public void setStorageSpace(int storageSpace) {
        this.storageSpace = storageSpace;
    }
}
