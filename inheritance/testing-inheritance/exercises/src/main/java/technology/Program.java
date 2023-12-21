package technology;

public class Program {
    public static void main(String[] args) {
        Computer homeDesktop = new Computer("Frankenstein", "Windows 7", 1000);
        Laptop schoolComp = new Laptop("HP", "Windows 11", 476, 15);
        SmartPhone myPhone = new SmartPhone("Pixel", "Android v14", 128, 2021);

        System.out.println(homeDesktop.calculatorAdd(12, 13));
        System.out.println(homeDesktop.openBrowser());
        System.out.println(schoolComp.plugInPeripheral());
        System.out.println("Time for a new phone? " + myPhone.shouldIUpgrade());
        System.out.println(homeDesktop.getId());
        System.out.println(schoolComp.getId());
        System.out.println(myPhone.getId());
    }
}
