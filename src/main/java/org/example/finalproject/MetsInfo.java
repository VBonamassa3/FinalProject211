package org.example.finalproject;

public class MetsInfo extends MLB implements NationalLeague{
    @Override
    public String NL() {
        return "- They are in the National League";
    }
    @Override
    public String WorldSeries() {
        return "- They have not won a World Series in the 21st century";
    }

    @Override
    public String InterestingFact() {
        return "- The Mets have the richest owner in baseball, Steve Cohen,";
    }
    public String InterestingFact2() {
        return "  who is worth $19.8 Billion dollars";
    }
}
