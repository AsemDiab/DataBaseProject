package com.example.databaseproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;

import java.net.URL;
import java.security.cert.PolicyNode;
import java.util.ResourceBundle;

public class MulitpagePane implements Initializable {

    @FXML
    Line rectangle1;
    @FXML
    Line  rectangle2;
    @FXML
    Line  rectangle3;
    @FXML
    Line  rectangle4;
    @FXML
    Line  rectangle5;
    @FXML
    Line  rectangle6;

    @FXML
    private Button Button2;

    @FXML
    private Button Button3;

    @FXML
    private Button Button4;

    @FXML
    private Button Button5;

    @FXML
    private Button Button6;

    @FXML
    private Button Button1;

    @FXML
    private Pane panel1;

    @FXML
    private Pane panel2;

    @FXML
    private Pane panel3;

    @FXML
    private Pane panel4;

    @FXML
    private Pane panel5;

    @FXML
    private Pane panel6;
    @FXML
    private FlowPane PaneOfFirstType;


    @FXML
    private FlowPane paneOFThirdType;

    @FXML
    private FlowPane paneOfAll;

    @FXML
    private FlowPane paneOfFifthType;

    @FXML
    private FlowPane paneOfFourthType;

    @FXML
    private FlowPane paneOfSecondType;


    @FXML
    void OpenPane2(ActionEvent event) {
        Button2.setStyle("-fx-background-color: transport;-fx-background-radius:0 50 0 0 ;-fx-text-fill: #ffffff;");
        Button1.setStyle("-fx-background-color: transport;-fx-text-fill: #000000;");
        Button3.setStyle("-fx-background-color: transport;-fx-text-fill: #000000;");
        Button4.setStyle("-fx-background-color: transport;-fx-text-fill: #000000;");
        Button5.setStyle("-fx-background-color: transport;-fx-text-fill: #000000;");
        Button6.setStyle("-fx-background-color: transport;-fx-text-fill: #000000;");
        panel1.setVisible(false);
        panel2.setVisible(true);
        panel3.setVisible(false);
        panel4.setVisible(false);
        panel5.setVisible(false);
        panel6.setVisible(false);
        rectangle1.setVisible(false);
        rectangle2.setVisible(true);
        rectangle3.setVisible(false);
        rectangle4.setVisible(false);
        rectangle5.setVisible(false);
        rectangle6.setVisible(false);
    }

    @FXML
    void OpenPane3(ActionEvent event) {
        Button3.setStyle("-fx-background-color: transport;-fx-background-radius:0 50 0 0 ;-fx-text-fill: #ffffff;");
        Button2.setStyle("-fx-background-color: transport;-fx-text-fill: #000000;");
        Button1.setStyle("-fx-background-color: transport;-fx-text-fill: #000000;");
        Button4.setStyle("-fx-background-color: transport;-fx-text-fill: #000000;");
        Button5.setStyle("-fx-background-color: transport;-fx-text-fill: #000000;");
        Button6.setStyle("-fx-background-color: transport;-fx-text-fill: #000000;");
        panel1.setVisible(false);
        panel2.setVisible(false);
        panel3.setVisible(true);
        panel4.setVisible(false);
        panel5.setVisible(false);
        panel6.setVisible(false);
        rectangle1.setVisible(false);
        rectangle2.setVisible(false);
        rectangle3.setVisible(true);
        rectangle4.setVisible(false);
        rectangle5.setVisible(false);
        rectangle6.setVisible(false);
    }

    @FXML
    void OpenPane4(ActionEvent event) {
        Button4.setStyle("-fx-background-color: transport;-fx-text-fill: #000000;-fx-background-radius:0 50 0 0 ;-fx-text-fill: #ffffff;");
        Button2.setStyle("-fx-background-color: transport;-fx-text-fill: #000000;");
        Button3.setStyle("-fx-background-color: transport;-fx-text-fill: #000000;");
        Button1.setStyle("-fx-background-color: transport;-fx-text-fill: #000000;");
        Button5.setStyle("-fx-background-color: transport;-fx-text-fill: #000000;");
        Button6.setStyle("-fx-background-color: transport;-fx-text-fill: #000000;");
        panel1.setVisible(false);
        panel2.setVisible(false);
        panel3.setVisible(false);
        panel4.setVisible(true);
        panel5.setVisible(false);
        panel6.setVisible(false);
        rectangle1.setVisible(false);
        rectangle2.setVisible(false);
        rectangle3.setVisible(false);
        rectangle4.setVisible(true);
        rectangle5.setVisible(false);
        rectangle6.setVisible(false);
    }

    @FXML
    void OpenPane5(ActionEvent event) {
        Button5.setStyle("-fx-background-color: transport;-fx-text-fill: #000000;-fx-background-radius:0 50 0 0 ;-fx-text-fill: #ffffff;");
        Button2.setStyle("-fx-background-color: transport;-fx-text-fill: #000000;");
        Button3.setStyle("-fx-background-color: transport;-fx-text-fill: #000000;");
        Button4.setStyle("-fx-background-color: transport;-fx-text-fill: #000000;");
        Button1.setStyle("-fx-background-color: transport;-fx-text-fill: #000000;");
        Button6.setStyle("-fx-background-color: transport;-fx-text-fill: #000000;");
        panel1.setVisible(false);
        panel2.setVisible(false);
        panel3.setVisible(false);
        panel4.setVisible(false);
        panel5.setVisible(true);
        panel6.setVisible(false);
        rectangle1.setVisible(false);
        rectangle2.setVisible(false);
        rectangle3.setVisible(false);
        rectangle4.setVisible(false);
        rectangle5.setVisible(true);
        rectangle6.setVisible(false);
    }

    @FXML
    void OpenPane6(ActionEvent event) {
        Button6.setStyle("-fx-background-color: transport;-fx-text-fill: #000000;-fx-background-radius:0 50 0 0 ;-fx-text-fill: #ffffff;");
        Button2.setStyle("-fx-background-color: transport;-fx-text-fill: #000000;");
        Button3.setStyle("-fx-background-color: transport;-fx-text-fill: #000000;");
        Button4.setStyle("-fx-background-color: transport;-fx-text-fill: #000000;");
        Button5.setStyle("-fx-background-color: transport;-fx-text-fill: #000000;");
        Button1.setStyle("-fx-background-color: transport;-fx-text-fill: #000000;");
        panel1.setVisible(false);
        panel2.setVisible(false);
        panel3.setVisible(false);
        panel4.setVisible(false);
        panel5.setVisible(false);
        panel6.setVisible(true);
        rectangle1.setVisible(false);
        rectangle2.setVisible(false);
        rectangle3.setVisible(false);
        rectangle4.setVisible(false);
        rectangle5.setVisible(false);
        rectangle6.setVisible(true);
    }

    @FXML
    void openPanel1(ActionEvent event) {
        //button1.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));

        Button1.setStyle("-fx-background-color: transport;-fx-text-fill: #000000;-fx-text-fill: #ffffff;");
        Button2.setStyle("-fx-background-color: transport;-fx-text-fill: #000000;");
        Button3.setStyle("-fx-background-color: transport;-fx-text-fill: #000000;");
        Button4.setStyle("-fx-background-color: transport;-fx-text-fill: #000000;");
        Button5.setStyle("-fx-background-color: transport;-fx-text-fill: #000000;");
        Button6.setStyle("-fx-background-color: transport;-fx-text-fill: #000000;");
        panel1.setVisible(true);
        panel2.setVisible(false);
        panel3.setVisible(false);
        panel4.setVisible(false);
        panel5.setVisible(false);
        panel6.setVisible(false);
        rectangle1.setVisible(true);
        rectangle2.setVisible(false);
        rectangle3.setVisible(false);
        rectangle4.setVisible(false);
        rectangle5.setVisible(false);
        rectangle6.setVisible(false);
    }

    void fillPanels(){
        FlowPane contant=paneOfAll;
        contant.setHgap(10);
        contant.setVgap(10);
        contant.getChildren().add(new JFlipCard(new Image("D:\\Media\\PHPCookbookCookbooksOReilly.png")));
        contant.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece1.png")));
        contant.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece2.png")));
        contant.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece3.png")));
        contant.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece4.png")));
        contant.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece7.png")));
        contant.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece12.png")));
        contant.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece35.png")));
        contant.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece45.png")));
        contant.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece51.png")));
        contant.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece59.png")));
        contant.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece60.png")));
        contant.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece61.png")));
        contant.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece62.png")));
        contant.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece85.png")));
        contant.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece91.png")));
        contant.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece97.png")));

        PaneOfFirstType.getChildren().add(new JFlipCard(new Image("D:\\Media\\PHPCookbookCookbooksOReilly.png")));
        FlowPane contant1=paneOfSecondType;
        contant1.setHgap(10);
        contant1.setVgap(10);
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece1.png")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece2.png")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece3.png")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece4.png")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece7.png")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece12.png")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece35.png")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece45.png")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece51.png")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece59.png")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece60.png")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece61.png")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece62.png")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece85.png")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece91.png")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece97.png")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece1.png")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece2.png")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece3.png")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece4.png")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece7.png")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece12.png")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece35.png")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece45.png")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece51.png")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece59.png")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece60.png")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece61.png")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece62.png")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece85.png")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece91.jp")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece97.png")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece1.png")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece2.png")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece3.png")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece4.png")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece7.png")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece12.png")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece35.png")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece45.png")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece51.png")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece59.png")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece60.png")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece61.png")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece62.png")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece85.png")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece91.png")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece97.png")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece1.png")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece2.png")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece3.png")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece4.png")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece7.png")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece12.png")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece35.png")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece45.png")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece51.png")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece59.png")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece60.png")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece61.png")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece62.png")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece85.png")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece91.png")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece97.png")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece1.png")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece2.png")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece3.png")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece4.png")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece7.png")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece12.png")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece35.png")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece45.png")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece51.png")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece59.png")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece60.png")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece61.png")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece62.png")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece85.png")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece91.png")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece97.png")));

    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Button1.setStyle("-fx-background-color: transport;-fx-background-radius:0 50 0 0 ;-fx-text-fill: #ffffff;");
        Button2.setStyle("-fx-background-color: transport;-fx-text-fill: #000000;");
        Button3.setStyle("-fx-background-color: transport;-fx-text-fill: #000000;");
        Button4.setStyle("-fx-background-color: transport;-fx-text-fill: #000000;");
        Button5.setStyle("-fx-background-color: transport;-fx-text-fill: #000000;");
        Button6.setStyle("-fx-background-color: transport;-fx-text-fill: #000000;");

        panel1.setVisible(true);
        panel2.setVisible(false);
        panel3.setVisible(false);
        panel4.setVisible(false);
        panel5.setVisible(false);
        panel6.setVisible(false);
        Image image=new Image("D:\\Asem\\DataBaseProject1\\DataBase-project\\src\\main\\resources\\com\\example\\databaseproject\\pic\\lastClosedDoors.png");
        paneOfAll.getChildren().add(new JFlipCard(image));  // fillPanels();
paneOfAll.setBackground(new Background(new BackgroundImage(image,BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,BackgroundPosition.DEFAULT, new BackgroundSize( BackgroundSize.AUTO,BackgroundSize.AUTO
        ,false,
        false,
        true,
        false))));

        rectangle1.setVisible(true);
        rectangle2.setVisible(false);
        rectangle3.setVisible(false);
        rectangle4.setVisible(false);
        rectangle5.setVisible(false);
        rectangle6.setVisible(false);


    }
}