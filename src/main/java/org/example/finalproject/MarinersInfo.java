package org.example.finalproject;

public class MarinersInfo extends MLB{
    @Override
    public String WorldSeries() {
        return "- They have never been to the World Series";
    }
    @Override
    public String League() {
        return super.League();
    }
    @Override
    public String InterestingFact() {
        return "- Before 2022, they had a very long playoff drought, ";
    }
    public String InterestingFact2(){
        return "  where they missed the playoffs for 20 years";
    }
}
