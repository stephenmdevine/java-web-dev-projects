package technology;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TechnologyTest {
    Computer test_computer;
    Laptop test_laptop;
    SmartPhone test_smartPhone;

    @BeforeEach
    public void createComputerObject() {
        test_computer = new Computer("HP", "Windows", 1000);
        test_laptop = new Laptop("Apple", "macOS Sonoma", 1000, 13.3);
        test_smartPhone = new SmartPhone("Nokia", "Android v14", 1000, 2020);
    }

    @Test
    public void computerStorageSpaceReturns1000() {
        assertEquals(1000, test_computer.getStorageSpace(), 0.001);
    }

    @Test
    public void computerAdds12And13AndReturns25() {
        assertEquals(25, test_computer.calculatorAdd(12, 13), 0.001);
    }

    @Test
    public void computerOpensBrowser() {
        assertEquals("Browser is now open.", test_computer.openBrowser());
    }

    @Test
    public void laptopInheritsSuperInConstructor() {
        assertEquals(1000, test_laptop.getStorageSpace(), 0.001);
    }

    @Test
    public void laptopInheritsCalculatorMethod() {
        assertEquals(25, test_laptop.calculatorAdd(12, 13), 0.001);
    }

    @Test
    public void laptopAcceptsPeripheralPlugIns() {
        assertEquals("Peripheral plugged in.", test_laptop.plugInPeripheral());
    }

    @Test
    public void smartPhoneInheritsSuper() {
        assertEquals("Nokia", test_smartPhone.getBrand());
    }

    @Test
    public void smartPhoneInheritsBrowserCapabilities() {
        assertEquals("Browser is now open.", test_smartPhone.openBrowser());
    }

    @Test
    public void smartPhoneShouldIUpgradeReturnsTrue() {
        assertTrue(test_smartPhone.shouldIUpgrade());
    }
}
