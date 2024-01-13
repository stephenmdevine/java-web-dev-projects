package org.launchcode;

import java.util.Scanner;

public class ItemDescription {
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String menuName) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the description of " + menuName + "? ");
        String line = input.nextLine();
//        input.close();
        this.description = line;
    }
}
