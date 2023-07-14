package com.example.ungdungthi;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class HelloController {
    @FXML
    Label questionLabel;

    @FXML
    RadioButton optionARadioButton;

    @FXML
    RadioButton optionBRadioButton;

    @FXML
    RadioButton optionCRadioButton;

    @FXML
    RadioButton optionDRadioButton;

    ToggleGroup toggleGroup;

    public void initialize() {
        toggleGroup = new ToggleGroup();
        optionARadioButton.setToggleGroup(toggleGroup);
        optionBRadioButton.setToggleGroup(toggleGroup);
        optionCRadioButton.setToggleGroup(toggleGroup);
        optionDRadioButton.setToggleGroup(toggleGroup);

        questionLabel.setText("What is the capital of France?");
        optionARadioButton.setText("London");
        optionBRadioButton.setText("Paris");
        optionCRadioButton.setText("Berlin");
        optionDRadioButton.setText("Rome");
    }

    @FXML
    protected void submitQuiz() {
        RadioButton selectedRadioButton = (RadioButton) toggleGroup.getSelectedToggle();

        if (selectedRadioButton != null) {
            String selectedOption = selectedRadioButton.getText();
            String correctOption = "Paris";

            if (selectedOption.equals(correctOption)) {
                questionLabel.setText("Correct!");
            } else {
                questionLabel.setText("Incorrect!");
            }
        } else {
            questionLabel.setText("Please select an option!");
        }
    }

}