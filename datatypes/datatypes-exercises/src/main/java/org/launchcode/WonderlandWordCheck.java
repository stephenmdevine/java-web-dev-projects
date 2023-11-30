package org.launchcode;

import java.util.Scanner;

public class WonderlandWordCheck {
    public static void main(String[] args) {
        String alicesAdventures = "Alice was beginning to get very tired of sitting by her " +
                "sister on the bank, and of having nothing to do: once or twice she had " +
                "peeped into the book her sister was reading, but it had no pictures or " +
                "conversations in it, ‘and what is the use of a book,’ thought Alice ‘without " +
                "pictures or conversation?’";
        String searchTerm;
        Scanner input = new Scanner(System.in);

        System.out.println("What term would you like to search for:");
        searchTerm = input.nextLine();
        input.close();

        Integer index = alicesAdventures.indexOf(searchTerm);
        Integer length = searchTerm.length();
        System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");
        String modifiedSentence = alicesAdventures.replace(searchTerm, "");
        System.out.println(modifiedSentence);

//        System.out.print(alicesAdventures.toLowerCase().contains(searchTerm.toLowerCase()));
    }
}
