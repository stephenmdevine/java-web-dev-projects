package org.launchcode;
import java.util.Date;
import java.util.Scanner;

public class Menu {
    MenuItem californiaRoll = new MenuItem("California Roll", 7.99, "Sushi roll cut into 6 pieces", "entree", new Date(2020, 11, 1));
    MenuItem spaghettiAndMeatballs = new MenuItem("Spaghetti and Meatballs", 13.99, "Globes of meat atop thin strands of pasta", "entree", new Date(2020, 11, 1));
    MenuItem fetaFilledPhyllo = new MenuItem("Feta-filled Phyllo", 6.99, "4 oz of feta cheese baked inside ten layers of phyllo dough", "appetizer", new Date(2020, 11, 1));
    MenuItem toastedRavioli = new MenuItem("Toasted Ravioli", 9.99, "Breaded and deep-fried ravioli pieces", "appetizer", new Date(2020, 11, 1));
    MenuItem vanillaIceCream = new MenuItem("Vanilla Ice Cream", 6.99, "A scoop of rich, French vanilla ice cream", "dessert", new Date(2020, 11, 1));

    public Date menuUpdate() {
        return new Date();
    }

    public MenuItem addMenuItem() {
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("What is the name of the new menu item? ");
        String menuName = input.nextLine();
        System.out.println("What is the price of " + menuName + "? ");
        Double price = input.nextDouble();
        System.out.println("Please enter a description of " + menuName + ": ");
        String description = input.nextLine();
        System.out.println("Please enter " + menuName + "'s category: ");
        String category = input.nextLine();
        input.close();
        return new MenuItem(menuName, price, description, category, new Date());
    }
}
