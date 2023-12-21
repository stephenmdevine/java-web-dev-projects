package org.launchcode;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
        static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here
        Menu jacksRestaurant = new Menu();
        // Top-level menu options
//        HashMap<String, String> actionChoices = new HashMap<>();
//        actionChoices.put("search", "Search");
        while (true) {
            System.out.println("Welcome to Jack's Restaurant! Please make a selection. (0 to quit)\n" +
                    "1. View the full menu\n2. View individual menu item\n" +
                    "3. Add a new menu item\n4. Remove a menu item");

            int line = input.nextInt();
//            input.close();

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

//            if (line.equals("1")) {
//                System.out.println(jacksRestaurant.printFullMenu());
//            } else if (line.equals("2")) {
//                System.out.println(jacksRestaurant.itemizedMenu());
//                System.out.println("Enter menu item number you wish to view: ");
//                int item = input.nextInt();
//                input.close();
//                System.out.println(jacksRestaurant.individualItem(item));
//            } else if (line.equals("3")) {
//                jacksRestaurant.addMenuItem();
//            } else if (line.equals("4")) {
//                System.out.println(jacksRestaurant.itemizedMenu());
//                System.out.println("Enter menu item number you wish to remove: ");
//                int item = input.nextInt();
//                input.close();
//                jacksRestaurant.removeMenuItem(item);
//            }   else {
//                System.out.println("Invalid choice.");
//            }

            if (shouldQuit) {
                break;
            }
        }

    }
}
