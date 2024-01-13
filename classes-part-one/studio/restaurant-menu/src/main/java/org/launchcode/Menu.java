package org.launchcode;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Menu {
    public ArrayList<MenuItem> fullMenu = new ArrayList<>();

    public MenuItem addMenuItem() {
        ItemName name = new ItemName();
        name.setName();
        ItemPrice price = new ItemPrice();
        price.setPrice(name.getName());
        ItemDescription description = new ItemDescription();
        description.setDescription(name.getName());
        ItemCategory category = new ItemCategory();
        category.setCategory(name.getName());
        ItemIsNew newItem = new ItemIsNew();
        newItem.setNewItem(name.getName());
        MenuItem tempMenuItem = new MenuItem(name, price, description, category, newItem);
        return tempMenuItem;
        }


    public String removeMenuItem(int item) {
        if (fullMenu.get(item) == null) {
            return "Selection was not on the menu.\n";
        }   else {
            String removedItem = fullMenu.get(item).getMenuName();
            fullMenu.remove(item);
            return removedItem + " was successfully removed.\n";
        }
    }

    public StringBuilder printFullMenu() {
        StringBuilder printedMenu = new StringBuilder("Welcome to Jack's Restaurant");
        printedMenu.append("\n\nAppetizers");
        for (MenuItem item : fullMenu) {
            if (item.getCategory().toLowerCase().contains("app")) {
                printedMenu.append("\n\t" + item.getMenuName() + "\t$" + item.getPrice());
            }}
        printedMenu.append("\n\nEntrees");
        for (MenuItem item : fullMenu) {
            if (item.getCategory().toLowerCase().contains("entree")) {
                printedMenu.append("\n\t" + item.getMenuName() + "\t$" + item.getPrice());
            }}
        printedMenu.append("\n\nDesserts");
        for (MenuItem item : fullMenu) {
            if (item.getCategory().toLowerCase().contains("dessert")) {
                printedMenu.append("\n\t" + item.getMenuName() + "\t$" + item.getPrice());
            }}
        printedMenu.append("\n\nDrinks");
        for (MenuItem item : fullMenu) {
            if (item.getCategory().toLowerCase().contains("drink")) {
                printedMenu.append("\n\t" + item.getMenuName() + "\t$" + item.getPrice());
            }}

        return printedMenu;
    }

    public int itemizedMenu() {
        Scanner input = new Scanner(System.in);
        StringBuilder lineByLineMenu = new StringBuilder();
        for (int i = 0; i < fullMenu.size(); i++) {
            lineByLineMenu.append(i + ". " + fullMenu.get(i).getMenuName() + "\n");
        }
        System.out.println(lineByLineMenu);
        System.out.println("Enter menu item number: ");
        int item = input.nextInt();

        return item;
    }

    public StringBuilder individualItem(int item) {
        MenuItem selection = fullMenu.get(item);
        StringBuilder selectedItem = new StringBuilder();
        selectedItem.append("*****\nMenu Item: " + selection.getMenuName());
        selectedItem.append("\nListed Price: $" + selection.getPrice());
        selectedItem.append("\nCategory: " + selection.getCategory());
        selectedItem.append("\nItem Description: " + selection.getDescription());
        selectedItem.append("\nNew item: " + selection.isNewMenuItem() + "\n*****");
        return selectedItem;
    }

}
