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

    private Image S=new Image("icons8-search-100.png");

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

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
profilec.setFill(new ImagePattern(new Image("icons8-search-100.png")));
    }
    //

    //methods

}
