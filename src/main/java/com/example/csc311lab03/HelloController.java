package com.example.csc311lab03;

import javafx.fxml.FXML;
import javafx.scene.control.Label;


public class HelloController {
    @FXML
    private Label nameLabel;



    @FXML
    protected void onButtonClick() {
        nameLabel.setRotate(20);

    }
}