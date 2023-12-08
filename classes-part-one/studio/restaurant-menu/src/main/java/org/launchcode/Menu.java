package org.launchcode;
import java.time.LocalDate;

public class Menu {
    MenuItem californiaRoll = new MenuItem(7.99, "Sushi roll cut into 6 pieces", "entree");
    MenuItem spaghettiAndMeatballs = new MenuItem(13.99, "Globes of meat atop thin strands of pasta", "entree");
    MenuItem fetaFilledPhyllo = new MenuItem(6.99, "4 oz of feta cheese baked inside ten layers of phyllo dough", "appetizer");
    MenuItem toastedRavioli = new MenuItem(9.99, "Breaded and deep-fried ravioli pieces", "appetizer");
    MenuItem gooeyButterCake = new MenuItem(6.99, "A gooey, sweet treat", "dessert");

    public LocalDate menuUpdate() {
        return LocalDate.now();
    }
}
