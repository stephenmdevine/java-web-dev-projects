package org.launchcode;
import java.util.Date;

public class Menu {
    MenuItem californiaRoll = new MenuItem(7.99, "Sushi roll cut into 6 pieces", "entree", new Date(2020, 11, 1));
    MenuItem spaghettiAndMeatballs = new MenuItem(13.99, "Globes of meat atop thin strands of pasta", "entree", new Date(2020, 11, 1));
    MenuItem fetaFilledPhyllo = new MenuItem(6.99, "4 oz of feta cheese baked inside ten layers of phyllo dough", "appetizer", new Date(2020, 11, 1));
    MenuItem toastedRavioli = new MenuItem(9.99, "Breaded and deep-fried ravioli pieces", "appetizer", new Date(2020, 11, 1));
    MenuItem vanillaIceCream = new MenuItem(6.99, "A scoop of rich, French vanilla ice cream", "dessert", new Date(2020, 11, 1));

    public Date menuUpdate() {
        return new Date();
    }
}
