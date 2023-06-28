package com.example.databaseproject;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class HomeController implements Initializable {

    //important
    private Boolean inout=false;
    private Parent root;
    private Stage stage;
    private Scene scene;

    private TextField searchFeild;
    @FXML
    public Circle profilec;
@FXML
private Circle myc;
@FXML
private TextField searchf;
    @FXML
    private Button searcht;
    @FXML
    private Pane transpane;
    @FXML
    private ImageView searchIcon;
    @FXML
    private Button OpenSideManu;
    @FXML
    private Circle backarrow1;
    @FXML
    private Circle backarrow2;
    @FXML
    AnchorPane side;
    @FXML
    AnchorPane side1;

    private Image S=new Image(getClass().getResource("icons8-search-100.png").toExternalForm());

  public void searchTransition(ActionEvent e){
      TranslateTransition searchTtrans=new TranslateTransition();
      TranslateTransition searchBtrans=new TranslateTransition();
      TranslateTransition searchPtrans=new TranslateTransition();
      searchTtrans.setNode(searchf);
      searchBtrans.setNode(searcht);
      searchPtrans.setNode(transpane);
      if(!inout) {
          System.out.println("اههههه");

          searchTtrans.setDuration(Duration.millis(600));
          searchTtrans.setByX(172);
          searchTtrans.play();
          //

          searchBtrans.setDuration(Duration.millis(600));
          searchBtrans.setByX(-65);
          searchBtrans.play();
          ///

          searchPtrans.setCycleCount(1);
          searchPtrans.setDuration(Duration.millis(600));
          searchPtrans.setByX(-70);
          searchPtrans.play();
          inout=true;
      }
      else{
          if(searchf.getText().isEmpty()) {
              searchTtrans.setDuration(Duration.millis(600));
              searchTtrans.setByX(-172);
              searchTtrans.play();
              //

              searchBtrans.setDuration(Duration.millis(600));
              searchBtrans.setByX(65);
              searchBtrans.play();
              ///

              searchPtrans.setCycleCount(1);
              searchPtrans.setDuration(Duration.millis(600));
              searchPtrans.setByX(70);
              searchPtrans.play();
              inout=false;
          }


      }
  }


    public void openSub(ActionEvent e){
        side.setVisible(false);
        side1.setVisible(true);
    }
    public void closeSub(ActionEvent e){
        side1.setVisible(false);
        side.setVisible(true);
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
profilec.setFill(new ImagePattern(new Image(getClass().getResource("icons8-search-100.png").toExternalForm())));
// i will hix my error(convert following line to methods)
        backarrow1.setFill(new ImagePattern(new Image(getClass().getResource("arrowback.png").toExternalForm())));
        backarrow2.setFill(new ImagePattern(new Image(getClass().getResource("arrowback.png").toExternalForm())));
        side.setTranslateX(-250);
        side.setVisible(true);
        side1.setTranslateX(-250);
        side1.setVisible(false);
        OpenSideManu.setOnAction(Event->{
            TranslateTransition translateTransition=new TranslateTransition();
            translateTransition.setNode(side);
            translateTransition.setToX(0);
            translateTransition.setDuration(Duration.millis(500));
            translateTransition.play();
            TranslateTransition translateTransition1=new TranslateTransition();
            translateTransition1.setNode(side1);
            translateTransition1.setToX(0);
            translateTransition1.setDuration(Duration.millis(500));
            translateTransition1.play();
        });
        //button that close side Manu
        backarrow2.setOnMouseClicked(MouseEvent->{
            TranslateTransition translateTransition2=new TranslateTransition();
            translateTransition2.setNode(side);
            translateTransition2.setToX(-250);
            translateTransition2.setDuration(Duration.millis(500));
            translateTransition2.play();
            TranslateTransition translateTransition3=new TranslateTransition();
            translateTransition3.setNode(side1);
            translateTransition3.setToX(-250);
            translateTransition3.setDuration(Duration.millis(500));
            translateTransition3.play();
        });
        backarrow1.setOnMouseClicked(MouseEvent->{
            TranslateTransition translateTransition2=new TranslateTransition();
            translateTransition2.setNode(side);
            translateTransition2.setToX(-250);
            translateTransition2.setDuration(Duration.millis(500));
            translateTransition2.play();
            TranslateTransition translateTransition3=new TranslateTransition();
            translateTransition3.setNode(side1);
            translateTransition3.setToX(-250);
            translateTransition3.setDuration(Duration.millis(500));
            translateTransition3.play();
        });
    }

    //

    //methods

}
