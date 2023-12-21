package technology;

import java.time.LocalDate;

public class SmartPhone extends Computer {
    private int yearOfManufacture;

    public SmartPhone(String brand, String operatingSystem, int storageSpace, int yearOfManufacture) {
        super(brand, operatingSystem, storageSpace);
        this.yearOfManufacture = yearOfManufacture;
    }

    public boolean shouldIUpgrade() {
        LocalDate thisYear = LocalDate.now();
        return (yearOfManufacture + 2 < thisYear.getYear());
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }
}
