package com.example.databaseproject;

import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class profileController implements Initializable {
    @FXML
    private Circle cp;

@FXML
public Button iconbtn;
@FXML
public Label L1;
    @FXML
    public Label L2;
    @FXML
    public Label L3;
    @FXML
    public Label L4;

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
    L1.setText("Admin");
    manIcon.setVisible(true);
    womanIcon.setVisible(false);
    idLabel.setText("ID:"+"1234");

} else if (BookLoginWindowController.type.equals(TypeOfUseers.Librarian)) {
    L1.setText("Librarian");
    manIcon.setVisible(false);
    womanIcon.setVisible(true);
    idLabel.setText("ID:"+"111");
} else if (BookLoginWindowController.type.equals(TypeOfUseers.Reader)) {
    L1.setText("Reader");
    manIcon.setVisible(true);
    womanIcon.setVisible(false);
    idLabel.setText("ID:"+"222");
}
else{
    L1.setText("Not Account");
}
    }
    public void h1(){
        L1.setVisible(true);
                L2.setVisible(true);
                L3.setVisible(true);
                        L4.setVisible(true);
        FadeTransition L11=new FadeTransition(Duration.seconds(0.7), L1);
        L11.setFromValue(0);
        L11.setToValue(1);
        L11.play();
        FadeTransition L22=new FadeTransition(Duration.seconds(0.7), L2);
        L11.setFromValue(0);
        L11.setToValue(1);
        L11.play();
        FadeTransition L33=new FadeTransition(Duration.seconds(0.7), L3);
        L11.setFromValue(0);
        L11.setToValue(1);
        L11.play();
        FadeTransition L44=new FadeTransition(Duration.seconds(0.7), L4);
        L11.setFromValue(0);
        L11.setToValue(1);
        L11.play();
    }
    public void h2(){
        L1.setVisible(true);
        L2.setVisible(true);
        L3.setVisible(true);
        L4.setVisible(true);
        FadeTransition L11=new FadeTransition(Duration.seconds(0.7), L1);
        L11.setFromValue(1);
        L11.setToValue(0);
        L11.play();
        FadeTransition L22=new FadeTransition(Duration.seconds(0.7), L2);
        L11.setFromValue(1);
        L11.setToValue(0);
        L11.play();
        FadeTransition L33=new FadeTransition(Duration.seconds(0.7), L3);
        L11.setFromValue(1);
        L11.setToValue(0);
        L11.play();
        FadeTransition L44=new FadeTransition(Duration.seconds(0.7), L4);
        L11.setFromValue(1);
        L11.setToValue(0);
        L11.play();
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        join();
    }
}
