package org.launchcode;

import java.util.HashMap;
import java.util.Map;

public class CountingCharacters {
    public static void main(String[] args) {
        String phrase = "If the product of two terms is zero then common sense says " +
                "at least one of the two terms has to be zero to start with. So if " +
                "you move all the terms over to one side, you can put the quadratics " +
                "into a form that can be factored allowing that side of the equation " +
                "to equal zero. Once you’ve done that, it’s pretty straightforward " +
                "from there.";
        char[] charactersInString = phrase.toCharArray();

        HashMap<String, Integer> charactersCounted = new HashMap<>();
        for (char i : charactersInString) {
            String s = String.valueOf(i);
            if (charactersCounted.containsKey(s)) {
                charactersCounted.put(s, charactersCounted.get(s) + 1);
            }   else {
                charactersCounted.put(s, 1);
            }
        }
        System.out.println(charactersCounted);
    }
}
