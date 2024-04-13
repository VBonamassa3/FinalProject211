package org.example.finalproject;

public class RaysInfo extends MLB{
    @Override
    public String WorldSeries() {
        return "- They have never won a World Series";
    }
    @Override
    public String League() {
        return super.League();
    }
    @Override
    public String InterestingFact() {
        return "- The Rays are the only team that still has a dome";
    }
    public String InterestingFact2(){
        return "  without a retractable roof for their stadium";
    }
}
