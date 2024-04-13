package org.example.finalproject;

public class RedsInfo extends MLB implements NationalLeague{
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
        return "- The Cincinnati Reds were established in 1881, making them";
    }
    public String InterestingFact2() {
        return "  one of the oldest teams in all of baseball";
    }
}
