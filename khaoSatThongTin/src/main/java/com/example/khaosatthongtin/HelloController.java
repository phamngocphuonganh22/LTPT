package com.example.khaosatthongtin;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class HelloController {
    @FXML
    private RadioButton A1;
    @FXML
    private ToggleGroup toggle;
    int score = 0;
    Alert alert = new Alert(Alert.AlertType.INFORMATION);

    @FXML
    protected void onHelloButtonClick() {
        RadioButton button = (RadioButton) toggle.getSelectedToggle();
        if (button.equals(A1)) {
            score = 0;
            alert.setContentText("diem cua ban " + score);
            alert.show();
        } else {
            score = 0;
            alert.setContentText("diem cua ban " + score);
            alert.show();
        }
    }
}