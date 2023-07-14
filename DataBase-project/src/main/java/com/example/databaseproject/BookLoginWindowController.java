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
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static com.example.databaseproject.TypeOfUseers.*;
//import static com.example.databaseproject.TypeOfUseers.Author;

public class BookLoginWindowController implements Initializable {

    @FXML
    protected void onHelloButtonClick() {
        //welcomeText.setText("Welcome to JavaFX Application!");
    }
    @FXML
    ImageView imageView;
    Boolean out=false;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        new t().start();


    }
    class t extends Thread{
        @Override
        public void run() {
            try {
                sleep(3600);

            }
            catch (Exception exception){}
            System.out.println("done");
            imageView.setVisible(false);
        }



    }
    public void exit(MouseEvent mouseEvent){
        System.exit(0);
    }


    @FXML
    private TextField text;
    private Boolean isIn;
    static TypeOfUseers type ;
    @FXML
    private PasswordField passwordField;
    @FXML
    private TextField passwordText;

    @FXML
    public void change(ActionEvent e){
        if(((CheckBox) e.getSource()).isSelected()){
            passwordField.setVisible(false);
            passwordText.setText(passwordField.getText());
            passwordText.setVisible(true);
        }
        else{
            passwordText.setVisible(false);
            passwordField.setText(passwordText.getText());
            passwordField.setVisible(true);
        }

    }
    public  TypeOfUseers gettype(){
        return type;
    }
    public void swetchToHome(ActionEvent e) throws IOException {
        typelogin(e);
        if(isIn) {
            Parent root = FXMLLoader.load(getClass().getResource("HomePage.fxml"));
            Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
            stage.close();
            stage =new Stage();
            Scene scene = new Scene(root);
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

        else{
            isIn=false;
            System.out.println("غللط");
            System.out.println(text.getText());
        }

    }


}
