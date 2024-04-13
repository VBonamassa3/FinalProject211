package org.example.finalproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;

import java.io.IOException;

public class MarlinsController {

    @javafx.fxml.FXML
    private Button GoBackButton;
    @javafx.fxml.FXML
    private Label LeagueLabel;
    @javafx.fxml.FXML
    private Label WSLabel;
    @javafx.fxml.FXML
    private Label FactLabel;
    @javafx.fxml.FXML
    private Circle MarlinsColor;
    @FXML
    private Label FactLabel2;

    @javafx.fxml.FXML
    public void returnToMain(ActionEvent actionEvent) throws IOException {
        HelloApplication.setRoot("hello-view.fxml");
    }
    MarlinsInfo m = new MarlinsInfo();
    @FXML
    public void initialize(){
        LeagueLabel.setText(m.NL());
        WSLabel.setText(m.WorldSeries());
        FactLabel.setText(m.InterestingFact());
        FactLabel2.setText(m.InterestingFact2());
    }
}
