package org.example.finalproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;

import java.io.IOException;

public class OriolesController extends MLB{
    @FXML
    private Label LeagueLabel;
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
    OriolesInfo o = new OriolesInfo();

    @FXML
    public void initialize(){
        LeagueLabel.setText(o.League());
        WSLabel.setText(o.WorldSeries());
        FactLabel.setText(o.InterestingFact());
        FactLabel2.setText(o.InterestingFact2());
    }
}