package org.example.finalproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private Button MarinersButton;
    ButtonNames Mariners = new ButtonNames(3);

    @FXML
    private Button MarlinsButton;
    ButtonNames Marlins = new ButtonNames(2);

    @FXML
    private Button MetsButton;
    ButtonNames Mets = new ButtonNames(6
    );
    @FXML
    private Button OriolesButton;
    ButtonNames Orioles = new ButtonNames(1);

    @FXML
    private Button PiratesButton;
    ButtonNames Pirates = new ButtonNames(10);

    @FXML
    private Button RangersButton;
    ButtonNames Rangers = new ButtonNames(5);

    @FXML
    private Button RaysButton;
    ButtonNames Rays = new ButtonNames(9);

    @FXML
    private Button RedsButton;
    ButtonNames Reds = new ButtonNames(4);

    @FXML
    private Button RockiesButton;
    ButtonNames Rockies = new ButtonNames(8);

    @FXML
    private Button WhiteSoxButton;
    ButtonNames WhiteSox = new ButtonNames(7);

    @FXML
    public void initialize(){
        MarinersButton.setText(Mariners.toString());
        MarlinsButton.setText(Marlins.toString());
        MetsButton.setText(Mets.toString());
        OriolesButton.setText(Orioles.toString());
        PiratesButton.setText(Pirates.toString());
        RangersButton.setText(Rangers.toString());
        RaysButton.setText(Rays.toString());
        RedsButton.setText(Reds.toString());
        RockiesButton.setText(Rockies.toString());
        WhiteSoxButton.setText(WhiteSox.toString());
    }

    @FXML
    void ShowMariners(ActionEvent event) throws IOException {
        HelloApplication.setRoot("mariners.fxml");
    }

    @FXML
    void ShowMarlins(ActionEvent event) throws IOException {
        HelloApplication.setRoot("marlins.fxml");
    }

    @FXML
    void ShowMets(ActionEvent event) throws IOException {
        HelloApplication.setRoot("mets.fxml");
    }

    @FXML
    void ShowOrioles(ActionEvent event) throws IOException {
        HelloApplication.setRoot("orioles.fxml");
    }

    @FXML
    void ShowPirates(ActionEvent event) throws IOException {
        HelloApplication.setRoot("pirates.fxml");
    }

    @FXML
    void ShowRangers(ActionEvent event) throws IOException {
        HelloApplication.setRoot("rangers.fxml");
    }

    @FXML
    void ShowRays(ActionEvent event) throws IOException {
        HelloApplication.setRoot("rays.fxml");
    }

    @FXML
    void ShowReds(ActionEvent event) throws IOException {
        HelloApplication.setRoot("reds.fxml");
    }

    @FXML
    void ShowRockies(ActionEvent event) throws IOException {
        HelloApplication.setRoot("rockies.fxml");
    }

    @FXML
    void ShowWhiteSox(ActionEvent event) throws IOException {
        HelloApplication.setRoot("whitesox.fxml");
    }
}