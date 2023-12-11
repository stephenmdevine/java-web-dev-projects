package org.launchcode;
import java.util.Date;

public class MenuItem {
    private Double price;
    private String description;
    private String category;
    private Boolean newMenuItem;
    private Date addedToMenu;
    private Date today = new Date();

    public MenuItem(Double price, String description, String category, Date addedToMenu) {
        this.price = price;
        this.description = description;
        this.category = category;
        this.addedToMenu = addedToMenu;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Boolean isNewMenuItem() {
        return newMenuItem;
    }

    public void setNewMenuItem(Boolean newMenuItem) {
//        this.newMenuItem = addedToMenu;
        // TODO: 12/7/2023 Compare the 'today' field to the 'addedToMenu' field
        //  to see if 'today' is more than 30 days past 'addedToMenu'

    }
}
