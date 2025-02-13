module com.example.csc311lab03 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.csc311lab03 to javafx.fxml;
    exports com.example.csc311lab03;
}