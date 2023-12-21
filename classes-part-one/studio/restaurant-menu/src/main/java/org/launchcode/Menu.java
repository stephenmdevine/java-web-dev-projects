package org.launchcode;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Menu {
//    MenuItem californiaRoll = new MenuItem("California Roll", 7.99, "Sushi roll cut into 6 pieces", "entree", new Date(2020, 11, 1));
//    MenuItem spaghettiAndMeatballs = new MenuItem("Spaghetti and Meatballs", 13.99, "Globes of meat atop thin strands of pasta", "entree", new Date(2020, 11, 1));
//    MenuItem fetaFilledPhyllo = new MenuItem("Feta-filled Phyllo", 6.99, "4 oz of feta cheese baked inside ten layers of phyllo dough", "appetizer", new Date(2020, 11, 1));
//    MenuItem toastedRavioli = new MenuItem("Toasted Ravioli", 9.99, "Breaded and deep-fried ravioli pieces", "appetizer", new Date(2020, 11, 1));
//    MenuItem vanillaIceCream = new MenuItem("Vanilla Ice Cream", 6.99, "A scoop of rich, French vanilla ice cream", "dessert", new Date(2020, 11, 1));

    ArrayList<MenuItem> fullMenu = new ArrayList<>();

    public Date menuUpdate() {
        return new Date();
    }

    public MenuItem addMenuItem() {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the name of the new menu item? ");
        String menuName = input.next();
        System.out.println("What is the price of " + menuName + "? ");
        Double price = input.nextDouble();
        System.out.println("Please enter a description of " + menuName + ": ");
        String description = input.next();
        String s = input.nextLine();
        System.out.println("Please enter " + menuName + "'s category (Appetizer, Entree, Dessert, or Drink): ");
        String category = input.next();
        System.out.println("Excellent!");
        input.close();
//        MenuItem tempMenuItem = new MenuItem(menuName, price, description, category, new Date());
        return new MenuItem(menuName, price, description, category, new Date());
//        fullMenu.add(tempMenuItem);
//        for (MenuItem item : fullMenu) {
//            System.out.println(item.getMenuName());
//            System.out.println(item.getPrice());
//            System.out.println(item.getDescription());
//            System.out.println(item.getCategory());
//            System.out.println(item.getAddedToMenu());
//        }
    }

    public String removeMenuItem(int item) {
        if (fullMenu.get(item) == null) {
            return "Selection was not on the menu.";
        }   else {
            String removedItem = fullMenu.get(item).getMenuName();
            fullMenu.remove(item);
            return removedItem + " was successfully removed.";
        }
    }

    public StringBuilder printFullMenu() {
        StringBuilder printedMenu = new StringBuilder("Welcome to Jack's Restaurant");
        for (MenuItem item : fullMenu) {
            printedMenu.append("Appetizers");
            if (item.getCategory().toLowerCase().contains("app")) {
                printedMenu.append(item.getMenuName() + " $" + item.getPrice());
            }}
        for (MenuItem item : fullMenu) {
            printedMenu.append("Entrees");
            if (item.getCategory().toLowerCase().contains("entree")) {
                printedMenu.append(item.getMenuName() + " $" + item.getPrice());
            }}
        for (MenuItem item : fullMenu) {
            printedMenu.append("Desserts");
            if (item.getCategory().toLowerCase().contains("dessert")) {
                printedMenu.append(item.getMenuName() + " $" + item.getPrice());
            }}
        for (MenuItem item : fullMenu) {
            printedMenu.append("Drinks");
            if (item.getCategory().toLowerCase().contains("drink")) {
                printedMenu.append(item.getMenuName() + " $" + item.getPrice());
            }}

        return printedMenu;
    }

    public int itemizedMenu() {
        Scanner input = new Scanner(System.in);
        StringBuilder lineByLineMenu = new StringBuilder();
        for (int i = 0; i < fullMenu.size(); i++) {
            lineByLineMenu.append(i + ". " + fullMenu.get(i).getMenuName());
        }
        System.out.println(lineByLineMenu);
        System.out.println("Enter menu item number: ");
        int item = input.nextInt();
        input.close();

        return item;
    }

    public StringBuilder individualItem(int item) {
        MenuItem selection = fullMenu.get(item);
        StringBuilder selectedItem = new StringBuilder();
        selectedItem.append("*****\nMenu Item: " + selection.getMenuName());
        selectedItem.append("Listed Price: $" + selection.getPrice());
        selectedItem.append("Category: " + selection.getCategory());
        selectedItem.append("Item Description: " + selection.getDescription());
        selectedItem.append("Date added: " + selection.getAddedToMenu() + "\n*****");
        return selectedItem;
    }

}
