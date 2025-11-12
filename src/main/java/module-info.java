module com.example.addieren {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.addieren to javafx.fxml;
    exports com.example.addieren;
}