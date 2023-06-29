package com.example.databaseproject;

import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.geometry.Insets;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.transform.Rotate;

import javafx.util.Duration;



public class JFlipCard  extends Pane {

        Label label;
        ImageView imageview;
        boolean back=true;
        boolean front=true;

        boolean isFront=true;





    JFlipCard(Image image){
        this.setPrefHeight(132.5);
        this.setPrefWidth(100);
        this.setBackground(new Background(new BackgroundFill(Color.BLUE, CornerRadii.EMPTY, Insets.EMPTY)));
        label=new Label("hello book");

        label.setVisible(false);
        imageview=new ImageView(image);
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
        getChildren().addAll(label,imageview);
    }
    JFlipCard(){
            this.setPrefHeight(132.5);
            this.setPrefWidth(100);
this.setBackground(new Background(new BackgroundFill(Color.BLUE, CornerRadii.EMPTY, Insets.EMPTY)));
            label=new Label("hello book");

            label.setVisible(false);
            //imageview=new ImageView(getClass().getResource("NarotoRamen.png").toExternalForm());
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
            getChildren().addAll(label,imageview);
        }




    class my2 extends Thread{
            @Override
            public void run() {
                back=false;
                front=false;
                RotateTransition rotateTransition = new RotateTransition(Duration.millis(1500), getCard());
                rotateTransition.setAxis(Rotate.Y_AXIS);
                rotateTransition.setFromAngle(0);
                rotateTransition.setToAngle(180);
                rotateTransition.setInterpolator(Interpolator.LINEAR);
                rotateTransition.setCycleCount(1);
                rotateTransition.setAutoReverse(false);
                rotateTransition.play();
                try {
                    sleep(750);
                }catch (Exception e){}
                imageview.setVisible(true);
                label.setVisible(false);
                try {
                    sleep(750);
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
                    RotateTransition rotateTransition = new RotateTransition(Duration.millis(1500), getCard());
                    rotateTransition.setAxis(Rotate.Y_AXIS);
                    rotateTransition.setFromAngle(0);
                    rotateTransition.setToAngle(180);
                    rotateTransition.setInterpolator(Interpolator.LINEAR);
                    rotateTransition.setCycleCount(1);
                    rotateTransition.setAutoReverse(false);
                    rotateTransition.play();
                    try {
                        sleep(750);
                    } catch (Exception e) {
                    }
                    imageview.setVisible(false);
                    label.setVisible(true);
                    try {
                        sleep(750);
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


