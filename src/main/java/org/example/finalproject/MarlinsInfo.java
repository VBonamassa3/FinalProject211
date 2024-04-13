package org.example.finalproject;

public class MarlinsInfo extends MLB implements NationalLeague{
    @Override
    public String NL() {
        return "- They are in the National League";
    }
    @Override
    public String WorldSeries() {
        return super.WorldSeries();
    }
    @Override
    public String InterestingFact() {
        return "- From 2017-2022, Yankees superstar Derek Jeter was the CEO";
    }
    public String InterestingFact2(){
        return "  of the Miami Marlins, and rebranded them in 2019";
    }
}
