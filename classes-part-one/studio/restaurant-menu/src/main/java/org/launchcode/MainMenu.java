package org.launchcode;

import java.util.Scanner;

public class MainMenu {
    private String selection;

    public void setSelection(String selection) {
        this.selection = selection;
    }

    public String getSelection() {
        return selection;
    }

    public MainMenu(String selection) {
        this.selection = selection;
    }

    public int makeSelection() {
        Scanner input = new Scanner(System.in);
        int line = input.nextInt();
        input.nextLine();
        return line;
    }
}
