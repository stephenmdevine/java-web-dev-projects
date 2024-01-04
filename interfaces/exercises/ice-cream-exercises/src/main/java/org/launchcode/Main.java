package org.launchcode;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name' field.
        Comparator comparator = new FlavorComparator();

        flavors.sort(comparator);

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost' field.
        cones.sort(new ConeComparator());

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
//        Printing the flavors of ice cream by name
        String flavorText = "\nFlavor List:";
        for (Flavor flavor : flavors) {
            flavorText += String.format("\n%s", flavor.getName());
        }
        System.out.println(flavorText);

//        Printing the list of cones by cost
        String coneText = "\nFlavor:\tCost:";
        for (Cone cone : cones) {
            coneText += String.format("\n%s\t$%s", cone.getName(), cone.getCost());
        }
        System.out.println(coneText);

//        Sorting allergens and printing the list
        flavors.sort(new AllergenComparator());
        String allergenText = "\nFlavor:\t# of Allergens:";
        for (Flavor flavor : flavors) {
            allergenText += String.format("\n%s\t%s", flavor.getName(), flavor.getAllergens().size());
        }
        System.out.println(allergenText);

//        Sorting toppings and printing the list
        ArrayList<Topping> toppings = menu.getToppings();
        toppings.sort(new ToppingComparator());
        String toppingText = "\nFlavor List:";
        for (Topping topping : toppings) {
            toppingText += String.format("\n%s", topping.getName());
        }
        System.out.println(toppingText);
    }
}