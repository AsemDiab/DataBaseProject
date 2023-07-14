package com.example.databaseproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class profileController implements Initializable {
    @FXML
    private Circle cp;
@FXML
private Label typeLabel;
    @FXML
    private Label idLabel;
@FXML
private ImageView manIcon;
    @FXML
    private ImageView womanIcon;
    /////////////////////////////////////////////
    //            switch scenes                //
    /////////////////////////////////////////////
    public void swetchToHome(ActionEvent e) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("HomePage.fxml"));
        Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        stage.setX(60);
        stage.setY(10);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void join(){
//cp.setFill(new ImagePattern(new Image("D:\\Asem\\DataBaseProject1\\DataBase-project\\src\\main\\resources\\com\\example\\databaseproject\\pic\\anime4.png")));
if(BookLoginWindowController.type.equals(TypeOfUseers.Admin)){
    typeLabel.setText("Admin");
    manIcon.setVisible(true);
    womanIcon.setVisible(false);
    idLabel.setText("ID:"+"1234");

} else if (BookLoginWindowController.type.equals(TypeOfUseers.Librarian)) {
    typeLabel.setText("Librarian");
    manIcon.setVisible(false);
    womanIcon.setVisible(true);
    idLabel.setText("ID:"+"111");
} else if (BookLoginWindowController.type.equals(TypeOfUseers.Reader)) {
    typeLabel.setText("Reader");
    manIcon.setVisible(true);
    womanIcon.setVisible(false);
    idLabel.setText("ID:"+"222");
}
else{
    typeLabel.setText("Not Account");
}
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        join();
    }
}
