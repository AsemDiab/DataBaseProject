package com.example.databaseproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

import java.net.URL;
import java.security.cert.PolicyNode;
import java.util.ResourceBundle;

public class MulitpagePane implements Initializable {

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

        Button2.setStyle("-fx-background-color: #00ff00;-fx-background-radius:50 50 0 0 ;");
        Button1.setStyle("-fx-background-color: transport;");
        Button3.setStyle("-fx-background-color: transport;");
        Button4.setStyle("-fx-background-color: transport;");
        Button5.setStyle("-fx-background-color: transport;");
        Button6.setStyle("-fx-background-color: transport;");
        panel1.setVisible(false);
        panel2.setVisible(true);
        panel3.setVisible(false);
        panel4.setVisible(false);
        panel5.setVisible(false);
        panel6.setVisible(false);
    }

    @FXML
    void OpenPane3(ActionEvent event) {
        Button3.setStyle("-fx-background-color: #ffff00;-fx-background-radius:50 50 0 0 ;");
        Button2.setStyle("-fx-background-color: transport;");
        Button1.setStyle("-fx-background-color: transport;");
        Button4.setStyle("-fx-background-color: transport;");
        Button5.setStyle("-fx-background-color: transport;");
        Button6.setStyle("-fx-background-color: transport;");
        panel1.setVisible(false);
        panel2.setVisible(false);
        panel3.setVisible(true);
        panel4.setVisible(false);
        panel5.setVisible(false);
        panel6.setVisible(false);
    }

    @FXML
    void OpenPane4(ActionEvent event) {
        Button4.setStyle("-fx-background-color: #0000ff;-fx-background-radius:50 50 0 0 ;");
        Button2.setStyle("-fx-background-color: transport;");
        Button3.setStyle("-fx-background-color: transport;");
        Button1.setStyle("-fx-background-color: transport;");
        Button5.setStyle("-fx-background-color: transport;");
        Button6.setStyle("-fx-background-color: transport;");
        panel1.setVisible(false);
        panel2.setVisible(false);
        panel3.setVisible(false);
        panel4.setVisible(true);
        panel5.setVisible(false);
        panel6.setVisible(false);
    }

    @FXML
    void OpenPane5(ActionEvent event) {
        Button5.setStyle("-fx-background-color: #ff00ff;-fx-background-radius:50 50 0 0 ;");
        Button2.setStyle("-fx-background-color: transport;");
        Button3.setStyle("-fx-background-color: transport;");
        Button4.setStyle("-fx-background-color: transport;");
        Button1.setStyle("-fx-background-color: transport;");
        Button6.setStyle("-fx-background-color: transport;");
        panel1.setVisible(false);
        panel2.setVisible(false);
        panel3.setVisible(false);
        panel4.setVisible(false);
        panel5.setVisible(true);
        panel6.setVisible(false);
    }

    @FXML
    void OpenPane6(ActionEvent event) {
        Button6.setStyle("-fx-background-color: #00ffff;-fx-background-radius:50 50 0 0 ;");
        Button2.setStyle("-fx-background-color: transport;");
        Button3.setStyle("-fx-background-color: transport;");
        Button4.setStyle("-fx-background-color: transport;");
        Button5.setStyle("-fx-background-color: transport;");
        Button1.setStyle("-fx-background-color: transport;");
        panel1.setVisible(false);
        panel2.setVisible(false);
        panel3.setVisible(false);
        panel4.setVisible(false);
        panel5.setVisible(false);
        panel6.setVisible(true);
    }

    @FXML
    void openPanel1(ActionEvent event) {
        //button1.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));

        Button1.setStyle("-fx-background-color: #ff0000;-fx-background-radius:50 50 0 0 ;");
        Button2.setStyle("-fx-background-color: transport;");
        Button3.setStyle("-fx-background-color: transport;");
        Button4.setStyle("-fx-background-color: transport;");
        Button5.setStyle("-fx-background-color: transport;");
        Button6.setStyle("-fx-background-color: transport;");
        panel1.setVisible(true);
        panel2.setVisible(false);
        panel3.setVisible(false);
        panel4.setVisible(false);
        panel5.setVisible(false);
        panel6.setVisible(false);
    }

    void fillPanels(){
        FlowPane contant=paneOfAll;
        contant.setHgap(10);
        contant.setVgap(10);
        contant.getChildren().add(new JFlipCard(new Image("D:\\Media\\PHPCookbookCookbooksOReilly.jpg")));
        contant.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece1.jpg")));
        contant.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece2.jpg")));
        contant.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece3.jpg")));
        contant.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece4.jpg")));
        contant.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece7.jpg")));
        contant.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece12.jpg")));
        contant.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece35.jpg")));
        contant.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece45.jpg")));
        contant.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece51.jpg")));
        contant.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece59.jpg")));
        contant.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece60.jpg")));
        contant.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece61.jpg")));
        contant.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece62.jpg")));
        contant.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece85.jpg")));
        contant.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece91.jpg")));
        contant.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece97.jpg")));

        PaneOfFirstType.getChildren().add(new JFlipCard(new Image("D:\\Media\\PHPCookbookCookbooksOReilly.jpg")));
        FlowPane contant1=paneOfSecondType;
        contant1.setHgap(10);
        contant1.setVgap(10);
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece1.jpg")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece2.jpg")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece3.jpg")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece4.jpg")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece7.jpg")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece12.jpg")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece35.jpg")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece45.jpg")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece51.jpg")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece59.jpg")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece60.jpg")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece61.jpg")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece62.jpg")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece85.jpg")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece91.jpg")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece97.jpg")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece1.jpg")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece2.jpg")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece3.jpg")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece4.jpg")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece7.jpg")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece12.jpg")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece35.jpg")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece45.jpg")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece51.jpg")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece59.jpg")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece60.jpg")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece61.jpg")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece62.jpg")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece85.jpg")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece91.jpg")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece97.jpg")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece1.jpg")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece2.jpg")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece3.jpg")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece4.jpg")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece7.jpg")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece12.jpg")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece35.jpg")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece45.jpg")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece51.jpg")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece59.jpg")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece60.jpg")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece61.jpg")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece62.jpg")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece85.jpg")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece91.jpg")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece97.jpg")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece1.jpg")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece2.jpg")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece3.jpg")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece4.jpg")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece7.jpg")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece12.jpg")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece35.jpg")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece45.jpg")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece51.jpg")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece59.jpg")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece60.jpg")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece61.jpg")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece62.jpg")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece85.jpg")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece91.jpg")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece97.jpg")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece1.jpg")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece2.jpg")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece3.jpg")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece4.jpg")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece7.jpg")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece12.jpg")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece35.jpg")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece45.jpg")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece51.jpg")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece59.jpg")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece60.jpg")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece61.jpg")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece62.jpg")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece85.jpg")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece91.jpg")));
        contant1.getChildren().add(new JFlipCard(new Image("D:\\Media\\OnePiece97.jpg")));

    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Button1.setStyle("-fx-background-color: #ff0000;-fx-background-radius:50 50 0 0 ;");
        Button2.setStyle("-fx-background-color: transport;");
        Button3.setStyle("-fx-background-color: transport;");
        Button4.setStyle("-fx-background-color: transport;");
        Button5.setStyle("-fx-background-color: transport;");
        Button6.setStyle("-fx-background-color: transport;");
        panel1.setVisible(true);
        panel2.setVisible(false);
        panel3.setVisible(false);
        panel4.setVisible(false);
        panel5.setVisible(false);
        panel6.setVisible(false);
       // fillPanels();
    }
}