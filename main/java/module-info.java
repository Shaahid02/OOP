module com.example.fxcoursework {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fxcoursework to javafx.fxml;
    exports com.example.fxcoursework;
}