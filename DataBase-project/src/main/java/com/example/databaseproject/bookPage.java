package com.example.databaseproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ResourceBundle;

import oracle.jdbc.pool.OracleDataSource;


public class bookPage implements Initializable {
    static int id ;
    Stage stage;
    @FXML
    private Label AutherName;

    @FXML
    private Label Description;

    @FXML
    private Label PageCount;

    @FXML
    private ImageView backToMainWindow;

    @FXML
    private Label bookTitle;

    @FXML
    private Button btn;

    @FXML
    private Label dateOfPublish;

    @FXML
    private ImageView imageView;

    @FXML
    private Label language;



    Boolean out=false;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {

            /*"D:\New folder (2)\Asem\demo\src\main\resources\theShadowOFTheWild.jfif"*/
            OracleDataSource oracleDataSource = new OracleDataSource();
            oracleDataSource.setURL("jdbc:oracle:thin:@localhost:1521:xe");
            oracleDataSource.setUser("C##Asem");
            oracleDataSource.setPassword("123456");
            Connection connection=oracleDataSource.getConnection();
            connection.setAutoCommit(false);
            // Statement statement=connection.createStatement();
            String sql = "select * from book where book_id="+bookPage.id;
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet=statement.executeQuery();
            InputStream inputStream=new InputStream() {
                @Override
                public int read() throws IOException {
                    return 0;
                }
            };//=new FileInputStream(new File(""));
            int v=0;
            //ArrayList<InputStream> inputStreamArrayList=new ArrayList<>();
            resultSet.next();

            SimpleDateFormat sdf = new SimpleDateFormat(resultSet.getDate(14).toString());
            sdf.applyPattern("dd / MM / yyyy");
            imageView.setImage(new Image((InputStream)resultSet.getBinaryStream(13)));
            language.setText(resultSet.getString("language").trim());
            bookTitle.setText(resultSet.getString("book_title").trim());
            dateOfPublish.setText(sdf.format(resultSet.getDate(14)));
            Description.setText(resultSet.getString(6));
            PageCount.setText(resultSet.getString(5));
            AutherName.setText(resultSet.getString(3).replace(" ","")+" "+resultSet.getString(4).replace(" ",""));
        }catch (Exception exception){
            System.out.println(exception);
        }

        //imageView.setImage(new Image("D:\\New folder (2)\\Asem\\demo\\src\\main\\resources\\12060927.jpg"));
        // language.setText("عربي");
        //bookTitle.setText("اخر الابواب الموصدة");
        //dateOfPublish.setText("1/4/2011");
        /*Description.setText("\n" +
                "تقع أحداث الرواية في مائتين وثلاث وعشرين صفحة من الحجم المتوسط، يتناوبها أربعة أبواب.\n" +
                "حينما تقرأ رواية (آخر الأبواب الموصدة)، تخضع لسطوة المكان، فهناك القدس، وأحداث ممتدة من زمن الانجليز، النكبة، والنكسة.\n" +
                "\n" +
                "تقوم أحداث الرواية على عائلة مقدسية تسعى إلى الحفاظ على بيت داخل أسوار القدس خوفاً من استيلاء المحتل (اليهود) عليه، حيث اتفقت العائلة على تزويج ابن الخالة الذي يسكن مدينة القدس إلى ابنة الخالة التي تسكن مدينة عمان، دون موافقة الابنة.\n" +
                "\n" +
                "ومن هنا تبدا أحداث الرواية ..\n" +
                "\n" +
                "تجري أحداث الرواية في السبعينات، وتحكي قصة إيمان، الفتاة التي تزوجها أمها من ابن خالتها رغماً عنها وترسلها في رحلة محفوفة بالمخاطر مع غرباء من عمان إلى القدس. تدرك إيمان من البداية أنها بيعت للحفاظ على إرث العائلة والبيت المقدسي الذي تقطنه خالتها، وتدرك أن هذه الرحلة كانت كفيلة بتغيير مصيرها ومجرى حياتها للأبد بعد قصة حب تعيشها ومجموعة من الأحداث التي تجعل تتعقد وتتشابك لتصنع منها شخصية استثنائية رغم الصعوبات. رواية مثيرة وعميقة تعيد رسم القدس في أذهان القراء بأبهى صورها، وترسم لإيمان، الفتاة الصغيرة، مصيراً مؤلماً ولكن منتصراً.\n" +
                "\n" +
                "This novel takes place in the seventies, and tells the story of Iman, who is married to her cousin against her will, and whose mother sends her on a dangerous journey with strangers from Amman to Jerusalem. Iman realizes from the beginning that she was sold to preserve the legacy of the family and their home in Jerusalem. She also realize that this journey is enough to change the destiny and the course of her life forever, after she experiences love and a sequence of complicated events that make her strong, despite the difficulties. This is an exciting and deep novel that reshapes Jerusalem in the mind of the reader in its most beautiful forms and unfolds Iman’s painful but triumphant destiny.\n" +
                "\n" +
                "Show more");
        */Description.setWrapText(true);
        //PageCount.setText("223");

    }
    @FXML
    void Borrow(ActionEvent actionEvent){

        try {

            /*"D:\New folder (2)\Asem\demo\src\main\resources\theShadowOFTheWild.jfif"*/

            OracleDataSource oracleDataSource = new OracleDataSource();
            oracleDataSource.setURL("jdbc:oracle:thin:@localhost:1521:xe");
            oracleDataSource.setUser("C##Asem");
            oracleDataSource.setPassword("123456");
            Connection connection=oracleDataSource.getConnection();
            connection.setAutoCommit(false);
            // Statement statement=connection.createStatement();
            String sql = "select  number_of_borrowed_copies ,total_copies from  Book  where book_id="+id;
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet=statement.executeQuery();
            resultSet.next();
            if(resultSet.getInt(1)<resultSet.getInt(2)){
            sql = "update Book set number_of_borrowed_copies=number_of_borrowed_copies+1 where book_id="+id;
             statement = connection.prepareStatement(sql);
            statement.executeUpdate();
            LocalDate date=LocalDate.now();
            System.out.println(date.getDayOfMonth()+"|"+date.getMonthValue()+"|"+date.getYear());
            LocalDate date1=date.plus(2, ChronoUnit.WEEKS);
             sql = "insert into Borrowing values ((select max(Borrowing_id)from Borrowing)+1,"+User.id+","+id+",to_date('"+date.getDayOfMonth()+"-"+date.getMonthValue()+"-"+date.getYear()+"','dd-mm-yyyy'),to_date('"+date1.getDayOfMonth()+"-"+date1.getMonthValue()+"-"+date1.getYear()+"','dd-mm-yyyy'),'No')";
             statement = connection.prepareStatement(sql);
            statement.executeUpdate();
            connection.commit();
            connection.close();
            System.out.println("insert successfully");}

        }catch (Exception exception){
            System.out.println(exception);
        }

        System.out.println("Borrowed");
        ((Stage) language.getScene().getWindow()).close();
    }
    @FXML
    public void closed(MouseEvent mouseEvent){
        ((Stage)((Scene) (((ImageView)(mouseEvent.getSource())).getScene())).getWindow()).close();
    }
    /*
    class rec_to_circle extends Thread{

        public void run(){
            int bw=112;
            int lw=43;
            // double average=112-43;
            while (bw>lw){
                bw--;
                btn.setPrefWidth(bw);
                try {
                    sleep(50);
                }
                catch (Exception e){}
            }
        }}

        class t extends Thread{
        @Override
        public void run() {
            try {
                sleep(4200);

            }
            catch (Exception exception){}
            System.out.println("done");
            imageView.setVisible(false);
        }



    }*/
    public void exit(MouseEvent mouseEvent){
        System.exit(0);
    }


}