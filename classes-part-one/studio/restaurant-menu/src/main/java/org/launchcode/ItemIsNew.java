package org.launchcode;

public class ItemIsNew {
    private Boolean newItem;

    public Boolean isNewItem() {
        return newItem;
    }

    public void setNewItem(String menuName) {
        boolean valid = true;
        do {
            String list = "Is " + menuName + " a new menu item? \n" +
                    "0. No\n1. Yes";
            MainMenu menuSelection = new MainMenu(list);
            System.out.println(menuSelection.getSelection());
            int num = menuSelection.makeSelection();
            switch (num) {
                case 0:
                    valid = false;
                    this.newItem = false;
                    break;
                case 1:
                    valid = false;
                    this.newItem = true;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }   while (valid);
    }
}
