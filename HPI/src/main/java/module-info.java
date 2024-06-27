module com.example.hpi {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.hpi to javafx.fxml;
    exports com.example.hpi;
}