package com.example.databaseproject;

import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;

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
public TextArea textA;

    @FXML
    public Pane BorrowPane;
    @FXML
    public Button Users;
    @FXML
    public Button typeOfSearch;
    @FXML
    public Button typeOfSearch11;
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
    @FXML
    public MenuButton GenderMenuB;
    @FXML
    public  MenuItem ManMenuItem;
    @FXML
    public  MenuItem WomanMenuItem;
public boolean isopenp=false;
    public boolean isopenB=true;
    public boolean isopenBo=false;
    public boolean isopenE=false;

    public  void ManFun(){
        GenderMenuB.setText(ManMenuItem.getText());
    }
    public  void WomanFun(){
        GenderMenuB.setText(WomanMenuItem.getText());
    }
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
    public void togglebutton1(){
        if(issingle){
            typeOfSearch11.setText("Multi Search");
            issingle=false;
        }
        else{
            typeOfSearch11.setText("Single Search");
            issingle=true;
        }
    }
public void open_UsersPane(){
        if(!isopenp) {
            UsersPane.setVisible(true);
            FadeTransition f = new FadeTransition(Duration.seconds(0.3), UsersPane);
            f.setFromValue(0);
            f.setToValue(1);
            f.play();
            EquipmentPane.setVisible(false);
            BookPane.setVisible(false);
            BorrowPane.setVisible(false);
            isopenE=false;
            isopenB=false;
            isopenp=true;
            isopenBo=false;

        }
}
    public void open_BookPane(){
        if(!isopenB) {
            BookPane.setVisible(true);
            FadeTransition f = new FadeTransition(Duration.seconds(0.3), BookPane);
            f.setFromValue(0);
            f.setToValue(1);
            f.play();
            UsersPane.setVisible(false);
            EquipmentPane.setVisible(false);

            BorrowPane.setVisible(false);

            isopenE=false;
            isopenB=true;
            isopenp=false;
            isopenBo=false;

        }
    }
    public void open_EquipmentPane(){
        if(!isopenE) {
            EquipmentPane.setVisible(true);
            FadeTransition f = new FadeTransition(Duration.seconds(0.3), EquipmentPane);
            f.setFromValue(0);
            f.setToValue(1);
            f.play();
            UsersPane.setVisible(false);
            BookPane.setVisible(false);
            BorrowPane.setVisible(false);
            isopenE=true;
            isopenB=false;
            isopenp=false;
            isopenBo=false;
        }
    }
    public void open_BorrowPane(){
        if(!isopenBo) {
            UsersPane.setVisible(false);
            EquipmentPane.setVisible(false);
            BookPane.setVisible(false);
            BorrowPane.setVisible(true);
            FadeTransition f = new FadeTransition(Duration.seconds(0.3), BorrowPane);
            f.setFromValue(0);
            f.setToValue(1);
            f.play();
            isopenE = false;
            isopenB = false;
            isopenp = false;
            isopenBo = true;
        }
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
        textA.setWrapText(true);
    }
}
