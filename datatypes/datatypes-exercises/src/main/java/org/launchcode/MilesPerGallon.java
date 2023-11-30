package org.launchcode;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        double miles;
        double gallons;
        double mpg;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the total miles you drove: ");
        miles = input.nextDouble();
        System.out.println("Enter the gallons of gas you used: ");
        gallons = input.nextDouble();
        input.close();

        mpg = miles / gallons;
        System.out.println("Your average gas mileage is " + mpg);
    }
}
