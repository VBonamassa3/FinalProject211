package org.example.finalproject;

public class RockiesInfo extends MLB implements NationalLeague{
    @Override
    public String NL() {
        return "- They are in the National League";
    }

    @Override
    public String WorldSeries() {
        return "- They have never won a World Series";
    }

    @Override
    public String InterestingFact() {
        return "- The Rockies are the only team to have never";
    }
    public String InterestingFact2() {
        return "  won a division title in their history";
    }
}
