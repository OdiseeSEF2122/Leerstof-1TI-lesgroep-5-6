package com.example.code;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField txtVoornaam, txtAchternaam;

    @FXML
    protected void onRegistreerBtnClicked() {

        User user = new User(txtVoornaam.getText(), txtAchternaam.getText());

    }
}