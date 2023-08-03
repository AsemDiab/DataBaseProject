package com.example.databaseproject;

import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.scene.transform.Rotate;

import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;
import oracle.jdbc.pool.OracleDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class JFlipCard  extends Pane {

    int hight=200;
    int width=150;
    boolean isfirsttime=false;

    Label label=new Label();
    ImageView imageview;
    boolean back=true;
    boolean front=true;

    boolean isFront=true;
    int id ;
    Image image;




    JFlipCard( int id ){
        try {
            OracleDataSource oracleDataSource = new OracleDataSource();
            oracleDataSource.setURL("jdbc:oracle:thin:@localhost:1521:xe");
            oracleDataSource.setUser("C##Asem");
            oracleDataSource.setPassword("123456");
            Connection connection=oracleDataSource.getConnection();
            connection.setAutoCommit(false);
            // Statement statement=connection.createStatement();
            String sql = "select * from book where book_id="+id;
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet=statement.executeQuery();
            resultSet.next();
            image=new Image(resultSet.getBinaryStream(13));
            label=new Label();
            label.setText(resultSet.getString(2).trim()+"\n"+resultSet.getString(3).trim()+" "+resultSet.getString(4).trim());
            label.setTextAlignment(TextAlignment.CENTER);
            label.setFont(new Font(10));
            label.setTextFill(Color.WHEAT);
            this.id=id;
        }
        catch (Exception exception){
            System.out.println(exception);
        }
        this.setPrefHeight(hight);
        this.setPrefWidth(width);
        this.setBackground(new Background(new BackgroundFill(Color.rgb(61,50,44), CornerRadii.EMPTY, Insets.EMPTY)));
        // label=new Label("hello book");

        label.setVisible(false);
        imageview=new ImageView(image);
        imageview.setFitWidth(width);
        imageview.setFitHeight(hight);
        label.setPrefWidth(width);
        label.setPrefHeight(hight);
        label.setWrapText(true);
        RotateTransition rotateTransition=new RotateTransition(Duration.millis(1),label);
        rotateTransition.setAxis(Rotate.Y_AXIS);
        rotateTransition.setByAngle(180);
        rotateTransition.play();
        this.setOnMouseEntered(MouseEvent->{
            isFront=false;
            if(front){

                new my().start();
            }});
        this.setOnMouseExited(MouseEvent->{
            isFront=true;
            if(back){

                new my2().start();
            }



        });
        getChildren().addAll(label,imageview);
        RotateTransition rotateTransition1=new RotateTransition(Duration.millis(1),label);
        rotateTransition1.setAxis(Rotate.Y_AXIS);
        rotateTransition1.setByAngle(180);


        rotateTransition1.play();
        this.setOnMouseClicked(MouseEvent-> {
            Stage stage=new Stage();
            // FXMLLoader fxmlLoader = new
            try {
                bookPage.id=id;
                Parent root = FXMLLoader.load(getClass().getResource("hello-view2.fxml"));
                AnchorPane anchorPane = new AnchorPane();
                anchorPane.getChildren().add(root);
                Scene scene = new Scene(anchorPane);
                stage.setTitle("Hello!");
                System.out.println("let go");
                stage.setScene(scene);
                stage.initStyle(StageStyle.TRANSPARENT);
                stage.show();
                scene.setFill(Color.TRANSPARENT);

            }catch (Exception exception){
                System.out.println(exception);
            }

        });
    }
    JFlipCard(){
        this.setPrefHeight(132.5);
        this.setPrefWidth(100);
        this.setBackground(new Background(new BackgroundFill(Color.BLUE, CornerRadii.EMPTY, Insets.EMPTY)));
        label=new Label("hello book");

        label.setVisible(false);
        imageview=new ImageView(new Image("D:\\New folder (2)\\Asem\\demo\\src\\main\\resources\\icon.png"));

        imageview.setFitWidth(100);
        imageview.setFitHeight(132.5);
        label.setPrefWidth(100);
        label.setPrefHeight(132.5);
        this.setOnMouseEntered(MouseEvent->{
            isFront=false;
            if(front){

                new my().start();
            }});
        this.setOnMouseExited(MouseEvent->{
            isFront=true;
            if(back){

                new my2().start();
            }



        });
//        RotateTransition rotateTransition=new RotateTransition(Duration.millis(1),label);
//        rotateTransition.setAxis(Rotate.Y_AXIS);
//        rotateTransition.setByAngle(180);
//        rotateTransition.play();
        getChildren().addAll(label,imageview);
        this.setOnMouseClicked(MouseEvent-> {
            Stage stage=new Stage();
            // FXMLLoader fxmlLoader = new
            try {


                Parent root = FXMLLoader.load(getClass().getResource("hello-view2.fxml"));
                AnchorPane anchorPane = new AnchorPane();
//                anchorPane.getChildren().add(root);
//                Scene scene = new Scene(anchorPane, 300, 300);
                Scene scene=new Scene(root,600,518);
                stage.setTitle("Hello!");
                System.out.println("let go");
                stage.setScene(scene);
                stage.show();
            }catch (Exception exception){
                System.out.println(exception);
                System.out.println("soorry");
            }
            //  scene.setFill(Color.TRANSPARENT);
            //stage.initStyle(StageStyle.TRANSPARENT);
        });

    }




    class my2 extends Thread{
        @Override
        public void run() {
            back=false;
            front=false;
            RotateTransition rotateTransition = new RotateTransition(Duration.millis(1000), getCard());
            rotateTransition.setAxis(Rotate.Y_AXIS);
            rotateTransition.setFromAngle(0);
            rotateTransition.setToAngle(180);
            rotateTransition.setInterpolator(Interpolator.LINEAR);
            rotateTransition.setCycleCount(1);
            rotateTransition.setAutoReverse(false);
            rotateTransition.play();
            try {
                sleep(500);
            }catch (Exception e){}
            if (!isfirsttime){
                RotateTransition rotateTransition1=new RotateTransition(Duration.millis(1),imageview);
                rotateTransition1.setAxis(Rotate.Y_AXIS);
                rotateTransition1.setByAngle(180);


                rotateTransition1.play();
                isfirsttime=true;}
//            RotateTransition rotateTransition2=new RotateTransition(Duration.millis(1),label);
//            rotateTransition2.setAxis(Rotate.Y_AXIS);
//            rotateTransition2.setByAngle(180);
//
//
//            rotateTransition2.play();
            imageview.setVisible(true);
            label.setVisible(false);
            try {
                sleep(500);
            }catch (Exception e){}
            System.out.println("finished");
            front=true;
            if(!isFront){
                new my().start();
            }
        }
    }
    class my extends Thread{
        @Override
        public void run() {
            try {
                sleep(500);
            }
            catch (InterruptedException e){}
            if (!isFront) {
                back = false;
                front = false;
                RotateTransition rotateTransition = new RotateTransition(Duration.millis(1000), getCard());
                rotateTransition.setAxis(Rotate.Y_AXIS);
                rotateTransition.setFromAngle(0);
                rotateTransition.setToAngle(180);
                rotateTransition.setInterpolator(Interpolator.LINEAR);
                rotateTransition.setCycleCount(1);
                rotateTransition.setAutoReverse(false);
                rotateTransition.play();
                try {
                    sleep(500);
                } catch (Exception e) {
                }


//                RotateTransition rotateTransition1=new RotateTransition(Duration.millis(1),label);
//                rotateTransition1.setAxis(Rotate.Y_AXIS);
//                rotateTransition1.setByAngle(180);
//
//
//                rotateTransition1.play();
//                RotateTransition rotateTransition2=new RotateTransition(Duration.millis(1),imageview);
//                rotateTransition2.setAxis(Rotate.Y_AXIS);
//                rotateTransition2.setByAngle(180);
//
//
//                rotateTransition2.play();

                imageview.setVisible(false);
                label.setVisible(true);
                try {
                    sleep(500);
                } catch (Exception e) {
                }
                System.out.println("finished");
                back = true;
                if (isFront) {
                    new my2().start();
                }
            }
        }
    }
    public Pane getCard(){
        return this;
    }

}


