package org.launchcode;
import java.awt.*;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Menu jacksRestaurant = new Menu();
        String list = "Welcome to Jack's Restaurant! Please make a selection. (0 to quit)\n" +
                "1. View the full menu\n2. View individual menu item\n" +
                "3. Add a new menu item\n4. Remove a menu item";
        while (true) {
            Scanner input = new Scanner(System.in);
            MainMenu menuSelection = new MainMenu(list);
            System.out.println(menuSelection.getSelection());
            int line = menuSelection.makeSelection();

            boolean shouldQuit = false;
            switch (line) {
                case 0:
                    shouldQuit = true;
                    break;
                case 1:
                    System.out.println(jacksRestaurant.printFullMenu());
                    break;
                case 2:
                    System.out.println("Menu Item Preview");
                    System.out.println(jacksRestaurant.individualItem(jacksRestaurant.itemizedMenu()));
                    break;
                case 3:
                    jacksRestaurant.fullMenu.add(jacksRestaurant.addMenuItem());
                    break;
                case 4:
                    System.out.println("Remove Menu Item");
                    jacksRestaurant.removeMenuItem(jacksRestaurant.itemizedMenu());
                    break;
                default:
                    System.out.println("Invalid Choice");

            }

            if (shouldQuit) {
                input.close();
                break;
            }
        }

    }
}
