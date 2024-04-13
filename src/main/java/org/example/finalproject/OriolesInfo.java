package org.example.finalproject;

public class OriolesInfo extends MLB{
    @Override
    public String WorldSeries() {
       return "- They have not won a World Series in the 21st century";
    }
    @Override
    public String League() {
        return super.League();
    }
    @Override
    public String InterestingFact() {
        return "- In 2022, they changed the dimensions of the left field wall";
    }
    public String InterestingFact2(){
        return "  to make hitting home runs harder in their stadium";
    }
}
