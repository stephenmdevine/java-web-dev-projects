package org.launchcode;

import java.util.Scanner;

public class ItemPrice {
    private Double price;

    public Double getPrice() {
        return price;
    }

    public void setPrice(String menuName) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the price of " + menuName + "? ");
        Double line = input.nextDouble();
//        input.close();
        this.price = line;
    }
}
