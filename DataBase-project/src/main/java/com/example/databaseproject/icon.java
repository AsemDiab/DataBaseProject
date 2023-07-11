package com.example.databaseproject;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class icon implements Initializable {
    @FXML
    public Button authorB;
    @FXML
    public Button authorB1;
    public void adminanime(){
        authorB1.setVisible(true);
        authorB.setVisible(false);
    }
    public void adminanime1(){
        authorB1.setVisible(false);
        authorB.setVisible(true);
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
