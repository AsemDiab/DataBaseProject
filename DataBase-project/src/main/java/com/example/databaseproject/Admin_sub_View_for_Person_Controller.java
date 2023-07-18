package com.example.databaseproject;

import javafx.fxml.FXML;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;

public class Admin_sub_View_for_Person_Controller {
    @FXML
    public MenuButton GenderMenuB;
    @FXML
    public MenuItem ManMenuItem;
    @FXML
    public MenuItem WomanMenuItem;
    //for Gender
    public void ManFun(){
        GenderMenuB.setText(ManMenuItem.getText());
    }
    public void WomanFun(){
        GenderMenuB.setText(WomanMenuItem.getText());
    }


}
