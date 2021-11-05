module com.example.demofxgithub {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demofxgithub to javafx.fxml;
    exports com.example.demofxgithub;
}