package org.launchcode;
import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        double length;
        double width;
        double area;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of your rectangle: ");
        length = input.nextDouble();
        System.out.println("Enter the width of your rectangle: ");
        width = input.nextDouble();
        input.close();

        area = length * width;
        System.out.println("The area of your rectangle is " + area);
    }
}
