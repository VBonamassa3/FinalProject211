package org.example.finalproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;

import java.io.IOException;

public class MarinersController {

    @javafx.fxml.FXML
    private Button GoBackButton;
    @javafx.fxml.FXML
    private Label LeagueLabel;
    @javafx.fxml.FXML
    private Circle MarinersColor;
    @FXML
    private Label WSLabel;
    @FXML
    private Label FactLabel;
    @FXML
    private Label FactLabel2;

    @FXML
    void returnToMain(ActionEvent event) throws IOException {
        HelloApplication.setRoot("hello-view.fxml");
    }
    MarinersInfo m = new MarinersInfo();

    @FXML
    public void initialize(){
        LeagueLabel.setText(m.League());
        WSLabel.setText(m.WorldSeries());
        FactLabel.setText(m.InterestingFact());
        FactLabel2.setText(m.InterestingFact2());
    }
}
