package com.example.databaseproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class LibreanPageController implements Initializable {

    /////////////////////////////////////////////
    //            switch scenes                //
    /////////////////////////////////////////////
    public void swetchToHome(ActionEvent e) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("HomePage.fxml")));
        Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setX(60);
        stage.setY(10);
        stage.setScene(scene);
        stage.show();
    }//2
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
