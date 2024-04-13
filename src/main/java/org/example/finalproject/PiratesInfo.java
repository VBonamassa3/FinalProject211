package org.example.finalproject;

public class PiratesInfo extends MLB implements NationalLeague{
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
        return "- In 1971, the Pirates became the first MLB team to";
    }
    public String InterestingFact2() {
        return "  field an all-Black and Latino lineup";
    }
}
