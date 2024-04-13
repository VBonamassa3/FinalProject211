package org.example.finalproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;

import java.io.IOException;

public class RaysController {
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
    private Circle RaysColor;

    @FXML
    void returnToMain(ActionEvent event) throws IOException {
        HelloApplication.setRoot("hello-view.fxml");
    }
    RaysInfo r = new RaysInfo();

    @FXML
    public void initialize(){
        LeagueLabel.setText(r.League());
        WSLabel.setText(r.WorldSeries());
        FactLabel.setText(r.InterestingFact());
        FactLabel2.setText(r.InterestingFact2());
    }
}
