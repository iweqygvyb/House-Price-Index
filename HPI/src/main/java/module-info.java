module com.example.hpi {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.opencsv;


    opens com.example.hpi to javafx.fxml;
    exports com.example.hpi;
}