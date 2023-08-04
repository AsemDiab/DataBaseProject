package com.example.databaseproject;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import oracle.jdbc.pool.OracleDataSource;

import javax.swing.*;


import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;

import static com.example.databaseproject.TypeOfUseers.*;
//import static com.example.databaseproject.TypeOfUseers.Author;

public class BookLoginWindowController implements Initializable {


    @FXML
    ImageView imageView;
    Boolean out=false;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        new t().start();


    }
    class t extends Thread{
        @Override
        public void run() {
            try {
                sleep(3600);

            }
            catch (Exception exception){

            }
            System.out.println("done");
            imageView.setVisible(false);
        }



    }
    public void exit(MouseEvent mouseEvent){
        System.exit(0);
    }


    @FXML
    private TextField text;
    private Boolean isIn;
    static TypeOfUseers type ;
    @FXML
    private PasswordField passwordField;
    @FXML
    private TextField passwordText;

    @FXML
    public void change(ActionEvent e){
        if(((CheckBox) e.getSource()).isSelected()){
            passwordField.setVisible(false);
            passwordText.setText(passwordField.getText());
            passwordText.setVisible(true);
        }
        else{
            passwordText.setVisible(false);
            passwordField.setText(passwordText.getText());
            passwordField.setVisible(true);
        }

    }

    public  TypeOfUseers gettype(){
        return type;
    }
    public void swetchToHome(ActionEvent e) throws IOException {
        typelogin(e);
        if(isIn) {
            Parent root = FXMLLoader.load(getClass().getResource("HomePage.fxml"));
            Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
            stage.close();
            stage =new Stage();
            Scene scene = new Scene(root);
            stage.setX(50);
            stage.setY(10);
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        }
    }
    public void typelogin(ActionEvent e) throws IOException {
        try{
        OracleDataSource oracleDataSource = new OracleDataSource() ;
        oracleDataSource.setURL("jdbc:oracle:thin:@localhost:1521:xe");
        oracleDataSource.setUser("C##Asem");
        oracleDataSource.setPassword("123456");
        Connection connection=oracleDataSource.getConnection();
        connection.setAutoCommit(false);

        // Statement statement=connection.createStatement();
        String sql = "select * from person where person_id="+Integer.valueOf(text.getText());
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet resultSet=statement.executeQuery();
        resultSet.next();
            System.out.println(resultSet.getString(1).equals(text.getText()));
            System.out.println(resultSet.getString(7).equals(passwordField.getText()));
            User.name=resultSet.getString(2).trim()+" "+resultSet.getString(3).trim();
            //we are make name in homepage
        if(resultSet.getString(7).trim().equals(passwordField.getText().trim())||resultSet.getString(7).trim().equals(passwordText.getText().trim())){
            User.id=Integer.valueOf(text.getText());
            User.passward=passwordField.getText();
            if (resultSet.getString(5).trim().toLowerCase().equals("admin")){
                User.member_status="manager";
                type=Admin;
                isIn=true;
            }
            else if(resultSet.getString(5).trim().toLowerCase().equals("librarian ")){
                User.member_status="librarian";
                type=Librarian;
                isIn=true;
            }
            else if(resultSet.getString(5).trim().toLowerCase().equals("member")){
                User.member_status="member";
                type= Reader;
                isIn=true;
            }



        }
        else{
            isIn=false;
            JOptionPane.showMessageDialog(null,"id or password is wrong");
            System.out.println("غللط");
            System.out.println(text.getText());
        }
        }
        catch (Exception exception){
            isIn=false;
            JOptionPane.showMessageDialog(null,"id or password is wrong");
        }


    }


}
