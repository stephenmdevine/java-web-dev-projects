package org.launchcode;

public class ItemCategory {
    private String category;

    public String getCategory() {
        return category;
    }

    public void setCategory(String menuName) {
        boolean valid = true;
        do {
            String list = "Pick a category for " + menuName + ": \n" +
                    "1. Appetizer\n2. Entree\n3. Dessert\n4. Drink";
            MainMenu menuSelection = new MainMenu(list);
            System.out.println(menuSelection.getSelection());
            int num = menuSelection.makeSelection();
            switch (num) {
                case 1:
                    valid = false;
                    this.category = "Appetizer";
                    break;
                case 2:
                    valid = false;
                    this.category = "Entree";
                    break;
                case 3:
                    valid = false;
                    this.category = "Dessert";
                    break;
                case 4:
                    valid = false;
                    this.category = "Drink";
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }   while (valid);
    }
}
