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
    Label numberOfBrrowing;
    @FXML
    private TextField BorrowingID;
    @FXML
    private TextField BBookID;
    @FXML
    private TextField BPeersonID;

    @FXML
    private DatePicker DAteOFBorrowing;

    @FXML
    private DatePicker DateOfReturn;

    @FXML
    private TextField EquipmentType;
    @FXML
    private TextField eSectionID;

    @FXML
    private TextField equipmentID;
    @FXML
    private MenuItem AdminMenuItem;

    @FXML
    private MenuItem AllMenuItem;

    @FXML
    private Button BackB;

    @FXML
    private Button Book;

    @FXML
    private Pane BookPane;

    @FXML
    private Button Borrow;

    @FXML
    private Pane BorrowPane;

    @FXML
    private DatePicker DatePublish;

    @FXML
    private TextArea DescrptionTextBox;

    @FXML
    private Button Equipment;

    @FXML
    private Pane EquipmentPane;

    @FXML
    private MenuButton GenderMenuB;

    @FXML
    private DatePicker JoinDate;

    @FXML
    private MenuItem LibrarinMenuItem;

    @FXML
    private MenuItem ManMenuItem;

    @FXML
    private MenuItem ReaderMenuItem;

    @FXML
    private TableView<?> TBook;

    @FXML
    private TableView<?> TBorrow;

    @FXML
    private TableView<?> TEquipment;

    @FXML
    private TableView<?> TPerson;

    @FXML
    private Button Users;

    @FXML
    private Pane UsersPane;

    @FXML
    private TextField VisableOrNotText;

    @FXML
    private MenuItem WomanMenuItem;

    @FXML
    private MenuItem WomanMenuItem1;

    @FXML
    private TextField autherNameTextBox;

    @FXML
    private TextField bookIDTextBox;

    @FXML
    private TextField bookTitleTextBox;

    @FXML
    private Label intrestLabel;

    @FXML
    private Label intrestLabel1;

    @FXML
    private Label intrestLabel11;

    @FXML
    private MenuItem item1;

    @FXML
    private MenuItem item2;

    @FXML
    private MenuItem item3;

    @FXML
    private MenuItem item4;

    @FXML
    private MenuItem item5;

    @FXML
    private MenuItem item6;

    @FXML
    private TextField languageTextBox;

    @FXML
    private MenuButton menu;

    @FXML
    private TextField numberOfPagesTextBox;

    @FXML
    private PasswordField passf;

    @FXML
    private TextField personIDTextBox;

    @FXML
    private RadioButton radioButton;

    @FXML
    private TextField sectionIDTextBox;

    @FXML
    private MenuButton state;

    @FXML
    private TextField totalCopyTextBox;

    @FXML
    private Button typeOfSearch;

    @FXML
    private Button typeOfSearch11;

    @FXML
    private Button typeOfSearch22;

    @FXML
    private Button typeOfSearch33;

    @FXML
    private TextField userNameTextBox;

    public boolean issingle=true;
    public boolean issingle1=true;
    public boolean issingle2=true;
    public boolean issingle3=true;

public boolean isopenp=false;
    public boolean isopenB=true;
    public boolean isopenBo=false;
    public boolean isopenE=false;

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
        state.setText("admin");
    }
    public void stateOfLibrarin(){
        state.setText("librarian");
    }
    public void stateOfReader(){
        state.setText("member");
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
                    "'"+bookTitleTextBox.getText()+"'," +
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
    void updateBook(ActionEvent actionEvent) {

}
@FXML
    void DeleteBook(ActionEvent actionEvent){
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

        String sql="delete  from book ";
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

       statement.executeUpdate();
       connection.commit();
        connection.close();
}
    catch (Exception exception){
        JOptionPane.showMessageDialog(null,exception);
    }
    }
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
                    sql+="where UPPer(book_title) like Upper('"+bookTitleTextBox.getText()+"%')";
                else if (!sectionIDTextBox.getText().equals(""))
                    sql+="where section_id="+sectionIDTextBox.getText();
                else if (!languageTextBox.getText().equals("")) {
                    sql+="where language like '"+languageTextBox.getText()+"%'";
                }
                else if(type!=0)
                    sql+="where type="+type;
                else if(!autherNameTextBox.getText().equals("")&&s.length>1)
                    sql+="where  Auther_FName like '"+s[0]+"%' and Auther_LName like '"+s[1]+"%'";




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
                if(!bookTitleTextBox.getText().equals("")){

                    if (flag){
                        sql+="where ";

                        flag=false;
                    }else {
                        sql+=" and ";
                    }

                    sql+="UPPer(book_title) like Upper('"+bookTitleTextBox.getText()+"%')";
                }
                if (!sectionIDTextBox.getText().equals("")){

                    if (flag){
                        sql+="where ";

                        flag=false;
                    }else {
                        sql+=" and ";
                    }
                    sql+="section_id="+sectionIDTextBox.getText();
                }
                if (!languageTextBox.getText().equals("")) {
                    {

                        if (flag){
                            sql+="where ";

                            flag=false;
                        }else {
                            sql+=" and ";
                        }
                    }
                    sql+="language like '"+languageTextBox.getText()+"%'";
                }
                if(type!=0){

                    if (flag){
                        sql+="where ";

                        flag=false;
                    }else {
                        sql+=" and ";
                    }
                    sql+="where type="+type;
                }

                if(!autherNameTextBox.getText().equals("")&&s.length>1){

                    if (flag){
                        sql+="where ";

                        flag=false;
                    }else {
                        sql+=" and ";
                    }
                    sql+=" Auther_FName like '"+s[0]+"%' and Auther_LName like '"+s[1]+"%'";
                }

            }
            System.out.println(sql);
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


    @FXML
    void addPerson(ActionEvent actionEvent){

        try {
            OracleDataSource oracleDataSource = new OracleDataSource();
            oracleDataSource.setURL("jdbc:oracle:thin:@localhost:1521:xe");
            oracleDataSource.setUser("C##Asem");
            oracleDataSource.setPassword("123456");
            Connection connection=oracleDataSource.getConnection();



            char gender='G';
            if(GenderMenuB.getText().toLowerCase().equals("all")){
                System.out.println("you cant");
            }
            else if(GenderMenuB.getText().toLowerCase().equals("man")){
                // اكتب الكود الي بضيف ع المانجا
                gender='M';
            }
            else if(GenderMenuB.getText().toLowerCase().equals("woman")){
                gender='F';
            }

            String s[]=userNameTextBox.getText().split(" ");
            LocalDate localDate=JoinDate.getValue();
            connection.setAutoCommit(false);

            String sql = "INSERT INTO person VALUES ("
                    +personIDTextBox.getText()
                    +",'"+s[0]+"'"+
                    ",'"+s[1]+"'"+
                    ", to_date('"+localDate.getDayOfMonth()+"-"+localDate.getMonthValue()+"-"+localDate.getYear()+"','dd-mm-yyyy'),'"+
                    state.getText().toLowerCase()
                    +"','"+gender+"'," +
                    "'"+passf.getText()+"')";
            System.out.println(localDate.getDayOfMonth()+"-"+localDate.getMonthValue()+"-"+localDate.getYear());
            String sql2="insert into member values ("+personIDTextBox.getText()+","+personIDTextBox.getText()+",'novel')";
if(state.getText().toLowerCase().equals("admin")){
    //insert into manager values (11006,11006,15001,to_date('15-5-1999','dd-mm-yyyy'));
   sql2="insert into manager values (" +
           personIDTextBox.getText()+","
           +personIDTextBox.getText()+","+
           VisableOrNotText.getText()+
           ",to_date('"+localDate.getDayOfMonth()+"-"+localDate.getMonthValue()+"-"+localDate.getYear()+"','dd-mm-yyyy'))";}
            System.out.println(sql2.equals("insert into manager values (11006,11006,15001,to_date('15-5-1999','dd-mm-yyyy'));"));
            System.out.println(sql2);
            System.out.println("insert into manager values (11006,11006,15001,to_date('15-5-1999','dd-mm-yyyy'));");
if(state.getText().toLowerCase().equals("librarian")) {
    sql2 = "insert into librarian values ("
            + personIDTextBox.getText() +
            "," + personIDTextBox.getText() +
            "," + VisableOrNotText.getText() +
            ",(select supervisor_id from section where section_id=" + VisableOrNotText.getText() + "))";
}

PreparedStatement statement = connection.prepareStatement(sql);
            PreparedStatement statement1=connection.prepareStatement(sql2);

            statement.executeUpdate();
            connection.commit();
            statement1.executeUpdate();
            connection.commit();
            connection.close();
            System.out.println("add successfully");
        }catch (Exception exception){
            JOptionPane.showMessageDialog(null,exception);
        }
    }
    @FXML
    void updatePerson(ActionEvent actionEvent) {

    }
    @FXML
    void deletePerson(ActionEvent actionEvent){

        try{
            OracleDataSource oracleDataSource = new OracleDataSource();
            oracleDataSource.setURL("jdbc:oracle:thin:@localhost:1521:xe");
            oracleDataSource.setUser("C##Asem");
            oracleDataSource.setPassword("123456");
            Connection connection=oracleDataSource.getConnection();

            PreparedStatement statement2 = connection.prepareStatement("select member_status from person where person_id="+personIDTextBox.getText());
            ResultSet resultSet=statement2.executeQuery();
            connection.setAutoCommit(false);
            if(resultSet.next()) {
                String sql2 = " ";
                switch (resultSet.getString(1).trim().toLowerCase()) {
                    case "admin":
                         sql2 = "delete From manager where person_id=" + personIDTextBox.getText();
                        break;
                    case "librarian":
                        sql2 = "delete From librarian where person_id=" + personIDTextBox.getText();
                        break;
                    case "member":
                        sql2 = "delete From member where person_id=" + personIDTextBox.getText();
                        break;

                }
                String sql = "delete from person where person_id=" + personIDTextBox.getText();

                PreparedStatement statement = connection.prepareStatement(sql);
                PreparedStatement statement1 = connection.prepareStatement(sql2);

                statement1.executeUpdate();
                connection.commit();
                statement.executeUpdate();
                connection.commit();

                connection.close();
            }
        }catch (Exception exception){
            JOptionPane.showMessageDialog(null,exception);

        }
    }
    @FXML
    void searchPerson(ActionEvent actionEvent){
        try{
            OracleDataSource oracleDataSource = new OracleDataSource();
            oracleDataSource.setURL("jdbc:oracle:thin:@localhost:1521:xe");
            oracleDataSource.setUser("C##Asem");
            oracleDataSource.setPassword("123456");
            Connection connection=oracleDataSource.getConnection();
            char gender='G';
            if(GenderMenuB.getText().toLowerCase().equals("all")){
                System.out.println("you cant");
            }
            else if(GenderMenuB.getText().toLowerCase().equals("man")){
                // اكتب الكود الي بضيف ع المانجا
                gender='M';
            }
            else if(GenderMenuB.getText().toLowerCase().equals("woman")){
                gender='F';
            }

            String s[]=userNameTextBox.getText().split(" ");


            System.out.println("Quey");
            String sql="select * from person ";
            if(issingle1){
                if(!personIDTextBox.getText().equals(""))
                    sql+= "where person_id="+personIDTextBox.getText();
                else if (!VisableOrNotText.getText().equals(""))
                    sql+="where section_id="+VisableOrNotText.getText();
                else if(gender!='G')
                    sql+="where gender="+gender;
                else if(!userNameTextBox.getText().equals("")&&s.length>1)
                    sql+="FName like '"+s[0]+"%' and LName like '"+s[1]+"%'";
                else if (!state.getText().equals("all")) {
                    sql+="where member_status like ('"+state.getText().toLowerCase()+"%')";//
                }


            }
            else{
                Boolean flag=true;
                if(!personIDTextBox.getText().equals("")) {

                    if (flag){
                        sql+="where ";

                        flag=false;
                    }else {
                        sql+=" and ";
                    }
                    sql+="person_id="+personIDTextBox.getText();
                }
                if(!state.getText().equals("all")){

                    if (flag){
                        sql+="where ";

                        flag=false;
                    }else {
                        sql+=" and ";
                    }

                    sql+="member_status like ('"+state.getText().toLowerCase()+"%')";
                }
                if (!VisableOrNotText.getText().equals("")){

                    if (flag){
                        sql+="where ";

                        flag=false;
                    }else {
                        sql+=" and ";
                    }
                    sql+="section_id="+VisableOrNotText.getText();
                }

                if(gender!='G'){

                    if (flag){
                        sql+="where ";

                        flag=false;
                    }else {
                        sql+=" and ";
                    }
                    sql+="where type="+gender;
                }

                if(!userNameTextBox.getText().equals("")&&s.length>1){

                    if (flag){
                        sql+="where ";

                        flag=false;
                    }else {
                        sql+=" and ";
                    }
                    sql+="FName like '"+s[0]+"%' and LName like '"+s[1]+"%'";
                }

            }
            System.out.println(sql);
            PreparedStatement statement = connection.prepareStatement(sql);

            ResultSet resultSet=statement.executeQuery();
            resultSet.next();
            System.out.println(resultSet.getString(2));
//            connection.commit();
            connection.close();
        }
        catch (Exception exception){
            JOptionPane.showMessageDialog(null,exception);
        }
    }

    @FXML
    void insertBorrowing(ActionEvent actionEvent){
        try {
            OracleDataSource oracleDataSource = new OracleDataSource();
            oracleDataSource.setURL("jdbc:oracle:thin:@localhost:1521:xe");
            oracleDataSource.setUser("C##Asem");
            oracleDataSource.setPassword("123456");
            Connection connection=oracleDataSource.getConnection();
            LocalDate localDate=DateOfReturn.getValue();
            LocalDate localDate1=DateOfReturn.getValue();
            connection.setAutoCommit(false);

            String sql = "INSERT INTO Borrowing VALUES ("
                    +
                       BorrowingID.getText()  +
                    ","
                    +BPeersonID.getText()+","
                   +BBookID.getText()+
                    ", to_date('"+localDate.getDayOfMonth()+"-"+localDate.getMonthValue()+"-"+localDate.getYear()+"','dd-mm-yyyy'),"+
                    " to_date('"+localDate1.getDayOfMonth()+"-"+localDate1.getMonthValue()+"-"+localDate1.getYear()+"','dd-mm-yyyy')"+
                  " ,'No')";

            PreparedStatement statement = connection.prepareStatement(sql);

            statement.executeUpdate();
            connection.commit();
            PreparedStatement statement1=connection.prepareStatement("select count(Borrowing_id) from Borrowing  ");
            ResultSet resultSet1=statement1.executeQuery();
            resultSet1.next();
            numberOfBrrowing.setText("number of borrowing: "+resultSet1.getString(1));
            connection.close();
            System.out.println("add successfully");
        }catch (Exception exception){
            JOptionPane.showMessageDialog(null,exception);
        }
    }
    @FXML
    void updateBorrowing(ActionEvent actionEvent){}
    @FXML
    void selectBorrowing(ActionEvent actionEvent){
        try {

            OracleDataSource oracleDataSource = new OracleDataSource();
            oracleDataSource.setURL("jdbc:oracle:thin:@localhost:1521:xe");
            oracleDataSource.setUser("C##Asem");
            oracleDataSource.setPassword("123456");
            Connection connection=oracleDataSource.getConnection();

            String sql="select * from Borrowing";
            Boolean flag=true;
            connection.setAutoCommit(false);
            if (issingle3){
                if (!BorrowingID.getText().equals("")) {
                    if (flag) {
                        sql += " where ";

                        flag = false;
                    } else {
                        sql += " and ";
                    }
                    sql += " Borrowing_id=" + BorrowingID.getText();
                }
                if (!BBookID.getText().equals("")) {
                    if (flag) {
                        sql += " where ";

                        flag = false;
                    } else {
                        sql += " and ";
                    }
                    sql += " Book_id=" + BBookID.getText();
                }
                if (!BPeersonID.getText().equals("")) {
                    if (flag) {
                        sql += " where ";

                        flag = false;
                    } else {
                        sql += " and ";
                    }
                    sql += " person_id=" + BPeersonID.getText();
                }
            }
            else{
                if (!BorrowingID.getText().equals("")) {
                    if (flag) {
                        sql += " where ";

                        flag = false;
                    } else {
                        sql += " and ";
                    }
                    sql += " Borrowing_id=" + BorrowingID.getText();
                }
                if (!BBookID.getText().equals("")) {
                    if (flag) {
                        sql += " where ";

                        flag = false;
                    } else {
                        sql += " and ";
                    }
                    sql += " Book_id=" + BBookID.getText();
                }
                if (!BPeersonID.getText().equals("")) {
                    if (flag) {
                        sql += " where ";

                        flag = false;
                    } else {
                        sql += " and ";
                    }
                    sql += " person_id=" + BPeersonID.getText();
                }
            }

            PreparedStatement statement=connection.prepareStatement(sql);
            ResultSet resultSet=statement.executeQuery();
            resultSet.next();
            System.out.println(resultSet.getString(1));
            connection.commit();


          PreparedStatement statement1=connection.prepareStatement("select count(Borrowing_id) from Borrowing ");
          ResultSet resultSet1=statement1.executeQuery();
          resultSet1.next();
            numberOfBrrowing.setText("number of borrowing: "+resultSet1.getString(1));
            connection.close();


        }catch (Exception exception){
            JOptionPane.showMessageDialog(null,exception);
        }
    }
    @FXML
    void deleteBorrowing(ActionEvent actionEvent){
        try{
            OracleDataSource oracleDataSource = new OracleDataSource();
            oracleDataSource.setURL("jdbc:oracle:thin:@localhost:1521:xe");
            oracleDataSource.setUser("C##Asem");
            oracleDataSource.setPassword("123456");
            Connection connection=oracleDataSource.getConnection();

            String sql="delete from borrowing";
            Boolean flag=true;
            connection.setAutoCommit(false);

            if(!BorrowingID.getText().equals("")){
                if (flag){
                    sql+=" where ";

                    flag=false;
                }else {
                    sql+=" and ";
                }
                sql+=" Borrowing_id="+BorrowingID.getText();}
            if(!BBookID.getText().equals("")) {
                if (flag) {
                    sql += " where ";

                    flag = false;
                } else {
                    sql += " and ";
                }
                sql += " Book_id=" + BBookID.getText();
            }
            if(!BPeersonID.getText().equals("")){
                if (flag) {
                    sql += " where ";

                    flag = false;
                } else {
                    sql += " and ";
                }
                sql += " person_id=" + BPeersonID.getText();
            }


            PreparedStatement statement=connection.prepareStatement(sql);
            statement.executeUpdate();
            connection.commit();
            PreparedStatement statement1=connection.prepareStatement("select count(Borrowing_id) from Borrowing ");
            ResultSet resultSet1=statement1.executeQuery();
            resultSet1.next();
            numberOfBrrowing.setText("number of borrowing: "+resultSet1.getString(1));
            connection.close();

        }catch (Exception exception){
            JOptionPane.showMessageDialog(null,exception);
        }

    }

    @FXML
    void returnBook(ActionEvent actionEvent){
        try {
            OracleDataSource oracleDataSource = new OracleDataSource();
            oracleDataSource.setURL("jdbc:oracle:thin:@localhost:1521:xe");
            oracleDataSource.setUser("C##Asem");
            oracleDataSource.setPassword("123456");
            Connection connection=oracleDataSource.getConnection();
            LocalDate localDate=DateOfReturn.getValue();
            LocalDate localDate1=DateOfReturn.getValue();
            connection.setAutoCommit(false);


            String sql="update borrowing set is_returned=Yes";
            String invalidQuery="update borrowing set is_returned=Yes";
            Boolean flag=true;
            connection.setAutoCommit(false);

            if(!BorrowingID.getText().equals("")){
                if (flag){
                    sql+=" where ";

                    flag=false;
                }else {
                    sql+=" and ";
                }
                sql+=" Borrowing_id="+BorrowingID.getText();}
            if(!BBookID.getText().equals("")) {
                if (flag) {
                    sql += " where ";

                    flag = false;
                } else {
                    sql += " and ";
                }
                sql += " Book_id=" + BBookID.getText();
            }
            if(!BPeersonID.getText().equals("")){
                if (flag) {
                    sql += " where ";

                    flag = false;
                } else {
                    sql += " and ";
                }
                sql += " person_id=" + BPeersonID.getText();
            }


            PreparedStatement statement=connection.prepareStatement(sql);
            if (!sql.trim().equals(invalidQuery))statement.executeUpdate();
            connection.commit();
            connection.close();

        }catch (Exception exception){
            JOptionPane.showMessageDialog(null,exception);
        }
    }

    @FXML
    void insertEqupment(ActionEvent actionEvent){
        try {
            OracleDataSource oracleDataSource = new OracleDataSource();
            oracleDataSource.setURL("jdbc:oracle:thin:@localhost:1521:xe");
            oracleDataSource.setUser("C##Asem");
            oracleDataSource.setPassword("123456");
            Connection connection=oracleDataSource.getConnection();
            String sql="insert into equipment values("+equipmentID.getText()+","+eSectionID.getText()+",'"+EquipmentType.getText()+"')";
        PreparedStatement statement=connection.prepareStatement(sql);
        statement.executeUpdate();
        connection.close();
        }catch (Exception exception){
            JOptionPane.showMessageDialog(null,exception);
        }
    }
    @FXML
    void updateEqupment(ActionEvent actionEvent){

    }
    @FXML
    void selectEqupment(ActionEvent actionEvent){
        try{
            OracleDataSource oracleDataSource = new OracleDataSource();
            oracleDataSource.setURL("jdbc:oracle:thin:@localhost:1521:xe");
            oracleDataSource.setUser("C##Asem");
            oracleDataSource.setPassword("123456");
            Connection connection=oracleDataSource.getConnection();
            String sql="select * from equipment ";
            if(issingle2){
                if(!equipmentID.getText().equals(""))
                    sql+="where equipment_id="+equipmentID.getText();
                else if(!eSectionID.getText().equals("")){
                    sql+="where section_id="+eSectionID.getText();
                } else if (!EquipmentType.getText().equals("")) {
                    sql+="where Equipment_type like('"+EquipmentType.getText()+"%')";
                }

            }else {
                Boolean flag=true;


                if(!equipmentID.getText().equals("")){
                    if (flag){
                        sql+="where ";

                        flag=false;
                    }else {
                        sql+=" and ";
                    }
                    sql+=" equipment_id="+equipmentID.getText();}
                if(!eSectionID.getText().equals("")){
                    if (flag){
                        sql+="where ";

                        flag=false;
                    }else {
                        sql+=" and ";
                    }
                    sql+=" section_id="+eSectionID.getText();
                } if (!EquipmentType.getText().equals("")) {
                    if (flag){
                        sql+="where ";

                        flag=false;
                    }else {
                        sql+=" and ";
                    }
                    sql+=" Equipment_type like('"+EquipmentType.getText()+"%')";
                }

            }
            PreparedStatement statement=connection.prepareStatement(sql);
            ResultSet resultSet=statement.executeQuery();
            if(resultSet.next())
                System.out.println(resultSet.getString(1)+"\t"+resultSet.getString(2)+"\t"+resultSet.getString(3)+"\t");
            connection.close();
        }catch (Exception exception){
            JOptionPane.showMessageDialog(null,exception);
        }
    }
    @FXML
    void deleteEqupment(ActionEvent actionEvent){
        try{
            OracleDataSource oracleDataSource = new OracleDataSource();
            oracleDataSource.setURL("jdbc:oracle:thin:@localhost:1521:xe");
            oracleDataSource.setUser("C##Asem");
            oracleDataSource.setPassword("123456");
            Connection connection=oracleDataSource.getConnection();

            String sql="delete from equipment";
            Boolean flag=true;
            connection.setAutoCommit(false);

            if(!equipmentID.getText().equals("")){
                if (flag){
                    sql+=" where ";

                    flag=false;
                }else {
                    sql+=" and ";
                }
                sql+=" equipment_id="+equipmentID.getText();}
            if(!eSectionID.getText().equals("")){
                if (flag){
                    sql+=" where ";

                    flag=false;
                }else {
                    sql+=" and ";
                }
                sql+=" section_id="+eSectionID.getText();
            } if (!EquipmentType.getText().equals("")) {
                if (flag){
                    sql+=" where ";

                    flag=false;
                }else {
                    sql+=" and ";
                }
                sql+=" Equipment_type like('"+EquipmentType.getText()+"%')";
            }


        PreparedStatement statement=connection.prepareStatement(sql);
            statement.executeUpdate();
            connection.commit();
            connection.close();

        }catch (Exception exception){
            JOptionPane.showMessageDialog(null,exception);
        }

    }
}
