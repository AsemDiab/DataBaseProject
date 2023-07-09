package com.example.databaseproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AuthorController implements Initializable {
    @FXML
    public TextField NameOfAddedBook;
@FXML
public Label dote;
    public void swetchToHome(ActionEvent e) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("HomePage.fxml"));
        Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        stage.setResizable(false);
        stage.setX(60);
        stage.setY(10);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

public void sureAllIsFill(ActionEvent e) throws IOException {
        if(NameOfAddedBook.getText().isEmpty()){
dote.setVisible(true);
        }
        else {
            swetchToHome(e);
        }
}

public void iniVisable(){
dote.setVisible(false);
}
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
iniVisable();

    }
}
