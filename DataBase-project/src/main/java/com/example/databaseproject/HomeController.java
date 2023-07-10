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
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
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
    private Boolean inout=false;//هاي مشان اعرف اذا انو السيرش مفتوح ولا مسكر
    //photo
    @FXML
public Button adminB;
    @FXML
public Button libreanB;
    @FXML
    AnchorPane contantPane;
    @FXML
    public Button authorB;
    @FXML
    public Circle uuuu;//هاي للبورفايل
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
        stage.setResizable(false);
        stage.setX(350);
        stage.setY(50);
        stage.setScene(scene);
        stage.show();
    }
    public void swetchAdminPage(ActionEvent e) throws IOException {
        root= FXMLLoader.load(getClass().getResource("AdminPage.fxml"));
        stage=(Stage)((Node)e.getSource()).getScene().getWindow();
        stage.setResizable(false);
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void swetchLibrarianPage(ActionEvent e) throws IOException {
        root= FXMLLoader.load(getClass().getResource("LibrianPage.fxml"));
        stage=(Stage)((Node)e.getSource()).getScene().getWindow();
        stage.setResizable(false);
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void swetchAuthorPage(ActionEvent e) throws IOException {
        root= FXMLLoader.load(getClass().getResource("Author.fxml"));
        stage=(Stage)((Node)e.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    /////////////////////////////////////////////
    //               methods                   //
    /////////////////////////////////////////////
    public void closesearch(){//هذا الفنكشن مسؤل عن اغلاق البحث يجب استخدامه عند الضغط علي اي زر اخر
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
        new OpenSearchThread().start();
    }
    static Boolean key=true;
    class  OpenSearchThread extends Thread{

        @Override
        public void run() {
            if(key){
                key=false;
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
                    try {
                        sleep(600);
                    }
                    catch (Exception exception){}
                    key=true;
                }
            }
        }
    }
//////////////////////////////////////////
    //////////////////////////////////////
    public void searchTransition(ActionEvent e){
        if (key){
        if(inout)
            closesearch();
        else
            opensearch(e);
        if(!searchf.getText().isEmpty()){
            System.out.println("hola");
        }}
  }
    ///////////////////////////////////////
    /////////////////////////////////////////
    public void profileEvent(ActionEvent e) throws IOException {//زر البروفايل
        if(inout)
            closesearch();
        swetchToProfile(e);
        System.out.println("اههههه");
    }
    public void slideEvent(ActionEvent e){//زر البروفايل
        System.out.println("ااااا");
        if(inout)
            closesearch();
        boolean inoutSlide = false;
        if(isSideManuOpened){
            if(inout)
                closesearch();
            TranslateTransition translateTransition2=new TranslateTransition();
            translateTransition2.setNode(side);
            translateTransition2.setToX(-250);
            translateTransition2.setDuration(Duration.millis(200));
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
                closesearch();
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


    }
//////////////////////////////////////////////
//          acess types                     //
//////////////////////////////////////////////
    public void isAdmin(){
        //uuuu.setVisible(false);
        libreanB.setVisible(true);
        authorB.setVisible(true);

    }
    public void isAuthor(){
        //uuuu.setVisible(false);
        libreanB.setVisible(false);
        authorB.setVisible(false);

    }
    public void isLibrarian(){
        //uuuu.setVisible(false);
        libreanB.setVisible(true);
        authorB.setVisible(false);

    }
    public void isReader(){

        libreanB.setVisible(false);
        authorB.setVisible(false);

    }
//////////////////////////////////////////////
//          osama inisialize                //
//////////////////////////////////////////////
public void ini(){
if(LogInPageController.type.equals(TypeOfUseers.Admin)){
    isAdmin();
}
   else if(LogInPageController.type.equals(TypeOfUseers.Librarian)){
        isLibrarian();
    }
 else if(LogInPageController.type.equals(TypeOfUseers.Reader)){
        isReader();
    }
 else{
    System.out.println("shit");
 }
   // uuuu.setVisible(false);

   // profilec.setFill(new ImagePattern(new Image(getClass().getResource("anime4.png").toExternalForm())));
}

public void closeHomeView(MouseEvent mouseEvent){
        System.exit(0);
}
    public void openSub(){
        System.out.println("openSub");
        try {
            slideEvent(new ActionEvent());
            //هنا يتم فتح التصنيفات
            root =FXMLLoader.load(getClass().getResource("MyTabbedPane.fxml"));
            contantPane.getChildren().add(root);
        }
        catch (Exception exception){
            System.out.println("failed"+exception);
        }

    }


    Boolean isSideManuOpened=false;
    AnchorPane anchorPane;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // i cofuse here so i comment it check it plese:)
        //ini();//inisilaiz
// i will hix my error(convert following line to methods)

        side.setTranslateX(-250);
        side.setVisible(true);
        OpenSideManu.setOnAction(Event->{
            if(isSideManuOpened){
                if(inout)
                    closesearch();
                TranslateTransition translateTransition2=new TranslateTransition();
                translateTransition2.setNode(side);
                translateTransition2.setToX(-250);
                translateTransition2.setDuration(Duration.millis(200));
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
                    closesearch();
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
        try {
            anchorPane=FXMLLoader.load(getClass().getResource("MyTabbedPane.fxml"));
        }
        catch (Exception exception){
            System.out.println("SooryBro"+exception);
        }

//        button1.setStyle("-fx-background-color: #f00000;-fx-background-radius:50 50 0 0 ;");
//        Button2.setStyle("-fx-background-color: transport;");
//        Button3.setStyle("-fx-background-color: transport;");
//        Button4.setStyle("-fx-background-color: transport;");
//        Button5.setStyle("-fx-background-color: transport;");
//        Button6.setStyle("-fx-background-color: transport;");
//        pane1.setVisible(true);
//        panel2.setVisible(false);
//        panel3.setVisible(false);
//        panel4.setVisible(false);
//        panel5.setVisible(false);
//        panel6.setVisible(false);
//        fillPanels();
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
    void OpenPane2(ActionEvent event) {
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
    void OpenPane3(ActionEvent event) {
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
    void OpenPane4(ActionEvent event) {
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

}
