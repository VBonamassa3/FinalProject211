package org.example.finalproject;

public class ButtonNames {
    protected int buttonNumber;

    ButtonNames(int buttonNumber){
        this.buttonNumber = buttonNumber;
    }

    @Override
    public String toString() {
        return "Team "+buttonNumber;
    }
}
