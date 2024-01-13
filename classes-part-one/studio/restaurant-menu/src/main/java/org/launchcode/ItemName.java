package org.launchcode;

import java.util.Scanner;

public class ItemName {
    private String name;

    public String getName() {
        return name;
    }

    public void setName() {
        Scanner input = new Scanner(System.in);
        String line;
        do {
            System.out.println("What is the name of the menu item? ");
            line = input.nextLine();
        } while (line.isEmpty());
//        input.close();
        this.name = line;
    }
}
