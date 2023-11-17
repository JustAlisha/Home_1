module com.example.home_1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.home_1 to javafx.fxml;
    exports com.example.home_1;
}