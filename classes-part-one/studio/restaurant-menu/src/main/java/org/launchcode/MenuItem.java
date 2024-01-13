package org.launchcode;
import java.util.Date;

public class MenuItem {
    private ItemName menuName;
    private ItemPrice price;
    private ItemDescription description;
    private ItemCategory category;
    private ItemIsNew newMenuItem;

    public MenuItem(ItemName menuName, ItemPrice price, ItemDescription description, ItemCategory category, ItemIsNew newMenuItem) {
        this.menuName = menuName;
        this.price = price;
        this.description = description;
        this.category = category;
        this.newMenuItem = newMenuItem;
    }

    public String getMenuName() {
        return menuName.getName();
    }

    public Double getPrice() {
        return price.getPrice();
    }

    public String getDescription() {
        return description.getDescription();
    }

    public String getCategory() {
        return category.getCategory();
    }

    public Boolean isNewMenuItem() {
        return newMenuItem.isNewItem();
    }
}
