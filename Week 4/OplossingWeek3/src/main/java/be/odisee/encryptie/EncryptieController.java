package be.odisee.encryptie;

import javafx.fxml.FXML;
import javafx.scene.control.*;

/**
 * implements a controller for encryptie-view
 */
public class EncryptieController {
    @FXML
    private TextField txtOrigineel, txtVersleuteld;

    @FXML
    private RadioButton btnAchterstevoren, btnEigen;

    // Hier moet geen @FXML staan
    private int aantalEncryptiesUitgevoerd = 0;

    /**
     * klik op encrypt button
     */
    @FXML
    protected void onEncryptButtonClick() {
        if(btnAchterstevoren.isSelected()){
            // algoritme 1
            EncryptieAchterstevoren encryptor = new EncryptieAchterstevoren();

            String input = txtOrigineel.getText();
            String output = encryptor.encrypt(input);
            txtVersleuteld.setText(output);
        } else if(btnEigen.isSelected()){
            // algoritme 2
        } else {
            Alert alert = new Alert(Alert.AlertType.NONE, "Select eerst een encryptiemethode", ButtonType.CLOSE);
            alert.show();
        }
    }

    /**
     * klik op decrypt button
     */
    @FXML
    protected void onDecryptButtonClick() {
        if(btnAchterstevoren.isSelected()){
            // algoritme 1
            EncryptieAchterstevoren encryptor = new EncryptieAchterstevoren();

            String input = txtVersleuteld.getText();
            String output = encryptor.decrypt(input);
            txtOrigineel.setText(output);
        } else if(btnEigen.isSelected()){

        } else {
            Alert alert = new Alert(Alert.AlertType.NONE, "Select eerst een encryptiemethode", ButtonType.CLOSE);
            alert.show();
        }
    }
}