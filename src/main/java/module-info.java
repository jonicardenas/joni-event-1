module com.example.jonievent1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.jonievent1 to javafx.fxml;
    exports com.example.jonievent1;
}