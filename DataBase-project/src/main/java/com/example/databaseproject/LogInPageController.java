package com.example.databaseproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static com.example.databaseproject.TypeOfUseers.*;

public class LogInPageController implements Initializable {
@FXML
        private TextField text;

private Boolean isIn;
    static TypeOfUseers type ;
    private Parent root;
    private Stage stage;
    private Scene scene;

public  TypeOfUseers gettype(){
    return type;
}
    public void swetchToHome(ActionEvent e) throws IOException {
   typelogin(e);
    if(isIn) {
        root = FXMLLoader.load(getClass().getResource("HomePage.fxml"));
        stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setX(50);
        stage.setY(10);
        stage.setScene(scene);
        stage.show();
    }
    }
    public void typelogin(ActionEvent e) throws IOException {
        if (text.getText().equals("1234")){
type=Admin;
            isIn=true;
        }
        else if(text.getText().equals("111")){
type=Librarian;
            isIn=true;
        }
        else if(text.getText().equals("222")){
            type= Reader;
            isIn=true;
        }
        else if(text.getText().equals("333")){
            type= Author;
            isIn=true;
        }
        else{
            isIn=false;
            System.out.println("غللط");
        }

    }




    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
