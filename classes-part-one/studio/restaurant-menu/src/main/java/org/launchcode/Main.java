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
            System.out.println("Welcome to Jack's Restaurant!");

            String line = input.nextLine();
            boolean shouldQuit = line.equals("x");
            if (shouldQuit) {
                break;
            }
        }

        jacksRestaurant.addMenuItem();
    }
}
