package com.example.databaseproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class AdminPageControoler implements Initializable {
@FXML
public Pane BookPane;
@FXML
public Pane UsersPane;
@FXML
public Pane EquipmentPane;
    @FXML
    public Pane BorrowPane;
    @FXML
    public Button Users;
    @FXML
    public Button typeOfSearch;
    public boolean issingle=true;
    @FXML
    public MenuItem item1;
    @FXML
    public MenuItem item2;
    @FXML
    public MenuItem item3;
    @FXML
    public MenuItem item4;
    @FXML
    public MenuItem item5;
    @FXML
    public MenuItem item6;
    @FXML
    public MenuButton menu;



    public void menuhandel1(){
        menu.setText(item1.getText());
    }
    public void menuhandel2(){
        menu.setText(item2.getText());
    }
    public void menuhandel3(){
        menu.setText(item3.getText());
    }
    public void menuhandel4(){
        menu.setText(item4.getText());
    }
    public void menuhandel5(){
        menu.setText(item5.getText());
    }
    public void menuhandel6(){
        menu.setText(item6.getText());
    }
public void togglebutton(){
    if(issingle){
        typeOfSearch.setText("Multi Search");
        issingle=false;
    }
    else{
        typeOfSearch.setText("Single Search");
        issingle=true;
    }
}
public void open_UsersPane(){
    UsersPane.setVisible(true);
    EquipmentPane.setVisible(false);
            BookPane.setVisible(false);
            BorrowPane.setVisible(false);
}
    public void open_BookPane(){
        UsersPane.setVisible(false);
        EquipmentPane.setVisible(false);
        BookPane.setVisible(true);
        BorrowPane.setVisible(false);
    }
    public void open_EquipmentPane(){
        UsersPane.setVisible(false);
        EquipmentPane.setVisible(true);
        BookPane.setVisible(false);
        BorrowPane.setVisible(false);
    }
    public void open_BorrowPane(){
        UsersPane.setVisible(false);
        EquipmentPane.setVisible(false);
        BookPane.setVisible(false);
        BorrowPane.setVisible(true);
    }


    /////////////////////////////////////////////
    //            switch scenes                //
    /////////////////////////////////////////////
    public void swetchToHome(ActionEvent e) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("HomePage.fxml")));
        Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        if(BookLoginWindowController.type.equals(TypeOfUseers.Admin)){
            Users.setVisible(true);
        }
        else if(BookLoginWindowController.type.equals(TypeOfUseers.Librarian)){
            Users.setVisible(false);
        }
    }
}
