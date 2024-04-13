package org.example.finalproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;

import java.io.IOException;

public class PiratesController {
    @javafx.fxml.FXML
    private Button GoBackButton;
    @javafx.fxml.FXML
    private Label LeagueLabel;
    @javafx.fxml.FXML
    private Label WSLabel;
    @javafx.fxml.FXML
    private Label FactLabel2;
    @javafx.fxml.FXML
    private Label FactLabel;
    @javafx.fxml.FXML
    private Circle PiratesColor;

    @javafx.fxml.FXML
    public void returnToMain(ActionEvent actionEvent) throws IOException {
        HelloApplication.setRoot("hello-view.fxml");
    }
    PiratesInfo p = new PiratesInfo();
    @FXML
    public void initialize(){
        LeagueLabel.setText(p.NL());
        WSLabel.setText(p.WorldSeries());
        FactLabel.setText(p.InterestingFact());
        FactLabel2.setText(p.InterestingFact2());
    }
}
