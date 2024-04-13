package org.example.finalproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;

import java.io.IOException;

public class WhiteSoxController {
    @javafx.fxml.FXML
    private Label LeagueLabel;
    @javafx.fxml.FXML
    private Label WSLabel;
    @javafx.fxml.FXML
    private Label FactLabel2;
    @javafx.fxml.FXML
    private Label FactLabel;

    @FXML
    void returnToMain(ActionEvent event) throws IOException {
        HelloApplication.setRoot("hello-view.fxml");
    }
    WhiteSoxInfo s = new WhiteSoxInfo();

    @FXML
    public void initialize(){
        LeagueLabel.setText(s.League());
        WSLabel.setText(s.WorldSeries());
        FactLabel.setText(s.InterestingFact());
        FactLabel2.setText(s.InterestingFact2());
    }
}
