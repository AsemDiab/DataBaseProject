package com.example.databaseproject;

import javafx.animation.FadeTransition;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;
import oracle.jdbc.pool.OracleDataSource;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Objects;
import java.util.ResourceBundle;
public class HomeController implements Initializable {
    //important

    private Parent root;
    private Stage stage;
    private Scene scene;
    //////////////////////////

    ///////////////////////////
    private Boolean inout = false;//هاي مشان اعرف اذا انو السيرش مفتوح ولا مسكر
    //photo
    @FXML
    public Button adminB;
    @FXML
    public ImageView AnimeImage;
    @FXML
    public Pane AnimePane;
    @FXML
    public Pane NovelsPane;
    @FXML
    public ImageView exitview;
    @FXML
    public RadioButton radioButton;
    @FXML
    public PasswordField passf;
    @FXML
    public ImageView CatagorieView;

    @FXML
    public ImageView HomeIcon;

    @FXML
    AnchorPane contantPane;
    @FXML
    public Button authorB;
    @FXML
    public Circle uuuu;//هاي للبورفايل
    @FXML
    private TextField searchf;
    @FXML
    public Button AnimePaneB;
    @FXML
    private Button searcht;
    @FXML
    private Pane transpane;
    @FXML
    private Pane Pane4;
    @FXML
    private Pane Pane5;
    @FXML
    private Pane Pane6;
    @FXML
    Label nameL;
    @FXML
    Label typeL;
    @FXML
    public Pane ActionPane;
    @FXML
    private Button OpenSideManu;
    @FXML
    private Button profileb;
    @FXML
    private Button profileb1;
    @FXML
    private Circle backarrow1;
    @FXML
    private Pane HomePane;
    @FXML
    private Pane HomePane1;

    @FXML
    AnchorPane side;

    @FXML
    public Button authorB1;
    @FXML
    AnchorPane side1;
    public int anyPaneIsOpen = 1;

    /////////////////////////////////////////////
    //            switch scenes                //
    /////////////////////////////////////////////
   /* public void swetchToProfile(ActionEvent e) throws IOException {
        root= FXMLLoader.load(getClass().getResource("ProfilePage.fxml"));
        stage=(Stage)((Node)e.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setResizable(false);
        stage.setX(350);
        stage.setY(50);
        stage.setScene(scene);
        stage.show();
    }*/
    public void swetchLogIn(ActionEvent e) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("BookLoginWindow.fxml")));
        stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        stage.close();
        stage=new Stage();
        scene = new Scene(root);
        stage.setResizable(false);
        stage.setX(350);
        stage.setY(50);
        stage.setScene(scene);
        scene.setFill(Color.TRANSPARENT);
        stage.initStyle(StageStyle.TRANSPARENT);

        stage.show();
    }

    public void swetchAdminPage(ActionEvent e) throws IOException {
        root = FXMLLoader.load(getClass().getResource("AdminPage.fxml"));
        stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        stage.setResizable(false);
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void swetchLibrarianPage(ActionEvent e) throws IOException {
        root = FXMLLoader.load(getClass().getResource("LibrianPage.fxml"));
        stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        stage.setResizable(false);
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void swetchAuthorPage(ActionEvent e) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Author.fxml"));
        stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    /////////////////////////////////////////////
    //               methods                   //
    /////////////////////////////////////////////
    public void closesearch() {//هذا الفنكشن مسؤل عن اغلاق البحث يجب استخدامه عند الضغط علي اي زر اخر
        TranslateTransition searchTtrans = new TranslateTransition();
        TranslateTransition searchBtrans = new TranslateTransition();
        TranslateTransition searchPtrans = new TranslateTransition();
        searchTtrans.setNode(searchf);
        searchBtrans.setNode(searcht);
        searchPtrans.setNode(transpane);
        if (searchf.getText().isEmpty()) {
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

    @FXML
    FlowPane homePane;
    ///////////////////////////////
    //Catagori
    ///////////////////////////////
    public void closePane() {
        if (anyPaneIsOpen == 1) {
            FadeTransition f = new FadeTransition(Duration.seconds(0.5), AnimePane);
            f.setFromValue(1);
            f.setToValue(0);
            f.play();
        } else if (anyPaneIsOpen == 2) {
            FadeTransition f = new FadeTransition(Duration.seconds(0.5), NovelsPane);
            f.setFromValue(1);
            f.setToValue(0);
            f.play();
        } else if (anyPaneIsOpen == 3) {
            FadeTransition f = new FadeTransition(Duration.seconds(0.5), ActionPane);
            f.setFromValue(1);
            f.setToValue(0);
            f.play();
        } else if (anyPaneIsOpen == 4) {
            FadeTransition f = new FadeTransition(Duration.seconds(0.5), Pane4);
            f.setFromValue(1);
            f.setToValue(0);
            f.play();
        } else if (anyPaneIsOpen == 5) {
            FadeTransition f = new FadeTransition(Duration.seconds(0.5), Pane5);
            f.setFromValue(1);
            f.setToValue(0);
            f.play();
        } else if (anyPaneIsOpen == 6) {
            FadeTransition f = new FadeTransition(Duration.seconds(0.5), Pane6);
            f.setFromValue(1);
            f.setToValue(0);
            f.play();
        }
    }

    public void OpenAnimePane(ActionEvent e) {
        if (!(anyPaneIsOpen == 1)) {
            closePane();
            NovelsPane.setVisible(false);
            ActionPane.setVisible(false);
            AnimePane.setVisible(true);
            Pane5.setVisible(false);
            Pane6.setVisible(false);
            Pane4.setVisible(false);
            FadeTransition f = new FadeTransition(Duration.seconds(0.5), AnimePane);
            f.setFromValue(0);
            f.setToValue(1);
            f.play();

            anyPaneIsOpen = 1;
        }
    }

    public void OpenNovelsPane(ActionEvent e) {
        if (!(anyPaneIsOpen == 2)) {
            closePane();
            AnimePane.setVisible(false);
            ActionPane.setVisible(false);
            NovelsPane.setVisible(true);
            Pane5.setVisible(false);
            Pane6.setVisible(false);
            Pane4.setVisible(false);
            FadeTransition f = new FadeTransition(Duration.seconds(0.5), NovelsPane);
            f.setFromValue(0);
            f.setToValue(1);
            f.play();

            anyPaneIsOpen = 2;
        }
    }

    public void OpenActionPane(ActionEvent e) {
        if (!(anyPaneIsOpen == 3)) {
            closePane();
            AnimePane.setVisible(false);
            NovelsPane.setVisible(false);
            ActionPane.setVisible(true);
            Pane5.setVisible(false);
            Pane6.setVisible(false);
            Pane4.setVisible(false);
            FadeTransition f = new FadeTransition(Duration.seconds(0.5), ActionPane);
            f.setFromValue(0);
            f.setToValue(1);
            f.play();

            anyPaneIsOpen = 3;
        }
    }

    public void OpenPane4(ActionEvent e) {
        if (!(anyPaneIsOpen == 4)) {
            closePane();

            AnimePane.setVisible(false);
            NovelsPane.setVisible(false);
            ActionPane.setVisible(false);
            Pane5.setVisible(false);
            Pane6.setVisible(false);
            Pane4.setVisible(true);
            FadeTransition f = new FadeTransition(Duration.seconds(0.5), Pane4);
            f.setFromValue(0);
            f.setToValue(1);
            f.play();

            anyPaneIsOpen = 4;
        }
    }

    public void OpenPane55(ActionEvent e) {
        if (!(anyPaneIsOpen == 5)) {
            closePane();
            AnimePane.setVisible(false);
            NovelsPane.setVisible(false);
            ActionPane.setVisible(false);
            Pane4.setVisible(false);
            Pane6.setVisible(false);
            Pane5.setVisible(true);
            FadeTransition f = new FadeTransition(Duration.seconds(0.5), Pane5);
            f.setFromValue(0);
            f.setToValue(1);
            f.play();

            anyPaneIsOpen = 5;
        }
    }

    public void OpenPane66(ActionEvent e) {
        if (!(anyPaneIsOpen == 6)) {
            closePane();
            AnimePane.setVisible(false);
            NovelsPane.setVisible(false);
            ActionPane.setVisible(false);
            Pane5.setVisible(false);
            Pane4.setVisible(false);
            Pane6.setVisible(true);
            FadeTransition f = new FadeTransition(Duration.seconds(0.5), Pane6);
            f.setFromValue(0);
            f.setToValue(1);
            f.play();

            anyPaneIsOpen = 6;
        }
    }

    ////////////////////////////
    /////////////////////////////
    /////////////////////////////
    public void opensearch(ActionEvent e) {//هذا الزر مسؤل عن فتح البحث يستخدم فقط عند الضغط على زر البحث
        new OpenSearchThread().start();
    }

    static Boolean key = true;

    class OpenSearchThread extends Thread {

        @Override
        public void run() {
            if (key) {
                key = false;
                TranslateTransition searchTtrans = new TranslateTransition();
                TranslateTransition searchBtrans = new TranslateTransition();
                TranslateTransition searchPtrans = new TranslateTransition();
                searchTtrans.setNode(searchf);
                searchBtrans.setNode(searcht);
                searchPtrans.setNode(transpane);
                if (!inout) {
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
                    inout = true;
                    try {
                        sleep(600);
                    } catch (Exception exception) {
                    }
                    key = true;
                }
            }
        }
    }

    //////////////////////////////////////////
    //////////////////////////////////////
    public void searchTransition(ActionEvent e) {
        if (key) {
            if (inout)
                closesearch();
            else
                opensearch(e);
            if (!searchf.getText().isEmpty()) {
                System.out.println("hola");
            }
        }
    }

    ///////////////////////////////////////
    /////////////////////////////////////////
    public void profileEvent(ActionEvent e) throws IOException {//زر البروفايل
        if (inout)
            closesearch();
        //swetchToProfile(e);
        System.out.println("اههههه");
    }
    @FXML
    public void generalSearch(ActionEvent actionEvent){
       // searchf.getText()

        try {
            OracleDataSource oracleDataSource = new OracleDataSource();
            oracleDataSource.setURL("jdbc:oracle:thin:@localhost:1521:xe");
            oracleDataSource.setUser("C##Asem");
            oracleDataSource.setPassword("123456");
            Connection connection=oracleDataSource.getConnection();

            String sql="select * from book where Upper( Auther_FName) like '%"+searchf.getText()+"%' or Upper(Auther_LName) like '%"+searchf.getText()+"%' or" +
                    " UPPer(book_title) like Upper('%"+searchf.getText()+"%')";
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            ResultSet resultSet=preparedStatement.executeQuery();
            homePane.getChildren().clear();
            while(resultSet.next())
            homePane.getChildren().add(new JFlipCard(resultSet.getInt(1)));
            connection.close();

        }catch (Exception exception){
            JOptionPane.showMessageDialog(null,exception);
        }
    }

    public void slideEvent(ActionEvent e) {//زر البروفايل
        System.out.println("ااااا");
        if (inout)
            closesearch();

        if (isSideManuOpened) {
            if (inout)
                closesearch();
            TranslateTransition translateTransition2 = new TranslateTransition();
            translateTransition2.setNode(side);
            translateTransition2.setToX(-250);
            translateTransition2.setDuration(Duration.millis(200));
            translateTransition2.play();
            TranslateTransition translateTransition3 = new TranslateTransition();
            translateTransition3.setNode(side1);
            translateTransition3.setToX(-250);
            translateTransition3.setDuration(Duration.millis(500));
            translateTransition3.play();
            isSideManuOpened = false;
        } else {
            if (inout)
                closesearch();
            TranslateTransition translateTransition = new TranslateTransition();
            translateTransition.setNode(side);
            translateTransition.setToX(0);
            translateTransition.setDuration(Duration.millis(500));
            translateTransition.play();
            TranslateTransition translateTransition1 = new TranslateTransition();
            translateTransition1.setNode(side1);
            translateTransition1.setToX(0);
            translateTransition1.setDuration(Duration.millis(500));
            translateTransition1.play();
            isSideManuOpened = true;
        }


    }

    public void adminanime() {
        authorB1.setVisible(true);
        authorB.setVisible(false);
        Tooltip tooltip = new Tooltip("Admin Center");
        Tooltip.install(authorB1, tooltip);
    }

    public void adminanime1() {
        authorB1.setVisible(false);
        authorB.setVisible(true);
        Tooltip tooltip = new Tooltip("Admin Center");
        Tooltip.install(authorB, tooltip);
    }

    public void profileanime() {
        profileb1.setVisible(true);
        profileb.setVisible(false);
        Tooltip tooltip = new Tooltip("profile page");
        Tooltip.install(profileb1, tooltip);
    }

    public void profileanime1() {
        profileb.setVisible(true);
        profileb1.setVisible(false);
        Tooltip tooltip = new Tooltip("profile page");
        Tooltip.install(profileb, tooltip);
    }

    //////////////////////////////////////////////
//          acess types                     //
//////////////////////////////////////////////
    public void isAdmin() {
        //  Users.setVisible(true);

        authorB.setVisible(true);
    }

    public void isLibrarian() {
        //Users.setVisible(false);
        authorB.setVisible(true);
    }

    public void isReader() {
        authorB.setVisible(false);
    }

    //////////////////////////////////////////////
//          osama inisialize                //
//////////////////////////////////////////////
    public void ini() {
        Tooltip tooltip = new Tooltip("Search");
        Tooltip.install(searcht, tooltip);
        Tooltip tooltip1 = new Tooltip("Menu Mine");
        Tooltip.install(OpenSideManu, tooltip1);
        if (BookLoginWindowController.type.equals(TypeOfUseers.Admin)) {
            isAdmin();
        } else if (BookLoginWindowController.type.equals(TypeOfUseers.Librarian)) {
            isLibrarian();
        } else if (BookLoginWindowController.type.equals(TypeOfUseers.Reader)) {
            isReader();
        } else {
            System.out.println("shit");
        }
        // profilec.setFill(new ImagePattern(new Image(getClass().getResource("anime4.png").toExternalForm())));
    }

    public void closeHomeView(MouseEvent mouseEvent) throws Exception {

        root = FXMLLoader.load(getClass().getResource("HomePage.fxml"));
        stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
        stage.close();
        stage = new Stage();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("BookLoginWindow.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Hello!");
        stage.setResizable(false);
        stage.setScene(scene);
        scene.setFill(Color.TRANSPARENT);
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.show();
    }

    public void ExitHover() {
        exitview.setVisible(false);
    }

    public void ExitHover1() {
        exitview.setVisible(true);
    }

    public void CatagorieHover() {
        CatagorieView.setVisible(false);
    }

    public void CatagorieHover1() {
        CatagorieView.setVisible(true);
    }

    public void HomeHover() {
        HomeIcon.setVisible(false);
    }

    public void HomeHover1() {
        HomeIcon.setVisible(true);
    }

    public void openSub() {
        System.out.println("openSub");
        try {
            HomePane.setVisible(false);
            HomePane1.setVisible(true);

            slideEvent(new ActionEvent());
            //هنا يتم فتح التصنيفات

        } catch (Exception exception) {
            System.out.println("failed" + exception);
        }

    }

    public void openHomeView(ActionEvent e) {
        slideEvent(new ActionEvent());
        contantPane.getChildren().removeAll();
        HomePane.setVisible(true);
        HomePane1.setVisible(false);

    }


    Boolean isSideManuOpened = false;
    AnchorPane anchorPane;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // i cofuse here so i comment it check it plese:)
        ini();//inisilaiz
// I will hix my error(convert following line to methods)
        try{
            OracleDataSource oracleDataSource = new OracleDataSource();
            oracleDataSource.setURL("jdbc:oracle:thin:@localhost:1521:xe");
            oracleDataSource.setUser("C##Asem");
            oracleDataSource.setPassword("123456");
            Connection connection=oracleDataSource.getConnection();
            connection.setAutoCommit(false);
            // Statement statement=connection.createStatement();
            String sql = "select * from book ";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet=statement.executeQuery();

            while (resultSet.next()){
                paneOfAll.getChildren().add(new JFlipCard(resultSet.getInt(1)));
                switch (resultSet.getInt("Type")){
                    case 1:NovelFlowPane.getChildren().add(new JFlipCard(resultSet.getInt(1)));
                        break;
                    case 2:AcademicFlowPane.getChildren().add(new JFlipCard(resultSet.getInt(1)));
                        break;
                    case 3:FantasyFlowPane.getChildren().add(new JFlipCard(resultSet.getInt(1)));
                        break;
                    case 4:HumanDevolopmentFlowPane.getChildren().add(new JFlipCard(resultSet.getInt(1)));
                        break;
                    case 5:MangaFlowPane.getChildren().add(new JFlipCard(resultSet.getInt(1)));
                        break;

                }


            }
        }catch (Exception exception){
            System.out.println(exception);
        }
        nameL.setText(User.name);
        typeL.setText(User.member_status);
        nameL.setWrapText(true);
        side.setTranslateX(-250);
        side.setVisible(true);
        OpenSideManu.setOnAction(Event -> {
            if (isSideManuOpened) {
                if (inout)
                    closesearch();
                TranslateTransition translateTransition2 = new TranslateTransition();
                translateTransition2.setNode(side);
                translateTransition2.setToX(-250);
                translateTransition2.setDuration(Duration.millis(200));
                translateTransition2.play();
                TranslateTransition translateTransition3 = new TranslateTransition();
                translateTransition3.setNode(side1);
                translateTransition3.setToX(-250);
                translateTransition3.setDuration(Duration.millis(500));
                translateTransition3.play();
                isSideManuOpened = false;
            } else {
                if (inout)
                    closesearch();
                TranslateTransition translateTransition = new TranslateTransition();
                translateTransition.setNode(side);
                translateTransition.setToX(0);
                translateTransition.setDuration(Duration.millis(500));
                translateTransition.play();
                TranslateTransition translateTransition1 = new TranslateTransition();
                translateTransition1.setNode(side1);
                translateTransition1.setToX(0);
                translateTransition1.setDuration(Duration.millis(500));
                translateTransition1.play();
                isSideManuOpened = true;
            }
        });
        try {
            anchorPane = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("MyTabbedPane.fxml")));
        } catch (Exception exception) {
            System.out.println("SooryBro" + exception);
        }

    }

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
    private FlowPane PaneOfFirstType;

    @FXML
    private Button button1;

    @FXML
    private Pane pane1;

    @FXML
    private FlowPane paneOFThirdType;

    @FXML
    private FlowPane paneOfAll;
    @FXML
    private FlowPane HumanDevolopmentFlowPane;

    @FXML
    private FlowPane MangaFlowPane;

    @FXML
    private FlowPane NovelFlowPane;
    @FXML
    private FlowPane FantasyFlowPane;
    @FXML
    private FlowPane AcademicFlowPane;

    @FXML
    private FlowPane paneOfFifthType;

    @FXML
    private FlowPane paneOfFourthType;

    @FXML
    private FlowPane paneOfSecondType;

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
    void OpenPane2() {
        Button2.setStyle("-fx-background-color: #0f0000;-fx-background-radius:50 50 0 0 ;");
        button1.setStyle("-fx-background-color: transport;");
        Button3.setStyle("-fx-background-color: transport;");
        Button4.setStyle("-fx-background-color: transport;");
        Button5.setStyle("-fx-background-color: transport;");
        Button6.setStyle("-fx-background-color: transport;");
        pane1.setVisible(false);
        panel2.setVisible(true);
        panel3.setVisible(false);
        panel4.setVisible(false);
        panel5.setVisible(false);
        panel6.setVisible(false);
    }

    @FXML
    void OpenPane3() {
        Button3.setStyle("-fx-background-color: #00f000;-fx-background-radius:50 50 0 0 ;");
        Button2.setStyle("-fx-background-color: transport;");
        button1.setStyle("-fx-background-color: transport;");
        Button4.setStyle("-fx-background-color: transport;");
        Button5.setStyle("-fx-background-color: transport;");
        Button6.setStyle("-fx-background-color: transport;");
        pane1.setVisible(false);
        panel2.setVisible(false);
        panel3.setVisible(true);
        panel4.setVisible(false);
        panel5.setVisible(false);
        panel6.setVisible(false);
    }

    @FXML
    void OpenPane4() {
        Button4.setStyle("-fx-background-color: #f0ff00;-fx-background-radius:50 50 0 0 ;");
        Button2.setStyle("-fx-background-color: transport;");
        Button3.setStyle("-fx-background-color: transport;");
        button1.setStyle("-fx-background-color: transport;");
        Button5.setStyle("-fx-background-color: transport;");
        Button6.setStyle("-fx-background-color: transport;");
        pane1.setVisible(false);
        panel2.setVisible(false);
        panel3.setVisible(false);
        panel4.setVisible(true);
        panel5.setVisible(false);
        panel6.setVisible(false);
    }

    @FXML
    void OpenPane5(ActionEvent event) {
        Button5.setStyle("-fx-background-color: #0000f0;-fx-background-radius:50 50 0 0 ;");
        Button2.setStyle("-fx-background-color: transport;");
        Button3.setStyle("-fx-background-color: transport;");
        Button4.setStyle("-fx-background-color: transport;");
        button1.setStyle("-fx-background-color: transport;");
        Button6.setStyle("-fx-background-color: transport;");
        pane1.setVisible(false);
        panel2.setVisible(false);
        panel3.setVisible(false);
        panel4.setVisible(false);
        panel5.setVisible(true);
        panel6.setVisible(false);
    }

    @FXML
    void OpenPane6(ActionEvent event) {
        Button6.setStyle("-fx-background-color: #ff00ff;-fx-background-radius:50 50 0 0 ;");
        Button2.setStyle("-fx-background-color: transport;");
        Button3.setStyle("-fx-background-color: transport;");
        Button4.setStyle("-fx-background-color: transport;");
        Button5.setStyle("-fx-background-color: transport;");
        button1.setStyle("-fx-background-color: transport;");
        pane1.setVisible(false);
        panel2.setVisible(false);
        panel3.setVisible(false);
        panel4.setVisible(false);
        panel5.setVisible(false);
        panel6.setVisible(true);
    }

    @FXML
    void openPanel1(ActionEvent event) {
        //button1.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));

        button1.setStyle("-fx-background-color: #f00000;-fx-background-radius:50 50 0 0 ;");
        Button2.setStyle("-fx-background-color: transport;");
        Button3.setStyle("-fx-background-color: transport;");
        Button4.setStyle("-fx-background-color: transport;");
        Button5.setStyle("-fx-background-color: transport;");
        Button6.setStyle("-fx-background-color: transport;");
        pane1.setVisible(true);
        panel2.setVisible(false);
        panel3.setVisible(false);
        panel4.setVisible(false);
        panel5.setVisible(false);
        panel6.setVisible(false);
    }
}

