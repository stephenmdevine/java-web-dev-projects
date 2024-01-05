package org.launchcode;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.
        CD musicDisc = new CD("Fatty's Mix", "Mopey 2000's music");
        DVD legallyObtainedMovie = new DVD("Star Wars", "The original, unedited Star Wars movie");
        Vinyl classicTunes = new Vinyl("Johnny Cash at Folsom Prison", "A classic vinyl");

        // TODO: Call each CD and DVD method to verify that they work as expected.
        musicDisc.spinDisc();
        legallyObtainedMovie.spinDisc();
        musicDisc.readData();
        legallyObtainedMovie.writeData();
        classicTunes.spinDisc();
    }
}