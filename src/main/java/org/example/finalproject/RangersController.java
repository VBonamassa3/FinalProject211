package org.example.finalproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;

import java.io.IOException;

public class RangersController {
    @javafx.fxml.FXML
    private Label LeagueLabel;
    @javafx.fxml.FXML
    private Label WSLabel;
    @javafx.fxml.FXML
    private Label FactLabel2;
    @javafx.fxml.FXML
    private Label FactLabel;

    @javafx.fxml.FXML
    public void returnToMain(ActionEvent actionEvent) throws IOException {
        HelloApplication.setRoot("hello-view.fxml");
    }
    RangersInfo r = new RangersInfo();
    @FXML
    public void initialize(){
        LeagueLabel.setText(r.League());
        WSLabel.setText(r.WorldSeries());
        FactLabel.setText(r.InterestingFact());
        FactLabel2.setText(r.InterestingFact2());
    }
}
