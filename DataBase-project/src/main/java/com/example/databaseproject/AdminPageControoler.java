package com.example.databaseproject;

import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;
import oracle.jdbc.pool.OracleDataSource;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.Objects;
import java.util.ResourceBundle;

public class AdminPageControoler implements Initializable {
    @FXML
    private DatePicker DatePublish;
    @FXML
    private TextField autherNameTextBox;

    @FXML
    private TextField bookIDTextBox;

    @FXML
    private TextField bookTitleTextBox;
    @FXML
    private TextField languageTextBox;
    @FXML
    private TextField numberOfPagesTextBox;
    @FXML
    private TextField sectionIDTextBox;

    @FXML
    private TextField totalCopyTextBox;
    @FXML
    private TextArea DescrptionTextBox;

    @FXML
    private MenuButton menu;



    @FXML
public Pane BookPane;
@FXML
public Pane UsersPane;
@FXML
public Button typeOfSearch33;
@FXML
public Pane EquipmentPane;
@FXML
public TextArea textA;
@FXML
public Button typeOfSearch22;
@FXML
public MenuItem AllMenuItem;
@FXML
public MenuItem WomanMenuItem1;
@FXML
public TableView TBook;
    @FXML
    public TableView TEquipment;
    @FXML
    public TableView TPerson;
    @FXML
    public TableView TBorrow;
    @FXML
    public MenuItem ReaderMenuItem;
    @FXML
    public MenuItem AdminMenuItem;
    @FXML
    public MenuItem LibrarinMenuItem;
    @FXML
    public Pane BorrowPane;
    @FXML
    public Button Users;
    @FXML
    public Button typeOfSearch;
    @FXML
    public Button typeOfSearch11;
    public boolean issingle=true;
    public boolean issingle1=true;
    public boolean issingle2=true;
    public boolean issingle3=true;
    @FXML
    public MenuItem item1;
    @FXML
    public MenuItem item2;
    @FXML
    public MenuItem item3;
    @FXML
    public MenuItem item4;
    @FXML
    public MenuItem item5;
    @FXML
    public MenuItem item6;

    @FXML
    public MenuButton GenderMenuB;
    @FXML
    public  MenuItem ManMenuItem;
    @FXML
    public  MenuItem WomanMenuItem;
public boolean isopenp=false;
    public boolean isopenB=true;
    public boolean isopenBo=false;
    public boolean isopenE=false;
    public Button Borrow;
    public Label intrestLabel1;
    public Label intrestLabel;
    public TextField VisableOrNotText;
    @FXML
public MenuButton state;
    @FXML
    public RadioButton radioButton;
    @FXML
    public PasswordField passf;
    public  void ManFun(){
        GenderMenuB.setText(ManMenuItem.getText());
    }
    public  void WomanFun(){
        GenderMenuB.setText(WomanMenuItem.getText());
    }
    public  void AllFun(){
        GenderMenuB.setText(WomanMenuItem1.getText());
    }
    public void menuhandel1(){
        menu.setText(item1.getText());
    }
    public void menuhandel2(){
        menu.setText(item2.getText());
    }
    public void menuhandel3(){
        menu.setText(item3.getText());
    }
    public void menuhandel4(){
        menu.setText(item4.getText());
    }
    public void menuhandel5(){
        menu.setText(item5.getText());
    }
    public void menuhandel6(){
        menu.setText(item6.getText());
    }
public void togglebutton(){
    if(issingle){
        typeOfSearch.setText("Multi Search");
        issingle=false;
    }
    else{
        typeOfSearch.setText("Single Search");
        issingle=true;
    }
}
    public void togglebutton1(){
        if(issingle1){
            typeOfSearch11.setText("Multi Search");
            issingle1=false;
        }
        else{
            typeOfSearch11.setText("Single Search");
            issingle1=true;
        }
    }
    public void togglebutton2(){
        if(issingle2){
            typeOfSearch22.setText("Multi Search");
            issingle2=false;
        }
        else{
            typeOfSearch22.setText("Single Search");
            issingle2=true;
        }
    }
    public void togglebutton3(){
        if(issingle3){
            typeOfSearch33.setText("Multi Search");
            issingle3=false;
        }
        else{
            typeOfSearch33.setText("Single Search");
            issingle3=true;
        }
    }
public void open_UsersPane(){
        if(!isopenp) {
            UsersPane.setVisible(true);
            FadeTransition f = new FadeTransition(Duration.seconds(0.3), UsersPane);
            f.setFromValue(0);
            f.setToValue(1);
            f.play();
            EquipmentPane.setVisible(false);
            BookPane.setVisible(false);
            BorrowPane.setVisible(false);
            isopenE=false;
            isopenB=false;
            isopenp=true;
            isopenBo=false;
            TBook.setVisible(false);
            TPerson.setVisible(true);
            TEquipment.setVisible(false);
            TBorrow.setVisible(false);
        }
}
    public void open_BookPane(){
        if(!isopenB) {
            BookPane.setVisible(true);
            FadeTransition f = new FadeTransition(Duration.seconds(0.3), BookPane);
            f.setFromValue(0);
            f.setToValue(1);
            f.play();
            UsersPane.setVisible(false);
            EquipmentPane.setVisible(false);

            BorrowPane.setVisible(false);

            isopenE=false;
            isopenB=true;
            isopenp=false;
            isopenBo=false;
            TBook.setVisible(true);
            TPerson.setVisible(false);
            TEquipment.setVisible(false);
            TBorrow.setVisible(false);
        }
    }
    public void open_EquipmentPane(){
        if(!isopenE) {
            EquipmentPane.setVisible(true);
            FadeTransition f = new FadeTransition(Duration.seconds(0.3), EquipmentPane);
            f.setFromValue(0);
            f.setToValue(1);
            f.play();
            UsersPane.setVisible(false);
            BookPane.setVisible(false);
            BorrowPane.setVisible(false);
            isopenE=true;
            isopenB=false;
            isopenp=false;
            isopenBo=false;
            TBook.setVisible(false);
            TPerson.setVisible(false);
            TEquipment.setVisible(true);
            TBorrow.setVisible(false);
        }
    }
    public void open_BorrowPane(){
        if(!isopenBo) {
            UsersPane.setVisible(false);
            EquipmentPane.setVisible(false);
            BookPane.setVisible(false);
            BorrowPane.setVisible(true);
            FadeTransition f = new FadeTransition(Duration.seconds(0.3), BorrowPane);
            f.setFromValue(0);
            f.setToValue(1);
            f.play();
            isopenE = false;
            isopenB = false;
            isopenp = false;
            isopenBo = true;
            TBook.setVisible(false);
            TPerson.setVisible(false);
            TEquipment.setVisible(false);
            TBorrow.setVisible(true);

        }
    }


    /////////////////////////////////////////////
    //            switch scenes                //
    /////////////////////////////////////////////
    public void swetchToHome(ActionEvent e) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("HomePage.fxml")));
        Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void stateOfAdmin(){
        state.setText(AdminMenuItem.getText());
    }
    public void stateOfLibrarin(){
        state.setText(LibrarinMenuItem.getText());
    }
    public void stateOfReader(){
        state.setText(ReaderMenuItem.getText());
    }
    public void stateOfAll(){
        state.setText(AllMenuItem.getText());
    }
//////////////////////radio btn
    public void radioButtonAction(){
        if (radioButton.isSelected()){
            passf.setPromptText(passf.getText());
            passf.setText("");
            passf.setDisable(true);

        }
        else {
            passf.setText(passf.getPromptText());
            passf.setPromptText("");
            passf.setDisable(false);
        }
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        if(BookLoginWindowController.type.equals(TypeOfUseers.Admin)){
            Users.setVisible(true);
        }
        else if(BookLoginWindowController.type.equals(TypeOfUseers.Librarian)){
            Users.setVisible(false);
        }
        //textA.setWrapText(true);
    }
    @FXML
    void addBook(ActionEvent actionEvent){
        try {
            OracleDataSource oracleDataSource = new OracleDataSource();
            oracleDataSource.setURL("jdbc:oracle:thin:@localhost:1521:xe");
            oracleDataSource.setUser("C##Asem");
            oracleDataSource.setPassword("123456");
            Connection connection=oracleDataSource.getConnection();


            // bbokID,Book_title,AutherFname,AutherLAstName,numberOFPAge,DEscrption,LAnguahe,Avalibility,NumberofborrowedBook,TotalCopies,Sectionid,Type,Photo,DateofPublish
            // Statement statement=connection.createStatement();
            int type=0;
            if(menu.getText().toLowerCase().equals("all")){
                System.out.println("you cant");
            }
            else if(menu.getText().toLowerCase().equals("manga")){
                // اكتب الكود الي بضيف ع المانجا
                type=5;
            }
            else if(menu.getText().toLowerCase().equals("novels")){
                type=1;
            }
            else if(menu.getText().toLowerCase().equals("academic")){
type=2;

            }
            else if(menu.getText().toLowerCase().equals("human devilopment")){

type=4;
            }
            else if(menu.getText().toLowerCase().equals("fantasy")){
type=3;

            }
            String s[]=autherNameTextBox.getText().split(" ");
            LocalDate localDate=DatePublish.getValue();
connection.setAutoCommit(false);

            String sql = "INSERT INTO book VALUES ("
                    +bookIDTextBox.getText()+"," +
                    "'"+bookTitleTextBox+"'," +
                    "'"+s[0]+"'," +
                    "'"+s[1]+"' ," +
                    numberOfPagesTextBox.getText()+"," +
                    "'    " +DescrptionTextBox.getText()+"'," +
                    "'"+languageTextBox.getText()+"'," +
                    "'Y'," +
                    "0," +
                    totalCopyTextBox.getText()+"," +
                    sectionIDTextBox.getText()+","
                    +type+"," +
                    "?,"+
                    " to_date('"+localDate.getDayOfMonth()+"-"+localDate.getMonthValue()+"-"+localDate.getYear()+"','dd-mm-yyyy'))";
            System.out.println(localDate.getDayOfMonth()+"-"+localDate.getMonthValue()+"-"+localDate.getYear());

            PreparedStatement statement = connection.prepareStatement(sql);

            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setFileFilter(new FileNameExtensionFilter("Image Files", "jpg", "jpeg", "png"));
            fileChooser.showOpenDialog(null);
            File file = fileChooser.getSelectedFile();
            System.out.println(file.getName());
            statement.setBinaryStream(1, new FileInputStream(file));
            statement.executeUpdate();
            connection.commit();
            connection.close();
            System.out.println("add successfully");
        }catch (Exception exception){
            JOptionPane.showMessageDialog(null,exception);
        }
    }
@FXML
    void updateBook(ActionEvent actionEvent){

}
@FXML
    void DeleteBook(ActionEvent actionEvent){}
    @FXML
    void SearchBook(ActionEvent actionEvent){
        try {
            OracleDataSource oracleDataSource = new OracleDataSource();
            oracleDataSource.setURL("jdbc:oracle:thin:@localhost:1521:xe");
            oracleDataSource.setUser("C##Asem");
            oracleDataSource.setPassword("123456");
            Connection connection=oracleDataSource.getConnection();
            String s[]=autherNameTextBox.getText().split(" ");
            int type=0;
            if(menu.getText().toLowerCase().equals("all")){
                System.out.println("you cant");
            }
            else if(menu.getText().toLowerCase().equals("manga")){
                // اكتب الكود الي بضيف ع المانجا
                type=5;
            }
            else if(menu.getText().toLowerCase().equals("novels")){
                type=1;
            }
            else if(menu.getText().toLowerCase().equals("academic")){
                type=2;

            }
            else if(menu.getText().toLowerCase().equals("human devilopment")){

                type=4;
            }
            else if(menu.getText().toLowerCase().equals("fantasy")){
                type=3;

            }

            System.out.println("Quey");
            String sql="select * from book ";
        if(issingle){

            if(!bookIDTextBox.getText().equals(""))
             sql+= "where Book_id="+bookIDTextBox.getText();
            else if(!bookTitleTextBox.getText().equals(""))
                sql+="where Book_title='"+bookTitleTextBox+"'";
            else if (!sectionIDTextBox.getText().equals(""))
                sql+="where section_id="+sectionIDTextBox.getText();
            else if (!languageTextBox.getText().equals("")) {
                sql+="where language="+languageTextBox.getText();
            }
            else if(type!=0)
                sql+="where type="+type;
            else if(!autherNameTextBox.getText().equals("")&&s.length>1)
                sql+="where Auther_FName=' "+s[0]+"' and Auther_LName='"+s[1]+"'";




        }
        else{
            Boolean flag=true;
            if(!bookIDTextBox.getText().equals("")) {

                if (flag){
                    sql+="where ";

                    flag=false;
                }else {
                    sql+=" and ";
                }
                sql+="Book_id="+bookIDTextBox.getText();
            }
            else if(!bookTitleTextBox.getText().equals("")){

                if (flag){
                    sql+="where ";

                    flag=false;
                }else {
                    sql+=" and ";
                }
                sql+="Book_title='"+bookTitleTextBox.getText()+"'";
            }
            else if (!sectionIDTextBox.getText().equals("")){

                if (flag){
                    sql+="where ";

                    flag=false;
                }else {
                    sql+=" and ";
                }
                sql+="section_id="+sectionIDTextBox.getText();
            }
            else if (!languageTextBox.getText().equals("")) {
                {

                    if (flag){
                        sql+="where ";

                        flag=false;
                    }else {
                        sql+=" and ";
                    }
                }
                sql+="language='"+languageTextBox.getText()+"'";
            }
            else if(type!=0){

                if (flag){
                    sql+="where ";

                    flag=false;
                }else {
                    sql+=" and ";
                }
                sql+="where type="+type;
            }

            else if(!autherNameTextBox.getText().equals("")&&s.length>1){

                if (flag){
                    sql+="where ";

                    flag=false;
                }else {
                    sql+=" and ";
                }
                sql+="where Auther_FName=' "+s[0]+"' and Auther_LName='"+s[1]+"'";
            }

        }
            PreparedStatement statement = connection.prepareStatement(sql);

            ResultSet resultSet=statement.executeQuery();
            resultSet.next();
            System.out.println(resultSet.getString("Book_title"));
//            connection.commit();
            connection.close();
    }
    catch (Exception exception){
            JOptionPane.showMessageDialog(null,exception);
    }
    }

}
