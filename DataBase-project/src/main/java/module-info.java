module com.example.databaseproject {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
   // requires ojdbc10;
    requires java.desktop;
     //requires persistance.api;
    opens com.example.databaseproject to javafx.fxml;
    exports com.example.databaseproject;

}