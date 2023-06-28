package com.example.databaseproject;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
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

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HomeController implements Initializable {

    //important

    private Parent root;
    private Stage stage;
    private Scene scene;
    //////////////////////////



    ///////////////////////////

    private TextField searchFeild;
    private Boolean inout=false;//هاي مشان اعرف اذا انو السيرش مفتوح ولا مسكر
    private Boolean inoutSlide=false;
    //photo
    @FXML
    public Circle profilec;//هاي للبورفايل
    @FXML
    public Circle slidephoto;//هاي للسلايدر
    @FXML
    private TextField searchf;
    @FXML
    private Button searcht;
    @FXML
    private Pane transpane;

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

    /////////////////////////////////////////////
    //            switch scenes                //
    /////////////////////////////////////////////
    public void swetchToProfile(ActionEvent e) throws IOException {
        root= FXMLLoader.load(getClass().getResource("ProfilePage.fxml"));
        stage=(Stage)((Node)e.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setX(350);
        stage.setY(50);
        stage.setScene(scene);
        stage.show();
    }
    public void swetchAdminPage(ActionEvent e) throws IOException {
        root= FXMLLoader.load(getClass().getResource("AdminPage.fxml"));
        stage=(Stage)((Node)e.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void swetchLibrarianPage(ActionEvent e) throws IOException {
        root= FXMLLoader.load(getClass().getResource("LibrianPage.fxml"));
        stage=(Stage)((Node)e.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    /////////////////////////////////////////////
    //               methods                   //
    /////////////////////////////////////////////

    public void closesearch(ActionEvent e){//هذا الفنكشن مسؤل عن اغلاق البحث يجب استخدامه عند الضغط علي اي زر اخر
        TranslateTransition searchTtrans=new TranslateTransition();
        TranslateTransition searchBtrans=new TranslateTransition();
        TranslateTransition searchPtrans=new TranslateTransition();

        searchTtrans.setNode(searchf);
        searchBtrans.setNode(searcht);
        searchPtrans.setNode(transpane);
        if(searchf.getText().isEmpty()) {
            if (inout) {
                //  if (searchf.getText().isEmpty()) {
                searchTtrans.setDuration(Duration.millis(200));
                searchTtrans.setByX(-170);
                searchTtrans.play();


                //

                searchBtrans.setDuration(Duration.millis(200));
                searchBtrans.setByX(65);
                searchBtrans.play();
                ///

                searchPtrans.setCycleCount(1);
                searchPtrans.setDuration(Duration.millis(200));
                searchPtrans.setByX(70);
                searchPtrans.play();
                inout = false;
                // }
            }
        }
    }
    /////////////////////////////
    /////////////////////////////

    public void opensearch(ActionEvent e){//هذا الزر مسؤل عن فتح البحث يستخدم فقط عند الضغط على زر البحث
        TranslateTransition searchTtrans=new TranslateTransition();
        TranslateTransition searchBtrans=new TranslateTransition();
        TranslateTransition searchPtrans=new TranslateTransition();

        searchTtrans.setNode(searchf);
        searchBtrans.setNode(searcht);
        searchPtrans.setNode(transpane);

        if(!inout) {
            System.out.println("اههههه");

            searchTtrans.setDuration(Duration.millis(600));
            searchTtrans.setByX(170);
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

    }
//////////////////////////////////////////
    //////////////////////////////////////






    public void searchTransition(ActionEvent e){
        if(inout)
            closesearch(e);
        else
            opensearch(e);
        if(!searchf.getText().isEmpty()){
            System.out.println("hola");
        }
  }
    ///////////////////////////////////////
    /////////////////////////////////////////
    public void profileEvent(ActionEvent e) throws IOException {//زر البروفايل
        if(inout)
            closesearch(e);
        swetchToProfile(e);
        System.out.println("اههههه");
    }

    public void slideEvent(ActionEvent e){//زر البروفايل
        System.out.println("ااااا");
        if(inout)
            closesearch(e);

if(inoutSlide)
        closeSub(e);
else{
    openSub(e);
}

    }

//////////////////////////////////////////////
//          osama inisialize                //
//////////////////////////////////////////////
public void ini(){
   // profilec.setFill(new ImagePattern(new Image(getClass().getResource("anime4.png").toExternalForm())));
}








    public void openSub(ActionEvent e){

        side.setVisible(false);
        side1.setVisible(true);
    }
    public void closeSub(ActionEvent e){

        side1.setVisible(false);
        side.setVisible(true);
    }
    Boolean isSideManuOpened=false;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ini();//inisilaiz
// i will hix my error(convert following line to methods)
        backarrow1.setFill(new ImagePattern(new Image(getClass().getResource("arrowback.png").toExternalForm())));
        backarrow2.setFill(new ImagePattern(new Image(getClass().getResource("arrowback.png").toExternalForm())));
        side.setTranslateX(-250);
        side.setVisible(true);
        side1.setTranslateX(-250);
        side1.setVisible(false);

        OpenSideManu.setOnAction(Event->{
            if(isSideManuOpened){
                if(inout)
                    closesearch(Event);
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
                isSideManuOpened=false;
            }
            else {
                if(inout)
                    closesearch(Event);
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
            isSideManuOpened=true;}
        });
        //button that close side Manu
        backarrow2.setOnMouseClicked(MouseEvent->{


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
